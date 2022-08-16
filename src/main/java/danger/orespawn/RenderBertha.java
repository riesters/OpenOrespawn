package danger.orespawn;

import net.minecraftforge.client.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import org.lwjgl.opengl.*;
import cpw.mods.fml.client.*;

public class RenderBertha implements IItemRenderer
{
    protected ModelBertha modelBertha;
    private static final ResourceLocation texture;
    
    public RenderBertha() {
        this.modelBertha = new ModelBertha();
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
        GL11.glRotatef(190.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef((float) 0.25, (float) 0.25, (float) 0.25);
        GL11.glTranslatef((float) 6.0, (float) 3.0, (float) -5.0);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderBertha.texture);
        this.modelBertha.render();
        GL11.glPopMatrix();
    }
    
    private void renderSwordF5() {
        GL11.glPushMatrix();
        GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef((float) 0.25, (float) 0.25, (float) 0.25);
        GL11.glTranslatef((float) -4.0, (float) 2.0, (float) -3.0);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderBertha.texture);
        this.modelBertha.render();
        GL11.glPopMatrix();
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Berthatexture.png");
    }
}
