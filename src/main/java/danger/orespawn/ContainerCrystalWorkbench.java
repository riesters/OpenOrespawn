package danger.orespawn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class ContainerCrystalWorkbench extends Container {
  public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
  
  public IInventory craftResult = (IInventory)new InventoryCraftResult();
  
  private World worldObj;
  
  private int posX;
  
  private int posY;
  
  private int posZ;
  
  public ContainerCrystalWorkbench(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
    this.worldObj = par2World;
    this.posX = par3;
    this.posY = par4;
    this.posZ = par5;
    addSlotToContainer((Slot)new SlotCrafting(par1InventoryPlayer.player, (IInventory)this.craftMatrix, this.craftResult, 0, 124, 35));
    int l;
    for (l = 0; l < 3; l++) {
      for (int i1 = 0; i1 < 3; i1++)
        addSlotToContainer(new Slot((IInventory)this.craftMatrix, i1 + l * 3, 30 + i1 * 18, 17 + l * 18)); 
    } 
    for (l = 0; l < 3; l++) {
      for (int i1 = 0; i1 < 9; i1++)
        addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18)); 
    } 
    for (l = 0; l < 9; l++)
      addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, l, 8 + l * 18, 142)); 
    onCraftMatrixChanged((IInventory)this.craftMatrix);
  }
  
  public void onCraftMatrixChanged(IInventory par1IInventory) {
    this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
  }
  
  public void onContainerClosed(EntityPlayer par1EntityPlayer) {
    super.onContainerClosed(par1EntityPlayer);
    if (!this.worldObj.isRemote)
      for (int i = 0; i < 9; i++) {
        ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);
        if (itemstack != null)
          par1EntityPlayer.dropPlayerItemWithRandomChoice(itemstack, false); 
      }  
  }
  
  public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
    return (this.worldObj.getBlock(this.posX, this.posY, this.posZ) != OreSpawnMain.CrystalWorkbenchBlock) ? false : ((par1EntityPlayer.getDistanceSq(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D) <= 64.0D));
  }
  
  public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
    ItemStack itemstack = null;
    Slot slot = (Slot) this.inventorySlots.get(par2);
    if (slot != null && slot.getHasStack()) {
      ItemStack itemstack1 = slot.getStack();
      itemstack = itemstack1.copy();
      if (par2 == 0) {
        if (!mergeItemStack(itemstack1, 10, 46, true))
          return null; 
        slot.onSlotChange(itemstack1, itemstack);
      } else if (par2 >= 10 && par2 < 37) {
        if (!mergeItemStack(itemstack1, 37, 46, false))
          return null; 
      } else if (par2 >= 37 && par2 < 46) {
        if (!mergeItemStack(itemstack1, 10, 37, false))
          return null; 
      } else if (!mergeItemStack(itemstack1, 10, 46, false)) {
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
  
  public boolean func_94530_a(ItemStack par1ItemStack, Slot par2Slot) {
    return (par2Slot.inventory != this.craftResult && super.func_94530_a(par1ItemStack, par2Slot));
  }
}
