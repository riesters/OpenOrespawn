package danger.orespawn.entity;

import net.minecraft.world.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import danger.orespawn.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.util.*;
import javax.annotation.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.entity.*;

public class VelocityRaptor extends EntityTameable
{
    private float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public VelocityRaptor(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.55f;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(0.5f, 0.6f);
        this.setSitting(false);
        this.experienceValue = 5;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIFollowOwner(this, 1.5f, 10.0f, 2.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25, Items.APPLE, false));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.600000023841858));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(7, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 0.9f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.setSitting(false);
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.world.isDaytime();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    protected void fall(final float par1) {
        float i = (float)MathHelper.ceil(par1 - 3.0f);
        if (i > 0.0f) {
            if (i > 3.0f) {
                this.playSound(SoundEvents.ENTITY_GENERIC_BIG_FALL, 1.0f, 1.0f);
            }
            else {
                this.playSound(SoundEvents.ENTITY_GENERIC_SMALL_FALL, 1.0f, 1.0f);
            }
            if (i > 2.0f) {
                i = 2.0f;
            }
            this.attackEntityFrom(DamageSource.FALL, i);
        }
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
                if (bid == Blocks.TALLGRASS || bid == Blocks.YELLOW_FLOWER || bid == Blocks.RED_FLOWER || bid == Blocks.DEADBUSH || bid == Blocks.DOUBLE_PLANT) {
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
    
    public void onEntityUpdate() {
        super.onEntityUpdate();
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (!this.isSitting() && ((this.world.rand.nextInt(20) == 0 && this.getVHealth() < this.mygetMaxHealth()) || this.world.rand.nextInt(250) == 0) && OreSpawnMain.PlayNicely == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 1; i < 10; ++i) {
                int j = i;
                if (j > 2) {
                    j = 2;
                }
                if (this.scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 5) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 12) {
                    if (this.world.getGameRules().getBoolean("mobGriefing")) {
                        this.world.setBlockState(new BlockPos(this.tx, this.ty, this.tz), Blocks.AIR.getDefaultState());
                    }
                    this.heal(2.0f);
                    this.playSound(SoundEvents.ENTITY_PLAYER_BURP, 0.5f, this.world.rand.nextFloat() * 0.2f + 1.5f);
                }
            }
        }
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return this.isTamed() ? 20 : 10;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public int getVHealth() {
        return (int)this.getHealth();
    }
    
    public boolean processInteract(final EntityPlayer par1EntityPlayer, final EnumHand hand) {
        final ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (super.processInteract(par1EntityPlayer, EnumHand.MAIN_HAND)) {
            return true;
        }
        if (var2 != null && var2.getItem() == Items.APPLE && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            if (!this.isTamed()) {
                if (!this.world.isRemote) {
                    if (this.rand.nextInt(2) == 0) {
                        this.setTamedBy(par1EntityPlayer);
                        this.playTameEffect(true);
                        this.world.setEntityState((Entity)this, (byte)7);
                        this.heal(this.mygetMaxHealth() - this.getHealth());
                    }
                    else {
                        this.playTameEffect(false);
                        this.world.setEntityState((Entity)this, (byte)6);
                    }
                }
            }
            else {
                if (this.world.isRemote) {
                    this.playTameEffect(true);
                    this.world.setEntityState((Entity)this, (byte)7);
                    par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6000000238418579);
                }
                if (this.mygetMaxHealth() > this.getHealth()) {
                    this.heal(this.mygetMaxHealth() - this.getHealth());
                }
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.DEADBUSH) && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            if (!this.world.isRemote) {
                this.setTamed(false);
                this.setOwnerId((UUID)null);
                par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
                this.setHealth((float)this.mygetMaxHealth());
                this.playTameEffect(false);
                this.world.setEntityState((Entity)this, (byte)6);
            }
            else {
                par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.NAME_TAG && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            this.setCustomNameTag(var2.getDisplayName());
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            this.setSitting(!this.isSitting());
            if (this.world.isRemote) {
                par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
            }
            return true;
        }
        return false;
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2.getCount() <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
            var2 = null;
        }
        if (super.processInteract(par1EntityPlayer, EnumHand.MAIN_HAND)) {
            return true;
        }
        if (var2 != null && var2.getItem() == Items.APPLE && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            if (!this.isTamed() && !this.world.isRemote) {
                if (this.rand.nextInt(2) == 0) {
                    this.setTamedBy(par1EntityPlayer);
                    this.playTameEffect(true);
                    this.world.setEntityState((Entity)this, (byte)7);
                    this.heal(this.mygetMaxHealth() - this.getHealth());
                }
                else {
                    this.playTameEffect(false);
                    this.world.setEntityState((Entity)this, (byte)6);
                }
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.DEADBUSH) && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            if (!this.world.isRemote) {
                this.setTamed(false);
                this.setOwnerId((UUID)null);
                this.setHealth((float)this.mygetMaxHealth());
                this.playTameEffect(false);
                this.world.setEntityState((Entity)this, (byte)6);
            }
            else {
                par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.NAME_TAG && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            this.setCustomNameTag(var2.getDisplayName());
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && par1EntityPlayer.getDistanceSq((Entity)this) < 16.0) {
            this.setSitting(!this.isSitting());
            if (this.world.isRemote) {
                par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896);
            }
            return true;
        }
        return false;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_CRYO_HURT;
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3 = 0;
        if (this.isTamed()) {
            var3 = this.rand.nextInt(5);
            var3 += 2;
            for (int var4 = 0; var4 < var3; ++var4) {
                this.dropItem(Item.getItemFromBlock((Block)Blocks.RED_FLOWER), 1);
            }
        }
    }
    
    protected float getSoundPitch() {
        return this.isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.5f) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.0f);
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        float p2 = par2;
        if (p2 > 10.0f) {
            p2 = 10.0f;
        }
        ret = super.attackEntityFrom(par1DamageSource, p2);
        return ret;
    }
    
    protected boolean canDespawn() {
        return !this.isChild() && !this.isTamed() && !this.isNoDespawnRequired();
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public VelocityRaptor spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new VelocityRaptor(this.world);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.APPLE;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == Items.APPLE;
    }
}
