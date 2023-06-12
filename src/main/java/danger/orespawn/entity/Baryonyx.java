package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import danger.orespawn.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import java.util.*;

public class Baryonyx extends EntityAnimal
{
    private float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Baryonyx(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.25f;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(1.5f, 2.8f);
        this.moveSpeed = 0.25f;
        this.experienceValue = 5;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 12.0f));
        this.tasks.addTask(6, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 1.0f));
        this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.world.isDaytime() && this.findBuddies() <= 8;
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.updateAITick();
        super.onUpdate();
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 40;
    }
    
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource source) {
        return SoundsHandler.ENTITY_DUCK_HURT;
    }
    
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_DUCK_HURT;
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.BEEF;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3 = 0;
        var3 = this.rand.nextInt(5);
        var3 += 2;
        for (int var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.BEEF, 1);
        }
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (bid == Blocks.GRASS) {
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
                if (bid == Blocks.GRASS) {
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
                if (bid == Blocks.GRASS) {
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
                if (bid == Blocks.GRASS) {
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
                if (bid == Blocks.GRASS) {
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
                if (bid == Blocks.GRASS) {
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
    
    protected void updateAITick() {
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (this.world.rand.nextInt(60) == 0 && OreSpawnMain.PlayNicely == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 1; i < 11; ++i) {
                int j = i;
                if (j > 2) {
                    j = 2;
                }
                if (this.scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 6) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 12) {
                    if (this.world.getGameRules().getBoolean("mobGriefing")) {
                        this.world.setBlockState(new BlockPos(this.tx, this.ty, this.tz), Blocks.DIRT.getDefaultState());
                    }
                    this.heal(1.0f);
                    this.playSound(SoundEvents.ENTITY_PLAYER_BURP, 1.0f, this.world.rand.nextFloat() * 0.2f + 0.9f);
                }
            }
        }
    }
    
    protected boolean canDespawn() {
        return !this.isChild() && !this.isNoDespawnRequired();
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public Baryonyx spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new Baryonyx(this.world);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.APPLE;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == Items.GOLDEN_APPLE;
    }
    
    private int findBuddies() {
        final List var5 = this.world.getEntitiesWithinAABB((Class)Baryonyx.class, this.getEntityBoundingBox().expand(20.0, 10.0, 20.0));
        return var5.size();
    }
    
    public boolean canMateWith(final EntityAnimal otherAnimal) {
        if (otherAnimal == this) {
            return false;
        }
        if (!(otherAnimal instanceof Baryonyx)) {
            return false;
        }
        final Baryonyx baryonyx = (Baryonyx)otherAnimal;
        return this.isInLove() && baryonyx.isInLove();
    }
}
