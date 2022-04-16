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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Skate extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private EntityLivingBase buddy = null;
  
  private float moveSpeed = 0.25F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Skate(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(0.75F, 0.25F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 10;
    this.fireResistance = 3;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWander((EntityCreature)this, 1.0F));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Skate_stats.attack);
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
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Skate_stats.health;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Skate_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public int getAttackStrength(Entity par1Entity) {
    int var2 = 4;
    return var2;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return "orespawn:ratdead";
  }
  
  protected float getSoundVolume() {
    return 0.33F;
  }
  
  protected float getSoundPitch() {
    return 1.75F;
  }
  
  protected Item getDropItem() {
    return Items.string;
  }
  
  public void initCreature() {}
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.isDead)
      return false; 
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof Skate)
      return false; 
    if (e != null && e instanceof EntityLiving) {
      if (e instanceof Skate)
        return false; 
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
      ret = true;
    } 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    return ret;
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dx * dx + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + dx;
            this.ty = y + i;
            this.tz = z + j;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x - dx, y + i, z + j);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dx * dx + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x - dx;
            this.ty = y + i;
            this.tz = z + j;
            found++;
          } 
        } 
      } 
    } 
    for (i = -dx; i <= dx; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + i, y + dy, z + j);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dy * dy + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + dy;
            this.tz = z + j;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x + i, y - dy, z + j);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dy * dy + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y - dy;
            this.tz = z + j;
            found++;
          } 
        } 
      } 
    } 
    for (i = -dx; i <= dx; i++) {
      for (int j = -dy; j <= dy; j++) {
        Block bid = this.worldObj.getBlock(x + i, y + j, z + dz);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dz * dz + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + j;
            this.tz = z + dz;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x + i, y + j, z - dz);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
          int d = dz * dz + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + j;
            this.tz = z - dz;
            found++;
          } 
        } 
      } 
    } 
    if (found != 0)
      return true; 
    return false;
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (!isInWater() && this.worldObj.rand.nextInt(10) == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 12; i++) {
        int j = i;
        if (j > 5)
          j = 5; 
        if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.33D);
      } else {
        if (this.worldObj.rand.nextInt(25) == 1)
          heal(-1.0F); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(8) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        if (getDistanceSqToEntity((Entity)e) < 4.0D) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
        } 
      } else {
        setAttacking(0);
      } 
    } 
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 4.0D, 10.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    EntityLivingBase e = getAttackTarget();
    if (e != null && e.isEntityAlive())
      return e; 
    setAttackTarget(null);
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
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
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Skate.class, this.boundingBox.expand(16.0D, 8.0D, 16.0D));
    return var5.size();
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.rand.nextInt(30) != 1)
      return false; 
    if (findBuddies() > 6)
      return false; 
    return true;
  }
}
