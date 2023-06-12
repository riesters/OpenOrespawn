package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class GenericHoe extends ItemHoe
{
    public GenericHoe(final String name, final OrespawnToolMaterial material) {
        super(material.Material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
