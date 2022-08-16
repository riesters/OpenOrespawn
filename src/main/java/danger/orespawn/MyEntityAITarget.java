package danger.orespawn;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.monster.*;
import net.minecraft.util.*;
import net.minecraft.pathfinding.*;

public abstract class MyEntityAITarget extends EntityAIBase
{
    protected EntityLiving taskOwner;
    protected float targetDistance;
    protected boolean shouldCheckSight;
    private final boolean nearbyOnly;
    private int targetSearchStatus;
    private int targetSearchDelay;
    private int field_75298_g;

    public MyEntityAITarget(final EntityLiving par1EntityLiving, final float par2, final boolean par3, final boolean par4) {
        this.targetSearchStatus = 0;
        this.targetSearchDelay = 0;
        this.field_75298_g = 0;
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
            this.taskOwner.setAttackTarget(null);
            return false;
        }
        if (this.taskOwner.getDistanceSqToEntity(var1) > this.targetDistance * this.targetDistance) {
            return false;
        }
        if (this.taskOwner instanceof EntityTameable && ((EntityTameable)this.taskOwner).isTamed() && var1 instanceof EntityTameable && ((EntityTameable)var1).isTamed()) {
            return false;
        }
        if (this.shouldCheckSight) {
            if (this.taskOwner.getEntitySenses().canSee(var1)) {
                this.field_75298_g = 0;
            }
            else return ++this.field_75298_g <= 60;
        }
        return true;
    }
    
    public void startExecuting() {
        this.targetSearchStatus = 0;
        this.targetSearchDelay = 0;
        this.field_75298_g = 0;
    }
    
    public void resetTask() {
        this.taskOwner.setAttackTarget(null);
    }
    
    protected boolean isSuitableTarget(final EntityLivingBase par1EntityLiving) {
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
            return OreSpawnMain.valentines_day != 0;
        }
        if (par1EntityLiving instanceof EntityPigZombie) {
            return false;
        }
        if (par1EntityLiving instanceof EntityEnderman) {
            return false;
        }
        if (par1EntityLiving instanceof Mothra) {
            return true;
        }
        if (this.shouldCheckSight && !this.taskOwner.getEntitySenses().canSee(par1EntityLiving)) {
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
            return this.targetSearchStatus != 2;
        }
        return true;
    }
    
    private boolean canEasilyReach(final EntityLivingBase par1EntityLiving) {
        this.targetSearchDelay = 10 + this.taskOwner.getRNG().nextInt(5);
        final PathEntity var2 = this.taskOwner.getNavigator().getPathToEntityLiving(par1EntityLiving);
        if (var2 == null) {
            return false;
        }
        final PathPoint var3 = var2.getFinalPathPoint();
        if (var3 == null) {
            return false;
        }
        final int var4 = var3.xCoord - MathHelper.floor_double(par1EntityLiving.posX);
        final int var5 = var3.zCoord - MathHelper.floor_double(par1EntityLiving.posZ);
        return var4 * var4 + var5 * var5 <= 2.25;
    }
}
