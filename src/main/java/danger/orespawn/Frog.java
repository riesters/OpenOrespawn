package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Frog extends EntityAnimal {
  private GenericTargetSorter TargetSorter = null;
  
  public double moveSpeed = 0.10000000149011612D;
  
  private int singing = 0;
  
  private int jumpcount = 0;
  
  public Frog(World par1World) {
    super(par1World);
    setSize(0.75F, 0.75F);
    this.experienceValue = 5;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    getNavigator().setAvoidsWater(false);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
    this.tasks.addTask(2, new MyEntityAIWander((EntityCreature)this, 1.0F));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public int getSinging() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setSinging(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  private void jumpAround() {
    this.motionY += (0.75F + Math.abs(this.worldObj.rand.nextFloat() * 0.55F));
    this.posY += 0.3499999940395355D;
    float f = 0.7F + Math.abs(this.worldObj.rand.nextFloat() * 0.75F);
    float d = (float)Math.toRadians(this.rotationYaw);
    this.motionX -= f * Math.sin(d);
    this.motionZ += f * Math.cos(d);
    this.isAirBorne = true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      if (this.singing != 0) {
        this.singing--;
        if (this.singing <= 0)
          setSinging(0); 
      } 
      if (this.jumpcount > 0)
        this.jumpcount--; 
      if (this.jumpcount == 0 && 
        this.worldObj.rand.nextInt(70) == 1) {
        jumpAround();
        this.jumpcount = 50;
      } 
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    if (par1EntityPlayer != null && 
      par1EntityPlayer.isSneaking() && 
      par1EntityPlayer.inventory.getCurrentItem() == null) {
      World world = par1EntityPlayer.worldObj;
      setDead();
      par1EntityPlayer.worldObj.playSoundAtEntity((Entity)par1EntityPlayer, "random.explode", 1.0F, world.rand.nextFloat() * 0.2F + 0.9F);
      if (!world.isRemote) {
        if (world.rand.nextInt(2) == 0) {
          Boyfriend ent = null;
          ent = (Boyfriend)spawnCreature(world, "Boyfriend", this.posX, this.posY + 0.01D, this.posZ);
          if (ent != null)
            ent.setPrince(1 + world.rand.nextInt(2)); 
        } else {
          Girlfriend ent = null;
          ent = (Girlfriend)spawnCreature(world, "Girlfriend", this.posX, this.posY + 0.01D, this.posZ);
          if (ent != null)
            ent.setPrincess(1 + world.rand.nextInt(2)); 
        } 
      } else {
        for (int var3 = 0; var3 < 16; var3++) {
          world.spawnParticle("smoke", ((float)this.posX + world.rand.nextFloat() - world.rand.nextFloat()), ((float)this.posY + world.rand.nextFloat()), ((float)this.posZ + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
          world.spawnParticle("explode", ((float)this.posX + world.rand.nextFloat() - world.rand.nextFloat()), ((float)this.posY + world.rand.nextFloat()), ((float)this.posZ + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
          world.spawnParticle("reddust", ((float)this.posX + world.rand.nextFloat() - world.rand.nextFloat()), ((float)this.posY + world.rand.nextFloat()), ((float)this.posZ + world.rand.nextFloat() - world.rand.nextFloat()), 0.0D, 0.0D, 0.0D);
        } 
      } 
    } 
    return false;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 8;
  }
  
  protected String getLivingSound() {
    if (!this.worldObj.isRemote) {
      if (this.worldObj.rand.nextInt(2) == 0)
        return null; 
      this.singing = 35;
      setSinging(this.singing);
    } 
    return "orespawn:frog";
  }
  
  protected String getHurtSound() {
    return "orespawn:scorpion_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:big_splat";
  }
  
  protected float getSoundVolume() {
    return 0.7F;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected void playStepSound(int par1, int par2, int par3, int par4) {}
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    for (int i = 0; i < 4; i++)
      dropItemRand(Items.slime_ball, 1); 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 3.0F);
    if (par1Entity.isDead)
      heal(1.0F); 
    return var4;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    ret = super.attackEntityFrom(par1DamageSource, par2);
    if (!this.worldObj.isRemote && this.jumpcount <= 0) {
      jumpAround();
      this.jumpcount = 25;
    } 
    return ret;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.25D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Frog.class, this.boundingBox.expand(20.0D, 8.0D, 20.0D));
    return var5.size();
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID5 && 
      this.worldObj.rand.nextInt(20) != 1)
      return false; 
    if (findBuddies() > 5)
      return false; 
    return true;
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.rand.nextInt(12) == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      EntityLivingBase e = null;
      e = findSomethingToAttack();
      if (e != null) {
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
        if (getDistanceSqToEntity((Entity)e) < 6.0D)
          attackEntityAsMob((Entity)e); 
      } 
    } 
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
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityAnt)
      return true; 
    if (par1EntityLiving instanceof EntityButterfly)
      return true; 
    if (par1EntityLiving instanceof Cricket)
      return true; 
    if (par1EntityLiving instanceof EntityMosquito)
      return true; 
    if (par1EntityLiving instanceof Firefly)
      return true; 
    if (par1EntityLiving instanceof WormSmall)
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(8.0D, 3.0D, 8.0D));
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
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
}
