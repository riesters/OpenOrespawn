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
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class Kraken extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private ChunkCoordinates currentFlightTarget = null;
  
  private EntityLivingBase caught = null;
  
  private int newtarget = 0;
  
  private int release = 0;
  
  private int weather_set = 10;
  
  private int long_enough = 3600;
  
  private int call_reinforcements = 0;
  
  private boolean hit_by_player = false;
  
  private int straight_down = 1;
  
  private int hurt_timer = 0;
  
  public Kraken(World par1World) {
    super(par1World);
    if (OreSpawnMain.PlayNicely == 0) {
      setSize(4.0F, 15.0F);
    } else {
      setSize(1.3333334F, 5.0F);
    } 
    getNavigator().setAvoidsWater(false);
    this.experienceValue = 500;
    this.fireResistance = 120;
    this.isImmuneToFire = true;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(1, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3700000047683716D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Kraken_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(21, Integer.valueOf(OreSpawnMain.PlayNicely));
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
  
  public int getPlayNicely() {
    return this.dataWatcher.getWatchableObjectInt(21);
  }
  
  public int mygetMaxHealth() {
    return OreSpawnMain.Kraken_stats.health;
  }
  
  public int getKrakenHealth() {
    return (int)getHealth();
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
    return OreSpawnMain.Kraken_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
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
  
  public void onUpdate() {
    super.onUpdate();
    if (this.isDead)
      return; 
    if (this.currentFlightTarget == null) {
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)(this.posY - 10.0D), (int)this.posZ);
    } else if (this.posY < this.currentFlightTarget.posY) {
      this.motionY *= 0.72D;
    } else {
      this.motionY *= 0.5D;
    } 
    if (this.weather_set > 0 && OreSpawnMain.PlayNicely == 0) {
      this.weather_set--;
      if (this.weather_set == 0 && !this.worldObj.isRemote) {
        WorldInfo worldinfo = this.worldObj.getWorldInfo();
        if (!this.worldObj.isRaining()) {
          worldinfo.setRainTime(300);
          worldinfo.setThunderTime(300);
          worldinfo.setRaining(true);
          worldinfo.setThundering(true);
        } else {
          worldinfo.setRainTime(300);
          worldinfo.setThunderTime(300);
        } 
        this.weather_set = 100;
      } 
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("LongEnough", this.long_enough);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.long_enough = par1NBTTagCompound.getInteger("LongEnough");
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(5) == 0)
      return "orespawn:kraken_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return "orespawn:alo_death";
  }
  
  protected float getSoundVolume() {
    return 2.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Items.quartz;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(8) - OreSpawnMain.OreSpawnRand.nextInt(8), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    ItemStack is = null;
    dropItemRand(OreSpawnMain.MyKrakenTooth, 1);
    dropItemRand(Items.item_frame, 1);
    int var5 = 120 + this.worldObj.rand.nextInt(160);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.dye, 1); 
    int i = 5 + this.worldObj.rand.nextInt(10);
    for (var4 = 0; var4 < i; var4++) {
      EntityItem var33;
      int var3 = this.worldObj.rand.nextInt(53);
      switch (var3) {
        case 0:
          is = dropItemRand(OreSpawnMain.MyUltimateSword, 1);
          break;
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
        case 12:
          is = dropItemRand(OreSpawnMain.MyUltimateBow, 1);
          break;
        case 13:
          is = dropItemRand(OreSpawnMain.MyUltimateAxe, 1);
          break;
        case 14:
          is = dropItemRand(Items.iron_ingot, 1);
          break;
        case 15:
          is = dropItemRand(OreSpawnMain.MyUltimatePickaxe, 1);
          break;
        case 16:
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
        case 17:
          is = dropItemRand(Items.iron_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 18:
          is = dropItemRand(Items.iron_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 19:
          is = dropItemRand(Items.iron_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 20:
          is = dropItemRand(Items.iron_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 21:
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
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 22:
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
        case 23:
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
        case 24:
          is = dropItemRand((Item)Items.iron_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 25:
          is = dropItemRand(OreSpawnMain.MyUltimateShovel, 1);
          break;
        case 26:
          dropItemRand(Item.getItemFromBlock(Blocks.iron_block), 1);
          break;
        case 27:
          is = dropItemRand(Items.gold_nugget, 1);
          break;
        case 28:
          is = dropItemRand(Items.gold_ingot, 1);
          break;
        case 29:
          is = dropItemRand(Items.golden_carrot, 1);
          break;
        case 30:
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
        case 31:
          is = dropItemRand(Items.golden_shovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 32:
          is = dropItemRand(Items.golden_pickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 33:
          is = dropItemRand(Items.golden_axe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 34:
          is = dropItemRand(Items.golden_hoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 35:
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
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 36:
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
        case 37:
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
        case 38:
          is = dropItemRand((Item)Items.golden_boots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 39:
          dropItemRand(Items.golden_apple, 1);
          break;
        case 40:
          dropItemRand(Item.getItemFromBlock(Blocks.gold_block), 1);
          break;
        case 41:
          var33 = null;
          is = new ItemStack(Items.golden_apple, 1, 1);
          var33 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
          if (var33 != null)
            this.worldObj.spawnEntityInWorld((Entity)var33); 
          break;
        case 42:
          is = dropItemRand(OreSpawnMain.MyExperienceSword, 1);
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
        case 43:
          is = dropItemRand((Item)OreSpawnMain.ExperienceHelmet, 1);
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
            is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 44:
          is = dropItemRand((Item)OreSpawnMain.ExperienceBody, 1);
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
        case 45:
          is = dropItemRand((Item)OreSpawnMain.ExperienceLegs, 1);
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
        case 46:
          is = dropItemRand((Item)OreSpawnMain.ExperienceBoots, 1);
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          break;
        case 47:
          is = dropItemRand(OreSpawnMain.MyAmethystSword, 1);
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
        case 48:
          is = dropItemRand(OreSpawnMain.MyAmethystShovel, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 49:
          is = dropItemRand(OreSpawnMain.MyAmethystPickaxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 50:
          is = dropItemRand(OreSpawnMain.MyAmethystAxe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 51:
          is = dropItemRand(OreSpawnMain.MyAmethystHoe, 1);
          if (this.worldObj.rand.nextInt(2) == 1)
            is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4)); 
          if (this.worldObj.rand.nextInt(6) == 1)
            is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5)); 
          break;
        case 52:
          is = dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyBlockAmethystBlock), 1);
          break;
      } 
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  protected boolean canDespawn() {
    if (isNoDespawnRequired())
      return false; 
    if (this.long_enough <= 0)
      return true; 
    if (this.posY > 150.0D && getHealth() < (mygetMaxHealth() / 2))
      return true; 
    if (this.posY > 180.0D && this.long_enough <= 0) {
      setDead();
      return true;
    } 
    return false;
  }
  
  public boolean canSeeTarget(double pX, double pY, double pZ) {
    return (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(this.posX, this.posY + 0.75D, this.posZ), Vec3.createVectorHelper(pX, pY, pZ), false) == null);
  }
  
  protected void updateAITasks() {
    int xdir = 1;
    int zdir = 1;
    int keep_trying = 50;
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.hurt_timer > 0)
      this.hurt_timer--; 
    if (this.long_enough > 0)
      this.long_enough--; 
    this.dataWatcher.updateObject(21, Integer.valueOf(OreSpawnMain.PlayNicely));
    if (this.worldObj.rand.nextInt(400) == 1 && OreSpawnMain.PlayNicely == 0)
      this.worldObj.addWeatherEffect((Entity)new EntityLightningBolt(this.worldObj, this.posX, this.posY - 16.0D, this.posZ)); 
    if (this.currentFlightTarget == null)
      this.currentFlightTarget = new ChunkCoordinates((int)this.posX, (int)this.posY, (int)this.posZ); 
    if (this.newtarget != 0 || this.rand.nextInt(250) == 1 || this.currentFlightTarget.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 9.1F) {
      this.newtarget = 0;
      int ground_dist;
      for (ground_dist = 0; ground_dist < 31; ground_dist++) {
        Block block = this.worldObj.getBlock((int)this.posX, (int)this.posY - ground_dist, (int)this.posZ);
        if (block != Blocks.air) {
          this.straight_down = 0;
          break;
        } 
      } 
      ground_dist = 20 - ground_dist;
      Block bid = Blocks.stone;
      while (bid != Blocks.air && keep_trying != 0) {
        zdir = this.worldObj.rand.nextInt(6) + 12;
        xdir = this.worldObj.rand.nextInt(6) + 12;
        if (this.worldObj.rand.nextInt(2) == 0)
          zdir = -zdir; 
        if (this.worldObj.rand.nextInt(2) == 0)
          xdir = -xdir; 
        if (this.straight_down != 0)
          zdir = xdir = 0; 
        this.currentFlightTarget.set((int)this.posX + xdir, (int)this.posY + ground_dist + this.rand.nextInt(9) - 6, (int)this.posZ + zdir);
        bid = this.worldObj.getBlock(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ);
        if (bid == Blocks.air && 
          !canSeeTarget(this.currentFlightTarget.posX, this.currentFlightTarget.posY, this.currentFlightTarget.posZ))
          bid = Blocks.stone; 
        keep_trying--;
      } 
      if (this.long_enough <= 0 || (this.posY < 200.0D && getHealth() < (mygetMaxHealth() / 4))) {
        this.currentFlightTarget.set(this.currentFlightTarget.posX, this.currentFlightTarget.posY + 30, this.currentFlightTarget.posZ);
        if (this.hit_by_player == true && this.call_reinforcements == 0 && getHealth() < (mygetMaxHealth() / 8) && this.posY > 130.0D) {
          this.call_reinforcements = 1;
          for (int i = 0; i < 10; i++) {
            EntityCreature newent = (EntityCreature)spawnCreature(this.worldObj, "The Kraken", this.posX + this.worldObj.rand.nextInt(10) - this.worldObj.rand.nextInt(10), 170.0D, this.posZ + this.worldObj.rand.nextInt(10) - this.worldObj.rand.nextInt(10));
          }
        } 
      } 
    } else if (this.caught == null && this.worldObj.rand.nextInt(8) == 1 && OreSpawnMain.PlayNicely == 0) {
      EntityPlayer target = null;
      target = (EntityPlayer)this.worldObj.findNearestEntityWithinAABB(EntityPlayer.class, this.boundingBox.expand(25.0D, 40.0D, 25.0D), (Entity)this);
      if (target != null)
        if (!target.capabilities.isCreativeMode) {
          if (getEntitySenses().canSee((Entity)target)) {
            this.currentFlightTarget.set((int)target.posX, (int)target.posY + 15, (int)target.posZ);
            attackWithSomething((EntityLivingBase)target);
          } 
        } else {
          target = null;
        }  
      if (target == null && this.worldObj.rand.nextInt(2) == 0) {
        EntityLivingBase e = null;
        e = findSomethingToAttack();
        if (e != null) {
          this.currentFlightTarget.set((int)e.posX, (int)e.posY + 15, (int)e.posZ);
          attackWithSomething(e);
        } 
      } 
    } 
    if (this.caught != null)
      if (!this.caught.isDead) {
        this.currentFlightTarget.set((int)this.posX, 200, (int)this.posZ);
        if (this.posY > 190.0D)
          this.release = 1; 
        this.caught.motionX = this.motionX;
        this.caught.motionZ = this.motionZ;
        this.caught.motionY = this.motionY;
        this.caught.posX = this.posX;
        if (this.posY - this.caught.posY > 16.0D)
          this.caught.motionY += 0.25D; 
        this.caught.posY = this.posY - 15.0D;
        this.caught.posZ = this.posZ;
        this.caught.rotationYaw = this.rotationYaw;
        if (this.worldObj.rand.nextInt(50) == 1)
          attackEntityAsMob((Entity)this.caught); 
        if (this.release != 0 || this.worldObj.rand.nextInt(250) == 1) {
          this.caught = null;
          this.newtarget = 1;
          this.release = 0;
          setAttacking(0);
        } 
      } else {
        this.caught = null;
        this.newtarget = 1;
        this.release = 0;
        setAttacking(0);
      }  
    double var1 = this.currentFlightTarget.posX + 0.3D - this.posX;
    double var3 = this.currentFlightTarget.posY + 0.1D - this.posY;
    double var5 = this.currentFlightTarget.posZ + 0.3D - this.posZ;
    this.motionX += (Math.signum(var1) * 0.45D - this.motionX) * 0.15D;
    this.motionY += (Math.signum(var3) * 0.70999D - this.motionY) * 0.202D;
    this.motionZ += (Math.signum(var5) * 0.45D - this.motionZ) * 0.15D;
    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
    this.moveForward = 0.4F;
    if (Math.abs(this.motionX) + Math.abs(this.motionZ) < 0.15D)
      var8 = 0.0F; 
    this.rotationYaw += var8 / 5.0F;
    double obstruction_factor = 0.0D;
    double dx = 0.0D, dz = 0.0D;
    int dist = 10;
    for (int k = -20; k < 18; k += 2) {
      for (int i = 1; i < dist; i += 2) {
        dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F)));
        dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F)));
        Block bid = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY + k, (int)(this.posZ + dz));
        if (bid != Blocks.air)
          obstruction_factor += 0.1D; 
      } 
    } 
    this.motionY += obstruction_factor * 0.08D;
    this.posY += obstruction_factor * 0.08D;
    if (this.posY > 256.0D && !isNoDespawnRequired())
      setDead(); 
  }
  
  private void attackWithSomething(EntityLivingBase par1) {
    if (this.caught != null)
      return; 
    double dist = (this.posX - par1.posX) * (this.posX - par1.posX);
    dist += (this.posZ - par1.posZ) * (this.posZ - par1.posZ);
    dist += (this.posY - par1.posY - 15.0D) * (this.posY - par1.posY - 15.0D);
    if (dist < 30.0D) {
      this.caught = par1;
      this.release = 0;
      setAttacking(1);
    } 
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
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      if (p.capabilities.isFlying == true)
        return false; 
      return true;
    } 
    if (!par1EntityLiving.onGround && !par1EntityLiving.isInWater())
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntitySquid)
      return false; 
    if (par1EntityLiving instanceof AttackSquid)
      return false; 
    if (par1EntityLiving instanceof Kraken)
      return false; 
    if (par1EntityLiving instanceof Spyro)
      return false; 
    if (par1EntityLiving instanceof Dragon) {
      Dragon c = (Dragon)par1EntityLiving;
      if (c.riddenByEntity != null)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof Cephadrome) {
      Cephadrome c = (Cephadrome)par1EntityLiving;
      if (c.riddenByEntity != null)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof Leon) {
      Leon c = (Leon)par1EntityLiving;
      if (c.riddenByEntity != null)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof ThePrinceTeen) {
      ThePrinceTeen c = (ThePrinceTeen)par1EntityLiving;
      if (c.riddenByEntity != null)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof ThePrinceAdult) {
      ThePrinceAdult c = (ThePrinceAdult)par1EntityLiving;
      if (c.riddenByEntity != null)
        return false; 
      return true;
    } 
    if (par1EntityLiving instanceof net.minecraft.entity.passive.EntityChicken)
      return false; 
    if (par1EntityLiving instanceof Chipmunk)
      return false; 
    if (par1EntityLiving instanceof StinkBug)
      return false; 
    if (par1EntityLiving instanceof Mothra)
      return false; 
    return true;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(20.0D, 40.0D, 20.0D));
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
  
  public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt) {}
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    Entity e = par1DamageSource.getEntity();
    boolean ret = false;
    if (this.currentFlightTarget != null && e != null && e instanceof EntityPlayer && getHealth() > (mygetMaxHealth() / 4)) {
      this.hit_by_player = true;
      this.currentFlightTarget.set((int)e.posX, (int)e.posY + 15, (int)e.posZ);
    } 
    if (this.hurt_timer > 0)
      return false; 
    this.hurt_timer = 30;
    ret = super.attackEntityFrom(par1DamageSource, par2);
    if (this.worldObj.rand.nextInt(2) == 1)
      this.release = 1; 
    return ret;
  }
  
  public final int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public final void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    for (int k = -1; k < 2; k++) {
      for (int j = -1; j < 1; j++) {
        for (int i = 1; i < 6; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air && bid != Blocks.tallgrass)
            return false; 
        } 
      } 
    } 
    return true;
  }
}
