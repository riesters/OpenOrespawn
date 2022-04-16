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

public class Slice extends ItemSword {
  public Slice(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.maxStackSize = 1;
    setMaxDamage(2600);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.sharpness, 5);
    par1ItemStack.addEnchantment(Enchantment.baneOfArthropods, 1);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
    if (lvl <= 0) {
      stack.addEnchantment(Enchantment.sharpness, 5);
      stack.addEnchantment(Enchantment.baneOfArthropods, 1);
    } 
  }
  
  public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
    onUsingTick(stack, (EntityPlayer)null, 0);
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (entity != null && (
      entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend))
      return true; 
    return false;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving != null && entityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)entityLiving;
      double xzoff = 2.0D;
      double yoff = 1.55D;
      BerthaHit lb = new BerthaHit(p.worldObj, (EntityLivingBase)p);
      lb.setLocationAndAngles(p.posX - xzoff * Math.sin(Math.toRadians(p.rotationYawHead)), p.posY + yoff, p.posZ + xzoff * Math.cos(Math.toRadians(p.rotationYawHead)), p.rotationYawHead, p.rotationPitch);
      lb.motionX *= 2.0D;
      lb.motionY *= 2.0D;
      lb.motionZ *= 2.0D;
      p.worldObj.spawnEntityInWorld((Entity)lb);
      stack.damageItem(1, (EntityLivingBase)p);
    } 
    return false;
  }
  
  public String getMaterialName() {
    return "Uranium/Titanium";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
    par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
    return true;
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 9000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
