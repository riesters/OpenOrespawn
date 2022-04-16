package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class SpiderDriver extends EntitySpider {
  private GenericTargetSorter TargetSorter = null;
  
  public SpiderDriver(World par1World) {
    super(par1World);
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(3, new MyEntityAIWander((EntityCreature)this, 0.65F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.ridingEntity != null)
      return false; 
    return true;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  protected Entity findPlayerToAttack() {
    double d0 = 16.0D;
    return (Entity)this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, d0);
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(5) == 0 && this.ridingEntity == null) {
      EntityLivingBase e = findSpiderRobot();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < ((4.0F + e.width / 2.0F) * (4.0F + e.width / 2.0F))) {
          mountEntity((Entity)e);
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 0.55D);
        } 
      } 
    } 
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(4) == 0 && this.ridingEntity != null) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) >= ((11.0F + e.width / 2.0F) * (11.0F + e.width / 2.0F)))
          if (this.ridingEntity instanceof SpiderRobot) {
            SpiderRobot sp = (SpiderRobot)this.ridingEntity;
            double d1 = e.posZ - this.posZ;
            double d2 = e.posX - this.posX;
            double dd = Math.atan2(d1, d2);
            sp.goThisWay(0.35D * Math.cos(dd), 0.35D * Math.sin(dd));
          }  
      } 
    } 
  }
  
  protected void attackEntity(Entity par1Entity, float par2) {
    if (this.attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY) {
      this.attackTime = 16;
      attackEntityAsMob(par1Entity);
      if (this.worldObj.rand.nextInt(2) == 0)
        ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 60, 0)); 
    } 
  }
  
  public int getTotalArmorValue() {
    if (this.ridingEntity != null)
      return 8; 
    return 20;
  }
  
  private EntityLivingBase findSpiderRobot() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(SpiderRobot.class, this.boundingBox.expand(25.0D, 15.0D, 25.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (var4.riddenByEntity == null)
        return var4; 
    } 
    return null;
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return false; 
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof SpiderRobot)
      return false; 
    if (par1EntityLiving instanceof SpiderDriver)
      return false; 
    if (par1EntityLiving instanceof EntitySpider)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    if (getDistanceSqToEntity((Entity)par1EntityLiving) < 36.0D)
      return false; 
    return true;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(35.0D, 15.0D, 35.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  public boolean getCanSpawnHere() {
    SpiderRobot target = null;
    target = (SpiderRobot)this.worldObj.findNearestEntityWithinAABB(SpiderRobot.class, this.boundingBox.expand(24.0D, 12.0D, 24.0D), (Entity)this);
    if (target != null)
      return true; 
    return super.getCanSpawnHere();
  }
}
