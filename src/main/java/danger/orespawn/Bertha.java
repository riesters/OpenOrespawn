package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class Bertha extends ItemSword
{
    public Bertha(final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(9000);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (this == OreSpawnMain.MyRoyal) {
            par1ItemStack.addEnchantment(Enchantment.unbreaking, 5);
        }
        else if (this != OreSpawnMain.MyHammy) {
            par1ItemStack.addEnchantment(Enchantment.knockback, 5);
            par1ItemStack.addEnchantment(Enchantment.baneOfArthropods, 1);
            par1ItemStack.addEnchantment(Enchantment.fireAspect, 1);
        }
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, stack);
        if (lvl == 0) {
            lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
        }
        if (lvl <= 0) {
            if (this == OreSpawnMain.MyRoyal) {
                stack.addEnchantment(Enchantment.unbreaking, 5);
            }
            else if (this != OreSpawnMain.MyHammy) {
                stack.addEnchantment(Enchantment.knockback, 5);
                stack.addEnchantment(Enchantment.baneOfArthropods, 1);
                stack.addEnchantment(Enchantment.fireAspect, 1);
            }
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        this.onUsingTick(stack, null, 0);
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        if (entity != null && OreSpawnMain.big_bertha_pvp == 0) {
            if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
                return true;
            }
            if (entity instanceof EntityTameable) {
                final EntityTameable t = (EntityTameable)entity;
                return t.isTamed();
            }
        }
        return false;
    }
    
    public boolean onEntitySwing(final EntityLivingBase entityLiving, final ItemStack stack) {
        if (entityLiving != null && entityLiving instanceof EntityPlayer && !entityLiving.worldObj.isRemote) {
            final EntityPlayer p = (EntityPlayer)entityLiving;
            final double xzoff = 2.0;
            final double yoff = 1.55;
            final BerthaHit lb = new BerthaHit(p.worldObj, p);
            lb.setLocationAndAngles(p.posX - xzoff * Math.sin(Math.toRadians(p.rotationYawHead)), p.posY + yoff, p.posZ + xzoff * Math.cos(Math.toRadians(p.rotationYawHead)), p.rotationYawHead, p.rotationPitch);
            lb.motionX *= 2.0;
            lb.motionY *= 2.0;
            lb.motionZ *= 2.0;
            if (this == OreSpawnMain.MyRoyal) {
                lb.setHitType(2);
            }
            if (this == OreSpawnMain.MyHammy) {
                lb.setHitType(3);
            }
            p.worldObj.spawnEntityInWorld(lb);
            stack.damageItem(1, p);
        }
        return false;
    }
    
    public String getMaterialName() {
        return "Uranium/Titanium";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 9000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
