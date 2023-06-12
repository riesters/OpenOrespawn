package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import javax.annotation.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;

public class Cassowary extends EntityAnimal
{
    private float moveSpeed;
    
    public Cassowary(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.25f;
        this.setSize(0.5f, 1.2f);
        this.moveSpeed = 0.25f;
        this.experienceValue = 5;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityLiving.class, 12.0f));
        this.tasks.addTask(6, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 1.0f));
        this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }
    
    @Nullable
    public EntityAgeable createChild(final EntityAgeable ageable) {
        return null;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0);
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 10;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_DUCK_HURT;
    }
    
    public void onDeath(final DamageSource cause) {
        super.onDeath(cause);
        this.playSound(SoundsHandler.ENTITY_DUCK_HURT, this.getSoundVolume(), this.getSoundPitch());
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.CHICKEN;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3 = 0;
        var3 = this.rand.nextInt(3);
        var3 += 2;
        for (int var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.CHICKEN, 1);
        }
    }
    
    protected void updateAITasks() {
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITasks();
    }
    
    public boolean getCanSpawnHere() {
        return this.world.isDaytime();
    }
    
    protected boolean canDespawn() {
        return !this.isChild() && !this.isNoDespawnRequired();
    }
    
    public Cassowary spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new Cassowary(this.world);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.APPLE;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return false;
    }
}
