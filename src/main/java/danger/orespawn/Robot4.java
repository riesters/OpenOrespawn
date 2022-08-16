package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.tileentity.*;

public class Robot4 extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private RenderInfo renderdata;
    private int reload_ticker;
    private int was_attacked_ticker;
    private final float moveSpeed;
    
    public Robot4(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.renderdata = new RenderInfo();
        this.reload_ticker = 0;
        this.was_attacked_ticker = 0;
        this.moveSpeed = 0.34f;
        this.setSize(2.5f, 4.0f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 120;
        this.fireResistance = 120;
        this.isImmuneToFire = true;
        this.TargetSorter = new GenericTargetSorter(this);
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new MyEntityAIWanderALot(this, 14, 1.0));
        this.tasks.addTask(2, new EntityAIMoveThroughVillage(this, 0.8999999761581421, false));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Robot4_stats.attack);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (byte) 0);
        this.dataWatcher.addObject(21, (byte) 0);
        if (this.renderdata == null)
            this.renderdata = new RenderInfo();
        this.renderdata.rf1 = 0.0F;
        this.renderdata.rf2 = 0.0F;
        this.renderdata.rf3 = 0.0F;
        this.renderdata.rf4 = 0.0F;
        this.renderdata.ri1 = 0;
        this.renderdata.ri2 = 0;
        this.renderdata.ri3 = 0;
        this.renderdata.ri4 = 0;
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.Robot4_stats.health;
    }
    
    public int getRobot4Health() {
        return (int)this.getHealth();
    }
    
    public RenderInfo getRenderInfo() {
        return this.renderdata;
    }
    
    public void setRenderInfo(final RenderInfo r) {
        this.renderdata.rf1 = r.rf1;
        this.renderdata.rf2 = r.rf2;
        this.renderdata.rf3 = r.rf3;
        this.renderdata.rf4 = r.rf4;
        this.renderdata.ri1 = r.ri1;
        this.renderdata.ri2 = r.ri2;
        this.renderdata.ri3 = r.ri3;
        this.renderdata.ri4 = r.ri4;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Robot4_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    protected void jump() {
        this.motionY += 0.25;
        super.jump();
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.isRemote) {
            if (this.rand.nextInt(3) == 1) {
                this.worldObj.spawnParticle("smoke", this.posX - 1.25 * Math.sin(Math.toRadians(this.rotationYaw + 180.0f)), this.posY + 3.0 + this.worldObj.rand.nextFloat(), this.posZ + 1.25 * Math.cos(Math.toRadians(this.rotationYaw + 180.0f)), 0.0, this.worldObj.rand.nextFloat() / 2.0, 0.0);
            }
            if (this.getAttacking() != 0) {
                this.worldObj.spawnParticle("reddust", this.posX - 1.55 * Math.sin(Math.toRadians(this.rotationYaw + 35.0f)), this.posY + 2.25 + this.worldObj.rand.nextFloat(), this.posZ + 1.55 * Math.cos(Math.toRadians(this.rotationYaw + 35.0f)), 0.0, this.worldObj.rand.nextFloat(), 0.0);
            }
        }
    }
    
    public int getAttackStrength() {
        int var2 = 0;
        if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
            var2 = 15;
        }
        return var2;
    }
    
    protected String getLivingSound() {
        if (this.rand.nextInt(4) == 0) {
            return "orespawn:robot_living";
        }
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:robot_hurt";
    }
    
    protected String getDeathSound() {
        return "orespawn:robot_death";
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.quartz;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        EntityItem var3;
        final ItemStack is = new ItemStack(index, par1, 0);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
        this.worldObj.spawnEntityInWorld(var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var5 = 5 + this.worldObj.rand.nextInt(10), var6 = 0; var6 < var5; ++var6) {
            this.dropItemRand(OreSpawnMain.MyLaserBall, 4);
        }
        this.dropItemRand(OreSpawnMain.MyRayGun, 1);
        this.dropItemRand(Items.item_frame, 1);
        for (int i = 10 + this.worldObj.rand.nextInt(15), var6 = 0; var6 < i; ++var6) {
            final int var7 = this.worldObj.rand.nextInt(15);
            switch (var7) {
                case 0: {
                    this.dropItemRand(Items.redstone, 1);
                    break;
                }
                case 1: {
                    this.dropItemRand(Items.repeater, 1);
                    break;
                }
                case 2: {
                    this.dropItemRand(Items.comparator, 1);
                    break;
                }
                case 3: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
                    break;
                }
                case 4: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.dispenser), 1);
                    break;
                }
                case 5: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.sticky_piston), 1);
                    break;
                }
                case 6: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.piston), 1);
                    break;
                }
                case 7: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.lever), 1);
                    break;
                }
                case 8: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
                    break;
                }
                case 9: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.light_weighted_pressure_plate), 1);
                    break;
                }
            }
        }
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        if (par1Entity instanceof EntityLivingBase) {
            final double ks = 2.0;
            double inair = 0.12;
            final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
            if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                inair *= 2.0;
            }
            par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
        }
        return super.attackEntityAsMob(par1Entity);
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.reload_ticker > 0) {
            --this.reload_ticker;
        }
        if (this.was_attacked_ticker > 0) {
            --this.was_attacked_ticker;
        }
        if (this.reload_ticker == 0 && this.worldObj.rand.nextInt(8) == 1) {
            EntityLivingBase e;
            if (this.worldObj.rand.nextInt(50) == 1) {
                this.setAttackTarget(null);
            }
            e = this.getAttackTarget();
            if (e != null && !e.isEntityAlive()) {
                this.setAttackTarget(null);
                e = null;
            }
            if (e == null) {
                e = this.findSomethingToAttack();
            }
            if (e != null) {
                this.faceEntity(e, 10.0f, 10.0f);
                if (this.getDistanceSqToEntity(e) < 256.0) {
                    if (this.getDistanceSqToEntity(e) < (3.0f + e.width / 2.0f) * (3.0f + e.width / 2.0f)) {
                        this.attackEntityAsMob(e);
                    }
                    else {
                        final double rr = Math.atan2(e.posZ - this.posZ, e.posX - this.posX);
                        final double rhdir = Math.toRadians((this.rotationYawHead + 90.0f) % 360.0f);
                        final double pi = 3.1415926545;
                        double rdd = Math.abs(rr - rhdir) % (pi * 2.0);
                        if (rdd > pi) {
                            rdd -= pi * 2.0;
                        }
                        rdd = Math.abs(rdd);
                        if (rdd < 0.5) {
                            final double yoff = 2.0;
                            final double xzoff = 1.75;
                            final LaserBall var2 = new LaserBall(this.worldObj, e.posX - this.posX, e.posY - (this.posY + yoff), e.posZ - this.posZ);
                            var2.setLocationAndAngles(this.posX - xzoff * Math.sin(Math.toRadians(this.rotationYaw + 45.0f)), this.posY + yoff, this.posZ + xzoff * Math.cos(Math.toRadians(this.rotationYaw + 45.0f)), this.rotationYaw, this.rotationPitch);
                            final double var3 = e.posX - var2.posX;
                            final double var4 = e.posY - var2.posY;
                            final double var5 = e.posZ - var2.posZ;
                            final float var6 = MathHelper.sqrt_double(var3 * var3 + var5 * var5) * 0.2f;
                            var2.setThrowableHeading(var3, var4 + var6, var5, 2.0f, 4.0f);
                            if (this.getDistanceSqToEntity(e) > 65.0) {
                                var2.setSpecial();
                                this.reload_ticker = 30;
                                this.worldObj.playSoundAtEntity(this, "fireworks.launch", 3.5f, 0.5f);
                            }
                            else {
                                this.reload_ticker = 10;
                                this.worldObj.playSoundAtEntity(this, "fireworks.launch", 2.5f, 1.0f);
                            }
                            this.worldObj.spawnEntityInWorld(var2);
                        }
                        this.setAttacking(1);
                    }
                    this.getNavigator().tryMoveToEntityLiving(e, 0.75);
                }
            }
        }
        if (this.reload_ticker <= 0 && this.was_attacked_ticker <= 0) {
            this.setAttacking(0);
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret;
        if (par1DamageSource.getDamageType().equals("cactus")) {
            return false;
        }
        if (this.getShielding() != 0 || this.was_attacked_ticker != 0) {
            return false;
        }
        this.was_attacked_ticker = 65;
        this.setAttacking(1);
        ret = super.attackEntityFrom(par1DamageSource, par2);
        final Entity e = par1DamageSource.getEntity();
        if (e instanceof EntityLiving) {
            this.setAttackTarget((EntityLivingBase)e);
            this.setTarget(e);
            this.getNavigator().tryMoveToEntityLiving(e, 1.2);
            ret = true;
        }
        return ret;
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(16.0, 4.0, 16.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        for (Object o : var5) {
            Entity var3 = (Entity) o;
            EntityLivingBase var4 = (EntityLivingBase) var3;
            if (isSuitableTarget(var4))
                return var4;
        }
        return null;
    }
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectByte(20);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, (byte)par1);
    }
    
    public final int getShielding() {
        return this.dataWatcher.getWatchableObjectByte(21);
    }
    
    public final void setShielding(final int par1) {
        this.dataWatcher.updateObject(21, (byte)par1);
    }
    
    public boolean getCanSpawnHere() {
        for (int k = -3; k < 3; ++k) {
            for (int j = -3; j < 3; ++j) {
                for (int i = 0; i < 5; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid == Blocks.mob_spawner) {
                        TileEntityMobSpawner tileentitymobspawner;
                        tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                        final String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
                        if (s != null && s.equals("Robo-Warrior")) {
                            return true;
                        }
                    }
                }
            }
        }
        if (this.posY < 50.0) {
            return false;
        }
        if (this.worldObj.isDaytime()) {
            return false;
        }
        for (int k = -1; k < 1; ++k) {
            for (int j = -1; j <= 1; ++j) {
                for (int i = 1; i < 6; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid != Blocks.air && bid != Blocks.tallgrass) {
                        return false;
                    }
                }
            }
        }
        return this.isValidLightLevel();
    }
}
