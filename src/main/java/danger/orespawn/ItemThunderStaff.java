package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemThunderStaff extends Item {
  private int ticker = 50;
  
  public ItemThunderStaff(int i) {
    this.maxStackSize = 1;
    setMaxDamage(50);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    if (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() <= 1)
      return par1ItemStack; 
    double xzoff = 1.0D;
    double yoff = 1.55D;
    ThunderBolt lb = new ThunderBolt(par2World, (EntityLivingBase)par3EntityPlayer);
    lb.setLocationAndAngles(par3EntityPlayer.posX - xzoff * Math.sin(Math.toRadians((par3EntityPlayer.rotationYawHead + 45.0F))), par3EntityPlayer.posY + yoff, par3EntityPlayer.posZ + xzoff * Math.cos(Math.toRadians((par3EntityPlayer.rotationYawHead + 45.0F))), par3EntityPlayer.rotationYawHead, par3EntityPlayer.rotationPitch);
    lb.motionX *= 3.0D;
    lb.motionY *= 3.0D;
    lb.motionZ *= 3.0D;
    par2World.spawnEntityInWorld((Entity)lb);
    par3EntityPlayer.swingItem();
    par3EntityPlayer.addVelocity(Math.cos(Math.toRadians((par3EntityPlayer.rotationYawHead - 90.0F))) * 0.5D, 0.15D, Math.sin(Math.toRadians((par3EntityPlayer.rotationYawHead - 90.0F))) * 0.5D);
    par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityPlayer);
    return par1ItemStack;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World world, Entity par3Entity, int par4, boolean par5) {
    if (world.isRaining() && 
      world.isThundering()) {
      if (this.ticker > 0)
        this.ticker--; 
      if (this.ticker <= 0 && 
        par1ItemStack.getItemDamage() > 0) {
        par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1);
        this.ticker = 50;
      } 
    } 
  }
  
  public String getMaterialName() {
    return "Unknown";
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
