package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.util.*;
import javax.annotation.*;
import danger.orespawn.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class Pointysaurus extends EntityMob
{
    private final float moveSpeed = 0.35f;
    private EntityLivingBase rt;
    
    public Pointysaurus(final World par1World) {
        super(par1World);
        this.rt = null;
        this.setSize(2.9f, 2.9f);
        this.experienceValue = 40;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        final IAttributeInstance entityAttribute = this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        this.getClass();
        entityAttribute.setBaseValue(0.3499999940395355);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        final IAttributeInstance entityAttribute = this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        this.getClass();
        entityAttribute.setBaseValue(0.3499999940395355);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 40;
    }
    
    public int getTotalArmorValue() {
        return 10;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    protected SoundEvent getAmbientSound() {
        if (this.rand.nextInt(4) == 0) {
            return SoundsHandler.ENTITY_ALOSAURUS_LIVING;
        }
        return null;
    }
    
    @ParametersAreNonnullByDefault
    protected SoundEvent getHurtSound(final DamageSource source) {
        return SoundsHandler.ENTITY_ALOSAURUS_HURT;
    }
    
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_ALOSAURUS_DEATH;
    }
    
    protected float getSoundVolume() {
        return 0.9f;
    }
    
    protected float getSoundPitch() {
        return 1.5f;
    }
    
    protected Item getDropItem() {
        return Items.BEEF;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 2.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.LEATHER, 1);
        }
        for (int var4 = 0; var4 < 6; ++var4) {
            this.dropItemRand(Items.BEEF, 1);
        }
        for (int var4 = 0; var4 < 6; ++var4) {
            this.dropItemRand(Items.ROTTEN_FLESH, 1);
        }
        for (int var4 = 0; var4 < 6; ++var4) {
            this.dropItemRand(Items.STRING, 1);
        }
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        if (super.attackEntityAsMob(par1Entity)) {
            if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
                final double ks = 0.8;
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
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
            final Entity e = par1DamageSource.getImmediateSource();
            if (e instanceof EntityLivingBase) {
                this.rt = (EntityLivingBase)e;
            }
        }
        return ret;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(6) == 0) {
            EntityLivingBase e = null;
            e = this.rt;
            if (OreSpawnMain.PlayNicely != 0) {
                e = null;
            }
            if (e != null) {
                if (e.isDead || this.world.rand.nextInt(250) == 1) {
                    e = null;
                    this.rt = null;
                }
                if (e != null && !this.getEntitySenses().canSee((Entity)e)) {
                    e = null;
                }
            }
            if (e == null) {
                e = this.findSomethingToAttack();
            }
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                if (this.getDistanceSq((Entity)e) < (4.0f + e.width / 2.0f) * (4.0f + e.width / 2.0f)) {
                    this.setAttacking(1);
                    if (this.world.rand.nextInt(5) == 0 || this.world.rand.nextInt(6) == 1) {
                        this.attackEntityAsMob((Entity)e);
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                }
            }
            else {
                this.setAttacking(0);
            }
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (par1EntityLiving instanceof Pointysaurus) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return false;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(12.0, 5.0, 12.0));
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
    
    public int getAttacking() {
        return 1;
    }
    
    public void setAttacking(final int par1) {
    }
    
    public boolean getCanSpawnHere() {
        if (!this.isValidLightLevel()) {
            return false;
        }
        if (this.posY < 50.0) {
            return false;
        }
        if (this.world.isDaytime()) {
            return false;
        }
        for (int k = -1; k < 1; ++k) {
            for (int j = -1; j < 1; ++j) {
                for (int i = 1; i < 6; ++i) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k)).getBlock();
                    if (bid != Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
