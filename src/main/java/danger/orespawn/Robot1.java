package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import java.util.*;

public class Robot1 extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private RenderInfo renderdata;
    private final float moveSpeed;
    
    public Robot1(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.renderdata = new RenderInfo();
        this.moveSpeed = 0.2f;
        this.setSize(0.5f, 0.5f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 5;
        this.fireResistance = 5;
        this.isImmuneToFire = true;
        this.TargetSorter = new GenericTargetSorter(this);
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new MyEntityAIWanderALot(this, 10, 1.0));
        this.tasks.addTask(2, new EntityAIMoveThroughVillage(this, 0.8999999761581421, false));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (byte) 0);
        if (this.renderdata == null)
            this.renderdata = new RenderInfo();
        this.renderdata.rf1 = 0.0F;
        this.renderdata.rf2 = 0.0F;
        this.renderdata.rf3 = 0.0F;
        this.renderdata.rf4 = 0.0F;
        this.renderdata.ri1 = 0;
        this.renderdata.ri2 = 0;
        this.renderdata.ri3 = 0;
        this.renderdata.ri4 = 0;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 5;
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
    
    public int getTotalArmorValue() {
        return 2;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.rand.nextInt(8) == 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                if (this.getDistanceSqToEntity(e) < 5.0 && !this.worldObj.isRemote && this.worldObj.rand.nextInt(18) == 1) {
                    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.5f, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
                    this.setDead();
                }
                for (int i = 0; i < 2; ++i) {
                    this.worldObj.spawnParticle("smoke", this.posX, this.posY + 1.0, this.posZ, 0.0, 0.0, 0.0);
                    this.worldObj.spawnParticle("lava", this.posX, this.posY + 1.0, this.posZ, 0.0, 0.0, 0.0);
                }
                this.getNavigator().tryMoveToEntityLiving(e, 1.2);
            }
        }
    }
    
    protected String getLivingSound() {
        return "orespawn:kyuubi_living";
    }
    
    protected String getHurtSound() {
        return "orespawn:scorpion_hit";
    }
    
    protected String getDeathSound() {
        return "orespawn:robot1_death";
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.gunpowder;
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
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (!par1DamageSource.getDamageType().equals("cactus")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
        }
        return ret;
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
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
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(8.0, 3.0, 8.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        Iterator<?> var2 = var5.iterator();
        while (var2.hasNext()) {
            Entity var3 = (Entity)var2.next();
            EntityLivingBase var4 = (EntityLivingBase)var3;
            if (isSuitableTarget(var4))
                return var4;
        }
        return null;
    }
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectByte(20);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, (byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        return this.posY >= 50.0 && this.isValidLightLevel() && !this.worldObj.isDaytime();
    }
}
