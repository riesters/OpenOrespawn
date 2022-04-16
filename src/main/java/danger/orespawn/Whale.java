package danger.orespawn;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Whale extends EntityAnimal {
  private float moveSpeed = 0.35F;
  
  private int spray = 0;
  
  private int spray_timer = 0;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Whale(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(1.5F, 2.5F);
    this.moveSpeed = 0.35F;
    this.fireResistance = 100;
    this.experienceValue = 40;
    getNavigator().setAvoidsWater(false);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.fish, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 12.0F));
    this.tasks.addTask(6, new MyEntityAIWander((EntityCreature)this, 1.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    if (this.spray == 0) {
      if (this.spray_timer > 0)
        this.spray_timer--; 
      if (this.spray_timer == 0) {
        this.spray_timer = 250 + this.worldObj.rand.nextInt(250);
        this.spray = 25 + this.worldObj.rand.nextInt(25);
      } 
    } 
    if (this.worldObj.isRemote && this.spray > 0) {
      for (int i = 0; i < 20; i++) {
        double d = this.worldObj.rand.nextDouble() * 0.75D;
        d *= d;
        double dir = this.worldObj.rand.nextDouble() * 2.0D * Math.PI;
        dir -= Math.PI;
        double dx = Math.cos(dir) * d / 2.0D;
        double dz = Math.sin(dir) * d / 2.0D;
        dir += 1.5707963267948966D;
        if (i < 10) {
          this.worldObj.spawnParticle("bubble", this.posX + dx, this.posY + 1.0D + d, this.posZ + dz, Math.cos(dir) * this.worldObj.rand.nextFloat() / 4.0D, (this.worldObj.rand.nextFloat() * 2.0F), Math.sin(dir) * this.worldObj.rand.nextFloat() / 4.0D);
        } else {
          this.worldObj.spawnParticle("splash", this.posX + dx, this.posY + 1.0D + d, this.posZ + dz, Math.cos(dir) * this.worldObj.rand.nextFloat() / 4.0D, (this.worldObj.rand.nextFloat() * 2.0F), Math.sin(dir) * this.worldObj.rand.nextFloat() / 4.0D);
        } 
      } 
      this.spray--;
    } 
    if (this.worldObj.rand.nextInt(200) == 1)
      heal(1.0F); 
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
  
  protected String getLivingSound() {
    return "splash";
  }
  
  protected String getHurtSound() {
    return "orespawn:little_splat";
  }
  
  protected String getDeathSound() {
    return "orespawn:big_splat";
  }
  
  protected float getSoundVolume() {
    return 0.9F;
  }
  
  protected float getSoundPitch() {
    return 0.5F;
  }
  
  protected Item getDropItem() {
    return Items.fish;
  }
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    var3 = this.rand.nextInt(25);
    var3 += 20;
    for (int var4 = 0; var4 < var3; var4++)
      dropItemRand(Items.fish, 1); 
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
  
  protected void updateAITick() {
    super.updateAITick();
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (!isInWater() && this.worldObj.rand.nextInt(20) == 0) {
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
      } else {
        if (this.worldObj.rand.nextInt(25) == 1)
          heal(-4.0F); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (isInWater() && this.worldObj.rand.nextInt(50) == 0) {
      playSound("splash", 1.0F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
      heal(1.0F);
    } 
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Whale.class, this.boundingBox.expand(32.0D, 8.0D, 32.0D));
    return var5.size();
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (this.worldObj.rand.nextInt(50) != 1)
      return false; 
    if (findBuddies() > 0)
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
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public Whale spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new Whale(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.fish);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
