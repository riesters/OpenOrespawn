package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class HerculesBeetle extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.25F;
  
  public HerculesBeetle(World par1World) {
    super(par1World);
    setSize(3.25F, 2.75F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 200;
    this.fireResistance = 100;
    this.isImmuneToFire = true;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.HerculesBeetle_stats.attack);
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.HerculesBeetle_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.HerculesBeetle_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected void jump() {
    super.jump();
    this.motionY += 0.25D;
    this.posY += 0.5D;
  }
  
  public int getHerculesBeetleHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:alo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:hercules_death";
  }
  
  protected float getSoundVolume() {
    return 1.5F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.beef;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    dropItemRand(OreSpawnMain.MyBigHammer, 1);
    dropItemRand(Items.item_frame, 1);
    int i = 4 + this.worldObj.rand.nextInt(8);
    int var4;
    for (var4 = 0; var4 < i; var4++)
      dropItemRand(Items.beef, 1); 
    i = 1 + this.worldObj.rand.nextInt(5);
    for (var4 = 0; var4 < i; var4++) {
      ItemStack is;
      int var3 = this.worldObj.rand.nextInt(20);
      switch (var3) {
        case 1:
          is = dropItemRand(Items.diamond, 1);
          break;
        case 2:
          is = dropItemRand(Item.getItemFromBlock(Blocks.diamond_block), 1);
          break;
        case 3:
          is = dropItemRand(Items.diamond_sword, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 4:
          is = dropItemRand(Items.diamond_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 5:
          is = dropItemRand(Items.diamond_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 6:
          is = dropItemRand(Items.diamond_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 7:
          is = dropItemRand(Items.diamond_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 8:
          is = dropItemRand((Item)Items.diamond_helmet, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(2)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 9:
          is = dropItemRand((Item)Items.diamond_chestplate, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 10:
          is = dropItemRand((Item)Items.diamond_leggings, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 11:
          is = dropItemRand((Item)Items.diamond_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
      } 
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    double ks = 0.45D;
    double inair = 1.25D;
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
        if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
          inair *= 2.0D; 
        par1Entity.addVelocity(Math.cos(f3) * ks, inair * Math.abs(this.worldObj.rand.nextFloat()), Math.sin(f3) * ks);
      } 
      return true;
    } 
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.hurt_timer > 0)
      return false; 
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 20;
      Entity e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLiving) {
        setAttackTarget((EntityLivingBase)e);
        setTarget(e);
        getNavigator().tryMoveToEntityLiving(e, 1.2D);
      } 
    } 
    return ret;
  }
  
  protected void updateAITasks() {
    EntityLivingBase e = null;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.worldObj.rand.nextInt(4) == 0) {
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < ((5.0F + e.width / 2.0F) * (5.0F + e.width / 2.0F))) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(3) == 0 || this.worldObj.rand.nextInt(4) == 1) {
            attackEntityAsMob((Entity)e);
            if (!this.worldObj.isRemote)
              if (this.worldObj.rand.nextInt(3) == 1) {
                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_attack", 1.4F, 1.0F);
              } else {
                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_living", 1.0F, 1.0F);
              }  
          } 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(150) == 1 && 
      getHealth() < mygetMaxHealth())
      heal(2.0F); 
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
    if (par1EntityLiving instanceof HerculesBeetle)
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
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0D, 6.0D, 16.0D));
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
  
  public boolean getCanSpawnHere() {
    int k;
    for (k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Hercules Beetle"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    if (this.posY < 50.0D)
      return false; 
    for (k = -2; k < 2; k++) {
      for (int j = -2; j < 2; j++) {
        for (int i = 2; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air)
            return false; 
        } 
      } 
    } 
    HerculesBeetle target = null;
    target = (HerculesBeetle)this.worldObj.findNearestEntityWithinAABB(HerculesBeetle.class, this.boundingBox.expand(16.0D, 6.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
}
