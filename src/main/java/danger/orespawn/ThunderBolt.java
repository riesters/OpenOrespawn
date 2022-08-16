package danger.orespawn;

import net.minecraft.entity.projectile.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.*;

public class ThunderBolt extends EntityThrowable
{

    public ThunderBolt(final World par1World, final EntityLivingBase par3EntityPlayer) {
        super(par1World, par3EntityPlayer);
    }

    public ThunderBolt(final World par1World, final double par2, final double par4, final double par6) {
        super(par1World, par2, par4, par6);
    }
    
    protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
        if (par1MovingObjectPosition.entityHit != null) {
            final float var2 = 40.0f;
            if (MyUtils.isRoyalty(par1MovingObjectPosition.entityHit)) {
                this.setDead();
                return;
            }
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2 / 2.0f);
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()), var2 / 2.0f);
            par1MovingObjectPosition.entityHit.setFire(1);
        }
        for (int mx = 20, var3 = 0; var3 < mx; ++var3) {
            this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat(), 0.0, 0.0, 0.0);
            this.worldObj.spawnParticle("largesmoke", this.posX + this.rand.nextFloat() - this.rand.nextFloat(), this.posY + this.rand.nextFloat() - this.rand.nextFloat(), this.posZ + this.rand.nextFloat() - this.rand.nextFloat(), 0.0, 0.0, 0.0);
            this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian());
        }
        this.playSound("random.explode", 0.5f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.5f);
        if (!this.worldObj.isRemote) {
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 3.0f, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        }
        this.worldObj.addWeatherEffect(new EntityLightningBolt(this.worldObj, this.posX, this.posY + 1.0, this.posZ));
        this.setDead();
    }
    
    public void onUpdate() {
        super.onUpdate();
        for (int mx = 4, i = 0; i < mx; ++i) {
            this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, this.worldObj.rand.nextGaussian() / 10.0, this.worldObj.rand.nextGaussian() / 10.0, this.worldObj.rand.nextGaussian() / 10.0);
        }
    }
}
