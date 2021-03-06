package danger.orespawn;

import java.util.Comparator;
import net.minecraft.entity.Entity;

public class GenericTargetSorter implements Comparator {
  private Entity theEntity;
  
  public GenericTargetSorter(Entity par2Entity) {
    this.theEntity = par2Entity;
  }
  
  public int compareDistanceSq(Entity par1Entity, Entity par2Entity) {
    double weight = 0.0D;
    double var3 = this.theEntity.getDistanceSqToEntity(par1Entity);
    if (par1Entity instanceof net.minecraft.entity.monster.EntityCreeper)
      var3 /= 2.0D; 
    weight = (par1Entity.height * par1Entity.width);
    if (weight > 1.0D)
      var3 /= weight; 
    double var5 = this.theEntity.getDistanceSqToEntity(par2Entity);
    if (par2Entity instanceof net.minecraft.entity.monster.EntityCreeper)
      var5 /= 2.0D; 
    weight = (par2Entity.height * par2Entity.width);
    if (weight > 1.0D)
      var5 /= weight; 
    return (var3 < var5) ? -1 : ((var3 > var5) ? 1 : 0);
  }
  
  public int compare(Object par1Obj, Object par2Obj) {
    return compareDistanceSq((Entity)par1Obj, (Entity)par2Obj);
  }
}
