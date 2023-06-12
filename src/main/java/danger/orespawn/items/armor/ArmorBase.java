package danger.orespawn.items.armor;

import net.minecraft.inventory.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.enchantment.*;
import java.util.*;

public class ArmorBase extends ItemArmor
{
    OrespawnArmorMaterial material;
    boolean enchanted;
    
    public ArmorBase(final String name, final OrespawnArmorMaterial material, final EntityEquipmentSlot equipmentSlot) {
        super(material.Material, 1, equipmentSlot);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
        this.material = material;
        this.enchanted = false;
    }
    
    public void onUpdate(final ItemStack stack, final World p_77663_2_, final Entity p_77663_3_, final int p_77663_4_, final boolean p_77663_5_) {
        if (!this.enchanted) {
            this.enchant(stack);
            this.enchanted = true;
        }
        super.onUpdate(stack, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    }
    
    private void enchant(final ItemStack stack) {
        final Map<Enchantment, Integer> enchantments = (Map<Enchantment, Integer>)this.material.EnchantmentLevels.getMap();
        for (final Object o : enchantments.entrySet()) {
            final Map.Entry<Enchantment, Integer> e = (Map.Entry<Enchantment, Integer>)o;
            stack.addEnchantment((Enchantment)e.getKey(), (int)e.getValue());
        }
    }
}
