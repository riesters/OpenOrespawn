package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelIrukandji extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer t11;
  
  ModelRenderer t12;
  
  ModelRenderer t21;
  
  ModelRenderer t22;
  
  ModelRenderer t31;
  
  ModelRenderer t32;
  
  ModelRenderer t41;
  
  ModelRenderer t42;
  
  public ModelIrukandji(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 9);
    this.body.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4);
    this.body.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.t11 = new ModelRenderer(this, 25, 0);
    this.t11.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t11.setRotationPoint(1.0F, 10.0F, -2.0F);
    this.t11.setTextureSize(64, 32);
    this.t11.mirror = true;
    setRotation(this.t11, 0.0F, 0.0F, 0.0F);
    this.t12 = new ModelRenderer(this, 5, 0);
    this.t12.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t12.setRotationPoint(1.0F, 17.0F, -2.0F);
    this.t12.setTextureSize(64, 32);
    this.t12.mirror = true;
    setRotation(this.t12, 0.0F, 0.0F, 0.0F);
    this.t21 = new ModelRenderer(this, 0, 0);
    this.t21.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t21.setRotationPoint(-2.0F, 10.0F, -2.0F);
    this.t21.setTextureSize(64, 32);
    this.t21.mirror = true;
    setRotation(this.t21, 0.0F, 0.0F, 0.0F);
    this.t22 = new ModelRenderer(this, 20, 0);
    this.t22.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t22.setRotationPoint(-2.0F, 17.0F, -2.0F);
    this.t22.setTextureSize(64, 32);
    this.t22.mirror = true;
    setRotation(this.t22, 0.0F, 0.0F, 0.0F);
    this.t31 = new ModelRenderer(this, 30, 0);
    this.t31.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t31.setRotationPoint(1.0F, 10.0F, 1.0F);
    this.t31.setTextureSize(64, 32);
    this.t31.mirror = true;
    setRotation(this.t31, 0.0F, 0.0F, 0.0F);
    this.t32 = new ModelRenderer(this, 10, 0);
    this.t32.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t32.setRotationPoint(1.0F, 17.0F, 1.0F);
    this.t32.setTextureSize(64, 32);
    this.t32.mirror = true;
    setRotation(this.t32, 0.0F, 0.0F, 0.0F);
    this.t41 = new ModelRenderer(this, 35, 0);
    this.t41.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t41.setRotationPoint(-2.0F, 10.0F, 1.0F);
    this.t41.setTextureSize(64, 32);
    this.t41.mirror = true;
    setRotation(this.t41, 0.0F, 0.0F, 0.0F);
    this.t42 = new ModelRenderer(this, 15, 0);
    this.t42.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.t42.setRotationPoint(-2.0F, 17.0F, 1.0F);
    this.t42.setTextureSize(64, 32);
    this.t42.mirror = true;
    setRotation(this.t42, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Irukandji e = (Irukandji)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    newangle = MathHelper.cos(f2 * 0.55F) * 3.1415927F * 0.15F;
    this.t11.rotateAngleX = newangle;
    float d1 = (float)(Math.sin(newangle) * 7.0D);
    float d2 = (float)(Math.cos(newangle) * 7.0D);
    this.t11.rotationPointZ += d1;
    newangle = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.1F;
    this.t11.rotateAngleZ = newangle;
    float d3 = (float)(Math.cos(newangle) * d2);
    float d4 = (float)(Math.sin(newangle) * d2);
    this.t11.rotationPointX -= d4;
    this.t11.rotationPointY += d3;
    newangle = MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.15F;
    this.t12.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.1F;
    this.t12.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.65F) * 3.1415927F * 0.15F;
    this.t21.rotateAngleX = newangle;
    d1 = (float)(Math.sin(newangle) * 7.0D);
    d2 = (float)(Math.cos(newangle) * 7.0D);
    this.t21.rotationPointZ += d1;
    newangle = MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.1F;
    this.t21.rotateAngleZ = newangle;
    d3 = (float)(Math.cos(newangle) * d2);
    d4 = (float)(Math.sin(newangle) * d2);
    this.t21.rotationPointX -= d4;
    this.t21.rotationPointY += d3;
    newangle = MathHelper.cos(f2 * 0.55F) * 3.1415927F * 0.15F;
    this.t22.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.1F;
    this.t22.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.5F) * 3.1415927F * 0.15F;
    this.t31.rotateAngleX = newangle;
    d1 = (float)(Math.sin(newangle) * 7.0D);
    d2 = (float)(Math.cos(newangle) * 7.0D);
    this.t31.rotationPointZ += d1;
    newangle = MathHelper.cos(f2 * 0.3F) * 3.1415927F * 0.1F;
    this.t31.rotateAngleZ = newangle;
    d3 = (float)(Math.cos(newangle) * d2);
    d4 = (float)(Math.sin(newangle) * d2);
    this.t31.rotationPointX -= d4;
    this.t31.rotationPointY += d3;
    newangle = MathHelper.cos(f2 * 0.4F) * 3.1415927F * 0.15F;
    this.t32.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.2F) * 3.1415927F * 0.1F;
    this.t32.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.57F) * 3.1415927F * 0.15F;
    this.t41.rotateAngleX = newangle;
    d1 = (float)(Math.sin(newangle) * 7.0D);
    d2 = (float)(Math.cos(newangle) * 7.0D);
    this.t41.rotationPointZ += d1;
    newangle = MathHelper.cos(f2 * 0.37F) * 3.1415927F * 0.1F;
    this.t41.rotateAngleZ = newangle;
    d3 = (float)(Math.cos(newangle) * d2);
    d4 = (float)(Math.sin(newangle) * d2);
    this.t41.rotationPointX -= d4;
    this.t41.rotationPointY += d3;
    newangle = MathHelper.cos(f2 * 0.48F) * 3.1415927F * 0.15F;
    this.t42.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.29F) * 3.1415927F * 0.1F;
    this.t42.rotateAngleZ = newangle;
    this.body.render(f5);
    this.t11.render(f5);
    this.t12.render(f5);
    this.t21.render(f5);
    this.t22.render(f5);
    this.t31.render(f5);
    this.t32.render(f5);
    this.t41.render(f5);
    this.t42.render(f5);
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
