package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderGodzillaHead extends RenderLiving {
  public RenderGodzillaHead(ModelGodzilla par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
  }
  
  public void renderGodzillaHead(GodzillaHead par1EntityGodzillaHead, double par2, double par4, double par6, float par8, float par9) {}
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {}
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {}
  
  protected void preRenderScale(GodzillaHead par1Entity, float par2) {}
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {}
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return null;
  }
}
