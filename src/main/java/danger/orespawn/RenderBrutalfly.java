package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderBrutalfly extends RenderLiving {
  protected ModelBrutalfly model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation overlay = new ResourceLocation("orespawn", "Brutalfly_overlay2.png");
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Brutalflytexture.png");
  
  public RenderBrutalfly(ModelBrutalfly par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelBrutalfly)this.mainModel;
    this.scale = par3;
  }
  
  public void renderBrutalfly(Brutalfly par1Brutalfly, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1Brutalfly, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderBrutalfly((Brutalfly)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderBrutalfly((Brutalfly)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(Brutalfly par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((Brutalfly)par1EntityLiving, par2);
  }
  
  public int shouldRenderPass(EntityLivingBase par1EntityLiving, int par2, float par3) {
    int doit = 0;
    GL11.glDepthMask(true);
    if (par2 == 1) {
      float var4 = par1EntityLiving.ticksExisted + par3;
      bindTexture(overlay);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var5 = var4 * 0.01F;
      float var6 = var4 * 0.01F;
      GL11.glTranslatef(var5, var6, 0.0F);
      setRenderPassModel(this.model);
      GL11.glMatrixMode(5888);
      GL11.glEnable(3042);
      float var7 = 0.5F;
      GL11.glColor4f(var7, var7, var7, 1.0F);
      GL11.glDisable(2896);
      GL11.glBlendFunc(1, 1);
      return 1;
    } 
    if (par2 == 2) {
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glEnable(2896);
      GL11.glDisable(3042);
    } 
    return -1;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
