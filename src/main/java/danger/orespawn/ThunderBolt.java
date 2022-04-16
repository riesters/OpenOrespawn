package danger.orespawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ThunderBolt extends EntityThrowable {
  public ThunderBolt(World par1World) {
    super(par1World);
  }
  
  public ThunderBolt(World par1World, EntityLivingBase par3EntityPlayer) {
    super(par1World, par3EntityPlayer);
  }
  
  public ThunderBolt(World par1World, EntityLivingBase par2EntityLiving, int par3) {
    super(par1World, par2EntityLiving);
  }
  
  public ThunderBolt(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null) {
      float var2 = 40.0F;
      if (MyUtils.isRoyalty(par1MovingObjectPosition.entityHit)) {
        setDead();
        return;
      } 
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), var2 / 2.0F);
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeMobDamage(getThrower()), var2 / 2.0F);
      par1MovingObjectPosition.entityHit.setFire(1);
    } 
    int mx = 20;
    for (int var3 = 0; var3 < mx; var3++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat() - this.rand.nextFloat(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian());
    } 
    playSound("random.explode", 0.5F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.5F);
    if (!this.worldObj.isRemote)
      this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, 3.0F, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
    this.worldObj.addWeatherEffect((Entity)new EntityLightningBolt(this.worldObj, this.posX, this.posY + 1.0D, this.posZ));
    setDead();
  }
  
  public void onUpdate() {
    super.onUpdate();
    int mx = 4;
    for (int i = 0; i < mx; i++)
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, this.worldObj.rand.nextGaussian() / 10.0D, this.worldObj.rand.nextGaussian() / 10.0D, this.worldObj.rand.nextGaussian() / 10.0D); 
  }
}
