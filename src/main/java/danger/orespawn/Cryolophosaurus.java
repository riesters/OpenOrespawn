package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Cryolophosaurus extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.25F;
  
  public Cryolophosaurus(World par1World) {
    super(par1World);
    setSize(0.75F, 0.75F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 10;
    this.fireResistance = 10;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(3, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    this.TargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Cryolophosaurus_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Cryolophosaurus_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Cryolophosaurus_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(6) == 0)
      return "orespawn:cryo_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:cryo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:cryo_death";
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(10);
    if (i == 0)
      return Items.chicken; 
    if (i == 1)
      return OreSpawnMain.UraniumNugget; 
    if (i == 2)
      return OreSpawnMain.TitaniumNugget; 
    return null;
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.rand.nextInt(5) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
        if (getDistanceSqToEntity((Entity)e) < 5.0D)
          if (this.rand.nextInt(12) == 0 || this.rand.nextInt(14) == 1)
            attackEntityAsMob((Entity)e);  
      } 
    } 
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof Alosaurus)
      return false; 
    if (par1EntityLiving instanceof TRex)
      return false; 
    if (par1EntityLiving instanceof Cryolophosaurus)
      return false; 
    if (par1EntityLiving instanceof Ghost)
      return false; 
    if (par1EntityLiving instanceof GhostSkelly)
      return false; 
    if (par1EntityLiving instanceof CaveFisher)
      return false; 
    if (par1EntityLiving instanceof GammaMetroid)
      return false; 
    if (par1EntityLiving instanceof EntityButterfly)
      return false; 
    if (par1EntityLiving instanceof Firefly)
      return false; 
    if (par1EntityLiving instanceof EntityMosquito)
      return false; 
    if (par1EntityLiving instanceof RockBase)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
    } 
    return true;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(9.0D, 2.0D, 9.0D));
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
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.isDaytime() == true && this.posY > 50.0D)
      return false; 
    return true;
  }
}
