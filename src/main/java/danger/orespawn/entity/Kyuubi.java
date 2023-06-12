package danger.orespawn.entity;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;
import danger.orespawn.init.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.monster.*;
import danger.orespawn.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;

public class Kyuubi extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    
    public Kyuubi(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.moveSpeed = 0.25f;
        this.setSize(0.5f, 1.25f);
        this.experienceValue = 30;
        this.isImmuneToFire = true;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 10.0f));
        this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
        this.TargetSorter = new GenericTargetSorter((Entity)this);
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 125;
    }
    
    public int getTotalArmorValue() {
        return 10;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.world.rand.nextInt(10) == 1) {
            this.world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            this.world.spawnParticle(EnumParticleTypes.LAVA, this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            this.setFire(5);
            if (this.isInWater()) {
                this.attackEntityAsMob((Entity)this);
                this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 1.75, this.posZ, 0.0, 0.0, 0.0, new int[0]);
                this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX, this.posY + 1.75, this.posZ, 0.0, 0.0, 0.0, new int[0]);
                this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0, new int[0]);
                this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    public int getAttackStrength(final Entity par1Entity) {
        return 3;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return SoundsHandler.ENTITY_KYUUBI_LIVING;
    }
    
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_ALOSAURUS_HURT;
    }
    
    public void onDeath(final DamageSource cause) {
        this.playSound(SoundsHandler.ENTITY_ALOSAURUS_DEATH, this.getSoundVolume(), this.getSoundPitch());
    }
    
    protected float getSoundVolume() {
        return 0.75f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.world.rand.nextInt(6);
        if (i == 0) {
            return Items.GOLD_NUGGET;
        }
        if (i == 1) {
            return ModItems.URANIUM_NUGGET;
        }
        if (i == 2) {
            return ModItems.TITANIUM_NUGGET;
        }
        return null;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(10) == 1) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                if (this.getDistanceSq((Entity)e) < 64.0 && (this.rand.nextInt(6) == 0 || this.rand.nextInt(8) == 1)) {
                    final EntitySmallFireball var2 = new EntitySmallFireball(this.world, (EntityLivingBase)this, e.posX - this.posX, e.posY + 0.75 - (this.posY + 1.25), e.posZ - this.posZ);
                    var2.setLocationAndAngles(this.posX, this.posY + 1.25, this.posZ, this.rotationYaw, this.rotationPitch);
                    this.playSound(SoundEvents.ENTITY_ARROW_SHOOT, 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                    this.world.spawnEntity((Entity)var2);
                }
            }
        }
    }
    
    public void setAttackTarget(@Nullable final EntityLivingBase par1EntityLiving) {
        if (par1EntityLiving == null) {
            return;
        }
        if (par1EntityLiving == this) {
            return;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return;
        }
        if (par1EntityLiving instanceof EntityPigZombie) {
            return;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            if (p.capabilities.isCreativeMode) {
                return;
            }
        }
        super.setAttackTarget(par1EntityLiving);
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
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPigZombie) {
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
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(12.0, 4.0, 12.0));
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
    
    public boolean getCanSpawnHere() {
        return true;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.COAL, 1);
        }
        for (int var4 = 0; var4 < 3; ++var4) {
            this.dropItemRand(Item.getItemFromBlock(Blocks.REDSTONE_BLOCK), 1);
        }
        for (int var4 = 0; var4 < 4; ++var4) {
            this.dropItemRand(Item.getItemFromBlock(Blocks.QUARTZ_BLOCK), 1);
        }
    }
}
