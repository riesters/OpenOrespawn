package danger.orespawn.world.biome;

import net.minecraft.world.biome.*;
import danger.orespawn.entity.*;

public class BiomeMiningDimension extends BiomeHills
{
    public BiomeMiningDimension() {
        super(BiomeHills.Type.NORMAL, new Biome.BiomeProperties("Mining Biome").setBaseHeight(1.0f).setHeightVariation(0.5f).setTemperature(0.2f).setRainfall(0.3f));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry((Class)Alosaurus.class, 100, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry((Class)TRex.class, 100, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry((Class)Pointysaurus.class, 100, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry((Class)Cryolophosaurus.class, 100, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry((Class)Alien.class, 100, 1, 1));
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Baryonyx.class, 200, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Camarasaurus.class, 250, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Bird.class, 255, 1, 2));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Butterfly.class, 100, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Spyro.class, 250, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)GammaMetroid.class, 200, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)Nastysaurus.class, 200, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry((Class)VelocityRaptor.class, 200, 1, 1));
    }
}
