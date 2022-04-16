package danger.orespawn;

import java.util.List;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityAnt extends EntityAnimal {
  public double moveSpeed = 0.15000000596046448D;
  
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "ant.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "red_ant.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "rainbow_ant.png");
  
  private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "unstableant.png");
  
  private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "termite.png");
  
  public EntityAnt(World par1World) {
    super(par1World);
    setSize(0.1F, 0.1F);
    this.experienceValue = 0;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
    this.tasks.addTask(1, new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0D));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
  }
  
  public ResourceLocation getTexture(EntityAnt a) {
    if (a instanceof EntityRedAnt)
      return texture2; 
    if (a instanceof EntityRainbowAnt)
      return texture3; 
    if (a instanceof EntityUnstableAnt)
      return texture4; 
    if (a instanceof Termite)
      return texture5; 
    return texture1;
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
    if (par1EntityPlayer.dimension != OreSpawnMain.DimensionID) {
      MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(OreSpawnMain.DimensionID), OreSpawnMain.DimensionID, this.worldObj));
    } else {
      MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(0), 0, this.worldObj));
    } 
    return true;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public int mygetMaxHealth() {
    return 1;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  protected float getSoundVolume() {
    return 0.0F;
  }
  
  protected void playStepSound(int par1, int par2, int par3, int par4) {}
  
  protected void dropFewItems(boolean par1, int par2) {}
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public boolean getCanSpawnHere() {
    if (this.posY < 50.0D)
      return false; 
    if (findBuddies() > 4)
      return false; 
    return true;
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(EntityAnt.class, this.boundingBox.expand(20.0D, 10.0D, 20.0D));
    return var5.size();
  }
  
  public void updateAITick() {
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    super.updateAITick();
  }
}
