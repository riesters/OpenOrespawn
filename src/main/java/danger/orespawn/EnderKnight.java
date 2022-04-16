package danger.orespawn;

import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EnderKnight extends EntityMob {
  private static final UUID attackingSpeedBoostModifierUUID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
  
  private static final AttributeModifier attackingSpeedBoostModifier = (new AttributeModifier(attackingSpeedBoostModifierUUID, "Attacking speed boost", 6.199999809265137D, 0)).setSaved(false);
  
  private int teleportDelay;
  
  private int stareTimer;
  
  private Entity lastEntityToAttack;
  
  public EnderKnight(World par1World) {
    super(par1World);
    setSize(0.6F, 2.9F);
    this.stepHeight = 1.0F;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(OreSpawnMain.EnderKnight_stats.health);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.32D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.EnderKnight_stats.attack);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, new Byte((byte)0));
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
  }
  
  protected Entity findPlayerToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 64.0D);
    if (entityplayer != null) {
      if (shouldAttackPlayer(entityplayer)) {
        if (this.stareTimer == 0)
          this.worldObj.playSoundAtEntity((Entity)entityplayer, "mob.endermen.stare", 1.0F, 1.0F); 
        if (this.stareTimer++ == 5)
          this.stareTimer = 0; 
        setScreaming(true);
        return (Entity)entityplayer;
      } 
      this.stareTimer = 0;
      setScreaming(false);
    } 
    return null;
  }
  
  private boolean shouldAttackPlayer(EntityPlayer par1EntityPlayer) {
    ItemStack itemstack = par1EntityPlayer.inventory.armorInventory[3];
    if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.pumpkin))
      return false; 
    Vec3 vec3 = par1EntityPlayer.getLook(1.0F).normalize();
    Vec3 vec31 = Vec3.createVectorHelper(this.posX - par1EntityPlayer.posX, this.boundingBox.minY + (this.height / 2.0F) - par1EntityPlayer.posY + par1EntityPlayer.getEyeHeight(), this.posZ - par1EntityPlayer.posZ);
    double d0 = vec31.lengthVector();
    vec31 = vec31.normalize();
    double d1 = vec3.dotProduct(vec31);
    return (d1 > 1.0D - 0.025D / d0) ? par1EntityPlayer.canEntityBeSeen((Entity)this) : false;
  }
  
  public void onLivingUpdate() {
    if (isWet())
      attackEntityFrom(DamageSource.drown, 1.0F); 
    if (this.lastEntityToAttack != this.entityToAttack) {
      IAttributeInstance attributeinstance = getEntityAttribute(SharedMonsterAttributes.movementSpeed);
      attributeinstance.removeModifier(attackingSpeedBoostModifier);
      if (this.entityToAttack != null)
        attributeinstance.applyModifier(attackingSpeedBoostModifier); 
    } 
    this.lastEntityToAttack = this.entityToAttack;
    for (int i = 0; i < 2; i++)
      this.worldObj.spawnParticle("portal", this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D); 
    if (this.worldObj.isDaytime() && !this.worldObj.isRemote) {
      float f = getBrightness(1.0F);
      if (f > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
        this.entityToAttack = null;
        setScreaming(false);
        teleportRandomly();
      } 
    } 
    if (isWet() || isBurning()) {
      setScreaming(false);
      teleportRandomly();
    } 
    this.isJumping = false;
    if (this.entityToAttack != null)
      faceEntity(this.entityToAttack, 100.0F, 100.0F); 
    if (!this.worldObj.isRemote && isEntityAlive())
      if (this.entityToAttack != null) {
        if (this.entityToAttack instanceof EntityPlayer && shouldAttackPlayer((EntityPlayer)this.entityToAttack)) {
          if (this.entityToAttack.getDistanceSqToEntity((Entity)this) < 16.0D)
            teleportRandomly(); 
          this.teleportDelay = 0;
        } else if (this.entityToAttack.getDistanceSqToEntity((Entity)this) > 256.0D && this.teleportDelay++ >= 30 && teleportToEntity(this.entityToAttack)) {
          this.teleportDelay = 0;
        } 
      } else {
        setScreaming(false);
        this.teleportDelay = 0;
      }  
    super.onLivingUpdate();
  }
  
  protected boolean teleportRandomly() {
    double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
    double d1 = this.posY + (this.rand.nextInt(64) - 32);
    double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
    return teleportTo(d0, d1, d2);
  }
  
  protected boolean teleportToEntity(Entity par1Entity) {
    Vec3 vec3 = Vec3.createVectorHelper(this.posX - par1Entity.posX, this.boundingBox.minY + (this.height / 2.0F) - par1Entity.posY + par1Entity.getEyeHeight(), this.posZ - par1Entity.posZ);
    vec3 = vec3.normalize();
    double d0 = 16.0D;
    double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
    double d2 = this.posY + (this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
    double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
    return teleportTo(d1, d2, d3);
  }
  
  protected boolean teleportTo(double par1, double par3, double par5) {
    double d3 = this.posX;
    double d4 = this.posY;
    double d5 = this.posZ;
    this.posX = par1;
    this.posY = par3;
    this.posZ = par5;
    boolean flag = false;
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.posY);
    int k = MathHelper.floor_double(this.posZ);
    if (this.worldObj.blockExists(i, j, k)) {
      boolean flag1 = false;
      while (!flag1 && j > 0) {
        Block l = this.worldObj.getBlock(i, j - 1, k);
        if (l != Blocks.air && l.getMaterial().blocksMovement()) {
          flag1 = true;
          continue;
        } 
        this.posY--;
        j--;
      } 
      if (flag1) {
        setPosition(this.posX, this.posY, this.posZ);
        if (this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
          flag = true; 
      } 
    } 
    if (!flag) {
      setPosition(d3, d4, d5);
      return false;
    } 
    short short1 = 128;
    for (int lx = 0; lx < short1; lx++) {
      double d6 = lx / (short1 - 1.0D);
      float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
      double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
    } 
    this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
    playSound("mob.endermen.portal", 1.0F, 1.0F);
    return true;
  }
  
  protected String getLivingSound() {
    return isScreaming() ? "mob.endermen.scream" : "mob.endermen.idle";
  }
  
  protected String getHurtSound() {
    return "mob.endermen.hit";
  }
  
  protected String getDeathSound() {
    return "mob.endermen.death";
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.EnderKnight_stats.defense;
  }
  
  protected Item getDropItem() {
    if (this.worldObj.rand.nextInt(2) == 1)
      return Items.ender_eye; 
    return Items.ender_pearl;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    Item j = getDropItem();
    if (j != null) {
      int k = this.rand.nextInt(2 + par2);
      for (int l = 0; l < k; l++)
        dropItem(j, 1); 
    } 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    if (isEntityInvulnerable())
      return false; 
    setScreaming(true);
    if (par1DamageSource instanceof net.minecraft.util.EntityDamageSourceIndirect) {
      for (int i = 0; i < 16; i++) {
        if (teleportRandomly())
          return true; 
      } 
      return super.attackEntityFrom(par1DamageSource, par2);
    } 
    return super.attackEntityFrom(par1DamageSource, par2);
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
              s.equals("Ender Knight"))
              return true; 
          } 
        } 
      } 
    } 
    if (!isValidLightLevel())
      return false; 
    if (this.worldObj.isDaytime() == true)
      return false; 
    if (this.posY < 30.0D)
      return false; 
    return true;
  }
  
  public boolean isScreaming() {
    return (this.dataWatcher.getWatchableObjectByte(18) > 0);
  }
  
  public void setScreaming(boolean par1) {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)(par1 ? 1 : 0)));
  }
}
