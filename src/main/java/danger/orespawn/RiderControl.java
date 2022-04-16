package danger.orespawn;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class RiderControl {
  private final RiderControlMessage rcm = new RiderControlMessage();
  
  private final SimpleNetworkWrapper network;
  
  private int keystate = 0;
  
  public RiderControl(SimpleNetworkWrapper network) {
    this.network = network;
  }
  
  @SubscribeEvent
  public void onTick(TickEvent.ClientTickEvent evt) {
    int newkeystate = 0;
    if (KeyHandler.KEY_FLY_UP.getIsKeyPressed())
      newkeystate = 1; 
    if (this.keystate != newkeystate) {
      this.rcm.keystate = newkeystate;
      this.network.sendToServer(this.rcm);
      this.keystate = newkeystate;
    } 
  }
}
