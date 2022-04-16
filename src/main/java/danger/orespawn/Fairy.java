package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Fairy extends EntityAmbientCreature {
  private static final ResourceLocation texture0 = new ResourceLocation("orespawn", "fairytexture.png");
  
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "fairytexture2.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "fairytexture3.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "fairytexture4.png");
  
  private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "fairytexture5.png");
  
  private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "fairytexture6.png");
  
  private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "fairytexture7.png");
  
  private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "fairytexture8.png");
  
  private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "fairytexture9.png");
  
  int my_blink = 0;
  
  int blinker = 0;
  
  int myspace = 0;
  
  public int fairy_type = 0;
  
  private int force_sync = 10;
  
  private ChunkCoordinates currentFlightTarget = null;
  
  private String myowner = null;
  
  private GenericTargetSorter TargetSorter = null;
  
  public Fairy(World par1World) {
    super(par1World);
    this.my_blink = 20 + this.rand.nextInt(20);
    setSize(0.4F, 0.8F);
    if (par1World != null)
      this.fairy_type = par1World.rand.nextInt(9); 
    getNavigator().setAvoidsWater(true);
    this.renderDistanceWeight = 3.0D;
    this.tasks.addTask(0, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
    this.tasks.addTask(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.TargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
  }
  
  public ResourceLocation getTexture(Fairy a) {
    if (this.fairy_type == 8)
      return texture8; 
    if (this.fairy_type == 7)
      return texture7; 
    if (this.fairy_type == 6)
      return texture6; 
    if (this.fairy_type == 5)
      return texture5; 
    if (this.fairy_type == 4)
      return texture4; 
    if (this.fairy_type == 3)
      return texture3; 
    if (this.fairy_type == 2)
      return texture2; 
    if (this.fairy_type == 1)
      return texture1; 
    return texture0;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Integer.valueOf(this.fairy_type));
  }
  
  public void setOwner(EntityLivingBase e) {
    EntityPlayer p = null;
    if (e != null && 
      e instanceof EntityPlayer) {
      p = (EntityPlayer)e;
      String s = p.getDisplayName();
      if (s != null)
        this.myowner = s; 
    } 
  }
  
  public float getBlink() {
    if (this.blinker < this.my_blink / 2)
      return 240.0F; 
    return 0.0F;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return false; 
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 2.0F);
    return var4;
  }
  
  public int getTotalArmorValue() {
    return 4;
  }
  
  protected float getSoundVolume() {
    return 0.25F;
  }
  
  protected float getSoundPitch() {
    return 1.7F;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:rat_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:big_splat";
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  protected void collideWithNearbyEntities() {}
  
  public int mygetMaxHealth() {
    return 40;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock(OreSpawnMain.CrystalTorch);
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
    this.force_sync--;
    if (this.force_sync < 0) {
      this.force_sync = 10;
      if (this.worldObj.isRemote) {
        this.fairy_type = this.dataWatcher.getWatchableObjectInt(20);
      } else {
        this.dataWatcher.updateObject(20, Integer.valueOf(this.fairy_type));
      } 
    } 
    long t = this.worldObj.getWorldTime();
    t %= 24000L;
    if (t < 12000L)
      return; 
    if (this.worldObj.isRemote && this.worldObj.rand.nextInt(5) == 0 && getBlink() > 1.0F)
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY - 0.15000000596046448D, this.posZ, ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 8.0F), (-this.worldObj.rand.nextFloat() / 8.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 8.0F)); 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    if (this.myowner == null)
      this.myowner = "null"; 
    par1NBTTagCompound.setString("MyOwner", this.myowner);
    par1NBTTagCompound.setInteger("FairyType", this.fairy_type);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.myowner = par1NBTTagCompound.getString("MyOwner");
    if (this.myowner != null && 
      this.myowner.equals("null"))
      this.myowner = null; 
    this.fairy_type = par1NBTTagCompound.getInteger("fairyType");
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return false; 
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(8.0D, 8.0D, 8.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.25D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int keep_trying = 25;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.worldObj.rand.nextInt(200) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.5F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        int zdir = this.worldObj.rand.nextInt(8);
        int xdir = this.worldObj.rand.nextInt(8);
        if (this.worldObj.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.worldObj.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.worldObj.rand.nextInt(5) - 2, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } else if (this.worldObj.rand.nextInt(12) == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      EntityLivingBase e = null;
      e = findSomethingToAttack();
      if (e != null) {
        this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
        if (getDistanceSqToEntity((Entity)e) < 6.0D)
          attackEntityAsMob((Entity)e); 
      } 
    } else if (this.myowner != null) {
      EntityPlayer p = this.worldObj.getPlayerEntityByName(this.myowner);
      if (p != null) {
        if (getDistanceSqToEntity((Entity)p) > 64.0D)
          this.currentFlightTarget.set((int)p.posX + this.worldObj.rand.nextInt(3) - this.worldObj.rand.nextInt(3), (int)(p.posY + 1.0D), (int)p.posZ + this.worldObj.rand.nextInt(3) - this.worldObj.rand.nextInt(3)); 
        if (getDistanceSqToEntity((Entity)p) > 256.0D)
          setPosition(p.posX + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat(), p.posY, p.posZ + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()); 
      } 
    } 
    if (this.worldObj.rand.nextInt(250) == 1)
      heal(1.0F); 
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
    int sc = 0;
    for (int k = -1; k <= 1; k++) {
      for (int j = -1; j <= 1; j++) {
        Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY, (int)this.posZ + k);
        if (bid == Blocks.air)
          sc++; 
      } 
    } 
    if (sc < 6)
      return false; 
    if (this.posY < 50.0D)
      return false; 
    return true;
  }
  
  public void initCreature() {}
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.myowner != null)
      return false; 
    return true;
  }
}
