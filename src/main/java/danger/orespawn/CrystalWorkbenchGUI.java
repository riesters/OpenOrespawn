package danger.orespawn;

import net.minecraft.client.gui.inventory.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.client.resources.*;
import org.lwjgl.opengl.*;

@SideOnly(Side.CLIENT)
public class CrystalWorkbenchGUI extends GuiContainer
{
    private static final ResourceLocation craftingTableGuiTextures;
    
    public CrystalWorkbenchGUI(final InventoryPlayer par1InventoryPlayer, final World par2World, final int par3, final int par4, final int par5) {
        super(new ContainerCrystalWorkbench(par1InventoryPlayer, par2World, par3, par4, par5));
    }
    
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
        this.fontRendererObj.drawString(I18n.format("container.crafting"), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(CrystalWorkbenchGUI.craftingTableGuiTextures);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
    
    static {
        craftingTableGuiTextures = new ResourceLocation("textures/gui/container/crafting_table.png");
    }
}
