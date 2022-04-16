package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class OreAmethyst extends Block {
  public OreAmethyst(int i) {
    super(Material.rock);
    setHardness(10.0F);
    setResistance(4.0F);
    setCreativeTab(CreativeTabs.tabBlock);
  }
  
  public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
    super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
    int j1 = 5 + par1World.rand.nextInt(5) + par1World.rand.nextInt(5);
    dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return OreSpawnMain.MyAmethyst;
  }
  
  public int quantityDroppedWithBonus(int par1, Random par2Random) {
    return 1 + par2Random.nextInt(2);
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
