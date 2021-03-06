package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Robot4 extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int reload_ticker = 0;
  
  private int was_attacked_ticker = 0;
  
  private float moveSpeed = 0.34F;
  
  public Robot4(World par1World) {
    super(par1World);
    setSize(2.5F, 4.0F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 120;
    this.fireResistance = 120;
    this.isImmuneToFire = true;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Robot4_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Byte.valueOf((byte)0));
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
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Robot4_stats.health;
  }
  
  public int getRobot4Health() {
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
    return OreSpawnMain.Robot4_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void jump() {
    this.motionY += 0.25D;
    super.jump();
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (this.worldObj.isRemote) {
      if (this.rand.nextInt(3) == 1)
        this.worldObj.spawnParticle("smoke", this.posX - 1.25D * Math.sin(Math.toRadians((this.rotationYaw + 180.0F))), this.posY + 3.0D + this.worldObj.rand.nextFloat(), this.posZ + 1.25D * Math.cos(Math.toRadians((this.rotationYaw + 180.0F))), 0.0D, this.worldObj.rand.nextFloat() / 2.0D, 0.0D); 
      if (getAttacking() != 0)
        this.worldObj.spawnParticle("reddust", this.posX - 1.55D * Math.sin(Math.toRadians((this.rotationYaw + 35.0F))), this.posY + 2.25D + this.worldObj.rand.nextFloat(), this.posZ + 1.55D * Math.cos(Math.toRadians((this.rotationYaw + 35.0F))), 0.0D, this.worldObj.rand.nextFloat(), 0.0D); 
    } 
  }
  
  public int getAttackStrength(Entity par1Entity) {
    int var2 = 0;
    if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
      var2 = 15;
      if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
        var2 = 20;
      } else if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
        var2 = 25;
      } 
    } 
    return var2;
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(4) == 0)
      return "orespawn:robot_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:robot_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:robot_death";
  }
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.quartz;
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
    ItemStack is = null;
    int var5 = 5 + this.worldObj.rand.nextInt(10);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(OreSpawnMain.MyLaserBall, 4); 
    dropItemRand(OreSpawnMain.MyRayGun, 1);
    dropItemRand(Items.item_frame, 1);
    int i = 10 + this.worldObj.rand.nextInt(15);
    for (var4 = 0; var4 < i; var4++) {
      int var3 = this.worldObj.rand.nextInt(15);
      switch (var3) {
        case 0:
          is = dropItemRand(Items.redstone, 1);
          break;
        case 1:
          is = dropItemRand(Items.repeater, 1);
          break;
        case 2:
          is = dropItemRand(Items.comparator, 1);
          break;
        case 3:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 4:
          is = dropItemRand(Item.getItemFromBlock(Blocks.dispenser), 1);
          break;
        case 5:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.sticky_piston), 1);
          break;
        case 6:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.piston), 1);
          break;
        case 7:
          is = dropItemRand(Item.getItemFromBlock(Blocks.lever), 1);
          break;
        case 8:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 9:
          is = dropItemRand(Item.getItemFromBlock(Blocks.light_weighted_pressure_plate), 1);
          break;
      } 
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      double ks = 2.0D;
      double inair = 0.12D;
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
    } 
    return super.attackEntityAsMob(par1Entity);
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.reload_ticker > 0)
      this.reload_ticker--; 
    if (this.was_attacked_ticker > 0)
      this.was_attacked_ticker--; 
    if (this.reload_ticker == 0 && this.worldObj.rand.nextInt(8) == 1) {
      EntityLivingBase e = null;
      if (this.worldObj.rand.nextInt(50) == 1)
        setAttackTarget(null); 
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < 256.0D) {
          if (getDistanceSqToEntity((Entity)e) < ((3.0F + e.width / 2.0F) * (3.0F + e.width / 2.0F))) {
            attackEntityAsMob((Entity)e);
          } else {
            double rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
            double rhdir = Math.toRadians(((this.rotationYawHead + 90.0F) % 360.0F));
            double pi = 3.1415926545D;
            double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
            if (rdd > pi)
              rdd -= pi * 2.0D; 
            rdd = Math.abs(rdd);
            if (rdd < 0.5D) {
              double yoff = 2.0D;
              double xzoff = 1.75D;
              LaserBall var2 = new LaserBall(this.worldObj, e.posX - this.posX, e.posY - this.posY + yoff, e.posZ - this.posZ);
              var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians((this.rotationYaw + 45.0F))), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians((this.rotationYaw + 45.0F))), this.rotationYaw, this.rotationPitch);
              double var3 = e.posX - var2.posX;
              double var5 = e.posY - var2.posY;
              double var7 = e.posZ - var2.posZ;
              float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
              var2.setThrowableHeading(var3, var5 + var9, var7, 2.0F, 4.0F);
              if (getDistanceSqToEntity((Entity)e) > 65.0D) {
                var2.setSpecial();
                this.reload_ticker = 30;
                this.worldObj.playSoundAtEntity((Entity)this, "fireworks.launch", 3.5F, 0.5F);
              } else {
                this.reload_ticker = 10;
                this.worldObj.playSoundAtEntity((Entity)this, "fireworks.launch", 2.5F, 1.0F);
              } 
              this.worldObj.spawnEntityInWorld((Entity)var2);
            } 
            setAttacking(1);
          } 
          getNavigator().tryMoveToEntityLiving((Entity)e, 0.75D);
        } 
      } 
    } 
    if (this.reload_ticker <= 0 && this.was_attacked_ticker <= 0)
      setAttacking(0); 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      if (getShielding() != 0 || this.was_attacked_ticker != 0)
        return false; 
      this.was_attacked_ticker = 65;
      setAttacking(1);
      ret = super.attackEntityFrom(par1DamageSource, par2);
      Entity e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLiving) {
        setAttackTarget((EntityLivingBase)e);
        setTarget(e);
        getNavigator().tryMoveToEntityLiving(e, 1.2D);
        ret = true;
      } 
      return ret;
    } 
    return false;
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityMob)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
    } 
    return true;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0D, 4.0D, 16.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    while (var2.hasNext()) {
      Entity var3 = (Entity)var2.next();
      EntityLivingBase var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public final int getShielding() {
    return this.dataWatcher.getWatchableObjectByte(21);
  }
  
  public final void setShielding(int par1) {
    this.dataWatcher.updateObject(21, Byte.valueOf((byte)par1));
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
              s.equals("Robo-Warrior"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    for (k = -1; k < 1; k++) {
      for (int j = -1; j <= 1; j++) {
        for (int i = 1; i < 6; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air && bid != Blocks.tallgrass)
            return false; 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    return true;
  }
}
