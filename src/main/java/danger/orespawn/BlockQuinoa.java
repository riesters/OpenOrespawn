package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockQuinoa extends BlockReed
{
    private int myMaxHeight;
    
    protected BlockQuinoa() {
        this.myMaxHeight = 0;
        final float var3 = 0.375f;
        this.setBlockBounds(0.5f - var3, 0.0f, 0.5f - var3, 0.5f + var3, 1.0f, 0.5f + var3);
        this.setTickRandomly(true);
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        final Block bid = par1World.getBlock(par2, par3 - 1, par4);
        return bid != Blocks.air && (bid == OreSpawnMain.MyQuinoaPlant1 || bid == OreSpawnMain.MyQuinoaPlant2 || bid == OreSpawnMain.MyQuinoaPlant3 || bid == OreSpawnMain.MyQuinoaPlant4 || bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland || bid == OreSpawnMain.CrystalGrass);
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        int Height = 1;
        int dontGrow = 0;
        if (par1World.isRemote) {
            return;
        }
        if (this != OreSpawnMain.MyQuinoaPlant1 && this != OreSpawnMain.MyQuinoaPlant3) {
            return;
        }
        int var7 = par1World.getBlockMetadata(par2, par3, par4);
        this.myMaxHeight = var7 >> 8;
        var7 &= 0xFF;
        if (this.myMaxHeight == 0) {
            this.myMaxHeight = 2 + OreSpawnMain.OreSpawnRand.nextInt(3);
        }
        Block bid = par1World.getBlock(par2, par3 + 1, par4);
        if (bid == Blocks.air) {
            for (int var8 = 1; var8 < 10; ++var8) {
                bid = par1World.getBlock(par2, par3 - var8, par4);
                if (bid != OreSpawnMain.MyQuinoaPlant1 && bid != OreSpawnMain.MyQuinoaPlant2 && bid != OreSpawnMain.MyQuinoaPlant3 && bid != OreSpawnMain.MyQuinoaPlant4) {
                    break;
                }
                ++Height;
                if (bid == OreSpawnMain.MyQuinoaPlant3 || bid == OreSpawnMain.MyQuinoaPlant4) {
                    dontGrow = 1;
                }
            }
            if (dontGrow != 0) {
                this.myMaxHeight = Height;
            }
            if (var7 >= 5 - this.myMaxHeight / 3) {
                if (Height < this.myMaxHeight) {
                    par1World.setBlock(par2, par3 + 1, par4, OreSpawnMain.MyQuinoaPlant1, this.myMaxHeight << 8, 2);
                    par1World.setBlock(par2, par3, par4, OreSpawnMain.MyQuinoaPlant2, this.myMaxHeight << 8, 2);
                }
                else {
                    bid = par1World.getBlock(par2, par3, par4);
                    if (bid == OreSpawnMain.MyQuinoaPlant1) {
                        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyQuinoaPlant3, this.myMaxHeight << 8, 2);
                    }
                    else if (bid == OreSpawnMain.MyQuinoaPlant3) {
                        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyQuinoaPlant4, this.myMaxHeight << 8, 2);
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
        return OreSpawnMain.MyQuinoa;
    }
    
    public int quantityDropped(final Random par1Random) {
        if (this == OreSpawnMain.MyQuinoaPlant4) {
            return 3 + par1Random.nextInt(3);
        }
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
