package danger.orespawn;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityTameable;

public class MyEntityAIJealousy extends MyEntityAINearestAttackableTarget {
  private EntityTameable theTameable;
  
  public MyEntityAIJealousy(EntityTameable par1EntityTameable, Class par2Class, float par3, int par4, boolean par5) {
    super((EntityLiving)par1EntityTameable, par2Class, par3, par4, par5);
    this.theTameable = par1EntityTameable;
  }
  
  public boolean shouldExecute() {
    EntityTameable te = (EntityTameable)this.taskOwner;
    Girlfriend gf = null;
    Boyfriend bf = null;
    EntityLivingBase ep = null;
    if (te == null)
      return false; 
    if (!te.isTamed())
      return false; 
    if (te.isSitting())
      return false; 
    if (!super.shouldExecute())
      return false; 
    EntityLiving entityLiving = this.targetEntity;
    if (entityLiving == null)
      return false; 
    if (te instanceof Girlfriend) {
      if (entityLiving instanceof Girlfriend) {
        gf = (Girlfriend)entityLiving;
        if (gf.isTamed())
          return false; 
      } 
    } else if (entityLiving instanceof Boyfriend) {
      bf = (Boyfriend)entityLiving;
      if (bf.isTamed())
        return false; 
    } 
    ep = te.getOwner();
    if (ep == null)
      return false; 
    return true;
  }
}
