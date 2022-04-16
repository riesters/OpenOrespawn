package danger.orespawn;

import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;

public class RenderSpiderDriver extends RenderSpider {
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "spiderdriver.png");
  
  public RenderSpiderDriver(ModelSpider modelSpider, float par2) {}
  
  public void renderSpiderDriver(SpiderDriver par1EntitySpiderDriver, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntitySpiderDriver, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderSpiderDriver((SpiderDriver)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderSpiderDriver((SpiderDriver)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
  
  protected ResourceLocation getSpiderTextures(EntitySpider par1EntitySpider) {
    return texture;
  }
}
