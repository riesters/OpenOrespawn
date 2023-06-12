package danger.orespawn.blocks;

import net.minecraft.block.material.*;
import net.minecraft.block.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

public class OreGenericEgg extends Block
{
    public OreGenericEgg(final String name) {
        super(Material.GROUND);
        this.setHardness(0.5f);
        this.setResistance(1.0f);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setSoundType(SoundType.GROUND);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    public void dropBlockAsItemWithChance(final World worldIn, final BlockPos pos, final IBlockState state, final float chance, final int fortune) {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
        final int dropAmount = 5 + worldIn.rand.nextInt(3) + worldIn.rand.nextInt(3);
        if (worldIn.rand.nextInt(2) == 1) {
            this.dropXpOnBlockBreak(worldIn, pos, dropAmount);
        }
    }
}
