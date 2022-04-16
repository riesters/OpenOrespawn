package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Bee extends EntityMob {
  private ChunkCoordinates currentFlightTarget = null;
  
  private GenericTargetSorter TargetSorter = null;
  
  private int stuck_count = 0;
  
  private int lastX = 0;
  
  private int lastZ = 0;
  
  private Entity rt = null;
  
  public Bee(World par1World) {
    super(par1World);
    setSize(1.5F, 2.5F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 25;
    this.isImmuneToFire = false;
    this.fireResistance = 5;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3199999928474426D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Bee_stats.attack);
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
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  protected float getSoundVolume() {
    return 0.25F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected String getLivingSound() {
    return "orespawn:Beebuzz";
  }
  
  protected String getHurtSound() {
    return "orespawn:dragonfly_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:alo_death";
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Bee_stats.health;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock((Block)Blocks.yellow_flower);
  }
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var4 = 2 + this.worldObj.rand.nextInt(10);
    int i;
    for (i = 0; i < var4; i++)
      dropItemRand(Items.gold_nugget, 1); 
    var4 = 2 + this.worldObj.rand.nextInt(10);
    for (i = 0; i < var4; i++)
      dropItemRand(OreSpawnMain.MyButterCandy, 1); 
    var4 = 2 + this.worldObj.rand.nextInt(10);
    for (i = 0; i < var4; i++)
      dropItemRand(Item.getItemFromBlock((Block)Blocks.yellow_flower), 1); 
    var4 = 2 + this.worldObj.rand.nextInt(10);
    for (i = 0; i < var4; i++)
      dropItemRand(Items.sugar, 1); 
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionY *= 0.6D;
    if (isInWater() && this.worldObj.rand.nextInt(4) == 1)
      attackEntityAsMob((Entity)this); 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.Bee_stats.attack);
    if (this.worldObj.rand.nextInt(3) == 1 && par1Entity != null)
      ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 50, 0)); 
    return var4;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.lastX == (int)this.posX && this.lastZ == (int)this.posZ) {
      this.stuck_count++;
    } else {
      this.stuck_count = 0;
      this.lastX = (int)this.posX;
      this.lastZ = (int)this.posZ;
    } 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.stuck_count > 50 || this.rand.nextInt(300) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F) {
      Block bid = Blocks.stone;
      this.stuck_count = 0;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.rand.nextInt(9) + 4;
        xdir = this.rand.nextInt(9) + 4;
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(6) - 3, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } else if (this.rand.nextInt(15) == 0) {
      EntityLivingBase e = null;
      e = (EntityLivingBase)this.rt;
      if (e != null && 
        e.isDead)
        e = null; 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        setAttacking(1);
        this.currentFlightTarget.set((int)e.posX, (int)e.posY + 1, (int)e.posZ);
        if (getDistanceSqToEntity((Entity)e) < 16.0D)
          attackEntityAsMob((Entity)e); 
      } else {
        setAttacking(0);
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.30000000149011613D;
    this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.20000000149011612D;
    this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.30000000149011613D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 1.0F;
    this.rotationYaw += var8 / 4.0F;
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = super.attackEntityFrom(par1DamageSource, par2);
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null) {
      this.rt = e;
      this.currentFlightTarget.set((int)e.posX, (int)e.posY, (int)e.posZ);
    } 
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4)
      return true; 
    int k;
    for (k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Bee"))
              return true; 
          } 
        } 
      } 
    } 
    for (k = -1; k < 2; k++) {
      for (int j = -1; j < 2; j++) {
        for (int i = 1; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Bee_stats.defense;
  }
  
  public void initCreature() {}
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving.isInWater())
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
      return true; 
    if (par1EntityLiving instanceof Girlfriend)
      return true; 
    if (par1EntityLiving instanceof Boyfriend)
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 6.0D, 10.0D));
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
}
