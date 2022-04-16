package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class WormSmall extends EntityMob {
  public int upcount = 50;
  
  public int downcount = 0;
  
  public WormSmall(World par1World) {
    super(par1World);
    setSize(0.25F, 1.0F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 0;
    this.noClip = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.WormSmall_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected float getSoundVolume() {
    return 0.5F;
  }
  
  protected float getSoundPitch() {
    return 1.5F;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:little_splat";
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  protected void collideWithEntity(Entity par1Entity) {}
  
  protected void collideWithNearbyEntities() {}
  
  public int mygetMaxHealth() {
    return OreSpawnMain.WormSmall_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.WormSmall_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    EntityPlayer target = null;
    super.onLivingUpdate();
    target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(8.0D, 8.0D, 8.0D), (Entity)this);
    if (target != null || OreSpawnMain.PlayNicely != 0) {
      if (this.upcount > 0) {
        this.upcount--;
        if (this.upcount == 0)
          this.downcount = 100 + this.worldObj.rand.nextInt(150); 
        if (target != null)
          pointAtEntity((EntityLivingBase)target); 
        Block bid = this.worldObj.getBlock((int)this.posX, (int)(this.posY + 0.25D), (int)this.posZ);
        if (bid == Blocks.tallgrass)
          bid = Blocks.air; 
        if (bid != Blocks.air) {
          if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.stone)
            setDead(); 
          this.motionY += 0.15000000596046448D;
          this.posY += 0.10000000149011612D;
        } 
      } else {
        if (this.downcount > 0) {
          this.downcount--;
        } else {
          this.upcount = 25 + this.worldObj.rand.nextInt(50);
        } 
        Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY + 2, (int)this.posZ);
        if (bid == Blocks.tallgrass)
          bid = Blocks.air; 
        if (bid != Blocks.air) {
          if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.stone)
            setDead(); 
          this.motionY += 0.20000000298023224D;
          this.posY += 0.05000000074505806D;
        } 
      } 
    } else {
      this.upcount = this.worldObj.rand.nextInt(50);
      this.downcount = 0;
      Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY + 2, (int)this.posZ);
      if (bid == Blocks.tallgrass)
        bid = Blocks.air; 
      if (bid != Blocks.air) {
        if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.stone)
          setDead(); 
        this.motionY += 0.10000000149011612D;
        this.posY += 0.05000000074505806D;
      } 
    } 
    this.motionY -= 0.01D;
    this.motionX = 0.0D;
    this.motionZ = 0.0D;
    this.moveForward = 0.0F;
  }
  
  public void onUpdate() {
    if (isNoDespawnRequired())
      this.noClip = false; 
    super.onUpdate();
    this.motionY *= 0.75D;
  }
  
  public void pointAtEntity(EntityLivingBase e) {
    double d1 = e.posX - this.posX;
    double d2 = e.posZ - this.posZ;
    float d = (float)Math.atan2(d2, d1);
    float f2 = (float)(d * 180.0D / Math.PI) - 90.0F;
    this.rotationYaw = this.rotationYawHead = f2;
  }
  
  protected void updateAITasks() {
    int bid = 0;
    EntityPlayer target = null;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (OreSpawnMain.PlayNicely != 0)
      return; 
    target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(1.5D, 4.0D, 1.5D), (Entity)this);
    if (target != null && 
      target.capabilities.isCreativeMode == true)
      target = null; 
    if (target != null) {
      pointAtEntity((EntityLivingBase)target);
      if (this.upcount > 0 && this.worldObj.rand.nextInt(15) == 1 && !target.capabilities.isCreativeMode) {
        attackEntityAsMob((Entity)target);
        if (this.worldObj.rand.nextInt(6) == 1) {
          ItemStack boots = target.getEquipmentInSlot(1);
          if (boots != null) {
            target.setCurrentItemOrArmor(1, null);
            bid = boots.getMaxDamage() - boots.getItemDamage();
            if (bid > 20) {
              bid /= 20;
            } else {
              bid = 1;
            } 
            boots.damageItem(bid, (EntityLivingBase)this);
            EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 3.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), boots);
            this.worldObj.spawnEntityInWorld((Entity)var3);
          } 
        } 
      } 
    } 
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
  
  protected Item getDropItem() {
    return null;
  }
}
