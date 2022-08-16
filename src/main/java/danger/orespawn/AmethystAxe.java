package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class AmethystAxe extends ItemAxe
{
    private final int weaponDamage;
    
    public AmethystAxe(final Item.ToolMaterial par2) {
        super(par2);
        this.weaponDamage = 12;
        this.maxStackSize = 1;
        this.setMaxDamage(2000);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public int getDamageVsEntity() {
        return this.weaponDamage;
    }
    
    public String getMaterialName() {
        return "Amethyst";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
