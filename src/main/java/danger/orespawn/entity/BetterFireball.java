package danger.orespawn.entity;

import net.minecraft.entity.projectile.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.nbt.*;

public class BetterFireball extends EntityFireball
{
    private int xTile;
    private int yTile;
    private int zTile;
    private int inTile;
    private boolean inGround;
    public EntityLivingBase shootingEntity;
    private int ticksAlive;
    private int ticksInAir;
    public double accelerationX;
    public double accelerationY;
    public double accelerationZ;
    public int field_92012_e;
    private int notme;
    private boolean small;
    
    public BetterFireball(final World par1World) {
        super(par1World);
        this.xTile = -1;
        this.yTile = -1;
        this.zTile = -1;
        this.inTile = 0;
        this.inGround = false;
        this.ticksInAir = 0;
        this.field_92012_e = 1;
        this.notme = 0;
        this.small = false;
        this.setSize(1.0f, 1.0f);
    }
    
    protected void entityInit() {
    }
    
    public BetterFireball(final World par1World, final EntityLivingBase par2EntityLiving, final double par3, final double par5, final double par7) {
        super(par1World);
        this.xTile = -1;
        this.yTile = -1;
        this.zTile = -1;
        this.inTile = 0;
        this.inGround = false;
        this.ticksInAir = 0;
        this.field_92012_e = 1;
        this.notme = 0;
        this.small = false;
        this.shootingEntity = par2EntityLiving;
        this.setSize(1.0f, 1.0f);
        this.setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY, par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        final double var9 = MathHelper.sqrt(par3 * par3 + par5 * par5 + par7 * par7);
        this.accelerationX = par3 / var9 * 0.1;
        this.accelerationY = par5 / var9 * 0.1;
        this.accelerationZ = par7 / var9 * 0.1;
    }
    
    public void setNotMe() {
        this.notme = 1;
    }
    
    public void setBig() {
        this.field_92012_e = 2;
    }
    
    public void setReallyBig() {
        this.field_92012_e = 4;
    }
    
    public void setSmall() {
        this.small = true;
        this.setSize(0.3125f, 0.3125f);
    }
    
    public void onUpdate() {
        Vec3d var15 = null;
        Vec3d var16 = null;
        RayTraceResult var17 = null;
        Entity var18 = null;
        List var19 = null;
        double var20 = 0.0;
        Entity var21 = null;
        final float var22 = 0.3f;
        double var23 = 0.0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        if (this.ticksAlive >= 600 || this.ticksInAir >= 600) {
            this.setDead();
            return;
        }
        if (!this.world.isRemote && this.shootingEntity != null && this.shootingEntity.isDead) {
            this.setDead();
        }
        else {
            super.onUpdate();
            this.setFire(1);
            if (this.inGround) {
                final Block var27 = this.world.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock();
                if (var27 != Blocks.AIR) {
                    ++this.ticksAlive;
                }
                this.inGround = false;
                this.motionX *= this.rand.nextFloat() * 0.2f;
                this.motionY *= this.rand.nextFloat() * 0.2f;
                this.motionZ *= this.rand.nextFloat() * 0.2f;
            }
            else {
                ++this.ticksInAir;
            }
            var15 = new Vec3d(this.posX, this.posY, this.posZ);
            var16 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            var17 = this.world.rayTraceBlocks(var15, var16, false);
            var15 = new Vec3d(this.posX, this.posY, this.posZ);
            var16 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (var17 != null) {
                var16 = new Vec3d(var17.hitVec.x, var17.hitVec.y, var17.hitVec.z);
            }
            var18 = null;
            var19 = this.world.getEntitiesWithinAABBExcludingEntity((Entity)this, this.getEntityBoundingBox().offset(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
            var20 = 0.0;
            for (int var28 = 0; var28 < var19.size(); ++var28) {
                var21 = (Entity)var19.get(var28);
                if (this.shootingEntity == var21) {
                    var17 = null;
                    break;
                }
                if (var21 instanceof BetterFireball) {
                    var17 = null;
                    break;
                }
                if (this.notme != 0 && (var21 instanceof EntityPlayer || var21 instanceof Mothra)) {
                    var17 = null;
                    break;
                }
                if (var21.canBeCollidedWith() && (!var21.isEntityEqual((Entity)this.shootingEntity) || this.ticksInAir >= 25)) {
                    final AxisAlignedBB var29 = var21.getEntityBoundingBox().expand((double)var22, (double)var22, (double)var22);
                    final RayTraceResult var30 = var29.calculateIntercept(var15, var16);
                    if (var30 != null) {
                        var23 = var15.distanceTo(var30.hitVec);
                        if (var23 < var20 || var20 == 0.0) {
                            var18 = var21;
                            var20 = var23;
                        }
                    }
                }
            }
            if (var18 != null) {
                var17 = new RayTraceResult(var18);
            }
            if (var17 != null) {
                this.onImpact(var17);
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            var24 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) + 90.0f;
            this.rotationPitch = (float)(Math.atan2(var24, this.motionY) * 180.0 / 3.141592653589793) - 90.0f;
            while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
                this.prevRotationPitch -= 360.0f;
            }
            while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
                this.prevRotationPitch += 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.prevRotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.prevRotationYaw += 360.0f;
            }
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
            var25 = this.getMotionFactor();
            if (this.isInWater()) {
                for (int var31 = 0; var31 < 4; ++var31) {
                    var26 = 0.25f;
                    this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * var26, this.posY - this.motionY * var26, this.posZ - this.motionZ * var26, this.motionX, this.motionY, this.motionZ, new int[0]);
                }
                var25 = 0.8f;
            }
            this.motionX += this.accelerationX;
            this.motionY += this.accelerationY;
            this.motionZ += this.accelerationZ;
            this.motionX *= var25;
            this.motionY *= var25;
            this.motionZ *= var25;
            this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }
    
    protected void onImpact(final RayTraceResult par1MovingObjectPosition) {
        if (!this.world.isRemote) {
            if (par1MovingObjectPosition.entityHit != null) {
                if (par1MovingObjectPosition.entityHit instanceof BetterFireball) {
                    return;
                }
                if (par1MovingObjectPosition.entityHit instanceof Mothra) {
                    return;
                }
                if (this.notme != 0 && par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
                    this.setDead();
                    return;
                }
                final Entity e = par1MovingObjectPosition.entityHit;
                if (e instanceof EntityLiving) {
                    final EntityLiving el = (EntityLiving)e;
                    if (el.width * el.height > 30.0f) {}
                }
                if (!this.small) {
                    par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeFireballDamage((EntityFireball)this, (Entity)this.shootingEntity), 10.0f);
                    par1MovingObjectPosition.entityHit.setFire(5);
                }
                else {
                    par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeFireballDamage((EntityFireball)this, (Entity)this.shootingEntity), 5.0f);
                    par1MovingObjectPosition.entityHit.setFire(5);
                }
            }
            else {
                int i = par1MovingObjectPosition.getBlockPos().getX();
                int j = par1MovingObjectPosition.getBlockPos().getY();
                int k = par1MovingObjectPosition.getBlockPos().getZ();
                switch (par1MovingObjectPosition.sideHit) {
                    case DOWN: {
                        --j;
                        break;
                    }
                    case UP: {
                        ++j;
                        break;
                    }
                    case SOUTH: {
                        --k;
                        break;
                    }
                    case NORTH: {
                        ++k;
                        break;
                    }
                    case WEST: {
                        --i;
                        break;
                    }
                    case EAST: {
                        ++i;
                        break;
                    }
                }
                if (this.world.isAirBlock(new BlockPos(i, j, k))) {
                    this.world.setBlockState(new BlockPos(i, j, k), Blocks.FIRE.getDefaultState());
                }
            }
            if (!this.small) {
                this.world.newExplosion((Entity)null, this.posX, this.posY, this.posZ, (float)this.field_92012_e, true, this.world.getGameRules().getBoolean("mobGriefing"));
            }
            this.setDead();
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("ExplosionPower", this.field_92012_e);
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        if (par1NBTTagCompound.hasKey("ExplosionPower")) {
            this.field_92012_e = par1NBTTagCompound.getInteger("ExplosionPower");
        }
    }
}
