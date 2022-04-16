package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderFlounder extends RenderLiving {
  protected ModelFlounder model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Floundertexture.png");
  
  public RenderFlounder(ModelFlounder par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelFlounder)this.mainModel;
    this.scale = par3;
  }
  
  public void renderFlounder(Flounder par1EntityFlounder, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityFlounder, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderFlounder((Flounder)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderFlounder((Flounder)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(Flounder par1Entity, float par2) {
    if (par1Entity != null && 
      par1Entity.isChild()) {
      GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
      return;
    } 
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((Flounder)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
