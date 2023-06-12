package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import javax.annotation.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.nbt.*;
import danger.orespawn.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import java.util.*;

public class Mothra extends Butterfly implements IMob
{
    private BlockPos currentFlightTarget;
    private int lastX;
    private int lastZ;
    private int lastY;
    private int stuck_count;
    private int wing_sound;
    private int health_ticker;
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    
    public Mothra(final World par1World) {
        super(par1World);
        this.currentFlightTarget = null;
        this.lastX = 0;
        this.lastZ = 0;
        this.lastY = 0;
        this.stuck_count = 0;
        this.wing_sound = 0;
        this.health_ticker = 100;
        this.TargetSorter = null;
        this.moveSpeed = 0.35f;
        this.setSize(5.0f, 2.0f);
        this.experienceValue = 100;
        this.isImmuneToFire = true;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
    }
    
    @Override
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public int getTotalArmorValue() {
        return 8;
    }
    
    public int getMothraHealth() {
        return (int)this.getHealth();
    }
    
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return null;
    }
    
    public void onDeath(final DamageSource cause) {
        this.playSound(SoundEvents.ENTITY_GENERIC_EXPLODE, this.getSoundVolume(), this.getSoundPitch());
    }
    
    public boolean canBePushed() {
        return true;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    public int mygetMaxHealth() {
        return 150;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6;
        ++this.wing_sound;
        if (this.wing_sound > 30) {
            if (!this.world.isRemote) {
                this.playSound(SoundsHandler.ENTITY_MOTHRA_WINGS, 1.0f, 1.0f);
            }
            this.wing_sound = 0;
        }
        --this.health_ticker;
        if (this.health_ticker <= 0) {
            if (this.getHealth() < this.mygetMaxHealth()) {
                this.heal(1.0f);
            }
            this.health_ticker = 200;
        }
    }
    
    public boolean canSeeTarget(final double pX, final double pY, final double pZ) {
        return this.world.rayTraceBlocks(new Vec3d(this.posX, this.posY + 0.75, this.posZ), new Vec3d(pX, pY, pZ), false) == null;
    }
    
    @Override
    public void updateAITasks() {
        int xdir = 1;
        int zdir = 1;
        int keep_trying = 50;
        int shoot = 3;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.lastX == (int)this.posX && this.lastY == (int)this.posY && this.lastZ == (int)this.posZ) {
            ++this.stuck_count;
        }
        else {
            this.stuck_count = 0;
            this.lastX = (int)this.posX;
            this.lastY = (int)this.posY;
            this.lastZ = (int)this.posZ;
        }
        if (this.world.getDifficulty() == EnumDifficulty.HARD) {
            shoot = 2;
        }
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.stuck_count > 50 || this.world.rand.nextInt(300) == 0 || this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 9.0) {
            int down = 0;
            int dist = 20;
            for (int i = -5; i <= 5; i += 5) {
                for (int j = -5; j <= 5; j += 5) {
                    int k = 1;
                    while (k < 20) {
                        final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY - k, (int)this.posZ + i)).getBlock();
                        if (bid != Blocks.AIR) {
                            if (k < dist) {
                                dist = k;
                                break;
                            }
                            break;
                        }
                        else {
                            ++k;
                        }
                    }
                }
            }
            if (dist > 10) {
                down = dist - 10 + 1;
            }
            for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; --keep_trying) {
                xdir = 1;
                zdir = 1;
                if (this.rand.nextInt(2) == 0) {
                    xdir = -1;
                }
                if (this.rand.nextInt(2) == 0) {
                    zdir = -1;
                }
                int newz = this.rand.nextInt(20) + 8;
                newz *= zdir;
                int newx = this.rand.nextInt(20) + 8;
                newx *= xdir;
                this.currentFlightTarget = new BlockPos((int)this.posX + newx, (int)this.posY + this.rand.nextInt(7) - 1 - down, (int)this.posZ + newz);
                bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock();
                if (bid == Blocks.AIR && !this.canSeeTarget(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())) {
                    bid = Blocks.STONE;
                }
            }
            this.stuck_count = 0;
        }
        else if (this.world.rand.nextInt(10) == 0 && this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
            EntityPlayer target = null;
            target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(25.0, 20.0, 25.0), (Entity)this);
            if (target != null) {
                if (!target.capabilities.isCreativeMode) {
                    if (this.getEntitySenses().canSee((Entity)target)) {
                        this.currentFlightTarget = new BlockPos((int)target.posX, (int)target.posY + 4, (int)target.posZ);
                        if (this.rand.nextInt(shoot) == 0) {
                            this.attackWithSomething((EntityLivingBase)target);
                        }
                    }
                }
                else {
                    target = null;
                }
            }
            if (target == null && this.world.rand.nextInt(3) == 0) {
                EntityLivingBase e = null;
                e = this.findSomethingToAttack();
                if (e != null) {
                    this.currentFlightTarget = new BlockPos((int)e.posX, (int)e.posY + 5, (int)e.posZ);
                    if (this.world.rand.nextInt(shoot) == 0) {
                        this.attackWithSomething(e);
                    }
                }
            }
        }
        final double var1 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.getY() + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.30001;
        this.motionY += (Math.signum(var2) * 0.7 - this.motionY) * 0.20001;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.30001;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapDegrees(var4 - this.rotationYaw);
        this.moveForward = 1.0f;
        this.rotationYaw += var5 / 4.0f;
    }
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    protected void fall(final float par1) {
    }
    
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        final Entity e = par1DamageSource.getTrueSource();
        if (e != null && e instanceof Mothra) {
            return false;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        if (e != null && this.currentFlightTarget != null) {
            this.currentFlightTarget = new BlockPos((int)e.posX, (int)e.posY + 2, (int)e.posZ);
        }
        return ret;
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
    }
    
    public boolean getCanSpawnHere() {
        if (this.posY < 70.0) {
            return false;
        }
        if (this.world.isDaytime()) {
            return false;
        }
        for (int k = -4; k < 4; ++k) {
            for (int j = -3; j < 3; ++j) {
                for (int i = 1; i < 10; ++i) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k)).getBlock();
                    if (bid != Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        Mothra target = null;
        target = (Mothra)this.world.findNearestEntityWithinAABB((Class)Mothra.class, this.getEntityBoundingBox().expand(64.0, 32.0, 64.0), (Entity)this);
        return target == null;
    }
    
    public void initCreature() {
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        this.dropItemRand(Items.ITEM_FRAME, 1);
        for (int i = 0; i < 20; ++i) {
            final float var1 = (this.rand.nextFloat() - 0.5f) * 8.0f;
            final float var2 = (this.rand.nextFloat() - 0.5f) * 4.0f;
            final float var3 = (this.rand.nextFloat() - 0.5f) * 8.0f;
            this.world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, this.posX + var1, this.posY + 2.0 + var2, this.posZ + var3, 0.0, 0.0, 0.0, new int[0]);
        }
        for (int var4 = 0; var4 < 53; ++var4) {
            this.dropItemRand(Items.GOLD_NUGGET, 1);
        }
        for (int var4 = 0; var4 < 3; ++var4) {
            this.dropItemRand(Items.BLAZE_ROD, 1);
        }
        this.dropItemRand(Items.NETHER_STAR, 1);
        for (int var4 = 0; var4 < 20; ++var4) {
            spawnCreature(this.world, "Moth", this.posX + 0.5, this.posY + 1.0, this.posZ + 0.5);
        }
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        if (par0World == null) {
            return null;
        }
        var8 = EntityList.createEntityByIDFromName(new ResourceLocation(par1), par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    private void attackWithSomething(final EntityLivingBase par1) {
        final double xzoff = 2.25;
        final double yoff = 0.0;
        if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return;
        }
        final double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
        final double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
        if (this.world.getDifficulty() == EnumDifficulty.EASY) {
            final EntitySmallFireball sf = new EntitySmallFireball(this.world, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
            sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
            sf.setPosition(cx, this.posY + yoff, cz);
            this.playSound(SoundEvents.ENTITY_ARROW_SHOOT, 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
            this.world.spawnEntity((Entity)sf);
        }
        else if (this.world.getDifficulty() == EnumDifficulty.NORMAL) {
            if (this.world.rand.nextInt(2) == 0) {
                final EntitySmallFireball sf = new EntitySmallFireball(this.world, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
                sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
                sf.setPosition(cx, this.posY + yoff, cz);
                this.playSound(SoundEvents.ENTITY_ARROW_SHOOT, 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                this.world.spawnEntity((Entity)sf);
            }
            else {
                final BetterFireball bf = new BetterFireball(this.world, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
                bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
                bf.setPosition(cx, this.posY + yoff, cz);
                bf.setNotMe();
                this.playSound(SoundEvents.ITEM_FIRECHARGE_USE, 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                this.world.spawnEntity((Entity)bf);
            }
        }
        else {
            final BetterFireball bf = new BetterFireball(this.world, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
            bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
            bf.setPosition(cx, this.posY + yoff, cz);
            bf.setNotMe();
            this.playSound(SoundEvents.ITEM_FIRECHARGE_USE, 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
            this.world.spawnEntity((Entity)bf);
        }
        if (this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return false;
        }
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof Mothra) {
            return false;
        }
        if (par1EntityLiving instanceof Brutalfly) {
            return false;
        }
        if (par1EntityLiving instanceof VelocityRaptor) {
            return false;
        }
        if (par1EntityLiving instanceof Cryolophosaurus) {
            return false;
        }
        if (par1EntityLiving instanceof Mantis) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            if (p.capabilities.isCreativeMode) {
                return false;
            }
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(15.0, 20.0, 15.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
}
