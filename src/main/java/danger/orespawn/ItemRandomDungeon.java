package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRandomDungeon extends Item {
  Random rand = OreSpawnMain.OreSpawnRand;
  
  public ItemRandomDungeon(int i) {
    this.maxStackSize = 1;
    setCreativeTab(CreativeTabs.tabRedstone);
  }
  
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    par1ItemStack.addEnchantment(Enchantment.fortune, 2);
  }
  
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack);
    if (lvl <= 0)
      stack.addEnchantment(Enchantment.fortune, 2); 
  }
  
  public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
    onUsingTick(stack, (EntityPlayer)null, 0);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int clickedX, int clickedY, int clickedZ, int par7, float par8, float par9, float par10) {
    Block var1 = world.getBlock(clickedX, clickedY, clickedZ);
    if (var1 != Blocks.stone && var1 != Blocks.cobblestone && var1 != Blocks.grass && var1 != Blocks.dirt)
      return false; 
    if (clickedY < 40)
      return false; 
    if (!world.isRemote)
      world.setBlock(clickedX, clickedY + 1, clickedZ, OreSpawnMain.MyDungeonSpawnerBlock, 0, 2); 
    if (!par2EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
