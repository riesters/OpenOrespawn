package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class CreeperRepellent extends BlockTorch {
  public CreeperRepellent(int par1) {
    setCreativeTab(CreativeTabs.tabRedstone);
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int var6 = par1World.getBlockMetadata(par2, par3, par4);
    double var7 = (par2 + 0.5F);
    double var9 = (par3 + 0.7F);
    double var11 = (par4 + 0.5F);
    double var13 = 0.413D;
    double var15 = 0.271D;
    if (var6 == 1) {
      par1World.spawnParticle("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
    } else if (var6 == 2) {
      par1World.spawnParticle("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
    } else if (var6 == 3) {
      par1World.spawnParticle("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
    } else if (var6 == 4) {
      par1World.spawnParticle("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
    } else {
      par1World.spawnParticle("smoke", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7, var9 + 0.21D, var11, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  public int tickRate(World par1World) {
    return 10;
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (!par1World.isRemote) {
      findSomethingToRepell(par1World, par2, par3, par4);
      par1World.scheduleBlockUpdate(par2, par3, par4, (Block)this, tickRate(par1World));
    } 
  }
  
  public void onBlockAdded(World world, int x, int y, int z) {
    world.scheduleBlockUpdate(x, y, z, (Block)this, tickRate(world));
  }
  
  public void onNeighborBlockChange(World world, int x, int y, int z, Block blockId) {
    world.scheduleBlockUpdate(x, y, z, (Block)this, tickRate(world));
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    return super.canPlaceBlockAt(par1World, par2, par3, par4);
  }
  
  private void findSomethingToRepell(World par1World, int par2, int par3, int par4) {
    AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(par2 - 20.0D, par3 - 10.0D, par4 - 20.0D, par2 + 20.0D, par3 + 10.0D, par4 + 20.0D);
    List var5 = par1World.getEntitiesWithinAABB(EntityLivingBase.class, bb);
    Iterator<EntityLivingBase> var2 = var5.iterator();
    EntityLivingBase var3 = null;
    while (var2.hasNext()) {
      var3 = var2.next();
      if (var3 != null && var3 instanceof net.minecraft.entity.monster.EntityCreeper) {
        double d1 = var3.posX - par2;
        double d2 = var3.posY - par3;
        double d3 = var3.posZ - par4;
        double f = d1 * d1 + d2 * d2 + d3 * d3;
        f = Math.sqrt(f);
        f = 20.0D - f;
        if (f > 20.0D)
          f = 20.0D; 
        if (f < 0.0D)
          f = 0.0D; 
        f *= 0.4D;
        double d = (float)Math.atan2(var3.posX - par2, var3.posZ - par4);
        var3.motionX += f * Math.sin(d);
        var3.motionZ += f * Math.cos(d);
      } 
      if (var3 != null && var3 instanceof EntityAnt) {
        double d1 = var3.posX - par2;
        double d2 = var3.posY - par3;
        double d3 = var3.posZ - par4;
        double f = d1 * d1 + d2 * d2 + d3 * d3;
        f = Math.sqrt(f);
        f = 20.0D - f;
        if (f > 20.0D)
          f = 20.0D; 
        if (f < 0.0D)
          f = 0.0D; 
        f *= 0.4D;
        double d = (float)Math.atan2(var3.posX - par2, var3.posZ - par4);
        var3.motionX += f * Math.sin(d);
        var3.motionZ += f * Math.cos(d);
      } 
      if (var3 != null && var3 instanceof PurplePower) {
        PurplePower p = (PurplePower)var3;
        if (p.getPurpleType() == 10)
          return; 
        double d1 = var3.posX - par2;
        double d2 = var3.posY - par3;
        double d3 = var3.posZ - par4;
        double f = d1 * d1 + d2 * d2 + d3 * d3;
        f = Math.sqrt(f);
        f = 20.0D - f;
        if (f > 20.0D)
          f = 20.0D; 
        if (f < 0.0D)
          f = 0.0D; 
        f *= 0.4D;
        double d = (float)Math.atan2(var3.posX - par2, var3.posZ - par4);
        var3.motionX += f * Math.sin(d);
        var3.motionZ += f * Math.cos(d);
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
