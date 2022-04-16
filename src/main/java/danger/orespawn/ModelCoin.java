package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCoin extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  public ModelCoin(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-128.0F, -128.0F, 0.0F, 256, 256, 1);
    this.Shape1.setRotationPoint(0.0F, -109.0F, 0.0F);
    this.Shape1.setTextureSize(512, 512);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    newangle = MathHelper.cos(f2 * 0.05F * this.wingspeed) * 3.1415927F;
    this.Shape1.rotateAngleY = newangle;
    this.Shape1.render(f5);
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
