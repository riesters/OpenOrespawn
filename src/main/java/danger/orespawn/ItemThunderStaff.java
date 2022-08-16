package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemThunderStaff extends Item
{
    private int ticker;
    
    public ItemThunderStaff() {
        this.ticker = 50;
        this.maxStackSize = 1;
        this.setMaxDamage(50);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() <= 1) {
            return par1ItemStack;
        }
        final double xzoff = 1.0;
        final double yoff = 1.55;
        final ThunderBolt lb = new ThunderBolt(par2World, par3EntityPlayer);
        lb.setLocationAndAngles(par3EntityPlayer.posX - xzoff * Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead + 45.0f)), par3EntityPlayer.posY + yoff, par3EntityPlayer.posZ + xzoff * Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead + 45.0f)), par3EntityPlayer.rotationYawHead, par3EntityPlayer.rotationPitch);
        lb.motionX *= 3.0;
        lb.motionY *= 3.0;
        lb.motionZ *= 3.0;
        par2World.spawnEntityInWorld(lb);
        par3EntityPlayer.swingItem();
        par3EntityPlayer.addVelocity(Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 0.5, 0.15, Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 0.5);
        par1ItemStack.damageItem(1, par3EntityPlayer);
        return par1ItemStack;
    }
    
    public void onUpdate(final ItemStack par1ItemStack, final World world, final Entity par3Entity, final int par4, final boolean par5) {
        if (world.isRaining() && world.isThundering()) {
            if (this.ticker > 0) {
                --this.ticker;
            }
            if (this.ticker <= 0 && par1ItemStack.getItemDamage() > 0) {
                par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1);
                this.ticker = 50;
            }
        }
    }
    
    public String getMaterialName() {
        return "Unknown";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
