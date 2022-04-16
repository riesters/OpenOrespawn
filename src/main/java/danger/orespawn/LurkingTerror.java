package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LurkingTerror extends EntityMob {
  private ChunkCoordinates currentFlightTarget = null;
  
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  public LurkingTerror(World par1World) {
    super(par1World);
    setSize(1.75F, 1.25F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 20;
    this.isImmuneToFire = false;
    this.fireResistance = 5;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.LurkingTerror_stats.attack);
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
    if (getAttacking() != 0)
      return false; 
    return true;
  }
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
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
  
  protected float getSoundVolume() {
    return 0.55F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected String getLivingSound() {
    return "orespawn:lurkinghorror_living";
  }
  
  protected String getHurtSound() {
    return "orespawn:lurkinghorror_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:lurkinghorror_dead";
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.LurkingTerror_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.LurkingTerror_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionY *= 0.6D;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 5.0F);
    return var4;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.rand.nextInt(120) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.rand.nextInt(10) + 2;
        xdir = this.rand.nextInt(10) + 2;
        if (this.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + this.rand.nextInt(5) - 2, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } else if (this.rand.nextInt(9) == 0) {
      EntityLivingBase e = null;
      e = findSomethingToAttack();
      if (e != null) {
        setAttacking(1);
        this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
        if (getDistanceSqToEntity((Entity)e) < 6.0D)
          attackEntityAsMob((Entity)e); 
      } else {
        setAttacking(0);
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.4D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.4D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.4D - this.motionX) * 0.30000000149011613D;
    this.motionY += (Math.signum(var3) * 0.699999988079071D - this.motionY) * 0.20000000149011612D;
    this.motionZ += (Math.signum(var5) * 0.4D - this.motionZ) * 0.30000000149011613D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.75F;
    this.rotationYaw += var8 / 4.0F;
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
    boolean ret = super.attackEntityFrom(par1DamageSource, par2);
    Entity e = par1DamageSource.getEntity();
    if (e != null && this.currentFlightTarget != null)
      this.currentFlightTarget.set((int)e.posX, (int)e.posY, (int)e.posZ); 
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    LurkingTerror target = null;
    for (int k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Lurking Terror"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.rand.nextInt(2) != 1)
      return false; 
    if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID6 && this.worldObj.rand.nextInt(6) != 0)
      return false; 
    target = (LurkingTerror)this.worldObj.findNearestEntityWithinAABB(LurkingTerror.class, this.boundingBox.expand(32.0D, 16.0D, 32.0D), (Entity)this);
    if (target != null)
      return false; 
    if (this.posY < 10.0D)
      return false; 
    return true;
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
    if (par1EntityLiving instanceof LurkingTerror)
      return false; 
    if (par1EntityLiving instanceof RockBase)
      return false; 
    if (par1EntityLiving instanceof EnderReaper)
      return false; 
    if (par1EntityLiving instanceof LeafMonster)
      return false; 
    if (par1EntityLiving instanceof TerribleTerror)
      return false; 
    if (par1EntityLiving instanceof Mothra)
      return false; 
    if (par1EntityLiving instanceof CloudShark)
      return false; 
    if (par1EntityLiving instanceof Rotator)
      return false; 
    if (par1EntityLiving instanceof Bee)
      return false; 
    if (par1EntityLiving instanceof Mantis)
      return false; 
    if (par1EntityLiving instanceof CreepingHorror)
      return false; 
    if (par1EntityLiving instanceof Triffid)
      return false; 
    if (par1EntityLiving instanceof PitchBlack)
      return false; 
    if (par1EntityLiving instanceof Dragon)
      return false; 
    if (par1EntityLiving instanceof Island)
      return false; 
    if (par1EntityLiving instanceof IslandToo)
      return false; 
    if (par1EntityLiving instanceof EntityButterfly)
      return false; 
    if (par1EntityLiving instanceof Firefly)
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
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0D, 8.0D, 12.0D));
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
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(3);
    if (i == 0)
      return Items.beef; 
    if (i == 1)
      return Items.flint; 
    return Items.feather;
  }
}
