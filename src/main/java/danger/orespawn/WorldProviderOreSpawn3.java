package danger.orespawn;

import net.minecraftforge.common.*;
import net.minecraft.server.*;
import net.minecraft.world.*;
import net.minecraft.world.storage.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.biome.*;

public class WorldProviderOreSpawn3 extends WorldProvider
{
    private final BiomeGenUtopianPlains MyPlains;
    
    public WorldProviderOreSpawn3() {
        this.MyPlains = (BiomeGenUtopianPlains)new BiomeGenUtopianPlains(OreSpawnMain.BiomeVillageID).setColor(353825).setBiomeName("Villages").setTemperatureRainfall(0.7f, 0.5f);
    }
    
    public String getDimensionName() {
        return "Dimension-VillageMania";
    }
    
    public boolean canRespawnHere() {
        return true;
    }
    
    public void registerWorldChunkManager() {
        this.MyPlains.setVillageCreatures();
        this.worldChunkMgr = new WorldChunkManagerHell(this.MyPlains, 0.5f);
        this.worldChunkMgr.getBiomeGenAt(0, 0).setTemperatureRainfall(0.7f, 0.5f);
        this.dimensionId = OreSpawnMain.DimensionID3;
        BiomeManager.addVillageBiome(this.MyPlains, true);
    }
    
    public void setWorldTime(final long time) {
        final WorldServer ws = DimensionManager.getWorld(this.dimensionId);
        if (ws != null) {
            final WorldInfo w = ws.getWorldInfo();
            if (w != null) {
                if (time % 24000L > 12000L && ws.areAllPlayersAsleep()) {
                    long i = time + 24000L;
                    i -= i % 24000L;
                    for (int j = 0; j < MinecraftServer.getServer().worldServers.length; ++j) {
                        MinecraftServer.getServer().worldServers[j].setWorldTime(i);
                    }
                }
                else {
                    super.setWorldTime(time);
                }
            }
            else {
                super.setWorldTime(time);
            }
        }
        else {
            super.setWorldTime(time);
        }
    }
    
    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderOreSpawn3(this.worldObj, this.worldObj.getSeed(), true);
    }
}
