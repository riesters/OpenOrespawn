package danger.orespawn.items.armor;

import danger.orespawn.util.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import net.minecraft.init.*;

public class OrespawnArmorMaterial
{
    public final String Name;
    public final int Durability;
    public final int[] Protections;
    public final int Enchantability;
    public final float Toughness;
    public final ItemEnchantments EnchantmentLevels;
    public final ItemArmor.ArmorMaterial Material;
    public static final OrespawnArmorMaterial UltimateArmor;
    public static final OrespawnArmorMaterial EmeraldArmor;
    public static final OrespawnArmorMaterial MothArmor;
    public static final OrespawnArmorMaterial AmethystArmor;
    
    public OrespawnArmorMaterial(final String name, final int durability, final int[] protections, final int enchantability, final float toughness, final ItemEnchantments enchantments) {
        this.Name = name;
        this.Durability = durability;
        this.Protections = protections;
        this.Enchantability = enchantability;
        this.Toughness = toughness;
        this.EnchantmentLevels = enchantments;
        this.Material = EnumHelper.addArmorMaterial(this.Name, "orespawn:" + this.Name, this.Durability, this.Protections, this.Enchantability, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, this.Toughness);
    }
    
    static {
        UltimateArmor = new OrespawnArmorMaterial("ultimate", 200, new int[] { 6, 12, 10, 6 }, 100, 3.0f, new ItemEnchantments().addEnchantment(Enchantments.RESPIRATION, 2).addEnchantment(Enchantments.AQUA_AFFINITY, 2).addEnchantment(Enchantments.PROTECTION, 5).addEnchantment(Enchantments.FIRE_PROTECTION, 5).addEnchantment(Enchantments.PROJECTILE_PROTECTION, 5).addEnchantment(Enchantments.UNBREAKING, 0).addEnchantment(Enchantments.FEATHER_FALLING, 3));
        EmeraldArmor = new OrespawnArmorMaterial("emerald", 100, new int[] { 3, 8, 6, 3 }, 12, 3.0f, new ItemEnchantments());
        MothArmor = new OrespawnArmorMaterial("moth", 100, new int[] { 2, 7, 5, 2 }, 12, 3.0f, new ItemEnchantments());
        AmethystArmor = new OrespawnArmorMaterial("amethyst", 100, new int[] { 4, 8, 7, 3 }, 12, 3.0f, new ItemEnchantments());
    }
}
