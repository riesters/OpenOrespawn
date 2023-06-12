package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import danger.orespawn.entity.*;
import net.minecraft.entity.*;

public class BlockTermiteTroll extends Block
{
    public BlockTermiteTroll() {
        super(Material.ROCK);
        this.setUnlocalizedName("termite_troll_block");
        this.setRegistryName("termite_troll_block");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    public void breakBlock(final World worldIn, final BlockPos pos, final IBlockState state) {
        super.breakBlock(worldIn, pos, state);
        for (int i = 0; i < 20; ++i) {
            final Entity termite = EntityList.newEntity((Class)RedAnt.class, worldIn);
            assert termite != null;
            termite.setPositionAndRotation((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), worldIn.rand.nextFloat() * 360.0f, 0.0f);
            worldIn.spawnEntity(termite);
            ((EntityLiving)termite).playLivingSound();
        }
    }
}
