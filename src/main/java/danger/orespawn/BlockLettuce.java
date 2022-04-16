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

public class BlockLettuce extends BlockReed {
  protected BlockLettuce(int par1) {
    float var3 = 0.375F;
    setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
    setTickRandomly(true);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    Block bid = par1World.getBlock(par2, par3 - 1, par4);
    if (bid == Blocks.air)
      return false; 
    if (bid == OreSpawnMain.MyLettucePlant1 || bid == OreSpawnMain.MyLettucePlant2 || bid == OreSpawnMain.MyLettucePlant3 || bid == OreSpawnMain.MyLettucePlant4 || bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland)
      return true; 
    return false;
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int dontGrow = 0;
    if (par1World.isRemote)
      return; 
    int var7 = par1World.getBlockMetadata(par2, par3, par4);
    var7 &= 0xFF;
    if (var7 >= 4) {
      Block bid = par1World.getBlock(par2, par3, par4);
      if (bid == OreSpawnMain.MyLettucePlant1) {
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyLettucePlant2, 0, 2);
      } else if (bid == OreSpawnMain.MyLettucePlant2) {
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyLettucePlant3, 0, 2);
      } else if (bid == OreSpawnMain.MyLettucePlant3) {
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyLettucePlant4, 0, 2);
      } 
    } else {
      Block bid = par1World.getBlock(par2, par3, par4);
      par1World.setBlock(par2, par3, par4, bid, var7 + 1, 2);
    } 
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return OreSpawnMain.MyLettuce;
  }
  
  public int quantityDropped(Random par1Random) {
    if (this == OreSpawnMain.MyLettucePlant4)
      return 2 + par1Random.nextInt(3); 
    return 0;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
