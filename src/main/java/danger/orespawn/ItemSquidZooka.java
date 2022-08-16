package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemSquidZooka extends Item
{
    public ItemSquidZooka() {
        this.maxStackSize = 1;
        this.setMaxDamage(100);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() <= 1) {
            return par1ItemStack;
        }
        par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 0.5f, 0.5f);
        if (!par2World.isRemote) {
            final double xzoff = 2.5;
            final double yoff = 1.65;
            final Entity e = spawnCreature(par2World, "Attack Squid", par3EntityPlayer.posX - xzoff * Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead + 15.0f)), par3EntityPlayer.posY + yoff, par3EntityPlayer.posZ + xzoff * Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead + 15.0f)));
            if (e instanceof AttackSquid) {
                final AttackSquid a = (AttackSquid)e;
                a.setWasShot();
            }
            final float f = 3.6f;
            e.motionX = -MathHelper.sin(par3EntityPlayer.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(par3EntityPlayer.rotationPitch / 180.0f * 3.1415927f) * f;
            e.motionZ = MathHelper.cos(par3EntityPlayer.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(par3EntityPlayer.rotationPitch / 180.0f * 3.1415927f) * f;
            e.motionY = -MathHelper.sin(par3EntityPlayer.rotationPitch / 180.0f * 3.1415927f) * f;
            e.motionX += (par2World.rand.nextFloat() - par2World.rand.nextFloat()) * 0.05;
            e.motionY += (par2World.rand.nextFloat() - par2World.rand.nextFloat()) * 0.05;
            e.motionZ += (par2World.rand.nextFloat() - par2World.rand.nextFloat()) * 0.05;
        }
        par3EntityPlayer.swingItem();
        par3EntityPlayer.addVelocity(Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 0.45, 0.1, Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 0.45);
        par1ItemStack.damageItem(1, par3EntityPlayer);
        return par1ItemStack;
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8;
        var8 = EntityList.createEntityByName(par1, par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
        }
        return var8;
    }
    
    public String getMaterialName() {
        return "Unknown";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
