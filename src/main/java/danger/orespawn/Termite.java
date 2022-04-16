package danger.orespawn;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Termite extends EntityAnt {
  int attack_delay = 20;
  
  private int closest;
  
  private int tx;
  
  private int ty;
  
  private int tz;
  
  public Termite(World par1World) {
    super(par1World);
    this.closest = 99999;
    this.tx = 0;
    this.ty = 0;
    this.tz = 0;
    setSize(0.2F, 0.2F);
    this.moveSpeed = 0.20000000298023224D;
    this.experienceValue = 1;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142D));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false));
    this.tasks.addTask(2, new MyEntityAIWanderALot((EntityCreature)this, 8, 1.0D));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 6, true)); 
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
  }
  
  public int mygetMaxHealth() {
    return 5;
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
    if (var2 != null && var2.stackSize <= 0) {
      par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
      var2 = null;
    } 
    if (var2 != null) {
      par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Empty your hand!"));
      return false;
    } 
    if (par1EntityPlayer.dimension != OreSpawnMain.DimensionID5) {
      int i;
      for (i = 0; i < par1EntityPlayer.inventory.mainInventory.length; i++) {
        if (par1EntityPlayer.inventory.mainInventory[i] != null) {
          par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Empty your inventory!"));
          return false;
        } 
      } 
      for (i = 0; i < par1EntityPlayer.inventory.armorInventory.length; i++) {
        if (par1EntityPlayer.inventory.armorInventory[i] != null) {
          par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Take off your armor!"));
          return false;
        } 
      } 
      MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID5, new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(OreSpawnMain.DimensionID5), OreSpawnMain.DimensionID5, this.worldObj));
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
    EntityPlayer entityPlayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 1.5D);
    if (entityPlayer != null)
      attackEntityAsMob((Entity)entityPlayer); 
  }
  
  public boolean isWood(Block bid) {
    if (bid == Blocks.fence || bid == Blocks.fence_gate || bid == Blocks.planks || bid == Blocks.wooden_slab)
      return true; 
    if (bid == Blocks.double_wooden_slab || bid == Blocks.bed || bid == Blocks.crafting_table)
      return true; 
    if (bid == Blocks.standing_sign || bid == Blocks.bookshelf || bid == Blocks.wooden_door || bid == Blocks.wooden_pressure_plate)
      return true; 
    if (bid == Blocks.birch_stairs || bid == Blocks.oak_stairs || bid == Blocks.jungle_stairs || bid == Blocks.spruce_stairs)
      return true; 
    if (bid == OreSpawnMain.CrystalPlanksBlock)
      return true; 
    return false;
  }
  
  private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) {
    int found = 0;
    int i;
    for (i = -dy; i <= dy; i++) {
      for (int j = -dz; j <= dz; j++) {
        Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
        if (isWood(bid)) {
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
        if (isWood(bid)) {
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
        if (isWood(bid)) {
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
        if (isWood(bid)) {
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
        if (isWood(bid)) {
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
        if (isWood(bid)) {
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
  
  public void updateAITick() {
    if (this.isDead)
      return; 
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.rand.nextInt(200) == 1 && OreSpawnMain.PlayNicely == 0) {
      this.closest = 99999;
      this.tx = this.ty = this.tz = 0;
      int i;
      for (i = 1; i < 8; i++) {
        int j = i;
        if (j > 4)
          j = 4; 
        if (scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i) == true)
          break; 
        if (i >= 5)
          i++; 
      } 
      i = 0;
      if (this.closest < 99999) {
        getNavigator().tryMoveToXYZ(this.tx, this.ty, this.tz, 1.0D);
        if (this.closest < 6) {
          if (this.worldObj.rand.nextInt(3) != 0) {
            if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.dirt, 0, 2); 
            if (findBuddies() < 10)
              spawnCreature(this.worldObj, "Termite", this.posX + 0.10000000149011612D, this.posY + 0.10000000149011612D, this.posZ + 0.10000000149011612D); 
          } else {
            if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
              this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.air, 0, 2); 
            if (findBuddies() < 10)
              spawnCreature(this.worldObj, "Termite", (this.tx + 0.1F), (this.ty + 0.1F), (this.tz + 0.1F)); 
          } 
          heal(1.0F);
        } 
      } 
    } 
    super.updateAITick();
  }
  
  private int findBuddies() {
    List var5 = this.worldObj.getEntitiesWithinAABB(Termite.class, this.boundingBox.expand(3.0D, 3.0D, 3.0D));
    return var5.size();
  }
  
  public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
    Entity var8 = null;
    var8 = EntityList.createEntityByName(par1, par0World);
    if (var8 != null) {
      var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
      par0World.spawnEntityInWorld(var8);
    } 
    return var8;
  }
}
