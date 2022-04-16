package danger.orespawn;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class KeyHandler {
  private final Minecraft mc;
  
  public static final String KEY_CATEGORY = "key.categories.orespawn";
  
  public static final KeyBinding KEY_FLY_UP = new KeyBinding("OreSpawn UP/FAST", 56, "key.categories.orespawn");
  
  public KeyHandler() {
    this.mc = Minecraft.getMinecraft();
    ClientRegistry.registerKeyBinding(KEY_FLY_UP);
  }
  
  @SubscribeEvent
  public void onKeyInput(InputEvent.KeyInputEvent event) {}
}
