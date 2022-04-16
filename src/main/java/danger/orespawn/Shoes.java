package danger.orespawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Shoes extends EntityThrowable {
  public int ShoeId = 0;
  
  private float my_rotation = 0.0F;
  
  public Shoes(World par1World) {
    super(par1World);
    this.ShoeId = this.rand.nextInt(4) + 2;
    this.dataWatcher.addObject(20, Integer.valueOf(this.ShoeId));
  }
  
  public Shoes(World par1World, int par2) {
    super(par1World);
    this.ShoeId = par2;
    this.dataWatcher.addObject(20, Integer.valueOf(this.ShoeId));
  }
  
  public Shoes(World par1World, EntityLivingBase par2EntityLiving) {
    super(par1World, par2EntityLiving);
    this.ShoeId = this.rand.nextInt(4) + 2;
    this.dataWatcher.addObject(20, Integer.valueOf(this.ShoeId));
  }
  
  public Shoes(World par1World, EntityLivingBase par2EntityLiving, int par3) {
    super(par1World, par2EntityLiving);
    this.ShoeId = par3;
    this.dataWatcher.addObject(20, Integer.valueOf(this.ShoeId));
  }
  
  public Shoes(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
    this.ShoeId = this.rand.nextInt(4) + 2;
    this.dataWatcher.addObject(20, Integer.valueOf(this.ShoeId));
  }
  
  public int getShoeId() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null) {
      float var2 = 2.0F;
      if (getShoeId() == 6)
        var2 = 6.0F; 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityCreeper)
        var2 += 4.0F; 
      if (par1MovingObjectPosition.entityHit instanceof Girlfriend)
        var2 = 1.0F; 
      if (par1MovingObjectPosition.entityHit instanceof Boyfriend)
        var2 = 1.0F; 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.player.EntityPlayer)
        var2 = 0.0F; 
      if (OreSpawnMain.valentines_day != 0)
        var2 = 10.0F; 
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), var2);
    } 
    for (int var3 = 0; var3 < 4; var3++) {
      this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.my_rotation += 20.0F;
    while (this.my_rotation > 360.0F)
      this.my_rotation -= 360.0F; 
    this.rotationPitch = this.prevRotationPitch = this.my_rotation;
  }
}
