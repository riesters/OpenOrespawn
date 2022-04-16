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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Triffid extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.13F;
  
  public Triffid(World par1World) {
    super(par1World);
    setSize(2.0F, 4.0F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 50;
    this.fireResistance = 75;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Byte.valueOf((byte)0));
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
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Triffid_stats.attack);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (this.worldObj.rand.nextInt(100) == 1) {
      int ix = (int)this.posX;
      int iz = (int)this.posZ;
      int k;
      for (k = -5; k <= 5; k++) {
        Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ + k);
        if (bid != Blocks.air) {
          if (k < 0)
            iz--; 
          if (k > 0)
            iz++; 
        } 
      } 
      for (k = -5; k <= 5; k++) {
        Block bid = this.worldObj.getBlock((int)this.posX + k, (int)this.posY - 1, (int)this.posZ);
        if (bid != Blocks.air) {
          if (k < 0)
            ix--; 
          if (k > 0)
            ix++; 
        } 
      } 
      getNavigator().tryMoveToXYZ(ix, this.posY, iz, 1.0D);
    } 
    if (this.hurt_timer <= 0) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        this.rotationYaw = (float)Math.toDegrees(Math.atan2(e.posZ - this.posZ, e.posX - this.posX)) - 90.0F;
        for (; this.rotationYaw < 0.0F; this.rotationYaw += 360.0F);
      } 
    } 
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Triffid_stats.health;
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
    return OreSpawnMain.Triffid_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (!this.worldObj.isRemote && this.hurt_timer > 0)
      this.motionX = this.motionZ = 0.0D; 
  }
  
  public int getTriffidHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    return "orespawn:triffid_living";
  }
  
  protected String getHurtSound() {
    return "orespawn:triffid_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:triffid_dead";
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(3);
    if (i == 0)
      return Items.gold_nugget; 
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
    int i = 4 + this.worldObj.rand.nextInt(6);
    for (int var4 = 0; var4 < i; var4++)
      dropItemRand(OreSpawnMain.GreenGoo, 1); 
    dropItemRand(Items.item_frame, 1);
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean ret = super.attackEntityAsMob(par1Entity);
    return ret;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.hurt_timer > 0 || getOpenClosed() == 0) {
      this.hurt_timer = 300;
      setAttacking(0);
      return false;
    } 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    this.hurt_timer = 300;
    setOpenClosed(0);
    setAttacking(0);
    return ret;
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.hurt_timer > 0) {
      this.hurt_timer--;
      setFire(0);
      setOpenClosed(0);
    } 
    if (this.worldObj.rand.nextInt(250) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(1.0F); 
    if (this.worldObj.rand.nextInt(80) == 2 && 
      this.hurt_timer <= 0)
      if (this.worldObj.rand.nextInt(8) == 1) {
        setOpenClosed(1);
      } else {
        setOpenClosed(0);
      }  
    if (this.worldObj.rand.nextInt(10) == 1 && this.hurt_timer <= 0) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        setOpenClosed(1);
        if (getDistanceSqToEntity((Entity)e) < 25.0D) {
          this.rotationYaw = (float)Math.toDegrees(Math.atan2(e.posZ - this.posZ, e.posX - this.posX)) - 90.0F;
          for (; this.rotationYaw < 0.0F; this.rotationYaw += 360.0F);
          setAttacking(1);
          attackEntityAsMob((Entity)e);
        } else {
          setAttacking(0);
        } 
      } else {
        setAttacking(0);
      } 
    } 
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
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCreeper)
      return false; 
    if (par1EntityLiving instanceof EnderReaper)
      return false; 
    if (par1EntityLiving instanceof Triffid)
      return false; 
    if (par1EntityLiving instanceof TerribleTerror)
      return false; 
    if (par1EntityLiving instanceof LurkingTerror)
      return false; 
    if (par1EntityLiving instanceof PitchBlack)
      return false; 
    if (par1EntityLiving instanceof Dragon)
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
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 8.0D, 10.0D));
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
  
  public final int getOpenClosed() {
    return this.dataWatcher.getWatchableObjectByte(21);
  }
  
  public final void setOpenClosed(int par1) {
    this.dataWatcher.updateObject(21, Byte.valueOf((byte)par1));
  }
  
  public boolean getCanSpawnHere() {
    return true;
  }
}
