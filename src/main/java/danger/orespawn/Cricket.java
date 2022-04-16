package danger.orespawn;

import java.util.List;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class Cricket extends EntityAnimal {
  public double moveSpeed = 0.15000000596046448D;
  
  private int singing = 0;
  
  private int jumpcount = 0;
  
  public Cricket(World par1World) {
    super(par1World);
    setSize(0.1F, 0.1F);
    this.experienceValue = 1;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 8, 1.0D));
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
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public int getSinging() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setSinging(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  private void jumpAround() {
    this.motionY += (0.55F + Math.abs(this.worldObj.rand.nextFloat() * 0.35F));
    this.posY += 0.25D;
    float f = 0.3F + Math.abs(this.worldObj.rand.nextFloat() * 0.25F);
    float d = (float)(this.worldObj.rand.nextFloat() * Math.PI * 2.0D);
    this.motionX += f * Math.sin(d);
    this.motionZ += f * Math.cos(d);
    this.isAirBorne = true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      if (this.singing != 0) {
        this.singing--;
        if (this.singing <= 0)
          setSinging(0); 
      } 
      if (this.jumpcount > 0)
        this.jumpcount--; 
      if (this.jumpcount == 0 && 
        this.worldObj.rand.nextInt(50) == 1) {
        jumpAround();
        this.jumpcount = 50;
      } 
    } 
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 3;
  }
  
  protected String getLivingSound() {
    if (!this.worldObj.isRemote) {
      if (this.worldObj.rand.nextInt(2) == 0)
        return null; 
      this.singing = 40;
      setSinging(this.singing);
    } 
    return "orespawn:cricket";
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  protected float getSoundVolume() {
    return 0.7F;
  }
  
  protected void playStepSound(int par1, int par2, int par3, int par4) {}
  
  protected void dropFewItems(boolean par1, int par2) {}
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 30.0D)
      return false; 
    if (findBuddies() > 5)
      return false; 
    return true;
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Cricket.class, this.boundingBox.expand(20.0D, 10.0D, 20.0D));
    return var5.size();
  }
}
