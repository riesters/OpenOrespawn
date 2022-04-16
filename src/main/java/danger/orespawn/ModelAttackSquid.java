package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAttackSquid extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer tent1;
  
  ModelRenderer tent2;
  
  ModelRenderer tent3;
  
  ModelRenderer tent4;
  
  ModelRenderer tent5;
  
  ModelRenderer tent6;
  
  ModelRenderer tent7;
  
  ModelRenderer body;
  
  ModelRenderer tent8;
  
  public ModelAttackSquid(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.tent1 = new ModelRenderer(this, 0, 18);
    this.tent1.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2);
    this.tent1.setRotationPoint(5.0F, 15.0F, -1.0F);
    this.tent1.setTextureSize(64, 32);
    this.tent1.mirror = true;
    setRotation(this.tent1, -0.9250245F, -1.745329F, 0.0F);
    this.tent2 = new ModelRenderer(this, 0, 18);
    this.tent2.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2);
    this.tent2.setRotationPoint(-2.0F, 15.0F, -3.0F);
    this.tent2.setTextureSize(64, 32);
    this.tent2.mirror = true;
    setRotation(this.tent2, -0.1745329F, -0.6632251F, -0.2443461F);
    this.tent3 = new ModelRenderer(this, 0, 18);
    this.tent3.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
    this.tent3.setRotationPoint(1.0F, 15.0F, -4.0F);
    this.tent3.setTextureSize(64, 32);
    this.tent3.mirror = true;
    setRotation(this.tent3, -1.134464F, 0.3316126F, 0.0F);
    this.tent4 = new ModelRenderer(this, 0, 18);
    this.tent4.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
    this.tent4.setRotationPoint(-3.0F, 15.0F, -1.0F);
    this.tent4.setTextureSize(64, 32);
    this.tent4.mirror = true;
    setRotation(this.tent4, 0.5585054F, -1.692969F, 0.0F);
    this.tent5 = new ModelRenderer(this, 0, 18);
    this.tent5.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
    this.tent5.setRotationPoint(1.0F, 15.0F, 3.0F);
    this.tent5.setTextureSize(64, 32);
    this.tent5.mirror = true;
    setRotation(this.tent5, 0.5410521F, 0.2268928F, 0.0F);
    this.tent6 = new ModelRenderer(this, 0, 18);
    this.tent6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
    this.tent6.setRotationPoint(-2.0F, 15.0F, 2.0F);
    this.tent6.setTextureSize(64, 32);
    this.tent6.mirror = true;
    setRotation(this.tent6, -0.418879F, -0.6806784F, 0.0F);
    this.tent7 = new ModelRenderer(this, 0, 18);
    this.tent7.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2);
    this.tent7.setRotationPoint(3.0F, 15.0F, 1.0F);
    this.tent7.setTextureSize(64, 32);
    this.tent7.mirror = true;
    setRotation(this.tent7, -0.1919862F, -0.6632251F, 0.418879F);
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8);
    this.body.setRotationPoint(1.0F, 16.0F, -1.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, -0.1919862F, -0.6806784F, 0.0F);
    this.tent8 = new ModelRenderer(this, 0, 18);
    this.tent8.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8);
    this.tent8.setRotationPoint(3.0F, 15.0F, -4.0F);
    this.tent8.setTextureSize(64, 32);
    this.tent8.mirror = true;
    setRotation(this.tent8, 0.1919862F, -0.6806784F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    AttackSquid e = (AttackSquid)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangleA = 0.0F;
    float newangleB = 0.0F;
    float newangle8 = 0.0F;
    float newangle1 = 0.0F;
    float newangle2 = 0.0F;
    float newangle3 = 0.0F;
    float newangle4 = 0.0F;
    float newangle5 = 0.0F;
    float newangle6 = 0.0F;
    float newangle7 = 0.0F;
    float pi4 = 0.7853982F;
    if (f1 > 0.1D) {
      newangleA = MathHelper.cos(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.04F * f1;
      newangleB = MathHelper.cos(f2 * 0.39F * this.wingspeed) * 3.1415927F * 0.04F * f1;
      newangle1 = MathHelper.cos(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle2 = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle3 = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle4 = MathHelper.cos(f2 * 1.9F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle5 = MathHelper.cos(f2 * 1.8F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle6 = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle7 = MathHelper.cos(f2 * 1.6F * this.wingspeed) * 3.1415927F * 0.4F * f1;
      newangle8 = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.4F * f1;
    } else {
      newangleA = MathHelper.cos(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.01F;
      newangleB = MathHelper.cos(f2 * 0.39F * this.wingspeed) * 3.1415927F * 0.01F;
      newangle1 = MathHelper.cos(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle2 = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle3 = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle4 = MathHelper.cos(f2 * 1.9F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle5 = MathHelper.cos(f2 * 1.8F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle6 = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle7 = MathHelper.cos(f2 * 1.6F * this.wingspeed) * 3.1415927F * 0.1F;
      newangle8 = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.1F;
    } 
    this.tent1.rotateAngleX = newangle1 - 1.03F;
    this.tent7.rotateAngleZ = newangle2 + 0.37F;
    this.tent5.rotateAngleX = newangle3 + 0.6F;
    this.tent6.rotateAngleX = newangle4 - 0.48F;
    this.tent4.rotateAngleX = newangle5 + 0.63F;
    this.tent2.rotateAngleZ = newangle6 - 0.26F;
    this.tent3.rotateAngleX = newangle7 - 1.03F;
    this.tent8.rotateAngleX = newangle8 + 0.43F;
    this.body.rotateAngleX = newangleA;
    this.body.rotateAngleZ = newangleB;
    newangleA = (float)Math.toRadians(f3) * 0.75F;
    this.body.rotateAngleY = newangleA;
    this.tent1.render(f5);
    this.tent2.render(f5);
    this.tent3.render(f5);
    this.tent4.render(f5);
    this.tent5.render(f5);
    this.tent6.render(f5);
    this.tent7.render(f5);
    this.body.render(f5);
    this.tent8.render(f5);
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
