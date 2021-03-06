package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerCrystalFurnace extends Container {
  private TileEntityCrystalFurnace furnace;
  
  private int lastCookTime;
  
  private int lastBurnTime;
  
  private int lastItemBurnTime;
  
  public ContainerCrystalFurnace(InventoryPlayer par1InventoryPlayer, TileEntityCrystalFurnace par2TileEntityCrystalFurnace) {
    this.furnace = par2TileEntityCrystalFurnace;
    addSlotToContainer(new Slot((IInventory)par2TileEntityCrystalFurnace, 0, 56, 17));
    addSlotToContainer(new Slot((IInventory)par2TileEntityCrystalFurnace, 1, 56, 53));
    addSlotToContainer((Slot)new SlotFurnace(par1InventoryPlayer.player, (IInventory)par2TileEntityCrystalFurnace, 2, 116, 35));
    int i;
    for (i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++)
        addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18)); 
    } 
    for (i = 0; i < 9; i++)
      addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, i, 8 + i * 18, 142)); 
  }
  
  public void addCraftingToCrafters(ICrafting par1ICrafting) {
    super.addCraftingToCrafters(par1ICrafting);
    par1ICrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
    par1ICrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
    par1ICrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
  }
  
  public void detectAndSendChanges() {
    super.detectAndSendChanges();
    for (int i = 0; i < this.crafters.size(); i++) {
      ICrafting icrafting = (ICrafting) this.crafters.get(i);
      if (this.lastCookTime != this.furnace.furnaceCookTime)
        icrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime); 
      if (this.lastBurnTime != this.furnace.furnaceBurnTime)
        icrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime); 
      if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
        icrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime); 
    } 
    this.lastCookTime = this.furnace.furnaceCookTime;
    this.lastBurnTime = this.furnace.furnaceBurnTime;
    this.lastItemBurnTime = this.furnace.currentItemBurnTime;
  }
  
  @SideOnly(Side.CLIENT)
  public void updateProgressBar(int par1, int par2) {
    if (par1 == 0)
      this.furnace.furnaceCookTime = par2; 
    if (par1 == 1)
      this.furnace.furnaceBurnTime = par2; 
    if (par1 == 2)
      this.furnace.currentItemBurnTime = par2; 
  }
  
  public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
    return this.furnace.isUseableByPlayer(par1EntityPlayer);
  }
  
  public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
    ItemStack itemstack = null;
    Slot slot = (Slot) this.inventorySlots.get(par2);
    if (slot != null && slot.getHasStack()) {
      ItemStack itemstack1 = slot.getStack();
      itemstack = itemstack1.copy();
      if (par2 == 2) {
        if (!mergeItemStack(itemstack1, 3, 39, true))
          return null; 
        slot.onSlotChange(itemstack1, itemstack);
      } else if (par2 != 1 && par2 != 0) {
        if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null) {
          if (!mergeItemStack(itemstack1, 0, 1, false))
            return null; 
        } else if (TileEntityCrystalFurnace.isItemFuel(itemstack1)) {
          if (!mergeItemStack(itemstack1, 1, 2, false))
            return null; 
        } else if (par2 >= 3 && par2 < 30) {
          if (!mergeItemStack(itemstack1, 30, 39, false))
            return null; 
        } else if (par2 >= 30 && par2 < 39 && !mergeItemStack(itemstack1, 3, 30, false)) {
          return null;
        } 
      } else if (!mergeItemStack(itemstack1, 3, 39, false)) {
        return null;
      } 
      if (itemstack1.stackSize == 0) {
        slot.putStack((ItemStack)null);
      } else {
        slot.onSlotChanged();
      } 
      if (itemstack1.stackSize == itemstack.stackSize)
        return null; 
      slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
    } 
    return itemstack;
  }
}
