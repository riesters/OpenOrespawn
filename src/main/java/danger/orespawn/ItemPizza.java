package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPizza extends Item {
  private Block spawnID;
  
  public ItemPizza(int par1, Block par2Block) {
    this.spawnID = par2Block;
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
    Block i1 = par3World.getBlock(par4, par5, par6);
    if (i1 == Blocks.snow && (par3World.getBlockMetadata(par4, par5, par6) & 0x7) < 1) {
      par7 = 1;
    } else if (i1 != Blocks.vine && i1 != Blocks.tallgrass && i1 != Blocks.deadbush) {
      if (par7 == 0)
        par5--; 
      if (par7 == 1)
        par5++; 
      if (par7 == 2)
        par6--; 
      if (par7 == 3)
        par6++; 
      if (par7 == 4)
        par4--; 
      if (par7 == 5)
        par4++; 
    } 
    if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
      return false; 
    if (par1ItemStack.stackSize == 0)
      return false; 
    if (par3World.canPlaceEntityOnSide(this.spawnID, par4, par5, par6, false, par7, (Entity)null, par1ItemStack)) {
      int j1 = this.spawnID.onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, 0);
      if (par3World.setBlock(par4, par5, par6, this.spawnID, j1, 3)) {
        if (par3World.getBlock(par4, par5, par6) == this.spawnID) {
          this.spawnID.onBlockPlacedBy(par3World, par4, par5, par6, (EntityLivingBase)par2EntityPlayer, par1ItemStack);
          this.spawnID.onPostBlockPlaced(par3World, par4, par5, par6, j1);
        } 
        par3World.playSoundEffect((par4 + 0.5F), (par5 + 0.5F), (par6 + 0.5F), this.spawnID.stepSound.getStepResourcePath(), (this.spawnID.stepSound.getVolume() + 1.0F) / 2.0F, this.spawnID.stepSound.getPitch() * 0.8F);
        par1ItemStack.stackSize--;
      } 
    } 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
