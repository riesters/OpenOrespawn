package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {
  private int weaponDamage;
  
  private final Item.ToolMaterial toolMaterial;
  
  public RubySword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.toolMaterial = par2EnumToolMaterial;
    this.weaponDamage = 18;
    this.maxStackSize = 1;
    setMaxDamage(1500);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public int getDamageVsEntity(Entity par1Entity) {
    return this.weaponDamage;
  }
  
  public String getMaterialName() {
    return "Ruby";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
    par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
    return true;
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 4000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
