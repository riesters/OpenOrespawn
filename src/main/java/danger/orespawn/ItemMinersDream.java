package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMinersDream extends Item {
  public ItemMinersDream(int i) {
    this.maxStackSize = 16;
    setCreativeTab(CreativeTabs.tabRedstone);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
    int deltax = 0, deltaz = 0;
    int dirx = 0, dirz = 0;
    int height = 5, width = 5, length = 64;
    int torches = 5;
    int solid_count = 0;
    if (cposx < 0)
      dirx = -1; 
    if (cposz < 0)
      dirz = -1; 
    int pposx = (int)(Player.posX + 0.99D * dirx);
    int pposy = (int)Player.posY;
    int pposz = (int)(Player.posZ + 0.99D * dirz);
    if (cposx - pposx == 0 || cposz - pposz == 0) {
      int x = cposx, y = pposy, z = cposz;
      if (x - pposx < 0)
        deltax = -1; 
      if (x - pposx > 0)
        deltax = 1; 
      if (z - pposz < 0)
        deltaz = -1; 
      if (z - pposz > 0)
        deltaz = 1; 
      if (deltax == 0 && deltaz == 0)
        return false; 
      if (deltax != 0 && deltaz != 0)
        return false; 
      Player.worldObj.playSoundAtEntity((Entity)Player, "random.explode", 1.0F, 1.5F);
      if (world.isRemote)
        return true; 
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < length; j++) {
          solid_count = 0;
          int m;
          for (m = -width; m <= width; m++) {
            Block bid = world.getBlock(x + j * deltax + m * deltaz, y + i, z + j * deltaz + m * deltax);
            if (bid == Blocks.stone || bid == Blocks.dirt || bid == Blocks.gravel || bid == Blocks.flowing_water || bid == Blocks.water || bid == Blocks.flowing_lava || bid == Blocks.lava || bid == Blocks.netherrack || bid == Blocks.end_stone || bid == OreSpawnMain.CrystalStone)
              world.setBlock(x + j * deltax + m * deltaz, y + i, z + j * deltaz + m * deltax, Blocks.air, 0, 2); 
            if (i == height - 1) {
              bid = world.getBlock(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax);
              if (bid != Blocks.air)
                solid_count++; 
              if (bid == Blocks.air || bid == Blocks.gravel || bid == Blocks.sand || bid == Blocks.flowing_water || bid == Blocks.water || bid == Blocks.flowing_lava || bid == Blocks.lava)
                if (world.provider.dimensionId == OreSpawnMain.DimensionID5) {
                  world.setBlock(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, OreSpawnMain.CrystalStone, 0, 2);
                } else {
                  world.setBlock(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, Blocks.cobblestone, 0, 2);
                }  
            } 
          } 
          if (i == height - 1 && solid_count == 0)
            for (m = -width; m <= width; m++)
              world.setBlock(x + j * deltax + m * deltaz, y + i + 1, z + j * deltaz + m * deltax, Blocks.air, 0, 2);  
        } 
      } 
      int k;
      for (k = 0; k < length; k += torches) {
        Block bid = world.getBlock(x + k * deltax, y - 1, z + k * deltaz);
        if (bid == Blocks.stone || bid == Blocks.dirt || bid == Blocks.gravel || bid == Blocks.netherrack || bid == Blocks.end_stone || bid == Blocks.bedrock)
          if (world.isAirBlock(x + k * deltax, y, z + k * deltaz))
            world.setBlock(x + k * deltax, y, z + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);  
        if (bid == OreSpawnMain.CrystalStone)
          if (world.isAirBlock(x + k * deltax, y, z + k * deltaz))
            world.setBlock(x + k * deltax, y, z + k * deltaz, OreSpawnMain.CrystalTorch, 0, 2);  
      } 
      if (!Player.capabilities.isCreativeMode)
        par1ItemStack.stackSize--; 
      return true;
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
