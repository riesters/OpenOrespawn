package danger.orespawn.items.tools;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;

public class EmeraldSword extends ItemSword
{
    public EmeraldSword() {
        super(OrespawnToolMaterial.EmeraldTools.Material);
        this.setUnlocalizedName("emerald_sword");
        this.setRegistryName("emerald_sword");
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        ModItems.ITEMS.add((Item)this);
    }
}
