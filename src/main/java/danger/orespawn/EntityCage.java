package danger.orespawn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCage extends EntityThrowable {
  private float my_rotation = 0.0F;
  
  public int my_index = 160;
  
  private World throwerWorld = null;
  
  private EntityPlayer thrower = null;
  
  public EntityCage(World par1World) {
    super(par1World);
    this.throwerWorld = par1World;
  }
  
  public EntityCage(World par1World, int i) {
    super(par1World);
    this.throwerWorld = par1World;
    this.my_index = i;
  }
  
  public EntityCage(World par1World, EntityPlayer par2EntityLiving, int i) {
    super(par1World, (EntityLivingBase)par2EntityLiving);
    this.throwerWorld = par1World;
    this.thrower = par2EntityLiving;
    this.my_index = i;
    if (this.thrower.worldObj != null)
      this.throwerWorld = this.thrower.worldObj; 
  }
  
  public int getCageIndex() {
    return this.my_index;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null && this.rand.nextInt(10) >= 2) {
      if (this.throwerWorld != null) {
        for (int var3 = 0; var3 < 4; var3++) {
          this.throwerWorld.spawnParticle("smoke", par1MovingObjectPosition.entityHit.posX, par1MovingObjectPosition.entityHit.posY + 0.25D, par1MovingObjectPosition.entityHit.posZ, 0.0D, 0.0D, 0.0D);
          this.throwerWorld.spawnParticle("explode", par1MovingObjectPosition.entityHit.posX, par1MovingObjectPosition.entityHit.posY + 0.25D, par1MovingObjectPosition.entityHit.posZ, 0.0D, 0.0D, 0.0D);
          this.throwerWorld.spawnParticle("reddust", par1MovingObjectPosition.entityHit.posX, par1MovingObjectPosition.entityHit.posY + 0.25D, par1MovingObjectPosition.entityHit.posZ, 0.0D, 0.0D, 0.0D);
        } 
        if (this.thrower != null)
          this.throwerWorld.playSoundAtEntity((Entity)this.thrower, "random.explode", 1.0F, 1.5F); 
      } 
      if (par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
        if (!this.worldObj.isRemote) {
          dropItem(OreSpawnMain.CageEmpty, 1);
          setDead();
        } 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof SpiderDriver) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSpiderDriver, 1);
      } else if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntitySpider) {
        if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityCaveSpider) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedCaveSpider, 1);
        } else {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedSpider, 1);
        } 
      } 
      if (par1MovingObjectPosition.entityHit instanceof Crab) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCrab, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityBat) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBat, 2);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityPig) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedPig, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntitySquid) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSquid, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityChicken) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedChicken, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityCreeper) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCreeper, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityHorse) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedHorse, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EntitySkeleton) {
        EntitySkeleton sk = (EntitySkeleton)par1MovingObjectPosition.entityHit;
        if (sk.getSkeletonType() != 0) {
          dropItem(OreSpawnMain.CagedWitherSkeleton, 1);
        } else {
          dropItem(OreSpawnMain.CagedSkeleton, 1);
        } 
        par1MovingObjectPosition.entityHit.setDead();
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityZombie)
        if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityPigZombie) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedZombiePigman, 1);
        } else {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedZombie, 1);
        }  
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntitySlime)
        if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityMagmaCube) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedMagmaCube, 1);
        } else {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedSlime, 1);
        }  
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityGhast) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedGhast, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityEnderman) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEnderman, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntitySilverfish) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSilverfish, 2);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityWitch) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedWitch, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntitySheep) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSheep, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityWolf) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedWolf, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityOcelot) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedOcelot, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityBlaze) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBlaze, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Girlfriend) {
        Girlfriend gf = (Girlfriend)par1MovingObjectPosition.entityHit;
        if (!gf.isTamed()) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedGirlfriend, 1);
        } 
      } 
      if (par1MovingObjectPosition.entityHit instanceof Boyfriend) {
        Boyfriend gf = (Boyfriend)par1MovingObjectPosition.entityHit;
        if (!gf.isTamed()) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedBoyfriend, 1);
        } 
      } 
      if (par1MovingObjectPosition.entityHit instanceof EntityDragon) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        EntityDragon dr = (EntityDragon)par1MovingObjectPosition.entityHit;
        dr.setDead();
        dropItem(OreSpawnMain.CagedEnderDragon, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EntityDragonPart) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        EntityDragonPart dp = (EntityDragonPart)par1MovingObjectPosition.entityHit;
        EntityDragon dr = (EntityDragon)dp.entityDragonObj;
        dr.setDead();
        dropItem(OreSpawnMain.CagedEnderDragon, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntitySnowman) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSnowGolem, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.monster.EntityIronGolem) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedIronGolem, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.boss.EntityWither) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedWitherBoss, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CrystalCow) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCrystalCow, 1);
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof EnchantedCow) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEnchantedCow, 1);
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof GoldCow) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedGoldCow, 1);
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof RedCow) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedRedCow, 1);
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityCow) {
        if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityMooshroom) {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedMooshroom, 1);
        } else {
          par1MovingObjectPosition.entityHit.setDead();
          dropItem(OreSpawnMain.CagedCow, 1);
        } 
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.passive.EntityVillager) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedVillager, 1);
        if (!this.worldObj.isRemote)
          setDead(); 
        return;
      } 
      if (par1MovingObjectPosition.entityHit instanceof Mothra) {
        if (this.rand.nextInt(10) < 4) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedMOTHRA, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Alosaurus) {
        if (this.rand.nextInt(10) < 4) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedAlo, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Cryolophosaurus) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCryo, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Camarasaurus) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCama, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof VelocityRaptor) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedVelo, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Hydrolisc) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedHydro, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Basilisk) {
        if (this.rand.nextInt(10) < 6) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBasil, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Dragonfly) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedDragonfly, 2);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EmperorScorpion) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEmperorScorpion, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Cephadrome) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCephadrome, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Dragon) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedDragon, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Scorpion) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedScorpion, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CaveFisher) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCaveFisher, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Spyro) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSpyro, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Baryonyx) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBaryonyx, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof GammaMetroid) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedGammaMetroid, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Cockateil) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCockateil, 4);
      } 
      if (par1MovingObjectPosition.entityHit instanceof AttackSquid) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedAttackSquid, 6);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Kyuubi) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedKyuubi, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof WaterDragon) {
        if (this.rand.nextInt(10) < 6) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedWaterDragon, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Kraken) {
        if (this.rand.nextInt(100) < 95) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedKraken, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Lizard) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedLizard, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Alien) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedAlien, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Bee) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBee, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Firefly) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedFirefly, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Chipmunk) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedChipmunk, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Gazelle) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedGazelle, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Ostrich) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedOstrich, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof TrooperBug) {
        if (this.rand.nextInt(10) < 6) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedTrooper, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof SpitBug) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSpit, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof StinkBug) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedStink, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CreepingHorror) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCreepingHorror, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof TerribleTerror) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedTerribleTerror, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CliffRacer) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCliffRacer, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Triffid) {
        if (this.rand.nextInt(10) < 6) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedTriffid, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof PitchBlack) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedPitchBlack, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof LurkingTerror) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedLurkingTerror, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof WormSmall) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSmallWorm, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof WormMedium) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedMediumWorm, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Cassowary) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCassowary, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CloudShark) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCloudShark, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof GoldFish) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedGoldFish, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof LeafMonster) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedLeafMonster, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof WormLarge) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedLargeWorm, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EnderKnight) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEnderKnight, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EnderReaper) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEnderReaper, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Beaver) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBeaver, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Urchin) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedUrchin, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Flounder) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedFlounder, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Skate) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSkate, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Rotator) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedRotator, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Peacock) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedPeacock, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Fairy) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedFairy, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof DungeonBeast) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedDungeonBeast, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Vortex) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedVortex, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Rat) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedRat, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Whale) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedWhale, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Irukandji) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedIrukandji, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Stinky) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedStinky, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Mantis) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedMantis, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof TRex) {
        if (this.rand.nextInt(10) < 4) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedTRex, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof HerculesBeetle) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedHercules, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof EasterBunny) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedEasterBunny, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof CaterKiller) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCaterKiller, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Molenoid) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedMolenoid, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof SeaMonster) {
        if (this.rand.nextInt(10) < 3) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSeaMonster, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof SeaViper) {
        if (this.rand.nextInt(10) < 4) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedSeaViper, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof RubberDucky) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedRubberDucky, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Leon) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedLeon, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Hammerhead) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedHammerhead, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof BandP) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCriminal, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Cricket) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedCricket, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Frog) {
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedFrog, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Brutalfly) {
        if (this.rand.nextInt(10) < 5) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedBrutalfly, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Nastysaurus) {
        if (this.rand.nextInt(10) < 7) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedNastysaurus, 1);
      } 
      if (par1MovingObjectPosition.entityHit instanceof Pointysaurus) {
        if (this.rand.nextInt(10) < 2) {
          if (!this.worldObj.isRemote) {
            dropItem(OreSpawnMain.CageEmpty, 1);
            setDead();
          } 
          return;
        } 
        par1MovingObjectPosition.entityHit.setDead();
        dropItem(OreSpawnMain.CagedPointysaurus, 1);
      } 
    } else if (!this.worldObj.isRemote) {
      dropItem(OreSpawnMain.CageEmpty, 1);
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.my_rotation += 20.0F;
    while (this.my_rotation > 360.0F)
      this.my_rotation -= 360.0F; 
    this.rotationPitch = this.prevRotationPitch = this.my_rotation;
  }
}
