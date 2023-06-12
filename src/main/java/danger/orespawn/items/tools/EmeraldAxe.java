package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class EmeraldAxe extends ItemAxe
{
    public EmeraldAxe() {
        super(OrespawnToolMaterial.EmeraldTools.Material, OrespawnToolMaterial.EmeraldTools.Damage, -3.0f);
        this.setUnlocalizedName("emerald_axe");
        this.setRegistryName("emerald_axe");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
