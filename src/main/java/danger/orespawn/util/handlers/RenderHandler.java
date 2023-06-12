package danger.orespawn.util.handlers;

import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.client.registry.*;
import danger.orespawn.entity.*;
import danger.orespawn.entity.render.*;

@SideOnly(Side.CLIENT)
public class RenderHandler
{
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler((Class)Alosaurus.class, RenderAlosaurus::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)TRex.class, RenderTRex::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Baryonyx.class, RenderBaryonyx::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Camarasaurus.class, RenderCamarasaurus::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)RedAnt.class, RenderRedAnt::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Cryolophosaurus.class, RenderCryolophosaurus::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Pointysaurus.class, RenderPointysaurus::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)CaveFisher.class, RenderCaveFisher::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Butterfly.class, RenderButterfly::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Bird.class, RenderBird::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)GammaMetroid.class, RenderGammaMetroid::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Spyro.class, RenderSpyro::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Dragonfly.class, RenderDragonfly::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Firefly.class, RenderFirefly::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Mosquito.class, RenderMosquito::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Nastysaurus.class, RenderNastysaurus::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Alien.class, RenderAlien::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)VelocityRaptor.class, RenderVelocityRaptor::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)WormSmall.class, RenderWormSmall::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)WormMedium.class, RenderWormMedium::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)WormLarge.class, RenderWormLarge::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)WormDoom.class, RenderWormDoom::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Moth.class, RenderMoth::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Kyuubi.class, RenderKyuubi::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Mantis.class, RenderMantis::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Mothra.class, RenderMothra::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Brutalfly.class, RenderBrutalfly::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Beaver.class, RenderBeaver::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Termite.class, RenderTermite::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)Cassowary.class, RenderCassowary::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)RedCow.class, RenderEnchantedCow::new);
        RenderingRegistry.registerEntityRenderingHandler((Class)StinkBug.class, RenderStinkBug::new);
    }
}
