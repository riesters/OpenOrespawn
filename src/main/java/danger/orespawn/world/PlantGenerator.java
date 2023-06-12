package danger.orespawn.world;

import net.minecraft.world.gen.feature.*;
import danger.orespawn.blocks.*;
import danger.orespawn.init.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class PlantGenerator extends WorldGenerator
{
    private BlockButterflyPlant butterflyPlant;
    private BlockMosquitoPlant mosquitoPlant;
    private BlockFireflyPlant fireflyPlant;
    
    public PlantGenerator() {
        this.butterflyPlant = (BlockButterflyPlant)ModBlocks.BUTTERFLY_PLANT;
        this.mosquitoPlant = (BlockMosquitoPlant)ModBlocks.MOSQUITO_PLANT;
        this.fireflyPlant = (BlockFireflyPlant)ModBlocks.FIREFLY_PLANT;
    }
    
    public boolean generate(final World worldIn, final Random rand, final BlockPos position) {
        BlockCrops plant = null;
        switch (rand.nextInt(3)) {
            case 0: {
                plant = this.butterflyPlant;
                break;
            }
            case 1: {
                plant = this.mosquitoPlant;
                break;
            }
            default: {
                plant = this.fireflyPlant;
                break;
            }
        }
        final IBlockState state = plant.getDefaultState();
        for (int i = 0; i < 12; ++i) {
            final BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 255) && plant.canBlockStay(worldIn, blockpos, state) && worldIn.getBlockState(new BlockPos(position.getX(), position.getY() - 1, position.getZ())).getBlock() != plant) {
                worldIn.setBlockState(blockpos, state.withProperty((IProperty)BlockButterflyPlant.AGE, (Comparable)7), 2);
            }
        }
        return true;
    }
    
    @SubscribeEvent
    public void decorate(final DecorateBiomeEvent.Decorate event) {
        final World world = event.getWorld();
        final Random rand = event.getRand();
        if (event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS) {
            if (rand.nextDouble() > 0.01) {
                return;
            }
            final int x = rand.nextInt(16) + 8;
            final int y = rand.nextInt(16) + 8;
            final PlantGenerator gen = new PlantGenerator();
            gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, y)));
        }
    }
}
