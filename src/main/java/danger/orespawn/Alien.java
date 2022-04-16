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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Alien extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int hurt_timer = 0;
  
  private double moveSpeed = 0.65D;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Alien(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(1.1F, 3.25F);
    getNavigator().setAvoidsWater(true);
    getNavigator().setBreakDoors(true);
    this.experienceValue = 100;
    this.fireResistance = 30;
    this.isImmuneToFire = false;
    this.jumpMovementFactor = 0.6F;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Alien_stats.attack);
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
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Alien_stats.health;
  }
  
  protected void jump() {
    super.jump();
    this.motionY += 0.25D;
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
    return OreSpawnMain.Alien_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (this.worldObj.isRemote) {
      float f = 1.7F + Math.abs(this.worldObj.rand.nextFloat() * 0.75F);
      if (this.worldObj.rand.nextInt(20) == 1)
        this.worldObj.spawnParticle("dripLava", this.posX - f * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + 1.6D, this.posZ + f * Math.cos(Math.toRadians(this.rotationYawHead)), 0.0D, 0.0D, 0.0D); 
    } 
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int getAlienHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(4) == 0)
      return "orespawn:alien_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:alien_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:alien_death";
  }
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.spider_eye;
  }
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var5 = 5 + this.worldObj.rand.nextInt(6);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.spider_eye, 1); 
    var5 = 5 + this.worldObj.rand.nextInt(6);
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.flint, 1); 
    dropItemRand((Item)Items.map, 1);
    dropItemRand(Items.clock, 1);
    dropItemRand(Items.compass, 1);
  }
  
  public void initCreature() {}
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        int var2 = 6;
        if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
          var2 = 8;
          if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
            var2 = 10;
          } else if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
            var2 = 12;
          } 
        } 
        if (par1Entity instanceof EntityLivingBase && this.worldObj.rand.nextInt(5) == 1)
          ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 5, 0)); 
        double ks = 1.1D;
        double inair = 0.1D;
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
    if (par1DamageSource.getDamageType().equals("cactus"))
      return false; 
    if (this.hurt_timer <= 0)
      ret = super.attackEntityFrom(par1DamageSource, par2); 
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof EntityLiving) {
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
      ret = true;
    } 
    return ret;
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dx * dx + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + dx;
            this.ty = y + i;
            this.tz = z + j;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x - dx, y + i, z + j);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dx * dx + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x - dx;
            this.ty = y + i;
            this.tz = z + j;
            found++;
          } 
        } 
      } 
    } 
    for (i = -dx; i <= dx; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + i, y + dy, z + j);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dy * dy + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + dy;
            this.tz = z + j;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x + i, y - dy, z + j);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dy * dy + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y - dy;
            this.tz = z + j;
            found++;
          } 
        } 
      } 
    } 
    for (i = -dx; i <= dx; i++) {
      for (int j = -dy; j <= dy; j++) {
        Block bid = this.worldObj.getBlock(x + i, y + j, z + dz);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dz * dz + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + j;
            this.tz = z + dz;
            found++;
          } 
        } 
        bid = this.worldObj.getBlock(x + i, y + j, z - dz);
        if (bid == Blocks.torch || bid == OreSpawnMain.ExtremeTorch) {
          int d = dz * dz + j * j + i * i;
          if (d < this.closest) {
            this.closest = d;
            this.tx = x + i;
            this.ty = y + j;
            this.tz = z - dz;
            found++;
          } 
        } 
      } 
    } 
    if (found != 0)
      return true; 
    return false;
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.worldObj.rand.nextInt(8) == 0) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < 16.0D) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } 
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
      } else {
        setAttacking(0);
      } 
    } else if (this.rand.nextInt(30) == 0 && OreSpawnMain.PlayNicely == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 2; i < 15 && 
        scan_it((int)this.posX, (int)this.posY, (int)this.posZ, i, i, i) != true; i++) {
        if (i >= 10)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, this.ty, this.tz, 1.0D);
        if (this.closest < 27 && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.air, 0, 2); 
      } 
    } 
    if (this.worldObj.rand.nextInt(40) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(1.0F); 
  }
  
  private boolean isSuitableTarget(EntityLivingBase var4, boolean par2) {
    if (var4 == null)
      return false; 
    if (var4 == this)
      return false; 
    if (!var4.isEntityAlive())
      return false; 
    if (var4 instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)var4;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0D, 4.0D, 12.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    EntityLivingBase e = getAttackTarget();
    if (e != null && e.isEntityAlive())
      return e; 
    setAttackTarget(null);
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
              s.equals("Alien"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID4)
      return true; 
    if (this.posY > 50.0D)
      return false; 
    for (k = -1; k < 2; k++) {
      for (int j = -1; j < 2; j++) {
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
