package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class AttackSquid extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private EntityLivingBase buddy = null;
  
  private float moveSpeed = 0.25F;
  
  private int wasshot = 0;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public AttackSquid(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(1.0F, 1.25F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 15;
    this.fireResistance = 3;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.AttackSquid_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    return true;
  }
  
  public void setWasShot() {
    this.wasshot = 250;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.AttackSquid_stats.health;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.AttackSquid_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public int getAttackStrength(Entity par1Entity) {
    int var2 = 2;
    return var2;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:squid_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:squid_death";
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
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.fish;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    EntityItem var3;
    ItemStack is = null;
    int var4 = this.worldObj.rand.nextInt(50);
    switch (var4) {
      case 0:
        is = dropItemRand(Items.gold_nugget, 1);
        break;
      case 1:
        is = dropItemRand(Items.gold_ingot, 1);
        break;
      case 2:
        is = dropItemRand(Items.golden_carrot, 1);
        break;
      case 3:
        is = dropItemRand(Items.golden_sword, 1);
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
        is = dropItemRand(Items.golden_shovel, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 5:
        is = dropItemRand(Items.golden_pickaxe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 6:
        is = dropItemRand(Items.golden_axe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 7:
        is = dropItemRand(Items.golden_hoe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 8:
        is = dropItemRand((Item)Items.golden_helmet, 1);
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
        is = dropItemRand((Item)Items.golden_chestplate, 1);
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
        is = dropItemRand((Item)Items.golden_leggings, 1);
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
        is = dropItemRand((Item)Items.golden_boots, 1);
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        break;
      case 12:
        dropItemRand(Items.golden_apple, 1);
        break;
      case 13:
        dropItemRand(Item.getItemFromBlock(Blocks.gold_block), 1);
        break;
      case 14:
        var3 = null;
        is = new ItemStack(Items.golden_apple, 1, 1);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
        if (var3 != null)
          this.worldObj.spawnEntityInWorld((Entity)var3); 
        break;
      case 15:
      case 16:
      case 17:
        dropItemRand(Items.dye, 1);
        break;
    } 
    int i = 1 + this.worldObj.rand.nextInt(3);
    for (var4 = 0; var4 < i; var4++)
      dropItemRand(Items.fish, 1); 
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (super.attackEntityAsMob(par1Entity))
      return true; 
    return false;
  }
  
  protected void fall(float par1) {
    if (this.wasshot != 0)
      return; 
    super.fall(par1);
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.isDead)
      return false; 
    Entity e = par1DamageSource.getEntity();
    if (e != null && e instanceof AttackSquid)
      return false; 
    if (e != null && e instanceof WaterBall)
      return false; 
    if (e != null && e instanceof WaterDragon)
      return false; 
    if (e != null && e instanceof EntityLiving) {
      if (e instanceof AttackSquid)
        return false; 
      if (e instanceof WaterDragon)
        return false; 
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
      ret = true;
    } 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    if ((getHealth() <= 0.0F || this.isDead) && this.worldObj.provider.dimensionId != OreSpawnMain.DimensionID5 && !this.worldObj.isRemote && e != null && e instanceof EntityPlayer && this.worldObj.rand.nextInt(15) == 1 && OreSpawnMain.KrakenEnable != 0 && this.wasshot == 0) {
      int j = 1 + this.worldObj.rand.nextInt(3);
      for (int i = 0; i < j; i++) {
        EntityCreature newent = (EntityCreature)spawnCreature(this.worldObj, "The Kraken", this.posX + this.worldObj.rand.nextInt(4) - this.worldObj.rand.nextInt(4), 170.0D, this.posZ + this.worldObj.rand.nextInt(4) - this.worldObj.rand.nextInt(4));
      }
    } 
    return ret;
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
    if (this.wasshot > 0) {
      this.wasshot--;
      if (this.wasshot == 0) {
        setDead();
        return;
      } 
    } 
    if (!isInWater() && this.worldObj.rand.nextInt(10) == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 12; i++) {
        int j = i;
        if (j > 5)
          j = 5; 
        if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.33D);
      } else {
        if (this.worldObj.rand.nextInt(25) == 1)
          heal(-1.0F); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(10) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        if (getDistanceSqToEntity((Entity)e) < 9.0D) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.2D);
          watercanon(e);
        } 
      } else {
        if (this.buddy != null)
          getNavigator().tryMoveToEntityLiving((Entity)this.buddy, 1.0D); 
        setAttacking(0);
      } 
    } 
  }
  
  private void watercanon(EntityLivingBase e) {
    double yoff = 1.0D;
    double xzoff = 1.2D;
    if (this.worldObj.rand.nextInt(5) == 1)
      if (this.rand.nextInt(3) == 1) {
        InkSack var2 = new InkSack(this.worldObj, e.posX - this.posX, e.posY + 0.75D - this.posY + yoff, e.posZ - this.posZ);
        var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw)), this.rotationYawHead, this.rotationPitch);
        double var3 = e.posX - this.posX;
        double var5 = e.posY + 0.25D - var2.posY;
        double var7 = e.posZ - this.posZ;
        float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
        var2.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 5.0F);
        this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)var2);
      } else {
        WaterBall var2 = new WaterBall(this.worldObj, e.posX - this.posX, e.posY + 0.75D - this.posY + yoff, e.posZ - this.posZ);
        var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw)), this.rotationYawHead, this.rotationPitch);
        double var3 = e.posX - this.posX;
        double var5 = e.posY + 0.25D - var2.posY;
        double var7 = e.posZ - this.posZ;
        float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
        var2.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 5.0F);
        this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)var2);
      }  
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof Girlfriend)
      return true; 
    if (par1EntityLiving instanceof Boyfriend)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityZombie)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityVillager)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
      return true; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
      return true; 
    if (par1EntityLiving instanceof Ghost)
      return false; 
    if (par1EntityLiving instanceof GhostSkelly)
      return false; 
    if (par1EntityLiving instanceof Lizard)
      return true; 
    if (par1EntityLiving instanceof AttackSquid) {
      if (this.worldObj.rand.nextInt(5) == 1)
        this.buddy = par1EntityLiving; 
      return false;
    } 
    if (this.wasshot != 0)
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 4.0D, 10.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    EntityLivingBase e = getAttackTarget();
    if (e != null && e.isEntityAlive())
      return e; 
    setAttackTarget(null);
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
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("WasShot", this.wasshot);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.wasshot = par1NBTTagCompound.getInteger("WasShot");
  }
  
  public boolean getCanSpawnHere() {
    super.getCanSpawnHere();
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    return true;
  }
}
