package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDuplicatorLog extends Block {
  protected BlockDuplicatorLog(int par1) {
    super(Material.wood);
    setCreativeTab(CreativeTabs.tabBlock);
    setTickRandomly(true);
  }
  
  public int tickRate() {
    return 1;
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.isRemote)
      return; 
    if (OreSpawnMain.enableduplicatortree != 0)
      OreSpawnMain.OreSpawnTrees.DuplicatorTree(par1World, par2, par3, par4); 
  }
  
  public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
    par3List.add(new ItemStack(Item.getItemFromBlock(this), 1, 0));
  }
  
  protected ItemStack createStackedBlock(int par1) {
    return new ItemStack(this, 1, 0);
  }
  
  public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
    return true;
  }
  
  public boolean isWood(IBlockAccess world, int x, int y, int z) {
    return true;
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
