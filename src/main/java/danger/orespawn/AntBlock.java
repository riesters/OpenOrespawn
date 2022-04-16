package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AntBlock extends BlockGrass {
  @SideOnly(Side.CLIENT)
  private IIcon[] field_94364_a;
  
  protected AntBlock(int par1) {
    setTickRandomly(true);
    setCreativeTab(CreativeTabs.tabBlock);
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2) {
    if (this.field_94364_a == null)
      return null; 
    return (par1 == 1) ? this.field_94364_a[0] : ((par1 == 0) ? this.field_94364_a[1] : this.field_94364_a[2]);
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
    if (this.field_94364_a == null)
      return null; 
    if (par5 == 1)
      return this.field_94364_a[0]; 
    if (par5 == 0)
      return this.field_94364_a[1]; 
    return this.field_94364_a[2];
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int howmany = 0;
    if (!par1World.isRemote) {
      if (par1World.isRaining())
        return; 
      Block bid = par1World.getBlock(par2, par3 + 1, par4);
      if (bid == Blocks.air) {
        howmany = OreSpawnMain.OreSpawnRand.nextInt(6) + 2;
        for (int i = 0; i < howmany; i++) {
          if (this == OreSpawnMain.MyAntBlock) {
            if (OreSpawnMain.BlackAntEnable != 0)
              spawnCreature(par1World, "Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D); 
          } else if (this == OreSpawnMain.MyRedAntBlock) {
            if (OreSpawnMain.RedAntEnable != 0)
              spawnCreature(par1World, "Red Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D); 
          } else if (this == OreSpawnMain.MyUnstableAntBlock) {
            if (OreSpawnMain.UnstableAntEnable != 0)
              spawnCreature(par1World, "Unstable Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D); 
          } else if (this == OreSpawnMain.TermiteBlock) {
            if (OreSpawnMain.TermiteEnable != 0)
              spawnCreature(par1World, "Termite", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D); 
          } else if (OreSpawnMain.RainbowAntEnable != 0) {
            spawnCreature(par1World, "Rainbow Ant", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D);
          } 
        } 
      } 
    } 
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return Item.getItemFromBlock((Block)this);
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
  public int getBlockColor() {
    double var1 = 0.5D;
    double var3 = 1.0D;
    return ColorizerGrass.getGrassColor(var1, var3);
  }
  
  @SideOnly(Side.CLIENT)
  public int getRenderColor(int par1) {
    return getBlockColor();
  }
  
  @SideOnly(Side.CLIENT)
  public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
    int l = 0;
    int i1 = 0;
    int j1 = 0;
    for (int k1 = -1; k1 <= 1; k1++) {
      for (int l1 = -1; l1 <= 1; l1++) {
        int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeGrassColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
        l += (i2 & 0xFF0000) >> 16;
        i1 += (i2 & 0xFF00) >> 8;
        j1 += i2 & 0xFF;
      } 
    } 
    return (l / 9 & 0xFF) << 16 | (i1 / 9 & 0xFF) << 8 | j1 / 9 & 0xFF;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IIconRegister) {
    this.field_94364_a = new IIcon[3];
    this.field_94364_a[0] = par1IIconRegister.registerIcon("OreSpawn:antnest_top");
    this.field_94364_a[1] = par1IIconRegister.registerIcon("OreSpawn:antnest_bottom");
    this.field_94364_a[2] = par1IIconRegister.registerIcon("OreSpawn:antnest_side");
  }
}
