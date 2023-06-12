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

public class BlockMosquitoPlant extends BlockCrops
{
    public BlockMosquitoPlant() {
        this.setUnlocalizedName("mosquito_plant");
        this.setRegistryName("mosquito_plant");
        this.setDefaultState(this.getDefaultState().withProperty((IProperty)BlockMosquitoPlant.AGE, (Comparable)0));
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
        final List<Mosquito> mosquitoList = new ArrayList<Mosquito>();
        chunk.getEntitiesOfTypeWithinAABB((Class)Mosquito.class, aabb, (List)mosquitoList, e -> true);
        if (mosquitoList.size() > 15) {
            return;
        }
        final IBlockState st = worldIn.getBlockState(pos);
        int rate = st.getBlock().getMetaFromState(st);
        rate &= 0x7;
        rate = 6 - rate;
        if (rate > 1 && OreSpawnMain.OreSpawnRand.nextInt(rate) != 0) {
            return;
        }
        if (worldIn.getBlockState(pos.up(1)).getBlock() == Blocks.AIR && worldIn.isDaytime()) {
            final Entity mosquito = EntityList.newEntity((Class)Mosquito.class, worldIn);
            mosquito.setPosition((double)pos.getX(), (double)(pos.getY() + 1), (double)pos.getZ());
            worldIn.spawnEntity(mosquito);
        }
    }
    
    public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
        return ModItems.MOSQUITO_SEED;
    }
    
    protected Item getSeed() {
        return ModItems.MOSQUITO_SEED;
    }
    
    protected Item getCrop() {
        return ModItems.MOSQUITO_SEED;
    }
}
