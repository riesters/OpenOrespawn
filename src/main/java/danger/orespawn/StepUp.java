package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class StepUp extends Item
{
    public StepUp() {
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer Player, final World world, final int cposx, final int cposy, final int cposz, final int par7, final float par8, final float par9, final float par10) {
        int deltax = 0;
        int deltaz = 0;
        final int length = 33;
        final int y = cposy + 1;
        float f = Player.rotationYawHead;
        f += 22.5f;
        f %= 360.0f;
        f /= 45.0f;
        switch ((int)f) {
            case 0: {
                deltaz = 1;
                break;
            }
            case 1: {
                deltax = -1;
                deltaz = 1;
                break;
            }
            case 2: {
                deltax = -1;
                break;
            }
            case 3: {
                deltax = -1;
                deltaz = -1;
                break;
            }
            case 4: {
                deltaz = -1;
                break;
            }
            case 5: {
                deltax = 1;
                deltaz = -1;
                break;
            }
            case 6: {
                deltax = 1;
                break;
            }
            case 7: {
                deltax = 1;
                deltaz = 1;
                break;
            }
        }
        if (deltax == 0 && deltaz == 0) {
            return false;
        }
        Player.worldObj.playSoundAtEntity(Player, "random.explode", 1.0f, 1.5f);
        if (world.isRemote) {
            for (int var3 = 0; var3 < 6; ++var3) {
                world.spawnParticle("largesmoke", cposx + world.rand.nextFloat() - world.rand.nextFloat(), y + world.rand.nextFloat() + 1.0f, cposz + world.rand.nextFloat() - world.rand.nextFloat(), 0.0, 0.0, 0.0);
                world.spawnParticle("largeexplode", cposx + world.rand.nextFloat() - world.rand.nextFloat(), y + world.rand.nextFloat() + 1.0f, cposz + world.rand.nextFloat() - world.rand.nextFloat(), 0.0, 0.0, 0.0);
                world.spawnParticle("reddust", cposx + world.rand.nextFloat() - world.rand.nextFloat(), y + world.rand.nextFloat() + 1.0f, cposz + world.rand.nextFloat() - world.rand.nextFloat(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        for (int k = 1; k < length; ++k) {
            Block bid = world.getBlock(cposx + k * deltax, y + k - 1, cposz + k * deltaz);
            if (bid != Blocks.air) {
                break;
            }
            world.setBlock(cposx + k * deltax, y + k - 1, cposz + k * deltaz, Blocks.cobblestone, 0, 2);
            if ((k - 1) % 8 == 0) {
                bid = world.getBlock(cposx + k * deltax, y + k, cposz + k * deltaz);
                if (bid == Blocks.air) {
                    world.setBlock(cposx + k * deltax, y + k, cposz + k * deltaz, OreSpawnMain.ExtremeTorch, 0, 2);
                }
            }
        }
        if (!Player.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
