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
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Spyro extends EntityTameable {
  private ChunkCoordinates currentFlightTarget;
  
  private GenericTargetSorter TargetSorter = null;
  
  public int activity = 1;
  
  private int owner_flying = 0;
  
  private boolean target_in_sight = false;
  
  private float moveSpeed = 0.3F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Spyro(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(0.5F, 0.5F);
    this.moveSpeed = 0.3F;
    this.fireResistance = 1000;
    this.isImmuneToFire = true;
    getNavigator().setAvoidsWater(true);
    setSitting(false);
    this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 0.30000001192092896D, 0.4000000059604645D));
    this.tasks.addTask(3, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.beef, false));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(7, new MyEntityAIWander((EntityCreature)this, 0.75F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.experienceValue = 35;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.activity = 1;
    this.dataWatcher.addObject(21, Integer.valueOf(this.activity));
    this.dataWatcher.addObject(20, Integer.valueOf(1));
    setSitting(false);
    setTamed(false);
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("SpyroActivity", this.dataWatcher.getWatchableObjectInt(21));
    par1NBTTagCompound.setInteger("SpyroFire", this.dataWatcher.getWatchableObjectInt(20));
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.activity = par1NBTTagCompound.getInteger("SpyroActivity");
    this.dataWatcher.updateObject(21, Integer.valueOf(this.activity));
    this.dataWatcher.updateObject(20, Integer.valueOf(par1NBTTagCompound.getInteger("SpyroFire")));
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
        if (bid == Blocks.lava || bid == Blocks.flowing_lava) {
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
  
  public int getActivity() {
    int i = this.dataWatcher.getWatchableObjectInt(21);
    return i;
  }
  
  public void setActivity(int par1) {
    this.activity = par1;
    this.dataWatcher.updateObject(21, Integer.valueOf(this.activity));
  }
  
  public int getSpyroFire() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  public void setSpyroFire(int par1) {
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 200;
  }
  
  public int getSpyroHealth() {
    return (int)getHealth();
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (var2 != null && var2.getItem() == Items.beef && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.worldObj.rand.nextInt(2) == 1) {
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
        setHealth(mygetMaxHealth());
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
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.ice) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)6);
        setSpyroFire(0);
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Baby Dragon fireballs extinguished."));
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Items.diamond && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer) && !this.worldObj.isRemote) {
      Entity ent = null;
      Dragon d = null;
      ent = spawnCreature(this.worldObj, "Dragon", this.posX, this.posY, this.posZ);
      if (ent != null) {
        d = (Dragon)ent;
        if (isTamed()) {
          d.setTamed(true);
          d.func_152115_b(par1EntityPlayer.getUniqueID().toString());
        } 
        setDead();
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Items.flint_and_steel && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)6);
        setSpyroFire(1);
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Baby Dragon fireballs lit!"));
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      setCustomNameTag(var2.getDisplayName());
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!isSitting()) {
        setSitting(true);
      } else {
        setSitting(false);
      } 
      return true;
    } 
    return super.interact(par1EntityPlayer);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.beef);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (isTamed())
      return false; 
    return true;
  }
  
  public int getTotalArmorValue() {
    return 5;
  }
  
  protected String getLivingSound() {
    if (isSitting())
      return null; 
    if (getActivity() != 2)
      return null; 
    return "orespawn:roar";
  }
  
  protected String getHurtSound() {
    return "orespawn:duck_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:cryo_death";
  }
  
  protected float getSoundVolume() {
    return 0.4F;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.worldObj.rand.nextInt(4);
      var3++;
      for (int var4 = 0; var4 < var3; var4++)
        dropItem(Items.beef, 1); 
    } 
  }
  
  protected float getSoundPitch() {
    return isChild() ? ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.1F + 1.5F) : ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.1F + 1.0F);
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.posY < 50.0D)
      return false; 
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public float getAttackStrength(Entity par1Entity) {
    return 4.0F;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    float var2 = getAttackStrength(par1Entity);
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), var2);
    return var4;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (!par1DamageSource.getDamageType().equals("cactus"))
      ret = super.attackEntityFrom(par1DamageSource, par2); 
    return ret;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (isInWater())
      this.motionY += 0.07D; 
    if (this.worldObj.isRemote)
      return; 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.worldObj.rand.nextInt(100000) == 1 && !isNoDespawnRequired()) {
      Entity ent = null;
      Dragon d = null;
      ent = spawnCreature(this.worldObj, "Dragon", this.posX, this.posY, this.posZ);
      if (ent != null) {
        d = (Dragon)ent;
        if (isTamed()) {
          d.setTamed(true);
          d.func_152115_b(func_152113_b());
        } 
        setDead();
        return;
      } 
    } 
    if (this.activity == 2)
      if (this.posY < this.currentFlightTarget.posY + 2.0D) {
        this.motionY *= 0.7D;
      } else if (this.posY > this.currentFlightTarget.posY - 2.0D) {
        this.motionY *= 0.5D;
      } else {
        this.motionY *= 0.61D;
      }  
    if (this.activity == 1 && isTamed() && getOwner() != null) {
      EntityLivingBase e = getOwner();
      if (getDistanceSqToEntity((Entity)e) > 256.0D)
        setActivity(2); 
    } 
    do_movement();
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected void updateAITick() {
    int fly = 0;
    if (this.activity == 1)
      super.updateAITick(); 
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.isRemote)
      return; 
    if (!isSitting()) {
      if (this.activity == 0)
        this.activity = 1; 
      if (this.worldObj.rand.nextInt(20) == 0) {
        this.closest = 99999;
        this.tx = this.ty = this.tz = 0;
        for (int i = 1; i < 11; i++) {
          int j = i;
          if (j > 4)
            j = 4; 
          if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
            break; 
          if (i >= 6)
            i++; 
        } 
        if (this.closest < 99999) {
          setActivity(1);
          getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.0D);
          if (handleLavaMovement()) {
            heal(1.0F);
            playSound("splash", 1.0F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
          } 
        } 
      } 
      if (this.worldObj.rand.nextInt(100) == 1 && 
        !this.target_in_sight) {
        this.activity = 1;
        if (this.worldObj.rand.nextInt(8) == 1)
          this.activity = 2; 
        setActivity(this.activity);
      } 
      this.owner_flying = 0;
      if (isTamed() && getOwner() != null) {
        EntityPlayer e = (EntityPlayer)getOwner();
        if (e.capabilities.isFlying)
          fly = 1; 
        if (fly == 1) {
          this.owner_flying = 1;
          setActivity(2);
        } 
      } 
    } 
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.rand.nextInt(100) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(1.0F); 
  }
  
  private void do_movement() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    int do_new = 0;
    double ox = 0.0D, oy = 0.0D, oz = 0.0D;
    int has_owner = 0;
    EntityLivingBase e = null;
    if (this.currentFlightTarget == null) {
      do_new = 1;
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
    } 
    if (isSitting())
      return; 
    if (this.activity == 1)
      return; 
    if (getActivity() == 2 && this.worldObj.rand.nextInt(300) == 0)
      do_new = 1; 
    if (isTamed() && getOwner() != null) {
      e = getOwner();
      has_owner = 1;
      ox = e.posX;
      oy = e.posY;
      oz = e.posZ;
      if (getDistanceSqToEntity((Entity)e) > 100.0D)
        do_new = 1; 
      if (this.owner_flying != 0 && 
        getDistanceSqToEntity((Entity)e) > 36.0D)
        do_new = 1; 
    } 
    if (this.worldObj.rand.nextInt(6) == 1 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      e = findSomethingToAttack();
      if (e != null) {
        if (isTamed() && getHealth() / mygetMaxHealth() < 0.25F) {
          setActivity(2);
          this.target_in_sight = false;
          do_new = 0;
          this.currentFlightTarget.set((int)(this.posX + this.posX - e.posX), (int)(this.posY + 1.0D), (int)(this.posZ + this.posZ - e.posZ));
        } else {
          setActivity(2);
          this.target_in_sight = true;
          this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
          do_new = 0;
          if (getDistanceSqToEntity((Entity)e) < ((3.0F + e.width / 2.0F) * (3.0F + e.width / 2.0F))) {
            attackEntityAsMob((Entity)e);
          } else if (getDistanceSqToEntity((Entity)e) < 64.0D && !isInWater() && ((
            getSpyroFire() == 1 && this.worldObj.rand.nextInt(10) == 0) || this.worldObj.rand.nextInt(15) == 1)) {
            EntitySmallFireball var2 = new EntitySmallFireball(this.worldObj, (EntityLivingBase)this, e.posX - this.posX, e.posY + 0.25D - this.posY + 1.25D, e.posZ - this.posZ);
            var2.setLocationAndAngles(this.posX, this.posY + 1.25D, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
            this.worldObj.spawnEntityInWorld((Entity)var2);
          } 
        } 
      } else {
        this.target_in_sight = false;
      } 
    } 
    if (this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F && 
      getActivity() != 3)
      do_new = 1; 
    if (do_new != 0 && !this.target_in_sight) {
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        int gox = (int)this.posX;
        int goy = (int)this.posY;
        int goz = (int)this.posZ;
        if (has_owner == 1) {
          gox = (int)ox;
          goy = (int)oy;
          goz = (int)oz;
          if (this.owner_flying == 0) {
            zdir = this.worldObj.rand.nextInt(4) + 6;
            xdir = this.worldObj.rand.nextInt(4) + 6;
          } else {
            zdir = this.worldObj.rand.nextInt(6);
            xdir = this.worldObj.rand.nextInt(6);
          } 
        } else {
          zdir = this.worldObj.rand.nextInt(5) + 6;
          xdir = this.worldObj.rand.nextInt(5) + 6;
        } 
        if (this.worldObj.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.worldObj.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set(gox + xdir, goy + this.worldObj.rand.nextInt(9 + this.owner_flying * 2) - 4, goz + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
    } 
    double speed_factor = 0.5D;
    double var1 = this.currentFlightTarget.posX + 0.5D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.5D - this.posZ;
    if (this.owner_flying != 0) {
      speed_factor = 1.75D;
      if (isTamed() && getOwner() != null) {
        e = getOwner();
        if (getDistanceSqToEntity((Entity)e) > 49.0D)
          speed_factor = 3.5D; 
      } 
    } 
    this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.15D * speed_factor;
    this.motionY += (Math.signum(var3) * 0.7D - this.motionY) * 0.21D * speed_factor;
    this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.15D * speed_factor;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = (float)(0.75D * speed_factor);
    this.rotationYaw += var8 / 3.0F;
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
    if (par1EntityLiving instanceof Spyro)
      return false; 
    if (par1EntityLiving instanceof Mothra)
      return true; 
    if (par1EntityLiving instanceof EntityMob)
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
      if (isSuitableTarget(var4, false) && canSeeTarget(var4.posX, var4.posY, var4.posZ))
        return var4; 
    } 
    return null;
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
}
