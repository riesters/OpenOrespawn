package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ExperienceCatcher extends Item
{
    public ExperienceCatcher() {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World world, final int x, final int y, final int z, final int par7, final float par8, final float par9, final float par10) {
        par2EntityPlayer.swingItem();
        System.out.printf("x, y,z, 7,8,9,10 == %d, %d, %d - %d, %f, %f, %f\n", x, y, z, par7, par8, par9, par10);
        if (!par2EntityPlayer.worldObj.isRemote) {
            final AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(x - 0.5 + par8, y, z - 0.5 + par10, x + 0.5 + par8, y + 2.0, z + 0.5 + par10);
            final List var5 = world.getEntitiesWithinAABB(EntityXPOrb.class, bb);
            for (Entity var3 : (Iterable<Entity>) var5) {
                if (var3 instanceof EntityXPOrb) {
                    EntityXPOrb ex = (EntityXPOrb) var3;
                    if (ex.getXpValue() < 3 || world.rand.nextInt(5) == 1)
                        continue;
                    var3.setDead();
                    EntityItem entityItem;
                    ItemStack itemStack = new ItemStack(Items.experience_bottle, 1, 0);
                    entityItem = new EntityItem(par2EntityPlayer.worldObj, (par8 + x), y + 1.0D, (par10 + z), itemStack);
                    par2EntityPlayer.worldObj.spawnEntityInWorld(entityItem);
                    itemStack = new ItemStack(Items.string, 1, 0);
                    entityItem = new EntityItem(par2EntityPlayer.worldObj, (par8 + x), y + 1.0D, (par10 + z), itemStack);
                    par2EntityPlayer.worldObj.spawnEntityInWorld(entityItem);
                    itemStack = new ItemStack(Items.stick, 1, 0);
                    entityItem = new EntityItem(par2EntityPlayer.worldObj, (par8 + x), y + 1.0D, (par10 + z), itemStack);
                    par2EntityPlayer.worldObj.spawnEntityInWorld(entityItem);
                    if (!par2EntityPlayer.capabilities.isCreativeMode)
                        par1ItemStack.stackSize--;
                    return true;
                }
            }
            EntityItem var9;
            final ItemStack is2 = new ItemStack(OreSpawnMain.MyExperienceCatcher, 1, 0);
            var9 = new EntityItem(par2EntityPlayer.worldObj, par8 + x, y + 1.0, par10 + z, is2);
            par2EntityPlayer.worldObj.spawnEntityInWorld(var9);
            --par1ItemStack.stackSize;
        }
        return true;
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.swingItem();
        return par1ItemStack;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
