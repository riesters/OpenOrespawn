package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class FairySword extends ItemSword {
  private int weaponDamage;
  
  private final Item.ToolMaterial toolMaterial;
  
  public FairySword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
    super(par2EnumToolMaterial);
    this.toolMaterial = par2EnumToolMaterial;
    this.weaponDamage = 15;
    this.maxStackSize = 1;
    setMaxDamage(1300);
    setCreativeTab(CreativeTabs.tabCombat);
  }
  
  public String getMaterialName() {
    return "Fairy";
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
    int var2 = 5;
    if (par2EntityLiving != null && 
      !par2EntityLiving.worldObj.isRemote) {
      int num = 1 + par2EntityLiving.worldObj.rand.nextInt(3);
      for (int i = 0; i < num; i++) {
        Fairy r = null;
        r = (Fairy)spawnCreature(par2EntityLiving.worldObj, 0, "Fairy", par2EntityLiving.posX + (par2EntityLiving.worldObj.rand.nextFloat() - par2EntityLiving.worldObj.rand.nextFloat()) * 0.5D, par2EntityLiving.posY + par2EntityLiving.worldObj.rand.nextFloat() + 0.01D, par2EntityLiving.posZ + (par2EntityLiving.worldObj.rand.nextFloat() - par2EntityLiving.worldObj.rand.nextFloat()) * 0.5D);
        if (r != null)
          r.setOwner(par3EntityLiving); 
      } 
    } 
    par1ItemStack.damageItem(1, par3EntityLiving);
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
  
  public int getMaxItemUseDuration(ItemStack par1ItemStack) {
    return 3000;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
