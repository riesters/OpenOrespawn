package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCreeperLauncher extends Item {
  public ItemCreeperLauncher(int i) {
    setCreativeTab(CreativeTabs.tabRedstone);
    setMaxDamage(1);
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (entity != null && entity instanceof net.minecraft.entity.monster.EntityCreeper) {
      for (int var3 = 0; var3 < 6; var3++) {
        float f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        float f2 = 0.25F + player.worldObj.rand.nextFloat() * 6.0F;
        float f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        player.worldObj.spawnParticle("smoke", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, (f2 / 4.0F), 0.0D);
        f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 6.0F;
        f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        player.worldObj.spawnParticle("explode", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, (f2 / 4.0F), 0.0D);
        f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 6.0F;
        f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
        player.worldObj.spawnParticle("reddust", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, (f2 / 4.0F), 0.0D);
      } 
      player.worldObj.playSoundAtEntity((Entity)player, "fireworks.launch", 2.0F, 1.2F);
      EntityLiving e = (EntityLiving)entity;
      e.addVelocity(0.0D, 4.5D, 0.0D);
    } else {
      return false;
    } 
    if (!player.capabilities.isCreativeMode)
      stack.stackSize--; 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
