package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Cephadrome extends EntityCreature {
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private double boatYawHead;
  
  private int damage_counter = 100;
  
  private int updateit = 1;
  
  private int color = 1;
  
  private int playing = 0;
  
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int hurt_timer = 0;
  
  private int wasfed;
  
  private int shouldattack = 0;
  
  private int wing_sound = 0;
  
  private int hit_by_player = 0;
  
  private int badmood = 0;
  
  private float moveSpeed = 0.25F;
  
  public Cephadrome(World par1World) {
    super(par1World);
    setSize(2.5F, 2.25F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 200;
    this.fireResistance = 100;
    this.isImmuneToFire = false;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot(this, 16, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 9.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget(this, false));
    this.riddenByEntity = null;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
  }
  
  public Cephadrome(World par1World, double par2, double par4, double par6) {
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
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(70.0D);
  }
  
  public boolean shouldRiderSit() {
    return true;
  }
  
  public int getTrackingRange() {
    return 128;
  }
  
  public int getUpdateFrequency() {
    return 10;
  }
  
  public boolean sendsVelocityUpdates() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Byte.valueOf((byte)0));
    setActivity(0);
    setAttacking(0);
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
    return 300;
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
    return 16;
  }
  
  protected void jump() {
    super.jump();
    this.motionY += 0.1D;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public String getLivingSound() {
    if (getActivity() != 1 && this.rand.nextInt(6) == 1)
      return "orespawn:MothraWings"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:alo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:alo_death";
  }
  
  protected float getSoundVolume() {
    return 1.5F;
  }
  
  public float getSoundPitch() {
    return 1.0F;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  public double getMountedYOffset() {
    return 2.5D;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int i = 4 + this.worldObj.rand.nextInt(6);
    int var4;
    for (var4 = 0; var4 < i; var4++)
      dropItemRand(OreSpawnMain.UraniumNugget, 1); 
    i = 4 + this.worldObj.rand.nextInt(6);
    for (var4 = 0; var4 < i; var4++)
      dropItemRand(OreSpawnMain.TitaniumNugget, 1); 
    i = 1 + this.worldObj.rand.nextInt(5);
    for (var4 = 0; var4 < i; var4++) {
      ItemStack is;
      int var3 = this.worldObj.rand.nextInt(20);
      switch (var3) {
        case 0:
          is = dropItemRand(OreSpawnMain.MyRubySword, 1);
          break;
        case 1:
          is = dropItemRand(Items.diamond, 1);
          break;
        case 2:
          is = dropItemRand(OreSpawnMain.MyThunderStaff, 1);
          break;
        case 3:
          is = dropItemRand(OreSpawnMain.MyRubySword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 4:
          is = dropItemRand(OreSpawnMain.MyRubyShovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 5:
          is = dropItemRand(OreSpawnMain.MyRubyPickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 6:
          is = dropItemRand(OreSpawnMain.MyRubyAxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 7:
          is = dropItemRand(OreSpawnMain.MyRubyHoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 8:
          is = dropItemRand((Item)OreSpawnMain.RubyHelmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(2)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 9:
          is = dropItemRand((Item)OreSpawnMain.RubyBody, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 10:
          is = dropItemRand((Item)OreSpawnMain.RubyLegs, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 11:
          is = dropItemRand((Item)OreSpawnMain.RubyBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
          is = dropItemRand(OreSpawnMain.MyRuby, 1);
          break;
      } 
    } 
  }
  
  public int getCephadromeHealth() {
    return (int)getHealth();
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    double ks = 2.5D;
    double inair = 0.35D;
    float iskraken = 1.0F;
    boolean ret = false;
    if (par1Entity != null && par1Entity instanceof EntityDragon) {
      EntityDragon dr = (EntityDragon)par1Entity;
      DamageSource var21 = null;
      var21 = DamageSource.setExplosionSource(null);
      var21.setExplosion();
      if (this.worldObj.rand.nextInt(6) == 1) {
        dr.attackEntityFromPart(dr.dragonPartHead, var21, 70.0F);
      } else {
        dr.attackEntityFromPart(dr.dragonPartBody, var21, 70.0F);
      } 
      ret = true;
    } else if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      if (par1Entity instanceof Kraken)
        iskraken = 1.5F; 
      ret = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), iskraken * 70.0F);
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
    } 
    return ret;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.hurt_timer > 0)
      return false; 
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 25;
      Entity e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLivingBase) {
        setAttackTarget((EntityLivingBase)e);
        setTarget(e);
        getNavigator().tryMoveToEntityLiving(e, 1.2D);
        ret = true;
      } 
      if (e != null && e instanceof EntityPlayer && getHealth() < getMaxHealth() * 9.0F / 10.0F)
        this.hit_by_player = 1; 
    } 
    return ret;
  }
  
  public double getHorizontalDistanceSqToEntity(Entity par1Entity) {
    double d0 = this.posX - par1Entity.posX;
    double d2 = this.posZ - par1Entity.posZ;
    return d0 * d0 + d2 * d2;
  }
  
  public void updateAITasks() {
    EntityLivingBase e = null;
    double maxdist = 10.0D;
    if (this.isDead)
      return; 
    if (this.updateit > 0)
      this.updateit--; 
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.updateit <= 0 && !this.worldObj.isRemote) {
      this.updateit = 30;
      if (this.riddenByEntity != null) {
        setActivity(1);
      } else {
        setActivity(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(100) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(2.0F); 
    if (getActivity() == 0)
      super.updateAITasks(); 
    if (this.worldObj.rand.nextInt(7) == 1 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        if (getActivity() == 0) {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.7D);
          maxdist = 6.0D;
        } 
        faceEntity((Entity)e, 10.0F, 10.0F);
        setAttacking(1);
        if (getDistanceSqToEntity((Entity)e) < (maxdist + (e.width / 2.0F)) * (maxdist + (e.width / 2.0F))) {
          attackEntityAsMob((Entity)e);
        } else if (e instanceof Kraken && getHorizontalDistanceSqToEntity((Entity)e) < (maxdist + (e.width / 2.0F)) * (maxdist + (e.width / 2.0F))) {
          attackEntityAsMob((Entity)e);
        } 
      } else if (getAttacking() != 0) {
        setAttacking(0);
      } 
    } 
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
    if (par1EntityLiving instanceof Cephadrome)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    if (par1EntityLiving instanceof Mothra)
      return true; 
    if (par1EntityLiving instanceof Leon) {
      EntityTameable et = (EntityTameable)par1EntityLiving;
      if (et.isTamed())
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof GammaMetroid) {
      EntityTameable et = (EntityTameable)par1EntityLiving;
      if (et.isTamed())
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof WaterDragon) {
      EntityTameable et = (EntityTameable)par1EntityLiving;
      if (et.isTamed())
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof EntityDragon)
      return true; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      if (this.hit_by_player != 0)
        return true; 
      if (this.badmood != 0)
        return true; 
      if (this.shouldattack > 0) {
        this.shouldattack = 0;
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0D, 20.0D, 16.0D));
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
  
  public boolean getCanSpawnHere() {
    int k;
    for (k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Cephadrome")) {
              this.badmood = 1;
              return true;
            } 
          } 
        } 
      } 
    } 
    if ((!this.worldObj.isDaytime() ? true : false) == true)
      return false; 
    if (this.posY < 50.0D)
      return false; 
    for (k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 1; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    Cephadrome target = null;
    target = (Cephadrome)this.worldObj.findNearestEntityWithinAABB(Cephadrome.class, this.boundingBox.expand(16.0D, 6.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
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
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (getActivity() == 1) {
      this.wing_sound++;
      if (this.wing_sound > 22) {
        if (!this.worldObj.isRemote)
          this.worldObj.playSoundAtEntity((Entity)this, "orespawn:MothraWings", 0.5F, 1.0F); 
        this.wing_sound = 0;
      } 
    } 
    if (OreSpawnMain.PlayNicely == 0)
      this.wasfed = 1; 
  }
  
  public void onLivingUpdate() {
    List<Entity> list = null;
    Entity listEntity = null;
    double d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
    double d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
    double obstruction_factor = 0.0D;
    double relative_g = 0.0D;
    double max_speed = 1.15D;
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
        this.boatPosRotationIncrements--;
      } 
    } else if (getActivity() != 0) {
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
        gh = 1.55D;
        Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
        if (bid != Blocks.air) {
          this.motionY += 0.07D;
          this.posY += 0.1D;
        } else {
          this.motionY -= 0.018D;
        } 
        obstruction_factor = 0.0D;
        dist = 2;
        dist += (int)(velocity * 6.0D);
        for (int k = 1; k < dist; k++) {
          for (int i = 1; i < dist * 2; i++) {
            double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
            double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
            bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
            if (bid != Blocks.air)
              obstruction_factor += 0.04D; 
          } 
        } 
        this.motionY += obstruction_factor * 0.09D;
        this.posY += obstruction_factor * 0.09D;
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
        if (velocity > 0.1D) {
          d4 = 1.5D - velocity;
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
        if (this.motionY > 0.0D) {
          this.rotationPitch = 360.0F - 2.0F * (float)velocity;
        } else {
          this.rotationPitch = 2.0F * (float)velocity;
        } 
        setRotation(this.rotationYaw, this.rotationPitch);
        double newvelocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        double rr = Math.atan2(this.riddenByEntity.motionZ, this.riddenByEntity.motionX);
        double rhm = Math.atan2(this.motionZ, this.motionX);
        double rhdir = Math.toRadians(((this.riddenByEntity.rotationYaw + 90.0F) % 360.0F));
        rt = 0.0D;
        pi = 3.1415926545D;
        deltav = 0.0D;
        double im = pp.moveForward;
        if (OreSpawnMain.flyup_keystate != 0) {
          this.motionY += 0.04D;
          this.motionY += velocity * 0.05D;
        } 
        double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
        if (rdv > pi)
          rdv -= pi * 2.0D; 
        rdv = Math.abs(rdv);
        if (Math.abs(newvelocity) < 0.01D)
          rdv = 0.0D; 
        if (rdv > 1.5D)
          newvelocity = -newvelocity; 
        if (Math.abs(im) > 0.0010000000474974513D) {
          if (im > 0.0D) {
            deltav = 0.03D;
            if (max_speed > 0.85D)
              deltav += 0.05D; 
          } else {
            max_speed = 0.35D;
            deltav = -0.03D;
          } 
          newvelocity += deltav;
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
      } 
      moveEntity(this.motionX, this.motionY, this.motionZ);
      this.motionX *= 0.985D;
      this.motionY *= 0.94D;
      this.motionZ *= 0.985D;
      if (!this.worldObj.isRemote) {
        list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand(2.25D, 2.0D, 2.25D));
        if (list != null && !list.isEmpty())
          for (int l = 0; l < list.size(); l++) {
            listEntity = list.get(l);
            if (listEntity != this.riddenByEntity && !listEntity.isDead && listEntity.canBePushed())
              listEntity.applyEntityCollision((Entity)this); 
          }  
      } 
      if (this.riddenByEntity != null && this.riddenByEntity.isDead)
        this.riddenByEntity = null; 
    } 
    if (getActivity() == 1)
      updateAITasks(); 
  }
  
  public void updateRiderPosition() {
    if (this.riddenByEntity != null) {
      float f = 0.75F;
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
    if (var2 != null && (var2.getItem() == Items.beef || var2.getItem() == Items.chicken || var2.getItem() == Items.porkchop) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
      if (!this.worldObj.isRemote)
        heal(mygetMaxHealth() - getHealth()); 
      this.wasfed = 1;
      this.shouldattack = 0;
      playTameEffect(true);
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0) {
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
          var2 = null;
        } 
      } 
    } else {
      if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer)
        return true; 
      if (var2 == null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D)
        if (!this.worldObj.isRemote) {
          if (this.wasfed == 0) {
            getNavigator().tryMoveToEntityLiving((Entity)par1EntityPlayer, 1.2D);
            this.shouldattack = 1;
            return false;
          } 
          par1EntityPlayer.mountEntity((Entity)this);
          this.wasfed = 0;
        }  
      return true;
    } 
    return false;
  }
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setAttacking(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public int getActivity() {
    return this.dataWatcher.getWatchableObjectByte(21);
  }
  
  public void setActivity(int par1) {
    if (this.worldObj != null && this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(21, Byte.valueOf((byte)par1));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.riddenByEntity != null)
      return false; 
    return true;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("CephaWasFed", this.wasfed);
    par1NBTTagCompound.setInteger("CephaAttacking", getAttacking());
    par1NBTTagCompound.setInteger("CephaActivity", getActivity());
    par1NBTTagCompound.setInteger("CephaHitByPlayer", this.hit_by_player);
    par1NBTTagCompound.setInteger("CephaBadMood", this.badmood);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.wasfed = par1NBTTagCompound.getInteger("CephaWasFed");
    this.hit_by_player = par1NBTTagCompound.getInteger("CephaHitByPlayer");
    this.badmood = par1NBTTagCompound.getInteger("CephaBadMood");
    setAttacking(par1NBTTagCompound.getInteger("CephaAttacking"));
    setActivity(par1NBTTagCompound.getInteger("CephaActivity"));
  }
}
