package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class InstantShelter extends Item {
  public InstantShelter(int i) {
    this.maxStackSize = 16;
    setCreativeTab(CreativeTabs.tabRedstone);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
    int deltax = 0, deltaz = 0;
    int bid = 0;
    int dirx = 0, dirz = 0;
    int stuffdir = 0;
    int length = 3, width = length;
    int height = 3;
    if (cposx < 0)
      dirx = -1; 
    if (cposz < 0)
      dirz = -1; 
    int pposx = (int)(Player.posX + 0.99D * dirx);
    int pposy = (int)Player.posY;
    int pposz = (int)(Player.posZ + 0.99D * dirz);
    if (cposx - pposx == 0 || cposz - pposz == 0) {
      int x = cposx, y = pposy - 1, z = cposz;
      if (x - pposx < 0) {
        deltax = -1;
        stuffdir = 3;
      } 
      if (x - pposx > 0) {
        deltax = 1;
        stuffdir = 2;
      } 
      if (z - pposz < 0) {
        deltaz = -1;
        stuffdir = 5;
      } 
      if (z - pposz > 0) {
        deltaz = 1;
        stuffdir = 4;
      } 
      if (deltax == 0 && deltaz == 0)
        return false; 
      if (deltax != 0 && deltaz != 0)
        return false; 
      x = pposx;
      z = pposz;
      Player.worldObj.playSoundAtEntity((Entity)Player, "random.explode", 1.0F, 1.5F);
      if (world.isRemote)
        return true; 
      int i;
      for (i = -width; i <= width; i++) {
        for (int m = -length; m <= length; m++) {
          for (int n = 0; n <= height + 1; n++) {
            if (n == height + 1) {
              world.setBlock(x + i, y + n, z + m, Blocks.planks);
            } else if (n == 0) {
              world.setBlock(x + i, y + n, z + m, Blocks.cobblestone);
            } else if (i == width || m == length || i == -width || m == -length) {
              if (n == height) {
                world.setBlock(x + i, y + n, z + m, Blocks.glass);
              } else if ((n == 1 || n == 2) && i == deltax * width && m == deltaz * length) {
                world.setBlock(x + i, y + n, z + m, Blocks.air);
              } else {
                world.setBlock(x + i, y + n, z + m, Blocks.planks);
              } 
            } else {
              world.setBlock(x + i, y + n, z + m, Blocks.air);
            } 
          } 
        } 
      } 
      i = 2;
      int k = 1, j = length - 1;
      world.setBlock(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.furnace);
      world.setBlockMetadataWithNotify(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, stuffdir, 3);
      i = 1;
      world.setBlock(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.crafting_table);
      i = 0;
      world.setBlock(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, (Block)Blocks.chest);
      world.setBlockMetadataWithNotify(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, stuffdir, 3);
      TileEntityChest chest = (TileEntityChest)world.getTileEntity(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax);
      if (chest != null) {
        chest.setInventorySlotContents(0, new ItemStack(Items.compass));
        chest.setInventorySlotContents(1, new ItemStack((Item)Items.map));
        chest.setInventorySlotContents(2, new ItemStack(Items.porkchop, 8));
        chest.setInventorySlotContents(3, new ItemStack(Blocks.torch, 32));
        chest.setInventorySlotContents(4, new ItemStack(Items.coal, 16));
        chest.setInventorySlotContents(5, new ItemStack(Items.bed));
        chest.setInventorySlotContents(6, new ItemStack(Items.bed));
        chest.setInventorySlotContents(7, new ItemStack(Items.wooden_door));
        chest.setInventorySlotContents(8, new ItemStack(Items.iron_pickaxe));
        chest.setInventorySlotContents(9, new ItemStack(Items.iron_sword));
        chest.setInventorySlotContents(10, new ItemStack(Items.iron_axe));
        chest.setInventorySlotContents(11, new ItemStack(Items.bucket));
        chest.setInventorySlotContents(12, new ItemStack(OreSpawnMain.MyOreSaltBlock, 4));
        chest.setInventorySlotContents(13, new ItemStack((Block)Blocks.chest));
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
