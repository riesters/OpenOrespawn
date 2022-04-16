package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDuctTape extends Block {
  @SideOnly(Side.CLIENT)
  private IIcon DuctTapeTopIcon;
  
  @SideOnly(Side.CLIENT)
  private IIcon DuctTapeBottomIcon;
  
  @SideOnly(Side.CLIENT)
  private IIcon field_94382_c;
  
  protected BlockDuctTape(int par1) {
    super(Material.anvil);
    setTickRandomly(true);
  }
  
  public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
    int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.25F;
    setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
  }
  
  public void setBlockBoundsForItemRender() {
    float f = 0.0625F;
    float f1 = 0.25F;
    setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
    int l = par1World.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.25F;
    return AxisAlignedBB.getBoundingBox((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2 - f), ((par4 + 1) - f));
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
    int l = par1World.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.25F;
    return AxisAlignedBB.getBoundingBox((par2 + f1), par3, (par4 + f), ((par2 + 1) - f), (par3 + f2), ((par4 + 1) - f));
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2) {
    return (par1 == 1) ? this.DuctTapeTopIcon : ((par1 == 0) ? this.DuctTapeBottomIcon : ((par2 > 0 && par1 == 4) ? this.field_94382_c : this.blockIcon));
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IconRegister) {
    this.blockIcon = par1IconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_side");
    this.field_94382_c = par1IconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_inner");
    this.DuctTapeTopIcon = par1IconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_top");
    this.DuctTapeBottomIcon = par1IconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_bottom");
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    eatDuctTapeSlice(par1World, par2, par3, par4, par5EntityPlayer);
    return true;
  }
  
  public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
    eatDuctTapeSlice(par1World, par2, par3, par4, par5EntityPlayer);
  }
  
  private void eatDuctTapeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
    if (par5EntityPlayer != null) {
      ItemStack var2 = par5EntityPlayer.inventory.getCurrentItem();
      if (var2 != null && 
        var2.stackSize == 1) {
        int cd = var2.getMaxDamage();
        int fd = 0;
        if (cd > 0) {
          cd /= 6;
          if (cd < 1)
            cd = 1; 
          fd = var2.getItemDamage();
          if (fd > 0) {
            if (fd > cd) {
              fd -= cd;
            } else {
              fd = 0;
            } 
            var2.setItemDamage(fd);
            int l = par1World.getBlockMetadata(par2, par3, par4) + 1;
            if (l >= 6) {
              par1World.setBlockToAir(par2, par3, par4);
            } else {
              par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
            } 
          } 
        } 
      } 
    } 
  }
  
  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
    return !super.canPlaceBlockAt(par1World, par2, par3, par4) ? false : canBlockStay(par1World, par2, par3, par4);
  }
  
  public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
    if (!canBlockStay(par1World, par2, par3, par4))
      par1World.setBlockToAir(par2, par3, par4); 
  }
  
  public boolean canBlockStay(World par1World, int par2, int par3, int par4) {
    return par1World.getBlock(par2, par3 - 1, par4).getMaterial().isSolid();
  }
  
  public int quantityDropped(Random par1Random) {
    return 0;
  }
  
  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
    return null;
  }
  
  @SideOnly(Side.CLIENT)
  public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
    return OreSpawnMain.MyDuctTapeItem;
  }
}
