package danger.orespawn;

import net.minecraft.entity.ai.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.potion.*;
import java.util.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;

public class SpiderDriver extends EntitySpider
{
    private GenericTargetSorter TargetSorter;
    
    public SpiderDriver(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.TargetSorter = new GenericTargetSorter(this);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIPanic(this, 1.5));
        this.tasks.addTask(3, new MyEntityAIWander(this, 0.65f));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired() && this.ridingEntity == null;
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    protected Entity findPlayerToAttack() {
        final double d0 = 16.0;
        return this.worldObj.getClosestVulnerablePlayerToEntity(this, d0);
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(5) == 0 && this.ridingEntity == null) {
            final EntityLivingBase e = this.findSpiderRobot();
            if (e != null) {
                this.faceEntity(e, 10.0f, 10.0f);
                if (this.getDistanceSqToEntity(e) < (4.0f + e.width / 2.0f) * (4.0f + e.width / 2.0f)) {
                    this.mountEntity(e);
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving(e, 0.55);
                }
            }
        }
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(4) == 0 && this.ridingEntity != null) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.faceEntity(e, 10.0f, 10.0f);
                if (this.getDistanceSqToEntity(e) >= (11.0f + e.width / 2.0f) * (11.0f + e.width / 2.0f)) {
                    if (this.ridingEntity instanceof SpiderRobot) {
                        final SpiderRobot sp = (SpiderRobot)this.ridingEntity;
                        final double d1 = e.posZ - this.posZ;
                        final double d2 = e.posX - this.posX;
                        final double dd = Math.atan2(d1, d2);
                        sp.goThisWay(0.35 * Math.cos(dd), 0.35 * Math.sin(dd));
                    }
                }
            }
        }
    }
    
    protected void attackEntity(final Entity par1Entity, final float par2) {
        if (this.attackTime <= 0 && par2 < 2.0f && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY) {
            this.attackTime = 16;
            this.attackEntityAsMob(par1Entity);
            if (this.worldObj.rand.nextInt(2) == 0) {
                ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 60, 0));
            }
        }
    }
    
    public int getTotalArmorValue() {
        if (this.ridingEntity != null) {
            return 8;
        }
        return 20;
    }
    
    private EntityLivingBase findSpiderRobot() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(SpiderRobot.class, this.boundingBox.expand(25.0, 15.0, 25.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (var8.riddenByEntity == null) {
                return var8;
            }
        }
        return null;
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
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof SpiderRobot) {
            return false;
        }
        if (par1EntityLiving instanceof SpiderDriver) {
            return false;
        }
        if (par1EntityLiving instanceof EntitySpider) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return this.getDistanceSqToEntity(par1EntityLiving) >= 36.0;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(35.0, 15.0, 35.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8)) {
                return var8;
            }
        }
        return null;
    }
    
    public boolean getCanSpawnHere() {
        SpiderRobot target;
        target = (SpiderRobot)this.worldObj.findNearestEntityWithinAABB(SpiderRobot.class, this.boundingBox.expand(24.0, 12.0, 24.0), this);
        return target != null || super.getCanSpawnHere();
    }
}
