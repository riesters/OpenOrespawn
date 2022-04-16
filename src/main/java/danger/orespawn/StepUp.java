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

public class StepUp extends Item {
  public StepUp(int i) {
    this.maxStackSize = 16;
    setCreativeTab(CreativeTabs.tabTools);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Player, World world, int cposx, int cposy, int cposz, int par7, float par8, float par9, float par10) {
    int deltax = 0, deltaz = 0;
    int length = 33;
    int x = cposx, y = cposy + 1, z = cposz;
    float f = Player.rotationYawHead;
    f += 22.5F;
    f %= 360.0F;
    f /= 45.0F;
    switch ((int)f) {
      case 0:
        deltax = 0;
        deltaz = 1;
        break;
      case 1:
        deltax = -1;
        deltaz = 1;
        break;
      case 2:
        deltax = -1;
        deltaz = 0;
        break;
      case 3:
        deltax = -1;
        deltaz = -1;
        break;
      case 4:
        deltax = 0;
        deltaz = -1;
        break;
      case 5:
        deltax = 1;
        deltaz = -1;
        break;
      case 6:
        deltax = 1;
        deltaz = 0;
        break;
      case 7:
        deltax = 1;
        deltaz = 1;
        break;
    } 
    if (deltax == 0 && deltaz == 0)
      return false; 
    Player.worldObj.playSoundAtEntity((Entity)Player, "random.explode", 1.0F, 1.5F);
    if (world.isRemote) {
      for (int var3 = 0; var3 < 6; var3++) {
        world.spawnParticle("largesmoke", (x + world.rand.nextFloat() - world.rand.nextFloat()), (y + world.rand.nextFloat() + 1.0F), (z + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
        world.spawnParticle("largeexplode", (x + world.rand.nextFloat() - world.rand.nextFloat()), (y + world.rand.nextFloat() + 1.0F), (z + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
        world.spawnParticle("reddust", (x + world.rand.nextFloat() - world.rand.nextFloat()), (y + world.rand.nextFloat() + 1.0F), (z + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
      } 
      return true;
    } 
    for (int k = 1; k < length; ) {
      Block bid = world.getBlock(x + k * deltax, y + k - 1, z + k * deltaz);
      if (bid == Blocks.air) {
        world.setBlock(x + k * deltax, y + k - 1, z + k * deltaz, Blocks.cobblestone, 0, 2);
        if ((k - 1) % 8 == 0) {
          bid = world.getBlock(x + k * deltax, y + k, z + k * deltaz);
          if (bid == Blocks.air)
            world.setBlock(x + k * deltax, y + k, z + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2); 
        } 
        k++;
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
