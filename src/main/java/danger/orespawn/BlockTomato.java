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

public class BlockTomato extends BlockReed {
  private int myMaxHeight = 0;
  
  protected BlockTomato(int par1) {
    float var3 = 0.375F;
    setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
    setTickRandomly(true);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    Block bid = par1World.getBlock(par2, par3 - 1, par4);
    if (bid == Blocks.air)
      return false; 
    if (bid == OreSpawnMain.MyTomatoPlant1 || bid == OreSpawnMain.MyTomatoPlant2 || bid == OreSpawnMain.MyTomatoPlant3 || bid == OreSpawnMain.MyTomatoPlant4 || bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland)
      return true; 
    return false;
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int Height = 1;
    int dontGrow = 0;
    if (par1World.isRemote)
      return; 
    if (this != OreSpawnMain.MyTomatoPlant1 && this != OreSpawnMain.MyTomatoPlant2)
      return; 
    int var7 = par1World.getBlockMetadata(par2, par3, par4);
    this.myMaxHeight = var7 >> 8;
    var7 &= 0xFF;
    if (this.myMaxHeight == 0)
      this.myMaxHeight = 3 + OreSpawnMain.OreSpawnRand.nextInt(3); 
    Block bid = par1World.getBlock(par2, par3 + 1, par4);
    if (bid == Blocks.air) {
      for (int var6 = 1; var6 < 10; var6++) {
        bid = par1World.getBlock(par2, par3 - var6, par4);
        if (bid != OreSpawnMain.MyTomatoPlant1 && bid != OreSpawnMain.MyTomatoPlant2 && bid != OreSpawnMain.MyTomatoPlant3 && bid != OreSpawnMain.MyTomatoPlant4)
          break; 
        Height++;
        if (bid == OreSpawnMain.MyTomatoPlant3 || bid == OreSpawnMain.MyTomatoPlant4)
          dontGrow = 1; 
      } 
      if (dontGrow != 0)
        this.myMaxHeight = Height; 
      if (var7 >= 5 - this.myMaxHeight / 3) {
        if (Height < this.myMaxHeight) {
          par1World.setBlock(par2, par3 + 1, par4, OreSpawnMain.MyTomatoPlant1, this.myMaxHeight << 8, 2);
          par1World.setBlock(par2, par3, par4, OreSpawnMain.MyTomatoPlant2, this.myMaxHeight << 8, 2);
        } else {
          for (int i = 0; i < this.myMaxHeight; i++) {
            bid = par1World.getBlock(par2, par3 - i, par4);
            if (bid == OreSpawnMain.MyTomatoPlant2) {
              par1World.setBlock(par2, par3 - i, par4, OreSpawnMain.MyTomatoPlant3, this.myMaxHeight << 8, 2);
            } else if (bid == OreSpawnMain.MyTomatoPlant3) {
              par1World.setBlock(par2, par3 - i, par4, OreSpawnMain.MyTomatoPlant4, this.myMaxHeight << 8, 2);
            } 
          } 
          bid = par1World.getBlock(par2, par3, par4);
          par1World.setBlock(par2, par3, par4, bid, this.myMaxHeight << 8, 2);
        } 
      } else {
        bid = par1World.getBlock(par2, par3, par4);
        par1World.setBlock(par2, par3, par4, bid, this.myMaxHeight << 8 | var7 + 1, 2);
      } 
    } 
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return OreSpawnMain.MyTomato;
  }
  
  public int quantityDropped(Random par1Random) {
    if (this == OreSpawnMain.MyTomatoPlant4)
      return 2 + par1Random.nextInt(4); 
    return 0;
  }
  
  public Item itemPicked(World par1World, int par2, int par3, int par4) {
    return OreSpawnMain.MyTomato;
  }
  
  protected Item getSeedItem() {
    return OreSpawnMain.MyTomato;
  }
  
  protected Item getCropItem() {
    return OreSpawnMain.MyTomato;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
