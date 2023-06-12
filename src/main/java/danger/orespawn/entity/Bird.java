package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;

public class Bird extends EntityCreature implements IAnimals
{
    private BlockPos spawnPosition;
    public int birdType;
    
    public Bird(final World worldIn) {
        super(worldIn);
        this.setSize(0.4f, 0.4f);
        this.birdType = this.rand.nextInt(6);
    }
    
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0);
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
    
    protected float getSoundVolume() {
        return 0.55f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected SoundEvent getAmbientSound() {
        if (this.rand.nextInt(4) != 0) {
            return null;
        }
        switch (this.rand.nextInt(23) + 1) {
            case 1: {
                return SoundsHandler.ENTITY_BIRD_BIRD1;
            }
            case 2: {
                return SoundsHandler.ENTITY_BIRD_BIRD2;
            }
            case 3: {
                return SoundsHandler.ENTITY_BIRD_BIRD3;
            }
            case 4: {
                return SoundsHandler.ENTITY_BIRD_BIRD4;
            }
            case 5: {
                return SoundsHandler.ENTITY_BIRD_BIRD5;
            }
            case 6: {
                return SoundsHandler.ENTITY_BIRD_BIRD6;
            }
            case 7: {
                return SoundsHandler.ENTITY_BIRD_BIRD7;
            }
            case 8: {
                return SoundsHandler.ENTITY_BIRD_BIRD8;
            }
            case 9: {
                return SoundsHandler.ENTITY_BIRD_BIRD9;
            }
            case 10: {
                return SoundsHandler.ENTITY_BIRD_BIRD10;
            }
            case 11: {
                return SoundsHandler.ENTITY_BIRD_BIRD11;
            }
            case 12: {
                return SoundsHandler.ENTITY_BIRD_BIRD12;
            }
            case 13: {
                return SoundsHandler.ENTITY_BIRD_BIRD13;
            }
            case 14: {
                return SoundsHandler.ENTITY_BIRD_BIRD14;
            }
            case 15: {
                return SoundsHandler.ENTITY_BIRD_BIRD15;
            }
            case 16: {
                return SoundsHandler.ENTITY_BIRD_BIRD16;
            }
            case 17: {
                return SoundsHandler.ENTITY_BIRD_BIRD17;
            }
            case 18: {
                return SoundsHandler.ENTITY_BIRD_BIRD18;
            }
            case 19: {
                return SoundsHandler.ENTITY_BIRD_BIRD19;
            }
            case 20: {
                return SoundsHandler.ENTITY_BIRD_BIRD20;
            }
            case 21: {
                return SoundsHandler.ENTITY_BIRD_BIRD21;
            }
            case 22: {
                return SoundsHandler.ENTITY_BIRD_BIRD22;
            }
            default: {
                return SoundsHandler.ENTITY_BIRD_BIRD23;
            }
        }
    }
}
