package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class WaterDragon extends EntityTameable {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int stream_count = 0;
  
  private int hurt_timer = 0;
  
  private float moveSpeed = 0.25F;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public WaterDragon(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    this.moveSpeed = 0.25F;
    setSize(1.25F, 1.9F);
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 100;
    this.fireResistance = 3;
    this.isImmuneToFire = true;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(2, new MyEntityAIFollowOwner(this, 2.0F, 10.0F, 2.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158D, Items.fish, false));
    this.tasks.addTask(4, new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0D));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(6, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.WaterDragon_stats.attack);
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
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (super.interact(par1EntityPlayer))
      return true; 
    if (var2 != null && var2.getItem() == Items.fish && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.rand.nextInt(3) == 0) {
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
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
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
    if (isTamed() && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
      if (!isSitting()) {
        setSitting(true);
      } else {
        setSitting(false);
      } 
      return true;
    } 
    return false;
  }
  
  protected boolean canDespawn() {
    if (isChild()) {
      func_110163_bv();
      return false;
    } 
    if (isNoDespawnRequired())
      return false; 
    if (isTamed())
      return false; 
    return true;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.WaterDragon_stats.health;
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
    return OreSpawnMain.WaterDragon_stats.defense;
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
  
  public int getWaterDragonHealth() {
    return (int)getHealth();
  }
  
  public int getAttackStrength(Entity par1Entity) {
    int var2 = 4;
    if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
      var2 = 6;
      if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
        var2 = 8;
      } else if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
        var2 = 10;
      } 
    } 
    return var2;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:waterdragon_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:waterdragon_death";
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
    dropItemRand(OreSpawnMain.MyWaterDragonScale, 1);
    dropItemRand(Items.item_frame, 1);
    int var5 = 9 + this.worldObj.rand.nextInt(6);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.fish, 1); 
    var4 = this.worldObj.rand.nextInt(20);
    switch (var4) {
      case 0:
        is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
        break;
      case 1:
        is = dropItemRand(Items.iron_ingot, 1);
        break;
      case 2:
        is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
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
      case 12:
        is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
        break;
      case 13:
        dropItemRand(Item.getItemFromBlock(Blocks.iron_block), 1);
        break;
    } 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.WaterDragon_stats.attack);
    if (var4) {
      if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
        double ks = 1.1D;
        double inair = 0.14D;
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
    if (e != null && e instanceof WaterDragon)
      return false; 
    if (e != null && e instanceof AttackSquid)
      return false; 
    if (e != null && e instanceof WaterBall)
      return false; 
    if (this.hurt_timer <= 0) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      this.hurt_timer = 10;
    } 
    if (e != null && e instanceof EntityLiving) {
      if (e instanceof AttackSquid)
        return false; 
      if (e instanceof WaterDragon)
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
    if (!isInWater() && this.worldObj.rand.nextInt(25) == 0 && !isSitting()) {
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
        if (this.worldObj.rand.nextInt(50) == 1)
          heal(-1.0F); 
        if (getHealth() <= 0.0F) {
          setDead();
          return;
        } 
      } 
    } 
    if (this.worldObj.rand.nextInt(200) == 0)
      setAttackTarget(null); 
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(5) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (getDistanceSqToEntity((Entity)e) < ((4.0F + e.width / 2.0F) * (4.0F + e.width / 2.0F))) {
          setAttacking(1);
          if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1)
            attackEntityAsMob((Entity)e); 
        } else {
          getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
          watercanon(e);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    if (this.worldObj.rand.nextInt(100) == 1 && isInWater() && 
      getHealth() < mygetMaxHealth()) {
      playSound("splash", 1.5F, this.worldObj.rand.nextFloat() * 0.2F + 0.9F);
      heal(1.0F);
    } 
  }
  
  private void watercanon(EntityLivingBase e) {
    double yoff = 1.75D;
    double xzoff = 1.5D;
    if (this.stream_count > 0) {
      setAttacking(2);
      if (this.rand.nextInt(15) == 1) {
        EntitySmallFireball entitySmallFireball = new EntitySmallFireball(this.worldObj, (EntityLivingBase)this, e.posX - this.posX, e.posY + 0.75D - this.posY + yoff, e.posZ - this.posZ);
        entitySmallFireball.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYawHead)), this.rotationYaw, this.rotationPitch);
        this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitySmallFireball);
      } 
      WaterBall var2 = new WaterBall(this.worldObj, e.posX - this.posX, e.posY + 0.75D - this.posY + yoff, e.posZ - this.posZ);
      var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYawHead)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw)), this.rotationYawHead, this.rotationPitch);
      double var3 = e.posX - var2.posX;
      double var5 = e.posY + 0.25D - var2.posY;
      double var7 = e.posZ - var2.posZ;
      float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
      var2.setThrowableHeading(var3, var5 + var9, var7, 1.4F, 5.0F);
      this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)var2);
      this.stream_count--;
    } else {
      setAttacking(0);
    } 
    if (this.stream_count <= 0 && this.rand.nextInt(4) == 1)
      this.stream_count = 8; 
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
    if (par1EntityLiving instanceof WaterDragon)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    if (isTamed())
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    if (MyUtils.isAttackableNonMob(par1EntityLiving))
      return true; 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    if (isChild())
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(14.0D, 4.0D, 14.0D));
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
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Water Dragon"))
              return true; 
          } 
        } 
      } 
    } 
    WaterDragon target = null;
    if (this.posY < 50.0D)
      return false; 
    if (!this.worldObj.isDaytime())
      return false; 
    target = (WaterDragon)this.worldObj.findNearestEntityWithinAABB(WaterDragon.class, this.boundingBox.expand(16.0D, 5.0D, 16.0D), (Entity)this);
    if (target != null)
      return false; 
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return (EntityAgeable)spawnBabyAnimal(entityageable);
  }
  
  public WaterDragon spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    WaterDragon w = new WaterDragon(this.worldObj);
    if (isTamed()) {
      func_152115_b(func_152113_b());
      w.setTamed(true);
    } 
    return w;
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.fish);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
}
