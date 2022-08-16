package danger.orespawn;

import net.minecraftforge.client.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import org.lwjgl.opengl.*;
import cpw.mods.fml.client.*;

public class RenderChainsaw implements IItemRenderer
{
    protected ModelChainsaw modelChainsaw;
    private static final ResourceLocation texture;
    
    public RenderChainsaw() {
        this.modelChainsaw = new ModelChainsaw();
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return true;
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        switch (type) {
            case EQUIPPED: {
                this.renderSwordF5();
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                this.renderSword();
                break;
            }
        }
    }
    
    private void renderSword() {
        GL11.glPushMatrix();
        GL11.glRotatef(150.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(100.0f, 1.0f, 0.0f, 0.0f);
        GL11.glScalef((float) 0.25, (float) 0.25, (float) 0.25);
        GL11.glTranslatef((float) -10.0, (float) 1.0, (float) -4.0);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderChainsaw.texture);
        this.modelChainsaw.render();
        GL11.glPopMatrix();
    }
    
    private void renderSwordF5() {
        GL11.glPushMatrix();
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-20.0f, 1.0f, 0.0f, 0.0f);
        GL11.glScalef((float) 0.25, (float) 0.25, (float) 0.25);
        GL11.glTranslatef((float) -3.0, (float) -3.0, (float) -2.0);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderChainsaw.texture);
        this.modelChainsaw.render();
        GL11.glPopMatrix();
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Chainsawtexture.png");
    }
}
