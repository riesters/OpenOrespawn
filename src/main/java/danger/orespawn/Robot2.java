package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
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

public class Robot2 extends EntityMob {
  private GenericTargetSorter TargetSorter = null;
  
  private RenderInfo renderdata = new RenderInfo();
  
  private int just_for_fun = 0;
  
  private float moveSpeed = 0.3F;
  
  public Robot2(World par1World) {
    super(par1World);
    setSize(3.0F, 6.2F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 100;
    this.fireResistance = 200;
    this.isImmuneToFire = true;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.renderdata = new RenderInfo();
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 14, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.8999999761581421D, false));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Robot2_stats.attack);
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
    return OreSpawnMain.Robot2_stats.health;
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
    return OreSpawnMain.Robot2_stats.defense;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected void jump() {
    this.motionY += 0.25D;
    super.jump();
  }
  
  protected String getLivingSound() {
    if (this.rand.nextInt(4) == 0)
      return "orespawn:robot_living"; 
    return null;
  }
  
  protected String getHurtSound() {
    return "orespawn:robot_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:robot_death";
  }
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock(Blocks.iron_block);
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
    int var5 = 2 + this.worldObj.rand.nextInt(8);
    int var4;
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Item.getItemFromBlock(Blocks.iron_block), 1); 
    var5 = 5 + this.worldObj.rand.nextInt(6);
    for (var4 = 0; var4 < var5; var4++)
      dropItemRand(Items.iron_ingot, 1); 
    int i = 5 + this.worldObj.rand.nextInt(10);
    for (var4 = 0; var4 < i; var4++) {
      int var3 = this.worldObj.rand.nextInt(15);
      switch (var3) {
        case 0:
          is = dropItemRand(Items.redstone, 1);
          break;
        case 1:
          is = dropItemRand(Items.repeater, 1);
          break;
        case 2:
          is = dropItemRand(Items.comparator, 1);
          break;
        case 3:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 4:
          is = dropItemRand(Item.getItemFromBlock(Blocks.dispenser), 1);
          break;
        case 5:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.sticky_piston), 1);
          break;
        case 6:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.piston), 1);
          break;
        case 7:
          is = dropItemRand(Item.getItemFromBlock(Blocks.lever), 1);
          break;
        case 8:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 9:
          is = dropItemRand(Item.getItemFromBlock(Blocks.light_weighted_pressure_plate), 1);
          break;
      } 
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    return super.attackEntityAsMob(par1Entity);
  }
  
  protected void destroyBlock(EntityLivingBase e) {
    double x = e.posX + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat();
    double y = e.posY - 1.0D;
    double z = e.posZ + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat();
    Block bid = this.worldObj.getBlock((int)x, (int)y, (int)z);
    if (bid == Blocks.obsidian)
      return; 
    if (bid == Blocks.bedrock)
      return; 
    if (bid == Blocks.quartz_block)
      return; 
    if (bid == Blocks.mob_spawner)
      return; 
    if (bid == Blocks.redstone_block)
      return; 
    if (bid == Blocks.iron_block)
      return; 
    if (bid == Blocks.chest)
      return; 
    if (bid != Blocks.air && 
      this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
      this.worldObj.setBlock((int)x, (int)y, (int)z, Blocks.air); 
  }
  
  protected void destroyNearbyBlocks() {
    for (int i = 0; i < 50; i++) {
      double x = this.posX + this.worldObj.rand.nextFloat() * 6.5D - this.worldObj.rand.nextFloat() * 6.5D;
      double y = this.posY + 0.1D + this.worldObj.rand.nextFloat() * 8.5D;
      double z = this.posZ + this.worldObj.rand.nextFloat() * 6.5D - this.worldObj.rand.nextFloat() * 6.5D;
      Block bid = this.worldObj.getBlock((int)x, (int)y, (int)z);
      if (bid != Blocks.obsidian && 
        bid != Blocks.bedrock && 
        bid != Blocks.quartz_block && 
        bid != Blocks.mob_spawner && 
        bid != Blocks.redstone_block && 
        bid != Blocks.iron_block && 
        bid != Blocks.chest)
        if (bid != Blocks.air && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)x, (int)y, (int)z, Blocks.air);  
    } 
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.rand.nextInt(6) == 1 && OreSpawnMain.PlayNicely == 0) {
      EntityLivingBase e = null;
      if (this.worldObj.rand.nextInt(50) == 1)
        setAttackTarget(null); 
      e = getAttackTarget();
      if (e != null && !e.isEntityAlive()) {
        setAttackTarget(null);
        e = null;
      } 
      if (e == null)
        e = findSomethingToAttack(); 
      if (e != null) {
        double rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
        double rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
        double pi = 3.1415926545D;
        double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
        if (rdd > pi)
          rdd -= pi * 2.0D; 
        rdd = Math.abs(rdd);
        faceEntity((Entity)e, 10.0F, 10.0F);
        if (rdd < 1.25D) {
          if (getDistanceSqToEntity((Entity)e) < ((5.0F + e.width / 2.0F) * (5.0F + e.width / 2.0F))) {
            setAttacking(1);
            if (this.worldObj.rand.nextInt(5) == 0 || this.worldObj.rand.nextInt(6) == 1) {
              attackEntityAsMob((Entity)e);
              for (int i = 0; i < 6; ) {
                destroyBlock(e);
                i++;
              } 
            } 
            destroyNearbyBlocks();
          } 
        } else {
          setAttacking(0);
        } 
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.0D);
      } else {
        setAttacking(0);
      } 
    } 
    if (getAttacking() == 0 && OreSpawnMain.PlayNicely == 0) {
      if (this.worldObj.rand.nextInt(450) == 1)
        this.just_for_fun = 50; 
      if (this.just_for_fun > 0)
        this.just_for_fun--; 
      if (this.just_for_fun > 0) {
        setAttacking(1);
        if (this.worldObj.rand.nextInt(3) == 1)
          destroyNearbyBlocks(); 
      } else {
        setAttacking(0);
      } 
    } 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      ret = super.attackEntityFrom(par1DamageSource, par2);
      Entity e = par1DamageSource.getEntity();
      if (e != null && e instanceof EntityLiving) {
        setAttackTarget((EntityLivingBase)e);
        setTarget(e);
        getNavigator().tryMoveToEntityLiving(e, 1.2D);
      } 
      return ret;
    } 
    return false;
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
    if (par1EntityLiving instanceof EntityMob)
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
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(14.0D, 3.0D, 14.0D));
    Collections.sort(var5, this.TargetSorter);
    Iterator<?> var2 = var5.iterator();
    while (var2.hasNext()) {
      Entity var3 = (Entity)var2.next();
      EntityLivingBase var4 = (EntityLivingBase)var3;
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
              s.equals("Robo-Pounder"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    for (k = -1; k < 1; k++) {
      for (int j = -1; j <= 1; j++) {
        for (int i = 1; i < 6; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid != Blocks.air && bid != Blocks.tallgrass)
            return false; 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    return true;
  }
}
