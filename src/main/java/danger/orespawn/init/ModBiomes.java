package danger.orespawn.init;

import net.minecraft.world.biome.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.registries.*;
import danger.orespawn.world.biome.*;

public class ModBiomes
{
    public static final Biome MINING_BIOME;
    
    public static void registerBiomes() {
        initBiome(ModBiomes.MINING_BIOME, "Mining Biome", BiomeManager.BiomeType.WARM, BiomeDictionary.Type.HILLS);
    }
    
    private static Biome initBiome(final Biome biome, final String name, final BiomeManager.BiomeType biomeType, final BiomeDictionary.Type... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Registered " + name + " biome");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
    
    static {
        MINING_BIOME = (Biome)new BiomeMiningDimension();
    }
}
