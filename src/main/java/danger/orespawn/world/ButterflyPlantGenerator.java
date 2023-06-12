package danger.orespawn.world;

import net.minecraft.world.gen.feature.*;
import danger.orespawn.blocks.*;
import net.minecraft.block.state.*;
import danger.orespawn.init.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.properties.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ButterflyPlantGenerator extends WorldGenerator
{
    private BlockButterflyPlant plant;
    private IBlockState state;
    
    public ButterflyPlantGenerator() {
        this.plant = (BlockButterflyPlant)ModBlocks.BUTTERFLY_PLANT;
        this.state = this.plant.getDefaultState();
    }
    
    public boolean generate(final World worldIn, final Random rand, final BlockPos position) {
        for (int i = 0; i < 12; ++i) {
            final BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 255) && this.plant.canBlockStay(worldIn, blockpos, this.state) && worldIn.getBlockState(new BlockPos(position.getX(), position.getY() - 1, position.getZ())).getBlock() != ModBlocks.BUTTERFLY_PLANT) {
                worldIn.setBlockState(blockpos, this.state.withProperty((IProperty)BlockButterflyPlant.AGE, (Comparable)7), 2);
            }
        }
        return true;
    }
    
    @SubscribeEvent
    public void decorate(final DecorateBiomeEvent.Decorate event) {
        final World world = event.getWorld();
        final Biome biome = world.getBiomeForCoordsBody(event.getPos());
        final Random rand = event.getRand();
        if (event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS) {
            if (rand.nextDouble() > 0.01) {
                return;
            }
            final int x = rand.nextInt(16) + 8;
            final int y = rand.nextInt(16) + 8;
            final ButterflyPlantGenerator gen = new ButterflyPlantGenerator();
            gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, y)));
        }
    }
}
