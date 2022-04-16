package danger.orespawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityRedAnt extends EntityAnt {
  int attack_delay = 20;
  
  public EntityRedAnt(World par1World) {
    super(par1World);
    setSize(0.2F, 0.2F);
    this.moveSpeed = 0.20000000298023224D;
    this.experienceValue = 1;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142D));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 4, true)); 
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
  }
  
  public int mygetMaxHealth() {
    return 2;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (OreSpawnMain.OreSpawnRand.nextInt(15) != 0)
      return false; 
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return false; 
    boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 1.0F);
    return var4;
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    if (par1EntityPlayer == null)
      return false; 
    if (!(par1EntityPlayer instanceof EntityPlayerMP))
      return false; 
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null && 
      var2.stackSize <= 0) {
      par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
      var2 = null;
    } 
    if (var2 != null)
      return false; 
    if (par1EntityPlayer.dimension != OreSpawnMain.DimensionID2) {
      MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID2, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(OreSpawnMain.DimensionID2), OreSpawnMain.DimensionID2, this.worldObj));
    } else {
      MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(0), 0, this.worldObj));
    } 
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.isDead)
      return; 
    if (this.attack_delay > 0)
      this.attack_delay--; 
    if (this.attack_delay > 0)
      return; 
    this.attack_delay = 20;
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return; 
    if (OreSpawnMain.PlayNicely != 0)
      return; 
    EntityPlayer entityPlayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 1.5D);
    if (entityPlayer != null)
      attackEntityAsMob((Entity)entityPlayer); 
  }
}
