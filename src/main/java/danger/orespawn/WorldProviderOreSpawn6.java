package danger.orespawn;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderOreSpawn6 extends WorldProvider {
  private BiomeGenUtopianPlains MyPlains = (BiomeGenUtopianPlains)(new BiomeGenUtopianPlains(OreSpawnMain.BiomeChaosID)).setColor(353825).setBiomeName("Chaos").setTemperatureRainfall(0.7F, 0.5F);
  
  public String getDimensionName() {
    return "Dimension-Chaos";
  }
  
  public boolean canRespawnHere() {
    return true;
  }
  
  public void registerWorldChunkManager() {
    this.MyPlains.setChaosCreatures();
    this.worldChunkMgr = (WorldChunkManager)new WorldChunkManagerHell(this.MyPlains, 0.01F);
    this.worldChunkMgr.getBiomeGenAt(0, 0).setTemperatureRainfall(0.8F, 0.01F);
    this.dimensionId = OreSpawnMain.DimensionID4;
    this.dimensionId = OreSpawnMain.DimensionID6;
  }
  
  public void setWorldTime(long time) {
    WorldServer ws = DimensionManager.getWorld(this.dimensionId);
    if (ws != null) {
      WorldInfo w = ws.getWorldInfo();
      if (w != null) {
        if (time % 24000L > 12000L && ws.areAllPlayersAsleep()) {
          long i = time + 24000L;
          i -= i % 24000L;
          for (int j = 0; j < (MinecraftServer.getServer()).worldServers.length; j++)
            (MinecraftServer.getServer()).worldServers[j].setWorldTime(i); 
        } else {
          super.setWorldTime(time);
        } 
      } else {
        super.setWorldTime(time);
      } 
    } else {
      super.setWorldTime(time);
    } 
  }
  
  public IChunkProvider createChunkGenerator() {
    return new ChunkProviderOreSpawn6(this.worldObj, this.worldObj.getSeed());
  }
}
