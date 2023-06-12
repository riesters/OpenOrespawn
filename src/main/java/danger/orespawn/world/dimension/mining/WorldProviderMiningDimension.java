package danger.orespawn.world.dimension.mining;

import danger.orespawn.init.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.biome.*;
import danger.orespawn.util.*;
import net.minecraftforge.common.*;
import net.minecraft.world.*;
import net.minecraft.world.storage.*;

public class WorldProviderMiningDimension extends WorldProvider
{
    public WorldProviderMiningDimension() {
        this.biomeProvider = (BiomeProvider)new BiomeProviderSingle(ModBiomes.MINING_BIOME);
    }
    
    public DimensionType getDimensionType() {
        return ModDimensions.MINING;
    }
    
    public boolean canRespawnHere() {
        return true;
    }
    
    public IChunkGenerator createChunkGenerator() {
        return (IChunkGenerator)new ChunkGeneratorMiningDimension(this.world, this.getSeed(), (BiomeProvider)new BiomeProviderSingle(ModBiomes.MINING_BIOME));
    }
    
    public boolean isSurfaceWorld() {
        return true;
    }
    
    public void setWorldTime(final long time) {
        final WorldServer ws = DimensionManager.getWorld(Reference.DimensionMiningID);
        if (ws != null) {
            final WorldInfo wi = ws.getWorldInfo();
            if (wi != null && time % 24000L > 12000L && ws.areAllPlayersAsleep()) {
                long newTime = time + 24000L;
                newTime -= newTime % 24000L;
                for (int i = 0; i < ws.getMinecraftServer().worlds.length; ++i) {
                    ws.getMinecraftServer().worlds[i].setWorldTime(newTime);
                }
                return;
            }
        }
        super.setWorldTime(time);
    }
}
