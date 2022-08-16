package danger.orespawn;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.*;
import net.minecraft.pathfinding.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class MyEntityAIFollowOwner extends EntityAIBase
{
    private final EntityTameable thePet;
    private EntityLivingBase theOwner;
    World theWorld;
    private final float field_75336_f;
    private final PathNavigate petPathfinder;
    private int field_75343_h;
    float maxDist;
    float minDist;
    private boolean field_75344_i;
    
    public MyEntityAIFollowOwner(final EntityTameable par1EntityTameable, final float par2, final float par3, final float par4) {
        this.thePet = par1EntityTameable;
        this.theWorld = par1EntityTameable.worldObj;
        this.field_75336_f = par2;
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
        return !this.thePet.isSitting() && (!(this.thePet instanceof Girlfriend) || OreSpawnMain.valentines_day == 0) && ((this.thePet.posY < 60.0 || !this.thePet.worldObj.isDaytime()) && this.thePet.getDistanceSqToEntity(var1) > this.maxDist / 2.0f * (this.maxDist / 2.0f) || this.thePet.getDistanceSqToEntity(var1) >= this.maxDist * this.maxDist);
    }
    
    public boolean continueExecuting() {
        if (this.thePet.isSitting()) {
            return false;
        }
        if (this.petPathfinder.noPath()) {
            return false;
        }
        final EntityTameable gf = this.thePet;
        final EntityLivingBase var1 = gf.getOwner();
        if (var1 != null && (int)gf.posZ == (int)var1.posZ && (int)gf.posX == (int)var1.posX && (int)gf.posY < (int)var1.posY + 2 && (int)gf.posY > (int)var1.posY - 2) {
            return false;
        }
        return this.thePet.getDistanceSqToEntity(this.theOwner) > this.minDist * this.minDist;
    }
    
    public void startExecuting() {
        this.field_75343_h = 0;
        this.field_75344_i = this.thePet.getNavigator().getAvoidsWater();
        this.thePet.getNavigator().setAvoidsWater(false);
    }
    
    public void resetTask() {
        this.theOwner = null;
        this.petPathfinder.clearPathEntity();
        this.thePet.getNavigator().setAvoidsWater(this.field_75344_i);
    }
    
    public void updateTask() {
        this.thePet.getLookHelper().setLookPositionWithEntity(this.theOwner, 10.0f, (float)this.thePet.getVerticalFaceSpeed());
        if (!this.thePet.isSitting() && --this.field_75343_h <= 0) {
            this.field_75343_h = 10;
            if (!this.petPathfinder.tryMoveToEntityLiving(this.theOwner, this.field_75336_f) && this.thePet.getDistanceSqToEntity(this.theOwner) >= 144.0) {
                final int var1 = MathHelper.floor_double(this.theOwner.posX) - 2;
                final int var2 = MathHelper.floor_double(this.theOwner.posZ) - 2;
                final int var3 = MathHelper.floor_double(this.theOwner.boundingBox.minY);
                for (int var4 = 0; var4 <= 4; ++var4) {
                    for (int var5 = 0; var5 <= 4; ++var5) {
                        if ((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && World.doesBlockHaveSolidTopSurface(this.theWorld, var1 + var4, var3 - 1, var2 + var5) && !this.theWorld.getBlock(var1 + var4, var3, var2 + var5).isNormalCube() && !this.theWorld.getBlock(var1 + var4, var3 + 1, var2 + var5).isNormalCube()) {
                            this.thePet.setLocationAndAngles(var1 + var4 + 0.5f, var3, var2 + var5 + 0.5f, this.thePet.rotationYaw, this.thePet.rotationPitch);
                            this.petPathfinder.clearPathEntity();
                            return;
                        }
                    }
                }
            }
        }
    }
}
