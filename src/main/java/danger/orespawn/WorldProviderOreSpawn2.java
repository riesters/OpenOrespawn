package danger.orespawn;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderOreSpawn2 extends WorldProvider {
  public String getDimensionName() {
    return "Dimension-Extreme";
  }
  
  public boolean canRespawnHere() {
    return true;
  }
  
  public void registerWorldChunkManager() {
    this.worldChunkMgr = (WorldChunkManager)new WorldChunkManagerHell(BiomeGenBase.extremeHills, 0.01F);
    this.worldChunkMgr.getBiomeGenAt(0, 0).setTemperatureRainfall(0.8F, 0.01F);
    this.dimensionId = OreSpawnMain.DimensionID2;
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
    return new ChunkProviderOreSpawn2(this.worldObj, this.worldObj.getSeed(), true);
  }
}
