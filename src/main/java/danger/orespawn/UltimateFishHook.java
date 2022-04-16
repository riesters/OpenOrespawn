package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class UltimateFishHook extends EntityFishHook {
  private static final List field_146039_d = Arrays.asList(new WeightedRandomFishable[] { 
        (new WeightedRandomFishable(new ItemStack((Item)Items.leather_boots), 10)).func_150709_a(0.9F), new WeightedRandomFishable(new ItemStack(Items.leather), 10), new WeightedRandomFishable(new ItemStack(Items.bone), 10), new WeightedRandomFishable(new ItemStack((Item)Items.potionitem), 10), new WeightedRandomFishable(new ItemStack(Items.string), 5), (new WeightedRandomFishable(new ItemStack((Item)Items.fishing_rod), 2)).func_150709_a(0.9F), new WeightedRandomFishable(new ItemStack(Items.bowl), 10), new WeightedRandomFishable(new ItemStack(Items.stick), 5), new WeightedRandomFishable(new ItemStack(Items.dye, 10, 0), 1), new WeightedRandomFishable(new ItemStack((Block)Blocks.tripwire_hook), 10), 
        new WeightedRandomFishable(new ItemStack(Items.rotten_flesh), 10) });
  
  private static final List field_146041_e = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(Blocks.waterlily), 1), new WeightedRandomFishable(new ItemStack(Items.name_tag), 1), new WeightedRandomFishable(new ItemStack(Items.saddle), 1), (new WeightedRandomFishable(new ItemStack((Item)Items.bow), 1)).func_150709_a(0.25F).func_150707_a(), (new WeightedRandomFishable(new ItemStack((Item)Items.fishing_rod), 1)).func_150709_a(0.25F).func_150707_a(), (new WeightedRandomFishable(new ItemStack(Items.book), 1)).func_150707_a() });
  
  private static final List field_146036_f = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(Items.fish, 1, ItemFishFood.FishType.COD.func_150976_a()), 60), new WeightedRandomFishable(new ItemStack(Items.fish, 1, ItemFishFood.FishType.SALMON.func_150976_a()), 25), new WeightedRandomFishable(new ItemStack(Items.fish, 1, ItemFishFood.FishType.CLOWNFISH.func_150976_a()), 2), new WeightedRandomFishable(new ItemStack(Items.fish, 1, ItemFishFood.FishType.PUFFERFISH.func_150976_a()), 13) });
  
  private static final List orespawn_lava_fish = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySunspotUrchin), 25), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyLavaEel), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySunFish), 15), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MySparkFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyFireFish), 15) });
  
  private static final List orespawn_fish = Arrays.asList(new WeightedRandomFishable[] { new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyBlueFish), 25), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyPinkFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyRockFish), 15), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyWoodFish), 10), new WeightedRandomFishable(new ItemStack(OreSpawnMain.MyGreyFish), 15) });
  
  private int field_146037_g;
  
  private int field_146048_h;
  
  private int field_146050_i;
  
  private Block field_146046_j;
  
  private boolean field_146051_au;
  
  private int field_146049_av;
  
  private int field_146047_aw;
  
  private int fish_on_hook;
  
  private int fish_wait_time;
  
  private int ticks_catchable;
  
  private float fish_direction;
  
  public Entity field_146043_c;
  
  private int field_146055_aB;
  
  private double field_146056_aC;
  
  private double field_146057_aD;
  
  private double field_146058_aE;
  
  private double field_146059_aF;
  
  private double field_146060_aG;
  
  @SideOnly(Side.CLIENT)
  private double field_146061_aH;
  
  @SideOnly(Side.CLIENT)
  private double field_146052_aI;
  
  @SideOnly(Side.CLIENT)
  private double field_146053_aJ;
  
  private int fishing_in_lava = 0;
  
  public UltimateFishHook(World par1World) {
    super(par1World);
    this.field_146037_g = -1;
    this.field_146048_h = -1;
    this.field_146050_i = -1;
    setSize(0.25F, 0.25F);
    this.ignoreFrustumCheck = true;
    this.fireResistance = 3000;
    this.isImmuneToFire = true;
  }
  
  @SideOnly(Side.CLIENT)
  public UltimateFishHook(World par1World, double par2, double par4, double par6, EntityPlayer par8EntityPlayer) {
    this(par1World);
    setPosition(par2, par4, par6);
    this.ignoreFrustumCheck = true;
    this.field_146042_b = par8EntityPlayer;
    par8EntityPlayer.fishEntity = this;
    this.fireResistance = 3000;
    this.isImmuneToFire = true;
  }
  
  public UltimateFishHook(World par1World, EntityPlayer par2EntityPlayer) {
    super(par1World);
    this.field_146037_g = -1;
    this.field_146048_h = -1;
    this.field_146050_i = -1;
    this.ignoreFrustumCheck = true;
    this.field_146042_b = par2EntityPlayer;
    this.field_146042_b.fishEntity = this;
    setSize(0.25F, 0.25F);
    setLocationAndAngles(par2EntityPlayer.posX, par2EntityPlayer.posY + 1.62D - par2EntityPlayer.yOffset, par2EntityPlayer.posZ, par2EntityPlayer.rotationYaw, par2EntityPlayer.rotationPitch);
    this.posX -= (MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
    this.posY -= 0.10000000149011612D;
    this.posZ -= (MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
    setPosition(this.posX, this.posY, this.posZ);
    this.yOffset = 0.0F;
    float f = 0.4F;
    this.motionX = (-MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f);
    this.motionZ = (MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f);
    this.motionY = (-MathHelper.sin(this.rotationPitch / 180.0F * 3.1415927F) * f);
    func_146035_c(this.motionX, this.motionY, this.motionZ, 1.5F, 1.0F);
    this.fireResistance = 3000;
    this.isImmuneToFire = true;
  }
  
  protected void entityInit() {
    this.fireResistance = 3000;
    this.isImmuneToFire = true;
  }
  
  public void func_146035_c(double p_146035_1_, double p_146035_3_, double p_146035_5_, float p_146035_7_, float p_146035_8_) {
    float f2 = MathHelper.sqrt_double(p_146035_1_ * p_146035_1_ + p_146035_3_ * p_146035_3_ + p_146035_5_ * p_146035_5_);
    p_146035_1_ /= f2;
    p_146035_3_ /= f2;
    p_146035_5_ /= f2;
    p_146035_1_ += this.rand.nextGaussian() * 0.007499999832361937D * p_146035_8_;
    p_146035_3_ += this.rand.nextGaussian() * 0.007499999832361937D * p_146035_8_;
    p_146035_5_ += this.rand.nextGaussian() * 0.007499999832361937D * p_146035_8_;
    p_146035_1_ *= p_146035_7_;
    p_146035_3_ *= p_146035_7_;
    p_146035_5_ *= p_146035_7_;
    this.motionX = p_146035_1_;
    this.motionY = p_146035_3_;
    this.motionZ = p_146035_5_;
    float f3 = MathHelper.sqrt_double(p_146035_1_ * p_146035_1_ + p_146035_5_ * p_146035_5_);
    this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(p_146035_1_, p_146035_5_) * 180.0D / Math.PI);
    this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(p_146035_3_, f3) * 180.0D / Math.PI);
    this.field_146049_av = 0;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean isInRangeToRenderDist(double par1) {
    double d1 = this.boundingBox.getAverageEdgeLength() * 4.0D;
    d1 *= 64.0D;
    return (par1 < d1 * d1);
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
    this.field_146056_aC = par1;
    this.field_146057_aD = par3;
    this.field_146058_aE = par5;
    this.field_146059_aF = par7;
    this.field_146060_aG = par8;
    this.field_146055_aB = par9;
    this.motionX = this.field_146061_aH;
    this.motionY = this.field_146052_aI;
    this.motionZ = this.field_146053_aJ;
  }
  
  @SideOnly(Side.CLIENT)
  public void setVelocity(double par1, double par3, double par5) {
    this.field_146061_aH = this.motionX = par1;
    this.field_146052_aI = this.motionY = par3;
    this.field_146053_aJ = this.motionZ = par5;
  }
  
  public void onUpdate() {
    if (this.field_146055_aB > 0) {
      double d7 = this.posX + (this.field_146056_aC - this.posX) / this.field_146055_aB;
      double d8 = this.posY + (this.field_146057_aD - this.posY) / this.field_146055_aB;
      double d9 = this.posZ + (this.field_146058_aE - this.posZ) / this.field_146055_aB;
      double d1 = MathHelper.wrapAngleTo180_double(this.field_146059_aF - this.rotationYaw);
      this.rotationYaw = (float)(this.rotationYaw + d1 / this.field_146055_aB);
      this.rotationPitch = (float)(this.rotationPitch + (this.field_146060_aG - this.rotationPitch) / this.field_146055_aB);
      this.field_146055_aB--;
      setPosition(d7, d8, d9);
      setRotation(this.rotationYaw, this.rotationPitch);
    } else {
      if (!this.worldObj.isRemote) {
        ItemStack itemstack = this.field_146042_b.getCurrentEquippedItem();
        if (this.field_146042_b.isDead || !this.field_146042_b.isEntityAlive() || itemstack == null || itemstack.getItem() != OreSpawnMain.MyUltimateFishingRod || getDistanceSqToEntity((Entity)this.field_146042_b) > 1024.0D) {
          setDead();
          this.field_146042_b.fishEntity = null;
          return;
        } 
        if (this.field_146043_c != null) {
          if (!this.field_146043_c.isDead) {
            this.posX = this.field_146043_c.posX;
            this.posY = this.field_146043_c.boundingBox.minY + this.field_146043_c.height * 0.8D;
            this.posZ = this.field_146043_c.posZ;
            return;
          } 
          this.field_146043_c = null;
        } 
      } 
      if (this.field_146044_a > 0)
        this.field_146044_a--; 
      if (this.field_146051_au) {
        if (this.worldObj.getBlock(this.field_146037_g, this.field_146048_h, this.field_146050_i) == this.field_146046_j) {
          this.field_146049_av++;
          if (this.field_146049_av == 1200)
            setDead(); 
          return;
        } 
        this.field_146051_au = false;
        this.motionX *= (this.rand.nextFloat() * 0.2F);
        this.motionY *= (this.rand.nextFloat() * 0.2F);
        this.motionZ *= (this.rand.nextFloat() * 0.2F);
        this.field_146049_av = 0;
        this.field_146047_aw = 0;
      } else {
        this.field_146047_aw++;
      } 
      Vec3 vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      Vec3 vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec31, vec3);
      vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      if (movingobjectposition != null)
        vec3 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord); 
      Entity entity = null;
      List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
      double d0 = 0.0D;
      for (int i = 0; i < list.size(); i++) {
        Entity entity1 = list.get(i);
        if (entity1.canBeCollidedWith() && (entity1 != this.field_146042_b || this.field_146047_aw >= 5)) {
          float f = 0.3F;
          AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(f, f, f);
          MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec31, vec3);
          if (movingobjectposition1 != null) {
            double d2 = vec31.distanceTo(movingobjectposition1.hitVec);
            if (d2 < d0 || d0 == 0.0D) {
              entity = entity1;
              d0 = d2;
            } 
          } 
        } 
      } 
      if (entity != null)
        movingobjectposition = new MovingObjectPosition(entity); 
      if (movingobjectposition != null)
        if (movingobjectposition.entityHit != null) {
          if (movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)this.field_146042_b), 0.0F))
            this.field_146043_c = movingobjectposition.entityHit; 
        } else {
          this.field_146051_au = true;
        }  
      if (!this.field_146051_au) {
        moveEntity(this.motionX, this.motionY, this.motionZ);
        float f5 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
        for (this.rotationPitch = (float)(Math.atan2(this.motionY, f5) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F);
        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
          this.prevRotationPitch += 360.0F; 
        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
          this.prevRotationYaw -= 360.0F; 
        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
          this.prevRotationYaw += 360.0F; 
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
        float f6 = 0.92F;
        if (this.onGround || this.isCollidedHorizontally)
          f6 = 0.5F; 
        byte b0 = 5;
        double d10 = 0.0D;
        for (int j = 0; j < b0; j++) {
          double d3 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (j + 0) / b0 - 0.125D + 0.125D;
          double d4 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (j + 1) / b0 - 0.125D + 0.125D;
          AxisAlignedBB axisalignedbb1 = AxisAlignedBB.getBoundingBox(this.boundingBox.minX, d3, this.boundingBox.minZ, this.boundingBox.maxX, d4, this.boundingBox.maxZ);
          if (this.worldObj.isAABBInMaterial(axisalignedbb1, Material.water))
            d10 += 1.0D / b0; 
          if (this.worldObj.isAABBInMaterial(axisalignedbb1, Material.lava))
            d10 += 1.0D / b0; 
        } 
        if (!this.worldObj.isRemote && d10 > 0.0D) {
          WorldServer worldserver = (WorldServer)this.worldObj;
          int k = 1;
          if (this.rand.nextFloat() < 0.25F && this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1, MathHelper.floor_double(this.posZ)))
            k = 2; 
          if (this.rand.nextFloat() < 0.5F && !this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1, MathHelper.floor_double(this.posZ)))
            k--; 
          if (this.fish_on_hook > 0) {
            this.fish_on_hook--;
            if (this.fish_on_hook <= 0) {
              this.fish_wait_time = 0;
              this.ticks_catchable = 0;
            } 
          } else if (this.ticks_catchable > 0) {
            this.ticks_catchable -= k;
            if (this.ticks_catchable <= 0) {
              this.motionY -= 0.20000000298023224D;
              playSound("random.splash", 0.25F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
              float f1 = MathHelper.floor_double(this.boundingBox.minY);
              worldserver.func_147487_a("bubble", this.posX, (f1 + 1.0F), this.posZ, (int)(1.0F + this.width * 20.0F), this.width, 0.0D, this.width, 0.20000000298023224D);
              worldserver.func_147487_a("wake", this.posX, (f1 + 1.0F), this.posZ, (int)(1.0F + this.width * 20.0F), this.width, 0.0D, this.width, 0.20000000298023224D);
              this.fish_on_hook = MathHelper.getRandomIntegerInRange(this.rand, 10, 30);
            } else {
              this.fish_direction = (float)(this.fish_direction + this.rand.nextGaussian() * 4.0D);
              float f1 = this.fish_direction * 0.017453292F;
              float f7 = MathHelper.sin(f1);
              float f2 = MathHelper.cos(f1);
              double d11 = this.posX + (f7 * this.ticks_catchable * 0.1F);
              double d5 = (MathHelper.floor_double(this.boundingBox.minY) + 1.0F);
              double d6 = this.posZ + (f2 * this.ticks_catchable * 0.1F);
              if (this.rand.nextFloat() < 0.15F)
                worldserver.func_147487_a("bubble", d11, d5 - 0.10000000149011612D, d6, 1, f7, 0.1D, f2, 0.0D); 
              float f3 = f7 * 0.04F;
              float f4 = f2 * 0.04F;
              worldserver.func_147487_a("wake", d11, d5, d6, 0, f4, 0.01D, -f3, 1.0D);
              worldserver.func_147487_a("wake", d11, d5, d6, 0, -f4, 0.01D, f3, 1.0D);
            } 
          } else if (this.fish_wait_time > 0) {
            this.fish_wait_time -= k;
            float f1 = 0.15F;
            if (this.fish_wait_time < 20) {
              f1 = (float)(f1 + (20 - this.fish_wait_time) * 0.05D);
            } else if (this.fish_wait_time < 40) {
              f1 = (float)(f1 + (40 - this.fish_wait_time) * 0.02D);
            } else if (this.fish_wait_time < 60) {
              f1 = (float)(f1 + (60 - this.fish_wait_time) * 0.01D);
            } 
            if (this.rand.nextFloat() < f1) {
              float f7 = MathHelper.randomFloatClamp(this.rand, 0.0F, 360.0F) * 0.017453292F;
              float f2 = MathHelper.randomFloatClamp(this.rand, 25.0F, 60.0F);
              double d11 = this.posX + (MathHelper.sin(f7) * f2 * 0.1F);
              double d5 = (MathHelper.floor_double(this.boundingBox.minY) + 1.0F);
              double d6 = this.posZ + (MathHelper.cos(f7) * f2 * 0.1F);
              worldserver.func_147487_a("splash", d11, d5, d6, 2 + this.rand.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
            } 
            if (this.fish_wait_time <= 0) {
              this.fish_direction = MathHelper.randomFloatClamp(this.rand, 0.0F, 360.0F);
              this.ticks_catchable = MathHelper.getRandomIntegerInRange(this.rand, 100, 200);
            } 
          } else {
            this.fish_wait_time = MathHelper.getRandomIntegerInRange(this.rand, 50, 300);
            this.fish_wait_time -= EnchantmentHelper.func_151387_h((EntityLivingBase)this.field_146042_b) * 20 * 5;
          } 
          if (this.fish_on_hook > 0)
            this.motionY -= (this.rand.nextFloat() * this.rand.nextFloat() * this.rand.nextFloat()) * 0.2D; 
        } 
        double d2 = d10 * 2.0D - 1.0D;
        this.motionY += 0.03999999910593033D * d2;
        if (d10 > 0.0D) {
          f6 = (float)(f6 * 0.9D);
          this.motionY *= 0.8D;
        } 
        this.motionX *= f6;
        this.motionY *= f6;
        this.motionZ *= f6;
        setPosition(this.posX, this.posY, this.posZ);
      } 
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    par1NBTTagCompound.setShort("xTile", (short)this.field_146037_g);
    par1NBTTagCompound.setShort("yTile", (short)this.field_146048_h);
    par1NBTTagCompound.setShort("zTile", (short)this.field_146050_i);
    par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock(this.field_146046_j));
    par1NBTTagCompound.setByte("shake", (byte)this.field_146044_a);
    par1NBTTagCompound.setByte("inGround", (byte)(this.field_146051_au ? 1 : 0));
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    this.field_146037_g = par1NBTTagCompound.getShort("xTile");
    this.field_146048_h = par1NBTTagCompound.getShort("yTile");
    this.field_146050_i = par1NBTTagCompound.getShort("zTile");
    this.field_146046_j = Block.getBlockById(par1NBTTagCompound.getByte("inTile") & 0xFF);
    this.field_146044_a = par1NBTTagCompound.getByte("shake") & 0xFF;
    this.field_146051_au = (par1NBTTagCompound.getByte("inGround") == 1);
  }
  
  @SideOnly(Side.CLIENT)
  public float getShadowSize() {
    return 0.0F;
  }
  
  public int func_146034_e() {
    if (this.worldObj.isRemote)
      return 0; 
    byte b0 = 0;
    if (this.field_146043_c != null) {
      double d0 = this.field_146042_b.posX - this.posX;
      double d2 = this.field_146042_b.posY - this.posY;
      double d4 = this.field_146042_b.posZ - this.posZ;
      double d6 = MathHelper.sqrt_double(d0 * d0 + d2 * d2 + d4 * d4);
      double d8 = 0.1D;
      this.field_146043_c.motionX += d0 * d8;
      this.field_146043_c.motionY += d2 * d8 + MathHelper.sqrt_double(d6) * 0.08D;
      this.field_146043_c.motionZ += d4 * d8;
      b0 = 3;
    } else if (this.fish_on_hook > 0) {
      EntityItem entityitem = new EntityItem(this.worldObj, this.posX, this.posY + 1.25D, this.posZ, func_146033_f());
      double d1 = this.field_146042_b.posX - this.posX;
      double d3 = this.field_146042_b.posY - this.posY;
      double d5 = this.field_146042_b.posZ - this.posZ;
      double d7 = MathHelper.sqrt_double(d1 * d1 + d3 * d3 + d5 * d5);
      double d9 = 0.1D;
      entityitem.motionX = d1 * d9;
      entityitem.motionY = d3 * d9 + MathHelper.sqrt_double(d7) * 0.08D;
      entityitem.motionZ = d5 * d9;
      entityitem.fireResistance = 3000;
      this.worldObj.spawnEntityInWorld((Entity)entityitem);
      this.field_146042_b.worldObj.spawnEntityInWorld((Entity)new EntityXPOrb(this.field_146042_b.worldObj, this.field_146042_b.posX, this.field_146042_b.posY + 0.5D, this.field_146042_b.posZ + 0.5D, this.rand.nextInt(6) + 1));
      b0 = 1;
    } 
    if (this.field_146051_au)
      b0 = 2; 
    setDead();
    this.field_146042_b.fishEntity = null;
    return b0;
  }
  
  private ItemStack func_146033_f() {
    float f = this.worldObj.rand.nextFloat();
    int i = EnchantmentHelper.func_151386_g((EntityLivingBase)this.field_146042_b);
    int j = EnchantmentHelper.func_151387_h((EntityLivingBase)this.field_146042_b);
    float f1 = 0.1F - i * 0.025F - j * 0.01F;
    float f2 = 0.05F + i * 0.01F - j * 0.01F;
    f1 = MathHelper.clamp_float(f1, 0.0F, 1.0F);
    f2 = MathHelper.clamp_float(f2, 0.0F, 1.0F);
    Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ);
    if (handleLavaMovement() || bid == Blocks.lava || bid == Blocks.flowing_lava) {
      this.field_146042_b.addStat(StatList.fishCaughtStat, 1);
      return ((WeightedRandomFishable)WeightedRandom.getRandomItem(this.rand, orespawn_lava_fish)).func_150708_a(this.rand);
    } 
    if (f < f1) {
      this.field_146042_b.addStat(StatList.field_151183_A, 1);
      return ((WeightedRandomFishable)WeightedRandom.getRandomItem(this.rand, field_146039_d)).func_150708_a(this.rand);
    } 
    f -= f1;
    if (f < f2) {
      this.field_146042_b.addStat(StatList.field_151184_B, 1);
      return ((WeightedRandomFishable)WeightedRandom.getRandomItem(this.rand, field_146041_e)).func_150708_a(this.rand);
    } 
    float f3 = this.worldObj.rand.nextFloat();
    this.field_146042_b.addStat(StatList.fishCaughtStat, 1);
    if (f3 < 0.5F)
      return ((WeightedRandomFishable)WeightedRandom.getRandomItem(this.rand, field_146036_f)).func_150708_a(this.rand); 
    return ((WeightedRandomFishable)WeightedRandom.getRandomItem(this.rand, orespawn_fish)).func_150708_a(this.rand);
  }
  
  public void setDead() {
    super.setDead();
    if (this.field_146042_b != null)
      this.field_146042_b.fishEntity = null; 
  }
}
