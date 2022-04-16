package danger.orespawn;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Firefly extends EntityAmbientCreature {
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "Fireflytexture.png");
  
  int my_blink = 0;
  
  int blinker = 0;
  
  int myspace = 0;
  
  private ChunkCoordinates currentFlightTarget = null;
  
  public Firefly(World par1World) {
    super(par1World);
    this.my_blink = 20 + this.rand.nextInt(20);
    setSize(0.4F, 0.8F);
    getNavigator().setAvoidsWater(true);
    this.renderDistanceWeight = 3.0D;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  public ResourceLocation getTexture(Firefly a) {
    return texture1;
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public float getBlink() {
    if (this.blinker < this.my_blink / 2)
      return 240.0F; 
    return 0.0F;
  }
  
  protected float getSoundVolume() {
    return 0.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
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
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  protected void collideWithNearbyEntities() {}
  
  public int mygetMaxHealth() {
    return 1;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock(OreSpawnMain.ExtremeTorch);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionY *= 0.600000023841D;
    this.blinker++;
    if (this.blinker > this.my_blink)
      this.blinker = 0; 
    if (isNoDespawnRequired())
      return; 
    long t = this.worldObj.getWorldTime();
    t %= 24000L;
    if (t > 11000L)
      return; 
    if (this.worldObj.rand.nextInt(500) == 1)
      setDead(); 
  }
  
  protected void updateAITasks() {
    int keep_trying = 25;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.rand.nextInt(40) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.0F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        this.currentFlightTarget.set((int)this.posX + this.rand.nextInt(4) - this.rand.nextInt(4), (int)this.posY + this.rand.nextInt(4) - 2, (int)this.posZ + this.rand.nextInt(4) - this.rand.nextInt(4));
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        keep_trying--;
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.2D - this.motionX) * 0.1D;
    this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.1D;
    this.motionZ += (Math.signum(var5) * 0.2D - this.motionZ) * 0.1D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.2F;
    this.rotationYaw += var8 / 4.0F;
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return true;
  }
  
  public boolean getCanSpawnHere() {
    Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
    if (bid != Blocks.air)
      return false; 
    if (this.worldObj.isDaytime())
      return false; 
    if (findBuddies() > 10)
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4)
      return true; 
    if (this.posY < 50.0D)
      return false; 
    return true;
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Firefly.class, this.boundingBox.expand(20.0D, 8.0D, 20.0D));
    return var5.size();
  }
  
  public void initCreature() {}
  
  protected boolean canDespawn() {
    if (!this.worldObj.isDaytime())
      return false; 
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
}
