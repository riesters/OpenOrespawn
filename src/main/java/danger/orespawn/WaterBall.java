package danger.orespawn;

import net.minecraft.entity.projectile.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class WaterBall extends EntityThrowable
{
    private float my_rotation;
    private final int my_index;
    
    public WaterBall(final World par1World) {
        super(par1World);
        this.my_rotation = 0.0f;
        this.my_index = 49;
    }
    
    public WaterBall(final World par1World, final EntityLivingBase par2EntityLiving) {
        super(par1World, par2EntityLiving);
        this.my_rotation = 0.0f;
        this.my_index = 49;
    }
    
    public WaterBall(final World worldObj, final double d, final double e, final double f) {
        super(worldObj, d, e, f);
        this.my_rotation = 0.0f;
        this.my_index = 49;
    }
    
    public int getWaterBallIndex() {
        return this.my_index;
    }
    
    protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
        if (par1MovingObjectPosition.entityHit != null) {
            float var2 = 2.0f;
            if (par1MovingObjectPosition.entityHit instanceof EntityCreeper) {
                var2 = 5.0f;
            }
            if (par1MovingObjectPosition.entityHit instanceof WaterDragon) {
                return;
            }
            if (par1MovingObjectPosition.entityHit instanceof AttackSquid) {
                return;
            }
            if (par1MovingObjectPosition.entityHit instanceof Dragon) {
                final Dragon d = (Dragon)par1MovingObjectPosition.entityHit;
                if (d.getDragonType() != 0) {
                    return;
                }
            }
            if (par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
                final EntityPlayer d2 = (EntityPlayer)par1MovingObjectPosition.entityHit;
                if (d2.ridingEntity != null) {
                    return;
                }
            }
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
            if (this.worldObj.rand.nextInt(10) == 1) {
                par1MovingObjectPosition.entityHit.dropItem(OreSpawnMain.MyWaterBall, 1);
            }
            par1MovingObjectPosition.entityHit.extinguish();
        }
        for (int var3 = 0; var3 < 8; ++var3) {
            this.worldObj.spawnParticle("bubble", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat(), 0.0, 0.0, 0.0);
            this.worldObj.spawnParticle("splash", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat() - this.rand.nextFloat(), 0.0, 0.0, 0.0);
        }
        this.playSound("random.splash", 0.5f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.5f);
        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.my_rotation += 30.0f;
        while (this.my_rotation > 360.0f) {
            this.my_rotation -= 360.0f;
        }
        final float my_rotation = this.my_rotation;
        this.prevRotationPitch = my_rotation;
        this.rotationPitch = my_rotation;
        this.worldObj.spawnParticle("splash", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
    }
}
