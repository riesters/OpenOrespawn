package danger.orespawn.blocks;

import net.minecraft.block.properties.*;
import danger.orespawn.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import danger.orespawn.entity.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.world.chunk.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import danger.orespawn.init.*;

public class BlockButterflyPlant extends BlockCrops
{
    private boolean shouldSpawn;
    
    public BlockButterflyPlant() {
        this.shouldSpawn = true;
        this.setUnlocalizedName("butterfly_plant");
        this.setRegistryName("butterfly_plant");
        this.setDefaultState(this.getDefaultState().withProperty((IProperty)BlockButterflyPlant.AGE, (Comparable)0));
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModBlocks.BLOCKS.add((Block)this);
    }
    
    public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
        super.updateTick(worldIn, pos, state, rand);
        if (worldIn.isRaining()) {
            return;
        }
        final Chunk chunk = worldIn.getChunkFromBlockCoords(pos);
        final float radius = 50.0f;
        final AxisAlignedBB aabb = new AxisAlignedBB((double)(pos.getX() - radius), 0.0, (double)(pos.getZ() - radius), (double)(pos.getX() + radius), 200.0, (double)(pos.getZ() + radius));
        final List<Butterfly> butterflyList = new ArrayList<Butterfly>();
        chunk.getEntitiesOfTypeWithinAABB((Class)Butterfly.class, aabb, (List)butterflyList, e -> true);
        if (butterflyList.size() > 15) {
            return;
        }
        final IBlockState st = worldIn.getBlockState(pos);
        int rate = st.getBlock().getMetaFromState(st);
        rate &= 0x7;
        rate = 7 - rate;
        if (rate > 1 && OreSpawnMain.OreSpawnRand.nextInt(rate) != 0) {
            return;
        }
        if (worldIn.getBlockState(pos.up(1)).getBlock() == Blocks.AIR && worldIn.isDaytime()) {
            final Entity butterfly = EntityList.newEntity((Class)Butterfly.class, worldIn);
            butterfly.setPosition((double)pos.getX(), (double)(pos.getY() + 1), (double)pos.getZ());
            worldIn.spawnEntity(butterfly);
        }
    }
    
    public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
        return ModItems.BUTTERFLY_SEED;
    }
    
    protected Item getSeed() {
        return ModItems.BUTTERFLY_SEED;
    }
    
    protected Item getCrop() {
        return ModItems.BUTTERFLY_SEED;
    }
}
