package danger.orespawn.init;

import net.minecraft.entity.*;
import net.minecraft.world.biome.*;
import net.minecraft.init.*;
import danger.orespawn.entity.*;
import net.minecraftforge.fml.common.registry.*;
import java.util.*;

public class EntitySpawns
{
    public static void addSpawns() {
        final Biome[] biomes = excludeEndNether();
        EntityRegistry.addSpawn((Class)Bird.class, 30, 1, 3, EnumCreatureType.CREATURE, biomes);
        EntityRegistry.addSpawn((Class)Butterfly.class, 15, 1, 1, EnumCreatureType.CREATURE, biomes);
        EntityRegistry.addSpawn((Class)Firefly.class, 15, 1, 1, EnumCreatureType.CREATURE, biomes);
        EntityRegistry.addSpawn((Class)CaveFisher.class, 15, 1, 1, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn((Class)Dragonfly.class, 15, 1, 1, EnumCreatureType.CREATURE, swampsAndLakes());
        EntityRegistry.addSpawn((Class)Mosquito.class, 15, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.SWAMPLAND });
        EntityRegistry.addSpawn((Class)Mantis.class, 10, 1, 1, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn((Class)Brutalfly.class, 10, 1, 1, EnumCreatureType.MONSTER, forestsAndJungles());
        EntityRegistry.addSpawn((Class)Kyuubi.class, 15, 1, 1, EnumCreatureType.MONSTER, nether());
        EntityRegistry.addSpawn((Class)Mothra.class, 15, 1, 1, EnumCreatureType.MONSTER, extremeHills());
        EntityRegistry.addSpawn((Class)Beaver.class, 15, 1, 1, EnumCreatureType.CREATURE, forestsAndJungles());
        EntityRegistry.addSpawn((Class)Cassowary.class, 15, 1, 1, EnumCreatureType.CREATURE, extremeHills());
        EntityRegistry.addSpawn((Class)RedCow.class, 15, 1, 1, EnumCreatureType.CREATURE, biomes);
        EntityRegistry.addSpawn((Class)StinkBug.class, 15, 1, 1, EnumCreatureType.CREATURE, forestsAndJungles());
    }
    
    private static Biome[] excludeEndNether() {
        final LinkedList<Biome> list = new LinkedList<Biome>();
        final Collection<Biome> biomes = (Collection<Biome>)ForgeRegistries.BIOMES.getValuesCollection();
        for (final Biome biome : biomes) {
            if (!biome.getRegistryName().toString().toLowerCase().contains("end") && !biome.getRegistryName().toString().toLowerCase().contains("hell") && !biome.getRegistryName().toString().toLowerCase().contains("void")) {
                list.add(biome);
            }
        }
        return list.toArray(new Biome[0]);
    }
    
    private static Biome[] swampsAndLakes() {
        final LinkedList<Biome> list = new LinkedList<Biome>();
        final Collection<Biome> biomes = (Collection<Biome>)ForgeRegistries.BIOMES.getValuesCollection();
        for (final Biome biome : biomes) {
            if (biome.getRegistryName().toString().toLowerCase().contains("swamp") || biome.getRegistryName().toString().toLowerCase().contains("lake")) {
                list.add(biome);
            }
        }
        return list.toArray(new Biome[0]);
    }
    
    private static Biome[] forestsAndJungles() {
        final LinkedList<Biome> list = new LinkedList<Biome>();
        final Collection<Biome> biomes = (Collection<Biome>)ForgeRegistries.BIOMES.getValuesCollection();
        for (final Biome biome : biomes) {
            if (biome.getRegistryName().toString().toLowerCase().contains("forest") || biome.getRegistryName().toString().toLowerCase().contains("jungle")) {
                list.add(biome);
            }
        }
        return list.toArray(new Biome[0]);
    }
    
    private static Biome[] nether() {
        final LinkedList<Biome> list = new LinkedList<Biome>();
        final Collection<Biome> biomes = (Collection<Biome>)ForgeRegistries.BIOMES.getValuesCollection();
        for (final Biome biome : biomes) {
            if (biome.getRegistryName().toString().toLowerCase().contains("hell")) {
                list.add(biome);
            }
        }
        return list.toArray(new Biome[0]);
    }
    
    private static Biome[] extremeHills() {
        final LinkedList<Biome> list = new LinkedList<Biome>();
        final Collection<Biome> biomes = (Collection<Biome>)ForgeRegistries.BIOMES.getValuesCollection();
        for (final Biome biome : biomes) {
            if (biome.getRegistryName().toString().toLowerCase().contains("extreme")) {
                list.add(biome);
            }
        }
        return list.toArray(new Biome[0]);
    }
}
