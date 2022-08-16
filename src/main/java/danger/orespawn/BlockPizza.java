package danger.orespawn;

import net.minecraft.block.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraft.item.*;

public class BlockPizza extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon pizzaTopIcon;
    @SideOnly(Side.CLIENT)
    private IIcon pizzaBottomIcon;
    @SideOnly(Side.CLIENT)
    private IIcon field_94382_c;
    
    protected BlockPizza() {
        super(Material.cake);
        this.setTickRandomly(true);
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4) {
        final int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        final float f = 0.0625f;
        final float f2 = (1 + l * 2) / 16.0f;
        final float f3 = 0.25f;
        this.setBlockBounds(f2, 0.0f, f, 1.0f - f, f3, 1.0f - f);
    }
    
    public void setBlockBoundsForItemRender() {
        final float f = 0.0625f;
        final float f2 = 0.25f;
        this.setBlockBounds(f, 0.0f, f, 1.0f - f, f2, 1.0f - f);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        final int l = par1World.getBlockMetadata(par2, par3, par4);
        final float f = 0.0625f;
        final float f2 = (1 + l * 2) / 16.0f;
        final float f3 = 0.25f;
        return AxisAlignedBB.getBoundingBox(par2 + f2, par3, par4 + f, par2 + 1 - f, par3 + f3 - f, par4 + 1 - f);
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        final int l = par1World.getBlockMetadata(par2, par3, par4);
        final float f = 0.0625f;
        final float f2 = (1 + l * 2) / 16.0f;
        final float f3 = 0.25f;
        return AxisAlignedBB.getBoundingBox(par2 + f2, par3, par4 + f, par2 + 1 - f, par3 + f3, par4 + 1 - f);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int par1, final int par2) {
        return (par1 == 1) ? this.pizzaTopIcon : ((par1 == 0) ? this.pizzaBottomIcon : ((par2 > 0 && par1 == 4) ? this.field_94382_c : this.blockIcon));
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        this.blockIcon = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_side");
        this.field_94382_c = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_inner");
        this.pizzaTopIcon = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_top");
        this.pizzaBottomIcon = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_bottom");
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean onBlockActivated(final World par1World, final int par2, final int par3, final int par4, final EntityPlayer par5EntityPlayer, final int par6, final float par7, final float par8, final float par9) {
        this.eatPizzaSlice(par1World, par2, par3, par4, par5EntityPlayer);
        return true;
    }
    
    public void onBlockClicked(final World par1World, final int par2, final int par3, final int par4, final EntityPlayer par5EntityPlayer) {
        this.eatPizzaSlice(par1World, par2, par3, par4, par5EntityPlayer);
    }
    
    private void eatPizzaSlice(final World par1World, final int par2, final int par3, final int par4, final EntityPlayer par5EntityPlayer) {
        if (par5EntityPlayer.canEat(false)) {
            par5EntityPlayer.getFoodStats().addStats(4, 0.2f);
            final int l = par1World.getBlockMetadata(par2, par3, par4) + 1;
            if (l >= 6) {
                par1World.setBlockToAir(par2, par3, par4);
            }
            else {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
            }
        }
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && this.canBlockStay(par1World, par2, par3, par4);
    }

    public boolean canBlockStay(final World par1World, final int par2, final int par3, final int par4) {
        return par1World.getBlock(par2, par3 - 1, par4).isNormalCube();
    }
    
    public int quantityDropped(final Random par1Random) {
        return 0;
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return OreSpawnMain.MyPizzaItem;
    }
}
