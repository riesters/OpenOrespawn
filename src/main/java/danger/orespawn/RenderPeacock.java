package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPeacock extends RenderLiving {
  protected ModelPeacock model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "peacocktexture.png");
  
  public RenderPeacock(ModelPeacock par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelPeacock)this.mainModel;
    this.scale = par3;
  }
  
  public void renderPeacock(Peacock par1EntityPeacock, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityPeacock, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderPeacock((Peacock)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderPeacock((Peacock)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(Peacock par1Entity, float par2) {
    if (par1Entity != null && 
      par1Entity.isChild()) {
      GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
      return;
    } 
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((Peacock)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
