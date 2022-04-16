package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Ostrich extends EntityCannonFodder {
  private float moveSpeed = 0.2F;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private double boatYawHead;
  
  private double velocityX;
  
  private double velocityY;
  
  private double velocityZ;
  
  float deltasmooth = 0.0F;
  
  private int didjump = 0;
  
  public Ostrich(World par1World) {
    super(par1World);
    setSize(0.85F, 2.1F);
    this.moveSpeed = 0.38F;
    this.fireResistance = 100;
    getNavigator().setAvoidsWater(true);
    setSitting(false);
    this.experienceValue = 10;
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F));
    this.tasks.addTask(3, new MyEntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.899999976158142D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.apple, false));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 5.0F));
    this.tasks.addTask(8, new MyEntityAIWander((EntityCreature)this, 1.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    setSitting(false);
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
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    if (!par1DamageSource.getDamageType().equals("cactus"))
      super.attackEntityFrom(par1DamageSource, par2); 
    return false;
  }
  
  protected void updateAITick() {
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.rand.nextInt(250) == 0)
      heal(1.0F); 
    if (this.riddenByEntity != null)
      return; 
    super.updateAITick();
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return false;
  }
  
  public int mygetMaxHealth() {
    return 25;
  }
  
  public int getOstrichHealth() {
    return (int)getHealth();
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (super.interact(par1EntityPlayer))
      return true; 
    if (var2 != null && var2.getItem() == Items.apple && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.rand.nextInt(2) == 0) {
            setTamed(true);
            func_152115_b(par1EntityPlayer.getUniqueID().toString());
            playTameEffect(true);
            this.worldObj.setEntityState((Entity)this, (byte)7);
            heal(mygetMaxHealth() - getHealth());
          } else {
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)6);
          }  
      } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
        if (this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (mygetMaxHealth() > getHealth())
          heal(mygetMaxHealth() - getHealth()); 
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        setTamed(false);
        func_152115_b("");
        playTameEffect(false);
        this.worldObj.setEntityState((Entity)this, (byte)6);
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (var2 != null && isTamed() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!this.worldObj.isRemote)
        if (!isSitting()) {
          Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ);
          if (bid == Blocks.sand || bid == Blocks.gravel || bid == Blocks.dirt || bid == Blocks.farmland || bid == Blocks.grass)
            setSitting(true); 
        } else {
          setSitting(false);
        }  
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      setCustomNameTag(var2.getDisplayName());
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (var2 == null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!this.worldObj.isRemote) {
        par1EntityPlayer.mountEntity((Entity)this);
        setSitting(false);
      } 
      return true;
    } 
    return false;
  }
  
  protected String getLivingSound() {
    if (isSitting())
      return null; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:cryo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:cryo_death";
  }
  
  protected float getSoundVolume() {
    return 0.4F;
  }
  
  protected Item getDropItem() {
    return Items.feather;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.rand.nextInt(5);
      var3 += 2;
      for (int var4 = 0; var4 < var3; var4++)
        dropItem(Item.getItemFromBlock((Block)Blocks.red_flower), 1); 
    } else {
      super.dropFewItems(par1, par2);
    } 
  }
  
  protected float getSoundPitch() {
    return isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.5F) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.0F);
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
  
  protected void jump() {
    this.motionY += 0.25D;
    super.jump();
  }
  
  public double getMountedYOffset() {
    return 1.4D;
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.rand.nextInt(4) != 1)
      return false; 
    Ostrich target = null;
    target = (Ostrich)this.worldObj.findNearestEntityWithinAABB(Ostrich.class, this.boundingBox.expand(16.0D, 6.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
    this.boatPosRotationIncrements = 10;
    this.boatX = par1;
    this.boatY = par3;
    this.boatZ = par5;
    this.boatYaw = par7;
    this.boatPitch = par8;
    this.boatYawHead = par9;
    this.motionX = this.velocityX;
    this.motionY = this.velocityY;
    this.motionZ = this.velocityZ;
  }
  
  @SideOnly(Side.CLIENT)
  public void setVelocity(double par1, double par3, double par5) {
    this.velocityX = this.motionX = par1;
    this.velocityY = this.motionY = par3;
    this.velocityZ = this.motionZ = par5;
  }
  
  public void onLivingUpdate() {
    List list = null;
    Entity listEntity = null;
    double d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
    double d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
    double obstruction_factor = 0.0D;
    double relative_g = 0.0D;
    double max_speed = 0.75D;
    double gh = 1.0D;
    double rt = 0.0D;
    double pi = 3.1415926545D;
    double deltav = 0.0D;
    int dist = 2;
    if (this.riddenByEntity == null && !this.worldObj.isRemote) {
      super.onLivingUpdate();
      return;
    } 
    if (this.isDead)
      return; 
    if (this.riddenByEntity == null) {
      float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
      float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
      this.rotationYaw += var8 / 5.0F;
    } 
    if (this.worldObj.isRemote) {
      if (this.boatPosRotationIncrements > 0) {
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
    } else if (this.riddenByEntity != null) {
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
      obstruction_factor = 0.0D;
      dist = 1 + (int)(velocity * 10.0D);
      for (int k = 0; k < dist; k++) {
        for (int i = 1; i < dist * 2; i++) {
          double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
          double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
          Block bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - 1 + k, (int)(this.posZ + dz));
          if (bid != Blocks.air)
            obstruction_factor += 0.075D; 
        } 
      } 
      this.motionY += obstruction_factor;
      this.posY += obstruction_factor;
      if (this.motionY > 4.0D)
        this.motionY = 4.0D; 
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
        if (this.didjump == 0) {
          this.motionY++;
          this.motionY += velocity * 6.0D;
          this.didjump = 20;
        } 
      } else if (this.didjump > 0) {
        this.didjump--;
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
          deltav = 0.045D;
          if (this.deltasmooth < 0.0F)
            this.deltasmooth = 0.0F; 
          this.deltasmooth = (float)(this.deltasmooth + deltav / 10.0D);
          if (this.deltasmooth > deltav)
            this.deltasmooth = (float)deltav; 
        } else {
          max_speed = 0.25D;
          deltav = -0.03D;
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
      moveEntity(this.motionX, this.motionY, this.motionZ);
      this.motionY -= 0.25D;
      this.motionX *= 0.95D;
      this.motionY *= 0.85D;
      this.motionZ *= 0.95D;
      if (this.riddenByEntity != null && this.riddenByEntity.isDead)
        this.riddenByEntity = null; 
    } 
  }
  
  public void updateRiderPosition() {
    if (this.riddenByEntity != null) {
      float f = -0.15F;
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
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected boolean canDespawn() {
    if (isChild()) {
      func_110163_bv();
      return false;
    } 
    if (this.riddenByEntity != null)
      return false; 
    if (isNoDespawnRequired())
      return false; 
    if (isTamed())
      return false; 
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public Ostrich spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new Ostrich(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.apple);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
