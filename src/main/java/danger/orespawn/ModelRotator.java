package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelRotator extends ModelBase {
  float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  public ModelRotator(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 12);
    this.Shape1.addBox(-2.0F, 3.9F, 0.0F, 4, 1, 1);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 7);
    this.Shape2.addBox(-4.0F, 7.6F, 0.0F, 8, 2, 2);
    this.Shape2.setRotationPoint(0.0F, 0.0F, -0.5F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(-7.0F, 13.7F, 0.0F, 14, 3, 3);
    this.Shape3.setRotationPoint(0.0F, 0.0F, -1.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Rotator r = (Rotator)entity;
    RenderInfo ri = null;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ri = r.getRenderInfo();
    GL11.glRotatef(ri.rf1, 1.0F, 0.0F, 0.0F);
    int i;
    for (i = 0; i < 8; i++) {
      this.Shape1.rotateAngleZ = newangle;
      this.Shape1.render(f5);
      newangle += 0.7853982F;
    } 
    GL11.glRotatef(-ri.rf1, 1.0F, 0.0F, 0.0F);
    newangle = 0.0F;
    GL11.glRotatef(ri.rf1, 0.0F, 1.0F, 0.0F);
    for (i = 0; i < 8; i++) {
      this.Shape2.rotateAngleZ = newangle;
      this.Shape2.render(f5);
      newangle += 0.7853982F;
    } 
    GL11.glRotatef(-ri.rf1, 0.0F, 1.0F, 0.0F);
    newangle = 0.0F;
    GL11.glRotatef(ri.rf1, 0.0F, 0.0F, 1.0F);
    for (i = 0; i < 8; i++) {
      this.Shape3.rotateAngleZ = newangle;
      this.Shape3.render(f5);
      newangle += 0.7853982F;
    } 
    GL11.glRotatef(-ri.rf1, 0.0F, 0.0F, 1.0F);
    ri.rf1 += 2.0F;
    if (ri.rf1 > 359.0D)
      ri.rf1 = 0.0F; 
    r.setRenderInfo(ri);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
}
