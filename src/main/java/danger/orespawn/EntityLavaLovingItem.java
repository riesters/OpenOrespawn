package danger.orespawn;

import net.minecraft.entity.item.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class EntityLavaLovingItem extends EntityItem
{
    public EntityLavaLovingItem(final World par1World, final double par2, final double par4, final double par6, final ItemStack par8ItemStack) {
        super(par1World, par2, par4, par6, par8ItemStack);
        this.fireResistance = 300;
        this.isImmuneToFire = true;
        this.hurtResistantTime = 300;
    }
    
    public void noFire() {
        this.fireResistance = 300;
        this.isImmuneToFire = true;
        this.hurtResistantTime = 300;
    }
    
    public void yesFire() {
        this.fireResistance = 0;
        this.isImmuneToFire = false;
        this.hurtResistantTime = 0;
    }
    
    protected void dealFireDamage(final float par1) {
        if (!this.isImmuneToFire) {
            this.attackEntityFrom(DamageSource.inFire, par1);
        }
    }
}
