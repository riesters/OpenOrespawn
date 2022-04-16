package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockUranium extends Block {
  public BlockUranium(int par1) {
    super(Material.rock);
    setHardness(5.0F);
    setResistance(5.0F);
    setCreativeTab(CreativeTabs.tabBlock);
    setLightLevel(0.2F);
  }
  
  public int tickRate() {
    return 100;
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.rand.nextInt(20) == 0)
      sparkle(par1World, par2, par3, par4); 
  }
  
  private void sparkle(World par1World, int par2, int par3, int par4) {
    Random var5 = par1World.rand;
    double var6 = 0.0625D;
    for (int var8 = 0; var8 < 6; var8++) {
      double var9 = (par2 + var5.nextFloat());
      double var11 = (par3 + var5.nextFloat());
      double var13 = (par4 + var5.nextFloat());
      if (var8 == 0 && !par1World.getBlock(par2, par3 + 1, par4).isOpaqueCube())
        var11 = (par3 + 1) + var6; 
      if (var8 == 1 && !par1World.getBlock(par2, par3 - 1, par4).isOpaqueCube())
        var11 = (par3 + 0) - var6; 
      if (var8 == 2 && !par1World.getBlock(par2, par3, par4 + 1).isOpaqueCube())
        var13 = (par4 + 1) + var6; 
      if (var8 == 3 && !par1World.getBlock(par2, par3, par4 - 1).isOpaqueCube())
        var13 = (par4 + 0) - var6; 
      if (var8 == 4 && !par1World.getBlock(par2 + 1, par3, par4).isOpaqueCube())
        var9 = (par2 + 1) + var6; 
      if (var8 == 5 && !par1World.getBlock(par2 - 1, par3, par4).isOpaqueCube())
        var9 = (par2 + 0) - var6; 
      if (var9 < par2 || var9 > (par2 + 1) || var11 < 0.0D || var11 > (par3 + 1) || var13 < par4 || var13 > (par4 + 1)) {
        int which = par1World.rand.nextInt(3);
        if (which == 0)
          par1World.spawnParticle("flame", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
        if (which == 1)
          par1World.spawnParticle("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
        if (which == 2)
          par1World.spawnParticle("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
