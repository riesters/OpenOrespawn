package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import net.minecraft.nbt.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.text.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.util.math.*;
import danger.orespawn.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.datasync.*;

public class Spyro extends EntityTameable
{
    protected static final DataParameter<Byte> ACTIVITY;
    protected static final DataParameter<Byte> FIRE;
    private BlockPos currentFlightTarget;
    private GenericTargetSorter TargetSorter;
    public int activity;
    private int owner_flying;
    private boolean target_in_sight;
    private float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Spyro(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.activity = 1;
        this.owner_flying = 0;
        this.target_in_sight = false;
        this.moveSpeed = 0.3f;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(0.5f, 0.5f);
        this.moveSpeed = 0.3f;
        this.isImmuneToFire = true;
        this.setSitting(false);
        this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 0.30000001192092896, 0.4000000059604645));
        this.tasks.addTask(3, (EntityAIBase)new MyEntityAIFollowOwner(this, 1.15f, 12.0f, 2.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25, Items.BEEF, false));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(7, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 0.75f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.experienceValue = 35;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.activity = 1;
        this.dataManager.register((DataParameter)Spyro.ACTIVITY, (byte)this.activity);
        this.dataManager.register((DataParameter)Spyro.FIRE, (byte)1);
        this.setSitting(false);
        this.setTamed(false);
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("SpyroActivity", (int)(byte)this.dataManager.get((DataParameter)Spyro.ACTIVITY));
        par1NBTTagCompound.setInteger("SpyroFire", (int)(byte)this.dataManager.get((DataParameter)Spyro.FIRE));
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.activity = par1NBTTagCompound.getInteger("SpyroActivity");
        this.dataManager.set((DataParameter)Spyro.ACTIVITY, (Object)(byte)this.activity);
        this.dataManager.set((DataParameter)Spyro.FIRE, (Object)(byte)par1NBTTagCompound.getInteger("SpyroFire"));
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
                if (bid == Blocks.LAVA || bid == Blocks.FLOWING_LAVA) {
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
    
    public int getActivity() {
        final int i = (byte)this.dataManager.get((DataParameter)Spyro.ACTIVITY);
        return i;
    }
    
    public void setActivity(final int par1) {
        this.activity = par1;
        this.dataManager.set((DataParameter)Spyro.ACTIVITY, (Object)(byte)this.activity);
    }
    
    public int getSpyroFire() {
        return (byte)this.dataManager.get((DataParameter)Spyro.FIRE);
    }
    
    public void setSpyroFire(final int par1) {
        this.dataManager.set((DataParameter)Spyro.FIRE, (Object)(byte)par1);
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public boolean canBreatheUnderwater() {
        return true;
    }
    
    public int mygetMaxHealth() {
        return 200;
    }
    
    public int getSpyroHealth() {
        return (int)this.getHealth();
    }
    
    public boolean processInteract(final EntityPlayer player, final EnumHand hand) {
        final ItemStack var2 = player.inventory.getCurrentItem();
        if (var2 != null && var2.getItem() == Items.BEEF && player.getDistanceSq((Entity)this) < 16.0) {
            if (!this.isTamed() && !this.world.isRemote) {
                if (this.world.rand.nextInt(2) == 1) {
                    this.setTamedBy(player);
                    this.playTameEffect(true);
                    this.world.setEntityState((Entity)this, (byte)7);
                    this.heal(this.mygetMaxHealth() - this.getHealth());
                }
                else {
                    this.playTameEffect(false);
                    this.world.setEntityState((Entity)this, (byte)6);
                }
            }
            if (!player.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.DEADBUSH) && player.getDistanceSq((Entity)this) < 16.0) {
            if (!this.world.isRemote) {
                this.setTamed(false);
                this.setHealth((float)this.mygetMaxHealth());
                this.setOwnerId((UUID)null);
                this.playTameEffect(false);
                this.world.setEntityState((Entity)this, (byte)6);
            }
            if (!player.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.ICE) && player.getDistanceSq((Entity)this) < 16.0) {
            if (!this.world.isRemote) {
                this.playTameEffect(true);
                this.world.setEntityState((Entity)this, (byte)6);
                this.setSpyroFire(0);
                player.sendMessage((ITextComponent)new TextComponentString("Baby Spyro fireballs extinguished."));
            }
            if (!player.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.FLINT_AND_STEEL && player.getDistanceSq((Entity)this) < 16.0) {
            if (!this.world.isRemote) {
                this.playTameEffect(true);
                this.world.setEntityState((Entity)this, (byte)6);
                this.setSpyroFire(1);
                player.sendMessage((ITextComponent)new TextComponentString("Baby Spyro fireballs lit!"));
            }
            if (!player.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.NAME_TAG && player.getDistanceSq((Entity)this) < 16.0) {
            this.setCustomNameTag(var2.getDisplayName());
            if (!player.capabilities.isCreativeMode) {
                var2.setCount(var2.getCount() - 1);
                if (var2.getCount() <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && player.getDistanceSq((Entity)this) < 16.0) {
            this.setSitting(!this.isSitting());
            return true;
        }
        return super.processInteract(player, hand);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.BEEF;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired() && !this.isTamed();
    }
    
    public int getTotalArmorValue() {
        return 5;
    }
    
    protected String getLivingSound() {
        if (this.isSitting()) {
            return null;
        }
        if (this.getActivity() != 2) {
            return null;
        }
        return "orespawn:roar";
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
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
        if (this.isTamed()) {
            var3 = this.world.rand.nextInt(4);
            ++var3;
            for (int var4 = 0; var4 < var3; ++var4) {
                this.dropItem(Items.BEEF, 1);
            }
        }
    }
    
    protected float getSoundPitch() {
        return this.isChild() ? ((this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.1f + 1.5f) : ((this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.1f + 1.0f);
    }
    
    protected boolean canTriggerWalking() {
        return true;
    }
    
    protected void fall(final float par1) {
    }
    
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return false;
    }
    
    public boolean getCanSpawnHere() {
        return this.world.isDaytime() && this.posY >= 50.0;
    }
    
    public EntityAgeable createChild(final EntityAgeable var1) {
        return null;
    }
    
    public float getAttackStrength(final Entity par1Entity) {
        return 4.0f;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final float var2 = this.getAttackStrength(par1Entity);
        final boolean var3 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), var2);
        return var3;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
        }
        return ret;
    }
    
    public boolean canSeeTarget(final double pX, final double pY, final double pZ) {
        return this.world.rayTraceBlocks(new Vec3d(this.posX, this.posY + 0.75, this.posZ), new Vec3d(pX, pY, pZ), false) == null;
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
        if (this.isInWater()) {
            this.motionY += 0.07;
        }
        if (this.world.isRemote) {
            return;
        }
        if (this.currentFlightTarget == null) {
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.world.rand.nextInt(100000) == 1 && !this.isNoDespawnRequired()) {
            Entity ent = null;
            Spyro d = null;
            ent = spawnCreature(this.world, "Spyro", this.posX, this.posY, this.posZ);
            if (ent != null) {
                d = (Spyro)ent;
                if (this.isTamed()) {
                    d.setTamed(true);
                }
                this.setDead();
                return;
            }
        }
        if (this.activity == 2) {
            if (this.posY < this.currentFlightTarget.getY() + 2.0) {
                this.motionY *= 0.7;
            }
            else if (this.posY > this.currentFlightTarget.getY() - 2.0) {
                this.motionY *= 0.5;
            }
            else {
                this.motionY *= 0.61;
            }
        }
        if (this.activity == 1 && this.isTamed() && this.getOwner() != null) {
            final EntityLivingBase e = this.getOwner();
            if (this.getDistanceSq((Entity)e) > 256.0) {
                this.setActivity(2);
            }
        }
        this.do_movement();
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public void onEntityUpdate() {
        int fly = 0;
        if (this.activity == 1) {
            super.onEntityUpdate();
        }
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (this.world.isRemote) {
            return;
        }
        if (!this.isSitting()) {
            if (this.activity == 0) {
                this.activity = 1;
            }
            if (this.world.rand.nextInt(20) == 0) {
                this.closest = 99999;
                final int tx = 0;
                this.tz = tx;
                this.ty = tx;
                this.tx = tx;
                for (int i = 1; i < 11; ++i) {
                    int j = i;
                    if (j > 4) {
                        j = 4;
                    }
                    if (this.scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i)) {
                        break;
                    }
                    if (i >= 6) {
                        ++i;
                    }
                }
                if (this.closest < 99999) {
                    this.setActivity(1);
                    this.getNavigator().tryMoveToXYZ((double)this.tx, (double)(this.ty - 1), (double)this.tz, 1.0);
                    if (this.handleWaterMovement()) {
                        this.heal(1.0f);
                        this.playSound(SoundEvents.ENTITY_GENERIC_SPLASH, 1.0f, this.world.rand.nextFloat() * 0.2f + 0.9f);
                    }
                }
            }
            if (this.world.rand.nextInt(100) == 1 && !this.target_in_sight) {
                this.activity = 1;
                if (this.world.rand.nextInt(8) == 1) {
                    this.activity = 2;
                }
                this.setActivity(this.activity);
            }
            this.owner_flying = 0;
            if (this.isTamed() && this.getOwner() != null) {
                final EntityPlayer e = (EntityPlayer)this.getOwner();
                if (e.capabilities.isFlying) {
                    fly = 1;
                }
                if (fly == 1) {
                    this.owner_flying = 1;
                    this.setActivity(2);
                }
            }
        }
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(100) == 1 && this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
    }
    
    private void do_movement() {
        int xdir = 1;
        int zdir = 1;
        int keep_trying = 50;
        int do_new = 0;
        double ox = 0.0;
        double oy = 0.0;
        double oz = 0.0;
        int has_owner = 0;
        EntityLivingBase e = null;
        if (this.currentFlightTarget == null) {
            do_new = 1;
            this.currentFlightTarget = new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ);
        }
        if (this.isSitting()) {
            return;
        }
        if (this.activity == 1) {
            return;
        }
        if (this.getActivity() == 2 && this.world.rand.nextInt(300) == 0) {
            do_new = 1;
        }
        if (this.isTamed() && this.getOwner() != null) {
            e = this.getOwner();
            has_owner = 1;
            ox = e.posX;
            oy = e.posY;
            oz = e.posZ;
            if (this.getDistanceSq((Entity)e) > 100.0) {
                do_new = 1;
            }
            if (this.owner_flying != 0 && this.getDistanceSq((Entity)e) > 36.0) {
                do_new = 1;
            }
        }
        if (this.world.rand.nextInt(6) == 1 && this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
            e = this.findSomethingToAttack();
            if (e != null) {
                if (this.isTamed() && this.getHealth() / this.mygetMaxHealth() < 0.25f) {
                    this.setActivity(2);
                    this.target_in_sight = false;
                    do_new = 0;
                    this.currentFlightTarget = new BlockPos((int)(this.posX + (this.posX - e.posX)), (int)(this.posY + 1.0), (int)(this.posZ + (this.posZ - e.posZ)));
                }
                else {
                    this.setActivity(2);
                    this.target_in_sight = true;
                    this.currentFlightTarget = new BlockPos((int)e.posX, (int)(e.posY + 1.0), (int)e.posZ);
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                    do_new = 0;
                    if (this.getDistanceSq((Entity)e) < (3.0f + e.width / 2.0f) * (3.0f + e.width / 2.0f)) {
                        this.attackEntityAsMob((Entity)e);
                    }
                    else if (this.getDistanceSq((Entity)e) < 64.0 && !this.isInWater() && ((this.getSpyroFire() == 1 && this.world.rand.nextInt(10) == 0) || this.world.rand.nextInt(15) == 1)) {
                        final EntitySmallFireball var2 = new EntitySmallFireball(this.world, (EntityLivingBase)this, e.posX - this.posX, e.posY + 0.25 - (this.posY + 1.25), e.posZ - this.posZ);
                        var2.setLocationAndAngles(this.posX, this.posY + 1.25, this.posZ, this.rotationYaw, this.rotationPitch);
                        this.world.playSound((EntityPlayer)null, this.getPosition(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL, 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                        this.world.spawnEntity((Entity)var2);
                    }
                }
            }
            else {
                this.target_in_sight = false;
            }
        }
        if (this.currentFlightTarget.distanceSq((double)(int)this.posX, (double)(int)this.posY, (double)(int)this.posZ) < 2.0999999046325684 && this.getActivity() != 3) {
            do_new = 1;
        }
        if (do_new != 0 && !this.target_in_sight) {
            for (Block bid = Blocks.STONE; bid != Blocks.AIR && keep_trying != 0; --keep_trying) {
                int gox = (int)this.posX;
                int goy = (int)this.posY;
                int goz = (int)this.posZ;
                if (has_owner == 1) {
                    gox = (int)ox;
                    goy = (int)oy;
                    goz = (int)oz;
                    if (this.owner_flying == 0) {
                        zdir = this.world.rand.nextInt(4) + 6;
                        xdir = this.world.rand.nextInt(4) + 6;
                    }
                    else {
                        zdir = this.world.rand.nextInt(6);
                        xdir = this.world.rand.nextInt(6);
                    }
                }
                else {
                    zdir = this.world.rand.nextInt(5) + 6;
                    xdir = this.world.rand.nextInt(5) + 6;
                }
                if (this.world.rand.nextInt(2) == 0) {
                    zdir = -zdir;
                }
                if (this.world.rand.nextInt(2) == 0) {
                    xdir = -xdir;
                }
                this.currentFlightTarget = new BlockPos(gox + xdir, goy + this.world.rand.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
                bid = this.world.getBlockState(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())).getBlock();
                if (bid == Blocks.AIR && !this.canSeeTarget(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())) {
                    bid = Blocks.STONE;
                }
            }
        }
        double speed_factor = 0.5;
        final double var3 = this.currentFlightTarget.getX() + 0.5 - this.posX;
        final double var4 = this.currentFlightTarget.getY() + 0.1 - this.posY;
        final double var5 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
        if (this.owner_flying != 0) {
            speed_factor = 1.75;
            if (this.isTamed() && this.getOwner() != null) {
                e = this.getOwner();
                if (this.getDistanceSq((Entity)e) > 49.0) {
                    speed_factor = 3.5;
                }
            }
        }
        this.motionX += (Math.signum(var3) * 0.5 - this.motionX) * 0.15 * speed_factor;
        this.motionY += (Math.signum(var4) * 0.7 - this.motionY) * 0.21 * speed_factor;
        this.motionZ += (Math.signum(var5) * 0.5 - this.motionZ) * 0.15 * speed_factor;
        final float var6 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
        final float var7 = MathHelper.wrapDegrees(var6 - this.rotationYaw);
        this.moveForward = (float)(0.75 * speed_factor);
        this.rotationYaw += var7 / 3.0f;
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL && par1EntityLiving != null && par1EntityLiving != this && par1EntityLiving.isEntityAlive() && this.getEntitySenses().canSee((Entity)par1EntityLiving) && !(par1EntityLiving instanceof Spyro) && par1EntityLiving instanceof EntityMob;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(12.0, 6.0, 12.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false) && this.canSeeTarget(var8.posX, var8.posY, var8.posZ)) {
                return var8;
            }
        }
        return null;
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        var8 = EntityList.createEntityByIDFromName(new ResourceLocation(par1), par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    static {
        ACTIVITY = EntityDataManager.createKey((Class)Spyro.class, DataSerializers.BYTE);
        FIRE = EntityDataManager.createKey((Class)Spyro.class, DataSerializers.BYTE);
    }
}
