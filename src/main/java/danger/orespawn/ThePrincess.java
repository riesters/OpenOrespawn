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
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
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

public class ThePrincess extends EntityTameable {
  private ChunkCoordinates currentFlightTarget;
  
  private GenericTargetSorter TargetSorter = null;
  
  public int activity = 1;
  
  private int owner_flying = 0;
  
  private float moveSpeed = 0.3F;
  
  private int syncit = 0;
  
  private int head1ext = 0;
  
  private int head2ext = 0;
  
  private int head3ext = 0;
  
  private int head1dir = 1;
  
  private int head2dir = 1;
  
  private int head3dir = 1;
  
  private int ok_to_grow = 0;
  
  private int kill_count = 0;
  
  private int fed_count = 0;
  
  private int day_count = 0;
  
  private int is_day = 0;
  
  private int attack_level = 1;
  
  private int ticker = 0;
  
  public ThePrincess(World par1World) {
    super(par1World);
    setSize(0.75F, 1.25F);
    this.moveSpeed = 0.32F;
    this.fireResistance = 1000;
    this.isImmuneToFire = true;
    getNavigator().setAvoidsWater(true);
    setSitting(false);
    this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, new MyEntityAIFollowOwner(this, 1.15F, 12.0F, 2.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.beef, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 6.0F));
    this.tasks.addTask(5, new MyEntityAIWander((EntityCreature)this, 0.75F));
    this.tasks.addTask(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.experienceValue = 50;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.activity = 1;
    this.dataWatcher.addObject(22, Integer.valueOf(0));
    this.dataWatcher.addObject(21, Integer.valueOf(this.activity));
    this.dataWatcher.addObject(20, Integer.valueOf(1));
    this.dataWatcher.addObject(23, Integer.valueOf(this.attack_level));
    setSitting(false);
    setTamed(false);
    this.noClip = false;
  }
  
  public int getPower() {
    return this.dataWatcher.getWatchableObjectInt(23);
  }
  
  public void setPower(int par1) {
    this.dataWatcher.updateObject(23, Integer.valueOf(par1));
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("SpyroActivity", this.dataWatcher.getWatchableObjectInt(21));
    par1NBTTagCompound.setInteger("SpyroFire", this.dataWatcher.getWatchableObjectInt(20));
    par1NBTTagCompound.setInteger("SpyroGrow", this.ok_to_grow);
    par1NBTTagCompound.setInteger("SpyroKill", this.kill_count);
    par1NBTTagCompound.setInteger("SpyroFed", this.fed_count);
    par1NBTTagCompound.setInteger("SpyroDay", this.day_count);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.activity = par1NBTTagCompound.getInteger("SpyroActivity");
    this.dataWatcher.updateObject(21, Integer.valueOf(this.activity));
    this.dataWatcher.updateObject(20, Integer.valueOf(par1NBTTagCompound.getInteger("SpyroFire")));
    this.ok_to_grow = par1NBTTagCompound.getInteger("SpyroGrow");
    this.kill_count = par1NBTTagCompound.getInteger("SpyroKill");
    this.fed_count = par1NBTTagCompound.getInteger("SpyroFed");
    this.day_count = par1NBTTagCompound.getInteger("SpyroDay");
  }
  
  public int getActivity() {
    int i = this.dataWatcher.getWatchableObjectInt(21);
    this.activity = i;
    return i;
  }
  
  public void setActivity(int par1) {
    this.activity = par1;
    this.dataWatcher.updateObject(21, Integer.valueOf(0));
    this.dataWatcher.updateObject(21, Integer.valueOf(par1));
  }
  
  public int getSpyroFire() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  public void setSpyroFire(int par1) {
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
  }
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public void setAttacking(int par1) {
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
  }
  
  public int getHead1Ext() {
    return this.head1ext;
  }
  
  public int getHead2Ext() {
    return this.head2ext;
  }
  
  public int getHead3Ext() {
    return this.head3ext;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 400;
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.diamond_block) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!this.worldObj.isRemote) {
        setTamed(true);
        func_152115_b(par1EntityPlayer.getUniqueID().toString());
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
        heal(mygetMaxHealth() - getHealth());
        this.ok_to_grow = 1;
        this.kill_count = 1000;
        this.fed_count = 1000;
        this.day_count = 1000;
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && var2.getItem() instanceof ItemFood) {
      if (!this.worldObj.isRemote) {
        ItemFood var3 = (ItemFood)var2.getItem();
        if (mygetMaxHealth() > getHealth())
          heal((var3.func_150905_g(var2) * 10)); 
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
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
        String healthMessage = new String();
        healthMessage = String.format("Princess fireballs extinguished.", new Object[0]);
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
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
        String healthMessage = new String();
        healthMessage = String.format("Princess fireballs lit!", new Object[0]);
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
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
        setActivity(1);
      } else {
        setSitting(false);
      } 
      return true;
    } 
    return super.interact(par1EntityPlayer);
  }
  
  public void set_ok_to_grow() {
    this.ok_to_grow = 1;
    this.kill_count = 0;
    this.fed_count = 0;
    this.day_count = 0;
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.beef);
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected String getLivingSound() {
    if (isSitting())
      return null; 
    if (getAttacking() == 0)
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
    return 0.6F;
  }
  
  public int getTotalArmorValue() {
    return 14;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    var3 = this.worldObj.rand.nextInt(4);
    var3++;
    for (int var4 = 0; var4 < var3; var4++)
      dropItem(Items.beef, 1); 
  }
  
  protected float getSoundPitch() {
    return (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F + 1.5F;
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
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public float getAttackStrength(Entity par1Entity) {
    return 9.0F;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    float var2 = getAttackStrength(par1Entity);
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), var2);
    if (par1Entity instanceof EntityLivingBase) {
      EntityLivingBase el = (EntityLivingBase)par1Entity;
      if (el.getHealth() <= 0.0F)
        this.kill_count++; 
    } 
    return var4;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("inWall"))
      return false; 
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      setSitting(false);
      setActivity(2);
    } 
    return ret;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (getActivity() == 2) {
      this.noClip = true;
    } else {
      this.noClip = false;
    } 
    if (this.worldObj.rand.nextInt(10) == 1) {
      int i = this.worldObj.rand.nextInt(3);
      if (i == 0)
        this.head1dir = 2; 
      if (i == 1)
        this.head1dir = -2; 
      if (i == 2)
        this.head1dir = 0; 
    } 
    if (this.worldObj.rand.nextInt(10) == 1) {
      int i = this.worldObj.rand.nextInt(3);
      if (i == 0)
        this.head2dir = 2; 
      if (i == 1)
        this.head2dir = -2; 
      if (i == 2)
        this.head2dir = 0; 
    } 
    if (this.worldObj.rand.nextInt(10) == 1) {
      int i = this.worldObj.rand.nextInt(3);
      if (i == 0)
        this.head3dir = 2; 
      if (i == 1)
        this.head3dir = -2; 
      if (i == 2)
        this.head3dir = 0; 
    } 
    this.head1ext += this.head1dir;
    if (this.head1ext < 0)
      this.head1ext = 0; 
    if (this.head1ext > 60)
      this.head1ext = 60; 
    this.head2ext += this.head2dir;
    if (this.head2ext < 0)
      this.head2ext = 0; 
    if (this.head2ext > 60)
      this.head2ext = 60; 
    this.head3ext += this.head3dir;
    if (this.head3ext < 0)
      this.head3ext = 0; 
    if (this.head3ext > 60)
      this.head3ext = 60; 
    if (this.worldObj.isRemote && getPower() > 400) {
      float f = 0.25F;
      if (this.worldObj.rand.nextInt(6) == 1)
        for (int i = 0; i < 2; i++)
          this.worldObj.spawnParticle("fireworksSpark", this.posX - f * Math.sin(Math.toRadians(this.rotationYaw)), this.posY + 0.4D, this.posZ + f * Math.cos(Math.toRadians(this.rotationYaw)), (this.worldObj.rand.nextGaussian() - this.worldObj.rand.nextGaussian()) / 7.0D + this.motionX * 3.0D, (this.worldObj.rand.nextGaussian() - this.worldObj.rand.nextGaussian()) / 7.0D, (this.worldObj.rand.nextGaussian() - this.worldObj.rand.nextGaussian()) / 7.0D + this.motionZ * 3.0D);  
    } 
  }
  
  public void onLivingUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onLivingUpdate();
    if (isInWater())
      this.motionY += 0.07D; 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    this.syncit++;
    if (this.syncit > 20) {
      this.syncit = 0;
      if (this.worldObj.isRemote) {
        getActivity();
      } else {
        int j = this.activity;
        setActivity(j);
      } 
    } 
    if (this.activity == 2)
      this.motionY *= 0.6D; 
  }
  
  protected void updateAITasks() {
    double xzoff = 1.5D;
    double yoff = 1.0D;
    EntityLiving newent = null;
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.activity != 2)
      super.updateAITasks(); 
    this.ticker++;
    if (this.ticker % 10 == 0)
      setPower(this.attack_level); 
    if (this.worldObj.rand.nextInt(200) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(1.0F); 
    if (!isTamed()) {
      EntityPlayer p = this.worldObj.getClosestPlayerToEntity((Entity)this, 10.0D);
      if (p != null) {
        setTamed(true);
        func_152115_b(p.getUniqueID().toString());
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
        heal(mygetMaxHealth() - getHealth());
      } 
    } 
    this.attack_level++;
    if (getAttacking() != 0)
      this.attack_level += 4; 
    if (getSpyroFire() == 0)
      this.attack_level = 0; 
    if (this.attack_level > 500) {
      if (getAttacking() != 0) {
        int j = 3;
        for (int i = 0; i < j; i++) {
          //this;
          Entity ppwr = spawnCreature(this.worldObj, "PurplePower", this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw)));
          if (ppwr != null) {
            PurplePower p = (PurplePower)ppwr;
            p.motionX = this.motionX * 3.0D;
            p.motionZ = this.motionZ * 3.0D;
            p.setPurpleType(1 + this.worldObj.rand.nextInt(3));
          } 
        } 
      } else {
        if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          for (int i = 0; i < 5; i++) {
            int n = this.worldObj.rand.nextInt(5) - this.worldObj.rand.nextInt(5);
            int k = this.worldObj.rand.nextInt(5) - this.worldObj.rand.nextInt(5);
            for (int j = -5; j < 5; j++) {
              Block bid = this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j, (int)this.posZ + k);
              if (bid == Blocks.grass) {
                if (this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                  int which = this.worldObj.rand.nextInt(8);
                  if (which == 0)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, (Block)Blocks.red_flower); 
                  if (which == 1)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, (Block)Blocks.yellow_flower); 
                  if (which == 2)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.MyFlowerBlueBlock); 
                  if (which == 3)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.MyFlowerPinkBlock); 
                  if (which == 4)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.CrystalFlowerRedBlock); 
                  if (which == 5)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.CrystalFlowerGreenBlock); 
                  if (which == 6)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.CrystalFlowerBlueBlock); 
                  if (which == 7)
                    this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, OreSpawnMain.CrystalFlowerYellowBlock); 
                } 
                break;
              } 
              if (bid == Blocks.dirt && 
                this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j, (int)this.posZ + k, (Block)Blocks.grass);
                break;
              } 
              if (bid == Blocks.stone && 
                this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, Blocks.dirt);
                break;
              } 
              if (bid == Blocks.sand && 
                this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                if (this.worldObj.rand.nextInt(2) == 0) {
                  this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k, Blocks.cactus);
                  break;
                } 
                this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j, (int)this.posZ + k, Blocks.dirt);
                break;
              } 
              if (bid == Blocks.lava && 
                this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j, (int)this.posZ + k, Blocks.water);
                break;
              } 
              if (bid == Blocks.flowing_lava && 
                this.worldObj.getBlock((int)this.posX + n, (int)this.posY + j + 1, (int)this.posZ + k) == Blocks.air) {
                this.worldObj.setBlock((int)this.posX + n, (int)this.posY + j, (int)this.posZ + k, (Block)Blocks.flowing_water);
                break;
              } 
              if (bid == Blocks.air && j > 0)
                break; 
            } 
          }  
        for (int m = 0; m < 2; m++) {
          int i = this.worldObj.rand.nextInt(4) - this.worldObj.rand.nextInt(4);
          int k = this.worldObj.rand.nextInt(4) - this.worldObj.rand.nextInt(4);
          int j = 1 + this.worldObj.rand.nextInt(4);
          Block bid = this.worldObj.getBlock((int)this.posX + i, (int)this.posY + j, (int)this.posZ + k);
          if (bid == Blocks.air)
            if (this.worldObj.rand.nextInt(2) == 0) {
              newent = (EntityLiving)spawnCreature(this.worldObj, "Butterfly", this.posX + i, this.posY + j, this.posZ + k);
            } else {
              newent = (EntityLiving)spawnCreature(this.worldObj, "Bird", this.posX + i, this.posY + j, this.posZ + k);
            }  
        } 
      } 
      this.attack_level = 1;
    } 
    if (!isSitting()) {
      if (this.activity == 0)
        setActivity(1); 
      if (this.worldObj.rand.nextInt(100) == 1)
        if (this.worldObj.rand.nextInt(20) == 1) {
          setActivity(2);
        } else {
          setActivity(1);
        }  
      this.owner_flying = 0;
      if (isTamed() && getOwner() != null) {
        EntityPlayer e = (EntityPlayer)getOwner();
        if (e.capabilities.isFlying) {
          this.owner_flying = 1;
          setActivity(2);
        } 
      } 
      if (this.activity == 1 && isTamed() && getOwner() != null) {
        EntityLivingBase e = getOwner();
        if (getDistanceSqToEntity((Entity)e) > 256.0D)
          setActivity(2); 
      } 
      do_movement();
    } else if (isTamed() && getOwner() != null) {
      EntityLivingBase e = getOwner();
      if (getDistanceSqToEntity((Entity)e) > 256.0D) {
        setSitting(false);
        setActivity(2);
      } 
    } 
    if (this.is_day == 0) {
      this.is_day = 1;
      if (!this.worldObj.isDaytime())
        this.is_day = -1; 
    } else {
      if (this.is_day == -1 && 
        this.worldObj.isDaytime())
        this.day_count++; 
      this.is_day = 1;
      if (!this.worldObj.isDaytime())
        this.is_day = -1; 
    } 
  }
  
  private void do_movement() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 10;
    int do_new = 0;
    double ox = 0.0D, oy = 0.0D, oz = 0.0D;
    int has_owner = 0;
    double rr = 0.0D;
    double rhdir = 0.0D;
    double rdd = 0.0D;
    double pi = 3.1415926545D;
    EntityLivingBase e = null;
    if (this.currentFlightTarget == null) {
      do_new = 1;
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ);
    } 
    if (this.activity == 2 && this.worldObj.rand.nextInt(300) == 0)
      do_new = 1; 
    if (isTamed() && getOwner() != null) {
      e = getOwner();
      has_owner = 1;
      ox = e.posX;
      oy = e.posY + 1.0D;
      oz = e.posZ;
      if (getDistanceSqToEntity((Entity)e) > 100.0D)
        do_new = 1; 
      if (this.owner_flying != 0 && 
        getDistanceSqToEntity((Entity)e) > 36.0D)
        do_new = 1; 
    } 
    if (this.worldObj.rand.nextInt(7) == 1 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
      e = findSomethingToAttack();
      if (e != null) {
        if (isTamed() && getHealth() / mygetMaxHealth() < 0.25F) {
          setActivity(2);
          setAttacking(0);
          do_new = 0;
          this.currentFlightTarget.set((int)(this.posX + this.posX - e.posX), (int)(this.posY + 1.0D), (int)(this.posZ + this.posZ - e.posZ));
        } else {
          setActivity(2);
          setAttacking(1);
          this.currentFlightTarget.set((int)e.posX, (int)(e.posY + 1.0D), (int)e.posZ);
          do_new = 0;
          if (getDistanceSqToEntity((Entity)e) < ((3.0F + e.width / 2.0F) * (3.0F + e.width / 2.0F))) {
            attackEntityAsMob((Entity)e);
          } else if (getDistanceSqToEntity((Entity)e) > 25.0D && getDistanceSqToEntity((Entity)e) < 144.0D && !isInWater() && getSpyroFire() != 0 && (
            this.worldObj.rand.nextInt(3) == 0 || this.worldObj.rand.nextInt(4) == 1)) {
            int which = this.worldObj.rand.nextInt(3);
            if (which == 0) {
              rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
              rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
              rdd = Math.abs(rr - rhdir) % pi * 2.0D;
              if (rdd > pi)
                rdd -= pi * 2.0D; 
              rdd = Math.abs(rdd);
              if (rdd < 0.5D)
                firecanon(e); 
            } else if (which == 1) {
              rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
              rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
              rdd = Math.abs(rr - rhdir) % pi * 2.0D;
              if (rdd > pi)
                rdd -= pi * 2.0D; 
              rdd = Math.abs(rdd);
              if (rdd < 0.5D)
                firecanonl(e); 
            } else {
              rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
              rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
              rdd = Math.abs(rr - rhdir) % pi * 2.0D;
              if (rdd > pi)
                rdd -= pi * 2.0D; 
              rdd = Math.abs(rdd);
              if (rdd < 0.5D)
                firecanoni(e); 
            } 
          } 
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.activity == 1)
      return; 
    if (this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 2.1F)
      do_new = 1; 
    if (do_new != 0) {
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
            zdir = this.worldObj.rand.nextInt(8);
            xdir = this.worldObj.rand.nextInt(8);
          } 
        } else {
          zdir = this.worldObj.rand.nextInt(5) + 6;
          xdir = this.worldObj.rand.nextInt(5) + 6;
        } 
        if (this.worldObj.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.worldObj.rand.nextInt(2) == 0)
          xdir = -xdir; 
        this.currentFlightTarget.set(gox + xdir, goy + this.worldObj.rand.nextInt(6 + this.owner_flying * 2) - 2, goz + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        keep_trying--;
      } 
    } 
    double speed_factor = 1.0D;
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
    if (MyUtils.isRoyalty((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    if (par1EntityLiving instanceof Mothra)
      return true; 
    if (par1EntityLiving instanceof Dragonfly)
      return true; 
    if (par1EntityLiving instanceof EntityMosquito)
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
  
  private void firecanon(EntityLivingBase e) {
    double yoff = 1.0D;
    double xzoff = 3.0D;
    BetterFireball bf = null;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    bf = new BetterFireball(this.worldObj, (EntityLivingBase)this, e.posX - cx + r1, e.posY + (e.height / 2.0F) - this.posY + yoff + r2, e.posZ - cz + r3);
    bf.setLocationAndAngles(cx, this.posY + yoff, cz, this.rotationYaw, 0.0F);
    bf.setPosition(cx, this.posY + yoff, cz);
    bf.setBig();
    if (this.worldObj.rand.nextInt(2) == 1)
      bf.setSmall(); 
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    this.worldObj.spawnEntityInWorld((Entity)bf);
  }
  
  private void firecanonl(EntityLivingBase e) {
    double yoff = 1.0D;
    double xzoff = 3.0D;
    double var3 = 0.0D;
    double var5 = 0.0D;
    double var7 = 0.0D;
    float var9 = 0.0F;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    ThunderBolt lb = new ThunderBolt(this.worldObj, cx, this.posY + yoff, cz);
    lb.setLocationAndAngles(cx, this.posY + yoff, cz, 0.0F, 0.0F);
    var3 = e.posX - lb.posX;
    var5 = e.posY + 0.25D - lb.posY;
    var7 = e.posZ - lb.posZ;
    var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
    lb.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 4.0F);
    lb.motionX *= 3.0D;
    lb.motionY *= 3.0D;
    lb.motionZ *= 3.0D;
    this.worldObj.spawnEntityInWorld((Entity)lb);
  }
  
  private void firecanoni(EntityLivingBase e) {
    double yoff = 1.0D;
    double xzoff = 3.0D;
    double var3 = 0.0D;
    double var5 = 0.0D;
    double var7 = 0.0D;
    float var9 = 0.0F;
    double cx = this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw));
    double cz = this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw));
    this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
    float r1 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r2 = 3.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    float r3 = 5.0F * (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
    IceBall lb = new IceBall(this.worldObj, cx, this.posY + yoff, cz);
    lb.setIceMaker(1);
    lb.setLocationAndAngles(cx, this.posY + yoff, cz, 0.0F, 0.0F);
    var3 = e.posX - lb.posX;
    var5 = e.posY + 0.25D - lb.posY;
    var7 = e.posZ - lb.posZ;
    var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
    lb.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 4.0F);
    lb.motionX *= 3.0D;
    lb.motionY *= 3.0D;
    lb.motionZ *= 3.0D;
    this.worldObj.spawnEntityInWorld((Entity)lb);
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
