package danger.orespawn;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class OreSpawnTeleporter extends Teleporter {
  private WorldServer world;
  
  private World oldWorld;
  
  private Random random;
  
  private int newdim;
  
  public OreSpawnTeleporter(WorldServer par1WorldServer, int dim, World par2World) {
    super(par1WorldServer);
    this.world = par1WorldServer;
    this.oldWorld = par2World;
    this.random = new Random(par1WorldServer.getSeed());
    this.newdim = dim;
  }
  
  public void placeInPortal(Entity par1Entity, double par2, double par4, double par6, float par8) {
    justPutMe(par1Entity);
  }
  
  public boolean placeInExistingPortal(Entity par1Entity, double par2, double par4, double par6, float par8) {
    justPutMe(par1Entity);
    return true;
  }
  
  public boolean makePortal(Entity par1Entity) {
    return true;
  }
  
  private boolean isGroundBlock(Block bid) {
    if (bid == Blocks.air)
      return false; 
    if (bid == Blocks.dirt)
      return true; 
    if (bid == Blocks.grass)
      return true; 
    if (bid == Blocks.stone)
      return true; 
    if (bid == Blocks.end_stone)
      return true; 
    if (bid == Blocks.netherrack)
      return true; 
    if (bid == Blocks.cobblestone)
      return true; 
    if (bid == Blocks.sand)
      return true; 
    if (bid == Blocks.sandstone)
      return true; 
    if (bid == Blocks.farmland)
      return true; 
    return false;
  }
  
  public boolean justPutMe(Entity par1Entity) {
    int posX = (int)par1Entity.posX;
    int posZ = (int)par1Entity.posZ;
    int posY = 120;
    int found = 0;
    int inarow = 0;
    int airfound = 0;
    for (int i = 0; i < 1000 && found == 0; i++) {
      for (posY = 180; posY > 1; posY--) {
        Block bid = this.world.getBlock(posX, posY + 1, posZ);
        if (bid == Blocks.air || bid == null) {
          inarow = 0;
          bid = this.world.getBlock(posX, posY, posZ);
          if (bid == Blocks.air || bid == null) {
            airfound = 1;
            bid = this.world.getBlock(posX, posY - 1, posZ);
            if (bid != Blocks.air && bid != null) {
              if (this.world.getBlock(posX, posY - 1, posZ).getMaterial().isSolid()) {
                found = 1;
                break;
              } 
              if (bid == Blocks.tallgrass && this.world.getBlock(posX, posY - 2, posZ).getMaterial().isSolid()) {
                found = 1;
                posY--;
              } 
              break;
            } 
          } 
        } else {
          if (isGroundBlock(bid))
            inarow++; 
          if (airfound != 0 && inarow >= 3)
            break; 
        } 
      } 
      if (found == 0) {
        posX = (int)par1Entity.posX + this.world.rand.nextInt(3 + i / 5) - this.world.rand.nextInt(3 + i / 5);
        if (i > 100)
          posX = posX + OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5) - OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5); 
        if (i > 500)
          posX = posX + this.random.nextInt(2 + i / 5) - this.random.nextInt(2 + i / 5); 
        posZ = (int)par1Entity.posZ + this.world.rand.nextInt(3 + i / 5) - this.world.rand.nextInt(3 + i / 5);
        if (i > 100)
          posZ = posZ + OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5) - OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5); 
        if (i > 500)
          posZ = posZ + this.random.nextInt(2 + i / 5) - this.random.nextInt(2 + i / 5); 
        airfound = 0;
        inarow = 0;
      } 
    } 
    if (found == 0) {
      posX = (int)par1Entity.posX;
      posZ = (int)par1Entity.posZ;
      for (posY = 180; posY > 1; posY--) {
        if (Blocks.air == this.world.getBlock(posX, posY + 1, posZ) && Blocks.air == this.world.getBlock(posX, posY, posZ))
          if (Blocks.air != this.world.getBlock(posX, posY - 1, posZ))
            break;  
      } 
    } 
    double oldX = par1Entity.posX;
    double oldY = par1Entity.posY;
    double oldZ = par1Entity.posZ;
    double newX = posX;
    double newZ = posZ;
    double newY = posY;
    if (newX < 0.0D) {
      newX -= 0.5D;
    } else {
      newX += 0.5D;
    } 
    if (newZ < 0.0D) {
      newZ -= 0.5D;
    } else {
      newZ += 0.5D;
    } 
    par1Entity.setLocationAndAngles(newX, newY, newZ, par1Entity.rotationYaw, 0.0F);
    par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
    MinecraftServer minecraftserver = MinecraftServer.getServer();
    WorldServer worldserver = minecraftserver.worldServerForDimension(this.oldWorld.provider.dimensionId);
    WorldServer worldserver1 = minecraftserver.worldServerForDimension(this.newdim);
    if (par1Entity instanceof EntityPlayer) {
      EntityPlayer ep = (EntityPlayer)par1Entity;
      AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(oldX - 24.0D, oldY - 12.0D, oldZ - 24.0D, oldX + 24.0D, oldY + 12.0D, oldZ + 24.0D);
      List var5 = this.oldWorld.getEntitiesWithinAABB(EntityTameable.class, bb);
      Iterator<Entity> var2 = var5.iterator();
      while (var2.hasNext()) {
        Entity var3 = var2.next();
        EntityTameable et = (EntityTameable)var3;
        if (!et.isSitting()) {
          String p1 = ep.getUniqueID().toString();
          String p2 = et.func_152113_b();
          if ((p1 != null && p2 != null && p1.equals(p2)) || et.func_152114_e((EntityLivingBase)ep))
            sendToThisDimension(var3, newX, newY, newZ, (int)ep.rotationYaw); 
        } 
      } 
    } 
    worldserver.resetUpdateEntityTick();
    worldserver1.resetUpdateEntityTick();
    return true;
  }
  
  public void sendToThisDimension(Entity e, double newX, double newY, double newZ, int ro) {
    if (this.oldWorld.isRemote)
      return; 
    e.worldObj.removeEntity(e);
    e.isDead = false;
    e.setLocationAndAngles(newX, newY, newZ, ro, 0.0F);
    e.motionX = e.motionY = e.motionZ = 0.0D;
    e.setWorld((World)this.world);
    Entity var6 = EntityList.createEntityByName(EntityList.getEntityString(e), (World)this.world);
    if (var6 != null) {
      var6.copyDataFrom(e, true);
      var6.setLocationAndAngles(newX, newY, newZ, ro, 0.0F);
      var6.motionX = var6.motionY = var6.motionZ = 0.0D;
      var6.setWorld((World)this.world);
      this.world.spawnEntityInWorld(var6);
    } 
    e.isDead = true;
  }
  
  public void removeStalePortalLocations(long par1) {}
}
