package danger.orespawn;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class OreSpawnGUIHandler implements IGuiHandler {
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    TileEntity tileEntity = world.getTileEntity(x, y, z);
    switch (ID) {
      case 0:
        if (tileEntity instanceof TileEntityCrystalFurnace)
          return new ContainerCrystalFurnace(player.inventory, (TileEntityCrystalFurnace)tileEntity); 
        break;
      case 1:
        return new ContainerCrystalWorkbench(player.inventory, world, x, y, z);
    } 
    return null;
  }
  
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    TileEntity tileEntity = world.getTileEntity(x, y, z);
    switch (ID) {
      case 0:
        if (tileEntity instanceof TileEntityCrystalFurnace)
          return new CrystalFurnaceGUI(player.inventory, (TileEntityCrystalFurnace)tileEntity); 
        break;
      case 1:
        return new CrystalWorkbenchGUI(player.inventory, world, x, y, z);
    } 
    return null;
  }
}
