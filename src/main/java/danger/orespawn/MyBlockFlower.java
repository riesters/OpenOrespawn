package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class MyBlockFlower extends Block implements IPlantable {
  protected MyBlockFlower(int par1, Material par2Material) {
    super(par2Material);
    setTickRandomly(true);
    float f = 0.2F;
    setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
    setCreativeTab(CreativeTabs.tabDecorations);
  }
  
  protected MyBlockFlower(int par1) {
    this(par1, Material.plants);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    return (super.canPlaceBlockAt(par1World, par2, par3, par4) && canBlockStay(par1World, par2, par3, par4));
  }
  
  protected boolean canPlaceBlockOn(Block par1) {
    return (par1 == Blocks.grass || par1 == Blocks.dirt || par1 == Blocks.farmland || par1 == OreSpawnMain.CrystalGrass);
  }
  
  public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5) {
    super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
    checkFlowerChange(par1World, par2, par3, par4);
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    checkFlowerChange(par1World, par2, par3, par4);
  }
  
  protected final void checkFlowerChange(World par1World, int par2, int par3, int par4) {
    if (!canBlockStay(par1World, par2, par3, par4)) {
      dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
      par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
      return;
    } 
    long t = par1World.getWorldTime();
    t %= 24000L;
    if (t > 12000L) {
      if (this == OreSpawnMain.MyFlowerPinkBlock)
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyFlowerBlackBlock); 
      if (this == OreSpawnMain.MyFlowerBlueBlock)
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyFlowerScaryBlock); 
    } else {
      if (this == OreSpawnMain.MyFlowerBlackBlock)
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyFlowerPinkBlock); 
      if (this == OreSpawnMain.MyFlowerScaryBlock)
        par1World.setBlock(par2, par3, par4, OreSpawnMain.MyFlowerBlueBlock); 
    } 
  }
  
  public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_) {
    return p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_).canSustainPlant((IBlockAccess)p_149718_1_, p_149718_2_, p_149718_3_ - 1, p_149718_4_, ForgeDirection.UP, this);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
    return null;
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public int getRenderType() {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
  
  public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
    return EnumPlantType.Plains;
  }
  
  public Block getPlant(IBlockAccess world, int x, int y, int z) {
    return this;
  }
  
  public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
    return world.getBlockMetadata(x, y, z);
  }
}
