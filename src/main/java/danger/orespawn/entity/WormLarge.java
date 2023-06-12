package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import javax.annotation.*;
import danger.orespawn.util.handlers.*;
import danger.orespawn.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.entity.item.*;
import net.minecraft.block.state.*;
import net.minecraft.tileentity.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;

public class WormLarge extends EntityMob
{
    private int wormsSpawned;
    
    public WormLarge(final World par1World) {
        super(par1World);
        this.wormsSpawned = 0;
        this.setSize(1.55f, 2.5f);
        this.experienceValue = 2050;
        this.noClip = true;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(18.0);
    }
    
    protected boolean canDespawn() {
        return false;
    }
    
    protected float getSoundVolume() {
        return 0.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.BIG_SPLAT;
    }
    
    public void onDeath(final DamageSource cause) {
        super.onDeath(cause);
        this.playSound(SoundsHandler.ENTITY_ALOSAURUS_DEATH, this.getSoundVolume(), this.getSoundPitch());
    }
    
    public boolean canBePushed() {
        return true;
    }
    
    protected void collideWithEntity(final Entity par1Entity) {
    }
    
    public int mygetMaxHealth() {
        return 90;
    }
    
    public int getTotalArmorValue() {
        return 14;
    }
    
    public boolean isAIDisabled() {
        return false;
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
    
    public void onLivingUpdate() {
        EntityPlayer target = null;
        WormMedium worms = null;
        EntityCreature newent = null;
        super.onLivingUpdate();
        worms = (WormMedium)this.world.findNearestEntityWithinAABB((Class)WormMedium.class, this.getEntityBoundingBox().expand(8.0, 8.0, 8.0), (Entity)this);
        if (worms == null) {
            target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(8.0, 8.0, 8.0), (Entity)this);
        }
        if ((worms == null && target != null) || OreSpawnMain.PlayNicely != 0) {
            if (target != null) {
                this.pointAtEntity((EntityLivingBase)target);
            }
            Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ)).getBlock();
            if (bid == Blocks.TALLGRASS) {
                bid = Blocks.AIR;
            }
            if (bid != Blocks.AIR) {
                this.motionY += 0.25;
                this.posY += 0.10000000149011612;
            }
            else {
                this.noClip = false;
            }
        }
        else {
            this.noClip = true;
            Block bid = this.world.getBlockState(new BlockPos((int)this.posX, (int)(this.posY + 3.5), (int)this.posZ)).getBlock();
            if (bid == Blocks.TALLGRASS) {
                bid = Blocks.AIR;
            }
            if (bid != Blocks.AIR) {
                this.motionY += 0.10000000149011612;
                this.posY += 0.05000000074505806;
                if (bid != Blocks.GRASS && bid != Blocks.DIRT && bid != Blocks.STONE) {
                    this.setDead();
                }
            }
        }
        if (this.noClip) {
            this.motionY -= 0.01;
            this.motionX = 0.0;
            this.motionZ = 0.0;
            this.moveForward = 0.0f;
        }
        if (this.world.isRemote) {
            return;
        }
        if (this.wormsSpawned != 0) {
            return;
        }
        this.wormsSpawned = 1;
        for (int i = 0; i < 20; ++i) {
            newent = (EntityCreature)spawnCreature(this.world, "Small Worm", this.posX + this.world.rand.nextInt(6) - this.world.rand.nextInt(6), this.posY, this.posZ + this.world.rand.nextInt(6) - this.world.rand.nextInt(6));
            newent = (EntityCreature)spawnCreature(this.world, "Medium Worm", this.posX + this.world.rand.nextInt(5) - this.world.rand.nextInt(5), this.posY, this.posZ + this.world.rand.nextInt(5) - this.world.rand.nextInt(5));
        }
    }
    
    public void onUpdate() {
        if (this.isNoDespawnRequired()) {
            this.noClip = false;
        }
        super.onUpdate();
        this.motionY *= 0.85;
    }
    
    protected void updateAITasks() {
        int bid = 0;
        EntityPlayer target = null;
        WormMedium worms = null;
        if (this.isDead) {
            return;
        }
        if (!this.noClip) {
            super.updateAITasks();
        }
        if (OreSpawnMain.PlayNicely != 0) {
            return;
        }
        worms = (WormMedium)this.world.findNearestEntityWithinAABB((Class)WormMedium.class, this.getEntityBoundingBox().expand(8.0, 8.0, 8.0), (Entity)this);
        if (worms != null) {
            return;
        }
        target = (EntityPlayer)this.world.findNearestEntityWithinAABB((Class)EntityPlayer.class, this.getEntityBoundingBox().expand(8.0, 6.0, 8.0), (Entity)this);
        if (target != null && target.capabilities.isCreativeMode) {
            target = null;
        }
        if (target != null) {
            this.pointAtEntity((EntityLivingBase)target);
            this.getNavigator().tryMoveToXYZ(target.posX, target.posY, target.posZ, 1.0);
            if (this.world.rand.nextInt(10) == 1 && this.getDistanceSq((Entity)target) < 3.0) {
                super.attackEntityAsMob((Entity)target);
                if (this.world.rand.nextInt(4) == 1) {
                    final ItemStack boots = target.inventory.armorItemInSlot(4);
                    target.inventory.setInventorySlotContents(4, (ItemStack)null);
                    bid = boots.getMaxDamage() - boots.getItemDamage();
                    if (bid > 10) {
                        bid /= 10;
                    }
                    else {
                        bid = 1;
                    }
                    boots.damageItem(bid, (EntityLivingBase)this);
                    final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 3.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
                    this.world.spawnEntity((Entity)var3);
                }
                if (this.world.rand.nextInt(4) == 1) {
                    final ItemStack boots = target.inventory.armorItemInSlot(0);
                    target.inventory.setInventorySlotContents(0, (ItemStack)null);
                    bid = boots.getMaxDamage() - boots.getItemDamage();
                    if (bid > 10) {
                        bid /= 10;
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
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    public void fall(final float distance, final float damageMultiplier) {
        if (!this.noClip) {
            super.fall(distance, damageMultiplier);
        }
    }
    
    protected void updateFallState(final double y, final boolean onGroundIn, final IBlockState state, final BlockPos pos) {
        if (!this.noClip) {
            super.updateFallState(y, onGroundIn, state, pos);
        }
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
    
    public boolean getCanSpawnHere() {
        for (int k = -3; k < 3; ++k) {
            for (int j = -3; j < 3; ++j) {
                for (int i = 0; i < 5; ++i) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k)).getBlock();
                    if (bid == Blocks.MOB_SPAWNER) {
                        TileEntityMobSpawner tileentitymobspawner = null;
                        tileentitymobspawner = (TileEntityMobSpawner)this.world.getTileEntity(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k));
                        final String s = tileentitymobspawner.getSpawnerBaseLogic().getCachedEntity().getName();
                        if (s.equals("Large Worm")) {
                            this.wormsSpawned = 1;
                            return true;
                        }
                    }
                }
            }
        }
        if (this.posY < 50.0) {
            return false;
        }
        WormLarge target = null;
        target = (WormLarge)this.world.findNearestEntityWithinAABB((Class)WormLarge.class, this.getEntityBoundingBox().expand(32.0, 8.0, 32.0), (Entity)this);
        if (target != null) {
            return false;
        }
        for (int i = -6; i <= 6; ++i) {
            for (int j = -6; j <= 6; ++j) {
                for (int k = -2; k >= -8; --k) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j)).getBlock();
                    if (bid == Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        for (int i = -6; i <= 6; ++i) {
            for (int j = -6; j <= 6; ++j) {
                for (int k = 2; k <= 8; ++k) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j)).getBlock();
                    if (bid != Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (par1DamageSource.getDamageType().equals("inWall")) {
            return ret;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        return ret;
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("wormsSpawned", this.wormsSpawned);
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.wormsSpawned = par1NBTTagCompound.getInteger("wormsSpawned");
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        var8 = EntityList.createEntityByIDFromName(new ResourceLocation(par1), par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
        }
        return var8;
    }
    
    protected Item getDropItem() {
        return Items.ROTTEN_FLESH;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 2.5 + this.world.rand.nextInt(4), this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        this.dropItemRand(Items.ITEM_FRAME, 1);
        for (int var4 = 0; var4 < 6; ++var4) {
            this.dropItemRand(Items.ROTTEN_FLESH, 1);
        }
        for (int var4 = 0; var4 < 6; ++var4) {
            this.dropItemRand(Items.LEATHER, 1);
        }
        for (int var4 = 0; var4 < 8; ++var4) {
            this.dropItemRand(Item.getItemFromBlock(Blocks.DIRT), 1);
        }
        for (int var4 = 0; var4 < 16; ++var4) {
            this.dropItemRand(Items.GOLD_NUGGET, 1);
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            this.dropItemRand(Items.DIAMOND, 1);
        }
        for (int var4 = 0; var4 < 4; ++var4) {
            this.dropItemRand(ModItems.URANIUM_NUGGET, 1);
        }
        for (int var4 = 0; var4 < 4; ++var4) {
            this.dropItemRand(ModItems.TITANIUM_NUGGET, 1);
        }
    }
}
