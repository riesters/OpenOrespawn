package danger.orespawn;

import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.texture.*;

public class AntBlock extends BlockGrass
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_94364_a;
    
    protected AntBlock() {
        this.setTickRandomly(true);
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
    public IIcon getIcon(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4, final int par5) {
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
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        int howmany;
        if (!par1World.isRemote) {
            if (par1World.isRaining()) {
                return;
            }
            final Block bid = par1World.getBlock(par2, par3 + 1, par4);
            if (bid == Blocks.air) {
                howmany = OreSpawnMain.OreSpawnRand.nextInt(6) + 2;
                for (int i = 0; i < howmany; ++i) {
                    if (this == OreSpawnMain.MyAntBlock) {
                        if (OreSpawnMain.BlackAntEnable != 0) {
                            spawnCreature(par1World, "Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.MyRedAntBlock) {
                        if (OreSpawnMain.RedAntEnable != 0) {
                            spawnCreature(par1World, "Red Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.MyUnstableAntBlock) {
                        if (OreSpawnMain.UnstableAntEnable != 0) {
                            spawnCreature(par1World, "Unstable Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.TermiteBlock) {
                        if (OreSpawnMain.TermiteEnable != 0) {
                            spawnCreature(par1World, "Termite", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (OreSpawnMain.RainbowAntEnable != 0) {
                        spawnCreature(par1World, "Rainbow Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                    }
                }
            }
        }
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return Item.getItemFromBlock(this);
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8;
        var8 = EntityList.createEntityByName(par1, par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    @SideOnly(Side.CLIENT)
    public int getBlockColor() {
        final double var1 = 0.5;
        final double var2 = 1.0;
        return ColorizerGrass.getGrassColor(var1, var2);
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderColor(final int par1) {
        return this.getBlockColor();
    }
    
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(final IBlockAccess p_149720_1_, final int p_149720_2_, final int p_149720_3_, final int p_149720_4_) {
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        for (int k1 = -1; k1 <= 1; ++k1) {
            for (int l2 = -1; l2 <= 1; ++l2) {
                final int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l2, p_149720_4_ + k1).getBiomeGrassColor(p_149720_2_ + l2, p_149720_3_, p_149720_4_ + k1);
                l += (i2 & 0xFF0000) >> 16;
                i1 += (i2 & 0xFF00) >> 8;
                j1 += (i2 & 0xFF);
            }
        }
        return (l / 9 & 0xFF) << 16 | (i1 / 9 & 0xFF) << 8 | (j1 / 9 & 0xFF);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        (this.field_94364_a = new IIcon[3])[0] = par1IIconRegister.registerIcon("OreSpawn:antnest_top");
        this.field_94364_a[1] = par1IIconRegister.registerIcon("OreSpawn:antnest_bottom");
        this.field_94364_a[2] = par1IIconRegister.registerIcon("OreSpawn:antnest_side");
    }
}
