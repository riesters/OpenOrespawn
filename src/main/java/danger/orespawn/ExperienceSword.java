package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ExperienceSword extends ItemSword
{
    private final int weaponDamage;
    private World worldObj;
    private World worldObjr;
    
    public ExperienceSword(final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.worldObj = null;
        this.worldObjr = null;
        this.weaponDamage = 15;
        this.maxStackSize = 1;
        this.setMaxDamage(1400);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.sharpness, 2);
        par1ItemStack.addEnchantment(Enchantment.unbreaking, 3);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.sharpness, 2);
            stack.addEnchantment(Enchantment.unbreaking, 3);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        EntityLivingBase e;
        ItemOreSpawnArmor ia;
        EntityPlayer p = null;
        this.onUsingTick(stack, null, 0);
        if (this.worldObj == null && !par2World.isRemote) {
            this.worldObj = par2World;
        }
        if (this.worldObjr == null && par2World.isRemote) {
            this.worldObjr = par2World;
        }
        if (par2World.rand.nextInt(60) == 1 && par3Entity instanceof EntityLivingBase) {
            e = (EntityLivingBase)par3Entity;
            if (e instanceof EntityPlayer) {
                p = (EntityPlayer)e;
            }
            for (int i = 1; i < 5; ++i) {
                assert p != null;
                final ItemStack is = p.getEquipmentInSlot(i);
                if (is != null) {
                    final Item it = is.getItem();
                    if (it instanceof ItemOreSpawnArmor) {
                        ia = (ItemOreSpawnArmor)it;
                        if (ia.get_armor_material() == 4) {
                            switch (ia.get_armor_type()) {
                                case 0: {
                                    if (!par2World.isRemote && par2World.rand.nextInt(10) == 1) {
                                        p.addExperience(1);
                                    }
                                    par2World.spawnParticle("portal", e.posX, e.posY + 1.5, e.posZ, par2World.rand.nextGaussian(), par2World.rand.nextGaussian(), par2World.rand.nextGaussian());
                                    break;
                                }
                                case 1: {
                                    if (!par2World.isRemote && par2World.rand.nextInt(20) == 1) {
                                        p.addExperience(1);
                                    }
                                    par2World.spawnParticle("portal", e.posX, e.posY + 1.25, e.posZ, par2World.rand.nextGaussian(), par2World.rand.nextGaussian(), par2World.rand.nextGaussian());
                                    break;
                                }
                                case 2: {
                                    if (!par2World.isRemote && par2World.rand.nextInt(30) == 1) {
                                        p.addExperience(1);
                                    }
                                    par2World.spawnParticle("portal", e.posX, e.posY + 0.75, e.posZ, par2World.rand.nextGaussian(), par2World.rand.nextGaussian(), par2World.rand.nextGaussian());
                                    break;
                                }
                                case 3: {
                                    if (!par2World.isRemote && par2World.rand.nextInt(40) == 1) {
                                        p.addExperience(1);
                                    }
                                    par2World.spawnParticle("portal", e.posX, e.posY + 0.25, e.posZ, par2World.rand.nextGaussian(), par2World.rand.nextGaussian(), par2World.rand.nextGaussian());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int getDamageVsEntity() {
        return this.weaponDamage;
    }
    
    public String getMaterialName() {
        return "Emerald";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        float i = 0.0f;
        EntityPlayer p = null;
        if (par3EntityLiving instanceof EntityPlayer) {
            p = (EntityPlayer)par3EntityLiving;
        }
        if (par2EntityLiving instanceof EntityLiving) {
            i = 10.0f;
        }
        if (i > 0.0f && p != null) {
            p.addExperience((int)i);
        }
        if (p != null) {
            i = (float)(p.experienceLevel / 2);
            if (i > 0.0f && par2EntityLiving != null) {
                par2EntityLiving.attackEntityFrom(DamageSource.causePlayerDamage(p), i);
            }
        }
        if (this.worldObjr != null && par2EntityLiving != null) {
            for (int j = 0; j <= i / 2.0f; ++j) {
                this.worldObjr.spawnParticle("portal", par2EntityLiving.posX, par2EntityLiving.posY + 1.0, par2EntityLiving.posZ, this.worldObjr.rand.nextGaussian(), this.worldObjr.rand.nextGaussian(), this.worldObjr.rand.nextGaussian());
            }
        }
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
