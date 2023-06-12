package danger.orespawn.tabs;

import net.minecraft.creativetab.*;
import mcp.*;
import net.minecraft.item.*;
import danger.orespawn.init.*;
import net.minecraft.util.*;
import java.util.*;
import java.util.function.*;

@MethodsReturnNonnullByDefault
public class OrespawnTab extends CreativeTabs
{
    public OrespawnTab() {
        super("Orespawn");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ULTIMATE_SWORD);
    }
}
