package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class BigHammer extends ItemSword {
  private int weaponDamage;
  
  private final Item.ToolMaterial toolMaterial;
  
  public BigHammer(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.toolMaterial = par2EnumToolMaterial;
    this.weaponDamage = 15;
    this.maxStackSize = 1;
    setMaxDamage(9000);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public String getMaterialName() {
    return "AMETHYST";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
    int var2 = 5;
    if (par2EntityLiving != null && 
      !par2EntityLiving.worldObj.isRemote)
      par2EntityLiving.addVelocity(0.0D, Math.abs(par2EntityLiving.worldObj.rand.nextFloat() * 2.0F / 3.0F), 0.0D); 
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
