package danger.orespawn;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class IceBall extends LaserBall {
  private int my_index = 84;
  
  private int icemaker = 0;
  
  public IceBall(World par1World) {
    super(par1World);
    setIceBall();
  }
  
  public IceBall(World par1World, int par2) {
    super(par1World);
    setIceBall();
  }
  
  public IceBall(World par1World, EntityLivingBase par2EntityLiving) {
    super(par1World, par2EntityLiving);
    setIceBall();
  }
  
  public IceBall(World par1World, EntityLivingBase par2EntityLiving, int par3) {
    super(par1World, par2EntityLiving);
    setIceBall();
  }
  
  public IceBall(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
    setIceBall();
  }
  
  public int getIceBallIndex() {
    return this.my_index;
  }
  
  public void setIceMaker(int i) {
    this.icemaker = i;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null)
      if (MyUtils.isRoyalty(par1MovingObjectPosition.entityHit)) {
        setDead();
        return;
      }  
    super.onImpact(par1MovingObjectPosition);
    if (this.icemaker != 0)
      for (int i = 0; i < 5; i++) {
        int x = this.worldObj.rand.nextInt(4);
        if (this.worldObj.rand.nextInt(2) == 1)
          x = -x; 
        int y = this.worldObj.rand.nextInt(4);
        if (this.worldObj.rand.nextInt(2) == 1)
          y = -y; 
        int z = this.worldObj.rand.nextInt(4);
        if (this.worldObj.rand.nextInt(2) == 1)
          z = -z; 
        x = (int)(x + par1MovingObjectPosition.hitVec.xCoord);
        y = (int)(y + par1MovingObjectPosition.hitVec.yCoord);
        z = (int)(z + par1MovingObjectPosition.hitVec.zCoord);
        this.worldObj.setBlock(x, y, z, Blocks.ice);
      }  
    setDead();
  }
}
