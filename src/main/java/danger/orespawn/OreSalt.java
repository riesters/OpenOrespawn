package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class OreSalt extends Block {
  public OreSalt(int par1) {
    super(Material.rock);
    setHardness(5.0F);
    setResistance(2.0F);
    setCreativeTab(CreativeTabs.tabBlock);
  }
  
  public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    if (par5Entity instanceof EntityAnt)
      par5Entity.attackEntityFrom(DamageSource.cactus, 5.0F); 
  }
  
  public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    if (par5Entity instanceof EntityAnt)
      par5Entity.attackEntityFrom(DamageSource.cactus, 5.0F); 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
