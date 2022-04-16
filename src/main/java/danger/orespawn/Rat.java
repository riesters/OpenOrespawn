package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
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
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Rat extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.25F;
  
  private String myowner = null;
  
  public Rat(World par1World) {
    super(par1World);
    setSize(0.25F, 0.5F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 5;
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
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Rat_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.myowner != null)
      return false; 
    return true;
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Rat_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Rat_stats.defense;
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
  
  protected void jump() {
    super.jump();
    this.motionY += 0.25D;
    this.posY += 0.25D;
  }
  
  protected String getLivingSound() {
    return "orespawn:ratlive";
  }
  
  protected String getHurtSound() {
    return "orespawn:rathit";
  }
  
  protected String getDeathSound() {
    return "orespawn:ratdead";
  }
  
  protected float getSoundVolume() {
    return 0.45F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.rotten_flesh;
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
        setAttacking(1);
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
        if (getDistanceSqToEntity((Entity)e) < 4.0D)
          if (this.rand.nextInt(8) == 0 || this.rand.nextInt(7) == 1)
            attackEntityAsMob((Entity)e);  
      } else {
        setAttacking(0);
        if (this.myowner != null) {
          EntityPlayer p = this.worldObj.getPlayerEntityByName(this.myowner);
          if (p != null) {
            if (getDistanceSqToEntity((Entity)p) > 64.0D)
              getNavigator().tryMoveToEntityLiving((Entity)p, 1.75D); 
            if (getDistanceSqToEntity((Entity)p) > 256.0D)
              setPosition(p.posX + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat(), p.posY, p.posZ + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()); 
          } 
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(250) == 1)
      heal(1.0F); 
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof Irukandji)
      return false; 
    if (par1EntityLiving instanceof Skate)
      return false; 
    if (par1EntityLiving instanceof Whale)
      return false; 
    if (par1EntityLiving instanceof Flounder)
      return false; 
    if (par1EntityLiving instanceof Rat)
      return false; 
    if (par1EntityLiving instanceof Ghost)
      return false; 
    if (par1EntityLiving instanceof GhostSkelly)
      return false; 
    if (par1EntityLiving instanceof DungeonBeast)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      if (this.myowner != null) {
        if (this.myowner.equals(p.getUniqueID().toString()))
          return false; 
        if (OreSpawnMain.RatPlayerFriendly != 0)
          return false; 
      } 
    } 
    if (this.myowner != null && 
      par1EntityLiving instanceof EntityTameable) {
      EntityTameable e = (EntityTameable)par1EntityLiving;
      if (OreSpawnMain.RatPetFriendly != 0 && e.isTamed())
        return false; 
      if (e.func_152113_b() != null && this.myowner.equals(e.func_152113_b()))
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
  
  public void setOwner(EntityLivingBase e) {
    EntityPlayer p = null;
    if (e != null && 
      e instanceof EntityPlayer) {
      p = (EntityPlayer)e;
      String s = p.getUniqueID().toString();
      if (s != null)
        this.myowner = s; 
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    if (this.myowner == null)
      this.myowner = "null"; 
    par1NBTTagCompound.setString("MyOwner", this.myowner);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.myowner = par1NBTTagCompound.getString("MyOwner");
    if (this.myowner != null && 
      this.myowner.equals("null"))
      this.myowner = null; 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("inWall"))
      return ret; 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    int sc = 0;
    int k;
    for (k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Rat"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID5) {
      if (this.posY > 50.0D)
        return false; 
      for (k = -1; k <= 1; k++) {
        for (int j = -1; j <= 1; j++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + 1, (int)this.posZ + k);
          if (bid == Blocks.air)
            sc++; 
        } 
      } 
      if (sc < 4)
        return false; 
    } 
    if (findBuddies() > 8)
      return false; 
    return true;
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Rat.class, this.boundingBox.expand(20.0D, 10.0D, 20.0D));
    return var5.size();
  }
}
