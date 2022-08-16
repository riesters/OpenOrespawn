package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.monster.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;

public class Kyuubi extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private final float moveSpeed;
    
    public Kyuubi(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.moveSpeed = 0.25f;
        this.setSize(0.5f, 1.25f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 30;
        this.fireResistance = 1000;
        this.isImmuneToFire = true;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.350000023841858));
        this.tasks.addTask(2, new EntityAIMoveThroughVillage(this, 1.0, false));
        this.tasks.addTask(3, new EntityAIWander(this, 1.0));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0f));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.TargetSorter = new GenericTargetSorter(this);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.Kyuubi_stats.attack);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.Kyuubi_stats.health;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Kyuubi_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.rand.nextInt(10) == 1) {
            this.worldObj.spawnParticle("reddust", this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0);
            this.worldObj.spawnParticle("lava", this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0);
            this.setFire(5);
            if (this.isInWater()) {
                this.attackEntityAsMob(this);
                this.worldObj.spawnParticle("smoke", this.posX, this.posY + 1.75, this.posZ, 0.0, 0.0, 0.0);
                this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 1.75, this.posZ, 0.0, 0.0, 0.0);
                this.worldObj.spawnParticle("smoke", this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0);
                this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 2.0, this.posZ, 0.0, 0.0, 0.0);
            }
        }
    }
    
    public int getAttackStrength() {
        return 3;
    }
    
    protected String getLivingSound() {
        return "orespawn:kyuubi_living";
    }
    
    protected String getHurtSound() {
        return "orespawn:alo_hurt";
    }
    
    protected String getDeathSound() {
        return "orespawn:alo_death";
    }
    
    protected float getSoundVolume() {
        return 0.75f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.worldObj.rand.nextInt(6);
        if (i == 0) {
            return Items.gold_nugget;
        }
        if (i == 1) {
            return OreSpawnMain.UraniumNugget;
        }
        if (i == 2) {
            return OreSpawnMain.TitaniumNugget;
        }
        return null;
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget(null);
        }
        super.updateAITasks();
        if (this.worldObj.rand.nextInt(10) == 1) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.faceEntity(e, 10.0f, 10.0f);
                this.getNavigator().tryMoveToEntityLiving(e, 1.25);
                if (this.getDistanceSqToEntity(e) < 64.0 && (this.rand.nextInt(6) == 0 || this.rand.nextInt(8) == 1)) {
                    final EntitySmallFireball var2 = new EntitySmallFireball(this.worldObj, this, e.posX - this.posX, e.posY + 0.75 - (this.posY + 1.25), e.posZ - this.posZ);
                    var2.setLocationAndAngles(this.posX, this.posY + 1.25, this.posZ, this.rotationYaw, this.rotationPitch);
                    this.worldObj.playSoundAtEntity(this, "random.bow", 0.75f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
                    this.worldObj.spawnEntityInWorld(var2);
                }
            }
        }
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
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0, 4.0, 12.0));
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
    
    public boolean getCanSpawnHere() {
        return true;
    }
    
    private void dropItemRand(final Item index) {
        final EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, 1, 0));
        this.worldObj.spawnEntityInWorld(var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var4 = 0; var4 < 10; ++var4) {
            this.dropItemRand(Items.coal);
        }
        for (int var4 = 0; var4 < 3; ++var4) {
            this.dropItemRand(Item.getItemFromBlock(Blocks.redstone_block));
        }
        for (int var4 = 0; var4 < 4; ++var4) {
            this.dropItemRand(Item.getItemFromBlock(Blocks.quartz_block));
        }
    }
}
