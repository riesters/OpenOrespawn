package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class ThePrinceTeen extends EntityTameable {
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private double boatYawHead;
  
  private int updateit = 1;
  
  private int playing = 0;
  
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int hurt_timer = 0;
  
  private int wing_sound = 0;
  
  private ChunkCoordinates currentFlightTarget = null;
  
  private boolean target_in_sight = false;
  
  private int owner_flying = 0;
  
  private int flyaway = 0;
  
  private float moveSpeed = 0.32F;
  
  private float deltasmooth = 0.0F;
  
  private int which_attack = 0;
  
  private int fireballticker = 0;
  
  private int head1ext = 0;
  
  private int head2ext = 0;
  
  private int head3ext = 0;
  
  private int head1dir = 1;
  
  private int head2dir = 1;
  
  private int head3dir = 1;
  
  private int kill_count = 0;
  
  private int day_count = 0;
  
  private int is_day = 0;
  
  public ThePrinceTeen(World par1World) {
    super(par1World);
    setSize(3.25F, 4.25F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 300;
    this.fireResistance = 1000;
    this.isImmuneToFire = true;
    setSitting(false);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIFollowOwner(this, 1.1F, 12.0F, 2.0F));
    this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.beef, false));
    this.tasks.addTask(3, new MyEntityAIWander((EntityCreature)this, 0.75F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 9.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, true, false, IMob.mobSelector)); 
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    this.riddenByEntity = null;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
  }
  
  public ThePrinceTeen(World par1World, double par2, double par4, double par6) {
    this(par1World);
    setPosition(par2, par4 + this.yOffset, par6);
    this.motionX = 0.0D;
    this.motionY = 0.0D;
    this.motionZ = 0.0D;
    this.prevPosX = par2;
    this.prevPosY = par4;
    this.prevPosZ = par6;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0D);
  }
  
  public boolean shouldRiderSit() {
    return true;
  }
  
  public int getTrackingRange() {
    return 64;
  }
  
  public int getUpdateFrequency() {
    return 10;
  }
  
  public boolean sendsVelocityUpdates() {
    return true;
  }
  
  public int getHead1Ext() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public int getHead2Ext() {
    return this.dataWatcher.getWatchableObjectInt(23);
  }
  
  public int getHead3Ext() {
    return this.dataWatcher.getWatchableObjectInt(25);
  }
  
  public void setHead1Ext(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
  }
  
  public void setHead2Ext(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(23, Integer.valueOf(par1));
  }
  
  public void setHead3Ext(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(25, Integer.valueOf(par1));
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Integer.valueOf(0));
    this.dataWatcher.addObject(21, Integer.valueOf(0));
    this.dataWatcher.addObject(24, Integer.valueOf(1));
    this.dataWatcher.addObject(22, Integer.valueOf(0));
    this.dataWatcher.addObject(23, Integer.valueOf(0));
    this.dataWatcher.addObject(25, Integer.valueOf(0));
    setActivity(0);
    setAttacking(0);
    setTamed(false);
    setThePrinceTeenFire(1);
    this.noClip = false;
    if (this.renderdata == null)
      this.renderdata = new RenderInfo(); 
    this.renderdata.rf1 = 0.0F;
    this.renderdata.rf2 = 0.0F;
    this.renderdata.rf3 = 0.0F;
    this.renderdata.rf4 = 0.0F;
    this.renderdata.ri1 = 0;
    this.renderdata.ri2 = 0;
    this.renderdata.ri3 = 0;
    this.renderdata.ri4 = 0;
  }
  
  public int mygetMaxHealth() {
    return 1500;
  }
  
  public int getThePrinceTeenHealth() {
    return (int)getHealth();
  }
  
  public RenderInfo getRenderInfo() {
    return this.renderdata;
  }
  
  public void setRenderInfo(RenderInfo r) {
    this.renderdata.rf1 = r.rf1;
    this.renderdata.rf2 = r.rf2;
    this.renderdata.rf3 = r.rf3;
    this.renderdata.rf4 = r.rf4;
    this.renderdata.ri1 = r.ri1;
    this.renderdata.ri2 = r.ri2;
    this.renderdata.ri3 = r.ri3;
    this.renderdata.ri4 = r.ri4;
  }
  
  public int getTotalArmorValue() {
    return 18;
  }
  
  protected void jump() {
    super.jump();
    this.motionY += 0.25D;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  public String getLivingSound() {
    if (isSitting())
      return null; 
    if (getActivity() == 1 && this.riddenByEntity == null)
      return "orespawn:roar"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:alo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:alo_death";
  }
  
  protected float getSoundVolume() {
    return 0.6F;
  }
  
  public float getSoundPitch() {
    return 0.75F;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  public double getMountedYOffset() {
    return 2.75D;
  }
  
  protected Item getDropItem() {
    return OreSpawnMain.ThePrinceEgg;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    dropItemRand(OreSpawnMain.ThePrinceEgg, 1);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    double ks = 1.75D;
    double inair = 0.1D;
    float iskraken = 1.0F;
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      if (par1Entity instanceof Kraken)
        iskraken = 2.0F; 
      par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), iskraken * 45.0F);
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
      if (par1Entity instanceof EntityLiving) {
        EntityLiving e = (EntityLiving)par1Entity;
        if (e.getHealth() <= 0.0F)
          this.kill_count++; 
      } 
    } 
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    Entity e = null;
    if (this.hurt_timer > 0)
      return false; 
    if (par1DamageSource.getDamageType().equals("cactus"))
      return ret; 
    if (par1DamageSource.getDamageType().equals("inFire"))
      return ret; 
    if (par1DamageSource.getDamageType().equals("onFire"))
      return ret; 
    if (par1DamageSource.getDamageType().equals("lava"))
      return ret; 
    if (par1DamageSource.getDamageType().equals("inWall"))
      return ret; 
    setSitting(false);
    setActivity(1);
    e = par1DamageSource.getEntity();
    if (e != null && e instanceof BetterFireball) {
      e.setDead();
      return ret;
    } 
    if (e != null && e instanceof net.minecraft.entity.projectile.EntitySmallFireball) {
      e.setDead();
      return ret;
    } 
    if (e != null && e instanceof ThePrinceTeen)
      return false; 
    if (e != null && e instanceof Spyro)
      return false; 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    this.hurt_timer = 20;
    if (e != null && e instanceof EntityLivingBase) {
      if (isTamed() && 
        e instanceof EntityPlayer)
        return false; 
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
      ret = true;
    } 
    return ret;
  }
  
  public void updateAITasks() {
    EntityLivingBase e = null;
    super.updateAITasks();
    if (!isSitting() && getActivity() == 0 && this.riddenByEntity == null && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(10) == 1) {
      e = findSomethingToAttack();
      if (e != null) {
        setActivity(1);
      } else {
        setAttacking(0);
      } 
    } 
    if (this.kill_count > 25 && this.day_count > 10) {
      Entity ent = null;
      ThePrinceAdult d = null;
      ent = spawnCreature(this.worldObj, "The Young Adult Prince", this.posX, this.posY, this.posZ);
      if (ent != null) {
        d = (ThePrinceAdult)ent;
        if (isTamed()) {
          d.setTamed(true);
          d.func_152115_b(func_152113_b());
        } 
        setDead();
      } 
    } 
    if (this.is_day == 0) {
      this.is_day = 1;
      if (!this.worldObj.isDaytime())
        this.is_day = -1; 
    } else {
      if (this.is_day == -1 && 
        this.worldObj.isDaytime())
        this.day_count++; 
      this.is_day = 1;
      if (!this.worldObj.isDaytime())
        this.is_day = -1; 
    } 
  }
  
  public void always_do() {
    EntityPlayer p = null;
    if (this.worldObj.rand.nextInt(250) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(2.0F); 
    if (this.worldObj.rand.nextInt(250) == 0)
      setAttackTarget(null); 
    if (isSitting())
      return; 
    this.owner_flying = 0;
    if (isTamed() && getOwner() != null && this.riddenByEntity == null && !isSitting()) {
      p = (EntityPlayer)getOwner();
      if (p.capabilities.isFlying) {
        this.owner_flying = 1;
        setActivity(1);
      } 
    } 
    if (this.worldObj.rand.nextInt(50) == 1 && !isSitting())
      if (!this.target_in_sight && this.riddenByEntity == null)
        if (this.worldObj.rand.nextInt(15) == 1) {
          setActivity(1);
        } else {
          setActivity(0);
        }   
  }
  
  public void fly_with_rider() {
    EntityLivingBase e = null;
    if (this.isDead)
      return; 
    if (isSitting())
      return; 
    if (this.worldObj.isRemote)
      return; 
    if (this.worldObj.rand.nextInt(5) == 1 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      e = findSomethingToAttack();
      if (e != null) {
        setAttacking(1);
        if (getDistanceSqToEntity((Entity)e) < ((8.0F + e.width / 2.0F) * (8.0F + e.width / 2.0F))) {
          attackEntityAsMob((Entity)e);
        } else if (getDistanceSqToEntity((Entity)e) > 100.0D && getDistanceSqToEntity((Entity)e) < 625.0D && !isInWater() && 
          getThePrinceTeenFire() != 0) {
          shoot_something(e.posX, e.posY, e.posZ);
        } 
      } else {
        setAttacking(0);
      } 
    } 
  }
  
  protected void updateAITick() {
    if (this.riddenByEntity != null)
      return; 
    super.updateAITick();
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
    if (MyUtils.isRoyalty((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    if (par1EntityLiving instanceof Mothra)
      return true; 
    if (par1EntityLiving instanceof Kraken)
      return true; 
    if (par1EntityLiving instanceof Leon) {
      Leon l = (Leon)par1EntityLiving;
      if (l.isTamed())
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof WaterDragon) {
      WaterDragon l = (WaterDragon)par1EntityLiving;
      if (l.isTamed())
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof GammaMetroid) {
      GammaMetroid l = (GammaMetroid)par1EntityLiving;
      if (l.isTamed())
        return false; 
      return true;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(25.0D, 20.0D, 25.0D));
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
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    return false;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
    super.setPositionAndRotation2(par1, par3, par5, par7, par8, par9);
    this.boatPosRotationIncrements = par9;
    this.boatX = par1;
    this.boatY = par3;
    this.boatZ = par5;
    this.boatYaw = par7;
    this.boatPitch = par8;
    this.boatYawHead = par7;
  }
  
  @SideOnly(Side.CLIENT)
  public void setVelocity(double par1, double par3, double par5) {
    super.setVelocity(par1, par3, par5);
  }
  
  public void onUpdate() {
    EntityLivingBase e = null;
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (getActivity() != 0) {
      this.noClip = true;
    } else {
      this.noClip = false;
    } 
    if (!this.worldObj.isRemote) {
      if (this.worldObj.rand.nextInt(10) == 1) {
        int i = this.worldObj.rand.nextInt(3);
        if (i == 0)
          this.head1dir = 2; 
        if (i == 1)
          this.head1dir = -2; 
        if (i == 2)
          this.head1dir = 0; 
      } 
      if (this.worldObj.rand.nextInt(10) == 1) {
        int i = this.worldObj.rand.nextInt(3);
        if (i == 0)
          this.head2dir = 2; 
        if (i == 1)
          this.head2dir = -2; 
        if (i == 2)
          this.head2dir = 0; 
      } 
      if (this.worldObj.rand.nextInt(10) == 1) {
        int i = this.worldObj.rand.nextInt(3);
        if (i == 0)
          this.head3dir = 2; 
        if (i == 1)
          this.head3dir = -2; 
        if (i == 2)
          this.head3dir = 0; 
      } 
      this.head1ext += this.head1dir;
      if (this.head1ext < 0)
        this.head1ext = 0; 
      if (this.head1ext > 60)
        this.head1ext = 60; 
      this.head2ext += this.head2dir;
      if (this.head2ext < 0)
        this.head2ext = 0; 
      if (this.head2ext > 60)
        this.head2ext = 60; 
      this.head3ext += this.head3dir;
      if (this.head3ext < 0)
        this.head3ext = 0; 
      if (this.head3ext > 60)
        this.head3ext = 60; 
      setHead1Ext(this.head1ext);
      setHead2Ext(this.head2ext);
      setHead3Ext(this.head3ext);
    } 
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (getActivity() == 1) {
      this.wing_sound++;
      if (this.wing_sound > 20) {
        if (!this.worldObj.isRemote)
          this.worldObj.playSoundAtEntity((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
        this.wing_sound = 0;
      } 
    } 
    if (isInWater())
      this.motionY += 0.07D; 
    if (this.worldObj.isRemote)
      return; 
    if (getActivity() == 0 && isTamed() && getOwner() != null && !isSitting()) {
      e = getOwner();
      if (getDistanceSqToEntity((Entity)e) > 400.0D)
        setActivity(1); 
    } 
  }
  
  private void fly_without_rider() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 10;
    int do_new = 0;
    double ox = 0.0D, oy = 0.0D, oz = 0.0D;
    int has_owner = 0;
    EntityLivingBase e = null;
    double speed_factor = 0.5D;
    double var1 = 0.0D;
    double var3 = 0.0D;
    double var5 = 0.0D;
    double gh = 1.25D;
    double obstruction_factor = 0.0D;
    double velocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    int toofar = 0;
    if (this.currentFlightTarget == null) {
      do_new = 1;
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
    } 
    if (this.riddenByEntity != null)
      return; 
    if (isTamed() && getOwner() != null) {
      e = getOwner();
      has_owner = 1;
      ox = e.posX;
      oy = e.posY;
      oz = e.posZ;
      if (getDistanceSqToEntity((Entity)e) > 400.0D) {
        toofar = 1;
        this.target_in_sight = false;
        setAttacking(0);
        setSitting(false);
        this.flyaway = 0;
        do_new = 1;
      } 
    } 
    if (isSitting())
      return; 
    if (this.posY < this.currentFlightTarget.posY + 2.0D) {
      this.motionY *= 0.7D;
    } else if (this.posY > this.currentFlightTarget.posY - 2.0D) {
      this.motionY *= 0.5D;
    } else {
      this.motionY *= 0.61D;
    } 
    if (this.worldObj.rand.nextInt(300) == 1)
      do_new = 1; 
    if (this.flyaway > 0)
      this.flyaway--; 
    if (toofar == 0 && this.flyaway == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(7) == 1) {
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        if (isTamed() && getHealth() / mygetMaxHealth() < 0.25F) {
          setActivity(1);
          setAttacking(0);
          this.target_in_sight = false;
          do_new = 0;
          this.currentFlightTarget.set((int)(this.posX + this.posX - e.posX), (int)(this.posY + 1.0D), (int)(this.posZ + this.posZ - e.posZ));
        } else {
          setActivity(1);
          setAttacking(1);
          this.target_in_sight = true;
          this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
          do_new = 0;
          if (getDistanceSqToEntity((Entity)e) < ((8.0F + e.width / 2.0F) * (8.0F + e.width / 2.0F))) {
            attackEntityAsMob((Entity)e);
            this.flyaway = 5 + this.worldObj.rand.nextInt(15);
            do_new = 1;
          } else if (getDistanceSqToEntity((Entity)e) < 400.0D && !isInWater()) {
            if (getThePrinceTeenFire() != 0 && this.worldObj.rand.nextInt(2) == 1)
              shoot_something(e.posX, e.posY, e.posZ); 
          } 
        } 
      } else {
        this.target_in_sight = false;
        this.flyaway = 0;
        setAttacking(0);
      } 
    } 
    if (this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F)
      do_new = 1; 
    if ((do_new != 0 && !this.target_in_sight) || (do_new != 0 && this.flyaway != 0)) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        int gox = (int)this.posX;
        int goy = (int)this.posY;
        int goz = (int)this.posZ;
        if (has_owner == 1) {
          gox = (int)ox;
          goy = (int)oy;
          goz = (int)oz;
          if (this.owner_flying == 0) {
            zdir = this.worldObj.rand.nextInt(14) + 5;
            xdir = this.worldObj.rand.nextInt(14) + 5;
          } else {
            zdir = this.worldObj.rand.nextInt(6);
            xdir = this.worldObj.rand.nextInt(6);
          } 
        } else {
          zdir = this.worldObj.rand.nextInt(10) + 16;
          xdir = this.worldObj.rand.nextInt(10) + 16;
        } 
        if (this.worldObj.rand.nextInt(2) == 1)
          zdir = -zdir; 
        if (this.worldObj.rand.nextInt(2) == 1)
          xdir = -xdir; 
        this.currentFlightTarget.set(gox + xdir, goy + this.worldObj.rand.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } 
    obstruction_factor = 0.0D;
    int dist = 2;
    dist += (int)(velocity * 4.0D);
    for (int k = 1; k < dist; k++) {
      for (int i = 1; i < dist * 2; i++) {
        double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
        double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
        Block bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
        if (bid != Blocks.air)
          obstruction_factor += 0.05D; 
      } 
    } 
    this.motionY += obstruction_factor * 0.05D;
    this.posY += obstruction_factor * 0.05D;
    speed_factor = 0.5D;
    var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    if (this.owner_flying != 0) {
      speed_factor = 1.75D;
      if (isTamed() && getOwner() != null) {
        e = getOwner();
        if (getDistanceSqToEntity((Entity)e) > 64.0D)
          speed_factor = 3.5D; 
      } 
    } 
    this.motionX += (Math.signum(var1) - this.motionX) * 0.15D * speed_factor;
    this.motionY += (Math.signum(var3) - this.motionY) * 0.21D * speed_factor;
    this.motionZ += (Math.signum(var5) - this.motionZ) * 0.15D * speed_factor;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = (float)(0.75D * speed_factor);
    this.rotationYaw += var8 / 4.0F;
    moveEntity(this.motionX, this.motionY, this.motionZ);
  }
  
  public void onLivingUpdate() {
    List<Entity> list = null;
    Entity listEntity = null;
    double d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
    double d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
    double obstruction_factor = 0.0D;
    double relative_g = 0.0D;
    double max_speed = 0.95D;
    double gh = 1.0D;
    double rt = 0.0D;
    double pi = 3.1415926545D;
    double deltav = 0.0D;
    int dist = 2;
    if (getActivity() == 0) {
      super.onLivingUpdate();
    } else if (this.isDead) {
      super.onLivingUpdate();
      return;
    } 
    if (this.isDead)
      return; 
    if (this.worldObj.isRemote) {
      if (this.boatPosRotationIncrements > 0 && getActivity() != 0) {
        double d4 = this.posX + (this.boatX - this.posX) / this.boatPosRotationIncrements;
        double d5 = this.posY + (this.boatY - this.posY) / this.boatPosRotationIncrements;
        double d11 = this.posZ + (this.boatZ - this.posZ) / this.boatPosRotationIncrements;
        setPosition(d4, d5, d11);
        this.rotationPitch = (float)(this.rotationPitch + (this.boatPitch - this.rotationPitch) / this.boatPosRotationIncrements);
        double d10 = MathHelper.wrapAngleTo180_double(this.boatYaw - this.rotationYaw);
        if (this.riddenByEntity != null)
          d10 = MathHelper.wrapAngleTo180_double(this.riddenByEntity.rotationYaw - this.rotationYaw); 
        this.rotationYaw = (float)(this.rotationYaw + d10 / this.boatPosRotationIncrements);
        setRotation(this.rotationYaw, this.rotationPitch);
        this.rotationYawHead = this.rotationYaw;
        this.boatPosRotationIncrements--;
      } 
    } else {
      if (getActivity() != 0) {
        if (this.fireballticker > 0)
          this.fireballticker--; 
        if (this.riddenByEntity != null) {
          EntityPlayer pp = (EntityPlayer)this.riddenByEntity;
          if (this.motionX < -2.0D)
            this.motionX = -2.0D; 
          if (this.motionX > 2.0D)
            this.motionX = 2.0D; 
          if (this.motionZ < -2.0D)
            this.motionZ = -2.0D; 
          if (this.motionZ > 2.0D)
            this.motionZ = 2.0D; 
          double velocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
          gh = 1.25D;
          Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
          if (bid != Blocks.air) {
            this.motionY += 0.03D;
            this.posY += 0.1D;
          } else {
            this.motionY -= 0.018D;
          } 
          obstruction_factor = 0.0D;
          dist = 3;
          dist += (int)(velocity * 7.0D);
          for (int k = 1; k < dist; k++) {
            for (int i = 1; i < dist * 2; i++) {
              double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
              double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
              bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
              if (bid != Blocks.air)
                obstruction_factor += 0.05D; 
            } 
          } 
          this.motionY += obstruction_factor * 0.07D;
          this.posY += obstruction_factor * 0.07D;
          if (this.motionY > 2.0D)
            this.motionY = 2.0D; 
          double d4 = this.riddenByEntity.rotationYaw;
          d4 %= 360.0D;
          for (; d4 < 0.0D; d4 += 360.0D);
          double d5 = this.rotationYaw;
          d5 %= 360.0D;
          for (; d5 < 0.0D; d5 += 360.0D);
          relative_g = (d4 - d5) % 180.0D;
          for (; relative_g < 0.0D; relative_g += 180.0D);
          if (relative_g > 90.0D)
            relative_g -= 180.0D; 
          if (velocity > 0.01D) {
            d4 = 1.85D - velocity;
            d4 = Math.abs(d4);
            if (d4 < 0.01D)
              d4 = 0.01D; 
            if (d4 > 0.9D)
              d4 = 0.9D; 
            this.rotationYaw = this.riddenByEntity.rotationYaw + (float)(relative_g * d4);
          } else {
            this.rotationYaw = this.riddenByEntity.rotationYaw;
          } 
          relative_g = Math.abs(relative_g) * velocity;
          if (relative_g > 50.0D)
            relative_g = 0.0D; 
          this.rotationPitch = 2.0F * (float)velocity;
          setRotation(this.rotationYaw, this.rotationPitch);
          double newvelocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
          double rr = Math.atan2(this.riddenByEntity.motionZ, this.riddenByEntity.motionX);
          double rhm = Math.atan2(this.motionZ, this.motionX);
          double rhdir = Math.toRadians(((this.riddenByEntity.rotationYaw + 90.0F) % 360.0F));
          rt = 0.0D;
          pi = 3.1415926545D;
          deltav = 0.0D;
          float im = pp.moveForward;
          if (OreSpawnMain.flyup_keystate != 0) {
            this.motionY += 0.035D;
            this.motionY += velocity * 0.046D;
          } 
          double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
          if (rdv > pi)
            rdv -= pi * 2.0D; 
          rdv = Math.abs(rdv);
          if (Math.abs(newvelocity) < 0.01D)
            rdv = 0.0D; 
          if (rdv > 1.5D)
            newvelocity = -newvelocity; 
          if (Math.abs(im) > 0.001F) {
            if (im > 0.0F) {
              deltav = 0.025D;
              if (max_speed > 1.0D)
                deltav += 0.05D; 
              if (this.deltasmooth < 0.0F)
                this.deltasmooth = 0.0F; 
              this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
              if (this.deltasmooth > deltav)
                this.deltasmooth = (float)deltav; 
            } else {
              max_speed = 0.35D;
              deltav = -0.02D;
              if (this.deltasmooth > 0.0F)
                this.deltasmooth = 0.0F; 
              this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
              if (this.deltasmooth < deltav)
                this.deltasmooth = (float)deltav; 
            } 
            newvelocity += this.deltasmooth;
            if (newvelocity >= 0.0D) {
              if (newvelocity > max_speed)
                newvelocity = max_speed; 
              this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
              this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
            } else {
              if (newvelocity < -max_speed)
                newvelocity = -max_speed; 
              newvelocity = -newvelocity;
              this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity;
              this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity;
            } 
          } else if (newvelocity >= 0.0D) {
            this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
            this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
          } else {
            this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity * -1.0D;
            this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity * -1.0D;
          } 
          if (this.fireballticker == 0 && (pp.moveStrafing < -0.001F || pp.moveStrafing > 0.001F)) {
            double yoff = 1.5D;
            double xzoff = 7.5D;
            this.which_attack++;
            if (this.which_attack > 2)
              this.which_attack = 0; 
            if (this.which_attack == 0) {
              yoff += (getHead1Ext() * 0.04F);
              double cx = this.posX - xzoff * Math.sin(Math.toRadians((this.rotationYaw - 10.0F)));
              double cz = this.posZ + xzoff * Math.cos(Math.toRadians((this.rotationYaw - 10.0F)));
              BetterFireball bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, 0.0D, 0.0D, 0.0D);
              bf.setNotMe();
              bf.setPosition(cx, this.posY + yoff, cz);
              cx = Math.cos(Math.toRadians((pp.rotationYawHead + 90.0F)));
              cz = Math.sin(Math.toRadians((pp.rotationYawHead + 90.0F)));
              double cy = -Math.sin(Math.toRadians(pp.rotationPitch));
              double d3 = MathHelper.sqrt_double(cx * cx + cy * cy + cz * cz);
              bf.accelerationX = cx / d3 * 0.1D;
              bf.accelerationY = cy / d3 * 0.1D;
              bf.accelerationZ = cz / d3 * 0.1D;
              bf.motionX = this.motionX;
              bf.motionY = this.motionY;
              bf.motionZ = this.motionZ;
              bf.posX -= this.motionX * 3.0D;
              bf.posY -= this.motionY * 3.0D;
              bf.posZ -= this.motionZ * 3.0D;
              this.worldObj.playSoundAtEntity((Entity)this, "random.fuse", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
              this.worldObj.spawnEntityInWorld((Entity)bf);
            } 
            if (this.which_attack == 1) {
              yoff += (getHead3Ext() * 0.04F);
              double cx = this.posX - xzoff * Math.sin(Math.toRadians((this.rotationYaw + 10.0F)));
              double cz = this.posZ + xzoff * Math.cos(Math.toRadians((this.rotationYaw + 10.0F)));
              IceBall var2 = new IceBall(this.worldObj, cx, this.posY + yoff, cz);
              var2.setLocationAndAngles(cx, this.posY + yoff, cz, pp.rotationYaw + 90.0F, pp.rotationPitch);
              var2.setIceMaker(1);
              double var3 = Math.cos(Math.toRadians((pp.rotationYaw + 90.0F)));
              double var5 = -Math.sin(Math.toRadians(pp.rotationPitch));
              double var77 = Math.sin(Math.toRadians((pp.rotationYaw + 90.0F)));
              float var9 = MathHelper.sqrt_double(var3 * var3 + var77 * var77) * 0.2F;
              var2.setThrowableHeading(var3, var5 + var9, var77, 1.4F, 5.0F);
              var2.posX -= this.motionX * 3.0D;
              var2.posY -= this.motionY * 3.0D;
              var2.posZ -= this.motionZ * 3.0D;
              var2.motionX *= 2.0D;
              var2.motionY *= 2.0D;
              var2.motionZ *= 2.0D;
              this.worldObj.playSoundAtEntity((Entity)this, "fireworks.launch", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
              this.worldObj.spawnEntityInWorld((Entity)var2);
            } 
            if (this.which_attack == 2) {
              yoff += (getHead2Ext() * 0.04F);
              double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
              double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
              ThunderBolt lb = new ThunderBolt(this.worldObj, (EntityLivingBase)pp);
              lb.setLocationAndAngles(cx, this.posY + yoff, cz, pp.rotationYaw + 90.0F, pp.rotationPitch);
              lb.motionX *= 3.0D;
              lb.motionY *= 3.0D;
              lb.motionZ *= 3.0D;
              this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
              this.worldObj.spawnEntityInWorld((Entity)lb);
            } 
            this.fireballticker = 10;
          } 
          moveEntity(this.motionX, this.motionY, this.motionZ);
          this.motionX *= 0.985D;
          this.motionY *= 0.94D;
          this.motionZ *= 0.985D;
          if (!this.worldObj.isRemote) {
            list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand(3.25D, 4.0D, 3.25D));
            if (list != null && !list.isEmpty())
              for (int l = 0; l < list.size(); l++) {
                listEntity = list.get(l);
                if (listEntity != this.riddenByEntity && !listEntity.isDead && listEntity.canBePushed())
                  listEntity.applyEntityCollision((Entity)this); 
              }  
          } 
          fly_with_rider();
          if (this.riddenByEntity != null && this.riddenByEntity.isDead)
            this.riddenByEntity = null; 
        } else {
          fly_without_rider();
        } 
      } 
      always_do();
    } 
  }
  
  public void updateRiderPosition() {
    if (this.riddenByEntity != null) {
      float f = 0.65F;
      this.riddenByEntity.setPosition(this.posX - f * Math.sin(Math.toRadians(this.rotationYaw)), this.posY + getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + f * Math.cos(Math.toRadians(this.rotationYaw)));
    } 
  }
  
  protected void playTameEffect(boolean par1) {
    String s = "heart";
    if (!par1)
      s = "smoke"; 
    for (int i = 0; i < 20; i++) {
      double d0 = this.rand.nextGaussian() * 0.08D;
      double d1 = this.rand.nextGaussian() * 0.08D;
      double d2 = this.rand.nextGaussian() * 0.08D;
      this.worldObj.spawnParticle(s, this.posX + ((this.rand.nextFloat() - this.rand.nextFloat()) * 2.5F), this.posY + 0.5D + this.rand.nextFloat() * 1.5D, this.posZ + ((this.rand.nextFloat() - this.rand.nextFloat()) * 2.5F), d0, d1, d2);
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null && 
      var2.stackSize <= 0) {
      par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
      var2 = null;
    } 
    if (var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.diamond_block) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
      if (!this.worldObj.isRemote) {
        setTamed(true);
        func_152115_b(par1EntityPlayer.getUniqueID().toString());
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
        heal(mygetMaxHealth() - getHealth());
        this.kill_count = 1000;
        this.day_count = 1000;
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed()) {
      if (!func_152114_e((EntityLivingBase)par1EntityPlayer))
        return false; 
      if (var2 == null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
        if (!this.worldObj.isRemote) {
          par1EntityPlayer.mountEntity((Entity)this);
          setActivity(1);
          setSitting(false);
        } 
        return true;
      } 
      if (var2 != null && var2.getItem() == Items.beef && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
        if (this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (mygetMaxHealth() > getHealth())
          heal(mygetMaxHealth() - getHealth()); 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (var2 != null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D && var2.getItem() instanceof ItemFood) {
        if (!this.worldObj.isRemote) {
          ItemFood var3 = (ItemFood)var2.getItem();
          if (mygetMaxHealth() > getHealth())
            heal((var3.func_150905_g(var2) * 10)); 
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.ice) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
        if (!this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)6);
          setThePrinceTeenFire(0);
          String healthMessage = new String();
          healthMessage = String.format("Fireballs extinguished.", new Object[0]);
          par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
        } 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (var2 != null && var2.getItem() == Items.flint_and_steel && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
        if (!this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)6);
          setThePrinceTeenFire(1);
          String healthMessage = new String();
          healthMessage = String.format("Fireballs lit!", new Object[0]);
          par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
        } 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (var2 != null && var2.getItem() == Items.diamond && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D && !this.worldObj.isRemote) {
        Entity ent = null;
        ThePrince d = null;
        ent = spawnCreature(this.worldObj, "The Prince", this.posX, this.posY, this.posZ);
        if (ent != null) {
          d = (ThePrince)ent;
          if (isTamed()) {
            d.setTamed(true);
            d.func_152115_b(par1EntityPlayer.getUniqueID().toString());
            d.set_ok_to_grow();
          } 
          setDead();
        } 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
        setCustomNameTag(var2.getDisplayName());
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
        return true;
      } 
      if (var2 != null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
        if (!isSitting()) {
          setSitting(true);
          setActivity(0);
        } else {
          setSitting(false);
          setActivity(0);
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.beef);
  }
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  public void setAttacking(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
  }
  
  public int getActivity() {
    return this.dataWatcher.getWatchableObjectInt(21);
  }
  
  public void setActivity(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(21, Integer.valueOf(par1));
  }
  
  public int getThePrinceTeenFire() {
    return this.dataWatcher.getWatchableObjectInt(24);
  }
  
  public void setThePrinceTeenFire(int par1) {
    if (this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(24, Integer.valueOf(par1));
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.riddenByEntity != null)
      return false; 
    if (isTamed())
      return false; 
    return true;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("ThePrinceTeenAttacking", getAttacking());
    par1NBTTagCompound.setInteger("ThePrinceTeenActivity", getActivity());
    par1NBTTagCompound.setInteger("ThePrinceTeenFire", getThePrinceTeenFire());
    par1NBTTagCompound.setInteger("SpyroKill", this.kill_count);
    par1NBTTagCompound.setInteger("SpyroDay", this.day_count);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    setAttacking(par1NBTTagCompound.getInteger("ThePrinceTeenAttacking"));
    setActivity(par1NBTTagCompound.getInteger("ThePrinceTeenActivity"));
    setThePrinceTeenFire(par1NBTTagCompound.getInteger("ThePrinceTeenFire"));
    this.kill_count = par1NBTTagCompound.getInteger("SpyroKill");
    this.day_count = par1NBTTagCompound.getInteger("SpyroDay");
  }
  
  private void shoot_something(double x, double y, double z) {
    double rr = 0.0D;
    double rhdir = 0.0D;
    double rdd = 0.0D;
    double pi = 3.1415926545D;
    int which = this.worldObj.rand.nextInt(3);
    if (which == 0) {
      rr = Math.atan2(z - this.posZ, x - this.posX);
      rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
      rdd = Math.abs(rr - rhdir) % pi * 2.0D;
      if (rdd > pi)
        rdd -= pi * 2.0D; 
      rdd = Math.abs(rdd);
      if (rdd < 0.5D)
        firecanon(x, y, z); 
    } else if (which == 1) {
      rr = Math.atan2(z - this.posZ, x - this.posX);
      rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
      rdd = Math.abs(rr - rhdir) % pi * 2.0D;
      if (rdd > pi)
        rdd -= pi * 2.0D; 
      rdd = Math.abs(rdd);
      if (rdd < 0.5D)
        firecanonl(x, y, z); 
    } else {
      rr = Math.atan2(z - this.posZ, x - this.posX);
      rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
      rdd = Math.abs(rr - rhdir) % pi * 2.0D;
      if (rdd > pi)
        rdd -= pi * 2.0D; 
      rdd = Math.abs(rdd);
      if (rdd < 0.5D)
        firecanoni(x, y, z); 
    } 
  }
  
  private void firecanon(double x, double y, double z) {
    double yoff = 3.5D;
    double xzoff = 6.0D;
    BetterFireball bf = null;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, x - cx + r1, y + 0.25D - this.posY + yoff + r2, z - cz + r3);
    bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
    bf.setPosition(cx, this.posY + yoff, cz);
    bf.setBig();
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    this.worldObj.spawnEntityInWorld((Entity)bf);
  }
  
  private void firecanonl(double x, double y, double z) {
    double yoff = 3.5D;
    double xzoff = 6.0D;
    double var3 = 0.0D;
    double var5 = 0.0D;
    double var7 = 0.0D;
    float var9 = 0.0F;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    ThunderBolt lb = new ThunderBolt(this.worldObj, cx, this.posY + yoff, cz);
    lb.setLocationAndAngles(cx, this.posY + yoff, cz, 0.0F, 0.0F);
    var3 = x - lb.posX;
    var5 = y + 0.25D - lb.posY;
    var7 = z - lb.posZ;
    var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
    lb.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 4.0F);
    lb.motionX *= 3.0D;
    lb.motionY *= 3.0D;
    lb.motionZ *= 3.0D;
    this.worldObj.spawnEntityInWorld((Entity)lb);
  }
  
  private void firecanoni(double x, double y, double z) {
    double yoff = 3.5D;
    double xzoff = 6.0D;
    double var3 = 0.0D;
    double var5 = 0.0D;
    double var7 = 0.0D;
    float var9 = 0.0F;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    IceBall lb = new IceBall(this.worldObj, cx, this.posY + yoff, cz);
    lb.setIceMaker(1);
    lb.setLocationAndAngles(cx, this.posY + yoff, cz, 0.0F, 0.0F);
    var3 = x - lb.posX;
    var5 = y + 0.25D - lb.posY;
    var7 = z - lb.posZ;
    var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
    lb.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 4.0F);
    lb.motionX *= 3.0D;
    lb.motionY *= 3.0D;
    lb.motionZ *= 3.0D;
    this.worldObj.spawnEntityInWorld((Entity)lb);
  }
}
