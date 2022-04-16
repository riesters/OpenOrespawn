package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
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
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Mothra extends EntityButterfly implements IMob {
  private ChunkCoordinates currentFlightTarget = null;
  
  private int lastX = 0, lastZ = 0, lastY = 0;
  
  private int stuck_count = 0;
  
  private int wing_sound = 0;
  
  private int health_ticker = 100;
  
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.35F;
  
  public Mothra(World par1World) {
    super(par1World);
    setSize(5.0F, 2.0F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 100;
    this.isImmuneToFire = true;
    this.fireResistance = 500;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Mothra_stats.attack);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Mothra_stats.defense;
  }
  
  public int getMothraHealth() {
    return (int)getHealth();
  }
  
  protected float getSoundVolume() {
    return 1.5F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return "random.explode";
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  protected void collideWithNearbyEntities() {}
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Mothra_stats.health;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionY *= 0.6D;
    this.wing_sound++;
    if (this.wing_sound > 30) {
      if (!this.worldObj.isRemote)
        this.worldObj.playSoundAtEntity((Entity)this, "orespawn:MothraWings", 1.0F, 1.0F); 
      this.wing_sound = 0;
    } 
    this.health_ticker--;
    if (this.health_ticker <= 0) {
      if (getHealth() < mygetMaxHealth())
        heal(1.0F); 
      this.health_ticker = 200;
    } 
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    int shoot = 3;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.lastX == (int)this.posX && this.lastY == (int)this.posY && this.lastZ == (int)this.posZ) {
      this.stuck_count++;
    } else {
      this.stuck_count = 0;
      this.lastX = (int)this.posX;
      this.lastY = (int)this.posY;
      this.lastZ = (int)this.posZ;
    } 
    if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
      shoot = 2; 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.stuck_count > 50 || this.worldObj.rand.nextInt(300) == 0 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 9.0F) {
      int down = 0;
      int dist = 20;
      for (int i = -5; i <= 5; i += 5) {
        for (int j = -5; j <= 5; j += 5) {
          for (int k = 1; k < 20; k++) {
            Block block = this.worldObj.getBlock((int)this.posX + j, (int)this.posY - k, (int)this.posZ + i);
            if (block != Blocks.air) {
              if (k < dist)
                dist = k; 
              break;
            } 
          } 
        } 
      } 
      if (dist > 10)
        down = dist - 10 + 1; 
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        xdir = 1;
        zdir = 1;
        if (this.rand.nextInt(2) == 0)
          xdir = -1; 
        if (this.rand.nextInt(2) == 0)
          zdir = -1; 
        int newz = this.rand.nextInt(20) + 8;
        newz *= zdir;
        int newx = this.rand.nextInt(20) + 8;
        newx *= xdir;
        this.currentFlightTarget.set((int)this.posX + newx, (int)this.posY + this.rand.nextInt(7) - 1 - down, (int)this.posZ + newz);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
      this.stuck_count = 0;
    } else if (this.worldObj.rand.nextInt(10) == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && OreSpawnMain.MothraPeaceful == 0) {
      EntityPlayer target = null;
      target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(25.0D, 20.0D, 25.0D), (Entity)this);
      if (target != null)
        if (!target.capabilities.isCreativeMode) {
          if (getEntitySenses().canSee((Entity)target)) {
            this.currentFlightTarget.set((int)target.posX, (int)target.posY + 4, (int)target.posZ);
            if (this.rand.nextInt(shoot) == 0)
              attackWithSomething((EntityLivingBase)target); 
          } 
        } else {
          target = null;
        }  
      if (target == null && this.worldObj.rand.nextInt(3) == 0) {
        EntityLivingBase e = null;
        e = findSomethingToAttack();
        if (e != null) {
          this.currentFlightTarget.set((int)e.posX, (int)e.posY + 5, (int)e.posZ);
          if (this.worldObj.rand.nextInt(shoot) == 0)
            attackWithSomething(e); 
        } 
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.30001D;
    this.motionY += (Math.signum(var3) * 0.7D - this.motionY) * 0.20001D;
    this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.30001D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 1.0F;
    this.rotationYaw += var8 / 4.0F;
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof Mothra)
      return false; 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    if (e != null && this.currentFlightTarget != null)
      this.currentFlightTarget.set((int)e.posX, (int)e.posY + 2, (int)e.posZ); 
    return ret;
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
  }
  
  public boolean getCanSpawnHere() {
    int k;
    for (k = -2; k <= 2; k++) {
      for (int j = -2; j <= 2; j++) {
        for (int i = 1; i < 4; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Mothra"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 70.0D)
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    for (k = -4; k < 4; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 1; i < 10; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    Mothra target = null;
    target = (Mothra)this.worldObj.findNearestEntityWithinAABB(Mothra.class, this.boundingBox.expand(64.0D, 32.0D, 64.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  public void initCreature() {}
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    dropItemRand(Items.item_frame, 1);
    for (int i = 0; i < 20; i++) {
      float var1 = (this.rand.nextFloat() - 0.5F) * 8.0F;
      float var2 = (this.rand.nextFloat() - 0.5F) * 4.0F;
      float var3 = (this.rand.nextFloat() - 0.5F) * 8.0F;
      this.worldObj.spawnParticle("largeexplode", this.posX + var1, this.posY + 2.0D + var2, this.posZ + var3, 0.0D, 0.0D, 0.0D);
    } 
    int var4;
    for (var4 = 0; var4 < 53; var4++)
      dropItemRand(Items.gold_nugget, 1); 
    for (var4 = 0; var4 < 25; var4++)
      dropItemRand(OreSpawnMain.MyMothScale, 1); 
    for (var4 = 0; var4 < 3; var4++)
      dropItemRand(Items.blaze_rod, 1); 
    dropItemRand(Items.nether_star, 1);
    for (var4 = 0; var4 < 20; var4++)
      spawnCreature(this.worldObj, "Moth", this.posX + 0.5D, this.posY + 1.0D, this.posZ + 0.5D); 
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    if (par0World == null)
      return null; 
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
  
  private void attackWithSomething(EntityLivingBase par1) {
    double xzoff = 2.25D;
    double yoff = 0.0D;
    if (OreSpawnMain.MothraPeaceful != 0)
      return; 
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return; 
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
      EntitySmallFireball sf = new EntitySmallFireball(this.worldObj, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55D - this.posY + yoff, par1.posZ - cz);
      sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
      sf.setPosition(cx, this.posY + yoff, cz);
      this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)sf);
    } else if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
      if (this.worldObj.rand.nextInt(2) == 0) {
        EntitySmallFireball sf = new EntitySmallFireball(this.worldObj, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55D - this.posY + yoff, par1.posZ - cz);
        sf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
        sf.setPosition(cx, this.posY + yoff, cz);
        this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)sf);
      } else {
        BetterFireball bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55D - this.posY + yoff, par1.posZ - cz);
        bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
        bf.setPosition(cx, this.posY + yoff, cz);
        bf.setNotMe();
        this.worldObj.playSoundAtEntity((Entity)this, "random.fuse", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)bf);
      } 
    } else {
      BetterFireball bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, par1.posX - cx, par1.posY + 0.55D - this.posY + yoff, par1.posZ - cz);
      bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
      bf.setPosition(cx, this.posY + yoff, cz);
      bf.setNotMe();
      this.worldObj.playSoundAtEntity((Entity)this, "random.fuse", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)bf);
    } 
    if (getHealth() < mygetMaxHealth())
      heal(1.0F); 
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
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof Mothra)
      return false; 
    if (par1EntityLiving instanceof Brutalfly)
      return false; 
    if (par1EntityLiving instanceof Vortex)
      return false; 
    if (par1EntityLiving instanceof VelocityRaptor)
      return false; 
    if (par1EntityLiving instanceof Cryolophosaurus)
      return false; 
    if (par1EntityLiving instanceof TerribleTerror)
      return false; 
    if (par1EntityLiving instanceof LurkingTerror)
      return false; 
    if (par1EntityLiving instanceof CloudShark)
      return false; 
    if (par1EntityLiving instanceof Rotator)
      return false; 
    if (par1EntityLiving instanceof Bee)
      return false; 
    if (par1EntityLiving instanceof Mantis)
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
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(15.0D, 20.0D, 15.0D));
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
}
