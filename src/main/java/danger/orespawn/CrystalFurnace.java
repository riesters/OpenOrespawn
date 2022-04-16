package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CrystalFurnace extends BlockContainer {
  private final Random furnaceRand = new Random();
  
  private final boolean isActive;
  
  private static boolean keepFurnaceInventory;
  
  @SideOnly(Side.CLIENT)
  private IIcon furnaceIconTop;
  
  @SideOnly(Side.CLIENT)
  private IIcon furnaceIconFront;
  
  protected CrystalFurnace(int par1, boolean par2, float f1, float f2) {
    super(Material.rock);
    this.isActive = par2;
    if (!par2) {
      setCreativeTab(CreativeTabs.tabDecorations);
    } else {
      setLightLevel(0.6F);
    } 
    setHardness(f1);
    setResistance(f2);
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public Item getItemDropped(int par1, Random par2Random, int par3) {
    return Item.getItemFromBlock((Block)OreSpawnMain.CrystalFurnaceBlock);
  }
  
  @SideOnly(Side.CLIENT)
  public Item idPicked(World par1World, int par2, int par3, int par4) {
    return Item.getItemFromBlock((Block)OreSpawnMain.CrystalFurnaceBlock);
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2) {
    return (par1 == 1) ? this.furnaceIconTop : ((par1 == 0) ? this.furnaceIconTop : ((par1 != par2) ? this.blockIcon : this.furnaceIconFront));
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IIconRegister) {
    this.blockIcon = par1IIconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_side");
    this.furnaceIconFront = par1IIconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + (this.isActive ? "_front_off" : "_front_off"));
    this.furnaceIconTop = par1IIconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5) + "_top");
  }
  
  public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4) {
    int l = par1World.getBlockMetadata(par2, par3, par4);
    TileEntity tileentity = par1World.getTileEntity(par2, par3, par4);
    keepFurnaceInventory = true;
    if (par0) {
      par1World.setBlock(par2, par3, par4, OreSpawnMain.CrystalFurnaceOnBlock);
    } else {
      par1World.setBlock(par2, par3, par4, (Block)OreSpawnMain.CrystalFurnaceBlock);
    } 
    keepFurnaceInventory = false;
    par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    if (tileentity != null) {
      tileentity.validate();
      par1World.setTileEntity(par2, par3, par4, tileentity);
    } 
  }
  
  public void onBlockAdded(World par1World, int par2, int par3, int par4) {
    super.onBlockAdded(par1World, par2, par3, par4);
    setDefaultDirection(par1World, par2, par3, par4);
  }
  
  private void setDefaultDirection(World par1World, int par2, int par3, int par4) {
    if (!par1World.isRemote) {
      Block l = par1World.getBlock(par2, par3, par4 - 1);
      Block i1 = par1World.getBlock(par2, par3, par4 + 1);
      Block j1 = par1World.getBlock(par2 - 1, par3, par4);
      Block k1 = par1World.getBlock(par2 + 1, par3, par4);
      byte b0 = 3;
      if (l.func_149730_j() && !i1.func_149730_j())
        b0 = 3; 
      if (i1.func_149730_j() && !l.func_149730_j())
        b0 = 2; 
      if (j1.func_149730_j() && !k1.func_149730_j())
        b0 = 5; 
      if (k1.func_149730_j() && !j1.func_149730_j())
        b0 = 4; 
      par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
    } 
  }
  
  public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    if (par1World.isRemote)
      return true; 
    TileEntityCrystalFurnace tileentitycrystalfurnace = (TileEntityCrystalFurnace)par1World.getTileEntity(par2, par3, par4);
    if (tileentitycrystalfurnace != null)
      par5EntityPlayer.openGui(OreSpawnMain.instance, 0, par1World, par2, par3, par4); 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    if (this.isActive) {
      int l = par1World.getBlockMetadata(par2, par3, par4);
      float f = par2 + 0.5F;
      float f1 = par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
      float f2 = par4 + 0.5F;
      float f3 = par5Random.nextFloat() * 0.6F - 0.3F;
      float f4 = par5Random.nextFloat() * 0.6F - 0.3F;
      if (l == 4) {
        par1World.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
        par1World.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
      } else if (l == 5) {
        par1World.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
        par1World.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
      } else if (l == 2) {
        par1World.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
        par1World.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
      } else if (l == 3) {
        par1World.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
        par1World.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
    int l = MathHelper.floor_double((par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (l == 0)
      par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2); 
    if (l == 1)
      par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2); 
    if (l == 2)
      par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2); 
    if (l == 3)
      par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2); 
    if (par6ItemStack.hasDisplayName())
      ((TileEntityCrystalFurnace)par1World.getTileEntity(par2, par3, par4)).func_145951_a(par6ItemStack.getDisplayName()); 
  }
  
  public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6) {
    if (!keepFurnaceInventory) {
      TileEntityCrystalFurnace tileentitycrystalfurnace = (TileEntityCrystalFurnace)par1World.getTileEntity(par2, par3, par4);
      if (tileentitycrystalfurnace != null) {
        for (int j1 = 0; j1 < tileentitycrystalfurnace.getSizeInventory(); j1++) {
          ItemStack itemstack = tileentitycrystalfurnace.getStackInSlot(j1);
          if (itemstack != null) {
            float f = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
            float f1 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
            float f2 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
            while (itemstack.stackSize > 0) {
              int k1 = this.furnaceRand.nextInt(21) + 10;
              if (k1 > itemstack.stackSize)
                k1 = itemstack.stackSize; 
              itemstack.stackSize -= k1;
              EntityItem entityitem = new EntityItem(par1World, (par2 + f), (par3 + f1), (par4 + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));
              if (itemstack.hasTagCompound())
                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy()); 
              float f3 = 0.05F;
              entityitem.motionX = ((float)this.furnaceRand.nextGaussian() * f3);
              entityitem.motionY = ((float)this.furnaceRand.nextGaussian() * f3 + 0.2F);
              entityitem.motionZ = ((float)this.furnaceRand.nextGaussian() * f3);
              par1World.spawnEntityInWorld((Entity)entityitem);
            } 
          } 
        } 
        par1World.func_147453_f(par2, par3, par4, par5);
      } 
    } 
    super.breakBlock(par1World, par2, par3, par4, par5, par6);
  }
  
  public boolean hasComparatorInputOverride() {
    return true;
  }
  
  public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5) {
    return Container.calcRedstoneFromInventory((IInventory)par1World.getTileEntity(par2, par3, par4));
  }
  
  public TileEntity createNewTileEntity(World var1, int var2) {
    return new TileEntityCrystalFurnace();
  }
}
