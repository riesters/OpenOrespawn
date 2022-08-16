package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class OreBasicStone extends Block
{
    public OreBasicStone(final float f1, final float f2) {
        super(Material.rock);
        this.setHardness(f1);
        this.setResistance(f2);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTickRandomly(false);
    }
    
    public void onBlockDestroyedByPlayer(final World par1World, final int par2, final int par3, final int par4, final int par5) {
        if (!par1World.isRemote && this == OreSpawnMain.CrystalRat) {
            for (int num = 1 + par1World.rand.nextInt(10), i = 0; i < num; ++i) {
                spawnCreature(par1World, 0, "Rat", par2 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2, par3 + 0.01, par4 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2);
            }
        }
        if (!par1World.isRemote && this == OreSpawnMain.CrystalFairy) {
            for (int num = 1 + par1World.rand.nextInt(6), i = 0; i < num; ++i) {
                spawnCreature(par1World, 0, "Fairy", par2 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2, par3 + 0.01, par4 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2);
            }
        }
        if (!par1World.isRemote && this == OreSpawnMain.RedAntTroll) {
            for (int num = 15 + par1World.rand.nextInt(6), i = 0; i < num; ++i) {
                spawnCreature(par1World, 0, "Red Ant", par2 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2, par3 + 0.01, par4 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2);
            }
        }
        if (!par1World.isRemote && this == OreSpawnMain.TermiteTroll) {
            for (int num = 15 + par1World.rand.nextInt(6), i = 0; i < num; ++i) {
                spawnCreature(par1World, 0, "Termite", par2 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2, par3 + 0.01, par4 + 0.5 + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.2);
            }
        }
        super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
    }

    public boolean isOpaqueCube() {
        return OreSpawnMain.current_dimension == OreSpawnMain.DimensionID5;
    }
    
    public boolean renderAsNormalBlock() {
        return OreSpawnMain.current_dimension == OreSpawnMain.DimensionID5;
    }
    
    public static Entity spawnCreature(final World par0World, final int par1, final String name, final double par2, final double par4, final double par6) {
        Entity var8;
        if (name == null) {
            var8 = EntityList.createEntityByID(par1, par0World);
        }
        else {
            var8 = EntityList.createEntityByName(name, par0World);
        }
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
