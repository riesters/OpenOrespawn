package danger.orespawn.recipes;

import net.minecraft.item.*;
import danger.orespawn.init.*;
import net.minecraftforge.fml.common.registry.*;

public class SmeltingRecipes
{
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.URANIUM_ORE), new ItemStack(ModItems.URANIUM_NUGGET), 0.4f);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.TITANIUM_ORE), new ItemStack(ModItems.TITANIUM_NUGGET), 0.4f);
    }
}
