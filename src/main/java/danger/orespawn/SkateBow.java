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
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkateBow extends Item {
  public SkateBow(int par1) {
    this.maxStackSize = 1;
    setMaxDamage(300);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {}
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {}
  
  public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
    int var6 = getMaxItemUseDuration(par1ItemStack) - par4;
    boolean flag = (par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0);
    if (flag || par3EntityPlayer.inventory.hasItem(OreSpawnMain.MyIrukandjiArrow)) {
      float f = var6 / 20.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      if (f < 0.1D)
        return; 
      if (f > 1.75F)
        f = 1.75F; 
      IrukandjiArrow var8 = new IrukandjiArrow(par2World, par3EntityPlayer, f);
      if (par2World.rand.nextInt(20) == 1)
        var8.setIsCritical(true); 
      int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);
      if (var10 > 0)
        var8.setKnockbackStrength(var10); 
      if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
        var8.setFire(100); 
      par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityPlayer);
      par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);
      if (!flag)
        par3EntityPlayer.inventory.consumeInventoryItem(OreSpawnMain.MyIrukandjiArrow); 
      if (!par2World.isRemote)
        par2World.spawnEntityInWorld((Entity)var8); 
    } 
  }
  
  public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    return par1ItemStack;
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 9000;
  }
  
  public EnumAction getItemUseAction(ItemStack par1ItemStack) {
    return EnumAction.bow;
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
    return par1ItemStack;
  }
  
  public int getItemEnchantability() {
    return 50;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
