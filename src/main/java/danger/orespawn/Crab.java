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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Crab extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.55F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Crab(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    this.moveSpeed = 0.55F;
    setSize(1.25F, 2.5F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 150;
    this.fireResistance = 30;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((this.moveSpeed * getCrabScale()));
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((OreSpawnMain.Crab_stats.attack * getCrabScale()));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Integer.valueOf(0));
    float t = 0.25F;
    if (this.worldObj != null) {
      if (this.worldObj.rand.nextInt(4) == 1)
        t = 0.5F; 
      if (this.worldObj.rand.nextInt(8) == 2)
        t = 1.0F; 
    } else {
      if (OreSpawnMain.OreSpawnRand.nextInt(4) == 1)
        t = 0.5F; 
      if (OreSpawnMain.OreSpawnRand.nextInt(8) == 2)
        t = 1.0F; 
    } 
    setCrabScale(t);
    this.experienceValue = (int)(400.0F * t);
    this.fireResistance = (int)(10.0F * t);
    setSize(3.75F * getCrabScale(), 3.5F * getCrabScale());
  }
  
  public float getCrabScale() {
    int i = this.dataWatcher.getWatchableObjectInt(21);
    float f = i;
    return f / 100.0F;
  }
  
  public void setCrabScale(float par1) {
    float f = par1 * 100.0F;
    int i = (int)f;
    this.dataWatcher.updateObject(21, Integer.valueOf(i));
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    setCrabScale(par1NBTTagCompound.getFloat("Fscale"));
    setSize(3.75F * getCrabScale(), 3.5F * getCrabScale());
    this.experienceValue = (int)(400.0F * getCrabScale());
    this.fireResistance = (int)(10.0F * getCrabScale());
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setFloat("Fscale", getCrabScale());
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    if (isInWater()) {
      this.moveSpeed = 0.95F;
    } else {
      this.moveSpeed = 0.55F;
    } 
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((this.moveSpeed * getCrabScale()));
    super.onUpdate();
    setSize(2.5F * getCrabScale(), 3.5F * getCrabScale());
  }
  
  public int mygetMaxHealth() {
    return (int)(OreSpawnMain.PitchBlack_stats.health * getCrabScale());
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Crab_stats.defense + (int)(2.0F * getCrabScale());
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public int getCrabHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:leaves_hit";
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 2.0F - 0.3F * 1.0F / getCrabScale();
  }
  
  protected Item getDropItem() {
    return Items.fish;
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
    int var5 = 4 + this.worldObj.rand.nextInt(8);
    var5 = (int)(var5 * getCrabScale());
    if (var5 < 1)
      var5 = 1; 
    for (int var4 = 0; var4 < var5; var4++)
      dropItemRand(OreSpawnMain.MyRawCrabMeat, 1); 
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.Crab_stats.attack * getCrabScale());
    if (var4 && par1Entity != null && par1Entity instanceof EntityLivingBase) {
      double ks = 1.15D * getCrabScale();
      double inair = 0.48D * getCrabScale();
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
    } 
    return var4;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("cactus"))
      return false; 
    Entity e = par1DamageSource.getEntity();
    if (this.hurt_timer <= 0) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 8;
    } 
    if (e != null && e instanceof EntityLiving) {
      if (e instanceof Crab)
        return false; 
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
    } 
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
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (!isInWater() && this.worldObj.rand.nextInt(25) == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 12; i++) {
        int j = i;
        if (j > 10)
          j = 10; 
        if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.33D);
      } else {
        if (this.worldObj.rand.nextInt(100) == 1)
          heal(-1.0F * getCrabScale()); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(5) == 1) {
      EntityLivingBase e = null;
      if (this.worldObj.rand.nextInt(100) == 1)
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
        if (getDistanceSqToEntity((Entity)e) < ((6.0F + e.width / 2.0F) * (6.0F + e.width / 2.0F) * getCrabScale())) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1) {
            attackEntityAsMob((Entity)e);
            if (!this.worldObj.isRemote)
              if (this.worldObj.rand.nextInt(3) == 1) {
                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_attack", 0.75F, 1.5F);
              } else {
                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_living", 0.75F, 1.5F);
              }  
          } 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(120) == 1 && isInWater() && 
      getHealth() < mygetMaxHealth()) {
      playSound("splash", 1.5F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
      heal(4.0F * getCrabScale());
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
    if (par1EntityLiving instanceof Crab)
      return false; 
    if (par1EntityLiving instanceof EntityMob)
      return true; 
    if (par1EntityLiving instanceof Lizard)
      return true; 
    if (par1EntityLiving instanceof RubberDucky)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
      return true; 
    if (par1EntityLiving instanceof Girlfriend)
      return true; 
    if (par1EntityLiving instanceof Boyfriend)
      return true; 
    if (MyUtils.isAttackableNonMob(par1EntityLiving))
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0D, 6.0D, 16.0D));
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
    List var5 = this.worldObj.getEntitiesWithinAABB(Crab.class, this.boundingBox.expand(24.0D, 8.0D, 24.0D));
    return var5.size();
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Crab")) {
              setCrabScale(0.35F);
              return true;
            } 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID5) {
      if (this.worldObj.rand.nextInt(40) != 1)
        return false; 
      if (findBuddies() > 3)
        return false; 
    } 
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
}
