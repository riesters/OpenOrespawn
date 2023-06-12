package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraft.entity.*;
import danger.orespawn.*;
import java.util.*;

public class Cryolophosaurus extends EntityMob
{
    private float moveSpeed;
    
    public Cryolophosaurus(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.25f;
        this.setSize(0.75f, 0.75f);
        this.experienceValue = 10;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(3, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public int mygetMaxHealth() {
        return 45;
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
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    protected SoundEvent getAmbientSound() {
        if (this.rand.nextInt(6) == 0) {
            return SoundsHandler.ENTITY_CRYO_LIVING;
        }
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource source) {
        return SoundsHandler.ENTITY_CRYO_HURT;
    }
    
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_CRYO_DEATH;
    }
    
    protected float getSoundVolume() {
        return 0.75f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.world.rand.nextInt(10);
        if (i == 0) {
            return Items.CHICKEN;
        }
        if (i == 1) {
            return ModItems.URANIUM_NUGGET;
        }
        if (i == 2) {
            return ModItems.TITANIUM_NUGGET;
        }
        return null;
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (this.world.rand.nextInt(5) == 1) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                if (this.getDistanceSq((Entity)e) < 5.0 && (this.rand.nextInt(12) == 0 || this.rand.nextInt(14) == 1)) {
                    this.attackEntityAsMob((Entity)e);
                }
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
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof Alosaurus) {
            return false;
        }
        if (par1EntityLiving instanceof TRex) {
            return false;
        }
        if (par1EntityLiving instanceof Cryolophosaurus) {
            return false;
        }
        if (par1EntityLiving instanceof Ant) {
            return false;
        }
        if (par1EntityLiving instanceof RedAnt) {
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
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(9.0, 2.0, 9.0));
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
        return this.isValidLightLevel() && (!this.world.isDaytime() || this.posY <= 50.0);
    }
}
