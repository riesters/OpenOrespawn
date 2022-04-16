package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Peacock extends EntityAnimal {
  private float moveSpeed = 0.38F;
  
  int my_blink = 0;
  
  int blinkcount = 0;
  
  int blinker = 0;
  
  private GenericTargetSorter TargetSorter = null;
  
  public Peacock(World par1World) {
    super(par1World);
    setSize(0.65F, 1.2F);
    this.fireResistance = 100;
    this.experienceValue = 8;
    this.my_blink = 20 + this.rand.nextInt(50);
    this.blinkcount = 0;
    this.blinker = 0;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityMob.class, 8.0F, 1.0D, 1.399999976158142D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 12.0F, 1.2000000476837158D, 1.600000023841858D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(5, new MyEntityAIWander((EntityCreature)this, 1.0F));
    this.tasks.addTask(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, Termite.class, 6, true)); 
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public int getBlink() {
    return this.blinker;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    this.blinkcount++;
    if (this.blinkcount > this.my_blink) {
      this.blinkcount = 0;
      if (this.blinker > 0) {
        this.blinker = 0;
        this.my_blink = 50 + this.worldObj.rand.nextInt(300);
      } else {
        this.blinker = 1;
        this.my_blink = 25 + this.worldObj.rand.nextInt(100);
      } 
    } 
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -1; k < 1; k++) {
      for (int j = -1; j < 1; j++) {
        for (int i = 1; i < 3; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    long t = this.worldObj.getWorldTime();
    t %= 24000L;
    if (t > 12000L)
      return false; 
    if (this.posY < 50.0D || this.posY > 100.0D)
      return false; 
    if (findBuddies() > 2)
      return false; 
    return true;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return false;
  }
  
  public int mygetMaxHealth() {
    return 15;
  }
  
  protected String getLivingSound() {
    if (this.worldObj.rand.nextInt(8) != 1)
      return null; 
    return "orespawn:peacocklive";
  }
  
  protected String getHurtSound() {
    return "orespawn:peacockhit";
  }
  
  protected String getDeathSound() {
    return "orespawn:peacockdead";
  }
  
  protected float getSoundVolume() {
    return 0.4F;
  }
  
  protected Item getDropItem() {
    return OreSpawnMain.MyRawPeacock;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    dropItem(OreSpawnMain.MyRawPeacock, 1);
    if (this.worldObj.rand.nextInt(3) == 1)
      dropItem(OreSpawnMain.MyRawPeacock, 1); 
    if (this.worldObj.rand.nextInt(2) == 1)
      dropItem(OreSpawnMain.MyPeacockFeather, 1); 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 6.0F);
    return var4;
  }
  
  private ItemStack LayAnEgg(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void updateAITasks() {
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    super.updateAITasks();
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return; 
    if (this.worldObj.rand.nextInt(10) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null)
        if (getDistanceSqToEntity((Entity)e) < 4.0D) {
          attackEntityAsMob((Entity)e);
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
        }  
    } 
    if (this.worldObj.rand.nextInt(5000) == 1)
      LayAnEgg(OreSpawnMain.PeacockEgg, 1 + this.worldObj.rand.nextInt(3)); 
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
    if (par1EntityLiving instanceof Termite)
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 2.0D, 10.0D));
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
  
  public Peacock spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new Peacock(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.apple);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Peacock.class, this.boundingBox.expand(16.0D, 10.0D, 16.0D));
    return var5.size();
  }
}
