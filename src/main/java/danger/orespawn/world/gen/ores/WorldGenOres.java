package danger.orespawn.world.gen.ores;

import net.minecraftforge.fml.common.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.chunk.*;
import danger.orespawn.init.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import net.minecraft.world.gen.feature.*;

public class WorldGenOres implements IWorldGenerator
{
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator chunkGenerator, final IChunkProvider chunkProvider) {
        this.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
    
    private void generateOverworld(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator chunkGenerator, final IChunkProvider chunkProvider) {
        this.generateOre(ModBlocks.URANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 20, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 20, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.ALOSAURUS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.BARYONYX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.CAMARASAURUS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.CRYOLOPHOSAURUS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.POINTYSAURUS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.TREX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.BIRD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.COW_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.CREEPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.GHAST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.HORSE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.PIG_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.ZOMBIE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.ALIEN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.CAVEFISHER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.NASTYSAURUS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.VELOCITYRAPTOR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.WTF_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.SPYRO_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.DRAGONFLY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.BEAVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.BRUTALFLY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.MOTHRA_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.MANTIS_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.KYUUBI_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.CASSOWARY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.REDCOW_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.STINKBUG_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 80, random.nextInt(5) + 5, 3);
        this.generateOre(ModBlocks.AMETHYST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 15, random.nextInt(4) + 4, 1);
    }
    
    private void generateOre(final IBlockState blockState, final World world, final Random random, final int x, final int z, final int minY, final int maxY, final int size, final int chances) {
        final int deltaY = maxY - minY;
        for (int i = 0; i < chances; ++i) {
            final BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            final WorldGenMinable generator = new WorldGenMinable(blockState, size);
            generator.generate(world, random, pos);
        }
    }
}
