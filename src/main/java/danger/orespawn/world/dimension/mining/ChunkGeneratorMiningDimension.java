package danger.orespawn.world.dimension.mining;

import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraft.world.chunk.*;
import net.minecraftforge.event.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.block.*;

public class ChunkGeneratorMiningDimension implements IChunkGenerator
{
    private Random rand;
    private World world;
    private final BiomeProvider biomeProvider;
    private final WorldType terrainType;
    private final double[] heightMap;
    private final float[] parabolicField;
    public NoiseGeneratorOctaves scale;
    public NoiseGeneratorOctaves depth;
    public NoiseGeneratorOctaves forest;
    private NoiseGeneratorOctaves minLimitPerlinNoise;
    private NoiseGeneratorOctaves maxLimitPerlinNoise;
    private NoiseGeneratorOctaves mainPerlinNoise;
    private NoiseGeneratorPerlin height;
    private MapGenBase caveGenerator;
    private double[] stoneNoise;
    private double[] depthBuffer;
    private Biome[] biomesForGeneration;
    double[] mainNoiseRegion;
    double[] minLimitRegion;
    double[] maxLimitRegion;
    double[] depthRegion;
    
    public ChunkGeneratorMiningDimension(final World worldIn, final long seed, final BiomeProvider bp) {
        this.depthBuffer = new double[256];
        this.world = worldIn;
        this.terrainType = worldIn.getWorldInfo().getTerrainType();
        this.rand = new Random(seed);
        this.stoneNoise = new double[256];
        this.biomeProvider = bp;
        this.scale = new NoiseGeneratorOctaves(this.rand, 10);
        this.depth = new NoiseGeneratorOctaves(this.rand, 16);
        this.forest = new NoiseGeneratorOctaves(this.rand, 8);
        this.minLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
        this.maxLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
        this.mainPerlinNoise = new NoiseGeneratorOctaves(this.rand, 8);
        this.height = new NoiseGeneratorPerlin(this.rand, 4);
        this.heightMap = new double[825];
        this.parabolicField = new float[25];
        this.caveGenerator = TerrainGen.getModdedMapGen((MapGenBase)new MapGenCaves(), InitMapGenEvent.EventType.CAVE);
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                final float f = 10.0f / MathHelper.sqrt(i * i + j * j + 0.2f);
                this.parabolicField[i + 2 + (j + 2) * 5] = f;
            }
        }
        InitNoiseGensEvent.ContextOverworld ctx = new InitNoiseGensEvent.ContextOverworld(this.minLimitPerlinNoise, this.maxLimitPerlinNoise, this.mainPerlinNoise, this.height, this.scale, this.depth, this.forest);
        ctx = (InitNoiseGensEvent.ContextOverworld)TerrainGen.getModdedNoiseGenerators(worldIn, this.rand, (InitNoiseGensEvent.Context)ctx);
        this.minLimitPerlinNoise = ctx.getLPerlin1();
        this.maxLimitPerlinNoise = ctx.getLPerlin2();
        this.mainPerlinNoise = ctx.getPerlin();
        this.height = ctx.getHeight();
        this.scale = ctx.getScale();
        this.depth = ctx.getDepth();
        this.forest = ctx.getForest();
    }
    
    public Chunk generateChunk(final int x, final int z) {
        this.rand.setSeed(x * 341873128712L + z * 132897987541L);
        final ChunkPrimer chunkPrimer = new ChunkPrimer();
        this.setBlocksInChunk(x, z, chunkPrimer);
        this.replaceBiomeBlocks(x, z, chunkPrimer, this.biomesForGeneration = this.biomeProvider.getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16));
        this.caveGenerator.generate(this.world, x, z, chunkPrimer);
        final Chunk chunk = new Chunk(this.world, chunkPrimer, x, z);
        final byte[] abyte = chunk.getBiomeArray();
        for (int i = 0; i < abyte.length; ++i) {
            abyte[i] = (byte)Biome.getIdForBiome(this.biomesForGeneration[i]);
        }
        chunk.generateSkylightMap();
        return chunk;
    }
    
    private void replaceBiomeBlocks(final int x, final int z, final ChunkPrimer primer, final Biome[] biomesIn) {
        if (!ForgeEventFactory.onReplaceBiomeBlocks((IChunkGenerator)this, x, z, primer, this.world)) {
            return;
        }
        final double d0 = 0.03125;
        this.depthBuffer = this.height.getRegion(this.depthBuffer, (double)(x * 16), (double)(z * 16), 16, 16, d0 * 2.0, d0 * 2.0, 1.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final Biome Biome = biomesIn[j + i * 16];
                this.generateBiomeTerrain(this.world, this.rand, primer, x * 16 + i, z * 16 + j, this.depthBuffer[j + i * 16], Biome);
            }
        }
    }
    
    private void generateBiomeTerrain(final World worldIn, final Random rand, final ChunkPrimer chunkPrimerIn, final int x, final int z, final double noiseVal, final Biome biome) {
        final int seaLevel = 63;
        IBlockState topBlock = biome.topBlock;
        IBlockState fillerBlock = biome.fillerBlock;
        int j = -1;
        final int k = (int)(noiseVal / 3.0 + 3.0 + rand.nextDouble() * 0.25);
        final int l = x & 0xF;
        final int i1 = z & 0xF;
        final BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
        for (int y = 255; y >= 0; --y) {
            if (y == 0) {
                chunkPrimerIn.setBlockState(i1, y, l, Blocks.BEDROCK.getDefaultState());
            }
            else {
                final IBlockState iblockstate2 = chunkPrimerIn.getBlockState(i1, y, l);
                if (iblockstate2.getMaterial() == Material.AIR) {
                    j = -1;
                }
                else if (iblockstate2.getBlock() == Blocks.STONE) {
                    if (j == -1) {
                        if (k <= 0) {
                            topBlock = Blocks.AIR.getDefaultState();
                            fillerBlock = Blocks.STONE.getDefaultState();
                        }
                        else if (y >= seaLevel - 4 && y <= seaLevel + 1) {
                            topBlock = biome.topBlock;
                            fillerBlock = biome.fillerBlock;
                        }
                        if (y < seaLevel && (topBlock == null || topBlock.getMaterial() == Material.AIR)) {
                            fillerBlock = Blocks.WATER.getDefaultState();
                        }
                        j = k;
                        if (y >= seaLevel - 1) {
                            chunkPrimerIn.setBlockState(i1, y, l, topBlock);
                        }
                        else if (y < seaLevel - 7 - k) {
                            topBlock = Blocks.AIR.getDefaultState();
                            fillerBlock = Blocks.STONE.getDefaultState();
                            chunkPrimerIn.setBlockState(i1, y, l, Blocks.GRAVEL.getDefaultState());
                        }
                        else {
                            chunkPrimerIn.setBlockState(i1, y, l, fillerBlock);
                        }
                    }
                    else if (j > 0) {
                        --j;
                        chunkPrimerIn.setBlockState(i1, y, l, fillerBlock);
                        if (j == 0 && fillerBlock.getBlock() == Blocks.SAND) {
                            j = rand.nextInt(4);
                            fillerBlock = Blocks.STONE.getDefaultState();
                        }
                    }
                }
            }
        }
    }
    
    private void setBlocksInChunk(final int x, final int z, final ChunkPrimer chunkPrimer) {
        this.biomesForGeneration = this.biomeProvider.getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
        this.generateHeightmap(x * 4, 0, z * 4);
        for (int i = 0; i < 4; ++i) {
            final int j = i * 5;
            final int k = (i + 1) * 5;
            for (int l = 0; l < 4; ++l) {
                final int i2 = (j + l) * 33;
                final int j2 = (j + l + 1) * 33;
                final int k2 = (k + l) * 33;
                final int l2 = (k + l + 1) * 33;
                for (int i3 = 0; i3 < 32; ++i3) {
                    final double d0 = 0.125;
                    double d2 = this.heightMap[i2 + i3];
                    double d3 = this.heightMap[j2 + i3];
                    double d4 = this.heightMap[k2 + i3];
                    double d5 = this.heightMap[l2 + i3];
                    final double d6 = (this.heightMap[i2 + i3 + 1] - d2) * 0.125;
                    final double d7 = (this.heightMap[j2 + i3 + 1] - d3) * 0.125;
                    final double d8 = (this.heightMap[k2 + i3 + 1] - d4) * 0.125;
                    final double d9 = (this.heightMap[l2 + i3 + 1] - d5) * 0.125;
                    for (int j3 = 0; j3 < 8; ++j3) {
                        final double d10 = 0.25;
                        double d11 = d2;
                        double d12 = d3;
                        final double d13 = (d4 - d2) * 0.25;
                        final double d14 = (d5 - d3) * 0.25;
                        for (int k3 = 0; k3 < 4; ++k3) {
                            final double d15 = 0.25;
                            final double d16 = (d12 - d11) * 0.25;
                            double lvt_45_1_ = d11 - d16;
                            for (int l3 = 0; l3 < 4; ++l3) {
                                if ((lvt_45_1_ += d16) > 0.0) {
                                    chunkPrimer.setBlockState(i * 4 + k3, i3 * 8 + j3, l * 4 + l3, Blocks.STONE.getDefaultState());
                                }
                                else if (i3 * 8 + j3 < 63) {
                                    chunkPrimer.setBlockState(i * 4 + k3, i3 * 8 + j3, l * 4 + l3, Blocks.WATER.getDefaultState());
                                }
                            }
                            d11 += d13;
                            d12 += d14;
                        }
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                    }
                }
            }
        }
    }
    
    private void generateHeightmap(final int x, final int y, final int z) {
        this.depthRegion = this.depth.generateNoiseOctaves(this.depthRegion, x, z, 5, 5, 200.0, 200.0, 0.5);
        final float coordScale = 684.412f;
        final float heightScale = 684.412f;
        this.mainNoiseRegion = this.mainPerlinNoise.generateNoiseOctaves(this.mainNoiseRegion, x, y, z, 5, 33, 5, 8.55515, 4.277575, 8.55515);
        this.minLimitRegion = this.minLimitPerlinNoise.generateNoiseOctaves(this.minLimitRegion, x, y, z, 5, 33, 5, (double)coordScale, (double)heightScale, (double)coordScale);
        this.maxLimitRegion = this.maxLimitPerlinNoise.generateNoiseOctaves(this.maxLimitRegion, x, y, z, 5, 33, 5, (double)coordScale, (double)heightScale, (double)coordScale);
        int i = 0;
        int j = 0;
        for (int k = 0; k < 5; ++k) {
            for (int l = 0; l < 5; ++l) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                final int i2 = 2;
                final Biome surroundingBiome = this.biomesForGeneration[k + 2 + (l + 2) * 10];
                for (int j2 = -i2; j2 < i2; ++j2) {
                    for (int k2 = -i2; k2 <= i2; ++k2) {
                        final Biome biome = this.biomesForGeneration[k + j2 + 2 + (l + k2 + 2) * 10];
                        final float baseHeight = biome.getBaseHeight();
                        final float heightVariation = biome.getHeightVariation();
                        float f5 = this.parabolicField[j2 + 2 + (k2 + 2) * 5] / (baseHeight + 2.0f);
                        if (biome.getBaseHeight() > surroundingBiome.getBaseHeight()) {
                            f5 /= 2.0f;
                        }
                        f2 += heightVariation * f5;
                        f3 += baseHeight * f5;
                        f4 += f5;
                    }
                }
                f2 /= f4;
                f3 /= f4;
                f2 = f2 * 0.9f + 0.1f;
                f3 = (f3 * 4.0f - 1.0f) / 8.0f;
                double d7 = this.depthRegion[j] / 8000.0;
                if (d7 < 0.0) {
                    d7 = -d7 * 0.3;
                }
                if (d7 < 0.0) {
                    d7 /= 2.0;
                    if (d7 < -1.0) {
                        d7 = -1.0;
                    }
                    d7 /= 1.4;
                    d7 /= 2.0;
                }
                else {
                    if (d7 > 1.0) {
                        d7 = 1.0;
                    }
                    d7 /= 8.0;
                }
                ++j;
                double d8 = f3;
                final double d9 = f2;
                d8 += d7 * 0.2;
                d8 = d8 * 8.5 / 8.0;
                final double d10 = 8.5 + d8 * 4.0;
                for (int l2 = 0; l2 < 33; ++l2) {
                    double d11 = (l2 - d10) * 12.0 * 128.0 / 256.0 / d9;
                    if (d11 < 0.0) {
                        d11 *= 4.0;
                    }
                    final double d12 = this.minLimitRegion[i] / 512.0;
                    final double d13 = this.maxLimitRegion[i] / 512.0;
                    final double d14 = (this.mainNoiseRegion[i] / 10.0 + 1.0) / 2.0;
                    double d15 = MathHelper.clampedLerp(d12, d13, d14) - d11;
                    if (l2 > 29) {
                        final double d16 = (l2 - 29) / 3.0f;
                        d15 = d15 * (1.0 - d16) + -10.0 * d16;
                    }
                    this.heightMap[i] = d15;
                    ++i;
                }
            }
        }
    }
    
    public boolean generateStructures(final Chunk arg0, final int arg1, final int arg2) {
        return false;
    }
    
    public BlockPos getNearestStructurePos(final World arg0, final String arg1, final BlockPos arg2, final boolean arg3) {
        return null;
    }
    
    public List<Biome.SpawnListEntry> getPossibleCreatures(final EnumCreatureType creatureType, final BlockPos pos) {
        final Biome biome = this.world.getBiome(pos);
        return (List<Biome.SpawnListEntry>)biome.getSpawnableList(creatureType);
    }
    
    public boolean isInsideStructure(final World arg0, final String arg1, final BlockPos arg2) {
        return false;
    }
    
    public void populate(final int x, final int z) {
        BlockFalling.fallInstantly = true;
        final int i = x * 16;
        final int j = z * 16;
        final BlockPos blockpos = new BlockPos(i, 0, j);
        final Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
        ForgeEventFactory.onChunkPopulate(true, (IChunkGenerator)this, this.world, this.rand, x, z, false);
        biome.decorate(this.world, this.rand, blockpos);
        ForgeEventFactory.onChunkPopulate(false, (IChunkGenerator)this, this.world, this.rand, x, z, false);
        BlockFalling.fallInstantly = false;
    }
    
    public void recreateStructures(final Chunk arg0, final int arg1, final int arg2) {
    }
}
