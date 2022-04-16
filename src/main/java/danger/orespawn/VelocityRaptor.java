package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class VelocityRaptor extends EntityCannonFodder {
  private float moveSpeed = 0.55F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public VelocityRaptor(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(0.5F, 0.6F);
    this.fireResistance = 10;
    getNavigator().setAvoidsWater(true);
    setSitting(false);
    this.experienceValue = 5;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(2, new MyEntityAIFollowOwner(this, 1.5F, 10.0F, 2.0F));
    this.tasks.addTask(3, new MyEntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.apple, false));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.600000023841858D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(7, new MyEntityAIWander((EntityCreature)this, 0.9F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    setSitting(false);
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
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
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
        if (bid == Blocks.tallgrass || bid == Blocks.yellow_flower || bid == Blocks.red_flower || bid == Blocks.deadbush || bid == Blocks.double_plant) {
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
  
  protected void updateAITick() {
    super.updateAITick();
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (!isSitting() && ((
      this.worldObj.rand.nextInt(20) == 0 && getVHealth() < mygetMaxHealth()) || this.worldObj.rand.nextInt(250) == 0))
      if (OreSpawnMain.PlayNicely == 0) {
        this.closest = 99999;
        this.tx = this.ty = this.tz = 0;
        for (int i = 1; i < 10; i++) {
          int j = i;
          if (j > 2)
            j = 2; 
          if (scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i) == true)
            break; 
          if (i >= 5)
            i++; 
        } 
        if (this.closest < 99999) {
          getNavigator().tryMoveToXYZ(this.tx, this.ty, this.tz, 1.0D);
          if (this.closest < 12) {
            if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.air, 0, 2); 
            heal(2.0F);
            playSound("random.burp", 0.5F, this.worldObj.rand.nextFloat() * 0.2F + 1.5F);
          } 
        } 
      }  
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return false;
  }
  
  public int mygetMaxHealth() {
    return isTamed() ? 20 : 10;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public int getVHealth() {
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
    if (var2 != null && var2.getItem() == Items.apple && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
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
          par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6000000238418579D);
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
      } else {
        par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
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
      if (this.worldObj.isRemote)
        par1EntityPlayer.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D); 
      return true;
    } 
    return false;
  }
  
  protected String getLivingSound() {
    if (isSitting())
      return null; 
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
    return null;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.rand.nextInt(5);
      var3 += 2;
      for (int var4 = 0; var4 < var3; var4++)
        dropItem(Item.getItemFromBlock((Block)Blocks.red_flower), 1); 
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
    if (isChild()) {
      func_110163_bv();
      return false;
    } 
    if (isTamed())
      return false; 
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public VelocityRaptor spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new VelocityRaptor(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.apple);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
