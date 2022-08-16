package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemElevator extends Item
{
    public ItemElevator() {
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTransport);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
        if (par3World.isRemote) {
            return true;
        }
        final Elevator elevator = (Elevator)EntityList.createEntityByName("Hoverboard", par3World);
        elevator.setLocationAndAngles(par4 + 0.5f, par5 + 1.2f, par6 + 0.5f, par3World.rand.nextFloat() * 360.0f, 0.0f);
        par3World.spawnEntityInWorld(elevator);
        if (!par2EntityPlayer.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
