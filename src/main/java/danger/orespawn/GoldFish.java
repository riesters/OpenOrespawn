package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class GoldFish extends EntityAnimal {
  private ChunkCoordinates currentFlightTarget = null;
  
  public GoldFish(World par1World) {
    super(par1World);
    setSize(0.75F, 0.5F);
    this.experienceValue = 5;
    this.isImmuneToFire = false;
    this.fireResistance = 5;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2199999988079071D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  protected float getSoundVolume() {
    return 0.45F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected String getLivingSound() {
    return "splash";
  }
  
  protected String getHurtSound() {
    return "splash";
  }
  
  protected String getDeathSound() {
    return "orespawn:little_splat";
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  public int mygetMaxHealth() {
    return 6;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionY *= 0.6D;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    int updown = 0;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if ((int)this.posY < 120)
      updown = 2; 
    if ((int)this.posY > 140)
      updown = -2; 
    if (this.rand.nextInt(300) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.rand.nextInt(5) + 5;
        xdir = this.rand.nextInt(5) + 5;
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(11) - 5 + updown, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.4D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.4D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.4D - this.motionX) * 0.3D;
    this.motionY += (Math.signum(var3) * 0.7D - this.motionY) * 0.2D;
    this.motionZ += (Math.signum(var5) * 0.4D - this.motionZ) * 0.3D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.75F;
    this.rotationYaw += var8 / 6.0F;
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    return true;
  }
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(3);
    if (i == 0)
      return Item.getItemFromBlock(Blocks.gold_block); 
    if (i == 1)
      return OreSpawnMain.UraniumNugget; 
    if (i == 2)
      return OreSpawnMain.TitaniumNugget; 
    return null;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
}
