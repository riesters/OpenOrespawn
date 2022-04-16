package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderRobot1 extends RenderLiving {
  protected ModelRobot1 model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Robot1.png");
  
  public RenderRobot1(ModelRobot1 par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelRobot1)this.mainModel;
    this.scale = par3;
  }
  
  public void renderRobot1(Robot1 par1EntityRobot1, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityRobot1, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderRobot1((Robot1)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderRobot1((Robot1)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(Robot1 par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((Robot1)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
