package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSpiderRobotKit extends Item {
  public ItemSpiderRobotKit(int i) {
    this.maxStackSize = 1;
    setCreativeTab(CreativeTabs.tabTools);
    if (i == OreSpawnMain.BaseItemID + 471) {
      setMaxDamage(OreSpawnMain.SpiderRobot_stats.health);
    } else {
      setMaxDamage(OreSpawnMain.AntRobot_stats.health);
    } 
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
    if (par3World.isRemote)
      return true; 
    String name = null;
    name = "Robot Spider";
    if (par1ItemStack.getItem() == OreSpawnMain.AntRobotKit)
      name = "Robot Red Ant"; 
    Entity ent = spawnCreature(par3World, 0, name, par4 + 0.5D, par5 + 1.01D, par6 + 0.5D);
    if (ent != null) {
      EntityLiving e = (EntityLiving)ent;
      e.setHealth((getMaxDamage() - getDamage(par1ItemStack)));
      if (ent instanceof EntityLiving && par1ItemStack.hasDisplayName())
        ((EntityLiving)ent).setCustomNameTag(par1ItemStack.getDisplayName()); 
      par3World.playSoundAtEntity((Entity)par2EntityPlayer, "random.explode", 1.0F, par3World.rand.nextFloat() * 0.2F + 0.9F);
      if (ent instanceof AntRobot) {
        AntRobot a = (AntRobot)ent;
        a.setOwned();
      } 
    } 
    if (!par2EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    return true;
  }
  
  public static Entity spawnCreature(World par0World, int par1, String name, double par2, double par4, double par6) {
    Entity var8 = null;
    if (name == null) {
      var8 = EntityList.createEntityByID(par1, par0World);
    } else {
      var8 = EntityList.createEntityByName(name, par0World);
    } 
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
