package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SunspotUrchin extends EntityThrowable {
  private float my_rotation = 0.0F;
  
  private int my_index = 50;
  
  public SunspotUrchin(World par1World) {
    super(par1World);
  }
  
  public SunspotUrchin(World par1World, int par2) {
    super(par1World);
  }
  
  public SunspotUrchin(World par1World, EntityLivingBase par2EntityLiving) {
    super(par1World, par2EntityLiving);
  }
  
  public SunspotUrchin(World par1World, EntityLivingBase par2EntityLiving, int par3) {
    super(par1World, par2EntityLiving);
  }
  
  public SunspotUrchin(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  public int getUrchinIndex() {
    return this.my_index;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null) {
      float var2 = 3.0F;
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityCreeper)
        var2 = 6.0F; 
      if (!(par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.player.EntityPlayer)) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), var2);
        if (!par1MovingObjectPosition.entityHit.isImmuneToFire())
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
    for (int var3 = 0; var3 < 5; var3++) {
      this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, this.worldObj.rand.nextFloat(), this.worldObj.rand.nextFloat(), this.worldObj.rand.nextFloat());
      this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, this.worldObj.rand.nextFloat(), this.worldObj.rand.nextFloat(), this.worldObj.rand.nextFloat());
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
  
  public void onUpdate() {
    super.onUpdate();
    setFire(1);
    this.my_rotation += 30.0F;
    while (this.my_rotation > 360.0F)
      this.my_rotation -= 360.0F; 
    this.rotationPitch = this.prevRotationPitch = this.my_rotation;
    this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
  }
}
