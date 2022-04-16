package danger.orespawn;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BetterFireball extends EntityFireball {
  private int xTile = -1;
  
  private int yTile = -1;
  
  private int zTile = -1;
  
  private int inTile = 0;
  
  private boolean inGround = false;
  
  public EntityLivingBase shootingEntity;
  
  private int ticksAlive;
  
  private int ticksInAir = 0;
  
  public double accelerationX;
  
  public double accelerationY;
  
  public double accelerationZ;
  
  public int field_92012_e = 1;
  
  private int notme = 0;
  
  private boolean small = false;
  
  public BetterFireball(World par1World) {
    super(par1World);
    setSize(1.0F, 1.0F);
  }
  
  protected void entityInit() {}
  
  public BetterFireball(World par1World, EntityLivingBase par2EntityLiving, double par3, double par5, double par7) {
    super(par1World);
    this.shootingEntity = par2EntityLiving;
    setSize(1.0F, 1.0F);
    setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY, par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
    setPosition(this.posX, this.posY, this.posZ);
    this.yOffset = 0.0F;
    this.motionX = this.motionY = this.motionZ = 0.0D;
    double var9 = MathHelper.sqrt_double(par3 * par3 + par5 * par5 + par7 * par7);
    this.accelerationX = par3 / var9 * 0.1D;
    this.accelerationY = par5 / var9 * 0.1D;
    this.accelerationZ = par7 / var9 * 0.1D;
  }
  
  public void setNotMe() {
    this.notme = 1;
  }
  
  public void setBig() {
    this.field_92012_e = 2;
  }
  
  public void setReallyBig() {
    this.field_92012_e = 4;
  }
  
  public void setSmall() {
    this.small = true;
    setSize(0.3125F, 0.3125F);
  }
  
  public void onUpdate() {
    Vec3 var15 = null;
    Vec3 var2 = null;
    MovingObjectPosition var3 = null;
    Entity var4 = null;
    List<Entity> var5 = null;
    double var6 = 0.0D;
    Entity var9 = null;
    float var10 = 0.3F;
    double var13 = 0.0D;
    float var16 = 0.0F;
    float var17 = 0.0F;
    float var18 = 0.0F;
    if (this.ticksAlive >= 600 || this.ticksInAir >= 600) {
      setDead();
      return;
    } 
    if (!this.worldObj.isRemote && ((this.shootingEntity != null && this.shootingEntity.isDead) || !this.worldObj.blockExists((int)this.posX, (int)this.posY, (int)this.posZ))) {
      setDead();
    } else {
      super.onUpdate();
      setFire(1);
      if (this.inGround) {
        Block var1 = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
        if (var1 != Blocks.air)
          this.ticksAlive++; 
        this.inGround = false;
        this.motionX *= (this.rand.nextFloat() * 0.2F);
        this.motionY *= (this.rand.nextFloat() * 0.2F);
        this.motionZ *= (this.rand.nextFloat() * 0.2F);
      } else {
        this.ticksInAir++;
      } 
      var15 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      var2 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      var3 = this.worldObj.rayTraceBlocks(var15, var2, false);
      var15 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      var2 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      if (var3 != null)
        var2 = Vec3.createVectorHelper(var3.hitVec.xCoord, var3.hitVec.yCoord, var3.hitVec.zCoord); 
      var4 = null;
      var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
      var6 = 0.0D;
      for (int var8 = 0; var8 < var5.size(); var8++) {
        var9 = var5.get(var8);
        if (this.shootingEntity == var9) {
          var3 = null;
          break;
        } 
        if (var9 instanceof BetterFireball) {
          var3 = null;
          break;
        } 
        if (var9 instanceof GodzillaHead) {
          var3 = null;
          break;
        } 
        if (MyUtils.isRoyalty(var9)) {
          var3 = null;
          break;
        } 
        if (this.notme != 0 && (
          var9 instanceof net.minecraft.entity.player.EntityPlayer || var9 instanceof Dragon || var9 instanceof Mothra)) {
          var3 = null;
          break;
        } 
        if (var9.canBeCollidedWith() && (!var9.isEntityEqual((Entity)this.shootingEntity) || this.ticksInAir >= 25)) {
          AxisAlignedBB var11 = var9.boundingBox.expand(var10, var10, var10);
          MovingObjectPosition var12 = var11.calculateIntercept(var15, var2);
          if (var12 != null) {
            var13 = var15.distanceTo(var12.hitVec);
            if (var13 < var6 || var6 == 0.0D) {
              var4 = var9;
              var6 = var13;
            } 
          } 
        } 
      } 
      if (var4 != null)
        var3 = new MovingObjectPosition(var4); 
      if (var3 != null)
        onImpact(var3); 
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      var16 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
      this.rotationYaw = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) + 90.0F;
      for (this.rotationPitch = (float)(Math.atan2(var16, this.motionY) * 180.0D / Math.PI) - 90.0F; this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F);
      while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        this.prevRotationPitch += 360.0F; 
      while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        this.prevRotationYaw -= 360.0F; 
      while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        this.prevRotationYaw += 360.0F; 
      this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
      this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
      var17 = getMotionFactor();
      if (isInWater()) {
        for (int var19 = 0; var19 < 4; var19++) {
          var18 = 0.25F;
          this.worldObj.spawnParticle("bubble", this.posX - this.motionX * var18, this.posY - this.motionY * var18, this.posZ - this.motionZ * var18, this.motionX, this.motionY, this.motionZ);
        } 
        var17 = 0.8F;
      } 
      this.motionX += this.accelerationX;
      this.motionY += this.accelerationY;
      this.motionZ += this.accelerationZ;
      this.motionX *= var17;
      this.motionY *= var17;
      this.motionZ *= var17;
      this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
      setPosition(this.posX, this.posY, this.posZ);
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null) {
        if (par1MovingObjectPosition.entityHit instanceof BetterFireball)
          return; 
        if (par1MovingObjectPosition.entityHit instanceof Mothra)
          return; 
        if (this.notme != 0 && (
          par1MovingObjectPosition.entityHit instanceof Dragon || par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.player.EntityPlayer)) {
          setDead();
          return;
        } 
        Entity e = par1MovingObjectPosition.entityHit;
        if (e instanceof EntityLiving) {
          EntityLiving el = (EntityLiving)e;
          if (el.width * el.height > 30.0F && 
            !MyUtils.isRoyalty((Entity)el) && !(el instanceof Godzilla) && !(el instanceof GodzillaHead) && !(el instanceof PitchBlack) && !(el instanceof Kraken))
            el.setHealth(el.getHealth() / 2.0F); 
        } 
        if (!this.small) {
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, (Entity)this.shootingEntity), 10.0F);
          par1MovingObjectPosition.entityHit.setFire(5);
        } else {
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, (Entity)this.shootingEntity), 5.0F);
          par1MovingObjectPosition.entityHit.setFire(5);
        } 
      } else {
        int i = par1MovingObjectPosition.blockX;
        int j = par1MovingObjectPosition.blockY;
        int k = par1MovingObjectPosition.blockZ;
        switch (par1MovingObjectPosition.sideHit) {
          case 0:
            j--;
            break;
          case 1:
            j++;
            break;
          case 2:
            k--;
            break;
          case 3:
            k++;
            break;
          case 4:
            i--;
            break;
          case 5:
            i++;
            break;
        } 
        if (this.worldObj.isAirBlock(i, j, k))
          this.worldObj.setBlock(i, j, k, (Block)Blocks.fire); 
      } 
      if (!this.small)
        this.worldObj.newExplosion((Entity)null, this.posX, this.posY, this.posZ, this.field_92012_e, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
      setDead();
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("ExplosionPower", this.field_92012_e);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    if (par1NBTTagCompound.hasKey("ExplosionPower"))
      this.field_92012_e = par1NBTTagCompound.getInteger("ExplosionPower"); 
  }
}
