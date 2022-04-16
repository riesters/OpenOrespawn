package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class GodzillaHead extends EntityLiving {
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private double velocityX;
  
  private double velocityY;
  
  private double velocityZ;
  
  public GodzillaHead(World par1World) {
    super(par1World);
    setSize(9.9F, 10.0F);
    this.noClip = true;
    this.fireResistance = 10000;
    this.isImmuneToFire = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(OreSpawnMain.Godzilla_stats.health);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.3300000429153442D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("inWall"))
      return false; 
    Entity e = par1DamageSource.getEntity();
    if (e != null && (e instanceof Godzilla || e instanceof GodzillaHead))
      return false; 
    e = par1DamageSource.getSourceOfDamage();
    if (e != null && (e instanceof Godzilla || e instanceof GodzillaHead))
      return false; 
    List var5 = this.worldObj.getEntitiesWithinAABB(Godzilla.class, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
    Iterator<Entity> var2 = var5.iterator();
    Entity var3 = null;
    Godzilla var4 = null;
    if (var2.hasNext()) {
      var3 = var2.next();
      var4 = (Godzilla)var3;
      ret = var4.attackEntityFrom(par1DamageSource, par2);
    } 
    return ret;
  }
  
  public boolean canBeCollidedWith() {
    return true;
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
  
  public void onUpdate() {
    if (this.isDead)
      return; 
    this.isAirBorne = true;
    setFire(0);
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
    } else {
      List var5 = this.worldObj.getEntitiesWithinAABB(Godzilla.class, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
      Iterator<Entity> var2 = var5.iterator();
      Entity var3 = null;
      Godzilla var4 = null;
      if (var2.hasNext()) {
        var3 = var2.next();
        var4 = (Godzilla)var3;
        this.posY = var4.posY + 16.0D;
        this.posX = var4.posX - 17.0D * Math.sin(Math.toRadians(var4.rotationYawHead));
        this.posZ = var4.posZ + 17.0D * Math.cos(Math.toRadians(var4.rotationYawHead));
        this.rotationYaw = var4.rotationYaw;
        this.rotationYawHead = var4.rotationYawHead;
        this.motionX = var4.motionX;
        this.motionY = var4.motionY;
        this.motionZ = var4.motionZ;
        setHealth(var4.getHealth());
      } else {
        setDead();
      } 
    } 
  }
}
