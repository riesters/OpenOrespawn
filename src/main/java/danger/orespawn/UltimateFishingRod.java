package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UltimateFishingRod extends Item {
  public UltimateFishingRod(int par1) {
    setMaxDamage(3000);
    setMaxStackSize(1);
    setCreativeTab(CreativeTabs.tabTools);
  }
  
  public boolean isFull3D() {
    return true;
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.unbreaking, 2);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
    if (lvl <= 0)
      stack.addEnchantment(Enchantment.unbreaking, 2); 
  }
  
  public boolean shouldRotateAroundWhenRendering() {
    return true;
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    if (par3EntityPlayer.fishEntity != null) {
      int var4 = par3EntityPlayer.fishEntity.func_146034_e();
      par1ItemStack.damageItem(var4, (EntityLivingBase)par3EntityPlayer);
      par3EntityPlayer.swingItem();
    } else {
      par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
      if (!par2World.isRemote)
        par2World.spawnEntityInWorld((Entity)new UltimateFishHook(par2World, par3EntityPlayer)); 
      par3EntityPlayer.swingItem();
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
