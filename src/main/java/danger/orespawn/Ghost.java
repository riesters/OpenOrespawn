package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Ghost extends EntityAmbientCreature {
  private ChunkCoordinates currentFlightTarget = null;
  
  public Ghost(World par1World) {
    super(par1World);
    setSize(0.5F, 1.5F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 5;
    this.noClip = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  protected float getSoundVolume() {
    return 0.3F;
  }
  
  protected float getSoundPitch() {
    return 1.5F;
  }
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(2) == 0)
      return "orespawn:ghost_sound"; 
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  protected void collideWithNearbyEntities() {}
  
  public int mygetMaxHealth() {
    return 2;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    if (isNoDespawnRequired())
      this.noClip = false; 
    super.onUpdate();
    this.motionY *= 0.65D;
  }
  
  protected void updateAITasks() {
    int i = 0, j = 0;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.worldObj.rand.nextInt(40) == 1 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.0F) {
      EntityPlayer target = null;
      target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(16.0D, 16.0D, 16.0D), (Entity)this);
      if (target != null) {
        this.currentFlightTarget.set((int)target.posX + this.rand.nextInt(3) - this.rand.nextInt(3), (int)target.posY + 1, (int)target.posZ + this.rand.nextInt(3) - this.rand.nextInt(3));
      } else {
        for (i = 0; i < 3; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY + i, (int)this.posZ);
          if (bid == Blocks.air)
            break; 
        } 
        for (j = -1; j >= -3; j--) {
          Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY + j, (int)this.posZ);
          if (bid != Blocks.air)
            break; 
        } 
        this.currentFlightTarget.set((int)this.posX + this.rand.nextInt(10) - this.rand.nextInt(10), (int)this.posY + i + j + this.rand.nextInt(4) + 1, (int)this.posZ + this.rand.nextInt(10) - this.rand.nextInt(10));
      } 
    } 
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.1D - this.motionX) * 0.05D;
    this.motionY += (Math.signum(var3) * 0.7D - this.motionY) * 0.1D;
    this.motionZ += (Math.signum(var5) * 0.1D - this.motionZ) * 0.05D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.05F;
    this.rotationYaw += var8 / 6.0F;
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return true;
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Ghost"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  public void initCreature() {}
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("inWall"))
      return ret; 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    return ret;
  }
}
