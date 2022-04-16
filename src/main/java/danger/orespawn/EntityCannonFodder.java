package danger.orespawn;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityCannonFodder extends EntityTameable {
  String name_one = null;
  
  String name_two = null;
  
  private int is_activated = 0;
  
  private int hat_color = 0;
  
  private int syncer = 0;
  
  private int px = 0;
  
  private int pz = 0;
  
  private int py = 0;
  
  private GenericTargetSorter LocalTargetSorter = null;
  
  public EntityCannonFodder(World par1World) {
    super(par1World);
    this.LocalTargetSorter = new GenericTargetSorter((Entity)this);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(20, Integer.valueOf(0));
    this.dataWatcher.addObject(21, Integer.valueOf(0));
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.syncer++;
    if (this.syncer > 5) {
      if (this.worldObj.isRemote) {
        this.is_activated = this.dataWatcher.getWatchableObjectInt(20);
        this.hat_color = this.dataWatcher.getWatchableObjectInt(21);
      } else {
        this.dataWatcher.updateObject(20, Integer.valueOf(this.is_activated));
        this.dataWatcher.updateObject(21, Integer.valueOf(this.hat_color));
      } 
      this.syncer = 0;
    } 
  }
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    if (var2 != null)
      if (var2.stackSize <= 0) {
        par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
        var2 = null;
      }  
    if (super.interact(par1EntityPlayer))
      return true; 
    if (this.name_one != null && isTamed())
      if (this.name_one.equals(par1EntityPlayer.getUniqueID().toString())) {
        if (this.name_two == null) {
          this.name_two = this.name_one;
          this.name_one = par1EntityPlayer.getUniqueID().toString();
          func_152115_b(this.name_one);
          this.is_activated = 2;
        } 
      } else if (this.name_two != null) {
        if (this.name_two.equals(par1EntityPlayer.getUniqueID().toString())) {
          this.name_two = this.name_one;
          this.name_one = par1EntityPlayer.getUniqueID().toString();
          func_152115_b(this.name_one);
          this.is_activated = 2;
        } else {
          return true;
        } 
      } else {
        this.name_two = this.name_one;
        this.name_one = par1EntityPlayer.getUniqueID().toString();
        func_152115_b(this.name_one);
        this.is_activated = 2;
      }  
    if (var2 != null && var2.getItem() == Items.carrot && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      this.hat_color = 1;
      if (this.name_one == null)
        this.name_one = par1EntityPlayer.getUniqueID().toString(); 
      if (this.is_activated == 0)
        this.is_activated = 1; 
      setTamed(true);
      func_152115_b(this.name_one);
      playTameEffect(true);
      heal(getMaxHealth() - getHealth());
      func_110163_bv();
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (var2 != null && var2.getItem() == Items.potato && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      this.hat_color = 3;
      if (this.name_one == null)
        this.name_one = par1EntityPlayer.getUniqueID().toString(); 
      if (this.is_activated == 0)
        this.is_activated = 1; 
      setTamed(true);
      func_152115_b(this.name_one);
      playTameEffect(true);
      heal(getMaxHealth() - getHealth());
      func_110163_bv();
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (var2 != null && var2.getItem() == OreSpawnMain.MyQuinoa && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      this.hat_color = 2;
      if (this.name_one == null)
        this.name_one = par1EntityPlayer.getUniqueID().toString(); 
      if (this.is_activated == 0)
        this.is_activated = 1; 
      setTamed(true);
      func_152115_b(this.name_one);
      playTameEffect(true);
      heal(getMaxHealth() - getHealth());
      func_110163_bv();
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (var2 != null && this.is_activated == 2 && var2.getItem() == OreSpawnMain.MyCornCob && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      String myname = "Ostrich";
      if (this instanceof Lizard)
        myname = "Lizard"; 
      if (this instanceof Chipmunk)
        myname = "Chipmunk"; 
      if (this instanceof VelocityRaptor)
        myname = "Velocity Raptor"; 
      if (!this.worldObj.isRemote) {
        Entity newent = spawnCreature(this.worldObj, myname, this.posX + this.worldObj.rand.nextFloat(), this.posY + 0.01D, this.posZ + this.worldObj.rand.nextFloat());
        if (newent != null) {
          EntityCannonFodder cf = (EntityCannonFodder)newent;
          cf.func_152115_b(func_152113_b());
          cf.setTamed(true);
          cf.setStuff(this.hat_color, this.is_activated, this.name_one, this.name_two);
        } 
      } 
      playTameEffect(true);
      this.worldObj.playSoundAtEntity((Entity)par1EntityPlayer, "random.explode", 0.75F, 2.0F);
      if (!par1EntityPlayer.capabilities.isCreativeMode) {
        var2.stackSize--;
        if (var2.stackSize <= 0)
          par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null); 
      } 
      return true;
    } 
    if (this.is_activated == 2 && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0D) {
      if (isSitting()) {
        setSitting(false);
        playTameEffect(true);
      } else {
        setSitting(true);
        playTameEffect(false);
        this.px = (int)this.posX;
        this.py = (int)this.posY;
        this.pz = (int)this.posZ;
      } 
      return true;
    } 
    return false;
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
  
  public void setStuff(int hc, int ia, String s1, String s2) {
    this.hat_color = hc;
    this.is_activated = ia;
    this.name_one = s1;
    this.name_two = s2;
    func_110163_bv();
  }
  
  public int getHatColor() {
    return this.hat_color;
  }
  
  public int get_is_activated() {
    return this.is_activated;
  }
  
  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeEntityToNBT(par1NBTTagCompound);
    if (this.name_one == null) {
      par1NBTTagCompound.setString("NameOne", "");
    } else {
      par1NBTTagCompound.setString("NameOne", this.name_one);
    } 
    if (this.name_two == null) {
      par1NBTTagCompound.setString("NameTwo", "");
    } else {
      par1NBTTagCompound.setString("NameTwo", this.name_two);
    } 
    par1NBTTagCompound.setInteger("IsActivated", this.is_activated);
    par1NBTTagCompound.setInteger("HatColor", this.hat_color);
    par1NBTTagCompound.setInteger("PatrolX", this.px);
    par1NBTTagCompound.setInteger("PatrolY", this.py);
    par1NBTTagCompound.setInteger("PatrolZ", this.pz);
  }
  
  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readEntityFromNBT(par1NBTTagCompound);
    this.name_one = par1NBTTagCompound.getString("NameOne");
    if (this.name_one != null && this.name_one.equals(""))
      this.name_one = null; 
    this.name_two = par1NBTTagCompound.getString("NameTwo");
    if (this.name_two != null && this.name_two.equals(""))
      this.name_two = null; 
    this.is_activated = par1NBTTagCompound.getInteger("IsActivated");
    this.hat_color = par1NBTTagCompound.getInteger("HatColor");
    this.px = par1NBTTagCompound.getInteger("PatrolX");
    this.py = par1NBTTagCompound.getInteger("PatrolY");
    this.pz = par1NBTTagCompound.getInteger("PatrolZ");
    if (this.name_one != null) {
      setTamed(true);
      func_152115_b(this.name_one);
    } 
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      return false; 
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (isSitting()) {
      double dx = this.px - par1EntityLiving.posX;
      double dy = this.py - par1EntityLiving.posY;
      double dz = this.pz - par1EntityLiving.posZ;
      if (dx * dx + dy * dy + dz * dz > 144.0D)
        return false; 
    } 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityMob)
      return true; 
    if (par1EntityLiving instanceof EntityCannonFodder) {
      EntityCannonFodder cf = (EntityCannonFodder)par1EntityLiving;
      int i = cf.getHatColor();
      if (i != 0 && i != this.hat_color)
        return true; 
      return false;
    } 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode == true)
        return false; 
      if (this.name_one != null && this.name_one.equals(p.getUniqueID().toString()))
        return false; 
      if (this.name_two != null && this.name_two.equals(p.getUniqueID().toString()))
        return false; 
      return true;
    } 
    return false;
  }
  
  private EntityLivingBase findSomethingToAttack() {
    List<?> var5 = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.boundingBox.expand(10.0D, 4.0D, 10.0D));
    Collections.sort(var5, this.LocalTargetSorter);
    Iterator<?> var2 = var5.iterator();
    Entity var3 = null;
    EntityLivingBase var4 = null;
    while (var2.hasNext()) {
      var3 = (Entity)var2.next();
      var4 = (EntityLivingBase)var3;
      if (isSuitableTarget(var4, false))
        return var4; 
    } 
    return null;
  }
  
  public int getTotalArmorValue() {
    if (this.is_activated == 2)
      return 3; 
    return 0;
  }
  
  public void attackEntityAsFodder(Entity par1Entity, float f) {
    par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
  }
  
  protected void updateAITasks() {
    if (this.isDead)
      return; 
    super.updateAITasks();
    if (this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget(null); 
    if (this.is_activated != 2)
      return; 
    int pfreq = 5;
    int sfreq = 7;
    float dm = 4.0F;
    if (this instanceof Chipmunk) {
      dm = 3.0F;
      sfreq = 6;
    } 
    if (this instanceof Lizard) {
      dm = 6.0F;
      sfreq = 8;
    } 
    if (this instanceof VelocityRaptor) {
      sfreq = 6;
      pfreq = 4;
    } 
    if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.rand.nextInt(pfreq) == 1) {
      EntityLivingBase e = findSomethingToAttack();
      if (e != null) {
        getNavigator().tryMoveToEntityLiving((Entity)e, 1.25D);
        if (getDistanceSqToEntity((Entity)e) < 9.0D)
          if (this.rand.nextInt(sfreq + 1) == 0 || this.rand.nextInt(sfreq) == 1)
            attackEntityAsFodder((Entity)e, dm);  
      } else if (isSitting()) {
        getNavigator().tryMoveToXYZ(this.px, this.py, this.pz, 0.6499999761581421D);
      } 
    } 
    if (this.worldObj.rand.nextInt(250) == 1)
      heal(1.0F); 
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
}
