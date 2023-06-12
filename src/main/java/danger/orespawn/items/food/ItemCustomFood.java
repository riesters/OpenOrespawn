package danger.orespawn.items.food;

import danger.orespawn.init.*;
import net.minecraft.item.*;

public class ItemCustomFood extends ItemFood
{
    public ItemCustomFood(final String name, final int amount, final boolean isWolfFood) {
        super(amount, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        ModItems.ITEMS.add((Item)this);
    }
}
