package danger.orespawn;

import net.minecraft.client.settings.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.gameevent.*;
import cpw.mods.fml.common.eventhandler.*;

public class KeyHandler
{
    public static final KeyBinding KEY_FLY_UP;
    
    public KeyHandler() {
        ClientRegistry.registerKeyBinding(KeyHandler.KEY_FLY_UP);
    }
    
    @SubscribeEvent
    public void onKeyInput(final InputEvent.KeyInputEvent event) {
    }
    
    static {
        KEY_FLY_UP = new KeyBinding("OreSpawn UP/FAST", 56, "key.categories.orespawn");
    }
}
