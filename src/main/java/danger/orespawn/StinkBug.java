package danger.orespawn;

import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class StinkBug extends EntityAnimal {
  private float moveSpeed = 0.15F;
  
  public StinkBug(World par1World) {
    super(par1World);
    setSize(0.55F, 0.55F);
    this.fireResistance = 10;
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 2;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIMate(this, 1.0D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityPlayer.class, 4.0F, 1.0D, 1.399999976158142D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(8, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
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
  }
  
  protected void updateAITick() {
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    super.updateAITick();
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    if (this.isDead)
      return false; 
    ret = super.attackEntityFrom(par1DamageSource, par2);
    if (getHealth() <= 0.0F || this.isDead) {
      AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(this.posX - 8.0D, this.posY - 5.0D, this.posZ - 8.0D, this.posX + 8.0D, this.posY + 10.0D, this.posZ + 8.0D);
      List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, bb);
      Iterator<EntityLivingBase> var2 = var5.iterator();
      EntityLivingBase var3 = null;
      while (var2.hasNext()) {
        var3 = var2.next();
        if (var3 != null)
          var3.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 0)); 
      } 
    } 
    return ret;
  }
  
  public boolean canBreatheUnderwater() {
    return false;
  }
  
  public int mygetMaxHealth() {
    return 5;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return "orespawn:fart";
  }
  
  protected float getSoundVolume() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    return OreSpawnMain.MyDeadStinkBug;
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
              s.equals("Stink Bug"))
              return true; 
          } 
        } 
      } 
    } 
    if (this.posY < 50.0D)
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
  
  public StinkBug spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new StinkBug(this.worldObj);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Items.fish);
  }
  
  public boolean isBreedingItem(ItemStack par1ItemStack) {
    return (par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple);
  }
}
