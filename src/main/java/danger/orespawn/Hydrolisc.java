package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Hydrolisc extends EntityTameable {
  private float moveSpeed = 0.25F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Hydrolisc(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(0.5F, 0.5F);
    this.fireResistance = 100;
    getNavigator().setAvoidsWater(false);
    setSitting(false);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
    this.tasks.addTask(3, new MyEntityAIFollowOwner(this, 1.2F, 10.0F, 2.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.fish, false));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(7, new MyEntityAIWander((EntityCreature)this, 1.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.experienceValue = 5;
  }
  
  protected void entityInit() {
    super.entityInit();
    setSitting(false);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
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
  
  protected void fall(float par1) {
    float i = MathHelper.ceiling_float_int(par1 - 3.0F);
    if (i > 0.0F) {
      if (i > 3.0F) {
        playSound("damage.fallbig", 1.0F, 1.0F);
      } else {
        playSound("damage.fallsmall", 1.0F, 1.0F);
      } 
      if (i > 2.0F)
        i = 2.0F; 
      attackEntityFrom(DamageSource.fall, i);
    } 
  }
  
  public int getTotalArmorValue() {
    return 10;
  }
  
  protected void updateAITick() {
    super.updateAITick();
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (!isSitting())
      if ((this.worldObj.rand.nextInt(20) == 0 && getHydroHealth() < getMaxHealth()) || this.worldObj.rand.nextInt(100) == 0) {
        this.closest = 99999;
        this.tx = this.ty = this.tz = 0;
        for (int i = 1; i < 11; i++) {
          int j = i;
          if (j > 4)
            j = 4; 
          if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
            break; 
          if (i >= 5)
            i++; 
        } 
        if (this.closest < 99999) {
          getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.0D);
          if (isInWater()) {
            heal(1.0F);
            playSound("splash", 1.0F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
          } 
        } 
      }  
    if (this.worldObj.rand.nextInt(10) == 0 && 
      isTamed()) {
      EntityLivingBase e = getOwner();
      if (e != null && 
        e.getHealth() < e.getMaxHealth() && 
        getHydroHealth() > 20) {
        e.heal(1.0F);
        heal(-1.0F);
      } 
    } 
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 100;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (isInWater())
      this.motionY += 0.04D; 
  }
  
  public int getHydroHealth() {
    return (int)getHealth();
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
            heal(getMaxHealth() - getHealth());
          } else {
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)6);
          }  
      } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
        if (this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (getMaxHealth() > getHealth())
          heal(getMaxHealth() - getHealth()); 
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
    return false;
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.fish);
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:cryo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:cryo_death";
  }
  
  protected float getSoundVolume() {
    return 0.4F;
  }
  
  protected Item getDropItem() {
    return Items.fish;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.rand.nextInt(5);
      var3 += 2;
      for (int var4 = 0; var4 < var3; var4++)
        dropItem(Items.fish, 1); 
    } 
  }
  
  protected float getSoundPitch() {
    return isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.5F) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.0F);
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    float p2 = par2;
    if (p2 > 10.0F)
      p2 = 10.0F; 
    ret = super.attackEntityFrom(par1DamageSource, p2);
    return ret;
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public Hydrolisc spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new Hydrolisc(this.worldObj);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
