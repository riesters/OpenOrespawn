package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;
import net.minecraft.client.renderer.texture.*;

public class CrystalGrass extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_94364_a;
    
    protected CrystalGrass(final float f1, final float f2) {
        super(Material.grass);
        this.setHardness(f1);
        this.setResistance(f2);
        this.setTickRandomly(false);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int par1, final int par2) {
        if (this.field_94364_a == null) {
            return null;
        }
        return (par1 == 1) ? this.field_94364_a[0] : ((par1 == 0) ? this.field_94364_a[1] : this.field_94364_a[2]);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getBlockTexture(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4, final int par5) {
        if (this.field_94364_a == null) {
            return null;
        }
        if (par5 == 1) {
            return this.field_94364_a[0];
        }
        if (par5 == 0) {
            return this.field_94364_a[1];
        }
        return this.field_94364_a[2];
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return Item.getItemFromBlock(this);
    }
    
    public boolean canSustainPlant(final IBlockAccess world, final int x, final int y, final int z, final ForgeDirection direction, final IPlantable plant) {
        return true;
    }
    
    public boolean isOpaqueCube() {
        return OreSpawnMain.current_dimension == OreSpawnMain.DimensionID5;
    }
    
    public boolean renderAsNormalBlock() {
        return OreSpawnMain.current_dimension == OreSpawnMain.DimensionID5;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        (this.field_94364_a = new IIcon[3])[0] = par1IIconRegister.registerIcon("OreSpawn:crystalgrass_top");
        this.field_94364_a[1] = par1IIconRegister.registerIcon("OreSpawn:crystalgrass_bottom");
        this.field_94364_a[2] = par1IIconRegister.registerIcon("OreSpawn:crystalgrass_side");
    }
}
