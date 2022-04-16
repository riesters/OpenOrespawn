package danger.orespawn;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderHammy implements IItemRenderer {
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "AttitudeAdjustertexture.png");
  
  protected ModelHammy modelHammy = new ModelHammy();
  
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
        renderSwordF5(6.0F, -20.0F, -4.0F, 0.15F);
        break;
      case EQUIPPED_FIRST_PERSON:
        renderSword(-10.0F, -13.0F, -5.0F, 0.15F);
        break;
    } 
  }
  
  private void renderSword(float x, float y, float z, float scale) {
    GL11.glPushMatrix();
    GL11.glRotatef(70.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(190.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
    GL11.glScalef(scale, scale, scale);
    GL11.glTranslatef(x, y, z);
    (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
    this.modelHammy.render();
    GL11.glPopMatrix();
  }
  
  private void renderSwordF5(float x, float y, float z, float scale) {
    GL11.glPushMatrix();
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glScalef(scale, scale, scale);
    GL11.glTranslatef(x, y, z);
    (FMLClientHandler.instance().getClient()).renderEngine.bindTexture(texture);
    this.modelHammy.render();
    GL11.glPopMatrix();
  }
}
