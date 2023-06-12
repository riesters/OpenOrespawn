package danger.orespawn;

import java.util.*;
import danger.orespawn.proxy.*;
import net.minecraft.creativetab.*;
import danger.orespawn.util.handlers.*;
import danger.orespawn.util.premium.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.common.*;
import danger.orespawn.world.gen.ores.*;
import danger.orespawn.world.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import danger.orespawn.tabs.*;

@Mod(modid = "orespawn", name = "OreSpawn", version = "1.0.0")
public class OreSpawnMain
{
    public static Random OreSpawnRand;
    public static int PlayNicely;
    @Mod.Instance
    public static OreSpawnMain instance;
    @SidedProxy(clientSide = "danger.orespawn.proxy.ClientProxy", serverSide = "danger.orespawn.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final CreativeTabs OreSpawnTab;
    
    @Mod.EventHandler
    public static void PreInit(final FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
        OreSpawnMain.proxy.preInit(event);
        PremiumChecker.Init();
        GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenOres(), 3);
    }
    
    @Mod.EventHandler
    public static void init(final FMLInitializationEvent event) {
        RegistryHandler.initRegistries();
        OreSpawnMain.proxy.init(event);
        MinecraftForge.TERRAIN_GEN_BUS.register((Object)new CornPlantGenerator());
        MinecraftForge.TERRAIN_GEN_BUS.register((Object)new PlantGenerator());
        MinecraftForge.TERRAIN_GEN_BUS.register((Object)new AntHillGenerator());
        MinecraftForge.TERRAIN_GEN_BUS.register((Object)new LiquidGenerator());
    }
    
    @Mod.EventHandler
    public static void PostInit(final FMLPostInitializationEvent event) {
        OreSpawnMain.proxy.postInit(event);
    }
    
    @Mod.EventHandler
    public static void serverInit(final FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }
    
    @SubscribeEvent
    public static void playerJoin(final PlayerEvent.PlayerLoggedInEvent event) {
        System.out.println("---------------------------------------------------------------------- PLAYER JOINED");
        PremiumChecker.CheckUser(event.player);
    }
    
    static {
        OreSpawnMain.OreSpawnRand = new Random(151L);
        OreSpawnMain.PlayNicely = 0;
        OreSpawnTab = new OrespawnTab();
    }
}
