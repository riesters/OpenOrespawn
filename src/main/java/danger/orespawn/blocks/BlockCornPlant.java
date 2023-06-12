package danger.orespawn.blocks;

import net.minecraft.block.material.*;
import net.minecraft.block.properties.*;
import danger.orespawn.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.item.*;
import danger.orespawn.init.*;
import net.minecraft.init.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.common.*;
import net.minecraft.block.state.*;
import net.minecraft.tileentity.*;

public class BlockCornPlant extends Block implements IPlantable, ITileEntityProvider
{
    public static final PropertyInteger STAGE;
    protected static final AxisAlignedBB CORN_AABB;
    
    public BlockCornPlant() {
        super(Material.PLANTS);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty)BlockCornPlant.STAGE, (Comparable)0));
        this.setUnlocalizedName("corn_plant");
        this.setRegistryName("corn_plant");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.setTickRandomly(true);
        this.setSoundType(SoundType.PLANT);
        ModBlocks.BLOCKS.add(this);
    }
    
    public AxisAlignedBB getBoundingBox(final IBlockState state, final IBlockAccess source, final BlockPos pos) {
        return BlockCornPlant.CORN_AABB;
    }
    
    public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
        if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR && this.checkForDrop(worldIn, pos, state)) {
            int height = 0;
            final int maxHeight = 21;
            for (int i = 1; worldIn.getBlockState(pos.down(i)).getBlock() == this; ++i) {
                final BlockPos position = pos.down(i);
                final BlockCornPlant plant = (BlockCornPlant)worldIn.getBlockState(position).getBlock();
                final TileEntityPlant tileEntity = (TileEntityPlant)worldIn.getTileEntity(pos);
                height += tileEntity.getHeightContribution();
            }
            if (ForgeHooks.onCropsGrowPre(worldIn, pos, state, true)) {
                if (height < maxHeight) {
                    final TileEntityPlant tileEntity2 = (TileEntityPlant)worldIn.getTileEntity(pos);
                    if (tileEntity2.getAge() == 15) {
                        tileEntity2.setAge(0);
                        final IBlockState currentState = worldIn.getBlockState(pos);
                        worldIn.setBlockState(pos.up(), this.getDefaultState());
                        worldIn.setBlockState(pos, ((int)currentState.getValue((IProperty)BlockCornPlant.STAGE) != 0) ? currentState : state.withProperty((IProperty)BlockCornPlant.STAGE, (Comparable)1));
                    }
                    else {
                        tileEntity2.setAge(tileEntity2.getAge() + 1);
                    }
                }
                else {
                    final TileEntityPlant tileEntity2 = (TileEntityPlant)worldIn.getTileEntity(pos);
                    if (tileEntity2.getAge() == 15) {
                        int phase = tileEntity2.getPhase();
                        if (phase != 4) {
                            if (phase <= 1) {
                                tileEntity2.setPhase(2);
                                phase = tileEntity2.getPhase();
                            }
                            int j;
                            for (j = 1; worldIn.getBlockState(pos.down(j)).getBlock() == this; ++j) {}
                            --j;
                            while (j != 0) {
                                final int stage = (int)worldIn.getBlockState(pos.down(j)).getValue((IProperty)BlockCornPlant.STAGE);
                                if (stage < phase) {
                                    break;
                                }
                                --j;
                            }
                            if (j >= 1) {
                                worldIn.setBlockState(pos.down(j), this.getDefaultState().withProperty((IProperty)BlockCornPlant.STAGE, (Comparable)(((int)worldIn.getBlockState(pos.down(j)).getValue((IProperty)BlockCornPlant.STAGE) < 3) ? ((int)worldIn.getBlockState(pos.down(j)).getValue((IProperty)BlockCornPlant.STAGE) + 1) : worldIn.getBlockState(pos.down(j)).getValue((IProperty)BlockCornPlant.STAGE))));
                            }
                            else {
                                tileEntity2.setPhase(tileEntity2.getPhase() + 1);
                            }
                        }
                    }
                    else {
                        tileEntity2.setAge(tileEntity2.getAge() + 1);
                    }
                }
                ForgeHooks.onCropsGrowPost(worldIn, pos, state, worldIn.getBlockState(pos));
            }
        }
    }
    
    public boolean canPlaceBlockAt(final World worldIn, final BlockPos pos) {
        final IBlockState state = worldIn.getBlockState(pos.down());
        final Block block = state.getBlock();
        return block.canSustainPlant(state, (IBlockAccess)worldIn, pos.down(), EnumFacing.UP, (IPlantable)this) || block == this || block == Blocks.GRASS || block == Blocks.DIRT || block == Blocks.FARMLAND;
    }
    
    public void neighborChanged(final IBlockState state, final World worldIn, final BlockPos pos, final Block blockIn, final BlockPos fromPos) {
        this.checkForDrop(worldIn, pos, state);
    }
    
    protected final boolean checkForDrop(final World worldIn, final BlockPos pos, final IBlockState state) {
        if (this.canBlockStay(worldIn, pos)) {
            return true;
        }
        this.dropBlockAsItem(worldIn, pos, state, 0);
        worldIn.setBlockToAir(pos);
        return false;
    }
    
    public boolean canBlockStay(final World worldIn, final BlockPos pos) {
        return this.canPlaceBlockAt(worldIn, pos);
    }
    
    public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
        if ((int)state.getValue((IProperty)BlockCornPlant.STAGE) == 3) {
            return ModItems.CORN;
        }
        return Items.AIR;
    }
    
    public int quantityDropped(final Random rand) {
        return 1 + rand.nextInt(2);
    }
    
    public boolean isOpaqueCube(final IBlockState state) {
        return false;
    }
    
    public boolean isFullCube(final IBlockState state) {
        return false;
    }
    
    public BlockFaceShape getBlockFaceShape(final IBlockAccess worldIn, final IBlockState state, final BlockPos pos, final EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }
    
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(final IBlockState blockState, final IBlockAccess worldIn, final BlockPos pos) {
        return BlockCornPlant.NULL_AABB;
    }
    
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
    
    public int getMetaFromState(final IBlockState state) {
        return (int)state.getValue((IProperty)BlockCornPlant.STAGE);
    }
    
    public IBlockState getStateFromMeta(final int meta) {
        return this.getDefaultState().withProperty((IProperty)BlockCornPlant.STAGE, (Comparable)meta);
    }
    
    public EnumPlantType getPlantType(final IBlockAccess world, final BlockPos pos) {
        return EnumPlantType.Beach;
    }
    
    public IBlockState getPlant(final IBlockAccess world, final BlockPos pos) {
        return this.getDefaultState();
    }
    
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[] { (IProperty)BlockCornPlant.STAGE });
    }
    
    @Nullable
    public TileEntity createNewTileEntity(final World worldIn, final int meta) {
        return new TileEntityPlant();
    }
    
    public boolean isBlockUnderCorn(final World worldIn, final BlockPos pos) {
        final IBlockState state = worldIn.getBlockState(pos.down());
        final Block block = state.getBlock();
        return block == ModBlocks.CORN_PLANT;
    }
    
    public boolean isBlockUnderAir(final World worldIn, final BlockPos pos) {
        final IBlockState state = worldIn.getBlockState(pos.down());
        final Block block = state.getBlock();
        return block == Blocks.AIR;
    }
    
    public boolean isBlockUnderGrass(final World worldIn, final BlockPos pos) {
        final IBlockState state = worldIn.getBlockState(pos.down());
        final Block block = state.getBlock();
        return block == Blocks.GRASS;
    }
    
    static {
        STAGE = PropertyInteger.create("stage", 0, 15);
        CORN_AABB = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);
    }
}
