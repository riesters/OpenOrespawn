package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockRuby extends Block {
  public BlockRuby(int par1) {
    super(Material.rock);
    setHardness(4.0F);
    setResistance(4.0F);
    setCreativeTab(CreativeTabs.tabBlock);
    setLightLevel(0.4F);
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return true;
  }
  
  public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase)
      ((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0)); 
  }
  
  public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase)
      ((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0)); 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
