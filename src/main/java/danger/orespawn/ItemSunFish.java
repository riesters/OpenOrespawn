package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.potion.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemSunFish extends ItemFood
{
    public ItemSunFish(final int par2, final float par3, final boolean par4) {
        super(par2, par3, par4);
        this.setAlwaysEdible();
    }
    
    public void onFoodEaten(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        if (!par2World.isRemote && this == OreSpawnMain.MySunFish) {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
        }
        if (!par2World.isRemote && this == OreSpawnMain.MyButterCandy) {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2000, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 2000, 0));
        }
        if (!par2World.isRemote && this == OreSpawnMain.MyBacon) {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2000, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 2000, 0));
        }
        if (!par2World.isRemote && this == OreSpawnMain.MyCrystalApple) {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3000, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 3000, 0));
        }
        if (!par2World.isRemote && this == OreSpawnMain.MyLove) {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 6000, 3));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 6000, 2));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 2));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 1));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5000, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 5000, 0));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
