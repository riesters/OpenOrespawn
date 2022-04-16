package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSeaViper extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer TailTip;
  
  ModelRenderer Neck;
  
  ModelRenderer tBase;
  
  ModelRenderer t2;
  
  ModelRenderer t3;
  
  ModelRenderer t4;
  
  ModelRenderer t5;
  
  ModelRenderer t6;
  
  ModelRenderer t7;
  
  ModelRenderer t8;
  
  ModelRenderer t9;
  
  ModelRenderer t10;
  
  ModelRenderer t12;
  
  ModelRenderer t11;
  
  ModelRenderer t13;
  
  ModelRenderer t14;
  
  ModelRenderer t15;
  
  ModelRenderer t16;
  
  ModelRenderer t17;
  
  ModelRenderer t18;
  
  ModelRenderer t19;
  
  ModelRenderer t20;
  
  ModelRenderer t21;
  
  ModelRenderer MouthBottom;
  
  ModelRenderer ToungBase;
  
  ModelRenderer MiddleTounge;
  
  ModelRenderer EyeRight;
  
  ModelRenderer EyeLeft;
  
  ModelRenderer MouthTop;
  
  ModelRenderer Head;
  
  ModelRenderer FangRight;
  
  ModelRenderer FangLeft;
  
  ModelRenderer ForkRight;
  
  ModelRenderer ForkLeft;
  
  public ModelSeaViper(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.TailTip = new ModelRenderer(this, 0, 90);
    this.TailTip.addBox(-1.0F, -1.0F, 0.0F, 2, 5, 10);
    this.TailTip.setRotationPoint(1.0F, 20.0F, 120.0F);
    this.TailTip.setTextureSize(128, 128);
    this.TailTip.mirror = true;
    setRotation(this.TailTip, 0.0F, -0.6981317F, 0.0F);
    this.Neck = new ModelRenderer(this, 60, 60);
    this.Neck.addBox(-4.0F, -4.0F, -10.0F, 8, 8, 10);
    this.Neck.setRotationPoint(0.0F, 4.5F, -33.0F);
    this.Neck.setTextureSize(128, 128);
    this.Neck.mirror = true;
    setRotation(this.Neck, -0.2617994F, 0.0F, 0.0F);
    this.tBase = new ModelRenderer(this, 0, 31);
    this.tBase.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.tBase.setRotationPoint(0.0F, 4.0F, -34.0F);
    this.tBase.setTextureSize(128, 128);
    this.tBase.mirror = true;
    setRotation(this.tBase, -0.5235988F, 0.0F, 0.0F);
    this.t2 = new ModelRenderer(this, 0, 31);
    this.t2.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t2.setRotationPoint(0.0F, 7.0F, -27.0F);
    this.t2.setTextureSize(128, 128);
    this.t2.mirror = true;
    setRotation(this.t2, -1.047198F, 0.0F, 0.0F);
    this.t3 = new ModelRenderer(this, 0, 31);
    this.t3.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t3.setRotationPoint(0.0F, 14.0F, -24.0F);
    this.t3.setTextureSize(128, 128);
    this.t3.mirror = true;
    setRotation(this.t3, -0.5235988F, 0.0F, 0.0F);
    this.t4 = new ModelRenderer(this, 0, 31);
    this.t4.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t4.setRotationPoint(0.0F, 19.0F, -17.0F);
    this.t4.setTextureSize(128, 128);
    this.t4.mirror = true;
    setRotation(this.t4, -0.0872665F, 0.0F, 0.0F);
    this.t5 = new ModelRenderer(this, 0, 31);
    this.t5.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t5.setRotationPoint(0.0F, 20.0F, -9.0F);
    this.t5.setTextureSize(128, 128);
    this.t5.mirror = true;
    setRotation(this.t5, 0.0F, 0.0F, 0.0F);
    this.t6 = new ModelRenderer(this, 0, 31);
    this.t6.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t6.setRotationPoint(0.0F, 20.0F, -1.0F);
    this.t6.setTextureSize(128, 128);
    this.t6.mirror = true;
    setRotation(this.t6, 0.0F, 0.3490659F, 0.0F);
    this.t7 = new ModelRenderer(this, 0, 31);
    this.t7.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t7.setRotationPoint(2.0F, 20.0F, 6.0F);
    this.t7.setTextureSize(128, 128);
    this.t7.mirror = true;
    setRotation(this.t7, 0.0F, 0.6981317F, 0.0F);
    this.t8 = new ModelRenderer(this, 0, 31);
    this.t8.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t8.setRotationPoint(7.0F, 20.0F, 12.0F);
    this.t8.setTextureSize(128, 128);
    this.t8.mirror = true;
    setRotation(this.t8, 0.0F, 0.3490659F, 0.0F);
    this.t9 = new ModelRenderer(this, 0, 31);
    this.t9.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t9.setRotationPoint(10.0F, 20.0F, 20.0F);
    this.t9.setTextureSize(128, 128);
    this.t9.mirror = true;
    setRotation(this.t9, 0.0F, 0.0F, 0.0F);
    this.t10 = new ModelRenderer(this, 0, 31);
    this.t10.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t10.setRotationPoint(10.0F, 20.0F, 28.0F);
    this.t10.setTextureSize(128, 128);
    this.t10.mirror = true;
    setRotation(this.t10, 0.0F, -0.3490659F, 0.0F);
    this.t12 = new ModelRenderer(this, 0, 31);
    this.t12.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t12.setRotationPoint(2.0F, 20.0F, 42.0F);
    this.t12.setTextureSize(128, 128);
    this.t12.mirror = true;
    setRotation(this.t12, 0.0F, -0.6981317F, 0.0F);
    this.t11 = new ModelRenderer(this, 0, 31);
    this.t11.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t11.setRotationPoint(8.0F, 20.0F, 35.0F);
    this.t11.setTextureSize(128, 128);
    this.t11.mirror = true;
    setRotation(this.t11, 0.0F, -0.6981317F, 0.0F);
    this.t13 = new ModelRenderer(this, 0, 31);
    this.t13.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 10);
    this.t13.setRotationPoint(-4.0F, 20.0F, 48.0F);
    this.t13.setTextureSize(128, 128);
    this.t13.mirror = true;
    setRotation(this.t13, 0.0F, -0.3490659F, 0.0F);
    this.t14 = new ModelRenderer(this, 0, 51);
    this.t14.addBox(-3.0F, -3.0F, 0.0F, 6, 7, 10);
    this.t14.setRotationPoint(-8.0F, 20.0F, 56.0F);
    this.t14.setTextureSize(128, 128);
    this.t14.mirror = true;
    setRotation(this.t14, 0.0F, 0.0F, 0.0F);
    this.t15 = new ModelRenderer(this, 0, 51);
    this.t15.addBox(-3.0F, -3.0F, 0.0F, 6, 7, 10);
    this.t15.setRotationPoint(-8.0F, 20.0F, 65.0F);
    this.t15.setTextureSize(128, 128);
    this.t15.mirror = true;
    setRotation(this.t15, 0.0F, 0.3490659F, 0.0F);
    this.t16 = new ModelRenderer(this, 0, 51);
    this.t16.addBox(-3.0F, -3.0F, 0.0F, 6, 7, 10);
    this.t16.setRotationPoint(-5.0F, 20.0F, 73.0F);
    this.t16.setTextureSize(128, 128);
    this.t16.mirror = true;
    setRotation(this.t16, 0.0F, 0.6981317F, 0.0F);
    this.t17 = new ModelRenderer(this, 0, 70);
    this.t17.addBox(-2.0F, -2.0F, 0.0F, 4, 6, 10);
    this.t17.setRotationPoint(1.0F, 20.0F, 80.0F);
    this.t17.setTextureSize(128, 128);
    this.t17.mirror = true;
    setRotation(this.t17, 0.0F, 0.6981317F, 0.0F);
    this.t18 = new ModelRenderer(this, 0, 70);
    this.t18.addBox(-2.0F, -2.0F, 0.0F, 4, 6, 10);
    this.t18.setRotationPoint(7.0F, 20.0F, 87.0F);
    this.t18.setTextureSize(128, 128);
    this.t18.mirror = true;
    setRotation(this.t18, 0.0F, 0.3490659F, 0.0F);
    this.t19 = new ModelRenderer(this, 0, 70);
    this.t19.addBox(-2.0F, -2.0F, 0.0F, 4, 6, 10);
    this.t19.setRotationPoint(10.0F, 20.0F, 95.0F);
    this.t19.setTextureSize(128, 128);
    this.t19.mirror = true;
    setRotation(this.t19, 0.0F, 0.0F, 0.0F);
    this.t20 = new ModelRenderer(this, 0, 90);
    this.t20.addBox(-1.0F, -1.0F, 0.0F, 2, 5, 10);
    this.t20.setRotationPoint(10.0F, 20.0F, 104.0F);
    this.t20.setTextureSize(128, 128);
    this.t20.mirror = true;
    setRotation(this.t20, 0.0F, -0.3490659F, 0.0F);
    this.t21 = new ModelRenderer(this, 0, 90);
    this.t21.addBox(-1.0F, -1.0F, 0.0F, 2, 5, 10);
    this.t21.setRotationPoint(7.0F, 20.0F, 113.0F);
    this.t21.setTextureSize(128, 128);
    this.t21.mirror = true;
    setRotation(this.t21, 0.0F, -0.6981317F, 0.0F);
    this.MouthBottom = new ModelRenderer(this, 58, 78);
    this.MouthBottom.addBox(-4.0F, 0.0F, -12.0F, 8, 2, 12);
    this.MouthBottom.setRotationPoint(0.0F, 4.0F, -42.0F);
    this.MouthBottom.setTextureSize(128, 128);
    this.MouthBottom.mirror = true;
    setRotation(this.MouthBottom, 0.5235988F, 0.0F, 0.0F);
    this.ToungBase = new ModelRenderer(this, 70, 17);
    this.ToungBase.addBox(-1.0F, -2.0F, -11.0F, 2, 1, 6);
    this.ToungBase.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.ToungBase.setTextureSize(128, 128);
    this.ToungBase.mirror = true;
    setRotation(this.ToungBase, 0.2617994F, 0.0F, 0.0F);
    this.MiddleTounge = new ModelRenderer(this, 70, 10);
    this.MiddleTounge.addBox(-1.0F, -1.0F, -17.0F, 2, 1, 6);
    this.MiddleTounge.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.MiddleTounge.setTextureSize(128, 128);
    this.MiddleTounge.mirror = true;
    setRotation(this.MiddleTounge, 0.1745329F, 0.0F, 0.0F);
    this.EyeRight = new ModelRenderer(this, 96, 60);
    this.EyeRight.addBox(-7.0F, -7.0F, -3.0F, 1, 3, 4);
    this.EyeRight.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.EyeRight.setTextureSize(128, 128);
    this.EyeRight.mirror = true;
    setRotation(this.EyeRight, 0.3490659F, 0.0F, 0.0F);
    this.EyeLeft = new ModelRenderer(this, 50, 60);
    this.EyeLeft.addBox(6.0F, -7.0F, -3.0F, 1, 3, 4);
    this.EyeLeft.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.EyeLeft.setTextureSize(128, 128);
    this.EyeLeft.mirror = true;
    setRotation(this.EyeLeft, 0.3490659F, 0.0F, 0.0F);
    this.MouthTop = new ModelRenderer(this, 52, 24);
    this.MouthTop.addBox(-5.0F, -6.0F, -16.0F, 10, 6, 16);
    this.MouthTop.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.MouthTop.setTextureSize(128, 128);
    this.MouthTop.mirror = true;
    setRotation(this.MouthTop, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 60, 46);
    this.Head.addBox(-6.0F, -8.0F, -6.0F, 12, 8, 6);
    this.Head.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.Head.setTextureSize(128, 128);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.FangRight = new ModelRenderer(this, 92, 18);
    this.FangRight.addBox(-4.0F, -3.0F, -15.0F, 1, 5, 1);
    this.FangRight.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.FangRight.setTextureSize(128, 128);
    this.FangRight.mirror = true;
    setRotation(this.FangRight, 0.1745329F, 0.0F, 0.0F);
    this.FangLeft = new ModelRenderer(this, 60, 18);
    this.FangLeft.addBox(3.0F, -3.0F, -15.0F, 1, 5, 1);
    this.FangLeft.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.FangLeft.setTextureSize(128, 128);
    this.FangLeft.mirror = true;
    setRotation(this.FangLeft, 0.1745329F, 0.0F, 0.0F);
    this.ForkRight = new ModelRenderer(this, 60, 3);
    this.ForkRight.addBox(6.0F, 0.6F, -21.0F, 2, 1, 6);
    this.ForkRight.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.ForkRight.setTextureSize(128, 128);
    this.ForkRight.mirror = true;
    setRotation(this.ForkRight, 0.0872665F, 0.4363323F, 0.0F);
    this.ForkLeft = new ModelRenderer(this, 80, 3);
    this.ForkLeft.addBox(-8.0F, 0.6F, -21.0F, 2, 1, 6);
    this.ForkLeft.setRotationPoint(0.0F, 6.0F, -40.0F);
    this.ForkLeft.setTextureSize(128, 128);
    this.ForkLeft.mirror = true;
    setRotation(this.ForkLeft, 0.0872665F, -0.4363323F, 0.0F);
    this.TailTip.rotationPointZ += 32.0F;
    this.Neck.rotationPointZ += 32.0F;
    this.tBase.rotationPointZ += 32.0F;
    this.t2.rotationPointZ += 32.0F;
    this.t3.rotationPointZ += 32.0F;
    this.t4.rotationPointZ += 32.0F;
    this.t5.rotationPointZ += 32.0F;
    this.t6.rotationPointZ += 32.0F;
    this.t7.rotationPointZ += 32.0F;
    this.t8.rotationPointZ += 32.0F;
    this.t9.rotationPointZ += 32.0F;
    this.t10.rotationPointZ += 32.0F;
    this.t12.rotationPointZ += 32.0F;
    this.t11.rotationPointZ += 32.0F;
    this.t13.rotationPointZ += 32.0F;
    this.t14.rotationPointZ += 32.0F;
    this.t15.rotationPointZ += 32.0F;
    this.t16.rotationPointZ += 32.0F;
    this.t17.rotationPointZ += 32.0F;
    this.t18.rotationPointZ += 32.0F;
    this.t19.rotationPointZ += 32.0F;
    this.t20.rotationPointZ += 32.0F;
    this.t21.rotationPointZ += 32.0F;
    this.MouthBottom.rotationPointZ += 32.0F;
    this.ToungBase.rotationPointZ += 32.0F;
    this.MiddleTounge.rotationPointZ += 32.0F;
    this.EyeRight.rotationPointZ += 32.0F;
    this.EyeLeft.rotationPointZ += 32.0F;
    this.MouthTop.rotationPointZ += 32.0F;
    this.Head.rotationPointZ += 32.0F;
    this.FangRight.rotationPointZ += 32.0F;
    this.FangLeft.rotationPointZ += 32.0F;
    this.ForkRight.rotationPointZ += 32.0F;
    this.ForkLeft.rotationPointZ += 32.0F;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    SeaViper e = (SeaViper)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 < 0.0F)
      f1 = 0.0F; 
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F * f1;
    this.tBase.rotateAngleY = newangle;
    doseg(this.tBase, this.t2, 2.0F, f1, f2);
    doseg(this.t2, this.t3, 2.0F, f1, f2);
    doseg(this.t3, this.t4, 3.0F, f1, f2);
    doseg(this.t4, this.t5, 4.0F, f1, f2);
    doseg(this.t5, this.t6, 5.0F, f1, f2);
    doseg(this.t6, this.t7, 6.0F, f1, f2);
    doseg(this.t7, this.t8, 7.0F, f1, f2);
    doseg(this.t8, this.t9, 8.0F, f1, f2);
    doseg(this.t9, this.t10, 9.0F, f1, f2);
    doseg(this.t10, this.t11, 10.0F, f1, f2);
    doseg(this.t11, this.t12, 11.0F, f1, f2);
    doseg(this.t12, this.t13, 12.0F, f1, f2);
    doseg(this.t13, this.t14, 13.0F, f1, f2);
    doseg(this.t14, this.t15, 14.0F, f1, f2);
    doseg(this.t15, this.t16, 15.0F, f1, f2);
    doseg(this.t16, this.t17, 16.0F, f1, f2);
    doseg(this.t17, this.t18, 17.0F, f1, f2);
    doseg(this.t18, this.t19, 18.0F, f1, f2);
    doseg(this.t19, this.t20, 19.0F, f1, f2);
    doseg(this.t20, this.t21, 20.0F, f1, f2);
    doseg(this.t21, this.TailTip, 21.0F, f1, f2);
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.17F;
      this.MouthBottom.rotateAngleX = 0.65F + newangle;
      newangle = MathHelper.cos(f2 * 4.7F * this.wingspeed) * 3.1415927F * 0.07F;
      this.ToungBase.rotateAngleX = 0.261F + newangle;
      this.MiddleTounge.rotateAngleX = 0.174F + newangle;
      this.ForkLeft.rotateAngleX = 0.087F + newangle;
      this.ForkRight.rotateAngleX = 0.087F + newangle;
      newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.05F;
      this.ForkRight.offsetZ = newangle;
    } else {
      newangle = MathHelper.cos(f2 * 0.2F * this.wingspeed) * 3.1415927F * 0.02F;
      this.MouthBottom.rotateAngleX = 0.45F + newangle;
      newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.03F;
      this.ToungBase.rotateAngleX = 0.261F + newangle;
      this.MiddleTounge.rotateAngleX = 0.174F + newangle;
      this.ForkLeft.rotateAngleX = 0.087F + newangle;
      this.ForkRight.rotateAngleX = 0.087F + newangle;
      newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
      this.ForkRight.offsetZ = newangle;
    } 
    newangle = (float)Math.toRadians(f3) * 0.5F;
    this.EyeRight.rotateAngleY = newangle;
    this.FangRight.rotateAngleY = newangle;
    this.MouthBottom.rotateAngleY = newangle;
    this.Head.rotationPointZ -= (float)Math.cos(this.Head.rotateAngleY) * 2.0F;
    this.Head.rotationPointX -= (float)Math.sin(this.Head.rotateAngleY) * 2.0F;
    this.ToungBase.rotateAngleY = newangle;
    this.MiddleTounge.rotateAngleY = newangle;
    this.ForkLeft.rotateAngleY = newangle - 0.436F;
    this.ForkRight.rotateAngleY = newangle + 0.436F;
    this.TailTip.render(f5);
    this.Neck.render(f5);
    this.tBase.render(f5);
    this.t2.render(f5);
    this.t3.render(f5);
    this.t4.render(f5);
    this.t5.render(f5);
    this.t6.render(f5);
    this.t7.render(f5);
    this.t8.render(f5);
    this.t9.render(f5);
    this.t10.render(f5);
    this.t12.render(f5);
    this.t11.render(f5);
    this.t13.render(f5);
    this.t14.render(f5);
    this.t15.render(f5);
    this.t16.render(f5);
    this.t17.render(f5);
    this.t18.render(f5);
    this.t19.render(f5);
    this.t20.render(f5);
    this.t21.render(f5);
    this.MouthBottom.render(f5);
    this.ToungBase.render(f5);
    this.MiddleTounge.render(f5);
    this.EyeRight.render(f5);
    this.EyeLeft.render(f5);
    this.MouthTop.render(f5);
    this.Head.render(f5);
    this.FangRight.render(f5);
    this.FangLeft.render(f5);
    this.ForkRight.render(f5);
    this.ForkLeft.render(f5);
  }
  
  private void doseg(ModelRenderer inn, ModelRenderer notinn, float f, float f1, float f2) {
    float pi4 = 0.7853982F;
    float newangle = 0.0F;
    notinn.rotationPointZ = (float)(inn.rotationPointZ + (float)Math.cos(inn.rotateAngleY) * 9.0D * Math.abs(Math.cos(inn.rotateAngleX)));
    notinn.rotationPointX = (float)(inn.rotationPointX + ((float)Math.sin(inn.rotateAngleY) * 9.0F) * Math.abs(Math.cos(inn.rotateAngleX)));
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed - pi4 * f) * 3.1415927F * 0.2F * f1;
    float a = MathHelper.cos(-(pi4 * f));
    notinn.rotateAngleY = newangle + a - a * f1;
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
