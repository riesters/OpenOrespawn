package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import danger.orespawn.util.handlers.*;
import javax.annotation.*;
import net.minecraft.util.*;
import danger.orespawn.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.network.datasync.*;

public class Nastysaurus extends EntityMob
{
    protected static final DataParameter<Byte> ATTACKING;
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    private EntityLivingBase rt;
    private RenderInfo renderdata;
    
    public Nastysaurus(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.moveSpeed = 0.35f;
        this.rt = null;
        this.renderdata = new RenderInfo();
        this.setSize(2.2f, 4.6f);
        this.experienceValue = 40;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(32.0);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register((DataParameter)Nastysaurus.ATTACKING, (byte)0);
        if (this.renderdata == null) {
            this.renderdata = new RenderInfo();
        }
        this.renderdata.rf1 = 0.0f;
        this.renderdata.rf2 = 0.0f;
        this.renderdata.rf3 = 0.0f;
        this.renderdata.rf4 = 0.0f;
        this.renderdata.ri1 = 0;
        this.renderdata.ri2 = 0;
        this.renderdata.ri3 = 0;
        this.renderdata.ri4 = 0;
    }
    
    public RenderInfo getRenderInfo() {
        return this.renderdata;
    }
    
    public void setRenderInfo(final RenderInfo r) {
        this.renderdata.rf1 = r.rf1;
        this.renderdata.rf2 = r.rf2;
        this.renderdata.rf3 = r.rf3;
        this.renderdata.rf4 = r.rf4;
        this.renderdata.ri1 = r.ri1;
        this.renderdata.ri2 = r.ri2;
        this.renderdata.ri3 = r.ri3;
        this.renderdata.ri4 = r.ri4;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 200;
    }
    
    public int getTotalArmorValue() {
        return 17;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        if (this.rand.nextInt(4) == 0) {
            return SoundsHandler.ENTITY_ALOSAURUS_LIVING;
        }
        return null;
    }
    
    protected SoundEvent getHurtSound(final DamageSource damageSourceIn) {
        return SoundsHandler.ENTITY_ALOSAURUS_HURT;
    }
    
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.BEEF;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.world, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 3.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
        this.world.spawnEntity((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.IRON_INGOT, 1);
        }
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.ROTTEN_FLESH, 1);
        }
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.LEATHER, 1);
        }
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.STRING, 1);
        }
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        if (super.attackEntityAsMob(par1Entity)) {
            if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
                final double ks = 1.2;
                double inair = 0.1;
                final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
                if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                    inair *= 2.0;
                }
                par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
            }
            return true;
        }
        return false;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
            final Entity e = par1DamageSource.getTrueSource();
            if (e != null && e instanceof EntityLivingBase) {
                this.rt = (EntityLivingBase)e;
            }
        }
        return ret;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(5) == 0) {
            EntityLivingBase e = null;
            e = this.rt;
            if (OreSpawnMain.PlayNicely != 0) {
                e = null;
            }
            if (e != null) {
                if (e.isDead || this.world.rand.nextInt(250) == 1) {
                    e = null;
                    this.rt = null;
                }
                if (e != null && !this.getEntitySenses().canSee((Entity)e)) {
                    e = null;
                }
            }
            if (e == null) {
                e = this.findSomethingToAttack();
            }
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                if (this.getDistanceSq((Entity)e) < (4.5f + e.width / 2.0f) * (4.5f + e.width / 2.0f)) {
                    this.setAttacking(1);
                    if (this.world.rand.nextInt(4) == 0 || this.world.rand.nextInt(5) == 1) {
                        this.attackEntityAsMob((Entity)e);
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                }
            }
            else {
                this.setAttacking(0);
            }
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (par1EntityLiving instanceof Nastysaurus) {
            return false;
        }
        if (par1EntityLiving instanceof Cryolophosaurus) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(32.0, 8.0, 32.0));
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
    
    public int getAttacking() {
        return (byte)this.dataManager.get((DataParameter)Nastysaurus.ATTACKING);
    }
    
    public void setAttacking(final int par1) {
        this.dataManager.set((DataParameter)Nastysaurus.ATTACKING, (Object)(byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        if (!this.isValidLightLevel()) {
            return false;
        }
        if (this.posY < 50.0) {
            return false;
        }
        if (this.world.isDaytime()) {
            return false;
        }
        for (int k = -1; k < 1; ++k) {
            for (int j = -1; j < 1; ++j) {
                for (int i = 1; i < 6; ++i) {
                    final Block bid = this.world.getBlockState(new BlockPos((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k)).getBlock();
                    if (bid != Blocks.AIR) {
                        return false;
                    }
                }
            }
        }
        Nastysaurus target = null;
        target = (Nastysaurus)this.world.findNearestEntityWithinAABB((Class)Nastysaurus.class, this.getEntityBoundingBox().expand(16.0, 8.0, 16.0), (Entity)this);
        return target == null;
    }
    
    static {
        ATTACKING = EntityDataManager.createKey((Class)Alosaurus.class, DataSerializers.BYTE);
    }
}
