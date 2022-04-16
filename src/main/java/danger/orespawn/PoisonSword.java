package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PoisonSword extends ItemSword {
  private int weaponDamage;
  
  private final Item.ToolMaterial toolMaterial;
  
  public PoisonSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.toolMaterial = par2EnumToolMaterial;
    this.weaponDamage = 15;
    this.maxStackSize = 1;
    setMaxDamage(1300);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.sharpness, 1);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
    if (lvl <= 0)
      stack.addEnchantment(Enchantment.sharpness, 1); 
  }
  
  public String getMaterialName() {
    return "Emerald";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
    int var2 = 5;
    if (par2EntityLiving != null) {
      var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
      par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 20, 0));
      var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
      par2EntityLiving.addPotionEffect(new PotionEffect(Potion.wither.id, var2 * 20, 0));
      var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
      par2EntityLiving.addPotionEffect(new PotionEffect(Potion.weakness.id, var2 * 20, 0));
    } 
    par1ItemStack.damageItem(1, par3EntityLiving);
    return true;
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 3000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
