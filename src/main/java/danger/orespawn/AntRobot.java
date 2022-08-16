package danger.orespawn;

import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.nbt.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;

public class AntRobot extends EntityLiving
{
    private int boatPosRotationIncrements;
    private double boatX;
    private double boatY;
    private double boatZ;
    private double boatYaw;
    private double boatPitch;
    private int playing;
    private final float moveSpeed;
    private RenderSpiderRobotInfo renderdata;
    private int didonce;
    private int rideTicker;
    private int owned;
    
    public AntRobot(final World par1World) {
        super(par1World);
        this.playing = 0;
        this.moveSpeed = 0.3f;
        this.renderdata = new RenderSpiderRobotInfo();
        this.didonce = 0;
        this.rideTicker = 0;
        this.owned = 0;
        this.setSize(2.75f, 1.25f);
        this.riddenByEntity = null;
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0f));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.isImmuneToFire = true;
        this.experienceValue = OreSpawnMain.AntRobot_stats.health / 2;
    }
    
    public AntRobot(final World par1World, final double par2, final double par4, final double par6) {
        this(par1World);
        this.setPosition(par2, par4 + this.yOffset, par6);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(OreSpawnMain.AntRobot_stats.health);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.AntRobot_stats.attack);
    }
    
    protected boolean canDespawn() {
        return false;
    }
    
    public void setOwned() {
        this.owned = 1;
    }
    
    public int getOwned() {
        return this.owned;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.AntRobot_stats.defense;
    }
    
    protected void updateAITasks() {
        EntityLivingBase e;
        if (this.isDead) {
            return;
        }
        if (this.riddenByEntity != null) {
            return;
        }
        super.updateAITasks();
        if (this.owned == 0 && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
            if (this.worldObj.rand.nextInt(20) == 0) {
                this.feetFindSomethingToHit();
            }
            if (this.worldObj.rand.nextInt(150) == 0) {
                this.setAttackTarget(null);
            }
            e = this.getAttackTarget();
            if (e != null && !e.isEntityAlive()) {
                this.setAttackTarget(null);
                e = null;
            }
            if (e == null) {
                e = this.findSomethingToAttack(2.0f, false);
            }
            if (e != null) {
                this.faceEntity(e, 10.0f, 10.0f);
                if (this.getDistanceSqToEntity(e) > 16.0) {
                    final double d1 = e.posZ - this.posZ;
                    final double d2 = e.posX - this.posX;
                    final double dd = Math.atan2(d1, d2);
                    this.goThisWay(0.2 * Math.cos(dd), 0.2 * Math.sin(dd));
                }
            }
            else {
                this.setAttacking(0);
            }
            if (e != null && this.worldObj.rand.nextInt(15) == 0) {
                e = this.getAttackTarget();
                if (e == null) {
                    e = this.findSomethingToAttack(2.0f, true);
                }
                if (e != null) {
                    if (this.getDistanceSqToEntity(e) < (6.0f + e.width / 2.0f) * (6.0f + e.width / 2.0f)) {
                        this.setAttacking(1);
                        this.attackEntityAsMob(e);
                    }
                    else {
                        this.setAttacking(0);
                    }
                }
                else {
                    this.setAttacking(0);
                }
            }
        }
    }
    
    protected void updateAITick() {
        if (this.riddenByEntity != null) {
            return;
        }
        super.updateAITick();
    }
    
    private void initLegData() {
        if (this.renderdata == null) {
            this.renderdata = new RenderSpiderRobotInfo();
        }
        for (int i = 0; i < 6; ++i) {
            this.renderdata.ycurrentangle[i] = 0.0f;
            this.renderdata.ywantedangle[i] = 0.0f;
            this.renderdata.ydisplayangle[i] = 0.0f;
            this.renderdata.yvelocity[i] = 0.0f;
            this.renderdata.ymid[i] = 0.0f;
            this.renderdata.yoff[i] = 0.0f;
            this.renderdata.yrange[i] = 0.0f;
            this.renderdata.udcurrentangle[i] = 0.0f;
            this.renderdata.udwantedangle[i] = 0.0f;
            this.renderdata.uddisplayangle[i] = 0.0f;
            this.renderdata.udvelocity[i] = 0.0f;
            this.renderdata.p1xangle[i] = 0.7853981633974483;
            this.renderdata.p2xangle[i] = 0.0;
            this.renderdata.p3xangle[i] = -0.7853981633974483;
            this.renderdata.pxvelocity[i] = 0.0f;
            this.renderdata.foot_xpos[i] = (float)this.posX;
            this.renderdata.foot_ypos[i] = (float)this.posY;
            this.renderdata.foot_zpos[i] = (float)this.posZ;
            this.renderdata.realposx[i] = 0.0f;
            this.renderdata.realposy[i] = 0.0f;
            this.renderdata.realposz[i] = 0.0f;
            this.renderdata.legoff[i] = 0.0f;
            this.renderdata.footup[i] = 1;
            this.renderdata.uppoint[i] = 0.0f;
            this.renderdata.footingticker[i] = 0;
            this.renderdata.gpcounter = 0;
            if (i == 0) {
                this.renderdata.legoff[i] = 0.75f;
                this.renderdata.ymid[i] = 0.0f;
                this.renderdata.yrange[i] = 0.2617994f;
                this.renderdata.pairedwith[i] = 1;
                this.renderdata.yoff[i] = -0.75f;
            }
            if (i == 1) {
                this.renderdata.legoff[i] = 0.75f;
                this.renderdata.ymid[i] = 3.1415927f;
                this.renderdata.yrange[i] = -0.2617994f;
                this.renderdata.pairedwith[i] = 0;
                this.renderdata.yoff[i] = -0.75f;
            }
            if (i == 2) {
                this.renderdata.legoff[i] = 1.0f;
                this.renderdata.ymid[i] = -0.7853982f;
                this.renderdata.yrange[i] = 0.2617994f;
                this.renderdata.pairedwith[i] = 3;
                this.renderdata.yoff[i] = -0.75f;
            }
            if (i == 3) {
                this.renderdata.legoff[i] = 1.0f;
                this.renderdata.ymid[i] = 3.9269907f;
                this.renderdata.yrange[i] = -0.2617994f;
                this.renderdata.pairedwith[i] = 2;
                this.renderdata.yoff[i] = -0.75f;
            }
            if (i == 4) {
                this.renderdata.legoff[i] = 1.15f;
                this.renderdata.ymid[i] = 0.7853982f;
                this.renderdata.yrange[i] = 0.2617994f;
                this.renderdata.pairedwith[i] = 5;
                this.renderdata.yoff[i] = -0.75f;
            }
            if (i == 5) {
                this.renderdata.legoff[i] = 1.15f;
                this.renderdata.ymid[i] = 2.3561945f;
                this.renderdata.yrange[i] = -0.2617994f;
                this.renderdata.pairedwith[i] = 4;
                this.renderdata.yoff[i] = -0.75f;
            }
        }
    }
    
    private float getNewVelocity(final float v, final float diff, float curval) {
        float tv = v;
        tv *= 18.0f;
        if (tv < 2.0f) {
            tv = 2.0f;
        }
        if (tv > 8.0f) {
            tv = 8.0f;
        }
        if (diff > 0.0f) {
            if (diff < 0.008726646259971648 * tv) {
                curval = 0.0f;
            }
            else {
                curval += (float)(0.004363323129985824 * tv);
                if (diff < 0.06981317007977318 * tv) {
                    curval = (float)(0.017453292519943295 * tv);
                }
                if (diff < 0.03490658503988659 * tv) {
                    curval = (float)(0.008726646259971648 * tv);
                }
                if (curval > 0.06981317007977318 * tv) {
                    curval = (float)(0.06981317007977318 * tv);
                }
            }
        }
        else if (diff > -0.008726646259971648 * tv) {
            curval = 0.0f;
        }
        else {
            curval -= (float)(0.004363323129985824 * tv);
            if (diff > -0.06981317007977318 * tv) {
                curval = -(float)(0.017453292519943295 * tv);
            }
            if (diff > -0.03490658503988659 * tv) {
                curval = -(float)(0.008726646259971648 * tv);
            }
            if (curval < -0.06981317007977318 * tv) {
                curval = -(float)(0.06981317007977318 * tv);
            }
        }
        return curval;
    }

    public void updateLegs() {
        if (!this.worldObj.isRemote)
            return;
        this.rotationYaw %= 360.0F;

        this.renderdata.gpcounter++;
        if (this.didonce == 0) {
            this.didonce = 1;
            initLegData();
        }
        float d1 = (float)(this.prevPosX - this.posX);
        float d2 = (float)(this.prevPosY - this.posY);
        float d3 = (float)(this.prevPosZ - this.posZ);
        float realv = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
        int i;
        for (i = 0; i < 6; i++) {
            int fcount = 0;
            this.renderdata.footingticker[i] = this.renderdata.footingticker[i] + 1;
            this.renderdata.realposx[i] = (float)(this.posX - this.renderdata.legoff[i] * Math.sin(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i]));
            this.renderdata.realposz[i] = (float)(this.posZ + this.renderdata.legoff[i] * Math.cos(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i]));
            this.renderdata.realposy[i] = (float)this.posY + this.renderdata.yoff[i];
            int it = this.renderdata.footingticker[i] + this.renderdata.footingticker[this.renderdata.pairedwith[i]];
            if (it > 50 && this.renderdata.footingticker[i] > this.renderdata.footingticker[this.renderdata.pairedwith[i]])
                this.renderdata.footingticker[i] = 0;
            d1 = this.renderdata.realposx[i] - this.renderdata.foot_xpos[i];
            d2 = this.renderdata.realposy[i] - this.renderdata.foot_ypos[i];
            d3 = this.renderdata.realposz[i] - this.renderdata.foot_zpos[i];
            float dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
            dd *= 16.0F;
            float da = (float)(Math.abs(this.renderdata.ycurrentangle[i] - Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw)) + this.renderdata.ymid[i]) % 6.283185307179586D);
            if (da > Math.PI)
                da = (float)(da - 6.283185307179586D);
            if (da < -3.141592653589793D)
                da = (float)(da + 6.283185307179586D);
            da = Math.abs(da);
            if (dd > 144.0F || dd < 22.0F || da > Math.abs(this.renderdata.yrange[i]) * 8.0F / 6.0F || Math.abs(this.renderdata.udcurrentangle[i]) > 1.25D || this.renderdata.footingticker[i] == 0) {
                findNewFooting(i);
                d1 = this.renderdata.realposx[i] - this.renderdata.foot_xpos[i];
                d2 = this.renderdata.realposy[i] - this.renderdata.foot_ypos[i];
                d3 = this.renderdata.realposz[i] - this.renderdata.foot_zpos[i];
                dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
                dd *= 16.0F;
            }
            float c1 = (float)(49.0D * Math.cos(this.renderdata.p2xangle[i] - this.renderdata.p1xangle[i]));
            float c2 = 49.0F;
            float c3 = (float)(49.0D * Math.cos(this.renderdata.p2xangle[i] - this.renderdata.p3xangle[i]));
            float cc = c1 + c2 + c3;
            float diff = cc - dd;
            this.renderdata.pxvelocity[i] = getNewVelocity(realv, (float)(diff * Math.PI / 360.0D), this.renderdata.pxvelocity[i]);
            if (this.renderdata.pxvelocity[i] == 0.0F || Math.abs(diff) < 8.0F)
                fcount++;
            this.renderdata.p1xangle[i] = this.renderdata.p1xangle[i] + this.renderdata.pxvelocity[i];
            this.renderdata.p2xangle[i] = 0.0D;
            this.renderdata.p3xangle[i] = -this.renderdata.p1xangle[i];
            if (this.renderdata.uppoint[i] != 0.0F) {
                dd = (float)Math.atan2(dd, (this.renderdata.realposy[i] - this.renderdata.uppoint[i]) * 16.0D);
            } else {
                dd = (float)Math.atan2(dd, (this.renderdata.realposy[i] - this.renderdata.foot_ypos[i]) * 16.0D);
            }
            this.renderdata.udwantedangle[i] = (float)(dd - 1.5707963267948966D);
            double rhm = this.renderdata.udwantedangle[i];
            double rhdir = this.renderdata.udcurrentangle[i];
            double rdv = (rhm - rhdir) % 6.283185307179586D;
            diff = (float)rdv;
            this.renderdata.udvelocity[i] = getNewVelocity(realv * 2.0F, diff, this.renderdata.udvelocity[i]);
            if (this.renderdata.udvelocity[i] == 0.0F || Math.abs(diff) < 0.03490658503988659D) {
                this.renderdata.uppoint[i] = 0.0F;
                fcount++;
            }
            rhdir += this.renderdata.udvelocity[i];
            dd = this.renderdata.udcurrentangle[i] = (float)rhdir;
            this.renderdata.uddisplayangle[i] = dd;
            d1 = this.renderdata.realposx[i] - this.renderdata.foot_xpos[i];
            d3 = this.renderdata.realposz[i] - this.renderdata.foot_zpos[i];
            dd = (float)Math.atan2(d3, d1);
            this.renderdata.ywantedangle[i] = dd;
            rhm = dd;
            rhdir = this.renderdata.ycurrentangle[i];
            rdv = (rhm - rhdir) % 6.283185307179586D;
            if (rdv > Math.PI)
                rdv -= 6.283185307179586D;
            if (rdv < -3.141592653589793D)
                rdv += 6.283185307179586D;
            diff = (float)rdv;
            this.renderdata.yvelocity[i] = getNewVelocity(realv, diff, this.renderdata.yvelocity[i]);
            if (this.renderdata.yvelocity[i] == 0.0F || Math.abs(diff) < 0.03490658503988659D)
                fcount++;
            this.renderdata.ycurrentangle[i] = this.renderdata.ycurrentangle[i] + this.renderdata.yvelocity[i];
            dd = (float)(this.renderdata.ycurrentangle[i] - Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw)) - 1.5707963267948966D);
            this.renderdata.ydisplayangle[i] = dd;
            if (fcount == 3)
                this.renderdata.footup[i] = 0;
        }
    }
    
    private void findNewFooting(final int i) {
        float f = 9.0f;
        int found = 0;
        float range;
        final double rhdir = Math.toRadians((this.rotationYaw + 90.0f) % 360.0f);
        final double pi = 3.1415926545;
        this.renderdata.footingticker[i] = 0;
        float d1 = (float)(this.posX - this.prevPosX);
        float d2 = (float)(this.posZ - this.prevPosZ);
        final double rhm = Math.atan2(d2, d1);
        final double velocity = Math.sqrt(d1 * d1 + d2 * d2);
        double rdv = Math.abs(rhm - rhdir) % (pi * 2.0);
        if (rdv > pi) {
            rdv -= pi * 2.0;
        }
        rdv = Math.abs(rdv);
        if (Math.abs(velocity) < 0.01) {
            rdv = 0.0;
        }
        range = this.renderdata.yrange[i];
        range *= 0.8f;
        if (Math.abs((this.prevRotationYaw - this.rotationYaw) % 360.0f) > 0.75f) {
            range = 0.0f;
        }
        if (i >= 4) {
            f = 4.0f;
        }
        if (rdv > 1.5) {
            range = -range;
            f = 4.0f;
            if (i >= 4) {
                f = 9.0f;
            }
        }
        if (i == 0 || i == 1) {
            f = 6.0f;
        }
        final float deffx;
        float fx = deffx = (float)(this.renderdata.realposx[i] - f / 2.0f * Math.sin(Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw + 90.0f)) + this.renderdata.ymid[i]));
        final float deffz;
        float fz = deffz = (float)(this.renderdata.realposz[i] + f / 2.0f * Math.cos(Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw + 90.0f)) + this.renderdata.ymid[i]));
        final float deffy;
        float fy = deffy = this.renderdata.realposy[i] - 1.0f;
        final float oldf = f;
        int span = 1;
        while (found == 0 && f > 2.5f) {
            fx = (float)(this.renderdata.realposx[i] - f * Math.sin(Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw + 90.0f)) + this.renderdata.ymid[i] - range));
            fz = (float)(this.renderdata.realposz[i] + f * Math.cos(Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw + 90.0f)) + this.renderdata.ymid[i] - range));
            fy = this.renderdata.realposy[i];
            for (int j = 8; found == 0 && j > -9; --j) {
                for (int m = -span; found == 0 && m <= span; ++m) {
                    for (int n = -span; n <= span; ++n) {
                        final Block blk = this.worldObj.getBlock((int)fx + m, (int)fy + j, (int)fz + n);
                        if (blk != Blocks.air && this.worldObj.getBlock((int)fx + m, (int)fy + j, (int)fz + n).getMaterial().isSolid()) {
                            d1 = this.renderdata.realposx[i] - (fx + m);
                            final float d3 = this.renderdata.realposy[i] - (fy + j + 1.0f);
                            d2 = this.renderdata.realposz[i] - (fz + n);
                            float dd = (float)Math.sqrt(d1 * d1 + d3 * d3 + d2 * d2);
                            dd *= 16.0f;
                            if (dd <= 144.0f) {
                                fy += j + 1;
                                fx += m;
                                fz += n;
                                found = 1;
                                break;
                            }
                        }
                    }
                }
            }
            --f;
            if (f < 2.5f && range != 0.0f) {
                range = 0.0f;
                span = 3;
                f = oldf;
            }
        }
        if (found == 0) {
            fx = deffx;
            fy = deffy;
            fz = deffz;
        }
        final float sfx = this.renderdata.foot_xpos[i];
        final float sfy = this.renderdata.foot_ypos[i];
        final float sfz = this.renderdata.foot_zpos[i];
        this.renderdata.foot_xpos[i] = fx;
        this.renderdata.foot_ypos[i] = fy;
        this.renderdata.foot_zpos[i] = fz;
        if (this.renderdata.footup[i] == 0) {
            this.renderdata.footup[i] = 1;
            d1 = sfx - fx;
            final float d3 = sfy - fy;
            d2 = sfz - fz;
            float dd = (float)Math.sqrt(d1 * d1 + d3 * d3 + d2 * d2);
            dd *= 16.0f;
            d1 = (sfy + fy) / 2.0f;
            if (dd > 3.0f) {
                d1 += 0.3f;
            }
            if (dd > 24.0f) {
                d1 += 0.6f;
            }
            if (dd > 50.0f) {
                d1 += 0.6f;
            }
            this.renderdata.uppoint[i] = d1;
        }
    }
    
    public boolean shouldRiderSit() {
        return true;
    }
    protected boolean canTriggerWalking() {
        return true;
    }
    
    protected void entityInit() {
        super.entityInit();
        this.func_110163_bv();
        this.initLegData();
        int i = 0;
        this.dataWatcher.addObject(20, i);
    }
    
    public RenderSpiderRobotInfo getRenderSpiderRobotInfo() {
        return this.renderdata;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    public double getMountedYOffset() {
        return 0.55 + Math.cos(this.rideTicker * 0.19f) * 0.02;
    }
    
    public void updateRiderPosition() {
        if (this.riddenByEntity != null) {
            float f = -1.25f;
            f += (float)(Math.cos(this.rideTicker * 0.33f) * 0.05);
            this.riddenByEntity.setPosition(this.posX - f * Math.sin(Math.toRadians(this.rotationYaw)), this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + f * Math.cos(Math.toRadians(this.rotationYaw)));
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        if (par1DamageSource.getDamageType().equals("inWall")) {
            return false;
        }
        if (par1DamageSource.getDamageType().equals("cactus")) {
            return false;
        }
        if (par1DamageSource.getDamageType().equals("inFire")) {
            return false;
        }
        if (par1DamageSource.getDamageType().equals("onFire")) {
            return false;
        }
        if (par1DamageSource.getDamageType().equals("magic")) {
            return false;
        }
        if (par1DamageSource.getDamageType().equals("starve")) {
            return false;
        }
        final Entity e = par1DamageSource.getEntity();
        if (e instanceof EntityLiving) {
            this.setAttackTarget((EntityLivingBase)e);
            this.faceEntity(e, 20.0f, 20.0f);
        }
        return super.attackEntityFrom(par1DamageSource, par2);
    }
    
    protected void fall(final float par1) {
    }
    
    protected void updateFallState(final double par1, final boolean par3) {
    }
    
    public boolean canBeCollidedWith() {
        return !this.isDead;
    }
    
    @SideOnly(Side.CLIENT)
    public void setPositionAndRotation2(final double par1, final double par3, final double par5, final float par7, final float par8, final int par9) {
        if (this.riddenByEntity != null) {
            this.boatPosRotationIncrements = par9 + 8;
        }
        else {
            this.boatPosRotationIncrements = par9 + 6;
        }
        this.boatX = par1;
        this.boatY = par3;
        this.boatZ = par5;
        this.boatYaw = par7;
        this.boatPitch = par8;
    }
    
    @SideOnly(Side.CLIENT)
    public void setVelocity(final double par1, final double par3, final double par5) {
        if (this.riddenByEntity == null) {
            super.setVelocity(par1, par3, par5);
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.setFire(0);
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && !this.worldObj.isRemote && this.riddenByEntity != null && this.worldObj.rand.nextInt(50) == 0) {
            this.feetFindSomethingToHit();
        }
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && !this.worldObj.isRemote && this.riddenByEntity != null && this.worldObj.rand.nextInt(9) == 0) {
            EntityLivingBase e;
            e = this.findSomethingToAttack(1.0f, true);
            if (e != null) {
                if (this.getDistanceSqToEntity(e) < (6.0f + e.width / 2.0f) * (6.0f + e.width / 2.0f)) {
                    this.setAttacking(1);
                    this.attackEntityAsMob(e);
                }
            }
            else {
                this.setAttacking(0);
            }
        }
        final float f = 4.0f;
        float dx = (float)(f * Math.cos(Math.toRadians(this.rotationYaw - 80.0f)));
        float dz = (float)(f * Math.sin(Math.toRadians(this.rotationYaw - 80.0f)));
        final float dx2 = (float)(f * Math.cos(Math.toRadians(this.rotationYaw - 90.0f)));
        final float dz2 = (float)(f * Math.sin(Math.toRadians(this.rotationYaw - 90.0f)));
        if (this.worldObj.rand.nextInt(18) == 0) {
            this.worldObj.spawnParticle("flame", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
        if (this.worldObj.rand.nextInt(7) == 0) {
            this.worldObj.spawnParticle("smoke", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
        if (this.worldObj.rand.nextInt(16) == 0) {
            this.worldObj.spawnParticle("fireworksSpark", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
        dx = (float)(f * Math.cos(Math.toRadians(this.rotationYaw - 100.0f)));
        dz = (float)(f * Math.sin(Math.toRadians(this.rotationYaw - 100.0f)));
        if (this.worldObj.rand.nextInt(18) == 0) {
            this.worldObj.spawnParticle("flame", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
        if (this.worldObj.rand.nextInt(7) == 0) {
            this.worldObj.spawnParticle("smoke", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
        if (this.worldObj.rand.nextInt(16) == 0) {
            this.worldObj.spawnParticle("fireworksSpark", this.posX + dx, this.posY + 0.5, this.posZ + dz, dx2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f, (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0f, dz2 / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0f);
        }
    }

    public void onLivingUpdate() {
        double velocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        double obstruction_factor;
        double relative_g;
        double max_speed = 0.3D;
        double gh = 1.75D;
        int dist;
        if (this.isDead)
            return;
        if (this.riddenByEntity == null)
            super.onLivingUpdate();
        if (this.motionY > 0.8500000238418579D)
            this.motionY = 0.8500000238418579D;
        if (this.motionY < -0.8500000238418579D)
            this.motionY = -0.8500000238418579D;
        if (this.motionX < -1.25D)
            this.motionX = -1.25D;
        if (this.motionX > 1.25D)
            this.motionX = 1.25D;
        if (this.motionZ < -1.25D)
            this.motionZ = -1.25D;
        if (this.motionZ > 1.25D)
            this.motionZ = 1.25D;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.rideTicker += this.worldObj.rand.nextInt(3);
        if (this.playing > 0)
            this.playing--;
        if (this.riddenByEntity != null && this.playing == 0 && this.worldObj.rand.nextInt(80) == 1) {
            this.worldObj.playSoundAtEntity(this, "orespawn:robotspider", 0.35F, 1.0F);
            this.playing = 125;
        }
        if (this.worldObj.isRemote) {
            if (this.riddenByEntity == null) {
                Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh + 1.0F), (int)this.posZ);
                if (bid == Blocks.air)
                    bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
                if (bid != Blocks.air && bid != Blocks.water && bid != Blocks.flowing_water && bid != Blocks.lava && bid != Blocks.flowing_lava) {
                    this.motionY += 0.12D;
                    this.posY += 0.12D;
                    this.boatY += 0.12D;
                } else {
                    this.motionY -= 0.002D;
                }
            }
            if (this.boatPosRotationIncrements > 0) {
                double d4 = this.posX + (this.boatX - this.posX) / this.boatPosRotationIncrements;
                double d5 = this.posY + (this.boatY - this.posY) / this.boatPosRotationIncrements;
                double d11 = this.posZ + (this.boatZ - this.posZ) / this.boatPosRotationIncrements;
                setPosition(d4, d5, d11);
                this.rotationPitch = (float)(this.rotationPitch + (this.boatPitch - this.rotationPitch) / this.boatPosRotationIncrements);
                double d10 = MathHelper.wrapAngleTo180_double(this.boatYaw - this.rotationYaw);
                if (this.riddenByEntity != null)
                    d10 = MathHelper.wrapAngleTo180_double(this.riddenByEntity.rotationYaw - this.rotationYaw);
                this.rotationYaw = (float)(this.rotationYaw + d10 / this.boatPosRotationIncrements);
                setRotation(this.rotationYaw, this.rotationPitch);
                this.boatPosRotationIncrements--;
            } else {
                double d4 = this.posX + this.motionX;
                double d5 = this.posY + this.motionY;
                double d11 = this.posZ + this.motionZ;
                setPosition(d4, d5, d11);
                this.motionX *= 0.99D;
                this.motionY *= 0.95D;
                this.motionZ *= 0.99D;
            }
            updateLegs();
        } else {
            if (this.riddenByEntity != null) {
                gh = 2.25D;
                Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
                if (bid != Blocks.air && bid != Blocks.water && bid != Blocks.flowing_water && bid != Blocks.lava && bid != Blocks.flowing_lava) {
                    this.motionY += 0.06D;
                    this.posY += 0.03D;
                } else {
                    this.motionY -= 0.02D;
                }
            } else {
                Block bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh + 1.0F), (int)this.posZ);
                if (bid == Blocks.air)
                    bid = this.worldObj.getBlock((int)this.posX, (int)((float)this.posY - (float)gh), (int)this.posZ);
                if (bid != Blocks.air && bid != Blocks.water && bid != Blocks.flowing_water && bid != Blocks.lava && bid != Blocks.flowing_lava) {
                    this.motionY += 0.15D;
                    this.posY += 0.15D;
                    this.boatY += 0.15D;
                } else {
                    this.motionY -= 0.002D;
                }
            }
            if (this.riddenByEntity != null) {
                EntityPlayer pp = (EntityPlayer)this.riddenByEntity;
                obstruction_factor = 0.0D;
                dist = 3;
                dist += (int)(velocity * 6.0D);
                for (int k = 1; k < dist; k++) {
                    for (int i = 1; i < dist * 2; i++) {
                        for (int j = -90; j <= 90; j += 30) {
                            double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F + j)));
                            double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F + j)));
                            Block block = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
                            if (block != Blocks.air && block != Blocks.water && block != Blocks.flowing_water && block != Blocks.lava && block != Blocks.flowing_lava)
                                obstruction_factor += 0.02D;
                        }
                    }
                }
                this.motionY += obstruction_factor * 0.05D;
                this.posY += obstruction_factor * 0.05D;
                double d4 = this.riddenByEntity.rotationYaw;
                d4 %= 360.0D;
                double d5 = this.rotationYaw;
                d5 %= 360.0D;
                relative_g = (d4 - d5) % 180.0D;
                if (relative_g > 90.0D)
                    relative_g -= 180.0D;
                if (velocity > 0.01D) {
                    d4 = 1.85D - velocity;
                    d4 = Math.abs(d4);
                    if (d4 < 0.01D)
                        d4 = 0.01D;
                    if (d4 > 0.9D)
                        d4 = 0.9D;
                    this.rotationYaw = this.riddenByEntity.rotationYaw + (float)(relative_g * d4);
                } else {
                    this.rotationYaw = this.riddenByEntity.rotationYaw;
                }
                this.rotationPitch = 0.0F;
                setRotation(this.rotationYaw, this.rotationPitch);
                double newvelocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
                double rhm = Math.atan2(this.motionZ, this.motionX);
                double rhdir = Math.toRadians(((this.riddenByEntity.rotationYaw + 90.0F) % 360.0F));
                double pi = 3.1415926545D;
                double deltav;
                float im = pp.moveForward;
                double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
                if (rdv > pi)
                    rdv -= pi * 2.0D;
                rdv = Math.abs(rdv);
                if (Math.abs(newvelocity) < 0.01D)
                    rdv = 0.0D;
                if (rdv > 1.5D)
                    newvelocity = -newvelocity;
                if (Math.abs(im) > 0.001F) {
                    if (im > 0.0F) {
                        deltav = 0.05D;
                    } else {
                        max_speed = 0.25D;
                        deltav = -0.05D;
                    }
                    newvelocity += deltav;
                    if (newvelocity >= 0.0D) {
                        if (newvelocity > max_speed)
                            newvelocity = max_speed;
                        this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
                        this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
                    } else {
                        if (newvelocity < -max_speed)
                            newvelocity = -max_speed;
                        newvelocity = -newvelocity;
                        this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity;
                        this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity;
                    }
                } else if (newvelocity >= 0.0D) {
                    this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
                    this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 90.0F))) * newvelocity;
                } else {
                    this.motionX = Math.cos(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity * -1.0D;
                    this.motionZ = Math.sin(Math.toRadians((this.rotationYaw + 270.0F))) * newvelocity * -1.0D;
                }
                moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= 0.98D;
                this.motionY *= 0.98D;
                this.motionZ *= 0.98D;
            }
            moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.8D;
            this.motionY *= 0.98D;
            this.motionZ *= 0.8D;
            if (this.riddenByEntity != null && this.riddenByEntity.isDead)
                this.riddenByEntity = null;
        }
    }
    
    public void goThisWay(final double mx, final double mz) {
        this.motionX = mx;
        this.motionZ = mz;
    }
    
    public boolean isAIEnabled() {
        return this.riddenByEntity == null;
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("AntRobotOwned", this.owned);
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.owned = par1NBTTagCompound.getInteger("AntRobotOwned");
    }
    
    public float getShadowSize() {
        return 0.95f;
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2 != null && var2.stackSize <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
            var2 = null;
        }
        if (this.owned == 0) {
            return true;
        }
        if (var2 != null && var2.getItem() == Items.iron_ingot && par1EntityPlayer.getDistanceSqToEntity(this) < 25.0) {
            if (!this.worldObj.isRemote) {
                float f = this.getMaxHealth() - this.getHealth();
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f > 0.0f) {
                    this.heal(f);
                }
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                --var2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
                }
            }
            return true;
        }
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer) {
            return true;
        }
        if (!this.worldObj.isRemote && this.riddenByEntity == null && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0) {
            par1EntityPlayer.mountEntity(this);
            this.worldObj.playSoundAtEntity(this, "orespawn:robotspidermount", 0.45f, 1.0f);
        }
        return true;
    }
    
    private void feetFindSomethingToHit() {
        if (OreSpawnMain.PlayNicely != 0) {
            return;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0, 8.0, 10.0));
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.feetisSuitableTarget(var8)) {
                this.feetattackEntityAsMob(var8);
            }
        }
    }
    
    private boolean feetisSuitableTarget(final EntityLivingBase par1EntityLiving) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (par1EntityLiving instanceof AntRobot) {
            return false;
        }
        if (par1EntityLiving == this.riddenByEntity) {
            return false;
        }
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        final float d1 = (float)(par1EntityLiving.posX - this.posX);
        final float d2 = (float)(par1EntityLiving.posY - this.posY);
        final float d3 = (float)(par1EntityLiving.posZ - this.posZ);
        final float dd = (float)Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
        if (dd > 9.0f) {
            return false;
        }
        if (dd < 6.0f) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return true;
    }
    
    public void feetattackEntityAsMob(final Entity par1Entity) {
        boolean ret;
        if (par1Entity instanceof EntityLivingBase) {
            final double ks = 0.6;
            double inair = 0.1;
            final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
            ret = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), OreSpawnMain.AntRobot_stats.attack / 10.0f);
            if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                inair *= 2.0;
            }
            if (ret) {
                par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
            }
        }
    }
    
    private EntityLivingBase findSomethingToAttack(final float distmul, final boolean dircheck) {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(12.0 * distmul, 12.0, 12.0 * distmul));
        final Iterator var6 = var5.iterator();
        Entity var7;
        EntityLivingBase var8;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, dircheck)) {
                return var8;
            }
        }
        return null;
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (par1EntityLiving instanceof AntRobot) {
            return false;
        }
        if (par1EntityLiving == this.riddenByEntity) {
            return false;
        }
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee(par1EntityLiving)) {
            return false;
        }
        if (par2) {
            final double rr = Math.atan2(par1EntityLiving.posZ - this.posZ, par1EntityLiving.posX - this.posX);
            final double rhdir = Math.toRadians((this.rotationYaw + 90.0f) % 360.0f);
            final double pi = 3.1415926545;
            double rdd = Math.abs(rr - rhdir) % (pi * 2.0);
            if (rdd > pi) {
                rdd -= pi * 2.0;
            }
            rdd = Math.abs(rdd);
            if (this.getDistanceSqToEntity(par1EntityLiving) < 36.0) {
                return true;
            }
            if (rdd > 0.75) {
                return false;
            }
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        return true;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        boolean ret = false;
        if (par1Entity instanceof EntityLivingBase) {
            final double ks = 0.7;
            double inair = 0.1;
            final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
            ret = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)OreSpawnMain.AntRobot_stats.attack);
            if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                inair *= 2.0;
            }
            if (ret) {
                par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
            }
        }
        return ret;
    }
    
    public int getAttacking() {
        return this.dataWatcher.getWatchableObjectInt(20);
    }
    
    public void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, par1);
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    private void dropItemRand(final Item index) {
        EntityItem var3;
        final ItemStack is = new ItemStack(index, 1, 0);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
        this.worldObj.spawnEntityInWorld(var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int i = 7 + this.worldObj.rand.nextInt(7), var4 = 0; var4 < i; ++var4) {
            final int var5 = this.worldObj.rand.nextInt(12);
            switch (var5) {
                case 0: {
                    this.dropItemRand(Items.redstone);
                    break;
                }
                case 1: {
                    this.dropItemRand(Items.repeater);
                    break;
                }
                case 2: {
                    this.dropItemRand(Items.comparator);
                    break;
                }
                case 3: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.redstone_block));
                    break;
                }
                case 4: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.dispenser));
                    break;
                }
                case 5: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.sticky_piston));
                    break;
                }
                case 6: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.piston));
                    break;
                }
                case 7: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.lever));
                    break;
                }
                case 8: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.redstone_block));
                    break;
                }
                case 9: {
                    this.dropItemRand(Item.getItemFromBlock(Blocks.light_weighted_pressure_plate));
                    break;
                }
                case 10: {
                    this.dropItemRand(Items.iron_ingot);
                    break;
                }
            }
        }
    }
}
