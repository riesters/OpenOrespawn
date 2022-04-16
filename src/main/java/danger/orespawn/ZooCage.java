package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ZooCage extends Item {
  private int cage_size = 2;
  
  public ZooCage(int i, int j) {
    this.maxStackSize = 16;
    setCreativeTab(CreativeTabs.tabDecorations);
    this.cage_size = j;
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
    int bid = 0;
    int dirx = 0, dirz = 0;
    int length = this.cage_size / 2 + 1, width = length, height = width;
    if (cposx < 0)
      dirx = -1; 
    if (cposz < 0)
      dirz = -1; 
    int x = (int)(Player.posX + 0.99D * dirx);
    int y = (int)Player.posY - 1;
    int z = (int)(Player.posZ + 0.99D * dirz);
    Player.worldObj.playSoundAtEntity((Entity)Player, "random.explode", 1.0F, 1.5F);
    if (world.isRemote)
      return true; 
    for (int i = -width; i <= width; i++) {
      for (int j = -length; j <= length; j++) {
        for (int k = 0; k <= height + 1; k++) {
          if (k == height + 1) {
            world.setBlock(x + i, y + k, z + j, Blocks.quartz_block);
          } else if (k == 0) {
            world.setBlock(x + i, y + k, z + j, Blocks.quartz_block);
          } else if (i == width || j == length || i == -width || j == -length) {
            world.setBlock(x + i, y + k, z + j, Blocks.glass);
          } else {
            world.setBlock(x + i, y + k, z + j, Blocks.air);
          } 
        } 
      } 
    } 
    if (!Player.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
