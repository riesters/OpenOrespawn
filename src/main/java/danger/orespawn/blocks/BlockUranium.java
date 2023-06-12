package danger.orespawn.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;

public class BlockUranium extends Block
{
    static final int tickRate = 100;
    
    public BlockUranium() {
        super(Material.IRON);
        this.setUnlocalizedName("uranium_block");
        this.setRegistryName("uranium_block");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.setHardness(5.0f);
        this.setResistance(5.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(0.2f);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final IBlockState stateIn, final World worldIn, final BlockPos pos, final Random rand) {
        if (rand.nextInt(20) == 0) {
            this.sparkle(stateIn, worldIn, pos);
        }
    }
    
    private void sparkle(final IBlockState stateIn, final World worldIn, final BlockPos pos) {
        final int par2 = pos.getX();
        final int par3 = pos.getY();
        final int par4 = pos.getZ();
        final Random var5 = worldIn.rand;
        final double var6 = 0.0625;
        for (int var7 = 0; var7 < 6; ++var7) {
            double var8 = par2 + var5.nextFloat();
            double var9 = par3 + var5.nextFloat();
            double var10 = par4 + var5.nextFloat();
            if (var7 == 0 && !worldIn.getBlockState(new BlockPos(par2, par3 + 1, par4)).isOpaqueCube()) {
                var9 = par3 + 1 + var6;
            }
            if (var7 == 1 && !worldIn.getBlockState(new BlockPos(par2, par3 - 1, par4)).isOpaqueCube()) {
                var9 = par3 + 0 - var6;
            }
            if (var7 == 2 && !worldIn.getBlockState(new BlockPos(par2, par3, par4 - 1)).isOpaqueCube()) {
                var10 = par4 + 1 + var6;
            }
            if (var7 == 3 && !worldIn.getBlockState(new BlockPos(par2, par3, par4 - 1)).isOpaqueCube()) {
                var10 = par4 + 0 - var6;
            }
            if (var7 == 4 && !worldIn.getBlockState(new BlockPos(par2 + 1, par3, par4)).isOpaqueCube()) {
                var8 = par2 + 1 + var6;
            }
            if (var7 == 5 && !worldIn.getBlockState(new BlockPos(par2 - 1, par3, par4)).isOpaqueCube()) {
                var8 = par2 + 0 - var6;
            }
            if (var8 < par2 || var8 > par2 + 1 || var9 < 0.0 || var9 > par3 + 1 || var10 < par4 || var10 > par4 + 1) {
                final int which = var5.nextInt(3);
                if (which == 0) {
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, var8, var9, var10, 0.0, 0.0, 0.0, new int[0]);
                }
                if (which == 1) {
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var8, var9, var10, 0.0, 0.0, 0.0, new int[0]);
                }
                if (which == 2) {
                    worldIn.spawnParticle(EnumParticleTypes.REDSTONE, var8, var9, var10, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }
}
