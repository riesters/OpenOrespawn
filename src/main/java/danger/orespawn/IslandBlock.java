package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class IslandBlock extends BlockReed {
  protected IslandBlock(int par1) {
    float var3 = 0.375F;
    setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
    setTickRandomly(true);
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    if (par1World.getBlock(par2, par3 - 1, par4).getMaterial().isSolid())
      return true; 
    return false;
  }
  
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.rand.nextInt(20) != 1)
      return; 
    for (int j1 = 0; j1 < 20; j1++)
      par1World.spawnParticle("happyVillager", (par2 + par1World.rand.nextFloat()), par3 + par1World.rand.nextFloat(), (par4 + par1World.rand.nextFloat()), 0.0D, 0.0D, 0.0D); 
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int isok = 1;
    if (par1World.isRemote)
      return; 
    int n = 1 + par1World.rand.nextInt(3);
    int m = 64;
    if (OreSpawnMain.IslandSizeFactor == 2)
      m = 55; 
    if (OreSpawnMain.IslandSizeFactor == 1)
      m = 45; 
    for (int i = 0; i < n; i++) {
      int height = 12 + par1World.rand.nextInt(m);
      isok = 1;
      for (int k = -10; k <= 10; k++) {
        for (int j = -10; j <= 10; j++) {
          Block bid = par1World.getBlock(par2 + j, par3 + height, par4 + k);
          if (bid != Blocks.air) {
            isok = 0;
            break;
          } 
        } 
      } 
      if (isok != 0)
        if (par1World.rand.nextInt(25) == 1) {
          IslandBlock islandBlock = this;
          spawnCreature(par1World, "Island", par2, (par3 + height), par4);
        } else {
          IslandBlock islandBlock = this;
          spawnCreature(par1World, "IslandToo", par2, (par3 + height), par4);
        }  
    } 
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    par1World.setBlock(par2, par3 + 1, par4, Blocks.air, 0, 2);
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return Item.getItemFromBlock(OreSpawnMain.MyIslandBlock);
  }
  
  public int quantityDropped(Random par1Random) {
    return 1;
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
