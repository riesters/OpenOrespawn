package danger.orespawn.items;

import danger.orespawn.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;
import net.minecraftforge.common.*;

public class ItemButterflySeed extends Item implements IPlantable
{
    public ItemButterflySeed() {
        this.setUnlocalizedName("butterfly_seed");
        this.setRegistryName("butterfly_seed");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add(this);
    }
    
    public EnumActionResult onItemUse(final EntityPlayer player, final World worldIn, final BlockPos pos, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
        final ItemStack stack = player.getHeldItem(hand);
        final IBlockState state = worldIn.getBlockState(pos);
        if (facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, (IBlockAccess)worldIn, pos, EnumFacing.UP, (IPlantable)this) && worldIn.isAirBlock(pos.up())) {
            worldIn.setBlockState(pos.up(), ModBlocks.BUTTERFLY_PLANT.getDefaultState());
            if (!player.capabilities.isCreativeMode && !worldIn.isRemote) {
                stack.shrink(1);
            }
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }
    
    public EnumPlantType getPlantType(final IBlockAccess world, final BlockPos pos) {
        return EnumPlantType.Crop;
    }
    
    public IBlockState getPlant(final IBlockAccess world, final BlockPos pos) {
        return ModBlocks.BUTTERFLY_PLANT.getDefaultState();
    }
}
