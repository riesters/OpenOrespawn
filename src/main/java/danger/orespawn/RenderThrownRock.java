package danger.orespawn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderThrownRock extends Render {
  private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "textures/items/rocksmall.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "textures/items/rock.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "textures/items/rockred.png");
  
  private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "textures/items/rockgreen.png");
  
  private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "textures/items/rockblue.png");
  
  private static final ResourceLocation texture6 = new ResourceLocation("orespawn", "textures/items/rockpurple.png");
  
  private static final ResourceLocation texture7 = new ResourceLocation("orespawn", "textures/items/rockspikey.png");
  
  private static final ResourceLocation texture8 = new ResourceLocation("orespawn", "textures/items/rocktnt.png");
  
  private static final ResourceLocation texture9 = new ResourceLocation("orespawn", "textures/items/rockcrystalred.png");
  
  private static final ResourceLocation texture10 = new ResourceLocation("orespawn", "textures/items/rockcrystalgreen.png");
  
  private static final ResourceLocation texture11 = new ResourceLocation("orespawn", "textures/items/rockcrystalblue.png");
  
  private static final ResourceLocation texture12 = new ResourceLocation("orespawn", "textures/items/rockcrystaltnt.png");
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    bindTexture(getEntityTexture(par1Entity));
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glEnable(32826);
    GL11.glScalef(0.5F, 0.5F, 0.5F);
    Tessellator var10 = Tessellator.instance;
    func_77026_a(var10, 0, par1Entity.rotationPitch);
    GL11.glDisable(32826);
    GL11.glPopMatrix();
  }
  
  private void func_77026_a(Tessellator par1Tessellator, int par2, float par3) {
    float var3 = (par2 % 16 * 16 + 0) / 16.0F;
    float var4 = (par2 % 16 * 16 + 16) / 16.0F;
    float var5 = (par2 / 16 * 16 + 0) / 16.0F;
    float var6 = (par2 / 16 * 16 + 16) / 16.0F;
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
    EntityThrownRock r = (EntityThrownRock)entity;
    if (r.getRockType() == 1)
      return texture1; 
    if (r.getRockType() == 2)
      return texture2; 
    if (r.getRockType() == 3)
      return texture3; 
    if (r.getRockType() == 4)
      return texture4; 
    if (r.getRockType() == 5)
      return texture5; 
    if (r.getRockType() == 6)
      return texture6; 
    if (r.getRockType() == 7)
      return texture7; 
    if (r.getRockType() == 8)
      return texture8; 
    if (r.getRockType() == 9)
      return texture9; 
    if (r.getRockType() == 10)
      return texture10; 
    if (r.getRockType() == 11)
      return texture11; 
    if (r.getRockType() == 12)
      return texture12; 
    return texture1;
  }
}
