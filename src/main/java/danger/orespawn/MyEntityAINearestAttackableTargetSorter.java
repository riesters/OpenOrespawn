package danger.orespawn;

import java.util.Comparator;
import net.minecraft.entity.Entity;

public class MyEntityAINearestAttackableTargetSorter implements Comparator {
  private Entity theEntity;
  
  final MyEntityAINearestAttackableTarget parent;
  
  public MyEntityAINearestAttackableTargetSorter(MyEntityAINearestAttackableTarget par1EntityAINearestAttackableTarget, Entity par2Entity) {
    this.parent = par1EntityAINearestAttackableTarget;
    this.theEntity = par2Entity;
  }
  
  public int compareDistanceSq(Entity par1Entity, Entity par2Entity) {
    double var3 = this.theEntity.getDistanceSqToEntity(par1Entity);
    if (par1Entity instanceof net.minecraft.entity.monster.EntityCreeper)
      var3 /= 2.0D; 
    double var5 = this.theEntity.getDistanceSqToEntity(par2Entity);
    if (par2Entity instanceof net.minecraft.entity.monster.EntityCreeper)
      var5 /= 2.0D; 
    return (var3 < var5) ? -1 : ((var3 > var5) ? 1 : 0);
  }
  
  public int compare(Object par1Obj, Object par2Obj) {
    return compareDistanceSq((Entity)par1Obj, (Entity)par2Obj);
  }
}
