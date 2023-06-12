package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class GenericAxe extends ItemAxe
{
    public GenericAxe(final String name, final OrespawnToolMaterial material) {
        super(material.Material, material.Damage, -3.0f);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
