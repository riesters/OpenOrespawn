package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import javax.annotation.*;

public class EmeraldPickaxe extends ItemPickaxe
{
    public EmeraldPickaxe() {
        super(OrespawnToolMaterial.EmeraldTools.Material);
        this.setUnlocalizedName("emerald_pickaxe");
        this.setRegistryName("emerald_pickaxe");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
    
    @ParametersAreNonnullByDefault
    public void onUpdate(final ItemStack stack, final World world, final Entity player, final int itemSlot, final boolean isSelected) {
        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
        }
        super.onUpdate(stack, world, player, itemSlot, isSelected);
    }
}
