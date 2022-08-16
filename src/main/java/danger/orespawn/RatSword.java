package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class RatSword extends ItemSword
{

    public RatSword(final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(1300);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public String getMaterialName() {
        return "Rat";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        if (par2EntityLiving != null && !par2EntityLiving.worldObj.isRemote) {
            for (int num = 1 + par2EntityLiving.worldObj.rand.nextInt(6), i = 0; i < num; ++i) {
                Rat r;
                r = (Rat)spawnCreature(par2EntityLiving.worldObj, 0, "Rat", par2EntityLiving.posX + (par2EntityLiving.worldObj.rand.nextFloat() - par2EntityLiving.worldObj.rand.nextFloat()) * 0.5, par2EntityLiving.posY + par2EntityLiving.worldObj.rand.nextFloat() + 0.01, par2EntityLiving.posZ + (par2EntityLiving.worldObj.rand.nextFloat() - par2EntityLiving.worldObj.rand.nextFloat()) * 0.5);
                if (r != null) {
                    r.setOwner(par3EntityLiving);
                }
            }
        }
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public static Entity spawnCreature(final World par0World, final int par1, final String name, final double par2, final double par4, final double par6) {
        Entity var8;
        if (name == null) {
            var8 = EntityList.createEntityByID(par1, par0World);
        }
        else {
            var8 = EntityList.createEntityByName(name, par0World);
        }
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
