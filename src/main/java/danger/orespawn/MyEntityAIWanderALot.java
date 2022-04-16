package danger.orespawn;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.util.Vec3;

public class MyEntityAIWanderALot extends EntityAIBase {
  private EntityCreature entity;
  
  private double xPosition;
  
  private double yPosition;
  
  private double zPosition;
  
  private double speed;
  
  private int xzRange = 10;
  
  private int busy = 0;
  
  public MyEntityAIWanderALot(EntityCreature par1EntityCreature, int par1, double par2) {
    this.entity = par1EntityCreature;
    this.xzRange = par1;
    this.speed = par2;
    setMutexBits(1);
  }
  
  public void setBusy(int i) {
    this.busy = i;
  }
  
  public boolean shouldExecute() {
    if (this.busy != 0)
      return false; 
    if (this.entity.worldObj.rand.nextInt(30) != 0)
      return false; 
    if (this.entity instanceof EntityTameable && ((EntityTameable)this.entity).isSitting())
      return false; 
    Vec3 var1 = RandomPositionGenerator.findRandomTarget(this.entity, this.xzRange, 7);
    if (var1 == null)
      return false; 
    this.xPosition = var1.xCoord;
    this.yPosition = var1.yCoord;
    this.zPosition = var1.zCoord;
    return true;
  }
  
  public boolean continueExecuting() {
    return !this.entity.getNavigator().noPath();
  }
  
  public void startExecuting() {
    this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
  }
}
