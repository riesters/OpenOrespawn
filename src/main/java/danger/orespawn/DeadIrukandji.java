package danger.orespawn;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class DeadIrukandji extends LaserBall {
  private int my_index = 86;
  
  public DeadIrukandji(World par1World) {
    super(par1World);
    setIrukandji();
  }
  
  public DeadIrukandji(World par1World, int par2) {
    super(par1World);
    setIrukandji();
  }
  
  public DeadIrukandji(World par1World, EntityLivingBase par2EntityLiving) {
    super(par1World, par2EntityLiving);
    setIrukandji();
  }
  
  public DeadIrukandji(World par1World, EntityLivingBase par2EntityLiving, int par3) {
    super(par1World, par2EntityLiving);
    setIrukandji();
  }
  
  public DeadIrukandji(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
    setIrukandji();
  }
  
  public int getIrukandjiIndex() {
    return this.my_index;
  }
}
