package danger.orespawn.entity;

import net.minecraft.block.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;

public class WormDoom extends EntityLiving
{
    public double[] lposx;
    public double[] lposy;
    public double[] lposz;
    public double[] rotpitch;
    public double[] rotyaw;
    public long lasttime;
    public int backoff;
    public int inarow;
    public float cycle;
    public float target_direction;
    public float local_rotationYaw;
    public float local_rotation_yaw_motion;
    Block bid;
    float updown;
    float local_motionX;
    float local_motionY;
    float local_motionZ;
    public float local_posX;
    public float local_posY;
    public float local_posZ;
    
    public WormDoom(final World worldIn) {
        super(worldIn);
        this.lposx = new double[100];
        this.lposy = new double[100];
        this.lposz = new double[100];
        this.rotpitch = new double[100];
        this.rotyaw = new double[100];
        this.lasttime = 0L;
        this.backoff = 0;
        this.inarow = 0;
        this.target_direction = 0.0f;
        this.local_rotationYaw = 0.0f;
        this.local_rotation_yaw_motion = 0.0f;
        this.updown = 0.0f;
        setRenderDistanceWeight(12.0);
        this.ignoreFrustumCheck = true;
        this.rotationYaw = 1.0f;
        this.local_rotationYaw = 1.0f;
        this.noClip = true;
        double mx = (float)Math.sin(Math.toRadians(this.local_rotationYaw)) * 0.75f;
        double mz = (float)Math.cos(Math.toRadians(this.local_rotationYaw)) * 0.75f;
        mx /= 2.0;
        mz /= 2.0;
        for (int i = 0; i < 100; ++i) {
            this.lposx[i] = this.posX - mx * i * 1.5;
            this.lposy[i] = this.posY + (float)Math.sin(Math.toRadians(i * 10 + 180)) * 4.0f;
            this.lposz[i] = this.posZ - mz * i * 1.5;
            this.rotpitch[i] = 0.0;
            this.rotyaw[i] = this.local_rotationYaw;
        }
        this.cycle = worldIn.rand.nextFloat() * 360.0f;
        this.target_direction = this.local_rotationYaw;
        this.local_motionX = (float)mx;
        this.local_motionY = 0.0f;
        this.local_motionZ = (float)mz;
        this.local_posX = (float)this.posX;
        this.local_posY = (float)this.posY;
        this.local_posZ = (float)this.posZ;
    }
    
    public boolean isInRangeToRenderDist(final double distance) {
        return true;
    }
    
    public boolean isInRangeToRender3d(final double x, final double y, final double z) {
        return true;
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.world.isRemote) {
            for (int i = 99; i > 0; --i) {
                this.lposx[i] = this.lposx[i - 1];
                this.lposy[i] = this.lposy[i - 1];
                this.lposz[i] = this.lposz[i - 1];
                this.rotpitch[i] = this.rotpitch[i - 1];
                this.rotyaw[i] = this.rotyaw[i - 1];
            }
            this.lposx[0] = this.posX;
            this.lposy[0] = this.posY;
            this.lposz[0] = this.posZ;
            this.rotpitch[0] = this.rotationPitch;
            this.rotyaw[0] = this.rotationYaw;
            final double motionX = 0.0;
            this.motionZ = motionX;
            this.motionY = motionX;
            this.motionX = motionX;
        }
        else {
            float myspeed = 0.3f;
            if (this.isChild()) {
                myspeed = 0.2f;
            }
            this.local_motionX = (float)Math.sin(Math.toRadians(this.local_rotationYaw)) * myspeed;
            this.local_motionZ = (float)Math.cos(Math.toRadians(this.local_rotationYaw)) * myspeed;
            int k = 0;
            int ht = 6;
            float frq = 10.0f;
            if (this.isChild()) {
                ht = 3;
                frq = 20.0f;
            }
            for (k = ht; k >= -ht; --k) {
                this.bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY + k, (int)this.posZ)).getBlock();
                if (this.bid != Blocks.AIR) {
                    break;
                }
            }
            this.updown = (float)Math.sin(Math.toRadians(this.cycle * frq)) * ht;
            this.updown -= k;
            this.updown = -this.updown;
            this.local_motionY *= 0.98f;
            this.local_motionY += 0.008f * this.updown;
            this.cycle = (this.cycle + 0.5f) % 360.0f;
            final float dx = (float)Math.sqrt(this.local_motionX * this.local_motionX + this.local_motionZ * this.local_motionZ);
            final float dz = (float)Math.atan2(-this.local_motionY, dx);
            this.rotationPitch = (float)Math.toDegrees(dz);
            final float cdir = (float)Math.toRadians(this.local_rotationYaw);
            if (this.world.rand.nextInt(100) == 1) {
                this.target_direction = 360.0f * this.world.rand.nextFloat();
            }
            final float tdir = (float)Math.toRadians(this.target_direction);
            float ddiff;
            for (ddiff = tdir - cdir; ddiff > 3.141592653589793; ddiff -= (float)6.283185307179586) {}
            while (ddiff < -3.141592653589793) {
                ddiff += (float)6.283185307179586;
            }
            this.local_rotation_yaw_motion *= 0.95f;
            this.local_rotation_yaw_motion += (float)(ddiff * 180.0f / 3.141592653589793 / 20.0);
            this.local_rotationYaw += this.local_rotation_yaw_motion;
            this.rotationYaw = -this.local_rotationYaw;
            this.motionX = this.local_motionX;
            this.motionY = this.local_motionY;
            this.motionZ = -this.local_motionZ;
            System.out.println(this.motionY);
        }
    }
    
    public boolean hasNoGravity() {
        return true;
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3000.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        final int which = this.world.rand.nextInt(4);
        if (which == 0) {
            return SoundsHandler.ENTITY_CATERKILLER_LIVING1;
        }
        if (which == 1) {
            return SoundsHandler.ENTITY_CATERKILLER_LIVING2;
        }
        if (which == 2) {
            return SoundsHandler.ENTITY_CATERKILLER_LIVING3;
        }
        return SoundsHandler.ENTITY_CATERKILLER_LIVING4;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_ALOSAURUS_HURT;
    }
    
    @Nullable
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_ALOSAURUS_DEATH;
    }
}
