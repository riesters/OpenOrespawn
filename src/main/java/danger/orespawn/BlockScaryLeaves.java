package danger.orespawn;

import net.minecraft.util.*;
import net.minecraft.creativetab.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.*;

public class BlockScaryLeaves extends BlockLeaves
{
    private IIcon scary_solid;
    private IIcon generic_solid;
    
    protected BlockScaryLeaves() {
        this.scary_solid = null;
        this.generic_solid = null;
    }
    
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        par3List.add(new ItemStack(Item.getItemFromBlock(this), 1, 0));
    }
    
    public void dropBlockAsItemWithChance(final World par1World, final int par2, final int par3, final int par4, final int par5, final float par6, final int par7) {
        if (!par1World.isRemote && par1World.rand.nextInt(25) == 1) {
            if (this == OreSpawnMain.MyCherryLeaves) {
                this.dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(OreSpawnMain.MyCherry));
            }
            if (this == OreSpawnMain.MyPeachLeaves) {
                this.dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(OreSpawnMain.MyPeach));
            }
        }
    }
    
    public int quantityDropped(final Random par1Random) {
        if (this == OreSpawnMain.MyCherryLeaves) {
            return par1Random.nextInt(4);
        }
        return 0;
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        final int var7 = 2;
        int totaldist;
        if (!par1World.isRemote && par1World.checkChunksExist(par2 - var7, par3 - var7, par4 - var7, par2 + var7, par3 + var7, par4 + var7)) {
            for (int var8 = -var7; var8 <= var7; ++var8) {
                for (int var9 = -var7; var9 <= 0; ++var9) {
                    for (int var10 = -var7; var10 <= var7; ++var10) {
                        totaldist = Math.abs(var8) + Math.abs(var9) + Math.abs(var10);
                        if (totaldist <= 3) {
                            Block bid = par1World.getBlock(par2 + var8, par3 + var9, par4 + var10);
                            if (bid != null && bid.canSustainLeaves(par1World, par2 + var8, par3 + var9, par4 + var10)) {
                                long t = par1World.getWorldTime();
                                t %= 24000L;
                                if (this == OreSpawnMain.MyScaryLeaves && t < 12000L) {
                                    OreSpawnMain.setBlockFast(par1World, par2, par3, par4, OreSpawnMain.MyAppleLeaves, 0, 3);
                                }
                                bid = par1World.getBlock(par2, par3 - 1, par4);
                                if (bid == Blocks.air && par1World.rand.nextInt(20) == 3) {
                                    this.dropBlockAsItemWithChance(par1World, par2, par3 - 1, par4, 0, 0.0f, 0);
                                }
                                return;
                            }
                        }
                    }
                }
            }
            this.removeLeaves(par1World, par2, par3, par4);
        }
    }
    
    public void randomDisplayTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
    }
    
    private void removeLeaves(final World par1World, final int par2, final int par3, final int par4) {
        this.dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
        par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    }
    
    public boolean isOpaqueCube() {
        return OreSpawnMain.FastGraphicsLeaves != 0;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4, final int par5) {
        final Block i1 = par1IBlockAccess.getBlock(par2, par3, par4);
        return OreSpawnMain.FastGraphicsLeaves == 0 || i1 != this;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
        this.generic_solid = iconRegister.registerIcon("OreSpawn:generic_solid");
        this.scary_solid = iconRegister.registerIcon("OreSpawn:scary_solid");
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int par1, final int par2) {
        if (OreSpawnMain.FastGraphicsLeaves == 0) {
            return this.blockIcon;
        }
        if (this == OreSpawnMain.MyCherryLeaves) {
            return this.generic_solid;
        }
        if (this == OreSpawnMain.MyPeachLeaves) {
            return this.generic_solid;
        }
        return this.scary_solid;
    }
    
    public String[] func_150125_e() {
        return null;
    }
}
