package danger.orespawn;

import java.util.*;
import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;
import com.google.common.collect.*;

public class CrystalShovel extends ItemTool
{
    public static final Set blocksEffectiveAgainst;
    
    public CrystalShovel(final Item.ToolMaterial par2) {
        super(1.0f, par2, CrystalShovel.blocksEffectiveAgainst);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
    
    static {
        blocksEffectiveAgainst = Sets.newHashSet((Object[])new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow, Blocks.snow_layer, Blocks.clay, Blocks.farmland, Blocks.mycelium, OreSpawnMain.CrystalGrass });
    }
}
