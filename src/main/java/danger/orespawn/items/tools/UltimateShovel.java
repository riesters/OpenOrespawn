package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import javax.annotation.*;

public class UltimateShovel extends ItemSpade
{
    public UltimateShovel() {
        super(OrespawnToolMaterial.UltimateTools.Material);
        this.setUnlocalizedName("ultimate_shovel");
        this.setRegistryName("ultimate_shovel");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
    
    @ParametersAreNonnullByDefault
    public void onUpdate(final ItemStack stack, final World world, final Entity player, final int itemSlot, final boolean isSelected) {
        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantments.EFFICIENCY, 5);
        }
        super.onUpdate(stack, world, player, itemSlot, isSelected);
    }
}
