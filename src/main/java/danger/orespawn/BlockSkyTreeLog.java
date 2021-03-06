package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSkyTreeLog extends Block {
  protected BlockSkyTreeLog(int par1, int par2) {
    super(Material.wood);
    setCreativeTab(CreativeTabs.tabBlock);
  }
  
  public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
    par3List.add(new ItemStack(Item.getItemFromBlock(this), 1, 0));
  }
  
  protected ItemStack createStackedBlock(int par1) {
    return new ItemStack(Item.getItemFromBlock(this), 1, 0);
  }
  
  public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
    return true;
  }
  
  public boolean isWood(IBlockAccess world, int x, int y, int z) {
    return true;
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return Item.getItemFromBlock(OreSpawnMain.MySkyTreeLog);
  }
  
  public void breakRecursor(World world, int x, int y, int z, int xf, int yf, int zf, int recursion) {
    int var7 = 1;
    if (recursion > 1000)
      return; 
    for (int var9 = -var7; var9 <= var7; var9++) {
      for (int var10 = -var7; var10 <= var7; var10++) {
        for (int var11 = -var7; var11 <= var7; var11++) {
          if ((var9 != 0 || var10 != 0 || var11 != 0) && (
            x + var9 != xf || y + var10 != yf || z + var11 != zf) && (
            recursion <= 0 || x + var9 < xf - var7 || x + var9 > xf + var7 || y + var10 < yf - var7 || y + var10 > yf + var7 || z + var11 < zf - var7 || z + var11 > zf + var7)) {
            Block var12 = world.getBlock(x + var9, y + var10, z + var11);
            if (var12 == this) {
              world.setBlock(x + var9, y + var10, z + var11, Blocks.air, 0, 2);
              dropBlockAsItem(world, x + var9, y + var10, z + var11, 0, 0);
              breakRecursor(world, x + var9, y + var10, z + var11, x, y, z, recursion + 1);
            } 
          } 
        } 
      } 
    } 
  }
  
  public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    breakRecursor(par1World, par2, par3, par4, par2, par3, par4, 0);
    dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
