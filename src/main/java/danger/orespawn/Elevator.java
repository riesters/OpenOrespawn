package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Elevator extends EntityLiving {
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private double velocityX;
  
  private double velocityY;
  
  private double velocityZ;
  
  private int damage_counter = 100;
  
  private int exploding = 0;
  
  private int color = 1;
  
  private int playing = 0;
  
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "Elevator1.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Elevator2.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Elevator3.png");
  
  private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "Elevator4.png");
  
  private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "Elevator5.png");
  
  private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "Elevator6.png");
  
  private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "Elevator7.png");
  
  private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "Elevator8.png");
  
  private static final ResourceLocation texture9 = new ResourceLocation("orespawn", "Elevator9.png");
  
  private static final ResourceLocation texture10 = new ResourceLocation("orespawn", "Elevator10.png");
  
  public Elevator(World par1World) {
    super(par1World);
    setSize(1.25F, 1.0F);
    this.riddenByEntity = null;
  }
  
  public Elevator(World par1World, double par2, double par4, double par6) {
    this(par1World);
    setPosition(par2, par4 + this.yOffset, par6);
    this.motionX = 0.0D;
    this.motionY = 0.0D;
    this.motionZ = 0.0D;
    this.prevPosX = par2;
    this.prevPosY = par4;
    this.prevPosZ = par6;
  }
  
  public ResourceLocation getTexture() {
    switch (getColor()) {
      case 1:
        return texture1;
      case 2:
        return texture2;
      case 3:
        return texture3;
      case 4:
        return texture4;
      case 5:
        return texture5;
      case 6:
        return texture6;
      case 7:
        return texture7;
      case 8:
        return texture8;
      case 9:
        return texture9;
      case 10:
        return texture10;
    } 
    return texture1;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.3300000429153442D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public boolean shouldRiderSit() {
    return false;
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
    return false;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(22, new Integer(0));
    this.dataWatcher.addObject(23, new Integer(1));
    this.dataWatcher.addObject(24, new Float(0.0F));
    this.dataWatcher.addObject(20, new Integer(0));
    this.dataWatcher.addObject(21, new Integer(0));
    func_110163_bv();
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  public double getMountedYOffset() {
    return 0.5D;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean p = par1DamageSource.getEntity() instanceof EntityPlayer;
    if (this.riddenByEntity != null && !p)
      return false; 
    if (par1DamageSource.getDamageType().equals("inWall"))
      return false; 
    if (!this.worldObj.isRemote && !this.isDead) {
      setForwardDirection(-getForwardDirection());
      setTimeSinceHit(10);
      setDamageTaken(getDamageTaken() + par2 * 10.0F);
      setBeenAttacked();
      boolean flag = (par1DamageSource.getEntity() instanceof EntityPlayer && ((EntityPlayer)par1DamageSource.getEntity()).capabilities.isCreativeMode);
      if (flag || getDamageTaken() > 40.0F) {
        if (this.riddenByEntity != null)
          this.riddenByEntity.mountEntity((Entity)this); 
        if (!flag)
          dropItem(OreSpawnMain.MyElevator, 1); 
        setDead();
      } 
      return true;
    } 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void performHurtAnimation() {
    setForwardDirection(-getForwardDirection());
    setTimeSinceHit(10);
    setDamageTaken(getDamageTaken() * 11.0F);
  }
  
  public boolean canBeCollidedWith() {
    return !this.isDead;
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
    if (this.riddenByEntity != null) {
      this.boatPosRotationIncrements = par9 + 8;
    } else {
      this.boatPosRotationIncrements = 6;
    } 
    this.boatX = par1;
    this.boatY = par3;
    this.boatZ = par5;
    this.boatYaw = par7;
    this.boatPitch = par8;
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
  
  public void onLivingpdate() {
    if (this.riddenByEntity == null)
      onLivingUpdate(); 
    setFire(0);
  }
  
  public void onUpdate() {
    List<Entity> list = null;
    double velocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    double d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
    double d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
    double obstruction_factor = 0.0D;
    double relative_g = 0.0D;
    double max_speed = 0.85D;
    double gh = 0.75D;
    int dist = 2;
    if (this.isDead)
      return; 
    this.isAirBorne = true;
    if (getTimeSinceHit() > 0)
      setTimeSinceHit(getTimeSinceHit() - 1); 
    if (getDamageTaken() > 0.0F)
      setDamageTaken(getDamageTaken() - 1.0F); 
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    if (velocity > 0.15D && this.riddenByEntity != null) {
      double d4 = Math.cos(Math.toRadians((this.rotationYaw + 270.0F)));
      double d5 = Math.sin(Math.toRadians((this.rotationYaw + 270.0F)));
      Block bid = Blocks.air;
      int i;
      for (i = 1; i < 10; i++) {
        bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - i, (int)this.posZ);
        if (bid != Blocks.air)
          break; 
      } 
      for (int j = 0; j < 1.0D + velocity * 10.0D; j++) {
        d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
        d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
        if (this.rand.nextBoolean()) {
          double d8 = this.posX - d4 * d6 * 0.8D + d5 * d7;
          double d9 = this.posZ - d5 * d6 * 0.8D - d4 * d7;
          if (this.rand.nextBoolean()) {
            this.worldObj.spawnParticle("smoke", d8, this.posY - 0.25D, d9, this.motionX, this.motionY, this.motionZ);
          } else {
            this.worldObj.spawnParticle("reddust", d8, this.posY - 0.25D, d9, this.motionX, this.motionY, this.motionZ);
          } 
        } else {
          double d8 = this.posX + d4 + d5 * d6 * 0.7D;
          double d9 = this.posZ + d5 - d4 * d6 * 0.7D;
          if (this.rand.nextBoolean()) {
            this.worldObj.spawnParticle("smoke", d8, this.posY - 0.225D, d9, this.motionX, this.motionY, this.motionZ);
          } else {
            this.worldObj.spawnParticle("reddust", d8, this.posY - 0.225D, d9, this.motionX, this.motionY, this.motionZ);
          } 
        } 
        if (bid == Blocks.water || bid == Blocks.flowing_water)
          for (int k = 0; k < 5; k++)
            this.worldObj.spawnParticle("splash", this.posX + this.rand.nextFloat(), this.posY - i + 1.25D, this.posZ + this.rand.nextFloat(), this.motionX / 2.0D, this.motionY + velocity, this.motionZ / 2.0D);  
      } 
    } 
    if (this.playing > 0)
      this.playing--; 
    if (this.riddenByEntity != null && this.playing == 0 && this.worldObj.rand.nextInt(80) == 1) {
      this.worldObj.playSoundAtEntity(this.riddenByEntity, "orespawn:hover", 0.45F, 1.0F);
      this.playing = 55;
    } 
    if (!this.worldObj.isRemote) {
      if (this.exploding > 0)
        this.exploding--; 
      if (this.exploding == 0 && velocity > 0.65D && this.worldObj.rand.nextInt(20000) == 1) {
        this.exploding = 45;
        this.playing = 50;
      } 
      setExploding(this.exploding);
    } else {
      this.exploding = getExploding();
    } 
    if (getExploding() > 0 && this.riddenByEntity != null) {
      if (this.worldObj.rand.nextInt(10) == 1)
        this.worldObj.playSoundAtEntity(this.riddenByEntity, "random.explode", 0.55F, 0.75F + this.worldObj.rand.nextFloat()); 
      for (int i = 0; i < 15; i++) {
        this.worldObj.spawnParticle("explode", (int)(this.posX + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 4.0F)), (int)(this.posY + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 4.0F)), (int)(this.posZ + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 4.0F)), this.motionX, 0.0D, this.motionZ);
        this.worldObj.spawnParticle("largeexplode", (int)(this.posX + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 2.0F)), (int)(this.posY + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 2.0F)), (int)(this.posZ + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 2.0F)), this.motionX, 0.0D, this.motionZ);
        this.worldObj.spawnParticle("smoke", (int)(this.posX + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 5.0F)), (int)(this.posY + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 5.0F)), (int)(this.posZ + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 5.0F)), this.motionX, 0.0D, this.motionZ);
        this.worldObj.spawnParticle("largesmoke", (int)(this.posX + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0F)), (int)(this.posY + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0F)), (int)(this.posZ + ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0F)), this.motionX, 0.0D, this.motionZ);
      } 
    } 
    if (this.worldObj.isRemote) {
      if (this.riddenByEntity == null) {
        Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
        if (bid != Blocks.air) {
          this.motionY += 0.06D;
          this.posY += 0.07D;
          this.boatY += 0.07D;
        } else {
          this.motionY -= 0.003D;
        } 
      } else if (this.riddenByEntity instanceof EntityClientPlayerMP) {
        EntityClientPlayerMP pp = (EntityClientPlayerMP)this.riddenByEntity;
        pp.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C05PacketPlayerLook(pp.rotationYaw, pp.rotationPitch, pp.onGround));
        pp.sendQueue.addToSendQueue((Packet)new C0CPacketInput(pp.moveStrafing, pp.moveForward, pp.movementInput.jump, pp.movementInput.sneak));
      } 
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
      } else {
        double d4 = this.posX + this.motionX;
        double d5 = this.posY + this.motionY;
        double d11 = this.posZ + this.motionZ;
        setPosition(d4, d5, d11);
        this.motionX *= 0.99D;
        this.motionY *= 0.95D;
        this.motionZ *= 0.99D;
      } 
    } else {
      if (this.riddenByEntity != null)
        gh = 1.25D; 
      Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
      if (bid != Blocks.air) {
        this.motionY += 0.06D;
        this.posY += 0.1D;
        if (bid == Blocks.tallgrass && this.riddenByEntity != null && this.worldObj.rand.nextInt(200) == 1 && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)this.posX, (int)(this.posY - gh), (int)this.posZ, Blocks.air); 
        if (bid == Blocks.grass && this.riddenByEntity != null && this.worldObj.rand.nextInt(200) == 1 && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)this.posX, (int)(this.posY - gh), (int)this.posZ, Blocks.dirt); 
      } else {
        this.motionY -= 0.01D;
      } 
      if (this.riddenByEntity != null) {
        EntityPlayer pp = (EntityPlayer)this.riddenByEntity;
        obstruction_factor = 0.0D;
        dist = 3;
        dist += (int)(velocity * 8.0D);
        for (int k = 1; k < dist; k++) {
          for (int i = 1; i < dist * 2; i++) {
            double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
            double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
            bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
            if (bid != Blocks.air)
              obstruction_factor += 0.05D; 
          } 
        } 
        this.motionY += obstruction_factor * 0.11D;
        this.posY += obstruction_factor * 0.11D;
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
        this.rotationPitch = 10.0F * (float)velocity;
        setRotation(this.rotationYaw, this.rotationPitch);
        double newvelocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        if (this.exploding != 0) {
          newvelocity -= 0.05D;
          if (newvelocity < 0.0D)
            newvelocity = 0.0D; 
        } 
        double rr = Math.atan2(this.riddenByEntity.motionZ, this.riddenByEntity.motionX);
        double rhm = Math.atan2(this.motionZ, this.motionX);
        double rhdir = Math.toRadians(((this.riddenByEntity.rotationYaw + 90.0F) % 360.0F));
        double rt = 0.0D;
        double pi = 3.1415926545D;
        double deltav = 0.0D;
        float im = pp.moveForward;
        if (OreSpawnMain.flyup_keystate != 0)
          max_speed++; 
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
              deltav += 0.15D; 
          } else {
            max_speed = 0.35D;
            deltav = -0.02D;
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
      } else if (this.riddenByEntity == null) {
        this.motionX = 0.0D;
        this.motionZ = 0.0D;
      } 
      moveEntity(this.motionX, this.motionY, this.motionZ);
      if (this.isCollidedHorizontally && velocity > 0.75D) {
        setDead();
        int p = this.worldObj.rand.nextInt(10);
        int k;
        for (k = 0; k < 6 + p; k++)
          dropItem(Items.stick, 1); 
        for (k = 0; k < 2; k++)
          dropItem(Items.diamond, 1); 
      } else {
        this.motionX *= 0.98D;
        this.motionY *= 0.94D;
        this.motionZ *= 0.98D;
      } 
      list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand(0.25D, 0.0D, 0.25D));
      if (list != null && !list.isEmpty())
        for (int l = 0; l < list.size(); l++) {
          Entity entity = list.get(l);
          if (entity != this.riddenByEntity && entity.canBePushed() && !(entity instanceof Girlfriend) && !(entity instanceof Boyfriend))
            entity.applyEntityCollision((Entity)this); 
        }  
      if (this.riddenByEntity != null && this.riddenByEntity.isDead)
        this.riddenByEntity = null; 
    } 
  }
  
  public void updateRiderPosition() {
    if (this.riddenByEntity != null)
      this.riddenByEntity.setPosition(this.posX, this.posY + getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ); 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    par1NBTTagCompound.setInteger("HoverColor", getColor());
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    this.color = par1NBTTagCompound.getInteger("HoverColor");
    if (this.color < 1)
      this.color = 1; 
    if (this.color > 10)
      this.color = 10; 
    setColor(this.color);
  }
  
  public float getShadowSize() {
    return 0.25F;
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null && 
      var2.stackSize <= 0) {
      par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
      var2 = null;
    } 
    if (var2 != null && var2.getItem() == OreSpawnMain.MyUltimateSword && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!this.worldObj.isRemote) {
        this.color++;
        if (this.color > 10)
          this.color = 1; 
        setColor(this.color);
      } 
      return true;
    } 
    if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer)
      return true; 
    if (!this.worldObj.isRemote)
      par1EntityPlayer.mountEntity((Entity)this); 
    return true;
  }
  
  public void setDamageTaken(float f) {
    this.dataWatcher.updateObject(24, Float.valueOf(f));
  }
  
  public float getDamageTaken() {
    return this.dataWatcher.getWatchableObjectFloat(24);
  }
  
  public void setTimeSinceHit(int par1) {
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
  }
  
  public int getTimeSinceHit() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public void setForwardDirection(int par1) {
    this.dataWatcher.updateObject(23, Integer.valueOf(par1));
  }
  
  public int getForwardDirection() {
    return this.dataWatcher.getWatchableObjectInt(23);
  }
  
  public void setExploding(int par1) {
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
  }
  
  public int getExploding() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  public void setColor(int par1) {
    this.dataWatcher.updateObject(21, Integer.valueOf(par1));
  }
  
  public int getColor() {
    return this.dataWatcher.getWatchableObjectInt(21);
  }
}
