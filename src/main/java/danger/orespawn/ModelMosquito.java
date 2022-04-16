package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMosquito extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer leftwing1;
  
  ModelRenderer rightwing1;
  
  ModelRenderer leftwing2;
  
  ModelRenderer rightwing2;
  
  public ModelMosquito() {
    this.textureWidth = 32;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 8, 18);
    this.body.addBox(0.0F, 0.0F, -2.0F, 1, 1, 8);
    this.body.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.leftwing1 = new ModelRenderer(this, 16, 13);
    this.leftwing1.addBox(1.0F, 0.0F, -1.0F, 3, 1, 3);
    this.leftwing1.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing1.setTextureSize(64, 32);
    this.leftwing1.mirror = true;
    setRotation(this.leftwing1, 0.0F, 0.0F, 0.0F);
    this.rightwing1 = new ModelRenderer(this, 2, 13);
    this.rightwing1.addBox(-4.0F, 0.0F, -1.0F, 3, 1, 3);
    this.rightwing1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing1.setTextureSize(64, 32);
    this.rightwing1.mirror = true;
    setRotation(this.rightwing1, 0.0F, 0.0F, 0.0F);
    this.leftwing2 = new ModelRenderer(this, 15, 8);
    this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1);
    this.leftwing2.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing2.setTextureSize(64, 32);
    this.leftwing2.mirror = true;
    setRotation(this.leftwing2, 0.0F, 0.0F, 0.0F);
    this.rightwing2 = new ModelRenderer(this, 2, 8);
    this.rightwing2.addBox(-5.0F, 0.0F, 0.0F, 5, 1, 1);
    this.rightwing2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing2.setTextureSize(64, 32);
    this.rightwing2.mirror = true;
    setRotation(this.rightwing2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.body.render(f5);
    this.rightwing1.rotateAngleZ = MathHelper.cos(f2 * 3.0F) * 3.1415927F * 0.25F;
    this.rightwing2.rotateAngleZ = this.rightwing1.rotateAngleZ;
    this.leftwing1.rotateAngleZ = -this.rightwing1.rotateAngleZ;
    this.leftwing2.rotateAngleZ = -this.rightwing1.rotateAngleZ;
    this.leftwing1.render(f5);
    this.rightwing1.render(f5);
    this.leftwing2.render(f5);
    this.rightwing2.render(f5);
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
