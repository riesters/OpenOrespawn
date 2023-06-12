package danger.orespawn.entity;

import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;

public class GenericTargetSorter implements Comparator
{
    private Entity theEntity;
    
    public GenericTargetSorter(final Entity par2Entity) {
        this.theEntity = par2Entity;
    }
    
    public int compareDistanceSq(final Entity par1Entity, final Entity par2Entity) {
        double weight = 0.0;
        double var3 = this.theEntity.getDistanceSq(par1Entity);
        if (par1Entity instanceof EntityCreeper) {
            var3 /= 2.0;
        }
        weight = par1Entity.height * par1Entity.width;
        if (weight > 1.0) {
            var3 /= weight;
        }
        double var4 = this.theEntity.getDistanceSq(par2Entity);
        if (par2Entity instanceof EntityCreeper) {
            var4 /= 2.0;
        }
        weight = par2Entity.height * par2Entity.width;
        if (weight > 1.0) {
            var4 /= weight;
        }
        return (var3 < var4) ? -1 : ((var3 > var4) ? 1 : 0);
    }
    
    @Override
    public int compare(final Object par1Obj, final Object par2Obj) {
        return this.compareDistanceSq((Entity)par1Obj, (Entity)par2Obj);
    }
}
