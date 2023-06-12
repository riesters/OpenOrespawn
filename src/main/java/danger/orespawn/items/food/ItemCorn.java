package danger.orespawn.items.food;

import mcp.*;
import net.minecraft.init.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

@MethodsReturnNonnullByDefault
public class ItemCorn extends ItemSeedFood
{
    public ItemCorn() {
        super(1, 1.0f, ModBlocks.CORN_PLANT, Blocks.FARMLAND);
        this.setUnlocalizedName("corn");
        this.setRegistryName("corn");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
    
    public IBlockState getPlant(final IBlockAccess world, final BlockPos pos) {
        return ModBlocks.CORN_PLANT.getDefaultState();
    }
}
