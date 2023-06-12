package danger.orespawn.util.ai;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.monster.*;
import net.minecraft.util.math.*;
import net.minecraft.pathfinding.*;

public abstract class MyEntityAITarget extends EntityAIBase
{
    protected EntityLiving taskOwner;
    protected float targetDistance;
    protected boolean shouldCheckSight;
    private boolean nearbyOnly;
    private int targetSearchStatus;
    private int targetSearchDelay;
    private int targetUnseenTicks;
    
    public MyEntityAITarget(final EntityLiving par1EntityLiving, final float par2, final boolean par3) {
        this(par1EntityLiving, par2, par3, false);
    }
    
    public MyEntityAITarget(final EntityLiving par1EntityLiving, final float par2, final boolean par3, final boolean par4) {
        this.targetSearchStatus = 0;
        this.targetSearchDelay = 0;
        this.targetUnseenTicks = 0;
        this.taskOwner = par1EntityLiving;
        this.targetDistance = par2;
        this.shouldCheckSight = par3;
        this.nearbyOnly = par4;
    }
    
    public boolean continueExecuting() {
        final EntityLivingBase var1 = this.taskOwner.getAttackTarget();
        if (var1 == null) {
            return false;
        }
        if (!var1.isEntityAlive()) {
            this.taskOwner.setAttackTarget((EntityLivingBase)null);
            return false;
        }
        if (this.taskOwner.getDistanceSq((Entity)var1) > this.targetDistance * this.targetDistance) {
            return false;
        }
        if (this.taskOwner instanceof EntityTameable && ((EntityTameable)this.taskOwner).isTamed() && var1 instanceof EntityTameable && ((EntityTameable)var1).isTamed()) {
            return false;
        }
        if (this.shouldCheckSight) {
            if (this.taskOwner.getEntitySenses().canSee((Entity)var1)) {
                this.targetUnseenTicks = 0;
            }
            else if (++this.targetUnseenTicks > 60) {
                return false;
            }
        }
        return true;
    }
    
    public void startExecuting() {
        this.targetSearchStatus = 0;
        this.targetSearchDelay = 0;
        this.targetUnseenTicks = 0;
    }
    
    public void resetTask() {
        this.taskOwner.setAttackTarget((EntityLivingBase)null);
    }
    
    protected boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this.taskOwner) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (this.taskOwner instanceof EntityTameable && ((EntityTameable)this.taskOwner).isTamed()) {
            if (par1EntityLiving instanceof EntityTameable && ((EntityTameable)par1EntityLiving).isTamed()) {
                return false;
            }
            if (par1EntityLiving == ((EntityTameable)this.taskOwner).getOwner()) {
                return false;
            }
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPigZombie) {
            return false;
        }
        if (par1EntityLiving instanceof EntityEnderman) {
            return false;
        }
        if (this.shouldCheckSight && !this.taskOwner.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityCreeper) {
            return true;
        }
        if (par1EntityLiving instanceof EntityGhast) {
            return true;
        }
        if (this.nearbyOnly) {
            if (--this.targetSearchDelay <= 0) {
                this.targetSearchStatus = 0;
            }
            if (this.targetSearchStatus == 0) {
                this.targetSearchStatus = (this.canEasilyReach(par1EntityLiving) ? 1 : 2);
            }
            if (this.targetSearchStatus == 2) {
                return false;
            }
        }
        return true;
    }
    
    private boolean canEasilyReach(final EntityLivingBase par1EntityLiving) {
        this.targetSearchDelay = 10 + this.taskOwner.getRNG().nextInt(5);
        final Path var2 = this.taskOwner.getNavigator().getPathToEntityLiving((Entity)par1EntityLiving);
        if (var2 == null) {
            return false;
        }
        final PathPoint var3 = var2.getFinalPathPoint();
        if (var3 == null) {
            return false;
        }
        final int var4 = var3.x - MathHelper.floor(par1EntityLiving.posX);
        final int var5 = var3.z - MathHelper.floor(par1EntityLiving.posZ);
        return var4 * var4 + var5 * var5 <= 2.25;
    }
}
