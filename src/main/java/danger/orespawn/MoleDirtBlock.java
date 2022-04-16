package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class MoleDirtBlock extends Block {
  public MoleDirtBlock(int i) {
    super(Material.ground);
    setCreativeTab(CreativeTabs.tabBlock);
    setTickRandomly(true);
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (par1World.isRemote)
      return; 
    par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
    float f = 0.125F;
    return AxisAlignedBB.getBoundingBox(par2, par3, par4, (par2 + 1), ((par3 + 1) - f), (par4 + 1));
  }
  
  public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    if (par5Entity != null) {
      par5Entity.motionX *= 0.3D;
      par5Entity.motionZ *= 0.3D;
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
