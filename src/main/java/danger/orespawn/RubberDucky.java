package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class RubberDucky extends EntityTameable {
  private GenericTargetSorter TargetSorter = null;
  
  public boolean should_despawn = true;
  
  private EntityLivingBase buddy = null;
  
  private float moveSpeed = 0.22F;
  
  private int killcount = 0;
  
  private int died = 0;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public RubberDucky(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    this.moveSpeed = 0.22F;
    setSize(0.33F, 0.5F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 15;
    this.fireResistance = 3;
    this.isImmuneToFire = false;
    this.renderdata = new RenderInfo();
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(1, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.fish, false));
    this.tasks.addTask(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 6.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(23, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(22, Byte.valueOf((byte)0));
    setSitting(false);
    if (getGrowingAge() < 0)
      setGrowingAge(-getGrowingAge()); 
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
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (isInWater()) {
      this.motionY += 0.10000000149011612D;
      if (this.motionY < -0.05000000074505806D)
        this.motionY = -0.05000000074505806D; 
    } 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    Entity w = null;
    w = par1DamageSource.getEntity();
    ret = super.attackEntityFrom(par1DamageSource, par2);
    setSitting(false);
    if (!this.worldObj.isRemote && w != null && w instanceof EntityPlayer && (this.isDead || getHealth() <= 0.0F) && this.died == 0) {
      this.died = 1;
      this.killcount++;
      setKillCount(this.killcount);
      if (this.killcount < 10)
        for (int m = 0; m < 20; m++) {
          int i = this.worldObj.rand.nextInt(3);
          if (this.worldObj.rand.nextInt(2) == 1)
            i = -i; 
          int k = this.worldObj.rand.nextInt(3);
          if (this.worldObj.rand.nextInt(2) == 1)
            k = -k; 
          for (int j = 3; j > -3; j--) {
            if (this.worldObj.getBlock((int)this.posX + i, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air && this.worldObj.getBlock((int)this.posX + i, (int)this.posY + j, (int)this.posZ + k) != Blocks.air) {
              Entity e = spawnCreature(this.worldObj, "Rubber Ducky", ((int)this.posX + i + 1), ((int)this.posY + j + 1), ((int)this.posZ + k));
              if (e != null) {
                RubberDucky d = (RubberDucky)e;
                d.setKillCount(this.killcount);
              } 
              return ret;
            } 
          } 
        }  
    } 
    return ret;
  }
  
  public int mygetMaxHealth() {
    return 5;
  }
  
  public int getTotalArmorValue() {
    return 1;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
      ((EntityLiving)var8).playLivingSound();
    } 
    return var8;
  }
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(10) == 1)
      return "orespawn:duck_hurt"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:duck_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:duck_hurt";
  }
  
  protected float getSoundVolume() {
    return 0.8F;
  }
  
  protected float getSoundPitch() {
    return 1.2F;
  }
  
  protected Item getDropItem() {
    if (this.worldObj.rand.nextInt(2) == 1)
      return Items.feather; 
    if (this.worldObj.rand.nextInt(2) == 1)
      return OreSpawnMain.RubberDuckyEgg; 
    return null;
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (super.interact(par1EntityPlayer))
      return true; 
    if (var2 != null && var2.getItem() == Items.fish && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.rand.nextInt(2) == 0) {
            setTamed(true);
            func_152115_b(par1EntityPlayer.getUniqueID().toString());
            playTameEffect(true);
            this.worldObj.setEntityState((Entity)this, (byte)7);
            heal(mygetMaxHealth() - getHealth());
          } else {
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)6);
          }  
      } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
        if (this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (mygetMaxHealth() > getHealth())
          heal(mygetMaxHealth() - getHealth()); 
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        setTamed(false);
        func_152115_b("");
        playTameEffect(false);
        this.worldObj.setEntityState((Entity)this, (byte)6);
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isSitting() && getKillCount() < 5) {
        setSitting(true);
      } else {
        setSitting(false);
      } 
      return true;
    } 
    return true;
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
        if (bid == Blocks.water || bid == Blocks.flowing_water) {
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
    if (!isInWater() && this.worldObj.rand.nextInt(50) == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 14; i++) {
        int j = i;
        if (j > 5)
          j = 5; 
        if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      if (this.closest < 99999)
        getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.33D); 
    } 
    if (this.killcount > 0 && 
      this.worldObj.rand.nextInt(200) == 1) {
      this.killcount--;
      setKillCount(this.killcount);
    } 
    if (getHealth() < mygetMaxHealth() && this.worldObj.rand.nextInt(300) == 1)
      heal(1.0F); 
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(5) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        if (getDistanceSqToEntity((Entity)e) < 12.0D) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
        } 
      } else {
        if (this.buddy != null && !this.buddy.isDead && this.worldObj.rand.nextInt(15) == 1)
          getNavigator().tryMoveToEntityLiving((Entity)this.buddy, 1.0D); 
        setAttacking(0);
      } 
    } 
    if (this.buddy != null && !this.buddy.isDead && this.worldObj.rand.nextInt(20) == 1)
      getNavigator().tryMoveToEntityLiving((Entity)this.buddy, 1.0D); 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    float i = 1.0F;
    if (getKillCount() >= 5)
      i = 2.0F; 
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
    return flag;
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
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof AttackSquid)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntitySquid)
      return true; 
    if (par1EntityLiving instanceof RubberDucky)
      if (this.worldObj.rand.nextInt(10) == 1)
        this.buddy = par1EntityLiving;  
    if (getKillCount() >= 5 && 
      par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(8.0D, 4.0D, 8.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    EntityLivingBase e = getAttackTarget();
    if (e != null && e.isEntityAlive())
      return e; 
    setAttackTarget(null);
    this.buddy = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("Killcount", this.killcount);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.killcount = par1NBTTagCompound.getInteger("Killcount");
    setKillCount(this.killcount);
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(23);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(23, Byte.valueOf((byte)par1));
  }
  
  public final int getKillCount() {
    return this.dataWatcher.getWatchableObjectByte(22);
  }
  
  public final void setKillCount(int par1) {
    this.dataWatcher.updateObject(22, Byte.valueOf((byte)par1));
    this.killcount = par1;
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Rubber Ducky"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  protected boolean canDespawn() {
    if (isChild()) {
      func_110163_bv();
      return false;
    } 
    if (isNoDespawnRequired())
      return false; 
    if (isTamed())
      return false; 
    return this.should_despawn;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public RubberDucky spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new RubberDucky(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.fish);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
