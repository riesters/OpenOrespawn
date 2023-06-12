package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class EmeraldShovel extends ItemSpade
{
    public EmeraldShovel() {
        super(OrespawnToolMaterial.EmeraldTools.Material);
        this.setUnlocalizedName("emerald_shovel");
        this.setRegistryName("emerald_shovel");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
