package danger.orespawn;

import net.minecraftforge.common.*;
import net.minecraft.server.*;
import net.minecraft.world.*;
import net.minecraft.world.storage.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.biome.*;

public class WorldProviderOreSpawn6 extends WorldProvider
{
    private final BiomeGenUtopianPlains MyPlains;
    
    public WorldProviderOreSpawn6() {
        this.MyPlains = (BiomeGenUtopianPlains)new BiomeGenUtopianPlains(OreSpawnMain.BiomeChaosID).setColor(353825).setBiomeName("Chaos").setTemperatureRainfall(0.7f, 0.5f);
    }
    
    public String getDimensionName() {
        return "Dimension-Chaos";
    }
    
    public boolean canRespawnHere() {
        return true;
    }
    
    public void registerWorldChunkManager() {
        this.MyPlains.setChaosCreatures();
        this.worldChunkMgr = new WorldChunkManagerHell(this.MyPlains, 0.01f);
        this.worldChunkMgr.getBiomeGenAt(0, 0).setTemperatureRainfall(0.8f, 0.01f);
        this.dimensionId = OreSpawnMain.DimensionID4;
        this.dimensionId = OreSpawnMain.DimensionID6;
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
        return new ChunkProviderOreSpawn6(this.worldObj, this.worldObj.getSeed());
    }
}
