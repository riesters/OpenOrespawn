package danger.orespawn;

import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class MyEntityAIDance extends EntityAIBase {
  private Girlfriend thePet;
  
  World theWorld;
  
  public int ticker = 0;
  
  public int dance_move = 0;
  
  public int is_dancing = 0;
  
  public MyEntityAIDance(Girlfriend par1EntityTameable) {
    this.thePet = par1EntityTameable;
    this.theWorld = par1EntityTameable.worldObj;
  }
  
  public boolean is_dance_block(Block bid) {
    if (bid == Blocks.gold_block || bid == Blocks.diamond_block || bid == Blocks.emerald_block || bid == OreSpawnMain.MyBlockRubyBlock || bid == OreSpawnMain.MyBlockAmethystBlock || bid == OreSpawnMain.MyBlockTitaniumBlock || bid == OreSpawnMain.MyBlockUraniumBlock)
      return true; 
    return false;
  }
  
  public boolean shouldExecute() {
    if (this.thePet.isSitting())
      return false; 
    long t = this.theWorld.getWorldTime();
    t %= 24000L;
    if (t < 14000L || t > 22000L)
      return false; 
    int ic = 0, iz = ic, ix = iz;
    for (int i = -3; i < 4; i++) {
      for (int j = -3; j < 4; j++) {
        Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
        if (is_dance_block(bid)) {
          ic++;
          ix += i;
          iz += j;
        } 
      } 
    } 
    if (ic == 0)
      return false; 
    return true;
  }
  
  public boolean continueExecuting() {
    if (this.thePet.isSitting())
      return false; 
    long t = this.theWorld.getWorldTime();
    t %= 24000L;
    if (t < 14000L || t > 22000L)
      return false; 
    int ic = 0, iz = ic, ix = iz;
    for (int i = -3; i < 4; i++) {
      for (int j = -3; j < 4; j++) {
        Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
        if (is_dance_block(bid)) {
          ic++;
          ix += i;
          iz += j;
        } 
      } 
    } 
    if (ic == 0)
      return false; 
    ix /= ic;
    iz /= ic;
    if (ic < 40) {
      this.thePet.getNavigator().tryMoveToXYZ(((int)this.thePet.posX + ix), (int)this.thePet.posY, ((int)this.thePet.posZ + iz), 1.0D);
    } else if (this.theWorld.rand.nextInt(3) == 1) {
      this.thePet.getNavigator().tryMoveToXYZ((int)this.thePet.posX, (int)this.thePet.posY, (int)this.thePet.posZ, 1.0D);
    } 
    this.is_dancing = 1;
    return true;
  }
  
  public void startExecuting() {
    this.thePet.setSneaking(false);
    this.ticker = 0;
    this.dance_move = 0;
    this.is_dancing = 1;
    int ic = 0, iz = ic, ix = iz;
    for (int i = -3; i < 4; i++) {
      for (int j = -3; j < 4; j++) {
        Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
        if (is_dance_block(bid)) {
          ic++;
          ix += i;
          iz += j;
        } 
      } 
    } 
    if (ic > 0) {
      ix /= ic;
      iz /= ic;
      if (ic < 40)
        this.thePet.getNavigator().tryMoveToXYZ(((int)this.thePet.posX + ix), (int)this.thePet.posY, ((int)this.thePet.posZ + iz), 1.0D); 
    } 
  }
  
  public void resetTask() {
    this.thePet.setSneaking(false);
    this.ticker = 0;
    this.dance_move = 0;
    this.is_dancing = 0;
  }
  
  public void updateTask() {
    int cycle = 20;
    int halfc = cycle / 2;
    int mover = cycle * 8;
    int tempid = this.thePet.getEntityId();
    AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(this.thePet.posX - 4.0D, this.thePet.posY - 3.0D, this.thePet.posZ - 4.0D, this.thePet.posX + 4.0D, this.thePet.posY + 3.0D, this.thePet.posZ + 4.0D);
    List var5 = this.theWorld.getEntitiesWithinAABB(Girlfriend.class, bb);
    Iterator<Girlfriend> var2 = var5.iterator();
    while (var2.hasNext()) {
      Girlfriend var3 = var2.next();
      if (var3.getEntityId() < tempid) {
        if (var3.Dance.is_dancing == 1) {
          this.ticker = var3.Dance.ticker;
          this.dance_move = var3.Dance.dance_move;
        } 
        tempid = var3.getEntityId();
      } 
    } 
    this.ticker++;
    if (this.dance_move == 0) {
      this.dance_move = 1 + this.theWorld.rand.nextInt(10);
      this.thePet.motionX = 0.0D;
      this.thePet.motionZ = 0.0D;
      this.ticker = 0;
      this.thePet.setSneaking(false);
    } 
    switch (this.dance_move) {
      case 1:
        move_it(this.thePet, this.ticker, cycle, 0);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 2:
        move_it(this.thePet, this.ticker, cycle, 1);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 3:
        if (this.ticker % cycle < halfc) {
          this.thePet.setSneaking(false);
        } else {
          this.thePet.setSneaking(true);
        } 
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 4:
        if (this.ticker % halfc == 1) {
          this.thePet.swingItem();
          this.thePet.motionY = 0.25D;
        } 
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 5:
        if (this.ticker % halfc == 1)
          this.thePet.swingItem(); 
        move_it(this.thePet, this.ticker, cycle, 0);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 6:
        if (this.ticker % halfc == 1)
          this.thePet.swingItem(); 
        move_it(this.thePet, this.ticker, cycle, 1);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 7:
        if (this.ticker % cycle < halfc) {
          this.thePet.setSneaking(false);
        } else {
          this.thePet.setSneaking(true);
        } 
        move_it(this.thePet, this.ticker, cycle, 0);
        move_it(this.thePet, this.ticker, cycle, 2);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 8:
        if (this.ticker % cycle < halfc) {
          this.thePet.setSneaking(false);
        } else {
          this.thePet.setSneaking(true);
        } 
        move_it(this.thePet, this.ticker, cycle, 1);
        move_it(this.thePet, this.ticker, cycle, 2);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 9:
        if (this.ticker % cycle < halfc) {
          this.thePet.setSneaking(false);
        } else {
          this.thePet.setSneaking(true);
        } 
        if (this.ticker % halfc == 1)
          this.thePet.swingItem(); 
        move_it(this.thePet, this.ticker, cycle, 0);
        move_it(this.thePet, this.ticker, cycle, 3);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
      case 10:
        if (this.ticker % cycle < halfc) {
          this.thePet.setSneaking(false);
          this.thePet.motionY = 0.25D;
        } else {
          this.thePet.setSneaking(true);
        } 
        if (this.ticker % halfc == 1)
          this.thePet.swingItem(); 
        move_it(this.thePet, this.ticker, cycle, 1);
        move_it(this.thePet, this.ticker, cycle, 3);
        if (this.ticker > mover)
          this.dance_move = 0; 
        return;
    } 
    this.dance_move = 0;
  }
  
  private void move_it(EntityTameable et, int t, int cycle, int dir) {
    float dirx = 0.0F, dirz = 0.0F, dirYaw = 0.0F, dirYawH = 0.0F;
    switch (dir) {
      case 0:
        dirx = 0.02F;
        dirz = 0.0F;
        dirYaw = 0.0F;
        dirYawH = 0.0F;
        break;
      case 1:
        dirx = 0.0F;
        dirz = 0.02F;
        dirYaw = 0.0F;
        dirYawH = 0.0F;
        break;
      case 2:
        dirx = 0.0F;
        dirz = 0.0F;
        dirYaw = 10.0F;
        dirYawH = 0.0F;
        break;
      case 3:
        dirx = 0.0F;
        dirz = 0.0F;
        dirYaw = 0.0F;
        dirYawH = 10.0F;
        break;
    } 
    t %= cycle;
    if (t >= cycle / 2) {
      dirx = -dirx;
      dirz = -dirz;
      dirYaw = -dirYaw;
      dirYawH = -dirYawH;
    } 
    t %= cycle / 2;
    if (t >= cycle / 4) {
      dirYaw = -dirYaw;
      dirYawH = -dirYawH;
    } 
    et.motionX += dirx;
    et.motionZ += dirz;
    et.rotationYaw += dirYaw;
    et.rotationYawHead += dirYawH;
  }
}
