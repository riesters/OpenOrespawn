package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class OreCrystalCrystal extends Block {
  public OreCrystalCrystal(int par1, float lv, float f1, float f2) {
    super(Material.rock);
    setHardness(f1);
    setResistance(f2);
    setCreativeTab(CreativeTabs.tabBlock);
    setLightLevel(lv);
    setTickRandomly(true);
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.rand.nextInt(20) == 0)
      sparkle(par1World, par2, par3, par4); 
  }
  
  private void sparkle(World par1World, int par2, int par3, int par4) {
    int which = 0;
    float dx = 0.5F;
    float dz = 0.5F;
    float dy = 0.5F;
    if (this == OreSpawnMain.TigersEye) {
      par1World.spawnParticle("flame", (par2 + dx), par3 + dy, (par4 + dz), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F));
    } else {
      par1World.spawnParticle("fireworksSpark", (par2 + dx), par3 + dy, (par4 + dz), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F), ((par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0F));
    } 
  }
  
  public int getRenderType() {
    return 1;
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
    if (this == OreSpawnMain.CrystalCrystal && !par1World.isRemote && par1World.rand.nextInt(10) == 1)
      par1World.newExplosion((Entity)null, (par2 + 0.5F), (par3 + 0.5F), (par4 + 0.5F), 1.0F, true, par1World.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
    super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
  }
  
  public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
    super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
    int j1 = 5 + par1World.rand.nextInt(5) + par1World.rand.nextInt(10);
    if (par3 < 40)
      dropXpOnBlockBreak(par1World, par2, par3, par4, j1); 
  }
  
  public int quantityDropped(Random par1Random) {
    if (this != OreSpawnMain.TigersEye)
      return 1; 
    return par1Random.nextInt(2);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
