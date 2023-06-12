package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;
import java.util.*;

public class OreAmethyst extends Block
{
    public OreAmethyst() {
        super(Material.ROCK);
        this.setUnlocalizedName("amethyst_ore");
        this.setRegistryName("amethyst_ore");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.setHardness(5.0f);
        this.setResistance(5.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(0.2f);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
        return ModItems.AMETHYST;
    }
    
    public int quantityDropped(final Random random) {
        return random.nextInt(2) + 1;
    }
}
