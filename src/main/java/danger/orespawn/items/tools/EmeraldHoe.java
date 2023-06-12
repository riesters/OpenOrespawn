package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class EmeraldHoe extends ItemHoe
{
    public EmeraldHoe() {
        super(OrespawnToolMaterial.EmeraldTools.Material);
        this.setUnlocalizedName("emerald_hoe");
        this.setRegistryName("emerald_hoe");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
