package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class PurplePower extends EntityLiving {
  private ChunkCoordinates currentFlightTarget = null;
  
  private GenericTargetSorter TargetSorter = null;
  
  private int purple_type = 0;
  
  public PurplePower(World par1World) {
    super(par1World);
    setSize(0.75F, 0.75F);
    this.experienceValue = 35;
    this.isImmuneToFire = true;
    this.fireResistance = 25;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.noClip = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(500.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Integer.valueOf(0));
  }
  
  public void setPurpleType(int par1) {
    if (this.worldObj == null)
      return; 
    if (this.worldObj.isRemote)
      return; 
    this.purple_type = par1;
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
  }
  
  public int getPurpleType() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected float getSoundVolume() {
    return 0.75F;
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
    return false;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  public int mygetMaxHealth() {
    return 1000;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    EntityLivingBase e = null;
    super.onUpdate();
    this.motionY *= 0.6D;
    if (getPurpleType() == 0) {
      if (this.worldObj.isRemote && this.worldObj.rand.nextInt(4) == 1)
        this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY + 1.25D, this.posZ, ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 2.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 2.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 2.0F)); 
    } else if (this.worldObj.isRemote && this.worldObj.rand.nextInt(6) == 1) {
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY + 0.6499999761581421D, this.posZ, ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0F));
    } 
    if (this.worldObj.isRemote) {
      this.purple_type = getPurpleType();
    } else {
      setPurpleType(this.purple_type);
    } 
    if (!this.worldObj.isRemote && this.worldObj.rand.nextInt(2500) == 1) {
      if (getPurpleType() == 10)
        this.worldObj.newExplosion((Entity)null, this.posX, this.posY + 0.25D, this.posZ, 9.1F, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
      setDead();
    } 
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.55D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    EntityLivingBase e = null;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.rand.nextInt(300) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.rand.nextInt(10) + 8;
        xdir = this.rand.nextInt(10) + 8;
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(20) - 10, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } else if (this.rand.nextInt(7) == 2 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      e = findSomethingToAttack();
      if (e != null) {
        this.currentFlightTarget.set((int)e.posX, (int)(e.posY + (e.height / 2.0F)), (int)e.posZ);
        if (getDistanceSqToEntity((Entity)e) < ((4.0F + e.width / 2.0F) * (4.0F + e.width / 2.0F))) {
          attackEntityAsMob((Entity)e);
          setDead();
        } 
      } 
    } 
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      setDead(); 
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.4D - this.motionX) * 0.2D;
    this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.20000000149011612D;
    this.motionZ += (Math.signum(var5) * 0.4D - this.motionZ) * 0.2D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.75F;
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
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    Entity e = par1DamageSource.getEntity();
    float dm = par2;
    if (e != null && e instanceof net.minecraft.entity.projectile.EntityArrow)
      return false; 
    if (dm > 10.0F)
      dm = 10.0F; 
    ret = super.attackEntityFrom(par1DamageSource, dm);
    if (e != null && this.currentFlightTarget != null)
      this.currentFlightTarget.set((int)e.posX, (int)(e.posY + (e.height / 2.0F)), (int)e.posZ); 
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    return true;
  }
  
  public int getTotalArmorValue() {
    return 25;
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
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      if (getPurpleType() > 0 && getPurpleType() != 10)
        return false; 
      return true;
    } 
    if (getPurpleType() != 0 && getPurpleType() != 10 && 
      par1EntityLiving instanceof EntityTameable) {
      EntityTameable e = (EntityTameable)par1EntityLiving;
      if (e.isTamed())
        return false; 
    } 
    if (MyUtils.isRoyalty((Entity)par1EntityLiving))
      return false; 
    return true;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(32.0D, 24.0D, 32.0D));
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
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = false;
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      EntityLivingBase e = (EntityLivingBase)par1Entity;
      if (getPurpleType() == 0 || getPurpleType() == 10) {
        e.setHealth(e.getHealth() / 4.0F - 1.0F);
        var4 = e.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), e.getMaxHealth() / 8.0F);
        if (getPurpleType() == 10)
          this.worldObj.newExplosion((Entity)null, e.posX, e.posY - 0.25D, e.posZ, 9.1F, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
      } else {
        e.setHealth(e.getHealth() * 15.0F / 16.0F);
        var4 = e.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 5.0F);
        if (getPurpleType() == 1)
          e.setFire(10); 
        if (getPurpleType() == 2)
          e.addPotionEffect(new PotionEffect(Potion.poison.id, 50, 0)); 
        if (getPurpleType() == 3)
          e.addPotionEffect(new PotionEffect(Potion.weakness.id, 50, 0)); 
      } 
    } 
    return var4;
  }
  
  protected Item getDropItem() {
    return null;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("PurpleType", this.purple_type);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.purple_type = par1NBTTagCompound.getInteger("PurpleType");
  }
}
