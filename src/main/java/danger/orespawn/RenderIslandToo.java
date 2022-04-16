package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderIslandToo extends RenderLiving {
  protected ModelIsland model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "IslandToo.png");
  
  public RenderIslandToo(ModelIsland par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelIsland)this.mainModel;
    this.scale = par3;
  }
  
  public void renderIslandToo(IslandToo par1EntityIslandToo, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityIslandToo, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderIslandToo((IslandToo)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderIslandToo((IslandToo)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(IslandToo par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((IslandToo)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}
