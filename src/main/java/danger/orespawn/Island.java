package danger.orespawn;

import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Island extends EntityAnimal {
  private float dir = 0.0F;
  
  private float speed = 0.1F;
  
  private int radius = 5;
  
  private int depth = 3;
  
  private int timer = 73;
  
  private int just_spawned = 1;
  
  private int ticker = 0;
  
  private int once = 1;
  
  private double myX;
  
  private double myY;
  
  private double myZ;
  
  private int dirchange;
  
  public Island(World par1World) {
    super(par1World);
    setSize(0.5F, 0.5F);
    this.ticker = par1World.rand.nextInt(50);
    this.dirchange = this.worldObj.rand.nextInt(2500);
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.motionX = this.motionY = this.motionZ = 0.0D;
    if (this.worldObj.isRemote)
      return; 
    if (this.once != 0) {
      this.myX = this.posX;
      this.myY = this.posY;
      this.myZ = this.posZ;
      this.once = 0;
    } 
    if (this.just_spawned != 0) {
      this.dir = this.worldObj.rand.nextFloat() * 3.1415927F;
      if (this.worldObj.rand.nextInt(2) == 1)
        this.dir *= -1.0F; 
      if (this.worldObj.rand.nextInt(40) != 1) {
        this.radius = 3 + this.worldObj.rand.nextInt(4);
        this.depth = 2 + this.worldObj.rand.nextInt(3);
        this.speed = this.worldObj.rand.nextFloat() / 50.0F * OreSpawnMain.IslandSpeedFactor;
      } else {
        this.radius = 6 + this.worldObj.rand.nextInt(5);
        this.depth = 3 + this.worldObj.rand.nextInt(4);
        this.speed = this.worldObj.rand.nextFloat() / 200.0F * OreSpawnMain.IslandSpeedFactor;
      } 
      create_island();
      this.ticker = this.worldObj.rand.nextInt(50);
      this.dirchange = this.worldObj.rand.nextInt(10000);
    } 
    this.ticker++;
    if (this.ticker >= this.timer) {
      update_island();
      this.ticker = 0;
    } 
    this.dirchange--;
    if (this.dirchange <= 0) {
      this.dirchange = this.worldObj.rand.nextInt(5000);
      this.dir = this.worldObj.rand.nextFloat() * 3.1415927F;
      if (this.worldObj.rand.nextInt(2) == 1)
        this.dir *= -1.0F; 
    } 
    this.just_spawned = 0;
  }
  
  public void onLivingUpdate() {
    if (this.worldObj.isRemote)
      super.onLivingUpdate(); 
  }
  
  protected void updateAITick() {}
  
  protected void updateAITasks() {}
  
  protected void fall(float par1) {}
  
  protected boolean canDespawn() {
    return false;
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.just_spawned = par1NBTTagCompound.getInteger("JustSpawned");
    this.depth = par1NBTTagCompound.getInteger("Idepth");
    this.radius = par1NBTTagCompound.getInteger("Iradius");
    this.speed = par1NBTTagCompound.getFloat("Ispeed");
    this.dir = par1NBTTagCompound.getFloat("Idir");
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("JustSpawned", this.just_spawned);
    par1NBTTagCompound.setInteger("Idepth", this.depth);
    par1NBTTagCompound.setInteger("Iradius", this.radius);
    par1NBTTagCompound.setFloat("Ispeed", this.speed);
    par1NBTTagCompound.setFloat("Idir", this.dir);
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
  
  private void create_island() {
    double deltadir = 0.10471975333333333D;
    double deltamag = 0.3499999940395355D;
    int ixlast = 0, izlast = 0;
    int xoff = 0;
    int zoff = 0;
    for (int i = 0; i < this.depth; i++) {
      ixlast = izlast = 0;
      double curdir;
      for (curdir = -3.1415926D; curdir < 3.1415926D; curdir += deltadir) {
        double tradius = this.radius;
        tradius /= (i + 1);
        double h;
        for (h = 0.75D; h < tradius; h += deltamag) {
          int ix = (int)(this.posX + Math.cos(curdir + this.dir) * h);
          int iz = (int)(this.posZ + Math.sin(curdir + this.dir) * h);
          if (ix != ixlast || iz != izlast) {
            ixlast = ix;
            izlast = iz;
            if (i == 0) {
              Block bid;
              if ((bid = this.worldObj.getBlock(ix, (int)this.posY - i + 1, iz)) == Blocks.air) {
                if (this.worldObj.rand.nextInt(5000) == 1) {
                  this.worldObj.setBlock(ix, (int)this.posY - i + 1, iz, Blocks.lava);
                } else {
                  FastSetBlock(ix, (int)this.posY - i + 1, iz, (Block)Blocks.mycelium);
                  if (this.worldObj.rand.nextInt(20) == 1 && 
                    this.worldObj.getBlock(ix, (int)this.posY - i + 2, iz) == Blocks.air)
                    if (this.worldObj.rand.nextInt(2) == 1) {
                      this.worldObj.setBlock(ix, (int)this.posY - i + 2, iz, (Block)Blocks.brown_mushroom);
                    } else {
                      this.worldObj.setBlock(ix, (int)this.posY - i + 2, iz, (Block)Blocks.red_mushroom);
                    }  
                } 
              } else if (bid == Blocks.bedrock) {
                setDead();
                return;
              } 
            } else if (this.worldObj.rand.nextInt(10) == 1) {
              FastSetBlock(ix, (int)this.posY - i + 1, iz, Blocks.diamond_ore);
            } else {
              FastSetBlock(ix, (int)this.posY - i + 1, iz, Blocks.end_stone);
            } 
          } 
        } 
      } 
    } 
    if (this.posX < 0.0D)
      xoff = -1; 
    if (this.posZ < 0.0D)
      zoff = -1; 
    this.worldObj.setBlock((int)this.posX + xoff, (int)this.posY, (int)this.posZ + zoff, Blocks.air);
    FastSetBlock((int)this.posX + xoff, (int)this.posY, (int)this.posZ + zoff, Blocks.air);
  }
  
  private void update_island() {
    double deltadir = 0.10471975333333333D;
    double deltamag = 0.3499999940395355D;
    double pi2 = 1.57079632675D;
    int ixlast = 0, izlast = 0;
    int xoff = 0;
    int zoff = 0;
    this.myX += this.speed * Math.cos(this.dir);
    this.myZ += this.speed * Math.sin(this.dir);
    int mx = (int)this.myX, mz = (int)this.myZ;
    int px = (int)this.posX, pz = (int)this.posZ;
    if (mx != px || mz != pz) {
      int i;
      for (i = 0; i < this.depth; i++) {
        ixlast = izlast = 0;
        double curdir;
        for (curdir = -3.3D; curdir < 3.3D; curdir += deltadir / 2.0D) {
          double tradius = this.radius;
          tradius /= (i + 1);
          double h;
          for (h = 0.75D; h < tradius;)
            h += deltamag; 
          h -= deltamag;
          if (h < 0.75D)
            h = 0.75D; 
          for (; h < tradius + deltamag; h += deltamag / 2.0D) {
            int ix = (int)(this.posX + Math.cos(curdir + this.dir) * h);
            int iz = (int)(this.posZ + Math.sin(curdir + this.dir) * h);
            if (ix != ixlast || iz != izlast) {
              ixlast = ix;
              izlast = iz;
              if (i == 0) {
                Block bid = this.worldObj.getBlock(ix, (int)this.posY + 1 + 1, iz);
                if (bid == Blocks.red_mushroom || bid == Blocks.brown_mushroom)
                  FastSetBlock(ix, (int)this.posY + 1 + 1, iz, Blocks.air); 
              } 
              FastSetBlock(ix, (int)this.posY - i + 1, iz, Blocks.air);
            } 
          } 
        } 
      } 
      if (this.posX < 0.0D)
        xoff = -1; 
      if (this.posZ < 0.0D)
        zoff = -1; 
      this.worldObj.setBlock((int)this.posX + xoff, (int)this.posY, (int)this.posZ + zoff, Blocks.end_stone);
      this.posX = (int)this.myX;
      if (this.myX < 0.0D) {
        this.posX -= 0.5D;
      } else {
        this.posX += 0.5D;
      } 
      this.posZ = (int)this.myZ;
      if (this.myZ < 0.0D) {
        this.posZ -= 0.5D;
      } else {
        this.posZ += 0.5D;
      } 
      for (i = 0; i < this.depth; i++) {
        ixlast = izlast = 0;
        double curdir;
        for (curdir = -3.1415926D; curdir < 3.1415926D; curdir += deltadir) {
          double tradius = this.radius;
          tradius /= (i + 1);
          double h;
          for (h = 0.75D; h < tradius;)
            h += deltamag; 
          h -= deltamag * 3.0D;
          if (h < 0.75D)
            h = 0.75D; 
          for (; h < tradius; h += deltamag) {
            int ix = (int)(this.posX + Math.cos(curdir + this.dir) * h);
            int iz = (int)(this.posZ + Math.sin(curdir + this.dir) * h);
            if (ix != ixlast || iz != izlast) {
              ixlast = ix;
              izlast = iz;
              if (i == 0) {
                Block bid;
                if ((bid = this.worldObj.getBlock(ix, (int)this.posY - i + 1, iz)) == Blocks.air) {
                  if (this.worldObj.rand.nextInt(5000) == 1) {
                    this.worldObj.setBlock(ix, (int)this.posY - i + 1, iz, Blocks.lava);
                  } else {
                    FastSetBlock(ix, (int)this.posY - i + 1, iz, (Block)Blocks.mycelium);
                    if (this.worldObj.rand.nextInt(20) == 1 && 
                      this.worldObj.getBlock(ix, (int)this.posY - i + 2, iz) == Blocks.air)
                      if (this.worldObj.rand.nextInt(2) == 1) {
                        this.worldObj.setBlock(ix, (int)this.posY - i + 2, iz, (Block)Blocks.brown_mushroom);
                      } else {
                        this.worldObj.setBlock(ix, (int)this.posY - i + 2, iz, (Block)Blocks.red_mushroom);
                      }  
                  } 
                } else if (bid == Blocks.bedrock) {
                  setDead();
                  return;
                } 
              } else {
                Block bid = this.worldObj.getBlock(ix, (int)this.posY - i + 1, iz);
                if (bid == Blocks.stone) {
                  if (!this.worldObj.isRemote)
                    this.worldObj.createExplosion((Entity)this, ix, this.posY - i + 1.0D, iz, 5.0F, true); 
                } else if (this.worldObj.rand.nextInt(10) == 1) {
                  FastSetBlock(ix, (int)this.posY - i + 1, iz, Blocks.diamond_ore);
                } else {
                  FastSetBlock(ix, (int)this.posY - i + 1, iz, Blocks.end_stone);
                } 
              } 
            } 
          } 
        } 
      } 
      xoff = 0;
      if (this.posX < 0.0D)
        xoff = -1; 
      zoff = 0;
      if (this.posZ < 0.0D)
        zoff = -1; 
      this.worldObj.setBlock((int)this.posX + xoff, (int)this.posY, (int)this.posZ + zoff, Blocks.air);
      FastSetBlock((int)this.posX + xoff, (int)this.posY, (int)this.posZ + zoff, Blocks.air);
    } 
    if (this.worldObj.rand.nextInt(2 + 2000 / this.timer) == 1) {
      AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(this.posX - 10.0D, this.posY - 5.0D, this.posZ - 10.0D, this.posX + 10.0D, this.posY + 5.0D, this.posZ + 10.0D);
      List var5 = this.worldObj.getEntitiesWithinAABB(Triffid.class, bb);
      Iterator var2 = var5.iterator();
      if (!var2.hasNext()) {
        EntityCreature newent = (EntityCreature)spawnCreature(this.worldObj, "Triffid", this.posX, this.posY + 2.01D, this.posZ);
      }
    } 
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
  
  protected Item getDropItem() {
    return Item.getItemFromBlock(OreSpawnMain.MyIslandBlock);
  }
  
  public void FastSetBlock(int ix, int iy, int iz, Block id) {
    OreSpawnMain.setBlockFast(this.worldObj, ix, iy, iz, id, 0, 3);
  }
}
