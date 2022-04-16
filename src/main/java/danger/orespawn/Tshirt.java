package danger.orespawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Tshirt extends EntityAnimal {
  private float moveSpeed = 0.0F;
  
  public Tshirt(World par1World) {
    super(par1World);
    setSize(4.0F, 4.0F);
    this.experienceValue = 40;
    this.fireResistance = 100;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return 1;
  }
  
  public int getTotalArmorValue() {
    return 0;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.emerald;
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    if ((!this.worldObj.isDaytime() ? true : false) == true)
      return false; 
    if (this.posY < 50.0D)
      return false; 
    Tshirt target = null;
    target = (Tshirt)this.worldObj.findNearestEntityWithinAABB(Tshirt.class, this.boundingBox.expand(20.0D, 8.0D, 20.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
}
