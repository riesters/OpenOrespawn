package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

public class Butterfly extends EntityCreature implements IAnimals
{
    private BlockPos spawnPosition;
    public int butterflyType;
    
    public Butterfly(final World worldIn) {
        super(worldIn);
        this.setSize(0.4f, 0.4f);
        this.butterflyType = this.rand.nextInt(4) + 1;
    }
    
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0);
    }
    
    public void updateAITasks() {
        super.updateAITasks();
        if (this.spawnPosition != null && (!this.world.isAirBlock(this.spawnPosition) || this.spawnPosition.getY() < 1)) {
            this.spawnPosition = null;
        }
        if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 4.0) {
            this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
        }
        final double d0 = this.spawnPosition.getX() + 0.5 - this.posX;
        final double d2 = this.spawnPosition.getY() + 0.1 - this.posY;
        final double d3 = this.spawnPosition.getZ() + 0.5 - this.posZ;
        this.motionX += (Math.signum(d0) * 0.5 - this.motionX) * 0.10000000149011612;
        this.motionY += (Math.signum(d2) * 0.699999988079071 - this.motionY) * 0.10000000149011612;
        this.motionZ += (Math.signum(d3) * 0.5 - this.motionZ) * 0.10000000149011612;
        final float f = (float)(MathHelper.atan2(this.motionZ, this.motionX) * 57.29577951308232) - 90.0f;
        final float f2 = MathHelper.wrapDegrees(f - this.rotationYaw);
        this.moveForward = 0.5f;
        this.rotationYaw += f2;
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6000000238418579;
        if (this.world.getSkylightSubtracted() > 7) {
            this.setDead();
        }
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
    }
}
