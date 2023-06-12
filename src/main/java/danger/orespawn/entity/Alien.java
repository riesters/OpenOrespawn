package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;
import danger.orespawn.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.potion.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.network.datasync.*;

public class Alien extends EntityMob
{
    protected static final DataParameter<Byte> ATTACKING;
    private GenericTargetSorter TargetSorter;
    private RenderInfo renderdata;
    private int hurt_timer;
    private double moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Alien(final World par1World) {
        super(par1World);
        this.hurt_timer = 0;
        this.moveSpeed = 0.65;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(1.1f, 3.25f);
        this.experienceValue = 100;
        this.isImmuneToFire = false;
        this.jumpMovementFactor = 0.6f;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register((DataParameter)Alien.ATTACKING, (byte)0);
        if (this.renderdata == null) {
            this.renderdata = new RenderInfo();
        }
        this.renderdata.rf1 = 0.0f;
        this.renderdata.rf2 = 0.0f;
        this.renderdata.rf3 = 0.0f;
        this.renderdata.rf4 = 0.0f;
        this.renderdata.ri1 = 0;
        this.renderdata.ri2 = 0;
        this.renderdata.ri3 = 0;
        this.renderdata.ri4 = 0;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public int mygetMaxHealth() {
        return 100;
    }
    
    protected void jump() {
        super.jump();
        this.motionY += 0.25;
    }
    
    public RenderInfo getRenderInfo() {
        return this.renderdata;
    }
    
    public void setRenderInfo(final RenderInfo r) {
        this.renderdata.rf1 = r.rf1;
        this.renderdata.rf2 = r.rf2;
        this.renderdata.rf3 = r.rf3;
        this.renderdata.rf4 = r.rf4;
        this.renderdata.ri1 = r.ri1;
        this.renderdata.ri2 = r.ri2;
        this.renderdata.ri3 = r.ri3;
        this.renderdata.ri4 = r.ri4;
    }
    
    public int getTotalArmorValue() {
        return 8;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.world.isRemote) {
            final float f = 1.7f + Math.abs(this.world.rand.nextFloat() * 0.75f);
            if (this.world.rand.nextInt(20) == 1) {
                this.world.spawnParticle(EnumParticleTypes.DRIP_LAVA, this.posX - f * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + 1.6, this.posZ + f * Math.cos(Math.toRadians(this.rotationYawHead)), 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    public int getAlienHealth() {
        return (int)this.getHealth();
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        if (this.world.rand.nextInt(4) == 0) {
            return SoundsHandler.ENTITY_ALIEN_LIVING;
        }
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_ALIEN_HURT;
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.SPIDER_EYE;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var5 = 5 + this.world.rand.nextInt(6), var6 = 0; var6 < var5; ++var6) {
            this.dropItemRand(Items.SPIDER_EYE, 1);
        }
        for (int var5 = 5 + this.world.rand.nextInt(6), var6 = 0; var6 < var5; ++var6) {
            this.dropItemRand(Items.FLINT, 1);
        }
        this.dropItemRand((Item)Items.MAP, 1);
        this.dropItemRand(Items.CLOCK, 1);
        this.dropItemRand(Items.COMPASS, 1);
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        if (super.attackEntityAsMob(par1Entity)) {
            if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
                int var2 = 6;
                if (this.world.getDifficulty() == EnumDifficulty.EASY) {
                    var2 = 8;
                    if (this.world.getDifficulty() == EnumDifficulty.NORMAL) {
                        var2 = 10;
                    }
                    else if (this.world.getDifficulty() == EnumDifficulty.HARD) {
                        var2 = 12;
                    }
                }
                if (par1Entity instanceof EntityLivingBase && this.world.rand.nextInt(5) == 1) {
                    ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(MobEffects.POISON, var2 * 5, 0));
                }
                final double ks = 1.1;
                double inair = 0.1;
                final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
                if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                    inair *= 2.0;
                }
                par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
            }
            return true;
        }
        return false;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (par1DamageSource.getDamageType().equals("cactus")) {
            return false;
        }
        if (this.hurt_timer <= 0) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
        }
        final Entity e = par1DamageSource.getTrueSource();
        if (e != null && e instanceof EntityLiving) {
            this.setAttackTarget((EntityLivingBase)e);
            this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.2);
            ret = true;
        }
        return ret;
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x - dx, y + i, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x - dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + dy, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y - dy, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y - dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dy; j <= dy; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + j, z + dz)).getBlock();
                if (bid == Blocks.TORCH) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y + j, z - dz)).getBlock();
                if (bid == Blocks.TORCH) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z - dz;
                        ++found;
                    }
                }
            }
        }
        return found != 0;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.hurt_timer > 0) {
            --this.hurt_timer;
        }
        if (this.world.rand.nextInt(8) == 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                if (this.getDistanceSq((Entity)e) < 16.0) {
                    this.setAttacking(1);
                    if (this.world.rand.nextInt(4) == 0 || this.world.rand.nextInt(5) == 1) {
                        this.attackEntityAsMob((Entity)e);
                    }
                }
                this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.2);
            }
            else {
                this.setAttacking(0);
            }
        }
        else if (this.rand.nextInt(30) == 0 && OreSpawnMain.PlayNicely == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 2; i < 15 && !this.scan_it((int)this.posX, (int)this.posY, (int)this.posZ, i, i, i); ++i) {
                if (i >= 10) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 27 && this.world.getGameRules().getBoolean("mobGriefing")) {
                    this.world.setBlockState(new BlockPos(this.tx, this.ty, this.tz), Blocks.AIR.getDefaultState());
                }
            }
        }
        if (this.world.rand.nextInt(40) == 1 && this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase var4, final boolean par2) {
        if (var4 == null) {
            return false;
        }
        if (var4 == this) {
            return false;
        }
        if (!var4.isEntityAlive()) {
            return false;
        }
        if (var4 instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)var4;
            return !p.capabilities.isCreativeMode;
        }
        return false;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(12.0, 4.0, 12.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        final EntityLivingBase e = this.getAttackTarget();
        if (e != null && e.isEntityAlive()) {
            return e;
        }
        this.setAttackTarget((EntityLivingBase)null);
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
    
    public final int getAttacking() {
        return (byte)this.dataManager.get((DataParameter)Alien.ATTACKING);
    }
    
    public final void setAttacking(final int par1) {
        this.dataManager.set((DataParameter)Alien.ATTACKING, (Object)(byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        if (!this.isValidLightLevel()) {
            return false;
        }
        if (this.posY > 50.0) {
            return false;
        }
        for (int k = -1; k < 2; ++k) {
            for (int j = -1; j < 2; ++j) {
                for (int i = 1; i < 4; ++i) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k)).getBlock();
                    if (bid != Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    static {
        ATTACKING = EntityDataManager.createKey((Class)Alosaurus.class, DataSerializers.BYTE);
    }
}
