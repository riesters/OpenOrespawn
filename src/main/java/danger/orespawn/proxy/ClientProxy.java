package danger.orespawn.proxy;

import net.minecraft.item.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraftforge.client.model.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.common.*;
import danger.orespawn.events.*;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(final Item item, final int meta, final String id) {
        final ResourceLocation resourceLocation = item.getRegistryName();
        if (resourceLocation != null) {
            final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(resourceLocation, id);
            ModelLoader.setCustomModelResourceLocation(item, meta, modelResourceLocation);
        }
        else {
            System.out.println("Resource Location was null.");
        }
    }
    
    @Mod.EventHandler
    public static void PreInit(final FMLPreInitializationEvent event) {
        RenderHandler.registerEntityRenders();
    }
    
    @Override
    public void postInit(final FMLPostInitializationEvent event) {
        super.postInit(event);
        MinecraftForge.EVENT_BUS.register((Object)new ClientEvents());
    }
    
    @Override
    public void render() {
    }
}
