package danger.orespawn.util.handlers;

import net.minecraftforge.event.*;
import net.minecraft.item.*;
import net.minecraftforge.registries.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.block.*;
import net.minecraftforge.client.event.*;
import danger.orespawn.*;
import java.util.*;
import net.minecraftforge.fml.relauncher.*;
import danger.orespawn.init.*;
import danger.orespawn.world.gen.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.*;
import danger.orespawn.recipes.*;
import danger.orespawn.blocks.*;
import net.minecraftforge.fml.common.event.*;
import danger.orespawn.commands.*;
import net.minecraft.command.*;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    
    @SubscribeEvent
    public static void onBlockRegister(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegister(final ModelRegistryEvent event) {
        RenderHandler.registerEntityRenders();
        for (final Item item : ModItems.ITEMS) {
            OreSpawnMain.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for (final Block block : ModBlocks.BLOCKS) {
            OreSpawnMain.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }
    
    public static void preInitRegistries() {
        ModEntities.registerEntities();
        ModDimensions.registerDimensions();
        ModBiomes.registerBiomes();
        EntitySpawns.addSpawns();
        GameRegistry.registerWorldGenerator((IWorldGenerator)new StructureGenerator(), 3);
    }
    
    public static void initRegistries() {
        SoundsHandler.registerSounds();
        SmeltingRecipes.init();
        CraftingRecipes.init();
        GameRegistry.registerTileEntity((Class)TileEntityPlant.class, TileEntityPlant.class.getName());
    }
    
    public static void serverRegistries(final FMLServerStartingEvent event) {
        event.registerServerCommand((ICommand)new CommandDimensionTeleport());
    }
}
