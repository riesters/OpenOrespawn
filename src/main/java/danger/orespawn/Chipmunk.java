package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class Chipmunk extends EntityCannonFodder
{
    private float moveSpeed;
    
    public Chipmunk(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.38f;
        this.setSize(0.35f, 0.35f);
        this.moveSpeed = 0.38f;
        this.fireResistance = 100;
        this.getNavigator().setAvoidsWater(true);
        this.setSitting(false);
        this.experienceValue = 5;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIMate(this, 1.0));
        this.tasks.addTask(2, new MyEntityAIFollowOwner(this, 2.0f, 10.0f, 2.0f));
        this.tasks.addTask(3, new MyEntityAIAvoidEntity(this, EntityMob.class, 8.0f, 1.0, 1.600000023841858));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2000000476837158, Items.apple, false));
        this.tasks.addTask(5, new EntityAIPanic(this, 1.5));
        this.tasks.addTask(6, new EntityAIAvoidEntity(this, EntityPlayer.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLiving.class, 5.0f));
        this.tasks.addTask(9, new MyEntityAIWanderALot(this, 10, 1.0));
        this.tasks.addTask(10, new EntityAILookIdle(this));
        this.tasks.addTask(11, new EntityAIMoveIndoors(this));
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.setSitting(false);
    }
    
    @Override
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    protected void fall(final float par1) {
        float i = (float)MathHelper.ceiling_float_int(par1 - 3.0f);
        if (i > 0.0f) {
            if (i > 3.0f) {
                this.playSound("damage.fallbig", 1.0f, 1.0f);
            }
            else {
                this.playSound("damage.fallsmall", 1.0f, 1.0f);
            }
            if (i > 2.0f) {
                i = 2.0f;
            }
            this.attackEntityFrom(DamageSource.fall, i);
        }
    }
    
    protected void updateAITick() {
        if (this.isDead) {
            return;
        }
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget(null);
        }
        if (this.worldObj.rand.nextInt(250) == 0) {
            this.heal(1.0f);
        }
        if (!this.worldObj.isRemote && this.worldObj.rand.nextInt(600) == 1) {
            final Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ);
            if ((bid == Blocks.dirt || bid == Blocks.farmland) && this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")) {
                this.worldObj.setBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ, Blocks.air, 0, 2);
            }
        }
        super.updateAITick();
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 5;
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
        if (var2 != null && var2.getItem() == Items.apple && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0) {
            if (!this.isTamed()) {
                if (!this.worldObj.isRemote) {
                    if (this.rand.nextInt(2) == 0) {
                        this.setTamed(true);
                        this.func_152115_b(par1EntityPlayer.getUniqueID().toString());
                        this.playTameEffect(true);
                        this.worldObj.setEntityState(this, (byte)7);
                        this.heal(this.mygetMaxHealth() - this.getHealth());
                    }
                    else {
                        this.playTameEffect(false);
                        this.worldObj.setEntityState(this, (byte)6);
                    }
                }
            }
            else if (this.func_152114_e(par1EntityPlayer)) {
                if (this.worldObj.isRemote) {
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                if (this.mygetMaxHealth() > this.getHealth()) {
                    this.heal(this.mygetMaxHealth() - this.getHealth());
                }
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                --var2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0 && this.func_152114_e(par1EntityPlayer)) {
            if (!this.worldObj.isRemote) {
                this.setTamed(false);
                this.func_152115_b("");
                this.playTameEffect(false);
                this.worldObj.setEntityState(this, (byte)6);
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                --var2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0 && this.func_152114_e(par1EntityPlayer)) {
            this.setCustomNameTag(var2.getDisplayName());
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                --var2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
                }
            }
            return true;
        }
        if (this.isTamed() && this.func_152114_e(par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0) {
            this.setSitting(!this.isSitting());
            return true;
        }
        return false;
    }
    
    protected String getLivingSound() {
        this.isSitting();
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:scorpion_hit";
    }
    
    protected String getDeathSound() {
        return "orespawn:cryo_death";
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.wheat;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3;
        if (this.isTamed()) {
            var3 = this.rand.nextInt(5);
            var3 += 2;
            for (int var4 = 0; var4 < var3; ++var4) {
                this.dropItem(Item.getItemFromBlock(Blocks.red_flower), 1);
            }
        }
        else {
            super.dropFewItems(par1, par2);
        }
    }
    
    protected float getSoundPitch() {
        return this.isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.5f) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.0f);
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.findBuddies() <= 2;
    }
    
    private int findBuddies() {
        final List var5 = this.worldObj.getEntitiesWithinAABB(Chipmunk.class, this.boundingBox.expand(20.0, 10.0, 20.0));
        return var5.size();
    }
    
    protected boolean canDespawn() {
        if (this.isChild()) {
            this.func_110163_bv();
            return false;
        }
        return !this.isNoDespawnRequired() && !this.isTamed();
    }
    
    @Override
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return this.spawnBabyAnimal();
    }
    
    public Chipmunk spawnBabyAnimal() {
        return new Chipmunk(this.worldObj);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.apple;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple;
    }
}
