package danger.orespawn.world.gen.ores;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class AntHillGenerator extends WorldGenerator
{
    public boolean generate(final World worldIn, final Random rand, BlockPos position) {
        position = position.down();
        if (worldIn.getBlockState(position).getBlock() == Blocks.GRASS) {
            worldIn.setBlockState(position, ModBlocks.ANT_BLOCK.getDefaultState(), 2);
        }
        return true;
    }
    
    @SubscribeEvent
    public void decorate(final DecorateBiomeEvent.Decorate event) {
        final World world = event.getWorld();
        final Random rand = event.getRand();
        if (event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS) {
            if (rand.nextDouble() > 0.04) {
                return;
            }
            final int x = rand.nextInt(16) + 8;
            final int z = rand.nextInt(16) + 8;
            final AntHillGenerator gen = new AntHillGenerator();
            gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, z)));
        }
    }
}
