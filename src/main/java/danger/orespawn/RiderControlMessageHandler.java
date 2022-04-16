package danger.orespawn;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import io.netty.channel.ChannelHandler.Sharable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Sharable
public class RiderControlMessageHandler implements IMessageHandler<RiderControlMessage, IMessage> {
  private static final Logger L = LogManager.getLogger();
  
  public IMessage onMessage(RiderControlMessage message, MessageContext ctx) {
    if (ctx.side == Side.CLIENT)
      return null; 
    OreSpawnMain.flyup_keystate = message.keystate;
    return null;
  }
}
