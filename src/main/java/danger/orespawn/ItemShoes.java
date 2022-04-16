package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShoes extends Item {
  private int my_id = 0;
  
  public ItemShoes(int i, int j) {
    this.my_id = j;
    this.maxStackSize = 64;
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    if (!par3EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
    if (!par2World.isRemote)
      par2World.spawnEntityInWorld((Entity)new Shoes(par2World, (EntityLivingBase)par3EntityPlayer, this.my_id)); 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
