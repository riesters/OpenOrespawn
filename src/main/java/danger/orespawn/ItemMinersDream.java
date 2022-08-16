package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemMinersDream extends Item
{
    public ItemMinersDream() {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer Player, final World world, final int cposx, final int cposy, final int cposz, final int par7, final float par8, final float par9, final float par10) {
        int deltax = 0;
        int deltaz = 0;
        int dirx = 0;
        int dirz = 0;
        final int height = 5;
        final int width = 5;
        final int length = 64;
        final int torches = 5;
        int solid_count;
        if (cposx < 0) {
            dirx = -1;
        }
        if (cposz < 0) {
            dirz = -1;
        }
        final int pposx = (int)(Player.posX + 0.99 * dirx);
        final int pposy = (int)Player.posY;
        final int pposz = (int)(Player.posZ + 0.99 * dirz);
        if (cposx - pposx != 0 && cposz - pposz != 0) {
            return false;
        }
        if (cposx - pposx < 0) {
            deltax = -1;
        }
        if (cposx - pposx > 0) {
            deltax = 1;
        }
        if (cposz - pposz < 0) {
            deltaz = -1;
        }
        if (cposz - pposz > 0) {
            deltaz = 1;
        }
        if (deltax == 0 && deltaz == 0) {
            return false;
        }
        Player.worldObj.playSoundAtEntity(Player, "random.explode", 1.0f, 1.5f);
        if (world.isRemote) {
            return true;
        }
        for (int i = 0; i < height; ++i) {
            for (int k = 0; k < length; ++k) {
                solid_count = 0;
                for (int j = -width; j <= width; ++j) {
                    int i1 = cposx + k * deltax + j * deltaz;
                    int i2 = cposz + k * deltaz + j * deltax;
                    Block bid = world.getBlock(i1, pposy + i, i2);
                    if (bid == Blocks.stone || bid == Blocks.dirt || bid == Blocks.gravel || bid == Blocks.flowing_water || bid == Blocks.water || bid == Blocks.flowing_lava || bid == Blocks.lava || bid == Blocks.netherrack || bid == Blocks.end_stone || bid == OreSpawnMain.CrystalStone) {
                        world.setBlock(i1, pposy + i, i2, Blocks.air, 0, 2);
                    }
                    if (i == height - 1) {
                        bid = world.getBlock(i1, pposy + i + 1, i2);
                        if (bid != Blocks.air) {
                            ++solid_count;
                        }
                        if (bid == Blocks.air || bid == Blocks.gravel || bid == Blocks.sand || bid == Blocks.flowing_water || bid == Blocks.water || bid == Blocks.flowing_lava || bid == Blocks.lava) {
                            if (world.provider.dimensionId == OreSpawnMain.DimensionID5) {
                                world.setBlock(i1, pposy + i + 1, i2, OreSpawnMain.CrystalStone, 0, 2);
                            }
                            else {
                                world.setBlock(i1, pposy + i + 1, i2, Blocks.cobblestone, 0, 2);
                            }
                        }
                    }
                }
                if (i == height - 1 && solid_count == 0) {
                    for (int j = -width; j <= width; ++j) {
                        world.setBlock(cposx + k * deltax + j * deltaz, pposy + i + 1, cposz + k * deltaz + j * deltax, Blocks.air, 0, 2);
                    }
                }
            }
        }
        for (int k = 0; k < length; k += torches) {
            final Block bid = world.getBlock(cposx + k * deltax, pposy - 1, cposz + k * deltaz);
            if ((bid == Blocks.stone || bid == Blocks.dirt || bid == Blocks.gravel || bid == Blocks.netherrack || bid == Blocks.end_stone || bid == Blocks.bedrock) && world.isAirBlock(cposx + k * deltax, pposy, cposz + k * deltaz)) {
                world.setBlock(cposx + k * deltax, pposy, cposz + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);
            }
            if (bid == OreSpawnMain.CrystalStone && world.isAirBlock(cposx + k * deltax, pposy, cposz + k * deltaz)) {
                world.setBlock(cposx + k * deltax, pposy, cposz + k * deltaz, OreSpawnMain.CrystalTorch, 0, 2);
            }
        }
        if (!Player.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
