package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.item.*;
import danger.orespawn.*;
import net.minecraft.entity.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.*;

public class GammaMetroid extends EntityTameable
{
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public GammaMetroid(final World worldIn) {
        super(worldIn);
        this.TargetSorter = null;
        this.moveSpeed = 0.15f;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.moveSpeed = 0.15f;
        this.setSize(1.5f, 1.5f);
        this.experienceValue = 20;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIFollowOwner(this, 2.0f, 10.0f, 2.0f));
        this.tasks.addTask(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158, Items.IRON_INGOT, false));
        this.tasks.addTask(4, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0);
    }
    
    protected boolean canDespawn() {
        return !this.isChild() && !this.isTamed() && !this.isNoDespawnRequired();
    }
    
    public boolean attackEntityAsMob(final Entity entityIn) {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 10.0f);
    }
    
    public boolean processInteract(final EntityPlayer player, final EnumHand hand) {
        final ItemStack item = player.inventory.getCurrentItem();
        if (super.processInteract(player, hand)) {
            return true;
        }
        if (item.getItem() == Items.IRON_INGOT && player.getDistance((Entity)this) < 25.0 && !this.isTamed() && !this.world.isRemote) {
            if (this.rand.nextInt(3) == 0) {
                this.setTamed(true);
                this.playTameEffect(true);
                this.world.setEntityState((Entity)this, (byte)7);
                this.heal(this.mygetMaxHealth() - this.getHealth());
            }
            else {
                this.playTameEffect(false);
                this.world.setEntityState((Entity)this, (byte)6);
            }
        }
        return false;
    }
    
    private int mygetMaxHealth() {
        return 100;
    }
    
    public int getTotalArmorValue() {
        return super.getTotalArmorValue();
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        if (this.world.rand.nextInt(5) == 1) {
            return SoundsHandler.ENTITY_GAMMAMETROID_LIVING;
        }
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_DUCK_HURT;
    }
    
    @Nullable
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_ALOSAURUS_DEATH;
    }
    
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Nullable
    protected Item getDropItem() {
        return Items.IRON_INGOT;
    }
    
    private void dropItemRand(final Item item, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(item, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean wasRecentlyHit, final int lootingModifier) {
        for (int i = 5 + OreSpawnMain.OreSpawnRand.nextInt(10), var4 = 0; var4 < i; ++var4) {
            this.dropItemRand(Items.GOLD_NUGGET, 1);
        }
        for (int i = 6 + OreSpawnMain.OreSpawnRand.nextInt(10), var4 = 0; var4 < i; ++var4) {
            this.dropItemRand(Items.IRON_INGOT, 1);
        }
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL && this.world.rand.nextInt(5) == 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                if (this.getDistance((Entity)e) <= 9.0f) {
                    if (this.world.rand.nextInt(4) == 0 || this.world.rand.nextInt(5) == 1) {
                        this.attackEntityAsMob((Entity)e);
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                }
            }
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return false;
        }
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof GammaMetroid) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return false;
        }
        if (this.isTamed()) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            if (p.capabilities.isCreativeMode) {
                return false;
            }
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        if (this.isChild()) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(10.0, 3.0, 10.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
    
    public boolean getCanSpawnHere() {
        return this.posY <= 50.0;
    }
    
    private boolean scanIt(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                BlockPos pos = new BlockPos(x + dx, y + i, z + j);
                Block bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                pos = new BlockPos(x - dx, y + i, z + j);
                bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
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
                BlockPos pos = new BlockPos(x + i, y + dy, z + j);
                Block bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                pos = new BlockPos(x + i, y - dy, z + j);
                bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
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
                BlockPos pos = new BlockPos(x + i, y + j, z + dz);
                Block bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                pos = new BlockPos(x + i, y + j, z - dz);
                bid = this.world.getBlockState(pos).getBlock();
                if (bid == Blocks.STONE) {
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
    
    public void onUpdate() {
        if (this.isDead) {
            return;
        }
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
        if (((this.world.rand.nextInt(20) == 0 && this.getHealth() < this.mygetMaxHealth()) || this.world.rand.nextInt(100) == 0) && OreSpawnMain.PlayNicely == 0 && !this.isSitting()) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 1; i < 6; ++i) {
                int j = i;
                if (j > 2) {
                    j = 2;
                }
                if (this.scanIt((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 4) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 12) {
                    final BlockPos pos = new BlockPos(this.tx, this.ty, this.tz);
                    if (this.world.getGameRules().getBoolean("mobGriefing") && this.isServerWorld()) {
                        this.world.setBlockToAir(pos);
                        this.heal(1.0f);
                        this.playSound(SoundEvents.ENTITY_PLAYER_BURP, 0.5f, this.world.rand.nextFloat() * 0.2f + 1.5f);
                    }
                }
            }
        }
    }
    
    private boolean canPlaceBlock(final World p_188518_1_, final BlockPos p_188518_2_, final Block p_188518_3_, final IBlockState p_188518_4_, final IBlockState p_188518_5_) {
        return p_188518_3_.canPlaceBlockAt(p_188518_1_, p_188518_2_) && p_188518_4_.getMaterial() == Material.AIR && p_188518_5_.getMaterial() != Material.AIR && p_188518_5_.isFullCube();
    }
    
    @Nullable
    public EntityAgeable createChild(final EntityAgeable ageable) {
        return (EntityAgeable)this.spawnBabyAnimal(ageable);
    }
    
    private GammaMetroid spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        final GammaMetroid w = new GammaMetroid(this.world);
        if (this.isTamed()) {
            w.setTamed(true);
        }
        return w;
    }
    
    public void setInLove(@Nullable final EntityPlayer player) {
    }
    
    public boolean isBreedingItem(final ItemStack stack) {
        return stack.getItem() == Items.IRON_INGOT;
    }
    
    protected void entityInit() {
        super.entityInit();
    }
}
