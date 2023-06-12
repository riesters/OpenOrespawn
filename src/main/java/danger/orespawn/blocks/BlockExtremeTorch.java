package danger.orespawn.blocks;

import danger.orespawn.*;
import net.minecraft.block.*;
import danger.orespawn.init.*;
import net.minecraft.block.state.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;

public class BlockExtremeTorch extends BlockTorch
{
    public BlockExtremeTorch() {
        this.setUnlocalizedName("extreme_torch");
        this.setRegistryName("extreme_torch");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModBlocks.BLOCKS.add((Block)this);
        this.setLightLevel(1.0f);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName((ResourceLocation)Objects.requireNonNull(this.getRegistryName())));
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final IBlockState stateIn, final World par1World, final BlockPos pos, final Random par5Random) {
        final int var6 = this.getMetaFromState(par1World.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ())));
        final double var7 = pos.getX() + 0.5f;
        final double var8 = pos.getY() + 0.7f;
        final double var9 = pos.getZ() + 0.5f;
        final double var10 = 0.213;
        final double var11 = 0.271;
        if (var6 == 1) {
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7 - var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.FLAME, var7 - var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.REDSTONE, var7 - var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
        }
        else if (var6 == 2) {
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7 + var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.FLAME, var7 + var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.REDSTONE, var7 + var11, var8 + var10, var9, 0.0, 0.0, 0.0, new int[0]);
        }
        else if (var6 == 3) {
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7, var8 + var10, var9 - var11, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.FLAME, var7, var8 + var10, var9 - var11, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.REDSTONE, var7, var8 + var10, var9 - var11, 0.0, 0.0, 0.0, new int[0]);
        }
        else if (var6 == 4) {
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7, var8 + var10, var9 + var11, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.FLAME, var7, var8 + var10, var9 + var11, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.REDSTONE, var7, var8 + var10, var9 + var11, 0.0, 0.0, 0.0, new int[0]);
        }
        else {
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7, var8, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.FLAME, var7, var8, var9, 0.0, 0.0, 0.0, new int[0]);
            par1World.spawnParticle(EnumParticleTypes.REDSTONE, var7, var8, var9, 0.0, 0.0, 0.0, new int[0]);
        }
        this.onBlockPlacedBy(par1World, pos.getX(), pos.getY(), pos.getZ(), null, null);
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        return super.canPlaceBlockAt(par1World, new BlockPos(par2, par3, par4));
    }
    
    public void onBlockPlacedBy(final World world, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLiving, final ItemStack par6ItemStack) {
        final int x = par2;
        final int y = par3;
        final int z = par4;
        final int found = 0;
        super.onBlockPlacedBy(world, new BlockPos(par2, par3, par4), Blocks.AIR.getDefaultState(), par5EntityLiving, par6ItemStack);
    }
    
    private static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        var8 = EntityList.createEntityByIDFromName(new ResourceLocation(par1), par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
}
