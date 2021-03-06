package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockRadish extends BlockCrops {
  private IIcon[] iconArray;
  
  public BlockRadish(int par1) {}
  
  public IIcon getIcon(int par1, int par2) {
    if (par2 < 7) {
      if (par2 >= 6)
        par2 = 4; 
      return this.iconArray[par2 >> 1];
    } 
    return this.iconArray[3];
  }
  
  public int quantityDropped(Random par1Random) {
    return 2 + par1Random.nextInt(4);
  }
  
  protected Item func_149866_i() {
    return OreSpawnMain.MyRadish;
  }
  
  protected Item func_149865_P() {
    return OreSpawnMain.MyRadish;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IIconRegister) {
    this.iconArray = new IIcon[4];
    for (int i = 0; i < this.iconArray.length; i++)
      this.iconArray[i] = par1IIconRegister.registerIcon("OreSpawn:radish_" + i); 
  }
}
