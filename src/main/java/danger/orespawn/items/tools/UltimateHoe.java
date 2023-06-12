package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import javax.annotation.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraftforge.event.*;
import net.minecraft.block.properties.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import java.util.*;

public class UltimateHoe extends ItemHoe
{
    public UltimateHoe() {
        super(OrespawnToolMaterial.UltimateTools.Material);
        this.setUnlocalizedName("ultimate_hoe");
        this.setRegistryName("ultimate_hoe");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
    
    @ParametersAreNonnullByDefault
    public void onUpdate(final ItemStack stack, final World world, final Entity player, final int itemSlot, final boolean isSelected) {
        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantments.EFFICIENCY, 2);
        }
        super.onUpdate(stack, world, player, itemSlot, isSelected);
    }
    
    public EnumActionResult onItemUse(final EntityPlayer player, final World worldIn, final BlockPos pos, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
        final ItemStack itemstack = player.getHeldItem(hand);
        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
            return EnumActionResult.FAIL;
        }
        final int hook = ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
        if (hook != 0) {
            return (hook > 0) ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
        }
        final IBlockState iblockstate = worldIn.getBlockState(pos);
        final Block original = iblockstate.getBlock();
        if (facing == EnumFacing.DOWN || !worldIn.isAirBlock(pos.up())) {
            return EnumActionResult.PASS;
        }
        if (original != Blocks.DIRT && original != Blocks.GRASS) {
            return EnumActionResult.PASS;
        }
        worldIn.setBlockState(pos, Blocks.FARMLAND.getDefaultState().withProperty((IProperty)BlockFarmland.MOISTURE, (Comparable)7));
        final List<BlockPos> blockPositions = new ArrayList<BlockPos>();
        blockPositions.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()));
        blockPositions.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1));
        blockPositions.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1));
        blockPositions.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()));
        blockPositions.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1));
        blockPositions.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1));
        blockPositions.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1));
        blockPositions.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1));
        for (final BlockPos blockPosition : blockPositions) {
            if (worldIn.getBlockState(blockPosition).getBlock() == Blocks.GRASS || worldIn.getBlockState(blockPosition).getBlock() == Blocks.DIRT) {
                final BlockPos abovePos = new BlockPos(blockPosition.getX(), blockPosition.getY() + 1, blockPosition.getZ());
                final Block blockAbove = worldIn.getBlockState(abovePos).getBlock();
                if (blockAbove == Blocks.AIR) {
                    worldIn.setBlockState(blockPosition, Blocks.FARMLAND.getDefaultState().withProperty((IProperty)BlockFarmland.MOISTURE, (Comparable)7));
                }
                else {
                    if (blockAbove != Blocks.GRASS && blockAbove != Blocks.DIRT) {
                        continue;
                    }
                    final BlockPos abovePos2 = new BlockPos(abovePos.getX(), abovePos.getY() + 1, abovePos.getZ());
                    final Block blockAbove2 = worldIn.getBlockState(abovePos2).getBlock();
                    if (blockAbove2 != Blocks.AIR) {
                        continue;
                    }
                    worldIn.setBlockState(abovePos, Blocks.FARMLAND.getDefaultState().withProperty((IProperty)BlockFarmland.MOISTURE, (Comparable)7));
                }
            }
            else {
                if (worldIn.getBlockState(blockPosition).getBlock() != Blocks.AIR) {
                    continue;
                }
                final BlockPos underPos = new BlockPos(blockPosition.getX(), blockPosition.getY() - 1, blockPosition.getZ());
                final Block blockUnder = worldIn.getBlockState(underPos).getBlock();
                if (worldIn.getBlockState(underPos).getBlock() != Blocks.DIRT && worldIn.getBlockState(underPos).getBlock() != Blocks.GRASS) {
                    continue;
                }
                worldIn.setBlockState(underPos, Blocks.FARMLAND.getDefaultState().withProperty((IProperty)BlockFarmland.MOISTURE, (Comparable)7));
            }
        }
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
        return EnumActionResult.SUCCESS;
    }
}
