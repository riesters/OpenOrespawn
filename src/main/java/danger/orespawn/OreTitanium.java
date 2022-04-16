package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class OreTitanium extends Block {
  private boolean glowing = false;
  
  private int glowcount = 0;
  
  public OreTitanium(int par1) {
    super(Material.rock);
    setHardness(15.0F);
    setResistance(5.0F);
    setCreativeTab(CreativeTabs.tabBlock);
    setTickRandomly(true);
    this.glowing = false;
  }
  
  public int tickRate() {
    return 30;
  }
  
  public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
    glow(par1World, par2, par3, par4);
    super.onBlockClicked(par1World, par2, par3, par4, par5EntityPlayer);
  }
  
  public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    glow(par1World, par2, par3, par4);
    super.onEntityWalking(par1World, par2, par3, par4, par5Entity);
  }
  
  public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    glow(par1World, par2, par3, par4);
    return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
  }
  
  private void glow(World par1World, int par2, int par3, int par4) {
    this.glowing = true;
    this.glowcount = 5;
    sparkle(par1World, par2, par3, par4);
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {}
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (this.glowing) {
      sparkle(par1World, par2, par3, par4);
      if (this.glowcount > 0) {
        this.glowcount--;
      } else {
        this.glowing = false;
      } 
    } 
  }
  
  private void sparkle(World par1World, int par2, int par3, int par4) {
    Random var5 = par1World.rand;
    double var6 = 0.0625D;
    for (int var8 = 0; var8 < 6; var8++) {
      double var9 = (par2 + var5.nextFloat());
      double var11 = (par3 + var5.nextFloat());
      double var13 = (par4 + var5.nextFloat());
      if (var8 == 0 && !par1World.getBlock(par2, par3 + 1, par4).isOpaqueCube())
        var11 = (par3 + 1) + var6; 
      if (var8 == 1 && !par1World.getBlock(par2, par3 - 1, par4).isOpaqueCube())
        var11 = (par3 + 0) - var6; 
      if (var8 == 2 && !par1World.getBlock(par2, par3, par4 + 1).isOpaqueCube())
        var13 = (par4 + 1) + var6; 
      if (var8 == 3 && !par1World.getBlock(par2, par3, par4 - 1).isOpaqueCube())
        var13 = (par4 + 0) - var6; 
      if (var8 == 4 && !par1World.getBlock(par2 + 1, par3, par4).isOpaqueCube())
        var9 = (par2 + 1) + var6; 
      if (var8 == 5 && !par1World.getBlock(par2 - 1, par3, par4).isOpaqueCube())
        var9 = (par2 + 0) - var6; 
      if (var9 < par2 || var9 > (par2 + 1) || var11 < 0.0D || var11 > (par3 + 1) || var13 < par4 || var13 > (par4 + 1))
        par1World.spawnParticle("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D); 
    } 
  }
  
  public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
    super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
    int j1 = 5 + par1World.rand.nextInt(5) + par1World.rand.nextInt(10);
    if (par3 < 40)
      dropXpOnBlockBreak(par1World, par2, par3, par4, j1); 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
