package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class NightmareSword extends ItemSword {
  public NightmareSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.maxStackSize = 1;
    setMaxDamage(1200);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.sharpness, 1);
    par1ItemStack.addEnchantment(Enchantment.knockback, 3);
    par1ItemStack.addEnchantment(Enchantment.fireAspect, 1);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, stack);
    if (lvl <= 0) {
      stack.addEnchantment(Enchantment.sharpness, 1);
      stack.addEnchantment(Enchantment.knockback, 3);
      stack.addEnchantment(Enchantment.fireAspect, 1);
    } 
  }
  
  public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
    onUsingTick(stack, (EntityPlayer)null, 0);
  }
  
  public String getMaterialName() {
    return "Uranium/Titanium";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
    par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
    return true;
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 5000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
