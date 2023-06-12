package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import net.minecraft.potion.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.util.*;
import javax.annotation.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.init.*;

public class StinkBug extends EntityAnimal
{
    private float moveSpeed;
    
    public StinkBug(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.15f;
        this.setSize(0.55f, 0.55f);
        this.experienceValue = 2;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 4.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(8, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITasks();
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (this.isDead) {
            return false;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        if (this.getHealth() <= 0.0f || this.isDead) {
            final AxisAlignedBB bb = this.getEntityBoundingBox().expand(8.0, 5.0, 8.0);
            final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, bb);
            final Iterator var6 = var5.iterator();
            EntityLivingBase var7 = null;
            while (var6.hasNext()) {
                var7 = (EntityLivingBase)var6.next();
                if (var7 != null) {
                    var7.addPotionEffect(new PotionEffect((Potion)Objects.requireNonNull(Potion.getPotionById(9)), 300, 0));
                }
            }
        }
        return ret;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 5;
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
        super.onDeath(cause);
        switch (this.rand.nextInt(9) + 1) {
            case 1: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART1, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 2: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART2, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 3: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART3, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 4: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART4, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 5: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART5, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 6: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART6, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 7: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART7, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 8: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART8, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
            case 9: {
                this.playSound(SoundsHandler.ENTITY_STINKBUG_FART9, this.getSoundVolume(), this.getSoundPitch());
                break;
            }
        }
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0;
    }
    
    protected boolean canDespawn() {
        return !this.isChild() && !this.isNoDespawnRequired();
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public StinkBug spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new StinkBug(this.world);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.FISH;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return false;
    }
}
