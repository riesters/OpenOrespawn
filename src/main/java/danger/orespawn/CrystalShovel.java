package danger.orespawn;

import com.google.common.collect.Sets;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class CrystalShovel extends ItemTool {
  public static final Set blocksEffectiveAgainst = Sets.newHashSet((Object[])new Block[] { (Block)Blocks.grass, Blocks.dirt, (Block)Blocks.sand, Blocks.gravel, Blocks.snow, Blocks.snow_layer, Blocks.clay, Blocks.farmland, (Block)Blocks.mycelium, OreSpawnMain.CrystalGrass });
  
  public CrystalShovel(int par1, Item.ToolMaterial par2) {
    super(1.0F, par2, blocksEffectiveAgainst);
    this.maxStackSize = 1;
    setCreativeTab(CreativeTabs.tabTools);
  }
  
  public boolean canHarvestBlock(Block par1Block) {
    return (par1Block == Blocks.snow);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
  }
}
