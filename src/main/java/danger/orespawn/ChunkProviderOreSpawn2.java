package danger.orespawn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
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
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderOreSpawn2 implements IChunkProvider {
  private Random rand;
  
  private ArrayList MyMobList = null;
  
  private ArrayList MyCritterList = null;
  
  private ArrayList MyAmbientList = null;
  
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
  
  private MapGenBase caveGenerator = (MapGenBase)new MapGenCaves();
  
  private MapGenStronghold strongholdGenerator = new MapGenStronghold();
  
  private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
  
  private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
  
  private MapGenBase ravineGenerator = (MapGenBase)new MapGenRavine();
  
  private BiomeGenBase[] biomesForGeneration;
  
  double[] field_147427_d;
  
  double[] field_147428_e;
  
  double[] field_147425_f;
  
  double[] field_147426_g;
  
  int[][] field_73219_j = new int[32][32];
  
  private static final String __OBFID = "CL_00000396";
  
  public ChunkProviderOreSpawn2(World par1World, long par2, boolean par4) {
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
                  p_147424_3_[j3 += short1] = Blocks.stone;
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
      for (int l = 0; l < 16; l++) {
        BiomeGenBase biomegenbase = p_147422_5_[l + k * 16];
        biomegenbase.genTerrainBlocks(this.worldObj, this.rand, p_147422_3_, p_147422_4_, p_147422_1_ * 16 + k, p_147422_2_ * 16 + l, this.stoneNoise[l + k * 16]);
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
    this.caveGenerator.func_151539_a(this, this.worldObj, par1, par2, ablock);
    this.ravineGenerator.func_151539_a(this, this.worldObj, par1, par2, ablock);
    Chunk chunk = new Chunk(this.worldObj, ablock, abyte, par1, par2);
    OreSpawnMain.Chunker.generateOresInChunk(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    if (OreSpawnMain.LessOre == 0) {
      OreSpawnMain.Chunker.generateOresInChunk(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
      OreSpawnMain.Chunker.generateOresInChunk(this.worldObj, this.rand, par1 * 16, par2 * 16, chunk);
    } 
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
    if (this.mapFeaturesEnabled) {
      this.mineshaftGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
      this.strongholdGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
      this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
    } 
    if (biomegenbase != BiomeGenBase.desert && biomegenbase != BiomeGenBase.desertHills && !flag && this.rand.nextInt(4) == 0 && TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.LAKE)) {
      int i = k + this.rand.nextInt(16) + 8;
      int l1 = this.rand.nextInt(256);
      int i2 = l + this.rand.nextInt(16) + 8;
      (new WorldGenLakes(Blocks.water)).generate(this.worldObj, this.rand, i, l1, i2);
    } 
    if (TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.LAVA) && !flag && this.rand.nextInt(8) == 0) {
      int i = k + this.rand.nextInt(16) + 8;
      int l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
      int i2 = l + this.rand.nextInt(16) + 8;
      if (l1 < 63 || this.rand.nextInt(10) == 0)
        (new WorldGenLakes(Blocks.lava)).generate(this.worldObj, this.rand, i, l1, i2); 
    } 
    boolean doGen = TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.DUNGEON);
    int k1;
    for (k1 = 0; doGen && k1 < 8; k1++) {
      int l1 = k + this.rand.nextInt(16) + 8;
      int i2 = this.rand.nextInt(256);
      int j2 = l + this.rand.nextInt(16) + 8;
      (new WorldGenDungeons()).generate(this.worldObj, this.rand, l1, i2, j2);
    } 
    biomegenbase.decorate(this.worldObj, this.rand, k, l);
    SpawnerAnimals.performWorldGenSpawning(this.worldObj, biomegenbase, k + 8, l + 8, 16, 16, this.rand);
    k += 8;
    l += 8;
    doGen = TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.ICE);
    for (k1 = 0; doGen && k1 < 16; k1++) {
      for (int l1 = 0; l1 < 16; l1++) {
        int i2 = this.worldObj.getPrecipitationHeight(k + k1, l + l1);
        if (this.worldObj.isBlockFreezable(k1 + k, i2 - 1, l1 + l))
          this.worldObj.setBlock(k1 + k, i2 - 1, l1 + l, Blocks.ice, 0, 2); 
        if (this.worldObj.func_147478_e(k1 + k, i2, l1 + l, true))
          this.worldObj.setBlock(k1 + k, i2, l1 + l, Blocks.snow_layer, 0, 2); 
      } 
    } 
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
    return "VillageDimension";
  }
  
  public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4) {
    BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(par2, par4);
    List l = null;
    if (var5 != null) {
      l = var5.getSpawnableList(par1EnumCreatureType);
      if (par1EnumCreatureType == EnumCreatureType.monster) {
        if (this.MyMobList == null) {
          this.MyMobList = new ArrayList();
          if (OreSpawnMain.AlosaurusEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Alosaurus.class, 8, 1, 2)); 
          if (OreSpawnMain.TRexEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(TRex.class, 6, 1, 2)); 
          if (OreSpawnMain.NastysaurusEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Nastysaurus.class, 6, 1, 2)); 
          if (OreSpawnMain.PointysaurusEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Pointysaurus.class, 10, 4, 8)); 
          if (OreSpawnMain.GammaMetroidEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(GammaMetroid.class, 35, 4, 7)); 
          if (OreSpawnMain.AlienEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Alien.class, 35, 2, 3)); 
          if (OreSpawnMain.CaveFisherEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(CaveFisher.class, 35, 4, 8)); 
          if (OreSpawnMain.CryolophosaurusEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Cryolophosaurus.class, 26, 4, 7)); 
          if (OreSpawnMain.SpyroEnable != 0)
            this.MyMobList.add(new BiomeGenBase.SpawnListEntry(Spyro.class, 5, 1, 2)); 
          Iterator<BiomeGenBase.SpawnListEntry> var2 = l.iterator();
          while (var2.hasNext()) {
            BiomeGenBase.SpawnListEntry var3 = var2.next();
            this.MyMobList.add(var3);
          } 
        } 
        return this.MyMobList;
      } 
      if (par1EnumCreatureType == EnumCreatureType.ambient) {
        if (this.MyAmbientList == null) {
          this.MyAmbientList = new ArrayList();
          if (OreSpawnMain.VelocityRaptorEnable != 0)
            this.MyAmbientList.add(new BiomeGenBase.SpawnListEntry(VelocityRaptor.class, 1, 2, 4)); 
          if (OreSpawnMain.DragonflyEnable != 0)
            this.MyAmbientList.add(new BiomeGenBase.SpawnListEntry(Dragonfly.class, 2, 1, 3)); 
          if (OreSpawnMain.CamarasaurusEnable != 0)
            this.MyAmbientList.add(new BiomeGenBase.SpawnListEntry(Camarasaurus.class, 1, 2, 4)); 
          if (OreSpawnMain.BaryonyxEnable != 0)
            this.MyAmbientList.add(new BiomeGenBase.SpawnListEntry(Baryonyx.class, 2, 4, 8)); 
          Iterator<BiomeGenBase.SpawnListEntry> var2 = l.iterator();
          while (var2.hasNext()) {
            BiomeGenBase.SpawnListEntry var3 = var2.next();
            this.MyAmbientList.add(var3);
          } 
        } 
        return this.MyAmbientList;
      } 
    } 
    return l;
  }
  
  public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_) {
    return ("Stronghold".equals(p_147416_2_) && this.strongholdGenerator != null) ? this.strongholdGenerator.func_151545_a(p_147416_1_, p_147416_3_, p_147416_4_, p_147416_5_) : null;
  }
  
  public int getLoadedChunkCount() {
    return 0;
  }
  
  public void recreateStructures(int par1, int par2) {
    if (this.mapFeaturesEnabled) {
      this.mineshaftGenerator.func_151539_a(this, this.worldObj, par1, par2, (Block[])null);
      this.strongholdGenerator.func_151539_a(this, this.worldObj, par1, par2, (Block[])null);
      this.scatteredFeatureGenerator.func_151539_a(this, this.worldObj, par1, par2, (Block[])null);
    } 
  }
}
