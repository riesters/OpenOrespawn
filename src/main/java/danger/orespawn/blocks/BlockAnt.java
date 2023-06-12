package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.block.state.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import danger.orespawn.entity.*;
import java.util.*;
import net.minecraft.world.chunk.*;
import net.minecraft.entity.*;

public class BlockAnt extends Block
{
    private AntType ANT_TYPE;
    
    public BlockAnt() {
        super(Material.GRASS);
        this.ANT_TYPE = AntType.RED;
        this.setUnlocalizedName("ant_block");
        this.setRegistryName("ant_block");
        this.setTickRandomly(true);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
        if (worldIn.isRemote) {
            return;
        }
        super.updateTick(worldIn, pos, state, rand);
        if (worldIn.getBlockState(pos.up(1)).getBlock() == Blocks.AIR && worldIn.isDaytime()) {
            final Chunk chunk = worldIn.getChunkFromBlockCoords(pos);
            final int radius = 16;
            final AxisAlignedBB aabb = new AxisAlignedBB((double)(pos.getX() - radius), 0.0, (double)(pos.getZ() - radius), (double)(pos.getX() + radius), 200.0, (double)(pos.getZ() + radius));
            final List<RedAnt> antList = new ArrayList<RedAnt>();
            chunk.getEntitiesOfTypeWithinAABB((Class)RedAnt.class, aabb, (List)antList, e -> true);
            if (antList.size() > 20) {
                return;
            }
            for (int howmany = OreSpawnMain.OreSpawnRand.nextInt(6) + 2, i = 0; i < howmany; ++i) {
                final Entity ant = EntityList.newEntity((Class)this.getClassFromAntType(this.ANT_TYPE), worldIn);
                ant.setPositionAndRotation((double)pos.getX(), (double)(pos.getY() + 1), (double)pos.getZ(), rand.nextFloat() * 360.0f, 0.0f);
                worldIn.spawnEntity(ant);
                ((EntityLiving)ant).playLivingSound();
            }
        }
    }
    
    private Class<? extends Entity> getClassFromAntType(final AntType type) {
        switch (type) {
            case RED: {
                return (Class<? extends Entity>)RedAnt.class;
            }
            default: {
                return (Class<? extends Entity>)RedAnt.class;
            }
        }
    }
}
