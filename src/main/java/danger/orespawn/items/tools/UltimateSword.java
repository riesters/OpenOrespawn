package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import javax.annotation.*;

public class UltimateSword extends ItemSword
{
    public UltimateSword() {
        super(OrespawnToolMaterial.UltimateTools.Material);
        this.setUnlocalizedName("ultimate_sword");
        this.setRegistryName("ultimate_sword");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
    
    @ParametersAreNonnullByDefault
    public void onUpdate(final ItemStack stack, final World world, final Entity player, final int itemSlot, final boolean isSelected) {
        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantments.LOOTING, 6);
            stack.addEnchantment(Enchantments.UNBREAKING, 6);
        }
        super.onUpdate(stack, world, player, itemSlot, isSelected);
    }
}
