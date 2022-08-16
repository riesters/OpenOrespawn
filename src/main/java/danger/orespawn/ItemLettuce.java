package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemLettuce extends ItemSeedFood
{
    public ItemLettuce(final int par2, final float par3, final Block par4, final Block par5) {
        super(par2, par3, par4, par5);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
