package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderSpinner extends Render {
  public int spinItemIconIndex = 160;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "spinners.png");
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    //this;
    bindTexture(texture);
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glEnable(32826);
    GL11.glScalef(0.5F, 0.5F, 0.5F);
    Tessellator var10 = Tessellator.instance;
    func_77026_a(var10, this.spinItemIconIndex, par1Entity.rotationPitch);
    GL11.glDisable(32826);
    GL11.glPopMatrix();
  }
  
  private void func_77026_a(Tessellator par1Tessellator, int par2, float par3) {
    float var3 = (par2 % 16 * 16 + 0) / 256.0F;
    float var4 = (par2 % 16 * 16 + 16) / 256.0F;
    float var5 = (par2 / 16 * 16 + 0) / 256.0F;
    float var6 = (par2 / 16 * 16 + 16) / 256.0F;
    float var7 = 1.0F;
    float var8 = 0.5F;
    float var9 = 0.25F;
    GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(par3, 0.0F, 0.0F, 1.0F);
    par1Tessellator.startDrawingQuads();
    par1Tessellator.setNormal(0.0F, 1.0F, 0.0F);
    par1Tessellator.addVertexWithUV((0.0F - var8), (0.0F - var9), 0.0D, var3, var6);
    par1Tessellator.addVertexWithUV((var7 - var8), (0.0F - var9), 0.0D, var4, var6);
    par1Tessellator.addVertexWithUV((var7 - var8), (var7 - var9), 0.0D, var4, var5);
    par1Tessellator.addVertexWithUV((0.0F - var8), (var7 - var9), 0.0D, var3, var5);
    par1Tessellator.draw();
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
