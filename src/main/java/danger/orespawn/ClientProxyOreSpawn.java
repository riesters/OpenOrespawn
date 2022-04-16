package danger.orespawn;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderFish;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxyOreSpawn extends CommonProxyOreSpawn {
  public void registerRenderThings() {
    MinecraftForge.EVENT_BUS.register(new GirlfriendOverlayGui(Minecraft.getMinecraft()));
    RenderingRegistry.registerEntityRenderingHandler(Girlfriend.class, (Render)new RenderGirlfriend(new ModelBiped(), 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(Boyfriend.class, (Render)new RenderBoyfriend(new ModelBiped(), 0.55F));
    RenderingRegistry.registerEntityRenderingHandler(RedCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(GoldCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(EnchantedCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(CrystalCow.class, (Render)new RenderEnchantedCow(new ModelCow(), 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(Shoes.class, new RenderShoe());
    RenderingRegistry.registerEntityRenderingHandler(SunspotUrchin.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(WaterBall.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(InkSack.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(LaserBall.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(IceBall.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(Acid.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(DeadIrukandji.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(BerthaHit.class, new RenderItemUrchin());
    RenderingRegistry.registerEntityRenderingHandler(EntityCage.class, new RenderCage());
    RenderingRegistry.registerEntityRenderingHandler(UltimateFishHook.class, (Render)new RenderFish());
    RenderingRegistry.registerEntityRenderingHandler(UltimateArrow.class, (Render)new RenderArrow());
    RenderingRegistry.registerEntityRenderingHandler(EntityThrownRock.class, new RenderThrownRock());
    RenderingRegistry.registerEntityRenderingHandler(EntityButterfly.class, (Render)new RenderButterfly(new ModelButterfly(1.0F), 0.3F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Firefly.class, (Render)new RenderFirefly(new ModelFirefly(2.5F), 0.2F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(EntityLunaMoth.class, (Render)new RenderButterfly(new ModelButterfly(0.75F), 0.4F, 1.5F));
    RenderingRegistry.registerEntityRenderingHandler(EntityMosquito.class, (Render)new RenderMosquito(new ModelMosquito(), 0.3F, 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(Ghost.class, (Render)new RenderGhost(new ModelGhost(), 0.0F, 0.65F));
    RenderingRegistry.registerEntityRenderingHandler(GhostSkelly.class, (Render)new RenderGhostSkelly(new ModelGhostSkelly(), 0.0F, 1.05F));
    RenderingRegistry.registerEntityRenderingHandler(Mothra.class, (Render)new RenderButterfly(new ModelButterfly(0.2F), 0.75F, 10.0F));
    RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1F, 0.25F));
    RenderingRegistry.registerEntityRenderingHandler(EntityRedAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.15F, 0.35F));
    RenderingRegistry.registerEntityRenderingHandler(EntityRainbowAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1F, 0.25F));
    RenderingRegistry.registerEntityRenderingHandler(EntityUnstableAnt.class, (Render)new RenderAnt(new ModelAnt(), 0.1F, 0.25F));
    RenderingRegistry.registerEntityRenderingHandler(Alosaurus.class, (Render)new RenderAlosaurus(new ModelAlosaurus(0.22F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(TRex.class, (Render)new RenderTRex(new ModelTRex(0.2F), 1.0F, 1.2F));
    RenderingRegistry.registerEntityRenderingHandler(Tshirt.class, (Render)new RenderTshirt(new ModelTshirt(0.22F), 1.0F, 0.33F));
    RenderingRegistry.registerEntityRenderingHandler(Cryolophosaurus.class, (Render)new RenderCryolophosaurus(new ModelCryolophosaurus(0.75F), 0.75F, 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(Basilisk.class, (Render)new RenderBasilisk(new ModelBasilisk(0.3F), 0.5F, 1.25F));
    RenderingRegistry.registerEntityRenderingHandler(Camarasaurus.class, (Render)new RenderCamarasaurus(new ModelCamarasaurus(0.65F), 0.65F, 0.65F));
    RenderingRegistry.registerEntityRenderingHandler(Hydrolisc.class, (Render)new RenderHydrolisc(new ModelHydrolisc(0.65F), 0.65F, 0.65F));
    RenderingRegistry.registerEntityRenderingHandler(VelocityRaptor.class, (Render)new RenderVelocityRaptor(new ModelVelocityRaptor(1.25F), 0.55F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Dragonfly.class, (Render)new RenderDragonfly(new ModelDragonfly(2.0F), 0.3F, 1.5F));
    RenderingRegistry.registerEntityRenderingHandler(Bee.class, (Render)new RenderBee(new ModelBee(2.0F), 0.9F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(EmperorScorpion.class, (Render)new RenderEmperorScorpion(new ModelEmperorScorpion(0.22F), 0.95F, 1.5F));
    RenderingRegistry.registerEntityRenderingHandler(Spyro.class, (Render)new RenderSpyro(new ModelSpyro(0.65F), 0.65F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Baryonyx.class, (Render)new RenderBaryonyx(new ModelBaryonyx(0.25F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(GammaMetroid.class, (Render)new RenderGammaMetroid(new ModelGammaMetroid(0.45F), 0.75F, 0.9F));
    RenderingRegistry.registerEntityRenderingHandler(Cockateil.class, (Render)new RenderCockateil(new ModelCockateil(1.0F), 0.3F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(RubyBird.class, (Render)new RenderCockateil(new ModelCockateil(1.0F), 0.3F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Kyuubi.class, (Render)new RenderKyuubi(new ModelKyuubi(0.5F), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Scorpion.class, (Render)new RenderScorpion(new ModelScorpion(0.62F), 0.35F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(CaveFisher.class, (Render)new RenderCaveFisher(new ModelCaveFisher(0.62F), 0.35F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Alien.class, (Render)new RenderAlien(new ModelAlien(0.22F), 0.35F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(WaterDragon.class, (Render)new RenderWaterDragon(new ModelWaterDragon(0.5F), 0.85F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(AttackSquid.class, (Render)new RenderAttackSquid(new ModelAttackSquid(1.0F), 0.25F, 0.9F));
    RenderingRegistry.registerEntityRenderingHandler(Elevator.class, new RenderElevator());
    RenderingRegistry.registerEntityRenderingHandler(Robot1.class, (Render)new RenderRobot1(new ModelRobot1(2.0F), 0.3F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Robot2.class, (Render)new RenderRobot2(new ModelRobot2(1.0F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Robot3.class, (Render)new RenderRobot3(new ModelRobot3(1.0F), 1.0F, 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(Robot4.class, (Render)new RenderRobot4(new ModelRobot4(1.0F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Robot5.class, (Render)new RenderRobot5(new ModelRobot5(1.0F), 0.5F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Kraken.class, (Render)new RenderKraken(new ModelKraken(1.0F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Lizard.class, (Render)new RenderLizard(new ModelLizard(0.65F), 0.75F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Cephadrome.class, (Render)new RenderCephadrome(new ModelCephadrome(0.55F), 1.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Dragon.class, (Render)new RenderDragon(new ModelDragon(0.65F), 1.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Chipmunk.class, (Render)new RenderChipmunk(new ModelChipmunk(1.0F), 0.15F, 0.9F));
    RenderingRegistry.registerEntityRenderingHandler(Gazelle.class, (Render)new RenderGazelle(new ModelGazelle(0.65F), 0.45F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Ostrich.class, (Render)new RenderOstrich(new ModelOstrich(0.65F), 0.55F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(TrooperBug.class, (Render)new RenderTrooperBug(new ModelTrooperBug(0.22F), 0.95F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(SpitBug.class, (Render)new RenderSpitBug(new ModelSpitBug(0.55F), 0.55F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(StinkBug.class, (Render)new RenderStinkBug(new ModelStinkBug(0.75F), 0.35F, 0.85F));
    RenderingRegistry.registerEntityRenderingHandler(Island.class, (Render)new RenderIsland(new ModelIsland(1.0F), 0.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(IslandToo.class, (Render)new RenderIslandToo(new ModelIsland(1.0F), 0.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(CreepingHorror.class, (Render)new RenderCreepingHorror(new ModelCreepingHorror(), 0.45F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(TerribleTerror.class, (Render)new RenderTerribleTerror(new ModelTerribleTerror(), 0.45F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(CliffRacer.class, (Render)new RenderCliffRacer(new ModelCliffRacer(1.0F), 0.3F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Triffid.class, (Render)new RenderTriffid(new ModelTriffid(1.0F), 0.3F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(PitchBlack.class, (Render)new RenderPitchBlack(new ModelPitchBlack(0.65F), 1.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(LurkingTerror.class, (Render)new RenderLurkingTerror(new ModelLurkingTerror(), 0.45F, 0.85F));
    RenderingRegistry.registerEntityRenderingHandler(Godzilla.class, (Render)new RenderGodzilla(new ModelGodzilla(0.2F), 1.0F, 2.0F));
    RenderingRegistry.registerEntityRenderingHandler(GodzillaHead.class, (Render)new RenderGodzillaHead(null, 0.0F, 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(KingHead.class, (Render)new RenderKingHead(null, 0.0F, 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(QueenHead.class, (Render)new RenderQueenHead(null, 0.0F, 0.0F));
    RenderingRegistry.registerEntityRenderingHandler(WormSmall.class, (Render)new RenderWormSmall(new ModelWormSmall(), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(WormMedium.class, (Render)new RenderWormMedium(new ModelWormMedium(), 0.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(WormLarge.class, (Render)new RenderWormLarge(new ModelWormLarge(), 0.9F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Cassowary.class, (Render)new RenderCassowary(new ModelCassowary(0.55F), 0.5F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(GoldFish.class, (Render)new RenderGoldFish(new ModelGoldFish(0.7F), 0.2F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(CloudShark.class, (Render)new RenderCloudShark(new ModelCloudShark(1.0F), 0.5F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(LeafMonster.class, (Render)new RenderLeafMonster(new ModelLeafMonster(), 0.65F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(EnderKnight.class, (Render)new RenderEnderKnight(new ModelEnderKnight(0.21F), 0.3F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(EnderReaper.class, (Render)new RenderEnderReaper(new ModelEnderReaper(0.23F), 0.2F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Beaver.class, (Render)new RenderBeaver(new ModelBeaver(0.5F), 0.15F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Termite.class, (Render)new RenderAnt(new ModelAnt(), 0.15F, 0.35F));
    RenderingRegistry.registerEntityRenderingHandler(Fairy.class, (Render)new RenderFairy(new ModelFairy(1.5F), 0.1F, 0.35F));
    RenderingRegistry.registerEntityRenderingHandler(Peacock.class, (Render)new RenderPeacock(new ModelPeacock(0.75F), 0.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Rotator.class, (Render)new RenderRotator(new ModelRotator(0.25F), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Vortex.class, (Render)new RenderVortex(new ModelVortex(0.25F), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(DungeonBeast.class, (Render)new RenderDungeonBeast(new ModelDungeonBeast(0.62F), 0.25F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Rat.class, (Render)new RenderRat(new ModelRat(1.0F), 0.1F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Flounder.class, (Render)new RenderFlounder(new ModelFlounder(), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Whale.class, (Render)new RenderWhale(new ModelWhale(), 0.1F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Irukandji.class, (Render)new RenderIrukandji(new ModelIrukandji(1.0F), 0.1F, 0.25F));
    RenderingRegistry.registerEntityRenderingHandler(Skate.class, (Render)new RenderSkate(new ModelSkate(1.0F), 0.1F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Urchin.class, (Render)new RenderUrchin(new ModelUrchin(1.0F), 0.35F, 1.25F));
    RenderingRegistry.registerEntityRenderingHandler(Mantis.class, (Render)new RenderMantis(new ModelMantis(2.0F), 0.9F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(HerculesBeetle.class, (Render)new RenderHerculesBeetle(new ModelHerculesBeetle(1.0F), 0.99F, 1.1F));
    RenderingRegistry.registerEntityRenderingHandler(Stinky.class, (Render)new RenderStinky(new ModelStinky(0.65F), 0.75F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Coin.class, (Render)new RenderCoin(new ModelCoin(0.22F), 0.75F, 0.125F));
    RenderingRegistry.registerEntityRenderingHandler(TheKing.class, (Render)new RenderTheKing(new ModelTheKing(0.65F), 1.9F, 2.1F));
    RenderingRegistry.registerEntityRenderingHandler(TheQueen.class, (Render)new RenderTheQueen(new ModelTheQueen(0.65F), 1.9F, 2.0F));
    RenderingRegistry.registerEntityRenderingHandler(ThePrince.class, (Render)new RenderThePrince(new ModelThePrince(0.65F), 0.75F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(Molenoid.class, (Render)new RenderMolenoid(new ModelMolenoid(0.5F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(SeaMonster.class, (Render)new RenderSeaMonster(new ModelSeaMonster(0.5F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(SeaViper.class, (Render)new RenderSeaViper(new ModelSeaViper(0.5F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(EasterBunny.class, (Render)new RenderEasterBunny(new ModelEasterBunny(0.55F), 0.5F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(CaterKiller.class, (Render)new RenderCaterKiller(new ModelCaterKiller(0.22F), 1.0F, 1.25F));
    RenderingRegistry.registerEntityRenderingHandler(Leon.class, (Render)new RenderLeon(new ModelLeon(0.22F), 1.0F, 1.75F));
    RenderingRegistry.registerEntityRenderingHandler(Hammerhead.class, (Render)new RenderHammerhead(new ModelHammerhead(0.33F), 1.0F, 2.5F));
    RenderingRegistry.registerEntityRenderingHandler(RubberDucky.class, (Render)new RenderRubberDucky(new ModelRubberDucky(1.0F), 0.15F, 0.75F));
    RenderingRegistry.registerEntityRenderingHandler(ThePrinceTeen.class, (Render)new RenderThePrinceTeen(new ModelThePrinceTeen(0.65F), 1.0F, 1.25F));
    RenderingRegistry.registerEntityRenderingHandler(BandP.class, (Render)new RenderBandP(new ModelBandP(0.4F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(RockBase.class, (Render)new RenderRockBase(new ModelRockBase(1.0F), 0.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(PurplePower.class, (Render)new RenderPurplePower(new ModelPurplePower(1.0F), 0.3F, 2.75F));
    RenderingRegistry.registerEntityRenderingHandler(Brutalfly.class, (Render)new RenderBrutalfly(new ModelBrutalfly(0.2F), 0.75F, 9.0F));
    RenderingRegistry.registerEntityRenderingHandler(Nastysaurus.class, (Render)new RenderNastysaurus(new ModelNastysaurus(0.65F), 1.0F, 1.5F));
    RenderingRegistry.registerEntityRenderingHandler(Pointysaurus.class, (Render)new RenderPointysaurus(new ModelPointysaurus(1.0F), 1.0F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Cricket.class, (Render)new RenderCricket(new ModelCricket(2.5F), 0.15F, 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(ThePrincess.class, (Render)new RenderThePrincess(new ModelThePrincess(0.65F), 0.7F, 0.7F));
    RenderingRegistry.registerEntityRenderingHandler(Frog.class, (Render)new RenderFrog(new ModelFrog(1.0F), 0.35F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(ThePrinceAdult.class, (Render)new RenderThePrinceAdult(new ModelThePrinceAdult(0.65F), 1.2F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(SpiderRobot.class, (Render)new RenderSpiderRobot(new ModelSpiderRobot(1.0F), 0.99F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(SpiderDriver.class, (Render)new RenderSpiderDriver(new ModelSpider(), 0.5F));
    RenderingRegistry.registerEntityRenderingHandler(GiantRobot.class, (Render)new RenderGiantRobot(new ModelGiantRobot(0.25F), 0.99F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(AntRobot.class, (Render)new RenderAntRobot(new ModelAntRobot(1.0F), 0.99F, 1.0F));
    RenderingRegistry.registerEntityRenderingHandler(Crab.class, (Render)new RenderCrab(new ModelCrab(1.0F), 0.99F, 1.0F));
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyBertha, new RenderBertha());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MySlice, new RenderSlice());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyRoyal, new RenderRoyal());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MySquidZooka, new RenderSquidZooka());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyHammy, new RenderHammy());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyBattleAxe, new RenderBattleAxe());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyChainsaw, new RenderChainsaw());
    MinecraftForgeClient.registerItemRenderer(OreSpawnMain.MyQueenBattleAxe, new RenderQueenBattleAxe());
  }
  
  public void registerSoundThings() {
    MinecraftForge.EVENT_BUS.register(new OreSpawnSounds());
  }
  
  public void registerKeyboardInput() {
    KeyHandler k = new KeyHandler();
    FMLCommonHandler.instance().bus().register(k);
    OreSpawnMain.MyKeyhandler = k;
  }
  
  public void registerNetworkStuff() {
    super.registerNetworkStuff();
    FMLCommonHandler.instance().bus().register(new RiderControl(getNetwork()));
  }
  
  public int setArmorPrefix(String string) {
    return RenderingRegistry.addNewArmourRendererPrefix(string);
  }
}
