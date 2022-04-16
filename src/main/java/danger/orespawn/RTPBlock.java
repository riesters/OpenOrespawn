package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class RTPBlock extends Block {
  public RTPBlock(int i) {
    super(Material.rock);
    setCreativeTab(CreativeTabs.tabBlock);
  }
  
  public void onEntityWalking(World world, int par2, int par3, int par4, Entity par5Entity) {
    if (par5Entity instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par5Entity;
      EntityPlayerMP mp = null;
      if (par5Entity instanceof EntityPlayerMP)
        mp = (EntityPlayerMP)par5Entity; 
      int x = par2, y = par3, z = par4, found = 0;
      for (int tries = 0; tries < 1000 && found == 0; tries++) {
        if (world.rand.nextInt(2) == 0) {
          x = par2 + 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
        } else {
          x = par2 - 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
        } 
        if (world.rand.nextInt(2) == 0) {
          z = par4 + 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
        } else {
          z = par4 - 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
        } 
        for (y = par3 - 4; y <= par3 + 4; y++) {
          if (world.getBlock(x, y - 1, z).getMaterial().isSolid() && 
            world.getBlock(x, y, z) == Blocks.air && 
            world.getBlock(x, y + 1, z) == Blocks.air) {
            found = 1;
            break;
          } 
        } 
      } 
      if (found != 0) {
        if (mp != null) {
          mp.playerNetServerHandler.setPlayerLocation((x + 0.5F), y, (z + 0.5F), p.rotationYaw, 0.0F);
        } else {
          p.setLocationAndAngles((x + 0.5F), y, (z + 0.5F), p.rotationYaw, 0.0F);
        } 
        for (int var3 = 0; var3 < 6; var3++) {
          world.spawnParticle("smoke", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
          world.spawnParticle("explode", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
          world.spawnParticle("reddust", (x + 0.5F), (y + 2.25F), (z + 0.5F), 0.0D, 0.0D, 0.0D);
        } 
        p.worldObj.playSoundAtEntity((Entity)p, "random.explode", 1.0F, 1.5F);
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister) {
    this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
