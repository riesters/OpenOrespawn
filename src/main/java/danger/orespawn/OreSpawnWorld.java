package danger.orespawn;

import cpw.mods.fml.common.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.biome.*;
import net.minecraft.block.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class OreSpawnWorld implements IWorldGenerator
{
    public static int recently_placed;
    
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
        if (world.isRemote) {
            return;
        }
        final Chunk chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
        if (OreSpawnWorld.recently_placed > 0) {
            --OreSpawnWorld.recently_placed;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID) {
            this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
            if (!this.addHugeTree(world, random, chunkX * 16, chunkZ * 16, chunk)) {
                if (!this.addAppleTrees(world, random, chunkX * 16, chunkZ * 16, chunk) && !this.addOtherTrees(world, random, chunkX * 16, chunkZ * 16) && OreSpawnWorld.recently_placed == 0) {
                    this.addKingAltar(world, random, chunkX * 16, chunkZ * 16);
                }
                this.addVeggies(world, random, chunkX * 16, chunkZ * 16);
            }
            boolean rbd;
            rbd = this.addRubyDungeon(world, random, chunkX * 16, chunkZ * 16);
            if (!rbd) {
                this.addGenericDungeon(world, random, chunkX * 16, chunkZ * 16);
            }
            return;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID2) {
            this.generateRuby(world, random, chunkX * 16, chunkZ * 16);
            if (OreSpawnMain.LessOre == 0) {
                this.generateRuby(world, random, chunkX * 16, chunkZ * 16);
                this.generateRuby(world, random, chunkX * 16, chunkZ * 16);
                for (int i = 0; i < 45; ++i) {
                    final int randPosX = chunkX * 16 + random.nextInt(16);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = chunkZ * 16 + random.nextInt(16);
                    if (randPosY < 50) {
                        new WorldGenMinable(Blocks.lapis_ore, 7).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
                for (int i = 0; i < 25; ++i) {
                    final int randPosX = chunkX * 16 + random.nextInt(16);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = chunkZ * 16 + random.nextInt(16);
                    if (randPosY < 50) {
                        new WorldGenMinable(Blocks.lapis_ore, 4).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnWorld.recently_placed == 0 && random.nextInt(95) == 1) {
                final int i = random.nextInt(7);
                if (i == 0) {
                    this.addBasiliskMaze(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 1) {
                    this.addKyuubiDungeon(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 2) {
                    this.addBeeHive(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 3) {
                    this.addShadowDungeon(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 4) {
                    this.addAlienWTF(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 5) {
                    this.addEnderKnight(world, chunkX * 16, chunkZ * 16);
                }
                if (i == 6) {
                    this.addLeonNest(world, chunkX * 16, chunkZ * 16);
                }
            }
            else {
                this.addGenericDungeon(world, random, chunkX * 16, chunkZ * 16);
            }
            this.addLavaAndWater(world, random, chunkX * 16, chunkZ * 16);
            this.addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
            this.addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
            this.addMosquitos(world, random, chunkX * 16, chunkZ * 16);
            this.addMosquitos(world, random, chunkX * 16, chunkZ * 16);
            this.addVeggies(world, random, chunkX * 16, chunkZ * 16);
            this.addRocks(world, random, chunkX * 16, chunkZ * 16);
            return;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID3) {
            if (OreSpawnMain.MosquitoEnable != 0) {
                this.addMosquitos(world, random, chunkX, chunkZ);
            }
            this.addAnts(world, random, chunkX * 16, chunkZ * 16, 4);
            this.addAppleTrees(world, random, chunkX * 16, chunkZ * 16, chunk);
            this.addGenericDungeon(world, random, chunkX * 16, chunkZ * 16);
            if (OreSpawnWorld.recently_placed == 0) {
                this.addDamselInDistress(world, random, chunkX * 16, chunkZ * 16);
            }
            if (OreSpawnWorld.recently_placed == 0) {
                this.addSpiderHangout(world, random, chunkX * 16, chunkZ * 16);
            }
            if (OreSpawnWorld.recently_placed == 0) {
                this.addRedAntHangout(world, random, chunkX * 16, chunkZ * 16);
            }
            return;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID4) {
            if (OreSpawnWorld.recently_placed == 0 && random.nextInt(100) == 0 && this.D4BigSpaceCheck(world, chunkX * 16, chunkZ * 16)) {
                final int i = random.nextInt(19);
                if (i < 3) {
                    this.addD4Castle(world, random, chunkX * 16, chunkZ * 16);
                }
                else if (i < 7) {
                    this.addD4GenericDungeon(world, random, chunkX * 16, chunkZ * 16);
                }
                else {
                    if (i == 7) {
                        this.addD4EnderCastle(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 8) {
                        this.addD4IncaPyramid(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 9) {
                        this.addD4RobotLab(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 10) {
                        this.addD4Mini(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 11) {
                        this.addD4RubyDungeon(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 12) {
                        this.addD4CephadromeAltar(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 13) {
                        this.addD4Greenhouse(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 14) {
                        this.addD4NightmareRookery(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 15) {
                        this.addD4StinkyHouse(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 16) {
                        this.addD4WhiteHouse(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 17) {
                        this.addPumpkin(world, random, chunkX * 16, chunkZ * 16);
                    }
                    if (i == 18) {
                        this.addD4Rainbow(world, random, chunkX * 16, chunkZ * 16);
                    }
                }
            }
            final int i = random.nextInt(300);
            if (i == 0) {
                this.addD4CloudShark(world, random, chunkX * 16, chunkZ * 16);
            }
            this.addUnstableAnts(world, random, chunkX * 16, chunkZ * 16);
            this.addIslands(world, random, chunkX * 16, chunkZ * 16);
            this.addD4Rocks(world, random, chunkX * 16, chunkZ * 16);
            return;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID5) {
            if (!this.addFairyTree(world, random, chunkX * 16, chunkZ * 16)) {
                this.addCrystalTermites(world, random, chunkX * 16, chunkZ * 16);
                if (OreSpawnWorld.recently_placed == 0) {
                    if (!this.addRotatorStation(world, random, chunkX * 16, chunkZ * 16) && !this.addUrchinSpawner(world, random, chunkX * 16, chunkZ * 16) && !this.addCrystalHauntedHouse(world, random, chunkX * 16, chunkZ * 16) && !this.addRoundRotator(world, random, chunkX * 16, chunkZ * 16)) {
                        this.addCrystalBattleTower(world, random, chunkX * 16, chunkZ * 16);
                    }
                    this.addIrukandji(world, random, chunkX * 16, chunkZ * 16);
                }
            }
            this.addCrystalChestsAndSpawners(world, random, chunkX * 16, chunkZ * 16);
            if (world.rand.nextInt(4) == 1) {
                this.addRocks(world, random, chunkX * 16, chunkZ * 16);
            }
            return;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID6) {
            this.addButterfliesAndMoths(world, random, chunkX * 16, chunkZ * 16);
            this.addVeggies(world, random, chunkX * 16, chunkZ * 16);
            this.addAnts(world, random, chunkX * 16, chunkZ * 16, 2);
            return;
        }
        switch (world.provider.dimensionId) {
            case -1: {
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 0: {
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
                this.generateOres(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 1: {
                this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
        }
    }
    
    private void generateEnd(final World world, final Random random, final int chunkX, final int chunkZ) {
        this.addEndAnts();
        final int i = world.rand.nextInt(4);
        if (i == 0) {
            this.addEndKnights(world, random, chunkX, chunkZ);
        }
        if (i == 1) {
            this.addEndReapers(world, random, chunkX, chunkZ);
        }
        if (i == 2) {
            this.addHospital(world, random, chunkX, chunkZ);
        }
        if (i == 3) {
            this.addEnderCastle(world, random, chunkX, chunkZ);
        }
    }
    
    private void generateNether(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.MosquitoEnable != 0) {
            this.addNetherMosquitos(world, random, chunkX, chunkZ);
        }
        this.addNetherAnts(world, random, chunkX, chunkZ);
        int patchy = 15 + random.nextInt(10);
        if (OreSpawnMain.LessOre != 0) {
            patchy /= 3;
        }
        for (int i = 0; i < patchy; ++i) {
            final int randPosX = 3 + chunkX + random.nextInt(13);
            final int randPosY = random.nextInt(108) + 10;
            final int randPosZ = 3 + chunkZ + random.nextInt(13);
            new WorldGenMinable(OreSpawnMain.MyLavafoamBlock, 6, Blocks.netherrack).generate(world, random, randPosX, randPosY, randPosZ);
        }
        patchy = 5 + random.nextInt(5);
        if (OreSpawnMain.LessOre != 0) {
            patchy /= 3;
        }
        for (int i = 0; i < patchy; ++i) {
            final int randPosX = 3 + chunkX + random.nextInt(13);
            final int randPosY = random.nextInt(108) + 10;
            final int randPosZ = 3 + chunkZ + random.nextInt(13);
            new WorldGenMinable(OreSpawnMain.MyOreRubyBlock, 2, Blocks.netherrack).generate(world, random, randPosX, randPosY, randPosZ);
        }
    }
    
    public void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
        boolean ahh;
        this.addStrawberries(world, random, chunkX, chunkZ);
        this.addCorn(world, random, chunkX, chunkZ);
        this.addTomatoes(world, random, chunkX, chunkZ);
        this.addVeggies(world, random, chunkX, chunkZ);
        this.addButterfliesAndMoths(world, random, chunkX, chunkZ);
        if (OreSpawnMain.MosquitoEnable != 0) {
            this.addMosquitos(world, random, chunkX, chunkZ);
        }
        if (OreSpawnMain.DisableOverworldDungeons == 0 && world.provider.dimensionId == 0 && OreSpawnWorld.recently_placed == 0) {
            final int i = world.rand.nextInt(6);
            if (i == 0) {
                this.addPlayPool(world, random, chunkX, chunkZ);
            }
            if (i == 1) {
                this.addWaterDragonLair(world, random, chunkX, chunkZ);
            }
            if (i == 2) {
                this.addGoldFishBowl(world, random, chunkX, chunkZ);
            }
            if (i == 3) {
                this.addGirlfriendIsland(world, random, chunkX, chunkZ);
            }
            if (i == 4) {
                this.addMonsterIsland(world, random, chunkX, chunkZ);
            }
            if (i == 5) {
                this.addFrogPond(world, random, chunkX, chunkZ);
            }
            ahh = this.addANest(world, random, chunkX, chunkZ);
            if (!ahh) {
                ahh = this.addHauntedHouse(world, random, chunkX, chunkZ);
            }
            if (!ahh) {
                ahh = this.addLeafMonster(world, random, chunkX, chunkZ);
            }
            if (!ahh) {
                ahh = this.addSpitBug(world, random, chunkX, chunkZ);
            }
            if (!ahh) {
                ahh = this.addIgloo(world, random, chunkX, chunkZ);
            }
            if (!ahh) {
                ahh = this.addBouncyCastle(world, random, chunkX, chunkZ);
            }
            if (!ahh) {
                ahh = this.addRubberDuckyPond(world, random, chunkX, chunkZ);
            }
        }
        this.addAnts(world, random, chunkX, chunkZ, 4);
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("River") || b.biomeName.equals("Extreme Hills") || b.biomeName.equals("Desert")) {
            this.addRocks(world, random, chunkX, chunkZ);
        }
    }
    
    public void generateRuby(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.Ruby_stats.rate <= 0) {
            return;
        }
        for (int patchy = OreSpawnMain.Ruby_stats.rate + random.nextInt(7), i = 0; i < patchy; ++i) {
            final int randPosX = 3 + chunkX + random.nextInt(10);
            final int randPosY = random.nextInt(128);
            final int randPosZ = 3 + chunkZ + random.nextInt(10);
            if (randPosY <= OreSpawnMain.Ruby_stats.maxdepth && randPosY >= OreSpawnMain.Ruby_stats.mindepth) {
                for (int m = randPosY; m > 5; --m) {
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
    }
    
    public void generateOres(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.SpawnOres_stats.rate > 0) {
            int patchy = OreSpawnMain.SpawnOres_stats.rate + random.nextInt(20);
            if (random.nextInt(20) == 0) {
                patchy += 30;
            }
            if (OreSpawnMain.LessOre != 0) {
                patchy /= 3;
            }
            for (int i = 0; i < patchy; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.SpawnOres_stats.maxdepth && randPosY >= OreSpawnMain.SpawnOres_stats.mindepth) {
                    if (random.nextInt(104) < 7) {
                        final int j = random.nextInt(7);
                        Block b = Blocks.air;
                        switch (j) {
                            case 0: {
                                b = OreSpawnMain.MyBrutalflySpawnBlock;
                                break;
                            }
                            case 1: {
                                b = OreSpawnMain.MyNastysaurusSpawnBlock;
                                break;
                            }
                            case 2: {
                                b = OreSpawnMain.MyPointysaurusSpawnBlock;
                                break;
                            }
                            case 3: {
                                b = OreSpawnMain.MyCricketSpawnBlock;
                                break;
                            }
                            case 4: {
                                b = OreSpawnMain.MyFrogSpawnBlock;
                                break;
                            }
                            case 5: {
                                b = OreSpawnMain.MySpiderDriverSpawnBlock;
                                break;
                            }
                            case 6: {
                                b = OreSpawnMain.MyCrabSpawnBlock;
                                break;
                            }
                        }
                        new WorldGenMinable(b, OreSpawnMain.SpawnOres_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                    else {
                        final int j = random.nextInt(98);
                        Block b = Blocks.air;
                        switch (j) {
                            case 0: {
                                b = OreSpawnMain.MySpiderSpawnBlock;
                                break;
                            }
                            case 1: {
                                b = OreSpawnMain.MyBatSpawnBlock;
                                break;
                            }
                            case 2: {
                                b = OreSpawnMain.MyCowSpawnBlock;
                                break;
                            }
                            case 3: {
                                b = OreSpawnMain.MyPigSpawnBlock;
                                break;
                            }
                            case 4: {
                                b = OreSpawnMain.MySquidSpawnBlock;
                                break;
                            }
                            case 5: {
                                b = OreSpawnMain.MyChickenSpawnBlock;
                                break;
                            }
                            case 6: {
                                b = OreSpawnMain.MyCreeperSpawnBlock;
                                break;
                            }
                            case 7: {
                                b = OreSpawnMain.MySkeletonSpawnBlock;
                                break;
                            }
                            case 8: {
                                b = OreSpawnMain.MyZombieSpawnBlock;
                                break;
                            }
                            case 9: {
                                b = OreSpawnMain.MySlimeSpawnBlock;
                                break;
                            }
                            case 10: {
                                b = OreSpawnMain.MyGhastSpawnBlock;
                                break;
                            }
                            case 11: {
                                b = OreSpawnMain.MyZombiePigmanSpawnBlock;
                                break;
                            }
                            case 12: {
                                b = OreSpawnMain.MyEndermanSpawnBlock;
                                break;
                            }
                            case 13: {
                                b = OreSpawnMain.MyCaveSpiderSpawnBlock;
                                break;
                            }
                            case 14: {
                                b = OreSpawnMain.MySilverfishSpawnBlock;
                                break;
                            }
                            case 15: {
                                b = OreSpawnMain.MyMagmaCubeSpawnBlock;
                                break;
                            }
                            case 16: {
                                b = OreSpawnMain.MyWitchSpawnBlock;
                                break;
                            }
                            case 17: {
                                b = OreSpawnMain.MySheepSpawnBlock;
                                break;
                            }
                            case 18: {
                                b = OreSpawnMain.MyWolfSpawnBlock;
                                break;
                            }
                            case 19: {
                                b = OreSpawnMain.MyMooshroomSpawnBlock;
                                break;
                            }
                            case 20: {
                                b = OreSpawnMain.MyOcelotSpawnBlock;
                                break;
                            }
                            case 21: {
                                b = OreSpawnMain.MyBlazeSpawnBlock;
                                break;
                            }
                            case 22: {
                                b = OreSpawnMain.MyWitherSkeletonSpawnBlock;
                                break;
                            }
                            case 23: {
                                b = OreSpawnMain.MyEnderDragonSpawnBlock;
                                break;
                            }
                            case 24: {
                                b = OreSpawnMain.MySnowGolemSpawnBlock;
                                break;
                            }
                            case 25: {
                                b = OreSpawnMain.MyIronGolemSpawnBlock;
                                break;
                            }
                            case 26: {
                                b = OreSpawnMain.MyWitherBossSpawnBlock;
                                break;
                            }
                            case 27: {
                                b = OreSpawnMain.MyGirlfriendSpawnBlock;
                                break;
                            }
                            case 28: {
                                b = OreSpawnMain.MyRedCowSpawnBlock;
                                break;
                            }
                            case 29: {
                                b = OreSpawnMain.MyGoldCowSpawnBlock;
                                break;
                            }
                            case 30: {
                                b = OreSpawnMain.MyEnchantedCowSpawnBlock;
                                break;
                            }
                            case 31: {
                                b = OreSpawnMain.MyMOTHRASpawnBlock;
                                break;
                            }
                            case 32: {
                                b = OreSpawnMain.MyAloSpawnBlock;
                                break;
                            }
                            case 33: {
                                b = OreSpawnMain.MyCryoSpawnBlock;
                                break;
                            }
                            case 34: {
                                b = OreSpawnMain.MyCamaSpawnBlock;
                                break;
                            }
                            case 35: {
                                b = OreSpawnMain.MyVeloSpawnBlock;
                                break;
                            }
                            case 36: {
                                b = OreSpawnMain.MyHydroSpawnBlock;
                                break;
                            }
                            case 37: {
                                b = OreSpawnMain.MyBasilSpawnBlock;
                                break;
                            }
                            case 38: {
                                b = OreSpawnMain.MyDragonflySpawnBlock;
                                break;
                            }
                            case 39: {
                                b = OreSpawnMain.MyEmperorScorpionSpawnBlock;
                                break;
                            }
                            case 40: {
                                b = OreSpawnMain.MyScorpionSpawnBlock;
                                break;
                            }
                            case 41: {
                                b = OreSpawnMain.MyCaveFisherSpawnBlock;
                                break;
                            }
                            case 42: {
                                b = OreSpawnMain.MySpyroSpawnBlock;
                                break;
                            }
                            case 43: {
                                b = OreSpawnMain.MyBaryonyxSpawnBlock;
                                break;
                            }
                            case 44: {
                                b = OreSpawnMain.MyGammaMetroidSpawnBlock;
                                break;
                            }
                            case 45: {
                                b = OreSpawnMain.MyCockateilSpawnBlock;
                                break;
                            }
                            case 46: {
                                b = OreSpawnMain.MyKyuubiSpawnBlock;
                                break;
                            }
                            case 47: {
                                b = OreSpawnMain.MyAlienSpawnBlock;
                                break;
                            }
                            case 48: {
                                b = OreSpawnMain.MyAttackSquidSpawnBlock;
                                break;
                            }
                            case 49: {
                                b = OreSpawnMain.MyWaterDragonSpawnBlock;
                                break;
                            }
                            case 50: {
                                b = OreSpawnMain.MyKrakenSpawnBlock;
                                break;
                            }
                            case 51: {
                                b = OreSpawnMain.MyLizardSpawnBlock;
                                break;
                            }
                            case 52: {
                                b = OreSpawnMain.MyCephadromeSpawnBlock;
                                break;
                            }
                            case 53: {
                                b = OreSpawnMain.MyDragonSpawnBlock;
                                break;
                            }
                            case 54: {
                                b = OreSpawnMain.MyBeeSpawnBlock;
                                break;
                            }
                            case 55: {
                                b = OreSpawnMain.MyHorseSpawnBlock;
                                break;
                            }
                            case 56: {
                                b = OreSpawnMain.MyTrooperBugSpawnBlock;
                                break;
                            }
                            case 57: {
                                b = OreSpawnMain.MySpitBugSpawnBlock;
                                break;
                            }
                            case 58: {
                                b = OreSpawnMain.MyStinkBugSpawnBlock;
                                break;
                            }
                            case 59: {
                                b = OreSpawnMain.MyOstrichSpawnBlock;
                                break;
                            }
                            case 60: {
                                b = OreSpawnMain.MyGazelleSpawnBlock;
                                break;
                            }
                            case 61: {
                                b = OreSpawnMain.MyChipmunkSpawnBlock;
                                break;
                            }
                            case 62: {
                                b = OreSpawnMain.MyCreepingHorrorSpawnBlock;
                                break;
                            }
                            case 63: {
                                b = OreSpawnMain.MyTerribleTerrorSpawnBlock;
                                break;
                            }
                            case 64: {
                                b = OreSpawnMain.MyCliffRacerSpawnBlock;
                                break;
                            }
                            case 65: {
                                b = OreSpawnMain.MyTriffidSpawnBlock;
                                break;
                            }
                            case 66: {
                                b = OreSpawnMain.MyPitchBlackSpawnBlock;
                                break;
                            }
                            case 67: {
                                b = OreSpawnMain.MyLurkingTerrorSpawnBlock;
                                break;
                            }
                            case 68: {
                                b = OreSpawnMain.MyGodzillaPartSpawnBlock;
                                break;
                            }
                            case 69: {
                                b = OreSpawnMain.MyGodzillaSpawnBlock;
                                break;
                            }
                            case 70: {
                                b = OreSpawnMain.MySmallWormSpawnBlock;
                                break;
                            }
                            case 71: {
                                b = OreSpawnMain.MyMediumWormSpawnBlock;
                                break;
                            }
                            case 72: {
                                b = OreSpawnMain.MyLargeWormSpawnBlock;
                                break;
                            }
                            case 73: {
                                b = OreSpawnMain.MyCassowarySpawnBlock;
                                break;
                            }
                            case 74: {
                                b = OreSpawnMain.MyCloudSharkSpawnBlock;
                                break;
                            }
                            case 75: {
                                b = OreSpawnMain.MyGoldFishSpawnBlock;
                                break;
                            }
                            case 76: {
                                b = OreSpawnMain.MyLeafMonsterSpawnBlock;
                                break;
                            }
                            case 77: {
                                b = OreSpawnMain.MyTshirtSpawnBlock;
                                break;
                            }
                            case 78: {
                                b = OreSpawnMain.MyEnderKnightSpawnBlock;
                                break;
                            }
                            case 79: {
                                b = OreSpawnMain.MyEnderReaperSpawnBlock;
                                break;
                            }
                            case 80: {
                                b = OreSpawnMain.MyBeaverSpawnBlock;
                                break;
                            }
                            case 81: {
                                b = OreSpawnMain.MyTRexSpawnBlock;
                                break;
                            }
                            case 82: {
                                b = OreSpawnMain.MyHerculesSpawnBlock;
                                break;
                            }
                            case 83: {
                                b = OreSpawnMain.MyMantisSpawnBlock;
                                break;
                            }
                            case 84: {
                                b = OreSpawnMain.MyStinkySpawnBlock;
                                break;
                            }
                            case 85: {
                                b = OreSpawnMain.MyBoyfriendSpawnBlock;
                                break;
                            }
                            case 86: {
                                b = OreSpawnMain.MyTheKingPartSpawnBlock;
                                break;
                            }
                            case 87: {
                                b = OreSpawnMain.MyEasterBunnySpawnBlock;
                                break;
                            }
                            case 88: {
                                b = OreSpawnMain.MyCaterKillerSpawnBlock;
                                break;
                            }
                            case 89: {
                                b = OreSpawnMain.MyMolenoidSpawnBlock;
                                break;
                            }
                            case 90: {
                                b = OreSpawnMain.MySeaMonsterSpawnBlock;
                                break;
                            }
                            case 91: {
                                b = OreSpawnMain.MySeaViperSpawnBlock;
                                break;
                            }
                            case 92: {
                                b = OreSpawnMain.MyLeonSpawnBlock;
                                break;
                            }
                            case 93: {
                                b = OreSpawnMain.MyHammerheadSpawnBlock;
                                break;
                            }
                            case 94: {
                                b = OreSpawnMain.MyRubberDuckySpawnBlock;
                                break;
                            }
                            case 95: {
                                b = OreSpawnMain.MyVillagerSpawnBlock;
                                break;
                            }
                            case 96: {
                                b = OreSpawnMain.MyCriminalSpawnBlock;
                                break;
                            }
                            case 97: {
                                b = OreSpawnMain.MyTheQueenPartSpawnBlock;
                                break;
                            }
                        }
                        new WorldGenMinable(b, OreSpawnMain.SpawnOres_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
        }
        if (OreSpawnMain.Uranium_stats.rate > 0) {
            int patchy = OreSpawnMain.Uranium_stats.rate + random.nextInt(9);
            if (OreSpawnMain.LessOre != 0) {
                patchy /= 3;
            }
            for (int i = 0; i < patchy; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.Uranium_stats.maxdepth && randPosY >= OreSpawnMain.Uranium_stats.mindepth) {
                    new WorldGenMinable(OreSpawnMain.MyOreUraniumBlock, OreSpawnMain.Uranium_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                }
            }
        }
        if (OreSpawnMain.Titanium_stats.rate > 0) {
            int patchy = OreSpawnMain.Titanium_stats.rate + random.nextInt(9);
            if (OreSpawnMain.LessOre != 0) {
                patchy /= 3;
            }
            for (int i = 0; i < patchy; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.Titanium_stats.maxdepth && randPosY >= OreSpawnMain.Titanium_stats.mindepth) {
                    new WorldGenMinable(OreSpawnMain.MyOreTitaniumBlock, OreSpawnMain.Titanium_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                }
            }
        }
        if (OreSpawnMain.Amethyst_stats.rate > 0) {
            int patchy = OreSpawnMain.Amethyst_stats.rate + random.nextInt(12);
            if (OreSpawnMain.LessOre != 0) {
                patchy /= 3;
            }
            for (int i = 0; i < patchy; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.Amethyst_stats.maxdepth && randPosY >= OreSpawnMain.Amethyst_stats.mindepth) {
                    new WorldGenMinable(OreSpawnMain.MyOreAmethystBlock, OreSpawnMain.Amethyst_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                }
            }
        }
        if (OreSpawnMain.Salt_stats.rate > 0) {
            int patchy = OreSpawnMain.Salt_stats.rate + random.nextInt(9);
            if (OreSpawnMain.LessOre != 0) {
                patchy /= 3;
            }
            for (int i = 0; i < patchy; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.Salt_stats.maxdepth && randPosY >= OreSpawnMain.Salt_stats.mindepth) {
                    new WorldGenMinable(OreSpawnMain.MyOreSaltBlock, OreSpawnMain.Salt_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                }
            }
        }
        int patchy = 4 + random.nextInt(4);
        if (OreSpawnMain.LessOre != 0) {
            patchy /= 2;
        }
        for (int i = 0; i < patchy; ++i) {
            final int randPosX = 3 + chunkX + random.nextInt(10);
            final int randPosY = random.nextInt(128);
            final int randPosZ = 3 + chunkZ + random.nextInt(10);
            if (randPosY <= 50 && randPosY >= 5) {
                new WorldGenMinable(OreSpawnMain.RedAntTroll, 4).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
        patchy = 4 + random.nextInt(4);
        if (OreSpawnMain.LessOre != 0) {
            patchy /= 2;
        }
        for (int i = 0; i < patchy; ++i) {
            final int randPosX = 3 + chunkX + random.nextInt(10);
            final int randPosY = random.nextInt(128);
            final int randPosZ = 3 + chunkZ + random.nextInt(10);
            if (randPosY <= 50 && randPosY >= 5) {
                new WorldGenMinable(OreSpawnMain.TermiteTroll, 4).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
        if (OreSpawnMain.Ruby_stats.rate > 0) {
            for (int patchy1 = OreSpawnMain.Ruby_stats.rate + random.nextInt(5), i = 0; i < patchy1; ++i) {
                final int randPosX = 3 + chunkX + random.nextInt(10);
                final int randPosY = random.nextInt(128);
                final int randPosZ = 3 + chunkZ + random.nextInt(10);
                if (randPosY <= OreSpawnMain.Ruby_stats.maxdepth && randPosY >= OreSpawnMain.Ruby_stats.mindepth) {
                    for (int m = randPosY; m > 5; --m) {
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
        }
        if (OreSpawnMain.LessOre == 0) {
            if (OreSpawnMain.Diamond_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.Diamond_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.Diamond_stats.maxdepth && randPosY >= OreSpawnMain.Diamond_stats.mindepth) {
                        new WorldGenMinable(Blocks.diamond_ore, OreSpawnMain.Diamond_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.BlkDiamond_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.BlkDiamond_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.BlkDiamond_stats.maxdepth && randPosY >= OreSpawnMain.BlkDiamond_stats.mindepth) {
                        new WorldGenMinable(Blocks.diamond_block, OreSpawnMain.BlkDiamond_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.Emerald_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.Emerald_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.Emerald_stats.maxdepth && randPosY >= OreSpawnMain.Emerald_stats.mindepth) {
                        new WorldGenMinable(Blocks.emerald_ore, OreSpawnMain.Emerald_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.BlkEmerald_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.BlkEmerald_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.BlkEmerald_stats.maxdepth && randPosY >= OreSpawnMain.BlkEmerald_stats.mindepth) {
                        new WorldGenMinable(Blocks.emerald_block, OreSpawnMain.BlkEmerald_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.Gold_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.Gold_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.Gold_stats.maxdepth && randPosY >= OreSpawnMain.Gold_stats.mindepth) {
                        new WorldGenMinable(Blocks.gold_ore, OreSpawnMain.Gold_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.BlkGold_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.BlkGold_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.BlkGold_stats.maxdepth && randPosY >= OreSpawnMain.BlkGold_stats.mindepth) {
                        new WorldGenMinable(Blocks.gold_block, OreSpawnMain.BlkGold_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
            if (OreSpawnMain.BlkRuby_stats.rate > 0) {
                for (int i = 0; i < OreSpawnMain.BlkRuby_stats.rate; ++i) {
                    final int randPosX = 3 + chunkX + random.nextInt(10);
                    final int randPosY = random.nextInt(128);
                    final int randPosZ = 3 + chunkZ + random.nextInt(10);
                    if (randPosY <= OreSpawnMain.BlkRuby_stats.maxdepth && randPosY >= OreSpawnMain.BlkRuby_stats.mindepth) {
                        new WorldGenMinable(OreSpawnMain.MyBlockRubyBlock, OreSpawnMain.BlkRuby_stats.clumpsize).generate(world, random, randPosX, randPosY, randPosZ);
                    }
                }
            }
        }
    }
    
    public void addStrawberries(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(20) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("Birch Forest Hills") || b.biomeName.equals("Birch Forest")) {
            for (int i = 0; i < 5; ++i) {
                for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 100; posY > 40 && world.isAirBlock(posX, posY, posZ); --posY) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyStrawberryPlant, 0, 2);
                        break;
                    }
                }
            }
        }
    }
    
    public boolean addHauntedHouse(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(285) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Plains") || b.biomeName.equals("Taiga") || b.biomeName.equals("Swampland")) {
            for (int i = 0; i < 5; ++i) {
                for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 100; posY > 40 && world.isAirBlock(posX, posY, posZ); --posY) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.MyDungeon.makeHauntedHouse(world, posX, posY, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean addANest(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(230) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("Jungle") || b.biomeName.equals("JungleHills") || b.biomeName.equals("Birch Forest") || b.biomeName.equals("Birch Forest Hills")) {
            for (int i = 0; i < 5; ++i) {
                for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 128; posY > 40 && world.isAirBlock(posX, posY, posZ); --posY) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        if (random.nextInt(2) == 0) {
                            OreSpawnMain.MyDungeon.makeSmallBeeHive(world, posX, posY, posZ);
                        }
                        else {
                            OreSpawnMain.MyDungeon.makeMantisHive(world, posX, posY, posZ);
                        }
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void addCorn(final World world, final Random random, final int chunkX, final int chunkZ) {
        int is_all_air;
        int nc = 6;
        if (random.nextInt(35) != 1) {
            return;
        }
        if (OreSpawnMain.LessLag == 1) {
            nc = 5;
        }
        if (OreSpawnMain.LessLag == 2) {
            nc = 3;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Plains")) {
            for (int j = 0; j < nc; ++j) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                is_all_air = 1;
                int posY = 100;
                while (posY > 40 && world.isAirBlock(posX, posY, posZ)) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        for (int i = 1; i < 10; ++i) {
                            if (!world.isAirBlock(posX, posY + i, posZ)) {
                                is_all_air = 0;
                            }
                        }
                        if (is_all_air == 0) {
                            break;
                        }
                        int corn_height = random.nextInt(5);
                        if (++corn_height == 1) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant1, 0, 2);
                        }
                        if (corn_height == 2) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant2, 0, 2);
                            OreSpawnMain.setBlockFast(world, posX, posY + 1, posZ, OreSpawnMain.MyCornPlant1, 0, 2);
                        }
                        if (corn_height > 2) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyCornPlant2, 0, 2);
                            for (int i = 1; i < corn_height; ++i) {
                                OreSpawnMain.setBlockFast(world, posX, posY + i, posZ, OreSpawnMain.MyCornPlant4, 0, 2);
                            }
                            OreSpawnMain.setBlockFast(world, posX, posY + corn_height, posZ, OreSpawnMain.MyCornPlant1, 0, 2);
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
    }
    
    public void addTomatoes(final World world, final Random random, final int chunkX, final int chunkZ) {
        int is_all_air;
        if (random.nextInt(70) != 1) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Plains")) {
            for (int j = 0; j < 5; ++j) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                is_all_air = 1;
                int posY = 100;
                while (posY > 40 && world.isAirBlock(posX, posY, posZ)) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        for (int i = 1; i < 10; ++i) {
                            if (!world.isAirBlock(posX, posY + i, posZ)) {
                                is_all_air = 0;
                            }
                        }
                        if (is_all_air == 0) {
                            break;
                        }
                        int corn_height = random.nextInt(3);
                        if (++corn_height == 1) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2);
                        }
                        if (corn_height == 2) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant2, 0, 2);
                            OreSpawnMain.setBlockFast(world, posX, posY + 1, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2);
                        }
                        if (corn_height > 2) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyTomatoPlant3, 0, 2);
                            for (int i = 1; i < corn_height; ++i) {
                                OreSpawnMain.setBlockFast(world, posX, posY + i, posZ, OreSpawnMain.MyTomatoPlant4, 0, 2);
                            }
                            OreSpawnMain.setBlockFast(world, posX, posY + corn_height, posZ, OreSpawnMain.MyTomatoPlant1, 0, 2);
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
    }
    
    public void addButterfliesAndMoths(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(10 + OreSpawnMain.LessLag * 2) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID6 || b.biomeName.equals("Forest") || b.biomeName.equals("ForestHills") || b.biomeName.equals("River") || b.biomeName.equals("Jungle") || b.biomeName.equals("JungleHills") || b.biomeName.equals("Swampland") || b.biomeName.equals("Birch Forest") || b.biomeName.equals("Birch Forest Hills") || b.biomeName.equals("Roofed Forest")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                int which;
                int posY = 100;
                while (posY > 40 && world.isAirBlock(posX, posY, posZ)) {
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
                    else {
                        --posY;
                    }
                }
            }
        }
    }
    
    public void addPlayPool(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(350) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ocean")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                        OreSpawnMain.MyDungeon.makePlayPool(world, posX, posY, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public void addFrogPond(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(350) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Plains")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.MyDungeon.makeFrogPond(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public void addGoldFishBowl(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(350) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ocean")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                        OreSpawnMain.MyDungeon.makeGoldFishBowl(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean addLeafMonster(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(275) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Plains")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.MyDungeon.makeLeafMonsterDungeon(world, posX, posY, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean addRubberDuckyPond(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(275) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Plains")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.MyDungeon.makeRubberDuckyPond(world, posX, posY, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean addSpitBug(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(190) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Swampland")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.MyDungeon.makeSpitBugLair(world, posX, posY, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean addIgloo(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(220) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ice Plains")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.snow) {
                        OreSpawnMain.MyDungeon.makeIgloo(world, posX, posY - 2, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean addBouncyCastle(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(230) != 0) {
            return false;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Desert")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.sand) {
                        OreSpawnMain.MyDungeon.makeBouncyCastle(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void addDamselInDistress(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(250) != 0) {
            return;
        }
        for (int i = 0; i < 4; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 40; --posY) {
                if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass && this.quickSpaceCheck(world, posX, posY - 1, posZ)) {
                    OreSpawnMain.MyDungeon.makeDamselInDistress(world, posX, posY - 1, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return;
                }
            }
        }
    }
    
    public void addSpiderHangout(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(350) != 0) {
            return;
        }
        if (OreSpawnMain.SpiderDriverEnable == 0) {
            return;
        }
        for (int i = 0; i < 4; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 40; --posY) {
                if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass && this.quickSpaceCheck(world, posX, posY - 1, posZ)) {
                    OreSpawnMain.MyDungeon.makeSpiderHangout(world, posX, posY - 1, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return;
                }
            }
        }
    }
    
    public void addRedAntHangout(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(250) != 0) {
            return;
        }
        for (int i = 0; i < 4; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 40; --posY) {
                if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.grass && this.quickSpaceCheck(world, posX, posY - 1, posZ)) {
                    OreSpawnMain.MyDungeon.makeRedAntHangout(world, posX, posY - 1, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return;
                }
            }
        }
    }
    
    public void addWaterDragonLair(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(350) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ocean")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                        OreSpawnMain.MyDungeon.makeWaterDragonLair(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public void addGirlfriendIsland(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(300) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ocean")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                        OreSpawnMain.MyDungeon.makeGirlfriendIsland(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public void addMonsterIsland(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(300) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (b.biomeName.equals("Ocean")) {
            for (int i = 0; i < 4; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                for (int posY = 100; posY > 40; --posY) {
                    if (world.getBlock(posX, posY, posZ) == Blocks.air && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                        OreSpawnMain.MyDungeon.makeMonsterIsland(world, posX, posY - 1, posZ);
                        OreSpawnWorld.recently_placed = 50;
                        return;
                    }
                }
            }
        }
    }
    
    public void addMosquitos(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(25 + OreSpawnMain.LessLag * 2) != 0) {
            return;
        }
        if ((world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID3) && random.nextInt(3) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID2 || world.provider.dimensionId == OreSpawnMain.DimensionID3 || b.biomeName.equals("Jungle") || b.biomeName.equals("Swampland")) {
            for (int i = 0; i < 2; ++i) {
                for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 100; posY > 40 && world.isAirBlock(posX, posY, posZ); --posY) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyMosquitoPlant, 0, 2);
                        break;
                    }
                }
            }
        }
    }
    
    public void addNetherMosquitos(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(25) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 20; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.netherrack) {
                    OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyMosquitoPlant, 0, 2);
                    break;
                }
            }
        }
    }
    
    public void addNetherAnts(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.RedAntEnable == 0) {
            return;
        }
        if (random.nextInt(25) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 20; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.netherrack) {
                    OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRedAntBlock, 0, 2);
                    break;
                }
            }
        }
    }
    
    public void addAnts(final World world, final Random random, final int chunkX, final int chunkZ, int redfreq) {
        if (OreSpawnMain.RedAntEnable == 0 && OreSpawnMain.BlackAntEnable == 0 && OreSpawnMain.RainbowAntEnable == 0 && OreSpawnMain.UnstableAntEnable == 0) {
            return;
        }
        if (redfreq < 2) {
            redfreq = 2;
        }
        if (random.nextInt(30 + OreSpawnMain.LessLag * 4) != 0) {
            return;
        }
        for (int i = 0; i < 4; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            int posY = 100;
            while (posY > 40 && world.isAirBlock(posX, posY, posZ)) {
                if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    if (random.nextInt(redfreq) == 0) {
                        final int which = random.nextInt(4);
                        if (which == 0 && OreSpawnMain.RedAntEnable != 0) {
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRedAntBlock, 0, 2);
                        }
                        if (which == 1 && OreSpawnMain.RainbowAntEnable != 0) {
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyRainbowAntBlock, 0, 2);
                        }
                        if (which == 2 && OreSpawnMain.UnstableAntEnable != 0) {
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyUnstableAntBlock, 0, 2);
                        }
                        if (which == 3 && OreSpawnMain.TermiteEnable != 0) {
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.TermiteBlock, 0, 2);
                        }
                        break;
                    }
                    if (OreSpawnMain.BlackAntEnable != 0) {
                        OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyAntBlock, 0, 2);
                        break;
                    }
                    break;
                }
                else {
                    --posY;
                }
            }
        }
    }
    
    public void addEndAnts() {
    }
    
    public void addEndKnights(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(25) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 10; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone && this.quickSpaceCheck(world, posX, posY, posZ)) {
                    OreSpawnMain.MyDungeon.makeEnderKnightDungeon(world, posX, posY, posZ);
                    return;
                }
            }
        }
    }
    
    public void addEndReapers(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(25) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 10; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone && this.quickSpaceCheck(world, posX, posY, posZ)) {
                    OreSpawnMain.MyDungeon.makeEnderReaperGraveyard(world, posX, posY, posZ);
                    return;
                }
            }
        }
    }
    
    public void addHospital(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(25) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 10; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone && this.quickSpaceCheck(world, posX, posY, posZ)) {
                    OreSpawnMain.MyDungeon.makeEnderDragonHospital(world, posX, posY, posZ);
                    return;
                }
            }
        }
    }
    
    public void addEnderCastle(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(50) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 90; posY > 10; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.end_stone && this.quickBigSpaceCheck(world, posX, posY, posZ)) {
                    OreSpawnMain.MyDungeon.makeEnderCastle(world, posX, posY, posZ);
                    return;
                }
            }
        }
    }
    
    public void addUnstableAnts(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.UnstableAntEnable == 0) {
            return;
        }
        if (random.nextInt(30) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 20; posY > 2 && world.isAirBlock(posX, posY, posZ); --posY) {
                if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.MyUnstableAntBlock, 0, 2);
                    break;
                }
            }
        }
    }
    
    public void addCrystalTermites(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.TermiteEnable == 0) {
            return;
        }
        if (random.nextInt(40) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, OreSpawnMain.CrystalTermiteBlock, 0, 2);
                    break;
                }
            }
        }
    }
    
    public boolean addRotatorStation(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.RotatorEnable == 0) {
            return false;
        }
        if (random.nextInt(150) != 0) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.MyDungeon.makeRotatorStation(world, posX, posY, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addRoundRotator(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.RotatorEnable == 0) {
            return false;
        }
        if (random.nextInt(150) != 0) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.MyDungeon.makeRoundRotator(world, posX, posY, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addUrchinSpawner(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.UrchinEnable == 0) {
            return false;
        }
        if (random.nextInt(180) != 0) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.MyDungeon.makeUrchinSpawner(world, posX, posY, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addCrystalHauntedHouse(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(230) != 0) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.MyDungeon.makeCrystalHauntedHouse(world, posX, posY, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void addCrystalBattleTower(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(280) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                    OreSpawnMain.MyDungeon.makeCrystalBattleTower(world, posX, posY, posZ);
                    OreSpawnWorld.recently_placed = 50;
                    return;
                }
            }
        }
    }
    
    public void addIrukandji(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.IrukandjiEnable == 0) {
            return;
        }
        if (random.nextInt(80) != 0) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            for (int posY = 100; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.water) {
                    OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.mob_spawner, 0, 2);
                    final TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getTileEntity(posX, posY, posZ);
                    if (tileentitymobspawner != null) {
                        tileentitymobspawner.func_145881_a().setEntityName("Irukandji");
                    }
                    return;
                }
            }
        }
    }
    
    public void addCrystalChestsAndSpawners(final World world, final Random random, final int chunkX, final int chunkZ) {
        Block bid;
        int i = 0;
        while (i < 3) {
            final int posX = 1 + chunkX + random.nextInt(14);
            final int posZ = 1 + chunkZ + random.nextInt(14);
            final int posY = 25;
            if (world.isAirBlock(posX, posY, posZ)) {
                bid = world.getBlock(posX, posY, posZ);
                if (bid != Blocks.air) {
                    break;
                }
                bid = world.getBlock(posX + 1, posY, posZ);
                if (bid == Blocks.air) {
                    this.addCrystalChest(world, posX, posY, posZ, 5);
                    break;
                }
                bid = world.getBlock(posX - 1, posY, posZ);
                if (bid == Blocks.air) {
                    this.addCrystalChest(world, posX, posY, posZ, 4);
                    break;
                }
                bid = world.getBlock(posX, posY, posZ + 1);
                if (bid == Blocks.air) {
                    this.addCrystalChest(world, posX, posY, posZ, 2);
                    break;
                }
                bid = world.getBlock(posX, posY, posZ - 1);
                if (bid == Blocks.air) {
                    this.addCrystalChest(world, posX, posY, posZ, 3);
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
    }
    
    public void addCrystalChest(final World world, final int x, final int y, final int z, final int dir) {
        final int i = world.rand.nextInt(3);
        if (i == 0) {
            OreSpawnMain.setBlockFast(world, x, y, z, Blocks.chest, 0, 2);
            world.setBlockMetadataWithNotify(x, y, z, dir, 3);
            final TileEntityChest chest = (TileEntityChest)world.getTileEntity(x, y, z);
            if (chest != null) {
                final Random rand = world.rand;
                WeightedRandomChestContent.generateChestContents(rand, Trees.CrystalChestContentsList, chest, 1 + world.rand.nextInt(3));
            }
        }
        else {
            OreSpawnMain.setBlockFast(world, x, y, z, Blocks.mob_spawner, 0, 2);
            final TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getTileEntity(x, y, z);
            if (tileentitymobspawner != null) {
                final int t = world.rand.nextInt(2);
                if (t == 0) {
                    tileentitymobspawner.func_145881_a().setEntityName("Dungeon Beast");
                }
                if (t == 1) {
                    tileentitymobspawner.func_145881_a().setEntityName("Rat");
                }
            }
        }
    }
    
    public void addIslands(final World world, final Random random, final int chunkX, final int chunkZ) {
        final int posX = 2 + chunkX + random.nextInt(12);
        final int posZ = 2 + chunkZ + random.nextInt(12);
        if (random.nextInt(10 + OreSpawnMain.LessLag * 2) != 1) {
            return;
        }
        for (int posY = 20; posY > 2 && world.isAirBlock(posX, posY, posZ); --posY) {
            if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyIslandBlock, 0, 2);
                break;
            }
        }
    }
    
    public boolean addAppleTrees(final World world, final Random random, final int chunkX, final int chunkZ, final Chunk chunk) {
        int freq = Math.abs(chunkX / 16) + Math.abs(chunkZ / 16);
        int howmany = 2;
        int which;
        boolean added = false;
        freq %= 15;
        howmany += random.nextInt(2 + (15 - freq) / 2);
        which = random.nextInt(10);
        if (random.nextInt(15 + freq) != 0) {
            return false;
        }
        if (OreSpawnMain.LessLag == 1) {
            howmany /= 2;
        }
        if (OreSpawnMain.LessLag == 2) {
            howmany /= 4;
            if (howmany < 1) {
                return false;
            }
        }
        for (int i = 0; i < howmany; ++i) {
            for (int posX = 2 + chunkX + random.nextInt(12), posZ = 2 + chunkZ + random.nextInt(12), posY = 100; posY > 50 && world.isAirBlock(posX, posY, posZ); --posY) {
                if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    final ItemAppleSeed a = (ItemAppleSeed)OreSpawnMain.MyAppleSeed;
                    if (which < 8) {
                        a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyAppleLeaves, chunk);
                    }
                    if (which == 8) {
                        a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyCherryLeaves, chunk);
                    }
                    if (which == 9) {
                        a.makeTree(world, posX, posY - 1, posZ, OreSpawnMain.MyPeachLeaves, chunk);
                    }
                    added = true;
                    break;
                }
            }
        }
        return added;
    }
    
    public boolean addHugeTree(final World world, final Random random, final int chunkX, final int chunkZ, final Chunk chunk) {
        int made_one = 0;
        if (random.nextInt(50) != 0) {
            return false;
        }
        if (OreSpawnMain.LessLag == 1 && random.nextInt(2) != 0) {
            return false;
        }
        if (OreSpawnMain.LessLag == 2 && random.nextInt(4) != 0) {
            return false;
        }
        for (int i = 0; i < 3 && made_one == 0; ++i) {
            final int posX = 4 + chunkX + random.nextInt(8);
            final int posZ = 4 + chunkZ + random.nextInt(8);
            for (int posY = 127; posY > 50; --posY) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    final ItemMagicApple a = (ItemMagicApple)OreSpawnMain.MagicApple;
                    final int tree_type = random.nextInt(4);
                    int tree_radius = 6 - random.nextInt(2);
                    boolean no_critters = false;
                    Block leaf_type = Blocks.leaves;
                    if (random.nextInt(100) > 25) {
                        no_critters = true;
                    }
                    final int rand_treetype = random.nextInt(100);
                    if (rand_treetype > 75) {
                        if (tree_type != 3 && random.nextInt(20) == 0) {
                            leaf_type = OreSpawnMain.MyAppleLeaves;
                        }
                        a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.log, leaf_type, Blocks.mossy_cobblestone, tree_type, tree_radius, no_critters, chunk);
                    }
                    else if (rand_treetype == 0) {
                        tree_radius = 6;
                        if (random.nextInt(2) == 0) {
                            a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.gold_block, Blocks.emerald_block, Blocks.diamond_block, -1, tree_radius, true, chunk);
                        }
                        else {
                            a.MakeBigSquareTree(world, posX, posY - 1, posZ, Blocks.obsidian, OreSpawnMain.MyBlockRubyBlock, OreSpawnMain.MyBlockAmethystBlock, -1, tree_radius, true, chunk);
                        }
                    }
                    else if (rand_treetype > 15) {
                        tree_radius = 6 - random.nextInt(3);
                        a.MakeBigCircularTree(world, posX, posY - 1, posZ, Blocks.log, leaf_type, Blocks.mossy_cobblestone, tree_type, tree_radius, no_critters, chunk);
                    }
                    else {
                        tree_radius = 6 - random.nextInt(3);
                        a.MakeBigRoundTree(world, posX, posY - 1, posZ, Blocks.log, leaf_type, tree_type, tree_radius, chunk);
                    }
                    made_one = 1;
                    break;
                }
            }
        }
        return made_one != 0;
    }
    
    public void addVeggies(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(15) != 0) {
            return;
        }
        final BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
        if (world.provider.dimensionId == OreSpawnMain.DimensionID || world.provider.dimensionId == OreSpawnMain.DimensionID2 || world.provider.dimensionId == OreSpawnMain.DimensionID6 || b.biomeName.equals("River") || b.biomeName.equals("Swampland")) {
            for (int i = 0; i < 8; ++i) {
                final int posX = chunkX + random.nextInt(16);
                final int posZ = chunkZ + random.nextInt(16);
                int posY = 100;
                while (posY > 40 && world.isAirBlock(posX, posY, posZ)) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        final int what = random.nextInt(6);
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
                            if (random.nextInt(10) == 0) {
                                OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.melon_stem, 0, 2);
                                break;
                            }
                        }
                        else {
                            if (random.nextInt(50) == 1 && OreSpawnMain.enableduplicatortree != 0) {
                                OreSpawnMain.setBlockFast(world, posX, posY, posZ, OreSpawnMain.MyDT, 0, 2);
                                break;
                            }
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
    }
    
    public void addRocks(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(5) != 0) {
            return;
        }
        if (OreSpawnMain.RockEnable == 0) {
            return;
        }
        for (int howmany = 3 + random.nextInt(10), i = 0; i < howmany; ++i) {
            for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 110; posY > 40 && world.getBlock(posX, posY, posZ) == Blocks.air; --posY) {
                final Block bid = world.getBlock(posX, posY - 1, posZ);
                if (bid == Blocks.grass || bid == Blocks.sand || bid == OreSpawnMain.CrystalGrass) {
                    this.spawnCreature(world, posX, posY, posZ);
                    break;
                }
            }
        }
    }
    
    public void addD4Rocks(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(7) != 0) {
            return;
        }
        if (OreSpawnMain.RockEnable == 0) {
            return;
        }
        for (int howmany = 3 + random.nextInt(10), i = 0; i < howmany; ++i) {
            for (int posX = chunkX + random.nextInt(16), posZ = chunkZ + random.nextInt(16), posY = 20; posY > 5 && world.getBlock(posX, posY, posZ) == Blocks.air; --posY) {
                if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    this.spawnCreature(world, posX, posY, posZ);
                    break;
                }
            }
        }
    }
    
    public boolean addFairyTree(final World world, final Random random, final int chunkX, final int chunkZ) {
        final int posX = chunkX + 8;
        final int posZ = chunkZ + 8;
        if (random.nextInt(5) != 0) {
            return false;
        }
        for (int posY = 128; posY > 40; --posY) {
            if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == OreSpawnMain.CrystalGrass) {
                for (int i = -8; i <= 8; ++i) {
                    for (int j = -8; j <= 8; ++j) {
                        final Block bid = world.getBlock(posX + i, posY, posZ + j);
                        if (bid != Blocks.air) {
                            return false;
                        }
                    }
                }
                for (int i = -2; i <= 2; ++i) {
                    for (int j = -2; j <= 2; ++j) {
                        final Block bid = world.getBlock(posX + i, posY - 1, posZ + j);
                        if (bid != OreSpawnMain.CrystalGrass) {
                            return false;
                        }
                    }
                }
                if (random.nextInt(5) != 1) {
                    OreSpawnMain.OreSpawnTrees.FairyTree(world, posX, posY - 1, posZ);
                }
                else {
                    OreSpawnMain.OreSpawnTrees.FairyCastleTree(world, posX, posY, posZ);
                }
                OreSpawnWorld.recently_placed = 50;
                break;
            }
        }
        return true;
    }
    
    public boolean addRubyDungeon(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(15) != 0) {
            return false;
        }
        for (int i = 0; i < 8; ++i) {
            final int posX = chunkX + random.nextInt(8);
            final int posZ = chunkZ + random.nextInt(8);
            for (int posY = 50; posY > 5; --posY) {
                if (world.getBlock(posX, posY, posZ) == Blocks.lava) {
                    OreSpawnMain.RubyDungeon.makeDungeon(world, posX, posY, posZ);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void addGenericDungeon(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(16) != 0) {
            return;
        }
        if (OreSpawnMain.LessLag == 1 && random.nextInt(2) != 0) {
            return;
        }
        if (OreSpawnMain.LessLag == 2 && random.nextInt(4) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(4);
        final int posZ = chunkZ + random.nextInt(4);
        final int posY = 5 + random.nextInt(40);
        OreSpawnMain.MyDungeon.makeDungeon(world, posX, posY, posZ);
    }
    
    public void addBeeHive(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.MyDungeon.makeBeeHive(world, lowestX, lowestY + 3, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addAlienWTF(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.MyDungeon.makeAlienWTFDungeon(world, lowestX, lowestY, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addEnderKnight(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.MyDungeon.makeEnderKnightDungeon(world, lowestX, lowestY, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addLeonNest(final World world, final int chunkX, final int chunkZ) {
        int highestY = 30;
        int highestX = chunkX;
        int highestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 80) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
                        if (posY > highestY) {
                            highestY = posY + 1;
                            highestX = posX;
                            highestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && highestY > 80) {
            OreSpawnMain.MyDungeon.makeLeonNest(world, highestX, highestY, highestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addShadowDungeon(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) == Blocks.grass) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.MyDungeon.makeShadowDungeon(world, lowestX, lowestY, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addD4RubyDungeon(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            final Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                OreSpawnMain.RubyDungeon.makeDungeon(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4CephadromeAltar(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            final Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                OreSpawnMain.MyDungeon.makeCephadromeAltar(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4Castle(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -20; x < 33; ++x) {
                    for (int z = -4; z < 33; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                if (random.nextInt(2) == 1) {
                    OreSpawnMain.MyDungeon.makeEnormousCastle(world, posX, posY, posZ);
                }
                else {
                    OreSpawnMain.MyDungeon.makeEnormousCastleQ(world, posX, posY, posZ);
                }
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4Greenhouse(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -2; x < 25; ++x) {
                    for (int z = -4; z < 25; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeGreenhouseDungeon(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4NightmareRookery(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -5; x < 25; ++x) {
                    for (int z = -4; z < 5; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeNightmareRookery(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4StinkyHouse(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -8; x < 20; ++x) {
                    for (int z = -8; z < 20; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeStinkyHouse(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4WhiteHouse(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -20; x < 30; ++x) {
                    for (int z = -20; z < 300; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeWhiteHouse(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4EnderCastle(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -5; x < 25; ++x) {
                    for (int z = -5; z < 25; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeEnderCastle(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4IncaPyramid(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -10; x < 50; ++x) {
                    for (int z = -10; z < 40; ++z) {
                        bid = world.getBlock(posX + x, posY + 18, posZ + z);
                        if (bid != Blocks.air) {
                            return;
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeIncaPyramid(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4RobotLab(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                for (int x = -5; x < 60; ++x) {
                    for (int z = -5; z < 70; ++z) {
                        bid = world.getBlock(posX + x, posY + 4, posZ + z);
                        if (bid != Blocks.air) {
                            if (bid != Blocks.log) {
                                if (bid != OreSpawnMain.MyAppleLeaves) {
                                    if (bid != OreSpawnMain.MyScaryLeaves) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                OreSpawnMain.MyDungeon.makeRobotLab(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4Mini(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            final Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                OreSpawnMain.MyDungeon.makeMiniDungeon(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addPumpkin(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(2) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            final Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                OreSpawnMain.MyDungeon.makePumpkin(world, posX, posY + 1, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addD4CloudShark(final World world, final Random random, final int chunkX, final int chunkZ) {
        final int posX = 4 + chunkX + random.nextInt(8);
        final int posZ = 4 + chunkZ + random.nextInt(8);
        OreSpawnMain.MyDungeon.makeCloudSharkDungeon(world, posX, 150 + world.rand.nextInt(10), posZ);
    }
    
    public void addD4Rainbow(final World world, final Random random, final int chunkX, final int chunkZ) {
        final int posX = 4 + chunkX + random.nextInt(8);
        final int posZ = 4 + chunkZ + random.nextInt(8);
        OreSpawnMain.MyDungeon.makeRainbow(world, posX, 70 + world.rand.nextInt(20), posZ);
        OreSpawnWorld.recently_placed = 50;
    }
    
    public void addD4GenericDungeon(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (OreSpawnMain.LessLag != 0 && random.nextInt(4) != 0) {
            return;
        }
        final int posX = chunkX + random.nextInt(8);
        final int posZ = chunkZ + random.nextInt(8);
        for (int posY = 20; posY > 4; --posY) {
            final Block bid = world.getBlock(posX, posY, posZ);
            if (bid == Blocks.grass) {
                OreSpawnMain.MyDungeon.makeDungeon(world, posX, posY, posZ);
                OreSpawnWorld.recently_placed = 50;
                return;
            }
        }
    }
    
    public void addLavaAndWater(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(5) != 0) {
            return;
        }
        for (int i = 0; i < 6; ++i) {
            final int posX = chunkX + random.nextInt(16);
            final int posZ = chunkZ + random.nextInt(16);
            int posY = 128;
            while (posY > 75 && world.isAirBlock(posX, posY, posZ)) {
                if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    Block bid = world.getBlock(posX, posY - 2, posZ);
                    if (bid != Blocks.dirt && bid != Blocks.stone) {
                        break;
                    }
                    int air = 0;
                    int non_air = 0;
                    bid = world.getBlock(posX + 1, posY - 1, posZ);
                    if (bid == Blocks.air) {
                        ++air;
                    }
                    if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass) {
                        ++non_air;
                    }
                    bid = world.getBlock(posX - 1, posY - 1, posZ);
                    if (bid == Blocks.air) {
                        ++air;
                    }
                    if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass) {
                        ++non_air;
                    }
                    bid = world.getBlock(posX, posY - 1, posZ + 1);
                    if (bid == Blocks.air) {
                        ++air;
                    }
                    if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass) {
                        ++non_air;
                    }
                    bid = world.getBlock(posX, posY - 1, posZ - 1);
                    if (bid == Blocks.air) {
                        ++air;
                    }
                    if (bid == Blocks.dirt || bid == Blocks.stone || bid == Blocks.grass) {
                        ++non_air;
                    }
                    if (air != 0 && non_air != 0) {
                        final int what = random.nextInt(2);
                        if (what == 0) {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.flowing_water, 0, 3);
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, Blocks.water, 0, 3);
                            OreSpawnMain.setBlockFast(world, posX, posY - 2, posZ, Blocks.water, 0, 3);
                        }
                        else {
                            OreSpawnMain.setBlockFast(world, posX, posY, posZ, Blocks.flowing_lava, 0, 3);
                            OreSpawnMain.setBlockFast(world, posX, posY - 1, posZ, Blocks.lava, 0, 3);
                            OreSpawnMain.setBlockFast(world, posX, posY - 2, posZ, Blocks.lava, 0, 3);
                        }
                        return;
                    }
                    break;
                }
                else {
                    --posY;
                }
            }
        }
    }
    
    public boolean addOtherTrees(final World world, final Random random, final int chunkX, final int chunkZ) {
        int nc = 5;
        int count = 0;
        if (random.nextInt(30) != 0) {
            return false;
        }
        if (OreSpawnMain.LessLag == 1) {
            if (random.nextInt(2) != 0) {
                return false;
            }
            nc = 4;
        }
        if (OreSpawnMain.LessLag == 2) {
            if (random.nextInt(4) != 0) {
                return false;
            }
            nc = 3;
        }
        if (world.provider.dimensionId == OreSpawnMain.DimensionID) {
            final int dir = 0;
            final int what = random.nextInt(2);
            for (int i = 0; i < nc; ++i) {
                final int posX = 3 + chunkX + random.nextInt(10);
                final int posZ = 3 + chunkZ + random.nextInt(10);
                int posY = 100;
                while (posY > 50 && world.isAirBlock(posX, posY, posZ)) {
                    if (world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                        ++count;
                        if (what == 0) {
                            OreSpawnMain.OreSpawnTrees.WindTree(world, posX, posY - 1, posZ, dir);
                            if (count >= 4) {
                                return true;
                            }
                        }
                        else {
                            OreSpawnMain.OreSpawnTrees.SkyTree(world, posX, posY - 1, posZ);
                            if (count >= 3) {
                                return true;
                            }
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        return count > 0;
    }
    
    public void addKingAltar(final World world, final Random random, final int chunkX, final int chunkZ) {
        if (random.nextInt(2000) != 1) {
            return;
        }
        for (int i = 0; i < 8; ++i) {
            final int posX = 3 + chunkX + random.nextInt(10);
            final int posZ = 3 + chunkZ + random.nextInt(10);
            int posY = 100;
            while (posY > 50) {
                if (world.isAirBlock(posX, posY, posZ) && world.getBlock(posX, posY - 1, posZ) == Blocks.grass) {
                    if (!this.quickReallyBigSpaceCheck(world, posX, posY - 1, posZ)) {
                        return;
                    }
                    if (random.nextInt(2) == 0) {
                        OreSpawnMain.MyDungeon.makeKingAltar(world, posX, posY - 1, posZ);
                    }
                    else {
                        OreSpawnMain.MyDungeon.makeQueenAltar(world, posX, posY - 1, posZ);
                    }
                    OreSpawnWorld.recently_placed = 100;
                    return;
                }
                else {
                    --posY;
                }
            }
        }
    }
    
    public void addBasiliskMaze(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) != Blocks.air) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.BMaze.buildBasiliskMaze(world, lowestX, lowestY - 2, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    public void addKyuubiDungeon(final World world, final int chunkX, final int chunkZ) {
        int lowestY = 128;
        int lowestX = chunkX;
        int lowestZ = chunkZ;
        int found = 0;
        for (int i = 0; i < 16; i += 3) {
            for (int j = 0; j < 16; j += 3) {
                final int posX = chunkX + i;
                final int posZ = chunkZ + j;
                int posY = 128;
                while (posY > 30) {
                    if (world.getBlock(posX, posY + 1, posZ) == Blocks.air && world.getBlock(posX, posY, posZ) != Blocks.air) {
                        if (posY < lowestY) {
                            lowestY = posY;
                            lowestX = posX;
                            lowestZ = posZ;
                            found = 1;
                            break;
                        }
                        break;
                    }
                    else {
                        --posY;
                    }
                }
            }
        }
        if (found != 0 && lowestY > 40) {
            OreSpawnMain.MyDungeon.makeKyuubiDungeon(world, lowestX, lowestY - 2, lowestZ);
            OreSpawnWorld.recently_placed = 50;
        }
    }
    
    private boolean quickSpaceCheck(final World world, final int posX, final int posY, final int posZ) {
        for (int i = -2; i < 10; ++i) {
            for (int k = -2; k < 10; ++k) {
                if (world.getBlock(posX + i, posY + 4, posZ + k) != Blocks.air) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean quickBigSpaceCheck(final World world, final int posX, final int posY, final int posZ) {
        for (int i = -5; i < 25; ++i) {
            for (int k = -5; k < 25; ++k) {
                if (world.getBlock(posX + i, posY + 8, posZ + k) != Blocks.air) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean quickReallyBigSpaceCheck(final World world, final int posX, final int posY, final int posZ) {
        for (int i = -5; i < 55; ++i) {
            for (int k = -5; k < 55; ++k) {
                if (world.getBlock(posX + i, posY + 8, posZ + k) != Blocks.air) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean D4BigSpaceCheck(final World world, final int posX, final int posZ) {
        for (int i = -25; i < 40; ++i) {
            for (int k = -25; k < 30; ++k) {
                final Block bid = world.getBlock(posX + i, 7 + 4, posZ + k);
                if (bid != Blocks.air) {
                    if (bid != Blocks.log) {
                        if (bid != OreSpawnMain.MyAppleLeaves) {
                            if (bid != OreSpawnMain.MyScaryLeaves) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private void spawnCreature(final World par0World, double par2, final double par4, double par6) {
        Entity var8;
        var8 = EntityList.createEntityByName("Rock", par0World);
        if (var8 != null) {
            if (par2 > 0.0) {
                par2 += 0.5;
            }
            if (par2 < 0.0) {
                par2 -= 0.5;
            }
            if (par6 > 0.0) {
                par6 += 0.5;
            }
            if (par6 < 0.0) {
                par6 -= 0.5;
            }
            var8.setLocationAndAngles(par2, par4 + 0.01, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
    }
    
    static {
        OreSpawnWorld.recently_placed = 50;
    }
}
