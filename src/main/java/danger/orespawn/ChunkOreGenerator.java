package danger.orespawn;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class ChunkOreGenerator {
  public void generateOresInChunk(World world, Random random, int chunkX, int chunkZ, Chunk chunk) {
    if (OreSpawnMain.SpawnOres_stats.rate > 0) {
      int j = OreSpawnMain.SpawnOres_stats.rate + random.nextInt(30);
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
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, b, OreSpawnMain.SpawnOres_stats.clumpsize);
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
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, b, OreSpawnMain.SpawnOres_stats.clumpsize);
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
          generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.MyOreUraniumBlock, OreSpawnMain.Uranium_stats.clumpsize); 
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
          generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.MyOreTitaniumBlock, OreSpawnMain.Titanium_stats.clumpsize); 
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
          generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.MyOreAmethystBlock, OreSpawnMain.Amethyst_stats.clumpsize); 
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
          generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.MyOreSaltBlock, OreSpawnMain.Salt_stats.clumpsize); 
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
        generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.RedAntTroll, 4); 
    } 
    patchy = 4 + random.nextInt(4);
    if (OreSpawnMain.LessOre != 0)
      patchy /= 2; 
    for (i = 0; i < patchy; i++) {
      int randPosX = 3 + chunkX + random.nextInt(10);
      int randPosY = random.nextInt(128);
      int randPosZ = 3 + chunkZ + random.nextInt(10);
      if (randPosY <= 50 && randPosY >= 5)
        generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.TermiteTroll, 4); 
    } 
    if (OreSpawnMain.LessOre == 0) {
      if (OreSpawnMain.Diamond_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Diamond_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Diamond_stats.maxdepth && randPosY >= OreSpawnMain.Diamond_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.diamond_ore, OreSpawnMain.Diamond_stats.clumpsize); 
        }  
      if (OreSpawnMain.BlkDiamond_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkDiamond_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkDiamond_stats.maxdepth && randPosY >= OreSpawnMain.BlkDiamond_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.diamond_block, OreSpawnMain.BlkDiamond_stats.clumpsize); 
        }  
      if (OreSpawnMain.Emerald_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Emerald_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Emerald_stats.maxdepth && randPosY >= OreSpawnMain.Emerald_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.emerald_ore, OreSpawnMain.Emerald_stats.clumpsize); 
        }  
      if (OreSpawnMain.BlkEmerald_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkEmerald_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkEmerald_stats.maxdepth && randPosY >= OreSpawnMain.BlkEmerald_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.emerald_block, OreSpawnMain.BlkEmerald_stats.clumpsize); 
        }  
      if (OreSpawnMain.Gold_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.Gold_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.Gold_stats.maxdepth && randPosY >= OreSpawnMain.Gold_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.gold_ore, OreSpawnMain.Gold_stats.clumpsize); 
        }  
      if (OreSpawnMain.BlkGold_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkGold_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkGold_stats.maxdepth && randPosY >= OreSpawnMain.BlkGold_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, Blocks.gold_block, OreSpawnMain.BlkGold_stats.clumpsize); 
        }  
      if (OreSpawnMain.BlkRuby_stats.rate > 0)
        for (i = 0; i < OreSpawnMain.BlkRuby_stats.rate; i++) {
          int randPosX = 3 + chunkX + random.nextInt(10);
          int randPosY = random.nextInt(128);
          int randPosZ = 3 + chunkZ + random.nextInt(10);
          if (randPosY <= OreSpawnMain.BlkRuby_stats.maxdepth && randPosY >= OreSpawnMain.BlkRuby_stats.mindepth)
            generateBlockOre(world, random, randPosX, randPosY, randPosZ, chunk, OreSpawnMain.MyBlockRubyBlock, OreSpawnMain.BlkRuby_stats.clumpsize); 
        }  
    } 
  }
  
  public boolean generateBlockOre(World par1World, Random par2Random, int par3, int par4, int par5, Chunk chunk, Block newbid, int numberOfBlocks) {
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
                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && bid == Blocks.stone)
                  OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, k2, l2, i3, newbid, 0); 
              }  
          }  
      } 
    } 
    return true;
  }
}
