package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSifter extends Item {
  public ItemSifter(int i) {
    this.maxStackSize = 1;
    setCreativeTab(CreativeTabs.tabDecorations);
    setMaxDamage(600);
  }
  
  private void dropItemRand(Item index, int par1, World world, int x, int y, int z) {
    EntityItem var3 = new EntityItem(world, (x + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2)) + 0.5D, y + 1.1D, (z + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2)) + 0.5D, new ItemStack(index, par1, 0));
    world.spawnEntityInWorld((Entity)var3);
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
    if (par3World.isRemote)
      return true; 
    Block bid = par3World.getBlock(par4, par5, par6);
    Block bid2 = par3World.getBlock(par4, par5 + 1, par6);
    if (bid2 == Blocks.flowing_water)
      bid = Blocks.water; 
    if (bid2 == Blocks.water)
      bid = Blocks.water; 
    if (bid == Blocks.water) {
      int i = par3World.rand.nextInt(160);
      switch (i) {
        case 0:
          dropItemRand(Items.fish, 1, par3World, par4, par5, par6);
          break;
        case 1:
          dropItemRand(OreSpawnMain.MyGreenFish, 1, par3World, par4, par5, par6);
          break;
        case 2:
          dropItemRand(OreSpawnMain.MyBlueFish, 1, par3World, par4, par5, par6);
          break;
        case 3:
          dropItemRand(OreSpawnMain.MyPinkFish, 1, par3World, par4, par5, par6);
          break;
        case 4:
          dropItemRand(OreSpawnMain.MyRockFish, 1, par3World, par4, par5, par6);
          break;
        case 5:
          dropItemRand(OreSpawnMain.MyWoodFish, 1, par3World, par4, par5, par6);
          break;
        case 6:
          dropItemRand(OreSpawnMain.MyGreyFish, 1, par3World, par4, par5, par6);
          break;
        case 7:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 8:
          dropItemRand(Items.iron_ingot, 1, par3World, par4, par5, par6);
          break;
        case 9:
          dropItemRand(Items.gold_nugget, 1, par3World, par4, par5, par6);
          break;
        case 10:
          dropItemRand(OreSpawnMain.MyItemShoes, 1, par3World, par4, par5, par6);
          break;
        case 11:
          dropItemRand(OreSpawnMain.MyItemShoes_1, 1, par3World, par4, par5, par6);
          break;
        case 12:
          dropItemRand(OreSpawnMain.MyItemShoes_2, 1, par3World, par4, par5, par6);
          break;
        case 13:
          dropItemRand(OreSpawnMain.MyItemShoes_3, 1, par3World, par4, par5, par6);
          break;
        case 14:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 15:
          dropItemRand(Items.bone, 1, par3World, par4, par5, par6);
          break;
        case 16:
          dropItemRand(Item.getItemFromBlock(Blocks.stone), 1, par3World, par4, par5, par6);
          break;
        case 17:
          dropItemRand(Items.bucket, 1, par3World, par4, par5, par6);
          break;
        case 18:
          dropItemRand(Items.water_bucket, 1, par3World, par4, par5, par6);
          break;
        case 19:
          if (par3World.rand.nextInt(3) == 1) {
            dropItemRand(Items.emerald, 1, par3World, par4, par5, par6);
            break;
          } 
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 20:
          if (par3World.rand.nextInt(3) == 1) {
            dropItemRand(OreSpawnMain.MyRuby, 1, par3World, par4, par5, par6);
            break;
          } 
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 21:
          if (par3World.rand.nextInt(3) == 1) {
            dropItemRand(OreSpawnMain.MyAmethyst, 1, par3World, par4, par5, par6);
            break;
          } 
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 22:
          dropItemRand(OreSpawnMain.MyMothScale, 1, par3World, par4, par5, par6);
          break;
        case 23:
          dropItemRand(OreSpawnMain.UraniumNugget, 1, par3World, par4, par5, par6);
          break;
        case 24:
          dropItemRand(OreSpawnMain.TitaniumNugget, 1, par3World, par4, par5, par6);
          break;
        case 25:
          if (par3World.rand.nextInt(2) == 1) {
            dropItemRand(Items.diamond, 1, par3World, par4, par5, par6);
            break;
          } 
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 26:
          dropItemRand(Items.iron_ingot, 1, par3World, par4, par5, par6);
          break;
        case 27:
          dropItemRand(Items.gold_nugget, 1, par3World, par4, par5, par6);
          break;
        case 28:
          dropItemRand(Items.redstone, 1, par3World, par4, par5, par6);
          break;
        case 29:
          dropItemRand(Items.coal, 1, par3World, par4, par5, par6);
          break;
        case 30:
          dropItemRand(OreSpawnMain.MyItemShoes, 1, par3World, par4, par5, par6);
          break;
        case 31:
          dropItemRand(OreSpawnMain.MyItemShoes_1, 1, par3World, par4, par5, par6);
          break;
        case 32:
          dropItemRand(OreSpawnMain.MyItemShoes_2, 1, par3World, par4, par5, par6);
          break;
        case 33:
          dropItemRand(OreSpawnMain.MyItemShoes_3, 1, par3World, par4, par5, par6);
          break;
        case 34:
          dropItemRand(Items.fish, 1, par3World, par4, par5, par6);
          break;
        case 35:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 36:
          dropItemRand(Items.bone, 1, par3World, par4, par5, par6);
          break;
        case 37:
          dropItemRand(Item.getItemFromBlock(Blocks.stone), 1, par3World, par4, par5, par6);
          break;
        case 38:
          dropItemRand(Item.getItemFromBlock(Blocks.stone_button), 1, par3World, par4, par5, par6);
          break;
        case 39:
          dropItemRand(Items.bucket, 1, par3World, par4, par5, par6);
          break;
        case 40:
          dropItemRand(Items.water_bucket, 1, par3World, par4, par5, par6);
          break;
      } 
    } 
    if (bid == Blocks.sand) {
      int i = par3World.rand.nextInt(60);
      switch (i) {
        case 0:
          dropItemRand(Items.iron_horse_armor, 1, par3World, par4, par5, par6);
          break;
        case 1:
          dropItemRand((Item)Items.shears, 1, par3World, par4, par5, par6);
          break;
        case 2:
          dropItemRand(Items.carrot_on_a_stick, 1, par3World, par4, par5, par6);
          break;
        case 3:
          dropItemRand(Items.poisonous_potato, 1, par3World, par4, par5, par6);
          break;
        case 4:
          dropItemRand(Items.item_frame, 1, par3World, par4, par5, par6);
          break;
        case 5:
          dropItemRand(Items.bone, 1, par3World, par4, par5, par6);
          break;
        case 6:
          dropItemRand(Items.compass, 1, par3World, par4, par5, par6);
          break;
        case 7:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 8:
          dropItemRand(Items.saddle, 1, par3World, par4, par5, par6);
          break;
        case 9:
          dropItemRand((Item)Items.iron_helmet, 1, par3World, par4, par5, par6);
          break;
        case 10:
          dropItemRand((Item)Items.iron_chestplate, 1, par3World, par4, par5, par6);
          break;
        case 11:
          dropItemRand((Item)Items.iron_leggings, 1, par3World, par4, par5, par6);
          break;
        case 12:
          dropItemRand((Item)Items.iron_boots, 1, par3World, par4, par5, par6);
          break;
        case 13:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.sand), 1, par3World, par4, par5, par6);
          break;
      } 
    } 
    if (bid == Blocks.gravel) {
      int i = par3World.rand.nextInt(60);
      switch (i) {
        case 0:
          dropItemRand(Items.flint, 1, par3World, par4, par5, par6);
          break;
        case 1:
          dropItemRand(OreSpawnMain.MySalt, 1, par3World, par4, par5, par6);
          break;
        case 2:
          dropItemRand(Items.flint_and_steel, 1, par3World, par4, par5, par6);
          break;
        case 3:
          dropItemRand(Items.spider_eye, 1, par3World, par4, par5, par6);
          break;
        case 4:
          dropItemRand(Items.item_frame, 1, par3World, par4, par5, par6);
          break;
        case 5:
          dropItemRand(Items.feather, 1, par3World, par4, par5, par6);
          break;
        case 6:
          dropItemRand(Items.string, 1, par3World, par4, par5, par6);
          break;
        case 7:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 8:
          dropItemRand(Items.lead, 1, par3World, par4, par5, par6);
          break;
        case 9:
          dropItemRand(Items.name_tag, 1, par3World, par4, par5, par6);
          break;
        case 10:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.sand), 1, par3World, par4, par5, par6);
          break;
        case 11:
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
      } 
    } 
    if (bid == Blocks.dirt) {
      int i = par3World.rand.nextInt(60);
      switch (i) {
        case 0:
          dropItemRand(Items.string, 1, par3World, par4, par5, par6);
          break;
        case 1:
          dropItemRand(OreSpawnMain.MySalt, 1, par3World, par4, par5, par6);
          break;
        case 2:
          dropItemRand((Item)Items.shears, 1, par3World, par4, par5, par6);
          break;
        case 3:
          dropItemRand(Items.stick, 1, par3World, par4, par5, par6);
          break;
        case 4:
          dropItemRand(Items.bowl, 1, par3World, par4, par5, par6);
          break;
        case 5:
          dropItemRand(Items.flower_pot, 1, par3World, par4, par5, par6);
          break;
        case 6:
          dropItemRand(Items.sign, 1, par3World, par4, par5, par6);
          break;
        case 7:
          dropItemRand(Items.brick, 1, par3World, par4, par5, par6);
          break;
        case 8:
          dropItemRand(Items.paper, 1, par3World, par4, par5, par6);
          break;
        case 9:
          dropItemRand(Items.bone, 1, par3World, par4, par5, par6);
          break;
        case 10:
          dropItemRand(Items.glass_bottle, 1, par3World, par4, par5, par6);
          break;
        case 11:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.sand), 1, par3World, par4, par5, par6);
          break;
        case 12:
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 13:
          dropItemRand(Item.getItemFromBlock(Blocks.dirt), 1, par3World, par4, par5, par6);
          break;
      } 
    } 
    if (bid == Blocks.grass) {
      int i = par3World.rand.nextInt(60);
      switch (i) {
        case 0:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.yellow_flower), 1, par3World, par4, par5, par6);
          break;
        case 1:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.red_flower), 1, par3World, par4, par5, par6);
          break;
        case 2:
          dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerPinkBlock), 1, par3World, par4, par5, par6);
          break;
        case 3:
          dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerBlueBlock), 1, par3World, par4, par5, par6);
          break;
        case 4:
          dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerBlackBlock), 1, par3World, par4, par5, par6);
          break;
        case 5:
          dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyFlowerScaryBlock), 1, par3World, par4, par5, par6);
        case 6:
          dropItemRand(Items.wheat, 1, par3World, par4, par5, par6);
          break;
        case 7:
          dropItemRand(Items.pumpkin_seeds, 1, par3World, par4, par5, par6);
          break;
        case 8:
          dropItemRand(Items.melon_seeds, 1, par3World, par4, par5, par6);
          break;
        case 9:
          dropItemRand(Items.carrot, 1, par3World, par4, par5, par6);
          break;
        case 10:
          dropItemRand(Items.potato, 1, par3World, par4, par5, par6);
          break;
        case 11:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.deadbush), 1, par3World, par4, par5, par6);
          break;
        case 12:
          dropItemRand(Item.getItemFromBlock(Blocks.gravel), 1, par3World, par4, par5, par6);
          break;
        case 13:
          dropItemRand(Item.getItemFromBlock(Blocks.dirt), 1, par3World, par4, par5, par6);
          break;
        case 14:
          dropItemRand(Item.getItemFromBlock((Block)Blocks.grass), 1, par3World, par4, par5, par6);
          break;
      } 
    } 
    par1ItemStack.damageItem(1, (EntityLivingBase)par2EntityPlayer);
    return true;
  }
  
  public String getMaterialName() {
    return "Unknown";
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
