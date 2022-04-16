package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UltimateShovel extends ItemSpade {
  public UltimateShovel(int par1, Item.ToolMaterial par2) {
    super(par2);
    this.maxStackSize = 1;
    setMaxDamage(3000);
    setCreativeTab(CreativeTabs.tabTools);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.efficiency, 5);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, stack);
    if (lvl <= 0)
      stack.addEnchantment(Enchantment.efficiency, 5); 
  }
  
  public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
    onUsingTick(stack, (EntityPlayer)null, 0);
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (entity != null && OreSpawnMain.ultimate_sword_pvp == 0) {
      if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend)
        return true; 
      if (entity instanceof EntityTameable) {
        EntityTameable t = (EntityTameable)entity;
        if (t.isTamed())
          return true; 
      } 
    } 
    return false;
  }
  
  public int getDamageVsEntity(Entity par1Entity) {
    if (par1Entity instanceof Girlfriend)
      return 1; 
    if (par1Entity instanceof EntityPlayer)
      return 1; 
    return 5;
  }
  
  public String getMaterialName() {
    return "Uranium/Titanium";
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
