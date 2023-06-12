package danger.orespawn.world;

import net.minecraft.world.gen.feature.*;
import net.minecraft.block.state.*;
import danger.orespawn.init.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.properties.*;
import danger.orespawn.blocks.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class CornPlantGenerator extends WorldGenerator
{
    private BlockCornPlant plant;
    private IBlockState state;
    
    public CornPlantGenerator() {
        this.plant = (BlockCornPlant)ModBlocks.CORN_PLANT;
        this.state = this.plant.getDefaultState();
    }
    
    public boolean generate(final World worldIn, final Random rand, final BlockPos position) {
        for (int i = 0; i < 32; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (!worldIn.provider.isNether() && worldIn.isAirBlock(blockpos) && !this.plant.isBlockUnderCorn(worldIn, blockpos) && !this.plant.isBlockUnderAir(worldIn, blockpos) && this.plant.isBlockUnderGrass(worldIn, blockpos)) {
                int heightContribution;
                for (int height = 0, maxHeight = 21; height < maxHeight && (worldIn.isAirBlock(blockpos) || worldIn.getBlockState(blockpos).getBlock() == Blocks.TALLGRASS) && blockpos.getY() < 255 && this.plant.canBlockStay(worldIn, blockpos); height += heightContribution, blockpos = new BlockPos(blockpos.getX(), blockpos.getY() + 1, blockpos.getZ())) {
                    worldIn.setBlockState(blockpos, this.state.withProperty((IProperty)BlockCornPlant.STAGE, (Comparable)3), 2);
                    final TileEntityPlant tileEntityPlant = (TileEntityPlant)worldIn.getTileEntity(blockpos);
                    heightContribution = tileEntityPlant.getHeightContribution();
                }
                worldIn.setBlockState(blockpos, this.state, 2);
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
            final CornPlantGenerator gen = new CornPlantGenerator();
            gen.generate(world, rand, world.getHeight(event.getPos().add(x, 0, y)));
        }
    }
}
