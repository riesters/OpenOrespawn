package danger.orespawn.world.structures;

import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.block.properties.*;

public class GenericDungeon
{
    private ResourceLocation LOOT_TABLE;
    
    public GenericDungeon() {
        this.LOOT_TABLE = new ResourceLocation("orespawn", "generic_dungeon");
    }
    
    private void setThisBlock(final World world, final int cposx, final int cposy, final int cposz) {
        if (world.rand.nextInt(2) == 1) {
            world.setBlockState(new BlockPos(cposx, cposy, cposz), Blocks.MOSSY_COBBLESTONE.getDefaultState());
        }
        else {
            world.setBlockState(new BlockPos(cposx, cposy, cposz), Blocks.COBBLESTONE.getDefaultState());
        }
    }
    
    private TileEntityChest getChestTileEntity(final World world, final int cposx, final int cposy, final int cposz) {
        TileEntityChest chest = null;
        TileEntity t = null;
        t = world.getTileEntity(new BlockPos(cposx, cposy, cposz));
        if (t instanceof TileEntityChest) {
            chest = (TileEntityChest)t;
        }
        return chest;
    }
    
    private TileEntityMobSpawner getSpawnerTileEntity(final World world, final int cposx, final int cposy, final int cposz) {
        TileEntityMobSpawner chest = null;
        TileEntity t = null;
        t = world.getTileEntity(new BlockPos(cposx, cposy, cposz));
        if (t instanceof TileEntityMobSpawner) {
            chest = (TileEntityMobSpawner)t;
            return chest;
        }
        return null;
    }
    
    public void makeDungeon(final World world, final int cposx, final int cposy, final int cposz) {
        final int width = 12;
        final int height = 6;
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                for (int k = 0; k < width; ++k) {
                    world.setBlockState(new BlockPos(cposx + i, cposy + j, cposz + k), Blocks.AIR.getDefaultState());
                }
            }
        }
        for (int i = 0; i < width; ++i) {
            final int j = 0;
            for (int k = 0; k < width; ++k) {
                world.setBlockState(new BlockPos(cposx + i, cposy + j, cposz + k), Blocks.MOSSY_COBBLESTONE.getDefaultState());
            }
        }
        for (int i = 0; i < width; ++i) {
            final int j = height - 1;
            for (int k = 0; k < width; ++k) {
                this.setThisBlock(world, cposx + i, cposy + j, cposz + k);
            }
        }
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                int k = 0;
                this.setThisBlock(world, cposx + i, cposy + j, cposz + k);
                k = width - 1;
                this.setThisBlock(world, cposx + i, cposy + j, cposz + k);
            }
        }
        for (int k = 0; k < width; ++k) {
            for (int j = 0; j < height; ++j) {
                int i = 0;
                this.setThisBlock(world, cposx + i, cposy + j, cposz + k);
                i = width - 1;
                this.setThisBlock(world, cposx + i, cposy + j, cposz + k);
            }
        }
        world.setBlockState(new BlockPos(cposx + width / 2, cposy + 1, cposz + width / 2), Blocks.MOB_SPAWNER.getDefaultState());
        final TileEntityMobSpawner tileentitymobspawner = this.getSpawnerTileEntity(world, cposx + width / 2, cposy + 1, cposz + width / 2);
        if (tileentitymobspawner != null) {
            final int t = world.rand.nextInt(3);
            if (t == 0) {
                tileentitymobspawner.getSpawnerBaseLogic().setEntityId(new ResourceLocation("orespawn:alien"));
            }
            if (t == 1) {
                tileentitymobspawner.getSpawnerBaseLogic().setEntityId(new ResourceLocation("orespawn:gammametroid"));
            }
            if (t == 2) {
                tileentitymobspawner.getSpawnerBaseLogic().setEntityId(new ResourceLocation("orespawn:cryolophosaurus"));
            }
        }
        TileEntityChest chest = null;
        world.setBlockState(new BlockPos(cposx + width / 2, cposy + 1, cposz + 1), Blocks.CHEST.getDefaultState().withProperty((IProperty)BlockChest.FACING, (Comparable)EnumFacing.SOUTH));
        chest = this.getChestTileEntity(world, cposx + width / 2, cposy + 1, cposz + 1);
        if (chest != null) {
            chest.setLootTable(this.LOOT_TABLE, (long)(world.rand.nextInt() * cposx * cposy * cposz));
        }
    }
}
