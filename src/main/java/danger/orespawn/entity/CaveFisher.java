package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import danger.orespawn.util.ai.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import danger.orespawn.util.handlers.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import danger.orespawn.init.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import danger.orespawn.*;
import java.util.*;
import net.minecraft.network.datasync.*;

public class CaveFisher extends EntityMob
{
    private RenderInfo renderdata;
    private float moveSpeed;
    protected static final DataParameter<Byte> ATTACKING;
    
    public CaveFisher(final World worldIn) {
        super(worldIn);
        this.renderdata = new RenderInfo();
        this.moveSpeed = 0.2f;
        this.setSize(1.35f, 0.75f);
        this.experienceValue = 10;
        this.isImmuneToFire = false;
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0);
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
    
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register((DataParameter)CaveFisher.ATTACKING, (byte)0);
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
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 20;
    }
    
    public int getTotalArmorValue() {
        return 10;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:cryo_hurt";
    }
    
    protected SoundEvent getDeathSound() {
        return SoundsHandler.ENTITY_ALOSAURUS_DEATH;
    }
    
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.world.rand.nextInt(6);
        if (i == 0) {
            return Items.GOLD_NUGGET;
        }
        if (i == 1) {
            return ModItems.URANIUM_NUGGET;
        }
        if (i == 2) {
            return ModItems.TITANIUM_NUGGET;
        }
        return null;
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        return super.attackEntityAsMob(par1Entity);
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.world.rand.nextInt(8) == 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                if (this.getDistanceSq((Entity)e) < (4.0f + e.width / 2.0f) * (4.0f + e.width / 2.0f)) {
                    this.setAttacking(1);
                    if (this.world.rand.nextInt(7) == 0 || this.world.rand.nextInt(8) == 1) {
                        this.attackEntityAsMob((Entity)e);
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.2);
                }
            }
            else {
                this.setAttacking(0);
            }
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
        }
        return ret;
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
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof CaveFisher) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
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
        final List var5 = this.world.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.getEntityBoundingBox().expand(10.0, 3.0, 10.0));
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
    
    public final int getAttacking() {
        return (byte)this.dataManager.get((DataParameter)CaveFisher.ATTACKING);
    }
    
    public final void setAttacking(final int par1) {
        this.dataManager.set((DataParameter)CaveFisher.ATTACKING, (Object)(byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        final int sc = 0;
        return this.isValidLightLevel() && this.posY <= 50.0;
    }
    
    static {
        ATTACKING = EntityDataManager.createKey((Class)CaveFisher.class, DataSerializers.BYTE);
    }
}
