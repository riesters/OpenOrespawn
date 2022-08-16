package danger.orespawn;

import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import java.util.*;
import net.minecraft.entity.*;

public class Lizard extends EntityCannonFodder
{
    private GenericTargetSorter TargetSorter;
    public boolean should_despawn;
    private EntityLivingBase buddy;
    private int follow_time;
    private final float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Lizard(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.should_despawn = true;
        this.buddy = null;
        this.follow_time = 0;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.moveSpeed = 0.3f;
        this.setSize(1.5f, 1.25f);
        this.getNavigator().setAvoidsWater(false);
        this.experienceValue = 15;
        this.fireResistance = 3;
        this.isImmuneToFire = false;
        this.TargetSorter = new GenericTargetSorter(this);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new MyEntityAIFollowOwner(this, 2.0f, 10.0f, 2.0f));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25, Items.dye, false));
        this.tasks.addTask(4, new MyEntityAIWanderALot(this, 16, 1.0));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(23, (byte) 0);
    }
    
    @Override
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 30;
    }
    
    @Override
    public int getTotalArmorValue() {
        return 5;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        final Entity e = par1DamageSource.getEntity();
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
            if (e instanceof EntityLivingBase) {
                this.setAttackTarget((EntityLivingBase)e);
            }
        }
        this.follow_time = 0;
        return ret;
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:alo_hurt";
    }
    
    protected String getDeathSound() {
        return "orespawn:alo_death";
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    @Override
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2 != null && var2.stackSize <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
            var2 = null;
        }
        if (super.interact(par1EntityPlayer)) {
            return true;
        }
        if (var2 != null && var2.getItem() == Items.dye && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0) {
            if (!this.worldObj.isRemote) {
                this.buddy = par1EntityPlayer;
                this.follow_time = 3000 + this.worldObj.rand.nextInt(2000);
            }
            this.playTameEffect(true);
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                --var2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
                }
            }
            return true;
        }
        if (!this.worldObj.isRemote) {
            this.buddy = null;
            this.follow_time = 0;
        }
        this.playTameEffect(false);
        return true;
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
                int i1 = dx * dx + j * j + i * i;
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x - dx, y + i, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y - dy, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    if (i1 < this.closest) {
                        this.closest = i1;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y + j, z - dz);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.follow_time > 0) {
            --this.follow_time;
            this.should_despawn = false;
        }
        else {
            this.should_despawn = true;
        }
        if (!this.isInWater() && this.worldObj.rand.nextInt(100) == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 1; i < 14; ++i) {
                int j = i;
                if (j > 5) {
                    j = 5;
                }
                if (this.scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 5) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ(this.tx, this.ty - 1, this.tz, 1.33);
            }
        }
        if (this.getHealth() < this.mygetMaxHealth() && this.worldObj.rand.nextInt(300) == 1) {
            this.heal(1.0f);
        }
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(10) == 1) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.follow_time = 0;
                if (this.getDistanceSqToEntity(e) < 12.0) {
                    this.setAttacking(1);
                    if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1) {
                        this.attackEntityAsMob(e);
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving(e, 1.2);
                }
            }
            else {
                if (this.buddy != null && !this.buddy.isDead && this.worldObj.rand.nextInt(15) == 1) {
                    this.getNavigator().tryMoveToEntityLiving(this.buddy, 1.0);
                }
                this.setAttacking(0);
            }
        }
        if (this.buddy != null && !this.buddy.isDead && this.follow_time > 0 && this.worldObj.rand.nextInt(20) == 1) {
            this.getNavigator().tryMoveToEntityLiving(this.buddy, 1.0);
        }
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final float i = 6.0f;
        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), i);
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving) {
        if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL) {
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
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof AttackSquid) {
            return true;
        }
        if (par1EntityLiving instanceof EntitySpider) {
            return true;
        }
        if (par1EntityLiving instanceof EntityChicken) {
            return true;
        }
        if (par1EntityLiving instanceof Lizard && this.worldObj.rand.nextInt(10) == 1 && this.follow_time <= 0) {
            this.buddy = par1EntityLiving;
        }
        return false;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0, 4.0, 12.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        if (this.worldObj.rand.nextInt(100) == 0) {
            this.setAttackTarget(null);
        }
        final EntityLivingBase e = this.getAttackTarget();
        if (e != null && e.isEntityAlive()) {
            return e;
        }
        this.setAttackTarget(null);
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8)) {
                return var8;
            }
        }
        return null;
    }
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectByte(23);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(23, (byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0;
    }
    
    protected boolean canDespawn() {
        if (this.isChild()) {
            this.func_110163_bv();
            return false;
        }
        return !this.isNoDespawnRequired() && !this.isTamed() && this.should_despawn;
    }
    
    @Override
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return this.spawnBabyAnimal();
    }
    
    public Lizard spawnBabyAnimal() {
        return new Lizard(this.worldObj);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.apple;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple;
    }
}
