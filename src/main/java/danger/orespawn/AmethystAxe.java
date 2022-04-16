package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class AmethystAxe extends ItemAxe {
  private int weaponDamage = 12;
  
  public AmethystAxe(int par1, Item.ToolMaterial par2) {
    super(par2);
    this.maxStackSize = 1;
    setMaxDamage(2000);
    setCreativeTab(CreativeTabs.tabTools);
  }
  
  public int getDamageVsEntity(Entity par1Entity) {
    return this.weaponDamage;
  }
  
  public String getMaterialName() {
    return "Amethyst";
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
