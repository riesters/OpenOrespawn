package danger.orespawn.world.gen;

import net.minecraftforge.fml.common.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.chunk.*;
import danger.orespawn.world.structures.*;
import danger.orespawn.init.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;

public class StructureGenerator implements IWorldGenerator
{
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator chunkGenerator, final IChunkProvider chunkProvider) {
        final GenericDungeon dungeon = new GenericDungeon();
        final int x = chunkX * 16 + random.nextInt(16);
        final int z = chunkZ * 16 + random.nextInt(16);
        final int y = 5 + random.nextInt(40);
        if (world.provider.getDimensionType() == ModDimensions.MINING && random.nextInt(16) == 0) {
            dungeon.makeDungeon(world, x, y, z);
        }
    }
    
    private static int calculateGenerationHeight(final World world, final int x, final int z, final Block topBlock) {
        int y = world.getHeight();
        Block block;
        for (boolean foundGround = false; !foundGround && y-- >= 0; foundGround = (block == topBlock)) {
            block = world.getBlockState(new BlockPos(x, y, z)).getBlock();
        }
        return y;
    }
}
