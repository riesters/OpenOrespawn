package danger.orespawn;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCrystalFurnace extends TileEntity implements ISidedInventory {
  private static final int[] slots_top = new int[] { 0 };
  
  private static final int[] slots_bottom = new int[] { 2, 1 };
  
  private static final int[] slots_sides = new int[] { 1 };
  
  private ItemStack[] furnaceItemStacks = new ItemStack[3];
  
  public int furnaceBurnTime;
  
  public int currentItemBurnTime;
  
  public int furnaceCookTime;
  
  private String field_94130_e;
  
  public int getSizeInventory() {
    return this.furnaceItemStacks.length;
  }
  
  public ItemStack getStackInSlot(int par1) {
    return this.furnaceItemStacks[par1];
  }
  
  public ItemStack decrStackSize(int par1, int par2) {
    if (this.furnaceItemStacks[par1] != null) {
      if ((this.furnaceItemStacks[par1]).stackSize <= par2) {
        ItemStack itemStack = this.furnaceItemStacks[par1];
        this.furnaceItemStacks[par1] = null;
        return itemStack;
      } 
      ItemStack itemstack = this.furnaceItemStacks[par1].splitStack(par2);
      if ((this.furnaceItemStacks[par1]).stackSize == 0)
        this.furnaceItemStacks[par1] = null; 
      return itemstack;
    } 
    return null;
  }
  
  public ItemStack getStackInSlotOnClosing(int par1) {
    if (this.furnaceItemStacks[par1] != null) {
      ItemStack itemstack = this.furnaceItemStacks[par1];
      this.furnaceItemStacks[par1] = null;
      return itemstack;
    } 
    return null;
  }
  
  public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
    this.furnaceItemStacks[par1] = par2ItemStack;
    if (par2ItemStack != null && par2ItemStack.stackSize > getInventoryStackLimit())
      par2ItemStack.stackSize = getInventoryStackLimit(); 
  }
  
  public String getInventoryName() {
    return hasCustomInventoryName() ? this.field_94130_e : "container.furnace";
  }
  
  public boolean hasCustomInventoryName() {
    return (this.field_94130_e != null && this.field_94130_e.length() > 0);
  }
  
  public void func_145951_a(String par1Str) {
    this.field_94130_e = par1Str;
  }
  
  public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
    super.readFromNBT(par1NBTTagCompound);
    NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", 10);
    this.furnaceItemStacks = new ItemStack[getSizeInventory()];
    for (int i = 0; i < nbttaglist.tagCount(); i++) {
      NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
      byte b0 = nbttagcompound1.getByte("Slot");
      if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
        this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1); 
    } 
    this.furnaceBurnTime = par1NBTTagCompound.getShort("BurnTime");
    this.furnaceCookTime = par1NBTTagCompound.getShort("CookTime");
    this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
    if (par1NBTTagCompound.hasKey("CustomName"))
      this.field_94130_e = par1NBTTagCompound.getString("CustomName"); 
  }
  
  public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
    super.writeToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setShort("BurnTime", (short)this.furnaceBurnTime);
    par1NBTTagCompound.setShort("CookTime", (short)this.furnaceCookTime);
    NBTTagList nbttaglist = new NBTTagList();
    for (int i = 0; i < this.furnaceItemStacks.length; i++) {
      if (this.furnaceItemStacks[i] != null) {
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.setByte("Slot", (byte)i);
        this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
        nbttaglist.appendTag((NBTBase)nbttagcompound1);
      } 
    } 
    par1NBTTagCompound.setTag("Items", (NBTBase)nbttaglist);
    if (hasCustomInventoryName())
      par1NBTTagCompound.setString("CustomName", this.field_94130_e); 
  }
  
  public int getInventoryStackLimit() {
    return 64;
  }
  
  @SideOnly(Side.CLIENT)
  public int getCookProgressScaled(int par1) {
    return this.furnaceCookTime * par1 / 150;
  }
  
  @SideOnly(Side.CLIENT)
  public int getBurnTimeRemainingScaled(int par1) {
    if (this.currentItemBurnTime == 0)
      this.currentItemBurnTime = 150; 
    return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
  }
  
  public boolean isBurning() {
    return (this.furnaceBurnTime > 0);
  }
  
  public void updateEntity() {
    boolean flag = (this.furnaceBurnTime > 0);
    boolean flag1 = false;
    if (this.furnaceBurnTime > 0)
      this.furnaceBurnTime--; 
    if (!this.worldObj.isRemote) {
      if (this.furnaceBurnTime == 0 && canSmelt()) {
        this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
        if (this.furnaceBurnTime > 0) {
          flag1 = true;
          if (this.furnaceItemStacks[1] != null) {
            (this.furnaceItemStacks[1]).stackSize--;
            if ((this.furnaceItemStacks[1]).stackSize == 0)
              this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]); 
          } 
        } 
      } 
      if (isBurning() && canSmelt()) {
        this.furnaceCookTime++;
        if (this.furnaceCookTime == 150) {
          this.furnaceCookTime = 0;
          smeltItem();
          flag1 = true;
        } 
      } else {
        this.furnaceCookTime = 0;
      } 
      if (flag != ((this.furnaceBurnTime > 0))) {
        flag1 = true;
        CrystalFurnace.updateFurnaceBlockState((this.furnaceBurnTime > 0), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
      } 
    } 
    if (flag1)
      markDirty(); 
  }
  
  private boolean canSmelt() {
    if (this.furnaceItemStacks[0] == null)
      return false; 
    ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
    if (itemstack == null)
      return false; 
    if (this.furnaceItemStacks[2] == null)
      return true; 
    if (!this.furnaceItemStacks[2].isItemEqual(itemstack))
      return false; 
    int result = (this.furnaceItemStacks[2]).stackSize + itemstack.stackSize;
    return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
  }
  
  public void smeltItem() {
    if (canSmelt()) {
      ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
      if (this.furnaceItemStacks[2] == null) {
        this.furnaceItemStacks[2] = itemstack.copy();
      } else if (this.furnaceItemStacks[2].isItemEqual(itemstack)) {
        (this.furnaceItemStacks[2]).stackSize += itemstack.stackSize;
      } 
      (this.furnaceItemStacks[0]).stackSize--;
      if ((this.furnaceItemStacks[0]).stackSize <= 0)
        this.furnaceItemStacks[0] = null; 
    } 
  }
  
  public static int getItemBurnTime(ItemStack par0ItemStack) {
    if (par0ItemStack == null)
      return 0; 
    Item item = par0ItemStack.getItem();
    if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
      Block block = Block.getBlockFromItem(item);
      if (block == Blocks.wooden_slab)
        return 150; 
      if (block.getMaterial() == Material.wood)
        return 300; 
      if (block == Blocks.coal_block)
        return 16000; 
    } 
    if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD"))
      return 200; 
    if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD"))
      return 200; 
    if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD"))
      return 200; 
    if (item == Items.stick)
      return 100; 
    if (item == Items.coal)
      return 1600; 
    if (item == Items.lava_bucket)
      return 20000; 
    if (item == Item.getItemFromBlock(Blocks.sapling))
      return 100; 
    if (item == Items.blaze_rod)
      return 2400; 
    if (item == Item.getItemFromBlock(OreSpawnMain.CrystalCoal))
      return 20000; 
    if (item == Item.getItemFromBlock(OreSpawnMain.MyCrystalTreeLog))
      return 800; 
    if (item == Item.getItemFromBlock(OreSpawnMain.CrystalPlanksBlock))
      return 400; 
    return GameRegistry.getFuelValue(par0ItemStack);
  }
  
  public static boolean isItemFuel(ItemStack par0ItemStack) {
    return (getItemBurnTime(par0ItemStack) > 0);
  }
  
  public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
    return (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) ? false : ((par1EntityPlayer.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D));
  }
  
  public void openChest() {}
  
  public void closeChest() {}
  
  public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack) {
    return (par1 == 2) ? false : ((par1 == 1) ? isItemFuel(par2ItemStack) : true);
  }
  
  public int[] getAccessibleSlotsFromSide(int par1) {
    return (par1 == 0) ? slots_bottom : ((par1 == 1) ? slots_top : slots_sides);
  }
  
  public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3) {
    return isItemValidForSlot(par1, par2ItemStack);
  }
  
  public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3) {
    return (par3 != 0 || par1 != 1 || par2ItemStack.getItem() == Items.bucket);
  }
  
  public void openInventory() {}
  
  public void closeInventory() {}
}
