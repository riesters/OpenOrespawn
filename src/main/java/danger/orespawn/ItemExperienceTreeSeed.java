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

public class ItemExperienceTreeSeed extends Item {
  public ItemExperienceTreeSeed(int i) {
    this.maxStackSize = 1;
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
    if (!world.isRemote) {
      Block bid = world.getBlock(x, y, z);
      if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.farmland)
        return false; 
      world.setBlock(x, y + 1, z, OreSpawnMain.MyExperiencePlant, 0, 2);
    } else {
      for (int j1 = 0; j1 < 10; j1++)
        world.spawnParticle("happyVillager", (x + world.rand.nextFloat()), y + 1.0D + world.rand.nextFloat(), (z + world.rand.nextFloat()), 0.0D, 0.0D, 0.0D); 
    } 
    if (!par2EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
