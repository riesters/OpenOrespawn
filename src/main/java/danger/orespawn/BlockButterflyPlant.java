package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockButterflyPlant extends BlockCrops {
  @SideOnly(Side.CLIENT)
  private IIcon[] field_94364_a;
  
  public BlockButterflyPlant(int par1) {
    setTickRandomly(true);
  }
  
  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    super.updateTick(par1World, par2, par3, par4, par5Random);
    if (par1World.isRemote)
      return; 
    if (par1World.isRaining())
      return; 
    int rate = par1World.getBlockMetadata(par2, par3, par4);
    rate &= 0x7;
    rate = 7 - rate;
    if (rate > 1 && 
      OreSpawnMain.OreSpawnRand.nextInt(rate) != 0)
      return; 
    Block bid = par1World.getBlock(par2, par3 + 1, par4);
    if (bid == Blocks.air && par1World.isDaytime() && OreSpawnMain.ButterflyEnable != 0)
      spawnCreature(par1World, "Butterfly", par2 + 0.5D, par3 + 1.01D, par4 + 0.5D); 
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
  public IIcon getIcon(int par1, int par2) {
    if (par2 < 7) {
      if (par2 >= 6)
        par2 = 4; 
      return this.field_94364_a[par2 >> 1];
    } 
    return this.field_94364_a[3];
  }
  
  public int quantityDropped(Random par1Random) {
    return 1 + par1Random.nextInt(5);
  }
  
  protected Item func_149866_i() {
    return OreSpawnMain.MyButterflySeed;
  }
  
  protected Item func_149865_P() {
    return null;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IIconRegister) {
    this.field_94364_a = new IIcon[4];
    for (int i = 0; i < this.field_94364_a.length; i++)
      this.field_94364_a[i] = par1IIconRegister.registerIcon("OreSpawn:butterfly_" + i); 
  }
}
