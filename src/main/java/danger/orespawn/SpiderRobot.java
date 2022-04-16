package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class SpiderRobot extends EntityLiving {
  private int boatPosRotationIncrements;
  
  private double boatX;
  
  private double boatY;
  
  private double boatZ;
  
  private double boatYaw;
  
  private double boatPitch;
  
  private int playing = 0;
  
  private GenericTargetSorter TargetSorter = null;
  
  private float moveSpeed = 0.35F;
  
  private RenderSpiderRobotInfo renderdata = new RenderSpiderRobotInfo();
  
  private int didonce = 0;
  
  private int rideTicker = 0;
  
  public SpiderRobot(World par1World) {
    super(par1World);
    setSize(3.25F, 2.25F);
    this.riddenByEntity = null;
    this.TargetSorter = new GenericTargetSorter((Entity)this);
    this.tasks.addTask(0, (EntityAIBase)new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
    this.tasks.addTask(1, (EntityAIBase)new EntityAILookIdle(this));
    this.isImmuneToFire = true;
    this.experienceValue = OreSpawnMain.SpiderRobot_stats.health / 2;
  }
  
  public SpiderRobot(World par1World, double par2, double par4, double par6) {
    this(par1World);
    setPosition(par2, par4 + this.yOffset, par6);
    this.motionX = 0.0D;
    this.motionY = 0.0D;
    this.motionZ = 0.0D;
    this.prevPosX = par2;
    this.prevPosY = par4;
    this.prevPosZ = par6;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(OreSpawnMain.SpiderRobot_stats.health);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(OreSpawnMain.SpiderRobot_stats.attack);
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public int getTotalArmorValue() {
    return OreSpawnMain.SpiderRobot_stats.defense;
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    if (this.riddenByEntity != null)
      return; 
    super.updateAITasks();
  }
  
  protected void updateAITick() {
    if (this.riddenByEntity != null)
      return; 
    super.updateAITick();
  }
  
  private void initLegData() {
    if (this.renderdata == null)
      this.renderdata = new RenderSpiderRobotInfo(); 
    for (int i = 0; i < 8; i++) {
      this.renderdata.ycurrentangle[i] = 0.0F;
      this.renderdata.ywantedangle[i] = 0.0F;
      this.renderdata.ydisplayangle[i] = 0.0F;
      this.renderdata.yvelocity[i] = 0.0F;
      this.renderdata.ymid[i] = 0.0F;
      this.renderdata.yoff[i] = 0.0F;
      this.renderdata.yrange[i] = 0.0F;
      this.renderdata.udcurrentangle[i] = 0.0F;
      this.renderdata.udwantedangle[i] = 0.0F;
      this.renderdata.uddisplayangle[i] = 0.0F;
      this.renderdata.udvelocity[i] = 0.0F;
      this.renderdata.p1xangle[i] = 0.7853981633974483D;
      this.renderdata.p2xangle[i] = 0.0D;
      this.renderdata.p3xangle[i] = -0.7853981633974483D;
      this.renderdata.pxvelocity[i] = 0.0F;
      this.renderdata.foot_xpos[i] = (float)this.posX;
      this.renderdata.foot_ypos[i] = (float)this.posY;
      this.renderdata.foot_zpos[i] = (float)this.posZ;
      this.renderdata.realposx[i] = 0.0F;
      this.renderdata.realposy[i] = 0.0F;
      this.renderdata.realposz[i] = 0.0F;
      this.renderdata.legoff[i] = 0.0F;
      this.renderdata.footup[i] = 1;
      this.renderdata.uppoint[i] = 0.0F;
      this.renderdata.footingticker[i] = 0;
      this.renderdata.gpcounter = 0;
      if (i == 0) {
        this.renderdata.legoff[i] = 1.25F;
        this.renderdata.ymid[i] = -0.32F;
        this.renderdata.yrange[i] = 0.2617994F;
        this.renderdata.pairedwith[i] = 1;
        this.renderdata.yoff[i] = -0.3F;
      } 
      if (i == 1) {
        this.renderdata.legoff[i] = 1.25F;
        this.renderdata.ymid[i] = 3.4615927F;
        this.renderdata.yrange[i] = -0.2617994F;
        this.renderdata.pairedwith[i] = 0;
        this.renderdata.yoff[i] = -0.3F;
      } 
      if (i == 2) {
        this.renderdata.legoff[i] = 2.0F;
        this.renderdata.ymid[i] = -1.0F;
        this.renderdata.yrange[i] = 0.2617994F;
        this.renderdata.pairedwith[i] = 3;
        this.renderdata.yoff[i] = -0.1F;
      } 
      if (i == 3) {
        this.renderdata.legoff[i] = 2.0F;
        this.renderdata.ymid[i] = 4.1415925F;
        this.renderdata.yrange[i] = -0.2617994F;
        this.renderdata.pairedwith[i] = 2;
        this.renderdata.yoff[i] = -0.1F;
      } 
      if (i == 4) {
        this.renderdata.legoff[i] = 1.75F;
        this.renderdata.ymid[i] = 0.62831855F;
        this.renderdata.yrange[i] = 0.2617994F;
        this.renderdata.pairedwith[i] = 5;
        this.renderdata.yoff[i] = -0.3F;
      } 
      if (i == 5) {
        this.renderdata.legoff[i] = 1.75F;
        this.renderdata.ymid[i] = 2.5132742F;
        this.renderdata.yrange[i] = -0.2617994F;
        this.renderdata.pairedwith[i] = 4;
        this.renderdata.yoff[i] = -0.3F;
      } 
      if (i == 6) {
        this.renderdata.legoff[i] = 3.4F;
        this.renderdata.ymid[i] = 1.05F;
        this.renderdata.yrange[i] = 0.2617994F;
        this.renderdata.pairedwith[i] = 7;
        this.renderdata.yoff[i] = -0.1F;
      } 
      if (i == 7) {
        this.renderdata.legoff[i] = 3.4F;
        this.renderdata.ymid[i] = 2.0915928F;
        this.renderdata.yrange[i] = -0.2617994F;
        this.renderdata.pairedwith[i] = 6;
        this.renderdata.yoff[i] = -0.1F;
      } 
    } 
  }
  
  private float getNewVelocity(float v, float diff, float curval) {
    float tv = v;
    tv *= 8.0F;
    if (tv < 1.0F)
      tv = 1.0F; 
    if (tv > 4.0F)
      tv = 4.0F; 
    if (diff > 0.0F) {
      if (diff < 0.008726646259971648D * tv) {
        curval = 0.0F;
      } else {
        curval = (float)(curval + 0.004363323129985824D * tv);
        if (diff < 0.06981317007977318D * tv)
          curval = (float)(0.017453292519943295D * tv); 
        if (diff < 0.03490658503988659D * tv)
          curval = (float)(0.008726646259971648D * tv); 
        if (curval > 0.06981317007977318D * tv)
          curval = (float)(0.06981317007977318D * tv); 
      } 
    } else if (diff > -0.008726646259971648D * tv) {
      curval = 0.0F;
    } else {
      curval = (float)(curval - 0.004363323129985824D * tv);
      if (diff > -0.06981317007977318D * tv)
        curval = -((float)(0.017453292519943295D * tv)); 
      if (diff > -0.03490658503988659D * tv)
        curval = -((float)(0.008726646259971648D * tv)); 
      if (curval < -0.06981317007977318D * tv)
        curval = -((float)(0.06981317007977318D * tv)); 
    } 
    return curval;
  }
  
  public void updateLegs() {
    if (!this.worldObj.isRemote)
      return; 
    this.rotationYaw %= 360.0F;
    for (; this.rotationYaw < 0.0F; this.rotationYaw += 360.0F);
    this.renderdata.gpcounter++;
    if (this.didonce == 0) {
      this.didonce = 1;
      initLegData();
    } 
    float d1 = (float)(this.prevPosX - this.posX);
    float d2 = (float)(this.prevPosY - this.posY);
    float d3 = (float)(this.prevPosZ - this.posZ);
    float realv = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
    int i = 0;
    for (i = 0; i < 8; i++) {
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
      if (dd > 294.0F || dd < 32.0F || da > Math.abs(this.renderdata.yrange[i]) * 8.0F / 7.0F || Math.abs(this.renderdata.udcurrentangle[i]) > 1.25D || this.renderdata.footingticker[i] == 0) {
        findNewFooting(i);
        d1 = this.renderdata.realposx[i] - this.renderdata.foot_xpos[i];
        d2 = this.renderdata.realposy[i] - this.renderdata.foot_ypos[i];
        d3 = this.renderdata.realposz[i] - this.renderdata.foot_zpos[i];
        dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
        dd *= 16.0F;
      } 
      float c1 = (float)(99.0D * Math.cos(this.renderdata.p2xangle[i] - this.renderdata.p1xangle[i]));
      float c2 = 99.0F;
      float c3 = (float)(99.0D * Math.cos(this.renderdata.p2xangle[i] - this.renderdata.p3xangle[i]));
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
      for (; this.renderdata.udwantedangle[i] > Math.PI; this.renderdata.udwantedangle[i] = (float)(this.renderdata.udwantedangle[i] - 6.283185307179586D));
      for (; this.renderdata.udwantedangle[i] < -3.141592653589793D; this.renderdata.udwantedangle[i] = (float)(this.renderdata.udwantedangle[i] + 6.283185307179586D));
      double rhm = this.renderdata.udwantedangle[i];
      double rhdir = this.renderdata.udcurrentangle[i];
      double rdv = (rhm - rhdir) % 6.283185307179586D;
      for (; rdv > Math.PI; rdv -= 6.283185307179586D);
      for (; rdv < -3.141592653589793D; rdv += 6.283185307179586D);
      diff = (float)rdv;
      this.renderdata.udvelocity[i] = getNewVelocity(realv * 2.0F, diff, this.renderdata.udvelocity[i]);
      if (this.renderdata.udvelocity[i] == 0.0F || Math.abs(diff) < 0.03490658503988659D) {
        this.renderdata.uppoint[i] = 0.0F;
        fcount++;
      } 
      rhdir += this.renderdata.udvelocity[i];
      for (; rhdir > Math.PI; rhdir -= 6.283185307179586D);
      for (; rhdir < -3.141592653589793D; rhdir += 6.283185307179586D);
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
      for (; this.renderdata.ycurrentangle[i] > Math.PI; this.renderdata.ycurrentangle[i] = (float)(this.renderdata.ycurrentangle[i] - 6.283185307179586D));
      for (; this.renderdata.ycurrentangle[i] < -3.141592653589793D; this.renderdata.ycurrentangle[i] = (float)(this.renderdata.ycurrentangle[i] + 6.283185307179586D));
      dd = (float)(this.renderdata.ycurrentangle[i] - Math.toRadians(MathHelper.wrapAngleTo180_double(this.rotationYaw)) - 1.5707963267948966D);
      for (; dd > Math.PI; dd = (float)(dd - 6.283185307179586D));
      for (; dd < -3.141592653589793D; dd = (float)(dd + 6.283185307179586D));
      this.renderdata.ydisplayangle[i] = dd;
      if (fcount == 3) {
        this.renderdata.footup[i] = 0;
        Block bid = this.worldObj.getBlock((int)this.renderdata.foot_xpos[i], (int)this.renderdata.foot_ypos[i], (int)this.renderdata.foot_zpos[i]);
        if (bid == Blocks.tallgrass && this.riddenByEntity != null && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)this.renderdata.foot_xpos[i], (int)this.renderdata.foot_ypos[i], (int)this.renderdata.foot_zpos[i], Blocks.air); 
        bid = this.worldObj.getBlock((int)this.renderdata.foot_xpos[i], (int)this.renderdata.foot_ypos[i] - 1, (int)this.renderdata.foot_zpos[i]);
        if (bid == Blocks.grass && this.riddenByEntity != null && 
          this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"))
          this.worldObj.setBlock((int)this.renderdata.foot_xpos[i], (int)this.renderdata.foot_ypos[i] - 1, (int)this.renderdata.foot_zpos[i], Blocks.dirt); 
      } 
    } 
  }
  
  private void findNewFooting(int i) {
    float f = 16.0F;
    int found = 0;
    float range = 0.0F;
    double rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
    double pi = 3.1415926545D;
    this.renderdata.footingticker[i] = 0;
    float d1 = (float)(this.posX - this.prevPosX);
    float d3 = (float)(this.posZ - this.prevPosZ);
    double rhm = Math.atan2(d3, d1);
    double velocity = Math.sqrt((d1 * d1 + d3 * d3));
    double rdv = Math.abs(rhm - rhdir) % pi * 2.0D;
    if (rdv > pi)
      rdv -= pi * 2.0D; 
    rdv = Math.abs(rdv);
    if (Math.abs(velocity) < 0.01D)
      rdv = 0.0D; 
    range = this.renderdata.yrange[i];
    range *= 0.875F;
    if (Math.abs((this.prevRotationYaw - this.rotationYaw) % 360.0F) > 0.75F)
      range = 0.0F; 
    if (i >= 4)
      f = 10.0F; 
    if (rdv > 1.5D) {
      range = -range;
      f = 10.0F;
      if (i >= 4)
        f = 16.0F; 
    } 
    float fx = (float)(this.renderdata.realposx[i] - (f / 2.0F) * Math.sin(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i])), deffx = fx;
    float fz = (float)(this.renderdata.realposz[i] + (f / 2.0F) * Math.cos(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i])), deffz = fz;
    float fy = this.renderdata.realposy[i] - 1.0F, deffy = fy;
    float oldf = f;
    int span = 1;
    while (found == 0 && f > 3.5F) {
      fx = (float)(this.renderdata.realposx[i] - f * Math.sin(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i] - range));
      fz = (float)(this.renderdata.realposz[i] + f * Math.cos(Math.toRadians(MathHelper.wrapAngleTo180_double((this.rotationYaw + 90.0F))) + this.renderdata.ymid[i] - range));
      fy = this.renderdata.realposy[i];
      for (int j = 11; found == 0 && j > -14; j--) {
        for (int m = -span; found == 0 && m <= span; m++) {
          for (int n = -span; found == 0 && n <= span; n++) {
            Block blk = this.worldObj.getBlock((int)fx + m, (int)fy + j, (int)fz + n);
            if (blk != Blocks.air && 
              this.worldObj.getBlock((int)fx + m, (int)fy + j, (int)fz + n).getMaterial().isSolid()) {
              fy += (j + 1);
              fx += m;
              fz += n;
              found = 1;
              break;
            } 
          } 
        } 
      } 
      if (found == 1) {
        d1 = this.renderdata.realposx[i] - fx;
        float d2 = this.renderdata.realposy[i] - fy;
        d3 = this.renderdata.realposz[i] - fz;
        float dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
        dd *= 16.0F;
        if (dd > 294.0F)
          found = 0; 
      } 
      f--;
      if (f < 3.5F && 
        range != 0.0F) {
        range = 0.0F;
        span = 3;
        f = oldf;
      } 
    } 
    if (found == 0) {
      fx = deffx;
      fy = deffy;
      fz = deffz;
    } 
    float sfx = this.renderdata.foot_xpos[i];
    float sfy = this.renderdata.foot_ypos[i];
    float sfz = this.renderdata.foot_zpos[i];
    this.renderdata.foot_xpos[i] = fx;
    this.renderdata.foot_ypos[i] = fy;
    this.renderdata.foot_zpos[i] = fz;
    if (this.renderdata.footup[i] == 0) {
      this.renderdata.footup[i] = 1;
      d1 = sfx - fx;
      float d2 = sfy - fy;
      d3 = sfz - fz;
      float dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
      dd *= 16.0F;
      d1 = (sfy + fy) / 2.0F;
      if (dd > 3.0F)
        d1++; 
      if (dd > 48.0F)
        d1 += 1.5F; 
      if (dd > 100.0F)
        d1 += 1.5F; 
      this.renderdata.uppoint[i] = d1;
    } 
  }
  
  public boolean shouldRiderSit() {
    return false;
  }
  
  public int getTrackingRange() {
    return 128;
  }
  
  public int getUpdateFrequency() {
    return 10;
  }
  
  public boolean sendsVelocityUpdates() {
    return true;
  }
  
  protected boolean canTriggerWalking() {
    return true;
  }
  
  protected void entityInit() {
    super.entityInit();
    func_110163_bv();
    initLegData();
    this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
  }
  
  public RenderSpiderRobotInfo getRenderSpiderRobotInfo() {
    return this.renderdata;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  public double getMountedYOffset() {
    if (this.riddenByEntity != null && this.riddenByEntity instanceof SpiderDriver)
      return 2.0D; 
    return 2.625D + Math.cos((this.rideTicker * 0.19F)) * 0.02D;
  }
  
  public void updateRiderPosition() {
    if (this.riddenByEntity != null) {
      float f = -3.0F;
      f = (float)(f + Math.cos((this.rideTicker * 0.33F)) * 0.05D);
      this.riddenByEntity.setPosition(this.posX - f * Math.sin(Math.toRadians(this.rotationYaw)), this.posY + getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + f * Math.cos(Math.toRadians(this.rotationYaw)));
    } 
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    if (par1DamageSource.getDamageType().equals("inWall"))
      return false; 
    if (par1DamageSource.getDamageType().equals("cactus"))
      return false; 
    if (par1DamageSource.getDamageType().equals("inFire"))
      return false; 
    if (par1DamageSource.getDamageType().equals("onFire"))
      return false; 
    if (par1DamageSource.getDamageType().equals("magic"))
      return false; 
    if (par1DamageSource.getDamageType().equals("starve"))
      return false; 
    return super.attackEntityFrom(par1DamageSource, par2);
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean canBeCollidedWith() {
    return !this.isDead;
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
    if (this.riddenByEntity != null) {
      this.boatPosRotationIncrements = par9 + 8;
    } else {
      this.boatPosRotationIncrements = par9 + 6;
    } 
    this.boatX = par1;
    this.boatY = par3;
    this.boatZ = par5;
    this.boatYaw = par7;
    this.boatPitch = par8;
  }
  
  @SideOnly(Side.CLIENT)
  public void setVelocity(double par1, double par3, double par5) {
    if (this.riddenByEntity == null)
      super.setVelocity(par1, par3, par5); 
  }
  
  public void onUpdate() {
    super.onUpdate();
    setFire(0);
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && !this.worldObj.isRemote && this.riddenByEntity != null && this.worldObj.rand.nextInt(40) == 0)
      feetFindSomethingToHit(); 
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && !this.worldObj.isRemote && this.riddenByEntity != null && this.worldObj.rand.nextInt(15) == 0) {
      EntityLivingBase e = null;
      e = findSomethingToAttack();
      if (e != null) {
        if (getDistanceSqToEntity((Entity)e) < ((12.0F + e.width / 2.0F) * (12.0F + e.width / 2.0F))) {
          setAttacking(1);
          attackEntityAsMob((Entity)e);
        } 
      } else {
        setAttacking(0);
      } 
    } 
    float f = 8.0F;
    float dx = (float)(f * Math.cos(Math.toRadians((this.rotationYaw - 90.0F))));
    float dz = (float)(f * Math.sin(Math.toRadians((this.rotationYaw - 90.0F))));
    if (this.worldObj.rand.nextInt(8) == 0)
      this.worldObj.spawnParticle("flame", this.posX + dx, this.posY + 2.0D, this.posZ + dz, (dx / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0F), (dz / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F)); 
    if (this.worldObj.rand.nextInt(2) == 0)
      this.worldObj.spawnParticle("smoke", this.posX + dx, this.posY + 2.0D, this.posZ + dz, (dx / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 10.0F), (dz / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F)); 
    if (this.worldObj.rand.nextInt(10) == 0)
      this.worldObj.spawnParticle("fireworksSpark", this.posX + dx, this.posY + 2.0D, this.posZ + dz, (dx / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F), ((this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 5.0F), (dz / f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) / 20.0F)); 
  }
  
  public void onLivingUpdate() {
    List list = null;
    double velocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    double d6 = (this.rand.nextFloat() * 2.0F - 1.0F);
    double d7 = (this.rand.nextInt(2) * 2 - 1) * 0.7D;
    double obstruction_factor = 0.0D;
    double relative_g = 0.0D;
    double max_speed = 0.45D;
    double gh = 1.55D;
    int dist = 2;
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
      this.worldObj.playSoundAtEntity((Entity)this, "orespawn:robotspider", 0.45F, 1.0F);
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
      } else if (this.riddenByEntity instanceof EntityPlayer) {
        EntityClientPlayerMP pp = (EntityClientPlayerMP)this.riddenByEntity;
        pp.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C05PacketPlayerLook(pp.rotationYaw, pp.rotationPitch, pp.onGround));
        pp.sendQueue.addToSendQueue((Packet)new C0CPacketInput(pp.moveStrafing, pp.moveForward, pp.movementInput.jump, pp.movementInput.sneak));
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
        gh = 4.25D;
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
      if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
        EntityPlayer pp = (EntityPlayer)this.riddenByEntity;
        obstruction_factor = 0.0D;
        dist = 3;
        dist += (int)(velocity * 6.0D);
        for (int k = 1; k < dist; k++) {
          for (int i = 1; i < dist * 3; i++) {
            for (int j = -90; j <= 90; j += 30) {
              double dx = i * Math.cos(Math.toRadians((this.rotationYaw + 90.0F + j)));
              double dz = i * Math.sin(Math.toRadians((this.rotationYaw + 90.0F + j)));
              Block block = this.worldObj.getBlock((int)(this.posX + dx), (int)this.posY - k, (int)(this.posZ + dz));
              if (block != Blocks.air && block != Blocks.water && block != Blocks.flowing_water && block != Blocks.lava && block != Blocks.flowing_lava)
                obstruction_factor += 0.03D; 
            } 
          } 
        } 
        this.motionY += obstruction_factor * 0.05D;
        this.posY += obstruction_factor * 0.05D;
        double d4 = this.riddenByEntity.rotationYaw;
        d4 %= 360.0D;
        for (; d4 < 0.0D; d4 += 360.0D);
        double d5 = this.rotationYaw;
        d5 %= 360.0D;
        for (; d5 < 0.0D; d5 += 360.0D);
        relative_g = (d4 - d5) % 180.0D;
        for (; relative_g < 0.0D; relative_g += 180.0D);
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
        relative_g = Math.abs(relative_g) * velocity;
        if (relative_g > 50.0D)
          relative_g = 0.0D; 
        this.rotationPitch = 0.0F;
        setRotation(this.rotationYaw, this.rotationPitch);
        double newvelocity = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        double rr = Math.atan2(this.riddenByEntity.motionZ, this.riddenByEntity.motionX);
        double rhm = Math.atan2(this.motionZ, this.motionX);
        double rhdir = Math.toRadians(((this.riddenByEntity.rotationYaw + 90.0F) % 360.0F));
        double rt = 0.0D;
        double pi = 3.1415926545D;
        double deltav = 0.0D;
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
  
  public void goThisWay(double mx, double mz) {
    this.motionX = mx;
    this.motionZ = mz;
  }
  
  public boolean isAIEnabled() {
    if (this.riddenByEntity != null)
      return false; 
    return true;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {}
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {}
  
  public float getShadowSize() {
    return 0.95F;
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null && 
      var2.stackSize <= 0) {
      par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
      var2 = null;
    } 
    if (var2 != null && var2.getItem() == Items.iron_ingot && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 25.0D) {
      if (!this.worldObj.isRemote) {
        float f = getMaxHealth() - getHealth();
        if (f > 100.0F)
          f = 100.0F; 
        if (f > 0.0F)
          heal(f); 
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer)
      return true; 
    if (!this.worldObj.isRemote && this.riddenByEntity == null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      par1EntityPlayer.mountEntity((Entity)this);
      this.worldObj.playSoundAtEntity((Entity)this, "orespawn:robotspidermount", 0.65F, 1.0F);
    } 
    return true;
  }
  
  private void feetFindSomethingToHit() {
    if (OreSpawnMain.PlayNicely != 0)
      return; 
    List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(20.0D, 8.0D, 20.0D));
    Iterator<Entity> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = var2.next();
      var4 = (EntityLivingBase)var3;
      if (feetisSuitableTarget(var4, false))
        feetattackEntityAsMob((Entity)var4); 
    } 
  }
  
  private boolean feetisSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (par1EntityLiving instanceof SpiderRobot)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
      return false; 
    if (par1EntityLiving instanceof SpiderDriver)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
      return false; 
    if (par1EntityLiving == this.riddenByEntity)
      return false; 
    float d1 = (float)(par1EntityLiving.posX - this.posX);
    float d2 = (float)(par1EntityLiving.posY - this.posY);
    float d3 = (float)(par1EntityLiving.posZ - this.posZ);
    float dd = (float)Math.sqrt((d1 * d1 + d2 * d2 + d3 * d3));
    if (dd > 18.0F)
      return false; 
    if (dd < 12.0F)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    return true;
  }
  
  public boolean feetattackEntityAsMob(Entity par1Entity) {
    boolean ret = false;
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      double ks = 0.6D;
      double inair = 0.1D;
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      ret = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.SpiderRobot_stats.attack / 10.0F);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      if (ret)
        par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); 
    } 
    return ret;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    if (OreSpawnMain.PlayNicely != 0)
      return null; 
    List var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(20.0D, 12.0D, 20.0D));
    Iterator<Entity> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = var2.next();
      var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (par1EntityLiving instanceof SpiderRobot)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntitySpider)
      return false; 
    if (par1EntityLiving instanceof SpiderDriver)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityCaveSpider)
      return false; 
    if (par1EntityLiving == this.riddenByEntity)
      return false; 
    if (MyUtils.isIgnoreable(par1EntityLiving))
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    double rr = Math.atan2(par1EntityLiving.posZ - this.posZ, par1EntityLiving.posX - this.posX);
    double rhdir = Math.toRadians(((this.rotationYaw + 90.0F) % 360.0F));
    double pi = 3.1415926545D;
    double rdd = Math.abs(rr - rhdir) % pi * 2.0D;
    if (rdd > pi)
      rdd -= pi * 2.0D; 
    rdd = Math.abs(rdd);
    if (getDistanceSqToEntity((Entity)par1EntityLiving) < 36.0D)
      return true; 
    if (rdd > 0.75D)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      return true;
    } 
    return true;
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    boolean ret = false;
    if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
      double ks = 1.2D;
      double inair = 0.15D;
      float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
      ret = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.SpiderRobot_stats.attack);
      if (par1Entity.isDead || par1Entity instanceof EntityPlayer)
        inair *= 2.0D; 
      if (ret)
        par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks); 
    } 
    return ret;
  }
  
  public int getAttacking() {
    return this.dataWatcher.getWatchableObjectByte(20);
  }
  
  public void setAttacking(int par1) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
  }
  
  protected Item getDropItem() {
    return null;
  }
  
  private ItemStack dropItemRand(Item index, int par1) {
    EntityItem var3 = null;
    ItemStack is = new ItemStack(index, par1, 0);
    var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
    if (var3 != null)
      this.worldObj.spawnEntityInWorld((Entity)var3); 
    return is;
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    ItemStack is = null;
    int i = 14 + this.worldObj.rand.nextInt(14);
    for (int var4 = 0; var4 < i; var4++) {
      int var3 = this.worldObj.rand.nextInt(15);
      switch (var3) {
        case 0:
          is = dropItemRand(Items.redstone, 1);
          break;
        case 1:
          is = dropItemRand(Items.repeater, 1);
          break;
        case 2:
          is = dropItemRand(Items.comparator, 1);
          break;
        case 3:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 4:
          is = dropItemRand(Item.getItemFromBlock(Blocks.dispenser), 1);
          break;
        case 5:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.sticky_piston), 1);
          break;
        case 6:
          is = dropItemRand(Item.getItemFromBlock((Block)Blocks.piston), 1);
          break;
        case 7:
          is = dropItemRand(Item.getItemFromBlock(Blocks.lever), 1);
          break;
        case 8:
          is = dropItemRand(Item.getItemFromBlock(Blocks.redstone_block), 1);
          break;
        case 9:
          is = dropItemRand(Item.getItemFromBlock(Blocks.light_weighted_pressure_plate), 1);
          break;
      } 
    } 
  }
}
