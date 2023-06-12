package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class OreBasicStone extends Block
{
    public OreBasicStone(final int par1, final float f1, final float f2) {
        super(Material.ROCK);
        this.setHardness(f1);
        this.setResistance(f2);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.setTickRandomly(false);
    }
    
    public static Entity spawnCreature(final World par0World, final int par1, final String name, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        if (name == null) {
            var8 = EntityList.createEntityByID(par1, par0World);
        }
        else {
            var8 = EntityList.createEntityByIDFromName(new ResourceLocation(name), par0World);
        }
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
}
