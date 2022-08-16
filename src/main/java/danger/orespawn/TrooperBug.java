package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.enchantment.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.*;

public class TrooperBug extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private RenderInfo renderdata;
    private int hurt_timer;
    private final float moveSpeed;
    
    public TrooperBug(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.renderdata = new RenderInfo();
        this.hurt_timer = 0;
        this.moveSpeed = 0.4f;
        this.setSize(3.0f, 3.5f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 150;
        this.fireResistance = 100;
        this.isImmuneToFire = false;
        this.TargetSorter = new GenericTargetSorter(this);
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIMoveThroughVillage(this, 0.8999999761581421, false));
        this.tasks.addTask(2, new MyEntityAIWanderALot(this, 14, 1.0));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0f));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (byte) 0);
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
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.TrooperBug_stats.attack);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
        if (this.isAirBorne) {
            this.getNavigator().setPath(null, 0.0);
        }
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.TrooperBug_stats.health;
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
        return OreSpawnMain.TrooperBug_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    protected void jump() {
        this.motionY += 1.149999976158142;
        this.posY += 1.5;
        final float f = 0.2f + Math.abs(this.worldObj.rand.nextFloat() * 0.45f);
        this.motionX -= f * Math.sin(Math.toRadians(this.rotationYawHead));
        this.motionZ += f * Math.cos(Math.toRadians(this.rotationYawHead));
        this.isAirBorne = true;
    }
    
    protected void jumpAtEntity(final EntityLivingBase e) {
        this.motionY += 1.25;
        this.posY += 1.25;
        final float f = 0.3f + Math.abs(this.worldObj.rand.nextFloat() * 0.25f);
        final float d = (float)Math.atan2(e.posX - this.posX, e.posZ - this.posZ);
        this.motionX += f * Math.sin(d);
        this.motionZ += f * Math.cos(d);
        this.isAirBorne = true;
    }
    
    public int getTrooperBugHealth() {
        return (int)this.getHealth();
    }
    
    protected String getLivingSound() {
        if (this.rand.nextInt(4) == 0) {
            return "orespawn:clatter";
        }
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:crunch";
    }
    
    protected String getDeathSound() {
        return "orespawn:emperorscorpion_death";
    }
    
    protected float getSoundVolume() {
        return 1.5f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.beef;
    }
    
    private ItemStack dropItemRand(final Item index) {
        EntityItem var3;
        final ItemStack is = new ItemStack(index, 1, 0);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5), is);
        this.worldObj.spawnEntityInWorld(var3);
        return is;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        this.dropItemRand(OreSpawnMain.MyJumpyBugScale);
        this.dropItemRand(Items.item_frame);
        for (int i = 2 + this.worldObj.rand.nextInt(5), var4 = 0; var4 < i; ++var4) {
            this.dropItemRand(OreSpawnMain.MyAmethyst);
        }
        for (int i = 1 + this.worldObj.rand.nextInt(5), var4 = 0; var4 < i; ++var4) {
            final int var5 = this.worldObj.rand.nextInt(14);
            switch (var5) {
                case 0: {}
                case 2: {
                    this.dropItemRand(Item.getItemFromBlock(OreSpawnMain.MyBlockAmethystBlock));
                    break;
                }
                case 3: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.MyAmethystSword);
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.baneOfArthropods, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.knockback, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.looting, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.fireAspect, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.sharpness, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 4: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.MyAmethystShovel);
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 5: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.MyAmethystPickaxe);
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.fortune, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 6: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.MyAmethystAxe);
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 7: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.MyAmethystHoe);
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.efficiency, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 8: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.AmethystHelmet);
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.respiration, 1 + this.worldObj.rand.nextInt(2));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.aquaAffinity, 1 + this.worldObj.rand.nextInt(5));
                        break;
                    }
                    break;
                }
                case 9: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.AmethystBody);
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                        break;
                    }
                    break;
                }
                case 10: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.AmethystLegs);
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.protection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.blastProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.fireProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.projectileProtection, 1 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                        break;
                    }
                    break;
                }
                case 11: {
                    final ItemStack is = this.dropItemRand(OreSpawnMain.AmethystBoots);
                    if (this.worldObj.rand.nextInt(6) == 1) {
                        is.addEnchantment(Enchantment.featherFalling, 5 + this.worldObj.rand.nextInt(5));
                    }
                    if (this.worldObj.rand.nextInt(2) == 1) {
                        is.addEnchantment(Enchantment.unbreaking, 2 + this.worldObj.rand.nextInt(4));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final double ks = 1.8;
        double inair = 0.2;
        if (super.attackEntityAsMob(par1Entity)) {
            if (par1Entity instanceof EntityLivingBase) {
                final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
                if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                    inair *= 2.0;
                }
                par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
            }
            return true;
        }
        return false;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (this.hurt_timer > 0) {
            return false;
        }
        if (!par1DamageSource.getDamageType().equals("cactus") && !par1DamageSource.getDamageType().equals("fall")) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
            this.hurt_timer = 20;
            final Entity e = par1DamageSource.getEntity();
            if (e instanceof EntityLiving) {
                this.setAttackTarget((EntityLivingBase)e);
                this.setTarget(e);
                this.getNavigator().tryMoveToEntityLiving(e, 1.2);
                ret = true;
            }
        }
        return ret;
    }
    
    protected void updateAITasks() {
        EntityLivingBase e;
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.hurt_timer > 0) {
            --this.hurt_timer;
        }
        if (this.worldObj.rand.nextInt(5) == 0) {
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
                if (this.worldObj.rand.nextInt(10) == 1 && !this.isAirBorne) {
                    this.jumpAtEntity(e);
                }
                else if (this.getDistanceSqToEntity(e) < (5.0f + e.width / 2.0f) * (5.0f + e.width / 2.0f)) {
                    this.setAttacking(1);
                    if (this.worldObj.rand.nextInt(6) == 0 || this.worldObj.rand.nextInt(7) == 1) {
                        this.attackEntityAsMob(e);
                        if (!this.worldObj.isRemote) {
                            if (this.worldObj.rand.nextInt(3) == 1) {
                                this.worldObj.playSoundAtEntity(e, "orespawn:scorpion_attack", 1.4f, 1.0f);
                            }
                            else {
                                this.worldObj.playSoundAtEntity(e, "orespawn:clatter", 1.0f, 1.0f);
                            }
                        }
                    }
                }
                else if (!this.isAirBorne) {
                    this.getNavigator().tryMoveToEntityLiving(e, 1.2);
                }
                if (this.worldObj.rand.nextInt(30) == 1) {
                    spawnCreature(this.worldObj, "Spit Bug", (this.posX + e.posX) / 2.0 + this.worldObj.rand.nextInt(5) - this.worldObj.rand.nextInt(5), (this.posY + e.posY) / 2.0 + 1.01, (this.posZ + e.posZ) / 2.0 + this.worldObj.rand.nextInt(5) - this.worldObj.rand.nextInt(5));
                }
            }
            else {
                this.setAttacking(0);
            }
        }
        if (this.worldObj.rand.nextInt(150) == 1 && this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8;
        var8 = EntityList.createEntityByName(par1, par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
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
        if (par1EntityLiving instanceof Hydrolisc) {
            return false;
        }
        if (par1EntityLiving instanceof EnderReaper) {
            return false;
        }
        if (par1EntityLiving instanceof EnderKnight) {
            return false;
        }
        if (par1EntityLiving instanceof EntityEnderman) {
            return false;
        }
        if (par1EntityLiving instanceof EntityCreeper) {
            return false;
        }
        if (par1EntityLiving instanceof TrooperBug) {
            return false;
        }
        if (par1EntityLiving instanceof SpitBug) {
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
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0, 7.0, 12.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8)) {
                return var8;
            }
        }
        return null;
    }
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectByte(20);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, (byte)par1);
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
                        if (s != null && s.equals("Jumpy Bug")) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!this.isValidLightLevel()) {
            return false;
        }
        if (this.worldObj.isDaytime() && this.worldObj.rand.nextInt(20) > 1) {
            return false;
        }
        for (int k = -2; k < 2; ++k) {
            for (int j = -2; j < 2; ++j) {
                for (int i = 1; i < 5; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid != Blocks.air) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
