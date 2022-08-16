package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemSifter extends Item
{
    public ItemSifter() {
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setMaxDamage(600);
    }
    
    private void dropItemRand(final Item index, final World world, final int x, final int y, final int z) {
        final EntityItem var3 = new EntityItem(world, x + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2) + 0.5, y + 1.1, z + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2) + 0.5, new ItemStack(index, 1, 0));
        world.spawnEntityInWorld(var3);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
        if (par3World.isRemote) {
            return true;
        }
        Block bid = par3World.getBlock(par4, par5, par6);
        final Block bid2 = par3World.getBlock(par4, par5 + 1, par6);
        if (bid2 == Blocks.flowing_water) {
            bid = Blocks.water;
        }
        if (bid2 == Blocks.water) {
            bid = Blocks.water;
        }
        if (bid == Blocks.water) {
            final int i = par3World.rand.nextInt(160);
            switch (i) {
                case 0: {
                    this.dropItemRand(Items.fish, par3World, par4, par5, par6);
                    break;
                }
                case 1: {
                    this.dropItemRand(OreSpawnMain.MyGreenFish, par3World, par4, par5, par6);
                    break;
                }
                case 2: {
                    this.dropItemRand(OreSpawnMain.MyBlueFish, par3World, par4, par5, par6);
                    break;
                }
                case 3: {
                    this.dropItemRand(OreSpawnMain.MyPinkFish, par3World, par4, par5, par6);
                    break;
                }
                case 4: {
                    this.dropItemRand(OreSpawnMain.MyRockFish, par3World, par4, par5, par6);
                    break;
                }
                case 5: {
                    this.dropItemRand(OreSpawnMain.MyWoodFish, par3World, par4, par5, par6);
                    break;
                }
                case 6: {
                    this.dropItemRand(OreSpawnMain.MyGreyFish, par3World, par4, par5, par6);
                    break;
                }
                case 7: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 8: {
                    this.dropItemRand(Items.iron_ingot, par3World, par4, par5, par6);
                    break;
                }
                case 9: {
                    this.dropItemRand(Items.gold_nugget, par3World, par4, par5, par6);
                    break;
                }
                case 10: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes, par3World, par4, par5, par6);
                    break;
                }
                case 11: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_1, par3World, par4, par5, par6);
                    break;
                }
                case 12: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_2, par3World, par4, par5, par6);
                    break;
                }
                case 13: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_3, par3World, par4, par5, par6);
                    break;
                }
                case 14: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 15: {
                    this.dropItemRand(Items.bone, par3World, par4, par5, par6);
                    break;
                }
                case 16: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.stone), par3World, par4, par5, par6);
                    break;
                }
                case 17: {
                    this.dropItemRand(Items.bucket, par3World, par4, par5, par6);
                    break;
                }
                case 18: {
                    this.dropItemRand(Items.water_bucket, par3World, par4, par5, par6);
                    break;
                }
                case 19: {
                    if (par3World.rand.nextInt(3) == 1) {
                        this.dropItemRand(Items.emerald, par3World, par4, par5, par6);
                        break;
                    }
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 20: {
                    if (par3World.rand.nextInt(3) == 1) {
                        this.dropItemRand(OreSpawnMain.MyRuby, par3World, par4, par5, par6);
                        break;
                    }
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 21: {
                    if (par3World.rand.nextInt(3) == 1) {
                        this.dropItemRand(OreSpawnMain.MyAmethyst, par3World, par4, par5, par6);
                        break;
                    }
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 22: {
                    this.dropItemRand(OreSpawnMain.MyMothScale, par3World, par4, par5, par6);
                    break;
                }
                case 23: {
                    this.dropItemRand(OreSpawnMain.UraniumNugget, par3World, par4, par5, par6);
                    break;
                }
                case 24: {
                    this.dropItemRand(OreSpawnMain.TitaniumNugget, par3World, par4, par5, par6);
                    break;
                }
                case 25: {
                    if (par3World.rand.nextInt(2) == 1) {
                        this.dropItemRand(Items.diamond, par3World, par4, par5, par6);
                        break;
                    }
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 26: {
                    this.dropItemRand(Items.iron_ingot, par3World, par4, par5, par6);
                    break;
                }
                case 27: {
                    this.dropItemRand(Items.gold_nugget, par3World, par4, par5, par6);
                    break;
                }
                case 28: {
                    this.dropItemRand(Items.redstone, par3World, par4, par5, par6);
                    break;
                }
                case 29: {
                    this.dropItemRand(Items.coal, par3World, par4, par5, par6);
                    break;
                }
                case 30: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes, par3World, par4, par5, par6);
                    break;
                }
                case 31: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_1, par3World, par4, par5, par6);
                    break;
                }
                case 32: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_2, par3World, par4, par5, par6);
                    break;
                }
                case 33: {
                    this.dropItemRand(OreSpawnMain.MyItemShoes_3, par3World, par4, par5, par6);
                    break;
                }
                case 34: {
                    this.dropItemRand(Items.fish, par3World, par4, par5, par6);
                    break;
                }
                case 35: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 36: {
                    this.dropItemRand(Items.bone, par3World, par4, par5, par6);
                    break;
                }
                case 37: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.stone), par3World, par4, par5, par6);
                    break;
                }
                case 38: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.stone_button), par3World, par4, par5, par6);
                    break;
                }
                case 39: {
                    this.dropItemRand(Items.bucket, par3World, par4, par5, par6);
                    break;
                }
                case 40: {
                    this.dropItemRand(Items.water_bucket, par3World, par4, par5, par6);
                    break;
                }
            }
        }
        if (bid == Blocks.sand) {
            final int i = par3World.rand.nextInt(60);
            switch (i) {
                case 0: {
                    this.dropItemRand(Items.iron_horse_armor, par3World, par4, par5, par6);
                    break;
                }
                case 1: {
                    this.dropItemRand(Items.shears, par3World, par4, par5, par6);
                    break;
                }
                case 2: {
                    this.dropItemRand(Items.carrot_on_a_stick, par3World, par4, par5, par6);
                    break;
                }
                case 3: {
                    this.dropItemRand(Items.poisonous_potato, par3World, par4, par5, par6);
                    break;
                }
                case 4: {
                    this.dropItemRand(Items.item_frame, par3World, par4, par5, par6);
                    break;
                }
                case 5: {
                    this.dropItemRand(Items.bone, par3World, par4, par5, par6);
                    break;
                }
                case 6: {
                    this.dropItemRand(Items.compass, par3World, par4, par5, par6);
                    break;
                }
                case 7: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 8: {
                    this.dropItemRand(Items.saddle, par3World, par4, par5, par6);
                    break;
                }
                case 9: {
                    this.dropItemRand(Items.iron_helmet, par3World, par4, par5, par6);
                    break;
                }
                case 10: {
                    this.dropItemRand(Items.iron_chestplate, par3World, par4, par5, par6);
                    break;
                }
                case 11: {
                    this.dropItemRand(Items.iron_leggings, par3World, par4, par5, par6);
                    break;
                }
                case 12: {
                    this.dropItemRand(Items.iron_boots, par3World, par4, par5, par6);
                    break;
                }
                case 13: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.sand), par3World, par4, par5, par6);
                    break;
                }
            }
        }
        if (bid == Blocks.gravel) {
            final int i = par3World.rand.nextInt(60);
            switch (i) {
                case 0: {
                    this.dropItemRand(Items.flint, par3World, par4, par5, par6);
                    break;
                }
                case 1: {
                    this.dropItemRand(OreSpawnMain.MySalt, par3World, par4, par5, par6);
                    break;
                }
                case 2: {
                    this.dropItemRand(Items.flint_and_steel, par3World, par4, par5, par6);
                    break;
                }
                case 3: {
                    this.dropItemRand(Items.spider_eye, par3World, par4, par5, par6);
                    break;
                }
                case 4: {
                    this.dropItemRand(Items.item_frame, par3World, par4, par5, par6);
                    break;
                }
                case 5: {
                    this.dropItemRand(Items.feather, par3World, par4, par5, par6);
                    break;
                }
                case 6: {
                    this.dropItemRand(Items.string, par3World, par4, par5, par6);
                    break;
                }
                case 7: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 8: {
                    this.dropItemRand(Items.lead, par3World, par4, par5, par6);
                    break;
                }
                case 9: {
                    this.dropItemRand(Items.name_tag, par3World, par4, par5, par6);
                    break;
                }
                case 10: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.sand), par3World, par4, par5, par6);
                    break;
                }
                case 11: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
            }
        }
        if (bid == Blocks.dirt) {
            final int i = par3World.rand.nextInt(60);
            switch (i) {
                case 0: {
                    this.dropItemRand(Items.string, par3World, par4, par5, par6);
                    break;
                }
                case 1: {
                    this.dropItemRand(OreSpawnMain.MySalt, par3World, par4, par5, par6);
                    break;
                }
                case 2: {
                    this.dropItemRand(Items.shears, par3World, par4, par5, par6);
                    break;
                }
                case 3: {
                    this.dropItemRand(Items.stick, par3World, par4, par5, par6);
                    break;
                }
                case 4: {
                    this.dropItemRand(Items.bowl, par3World, par4, par5, par6);
                    break;
                }
                case 5: {
                    this.dropItemRand(Items.flower_pot, par3World, par4, par5, par6);
                    break;
                }
                case 6: {
                    this.dropItemRand(Items.sign, par3World, par4, par5, par6);
                    break;
                }
                case 7: {
                    this.dropItemRand(Items.brick, par3World, par4, par5, par6);
                    break;
                }
                case 8: {
                    this.dropItemRand(Items.paper, par3World, par4, par5, par6);
                    break;
                }
                case 9: {
                    this.dropItemRand(Items.bone, par3World, par4, par5, par6);
                    break;
                }
                case 10: {
                    this.dropItemRand(Items.glass_bottle, par3World, par4, par5, par6);
                    break;
                }
                case 11: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.sand), par3World, par4, par5, par6);
                    break;
                }
                case 12: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 13: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.dirt), par3World, par4, par5, par6);
                    break;
                }
            }
        }
        if (bid == Blocks.grass) {
            final int i = par3World.rand.nextInt(60);
            switch (i) {
                case 0: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.yellow_flower), par3World, par4, par5, par6);
                    break;
                }
                case 1: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.red_flower), par3World, par4, par5, par6);
                    break;
                }
                case 2: {
                    this.dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerPinkBlock), par3World, par4, par5, par6);
                    break;
                }
                case 3: {
                    this.dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerBlueBlock), par3World, par4, par5, par6);
                    break;
                }
                case 4: {
                    this.dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerBlackBlock), par3World, par4, par5, par6);
                    break;
                }
                case 5: {
                    this.dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerScaryBlock), par3World, par4, par5, par6);
                }
                case 6: {
                    this.dropItemRand(Items.wheat, par3World, par4, par5, par6);
                    break;
                }
                case 7: {
                    this.dropItemRand(Items.pumpkin_seeds, par3World, par4, par5, par6);
                    break;
                }
                case 8: {
                    this.dropItemRand(Items.melon_seeds, par3World, par4, par5, par6);
                    break;
                }
                case 9: {
                    this.dropItemRand(Items.carrot, par3World, par4, par5, par6);
                    break;
                }
                case 10: {
                    this.dropItemRand(Items.potato, par3World, par4, par5, par6);
                    break;
                }
                case 11: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.deadbush), par3World, par4, par5, par6);
                    break;
                }
                case 12: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.gravel), par3World, par4, par5, par6);
                    break;
                }
                case 13: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.dirt), par3World, par4, par5, par6);
                    break;
                }
                case 14: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.grass), par3World, par4, par5, par6);
                    break;
                }
            }
        }
        par1ItemStack.damageItem(1, par2EntityPlayer);
        return true;
    }
    
    public String getMaterialName() {
        return "Unknown";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
