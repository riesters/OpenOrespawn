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

public class Boyfriend extends EntityTameable implements IRangedAttackMob {
  public int which_guy = 0;
  
  public int which_wet_guy = 0;
  
  public int wet_count = 0;
  
  private int auto_heal = 200;
  
  private int force_sync = 50;
  
  private int fight_sound_ticker = 0;
  
  private int taunt_sound_ticker = 0;
  
  private int had_target = 0;
  
  private int voice = 0;
  
  private float moveSpeed = 0.3F;
  
  private int voice_enable = 1;
  
  public int passenger = 0;
  
  private int is_prince = 0;
  
  private static final ResourceLocation DryTexture0 = new ResourceLocation("orespawn", "boyfriend0.png");
  
  private static final ResourceLocation DryTexture1 = new ResourceLocation("orespawn", "boyfriend1.png");
  
  private static final ResourceLocation DryTexture2 = new ResourceLocation("orespawn", "boyfriend2.png");
  
  private static final ResourceLocation DryTexture3 = new ResourceLocation("orespawn", "boyfriend3.png");
  
  private static final ResourceLocation DryTexture4 = new ResourceLocation("orespawn", "boyfriend4.png");
  
  private static final ResourceLocation DryTexture5 = new ResourceLocation("orespawn", "boyfriend5.png");
  
  private static final ResourceLocation DryTexture6 = new ResourceLocation("orespawn", "boyfriend6.png");
  
  private static final ResourceLocation DryTexture7 = new ResourceLocation("orespawn", "boyfriend7.png");
  
  private static final ResourceLocation DryTexture8 = new ResourceLocation("orespawn", "boyfriend8.png");
  
  private static final ResourceLocation DryTexture9 = new ResourceLocation("orespawn", "boyfriend9.png");
  
  private static final ResourceLocation DryTexture10 = new ResourceLocation("orespawn", "boyfriend10.png");
  
  private static final ResourceLocation DryTexture11 = new ResourceLocation("orespawn", "boyfriend11.png");
  
  private static final ResourceLocation DryTexture12 = new ResourceLocation("orespawn", "boyfriend12.png");
  
  private static final ResourceLocation DryTexture13 = new ResourceLocation("orespawn", "boyfriend13.png");
  
  private static final ResourceLocation DryTexture14 = new ResourceLocation("orespawn", "boyfriend14.png");
  
  private static final ResourceLocation DryTexture15 = new ResourceLocation("orespawn", "boyfriend15.png");
  
  private static final ResourceLocation DryTexture16 = new ResourceLocation("orespawn", "boyfriend16.png");
  
  private static final ResourceLocation DryTexture17 = new ResourceLocation("orespawn", "boyfriend17.png");
  
  private static final ResourceLocation DryTexture18 = new ResourceLocation("orespawn", "boyfriend18.png");
  
  private static final ResourceLocation DryTexture19 = new ResourceLocation("orespawn", "boyfriend19.png");
  
  private static final ResourceLocation DryTexture20 = new ResourceLocation("orespawn", "boyfriend20.png");
  
  private static final ResourceLocation DryTexture21 = new ResourceLocation("orespawn", "boyfriend21.png");
  
  private static final ResourceLocation DryTexture22 = new ResourceLocation("orespawn", "boyfriend22.png");
  
  private static final ResourceLocation DryTexture23 = new ResourceLocation("orespawn", "boyfriend23.png");
  
  private static final ResourceLocation DryTexture24 = new ResourceLocation("orespawn", "boyfriend24.png");
  
  private static final ResourceLocation DryTexture25 = new ResourceLocation("orespawn", "boyfriend25.png");
  
  private static final ResourceLocation DryTexture26 = new ResourceLocation("orespawn", "boyfriend26.png");
  
  private static final ResourceLocation DryTexture27 = new ResourceLocation("orespawn", "boyfriend27.png");
  
  private static final ResourceLocation WetTexture0 = new ResourceLocation("orespawn", "swimshorts0.png");
  
  private static final ResourceLocation WetTexture1 = new ResourceLocation("orespawn", "swimshorts1.png");
  
  private static final ResourceLocation WetTexture2 = new ResourceLocation("orespawn", "swimshorts2.png");
  
  private static final ResourceLocation WetTexture3 = new ResourceLocation("orespawn", "swimshorts3.png");
  
  private static final ResourceLocation WetTexture4 = new ResourceLocation("orespawn", "swimshorts4.png");
  
  private static final ResourceLocation WetTexture5 = new ResourceLocation("orespawn", "swimshorts5.png");
  
  private static final ResourceLocation WetTexture6 = new ResourceLocation("orespawn", "swimshorts6.png");
  
  private static final ResourceLocation WetTexture7 = new ResourceLocation("orespawn", "swimshorts7.png");
  
  private static final ResourceLocation WetTexture8 = new ResourceLocation("orespawn", "swimshorts8.png");
  
  private static final ResourceLocation WetTexture9 = new ResourceLocation("orespawn", "swimshorts9.png");
  
  private static final ResourceLocation WetTexture10 = new ResourceLocation("orespawn", "swimshorts10.png");
  
  private static final ResourceLocation WetTexture11 = new ResourceLocation("orespawn", "swimshorts11.png");
  
  private static final ResourceLocation WetTexture12 = new ResourceLocation("orespawn", "swimshorts12.png");
  
  private static final ResourceLocation WetTexture13 = new ResourceLocation("orespawn", "swimshorts13.png");
  
  private static final ResourceLocation WetTexture14 = new ResourceLocation("orespawn", "swimshorts14.png");
  
  private static final ResourceLocation WetTexture15 = new ResourceLocation("orespawn", "swimshorts15.png");
  
  private static final ResourceLocation WetTexture16 = new ResourceLocation("orespawn", "swimshorts16.png");
  
  private static final ResourceLocation WetTexture17 = new ResourceLocation("orespawn", "swimshorts17.png");
  
  private static final ResourceLocation PrinceTexture1 = new ResourceLocation("orespawn", "FrogPrince.png");
  
  private static final ResourceLocation PrinceTexture2 = new ResourceLocation("orespawn", "FrogPrince2.png");
  
  public Boyfriend(World par1World) {
    super(par1World);
    this.which_guy = this.rand.nextInt(28);
    this.voice = this.rand.nextInt(10);
    this.which_wet_guy = this.rand.nextInt(18);
    setSize(0.5F, 1.6F);
    this.isImmuneToFire = true;
    this.fireResistance = 100;
    getNavigator().setAvoidsWater(false);
    setSitting(false);
    this.tasks.addTask(1, new MyEntityAIFollowOwner(this, 1.4F, 12.0F, 1.5F));
    this.tasks.addTask(2, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.25D, Items.cooked_beef, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(8, new MyEntityAIWander((EntityCreature)this, 0.75F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(2, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityCreeper.class, 20.0F, 0, true, true, IMob.mobSelector)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(3, new MyEntityAINearestAttackableTarget((EntityLiving)this, EntityLiving.class, 15.0F, 0, true, true, IMob.mobSelector)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(4, new MyEntityAIJealousy(this, Boyfriend.class, 6.0F, 5, true)); 
    if (OreSpawnMain.PlayNicely == 0)
      this.targetTasks.addTask(5, new MyEntityAIJealousy(this, Boyfriend.class, 3.0F, 15, true)); 
    this.experienceValue = 0;
  }
  
  protected void entityInit() {
    super.entityInit();
    this.which_guy = this.rand.nextInt(28);
    this.dataWatcher.addObject(20, Integer.valueOf(this.which_guy));
    this.wet_count = 0;
    this.which_wet_guy = this.rand.nextInt(18);
    this.dataWatcher.addObject(22, Integer.valueOf(this.which_wet_guy));
    this.voice = this.rand.nextInt(10);
    this.dataWatcher.addObject(21, Integer.valueOf(this.voice));
    this.dataWatcher.addObject(23, Integer.valueOf(this.voice_enable));
    this.dataWatcher.addObject(24, Integer.valueOf(this.is_prince));
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
    par1NBTTagCompound.setInteger("IsPrince", this.dataWatcher.getWatchableObjectInt(24));
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.which_guy = par1NBTTagCompound.getInteger("GirlType");
    setTameSkin(this.which_guy);
    this.which_wet_guy = par1NBTTagCompound.getInteger("WetGirlType");
    setWetTameSkin(this.which_wet_guy);
    this.voice = par1NBTTagCompound.getInteger("GirlVoice");
    this.dataWatcher.updateObject(21, Integer.valueOf(this.voice));
    this.voice_enable = par1NBTTagCompound.getInteger("GirlVoiceEnable");
    this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
    this.is_prince = par1NBTTagCompound.getInteger("IsPrince");
    this.dataWatcher.updateObject(24, Integer.valueOf(this.is_prince));
  }
  
  protected void updateAITick() {
    super.updateAITick();
    ItemStack stack = getCurrentEquippedItem();
    EntityLivingBase entityLivingBase = getAttackTarget();
    if (OreSpawnMain.PlayNicely != 0)
      entityLivingBase = null; 
    if (this.worldObj.rand.nextInt(100) == 1)
      setRevengeTarget(null); 
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
                    this.worldObj.playSoundAtEntity((Entity)this, "orespawn:b_fight", 0.5F, getSoundPitch()); 
                  this.fight_sound_ticker = 3;
                } 
                this.had_target = 1;
              } 
            } else if (getDistanceToEntity((Entity)entityLivingBase) < 7.0F && stack.getItem() != OreSpawnMain.MyUltimateBow) {
              this.taunt_sound_ticker--;
              if (this.taunt_sound_ticker <= 0) {
                if (!this.worldObj.isRemote && this.voice_enable != 0)
                  this.worldObj.playSoundAtEntity((Entity)this, "orespawn:b_taunt", 0.5F, getSoundPitch()); 
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
            this.worldObj.playSoundAtEntity((Entity)this, "orespawn:b_woohoo", 0.4F, getSoundPitch()); 
        } 
      }  
  }
  
  public void setPrince(int par1) {
    this.is_prince = par1;
  }
  
  public ResourceLocation getTexture() {
    if (this.wet_count <= 0) {
      int txture = getTameSkin();
      if (this.is_prince == 1)
        return PrinceTexture1; 
      if (this.is_prince == 2)
        return PrinceTexture2; 
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
    this.which_guy = par1;
  }
  
  public int getWetTameSkin() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  public void setWetTameSkin(int par1) {
    this.dataWatcher.updateObject(22, Integer.valueOf(par1));
    this.which_wet_guy = par1;
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
      if (mygetMaxHealth() > getBoyfriendHealth())
        heal(1.0F); 
      this.auto_heal = 150;
    } 
    this.force_sync--;
    if (this.force_sync <= 0) {
      this.force_sync = 20;
      if (!this.worldObj.isRemote) {
        this.dataWatcher.updateObject(21, Integer.valueOf(this.voice));
        this.dataWatcher.updateObject(23, Integer.valueOf(this.voice_enable));
        this.dataWatcher.updateObject(24, Integer.valueOf(this.is_prince));
        setSitting(isSitting());
      } else {
        this.voice = getVoice();
        this.voice_enable = this.dataWatcher.getWatchableObjectInt(23);
        this.is_prince = this.dataWatcher.getWatchableObjectInt(24);
      } 
    } 
  }
  
  public int getBoyfriendHealth() {
    return (int)getHealth();
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (var2 != null && (var2.getItem() == Items.cooked_beef || var2.getItem() == OreSpawnMain.MyPeacock) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (!isTamed()) {
        if (!this.worldObj.isRemote)
          if (this.worldObj.rand.nextInt(3) == 0) {
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
    if (isTamed() && var2 != null && (var2.getItem() == Items.leather || var2.getItem() == OreSpawnMain.MyPeacockFeather) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D && func_152114_e((EntityLivingBase)par1EntityPlayer)) {
      if (!this.worldObj.isRemote)
        if (this.wet_count > 0 || isInWater() || handleLavaMovement()) {
          this.which_wet_guy++;
          if (this.which_wet_guy > 17)
            this.which_wet_guy = 0; 
          setWetTameSkin(this.which_wet_guy);
          this.worldObj.setEntityState((Entity)this, (byte)7);
          if (isInWater() || handleLavaMovement())
            this.wet_count = 500; 
        } else {
          this.which_guy++;
          if (this.which_guy > 27)
            this.which_guy = 0; 
          setTameSkin(this.which_guy);
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
            if (itm == OreSpawnMain.EmeraldHelmet || itm == OreSpawnMain.AmethystHelmet || itm == OreSpawnMain.UltimateHelmet) {
              ItemStack v4 = getEquipmentInSlot(4);
              setCurrentItemOrArmor(4, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.EmeraldBody || itm == OreSpawnMain.AmethystBody || itm == OreSpawnMain.UltimateBody) {
              ItemStack v4 = getEquipmentInSlot(3);
              setCurrentItemOrArmor(3, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.EmeraldLegs || itm == OreSpawnMain.AmethystLegs || itm == OreSpawnMain.UltimateLegs) {
              ItemStack v4 = getEquipmentInSlot(2);
              setCurrentItemOrArmor(2, var2);
              setCurrentItemOrArmor(0, v4);
            } 
            if (itm == OreSpawnMain.EmeraldBoots || itm == OreSpawnMain.AmethystBoots || itm == OreSpawnMain.UltimateBoots) {
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
        healthMessage = String.format("I have %d health. Thanks for asking!", new Object[] { Integer.valueOf(getBoyfriendHealth()) });
        par1EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(healthMessage));
      } 
      return true;
    } 
    return super.interact(par1EntityPlayer);
  }
  
  public boolean isWheat(ItemStack par1ItemStack) {
    if (par1ItemStack != null && (
      par1ItemStack.getItem() == Items.cooked_beef || par1ItemStack.getItem() == OreSpawnMain.MyPeacock))
      return true; 
    return false;
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected String getLivingSound() {
    if (isSitting() || this.voice_enable == 0)
      return null; 
    if (OreSpawnMain.bro_mode != 0 && this.worldObj.rand.nextInt(2) == 1)
      return null; 
    if (this.worldObj.rand.nextInt(11) == 1) {
      EntityLivingBase entityLivingBase = getAttackTarget();
      if (entityLivingBase != null)
        return null; 
      if (isInWater() || handleLavaMovement())
        return "orespawn:b_water"; 
      if (this.worldObj.rand.nextInt(4) != 0) {
        if (this.posY < 60.0D)
          return null; 
        if (this.worldObj.isThundering())
          return "orespawn:b_thunder"; 
        if (this.worldObj.isRaining())
          return "orespawn:b_rain"; 
        if (!this.worldObj.isDaytime() && 
          this.worldObj.canBlockSeeTheSky((int)this.posX, (int)this.posY, (int)this.posZ)) {
          if (this.worldObj.rand.nextInt(3) == 0)
            return "orespawn:b_dark"; 
          return null;
        } 
      } 
      if (isTamed()) {
        if (mygetMaxHealth() > getHealth())
          return "orespawn:b_hurt"; 
        if (OreSpawnMain.bro_mode != 0)
          return "orespawn:bb_happy"; 
        return "orespawn:b_happy";
      } 
      return null;
    } 
    return null;
  }
  
  protected String getHurtSound() {
    if (this.voice_enable == 0)
      return null; 
    if (OreSpawnMain.bro_mode != 0 && this.worldObj.rand.nextInt(2) == 1)
      return null; 
    return "orespawn:b_ow";
  }
  
  protected String getDeathSound() {
    if (OreSpawnMain.bro_mode != 0)
      return null; 
    return isTamed() ? "orespawn:b_death_boyfriend" : "orespawn:b_death_single";
  }
  
  protected float getSoundVolume() {
    return 0.3F;
  }
  
  protected Item getDropItem() {
    return Item.getItemFromBlock((Block)Blocks.red_flower);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = 0;
    if (isTamed()) {
      var3 = this.rand.nextInt(5);
      var3 += 2;
      for (int i = 0; i < var3; i++)
        dropItem(Item.getItemFromBlock((Block)Blocks.red_flower), 1); 
    } 
    Item v6 = OreSpawnMain.MyItemGameController;
    var3 = this.worldObj.rand.nextInt(26);
    var3 += 10;
    for (int var4 = 0; var4 < var3; var4++)
      dropItem(v6, 1); 
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
      Shoes var2 = new Shoes(this.worldObj, (EntityLivingBase)this, 6);
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
          var2 += this.worldObj.rand.nextInt((int)var2 / 2 + 2); 
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
    if (!par1DamageSource.getDamageType().equals("cactus"))
      ret = super.attackEntityFrom(par1DamageSource, p2); 
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
              s.equals("Boyfriend"))
              return true; 
          } 
        } 
      } 
    } 
    return super.getCanSpawnHere();
  }
}
