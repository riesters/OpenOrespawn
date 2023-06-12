package danger.orespawn.world;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraftforge.event.terraingen.*;
import danger.orespawn.init.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class LiquidGenerator extends WorldGenerator
{
    public boolean generate(final World worldIn, final Random rand, final BlockPos position) {
        if (!worldIn.provider.isNether() && worldIn.isAirBlock(position)) {
            if (Math.random() < 0.5) {
                worldIn.setBlockState(position, Blocks.FLOWING_WATER.getDefaultState());
            }
            else {
                worldIn.setBlockState(position, Blocks.FLOWING_LAVA.getDefaultState());
            }
        }
        return true;
    }
    
    @SubscribeEvent
    public void decorate(final DecorateBiomeEvent.Decorate event) {
        final World world = event.getWorld();
        final Biome biome = world.getBiomeForCoordsBody(event.getPos());
        final Random rand = event.getRand();
        if (biome == ModBiomes.MINING_BIOME && event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS) {
            if (rand.nextDouble() > 0.1) {
                return;
            }
            final int x = rand.nextInt(16) + 8;
            final int y = rand.nextInt(16) + 8;
            final LiquidGenerator gen = new LiquidGenerator();
            gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, y)));
        }
    }
}
