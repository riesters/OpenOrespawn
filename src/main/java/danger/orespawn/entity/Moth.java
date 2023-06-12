package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import danger.orespawn.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

public class Moth extends EntityCreature implements IAnimals
{
    private BlockPos currentFlightTarget;
    public int moth_type;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Moth(final World par1World) {
        super(par1World);
        this.currentFlightTarget = null;
        this.moth_type = 0;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.moth_type = OreSpawnMain.OreSpawnRand.nextInt(4);
        this.setSize(0.5f, 0.5f);
    }
    
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0);
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6;
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x - dx, y + i, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x - dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + dy, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y - dy, z + j)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y - dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dy; j <= dy; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + j, z + dz)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y + j, z - dz)).getBlock();
                if (bid == Blocks.TORCH || bid == ModBlocks.EXTREME_TORCH) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z - dz;
                        ++found;
                    }
                }
            }
        }
        return found != 0;
    }
    
    public void updateAITasks() {
        int keep_trying = 25;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.rand.nextInt(100) == 0 || this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 4.0) {
            for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock(), --keep_trying) {
                this.currentFlightTarget = new BlockPos((int)this.posX + this.rand.nextInt(10) - this.rand.nextInt(10), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(10) - this.rand.nextInt(10));
            }
        }
        else if (!this.world.isDaytime() && this.rand.nextInt(10) == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 2; i < 15 && !this.scan_it((int)this.posX, (int)this.posY, (int)this.posZ, i, i, i); ++i) {
                if (i >= 6) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.currentFlightTarget = new BlockPos(this.tx, this.ty + 1, this.tz);
            }
        }
        final double var1 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.getY() + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.10000000149011612;
        this.motionY += (Math.signum(var2) * 0.68 - this.motionY) * 0.10000000149011612;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.10000000149011612;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapDegrees(var4 - this.rotationYaw);
        this.moveForward = 0.75f;
        this.rotationYaw += var5;
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
        return bid == Blocks.AIR && !this.world.isDaytime() && this.posY >= 50.0;
    }
}
