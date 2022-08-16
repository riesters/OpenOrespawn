package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.nbt.*;
import net.minecraft.tileentity.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import java.util.*;

public class Mothra extends EntityButterfly implements IMob
{
    private ChunkCoordinates currentFlightTarget;
    private int lastX;
    private int lastZ;
    private int lastY;
    private int stuck_count;
    private int wing_sound;
    private int health_ticker;
    private GenericTargetSorter TargetSorter;
    private final float moveSpeed;
    
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
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 100;
        this.isImmuneToFire = true;
        this.fireResistance = 500;
        this.TargetSorter = new GenericTargetSorter(this);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Mothra_stats.attack);
    }
    
    @Override
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Mothra_stats.defense;
    }
    
    public int getMothraHealth() {
        return (int)this.getHealth();
    }
    
    @Override
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    @Override
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Override
    protected String getLivingSound() {
        return null;
    }
    
    @Override
    protected String getHurtSound() {
        return null;
    }
    
    @Override
    protected String getDeathSound() {
        return "random.explode";
    }
    
    @Override
    public boolean canBePushed() {
        return true;
    }
    
    @Override
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    @Override
    protected void collideWithNearbyEntities() {
    }
    
    @Override
    public int mygetMaxHealth() {
        return OreSpawnMain.Mothra_stats.health;
    }
    
    @Override
    protected boolean isAIEnabled() {
        return true;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6;
        ++this.wing_sound;
        if (this.wing_sound > 30) {
            if (!this.worldObj.isRemote) {
                this.worldObj.playSoundAtEntity(this, "orespawn:MothraWings", 1.0f, 1.0f);
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
        return this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null;
    }
    
    @Override
    protected void updateAITasks() {
        int xdir;
        int zdir;
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
        if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
            shoot = 2;
        }
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.stuck_count > 50 || this.worldObj.rand.nextInt(300) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 9.0f) {
            int down = 0;
            int dist = 20;
            for (int i = -5; i <= 5; i += 5) {
                for (int j = -5; j <= 5; j += 5) {
                    int k = 1;
                    while (k < 20) {
                        final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY - k, (int)this.posZ + i);
                        if (bid != Blocks.air) {
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
            for (Block bid = Blocks.stone; bid != Blocks.air && keep_trying != 0; --keep_trying) {
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
                this.currentFlightTarget.set((int)this.posX + newx, (int)this.posY + this.rand.nextInt(7) - 1 - down, (int)this.posZ + newz);
                bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
                if (bid == Blocks.air && !this.canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ)) {
                    bid = Blocks.stone;
                }
            }
            this.stuck_count = 0;
        }
        else if (this.worldObj.rand.nextInt(10) == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && OreSpawnMain.MothraPeaceful == 0) {
            EntityPlayer target;
            target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(25.0, 20.0, 25.0), this);
            if (target != null) {
                if (!target.capabilities.isCreativeMode) {
                    if (this.getEntitySenses().canSee(target)) {
                        this.currentFlightTarget.set((int)target.posX, (int)target.posY + 4, (int)target.posZ);
                        if (this.rand.nextInt(shoot) == 0) {
                            this.attackWithSomething(target);
                        }
                    }
                }
                else {
                    target = null;
                }
            }
            if (target == null && this.worldObj.rand.nextInt(3) == 0) {
                EntityLivingBase e;
                e = this.findSomethingToAttack();
                if (e != null) {
                    this.currentFlightTarget.set((int)e.posX, (int)e.posY + 5, (int)e.posZ);
                    if (this.worldObj.rand.nextInt(shoot) == 0) {
                        this.attackWithSomething(e);
                    }
                }
            }
        }
        final double var1 = this.currentFlightTarget.posX + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.posY + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.posZ + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.30001;
        this.motionY += (Math.signum(var2) * 0.7 - this.motionY) * 0.20001;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.30001;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapAngleTo180_float(var4 - this.rotationYaw);
        this.moveForward = 1.0f;
        this.rotationYaw += var5 / 4.0f;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return false;
    }
    
    @Override
    protected void fall(final float par1) {
    }
    
    @Override
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    @Override
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret;
        final Entity e = par1DamageSource.getEntity();
        if (e instanceof Mothra) {
            return false;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        if (e != null && this.currentFlightTarget != null) {
            this.currentFlightTarget.set((int)e.posX, (int)e.posY + 2, (int)e.posZ);
        }
        return ret;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
    }
    
    @Override
    public boolean getCanSpawnHere() {
        for (int k = -2; k <= 2; ++k) {
            for (int j = -2; j <= 2; ++j) {
                for (int i = 1; i < 4; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid == Blocks.mob_spawner) {
                        TileEntityMobSpawner tileentitymobspawner;
                        tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                        final String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
                        if (s != null && s.equals("Mothra")) {
                            return true;
                        }
                    }
                }
            }
        }
        if (this.posY < 70.0) {
            return false;
        }
        if (this.worldObj.isDaytime()) {
            return false;
        }
        for (int k = -4; k < 4; ++k) {
            for (int j = -3; j < 3; ++j) {
                for (int i = 1; i < 10; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid != Blocks.air) {
                        return false;
                    }
                }
            }
        }
        Mothra target;
        target = (Mothra)this.worldObj.findNearestEntityWithinAABB(Mothra.class, this.boundingBox.expand(64.0, 32.0, 64.0), this);
        return target == null;
    }
    
    @Override
    public void initCreature() {
    }
    
    private void dropItemRand(final Item index) {
        final EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), new ItemStack(index, 1, 0));
        this.worldObj.spawnEntityInWorld(var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        this.dropItemRand(Items.item_frame);
        for (int i = 0; i < 20; ++i) {
            final float var1 = (this.rand.nextFloat() - 0.5f) * 8.0f;
            final float var2 = (this.rand.nextFloat() - 0.5f) * 4.0f;
            final float var3 = (this.rand.nextFloat() - 0.5f) * 8.0f;
            this.worldObj.spawnParticle("largeexplode", this.posX + var1, this.posY + 2.0 + var2, this.posZ + var3, 0.0, 0.0, 0.0);
        }
        for (int var4 = 0; var4 < 53; ++var4) {
            this.dropItemRand(Items.gold_nugget);
        }
        for (int var4 = 0; var4 < 25; ++var4) {
            this.dropItemRand(OreSpawnMain.MyMothScale);
        }
        for (int var4 = 0; var4 < 3; ++var4) {
            this.dropItemRand(Items.blaze_rod);
        }
        this.dropItemRand(Items.nether_star);
        for (int var4 = 0; var4 < 20; ++var4) {
            spawnCreature(this.worldObj, "Moth", this.posX + 0.5, this.posY + 1.0, this.posZ + 0.5);
        }
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8;
        if (par0World == null) {
            return null;
        }
        var8 = EntityList.createEntityByName(par1, par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    private void attackWithSomething(final EntityLivingBase par1) {
        final double xzoff = 2.25;
        final double yoff = 0.0;
        if (OreSpawnMain.MothraPeaceful != 0) {
            return;
        }
        if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL) {
            return;
        }
        final double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
        final double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
        if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
            final EntitySmallFireball sf = new EntitySmallFireball(this.worldObj, this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
            sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
            sf.setPosition(cx, this.posY + yoff, cz);
            this.worldObj.playSoundAtEntity(this, "random.bow", 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
            this.worldObj.spawnEntityInWorld(sf);
        }
        else if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
            if (this.worldObj.rand.nextInt(2) == 0) {
                final EntitySmallFireball sf = new EntitySmallFireball(this.worldObj, this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
                sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
                sf.setPosition(cx, this.posY + yoff, cz);
                this.worldObj.playSoundAtEntity(this, "random.bow", 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                this.worldObj.spawnEntityInWorld(sf);
            }
            else {
                final BetterFireball bf = new BetterFireball(this.worldObj, this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
                bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
                bf.setPosition(cx, this.posY + yoff, cz);
                bf.setNotMe();
                this.worldObj.playSoundAtEntity(this, "random.fuse", 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                this.worldObj.spawnEntityInWorld(bf);
            }
        }
        else {
            final BetterFireball bf = new BetterFireball(this.worldObj, this, par1.posX - cx, par1.posY + 0.55 - (this.posY + yoff), par1.posZ - cz);
            bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0f);
            bf.setPosition(cx, this.posY + yoff, cz);
            bf.setNotMe();
            this.worldObj.playSoundAtEntity(this, "random.fuse", 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
            this.worldObj.spawnEntityInWorld(bf);
        }
        if (this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving) {
        if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL) {
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
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof Mothra) {
            return false;
        }
        if (par1EntityLiving instanceof Brutalfly) {
            return false;
        }
        if (par1EntityLiving instanceof Vortex) {
            return false;
        }
        if (par1EntityLiving instanceof VelocityRaptor) {
            return false;
        }
        if (par1EntityLiving instanceof Cryolophosaurus) {
            return false;
        }
        if (par1EntityLiving instanceof TerribleTerror) {
            return false;
        }
        if (par1EntityLiving instanceof LurkingTerror) {
            return false;
        }
        if (par1EntityLiving instanceof CloudShark) {
            return false;
        }
        if (par1EntityLiving instanceof Rotator) {
            return false;
        }
        if (par1EntityLiving instanceof Bee) {
            return false;
        }
        if (par1EntityLiving instanceof Mantis) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(15.0, 20.0, 15.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8)) {
                return var8;
            }
        }
        return null;
    }
}
