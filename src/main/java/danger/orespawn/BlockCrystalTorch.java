package danger.orespawn;

import net.minecraft.creativetab.*;
import java.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.texture.*;

public class BlockCrystalTorch extends BlockTorch
{
    public BlockCrystalTorch() {
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        if (par1World.rand.nextInt(4) != 1) {
            return;
        }
        final int var6 = par1World.getBlockMetadata(par2, par3, par4);
        final double var7 = par2 + 0.5f;
        final double var8 = par3 + 0.7f;
        final double var9 = par4 + 0.5f;
        final double var10 = 0.213;
        final double var11 = 0.271;
        if (var6 == 1) {
            par1World.spawnParticle("fireworksSpark", var7 - var11, var8 + var10, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f, par1World.rand.nextFloat() / 8.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f);
            par1World.spawnParticle("flame", var7 - var11, var8 + var10, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f, par1World.rand.nextFloat() / 10.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f);
        }
        else if (var6 == 2) {
            par1World.spawnParticle("fireworksSpark", var7 + var11, var8 + var10, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f, par1World.rand.nextFloat() / 8.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f);
            par1World.spawnParticle("flame", var7 + var11, var8 + var10, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f, par1World.rand.nextFloat() / 10.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f);
        }
        else if (var6 == 3) {
            par1World.spawnParticle("fireworksSpark", var7, var8 + var10, var9 - var11, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f, par1World.rand.nextFloat() / 8.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f);
            par1World.spawnParticle("flame", var7, var8 + var10, var9 - var11, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f, par1World.rand.nextFloat() / 10.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f);
        }
        else if (var6 == 4) {
            par1World.spawnParticle("fireworksSpark", var7, var8 + var10, var9 + var11, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f, par1World.rand.nextFloat() / 8.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f);
            par1World.spawnParticle("flame", var7, var8 + var10, var9 + var11, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f, par1World.rand.nextFloat() / 10.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f);
        }
        else {
            par1World.spawnParticle("fireworksSpark", var7, var8, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f, par1World.rand.nextFloat() / 8.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 8.0f);
            par1World.spawnParticle("flame", var7, var8, var9, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f, par1World.rand.nextFloat() / 10.0f, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 60.0f);
        }
    }
    
    private boolean isCrystalBlock(final World par1World, final int par2, final int par3, final int par4) {
        final Block l = par1World.getBlock(par2, par3, par4);
        return l == OreSpawnMain.CrystalStone || l == OreSpawnMain.CrystalGrass || l == OreSpawnMain.MyCrystalTreeLog || l == OreSpawnMain.CrystalPlanksBlock;
    }
    
    private boolean isItSolidOnSide(final World par1World, final int par2, final int par3, final int par4, final ForgeDirection dir) {
        return this.isCrystalBlock(par1World, par2, par3, par4) || par1World.isSideSolid(par2, par3, par4, dir, true);
    }
    
    private boolean canPlaceTorchOn(final World par1World, final int par2, final int par3, final int par4) {
        final Block l = par1World.getBlock(par2, par3, par4);
        return this.isCrystalBlock(par1World, par2, par3, par4) || World.doesBlockHaveSolidTopSurface(par1World, par2, par3, par4) || (l != null && l.canPlaceTorchOnTop(par1World, par2, par3, par4));
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        return this.isItSolidOnSide(par1World, par2 - 1, par3, par4, ForgeDirection.EAST) || this.isItSolidOnSide(par1World, par2 + 1, par3, par4, ForgeDirection.WEST) || this.isItSolidOnSide(par1World, par2, par3, par4 - 1, ForgeDirection.SOUTH) || this.isItSolidOnSide(par1World, par2, par3, par4 + 1, ForgeDirection.NORTH) || this.canPlaceTorchOn(par1World, par2, par3 - 1, par4);
    }
    
    public int onBlockPlaced(final World par1World, final int par2, final int par3, final int par4, final int par5, final float par6, final float par7, final float par8, final int par9) {
        int j1 = par9;
        if (par5 == 1 && this.canPlaceTorchOn(par1World, par2, par3 - 1, par4)) {
            j1 = 5;
        }
        if (par5 == 2 && (par1World.isSideSolid(par2, par3, par4 + 1, ForgeDirection.NORTH, true) || this.isCrystalBlock(par1World, par2, par3, par4 + 1))) {
            j1 = 4;
        }
        if (par5 == 3 && (par1World.isSideSolid(par2, par3, par4 - 1, ForgeDirection.SOUTH, true) || this.isCrystalBlock(par1World, par2, par3, par4 - 1))) {
            j1 = 3;
        }
        if (par5 == 4 && (par1World.isSideSolid(par2 + 1, par3, par4, ForgeDirection.WEST, true) || this.isCrystalBlock(par1World, par2 + 1, par3, par4))) {
            j1 = 2;
        }
        if (par5 == 5 && (par1World.isSideSolid(par2 - 1, par3, par4, ForgeDirection.EAST, true) || this.isCrystalBlock(par1World, par2 - 1, par3, par4))) {
            j1 = 1;
        }
        return j1;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
