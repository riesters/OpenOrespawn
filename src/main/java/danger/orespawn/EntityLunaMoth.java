package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.util.*;

public class EntityLunaMoth extends EntityButterfly
{
    private ChunkCoordinates currentFlightTarget;
    public int moth_type;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public EntityLunaMoth(final World par1World) {
        super(par1World);
        this.currentFlightTarget = null;
        this.moth_type = 0;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.moth_type = OreSpawnMain.OreSpawnRand.nextInt(4);
        this.setSize(0.5f, 0.5f);
        this.getNavigator().setAvoidsWater(true);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    }
    
    @Override
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    @Override
    protected boolean isAIEnabled() {
        return true;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.motionY *= 0.6;
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
                int i1 = dx * dx + j * j + i * i;
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x - dx, y + i, z + j);
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
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
                Block bid = this.worldObj.getBlock(x + i, y + dy, z + j);
                int i1 = dy * dy + j * j + i * i;
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y - dy, z + j);
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
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
                Block bid = this.worldObj.getBlock(x + i, y + j, z + dz);
                int i1 = dz * dz + j * j + i * i;
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y + j, z - dz);
                if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
                    if (i1 < this.closest) {
                        this.closest = i1;
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
    
    @Override
    protected void updateAITasks() {
        int keep_trying = 25;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.rand.nextInt(100) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0f) {
            for (Block bid = Blocks.stone; bid != Blocks.air && keep_trying != 0; bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ), --keep_trying) {
                this.currentFlightTarget.set((int)this.posX + this.rand.nextInt(10) - this.rand.nextInt(10), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(10) - this.rand.nextInt(10));
            }
        }
        else if (!this.worldObj.isDaytime() && this.rand.nextInt(10) == 0) {
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
                this.currentFlightTarget.set(this.tx, this.ty + 1, this.tz);
            }
        }
        final double var1 = this.currentFlightTarget.posX + 0.5 - this.posX;
        final double var2 = this.currentFlightTarget.posY + 0.1 - this.posY;
        final double var3 = this.currentFlightTarget.posZ + 0.5 - this.posZ;
        this.motionX += (Math.signum(var1) * 0.5 - this.motionX) * 0.10000000149011612;
        this.motionY += (Math.signum(var2) * 0.68 - this.motionY) * 0.10000000149011612;
        this.motionZ += (Math.signum(var3) * 0.5 - this.motionZ) * 0.10000000149011612;
        final float var4 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var5 = MathHelper.wrapAngleTo180_float(var4 - this.rotationYaw);
        this.moveForward = 0.75f;
        this.rotationYaw += var5;
    }
    
    @Override
    protected void fall(final float par1) {
    }
    
    @Override
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    @Override
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        final Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
        return bid == Blocks.air && !this.worldObj.isDaytime() && (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4 || this.posY >= 50.0);
    }
    
    @Override
    public void initCreature() {
    }
}
