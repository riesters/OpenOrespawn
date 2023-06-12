package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import danger.orespawn.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraft.entity.*;

public class Dragonfly extends EntityAnimal
{
    private BlockPos currentFlightTarget;
    private GenericTargetSorter TargetSorter;
    
    public Dragonfly(final World par1World) {
        super(par1World);
        this.currentFlightTarget = null;
        this.TargetSorter = null;
        this.setSize(1.5f, 0.5f);
        this.experienceValue = 5;
        this.isImmuneToFire = false;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.33000001311302185);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    protected float getSoundVolume() {
        return 0.25f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return SoundsHandler.ENTITY_DRAGONFLY_LIVING;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_DRAGONFLY_HURT;
    }
    
    public void handleStatusUpdate(final byte id) {
    }
    
    public boolean canBePushed() {
        return true;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    private int mygetMaxHealth() {
        return 10;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 2.0f);
        return var4;
    }
    
    public boolean canSeeTarget(final double pX, final double pY, final double pZ) {
        return this.world.rayTraceBlocks(new Vec3d(this.posX, this.posY + 0.25, this.posZ), new Vec3d(pX, pY, pZ)) == null;
    }
    
    protected void updateAITasks() {
        int xdir = 1;
        int zdir = 1;
        int keep_trying = 50;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.rand.nextInt(300) == 0 || this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 2.0999999046325684) {
            for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; --keep_trying) {
                zdir = this.rand.nextInt(5) + 5;
                xdir = this.rand.nextInt(5) + 5;
                if (this.rand.nextInt(2) == 0) {
                    zdir = -zdir;
                }
                if (this.rand.nextInt(2) == 0) {
                    xdir = -xdir;
                }
                this.currentFlightTarget = new BlockPos((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(5) - 2, (int)this.posZ + zdir);
                bid = this.world.getBlockState(this.currentFlightTarget).getBlock();
                if (bid == Blocks.AIR && !this.canSeeTarget(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())) {
                    bid = Blocks.STONE;
                }
            }
        }
        else if (this.rand.nextInt(12) == 0 && this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
            EntityLivingBase e = null;
            e = this.findSomethingToAttack();
            if (e != null) {
                this.currentFlightTarget = new BlockPos((int)e.posX, (int)(e.posY + 1.0), (int)e.posZ);
                if (this.getDistanceSq((Entity)e) < 6.0) {
                    this.attackEntityAsMob((Entity)e);
                }
            }
        }
        final double var1 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.getX() + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.getX() + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.30000000149011613;
        this.motionY += (Math.signum(var2) * 0.699999988079071 - this.motionY) * 0.20000000149011612;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.30000000149011613;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapDegrees(var4 - this.rotationYaw);
        this.moveForward = 1.0f;
        this.rotationYaw += var5 / 4.0f;
    }
    
    protected boolean canTriggerWalking() {
        return true;
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
    }
    
    protected void fall(final float par1) {
    }
    
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return false;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        final boolean ret = super.attackEntityFrom(par1DamageSource, par2);
        final Entity e = par1DamageSource.getTrueSource();
        if (e != null && this.currentFlightTarget != null) {
            this.currentFlightTarget = new BlockPos((int)e.posX, (int)e.posY, (int)e.posZ);
        }
        return ret;
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.world.isDaytime();
    }
    
    public void initCreature() {
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL && par1EntityLiving != null && par1EntityLiving != this && par1EntityLiving.isEntityAlive() && this.getEntitySenses().canSee((Entity)par1EntityLiving) && (par1EntityLiving instanceof Butterfly || par1EntityLiving instanceof Bird);
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(10.0, 6.0, 10.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
    
    protected Item getDropItem() {
        final int i = this.world.rand.nextInt(6);
        if (i == 0) {
            return Items.GOLD_NUGGET;
        }
        if (i == 1) {
            return ModItems.URANIUM_NUGGET;
        }
        if (i == 2) {
            return ModItems.TITANIUM_NUGGET;
        }
        return null;
    }
    
    public EntityAgeable createChild(final EntityAgeable var1) {
        return null;
    }
}
