package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Godzilla extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.75F;
  
  private int hurt_timer = 0;
  
  private int jumped = 0;
  
  private int jump_timer = 0;
  
  private int ticker = 0;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int stream_count = 8;
  
  private MyEntityAIWanderALot wander = null;
  
  private int head_found = 0;
  
  private int large_unknown_detected = 0;
  
  public Godzilla(World par1World) {
    super(par1World);
    if (OreSpawnMain.PlayNicely == 0) {
      setSize(9.9F, 25.0F);
    } else {
      setSize(2.475F, 6.25F);
    } 
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 10000;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.wander = new MyEntityAIWanderALot((EntityCreature)this, 15, 1.0D);
    this.tasks.addTask(2, this.wander);
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 50.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.fireResistance = 10000;
    this.isImmuneToFire = true;
    this.renderDistanceWeight = 12.0D;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Godzilla_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Integer.valueOf(OreSpawnMain.PlayNicely));
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
  
  public int getPlayNicely() {
    return this.dataWatcher.getWatchableObjectInt(21);
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
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (OreSpawnMain.PlayNicely != 0)
      return true; 
    return false;
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Godzilla_stats.health;
  }
  
  public int getTotalArmorValue() {
    if (this.large_unknown_detected != 0)
      return 25; 
    return OreSpawnMain.Godzilla_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    double xzoff = 0.0D;
    double myoff = 20.0D;
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (this.isAirBorne)
      getNavigator().setPath(null, 0.0D); 
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(5) == 0)
      return "orespawn:godzilla_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:alo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:godzilla_death";
  }
  
  protected float getSoundVolume() {
    return 1.65F;
  }
  
  protected float getSoundPitch() {
    return 1.1F;
  }
  
  protected Item getDropItem() {
    return null;
  }
  
  protected void jump() {
    for (; this.rotationYaw < 0.0F; this.rotationYaw += 360.0F);
    for (; this.rotationYawHead < 0.0F; this.rotationYawHead += 360.0F);
    for (; this.rotationYaw > 360.0F; this.rotationYaw -= 360.0F);
    for (; this.rotationYawHead > 360.0F; this.rotationYawHead -= 360.0F);
    this.motionY += 0.44999998807907104D;
    this.posY += 0.5D;
    float f = 0.2F + Math.abs(this.worldObj.rand.nextFloat() * 0.45F);
    this.motionX += f * Math.cos(Math.toRadians((this.rotationYawHead + 90.0F)));
    this.motionZ += f * Math.sin(Math.toRadians((this.rotationYawHead + 90.0F)));
    this.isAirBorne = true;
    getNavigator().setPath(null, 0.0D);
  }
  
  protected void jumpAtEntity(EntityLivingBase e) {
    this.motionY += 1.25D;
    this.posY += 1.5499999523162842D;
    double d1 = e.posX - this.posX;
    double d2 = e.posZ - this.posZ;
    float d = (float)Math.atan2(d2, d1);
    float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
    this.rotationYaw = f2;
    d1 = Math.sqrt(d1 * d1 + d2 * d2);
    this.motionX += d1 * 0.05D * Math.cos(d);
    this.motionZ += d1 * 0.05D * Math.sin(d);
    this.isAirBorne = true;
    getNavigator().setPath(null, 0.0D);
  }
  
  private double getHorizontalDistanceSqToEntity(Entity e) {
    double d1 = e.posZ - this.posZ;
    double d2 = e.posX - this.posX;
    return d1 * d1 + d2 * d2;
  }
  
  public double MygetDistanceSqToEntity(Entity par1Entity) {
    double d0 = this.posX - par1Entity.posX;
    double d1 = par1Entity.posY - this.posY;
    double d2 = this.posZ - par1Entity.posZ;
    if (d1 > 0.0D && d1 < 20.0D)
      d1 = 0.0D; 
    if (d1 > 20.0D)
      d1 -= 10.0D; 
    return d0 * d0 + d1 * d1 + d2 * d2;
  }
  
  protected void updateAITasks() {
    EntityLivingBase e = null;
    int xzrange = 9;
    if (this.isDead)
      return; 
    if (this.worldObj.isRemote)
      return; 
    this.dataWatcher.updateObject(21, Integer.valueOf(OreSpawnMain.PlayNicely));
    super.updateAITasks();
    this.ticker++;
    if (this.ticker > 30000)
      this.ticker = 0; 
    if (this.ticker % 100 == 0)
      this.stream_count = 8; 
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.jump_timer > 0)
      this.jump_timer--; 
    OreSpawnMain.godzilla_has_spawned = 1;
    if (this.worldObj.rand.nextInt(200) == 0)
      setAttackTarget(null); 
    if (OreSpawnMain.PlayNicely == 0) {
      if (this.motionY < -0.95D)
        this.jumped = 1; 
      if (this.motionY < -1.5D)
        this.jumped = 2; 
      if (this.jumped != 0 && this.motionY > -0.1D) {
        double df = 1.0D;
        if (this.jumped == 2)
          df = 1.5D; 
        doJumpDamage(this.posX, this.posY, this.posZ, 10.0D, OreSpawnMain.Godzilla_stats.attack * df, 0);
        doJumpDamage(this.posX, this.posY, this.posZ, 15.0D, (OreSpawnMain.Godzilla_stats.attack / 2) * df, 0);
        doJumpDamage(this.posX, this.posY, this.posZ, 25.0D, (OreSpawnMain.Godzilla_stats.attack / 4) * df, 0);
        this.jumped = 0;
      } 
    } 
    xzrange = 12;
    if (getAttacking() != 0)
      xzrange = 16; 
    int k = -3 + this.ticker % 30;
    if (OreSpawnMain.PlayNicely == 0)
      for (int i = -xzrange; i <= xzrange; i++) {
        for (int j = -xzrange; j <= xzrange; j++) {
          Block bid = this.worldObj.getBlock((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j);
          if (isCrushable(bid)) {
            this.worldObj.setBlock((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j, Blocks.air);
            if (this.worldObj.rand.nextInt(15) == 1)
              dropItemRand(Item.getItemFromBlock(bid), 1); 
          } else {
            if (bid == Blocks.grass && 
              this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j, Blocks.dirt); 
            if (bid == Blocks.farmland && 
              this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock((int)this.posX + i, (int)this.posY + k, (int)this.posZ + j, Blocks.dirt); 
          } 
        } 
      }  
    double dx = this.posX + 16.0D * Math.sin(Math.toRadians(this.rotationYawHead));
    double dz = this.posZ - 16.0D * Math.cos(Math.toRadians(this.rotationYawHead));
    k = -3 + this.ticker % 12;
    if (OreSpawnMain.PlayNicely == 0)
      for (int i = -xzrange; i <= xzrange; i++) {
        for (int j = -xzrange; j <= xzrange; j++) {
          Block bid = this.worldObj.getBlock((int)dx + i, (int)this.posY + k, (int)dz + j);
          if (isCrushable(bid)) {
            this.worldObj.setBlock((int)dx + i, (int)this.posY + k, (int)dz + j, Blocks.air);
            if (this.worldObj.rand.nextInt(15) == 1)
              dropItemRandAt(Item.getItemFromBlock(bid), 1, dx, dz); 
          } else {
            if (bid == Blocks.grass && 
              this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock((int)dx + i, (int)this.posY + k, (int)dz + j, Blocks.dirt); 
            if (bid == Blocks.farmland && 
              this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock((int)dx + i, (int)this.posY + k, (int)dz + j, Blocks.dirt); 
          } 
        } 
      }  
    if (OreSpawnMain.PlayNicely == 0 && 
      k == 0)
      doJumpDamage(dx, this.posY, dz, 15.0D, (OreSpawnMain.Godzilla_stats.attack / 2), 1); 
    if (this.worldObj.rand.nextInt(5 - this.large_unknown_detected) == 1) {
      e = getAttackTarget();
      if (OreSpawnMain.PlayNicely != 0)
        e = null; 
      if (e != null)
        if (!e.isEntityAlive()) {
          setAttackTarget(null);
          e = null;
        } else if (e instanceof Godzilla || e instanceof GodzillaHead) {
          setAttackTarget(null);
          e = null;
        }  
      if (e == null) {
        e = findSomethingToAttack();
        if (this.head_found == 0) {
          EntityLiving newent = (EntityLiving)spawnCreature(this.worldObj, "MobzillaHead", this.posX, this.posY + 20.0D, this.posZ);
        }
      } 
      if (e != null) {
        this.wander.setBusy(1);
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (this.worldObj.rand.nextInt(65) == 1 && MygetDistanceSqToEntity((Entity)e) > 300.0D) {
          doLightningAttack(e);
        } else if (this.worldObj.rand.nextInt(20 - this.large_unknown_detected * 5) == 1 && this.jump_timer == 0) {
          jumpAtEntity(e);
          this.jump_timer = 30;
        } else if (MygetDistanceSqToEntity((Entity)e) < (300.0F + e.width / 2.0F * e.width / 2.0F)) {
          setAttacking(1);
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
          if (this.worldObj.rand.nextInt(4 - this.large_unknown_detected) == 0 || this.worldObj.rand.nextInt(3 - this.large_unknown_detected) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
          if (getHorizontalDistanceSqToEntity((Entity)e) > 625.0D) {
            if (this.stream_count > 0) {
              setAttacking(1);
              double rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
              double rhdir = Math.toRadians(((this.rotationYawHead + 90.0F) % 360.0F));
              double pi = 3.1415926545D;
              double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
              if (rdd > pi)
                rdd -= pi * 2.0D; 
              rdd = Math.abs(rdd);
              if (rdd < 0.5D)
                firecanon(e); 
            } else {
              setAttacking(0);
            } 
          } else {
            setAttacking(0);
          } 
        } 
      } else {
        setAttacking(0);
        this.wander.setBusy(0);
        this.stream_count = 8;
      } 
    } 
    if (this.worldObj.rand.nextInt(35) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(5.0F); 
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
    } 
    return var8;
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
    if (par1EntityLiving instanceof Godzilla)
      return false; 
    if (par1EntityLiving instanceof GodzillaHead)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityZombie)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySkeleton)
      return false; 
    if (par1EntityLiving instanceof Ghost)
      return false; 
    if (par1EntityLiving instanceof GhostSkelly)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
    } 
    return true;
  }
  
  private boolean isVillagerTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
      return true; 
    return false;
  }
  
  private EntityLivingBase doJumpDamage(double X, double Y, double Z, double dist, double damage, int knock) {
    AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(X - dist, Y - 10.0D, Z - dist, X + dist, Y + 10.0D, Z + dist);
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, bb);
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (var4 == null)
        continue; 
      if (var4 == this)
        continue; 
      if (!var4.isEntityAlive())
        continue; 
      if (var4 instanceof Godzilla)
        continue; 
      if (var4 instanceof GodzillaHead)
        continue; 
      if (var4 instanceof Ghost || 
        var4 instanceof GhostSkelly)
        continue; 
      DamageSource var21 = null;
      var21 = DamageSource.setExplosionSource(null);
      var21.setExplosion();
      var4.attackEntityFrom(var21, (float)damage / 2.0F);
      var4.attackEntityFrom(DamageSource.fall, (float)damage / 2.0F);
      this.worldObj.playSoundAtEntity((Entity)var4, "random.explode", 0.85F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.5F);
      if (knock != 0) {
        double ks = 3.5D;
        double inair = 0.75D;
        float f3 = (float)Math.atan2(var4.posZ - this.posZ, var4.posX - this.posX);
        var4.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
      } 
    } 
    return null;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0) {
      this.head_found = 1;
      return null;
    } 
    List<?> var5 = null;
    Iterator<?> var2 = null;
    Entity var3 = null;
    EntityLivingBase var4 = null;
    EntityLivingBase ret = null;
    int vf = 0;
    var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(64.0D, 40.0D, 64.0D));
    if (var5 == null)
      return null; 
    Collections.sort(var5, this.TargetSorter);
    var2 = var5.iterator();
    this.head_found = 0;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (var4 instanceof GodzillaHead)
        this.head_found = 1; 
      if (vf == 0 && isVillagerTarget(var4, false)) {
        ret = var4;
        vf = 1;
      } 
      if (ret == null && vf == 0 && isSuitableTarget(var4, false))
        ret = var4; 
    } 
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    if (this.posY < 50.0D)
      return false; 
    if (OreSpawnMain.godzilla_has_spawned != 0)
      return false; 
    if (this.worldObj.rand.nextInt(40) != 1)
      return false; 
    for (int k = -8; k <= 8; k++) {
      for (int j = -8; j <= 8; j++) {
        for (int i = 5; i < 15; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    Godzilla target = null;
    target = (Godzilla)this.worldObj.findNearestEntityWithinAABB(Godzilla.class, this.boundingBox.expand(64.0D, 16.0D, 64.0D), (Entity)this);
    if (target != null)
      return false; 
    if (!this.worldObj.isRemote)
      OreSpawnMain.godzilla_has_spawned = 1; 
    return true;
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), this.posY + 4.0D + this.worldObj.rand.nextInt(10), this.posZ + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  private ItemStack dropItemRandAt(Item index, int par1, double dx, double dz) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, dx + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), this.posY + 4.0D + this.worldObj.rand.nextInt(6), dz + OreSpawnMain.OreSpawnRand.nextInt(10) - OreSpawnMain.OreSpawnRand.nextInt(10), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  private boolean isCrushable(Block bid) {
    if (bid == null)
      return false; 
    if (!this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
      return false; 
    if (bid == Blocks.grass)
      return false; 
    if (bid == Blocks.dirt)
      return false; 
    if (bid == Blocks.stone)
      return false; 
    if (bid == Blocks.farmland)
      return false; 
    if (bid == Blocks.water)
      return false; 
    if (bid == Blocks.flowing_water)
      return false; 
    if (bid == Blocks.lava)
      return false; 
    if (bid == Blocks.flowing_lava)
      return false; 
    if (bid == Blocks.bedrock)
      return false; 
    if (bid == Blocks.obsidian)
      return false; 
    if (bid == Blocks.sand)
      return false; 
    if (bid == Blocks.gravel)
      return false; 
    if (bid == Blocks.iron_block)
      return false; 
    if (bid == Blocks.diamond_block)
      return false; 
    if (bid == Blocks.emerald_block)
      return false; 
    if (bid == Blocks.gold_block)
      return false; 
    if (bid == Blocks.netherrack)
      return false; 
    if (bid == Blocks.end_stone)
      return false; 
    if (bid == OreSpawnMain.MyBlockAmethystBlock)
      return false; 
    if (bid == OreSpawnMain.MyBlockRubyBlock)
      return false; 
    if (bid == OreSpawnMain.MyBlockUraniumBlock)
      return false; 
    if (bid == OreSpawnMain.MyBlockTitaniumBlock)
      return false; 
    if (bid == OreSpawnMain.CrystalStone)
      return false; 
    if (bid == OreSpawnMain.CrystalGrass)
      return false; 
    return true;
  }
  
  private void firecanon(EntityLivingBase e) {
    double yoff = 19.0D;
    double xzoff = 22.0D;
    BetterFireball bf = null;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    if (this.stream_count > 0) {
      bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, e.posX - cx, e.posY + (e.height / 2.0F) - this.posY + yoff, e.posZ - cz);
      bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
      bf.setPosition(cx, this.posY + yoff, cz);
      bf.setBig();
      this.worldObj.playSoundAtEntity((Entity)this, "random.fuse", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)bf);
      for (int i = 0; i < 5; i++) {
        float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
        float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
        float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
        bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, e.posX - cx + r1, e.posY + (e.height / 2.0F) - this.posY + yoff + r2, e.posZ - cz + r3);
        bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
        bf.setPosition(cx, this.posY + yoff, cz);
        if (this.worldObj.rand.nextInt(2) == 1)
          bf.setSmall(); 
        this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)bf);
      } 
      this.stream_count--;
    } 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      float s = par1Entity.height * par1Entity.width;
      if (s > 30.0F && 
        !MyUtils.isRoyalty(par1Entity) && !(par1Entity instanceof Godzilla) && !(par1Entity instanceof GodzillaHead) && !(par1Entity instanceof PitchBlack) && !(par1Entity instanceof Kraken)) {
        EntityLivingBase e = (EntityLivingBase)par1Entity;
        e.setHealth(e.getHealth() / 2.0F);
        e.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.Godzilla_stats.attack * 10.0F);
        this.large_unknown_detected = 1;
      } 
    } 
    if (par1Entity != null && par1Entity instanceof EntityDragon) {
      EntityDragon dr = (EntityDragon)par1Entity;
      DamageSource var21 = null;
      var21 = DamageSource.setExplosionSource(null);
      var21.setExplosion();
      if (this.worldObj.rand.nextInt(6) == 1) {
        dr.attackEntityFromPart(dr.dragonPartHead, var21, OreSpawnMain.Godzilla_stats.attack / 2.0F);
      } else {
        dr.attackEntityFromPart(dr.dragonPartBody, var21, OreSpawnMain.Godzilla_stats.attack / 2.0F);
      } 
    } 
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        double ks = 3.2D;
        double inair = 0.3D;
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
    float dm = par2;
    float s = 0.0F;
    if (this.hurt_timer > 0)
      return false; 
    if (dm > 750.0F)
      dm = 750.0F; 
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof EntityLivingBase) {
      EntityLivingBase enl = (EntityLivingBase)e;
      s = enl.height * enl.width;
      if (s > 30.0F && 
        !MyUtils.isRoyalty((Entity)enl) && !(enl instanceof Godzilla) && !(enl instanceof GodzillaHead) && !(enl instanceof PitchBlack) && !(enl instanceof Kraken)) {
        dm /= 10.0F;
        this.hurt_timer = 50;
        this.large_unknown_detected = 1;
      } 
    } 
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      ret = super.attackEntityFrom(par1DamageSource, dm);
      this.hurt_timer = 20;
      e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLivingBase)
        if (!(e instanceof GodzillaHead) && !(e instanceof Godzilla)) {
          setAttackTarget((EntityLivingBase)e);
          setTarget(e);
          getNavigator().tryMoveToEntityLiving(e, 1.2D);
        }  
    } 
    return ret;
  }
  
  public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt) {}
  
  private void doLightningAttack(EntityLivingBase e) {
    if (e == null)
      return; 
    float var2 = 100.0F;
    e.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), var2);
    e.setFire(5);
    for (int var3 = 0; var3 < 20; var3++) {
      this.worldObj.spawnParticle("smoke", e.posX + this.rand.nextFloat() - this.rand.nextFloat(), e.posY + this.rand.nextFloat() - this.rand.nextFloat(), e.posZ + this.rand.nextFloat(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", e.posX + this.rand.nextFloat() - this.rand.nextFloat(), e.posY + this.rand.nextFloat() - this.rand.nextFloat(), e.posZ + this.rand.nextFloat() - this.rand.nextFloat(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", e.posX, e.posY, e.posZ, this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian(), this.worldObj.rand.nextGaussian());
    } 
    this.worldObj.playSoundAtEntity((Entity)e, "random.explode", 0.5F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.5F);
    if (!this.worldObj.isRemote)
      this.worldObj.createExplosion((Entity)this, e.posX, e.posY, e.posZ, 3.0F, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")); 
    this.worldObj.addWeatherEffect((Entity)new EntityLightningBolt(this.worldObj, e.posX, e.posY + 1.0D, e.posZ));
    this.worldObj.addWeatherEffect((Entity)new EntityLightningBolt(this.worldObj, this.posX, this.posY + 15.0D, this.posZ));
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    ItemStack is = null;
    dropItemRand(Items.item_frame, 1);
    int var5 = 50 + this.worldObj.rand.nextInt(30);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(OreSpawnMain.MyGodzillaScale, 1); 
    var5 = 100 + this.worldObj.rand.nextInt(160);
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.beef, 1); 
    var5 = 50 + this.worldObj.rand.nextInt(60);
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.bone, 1); 
    int i = 25 + this.worldObj.rand.nextInt(15);
    for (var4 = 0; var4 < i; var4++) {
      EntityItem var33;
      int var3 = this.worldObj.rand.nextInt(80);
      switch (var3) {
        case 0:
          is = dropItemRand(OreSpawnMain.MyUltimateSword, 1);
          break;
        case 1:
          is = dropItemRand(Items.diamond, 1);
          break;
        case 2:
          is = dropItemRand(Item.getItemFromBlock(Blocks.diamond_block), 1);
          break;
        case 3:
          is = dropItemRand(Items.diamond_sword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 4:
          is = dropItemRand(Items.diamond_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 5:
          is = dropItemRand(Items.diamond_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 6:
          is = dropItemRand(Items.diamond_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 7:
          is = dropItemRand(Items.diamond_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 8:
          is = dropItemRand((Item)Items.diamond_helmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(2)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 9:
          is = dropItemRand((Item)Items.diamond_chestplate, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 10:
          is = dropItemRand((Item)Items.diamond_leggings, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 11:
          is = dropItemRand((Item)Items.diamond_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 12:
          is = dropItemRand(OreSpawnMain.MyUltimateBow, 1);
          break;
        case 13:
          is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
          break;
        case 14:
          is = dropItemRand(Items.iron_ingot, 1);
          break;
        case 15:
          is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
          break;
        case 16:
          is = dropItemRand(Items.iron_sword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 17:
          is = dropItemRand(Items.iron_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 18:
          is = dropItemRand(Items.iron_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 19:
          is = dropItemRand(Items.iron_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 20:
          is = dropItemRand(Items.iron_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 21:
          is = dropItemRand((Item)Items.iron_helmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 22:
          is = dropItemRand((Item)Items.iron_chestplate, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 23:
          is = dropItemRand((Item)Items.iron_leggings, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 24:
          is = dropItemRand((Item)Items.iron_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 25:
          is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
          break;
        case 26:
          dropItemRand(Item.getItemFromBlock(Blocks.iron_block), 1);
          break;
        case 27:
          is = dropItemRand(Items.gold_nugget, 1);
          break;
        case 28:
          is = dropItemRand(Items.gold_ingot, 1);
          break;
        case 29:
          is = dropItemRand(Items.golden_carrot, 1);
          break;
        case 30:
          is = dropItemRand(Items.golden_sword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 31:
          is = dropItemRand(Items.golden_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 32:
          is = dropItemRand(Items.golden_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 33:
          is = dropItemRand(Items.golden_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 34:
          is = dropItemRand(Items.golden_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 35:
          is = dropItemRand((Item)Items.golden_helmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 36:
          is = dropItemRand((Item)Items.golden_chestplate, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 37:
          is = dropItemRand((Item)Items.golden_leggings, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 38:
          is = dropItemRand((Item)Items.golden_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 39:
          dropItemRand(Items.golden_apple, 1);
          break;
        case 40:
          dropItemRand(Item.getItemFromBlock(Blocks.gold_block), 1);
          break;
        case 41:
          var33 = null;
          is = new ItemStack(Items.golden_apple, 1, 1);
          var33 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
          if (var33 != null)
            this.worldObj.spawnEntityInWorld((Entity)var33); 
          break;
        case 42:
          is = dropItemRand(OreSpawnMain.MyExperienceSword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 43:
          is = dropItemRand((Item)OreSpawnMain.ExperienceHelmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 44:
          is = dropItemRand((Item)OreSpawnMain.ExperienceBody, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 45:
          is = dropItemRand((Item)OreSpawnMain.ExperienceLegs, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 46:
          is = dropItemRand((Item)OreSpawnMain.ExperienceBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 47:
          is = dropItemRand(OreSpawnMain.MyAmethystSword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 48:
          is = dropItemRand(OreSpawnMain.MyAmethystShovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 49:
          is = dropItemRand(OreSpawnMain.MyAmethystPickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 50:
          is = dropItemRand(OreSpawnMain.MyAmethystAxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 51:
          is = dropItemRand(OreSpawnMain.MyAmethystHoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 52:
          is = dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyBlockAmethystBlock), 1);
          break;
        case 53:
          is = dropItemRand((Item)OreSpawnMain.AmethystHelmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 54:
          is = dropItemRand((Item)OreSpawnMain.AmethystBody, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 55:
          is = dropItemRand((Item)OreSpawnMain.AmethystLegs, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 56:
          is = dropItemRand((Item)OreSpawnMain.AmethystBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 57:
          is = dropItemRand((Item)OreSpawnMain.RubyHelmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 58:
          is = dropItemRand((Item)OreSpawnMain.RubyBody, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 59:
          is = dropItemRand((Item)OreSpawnMain.RubyLegs, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 60:
          is = dropItemRand((Item)OreSpawnMain.RubyBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 61:
          is = dropItemRand(OreSpawnMain.MyRubySword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 62:
          is = dropItemRand(OreSpawnMain.MyRubyShovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 63:
          is = dropItemRand(OreSpawnMain.MyRubyPickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 64:
          is = dropItemRand(OreSpawnMain.MyRubyAxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 65:
          is = dropItemRand(OreSpawnMain.MyRubyHoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 66:
          is = dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyBlockRubyBlock), 1);
          break;
        case 67:
          is = dropItemRand((Item)OreSpawnMain.UltimateHelmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 68:
          is = dropItemRand((Item)OreSpawnMain.UltimateBody, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 69:
          is = dropItemRand((Item)OreSpawnMain.UltimateLegs, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 70:
          is = dropItemRand((Item)OreSpawnMain.UltimateBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 71:
          is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 73:
          is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 74:
          is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 75:
          is = dropItemRand(OreSpawnMain.MyUltimateHoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
      } 
    } 
  }
}
