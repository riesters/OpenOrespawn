package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.tileentity.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class InstantShelter extends Item
{
    public InstantShelter() {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer Player, final World world, final int cposx, final int cposy, final int cposz, final int par7, final float par8, final float par9, final float par10) {
        int deltax = 0;
        int deltaz = 0;
        int dirx = 0;
        int dirz = 0;
        int stuffdir = 0;
        final int width;
        final int length = width = 3;
        final int height = 3;
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
        int x = cposx;
        final int y = pposy - 1;
        int z = cposz;
        if (x - pposx < 0) {
            deltax = -1;
            stuffdir = 3;
        }
        if (x - pposx > 0) {
            deltax = 1;
            stuffdir = 2;
        }
        if (z - pposz < 0) {
            deltaz = -1;
            stuffdir = 5;
        }
        if (z - pposz > 0) {
            deltaz = 1;
            stuffdir = 4;
        }
        if (deltax == 0 && deltaz == 0) {
            return false;
        }
        x = pposx;
        z = pposz;
        Player.worldObj.playSoundAtEntity(Player, "random.explode", 1.0f, 1.5f);
        if (world.isRemote) {
            return true;
        }
        for (int i = -width; i <= width; ++i) {
            for (int j = -length; j <= length; ++j) {
                for (int k = 0; k <= height + 1; ++k) {
                    if (k == height + 1) {
                        world.setBlock(x + i, y + k, z + j, Blocks.planks);
                    }
                    else if (k == 0) {
                        world.setBlock(x + i, y + k, z + j, Blocks.cobblestone);
                    }
                    else if (i == width || j == length || i == -width || j == -length) {
                        if (k == height) {
                            world.setBlock(x + i, y + k, z + j, Blocks.glass);
                        }
                        else if (i == deltax * width && j == deltaz * length) {
                            world.setBlock(x + i, y + k, z + j, Blocks.air);
                        }
                        else {
                            world.setBlock(x + i, y + k, z + j, Blocks.planks);
                        }
                    }
                    else {
                        world.setBlock(x + i, y + k, z + j, Blocks.air);
                    }
                }
            }
        }
        int i = 2;
        int k = 1;
        int j = length - 1;
        world.setBlock(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.furnace);
        world.setBlockMetadataWithNotify(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, stuffdir, 3);
        i = 1;
        world.setBlock(x + i * deltax + j * deltaz, y + k, z + i * deltaz + j * deltax, Blocks.crafting_table);
        world.setBlock(x + j * deltaz, y + k, z + j * deltax, Blocks.chest);
        world.setBlockMetadataWithNotify(x + j * deltaz, y + k, z + j * deltax, stuffdir, 3);
        final TileEntityChest chest = (TileEntityChest)world.getTileEntity(x + j * deltaz, y + k, z + j * deltax);
        if (chest != null) {
            chest.setInventorySlotContents(0, new ItemStack(Items.compass));
            chest.setInventorySlotContents(1, new ItemStack(Items.map));
            chest.setInventorySlotContents(2, new ItemStack(Items.porkchop, 8));
            chest.setInventorySlotContents(3, new ItemStack(Blocks.torch, 32));
            chest.setInventorySlotContents(4, new ItemStack(Items.coal, 16));
            chest.setInventorySlotContents(5, new ItemStack(Items.bed));
            chest.setInventorySlotContents(6, new ItemStack(Items.bed));
            chest.setInventorySlotContents(7, new ItemStack(Items.wooden_door));
            chest.setInventorySlotContents(8, new ItemStack(Items.iron_pickaxe));
            chest.setInventorySlotContents(9, new ItemStack(Items.iron_sword));
            chest.setInventorySlotContents(10, new ItemStack(Items.iron_axe));
            chest.setInventorySlotContents(11, new ItemStack(Items.bucket));
            chest.setInventorySlotContents(12, new ItemStack(OreSpawnMain.MyOreSaltBlock, 4));
            chest.setInventorySlotContents(13, new ItemStack(Blocks.chest));
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
