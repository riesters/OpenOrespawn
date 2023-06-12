package danger.orespawn.util;

import net.minecraft.enchantment.*;
import java.util.*;

public class ItemEnchantments
{
    private Map<Enchantment, Integer> enchantmentLevels;
    
    public ItemEnchantments() {
        this.enchantmentLevels = new HashMap<Enchantment, Integer>();
    }
    
    public ItemEnchantments addEnchantment(final Enchantment e, final int level) {
        this.enchantmentLevels.put(e, level);
        return this;
    }
    
    public Map getMap() {
        return this.enchantmentLevels;
    }
}
