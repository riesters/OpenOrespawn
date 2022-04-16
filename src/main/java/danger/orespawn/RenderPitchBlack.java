package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPitchBlack extends RenderLiving {
  protected ModelPitchBlack model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "PitchBlacktexture.png");
  
  public RenderPitchBlack(ModelPitchBlack par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelPitchBlack)this.mainModel;
    this.scale = par3;
  }
  
  public void renderPitchBlack(PitchBlack par1EntityPitchBlack, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityPitchBlack, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderPitchBlack((PitchBlack)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderPitchBlack((PitchBlack)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(PitchBlack par1Entity, float par2) {
    float pscale = par1Entity.getPitchBlackScale();
    GL11.glScalef(pscale, pscale, pscale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((PitchBlack)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
