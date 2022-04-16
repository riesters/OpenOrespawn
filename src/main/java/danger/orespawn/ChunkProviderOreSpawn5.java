package danger.orespawn;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.SpawnerAnimals;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderOreSpawn5 implements IChunkProvider {
  private Random rand;
  
  private NoiseGeneratorOctaves field_147431_j;
  
  private NoiseGeneratorOctaves field_147432_k;
  
  private NoiseGeneratorOctaves field_147429_l;
  
  private NoiseGeneratorPerlin field_147430_m;
  
  public NoiseGeneratorOctaves noiseGen5;
  
  public NoiseGeneratorOctaves noiseGen6;
  
  public NoiseGeneratorOctaves mobSpawnerNoise;
  
  private World worldObj;
  
  private final boolean mapFeaturesEnabled;
  
  private WorldType field_147435_p;
  
  private final double[] field_147434_q;
  
  private final float[] parabolicField;
  
  private double[] stoneNoise = new double[256];
  
  private BiomeGenBase[] biomesForGeneration;
  
  double[] field_147427_d;
  
  double[] field_147428_e;
  
  double[] field_147425_f;
  
  double[] field_147426_g;
  
  int[][] field_73219_j = new int[32][32];
  
  public ChunkProviderOreSpawn5(World par1World, long par2, boolean par4) {
    this.worldObj = par1World;
    this.mapFeaturesEnabled = par4;
    this.field_147435_p = par1World.getWorldInfo().getTerrainType();
    this.rand = new Random(par2);
    this.field_147431_j = new NoiseGeneratorOctaves(this.rand, 16);
    this.field_147432_k = new NoiseGeneratorOctaves(this.rand, 16);
    this.field_147429_l = new NoiseGeneratorOctaves(this.rand, 8);
    this.field_147430_m = new NoiseGeneratorPerlin(this.rand, 4);
    this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
    this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
    this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
    this.field_147434_q = new double[825];
    this.parabolicField = new float[25];
    for (int j = -2; j <= 2; j++) {
      for (int k = -2; k <= 2; k++) {
        float f = 10.0F / MathHelper.sqrt_float((j * j + k * k) + 0.2F);
        this.parabolicField[j + 2 + (k + 2) * 5] = f;
      } 
    } 
    NoiseGenerator[] noiseGens = { (NoiseGenerator)this.field_147431_j, (NoiseGenerator)this.field_147432_k, (NoiseGenerator)this.field_147429_l, (NoiseGenerator)this.field_147430_m, (NoiseGenerator)this.noiseGen5, (NoiseGenerator)this.noiseGen6, (NoiseGenerator)this.mobSpawnerNoise };
    noiseGens = TerrainGen.getModdedNoiseGenerators(par1World, this.rand, noiseGens);
    this.field_147431_j = (NoiseGeneratorOctaves)noiseGens[0];
    this.field_147432_k = (NoiseGeneratorOctaves)noiseGens[1];
    this.field_147429_l = (NoiseGeneratorOctaves)noiseGens[2];
    this.field_147430_m = (NoiseGeneratorPerlin)noiseGens[3];
    this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
    this.noiseGen6 = (NoiseGeneratorOctaves)noiseGens[5];
    this.mobSpawnerNoise = (NoiseGeneratorOctaves)noiseGens[6];
  }
  
  public void func_147424_a(int p_147424_1_, int p_147424_2_, Block[] p_147424_3_) {
    byte b0 = 63;
    this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, p_147424_1_ * 4 - 2, p_147424_2_ * 4 - 2, 10, 10);
    func_147423_a(p_147424_1_ * 4, 0, p_147424_2_ * 4);
    for (int k = 0; k < 4; k++) {
      int l = k * 5;
      int i1 = (k + 1) * 5;
      for (int j1 = 0; j1 < 4; j1++) {
        int k1 = (l + j1) * 33;
        int l1 = (l + j1 + 1) * 33;
        int i2 = (i1 + j1) * 33;
        int j2 = (i1 + j1 + 1) * 33;
        for (int k2 = 0; k2 < 32; k2++) {
          double d0 = 0.125D;
          double d1 = this.field_147434_q[k1 + k2];
          double d2 = this.field_147434_q[l1 + k2];
          double d3 = this.field_147434_q[i2 + k2];
          double d4 = this.field_147434_q[j2 + k2];
          double d5 = (this.field_147434_q[k1 + k2 + 1] - d1) * d0;
          double d6 = (this.field_147434_q[l1 + k2 + 1] - d2) * d0;
          double d7 = (this.field_147434_q[i2 + k2 + 1] - d3) * d0;
          double d8 = (this.field_147434_q[j2 + k2 + 1] - d4) * d0;
          for (int l2 = 0; l2 < 8; l2++) {
            double d9 = 0.25D;
            double d10 = d1;
            double d11 = d2;
            double d12 = (d3 - d1) * d9;
            double d13 = (d4 - d2) * d9;
            for (int i3 = 0; i3 < 4; i3++) {
              int j3 = i3 + k * 4 << 12 | 0 + j1 * 4 << 8 | k2 * 8 + l2;
              short short1 = 256;
              j3 -= short1;
              double d14 = 0.25D;
              double d16 = (d11 - d10) * d14;
              double d15 = d10 - d16;
              for (int k3 = 0; k3 < 4; k3++) {
                if ((d15 += d16) > 0.0D) {
                  p_147424_3_[j3 += short1] = OreSpawnMain.CrystalStone;
                } else if (k2 * 8 + l2 < b0) {
                  p_147424_3_[j3 += short1] = Blocks.water;
                } else {
                  p_147424_3_[j3 += short1] = null;
                } 
              } 
              d10 += d12;
              d11 += d13;
            } 
            d1 += d5;
            d2 += d6;
            d3 += d7;
            d4 += d8;
          } 
        } 
      } 
    } 
  }
  
  public void replaceBlocksForBiome(int p_147422_1_, int p_147422_2_, Block[] p_147422_3_, byte[] p_147422_4_, BiomeGenBase[] p_147422_5_) {
    double d0 = 0.03125D;
    this.stoneNoise = this.field_147430_m.func_151599_a(this.stoneNoise, (p_147422_1_ * 16), (p_147422_2_ * 16), 16, 16, d0 * 2.0D, d0 * 2.0D, 1.0D);
    for (int k = 0; k < 16; k++) {
      for (int l = 0; l < 16; l++)
        MygenTerrainBlocks(this.worldObj, this.rand, p_147422_3_, p_147422_4_, p_147422_1_ * 16 + k, p_147422_2_ * 16 + l, this.stoneNoise[l + k * 16]); 
    } 
  }
  
  private void MygenTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
    MygenBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
  }
  
  private final void MygenBiomeTerrain(World p_150560_1_, Random p_150560_2_, Block[] p_150560_3_, byte[] p_150560_4_, int p_150560_5_, int p_150560_6_, double p_150560_7_) {
    boolean flag = true;
    Block block = OreSpawnMain.CrystalGrass;
    byte b0 = 0;
    Block block1 = OreSpawnMain.CrystalStone;
    int k = -1;
    int l = (int)(p_150560_7_ / 3.0D + 3.0D + p_150560_2_.nextDouble() * 0.25D);
    int i1 = p_150560_5_ & 0xF;
    int j1 = p_150560_6_ & 0xF;
    int k1 = p_150560_3_.length / 256;
    for (int l1 = 255; l1 >= 0; l1--) {
      int i2 = (j1 * 16 + i1) * k1 + l1;
      if (l1 <= 0 + p_150560_2_.nextInt(5)) {
        p_150560_3_[i2] = Blocks.bedrock;
      } else {
        Block block2 = p_150560_3_[i2];
        if (block2 != null && block2.getMaterial() != Material.air) {
          if (block2 == OreSpawnMain.CrystalStone)
            if (k == -1) {
              if (l <= 0) {
                block = null;
                b0 = 0;
                block1 = OreSpawnMain.CrystalStone;
              } else if (l1 >= 59 && l1 <= 64) {
                block = OreSpawnMain.CrystalGrass;
                b0 = 0;
                block1 = OreSpawnMain.CrystalStone;
              } 
              if (l1 < 63 && (block == null || block.getMaterial() == Material.air)) {
                block = Blocks.water;
                b0 = 0;
              } 
              k = l;
              if (l1 >= 62) {
                p_150560_3_[i2] = block;
                p_150560_4_[i2] = b0;
              } else {
                p_150560_3_[i2] = block1;
              } 
            } else if (k > 0) {
              k--;
              p_150560_3_[i2] = block1;
            }  
        } else {
          k = -1;
        } 
      } 
    } 
  }
  
  public Chunk loadChunk(int par1, int par2) {
    return provideChunk(par1, par2);
  }
  
  public Chunk provideChunk(int par1, int par2) {
    this.rand.setSeed(par1 * 341873128712L + par2 * 132897987541L);
    Block[] ablock = new Block[65536];
    byte[] abyte = new byte[65536];
    func_147424_a(par1, par2, ablock);
    this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
    replaceBlocksForBiome(par1, par2, ablock, abyte, this.biomesForGeneration);
    Chunk chunk = new Chunk(this.worldObj, ablock, abyte, par1, par2);
    CrystalMaze cm = new CrystalMaze();
    cm.buildCrystalMaze(this.worldObj, par1 * 16, 25, par2 * 16, chunk);
    generateCrystals(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    addCrystalTrees(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    generateCrystalOres(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    addCrystalFlowers(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    addRice(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    addQuinoa(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    chunk.generateSkylightMap();
    return chunk;
  }
  
  private void func_147423_a(int p_147423_1_, int p_147423_2_, int p_147423_3_) {
    double d0 = 684.412D;
    double d1 = 684.412D;
    double d2 = 512.0D;
    double d3 = 512.0D;
    this.field_147426_g = this.noiseGen6.generateNoiseOctaves(this.field_147426_g, p_147423_1_, p_147423_3_, 5, 5, 200.0D, 200.0D, 0.5D);
    this.field_147427_d = this.field_147429_l.generateNoiseOctaves(this.field_147427_d, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
    this.field_147428_e = this.field_147431_j.generateNoiseOctaves(this.field_147428_e, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 684.412D, 684.412D, 684.412D);
    this.field_147425_f = this.field_147432_k.generateNoiseOctaves(this.field_147425_f, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 684.412D, 684.412D, 684.412D);
    boolean flag1 = false;
    boolean flag = false;
    int l = 0;
    int i1 = 0;
    double d4 = 8.5D;
    for (int j1 = 0; j1 < 5; j1++) {
      for (int k1 = 0; k1 < 5; k1++) {
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        byte b0 = 2;
        BiomeGenBase biomegenbase = this.biomesForGeneration[j1 + 2 + (k1 + 2) * 10];
        for (int l1 = -b0; l1 <= b0; l1++) {
          for (int i2 = -b0; i2 <= b0; i2++) {
            BiomeGenBase biomegenbase1 = this.biomesForGeneration[j1 + l1 + 2 + (k1 + i2 + 2) * 10];
            float f3 = biomegenbase1.rootHeight;
            float f4 = biomegenbase1.heightVariation;
            if (this.field_147435_p == WorldType.AMPLIFIED && f3 > 0.0F) {
              f3 = 1.0F + f3 * 2.0F;
              f4 = 1.0F + f4 * 4.0F;
            } 
            float f5 = this.parabolicField[l1 + 2 + (i2 + 2) * 5] / (f3 + 2.0F);
            if (biomegenbase1.rootHeight > biomegenbase.rootHeight)
              f5 /= 2.0F; 
            f += f4 * f5;
            f1 += f3 * f5;
            f2 += f5;
          } 
        } 
        f /= f2;
        f1 /= f2;
        f = f * 0.9F + 0.1F;
        f1 = (f1 * 4.0F - 1.0F) / 8.0F;
        double d13 = this.field_147426_g[i1] / 8000.0D;
        if (d13 < 0.0D)
          d13 = -d13 * 0.3D; 
        d13 = d13 * 3.0D - 2.0D;
        if (d13 < 0.0D) {
          d13 /= 2.0D;
          if (d13 < -1.0D)
            d13 = -1.0D; 
          d13 /= 1.4D;
          d13 /= 2.0D;
        } else {
          if (d13 > 1.0D)
            d13 = 1.0D; 
          d13 /= 8.0D;
        } 
        i1++;
        double d12 = f1;
        double d14 = f;
        d12 += d13 * 0.2D;
        d12 = d12 * 8.5D / 8.0D;
        double d5 = 8.5D + d12 * 4.0D;
        for (int j2 = 0; j2 < 33; j2++) {
          double d6 = (j2 - d5) * 12.0D * 128.0D / 256.0D / d14;
          if (d6 < 0.0D)
            d6 *= 4.0D; 
          double d7 = this.field_147428_e[l] / 512.0D;
          double d8 = this.field_147425_f[l] / 512.0D;
          double d9 = (this.field_147427_d[l] / 10.0D + 1.0D) / 2.0D;
          double d10 = MathHelper.denormalizeClamp(d7, d8, d9) - d6;
          if (j2 > 29) {
            double d11 = ((j2 - 29) / 3.0F);
            d10 = d10 * (1.0D - d11) + -10.0D * d11;
          } 
          this.field_147434_q[l] = d10;
          l++;
        } 
      } 
    } 
  }
  
  public boolean chunkExists(int par1, int par2) {
    return true;
  }
  
  public void populate(IChunkProvider par1IChunkProvider, int par2, int par3) {
    BlockFalling.fallInstantly = true;
    int k = par2 * 16;
    int l = par3 * 16;
    BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(k + 16, l + 16);
    this.rand.setSeed(this.worldObj.getSeed());
    long i1 = this.rand.nextLong() / 2L * 2L + 1L;
    long j1 = this.rand.nextLong() / 2L * 2L + 1L;
    this.rand.setSeed(par2 * i1 + par3 * j1 ^ this.worldObj.getSeed());
    boolean flag = false;
    biomegenbase.decorate(this.worldObj, this.rand, k, l);
    SpawnerAnimals.performWorldGenSpawning(this.worldObj, biomegenbase, k + 8, l + 8, 16, 16, this.rand);
    BlockFalling.fallInstantly = false;
  }
  
  public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate) {
    return true;
  }
  
  public void saveExtraData() {}
  
  public boolean unloadQueuedChunks() {
    return false;
  }
  
  public boolean canSave() {
    return true;
  }
  
  public String makeString() {
    return "CrystalDimension";
  }
  
  public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4) {
    BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(par2, par4);
    return biomegenbase.getSpawnableList(par1EnumCreatureType);
  }
  
  public int getLoadedChunkCount() {
    return 0;
  }
  
  public void recreateStructures(int par1, int par2) {}
  
  public void generateCrystals(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    addPinkTourmaline(world, random, chunkX, chunkZ, chunk);
    addTigersEye(world, random, chunkX, chunkZ, chunk);
  }
  
  public void addPinkTourmaline(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(30) != 1)
      return; 
    int randPosX = 3 + chunkX + random.nextInt(10);
    int randPosY = 30 + random.nextInt(5);
    int randPosZ = 3 + chunkZ + random.nextInt(10);
    int patchy = 1 + random.nextInt(10);
    for (int i = 0; i < patchy; i++) {
      float dx = random.nextFloat() - random.nextFloat();
      float dz = random.nextFloat() - random.nextFloat();
      float dy = 0.5F + random.nextFloat() / 2.0F;
      int width = random.nextInt(2);
      int length = 1 + width * 3 + random.nextInt(15);
      float rx = randPosX;
      float ry = randPosY;
      float rz = randPosZ;
      for (int iy = 0; iy <= length; iy++) {
        for (int ix = 0; ix <= width; ix++) {
          for (int iz = 0; iz <= width; iz++)
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, (int)(rx + ix), (int)ry, (int)(rz + iz), OreSpawnMain.CrystalCrystal, 0); 
        } 
        ry += dy;
        rx += dx;
        rz += dz;
      } 
    } 
  }
  
  public void addTigersEye(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(30) != 1)
      return; 
    int randPosX = 3 + chunkX + random.nextInt(10);
    int randPosY = 5 + random.nextInt(5);
    int randPosZ = 3 + chunkZ + random.nextInt(10);
    int patchy = 1 + random.nextInt(5);
    for (int i = 0; i < patchy; i++) {
      float dx = random.nextFloat() - random.nextFloat();
      float dz = random.nextFloat() - random.nextFloat();
      float dy = 0.5F + random.nextFloat() / 2.0F;
      int width = 0;
      int length = width * 3 + random.nextInt(6);
      float rx = randPosX;
      float ry = randPosY;
      float rz = randPosZ;
      for (int iy = 0; iy <= length; iy++) {
        for (int ix = 0; ix <= width; ix++) {
          for (int iz = 0; iz <= width; iz++)
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, (int)(rx + ix), (int)ry, (int)(rz + iz), OreSpawnMain.TigersEye, 0); 
        } 
        ry += dy;
        rx += dx;
        rz += dz;
      } 
    } 
  }
  
  public void addCrystalTrees(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(5) != 0)
      return; 
    int howmany = 0;
    int what = random.nextInt(5);
    howmany = random.nextInt(8);
    if (what != 0)
      howmany *= 2; 
    for (int i = 0; i < howmany; i++) {
      int posX = 4 + chunkX + random.nextInt(8);
      int posZ = 4 + chunkZ + random.nextInt(8);
      for (int posY = 128; posY > 40; posY--) {
        if (OreSpawnMain.getBlockIDInChunk(chunk, posX, posY, posZ) == Blocks.air && OreSpawnMain.getBlockIDInChunk(chunk, posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          if (what == 0) {
            TallCrystalTree(world, posX, posY, posZ, chunk);
            break;
          } 
          ScragglyCrystalTreeWithBranches(world, posX, posY, posZ, chunk);
          break;
        } 
      } 
    } 
  }
  
  public void makeScragglyCrystalBranch(World world, int x, int y, int z, int len, int biasx, int biasz, Chunk chunk) {
    for (int k = 0; k < len; k++) {
      int ix = world.rand.nextInt(2) - world.rand.nextInt(2) + biasx;
      int iz = world.rand.nextInt(2) - world.rand.nextInt(2) + biasz;
      if (ix > 1)
        ix = 1; 
      if (ix < -1)
        ix = -1; 
      if (iz > 1)
        iz = 1; 
      if (iz < -1)
        iz = -1; 
      int iy = (world.rand.nextInt(3) > 0) ? 1 : 0;
      x += ix;
      z += iz;
      y += iy;
      Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        return; 
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0);
      for (int m = -1; m < 2; m++) {
        for (int n = -1; n < 2; n++) {
          if (world.rand.nextInt(2) == 1) {
            bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
            if (bid == Blocks.air)
              OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0); 
          } 
        } 
      } 
      if (world.rand.nextInt(2) == 1) {
        bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + 1, z);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0); 
      } 
    } 
  }
  
  public void ScragglyCrystalTreeWithBranches(World world, int x, int y, int z, Chunk chunk) {
    int i = 1 + world.rand.nextInt(2);
    int j = i + world.rand.nextInt(8);
    int k;
    for (k = 0; k < i; k++) {
      Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + k, z);
      if (k >= 1 && bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        return; 
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0);
    } 
    y += i - 1;
    for (k = i; k < j; k++) {
      int ix = world.rand.nextInt(2) - world.rand.nextInt(2);
      int iz = world.rand.nextInt(2) - world.rand.nextInt(2);
      int iy = (world.rand.nextInt(4) > 0) ? 1 : 0;
      x += ix;
      z += iz;
      y += iy;
      Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves2)
        break; 
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0);
      if (world.rand.nextInt(4) == 1)
        makeScragglyCrystalBranch(world, x, y, z, world.rand.nextInt(1 + j - k), world.rand.nextInt(2) - world.rand.nextInt(2), world.rand.nextInt(2) - world.rand.nextInt(2), chunk); 
      for (int m = -1; m < 2; m++) {
        for (int n = -1; n < 2; n++) {
          if (world.rand.nextInt(2) == 1) {
            bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
            if (bid == Blocks.air)
              OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves2, 0); 
          } 
        } 
      } 
      if (world.rand.nextInt(2) == 1) {
        bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + 1, z);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + 1, z, OreSpawnMain.MyCrystalLeaves2, 0); 
      } 
    } 
  }
  
  public void TallCrystalTree(World world, int x, int y, int z, Chunk chunk) {
    int i = 10 + world.rand.nextInt(12);
    if (OreSpawnMain.LessLag == 1)
      i -= 2; 
    if (OreSpawnMain.LessLag == 2)
      i -= 4; 
    int j = i + world.rand.nextInt(18 - OreSpawnMain.LessLag * 2);
    int k;
    for (k = 0; k < i; k++) {
      Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y + k, z);
      if (k >= 1 && bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves)
        return; 
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y + k, z, OreSpawnMain.MyCrystalTreeLog, 0);
    } 
    y += i - 1;
    for (k = i; k < j; k++) {
      y++;
      Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x, y, z);
      if (bid != Blocks.air && bid != OreSpawnMain.MyCrystalTreeLog && bid != OreSpawnMain.MyCrystalLeaves)
        break; 
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x, y, z, OreSpawnMain.MyCrystalTreeLog, 0);
      if (k % 4 == 0)
        for (int n = -1; n < 2; n++) {
          for (int i1 = -1; i1 < 2; i1++) {
            if (world.rand.nextInt(2) == 1) {
              bid = OreSpawnMain.getBlockIDInChunk(chunk, x + n, y, z + i1);
              if (bid == Blocks.air)
                OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + n, y, z + i1, OreSpawnMain.MyCrystalLeaves, 0); 
            } 
          } 
        }  
    } 
    y++;
    int m;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        if (world.rand.nextInt(2) == 1) {
          Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
          if (bid == Blocks.air)
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyCrystalTreeLog, 0); 
        } 
      } 
    } 
    for (m = -3; m < 4; m++) {
      for (int n = -3; n < 4; n++) {
        Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0); 
      } 
    } 
    y++;
    for (m = -1; m < 2; m++) {
      for (int n = -1; n < 2; n++) {
        Block bid = OreSpawnMain.getBlockIDInChunk(chunk, x + m, y, z + n);
        if (bid == Blocks.air)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + m, y, z + n, OreSpawnMain.MyCrystalLeaves, 0); 
      } 
    } 
  }
  
  public void generateCrystalOres(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    int patchy = 25 + random.nextInt(30);
    if (random.nextInt(20) == 0)
      patchy += 30; 
    int i;
    for (i = 0; i < patchy; i++) {
      int randPosX = 2 + chunkX + random.nextInt(12);
      int randPosY = random.nextInt(128);
      int randPosZ = 2 + chunkZ + random.nextInt(12);
      if (randPosY > 45) {
        int j = random.nextInt(11);
        Block b = Blocks.air;
        switch (j) {
          case 0:
            b = OreSpawnMain.MyUrchinSpawnBlock;
            break;
          case 1:
            b = OreSpawnMain.MyFlounderSpawnBlock;
            break;
          case 2:
            b = OreSpawnMain.MySkateSpawnBlock;
            break;
          case 3:
            b = OreSpawnMain.MyRotatorSpawnBlock;
            break;
          case 4:
            b = OreSpawnMain.MyPeacockSpawnBlock;
            break;
          case 5:
            b = OreSpawnMain.MyFairySpawnBlock;
            break;
          case 6:
            b = OreSpawnMain.MyDungeonBeastSpawnBlock;
            break;
          case 7:
            b = OreSpawnMain.MyVortexSpawnBlock;
            break;
          case 8:
            b = OreSpawnMain.MyRatSpawnBlock;
            break;
          case 9:
            b = OreSpawnMain.MyWhaleSpawnBlock;
            break;
          case 10:
            b = OreSpawnMain.MyIrukandjiSpawnBlock;
            break;
        } 
        generateOre(world, random, randPosX, randPosY, randPosZ, chunk, b, 4, OreSpawnMain.CrystalStone);
      } 
    } 
    patchy = 3 + random.nextInt(8);
    for (i = 0; i < patchy; i++) {
      int randPosX = 2 + chunkX + random.nextInt(12);
      int randPosY = random.nextInt(128);
      int randPosZ = 2 + chunkZ + random.nextInt(12);
      generateOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.CrystalCoal, 6, OreSpawnMain.CrystalStone);
    } 
    patchy = 15 + random.nextInt(20);
    for (i = 0; i < patchy; i++) {
      int randPosX = 2 + chunkX + random.nextInt(12);
      int randPosY = random.nextInt(128);
      int randPosZ = 2 + chunkZ + random.nextInt(12);
      if (randPosY < 25)
        generateOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.CrystalRat, 6, OreSpawnMain.CrystalStone); 
    } 
    patchy = 12 + random.nextInt(20);
    for (i = 0; i < patchy; i++) {
      int randPosX = 2 + chunkX + random.nextInt(12);
      int randPosY = random.nextInt(128);
      int randPosZ = 2 + chunkZ + random.nextInt(12);
      if (randPosY < 25)
        generateOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.CrystalFairy, 6, OreSpawnMain.CrystalStone); 
    } 
  }
  
  public boolean generateOre(World par1World, Random par2Random, int par3, int par4, int par5, Chunk chunk, Block newbid, int numberOfBlocks, Block oldbid) {
    float f = par2Random.nextFloat() * 3.1415927F;
    double d0 = ((par3 + 8) + MathHelper.sin(f) * numberOfBlocks / 8.0F);
    double d1 = ((par3 + 8) - MathHelper.sin(f) * numberOfBlocks / 8.0F);
    double d2 = ((par5 + 8) + MathHelper.cos(f) * numberOfBlocks / 8.0F);
    double d3 = ((par5 + 8) - MathHelper.cos(f) * numberOfBlocks / 8.0F);
    double d4 = (par4 + par2Random.nextInt(3) - 2);
    double d5 = (par4 + par2Random.nextInt(3) - 2);
    for (int l = 0; l <= numberOfBlocks; l++) {
      double d6 = d0 + (d1 - d0) * l / numberOfBlocks;
      double d7 = d4 + (d5 - d4) * l / numberOfBlocks;
      double d8 = d2 + (d3 - d2) * l / numberOfBlocks;
      double d9 = par2Random.nextDouble() * numberOfBlocks / 16.0D;
      double d10 = (MathHelper.sin(l * 3.1415927F / numberOfBlocks) + 1.0F) * d9 + 1.0D;
      double d11 = (MathHelper.sin(l * 3.1415927F / numberOfBlocks) + 1.0F) * d9 + 1.0D;
      int i1 = MathHelper.floor_double(d6 - d10 / 2.0D);
      int j1 = MathHelper.floor_double(d7 - d11 / 2.0D);
      int k1 = MathHelper.floor_double(d8 - d10 / 2.0D);
      int l1 = MathHelper.floor_double(d6 + d10 / 2.0D);
      int i2 = MathHelper.floor_double(d7 + d11 / 2.0D);
      int j2 = MathHelper.floor_double(d8 + d10 / 2.0D);
      for (int k2 = i1; k2 <= l1; k2++) {
        double d12 = (k2 + 0.5D - d6) / d10 / 2.0D;
        if (d12 * d12 < 1.0D)
          for (int l2 = j1; l2 <= i2; l2++) {
            double d13 = (l2 + 0.5D - d7) / d11 / 2.0D;
            if (d12 * d12 + d13 * d13 < 1.0D)
              for (int i3 = k1; i3 <= j2; i3++) {
                double d14 = (i3 + 0.5D - d8) / d10 / 2.0D;
                Block bid = OreSpawnMain.getBlockIDInChunk(chunk, k2, l2, i3);
                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && bid == oldbid)
                  OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, k2, l2, i3, newbid, 0); 
              }  
          }  
      } 
    } 
    return true;
  }
  
  public void addRice(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(10) != 0)
      return; 
    for (int i = 0; i < 5; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 128; posY > 40; posY--) {
        if (OreSpawnMain.getBlockIDInChunk(chunk, posX, posY, posZ) == Blocks.air && OreSpawnMain.getBlockIDInChunk(chunk, posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.MyRicePlant, 0);
          break;
        } 
      } 
    } 
  }
  
  public void addQuinoa(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(20) != 0)
      return; 
    for (int i = 0; i < 5; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 128; posY > 40; posY--) {
        if (OreSpawnMain.getBlockIDInChunk(chunk, posX, posY, posZ) == Blocks.air && OreSpawnMain.getBlockIDInChunk(chunk, posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.MyQuinoaPlant1, 0);
          break;
        } 
      } 
    } 
  }
  
  public void addCrystalFlowers(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (random.nextInt(3) != 0)
      return; 
    int howmany = 0;
    howmany = 1 + random.nextInt(13);
    int what = random.nextInt(4);
    for (int i = 0; i < howmany; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 128; posY > 40; posY--) {
        if (OreSpawnMain.getBlockIDInChunk(chunk, posX, posY, posZ) == Blocks.air && OreSpawnMain.getBlockIDInChunk(chunk, posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          if (what == 0) {
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.CrystalFlowerRedBlock, 0);
            break;
          } 
          if (what == 1) {
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.CrystalFlowerGreenBlock, 0);
            break;
          } 
          if (what == 2) {
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.CrystalFlowerBlueBlock, 0);
            break;
          } 
          if (what == 3)
            OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, posX, posY, posZ, OreSpawnMain.CrystalFlowerYellowBlock, 0); 
          break;
        } 
      } 
    } 
  }
  
  public ChunkPosition func_147416_a(World var1, String var2, int var3, int var4, int var5) {
    return null;
  }
}
