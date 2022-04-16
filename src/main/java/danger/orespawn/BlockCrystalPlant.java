package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockCrystalPlant extends BlockReed {
  protected BlockCrystalPlant(int par1) {
    float var3 = 0.375F;
    setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
    setTickRandomly(true);
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    Block bid = par1World.getBlock(par2, par3 - 1, par4);
    if (bid == Blocks.air)
      return false; 
    if (bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland || bid == OreSpawnMain.CrystalGrass)
      return true; 
    return false;
  }
  
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.rand.nextInt(30) != 1)
      return; 
    for (int j1 = 0; j1 < 10; j1++)
      par1World.spawnParticle("happyVillager", (par2 + par1World.rand.nextFloat()), par3 + par1World.rand.nextFloat(), (par4 + par1World.rand.nextFloat()), 0.0D, 0.0D, 0.0D); 
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.isRemote)
      return; 
    if (par1World.rand.nextInt(5) != 1)
      return; 
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    if (this == OreSpawnMain.MyCrystalPlant)
      TallCrystalTree(par1World, par2, par3, par4); 
    if (this == OreSpawnMain.MyCrystalPlant2)
      ScragglyCrystalTreeWithBranches(par1World, par2, par3, par4); 
    if (this == OreSpawnMain.MyCrystalPlant3)
      TallCrystalTreeBlue(par1World, par2, par3, par4); 
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    if (this == OreSpawnMain.MyCrystalPlant)
      return Item.getItemFromBlock(OreSpawnMain.MyCrystalPlant); 
    if (this == OreSpawnMain.MyCrystalPlant2)
      Item.getItemFromBlock(OreSpawnMain.MyCrystalPlant2); 
    return Item.getItemFromBlock(OreSpawnMain.MyCrystalPlant3);
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  public int idPicked(World par1World, int par2, int par3, int par4) {
    return 0;
  }
  
  protected int getSeedItem() {
    return 0;
  }
  
  protected int getCropItem() {
    return 0;
  }
  
  public void TallCrystalTree(World world, int x, int y, int z) {
    int i = 10 + world.rand.nextInt(12);
    int j = i + world.rand.nextInt(18);
    int k;
    for (k = 0; k < i; k++) {
      Block bid = world.getBlock(x, y + k, z);
      if (k >= 1 && bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves)
        return; 
      OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
    } 
    y += i - 1;
    for (k = i; k < j; k++) {
      y++;
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves)
        break; 
      OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
      if (k % 4 == 0)
        for (int n = -1; n < 2; n++) {
          for (int i1 = -1; i1 < 2; i1++) {
            if (world.rand.nextInt(2) == 1) {
              bid = world.getBlock(x + n, y, z + i1);
              if (bid == Blocks.air)
                OreSpawnMain.setBlockFast(world, x + n, y, z + i1, OreSpawnMain.MyCrystalLeaves, 0, 2); 
            } 
          } 
        }  
    } 
    y++;
    int m;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        if (world.rand.nextInt(2) == 1) {
          Block bid = world.getBlock(x + m, y, z + n);
          if (bid == Blocks.air)
            OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalTreeLog, 0, 2); 
        } 
      } 
    } 
    for (m = -3; m < 4; m++) {
      for (int n = -3; n < 4; n++) {
        Block bid = world.getBlock(x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0, 2); 
      } 
    } 
    y++;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        Block bid = world.getBlock(x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0, 2); 
      } 
    } 
  }
  
  public void makeScragglyCrystalBranch(World world, int x, int y, int z, int len, int biasx, int biasz) {
    for (int k = 0; k < len; k++) {
      int ix = world.rand.nextInt(2) - world.rand.nextInt(2) + biasx;
      int iz = world.rand.nextInt(2) - world.rand.nextInt(2) + biasz;
      if (ix > 1)
        ix = 1; 
      if (ix < -1)
        ix = -1; 
      if (iz > 1)
        iz = 1; 
      if (iz < -1)
        iz = -1; 
      int iy = (world.rand.nextInt(3) > 0) ? 1 : 0;
      x += ix;
      z += iz;
      y += iy;
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        return; 
      OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
      for (int m = -1; m < 2; m++) {
        for (int n = -1; n < 2; n++) {
          if (world.rand.nextInt(2) == 1) {
            bid = world.getBlock(x + m, y, z + n);
            if (bid == Blocks.air)
              OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0, 2); 
          } 
        } 
      } 
      if (world.rand.nextInt(2) == 1) {
        bid = world.getBlock(x, y + 1, z);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0, 2); 
      } 
    } 
  }
  
  public void ScragglyCrystalTreeWithBranches(World world, int x, int y, int z) {
    int i = 1 + world.rand.nextInt(2);
    int j = i + world.rand.nextInt(8);
    int k;
    for (k = 0; k < i; k++) {
      Block bid = world.getBlock(x, y + k, z);
      if (k >= 1 && bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        return; 
      OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
    } 
    y += i - 1;
    for (k = i; k < j; k++) {
      int ix = world.rand.nextInt(2) - world.rand.nextInt(2);
      int iz = world.rand.nextInt(2) - world.rand.nextInt(2);
      int iy = (world.rand.nextInt(4) > 0) ? 1 : 0;
      x += ix;
      z += iz;
      y += iy;
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        break; 
      OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
      if (world.rand.nextInt(4) == 1)
        makeScragglyCrystalBranch(world, x, y, z, world.rand.nextInt(1 + j - k), world.rand.nextInt(2) - world.rand.nextInt(2), world.rand.nextInt(2) - world.rand.nextInt(2)); 
      for (int m = -1; m < 2; m++) {
        for (int n = -1; n < 2; n++) {
          if (world.rand.nextInt(2) == 1) {
            bid = world.getBlock(x + m, y, z + n);
            if (bid == Blocks.air)
              OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0, 2); 
          } 
        } 
      } 
      if (world.rand.nextInt(2) == 1) {
        bid = world.getBlock(x, y + 1, z);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0, 2); 
      } 
    } 
  }
  
  public void TallCrystalTreeBlue(World world, int x, int y, int z) {
    int i = 5 + world.rand.nextInt(6);
    int j = 2 + i + world.rand.nextInt(12);
    int k;
    for (k = 0; k < i; k++) {
      Block bid = world.getBlock(x, y + k, z);
      if (k >= 1 && bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves3)
        return; 
      OreSpawnMain.setBlockFast(world, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
    } 
    y += i - 1;
    for (k = i; k < j; k++) {
      y++;
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves3)
        break; 
      OreSpawnMain.setBlockFast(world, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0, 2);
      if (k % 3 == 0)
        for (int n = -1; n < 2; n++) {
          for (int i1 = -1; i1 < 2; i1++) {
            if (world.rand.nextInt(2) == 1) {
              bid = world.getBlock(x + n, y, z + i1);
              if (bid == Blocks.air)
                OreSpawnMain.setBlockFast(world, x + n, y, z + i1, OreSpawnMain.MyCrystalLeaves3, 0, 2); 
            } 
          } 
        }  
    } 
    y++;
    int m;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        if (world.rand.nextInt(2) == 1) {
          Block bid = world.getBlock(x + m, y, z + n);
          if (bid == Blocks.air)
            OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalTreeLog, 0, 2); 
        } 
      } 
    } 
    for (m = -3; m < 4; m++) {
      for (int n = -3; n < 4; n++) {
        Block bid = world.getBlock(x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves3, 0, 2); 
      } 
    } 
    y++;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        Block bid = world.getBlock(x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockFast(world, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves3, 0, 2); 
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
