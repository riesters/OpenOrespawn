package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class ItemAppleSeed extends Item {
  public ItemAppleSeed(int i) {
    this.maxStackSize = 16;
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
    if (!world.isRemote) {
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.farmland)
        return false; 
      if (this == OreSpawnMain.MyAppleSeed) {
        makeTree(world, x, y, z, OreSpawnMain.MyAppleLeaves, (Chunk)null);
      } else if (this == OreSpawnMain.MyCherrySeed) {
        makeTree(world, x, y, z, OreSpawnMain.MyCherryLeaves, (Chunk)null);
      } else {
        makeTree(world, x, y, z, OreSpawnMain.MyPeachLeaves, (Chunk)null);
      } 
    } 
    if (!par2EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    return true;
  }
  
  public void makeTree(World world, int x, int y, int z, Block blkid, Chunk chunk) {
    Block bid = world.getBlock(x, y, z);
    if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.farmland)
      return; 
    int h1 = 12;
    int h2 = 6;
    int h3 = 9;
    int h4 = 6;
    int h5 = 14;
    int w1 = 5;
    int w2 = 3;
    if (blkid == OreSpawnMain.MyPeachLeaves) {
      h1 = 10;
      h2 = 5;
      h3 = 7;
      h4 = 5;
      h5 = 12;
      w1 = 4;
      w2 = 2;
    } 
    if (blkid == OreSpawnMain.MyCherryLeaves) {
      h1 = 8;
      h2 = 3;
      h3 = 5;
      h4 = 3;
      h5 = 10;
      w1 = 3;
      w2 = 1;
    } 
    int j;
    for (j = 1; j < h1; j++)
      world.setBlock(x, y + j, z, Blocks.log, 0, 2); 
    for (j = 1; j < w1; ) {
      OreSpawnMain.setBlockSuperFast(world, x + j, y + h2, z, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w1; ) {
      OreSpawnMain.setBlockSuperFast(world, x - j, y + h2, z, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w1; ) {
      OreSpawnMain.setBlockSuperFast(world, x, y + h2, z + j, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w1; ) {
      OreSpawnMain.setBlockSuperFast(world, x, y + h2, z - j, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w2; ) {
      OreSpawnMain.setBlockSuperFast(world, x + j, y + h3, z, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w2; ) {
      OreSpawnMain.setBlockSuperFast(world, x - j, y + h3, z, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w2; ) {
      OreSpawnMain.setBlockSuperFast(world, x, y + h3, z + j, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (j = 1; j < w2; ) {
      OreSpawnMain.setBlockSuperFast(world, x, y + h3, z - j, Blocks.log, 0, 2, chunk);
      j++;
    } 
    for (int i = h4; i < h5; i++) {
      int width = 6;
      if (i > 8)
        width = 5; 
      if (i > 10)
        width = 4; 
      if (blkid != OreSpawnMain.MyAppleLeaves)
        width--; 
      for (j = -width; j <= width; j++) {
        for (int k = -width; k <= width; k++) {
          bid = world.getBlock(x + k, y + i, z + j);
          if (bid == Blocks.air)
            OreSpawnMain.setBlockSuperFast(world, x + k, y + i, z + j, blkid, 0, 2, chunk); 
        } 
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
