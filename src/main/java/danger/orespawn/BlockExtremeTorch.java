package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockExtremeTorch extends BlockTorch {
  public BlockExtremeTorch(int par1) {
    setCreativeTab(CreativeTabs.tabRedstone);
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    int var6 = par1World.getBlockMetadata(par2, par3, par4);
    double var7 = (par2 + 0.5F);
    double var9 = (par3 + 0.7F);
    double var11 = (par4 + 0.5F);
    double var13 = 0.213D;
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
      par1World.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      par1World.spawnParticle("reddust", var7, var9, var11, 0.0D, 0.0D, 0.0D);
    } 
    onBlockPlacedBy(par1World, par2, par3, par4, (EntityLivingBase)null, (ItemStack)null);
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    return super.canPlaceBlockAt(par1World, par2, par3, par4);
  }
  
  public void onBlockPlacedBy(World world, int par2, int par3, int par4, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
    int x = par2, y = par3, z = par4, found = 0;
    if (world.getBlock(x, y - 1, z) == OreSpawnMain.MyEyeOfEnderBlock) {
      for (int tries = 0; tries < 100 && found == 0; tries++) {
        if (world.rand.nextInt(2) == 0) {
          x = par2 + 4 + world.rand.nextInt(3) - world.rand.nextInt(3);
        } else {
          x = par2 - 4 + world.rand.nextInt(3) - world.rand.nextInt(3);
        } 
        if (world.rand.nextInt(2) == 0) {
          z = par4 + 4 + world.rand.nextInt(3) - world.rand.nextInt(3);
        } else {
          z = par4 - 4 + world.rand.nextInt(3) - world.rand.nextInt(3);
        } 
        for (y = par3 - 2; y <= par3 + 2; y++) {
          if (world.getBlock(x, y - 1, z).getMaterial().isSolid() && 
            world.getBlock(x, y, z) == Blocks.air && 
            world.getBlock(x, y + 1, z) == Blocks.air) {
            found = 1;
            break;
          } 
        } 
      } 
      if (found != 0) {
        if (!world.isRemote) {
          Entity ent = null;
          ent = spawnCreature(world, "Cephadrome", x + 0.5D, y + 0.01D, z + 0.5D);
        } else {
          for (int var3 = 0; var3 < 16; var3++) {
            world.spawnParticle("smoke", (par2 + world.rand.nextFloat() - world.rand.nextFloat()), (par3 + world.rand.nextFloat()), (par4 + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
            world.spawnParticle("explode", (par2 + world.rand.nextFloat() - world.rand.nextFloat()), (par3 + world.rand.nextFloat()), (par4 + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
            world.spawnParticle("reddust", (par2 + world.rand.nextFloat() - world.rand.nextFloat()), (par3 + world.rand.nextFloat()), (par4 + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
          } 
        } 
        if (par5EntityLiving != null) {
          par5EntityLiving.worldObj.playSoundAtEntity((Entity)par5EntityLiving, "random.explode", 1.0F, world.rand.nextFloat() * 0.2F + 0.9F);
        } else {
          world.playSound(par2, par3, par4, "random.explode", 1.0F, world.rand.nextFloat() * 0.2F + 0.9F, false);
        } 
        world.setBlock(par2, par3, par4, Blocks.air);
      } 
    } 
    super.onBlockPlacedBy(world, par2, par3, par4, par5EntityLiving, par6ItemStack);
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
