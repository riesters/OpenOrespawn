package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.ai.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.entity.*;

public class Ant extends EntityAnimal
{
    public double moveSpeed;
    private static final ResourceLocation texture2;
    
    public Ant(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.15000000596046448;
        this.setSize(0.1f, 0.1f);
        this.experienceValue = 0;
        this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4));
        this.tasks.addTask(1, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0);
    }
    
    public ResourceLocation getTexture(final Ant a) {
        return Ant.texture2;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        super.onUpdate();
        this.updateAITick();
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        System.out.println("ANT INTERACTED");
        if (par1EntityPlayer == null) {
            return false;
        }
        if (!(par1EntityPlayer instanceof EntityPlayerMP)) {
            return false;
        }
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2 != null && var2.getCount() <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
            var2 = null;
        }
        return var2 == null;
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public int mygetMaxHealth() {
        return 1;
    }
    
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource source) {
        return null;
    }
    
    protected SoundEvent getDeathSound() {
        return null;
    }
    
    protected float getSoundVolume() {
        return 0.0f;
    }
    
    protected void playStepSound(final int par1, final int par2, final int par3, final int par4) {
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
    }
    
    protected boolean canTriggerWalking() {
        return true;
    }
    
    public EntityAgeable createChild(final EntityAgeable var1) {
        return null;
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.findBuddies() <= 4;
    }
    
    private int findBuddies() {
        final List var5 = this.world.getEntitiesWithinAABB((Class)Ant.class, this.getEntityBoundingBox().expand(20.0, 10.0, 20.0));
        return var5.size();
    }
    
    public void updateAITick() {
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
    }
    
    static {
        texture2 = new ResourceLocation("orespawn:textures/entity/red_ant.png");
    }
}
