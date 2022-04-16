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
import net.minecraft.world.World;

public class Molenoid extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.35F;
  
  public Molenoid(World par1World) {
    super(par1World);
    setSize(3.9F, 2.6F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 40;
    this.fireResistance = 100;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Molenoid_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Molenoid_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.Molenoid_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(3) == 0)
      return "orespawn:molenoid_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:molenoid_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:molenoid_death";
  }
  
  protected float getSoundVolume() {
    return 1.1F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    dropItemRand(OreSpawnMain.MolenoidNose, 1);
    dropItemRand(Items.item_frame, 1);
    int var4;
    for (var4 = 0; var4 < 10; var4++)
      dropItemRand(Items.gold_nugget, 1); 
    for (var4 = 0; var4 < 6; var4++)
      dropItemRand(Items.beef, 1); 
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    if (par1DamageSource.getDamageType().equals("inWall"))
      return false; 
    return super.attackEntityFrom(par1DamageSource, par2);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        double ks = 0.8D;
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
  
  protected void updateAITasks() {
    EntityLivingBase e = null;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.rand.nextInt(4) == 0) {
      e = findSomethingToAttack();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < ((6.0F + e.width / 2.0F) * (6.0F + e.width / 2.0F))) {
          setAttacking(1);
          if (getDistanceSqToEntity((Entity)e) < 16.0D && (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)) {
            attackEntityAsMob((Entity)e);
          } else if (OreSpawnMain.PlayNicely == 0) {
            int j = 1 + this.worldObj.rand.nextInt(4);
            for (int k = 0; k < j; k++) {
              double d1 = e.posX;
              double d2 = e.posZ;
              d1 += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 2.0D;
              d2 += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 2.0D;
              for (int i = 4; i > -3; i--) {
                if (this.worldObj.getBlock((int)d1, (int)e.posY + i + 1, (int)d2) == Blocks.air && 
                  this.worldObj.getBlock((int)d1, (int)e.posY + i, (int)d2) != Blocks.air) {
                  this.worldObj.setBlock((int)d1, (int)e.posY + i + 1, (int)d2, OreSpawnMain.MyMoleDirtBlock);
                  break;
                } 
              } 
            } 
          } 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.isRemote)
      return; 
    if (this.worldObj.rand.nextInt(2) == 0) {
      double spd = 0.0D;
      spd = this.motionX * this.motionX + this.motionZ * this.motionZ;
      spd = Math.sqrt(spd);
      if (spd > this.moveSpeed)
        spd = this.moveSpeed; 
      int odds = (int)(100.0D * spd / this.moveSpeed);
      if (odds > 0 && 
        this.worldObj.rand.nextInt(100) < odds && OreSpawnMain.PlayNicely == 0) {
        double d1 = this.posX + 6.0D * Math.sin(Math.toRadians(this.rotationYawHead));
        double d2 = this.posZ - 6.0D * Math.cos(Math.toRadians(this.rotationYawHead));
        d1 += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0D;
        d2 += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0D;
        for (int i = 4; i > -4; i--) {
          if (this.worldObj.getBlock((int)d1, (int)this.posY + i + 1, (int)d2) == Blocks.air && 
            this.worldObj.getBlock((int)d1, (int)this.posY + i, (int)d2) != Blocks.air) {
            this.worldObj.setBlock((int)d1, (int)this.posY + i + 1, (int)d2, OreSpawnMain.MyMoleDirtBlock);
            break;
          } 
        } 
      } 
    } 
    double dx = this.posX - 3.0D * Math.sin(Math.toRadians(this.rotationYawHead));
    double dz = this.posZ + 3.0D * Math.cos(Math.toRadians(this.rotationYawHead));
    dx += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0D;
    dz += (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 3.0D;
    int dir = 1;
    if (e != null) {
      if ((int)e.posY > (int)this.posY)
        dir = 2; 
      if ((int)e.posY < (int)this.posY)
        dir = 0; 
    } 
    if (OreSpawnMain.PlayNicely == 0)
      for (int i = dir; i < dir + 3; i++) {
        Block bid = this.worldObj.getBlock((int)dx, (int)this.posY + i, (int)dz);
        if ((bid == Blocks.dirt || bid == Blocks.grass || bid == Blocks.gravel || bid == Blocks.sand || bid == Blocks.leaves) && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)dx, (int)this.posY + i, (int)dz, Blocks.air); 
        if (bid == OreSpawnMain.MyMoleDirtBlock)
          this.worldObj.setBlock((int)dx, (int)this.posY + i, (int)dz, Blocks.air); 
      }  
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!MyCanSee(par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof Molenoid)
      return false; 
    if (par1EntityLiving instanceof EntityMob)
      return true; 
    if (MyUtils.isAttackableNonMob(par1EntityLiving))
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0D, 6.0D, 12.0D));
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
              s.equals("Molenoid"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.posY < 50.0D)
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    for (k = -1; k < 1; k++) {
      for (int j = -1; j < 1; j++) {
        for (int i = 1; i < 4; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    Molenoid target = null;
    target = (Molenoid)this.worldObj.findNearestEntityWithinAABB(Molenoid.class, this.boundingBox.expand(16.0D, 8.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  public boolean MyCanSee(EntityLivingBase e) {
    double xzoff = 2.0D;
    int nblks = 10;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    float startx = (float)cx;
    float starty = (float)(this.posY + 1.0D);
    float startz = (float)cz;
    float dx = (float)((e.posX - startx) / 10.0D);
    float dy = (float)((e.posY + (e.height / 2.0F) - starty) / 10.0D);
    float dz = (float)((e.posZ - startz) / 10.0D);
    if (Math.abs(dx) > 1.0D) {
      dy /= Math.abs(dx);
      dz /= Math.abs(dx);
      nblks = (int)(nblks * Math.abs(dx));
      if (dx > 1.0F)
        dx = 1.0F; 
      if (dx < -1.0F)
        dx = -1.0F; 
    } 
    if (Math.abs(dy) > 1.0D) {
      dx /= Math.abs(dy);
      dz /= Math.abs(dy);
      nblks = (int)(nblks * Math.abs(dy));
      if (dy > 1.0F)
        dy = 1.0F; 
      if (dy < -1.0F)
        dy = -1.0F; 
    } 
    if (Math.abs(dz) > 1.0D) {
      dy /= Math.abs(dz);
      dx /= Math.abs(dz);
      nblks = (int)(nblks * Math.abs(dz));
      if (dz > 1.0F)
        dz = 1.0F; 
      if (dz < -1.0F)
        dz = -1.0F; 
    } 
    for (int i = 0; i < nblks; ) {
      startx += dx;
      starty += dy;
      startz += dz;
      Block bid = this.worldObj.getBlock((int)startx, (int)starty, (int)startz);
      if (bid == Blocks.air || 
        bid == OreSpawnMain.MyMoleDirtBlock || 
        bid == Blocks.dirt || 
        bid == Blocks.grass || 
        bid == Blocks.tallgrass || 
        bid == Blocks.sand || 
        bid == Blocks.gravel) {
        i++;
        continue;
      } 
      return false;
    } 
    return true;
  }
}
