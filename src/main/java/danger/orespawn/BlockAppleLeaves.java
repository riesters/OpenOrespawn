package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAppleLeaves extends BlockLeaves {
  private IIcon generic_solid = null;
  
  protected BlockAppleLeaves(int par1) {}
  
  public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
    par3List.add(new ItemStack(Item.getItemFromBlock((Block)this), 1, 0));
  }
  
  public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
    if (!par1World.isRemote) {
      if (par1World.rand.nextInt(25) == 1)
        dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(Items.apple)); 
      if (par1World.rand.nextInt(500) == 2)
        dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(Items.golden_apple, 1, 0)); 
      if (par1World.rand.nextInt(1000) == 3)
        dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(Items.golden_apple, 1, 1)); 
      if (par1World.rand.nextInt(10000) == 4)
        dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(OreSpawnMain.MagicApple)); 
    } 
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int var7 = 2;
    int totaldist = 0;
    int chance = 20;
    if (par1World.provider.dimensionId == OreSpawnMain.DimensionID4) {
      chance = 100;
      var7 = 1;
    } 
    if (!par1World.isRemote && par1World.checkChunksExist(par2 - var7, par3 - var7, par4 - var7, par2 + var7, par3 + var7, par4 + var7)) {
      for (int var12 = -var7; var12 <= var7; var12++) {
        for (int var13 = -var7; var13 <= 0; var13++) {
          for (int var14 = -var7; var14 <= var7; var14++) {
            totaldist = Math.abs(var12) + Math.abs(var13) + Math.abs(var14);
            if (totaldist <= 3) {
              Block bid = par1World.getBlock(par2 + var12, par3 + var13, par4 + var14);
              if (bid != Blocks.air && bid.canSustainLeaves((IBlockAccess)par1World, par2 + var12, par3 + var13, par4 + var14)) {
                bid = par1World.getBlock(par2, par3 - 1, par4);
                if (bid == Blocks.air)
                  if (par1World.rand.nextInt(chance) == 3)
                    dropBlockAsItemWithChance(par1World, par2, par3 - 1, par4, 0, 0.0F, 0);  
                long t = par1World.getWorldTime();
                t %= 24000L;
                if (t > 12000L && par1World.provider.dimensionId == OreSpawnMain.DimensionID4)
                  OreSpawnMain.setBlockFast(par1World, par2, par3, par4, OreSpawnMain.MyScaryLeaves, 0, 3); 
                return;
              } 
            } 
          } 
        } 
      } 
      removeLeaves(par1World, par2, par3, par4);
    } 
  }
  
  private void removeLeaves(World par1World, int par2, int par3, int par4) {
    dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
  }
  
  public boolean isOpaqueCube() {
    if (OreSpawnMain.FastGraphicsLeaves != 0)
      return true; 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
    Block i1 = par1IBlockAccess.getBlock(par2, par3, par4);
    return !(OreSpawnMain.FastGraphicsLeaves != 0 && i1 == this);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
    this.generic_solid = iconRegister.registerIcon("OreSpawn:generic_solid");
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2) {
    if (OreSpawnMain.FastGraphicsLeaves != 0)
      return this.generic_solid; 
    return this.blockIcon;
  }
  
  public String[] func_150125_e() {
    return null;
  }
}
