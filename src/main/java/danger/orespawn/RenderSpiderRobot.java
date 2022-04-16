package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSpiderRobot extends RenderLiving {
  protected ModelSpiderRobot model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "SpiderRobottexture.png");
  
  public RenderSpiderRobot(ModelSpiderRobot par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelSpiderRobot)this.mainModel;
    this.scale = par3;
  }
  
  public void renderSpiderRobot(SpiderRobot par1EntitySpiderRobot, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
    bindTexture(texture);
    GL11.glScalef(-1.0F, -1.0F, 1.0F);
    this.model.render((Entity)par1EntitySpiderRobot, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderSpiderRobot((SpiderRobot)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderSpiderRobot((SpiderRobot)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(SpiderRobot par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((SpiderRobot)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
