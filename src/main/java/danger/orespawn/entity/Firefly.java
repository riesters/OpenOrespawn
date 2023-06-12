package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import danger.orespawn.init.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import java.util.*;

public class Firefly extends EntityAmbientCreature
{
    int my_blink;
    int blinker;
    int myspace;
    private BlockPos currentFlightTarget;
    
    public Firefly(final World par1World) {
        super(par1World);
        this.my_blink = 0;
        this.blinker = 0;
        this.myspace = 0;
        this.currentFlightTarget = null;
        this.my_blink = 20 + this.rand.nextInt(20);
        this.setSize(0.4f, 0.8f);
    }
    
    public boolean isInRangeToRenderDist(final double distance) {
        double d0 = this.getEntityBoundingBox().getAverageEdgeLength();
        if (Double.isNaN(d0)) {
            d0 = 1.0;
        }
        d0 = d0 * 64.0 * 3.0;
        return distance < d0 * d0;
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
    
    public float getBlink() {
        if (this.blinker < this.my_blink / 2) {
            return 240.0f;
        }
        return 0.0f;
    }
    
    protected float getSoundVolume() {
        return 0.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return null;
    }
    
    public boolean canBePushed() {
        return true;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    protected void collideWithNearbyEntities() {
    }
    
    public int mygetMaxHealth() {
        return 1;
    }
    
    protected Item getDropItem() {
        return Item.getItemFromBlock(ModBlocks.EXTREME_TORCH);
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.600000023841;
        ++this.blinker;
        if (this.blinker > this.my_blink) {
            this.blinker = 0;
        }
        if (this.isNoDespawnRequired()) {
            return;
        }
        long t = this.world.getWorldTime();
        t %= 24000L;
        if (t > 11000L) {
            return;
        }
        if (this.world.rand.nextInt(500) == 1) {
            this.setDead();
        }
    }
    
    protected void updateAITasks() {
        int keep_trying = 25;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.rand.nextInt(40) == 0 || this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 2.0) {
            for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock(), --keep_trying) {
                this.currentFlightTarget = new BlockPos((int)this.posX + this.rand.nextInt(4) - this.rand.nextInt(4), (int)this.posY + this.rand.nextInt(4) - 2, (int)this.posZ + this.rand.nextInt(4) - this.rand.nextInt(4));
            }
        }
        final double var1 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.getY() + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.2 - this.motionX) * 0.1;
        this.motionY += (Math.signum(var2) * 0.699999988079071 - this.motionY) * 0.1;
        this.motionZ += (Math.signum(var3) * 0.2 - this.motionZ) * 0.1;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapDegrees(var4 - this.rotationYaw);
        this.moveForward = 0.2f;
        this.rotationYaw += var5 / 4.0f;
    }
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    public boolean getCanSpawnHere() {
        final Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ)).getBlock();
        return bid == Blocks.AIR && !this.world.isDaytime() && this.findBuddies() <= 10 && this.posY >= 50.0;
    }
    
    private int findBuddies() {
        final List var5 = this.world.getEntitiesWithinAABB((Class)Firefly.class, this.getEntityBoundingBox().expand(20.0, 8.0, 20.0));
        return var5.size();
    }
    
    protected boolean canDespawn() {
        return this.world.isDaytime() && !this.isNoDespawnRequired();
    }
}
