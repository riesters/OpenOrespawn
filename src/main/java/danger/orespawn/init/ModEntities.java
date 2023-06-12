package danger.orespawn.init;

import net.minecraft.entity.*;
import net.minecraft.util.*;
import danger.orespawn.*;
import net.minecraftforge.fml.common.registry.*;
import danger.orespawn.entity.*;

public class ModEntities
{
    public static void registerEntities() {
        myRegisterEntity("alosaurus", (Class<? extends Entity>)Alosaurus.class, 120);
        myRegisterEntity("trex", (Class<? extends Entity>)TRex.class, 121);
        myRegisterEntity("baryonyx", (Class<? extends Entity>)Baryonyx.class, 122);
        myRegisterEntity("camarasaurus", (Class<? extends Entity>)Camarasaurus.class, 123);
        myRegisterEntity("pointysaurus", (Class<? extends Entity>)Pointysaurus.class, 124);
        myRegisterEntity("cryolophosaurus", (Class<? extends Entity>)Cryolophosaurus.class, 126);
        myRegisterEntity("cavefisher", (Class<? extends Entity>)CaveFisher.class, 128);
        myRegisterEntity("red_ant", (Class<? extends Entity>)RedAnt.class, 125);
        myRegisterEntity("bird", (Class<? extends Entity>)Bird.class, 130);
        myRegisterEntity("butterfly", (Class<? extends Entity>)Butterfly.class, 129);
        myRegisterEntity("gammametroid", (Class<? extends Entity>)GammaMetroid.class, 131);
        myRegisterEntity("spyro", (Class<? extends Entity>)Spyro.class, 132);
        myRegisterEntity("dragonfly", (Class<? extends Entity>)Dragonfly.class, 133);
        myRegisterEntity("firefly", (Class<? extends Entity>)Firefly.class, 134);
        myRegisterEntity("mosquito", (Class<? extends Entity>)Mosquito.class, 135);
        myRegisterEntity("nastysaurus", (Class<? extends Entity>)Nastysaurus.class, 136);
        myRegisterEntity("alien", (Class<? extends Entity>)Alien.class, 137);
        myRegisterEntity("velocityraptor", (Class<? extends Entity>)VelocityRaptor.class, 138);
        myRegisterEntity("thrown_critter_cage", (Class<? extends Entity>)EntityCage.class, 150);
        myRegisterEntity("small_worm", (Class<? extends Entity>)WormSmall.class, 139);
        myRegisterEntity("medium_worm", (Class<? extends Entity>)WormMedium.class, 140);
        myRegisterEntity("large_worm", (Class<? extends Entity>)WormLarge.class, 141);
        EntityRegistry.registerModEntity(new ResourceLocation("orespawn:doom_worm"), (Class)WormDoom.class, "doom_worm", 142, (Object)OreSpawnMain.instance, 325, 1, true);
        myRegisterEntity("moth", (Class<? extends Entity>)Moth.class, 143);
        myRegisterEntity("kyuubi", (Class<? extends Entity>)Kyuubi.class, 144);
        myRegisterEntity("mantis", (Class<? extends Entity>)Mantis.class, 145);
        myRegisterEntity("mothra", (Class<? extends Entity>)Mothra.class, 146);
        myRegisterEntity("brutalfly", (Class<? extends Entity>)Brutalfly.class, 147);
        myRegisterEntity("beaver", (Class<? extends Entity>)Beaver.class, 148);
        myRegisterEntity("cassowary", (Class<? extends Entity>)Cassowary.class, 151);
        myRegisterEntity("termite", (Class<? extends Entity>)Termite.class, 149);
        myRegisterEntity("redcow", (Class<? extends Entity>)RedCow.class, 152);
        myRegisterEntity("stinkbug", (Class<? extends Entity>)StinkBug.class, 153);
    }
    
    public static void myRegisterEntity(final String name, final Class<? extends Entity> entity, final int entity2, final int range) {
        EntityRegistry.registerModEntity(new ResourceLocation("orespawn:" + name), (Class)entity, name, entity2, (Object)OreSpawnMain.instance, range, 1, true);
    }
    
    private static void myRegisterEntity(final String name, final Class<? extends Entity> cls, final int id) {
        EntityRegistry.registerModEntity(new ResourceLocation("orespawn:" + name), (Class)cls, name, id, (Object)OreSpawnMain.instance, 50, 1, true);
    }
}
