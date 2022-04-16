package danger.orespawn;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderOstrich extends RenderLiving {
  protected ModelOstrich model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Ostrichtexture.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "Ostrichtexture2.png");
  
  private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "Ostrichtexture3.png");
  
  public RenderOstrich(ModelOstrich par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelOstrich)this.mainModel;
    this.scale = par3;
  }
  
  public void renderOstrich(Ostrich par1EntityOstrich, double par2, double par4, double par6, float par8, float par9) {
    super.doRender((EntityLiving)par1EntityOstrich, par2, par4, par6, par8, par9);
  }
  
  public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    renderOstrich((Ostrich)par1EntityLiving, par2, par4, par6, par8, par9);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderOstrich((Ostrich)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected void preRenderScale(Ostrich par1Entity, float par2) {
    if (par1Entity != null && 
      par1Entity.isChild()) {
      GL11.glScalef(this.scale / 2.0F, this.scale / 2.0F, this.scale / 2.0F);
      return;
    } 
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((Ostrich)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    if (entity instanceof EntityCannonFodder) {
      EntityCannonFodder c = (EntityCannonFodder)entity;
      if (c.get_is_activated() != 0) {
        if (c.getHatColor() == 2)
          return texture2; 
        if (c.getHatColor() == 3)
          return texture3; 
      } 
    } 
    return texture;
  }
}
