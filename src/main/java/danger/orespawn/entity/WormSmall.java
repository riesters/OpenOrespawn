package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import javax.annotation.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.entity.player.*;
import danger.orespawn.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.entity.item.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;

public class WormSmall extends EntityMob
{
    public int upcount;
    public int downcount;
    
    public WormSmall(final World par1World) {
        super(par1World);
        this.upcount = 50;
        this.downcount = 0;
        this.setSize(0.25f, 1.0f);
        this.experienceValue = 0;
        this.noClip = true;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0);
    }
    
    protected boolean canDespawn() {
        return false;
    }
    
    protected float getSoundVolume() {
        return 0.5f;
    }
    
    protected float getSoundPitch() {
        return 1.5f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.LITTLE_SPLAT;
    }
    
    protected SoundEvent getDeathSound() {
        return null;
    }
    
    public boolean canBePushed() {
        return true;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    public int mygetMaxHealth() {
        return 10;
    }
    
    public int getTotalArmorValue() {
        return 0;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public void onLivingUpdate() {
        EntityPlayer target = null;
        super.onLivingUpdate();
        target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(8.0, 8.0, 8.0), (Entity)this);
        if (target != null || OreSpawnMain.PlayNicely != 0) {
            if (this.upcount > 0) {
                --this.upcount;
                if (this.upcount == 0) {
                    this.downcount = 100 + this.world.rand.nextInt(150);
                }
                if (target != null) {
                    this.pointAtEntity((EntityLivingBase)target);
                }
                Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)(this.posY + 0.25), (int)this.posZ)).getBlock();
                if (bid == Blocks.TALLGRASS) {
                    bid = Blocks.AIR;
                }
                if (bid != Blocks.AIR) {
                    if (bid != Blocks.GRASS && bid != Blocks.DIRT && bid != Blocks.STONE) {
                        this.setDead();
                    }
                    this.motionY += 0.15000000596046448;
                    this.posY += 0.10000000149011612;
                }
            }
            else {
                if (this.downcount > 0) {
                    --this.downcount;
                }
                else {
                    this.upcount = 25 + this.world.rand.nextInt(50);
                }
                Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY + 2, (int)this.posZ)).getBlock();
                if (bid == Blocks.TALLGRASS) {
                    bid = Blocks.AIR;
                }
                if (bid != Blocks.AIR) {
                    if (bid != Blocks.GRASS && bid != Blocks.DIRT && bid != Blocks.STONE) {
                        this.setDead();
                    }
                    this.motionY += 0.20000000298023224;
                    this.posY += 0.05000000074505806;
                }
            }
        }
        else {
            this.upcount = this.world.rand.nextInt(50);
            this.downcount = 0;
            Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY + 2, (int)this.posZ)).getBlock();
            if (bid == Blocks.TALLGRASS) {
                bid = Blocks.AIR;
            }
            if (bid != Blocks.AIR) {
                if (bid != Blocks.GRASS && bid != Blocks.DIRT && bid != Blocks.STONE) {
                    this.setDead();
                }
                this.motionY += 0.10000000149011612;
                this.posY += 0.05000000074505806;
            }
        }
        this.motionY -= 0.01;
        this.motionX = 0.0;
        this.motionZ = 0.0;
        this.moveForward = 0.0f;
    }
    
    public void onUpdate() {
        if (this.isNoDespawnRequired()) {
            this.noClip = false;
        }
        super.onUpdate();
        this.motionY *= 0.75;
    }
    
    public void pointAtEntity(final EntityLivingBase e) {
        final double d1 = e.posX - this.posX;
        final double d2 = e.posZ - this.posZ;
        final float d3 = (float)Math.atan2(d2, d1);
        final float n;
        final float f2 = n = (float)(d3 * 180.0 / 3.141592653589793) - 90.0f;
        this.rotationYawHead = n;
        this.rotationYaw = n;
    }
    
    protected void updateAITasks() {
        int bid = 0;
        EntityPlayer target = null;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (OreSpawnMain.PlayNicely != 0) {
            return;
        }
        target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(1.5, 4.0, 1.5), (Entity)this);
        if (target != null && target.capabilities.isCreativeMode) {
            target = null;
        }
        if (target != null) {
            this.pointAtEntity((EntityLivingBase)target);
            if (this.upcount > 0 && this.world.rand.nextInt(15) == 1 && !target.capabilities.isCreativeMode) {
                super.attackEntityAsMob((Entity)target);
                if (this.world.rand.nextInt(6) == 1) {
                    final ItemStack boots = target.inventory.armorItemInSlot(1);
                    if (boots != null) {
                        target.inventory.setInventorySlotContents(1, (ItemStack)null);
                        bid = boots.getMaxDamage() - boots.getItemDamage();
                        if (bid > 20) {
                            bid /= 20;
                        }
                        else {
                            bid = 1;
                        }
                        boots.damageItem(bid, (EntityLivingBase)this);
                        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 3.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
                        this.world.spawnEntity((Entity)var3);
                    }
                }
            }
        }
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
        return !this.world.isDaytime();
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (par1DamageSource.getDamageType().equals("inWall")) {
            return ret;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        return ret;
    }
    
    protected Item getDropItem() {
        return null;
    }
}
