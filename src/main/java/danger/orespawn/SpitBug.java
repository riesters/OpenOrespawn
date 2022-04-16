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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SpitBug extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int force_sync = 50;
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.33F;
  
  private int stream_count = 0;
  
  public SpitBug(World par1World) {
    super(par1World);
    setSize(2.0F, 2.0F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 50;
    this.fireResistance = 75;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
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
    this.force_sync = 50;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.SpitBug_stats.attack);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (this.isAirBorne)
      getNavigator().setPath(null, 0.0D); 
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.SpitBug_stats.health;
  }
  
  public RenderInfo getRenderInfo() {
    return this.renderdata;
  }
  
  public void setRenderInfo(RenderInfo r) {
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
    return OreSpawnMain.SpitBug_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected void jump() {
    this.motionY += 0.75D;
    this.posY += 0.75D;
    float f = 0.2F + Math.abs(this.worldObj.rand.nextFloat() * 0.45F);
    this.motionX -= f * Math.sin(Math.toRadians(this.rotationYawHead));
    this.motionZ += f * Math.cos(Math.toRadians(this.rotationYawHead));
    this.isAirBorne = true;
  }
  
  protected void jumpAtEntity(EntityLivingBase e) {
    this.motionY += 0.75D;
    this.posY += 0.75D;
    float f = 0.2F + Math.abs(this.worldObj.rand.nextFloat() * 0.25F);
    float d = (float)Math.atan2(e.posX - this.posX, e.posZ - this.posZ);
    this.motionX += f * Math.sin(d);
    this.motionZ += f * Math.cos(d);
    this.isAirBorne = true;
  }
  
  public int getSpitBugHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(4) == 0)
      return "orespawn:clatter"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:crunch";
  }
  
  protected String getDeathSound() {
    return "orespawn:emperorscorpion_death";
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 1.5F;
  }
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(10);
    if (i == 0)
      return Items.gold_nugget; 
    if (i == 1)
      return OreSpawnMain.UraniumNugget; 
    if (i == 2)
      return OreSpawnMain.TitaniumNugget; 
    return null;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int i = 1 + this.worldObj.rand.nextInt(3);
    for (int var4 = 0; var4 < i; var4++)
      dropItemRand(OreSpawnMain.MyAmethyst, 1); 
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    double ks = 0.5D;
    double inair = 0.1D;
    int var2 = 6;
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
        if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
          inair *= 2.0D; 
        par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
      } 
      return true;
    } 
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.hurt_timer > 0)
      return false; 
    if (!par1DamageSource.getDamageType().equals("cactus") && !par1DamageSource.getDamageType().equals("fall")) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 15;
      Entity e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLiving) {
        setAttackTarget((EntityLivingBase)e);
        setTarget(e);
        getNavigator().tryMoveToEntityLiving(e, 1.2D);
        ret = true;
      } 
    } 
    return ret;
  }
  
  protected void updateAITasks() {
    EntityLivingBase e = null;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.worldObj.rand.nextInt(5) == 0) {
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (this.worldObj.rand.nextInt(15) == 1 && !this.isAirBorne) {
          jumpAtEntity(e);
        } else if (getDistanceSqToEntity((Entity)e) < 9.0D) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(6) == 0 || this.worldObj.rand.nextInt(7) == 1) {
            attackEntityAsMob((Entity)e);
            if (!this.worldObj.isRemote && 
              this.worldObj.rand.nextInt(3) != 1)
              this.worldObj.playSoundAtEntity((Entity)e, "orespawn:clatter", 1.0F, 1.0F); 
          } 
        } else if (!this.isAirBorne) {
          getNavigator().tryMoveToEntityLiving((Entity)e, 0.5D);
          watercanon(e);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(150) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(1.0F); 
  }
  
  private void watercanon(EntityLivingBase e) {
    double yoff = 1.5D;
    double xzoff = 1.5D;
    if (this.stream_count > 0) {
      setAttacking(1);
      Acid var2 = new Acid(this.worldObj, e.posX - this.posX, e.posY + 0.75D - this.posY + yoff, e.posZ - this.posZ);
      var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw)), this.rotationYawHead, this.rotationPitch);
      double var3 = e.posX - var2.posX;
      double var5 = e.posY + 0.25D - var2.posY;
      double var7 = e.posZ - var2.posZ;
      float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
      var2.setThrowableHeading(var3, var5 + var9, var7, 1.1F, 6.0F);
      this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)var2);
      this.stream_count--;
    } else {
      setAttacking(0);
    } 
    if (this.stream_count <= 0 && this.rand.nextInt(7) == 1)
      this.stream_count = 8; 
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
    if (par1EntityLiving instanceof EnderReaper)
      return false; 
    if (par1EntityLiving instanceof EnderKnight)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityEnderman)
      return false; 
    if (par1EntityLiving instanceof Hydrolisc)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
      return false; 
    if (par1EntityLiving instanceof SpitBug)
      return false; 
    if (par1EntityLiving instanceof TrooperBug)
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
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0D, 7.0D, 12.0D));
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
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public boolean getCanSpawnHere() {
    int k;
    for (k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Spit Bug"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.worldObj.isDaytime() == true && 
      this.worldObj.rand.nextInt(20) > 1)
      return false; 
    if (!isValidLightLevel())
      return false; 
    for (k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 1; i < 4; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    return true;
  }
}
