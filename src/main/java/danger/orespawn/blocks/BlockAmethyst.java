package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;

public class BlockAmethyst extends Block
{
    public BlockAmethyst() {
        super(Material.IRON);
        this.setUnlocalizedName("amethyst_block");
        this.setRegistryName("amethyst_block");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.setHardness(5.0f);
        this.setResistance(5.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(0.2f);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
}
