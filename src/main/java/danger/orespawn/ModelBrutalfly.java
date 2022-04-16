package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBrutalfly extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer leftwing;
  
  ModelRenderer rightwing;
  
  ModelRenderer leftwing2;
  
  ModelRenderer rightwing2;
  
  ModelRenderer leftwing3;
  
  ModelRenderer rightwing3;
  
  ModelRenderer head;
  
  ModelRenderer leftwing4;
  
  ModelRenderer rightwing4;
  
  ModelRenderer leftwing5;
  
  ModelRenderer leftwing6;
  
  ModelRenderer rightwing5;
  
  ModelRenderer rightwing6;
  
  private float wingspeed = 1.0F;
  
  public ModelBrutalfly(float f1) {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.wingspeed = f1;
    this.body = new ModelRenderer(this, 21, 19);
    this.body.addBox(0.0F, 0.0F, -4.0F, 1, 1, 8);
    this.body.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.leftwing = new ModelRenderer(this, 43, 24);
    this.leftwing.addBox(0.0F, 0.0F, -4.0F, 1, 1, 5);
    this.leftwing.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing.setTextureSize(64, 32);
    this.leftwing.mirror = true;
    setRotation(this.leftwing, 0.0F, 0.0F, 0.0F);
    this.rightwing = new ModelRenderer(this, 43, 17);
    this.rightwing.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 5);
    this.rightwing.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing.setTextureSize(64, 32);
    this.rightwing.mirror = true;
    setRotation(this.rightwing, 0.0F, 0.0F, 0.0F);
    this.leftwing2 = new ModelRenderer(this, 0, 0);
    this.leftwing2.addBox(1.0F, 0.0F, -6.0F, 6, 1, 7);
    this.leftwing2.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing2.setTextureSize(64, 32);
    this.leftwing2.mirror = true;
    setRotation(this.leftwing2, 0.0F, 0.0F, 0.0F);
    this.rightwing2 = new ModelRenderer(this, 29, 0);
    this.rightwing2.addBox(-7.0F, 0.0F, -6.0F, 6, 1, 7);
    this.rightwing2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing2.setTextureSize(64, 32);
    this.rightwing2.mirror = true;
    setRotation(this.rightwing2, 0.0F, 0.0F, 0.0F);
    this.leftwing3 = new ModelRenderer(this, 0, 9);
    this.leftwing3.addBox(0.0F, 0.0F, 1.0F, 5, 1, 5);
    this.leftwing3.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing3.setTextureSize(64, 32);
    this.leftwing3.mirror = true;
    setRotation(this.leftwing3, 0.0F, 0.0F, 0.0F);
    this.rightwing3 = new ModelRenderer(this, 27, 9);
    this.rightwing3.addBox(-5.0F, 0.0F, 1.0F, 5, 1, 5);
    this.rightwing3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing3.setTextureSize(64, 32);
    this.rightwing3.mirror = true;
    setRotation(this.rightwing3, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 21, 11);
    this.head.addBox(0.0F, 0.0F, -6.0F, 1, 1, 1);
    this.head.setRotationPoint(0.0F, 17.0F, 1.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.leftwing4 = new ModelRenderer(this, 2, 24);
    this.leftwing4.addBox(0.0F, 0.0F, 6.0F, 2, 1, 7);
    this.leftwing4.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing4.setTextureSize(64, 32);
    this.leftwing4.mirror = true;
    setRotation(this.leftwing4, 0.0F, 0.0F, 0.0F);
    this.rightwing4 = new ModelRenderer(this, 2, 16);
    this.rightwing4.addBox(-2.0F, 0.0F, 6.0F, 2, 1, 7);
    this.rightwing4.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing4.setTextureSize(64, 32);
    this.rightwing4.mirror = true;
    setRotation(this.rightwing4, 0.0F, 0.0F, 0.0F);
    this.leftwing5 = new ModelRenderer(this, 21, 16);
    this.leftwing5.addBox(1.0F, 0.0F, -7.0F, 1, 1, 1);
    this.leftwing5.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing5.setTextureSize(64, 32);
    this.leftwing5.mirror = true;
    setRotation(this.leftwing5, 0.0F, 0.0F, 0.0F);
    this.leftwing6 = new ModelRenderer(this, 50, 10);
    this.leftwing6.addBox(7.0F, 0.0F, -6.0F, 2, 1, 1);
    this.leftwing6.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.leftwing6.setTextureSize(64, 32);
    this.leftwing6.mirror = true;
    setRotation(this.leftwing6, 0.0F, 0.0F, 0.0F);
    this.rightwing5 = new ModelRenderer(this, 27, 16);
    this.rightwing5.addBox(-2.0F, 0.0F, -7.0F, 1, 1, 1);
    this.rightwing5.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing5.setTextureSize(64, 32);
    this.rightwing5.mirror = true;
    setRotation(this.rightwing5, 0.0F, 0.0F, 0.0F);
    this.rightwing6 = new ModelRenderer(this, 50, 13);
    this.rightwing6.addBox(-9.0F, 0.0F, -6.0F, 2, 1, 1);
    this.rightwing6.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rightwing6.setTextureSize(64, 32);
    this.rightwing6.mirror = true;
    setRotation(this.rightwing6, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.render(f5);
    this.body.render(f5);
    this.rightwing.rotateAngleZ = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
    this.rightwing2.rotateAngleZ = this.rightwing.rotateAngleZ;
    this.rightwing3.rotateAngleZ = this.rightwing.rotateAngleZ;
    this.rightwing4.rotateAngleZ = this.rightwing.rotateAngleZ;
    this.rightwing5.rotateAngleZ = this.rightwing.rotateAngleZ;
    this.rightwing6.rotateAngleZ = this.rightwing.rotateAngleZ;
    this.leftwing.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing2.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing3.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing4.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing5.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing6.rotateAngleZ = -this.rightwing.rotateAngleZ;
    this.leftwing.render(f5);
    this.rightwing.render(f5);
    this.leftwing2.render(f5);
    this.rightwing2.render(f5);
    this.leftwing3.render(f5);
    this.rightwing3.render(f5);
    this.leftwing4.render(f5);
    this.rightwing4.render(f5);
    this.leftwing5.render(f5);
    this.rightwing5.render(f5);
    this.leftwing6.render(f5);
    this.rightwing6.render(f5);
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
