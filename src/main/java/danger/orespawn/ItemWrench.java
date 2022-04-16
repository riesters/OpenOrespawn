package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWrench extends Item {
  public ItemWrench(int i) {
    setCreativeTab(CreativeTabs.tabTools);
    setMaxDamage(100);
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (entity != null && entity instanceof SpiderRobot && entity.riddenByEntity == null) {
      EntityLiving e = (EntityLiving)entity;
      float h = e.getMaxHealth() - e.getHealth();
      e.setDead();
      dropItem(player.worldObj, e, OreSpawnMain.SpiderRobotKit, 1, (int)h);
      for (int var3 = 0; var3 < 8; var3++) {
        float f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        float f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        float f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("smoke", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
        f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("explode", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
        f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("reddust", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
      } 
      player.worldObj.playSoundAtEntity((Entity)player, "random.explode", 0.5F, 1.5F);
    } else if (entity != null && entity instanceof AntRobot && entity.riddenByEntity == null) {
      AntRobot e = (AntRobot)entity;
      if (e.getOwned() == 0) {
        if (e.getHealth() / e.getMaxHealth() > 0.5F)
          return false; 
        e.setOwned();
      } 
      float h = e.getMaxHealth() - e.getHealth();
      e.setDead();
      dropItem(player.worldObj, e, OreSpawnMain.AntRobotKit, 1, (int)h);
      for (int var3 = 0; var3 < 8; var3++) {
        float f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        float f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        float f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("smoke", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
        f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("explode", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
        f1 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        f2 = 0.25F + player.worldObj.rand.nextFloat() * 2.0F;
        f3 = player.worldObj.rand.nextFloat() * 3.0F - player.worldObj.rand.nextFloat() * 3.0F;
        player.worldObj.spawnParticle("reddust", ((float)entity.posX + f1), ((float)entity.posY + f2), ((float)entity.posZ + f3), 0.0D, 0.0D, 0.0D);
      } 
      player.worldObj.playSoundAtEntity((Entity)player, "random.explode", 0.5F, 1.5F);
    } else {
      return false;
    } 
    stack.damageItem(2, (EntityLivingBase)player);
    if (stack.stackSize <= 0)
      player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null); 
    return true;
  }
  
  private void dropItem(World world, EntityLiving e, Item index, int par1, int par2) {
    if (world.isRemote)
      return; 
    ItemStack is = new ItemStack(index, par1, 0);
    is.setItemDamage(par2);
    EntityItem var3 = new EntityItem(world, e.posX, e.posY + 1.0D, e.posZ, is);
    world.spawnEntityInWorld((Entity)var3);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
