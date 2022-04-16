package danger.orespawn;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Baryonyx extends EntityAnimal {
  private float moveSpeed = 0.25F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Baryonyx(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(1.5F, 2.8F);
    this.moveSpeed = 0.25F;
    this.fireResistance = 100;
    this.experienceValue = 5;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
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
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    if (findBuddies() > 8)
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return false;
  }
  
  public int mygetMaxHealth() {
    return 40;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:duck_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:duck_hurt";
  }
  
  protected float getSoundVolume() {
    return 0.4F;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    var3 = this.rand.nextInt(5);
    var3 += 2;
    for (int var4 = 0; var4 < var3; var4++)
      dropItem(Items.beef, 1); 
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (bid == Blocks.grass) {
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
        if (bid == Blocks.grass) {
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
        if (bid == Blocks.grass) {
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
        if (bid == Blocks.grass) {
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
        if (bid == Blocks.grass) {
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
        if (bid == Blocks.grass) {
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
    if (this.isDead)
      return; 
    super.updateAITick();
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.rand.nextInt(60) == 0 && OreSpawnMain.PlayNicely == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 11; i++) {
        int j = i;
        if (j > 2)
          j = 2; 
        if (scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 6)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, this.ty, this.tz, 1.0D);
        if (this.closest < 12) {
          if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
            this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.dirt, 0, 2); 
          heal(1.0F);
          playSound("random.burp", 1.0F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
        } 
      } 
    } 
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
  
  public Baryonyx spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new Baryonyx(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.apple);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Baryonyx.class, this.boundingBox.expand(20.0D, 10.0D, 20.0D));
    return var5.size();
  }
}
