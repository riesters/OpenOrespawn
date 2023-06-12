package danger.orespawn.events;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.common.gameevent.*;
import danger.orespawn.util.premium.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.color.*;
import net.minecraft.block.state.*;
import javax.annotation.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

@Mod.EventBusSubscriber(modid = "orespawn", value = { Side.CLIENT })
public class ClientEvents
{
    @SubscribeEvent
    public void onPlayerLogin(final PlayerEvent.PlayerLoggedInEvent event) {
        final boolean premium = PremiumChecker.CheckUser(event.player);
        if (premium) {
            final TextComponentBase message = (TextComponentBase)new TextComponentString("Welcome premium user!");
            message.getStyle().setColor(TextFormatting.GOLD);
            event.player.sendMessage((ITextComponent)message);
        }
    }
    
    @SubscribeEvent
    public static void registerBlockColors(final ColorHandlerEvent.Block event) {
        event.getBlockColors().registerBlockColorHandler((IBlockColor)new IBlockColor() {
            public int colorMultiplier(final IBlockState state, @Nullable final IBlockAccess worldIn, @Nullable final BlockPos pos, final int tintIndex) {
                double temperature = worldIn.getBiome(pos).getTemperature(pos);
                double humidity = worldIn.getBiome(pos).getRainfall();
                if (temperature < 0.0) {
                    temperature = 0.0;
                }
                else if (temperature > 1.0) {
                    temperature = 1.0;
                }
                if (humidity < 0.0) {
                    humidity = 0.0;
                }
                else if (humidity > 1.0) {
                    humidity = 1.0;
                }
                return ColorizerGrass.getGrassColor(temperature, humidity);
            }
        }, new Block[] { ModBlocks.ANT_BLOCK });
    }
    
    @SubscribeEvent
    public static void registerItemColors(final ColorHandlerEvent.Item event) {
        event.getItemColors().registerItemColorHandler((stack, tintIndex) -> ColorizerGrass.getGrassColor(0.5, 0.5), new Block[] { ModBlocks.ANT_BLOCK });
    }
}
