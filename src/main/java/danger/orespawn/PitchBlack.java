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
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class PitchBlack extends EntityMob {
  private ChunkCoordinates currentFlightTarget = null;
  
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private float MyMoveSpeed = 0.2F;
  
  private int damage_ticker = 0;
  
  private int wing_sound = 0;
  
  public PitchBlack(World par1World) {
    super(par1World);
    setSize(2.0F, 3.0F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 200;
    this.isImmuneToFire = false;
    this.fireResistance = 25;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    this.MyMoveSpeed = 0.2F;
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((this.MyMoveSpeed + 0.1F * getPitchBlackScale()));
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((getPitchBlackScale() * OreSpawnMain.PitchBlack_stats.attack));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(22, Integer.valueOf(0));
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
    float t = 0.5F;
    if (this.worldObj != null) {
      if (this.worldObj.rand.nextInt(4) == 1)
        t = 1.0F; 
      if (this.worldObj.rand.nextInt(8) == 2)
        t = 2.0F; 
      if (this.worldObj.rand.nextInt(32) == 3)
        t = 3.0F; 
      if (this.worldObj.rand.nextInt(64) == 4)
        t = 4.0F; 
    } else {
      if (OreSpawnMain.OreSpawnRand.nextInt(4) == 1)
        t = 1.0F; 
      if (OreSpawnMain.OreSpawnRand.nextInt(8) == 2)
        t = 2.0F; 
      if (OreSpawnMain.OreSpawnRand.nextInt(32) == 3)
        t = 3.0F; 
      if (OreSpawnMain.OreSpawnRand.nextInt(64) == 4)
        t = 4.0F; 
    } 
    if (OreSpawnMain.NightmareSize == 1)
      t = 0.5F; 
    if (OreSpawnMain.NightmareSize == 2)
      t = 1.0F; 
    if (OreSpawnMain.NightmareSize == 3)
      t = 2.0F; 
    if (OreSpawnMain.NightmareSize == 4)
      t = 3.0F; 
    if (OreSpawnMain.NightmareSize == 5)
      t = 4.0F; 
    setPitchBlackScale(t);
    this.experienceValue = (int)(100.0F * t);
    this.fireResistance = (int)(25.0F * t);
    setSize(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    setPitchBlackScale(par1NBTTagCompound.getFloat("Fscale"));
    setSize(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
    this.experienceValue = (int)(100.0F * getPitchBlackScale());
    this.fireResistance = (int)(25.0F * getPitchBlackScale());
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setFloat("Fscale", getPitchBlackScale());
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public final int getActivity() {
    return this.dataWatcher.getWatchableObjectByte(21);
  }
  
  public final void setActivity(int par1) {
    this.dataWatcher.updateObject(21, Byte.valueOf((byte)par1));
  }
  
  public float getPitchBlackScale() {
    int i = this.dataWatcher.getWatchableObjectInt(22);
    float f = i;
    return f / 10.0F;
  }
  
  public void setPitchBlackScale(float par1) {
    float f = par1 * 10.0001F;
    int i = (int)f;
    this.dataWatcher.updateObject(22, Integer.valueOf(i));
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.PitchBlack_stats.defense + (int)(2.0F * getPitchBlackScale());
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
    if (!this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 1.0F - 0.7F * 4.0F / getPitchBlackScale();
  }
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(5) != 2)
      return null; 
    return "orespawn:pitchblack_living";
  }
  
  protected String getHurtSound() {
    return "orespawn:pitchblack_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:pitchblack_dead";
  }
  
  public int mygetMaxHealth() {
    return (int)(OreSpawnMain.PitchBlack_stats.health * getPitchBlackScale());
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    this.MyMoveSpeed = 0.2F;
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((this.MyMoveSpeed + 0.1F * getPitchBlackScale()));
    super.onUpdate();
    setSize(2.5F * getPitchBlackScale(), 3.5F * getPitchBlackScale());
    this.wing_sound++;
    if (this.wing_sound > 20) {
      if (!this.worldObj.isRemote)
        this.worldObj.playSoundAtEntity((Entity)this, "orespawn:MothraWings", 1.0F, 1.0F); 
      this.wing_sound = 0;
    } 
    this.motionY *= 0.6D;
    if (!this.worldObj.isRemote && this.worldObj.rand.nextInt(250) == 1) {
      heal(1.0F + getPitchBlackScale());
      if (this.worldObj.rand.nextInt(5) == 0) {
        Block bid = Blocks.air;
        if (this.posY > 10.0D) {
          for (int i = 0; i < 10; i++) {
            bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - i, (int)this.posZ);
            if (bid != Blocks.air)
              break; 
          } 
        } else {
          bid = Blocks.stone;
        } 
        if (bid != Blocks.air) {
          Entity e = null;
          e = findSomethingToAttack();
          if (e == null)
            setActivity(0); 
        } 
      } else {
        setActivity(1);
        getNavigator().setPath(null, 0.0D);
      } 
    } 
    if (getActivity() == 0 && this.worldObj.rand.nextInt(10) == 1) {
      Entity e = null;
      e = findSomethingToAttack();
      if (e != null) {
        setActivity(1);
        getNavigator().setPath(null, 0.0D);
      } 
    } 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = false;
    if (par1Entity != null && par1Entity instanceof EntityDragon) {
      EntityDragon dr = (EntityDragon)par1Entity;
      DamageSource var21 = null;
      var21 = DamageSource.setExplosionSource(null);
      var21.setExplosion();
      if (this.worldObj.rand.nextInt(8) == 1) {
        dr.attackEntityFromPart(dr.dragonPartHead, var21, OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
      } else {
        dr.attackEntityFromPart(dr.dragonPartBody, var21, OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
      } 
      var4 = true;
    } else {
      var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.PitchBlack_stats.attack * getPitchBlackScale());
      if (var4 && par1Entity != null && par1Entity instanceof EntityLivingBase) {
        double ks = 1.15D * getPitchBlackScale();
        double inair = 0.08D * getPitchBlackScale();
        float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
        if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
          inair *= 2.0D; 
        par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
      } 
    } 
    return var4;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    if (this.damage_ticker > 0)
      this.damage_ticker--; 
    if (getActivity() == 0) {
      super.updateAITasks();
      return;
    } 
    if (this.isDead)
      return; 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (getActivity() == 0)
      return; 
    if (this.rand.nextInt(150) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying > 0) {
        zdir = this.rand.nextInt(20) + 5 * (int)getPitchBlackScale();
        xdir = this.rand.nextInt(20) + 5 * (int)getPitchBlackScale();
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(11) - 5, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } else if (this.rand.nextInt(8) == 0) {
      Entity e = null;
      e = findSomethingToAttack();
      if (e != null) {
        double d1 = 5.0D + (e.width / 2.0F);
        d1 += getPitchBlackScale();
        d1 *= d1;
        setAttacking(1);
        if (e instanceof EntityDragon && 
          d1 < 100.0D)
          d1 = 100.0D; 
        if (e instanceof Godzilla && 
          d1 < 100.0D)
          d1 = 100.0D; 
        if (e instanceof GodzillaHead && 
          d1 < 100.0D)
          d1 = 100.0D; 
        this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 2.0D), (int)e.posZ);
        if (getDistanceSqToEntity(e) < d1)
          attackEntityAsMob(e); 
      } else {
        setAttacking(0);
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.4D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.4D - this.posZ;
    double myspeed = (0.5F + getPitchBlackScale() / 10.0F);
    this.motionX += (Math.signum(var1) * myspeed - this.motionX) * 0.33D;
    this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.20000000149011612D;
    this.motionZ += (Math.signum(var5) * myspeed - this.motionZ) * 0.33D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.1F + (float)myspeed;
    this.rotationYaw += var8 / 5.0F;
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.damage_ticker > 0)
      return ret; 
    this.damage_ticker = 20;
    ret = super.attackEntityFrom(par1DamageSource, par2);
    Entity e = par1DamageSource.getEntity();
    if (e != null && this.currentFlightTarget != null)
      this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 2.0D), (int)e.posZ); 
    setActivity(1);
    getNavigator().setPath(null, 0.0D);
    return ret;
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
              s.equals("Nightmare")) {
              Float t = Float.valueOf(getPitchBlackScale());
              if (t.floatValue() > 1.0F)
                t = Float.valueOf(1.0F); 
              setPitchBlackScale(t.floatValue());
              return true;
            } 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID6) {
      PitchBlack target = null;
      target = (PitchBlack)this.worldObj.findNearestEntityWithinAABB(PitchBlack.class, this.boundingBox.expand(16.0D, 16.0D, 16.0D), (Entity)this);
      if (target != null)
        return false; 
    } 
    if (getPitchBlackScale() < 1.1F)
      return true; 
    int ix = 1;
    if (getPitchBlackScale() > 3.1F)
      ix = 2; 
    int iy = ix * 3;
    for (k = -ix; k <= ix; k++) {
      for (int j = -ix; j <= ix; j++) {
        for (int i = 1; i <= iy; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    return true;
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!(par1EntityLiving instanceof EntityLivingBase))
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof PitchBlack)
      return false; 
    if (par1EntityLiving instanceof EnderReaper)
      return false; 
    if (par1EntityLiving instanceof LeafMonster)
      return false; 
    if (par1EntityLiving instanceof TerribleTerror)
      return false; 
    if (par1EntityLiving instanceof LurkingTerror)
      return false; 
    if (par1EntityLiving instanceof CreepingHorror)
      return false; 
    if (par1EntityLiving instanceof Island)
      return false; 
    if (par1EntityLiving instanceof IslandToo)
      return false; 
    if (par1EntityLiving instanceof Triffid)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
    } 
    return true;
  }
  
  private Entity findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    double d1 = 16.0D + (getPitchBlackScale() * 6.0F);
    double d2 = 10.0D + (getPitchBlackScale() * 4.0F);
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(d1, d2, d1));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    EntityLivingBase var3 = null;
    while (var2.hasNext()) {
      var3 = (EntityLivingBase)var2.next();
      if (isSuitableTarget(var3, false))
        return (Entity)var3; 
    } 
    return null;
  }
  
  protected Item getDropItem() {
    return OreSpawnMain.MyNightmareScale;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()) - (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()), this.posY + 1.0D, this.posZ + (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()) - (OreSpawnMain.OreSpawnRand.nextInt(5) * getPitchBlackScale()), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int i = 3 + this.worldObj.rand.nextInt(2 + (int)(5.0F * getPitchBlackScale()));
    int var4;
    for (var4 = 0; var4 < i; var4++) {
      dropItemRand(Items.rotten_flesh, 1);
      int j = this.worldObj.rand.nextInt(10);
      if (j == 0)
        dropItemRand(Items.feather, 1); 
      if (j == 1)
        dropItemRand(Items.string, 1); 
      if (j == 2)
        dropItemRand(Items.flint, 1); 
      if (j == 3)
        dropItemRand(Items.beef, 1); 
    } 
    dropItemRand(OreSpawnMain.MyNightmareScale, 1);
    dropItemRand(Items.item_frame, 1);
    i = 2 + (int)getPitchBlackScale() + this.worldObj.rand.nextInt(2 + (int)(5.0F * getPitchBlackScale()));
    for (var4 = 0; var4 < i; var4++)
      dropItemRand(OreSpawnMain.ZooKeeper, 1); 
  }
}
