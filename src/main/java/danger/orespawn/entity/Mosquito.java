package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import danger.orespawn.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;

public class Mosquito extends EntityAmbientCreature
{
    private BlockPos currentFlightTarget;
    
    public Mosquito(final World par1World) {
        super(par1World);
        this.currentFlightTarget = null;
        this.setSize(0.2f, 0.2f);
        this.experienceValue = 5;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected float getSoundPitch() {
        return 1.5f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return SoundsHandler.ENTITY_MOSQUITO_LIVING;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return null;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    public int mygetMaxHealth() {
        return 2;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6000000238418579;
    }
    
    protected void updateAITasks() {
        int keep_trying = 50;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.rand.nextInt(20) == 0 || this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 3.0) {
            EntityPlayer target = null;
            if (OreSpawnMain.OreSpawnRand.nextInt(4) == 0) {
                target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(10.0, 6.0, 10.0), (Entity)this);
                if (target != null) {
                    this.currentFlightTarget = new BlockPos((int)target.posX, (int)target.posY + 2, (int)target.posZ);
                }
                else {
                    for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock(), --keep_trying) {
                        this.currentFlightTarget = new BlockPos((int)this.posX + this.rand.nextInt(6) - this.rand.nextInt(6), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(6) - this.rand.nextInt(6));
                    }
                }
            }
            else {
                for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock(), --keep_trying) {
                    this.currentFlightTarget = new BlockPos((int)this.posX + this.rand.nextInt(6) - this.rand.nextInt(6), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(6) - this.rand.nextInt(6));
                }
            }
        }
        final double var1 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.getY() + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.10000000149011612;
        this.motionY += (Math.signum(var2) * 0.699999988079071 - this.motionY) * 0.10000000149011612;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.10000000149011612;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapDegrees(var4 - this.rotationYaw);
        this.moveForward = 0.3f;
        this.rotationYaw += var5;
    }
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    public boolean getCanSpawnHere() {
        return true;
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
    }
}
