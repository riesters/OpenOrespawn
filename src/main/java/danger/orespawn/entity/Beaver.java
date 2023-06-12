package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.ai.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import danger.orespawn.*;
import net.minecraft.entity.item.*;
import danger.orespawn.util.handlers.*;
import java.util.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;

public class Beaver extends EntityAnimal
{
    private float moveSpeed;
    private GenericTargetSorter TargetSorter;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Beaver(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.15f;
        this.TargetSorter = null;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(0.6f, 0.8f);
        this.moveSpeed = 0.2f;
        this.experienceValue = 5;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 1.0, 1.5));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 8.0f, 1.0, 1.5));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(7, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    private boolean isWood(final Block bid) {
        return bid == Blocks.LOG || (bid == Blocks.OAK_FENCE || bid == Blocks.OAK_FENCE_GATE || bid == Blocks.STANDING_SIGN || bid == Blocks.BIRCH_FENCE || bid == Blocks.BIRCH_FENCE_GATE || bid == Blocks.ACACIA_FENCE || bid == Blocks.ACACIA_FENCE_GATE || bid == Blocks.JUNGLE_FENCE || bid == Blocks.JUNGLE_FENCE_GATE || bid == Blocks.SPRUCE_FENCE || bid == Blocks.SPRUCE_FENCE_GATE || bid == Blocks.DARK_OAK_FENCE || bid == Blocks.DARK_OAK_FENCE_GATE);
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (this.isWood(bid)) {
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
                if (this.isWood(bid)) {
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
                if (this.isWood(bid)) {
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
                if (this.isWood(bid)) {
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
                if (this.isWood(bid)) {
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
                if (this.isWood(bid)) {
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
    
    private ItemStack dropItemRand(final Item index, final int par1) {
        EntityItem var3 = null;
        final ItemStack is = new ItemStack(index, par1, 0);
        var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 4.0 + this.world.rand.nextInt(4), this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), is);
        if (var3 != null) {
            this.world.spawnEntity((Entity)var3);
        }
        return is;
    }
    
    public void breakRecursor(final World world, final int x, final int y, final int z, final int xf, final int yf, final int zf, final int recursion) {
        final int var7 = 1;
        if (recursion > 200) {
            return;
        }
        for (int var8 = -var7; var8 <= var7; ++var8) {
            for (int var9 = -var7; var9 <= var7; ++var9) {
                for (int var10 = -var7; var10 <= var7; ++var10) {
                    if (var8 != 0 || var9 != 0 || var10 != 0) {
                        if (x + var8 != xf || y + var9 != yf || z + var10 != zf) {
                            if (recursion <= 0 || x + var8 < xf - var7 || x + var8 > xf + var7 || y + var9 < yf - var7 || y + var9 > yf + var7 || z + var10 < zf - var7 || z + var10 > zf + var7) {
                                final Block var11 = world.getBlockState(new BlockPos(x + var8, y + var9, z + var10)).getBlock();
                                if (this.isWood(var11)) {
                                    world.setBlockToAir(new BlockPos(x + var8, y + var9, z + var10));
                                    this.dropItemRand(Item.getItemFromBlock(var11), 1);
                                    this.breakRecursor(world, x + var8, y + var9, z + var10, x, y, z, recursion + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (((this.world.rand.nextInt(30) == 0 && this.getBeaverHealth() < this.mygetMaxHealth()) || this.world.rand.nextInt(350) == 1) && OreSpawnMain.PlayNicely == 0) {
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
            int i = 0;
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 12) {
                    if (this.world.getGameRules().getBoolean("mobGriefing")) {
                        this.world.setBlockToAir(new BlockPos(this.tx, this.ty, this.tz));
                        this.breakRecursor(this.world, this.tx, this.ty, this.tz, this.tx, this.ty, this.tz, i);
                    }
                    this.heal(1.0f);
                    this.playSound(SoundsHandler.CHAINSAW, 1.0f, this.world.rand.nextFloat() * 0.2f + 0.9f);
                }
            }
        }
        if (this.world.rand.nextInt(200) == 1) {
            final Beaver buddy = this.findBuddy();
            if (buddy != null) {
                this.getNavigator().tryMoveToXYZ(buddy.posX, buddy.posY, buddy.posZ, 0.5);
            }
        }
        super.updateAITasks();
    }
    
    private Beaver findBuddy() {
        final List var5 = this.world.getEntitiesWithinAABB((Class)Beaver.class, this.getEntityBoundingBox().expand(16.0, 6.0, 16.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        Beaver var8 = null;
        if (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (Beaver)var7;
            return var8;
        }
        return null;
    }
    
    public boolean isAIDisabled() {
        return false;
    }
    
    public boolean canBreatheUnderwater() {
        return true;
    }
    
    private int mygetMaxHealth() {
        return 15;
    }
    
    private int getBeaverHealth() {
        return (int)this.getHealth();
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    @Nullable
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_SCORPION_HIT;
    }
    
    public void onDeath(final DamageSource cause) {
        super.onDeath(cause);
        this.playSound(SoundsHandler.ENTITY_CRYO_DEATH, this.getSoundVolume(), this.getSoundPitch());
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.PORKCHOP;
    }
    
    protected float getSoundPitch() {
        return this.isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.5f) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.0f);
    }
    
    public boolean getCanSpawnHere() {
        if (this.posY < 50.0) {
            return false;
        }
        if (this.posY > 100.0) {
            return false;
        }
        final Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY - 1, (int)this.posZ)).getBlock();
        return bid == Blocks.DIRT || bid == Blocks.GRASS || bid == Blocks.TALLGRASS || bid == Blocks.LEAVES;
    }
    
    protected boolean canDespawn() {
        return false;
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public Beaver spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new Beaver(this.world);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.APPLE;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return false;
    }
}
