package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockExperiencePlant extends BlockReed {
  protected BlockExperiencePlant(int par1) {
    float var3 = 0.375F;
    setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
    setTickRandomly(true);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    Block bid = par1World.getBlock(par2, par3 - 1, par4);
    if (bid == Blocks.air)
      return false; 
    if (bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland)
      return true; 
    return false;
  }
  
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.rand.nextInt(20) != 1)
      return; 
    for (int j1 = 0; j1 < 20; j1++)
      par1World.spawnParticle("happyVillager", (par2 + par1World.rand.nextFloat()), par3 + par1World.rand.nextFloat(), (par4 + par1World.rand.nextFloat()), 0.0D, 0.0D, 0.0D); 
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.isRemote)
      return; 
    if (par1World.rand.nextInt(10) != 1)
      return; 
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    OreSpawnMain.OreSpawnTrees.ExperienceTree(par1World, par2, par3 - 1, par4);
  }
  
  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
    return Item.getItemFromBlock(OreSpawnMain.MyExperiencePlant);
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  public int idPicked(World par1World, int par2, int par3, int par4) {
    return 0;
  }
  
  protected Item getSeedItem() {
    return OreSpawnMain.MyExperienceTreeSeed;
  }
  
  protected int getCropItem() {
    return 0;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
