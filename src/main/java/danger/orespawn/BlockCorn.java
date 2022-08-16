package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockCorn extends BlockReed
{
    private int myMaxHeight;
    
    protected BlockCorn() {
        this.myMaxHeight = 0;
        final float var3 = 0.375f;
        this.setBlockBounds(0.5f - var3, 0.0f, 0.5f - var3, 0.5f + var3, 1.0f, 0.5f + var3);
        this.setTickRandomly(true);
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        final Block bid = par1World.getBlock(par2, par3 - 1, par4);
        return bid != Blocks.air && (bid == OreSpawnMain.MyCornPlant1 || bid == OreSpawnMain.MyCornPlant2 || bid == OreSpawnMain.MyCornPlant3 || bid == OreSpawnMain.MyCornPlant4 || bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland);
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        int Height = 1;
        int dontGrow = 0;
        if (par1World.isRemote) {
            return;
        }
        if (this != OreSpawnMain.MyCornPlant1 && this != OreSpawnMain.MyCornPlant2) {
            return;
        }
        int var7 = par1World.getBlockMetadata(par2, par3, par4);
        this.myMaxHeight = var7 >> 8;
        var7 &= 0xFF;
        if (this.myMaxHeight == 0) {
            this.myMaxHeight = 4 + OreSpawnMain.OreSpawnRand.nextInt(4);
        }
        Block bid = par1World.getBlock(par2, par3 + 1, par4);
        if (bid == Blocks.air) {
            for (int var8 = 1; var8 < 10; ++var8) {
                bid = par1World.getBlock(par2, par3 - var8, par4);
                if (bid != OreSpawnMain.MyCornPlant1 && bid != OreSpawnMain.MyCornPlant2 && bid != OreSpawnMain.MyCornPlant3 && bid != OreSpawnMain.MyCornPlant4) {
                    break;
                }
                ++Height;
                if (bid == OreSpawnMain.MyCornPlant3 || bid == OreSpawnMain.MyCornPlant4) {
                    dontGrow = 1;
                }
            }
            if (dontGrow != 0) {
                this.myMaxHeight = Height;
            }
            if (var7 >= 6 - this.myMaxHeight / 3) {
                if (Height < this.myMaxHeight) {
                    par1World.setBlock(par2, par3 + 1, par4, OreSpawnMain.MyCornPlant1, this.myMaxHeight << 8, 2);
                    par1World.setBlock(par2, par3, par4, OreSpawnMain.MyCornPlant2, this.myMaxHeight << 8, 2);
                }
                else {
                    for (int i = 1; i < this.myMaxHeight - 1; ++i) {
                        bid = par1World.getBlock(par2, par3 - i, par4);
                        if (bid == OreSpawnMain.MyCornPlant2) {
                            par1World.setBlock(par2, par3 - i, par4, OreSpawnMain.MyCornPlant3, this.myMaxHeight << 8, 2);
                        }
                        else if (bid == OreSpawnMain.MyCornPlant3) {
                            par1World.setBlock(par2, par3 - i, par4, OreSpawnMain.MyCornPlant4, this.myMaxHeight << 8, 2);
                        }
                    }
                    bid = par1World.getBlock(par2, par3, par4);
                    par1World.setBlock(par2, par3, par4, bid, this.myMaxHeight << 8, 2);
                }
            }
            else {
                bid = par1World.getBlock(par2, par3, par4);
                par1World.setBlock(par2, par3, par4, bid, this.myMaxHeight << 8 | var7 + 1, 2);
            }
        }
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return OreSpawnMain.MyCornCob;
    }
    
    public Item getItem() {
        return OreSpawnMain.MyCornCob;
    }
    
    public int quantityDropped(final Random par1Random) {
        if (this == OreSpawnMain.MyCornPlant4) {
            return 1 + par1Random.nextInt(2);
        }
        return 0;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
