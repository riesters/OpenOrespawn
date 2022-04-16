package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelUrchin extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer if1;
  
  ModelRenderer if2;
  
  ModelRenderer if3;
  
  ModelRenderer if4;
  
  ModelRenderer of1;
  
  ModelRenderer of2;
  
  ModelRenderer of3;
  
  ModelRenderer of4;
  
  ModelRenderer center;
  
  ModelRenderer tis1;
  
  ModelRenderer tis2;
  
  ModelRenderer tis3;
  
  ModelRenderer tis4;
  
  ModelRenderer tos1;
  
  ModelRenderer tos2;
  
  ModelRenderer tos3;
  
  ModelRenderer tos4;
  
  public ModelUrchin(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.if1 = new ModelRenderer(this, 0, 35);
    this.if1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.if1.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.if1.setTextureSize(128, 128);
    this.if1.mirror = true;
    setRotation(this.if1, 0.2617994F, 0.0F, 0.0F);
    this.if2 = new ModelRenderer(this, 5, 35);
    this.if2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.if2.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.if2.setTextureSize(128, 128);
    this.if2.mirror = true;
    setRotation(this.if2, -0.2617994F, 0.0F, 0.0F);
    this.if3 = new ModelRenderer(this, 10, 35);
    this.if3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.if3.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.if3.setTextureSize(128, 128);
    this.if3.mirror = true;
    setRotation(this.if3, 0.0F, 0.0F, 0.2617994F);
    this.if4 = new ModelRenderer(this, 15, 35);
    this.if4.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.if4.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.if4.setTextureSize(128, 128);
    this.if4.mirror = true;
    setRotation(this.if4, 0.0F, 0.0F, -0.2617994F);
    this.of1 = new ModelRenderer(this, 0, 45);
    this.of1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.of1.setRotationPoint(2.0F, 16.0F, 0.0F);
    this.of1.setTextureSize(128, 128);
    this.of1.mirror = true;
    setRotation(this.of1, 0.0F, 0.0F, -0.5235988F);
    this.of2 = new ModelRenderer(this, 5, 45);
    this.of2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.of2.setRotationPoint(-2.0F, 16.0F, 0.0F);
    this.of2.setTextureSize(128, 128);
    this.of2.mirror = true;
    setRotation(this.of2, 0.0F, 0.0F, 0.5235988F);
    this.of3 = new ModelRenderer(this, 10, 45);
    this.of3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.of3.setRotationPoint(0.0F, 16.0F, -2.0F);
    this.of3.setTextureSize(128, 128);
    this.of3.mirror = true;
    setRotation(this.of3, -0.5235988F, 0.0F, 0.0F);
    this.of4 = new ModelRenderer(this, 15, 45);
    this.of4.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.of4.setRotationPoint(0.0F, 16.0F, 2.0F);
    this.of4.setTextureSize(128, 128);
    this.of4.mirror = true;
    setRotation(this.of4, 0.5235988F, 0.0F, 0.0F);
    this.center = new ModelRenderer(this, 0, 0);
    this.center.addBox(0.0F, -30.0F, 0.0F, 1, 30, 1);
    this.center.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.center.setTextureSize(128, 128);
    this.center.mirror = true;
    setRotation(this.center, 0.0F, 0.0F, 0.0F);
    this.tis1 = new ModelRenderer(this, 25, 0);
    this.tis1.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
    this.tis1.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.tis1.setTextureSize(128, 128);
    this.tis1.mirror = true;
    setRotation(this.tis1, 0.2617994F, 0.0F, 0.0F);
    this.tis2 = new ModelRenderer(this, 30, 0);
    this.tis2.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
    this.tis2.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.tis2.setTextureSize(128, 128);
    this.tis2.mirror = true;
    setRotation(this.tis2, -0.2617994F, 0.0F, 0.0F);
    this.tis3 = new ModelRenderer(this, 35, 0);
    this.tis3.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
    this.tis3.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.tis3.setTextureSize(128, 128);
    this.tis3.mirror = true;
    setRotation(this.tis3, 0.0F, 0.0F, 0.2617994F);
    this.tis4 = new ModelRenderer(this, 40, 0);
    this.tis4.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
    this.tis4.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.tis4.setTextureSize(128, 128);
    this.tis4.mirror = true;
    setRotation(this.tis4, 0.0F, 0.0F, -0.2617994F);
    this.tos1 = new ModelRenderer(this, 5, 0);
    this.tos1.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
    this.tos1.setRotationPoint(0.0F, 16.0F, 2.0F);
    this.tos1.setTextureSize(128, 128);
    this.tos1.mirror = true;
    setRotation(this.tos1, -0.5235988F, 0.0F, 0.0F);
    this.tos2 = new ModelRenderer(this, 10, 0);
    this.tos2.addBox(-2.0F, -20.0F, 0.0F, 1, 20, 1);
    this.tos2.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.tos2.setTextureSize(128, 128);
    this.tos2.mirror = true;
    setRotation(this.tos2, 0.0F, 0.0F, -0.5235988F);
    this.tos3 = new ModelRenderer(this, 15, 0);
    this.tos3.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
    this.tos3.setRotationPoint(2.0F, 16.0F, 0.0F);
    this.tos3.setTextureSize(128, 128);
    this.tos3.mirror = true;
    setRotation(this.tos3, 0.0F, 0.0F, 0.5235988F);
    this.tos4 = new ModelRenderer(this, 20, 0);
    this.tos4.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
    this.tos4.setRotationPoint(0.0F, 16.0F, -2.0F);
    this.tos4.setTextureSize(128, 128);
    this.tos4.mirror = true;
    setRotation(this.tos4, 0.5235988F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle, newangle1, newangle2, newangle3, newangle4, newangle5, newangle6, newangle7, newangle8;
    Urchin u = (Urchin)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.15F * f1;
      newangle1 = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.15F * f1;
      newangle2 = MathHelper.cos(f2 * 1.65F * this.wingspeed) * 3.1415927F * 0.15F * f1;
      newangle3 = MathHelper.cos(f2 * 1.75F * this.wingspeed) * 3.1415927F * 0.15F * f1;
      newangle4 = MathHelper.cos(f2 * 1.8F * this.wingspeed) * 3.1415927F * 0.15F * f1;
    } else {
      newangle = 0.0F;
      newangle1 = 0.0F;
      newangle2 = 0.0F;
      newangle3 = 0.0F;
      newangle4 = 0.0F;
    } 
    this.if1.rotateAngleX = 0.261F + newangle1;
    this.if2.rotateAngleX = -0.261F - newangle2;
    this.if3.rotateAngleX = newangle3;
    this.if4.rotateAngleX = -newangle4;
    this.of1.rotateAngleZ = -0.523F + newangle;
    this.of2.rotateAngleZ = 0.523F - newangle;
    this.of3.rotateAngleX = -0.523F + newangle;
    this.of4.rotateAngleX = 0.523F - newangle;
    if (u.getAttacking() != 0) {
      newangle = (float)((f2 * 0.2F) % 6.283185307179586D);
      newangle1 = MathHelper.cos(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle2 = MathHelper.cos(f2 * 0.65F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle3 = MathHelper.cos(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle4 = MathHelper.cos(f2 * 0.8F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle5 = MathHelper.cos(f2 * 0.55F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle6 = MathHelper.cos(f2 * 0.45F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle7 = MathHelper.cos(f2 * 0.35F * this.wingspeed) * 3.1415927F * 0.06F;
      newangle8 = MathHelper.cos(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.06F;
    } else {
      newangle = (float)((f2 * 0.02F) % 6.283185307179586D);
      newangle1 = MathHelper.cos(f2 * 0.07F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle2 = MathHelper.cos(f2 * 0.065F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle3 = MathHelper.cos(f2 * 0.075F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle4 = MathHelper.cos(f2 * 0.08F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle5 = MathHelper.cos(f2 * 0.055F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle6 = MathHelper.cos(f2 * 0.045F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle7 = MathHelper.cos(f2 * 0.035F * this.wingspeed) * 3.1415927F * 0.02F;
      newangle8 = MathHelper.cos(f2 * 0.04F * this.wingspeed) * 3.1415927F * 0.02F;
    } 
    this.center.rotateAngleY = newangle;
    this.tis1.rotateAngleX = 0.261F + newangle1;
    this.tis2.rotateAngleX = -0.261F + newangle2;
    this.tis3.rotateAngleX = newangle3;
    this.tis4.rotateAngleX = newangle4;
    this.tis1.rotateAngleZ = newangle5;
    this.tis2.rotateAngleZ = newangle6;
    this.tis3.rotateAngleZ = 0.261F + newangle7;
    this.tis4.rotateAngleZ = -0.261F + newangle8;
    this.tos1.rotateAngleX = -0.532F + newangle1;
    this.tos2.rotateAngleX = newangle7;
    this.tos3.rotateAngleX = newangle3;
    this.tos4.rotateAngleX = 0.532F + newangle5;
    this.tos1.rotateAngleZ = newangle4;
    this.tos2.rotateAngleZ = -0.523F + newangle6;
    this.tos3.rotateAngleZ = 0.523F + newangle2;
    this.tos4.rotateAngleZ = newangle8;
    this.if1.render(f5);
    this.if2.render(f5);
    this.if3.render(f5);
    this.if4.render(f5);
    this.of1.render(f5);
    this.of2.render(f5);
    this.of3.render(f5);
    this.of4.render(f5);
    this.center.render(f5);
    this.tis1.render(f5);
    this.tis2.render(f5);
    this.tis3.render(f5);
    this.tis4.render(f5);
    this.tos1.render(f5);
    this.tos2.render(f5);
    this.tos3.render(f5);
    this.tos4.render(f5);
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
