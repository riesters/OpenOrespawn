package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class InstantGarden extends Item
{
    public InstantGarden() {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer Player, final World world, final int cposx, final int cposy, final int cposz, final int par7, final float par8, final float par9, final float par10) {
        int deltax = 0;
        int deltaz = 0;
        int dirx = 0;
        int dirz = 0;
        final int height = 10;
        final int width = 7;
        final int length = 18;
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
                for (int j = -width; j <= width; ++j) {
                    int i1 = cposx + k * deltax + j * deltaz;
                    int i2 = cposz + k * deltaz + j * deltax;
                    world.setBlock(i1, pposy + i, i2, Blocks.air, 0, 2);
                    if (i == 0) {
                        world.setBlock(i1, pposy + i - 1, i2, Blocks.grass, 0, 2);
                    }
                }
            }
        }
        for (int k = 1; k < length - 1; ++k) {
            int i = 0;
            for (int j = -width; j <= width; ++j) {
                int i1 = cposx + k * deltax + j * deltaz;
                int i2 = cposz + k * deltaz + j * deltax;
                if (i == 1) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, OreSpawnMain.MyRadishPlant, 0, 2);
                }
                if (i == 2) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, OreSpawnMain.MyLettucePlant1, 0, 2);
                }
                if (i == 3) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, Blocks.carrots, 0, 2);
                }
                if (i == 4) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.water, 0, 2);
                    world.setBlock(i1, pposy - 2, i2, Blocks.cobblestone, 0, 2);
                }
                if (i == 5) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, Blocks.potatoes, 0, 2);
                }
                if (i == 6) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, Blocks.wheat, 0, 2);
                }
                if (i == 7) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, OreSpawnMain.MyTomatoPlant1, 0, 2);
                }
                if (i == 8) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.water, 0, 2);
                    world.setBlock(i1, pposy - 2, i2, Blocks.cobblestone, 0, 2);
                }
                if (i == 9) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, OreSpawnMain.MyCornPlant1, 0, 2);
                }
                if (i == 10) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, OreSpawnMain.MyStrawberryPlant, 0, 2);
                }
                if (i == 11) {
                    world.setBlock(i1, pposy - 2, i2, Blocks.cobblestone, 0, 2);
                    world.setBlock(i1, pposy - 1, i2, Blocks.sand, 0, 2);
                    world.setBlock(i1, pposy, i2, Blocks.reeds, 0, 2);
                }
                if (i == 12) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.water, 0, 2);
                    world.setBlock(i1, pposy - 2, i2, Blocks.cobblestone, 0, 2);
                }
                if (i == 13) {
                    world.setBlock(i1, pposy - 1, i2, Blocks.farmland, 0, 2);
                    world.setBlock(i1, pposy, i2, Blocks.melon_stem, 0, 2);
                }
                ++i;
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
