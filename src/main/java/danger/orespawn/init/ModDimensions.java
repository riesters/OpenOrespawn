package danger.orespawn.init;

import net.minecraft.world.*;
import danger.orespawn.util.*;
import net.minecraftforge.common.*;
import danger.orespawn.world.dimension.mining.*;

public class ModDimensions
{
    public static final DimensionType MINING;
    
    public static void registerDimensions() {
        DimensionManager.registerDimension(Reference.DimensionMiningID, ModDimensions.MINING);
    }
    
    static {
        MINING = DimensionType.register("Mining Dimension", "_mining", Reference.DimensionMiningID, (Class)WorldProviderMiningDimension.class, false);
    }
}
