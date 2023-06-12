package danger.orespawn.util.ai;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.pathfinding.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class MyEntityAIFollowOwner extends EntityAIBase
{
    private EntityTameable thePet;
    private EntityLivingBase theOwner;
    World theWorld;
    private float followSpeed;
    private PathNavigate petPathfinder;
    private int timeToRecalcPath;
    float maxDist;
    float minDist;
    private boolean oldWaterCost;
    
    public MyEntityAIFollowOwner(final EntityTameable par1EntityTameable, final float par2, final float par3, final float par4) {
        this.thePet = par1EntityTameable;
        this.theWorld = par1EntityTameable.world;
        this.followSpeed = par2;
        this.petPathfinder = par1EntityTameable.getNavigator();
        this.minDist = par4;
        this.maxDist = par3;
        this.setMutexBits(3);
    }
    
    public boolean shouldExecute() {
        final EntityLivingBase var1 = this.thePet.getOwner();
        if (var1 == null) {
            return false;
        }
        this.theOwner = var1;
        return !this.thePet.isSitting() && ((this.thePet != null && (this.thePet.posY < 60.0 || !this.thePet.world.isDaytime()) && this.thePet.getDistanceSq((Entity)var1) > this.maxDist / 2.0f * (this.maxDist / 2.0f)) || this.thePet.getDistanceSq((Entity)var1) >= this.maxDist * this.maxDist);
    }
    
    public boolean continueExecuting() {
        if (this.thePet.isSitting()) {
            return false;
        }
        if (this.petPathfinder.noPath()) {
            return false;
        }
        if (this.thePet != null && this.thePet instanceof EntityTameable) {
            final EntityTameable gf = this.thePet;
            final EntityLivingBase var1 = gf.getOwner();
            if (var1 != null && (int)gf.posZ == (int)var1.posZ && (int)gf.posX == (int)var1.posX && (int)gf.posY < (int)var1.posY + 2 && (int)gf.posY > (int)var1.posY - 2) {
                return false;
            }
        }
        return this.thePet.getDistanceSq((Entity)this.theOwner) > this.minDist * this.minDist;
    }
    
    public void startExecuting() {
        this.timeToRecalcPath = 0;
    }
    
    public void resetTask() {
        this.theOwner = null;
        this.petPathfinder.clearPath();
    }
    
    public void updateTask() {
        this.thePet.getLookHelper().setLookPositionWithEntity((Entity)this.theOwner, 10.0f, (float)this.thePet.getVerticalFaceSpeed());
        if (!this.thePet.isSitting() && --this.timeToRecalcPath <= 0) {
            this.timeToRecalcPath = 10;
            if (!this.petPathfinder.tryMoveToEntityLiving((Entity)this.theOwner, (double)this.followSpeed) && this.thePet.getDistanceSq((Entity)this.theOwner) >= 144.0) {
                final int var1 = MathHelper.floor(this.theOwner.posX) - 2;
                final int var2 = MathHelper.floor(this.theOwner.posZ) - 2;
                final int var3 = MathHelper.floor(this.theOwner.getEntityBoundingBox().minY);
                for (int var4 = 0; var4 <= 4; ++var4) {
                    for (int var5 = 0; var5 <= 4; ++var5) {
                        if ((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && this.theWorld.getBlockState(new BlockPos(var1 + var4, var3 - 1, var2 + var5)).isTopSolid() && !this.theWorld.getBlockState(new BlockPos(var1 + var4, var3, var2 + var5)).isNormalCube() && !this.theWorld.getBlockState(new BlockPos(var1 + var4, var3 + 1, var2 + var5)).isNormalCube()) {
                            this.thePet.setLocationAndAngles((double)(var1 + var4 + 0.5f), (double)var3, (double)(var2 + var5 + 0.5f), this.thePet.rotationYaw, this.thePet.rotationPitch);
                            this.petPathfinder.clearPath();
                            return;
                        }
                    }
                }
            }
        }
    }
}
