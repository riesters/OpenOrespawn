package danger.orespawn;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Girlfriend extends EntityTameable implements IRangedAttackMob {
  public int which_girl = 0;
  
  public int which_wet_girl = 0;
  
  public int wet_count = 0;
  
  private int auto_heal = 200;
  
  private int force_sync = 50;
  
  private int fight_sound_ticker = 0;
  
  private int taunt_sound_ticker = 0;
  
  private int had_target = 0;
  
  private int voice = 0;
  
  private int is_princess = 0;
  
  public MyEntityAIDance Dance = null;
  
  private float moveSpeed = 0.3F;
  
  private int voice_enable = 1;
  
  public int passenger = 0;
  
  public int feelingBetter = 0;
  
  private static final ResourceLocation DryTexture0 = new ResourceLocation("orespawn", "girlfriend0.png");
  
  private static final ResourceLocation DryTexture1 = new ResourceLocation("orespawn", "girlfriend1.png");
  
  private static final ResourceLocation DryTexture2 = new ResourceLocation("orespawn", "girlfriend2.png");
  
  private static final ResourceLocation DryTexture3 = new ResourceLocation("orespawn", "girlfriend3.png");
  
  private static final ResourceLocation DryTexture4 = new ResourceLocation("orespawn", "girlfriend4.png");
  
  private static final ResourceLocation DryTexture5 = new ResourceLocation("orespawn", "girlfriend5.png");
  
  private static final ResourceLocation DryTexture6 = new ResourceLocation("orespawn", "girlfriend6.png");
  
  private static final ResourceLocation DryTexture7 = new ResourceLocation("orespawn", "girlfriend7.png");
  
  private static final ResourceLocation DryTexture8 = new ResourceLocation("orespawn", "girlfriend8.png");
  
  private static final ResourceLocation DryTexture9 = new ResourceLocation("orespawn", "girlfriend9.png");
  
  private static final ResourceLocation DryTexture10 = new ResourceLocation("orespawn", "girlfriend10.png");
  
  private static final ResourceLocation DryTexture11 = new ResourceLocation("orespawn", "girlfriend11.png");
  
  private static final ResourceLocation DryTexture12 = new ResourceLocation("orespawn", "girlfriend12.png");
  
  private static final ResourceLocation DryTexture13 = new ResourceLocation("orespawn", "girlfriend13.png");
  
  private static final ResourceLocation DryTexture14 = new ResourceLocation("orespawn", "girlfriend14.png");
  
  private static final ResourceLocation DryTexture15 = new ResourceLocation("orespawn", "girlfriend15.png");
  
  private static final ResourceLocation DryTexture16 = new ResourceLocation("orespawn", "girlfriend16.png");
  
  private static final ResourceLocation DryTexture17 = new ResourceLocation("orespawn", "girlfriend17.png");
  
  private static final ResourceLocation DryTexture18 = new ResourceLocation("orespawn", "girlfriend18.png");
  
  private static final ResourceLocation DryTexture19 = new ResourceLocation("orespawn", "girlfriend19.png");
  
  private static final ResourceLocation DryTexture20 = new ResourceLocation("orespawn", "girlfriend20.png");
  
  private static final ResourceLocation DryTexture21 = new ResourceLocation("orespawn", "girlfriend21.png");
  
  private static final ResourceLocation DryTexture22 = new ResourceLocation("orespawn", "girlfriend22.png");
  
  private static final ResourceLocation DryTexture23 = new ResourceLocation("orespawn", "girlfriend23.png");
  
  private static final ResourceLocation DryTexture24 = new ResourceLocation("orespawn", "girlfriend24.png");
  
  private static final ResourceLocation DryTexture25 = new ResourceLocation("orespawn", "girlfriend25.png");
  
  private static final ResourceLocation DryTexture26 = new ResourceLocation("orespawn", "girlfriend26.png");
  
  private static final ResourceLocation DryTexture27 = new ResourceLocation("orespawn", "girlfriend27.png");
  
  private static final ResourceLocation DryTexture28 = new ResourceLocation("orespawn", "girlfriend28.png");
  
  private static final ResourceLocation DryTexture29 = new ResourceLocation("orespawn", "girlfriend29.png");
  
  private static final ResourceLocation DryTexture30 = new ResourceLocation("orespawn", "girlfriend30.png");
  
  private static final ResourceLocation DryTexture31 = new ResourceLocation("orespawn", "girlfriend31.png");
  
  private static final ResourceLocation DryTexture32 = new ResourceLocation("orespawn", "girlfriend32.png");
  
  private static final ResourceLocation DryTexture33 = new ResourceLocation("orespawn", "girlfriend33.png");
  
  private static final ResourceLocation DryTexture34 = new ResourceLocation("orespawn", "girlfriend34.png");
  
  private static final ResourceLocation DryTexture35 = new ResourceLocation("orespawn", "girlfriend35.png");
  
  private static final ResourceLocation DryTexture36 = new ResourceLocation("orespawn", "girlfriend36.png");
  
  private static final ResourceLocation DryTexture37 = new ResourceLocation("orespawn", "girlfriend37.png");
  
  private static final ResourceLocation DryTexture38 = new ResourceLocation("orespawn", "girlfriend38.png");
  
  private static final ResourceLocation DryTexture39 = new ResourceLocation("orespawn", "girlfriend39.png");
  
  private static final ResourceLocation DryTexture40 = new ResourceLocation("orespawn", "girlfriend40.png");
  
  private static final ResourceLocation ValentineTexture = new ResourceLocation("orespawn", "girlfriendv.png");
  
  private static final ResourceLocation WetTexture0 = new ResourceLocation("orespawn", "bikini0.png");
  
  private static final ResourceLocation WetTexture1 = new ResourceLocation("orespawn", "bikini1.png");
  
  private static final ResourceLocation WetTexture2 = new ResourceLocation("orespawn", "bikini2.png");
  
  private static final ResourceLocation WetTexture3 = new ResourceLocation("orespawn", "bikini3.png");
  
  private static final ResourceLocation WetTexture4 = new ResourceLocation("orespawn", "bikini4.png");
  
  private static final ResourceLocation WetTexture5 = new ResourceLocation("orespawn", "bikini5.png");
  
  private static final ResourceLocation WetTexture6 = new ResourceLocation("orespawn", "bikini6.png");
  
  private static final ResourceLocation WetTexture7 = new ResourceLocation("orespawn", "bikini7.png");
  
  private static final ResourceLocation WetTexture8 = new ResourceLocation("orespawn", "bikini8.png");
  
  private static final ResourceLocation WetTexture9 = new ResourceLocation("orespawn", "bikini9.png");
  
  private static final ResourceLocation WetTexture10 = new ResourceLocation("orespawn", "bikini10.png");
  
  private static final ResourceLocation WetTexture11 = new ResourceLocation("orespawn", "bikini11.png");
  
  private static final ResourceLocation WetTexture12 = new ResourceLocation("orespawn", "bikini12.png");
  
  private static final ResourceLocation WetTexture13 = new ResourceLocation("orespawn", "bikini13.png");
  
  private static final ResourceLocation WetTexture14 = new ResourceLocation("orespawn", "bikini14.png");
  
  private static final ResourceLocation WetTexture15 = new ResourceLocation("orespawn", "bikini15.png");
  
  private static final ResourceLocation WetTexture16 = new ResourceLocation("orespawn", "bikini16.png");
  
  private static final ResourceLocation WetTexture17 = new ResourceLocation("orespawn", "bikini17.png");
  
  private static final ResourceLocation PrincessTexture1 = new ResourceLocation("orespawn", "FrogPrincess.png");
  
  private static final ResourceLocation PrincessTexture2 = new ResourceLocation("orespawn", "FrogPrincess2.png");
  
  public Girlfriend(World par1World) {
    super(par1World);
    this.which_girl = this.rand.nextInt(41);
    this.which_wet_girl = this.rand.nextInt(18);
    this.voice = this.rand.nextInt(10);
    setSize(0.5F, 1.6F);
    if (OreSpawnMain.valentines_day != 0)
      setSize(2.5F, 8.0F); 
    this.isImmuneToFire = true;
    this.fireResistance = 100;
    getNavigator().setAvoidsWater(false);
    setSitting(false);
    this.tasks.addTask(1, new MyEntityAIFollowOwner(this, 1.4F, 12.0F, 1.5F));
    this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Item.getItemFromBlock((Block)Blocks.red_flower), false));
    this.Dance = new MyEntityAIDance(this);
    this.tasks.addTask(3, this.Dance);
    this.tasks.addTask(4, (EntityAIBase)new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(8, new MyEntityAIWander((EntityCreature)this, 0.75F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.targetTasks.addTask(1, new MyValentineTarget((EntityLiving)this, EntityPlayer.class, 16.0F, 0, true, true));
    this.targetTasks.addTask(2, new MyValentineTarget((EntityLiving)this, Boyfriend.class, 16.0F, 0, true, true));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(2, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityCreeper.class, 20.0F, 0, true, true, IMob.mobSelector)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(3, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityLiving.class, 15.0F, 0, true, true, IMob.mobSelector)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(4, new MyEntityAIJealousy(this, Girlfriend.class, 6.0F, 5, true)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(5, new MyEntityAIJealousy(this, Girlfriend.class, 3.0F, 15, true)); 
    this.experienceValue = 0;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.which_girl = this.rand.nextInt(41);
    this.dataWatcher.addObject(20, Integer.valueOf(this.which_girl));
    this.wet_count = 0;
    this.which_wet_girl = this.rand.nextInt(18);
    this.dataWatcher.addObject(22, Integer.valueOf(this.which_wet_girl));
    this.voice = this.rand.nextInt(10);
    this.dataWatcher.addObject(21, Integer.valueOf(this.voice));
    this.dataWatcher.addObject(23, Integer.valueOf(this.voice_enable));
    this.dataWatcher.addObject(24, Integer.valueOf(this.is_princess));
    this.dataWatcher.addObject(25, Integer.valueOf(this.feelingBetter));
    this.auto_heal = 200;
    this.force_sync = 50;
    this.fight_sound_ticker = 0;
    this.taunt_sound_ticker = 0;
    this.had_target = 0;
    setSitting(false);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
  }
  
  public int getTotalArmorValue() {
    int i = 0;
    ItemStack[] aitemstack = getLastActiveItems();
    int j = aitemstack.length;
    for (int k = 0; k < j; k++) {
      ItemStack itemstack = aitemstack[k];
      if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
        int l = ((ItemArmor)itemstack.getItem()).damageReduceAmount;
        i += l;
      } 
    } 
    if (i < 8)
      i = 8; 
    if (i > 23)
      i = 23; 
    return i;
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
    this.passenger = 0;
    if (isTamed() && !isSitting()) {
      EntityLivingBase entityLivingBase = getOwner();
      if (entityLivingBase != null && entityLivingBase instanceof EntityPlayer) {
        EntityPlayer p = (EntityPlayer)entityLivingBase;
        Entity r = ((Entity)entityLivingBase).ridingEntity;
        if (r != null && 
          r instanceof Elevator) {
          float f = -0.45F;
          setPosition(r.posX - f * Math.sin(Math.toRadians(r.rotationYaw)), r.posY, r.posZ + f * Math.cos(Math.toRadians(r.rotationYaw)));
          this.rotationYaw = r.rotationYaw;
          this.rotationPitch = r.rotationPitch;
          this.limbSwing = this.limbSwingAmount = 0.0F;
          this.fallDistance = 0.0F;
          this.passenger = 1;
        } 
      } 
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("GirlType", getTameSkin());
    par1NBTTagCompound.setInteger("WetGirlType", getWetTameSkin());
    par1NBTTagCompound.setInteger("GirlVoice", this.dataWatcher.getWatchableObjectInt(21));
    par1NBTTagCompound.setInteger("GirlVoiceEnable", this.dataWatcher.getWatchableObjectInt(23));
    par1NBTTagCompound.setInteger("IsPrincess", this.dataWatcher.getWatchableObjectInt(24));
    par1NBTTagCompound.setInteger("feelingBetter", this.dataWatcher.getWatchableObjectInt(25));
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.which_girl = par1NBTTagCompound.getInteger("GirlType");
    setTameSkin(this.which_girl);
    this.which_wet_girl = par1NBTTagCompound.getInteger("WetGirlType");
    setWetTameSkin(this.which_wet_girl);
    this.voice = par1NBTTagCompound.getInteger("GirlVoice");
    this.dataWatcher.updateObject(21, Integer.valueOf(this.voice));
    this.voice_enable = par1NBTTagCompound.getInteger("GirlVoiceEnable");
    this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
    this.is_princess = par1NBTTagCompound.getInteger("IsPrincess");
    this.dataWatcher.updateObject(24, Integer.valueOf(this.is_princess));
    this.feelingBetter = par1NBTTagCompound.getInteger("feelingBetter");
    this.dataWatcher.updateObject(25, Integer.valueOf(this.feelingBetter));
    if (OreSpawnMain.valentines_day != 0 && this.feelingBetter != 0)
      setSize(0.5F, 1.6F); 
  }
  
  protected void updateAITick() {
    super.updateAITick();
    ItemStack stack = getCurrentEquippedItem();
    EntityLivingBase entityLivingBase = getAttackTarget();
    if (OreSpawnMain.PlayNicely != 0)
      entityLivingBase = null; 
    if (this.worldObj.rand.nextInt(100) == 1)
      setRevengeTarget(null); 
    if (this.worldObj.rand.nextInt(200) == 1)
      setAttackTarget(null); 
    if (stack != null && !isSitting())
      if (entityLivingBase != null) {
        if (entityLivingBase instanceof EntityLivingBase)
          if (getHeldItem() != null)
            if (getDistanceToEntity((Entity)entityLivingBase) < 4.0F || (stack.getItem() == OreSpawnMain.MyBertha && getDistanceToEntity((Entity)entityLivingBase) < 10.0F)) {
              this.attackTime--;
              if (this.attackTime <= 0) {
                this.attackTime = 25;
                swingItem();
                attackTargetEntityWithCurrentItem((Entity)entityLivingBase);
                this.fight_sound_ticker--;
                if (this.fight_sound_ticker <= 0) {
                  if (!this.worldObj.isRemote && this.voice_enable != 0)
                    this.worldObj.playSoundAtEntity((Entity)this, "orespawn:o_fight", 0.5F, getSoundPitch()); 
                  this.fight_sound_ticker = 3;
                } 
                this.had_target = 1;
              } 
            } else if (getDistanceToEntity((Entity)entityLivingBase) < 7.0F && stack.getItem() != OreSpawnMain.MyUltimateBow) {
              this.taunt_sound_ticker--;
              if (this.taunt_sound_ticker <= 0) {
                if (!this.worldObj.isRemote && this.voice_enable != 0)
                  this.worldObj.playSoundAtEntity((Entity)this, "orespawn:o_taunt", 0.5F, getSoundPitch()); 
                this.taunt_sound_ticker = 300;
              } 
              getNavigator().tryMoveToEntityLiving((Entity)entityLivingBase, 1.25D);
            }   
      } else {
        this.fight_sound_ticker = 0;
        this.attackTime = 0;
        if (this.had_target != 0) {
          this.had_target = 0;
          if (!this.worldObj.isRemote && this.voice_enable != 0)
            this.worldObj.playSoundAtEntity((Entity)this, "orespawn:o_woohoo", 0.4F, getSoundPitch()); 
        } 
      }  
  }
  
  public void setPrincess(int par1) {
    this.is_princess = par1;
  }
  
  public ResourceLocation getTexture() {
    if (OreSpawnMain.valentines_day != 0 && this.feelingBetter == 0)
      return ValentineTexture; 
    if (this.wet_count <= 0) {
      int txture = getTameSkin();
      if (this.is_princess == 1)
        return PrincessTexture1; 
      if (this.is_princess == 2)
        return PrincessTexture2; 
      if (txture == 0)
        return DryTexture0; 
      if (txture == 1)
        return DryTexture1; 
      if (txture == 2)
        return DryTexture2; 
      if (txture == 3)
        return DryTexture3; 
      if (txture == 4)
        return DryTexture4; 
      if (txture == 5)
        return DryTexture5; 
      if (txture == 6)
        return DryTexture6; 
      if (txture == 7)
        return DryTexture7; 
      if (txture == 8)
        return DryTexture8; 
      if (txture == 9)
        return DryTexture9; 
      if (txture == 10)
        return DryTexture10; 
      if (txture == 11)
        return DryTexture11; 
      if (txture == 12)
        return DryTexture12; 
      if (txture == 13)
        return DryTexture13; 
      if (txture == 14)
        return DryTexture14; 
      if (txture == 15)
        return DryTexture15; 
      if (txture == 16)
        return DryTexture16; 
      if (txture == 17)
        return DryTexture17; 
      if (txture == 18)
        return DryTexture18; 
      if (txture == 19)
        return DryTexture19; 
      if (txture == 20)
        return DryTexture20; 
      if (txture == 21)
        return DryTexture21; 
      if (txture == 22)
        return DryTexture22; 
      if (txture == 23)
        return DryTexture23; 
      if (txture == 24)
        return DryTexture24; 
      if (txture == 25)
        return DryTexture25; 
      if (txture == 26)
        return DryTexture26; 
      if (txture == 27)
        return DryTexture27; 
      if (txture == 28)
        return DryTexture28; 
      if (txture == 29)
        return DryTexture29; 
      if (txture == 30)
        return DryTexture30; 
      if (txture == 31)
        return DryTexture31; 
      if (txture == 32)
        return DryTexture32; 
      if (txture == 33)
        return DryTexture33; 
      if (txture == 34)
        return DryTexture34; 
      if (txture == 35)
        return DryTexture35; 
      if (txture == 36)
        return DryTexture36; 
      if (txture == 37)
        return DryTexture37; 
      if (txture == 38)
        return DryTexture38; 
      if (txture == 39)
        return DryTexture39; 
      if (txture == 40)
        return DryTexture40; 
    } else {
      int temp = getWetTameSkin();
      if (temp == 0)
        return WetTexture0; 
      if (temp == 1)
        return WetTexture1; 
      if (temp == 2)
        return WetTexture2; 
      if (temp == 3)
        return WetTexture3; 
      if (temp == 4)
        return WetTexture4; 
      if (temp == 5)
        return WetTexture5; 
      if (temp == 6)
        return WetTexture6; 
      if (temp == 7)
        return WetTexture7; 
      if (temp == 8)
        return WetTexture8; 
      if (temp == 9)
        return WetTexture9; 
      if (temp == 10)
        return WetTexture10; 
      if (temp == 11)
        return WetTexture11; 
      if (temp == 12)
        return WetTexture12; 
      if (temp == 13)
        return WetTexture13; 
      if (temp == 14)
        return WetTexture14; 
      if (temp == 15)
        return WetTexture15; 
      if (temp == 16)
        return WetTexture16; 
      if (temp == 17)
        return WetTexture17; 
    } 
    return null;
  }
  
  public int getTameSkin() {
    return this.dataWatcher.getWatchableObjectInt(20);
  }
  
  public int getVoice() {
    return this.dataWatcher.getWatchableObjectInt(21);
  }
  
  public void setTameSkin(int par1) {
    this.dataWatcher.updateObject(20, Integer.valueOf(par1));
    this.which_girl = par1;
  }
  
  public int getWetTameSkin() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public void setWetTameSkin(int par1) {
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
    this.which_wet_girl = par1;
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public boolean canBreatheUnderwater() {
    return true;
  }
  
  protected void fall(float par1) {
    float i = MathHelper.ceiling_float_int(par1 - 3.0F);
    if (i > 0.0F) {
      if (i > 3.0F) {
        playSound("damage.fallbig", 1.0F, 1.0F);
        i = 3.0F;
      } else {
        playSound("damage.fallsmall", 1.0F, 1.0F);
      } 
      attackEntityFrom(DamageSource.fall, i);
    } 
  }
  
  public int mygetMaxHealth() {
    if (OreSpawnMain.valentines_day != 0 && this.feelingBetter == 0)
      return 800; 
    return 80;
  }
  
  public void onLivingUpdate() {
    updateArmSwingProgress();
    super.onLivingUpdate();
    if (isInWater() || handleLavaMovement()) {
      this.wet_count = 500;
    } else if (this.wet_count > 0) {
      this.wet_count--;
    } 
    this.auto_heal--;
    if (this.auto_heal <= 0) {
      if (mygetMaxHealth() > getGirlfriendHealth())
        heal(1.0F); 
      this.auto_heal = 100;
    } 
    this.force_sync--;
    if (this.force_sync <= 0) {
      this.force_sync = 20;
      if (!this.worldObj.isRemote) {
        this.dataWatcher.updateObject(21, Integer.valueOf(this.voice));
        this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
        this.dataWatcher.updateObject(24, Integer.valueOf(this.is_princess));
        this.dataWatcher.updateObject(25, Integer.valueOf(this.feelingBetter));
        setSitting(isSitting());
      } else {
        this.voice = getVoice();
        this.voice_enable = this.dataWatcher.getWatchableObjectInt(23);
        int nowfeeling = this.dataWatcher.getWatchableObjectInt(25);
        if (nowfeeling != this.feelingBetter && nowfeeling != 0) {
          this.feelingBetter = nowfeeling;
          setSize(0.5F, 1.6F);
        } 
      } 
    } 
  }
  
  public int getGirlfriendHealth() {
    return (int)getHealth();
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (var2 != null && (var2.getItem() == Item.getItemFromBlock((Block)Blocks.red_flower) || var2.getItem() == Item.getItemFromBlock(OreSpawnMain.CrystalFlowerRedBlock)) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.rand.nextInt(3) == 0) {
            setTamed(true);
            func_152115_b(par1EntityPlayer.getUniqueID().toString());
            playTameEffect(true);
            this.worldObj.setEntityState((Entity)this, (byte)7);
            heal(mygetMaxHealth() - getHealth());
          } else {
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)6);
          }  
      } else if (func_152114_e((EntityLivingBase)par1EntityPlayer)) {
        if (this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (mygetMaxHealth() > getHealth())
          heal(mygetMaxHealth() - getHealth()); 
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        setTamed(false);
        func_152115_b("");
        playTameEffect(false);
        this.worldObj.setEntityState((Entity)this, (byte)6);
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == OreSpawnMain.MyRuby && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        this.voice_enable = 0;
        this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == OreSpawnMain.MyAmethyst && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote) {
        this.voice_enable = 1;
        this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
      } 
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && (var2.getItem() == Item.getItemFromBlock((Block)Blocks.yellow_flower) || var2.getItem() == Item.getItemFromBlock(OreSpawnMain.CrystalFlowerYellowBlock)) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote)
        if (this.wet_count > 0 || isInWater() || handleLavaMovement()) {
          this.which_wet_girl++;
          if (this.which_wet_girl > 17)
            this.which_wet_girl = 0; 
          setWetTameSkin(this.which_wet_girl);
          this.worldObj.setEntityState((Entity)this, (byte)7);
          if (isInWater() || handleLavaMovement())
            this.wet_count = 500; 
        } else {
          this.which_girl++;
          if (this.which_girl > 40)
            this.which_girl = 0; 
          setTameSkin(this.which_girl);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        }  
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (var2.getItem() instanceof ItemFood) {
        if (!this.worldObj.isRemote) {
          ItemFood var3 = (ItemFood)var2.getItem();
          if (mygetMaxHealth() > getHealth())
            heal((var3.func_150905_g(var2) * 5)); 
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        if (!par1EntityPlayer.capabilities.isCreativeMode) {
          var2.stackSize--;
          if (var2.stackSize <= 0)
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
        } 
      } else {
        if (!this.worldObj.isRemote) {
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } 
        ItemStack var3 = getCurrentEquippedItem();
        setCurrentItemOrArmor(0, var2);
        if (var2.getItem() == Items.diamond) {
          setSitting(true);
        } else {
          setSitting(false);
        } 
        if (var3 != null) {
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, var3);
        } else {
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
          Item itm = var2.getItem();
          if (itm instanceof ItemOreSpawnArmor) {
            if (itm == OreSpawnMain.CrystalPinkHelmet || itm == OreSpawnMain.TigersEyeHelmet) {
              ItemStack v4 = getEquipmentInSlot(4);
              setCurrentItemOrArmor(4, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.CrystalPinkBody || itm == OreSpawnMain.TigersEyeBody) {
              ItemStack v4 = getEquipmentInSlot(3);
              setCurrentItemOrArmor(3, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.CrystalPinkLegs || itm == OreSpawnMain.TigersEyeLegs) {
              ItemStack v4 = getEquipmentInSlot(2);
              setCurrentItemOrArmor(2, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.CrystalPinkBoots || itm == OreSpawnMain.TigersEyeBoots) {
              ItemStack v4 = getEquipmentInSlot(1);
              setCurrentItemOrArmor(1, var2);
              setCurrentItemOrArmor(0, v4);
            } 
          } 
        } 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock(Blocks.diamond_block) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      setSitting(false);
      setTamed(true);
      func_152115_b(par1EntityPlayer.getUniqueID().toString());
      playTameEffect(true);
      this.worldObj.setEntityState((Entity)this, (byte)7);
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      setCustomNameTag(var2.getDisplayName());
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (isTamed() && var2 == null && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      ItemStack var3 = getEquipmentInSlot(0);
      int it = 0;
      if (var3 == null) {
        it++;
        var3 = getEquipmentInSlot(it);
      } 
      if (var3 == null) {
        it++;
        var3 = getEquipmentInSlot(it);
      } 
      if (var3 == null) {
        it++;
        var3 = getEquipmentInSlot(it);
      } 
      if (var3 == null) {
        it++;
        var3 = getEquipmentInSlot(it);
      } 
      if (var3 != null) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, var3);
        setCurrentItemOrArmor(it, null);
        setSitting(false);
        if (!this.worldObj.isRemote)
          this.worldObj.setEntityState((Entity)this, (byte)6); 
      } else if (!this.worldObj.isRemote) {
        setSitting(false);
        playTameEffect(true);
        this.worldObj.setEntityState((Entity)this, (byte)7);
        String healthMessage = new String();
        healthMessage = String.format("I have %d health. Thank you for asking! xoxo", new Object[] { Integer.valueOf(getGirlfriendHealth()) });
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
      } 
      return true;
    } 
    return super.interact(par1EntityPlayer);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    return (par1ItemStack != null && par1ItemStack.getItem() == Item.getItemFromBlock((Block)Blocks.red_flower));
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected String getLivingSound() {
    if (isSitting() || this.voice_enable == 0)
      return null; 
    if (this.Dance.is_dancing != 0)
      return null; 
    if (this.rand.nextInt(11) == 1) {
      EntityLivingBase entityLivingBase = getAttackTarget();
      if (entityLivingBase != null)
        return null; 
      if (isInWater() || handleLavaMovement())
        return "orespawn:o_water"; 
      if (this.rand.nextInt(4) != 0) {
        if (this.posY < 60.0D)
          return null; 
        if (this.worldObj.isThundering())
          return "orespawn:o_thunder"; 
        if (this.worldObj.isRaining())
          return "orespawn:o_rain"; 
        if (!this.worldObj.isDaytime() && 
          this.worldObj.canBlockSeeTheSky((int)this.posX, (int)this.posY, (int)this.posZ)) {
          if (this.worldObj.rand.nextInt(3) == 0)
            return "orespawn:o_dark"; 
          return null;
        } 
      } 
      if (isTamed()) {
        if (mygetMaxHealth() > getHealth() || (OreSpawnMain.valentines_day != 0 && this.feelingBetter == 0))
          return "orespawn:o_hurt"; 
        return "orespawn:o_happy";
      } 
      return null;
    } 
    return null;
  }
  
  protected String getHurtSound() {
    if (this.voice_enable == 0)
      return null; 
    return "orespawn:o_ow";
  }
  
  protected String getDeathSound() {
    return isTamed() ? "orespawn:o_death_girlfriend" : "orespawn:o_death_single";
  }
  
  protected float getSoundVolume() {
    return 0.3F;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock((Block)Blocks.red_flower);
  }
  
  private void dropItemRand(Item index, int par1) {
    EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), this.posY + 1.0D, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(4) - OreSpawnMain.OreSpawnRand.nextInt(4), new ItemStack(index, par1, 0));
    this.worldObj.spawnEntityInWorld((Entity)var3);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.rand.nextInt(5);
      var3 += 2;
      for (int i = 0; i < var3; i++)
        dropItem(Item.getItemFromBlock((Block)Blocks.red_flower), 1); 
    } 
    Item v6 = OreSpawnMain.MyItemShoes;
    Item v7 = OreSpawnMain.MyItemShoes_1;
    Item v8 = OreSpawnMain.MyItemShoes_2;
    Item v9 = OreSpawnMain.MyItemShoes_3;
    var3 = this.rand.nextInt(16);
    var3 += 4;
    int var4;
    for (var4 = 0; var4 < var3; var4++)
      dropItem(v6, 1); 
    var3 = this.rand.nextInt(16);
    var3 += 4;
    for (var4 = 0; var4 < var3; var4++)
      dropItem(v7, 1); 
    var3 = this.rand.nextInt(16);
    var3 += 4;
    for (var4 = 0; var4 < var3; var4++)
      dropItem(v8, 1); 
    var3 = this.rand.nextInt(16);
    var3 += 4;
    for (var4 = 0; var4 < var3; var4++)
      dropItem(v9, 1); 
    if (isTamed()) {
      ItemStack var5 = getCurrentEquippedItem();
      if (var5 != null && 
        var5.stackSize > 0)
        dropItem(var5.getItem(), var5.stackSize); 
      var5 = getEquipmentInSlot(1);
      if (var5 != null && 
        var5.stackSize > 0)
        dropItem(var5.getItem(), var5.stackSize); 
      var5 = getEquipmentInSlot(2);
      if (var5 != null && 
        var5.stackSize > 0)
        dropItem(var5.getItem(), var5.stackSize); 
      var5 = getEquipmentInSlot(3);
      if (var5 != null && 
        var5.stackSize > 0)
        dropItem(var5.getItem(), var5.stackSize); 
      var5 = getEquipmentInSlot(4);
      if (var5 != null && 
        var5.stackSize > 0)
        dropItem(var5.getItem(), var5.stackSize); 
    } 
  }
  
  public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLiving) {
    ItemStack it = null;
    if (this.isSwingInProgress)
      return; 
    it = getCurrentEquippedItem();
    if (it != null && it.getItem() == OreSpawnMain.MyUltimateBow) {
      EntityArrow var8 = new UltimateArrow(this.worldObj, (EntityLiving)this, par1EntityLiving, 2.0F, 10.0F);
      if (this.worldObj.rand.nextInt(4) == 1)
        var8.setIsCritical(true); 
      int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, it);
      if (var10 > 0)
        var8.setKnockbackStrength(var10); 
      if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, it) > 0)
        var8.setFire(100); 
      it.damageItem(1, (EntityLivingBase)this);
      this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 1.0F, 1.0F / (this.worldObj.rand.nextFloat() * 0.4F + 1.2F) + 0.5F);
      var8.canBePickedUp = 2;
      this.worldObj.spawnEntityInWorld((Entity)var8);
    } else {
      Shoes var2 = new Shoes(this.worldObj, (EntityLivingBase)this, 2 + this.rand.nextInt(4));
      double var3 = par1EntityLiving.posX - this.posX;
      double var5 = par1EntityLiving.posY + par1EntityLiving.getEyeHeight() - 1.1D - var2.posY;
      double var7 = par1EntityLiving.posZ - this.posZ;
      float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
      var2.setThrowableHeading(var3, var5 + var9, var7, 1.8F, 4.0F);
      this.worldObj.playSoundAtEntity((Entity)this, "random.bow", 0.75F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)var2);
    } 
    swingItem();
  }
  
  public ItemStack getCurrentEquippedItem() {
    return getEquipmentInSlot(0);
  }
  
  public void attackTargetEntityWithCurrentItem(Entity par1Entity) {
    ItemStack stack = getCurrentEquippedItem();
    if (stack != null) {
      float var2 = 0.0F;
      if (isPotionActive(Potion.damageBoost))
        var2 += (3 << getActivePotionEffect(Potion.damageBoost).getAmplifier()); 
      if (isPotionActive(Potion.weakness))
        var2 -= (2 << getActivePotionEffect(Potion.weakness).getAmplifier()); 
      int var3 = 0;
      float var4 = (float)getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
      if (par1Entity instanceof EntityLiving) {
        var4 += EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)par1Entity);
        var3 += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)par1Entity);
      } 
      if (isSprinting())
        var3++; 
      if (var2 > 0.0F || var4 > 0.0F) {
        boolean var5 = (this.fallDistance > 0.0F && !this.onGround && !isOnLadder() && !isInWater() && !handleLavaMovement() && !isPotionActive(Potion.blindness) && this.ridingEntity == null && par1Entity instanceof EntityLiving);
        if (var5)
          var2 += this.rand.nextInt((int)var2 / 2 + 2); 
        var2 += var4;
        boolean var6 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), var2);
        if (var6)
          if (var3 > 0) {
            par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * var3 * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * var3 * 0.5F));
            this.motionX *= 0.6D;
            this.motionZ *= 0.6D;
            setSprinting(false);
          }  
        ItemStack var7 = getCurrentEquippedItem();
        if (par1Entity instanceof EntityLiving) {
          int var8 = EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, var7);
          if (var8 > 0 && var6)
            par1Entity.setFire(var8 * 4); 
        } 
      } 
    } 
  }
  
  protected float getSoundPitch() {
    return (this.voice - 5) * 0.02F + 1.0F;
  }
  
  public EntityAgeable createChild(EntityAgeable var1) {
    return null;
  }
  
  public void attackEntityWithRangedAttack(EntityLivingBase entityliving, float f) {
    attackEntityWithRangedAttack(entityliving);
  }
  
  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
    boolean ret = false;
    float p2 = par2;
    if (p2 > 10.0F)
      p2 = 10.0F; 
    if (!par1DamageSource.getDamageType().equals("cactus")) {
      if (par1DamageSource.getDamageType().equals("inWall") && 
        OreSpawnMain.valentines_day != 0)
        return ret; 
      if (OreSpawnMain.valentines_day != 0 && !this.worldObj.isRemote && this.feelingBetter == 0) {
        Entity e = par1DamageSource.getEntity();
        if (e != null && e instanceof EntityPlayer) {
          EntityPlayer eb = (EntityPlayer)e;
          ItemStack ist = eb.getCurrentEquippedItem();
          if (ist != null) {
            Item it = ist.getItem();
            if (it == OreSpawnMain.MyRoseSword)
              if (this.worldObj.rand.nextInt(4) == 1) {
                this.feelingBetter = 1;
                setAttackTarget(null);
                setSize(0.5F, 1.6F);
                getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(mygetMaxHealth());
                int morelove = this.worldObj.rand.nextInt(10);
                for (int i = 0; i < 10 + morelove; i++)
                  dropItemRand(OreSpawnMain.MyLove, 1); 
              } else {
                dropItemRand(OreSpawnMain.MyLove, 1);
              }  
          } 
        } 
      } 
      ret = super.attackEntityFrom(par1DamageSource, p2);
    } 
    return ret;
  }
  
  public boolean getCanSpawnHere() {
    for (int k = -3; k < 3; k++) {
      for (int j = -3; j < 3; j++) {
        for (int i = 0; i < 5; i++) {
          Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
          if (bid == Blocks.mob_spawner) {
            TileEntityMobSpawner tileentitymobspawner = null;
            tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
            String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
            if (s != null && 
              s.equals("Girlfriend"))
              return true; 
          } 
        } 
      } 
    } 
    return super.getCanSpawnHere();
  }
}
