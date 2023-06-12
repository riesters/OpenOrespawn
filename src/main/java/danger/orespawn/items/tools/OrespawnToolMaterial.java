package danger.orespawn.items.tools;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;

public class OrespawnToolMaterial
{
    public final String Name;
    public final int HarvestLevel;
    public final int Durability;
    public final float Efficiency;
    public final float Damage;
    public final int Enchantability;
    public final Item.ToolMaterial Material;
    public static OrespawnToolMaterial UltimateTools;
    public static OrespawnToolMaterial EmeraldTools;
    public static OrespawnToolMaterial AmethystTools;
    
    public OrespawnToolMaterial(final String name, final int harvestLevel, final int durability, final float efficiency, final float damage, final int enchantability) {
        this.Name = name;
        this.HarvestLevel = harvestLevel;
        this.Durability = durability;
        this.Efficiency = efficiency;
        this.Damage = damage;
        this.Enchantability = enchantability;
        this.Material = EnumHelper.addToolMaterial(this.Name, this.HarvestLevel, this.Durability, this.Efficiency, this.Damage, this.Enchantability);
    }
    
    static {
        OrespawnToolMaterial.UltimateTools = new OrespawnToolMaterial("ultimate", 10, 3000, 15.0f, 36.0f, 100);
        OrespawnToolMaterial.EmeraldTools = new OrespawnToolMaterial("emerald", 2, 1000, 6.5f, 3.0f, 12);
        OrespawnToolMaterial.AmethystTools = new OrespawnToolMaterial("emerald", 2, 1000, 6.5f, 3.0f, 12);
    }
}
