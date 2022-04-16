package danger.orespawn;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderSquidZooka implements IItemRenderer {
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "SquidZookatexture.png");
  
  protected ModelSquidZooka modelSquidZooka = new ModelSquidZooka();
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
    switch (type) {
      case EQUIPPED:
        return true;
      case EQUIPPED_FIRST_PERSON:
        return true;
    } 
    return false;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
    return true;
  }
  
  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
    switch (type) {
      case EQUIPPED:
        renderSwordF5(2.0F, 8.0F, 2.0F, 0.35F);
        break;
      case EQUIPPED_FIRST_PERSON:
        renderSword(4.0F, 2.0F, 2.0F, 0.35F);
        break;
    } 
  }
  
  private void renderSword(float x, float y, float z, float scale) {
    GL11.glPushMatrix();
    GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
    GL11.glScalef(scale, scale, scale);
    GL11.glTranslatef(x, y, z);
    (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
    this.modelSquidZooka.render();
    GL11.glPopMatrix();
  }
  
  private void renderSwordF5(float x, float y, float z, float scale) {
    GL11.glPushMatrix();
    GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
    GL11.glScalef(scale, scale, scale);
    GL11.glTranslatef(x, y, z);
    (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
    this.modelSquidZooka.render();
    GL11.glPopMatrix();
  }
}
