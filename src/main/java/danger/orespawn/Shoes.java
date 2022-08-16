package danger.orespawn;

import net.minecraft.entity.projectile.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class Shoes extends EntityThrowable
{
    public int ShoeId;
    private float my_rotation;

    public Shoes(World par1World) {
        super(par1World);
        this.ShoeId = this.rand.nextInt(4) + 2;
        this.dataWatcher.addObject(20, this.ShoeId);
    }

    public Shoes(World par1World, int par2) {
        super(par1World);
        this.ShoeId = par2;
        this.dataWatcher.addObject(20, this.ShoeId);
    }

    public Shoes(World par1World, EntityLivingBase par2EntityLiving) {
        super(par1World, par2EntityLiving);
        this.ShoeId = this.rand.nextInt(4) + 2;
        this.dataWatcher.addObject(20, this.ShoeId);
    }

    public Shoes(World par1World, EntityLivingBase par2EntityLiving, int par3) {
        super(par1World, par2EntityLiving);
        this.ShoeId = par3;
        this.dataWatcher.addObject(20, this.ShoeId);
    }

    public Shoes(World par1World, double par2, double par4, double par6) {
        super(par1World, par2, par4, par6);
        this.ShoeId = this.rand.nextInt(4) + 2;
        this.dataWatcher.addObject(20, this.ShoeId);
    }

    public int getShoeId() {
        return this.dataWatcher.getWatchableObjectInt(20);
    }
    
    protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
        if (par1MovingObjectPosition.entityHit != null) {
            float var2 = 2.0f;
            if (this.getShoeId() == 6) {
                var2 = 6.0f;
            }
            if (par1MovingObjectPosition.entityHit instanceof EntityCreeper) {
                var2 += 4.0f;
            }
            if (par1MovingObjectPosition.entityHit instanceof Girlfriend) {
                var2 = 1.0f;
            }
            if (par1MovingObjectPosition.entityHit instanceof Boyfriend) {
                var2 = 1.0f;
            }
            if (par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
                var2 = 0.0f;
            }
            if (OreSpawnMain.valentines_day != 0) {
                var2 = 10.0f;
            }
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }
        for (int var3 = 0; var3 < 4; ++var3) {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
            this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
        }
        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.my_rotation += 20.0f;
        while (this.my_rotation > 360.0f) {
            this.my_rotation -= 360.0f;
        }
        final float my_rotation = this.my_rotation;
        this.prevRotationPitch = my_rotation;
        this.rotationPitch = my_rotation;
    }
}
