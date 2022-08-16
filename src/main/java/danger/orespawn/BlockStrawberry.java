package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockStrawberry extends BlockCrops
{
    private IIcon[] iconArray;
    
    public BlockStrawberry() {
    }
    
    public IIcon getIcon(final int par1, int par2) {
        if (par2 < 7) {
            if (par2 >= 6) {
                par2 = 4;
            }
            return this.iconArray[par2 >> 1];
        }
        return this.iconArray[3];
    }
    
    public int quantityDropped(final Random par1Random) {
        return 1 + par1Random.nextInt(5);
    }
    
    protected Item func_149866_i() {
        return OreSpawnMain.MyStrawberrySeed;
    }
    
    protected Item func_149865_P() {
        return OreSpawnMain.MyStrawberry;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = par1IIconRegister.registerIcon("OreSpawn:strawberry_" + i);
        }
    }
}
