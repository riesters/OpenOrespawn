package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCliffRacer extends RenderLiving {
  protected ModelCliffRacer model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Cliffracertexture.png");
  
  public RenderCliffRacer(ModelCliffRacer par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelCliffRacer)this.mainModel;
    this.scale = par3;
  }
  
  public void renderCliffRacer(CliffRacer par1EntityCliffRacer, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityCliffRacer, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderCliffRacer((CliffRacer)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderCliffRacer((CliffRacer)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(CliffRacer par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((CliffRacer)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
