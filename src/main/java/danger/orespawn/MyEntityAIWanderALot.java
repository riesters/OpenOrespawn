package danger.orespawn;

import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.*;

public class MyEntityAIWanderALot extends EntityAIBase
{
    private final EntityCreature entity;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private final double speed;
    private final int xzRange;
    private int busy;
    
    public MyEntityAIWanderALot(final EntityCreature par1EntityCreature, final int par1, final double par2) {
        this.busy = 0;
        this.entity = par1EntityCreature;
        this.xzRange = par1;
        this.speed = par2;
        this.setMutexBits(1);
    }
    
    public void setBusy(final int i) {
        this.busy = i;
    }
    
    public boolean shouldExecute() {
        if (this.busy != 0) {
            return false;
        }
        if (this.entity.worldObj.rand.nextInt(30) != 0) {
            return false;
        }
        if (this.entity instanceof EntityTameable && ((EntityTameable)this.entity).isSitting()) {
            return false;
        }
        final Vec3 var1 = RandomPositionGenerator.findRandomTarget(this.entity, this.xzRange, 7);
        if (var1 == null) {
            return false;
        }
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
