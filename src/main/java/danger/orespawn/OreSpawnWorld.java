package danger.orespawn;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreSpawnWorld implements IWorldGenerator {
  public static int recently_placed = 50;
  
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    if (world.isRemote)
      return; 
    Chunk chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
    if (recently_placed > 0)
      recently_placed--; 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID) {
      generateSurface(world, random, chunkX * 16, chunkZ * 16);
      if (false == addHugeTree(world, random, chunkX * 16, chunkZ * 16, chunk)) {
        if (false == addAppleTrees(world, random, chunkX * 16, chunkZ * 16, chunk))
          if (false == addOtherTrees(world, random, chunkX * 16, chunkZ * 16) && 
            recently_placed == 0)
            addKingAltar(world, random, chunkX * 16, chunkZ * 16);  
        addVeggies(world, random, chunkX * 16, chunkZ * 16);
      } 
      boolean rbd = false;
      rbd = addRubyDungeon(world, random, chunkX * 16, chunkZ * 16);
      if (!rbd)
        addGenericDungeon(world, random, chunkX * 16, chunkZ * 16); 
      return;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID2) {
      generateRuby(world, random, chunkX * 16, chunkZ * 16);
      if (OreSpawnMain.LessOre == 0) {
        generateRuby(world, random, chunkX * 16, chunkZ * 16);
        generateRuby(world, random, chunkX * 16, chunkZ * 16);
        int i;
        for (i = 0; i < 45; i++) {
          int randPosX = chunkX * 16 + random.nextInt(16);
          int randPosY = random.nextInt(128);
          int randPosZ = chunkZ * 16 + random.nextInt(16);
          if (randPosY < 50)
            (new WorldGenMinable(Blocks.lapis_ore, 7)).generate(world, random, randPosX, randPosY, randPosZ); 
        } 
        for (i = 0; i < 25; i++) {
          int randPosX = chunkX * 16 + random.nextInt(16);
          int randPosY = random.nextInt(128);
          int randPosZ = chunkZ * 16 + random.nextInt(16);
          if (randPosY < 50)
            (new WorldGenMinable(Blocks.lapis_ore, 4)).generate(world, random, randPosX, randPosY, randPosZ); 
        } 
      } 
      if (recently_placed == 0 && random.nextInt(95) == 1) {
        int i = random.nextInt(7);
        if (i == 0)
          addBasiliskMaze(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 1)
          addKyuubiDungeon(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 2)
          addBeeHive(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 3)
          addShadowDungeon(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 4)
          addAlienWTF(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 5)
          addEnderKnight(world, random, chunkX * 16, chunkZ * 16); 
        if (i == 6)
          addLeonNest(world, random, chunkX * 16, chunkZ * 16); 
      } else {
        addGenericDungeon(world, random, chunkX * 16, chunkZ * 16);
      } 
      addLavaAndWater(world, random, chunkX * 16, chunkZ * 16);
      addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
      addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
      addMosquitos(world, random, chunkX * 16, chunkZ * 16);
      addMosquitos(world, random, chunkX * 16, chunkZ * 16);
      addVeggies(world, random, chunkX * 16, chunkZ * 16);
      addRocks(world, random, chunkX * 16, chunkZ * 16);
      return;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID3) {
      if (OreSpawnMain.MosquitoEnable != 0)
        addMosquitos(world, random, chunkX, chunkZ); 
      addAnts(world, random, chunkX * 16, chunkZ * 16, 4);
      addAppleTrees(world, random, chunkX * 16, chunkZ * 16, chunk);
      addGenericDungeon(world, random, chunkX * 16, chunkZ * 16);
      if (recently_placed == 0)
        addDamselInDistress(world, random, chunkX * 16, chunkZ * 16); 
      if (recently_placed == 0)
        addSpiderHangout(world, random, chunkX * 16, chunkZ * 16); 
      if (recently_placed == 0)
        addRedAntHangout(world, random, chunkX * 16, chunkZ * 16); 
      return;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID4) {
      if (recently_placed == 0 && random.nextInt(100) == 0 && 
        D4BigSpaceCheck(world, chunkX * 16, 7, chunkZ * 16) == true) {
        int j = random.nextInt(19);
        if (j < 3) {
          addD4Castle(world, random, chunkX * 16, chunkZ * 16);
        } else if (j < 7) {
          addD4GenericDungeon(world, random, chunkX * 16, chunkZ * 16);
        } else {
          if (j == 7)
            addD4EnderCastle(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 8)
            addD4IncaPyramid(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 9)
            addD4RobotLab(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 10)
            addD4Mini(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 11)
            addD4RubyDungeon(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 12)
            addD4CephadromeAltar(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 13)
            addD4Greenhouse(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 14)
            addD4NightmareRookery(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 15)
            addD4StinkyHouse(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 16)
            addD4WhiteHouse(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 17)
            addPumpkin(world, random, chunkX * 16, chunkZ * 16); 
          if (j == 18)
            addD4Rainbow(world, random, chunkX * 16, chunkZ * 16); 
        } 
      } 
      int i = random.nextInt(300);
      if (i == 0)
        addD4CloudShark(world, random, chunkX * 16, chunkZ * 16); 
      addUnstableAnts(world, random, chunkX * 16, chunkZ * 16);
      addIslands(world, random, chunkX * 16, chunkZ * 16);
      addD4Rocks(world, random, chunkX * 16, chunkZ * 16);
      return;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID5) {
      if (!addFairyTree(world, random, chunkX * 16, chunkZ * 16)) {
        addCrystalTermites(world, random, chunkX * 16, chunkZ * 16);
        if (recently_placed == 0) {
          if (!addRotatorStation(world, random, chunkX * 16, chunkZ * 16) && 
            !addUrchinSpawner(world, random, chunkX * 16, chunkZ * 16) && 
            !addCrystalHauntedHouse(world, random, chunkX * 16, chunkZ * 16) && 
            !addRoundRotator(world, random, chunkX * 16, chunkZ * 16))
            addCrystalBattleTower(world, random, chunkX * 16, chunkZ * 16); 
          addIrukandji(world, random, chunkX * 16, chunkZ * 16);
        } 
      } 
      addCrystalChestsAndSpawners(world, random, chunkX * 16, chunkZ * 16);
      if (world.rand.nextInt(4) == 1)
        addRocks(world, random, chunkX * 16, chunkZ * 16); 
      return;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID6) {
      addButterfliesAndMoths(world, random, chunkX * 16, chunkZ * 16);
      addVeggies(world, random, chunkX * 16, chunkZ * 16);
      addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
      return;
    } 
    switch (world.provider.dimensionId) {
      case -1:
        generateNether(world, random, chunkX * 16, chunkZ * 16);
        break;
      case 0:
        generateSurface(world, random, chunkX * 16, chunkZ * 16);
        generateOres(world, random, chunkX * 16, chunkZ * 16);
        break;
      case 1:
        generateEnd(world, random, chunkX * 16, chunkZ * 16);
        break;
    } 
  }
  
  private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
    addEndAnts(world, random, chunkX, chunkZ);
    int i = world.rand.nextInt(4);
    if (i == 0)
      addEndKnights(world, random, chunkX, chunkZ); 
    if (i == 1)
      addEndReapers(world, random, chunkX, chunkZ); 
    if (i == 2)
      addHospital(world, random, chunkX, chunkZ); 
    if (i == 3)
      addEnderCastle(world, random, chunkX, chunkZ); 
  }
  
  private void generateNether(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.MosquitoEnable != 0)
      addNetherMosquitos(world, random, chunkX, chunkZ); 
    addNetherAnts(world, random, chunkX, chunkZ);
    int patchy = 15 + random.nextInt(10);
    if (OreSpawnMain.LessOre != 0)
      patchy /= 3; 
    int i;
    for (i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(13);
      int randPosY = random.nextInt(108) + 10;
      int randPosZ = 3 + chunkZ + random.nextInt(13);
      (new WorldGenMinable(OreSpawnMain.MyLavafoamBlock, 6, Blocks.netherrack)).generate(world, random, randPosX, randPosY, randPosZ);
    } 
    patchy = 5 + random.nextInt(5);
    if (OreSpawnMain.LessOre != 0)
      patchy /= 3; 
    for (i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(13);
      int randPosY = random.nextInt(108) + 10;
      int randPosZ = 3 + chunkZ + random.nextInt(13);
      (new WorldGenMinable(OreSpawnMain.MyOreRubyBlock, 2, Blocks.netherrack)).generate(world, random, randPosX, randPosY, randPosZ);
    } 
  }
  
  public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
    boolean ahh = false;
    addStrawberries(world, random, chunkX, chunkZ);
    addCorn(world, random, chunkX, chunkZ);
    addTomatoes(world, random, chunkX, chunkZ);
    addVeggies(world, random, chunkX, chunkZ);
    addButterfliesAndMoths(world, random, chunkX, chunkZ);
    if (OreSpawnMain.MosquitoEnable != 0)
      addMosquitos(world, random, chunkX, chunkZ); 
    if (OreSpawnMain.DisableOverworldDungeons == 0 && world.provider.dimensionId == 0 && 
      recently_placed == 0) {
      int i = world.rand.nextInt(6);
      if (i == 0)
        addPlayPool(world, random, chunkX, chunkZ); 
      if (i == 1)
        addWaterDragonLair(world, random, chunkX, chunkZ); 
      if (i == 2)
        addGoldFishBowl(world, random, chunkX, chunkZ); 
      if (i == 3)
        addGirlfriendIsland(world, random, chunkX, chunkZ); 
      if (i == 4)
        addMonsterIsland(world, random, chunkX, chunkZ); 
      if (i == 5)
        addFrogPond(world, random, chunkX, chunkZ); 
      ahh = addANest(world, random, chunkX, chunkZ);
      if (!ahh)
        ahh = addHauntedHouse(world, random, chunkX, chunkZ); 
      if (!ahh)
        ahh = addLeafMonster(world, random, chunkX, chunkZ); 
      if (!ahh)
        ahh = addSpitBug(world, random, chunkX, chunkZ); 
      if (!ahh)
        ahh = addIgloo(world, random, chunkX, chunkZ); 
      if (!ahh)
        ahh = addBouncyCastle(world, random, chunkX, chunkZ); 
      if (!ahh)
        ahh = addRubberDuckyPond(world, random, chunkX, chunkZ); 
    } 
    addAnts(world, random, chunkX, chunkZ, 4);
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("River") || b.biomeName.equals("Extreme Hills") || b.biomeName.equals("Desert"))
      addRocks(world, random, chunkX, chunkZ); 
  }
  
  public void generateRuby(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.Ruby_stats.rate <= 0)
      return; 
    int patchy = OreSpawnMain.Ruby_stats.rate + random.nextInt(7);
    for (int i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(10);
      int randPosY = random.nextInt(128);
      int randPosZ = 3 + chunkZ + random.nextInt(10);
      if (randPosY <= OreSpawnMain.Ruby_stats.maxdepth && randPosY >= OreSpawnMain.Ruby_stats.mindepth)
        for (int m = randPosY; m > 5; m--) {
          Block bid = world.getBlock(randPosX, m, randPosZ);
          if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
            bid = world.getBlock(randPosX, m - 1, randPosZ);
            if (bid == Blocks.stone) {
              OreSpawnMain.setBlockFast(world, randPosX, m - 1, randPosZ, OreSpawnMain.MyOreRubyBlock, 0, 2);
              break;
            } 
          } 
        }  
    } 
  }
  
  public void generateOres(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.SpawnOres_stats.rate > 0) {
      int j = OreSpawnMain.SpawnOres_stats.rate + random.nextInt(20);
      if (random.nextInt(20) == 0)
        j += 30; 
      if (OreSpawnMain.LessOre != 0)
        j /= 3; 
      for (int k = 0; k < j; k++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.SpawnOres_stats.maxdepth && randPosY >= OreSpawnMain.SpawnOres_stats.mindepth)
          if (random.nextInt(104) < 7) {
            int m = random.nextInt(7);
            Block b = Blocks.air;
            switch (m) {
              case 0:
                b = OreSpawnMain.MyBrutalflySpawnBlock;
                break;
              case 1:
                b = OreSpawnMain.MyNastysaurusSpawnBlock;
                break;
              case 2:
                b = OreSpawnMain.MyPointysaurusSpawnBlock;
                break;
              case 3:
                b = OreSpawnMain.MyCricketSpawnBlock;
                break;
              case 4:
                b = OreSpawnMain.MyFrogSpawnBlock;
                break;
              case 5:
                b = OreSpawnMain.MySpiderDriverSpawnBlock;
                break;
              case 6:
                b = OreSpawnMain.MyCrabSpawnBlock;
                break;
            } 
            (new WorldGenMinable(b, OreSpawnMain.SpawnOres_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ);
          } else {
            int m = random.nextInt(98);
            Block b = Blocks.air;
            switch (m) {
              case 0:
                b = OreSpawnMain.MySpiderSpawnBlock;
                break;
              case 1:
                b = OreSpawnMain.MyBatSpawnBlock;
                break;
              case 2:
                b = OreSpawnMain.MyCowSpawnBlock;
                break;
              case 3:
                b = OreSpawnMain.MyPigSpawnBlock;
                break;
              case 4:
                b = OreSpawnMain.MySquidSpawnBlock;
                break;
              case 5:
                b = OreSpawnMain.MyChickenSpawnBlock;
                break;
              case 6:
                b = OreSpawnMain.MyCreeperSpawnBlock;
                break;
              case 7:
                b = OreSpawnMain.MySkeletonSpawnBlock;
                break;
              case 8:
                b = OreSpawnMain.MyZombieSpawnBlock;
                break;
              case 9:
                b = OreSpawnMain.MySlimeSpawnBlock;
                break;
              case 10:
                b = OreSpawnMain.MyGhastSpawnBlock;
                break;
              case 11:
                b = OreSpawnMain.MyZombiePigmanSpawnBlock;
                break;
              case 12:
                b = OreSpawnMain.MyEndermanSpawnBlock;
                break;
              case 13:
                b = OreSpawnMain.MyCaveSpiderSpawnBlock;
                break;
              case 14:
                b = OreSpawnMain.MySilverfishSpawnBlock;
                break;
              case 15:
                b = OreSpawnMain.MyMagmaCubeSpawnBlock;
                break;
              case 16:
                b = OreSpawnMain.MyWitchSpawnBlock;
                break;
              case 17:
                b = OreSpawnMain.MySheepSpawnBlock;
                break;
              case 18:
                b = OreSpawnMain.MyWolfSpawnBlock;
                break;
              case 19:
                b = OreSpawnMain.MyMooshroomSpawnBlock;
                break;
              case 20:
                b = OreSpawnMain.MyOcelotSpawnBlock;
                break;
              case 21:
                b = OreSpawnMain.MyBlazeSpawnBlock;
                break;
              case 22:
                b = OreSpawnMain.MyWitherSkeletonSpawnBlock;
                break;
              case 23:
                b = OreSpawnMain.MyEnderDragonSpawnBlock;
                break;
              case 24:
                b = OreSpawnMain.MySnowGolemSpawnBlock;
                break;
              case 25:
                b = OreSpawnMain.MyIronGolemSpawnBlock;
                break;
              case 26:
                b = OreSpawnMain.MyWitherBossSpawnBlock;
                break;
              case 27:
                b = OreSpawnMain.MyGirlfriendSpawnBlock;
                break;
              case 28:
                b = OreSpawnMain.MyRedCowSpawnBlock;
                break;
              case 29:
                b = OreSpawnMain.MyGoldCowSpawnBlock;
                break;
              case 30:
                b = OreSpawnMain.MyEnchantedCowSpawnBlock;
                break;
              case 31:
                b = OreSpawnMain.MyMOTHRASpawnBlock;
                break;
              case 32:
                b = OreSpawnMain.MyAloSpawnBlock;
                break;
              case 33:
                b = OreSpawnMain.MyCryoSpawnBlock;
                break;
              case 34:
                b = OreSpawnMain.MyCamaSpawnBlock;
                break;
              case 35:
                b = OreSpawnMain.MyVeloSpawnBlock;
                break;
              case 36:
                b = OreSpawnMain.MyHydroSpawnBlock;
                break;
              case 37:
                b = OreSpawnMain.MyBasilSpawnBlock;
                break;
              case 38:
                b = OreSpawnMain.MyDragonflySpawnBlock;
                break;
              case 39:
                b = OreSpawnMain.MyEmperorScorpionSpawnBlock;
                break;
              case 40:
                b = OreSpawnMain.MyScorpionSpawnBlock;
                break;
              case 41:
                b = OreSpawnMain.MyCaveFisherSpawnBlock;
                break;
              case 42:
                b = OreSpawnMain.MySpyroSpawnBlock;
                break;
              case 43:
                b = OreSpawnMain.MyBaryonyxSpawnBlock;
                break;
              case 44:
                b = OreSpawnMain.MyGammaMetroidSpawnBlock;
                break;
              case 45:
                b = OreSpawnMain.MyCockateilSpawnBlock;
                break;
              case 46:
                b = OreSpawnMain.MyKyuubiSpawnBlock;
                break;
              case 47:
                b = OreSpawnMain.MyAlienSpawnBlock;
                break;
              case 48:
                b = OreSpawnMain.MyAttackSquidSpawnBlock;
                break;
              case 49:
                b = OreSpawnMain.MyWaterDragonSpawnBlock;
                break;
              case 50:
                b = OreSpawnMain.MyKrakenSpawnBlock;
                break;
              case 51:
                b = OreSpawnMain.MyLizardSpawnBlock;
                break;
              case 52:
                b = OreSpawnMain.MyCephadromeSpawnBlock;
                break;
              case 53:
                b = OreSpawnMain.MyDragonSpawnBlock;
                break;
              case 54:
                b = OreSpawnMain.MyBeeSpawnBlock;
                break;
              case 55:
                b = OreSpawnMain.MyHorseSpawnBlock;
                break;
              case 56:
                b = OreSpawnMain.MyTrooperBugSpawnBlock;
                break;
              case 57:
                b = OreSpawnMain.MySpitBugSpawnBlock;
                break;
              case 58:
                b = OreSpawnMain.MyStinkBugSpawnBlock;
                break;
              case 59:
                b = OreSpawnMain.MyOstrichSpawnBlock;
                break;
              case 60:
                b = OreSpawnMain.MyGazelleSpawnBlock;
                break;
              case 61:
                b = OreSpawnMain.MyChipmunkSpawnBlock;
                break;
              case 62:
                b = OreSpawnMain.MyCreepingHorrorSpawnBlock;
                break;
              case 63:
                b = OreSpawnMain.MyTerribleTerrorSpawnBlock;
                break;
              case 64:
                b = OreSpawnMain.MyCliffRacerSpawnBlock;
                break;
              case 65:
                b = OreSpawnMain.MyTriffidSpawnBlock;
                break;
              case 66:
                b = OreSpawnMain.MyPitchBlackSpawnBlock;
                break;
              case 67:
                b = OreSpawnMain.MyLurkingTerrorSpawnBlock;
                break;
              case 68:
                b = OreSpawnMain.MyGodzillaPartSpawnBlock;
                break;
              case 69:
                b = OreSpawnMain.MyGodzillaSpawnBlock;
                break;
              case 70:
                b = OreSpawnMain.MySmallWormSpawnBlock;
                break;
              case 71:
                b = OreSpawnMain.MyMediumWormSpawnBlock;
                break;
              case 72:
                b = OreSpawnMain.MyLargeWormSpawnBlock;
                break;
              case 73:
                b = OreSpawnMain.MyCassowarySpawnBlock;
                break;
              case 74:
                b = OreSpawnMain.MyCloudSharkSpawnBlock;
                break;
              case 75:
                b = OreSpawnMain.MyGoldFishSpawnBlock;
                break;
              case 76:
                b = OreSpawnMain.MyLeafMonsterSpawnBlock;
                break;
              case 77:
                b = OreSpawnMain.MyTshirtSpawnBlock;
                break;
              case 78:
                b = OreSpawnMain.MyEnderKnightSpawnBlock;
                break;
              case 79:
                b = OreSpawnMain.MyEnderReaperSpawnBlock;
                break;
              case 80:
                b = OreSpawnMain.MyBeaverSpawnBlock;
                break;
              case 81:
                b = OreSpawnMain.MyTRexSpawnBlock;
                break;
              case 82:
                b = OreSpawnMain.MyHerculesSpawnBlock;
                break;
              case 83:
                b = OreSpawnMain.MyMantisSpawnBlock;
                break;
              case 84:
                b = OreSpawnMain.MyStinkySpawnBlock;
                break;
              case 85:
                b = OreSpawnMain.MyBoyfriendSpawnBlock;
                break;
              case 86:
                b = OreSpawnMain.MyTheKingPartSpawnBlock;
                break;
              case 87:
                b = OreSpawnMain.MyEasterBunnySpawnBlock;
                break;
              case 88:
                b = OreSpawnMain.MyCaterKillerSpawnBlock;
                break;
              case 89:
                b = OreSpawnMain.MyMolenoidSpawnBlock;
                break;
              case 90:
                b = OreSpawnMain.MySeaMonsterSpawnBlock;
                break;
              case 91:
                b = OreSpawnMain.MySeaViperSpawnBlock;
                break;
              case 92:
                b = OreSpawnMain.MyLeonSpawnBlock;
                break;
              case 93:
                b = OreSpawnMain.MyHammerheadSpawnBlock;
                break;
              case 94:
                b = OreSpawnMain.MyRubberDuckySpawnBlock;
                break;
              case 95:
                b = OreSpawnMain.MyVillagerSpawnBlock;
                break;
              case 96:
                b = OreSpawnMain.MyCriminalSpawnBlock;
                break;
              case 97:
                b = OreSpawnMain.MyTheQueenPartSpawnBlock;
                break;
            } 
            (new WorldGenMinable(b, OreSpawnMain.SpawnOres_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ);
          }  
      } 
    } 
    if (OreSpawnMain.Uranium_stats.rate > 0) {
      int j = OreSpawnMain.Uranium_stats.rate + random.nextInt(9);
      if (OreSpawnMain.LessOre != 0)
        j /= 3; 
      for (int k = 0; k < j; k++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.Uranium_stats.maxdepth && randPosY >= OreSpawnMain.Uranium_stats.mindepth)
          (new WorldGenMinable(OreSpawnMain.MyOreUraniumBlock, OreSpawnMain.Uranium_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
      } 
    } 
    if (OreSpawnMain.Titanium_stats.rate > 0) {
      int j = OreSpawnMain.Titanium_stats.rate + random.nextInt(9);
      if (OreSpawnMain.LessOre != 0)
        j /= 3; 
      for (int k = 0; k < j; k++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.Titanium_stats.maxdepth && randPosY >= OreSpawnMain.Titanium_stats.mindepth)
          (new WorldGenMinable(OreSpawnMain.MyOreTitaniumBlock, OreSpawnMain.Titanium_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
      } 
    } 
    if (OreSpawnMain.Amethyst_stats.rate > 0) {
      int j = OreSpawnMain.Amethyst_stats.rate + random.nextInt(12);
      if (OreSpawnMain.LessOre != 0)
        j /= 3; 
      for (int k = 0; k < j; k++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.Amethyst_stats.maxdepth && randPosY >= OreSpawnMain.Amethyst_stats.mindepth)
          (new WorldGenMinable(OreSpawnMain.MyOreAmethystBlock, OreSpawnMain.Amethyst_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
      } 
    } 
    if (OreSpawnMain.Salt_stats.rate > 0) {
      int j = OreSpawnMain.Salt_stats.rate + random.nextInt(9);
      if (OreSpawnMain.LessOre != 0)
        j /= 3; 
      for (int k = 0; k < j; k++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.Salt_stats.maxdepth && randPosY >= OreSpawnMain.Salt_stats.mindepth)
          (new WorldGenMinable(OreSpawnMain.MyOreSaltBlock, OreSpawnMain.Salt_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
      } 
    } 
    int patchy = 4 + random.nextInt(4);
    if (OreSpawnMain.LessOre != 0)
      patchy /= 2; 
    int i;
    for (i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(10);
      int randPosY = random.nextInt(128);
      int randPosZ = 3 + chunkZ + random.nextInt(10);
      if (randPosY <= 50 && randPosY >= 5)
        (new WorldGenMinable(OreSpawnMain.RedAntTroll, 4)).generate(world, random, randPosX, randPosY, randPosZ); 
    } 
    patchy = 4 + random.nextInt(4);
    if (OreSpawnMain.LessOre != 0)
      patchy /= 2; 
    for (i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(10);
      int randPosY = random.nextInt(128);
      int randPosZ = 3 + chunkZ + random.nextInt(10);
      if (randPosY <= 50 && randPosY >= 5)
        (new WorldGenMinable(OreSpawnMain.TermiteTroll, 4)).generate(world, random, randPosX, randPosY, randPosZ); 
    } 
    if (OreSpawnMain.Ruby_stats.rate > 0) {
      patchy = OreSpawnMain.Ruby_stats.rate + random.nextInt(5);
      for (i = 0; i < patchy; i++) {
        int randPosX = 3 + chunkX + random.nextInt(10);
        int randPosY = random.nextInt(128);
        int randPosZ = 3 + chunkZ + random.nextInt(10);
        if (randPosY <= OreSpawnMain.Ruby_stats.maxdepth && randPosY >= OreSpawnMain.Ruby_stats.mindepth)
          for (int m = randPosY; m > 5; m--) {
            Block bid = world.getBlock(randPosX, m, randPosZ);
            if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
              bid = world.getBlock(randPosX, m - 1, randPosZ);
              if (bid == Blocks.stone) {
                OreSpawnMain.setBlockFast(world, randPosX, m - 1, randPosZ, OreSpawnMain.MyOreRubyBlock, 0, 2);
                break;
              } 
            } 
          }  
      } 
    } 
    if (OreSpawnMain.LessOre == 0) {
      if (OreSpawnMain.Diamond_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Diamond_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Diamond_stats.maxdepth && randPosY >= OreSpawnMain.Diamond_stats.mindepth)
            (new WorldGenMinable(Blocks.diamond_ore, OreSpawnMain.Diamond_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.BlkDiamond_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkDiamond_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkDiamond_stats.maxdepth && randPosY >= OreSpawnMain.BlkDiamond_stats.mindepth)
            (new WorldGenMinable(Blocks.diamond_block, OreSpawnMain.BlkDiamond_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.Emerald_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Emerald_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Emerald_stats.maxdepth && randPosY >= OreSpawnMain.Emerald_stats.mindepth)
            (new WorldGenMinable(Blocks.emerald_ore, OreSpawnMain.Emerald_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.BlkEmerald_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkEmerald_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkEmerald_stats.maxdepth && randPosY >= OreSpawnMain.BlkEmerald_stats.mindepth)
            (new WorldGenMinable(Blocks.emerald_block, OreSpawnMain.BlkEmerald_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.Gold_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Gold_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Gold_stats.maxdepth && randPosY >= OreSpawnMain.Gold_stats.mindepth)
            (new WorldGenMinable(Blocks.gold_ore, OreSpawnMain.Gold_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.BlkGold_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkGold_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkGold_stats.maxdepth && randPosY >= OreSpawnMain.BlkGold_stats.mindepth)
            (new WorldGenMinable(Blocks.gold_block, OreSpawnMain.BlkGold_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
      if (OreSpawnMain.BlkRuby_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkRuby_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkRuby_stats.maxdepth && randPosY >= OreSpawnMain.BlkRuby_stats.mindepth)
            (new WorldGenMinable(OreSpawnMain.MyBlockRubyBlock, OreSpawnMain.BlkRuby_stats.clumpsize)).generate(world, random, randPosX, randPosY, randPosZ); 
        }  
    } 
  }
  
  public void addStrawberries(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(20) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("Birch Forest Hills") || b.biomeName.equals("Birch Forest"))
      for (int i = 0; i < 5; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyStrawberryPlant, 0, 2);
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public boolean addHauntedHouse(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(285) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Plains") || b.biomeName.equals("Taiga") || b.biomeName.equals("Swampland"))
      for (int i = 0; i < 5; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              OreSpawnMain.MyDungeon.makeHauntedHouse(world, posX, posY, posZ);
              recently_placed = 50;
              return true;
            } 
            posY--;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addANest(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(230) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("Jungle") || b.biomeName.equals("JungleHills") || b.biomeName.equals("Birch Forest") || b.biomeName.equals("Birch Forest Hills"))
      for (int i = 0; i < 5; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        for (int posY = 128; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              if (random.nextInt(2) == 0) {
                OreSpawnMain.MyDungeon.makeSmallBeeHive(world, posX, posY, posZ);
              } else {
                OreSpawnMain.MyDungeon.makeMantisHive(world, posX, posY, posZ);
              } 
              recently_placed = 50;
              return true;
            } 
            posY--;
          } 
        } 
      }  
    return false;
  }
  
  public void addCorn(World world, Random random, int chunkX, int chunkZ) {
    int is_all_air = 1;
    int nc = 6;
    if (random.nextInt(35) != 1)
      return; 
    if (OreSpawnMain.LessLag == 1)
      nc = 5; 
    if (OreSpawnMain.LessLag == 2)
      nc = 3; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Plains"))
      for (int j = 0; j < nc; j++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        is_all_air = 1;
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              int i;
              for (i = 1; i < 10; i++) {
                if (!world.isAirBlock(posX, posY + i, posZ))
                  is_all_air = 0; 
              } 
              if (is_all_air != 0) {
                int corn_height = random.nextInt(5);
                corn_height++;
                if (corn_height == 1)
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant1, 0, 2); 
                if (corn_height == 2) {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant2, 0, 2);
                  OreSpawnMain.setBlockFast(world, posX, posY + 1, posZ, OreSpawnMain.MyCornPlant1, 0, 2);
                } 
                if (corn_height > 2) {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant2, 0, 2);
                  for (i = 1; i < corn_height; i++)
                    OreSpawnMain.setBlockFast(world, posX, posY + i, posZ, OreSpawnMain.MyCornPlant4, 0, 2); 
                  OreSpawnMain.setBlockFast(world, posX, posY + corn_height, posZ, OreSpawnMain.MyCornPlant1, 0, 2);
                } 
              } 
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public void addTomatoes(World world, Random random, int chunkX, int chunkZ) {
    int is_all_air = 1;
    if (random.nextInt(70) != 1)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Plains"))
      for (int j = 0; j < 5; j++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        is_all_air = 1;
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              int i;
              for (i = 1; i < 10; i++) {
                if (!world.isAirBlock(posX, posY + i, posZ))
                  is_all_air = 0; 
              } 
              if (is_all_air != 0) {
                int corn_height = random.nextInt(3);
                corn_height++;
                if (corn_height == 1)
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2); 
                if (corn_height == 2) {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant2, 0, 2);
                  OreSpawnMain.setBlockFast(world, posX, posY + 1, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2);
                } 
                if (corn_height > 2) {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant3, 0, 2);
                  for (i = 1; i < corn_height; i++)
                    OreSpawnMain.setBlockFast(world, posX, posY + i, posZ, OreSpawnMain.MyTomatoPlant4, 0, 2); 
                  OreSpawnMain.setBlockFast(world, posX, posY + corn_height, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2);
                } 
              } 
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public void addButterfliesAndMoths(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(10 + OreSpawnMain.LessLag * 2) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID6 || b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("River") || b.biomeName.equals("Jungle") || b.biomeName.equals("JungleHills") || b.biomeName.equals("Swampland") || b.biomeName.equals("Birch Forest") || b.biomeName.equals("Birch Forest Hills") || b.biomeName.equals("Roofed Forest"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              which = random.nextInt(3);
              if (which == 0) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyButterflyPlant, 0, 2);
                break;
              } 
              if (which == 1) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyMothPlant, 0, 2);
                break;
              } 
              OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyFireflyPlant, 0, 2);
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public void addPlayPool(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(350) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ocean"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
            OreSpawnMain.MyDungeon.makePlayPool(world, posX, posY, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public void addFrogPond(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(350) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Plains"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            OreSpawnMain.MyDungeon.makeFrogPond(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public void addGoldFishBowl(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(350) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ocean"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
            OreSpawnMain.MyDungeon.makeGoldFishBowl(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public boolean addLeafMonster(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(275) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Plains"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            OreSpawnMain.MyDungeon.makeLeafMonsterDungeon(world, posX, posY, posZ);
            recently_placed = 50;
            return true;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addRubberDuckyPond(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(275) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Plains"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            OreSpawnMain.MyDungeon.makeRubberDuckyPond(world, posX, posY, posZ);
            recently_placed = 50;
            return true;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addSpitBug(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(190) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Swampland"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            OreSpawnMain.MyDungeon.makeSpitBugLair(world, posX, posY, posZ);
            recently_placed = 50;
            return true;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addIgloo(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(220) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ice Plains"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.snow) {
            OreSpawnMain.MyDungeon.makeIgloo(world, posX, posY - 2, posZ);
            recently_placed = 50;
            return true;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addBouncyCastle(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(230) != 0)
      return false; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Desert"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.sand) {
            OreSpawnMain.MyDungeon.makeBouncyCastle(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return true;
          } 
        } 
      }  
    return false;
  }
  
  public boolean addDamselInDistress(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(250) != 0)
      return false; 
    for (int i = 0; i < 4; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      int which = 0;
      for (int posY = 100; posY > 40; posY--) {
        if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass)
          if (quickSpaceCheck(world, posX, posY - 1, posZ)) {
            OreSpawnMain.MyDungeon.makeDamselInDistress(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return true;
          }  
      } 
    } 
    return false;
  }
  
  public boolean addSpiderHangout(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(350) != 0)
      return false; 
    if (OreSpawnMain.SpiderDriverEnable == 0)
      return false; 
    for (int i = 0; i < 4; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      int which = 0;
      for (int posY = 100; posY > 40; posY--) {
        if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass)
          if (quickSpaceCheck(world, posX, posY - 1, posZ)) {
            OreSpawnMain.MyDungeon.makeSpiderHangout(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return true;
          }  
      } 
    } 
    return false;
  }
  
  public boolean addRedAntHangout(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(250) != 0)
      return false; 
    for (int i = 0; i < 4; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      int which = 0;
      for (int posY = 100; posY > 40; posY--) {
        if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass)
          if (quickSpaceCheck(world, posX, posY - 1, posZ)) {
            OreSpawnMain.MyDungeon.makeRedAntHangout(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return true;
          }  
      } 
    } 
    return false;
  }
  
  public void addWaterDragonLair(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(350) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ocean"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
            OreSpawnMain.MyDungeon.makeWaterDragonLair(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public void addGirlfriendIsland(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(300) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ocean"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
            OreSpawnMain.MyDungeon.makeGirlfriendIsland(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public void addMonsterIsland(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(300) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (b.biomeName.equals("Ocean"))
      for (int i = 0; i < 4; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        int which = 0;
        for (int posY = 100; posY > 40; posY--) {
          if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
            OreSpawnMain.MyDungeon.makeMonsterIsland(world, posX, posY - 1, posZ);
            recently_placed = 50;
            return;
          } 
        } 
      }  
  }
  
  public void addMosquitos(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(25 + OreSpawnMain.LessLag * 2) != 0)
      return; 
    if ((world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3) && 
      random.nextInt(3) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID2 || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Jungle") || b.biomeName.equals("Swampland"))
      for (int i = 0; i < 2; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyMosquitoPlant, 0, 2);
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public void addNetherMosquitos(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(25) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 20; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.netherrack) {
          OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyMosquitoPlant, 0, 2);
          break;
        } 
      } 
    } 
  }
  
  public void addNetherAnts(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.RedAntEnable == 0)
      return; 
    if (random.nextInt(25) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 20; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.netherrack) {
          OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRedAntBlock, 0, 2);
          break;
        } 
      } 
    } 
  }
  
  public void addAnts(World world, Random random, int chunkX, int chunkZ, int redfreq) {
    if (OreSpawnMain.RedAntEnable == 0 && OreSpawnMain.BlackAntEnable == 0 && OreSpawnMain.RainbowAntEnable == 0 && OreSpawnMain.UnstableAntEnable == 0)
      return; 
    if (redfreq < 2)
      redfreq = 2; 
    if (random.nextInt(30 + OreSpawnMain.LessLag * 4) != 0)
      return; 
    for (int i = 0; i < 4; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 40;) {
        if (world.isAirBlock(posX, posY, posZ)) {
          if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            if (random.nextInt(redfreq) == 0) {
              int which = random.nextInt(4);
              if (which == 0 && 
                OreSpawnMain.RedAntEnable != 0)
                OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRedAntBlock, 0, 2); 
              if (which == 1 && 
                OreSpawnMain.RainbowAntEnable != 0)
                OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRainbowAntBlock, 0, 2); 
              if (which == 2 && 
                OreSpawnMain.UnstableAntEnable != 0)
                OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyUnstableAntBlock, 0, 2); 
              if (which == 3 && 
                OreSpawnMain.TermiteEnable != 0)
                OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.TermiteBlock, 0, 2); 
              break;
            } 
            if (OreSpawnMain.BlackAntEnable != 0)
              OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyAntBlock, 0, 2); 
            break;
          } 
          posY--;
        } 
      } 
    } 
  }
  
  public void addEndAnts(World world, Random random, int chunkX, int chunkZ) {}
  
  public void addEndKnights(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(25) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 10; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone)
          if (quickSpaceCheck(world, posX, posY, posZ)) {
            OreSpawnMain.MyDungeon.makeEnderKnightDungeon(world, posX, posY, posZ);
            return;
          }  
      } 
    } 
  }
  
  public void addEndReapers(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(25) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 10; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone)
          if (quickSpaceCheck(world, posX, posY, posZ)) {
            OreSpawnMain.MyDungeon.makeEnderReaperGraveyard(world, posX, posY, posZ);
            return;
          }  
      } 
    } 
  }
  
  public void addHospital(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(25) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 10; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone)
          if (quickSpaceCheck(world, posX, posY, posZ)) {
            OreSpawnMain.MyDungeon.makeEnderDragonHospital(world, posX, posY, posZ);
            return;
          }  
      } 
    } 
  }
  
  public void addEnderCastle(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(50) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 90; posY > 10; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone)
          if (quickBigSpaceCheck(world, posX, posY, posZ)) {
            OreSpawnMain.MyDungeon.makeEnderCastle(world, posX, posY, posZ);
            return;
          }  
      } 
    } 
  }
  
  public void addUnstableAnts(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.UnstableAntEnable == 0)
      return; 
    if (random.nextInt(30) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 20; posY > 2;) {
        if (world.isAirBlock(posX, posY, posZ)) {
          if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyUnstableAntBlock, 0, 2);
            break;
          } 
          posY--;
        } 
      } 
    } 
  }
  
  public void addCrystalTermites(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.TermiteEnable == 0)
      return; 
    if (random.nextInt(40) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.CrystalTermiteBlock, 0, 2);
          break;
        } 
      } 
    } 
  }
  
  public boolean addRotatorStation(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.RotatorEnable == 0)
      return false; 
    if (random.nextInt(150) != 0)
      return false; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.MyDungeon.makeRotatorStation(world, posX, posY, posZ);
          recently_placed = 50;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean addRoundRotator(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.RotatorEnable == 0)
      return false; 
    if (random.nextInt(150) != 0)
      return false; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.MyDungeon.makeRoundRotator(world, posX, posY, posZ);
          recently_placed = 50;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean addUrchinSpawner(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.UrchinEnable == 0)
      return false; 
    if (random.nextInt(180) != 0)
      return false; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.MyDungeon.makeUrchinSpawner(world, posX, posY, posZ);
          recently_placed = 50;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean addCrystalHauntedHouse(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(230) != 0)
      return false; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.MyDungeon.makeCrystalHauntedHouse(world, posX, posY, posZ);
          recently_placed = 50;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean addCrystalBattleTower(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(280) != 0)
      return false; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
          OreSpawnMain.MyDungeon.makeCrystalBattleTower(world, posX, posY, posZ);
          recently_placed = 50;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public void addIrukandji(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.IrukandjiEnable == 0)
      return; 
    if (random.nextInt(80) != 0)
      return; 
    for (int i = 0; i < 3; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
          OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.mob_spawner, 0, 2);
          TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getTileEntity(posX, posY, posZ);
          if (tileentitymobspawner != null)
            tileentitymobspawner.func_145881_a().setEntityName("Irukandji"); 
          return;
        } 
      } 
    } 
  }
  
  public void addCrystalChestsAndSpawners(World world, Random random, int chunkX, int chunkZ) {
    Block bid = Blocks.air;
    for (int i = 0; i < 3; i++) {
      int posX = 1 + chunkX + random.nextInt(14);
      int posZ = 1 + chunkZ + random.nextInt(14);
      int posY = 25;
      if (world.isAirBlock(posX, posY, posZ)) {
        bid = world.getBlock(posX, posY, posZ);
        if (bid == Blocks.air) {
          bid = world.getBlock(posX + 1, posY, posZ);
          if (bid == Blocks.air) {
            addCrystalChest(world, posX, posY, posZ, 5);
            break;
          } 
          bid = world.getBlock(posX - 1, posY, posZ);
          if (bid == Blocks.air) {
            addCrystalChest(world, posX, posY, posZ, 4);
            break;
          } 
          bid = world.getBlock(posX, posY, posZ + 1);
          if (bid == Blocks.air) {
            addCrystalChest(world, posX, posY, posZ, 2);
            break;
          } 
          bid = world.getBlock(posX, posY, posZ - 1);
          if (bid == Blocks.air)
            addCrystalChest(world, posX, posY, posZ, 3); 
        } 
        break;
      } 
    } 
  }
  
  public void addCrystalChest(World world, int x, int y, int z, int dir) {
    int i = world.rand.nextInt(3);
    if (i == 0) {
      OreSpawnMain.setBlockFast(world, x, y, z, (Block)Blocks.chest, 0, 2);
      world.setBlockMetadataWithNotify(x, y, z, dir, 3);
      TileEntityChest chest = (TileEntityChest)world.getTileEntity(x, y, z);
      if (chest != null)
        WeightedRandomChestContent.generateChestContents(world.rand, Trees.CrystalChestContentsList, (IInventory)chest, 1 + world.rand.nextInt(3)); 
    } else {
      OreSpawnMain.setBlockFast(world, x, y, z, Blocks.mob_spawner, 0, 2);
      TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getTileEntity(x, y, z);
      if (tileentitymobspawner != null) {
        int t = world.rand.nextInt(2);
        if (t == 0)
          tileentitymobspawner.func_145881_a().setEntityName("Dungeon Beast"); 
        if (t == 1)
          tileentitymobspawner.func_145881_a().setEntityName("Rat"); 
      } 
    } 
  }
  
  public void addIslands(World world, Random random, int chunkX, int chunkZ) {
    int posX = 2 + chunkX + random.nextInt(12);
    int posZ = 2 + chunkZ + random.nextInt(12);
    if (random.nextInt(10 + OreSpawnMain.LessLag * 2) != 1)
      return; 
    for (int posY = 20; posY > 2;) {
      if (world.isAirBlock(posX, posY, posZ)) {
        if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
          OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyIslandBlock, 0, 2);
          break;
        } 
        posY--;
      } 
    } 
  }
  
  public boolean addAppleTrees(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    int freq = Math.abs(chunkX / 16) + Math.abs(chunkZ / 16);
    int howmany = 2;
    int which = 0;
    boolean added = false;
    freq %= 15;
    howmany += random.nextInt(2 + (15 - freq) / 2);
    which = random.nextInt(10);
    if (random.nextInt(15 + freq) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 1)
      howmany /= 2; 
    if (OreSpawnMain.LessLag == 2) {
      howmany /= 4;
      if (howmany < 1)
        return false; 
    } 
    for (int i = 0; i < howmany; i++) {
      int posX = 2 + chunkX + random.nextInt(12);
      int posZ = 2 + chunkZ + random.nextInt(12);
      for (int posY = 100; posY > 50;) {
        if (world.isAirBlock(posX, posY, posZ)) {
          if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            ItemAppleSeed a = (ItemAppleSeed)OreSpawnMain.MyAppleSeed;
            if (which < 8)
              a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyAppleLeaves, chunk); 
            if (which == 8)
              a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyCherryLeaves, chunk); 
            if (which == 9)
              a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyPeachLeaves, chunk); 
            added = true;
            break;
          } 
          posY--;
        } 
      } 
    } 
    return added;
  }
  
  public boolean addHugeTree(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    int made_one = 0;
    if (random.nextInt(50) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 1 && 
      random.nextInt(2) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 2 && 
      random.nextInt(4) != 0)
      return false; 
    for (int i = 0; i < 3 && made_one == 0; i++) {
      int posX = 4 + chunkX + random.nextInt(8);
      int posZ = 4 + chunkZ + random.nextInt(8);
      for (int posY = 127; posY > 50 && made_one == 0; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
          Block block = null;
          ItemMagicApple a = (ItemMagicApple)OreSpawnMain.MagicApple;
          int tree_type = random.nextInt(4);
          int tree_radius = 6 - random.nextInt(2);
          boolean no_critters = false;
          BlockLeaves blockLeaves = Blocks.leaves;
          if (random.nextInt(100) > 25)
            no_critters = true; 
          int rand_treetype = random.nextInt(100);
          if (rand_treetype > 75) {
            if (tree_type != 3 && random.nextInt(20) == 0)
              block = OreSpawnMain.MyAppleLeaves; 
            a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.log, block, Blocks.mossy_cobblestone, tree_type, tree_radius, no_critters, chunk);
          } else if (rand_treetype == 0) {
            tree_radius = 6;
            no_critters = true;
            if (random.nextInt(2) == 0) {
              a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.gold_block, Blocks.emerald_block, Blocks.diamond_block, -1, tree_radius, no_critters, chunk);
            } else {
              a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.obsidian, OreSpawnMain.MyBlockRubyBlock, OreSpawnMain.MyBlockAmethystBlock, -1, tree_radius, no_critters, chunk);
            } 
          } else if (rand_treetype > 15) {
            tree_radius = 6 - random.nextInt(3);
            a.MakeBigCircularTree(world, posX, posY - 1, posZ, Blocks.log, block, Blocks.mossy_cobblestone, tree_type, tree_radius, no_critters, chunk);
          } else {
            tree_radius = 6 - random.nextInt(3);
            a.MakeBigRoundTree(world, posX, posY - 1, posZ, Blocks.log, block, Blocks.mossy_cobblestone, tree_type, tree_radius, chunk);
          } 
          made_one = 1;
          break;
        } 
      } 
    } 
    if (made_one != 0)
      return true; 
    return false;
  }
  
  public void addVeggies(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(15) != 0)
      return; 
    BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID2 || world.provider.dimensionId == OreSpawnMain.DimensionID6 || b.biomeName.equals("River") || b.biomeName.equals("Swampland"))
      for (int i = 0; i < 8; i++) {
        int posX = chunkX + random.nextInt(16);
        int posZ = chunkZ + random.nextInt(16);
        for (int posY = 100; posY > 40;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              int what = random.nextInt(6);
              if (what == 0) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.carrots, 0, 2);
                break;
              } 
              if (what == 1) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.potatoes, 0, 2);
                break;
              } 
              if (what == 2) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyRadishPlant, 0, 2);
                break;
              } 
              if (what == 3) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyLettucePlant1, 0, 2);
                break;
              } 
              if (what == 4) {
                if (random.nextInt(10) == 0)
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.melon_stem, 0, 2); 
                break;
              } 
              if (random.nextInt(50) == 1)
                if (OreSpawnMain.enableduplicatortree != 0)
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyDT, 0, 2);  
              break;
            } 
            posY--;
          } 
        } 
      }  
  }
  
  public void addRocks(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(5) != 0)
      return; 
    if (OreSpawnMain.RockEnable == 0)
      return; 
    int howmany = 3 + random.nextInt(10);
    for (int i = 0; i < howmany; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 110; posY > 40;) {
        if (world.getBlock(posX, posY, posZ) == Blocks.air) {
          Block bid = world.getBlock(posX, posY - 1, posZ);
          if (bid == Blocks.grass || bid == Blocks.sand || bid == OreSpawnMain.CrystalGrass) {
            spawnCreature(world, "Rock", posX, posY, posZ);
            break;
          } 
          posY--;
        } 
      } 
    } 
  }
  
  public void addD4Rocks(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(7) != 0)
      return; 
    if (OreSpawnMain.RockEnable == 0)
      return; 
    int howmany = 3 + random.nextInt(10);
    for (int i = 0; i < howmany; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 20; posY > 5;) {
        if (world.getBlock(posX, posY, posZ) == Blocks.air) {
          if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            spawnCreature(world, "Rock", posX, posY, posZ);
            break;
          } 
          posY--;
        } 
      } 
    } 
  }
  
  public boolean addFairyTree(World world, Random random, int chunkX, int chunkZ) {
    int posX = chunkX + 8;
    int posZ = chunkZ + 8;
    if (random.nextInt(5) != 0)
      return false; 
    for (int posY = 128; posY > 40; posY--) {
      if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
        int i;
        for (i = -8; i <= 8; i++) {
          for (int j = -8; j <= 8; j++) {
            Block bid = world.getBlock(posX + i, posY, posZ + j);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        for (i = -2; i <= 2; i++) {
          for (int j = -2; j <= 2; j++) {
            Block bid = world.getBlock(posX + i, posY - 1, posZ + j);
            if (bid != OreSpawnMain.CrystalGrass)
              return false; 
          } 
        } 
        if (random.nextInt(5) != 1) {
          OreSpawnMain.OreSpawnTrees.FairyTree(world, posX, posY - 1, posZ);
        } else {
          OreSpawnMain.OreSpawnTrees.FairyCastleTree(world, posX, posY, posZ);
        } 
        recently_placed = 50;
        break;
      } 
    } 
    return true;
  }
  
  public boolean addRubyDungeon(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(15) != 0)
      return false; 
    for (int i = 0; i < 8; i++) {
      int posX = chunkX + random.nextInt(8);
      int posZ = chunkZ + random.nextInt(8);
      for (int posY = 50; posY > 5; posY--) {
        if (world.getBlock(posX, posY, posZ) == Blocks.lava) {
          OreSpawnMain.RubyDungeon.makeDungeon(world, posX, posY, posZ);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean addGenericDungeon(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(16) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 1 && 
      random.nextInt(2) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 2 && 
      random.nextInt(4) != 0)
      return false; 
    int posX = chunkX + random.nextInt(4);
    int posZ = chunkZ + random.nextInt(4);
    int posY = 5 + random.nextInt(40);
    OreSpawnMain.MyDungeon.makeDungeon(world, posX, posY, posZ);
    return true;
  }
  
  public boolean addBeeHive(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.MyDungeon.makeBeeHive(world, lowestX, lowestY + 3, lowestZ);
      recently_placed = 50;
      return true;
    } 
    return false;
  }
  
  public boolean addAlienWTF(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.MyDungeon.makeAlienWTFDungeon(world, lowestX, lowestY, lowestZ);
      recently_placed = 50;
      return true;
    } 
    return false;
  }
  
  public boolean addEnderKnight(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.MyDungeon.makeEnderKnightDungeon(world, lowestX, lowestY, lowestZ);
      recently_placed = 50;
      return true;
    } 
    return false;
  }
  
  public boolean addLeonNest(World world, Random random, int chunkX, int chunkZ) {
    int highestY = 30;
    int highestX = chunkX;
    int highestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 80; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
            if (posY > highestY) {
              highestY = posY + 1;
              highestX = posX;
              highestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && highestY > 80) {
      OreSpawnMain.MyDungeon.makeLeonNest(world, highestX, highestY, highestZ);
      recently_placed = 50;
      return true;
    } 
    return false;
  }
  
  public boolean addShadowDungeon(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.MyDungeon.makeShadowDungeon(world, lowestX, lowestY, lowestZ);
      recently_placed = 50;
      return true;
    } 
    return false;
  }
  
  public boolean addD4RubyDungeon(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        OreSpawnMain.RubyDungeon.makeDungeon(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4CephadromeAltar(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        OreSpawnMain.MyDungeon.makeCephadromeAltar(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4Castle(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -20; x < 33; x++) {
          for (int z = -4; z < 33; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        if (random.nextInt(2) == 1) {
          OreSpawnMain.MyDungeon.makeEnormousCastle(world, posX, posY, posZ);
        } else {
          OreSpawnMain.MyDungeon.makeEnormousCastleQ(world, posX, posY, posZ);
        } 
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4Greenhouse(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -2; x < 25; x++) {
          for (int z = -4; z < 25; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeGreenhouseDungeon(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4NightmareRookery(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -5; x < 25; x++) {
          for (int z = -4; z < 5; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeNightmareRookery(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4StinkyHouse(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -8; x < 20; x++) {
          for (int z = -8; z < 20; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeStinkyHouse(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4WhiteHouse(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -20; x < 30; x++) {
          for (int z = -20; z < 300; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeWhiteHouse(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4EnderCastle(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -5; x < 25; x++) {
          for (int z = -5; z < 25; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeEnderCastle(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4IncaPyramid(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -10; x < 50; x++) {
          for (int z = -10; z < 40; z++) {
            bid = world.getBlock(posX + x, posY + 18, posZ + z);
            if (bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeIncaPyramid(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4RobotLab(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        for (int x = -5; x < 60; x++) {
          for (int z = -5; z < 70; z++) {
            bid = world.getBlock(posX + x, posY + 4, posZ + z);
            if (bid != Blocks.air && 
              bid != Blocks.log && 
              bid != OreSpawnMain.MyAppleLeaves && 
              bid != OreSpawnMain.MyScaryLeaves && 
              bid != Blocks.air)
              return false; 
          } 
        } 
        OreSpawnMain.MyDungeon.makeRobotLab(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4Mini(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        OreSpawnMain.MyDungeon.makeMiniDungeon(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addPumpkin(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(2) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        OreSpawnMain.MyDungeon.makePumpkin(world, posX, posY + 1, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public boolean addD4CloudShark(World world, Random random, int chunkX, int chunkZ) {
    int posX = 4 + chunkX + random.nextInt(8);
    int posZ = 4 + chunkZ + random.nextInt(8);
    OreSpawnMain.MyDungeon.makeCloudSharkDungeon(world, posX, 150 + world.rand.nextInt(10), posZ);
    return true;
  }
  
  public boolean addD4Rainbow(World world, Random random, int chunkX, int chunkZ) {
    int posX = 4 + chunkX + random.nextInt(8);
    int posZ = 4 + chunkZ + random.nextInt(8);
    OreSpawnMain.MyDungeon.makeRainbow(world, posX, 70 + world.rand.nextInt(20), posZ);
    recently_placed = 50;
    return true;
  }
  
  public boolean addD4GenericDungeon(World world, Random random, int chunkX, int chunkZ) {
    if (OreSpawnMain.LessLag != 0 && 
      random.nextInt(4) != 0)
      return false; 
    int posX = chunkX + random.nextInt(8);
    int posZ = chunkZ + random.nextInt(8);
    for (int posY = 20; posY > 4; posY--) {
      Block bid = world.getBlock(posX, posY, posZ);
      if (bid == Blocks.grass) {
        OreSpawnMain.MyDungeon.makeDungeon(world, posX, posY, posZ);
        recently_placed = 50;
        return true;
      } 
    } 
    return false;
  }
  
  public void addLavaAndWater(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(5) != 0)
      return; 
    for (int i = 0; i < 6; i++) {
      int posX = chunkX + random.nextInt(16);
      int posZ = chunkZ + random.nextInt(16);
      for (int posY = 128; posY > 75;) {
        if (world.isAirBlock(posX, posY, posZ)) {
          if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
            Block bid = world.getBlock(posX, posY - 2, posZ);
            if (bid == Blocks.dirt || bid == Blocks.stone) {
              int air = 0;
              int non_air = 0;
              bid = world.getBlock(posX + 1, posY - 1, posZ);
              if (bid == Blocks.air)
                air++; 
              if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass)
                non_air++; 
              bid = world.getBlock(posX - 1, posY - 1, posZ);
              if (bid == Blocks.air)
                air++; 
              if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass)
                non_air++; 
              bid = world.getBlock(posX, posY - 1, posZ + 1);
              if (bid == Blocks.air)
                air++; 
              if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass)
                non_air++; 
              bid = world.getBlock(posX, posY - 1, posZ - 1);
              if (bid == Blocks.air)
                air++; 
              if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass)
                non_air++; 
              if (air != 0 && non_air != 0) {
                int what = random.nextInt(2);
                if (what == 0) {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, (Block)Blocks.flowing_water, 0, 3);
                  OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, Blocks.water, 0, 3);
                  OreSpawnMain.setBlockFast(world, posX, posY - 2, posZ, Blocks.water, 0, 3);
                } else {
                  OreSpawnMain.setBlockFast(world, posX, posY, posZ, (Block)Blocks.flowing_lava, 0, 3);
                  OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, Blocks.lava, 0, 3);
                  OreSpawnMain.setBlockFast(world, posX, posY - 2, posZ, Blocks.lava, 0, 3);
                } 
                return;
              } 
            } 
            break;
          } 
          posY--;
        } 
      } 
    } 
  }
  
  public boolean addOtherTrees(World world, Random random, int chunkX, int chunkZ) {
    int nc = 5;
    int count = 0;
    if (random.nextInt(30) != 0)
      return false; 
    if (OreSpawnMain.LessLag == 1) {
      if (random.nextInt(2) != 0)
        return false; 
      nc = 4;
    } 
    if (OreSpawnMain.LessLag == 2) {
      if (random.nextInt(4) != 0)
        return false; 
      nc = 3;
    } 
    if (world.provider.dimensionId == OreSpawnMain.DimensionID) {
      int dir = 0;
      int what = random.nextInt(2);
      for (int i = 0; i < nc; i++) {
        int posX = 3 + chunkX + random.nextInt(10);
        int posZ = 3 + chunkZ + random.nextInt(10);
        for (int posY = 100; posY > 50;) {
          if (world.isAirBlock(posX, posY, posZ)) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
              count++;
              if (what == 0) {
                OreSpawnMain.OreSpawnTrees.WindTree(world, posX, posY - 1, posZ, dir);
                if (count >= 4)
                  return true; 
                break;
              } 
              OreSpawnMain.OreSpawnTrees.SkyTree(world, posX, posY - 1, posZ);
              if (count >= 3)
                return true; 
              break;
            } 
            posY--;
          } 
        } 
      } 
    } 
    if (count > 0)
      return true; 
    return false;
  }
  
  public boolean addKingAltar(World world, Random random, int chunkX, int chunkZ) {
    if (random.nextInt(2000) != 1)
      return false; 
    for (int i = 0; i < 8; i++) {
      int posX = 3 + chunkX + random.nextInt(10);
      int posZ = 3 + chunkZ + random.nextInt(10);
      for (int posY = 100; posY > 50; posY--) {
        if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
          if (!quickReallyBigSpaceCheck(world, posX, posY - 1, posZ))
            return false; 
          if (random.nextInt(2) == 0) {
            OreSpawnMain.MyDungeon.makeKingAltar(world, posX, posY - 1, posZ);
          } else {
            OreSpawnMain.MyDungeon.makeQueenAltar(world, posX, posY - 1, posZ);
          } 
          recently_placed = 100;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public void addBasiliskMaze(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) != Blocks.air) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.BMaze.buildBasiliskMaze(world, lowestX, lowestY - 2, lowestZ);
      recently_placed = 50;
    } 
  }
  
  public void addKyuubiDungeon(World world, Random random, int chunkX, int chunkZ) {
    int lowestY = 128;
    int lowestX = chunkX;
    int lowestZ = chunkZ;
    int found = 0;
    for (int i = 0; i < 16; i += 3) {
      for (int j = 0; j < 16; j += 3) {
        int posX = chunkX + i;
        int posZ = chunkZ + j;
        for (int posY = 128; posY > 30; posY--) {
          if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) != Blocks.air) {
            if (posY < lowestY) {
              lowestY = posY;
              lowestX = posX;
              lowestZ = posZ;
              found = 1;
            } 
            break;
          } 
        } 
      } 
    } 
    if (found != 0 && lowestY > 40) {
      OreSpawnMain.MyDungeon.makeKyuubiDungeon(world, lowestX, lowestY - 2, lowestZ);
      recently_placed = 50;
    } 
  }
  
  private boolean quickSpaceCheck(World world, int posX, int posY, int posZ) {
    for (int i = -2; i < 10; i++) {
      for (int k = -2; k < 10; k++) {
        if (world.getBlock(posX + i, posY + 4, posZ + k) != Blocks.air)
          return false; 
      } 
    } 
    return true;
  }
  
  private boolean quickBigSpaceCheck(World world, int posX, int posY, int posZ) {
    for (int i = -5; i < 25; i++) {
      for (int k = -5; k < 25; k++) {
        if (world.getBlock(posX + i, posY + 8, posZ + k) != Blocks.air)
          return false; 
      } 
    } 
    return true;
  }
  
  private boolean quickReallyBigSpaceCheck(World world, int posX, int posY, int posZ) {
    for (int i = -5; i < 55; i++) {
      for (int k = -5; k < 55; k++) {
        if (world.getBlock(posX + i, posY + 8, posZ + k) != Blocks.air)
          return false; 
      } 
    } 
    return true;
  }
  
  private boolean D4BigSpaceCheck(World world, int posX, int posY, int posZ) {
    for (int i = -25; i < 40; i++) {
      for (int k = -25; k < 30; ) {
        Block bid = world.getBlock(posX + i, posY + 4, posZ + k);
        if (bid == Blocks.air || 
          bid == Blocks.log || 
          bid == OreSpawnMain.MyAppleLeaves || 
          bid == OreSpawnMain.MyScaryLeaves) {
          k++;
          continue;
        } 
        return false;
      } 
    } 
    return true;
  }
  
  private Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      if (par2 > 0.0D)
        par2 += 0.5D; 
      if (par2 < 0.0D)
        par2 -= 0.5D; 
      if (par6 > 0.0D)
        par6 += 0.5D; 
      if (par6 < 0.0D)
        par6 -= 0.5D; 
      var8.setLocationAndAngles(par2, par4 + 0.01D, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
}
