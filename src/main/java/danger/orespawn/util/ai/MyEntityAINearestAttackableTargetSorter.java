package danger.orespawn.util.ai;

import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;

public class MyEntityAINearestAttackableTargetSorter implements Comparator
{
    private Entity theEntity;
    final MyEntityAINearestAttackableTarget parent;
    
    public MyEntityAINearestAttackableTargetSorter(final MyEntityAINearestAttackableTarget par1EntityAINearestAttackableTarget, final Entity par2Entity) {
        this.parent = par1EntityAINearestAttackableTarget;
        this.theEntity = par2Entity;
    }
    
    public int compareDistanceSq(final Entity par1Entity, final Entity par2Entity) {
        double var3 = this.theEntity.getDistanceSq(par1Entity);
        if (par1Entity instanceof EntityCreeper) {
            var3 /= 2.0;
        }
        double var4 = this.theEntity.getDistanceSq(par2Entity);
        if (par2Entity instanceof EntityCreeper) {
            var4 /= 2.0;
        }
        return (var3 < var4) ? -1 : ((var3 > var4) ? 1 : 0);
    }
    
    @Override
    public int compare(final Object par1Obj, final Object par2Obj) {
        return this.compareDistanceSq((Entity)par1Obj, (Entity)par2Obj);
    }
}
