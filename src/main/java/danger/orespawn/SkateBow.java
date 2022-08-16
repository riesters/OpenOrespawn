package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class SkateBow extends Item
{
    public SkateBow() {
        this.maxStackSize = 1;
        this.setMaxDamage(300);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
    }
    
    public void onPlayerStoppedUsing(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer, final int par4) {
        final int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;
        final boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;
        if (flag || par3EntityPlayer.inventory.hasItem(OreSpawnMain.MyIrukandjiArrow)) {
            float f = var6 / 20.0f;
            f = (f * f + f * 2.0f) / 3.0f;
            if (f < 0.1) {
                return;
            }
            if (f > 1.75f) {
                f = 1.75f;
            }
            final IrukandjiArrow var7 = new IrukandjiArrow(par2World, par3EntityPlayer, f);
            if (par2World.rand.nextInt(20) == 1) {
                var7.setIsCritical(true);
            }
            final int var8 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);
            if (var8 > 0) {
                var7.setKnockbackStrength(var8);
            }
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0) {
                var7.setFire(100);
            }
            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0f, 1.0f / (SkateBow.itemRand.nextFloat() * 0.4f + 1.2f) + 0.5f);
            if (!flag) {
                par3EntityPlayer.inventory.consumeInventoryItem(OreSpawnMain.MyIrukandjiArrow);
            }
            if (!par2World.isRemote) {
                par2World.spawnEntityInWorld(var7);
            }
        }
    }

    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 9000;
    }
    
    public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
        return EnumAction.bow;
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public int getItemEnchantability() {
        return 50;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
