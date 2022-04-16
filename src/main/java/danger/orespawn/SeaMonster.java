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

public class SeaMonster extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.25F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public SeaMonster(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    this.moveSpeed = 0.25F;
    setSize(1.25F, 2.5F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 150;
    this.fireResistance = 30;
    this.isImmuneToFire = false;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.SeaMonster_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
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
    return OreSpawnMain.SeaMonster_stats.health;
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
  
  public int getTotalArmorValue() {
    return OreSpawnMain.SeaMonster_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (isInWater()) {
      this.moveSpeed = 0.55F;
    } else {
      this.moveSpeed = 0.25F;
    } 
  }
  
  public int getSeaMonsterHealth() {
    return (int)getHealth();
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(3) == 0)
      return "orespawn:seamonster_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:seamonster_hit";
  }
  
  protected String getDeathSound() {
    return "orespawn:seamonster_death";
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
    ItemStack is = null;
    dropItemRand(OreSpawnMain.SeaMonsterScale, 1);
    dropItemRand(Items.item_frame, 1);
    int var5 = 9 + this.worldObj.rand.nextInt(6);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.fish, 1); 
    var4 = this.worldObj.rand.nextInt(20);
    switch (var4) {
      case 1:
        is = dropItemRand(Items.iron_ingot, 1);
        break;
      case 3:
        is = dropItemRand(Items.iron_sword, 1);
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
        is = dropItemRand(Items.iron_shovel, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 5:
        is = dropItemRand(Items.iron_pickaxe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 6:
        is = dropItemRand(Items.iron_axe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 7:
        is = dropItemRand(Items.iron_hoe, 1);
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
        break;
      case 8:
        is = dropItemRand((Item)Items.iron_helmet, 1);
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
        is = dropItemRand((Item)Items.iron_chestplate, 1);
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
        is = dropItemRand((Item)Items.iron_leggings, 1);
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
        is = dropItemRand((Item)Items.iron_boots, 1);
        if (this.worldObj.rand.nextInt(6) == 1)
          is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
        if (this.worldObj.rand.nextInt(2) == 1)
          is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
        break;
      case 13:
        dropItemRand(Item.getItemFromBlock(Blocks.iron_block), 1);
        break;
    } 
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (super.attackEntityAsMob(par1Entity)) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        double ks = 0.6D;
        double inair = 0.1D;
        float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
        if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
          inair *= 2.0D; 
        par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
      } 
      return true;
    } 
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (par1DamageSource.getDamageType().equals("cactus"))
      return false; 
    Entity e = par1DamageSource.getEntity();
    if (this.hurt_timer <= 0) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 8;
    } 
    if (e != null && e instanceof EntityLiving) {
      if (e instanceof SeaMonster)
        return false; 
      setAttackTarget((EntityLivingBase)e);
      setTarget(e);
      getNavigator().tryMoveToEntityLiving(e, 1.2D);
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
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (!isInWater() && this.worldObj.rand.nextInt(25) == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      for (int i = 1; i < 12; i++) {
        int j = i;
        if (j > 10)
          j = 10; 
        if (scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, (this.ty - 1), this.tz, 1.33D);
      } else {
        if (this.worldObj.rand.nextInt(40) == 1)
          heal(-1.0F); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(5) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < ((4.0F + e.width / 2.0F) * (4.0F + e.width / 2.0F))) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(120) == 1 && isInWater() && 
      getHealth() < mygetMaxHealth()) {
      playSound("splash", 1.5F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
      heal(1.0F);
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
    if (par1EntityLiving instanceof SeaMonster)
      return false; 
    if (par1EntityLiving instanceof EntityMob)
      return true; 
    if (MyUtils.isAttackableNonMob(par1EntityLiving))
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0D, 4.0D, 16.0D));
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
  
  public boolean getCanSpawnHere() {
    SeaMonster target = null;
    for (int k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Sea Monster"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (this.worldObj.isDaytime())
      return false; 
    if (!isValidLightLevel())
      return false; 
    target = (SeaMonster)this.worldObj.findNearestEntityWithinAABB(SeaMonster.class, this.boundingBox.expand(16.0D, 5.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
}
