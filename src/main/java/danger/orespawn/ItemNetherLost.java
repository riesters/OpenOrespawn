package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNetherLost extends Item {
  public ItemNetherLost(int par1) {
    this.maxStackSize = 1;
    setMaxDamage(3000);
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.sharpness, 2);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
    if (lvl <= 0)
      stack.addEnchantment(Enchantment.sharpness, 2); 
  }
  
  public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
    EntityLivingBase e = null;
    EntityPlayer p = null;
    onUsingTick(stack, (EntityPlayer)null, 0);
    if (par2World == null)
      return; 
    if (par3Entity != null && 
      par3Entity instanceof EntityLivingBase) {
      e = (EntityLivingBase)par3Entity;
      if (e instanceof EntityPlayer) {
        p = (EntityPlayer)e;
        ItemStack is = p.getCurrentEquippedItem();
        if (is != null) {
          Item it = is.getItem();
          if (it != null)
            if (it instanceof ItemNetherLost && 
              par2World.provider.dimensionId == -1) {
              Block i = par2World.getBlock((int)p.posX, (int)p.posY - 1, (int)p.posZ);
              if (i == Blocks.netherrack)
                par2World.setBlock((int)p.posX, (int)p.posY - 1, (int)p.posZ, Blocks.quartz_block); 
            }  
        } 
      } 
    } 
  }
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 3000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
