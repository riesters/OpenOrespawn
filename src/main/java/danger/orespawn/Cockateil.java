package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Cockateil extends EntityAnimal {
  private ChunkCoordinates currentFlightTarget = null;
  
  public int birdtype;
  
  private boolean killedByPlayer = false;
  
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "Bird1.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Bird2.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Bird3.png");
  
  private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "Bird4.png");
  
  private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "Bird5.png");
  
  private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "Bird6.png");
  
  private int stuck_count = 0;
  
  private int lastX = 0;
  
  private int lastZ = 0;
  
  private int flyup = 0;
  
  public Cockateil(World par1World) {
    super(par1World);
    setSize(0.5F, 0.5F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 2;
    this.isImmuneToFire = false;
    this.fireResistance = 2;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.33000001311302185D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
  }
  
  public ResourceLocation getTexture() {
    this.birdtype = getBirdType();
    switch (this.birdtype) {
      case 0:
        return texture1;
      case 1:
        return texture2;
      case 2:
        return texture3;
      case 3:
        return texture4;
      case 4:
        return texture5;
      case 5:
        return texture6;
    } 
    return null;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.birdtype = this.rand.nextInt(6);
    this.dataWatcher.addObject(22, Integer.valueOf(this.birdtype));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public int getBirdType() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public void setBirdType(int par1) {
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
  }
  
  protected float getSoundVolume() {
    return 0.55F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected String getLivingSound() {
    if (this.worldObj.isDaytime() && !this.worldObj.isRaining())
      return "orespawn:birds"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:duck_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:duck_hurt";
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 2;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof net.minecraft.entity.player.EntityPlayer)
      this.killedByPlayer = true; 
    return super.attackEntityFrom(par1DamageSource, par2);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.currentFlightTarget == null) {
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
    } else if (this.posY < this.currentFlightTarget.posY) {
      this.motionY *= 0.7D;
    } else {
      this.motionY *= 0.5D;
    } 
  }
  
  public int getAttackStrength(Entity par1Entity) {
    return 1;
  }
  
  public void setFlyUp() {
    this.flyup = 2;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 35;
    int stayup = 0;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4)
      stayup = 2; 
    if (this.lastX == (int)this.posX && this.lastZ == (int)this.posZ) {
      this.stuck_count++;
    } else {
      this.stuck_count = 0;
      this.lastX = (int)this.posX;
      this.lastZ = (int)this.posZ;
    } 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.stuck_count > 40 || this.rand.nextInt(250) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.1F) {
      Block bid = Blocks.stone;
      this.stuck_count = 0;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.rand.nextInt(8) + 5 - this.flyup * 2;
        xdir = this.rand.nextInt(8) + 5 - this.flyup * 2;
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(9 + stayup) - 5 + this.flyup, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.3D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.3D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.3D - this.motionX) * 0.25D;
    this.motionY += (Math.signum(var3) * 0.699999D - this.motionY) * 0.200000001D;
    this.motionZ += (Math.signum(var5) * 0.3D - this.motionZ) * 0.25D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.8F;
    this.rotationYaw += var8 / 3.0F;
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4)
      return true; 
    if (this.posY < 50.0D)
      return false; 
    return true;
  }
  
  protected Item getDropItem() {
    this.birdtype = getBirdType();
    if (this.birdtype == 5 && this.killedByPlayer && this.worldObj.rand.nextInt(3) == 1)
      return OreSpawnMain.MyRuby; 
    return Items.feather;
  }
  
  public void initCreature() {}
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("BirdType", getBirdType());
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.birdtype = par1NBTTagCompound.getInteger("BirdType");
    setBirdType(this.birdtype);
  }
}
