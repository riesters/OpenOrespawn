package danger.orespawn.items;

import net.minecraft.item.*;
import danger.orespawn.*;
import danger.orespawn.init.*;

public class ItemBasic extends Item
{
    public ItemBasic(final String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add(this);
    }
}
