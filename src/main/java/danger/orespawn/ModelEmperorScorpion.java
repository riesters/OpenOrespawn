package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEmperorScorpion extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Head;
  
  ModelRenderer Seg1;
  
  ModelRenderer Seg2;
  
  ModelRenderer Seg3;
  
  ModelRenderer Seg4;
  
  ModelRenderer Seg5;
  
  ModelRenderer Seg6;
  
  ModelRenderer Seg7;
  
  ModelRenderer Seg8;
  
  ModelRenderer Tailseg1;
  
  ModelRenderer Tailseg2;
  
  ModelRenderer Tailseg3;
  
  ModelRenderer Tailseg4;
  
  ModelRenderer Tailseg5;
  
  ModelRenderer Tailseg6;
  
  ModelRenderer Tailseg7;
  
  ModelRenderer Tailseg8;
  
  ModelRenderer Stinger1;
  
  ModelRenderer Stinger2;
  
  ModelRenderer Stinger3;
  
  ModelRenderer LeftShoulder;
  
  ModelRenderer LeftArmSeg1;
  
  ModelRenderer LeftArmSeg2;
  
  ModelRenderer LeftArmSeg3;
  
  ModelRenderer LeftArmSeg4;
  
  ModelRenderer RightShoulder;
  
  ModelRenderer RightArmSeg1;
  
  ModelRenderer RightArmSeg2;
  
  ModelRenderer RightArmSeg3;
  
  ModelRenderer RightArmSeg4;
  
  ModelRenderer RightPincer;
  
  ModelRenderer LeftPincer;
  
  ModelRenderer Lefteye;
  
  ModelRenderer Righteye;
  
  ModelRenderer RightMandible;
  
  ModelRenderer LeftMandible;
  
  ModelRenderer RightManPart2;
  
  ModelRenderer LeftManPart2;
  
  ModelRenderer Leg1Seg1;
  
  ModelRenderer Leg1Seg2;
  
  ModelRenderer Leg1Seg3;
  
  ModelRenderer Leg1Seg4;
  
  ModelRenderer Leg1Seg5;
  
  ModelRenderer Leg2Seg1;
  
  ModelRenderer Leg2Seg2;
  
  ModelRenderer Leg2Seg3;
  
  ModelRenderer Leg2Seg4;
  
  ModelRenderer Leg2Seg5;
  
  ModelRenderer Leg3Seg1;
  
  ModelRenderer Leg3Seg2;
  
  ModelRenderer Leg3Seg3;
  
  ModelRenderer Leg3Seg4;
  
  ModelRenderer Leg3Seg5;
  
  ModelRenderer Leg4Seg1;
  
  ModelRenderer Leg4Seg2;
  
  ModelRenderer Leg4Seg3;
  
  ModelRenderer Leg4Seg4;
  
  ModelRenderer Leg4Seg5;
  
  ModelRenderer Leg5Seg1;
  
  ModelRenderer Leg5Seg2;
  
  ModelRenderer Leg5Seg3;
  
  ModelRenderer Leg5Seg4;
  
  ModelRenderer Leg5Seg5;
  
  ModelRenderer Leg6Seg1;
  
  ModelRenderer Leg6Seg2;
  
  ModelRenderer Leg6Seg3;
  
  ModelRenderer Leg6Seg4;
  
  ModelRenderer Leg6Seg5;
  
  ModelRenderer Leg7Seg1;
  
  ModelRenderer Leg7Seg2;
  
  ModelRenderer Leg7Seg3;
  
  ModelRenderer Leg7Seg4;
  
  ModelRenderer Leg7Seg5;
  
  ModelRenderer Leg8Seg1;
  
  ModelRenderer Leg8Seg2;
  
  ModelRenderer Leg8Seg3;
  
  ModelRenderer Leg8Seg4;
  
  ModelRenderer Leg8Seg5;
  
  public ModelEmperorScorpion(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.Head = new ModelRenderer(this, 0, 104);
    this.Head.addBox(-9.0F, -4.0F, -16.0F, 18, 8, 16);
    this.Head.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Head.setTextureSize(256, 128);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Seg1 = new ModelRenderer(this, 0, 78);
    this.Seg1.addBox(-9.0F, -4.0F, 0.0F, 18, 8, 4);
    this.Seg1.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg1.setTextureSize(256, 128);
    this.Seg1.mirror = true;
    setRotation(this.Seg1, 0.0F, 0.0F, 0.0F);
    this.Seg2 = new ModelRenderer(this, 0, 65);
    this.Seg2.addBox(-8.5F, -4.1F, 4.0F, 17, 8, 4);
    this.Seg2.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg2.setTextureSize(256, 128);
    this.Seg2.mirror = true;
    setRotation(this.Seg2, 0.0F, 0.0F, 0.0F);
    this.Seg3 = new ModelRenderer(this, 0, 50);
    this.Seg3.addBox(-9.5F, -4.0F, 8.0F, 19, 8, 5);
    this.Seg3.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg3.setTextureSize(256, 128);
    this.Seg3.mirror = true;
    setRotation(this.Seg3, 0.0F, 0.0F, 0.0F);
    this.Seg4 = new ModelRenderer(this, 0, 35);
    this.Seg4.addBox(-9.0F, -4.1F, 13.0F, 18, 8, 6);
    this.Seg4.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg4.setTextureSize(256, 128);
    this.Seg4.mirror = true;
    setRotation(this.Seg4, 0.0F, 0.0F, 0.0F);
    this.Seg5 = new ModelRenderer(this, 45, 91);
    this.Seg5.addBox(-8.5F, -4.0F, 19.0F, 17, 8, 3);
    this.Seg5.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg5.setTextureSize(256, 128);
    this.Seg5.mirror = true;
    setRotation(this.Seg5, 0.0F, 0.0F, 0.0F);
    this.Seg6 = new ModelRenderer(this, 45, 79);
    this.Seg6.addBox(-8.0F, -4.1F, 22.0F, 16, 8, 3);
    this.Seg6.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg6.setTextureSize(256, 128);
    this.Seg6.mirror = true;
    setRotation(this.Seg6, 0.0F, 0.0F, 0.0F);
    this.Seg7 = new ModelRenderer(this, 43, 66);
    this.Seg7.addBox(-7.0F, -4.0F, 25.0F, 14, 8, 3);
    this.Seg7.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg7.setTextureSize(256, 128);
    this.Seg7.mirror = true;
    setRotation(this.Seg7, 0.0F, 0.0F, 0.0F);
    this.Seg8 = new ModelRenderer(this, 49, 53);
    this.Seg8.addBox(-5.5F, -4.1F, 28.0F, 11, 8, 2);
    this.Seg8.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Seg8.setTextureSize(256, 128);
    this.Seg8.mirror = true;
    setRotation(this.Seg8, 0.0F, 0.0F, 0.0F);
    this.Tailseg1 = new ModelRenderer(this, 92, 0);
    this.Tailseg1.addBox(-4.0F, -1.0F, 0.0F, 8, 4, 10);
    this.Tailseg1.setRotationPoint(0.0F, 13.0F, 20.0F);
    this.Tailseg1.setTextureSize(256, 128);
    this.Tailseg1.mirror = true;
    setRotation(this.Tailseg1, 0.5948578F, 0.0F, 0.0F);
    this.Tailseg2 = new ModelRenderer(this, 90, 15);
    this.Tailseg2.addBox(-3.5F, -2.0F, 0.0F, 7, 4, 12);
    this.Tailseg2.setRotationPoint(0.0F, 10.0F, 27.0F);
    this.Tailseg2.setTextureSize(256, 128);
    this.Tailseg2.mirror = true;
    setRotation(this.Tailseg2, 1.07818F, 0.0F, 0.0F);
    this.Tailseg3 = new ModelRenderer(this, 96, 32);
    this.Tailseg3.addBox(-3.0F, -2.0F, 1.0F, 6, 4, 10);
    this.Tailseg3.setRotationPoint(0.0F, 2.0F, 32.0F);
    this.Tailseg3.setTextureSize(256, 128);
    this.Tailseg3.mirror = true;
    setRotation(this.Tailseg3, 1.710216F, 0.0F, 0.0F);
    this.Tailseg4 = new ModelRenderer(this, 96, 47);
    this.Tailseg4.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 11);
    this.Tailseg4.setRotationPoint(0.0F, -7.0F, 31.0F);
    this.Tailseg4.setTextureSize(256, 128);
    this.Tailseg4.mirror = true;
    setRotation(this.Tailseg4, 2.267895F, 0.0F, 0.0F);
    this.Tailseg5 = new ModelRenderer(this, 98, 63);
    this.Tailseg5.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 11);
    this.Tailseg5.setRotationPoint(0.0F, -14.0F, 25.0F);
    this.Tailseg5.setTextureSize(256, 128);
    this.Tailseg5.mirror = true;
    setRotation(this.Tailseg5, 2.899932F, 0.0F, 0.0F);
    this.Tailseg6 = new ModelRenderer(this, 98, 79);
    this.Tailseg6.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 11);
    this.Tailseg6.setRotationPoint(0.0F, -17.0F, 16.0F);
    this.Tailseg6.setTextureSize(256, 128);
    this.Tailseg6.mirror = true;
    setRotation(this.Tailseg6, -2.602503F, 0.0F, 0.0F);
    this.Tailseg7 = new ModelRenderer(this, 94, 95);
    this.Tailseg7.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 11);
    this.Tailseg7.setRotationPoint(0.0F, -12.0F, 8.0F);
    this.Tailseg7.setTextureSize(256, 128);
    this.Tailseg7.mirror = true;
    setRotation(this.Tailseg7, -0.2230717F, 0.0F, 0.0F);
    this.Tailseg8 = new ModelRenderer(this, 102, 111);
    this.Tailseg8.addBox(-4.0F, -2.0F, 4.0F, 8, 4, 5);
    this.Tailseg8.setRotationPoint(0.0F, -12.0F, 8.0F);
    this.Tailseg8.setTextureSize(256, 128);
    this.Tailseg8.mirror = true;
    setRotation(this.Tailseg8, -0.2230717F, 0.0F, 0.0F);
    this.Stinger1 = new ModelRenderer(this, 83, 0);
    this.Stinger1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3);
    this.Stinger1.setRotationPoint(0.0F, -10.0F, 18.0F);
    this.Stinger1.setTextureSize(256, 128);
    this.Stinger1.mirror = true;
    setRotation(this.Stinger1, 0.2230717F, 0.0F, 0.0F);
    this.Stinger2 = new ModelRenderer(this, 83, 0);
    this.Stinger2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3);
    this.Stinger2.setRotationPoint(0.0F, -10.5F, 20.5F);
    this.Stinger2.setTextureSize(256, 128);
    this.Stinger2.mirror = true;
    setRotation(this.Stinger2, -0.2602503F, 0.0F, 0.0F);
    this.Stinger3 = new ModelRenderer(this, 79, 5);
    this.Stinger3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5);
    this.Stinger3.setRotationPoint(0.0F, -10.0F, 23.0F);
    this.Stinger3.setTextureSize(256, 128);
    this.Stinger3.mirror = true;
    setRotation(this.Stinger3, -0.8551081F, 0.0F, 0.0F);
    this.LeftShoulder = new ModelRenderer(this, 69, 103);
    this.LeftShoulder.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4);
    this.LeftShoulder.setRotationPoint(7.0F, 13.0F, -22.0F);
    this.LeftShoulder.setTextureSize(256, 128);
    this.LeftShoulder.mirror = true;
    setRotation(this.LeftShoulder, 0.0F, -0.8551081F, 0.0F);
    this.LeftArmSeg1 = new ModelRenderer(this, 55, 0);
    this.LeftArmSeg1.addBox(-3.0F, -3.0F, -10.0F, 4, 6, 13);
    this.LeftArmSeg1.setRotationPoint(10.0F, 13.0F, -24.0F);
    this.LeftArmSeg1.setTextureSize(256, 128);
    this.LeftArmSeg1.mirror = true;
    setRotation(this.LeftArmSeg1, 0.0F, -2.044824F, 0.0F);
    this.LeftArmSeg2 = new ModelRenderer(this, 130, 0);
    this.LeftArmSeg2.addBox(-7.0F, -3.0F, -17.0F, 8, 6, 17);
    this.LeftArmSeg2.setRotationPoint(19.0F, 13.0F, -22.0F);
    this.LeftArmSeg2.setTextureSize(256, 128);
    this.LeftArmSeg2.mirror = true;
    setRotation(this.LeftArmSeg2, 0.0F, -0.7435722F, 0.0F);
    this.LeftArmSeg3 = new ModelRenderer(this, 130, 50);
    this.LeftArmSeg3.addBox(-3.0F, -3.0F, -24.0F, 4, 6, 24);
    this.LeftArmSeg3.setRotationPoint(29.0F, 13.0F, -33.0F);
    this.LeftArmSeg3.setTextureSize(256, 128);
    this.LeftArmSeg3.mirror = true;
    setRotation(this.LeftArmSeg3, 0.0F, 0.3717861F, 0.0F);
    this.LeftArmSeg4 = new ModelRenderer(this, 181, 0);
    this.LeftArmSeg4.addBox(-3.0F, -3.0F, -14.0F, 8, 6, 12);
    this.LeftArmSeg4.setRotationPoint(29.0F, 13.0F, -33.0F);
    this.LeftArmSeg4.setTextureSize(256, 128);
    this.LeftArmSeg4.mirror = true;
    setRotation(this.LeftArmSeg4, 0.0F, 1.487144F, 0.0F);
    this.RightShoulder = new ModelRenderer(this, 69, 103);
    this.RightShoulder.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4);
    this.RightShoulder.setRotationPoint(-7.0F, 13.0F, -22.0F);
    this.RightShoulder.setTextureSize(256, 128);
    this.RightShoulder.mirror = true;
    setRotation(this.RightShoulder, 0.0F, 0.8551066F, 0.0F);
    this.RightArmSeg1 = new ModelRenderer(this, 55, 0);
    this.RightArmSeg1.addBox(-1.0F, -3.0F, -10.0F, 4, 6, 13);
    this.RightArmSeg1.setRotationPoint(-10.0F, 13.0F, -24.0F);
    this.RightArmSeg1.setTextureSize(256, 128);
    this.RightArmSeg1.mirror = true;
    setRotation(this.RightArmSeg1, 0.0F, 2.044828F, 0.0F);
    this.RightArmSeg2 = new ModelRenderer(this, 130, 0);
    this.RightArmSeg2.addBox(-1.0F, -3.0F, -17.0F, 8, 6, 17);
    this.RightArmSeg2.setRotationPoint(-19.0F, 13.0F, -22.0F);
    this.RightArmSeg2.setTextureSize(256, 128);
    this.RightArmSeg2.mirror = true;
    setRotation(this.RightArmSeg2, 0.0F, 0.7435801F, 0.0F);
    this.RightArmSeg3 = new ModelRenderer(this, 130, 50);
    this.RightArmSeg3.addBox(-1.0F, -3.0F, -24.0F, 4, 6, 24);
    this.RightArmSeg3.setRotationPoint(-29.0F, 13.0F, -33.0F);
    this.RightArmSeg3.setTextureSize(256, 128);
    this.RightArmSeg3.mirror = true;
    setRotation(this.RightArmSeg3, 0.0F, -0.37179F, 0.0F);
    this.RightArmSeg4 = new ModelRenderer(this, 181, 0);
    this.RightArmSeg4.addBox(-5.0F, -3.0F, -14.0F, 8, 6, 12);
    this.RightArmSeg4.setRotationPoint(-29.0F, 13.0F, -33.0F);
    this.RightArmSeg4.setTextureSize(256, 128);
    this.RightArmSeg4.mirror = true;
    setRotation(this.RightArmSeg4, 0.0F, -1.487143F, 0.0F);
    this.RightPincer = new ModelRenderer(this, 130, 24);
    this.RightPincer.addBox(-1.0F, -3.0F, -19.0F, 2, 6, 19);
    this.RightPincer.setRotationPoint(-17.0F, 13.0F, -33.0F);
    this.RightPincer.setTextureSize(256, 128);
    this.RightPincer.mirror = true;
    setRotation(this.RightPincer, 0.0F, -0.0743611F, 0.0F);
    this.LeftPincer = new ModelRenderer(this, 130, 24);
    this.LeftPincer.addBox(-1.0F, -3.0F, -19.0F, 2, 6, 19);
    this.LeftPincer.setRotationPoint(17.0F, 13.0F, -33.0F);
    this.LeftPincer.setTextureSize(256, 128);
    this.LeftPincer.mirror = true;
    setRotation(this.LeftPincer, 0.0F, 0.0743685F, 0.0F);
    this.Lefteye = new ModelRenderer(this, 0, 113);
    this.Lefteye.addBox(-0.5F, -5.0F, -7.5F, 3, 2, 3);
    this.Lefteye.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Lefteye.setTextureSize(256, 128);
    this.Lefteye.mirror = true;
    setRotation(this.Lefteye, 0.0F, 0.0F, 0.2974289F);
    this.Righteye = new ModelRenderer(this, 0, 113);
    this.Righteye.addBox(-2.5F, -5.0F, -7.5F, 3, 2, 3);
    this.Righteye.setRotationPoint(0.0F, 13.0F, -8.0F);
    this.Righteye.setTextureSize(256, 128);
    this.Righteye.mirror = true;
    setRotation(this.Righteye, 0.0F, 0.0F, -0.2974216F);
    this.RightMandible = new ModelRenderer(this, 76, 55);
    this.RightMandible.addBox(-2.0F, -3.0F, -4.0F, 4, 4, 4);
    this.RightMandible.setRotationPoint(-2.0F, 13.0F, -23.0F);
    this.RightMandible.setTextureSize(256, 128);
    this.RightMandible.mirror = true;
    setRotation(this.RightMandible, 0.1115358F, 0.3346075F, 0.0F);
    this.LeftMandible = new ModelRenderer(this, 76, 55);
    this.LeftMandible.addBox(-2.0F, -3.0F, -4.0F, 4, 4, 4);
    this.LeftMandible.setRotationPoint(2.0F, 13.0F, -23.0F);
    this.LeftMandible.setTextureSize(256, 128);
    this.LeftMandible.mirror = true;
    setRotation(this.LeftMandible, 0.111544F, -0.3346145F, 0.0F);
    this.RightManPart2 = new ModelRenderer(this, 82, 64);
    this.RightManPart2.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6);
    this.RightManPart2.setRotationPoint(-3.0F, 11.0F, -26.0F);
    this.RightManPart2.setTextureSize(256, 128);
    this.RightManPart2.mirror = true;
    setRotation(this.RightManPart2, 1.189716F, 0.0F, 0.0F);
    this.LeftManPart2 = new ModelRenderer(this, 82, 64);
    this.LeftManPart2.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6);
    this.LeftManPart2.setRotationPoint(3.0F, 11.0F, -26.0F);
    this.LeftManPart2.setTextureSize(256, 128);
    this.LeftManPart2.mirror = true;
    setRotation(this.LeftManPart2, 1.188848F, 0.0F, 0.0F);
    this.Leg1Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg1Seg1.addBox(0.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg1Seg1.setRotationPoint(9.0F, 13.0F, -10.0F);
    this.Leg1Seg1.setTextureSize(256, 128);
    this.Leg1Seg1.mirror = true;
    setRotation(this.Leg1Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg1Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg1Seg2.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg1Seg2.setRotationPoint(12.0F, 13.0F, -10.0F);
    this.Leg1Seg2.setTextureSize(256, 128);
    this.Leg1Seg2.mirror = true;
    setRotation(this.Leg1Seg2, 0.0F, 0.0F, -0.9294576F);
    this.Leg1Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg1Seg3.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg1Seg3.setRotationPoint(18.0F, 3.0F, -10.0F);
    this.Leg1Seg3.setTextureSize(256, 128);
    this.Leg1Seg3.mirror = true;
    setRotation(this.Leg1Seg3, 0.0F, 0.0F, 0.6320361F);
    this.Leg1Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg1Seg4.addBox(0.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg1Seg4.setRotationPoint(26.0F, 12.0F, -10.0F);
    this.Leg1Seg4.setTextureSize(256, 128);
    this.Leg1Seg4.mirror = true;
    setRotation(this.Leg1Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg1Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg1Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg1Seg5.setRotationPoint(27.0F, 19.0F, -10.0F);
    this.Leg1Seg5.setTextureSize(256, 128);
    this.Leg1Seg5.mirror = true;
    setRotation(this.Leg1Seg5, 0.0F, 0.0F, 0.669215F);
    this.Leg2Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg2Seg1.addBox(0.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg2Seg1.setRotationPoint(8.5F, 13.0F, -4.0F);
    this.Leg2Seg1.setTextureSize(256, 128);
    this.Leg2Seg1.mirror = true;
    setRotation(this.Leg2Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg2Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg2Seg2.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg2Seg2.setRotationPoint(12.0F, 13.0F, -4.0F);
    this.Leg2Seg2.setTextureSize(256, 128);
    this.Leg2Seg2.mirror = true;
    setRotation(this.Leg2Seg2, 0.0F, 0.0F, -0.9294576F);
    this.Leg2Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg2Seg3.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg2Seg3.setRotationPoint(18.0F, 3.0F, -4.0F);
    this.Leg2Seg3.setTextureSize(256, 128);
    this.Leg2Seg3.mirror = true;
    setRotation(this.Leg2Seg3, 0.0F, 0.0F, 0.6320361F);
    this.Leg2Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg2Seg4.addBox(0.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg2Seg4.setRotationPoint(26.0F, 12.0F, -4.0F);
    this.Leg2Seg4.setTextureSize(256, 128);
    this.Leg2Seg4.mirror = true;
    setRotation(this.Leg2Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg2Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg2Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg2Seg5.setRotationPoint(27.0F, 19.0F, -4.0F);
    this.Leg2Seg5.setTextureSize(256, 128);
    this.Leg2Seg5.mirror = true;
    setRotation(this.Leg2Seg5, 0.0F, 0.0F, 0.669215F);
    this.Leg3Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg3Seg1.addBox(0.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg3Seg1.setRotationPoint(9.5F, 13.0F, 2.0F);
    this.Leg3Seg1.setTextureSize(256, 128);
    this.Leg3Seg1.mirror = true;
    setRotation(this.Leg3Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg3Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg3Seg2.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg3Seg2.setRotationPoint(12.0F, 13.0F, 2.0F);
    this.Leg3Seg2.setTextureSize(256, 128);
    this.Leg3Seg2.mirror = true;
    setRotation(this.Leg3Seg2, 0.0F, 0.0F, -0.9294576F);
    this.Leg3Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg3Seg3.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg3Seg3.setRotationPoint(18.0F, 3.0F, 2.0F);
    this.Leg3Seg3.setTextureSize(256, 128);
    this.Leg3Seg3.mirror = true;
    setRotation(this.Leg3Seg3, 0.0F, 0.0F, 0.6320361F);
    this.Leg3Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg3Seg4.addBox(0.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg3Seg4.setRotationPoint(26.0F, 12.0F, 2.0F);
    this.Leg3Seg4.setTextureSize(256, 128);
    this.Leg3Seg4.mirror = true;
    setRotation(this.Leg3Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg3Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg3Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg3Seg5.setRotationPoint(27.0F, 19.0F, 2.0F);
    this.Leg3Seg5.setTextureSize(256, 128);
    this.Leg3Seg5.mirror = true;
    setRotation(this.Leg3Seg5, 0.0F, 0.0F, 0.669215F);
    this.Leg4Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg4Seg1.addBox(0.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg4Seg1.setRotationPoint(9.0F, 13.0F, 8.0F);
    this.Leg4Seg1.setTextureSize(256, 128);
    this.Leg4Seg1.mirror = true;
    setRotation(this.Leg4Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg4Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg4Seg2.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg4Seg2.setRotationPoint(12.0F, 13.0F, 8.0F);
    this.Leg4Seg2.setTextureSize(256, 128);
    this.Leg4Seg2.mirror = true;
    setRotation(this.Leg4Seg2, 0.0F, 0.0F, -0.9294576F);
    this.Leg4Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg4Seg3.addBox(0.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg4Seg3.setRotationPoint(18.0F, 3.0F, 8.0F);
    this.Leg4Seg3.setTextureSize(256, 128);
    this.Leg4Seg3.mirror = true;
    setRotation(this.Leg4Seg3, 0.0F, 0.0F, 0.6320361F);
    this.Leg4Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg4Seg4.addBox(0.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg4Seg4.setRotationPoint(26.0F, 12.0F, 8.0F);
    this.Leg4Seg4.setTextureSize(256, 128);
    this.Leg4Seg4.mirror = true;
    setRotation(this.Leg4Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg4Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg4Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg4Seg5.setRotationPoint(27.0F, 19.0F, 8.0F);
    this.Leg4Seg5.setTextureSize(256, 128);
    this.Leg4Seg5.mirror = true;
    setRotation(this.Leg4Seg5, 0.0F, 0.0F, 0.669215F);
    this.Leg5Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg5Seg1.addBox(-4.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg5Seg1.setRotationPoint(-9.0F, 13.0F, -10.0F);
    this.Leg5Seg1.setTextureSize(256, 128);
    this.Leg5Seg1.mirror = true;
    setRotation(this.Leg5Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg5Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg5Seg2.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg5Seg2.setRotationPoint(-12.0F, 14.0F, -10.0F);
    this.Leg5Seg2.setTextureSize(256, 128);
    this.Leg5Seg2.mirror = true;
    setRotation(this.Leg5Seg2, 0.0F, 0.0F, 0.9294653F);
    this.Leg5Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg5Seg3.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg5Seg3.setRotationPoint(-18.0F, 4.0F, -10.0F);
    this.Leg5Seg3.setTextureSize(256, 128);
    this.Leg5Seg3.mirror = true;
    setRotation(this.Leg5Seg3, 0.0F, 0.0F, -0.6320364F);
    this.Leg5Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg5Seg4.addBox(-3.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg5Seg4.setRotationPoint(-26.0F, 12.0F, -10.0F);
    this.Leg5Seg4.setTextureSize(256, 128);
    this.Leg5Seg4.mirror = true;
    setRotation(this.Leg5Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg5Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg5Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg5Seg5.setRotationPoint(-27.0F, 19.0F, -10.0F);
    this.Leg5Seg5.setTextureSize(256, 128);
    this.Leg5Seg5.mirror = true;
    setRotation(this.Leg5Seg5, 0.0F, 0.0F, 2.240008F);
    this.Leg6Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg6Seg1.addBox(-4.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg6Seg1.setRotationPoint(-8.5F, 13.0F, -4.0F);
    this.Leg6Seg1.setTextureSize(256, 128);
    this.Leg6Seg1.mirror = true;
    setRotation(this.Leg6Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg6Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg6Seg2.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg6Seg2.setRotationPoint(-12.0F, 14.0F, -4.0F);
    this.Leg6Seg2.setTextureSize(256, 128);
    this.Leg6Seg2.mirror = true;
    setRotation(this.Leg6Seg2, 0.0F, 0.0F, 0.9294576F);
    this.Leg6Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg6Seg3.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg6Seg3.setRotationPoint(-18.0F, 4.0F, -4.0F);
    this.Leg6Seg3.setTextureSize(256, 128);
    this.Leg6Seg3.mirror = true;
    setRotation(this.Leg6Seg3, 0.0F, 0.0F, -0.6320361F);
    this.Leg6Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg6Seg4.addBox(-3.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg6Seg4.setRotationPoint(-26.0F, 12.0F, -4.0F);
    this.Leg6Seg4.setTextureSize(256, 128);
    this.Leg6Seg4.mirror = true;
    setRotation(this.Leg6Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg6Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg6Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg6Seg5.setRotationPoint(-27.0F, 19.0F, -4.0F);
    this.Leg6Seg5.setTextureSize(256, 128);
    this.Leg6Seg5.mirror = true;
    setRotation(this.Leg6Seg5, 0.0F, 0.0F, 2.240008F);
    this.Leg7Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg7Seg1.addBox(-4.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg7Seg1.setRotationPoint(-9.5F, 13.0F, 2.0F);
    this.Leg7Seg1.setTextureSize(256, 128);
    this.Leg7Seg1.mirror = true;
    setRotation(this.Leg7Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg7Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg7Seg2.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg7Seg2.setRotationPoint(-12.0F, 14.0F, 2.0F);
    this.Leg7Seg2.setTextureSize(256, 128);
    this.Leg7Seg2.mirror = true;
    setRotation(this.Leg7Seg2, 0.0F, 0.0F, 0.9294576F);
    this.Leg7Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg7Seg3.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg7Seg3.setRotationPoint(-18.0F, 4.0F, 2.0F);
    this.Leg7Seg3.setTextureSize(256, 128);
    this.Leg7Seg3.mirror = true;
    setRotation(this.Leg7Seg3, 0.0F, 0.0F, -0.6320361F);
    this.Leg7Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg7Seg4.addBox(-3.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg7Seg4.setRotationPoint(-26.0F, 12.0F, 2.0F);
    this.Leg7Seg4.setTextureSize(256, 128);
    this.Leg7Seg4.mirror = true;
    setRotation(this.Leg7Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg7Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg7Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg7Seg5.setRotationPoint(-27.0F, 19.0F, 2.0F);
    this.Leg7Seg5.setTextureSize(256, 128);
    this.Leg7Seg5.mirror = true;
    setRotation(this.Leg7Seg5, 0.0F, 0.0F, 2.240008F);
    this.Leg8Seg1 = new ModelRenderer(this, 20, 20);
    this.Leg8Seg1.addBox(-4.0F, -1.5F, -2.0F, 4, 3, 4);
    this.Leg8Seg1.setRotationPoint(-9.0F, 13.0F, 8.0F);
    this.Leg8Seg1.setTextureSize(256, 128);
    this.Leg8Seg1.mirror = true;
    setRotation(this.Leg8Seg1, 0.0F, 0.0F, 0.0F);
    this.Leg8Seg2 = new ModelRenderer(this, 21, 0);
    this.Leg8Seg2.addBox(-12.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg8Seg2.setRotationPoint(-12.0F, 14.0F, 8.0F);
    this.Leg8Seg2.setTextureSize(256, 128);
    this.Leg8Seg2.mirror = true;
    setRotation(this.Leg8Seg2, 0.0F, 0.0F, 0.9294576F);
    this.Leg8Seg3 = new ModelRenderer(this, 15, 8);
    this.Leg8Seg3.addBox(-13.0F, -1.5F, -1.5F, 13, 3, 3);
    this.Leg8Seg3.setRotationPoint(-18.0F, 4.0F, 8.0F);
    this.Leg8Seg3.setTextureSize(256, 128);
    this.Leg8Seg3.mirror = true;
    setRotation(this.Leg8Seg3, 0.0F, 0.0F, -0.6320361F);
    this.Leg8Seg4 = new ModelRenderer(this, 0, 14);
    this.Leg8Seg4.addBox(-3.0F, -1.5F, -1.5F, 3, 10, 3);
    this.Leg8Seg4.setRotationPoint(-26.0F, 12.0F, 8.0F);
    this.Leg8Seg4.setTextureSize(256, 128);
    this.Leg8Seg4.mirror = true;
    setRotation(this.Leg8Seg4, 0.0F, 0.0F, 0.0F);
    this.Leg8Seg5 = new ModelRenderer(this, 0, 0);
    this.Leg8Seg5.addBox(0.0F, -1.5F, -1.5F, 7, 3, 3);
    this.Leg8Seg5.setRotationPoint(-27.0F, 19.0F, 8.0F);
    this.Leg8Seg5.setTextureSize(256, 128);
    this.Leg8Seg5.mirror = true;
    setRotation(this.Leg8Seg5, 0.0F, 0.0F, 2.240008F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    EmperorScorpion e = (EmperorScorpion)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
    float pi4 = 1.570795F;
    newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.cos((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = 0.47F * f1 - Math.abs(newangle); 
    doLeftLeg(this.Leg1Seg1, this.Leg1Seg2, this.Leg1Seg3, this.Leg1Seg4, this.Leg1Seg5, newangle, upangle);
    doRightLeg(this.Leg5Seg1, this.Leg5Seg2, this.Leg5Seg3, this.Leg5Seg4, this.Leg5Seg5, -newangle, upangle);
    newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed - 1.0F * pi4) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.cos((f2 + 0.1F) * 2.0F * this.wingspeed - 1.0F * pi4) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = 0.47F * f1 - Math.abs(newangle); 
    doLeftLeg(this.Leg2Seg1, this.Leg2Seg2, this.Leg2Seg3, this.Leg2Seg4, this.Leg2Seg5, newangle, upangle);
    doRightLeg(this.Leg6Seg1, this.Leg6Seg2, this.Leg6Seg3, this.Leg6Seg4, this.Leg6Seg5, -newangle, upangle);
    newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.cos((f2 + 0.1F) * 2.0F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = 0.47F * f1 - Math.abs(newangle); 
    doLeftLeg(this.Leg3Seg1, this.Leg3Seg2, this.Leg3Seg3, this.Leg3Seg4, this.Leg3Seg5, newangle, upangle);
    doRightLeg(this.Leg7Seg1, this.Leg7Seg2, this.Leg7Seg3, this.Leg7Seg4, this.Leg7Seg5, -newangle, upangle);
    newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.12F * f1;
    nextangle = MathHelper.cos((f2 + 0.1F) * 2.0F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.12F * f1;
    upangle = 0.0F;
    if (nextangle > newangle)
      upangle = 0.47F * f1 - Math.abs(newangle); 
    doLeftLeg(this.Leg4Seg1, this.Leg4Seg2, this.Leg4Seg3, this.Leg4Seg4, this.Leg4Seg5, newangle, upangle);
    doRightLeg(this.Leg8Seg1, this.Leg8Seg2, this.Leg8Seg3, this.Leg8Seg4, this.Leg8Seg5, -newangle, upangle);
    if (e.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
    } else {
      newangle = MathHelper.cos(f2 * 2.5F * this.wingspeed) * 3.1415927F * 0.15F;
    } 
    this.LeftManPart2.rotateAngleZ = newangle;
    this.RightManPart2.rotateAngleZ = -newangle;
    r = e.getRenderInfo();
    newangle = MathHelper.cos(f2 * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
    nextangle = MathHelper.cos((f2 + 0.1F) * 3.0F * this.wingspeed) * 3.1415927F * 0.15F;
    if (nextangle > 0.0F && newangle < 0.0F) {
      r.ri1 = 0;
      if (e.getAttacking() == 0) {
        r.ri1 = e.worldObj.rand.nextInt(20);
        r.ri2 = e.worldObj.rand.nextInt(25);
      } else {
        r.ri1 = e.worldObj.rand.nextInt(4);
        r.ri2 = e.worldObj.rand.nextInt(3);
      } 
    } 
    if (r.ri1 == 1 || r.ri1 == 3) {
      doLeftClaw(newangle);
    } else {
      doLeftClaw(0.0F);
    } 
    if (r.ri1 == 2 || r.ri1 == 3) {
      doRightClaw(newangle);
    } else {
      doRightClaw(0.0F);
    } 
    if (r.ri2 == 1) {
      doTail(newangle);
    } else {
      doTail(0.0F);
    } 
    e.setRenderInfo(r);
    this.Head.render(f5);
    this.Seg1.render(f5);
    this.Seg2.render(f5);
    this.Seg3.render(f5);
    this.Seg4.render(f5);
    this.Seg5.render(f5);
    this.Seg6.render(f5);
    this.Seg7.render(f5);
    this.Seg8.render(f5);
    this.Tailseg1.render(f5);
    this.Tailseg2.render(f5);
    this.Tailseg3.render(f5);
    this.Tailseg4.render(f5);
    this.Tailseg5.render(f5);
    this.Tailseg6.render(f5);
    this.Tailseg7.render(f5);
    this.Tailseg8.render(f5);
    this.Stinger1.render(f5);
    this.Stinger2.render(f5);
    this.Stinger3.render(f5);
    this.LeftShoulder.render(f5);
    this.LeftArmSeg1.render(f5);
    this.LeftArmSeg2.render(f5);
    this.LeftArmSeg3.render(f5);
    this.LeftArmSeg4.render(f5);
    this.RightShoulder.render(f5);
    this.RightArmSeg1.render(f5);
    this.RightArmSeg2.render(f5);
    this.RightArmSeg3.render(f5);
    this.RightArmSeg4.render(f5);
    this.RightPincer.render(f5);
    this.LeftPincer.render(f5);
    this.Lefteye.render(f5);
    this.Righteye.render(f5);
    this.RightMandible.render(f5);
    this.LeftMandible.render(f5);
    this.RightManPart2.render(f5);
    this.LeftManPart2.render(f5);
    this.Leg1Seg1.render(f5);
    this.Leg1Seg2.render(f5);
    this.Leg1Seg3.render(f5);
    this.Leg1Seg4.render(f5);
    this.Leg1Seg5.render(f5);
    this.Leg2Seg1.render(f5);
    this.Leg2Seg2.render(f5);
    this.Leg2Seg3.render(f5);
    this.Leg2Seg4.render(f5);
    this.Leg2Seg5.render(f5);
    this.Leg3Seg1.render(f5);
    this.Leg3Seg2.render(f5);
    this.Leg3Seg3.render(f5);
    this.Leg3Seg4.render(f5);
    this.Leg3Seg5.render(f5);
    this.Leg4Seg1.render(f5);
    this.Leg4Seg2.render(f5);
    this.Leg4Seg3.render(f5);
    this.Leg4Seg4.render(f5);
    this.Leg4Seg5.render(f5);
    this.Leg5Seg1.render(f5);
    this.Leg5Seg2.render(f5);
    this.Leg5Seg3.render(f5);
    this.Leg5Seg4.render(f5);
    this.Leg5Seg5.render(f5);
    this.Leg6Seg1.render(f5);
    this.Leg6Seg2.render(f5);
    this.Leg6Seg3.render(f5);
    this.Leg6Seg4.render(f5);
    this.Leg6Seg5.render(f5);
    this.Leg7Seg1.render(f5);
    this.Leg7Seg2.render(f5);
    this.Leg7Seg3.render(f5);
    this.Leg7Seg4.render(f5);
    this.Leg7Seg5.render(f5);
    this.Leg8Seg1.render(f5);
    this.Leg8Seg2.render(f5);
    this.Leg8Seg3.render(f5);
    this.Leg8Seg4.render(f5);
    this.Leg8Seg5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void doLeftLeg(ModelRenderer seg1, ModelRenderer seg2, ModelRenderer seg3, ModelRenderer seg4, ModelRenderer seg5, float angle, float upangle) {
    seg2.rotateAngleY = angle;
    seg3.rotateAngleY = angle;
    seg4.rotateAngleY = angle;
    seg5.rotateAngleY = angle;
    seg3.rotationPointZ = (float)(seg2.rotationPointZ - Math.sin(angle) * 6.0D);
    seg3.rotationPointX = (float)(seg2.rotationPointX - Math.abs(Math.sin(angle) * 6.0D) + 6.0D);
    seg4.rotationPointZ = (float)(seg3.rotationPointZ - Math.sin(angle) * 9.0D);
    seg4.rotationPointX = (float)(seg3.rotationPointX - Math.abs(Math.sin(angle) * 9.0D) + 9.0D);
    seg5.rotationPointZ = (float)(seg4.rotationPointZ - Math.sin(angle) * 1.0D);
    seg5.rotationPointX = (float)(seg4.rotationPointX - Math.abs(Math.sin(angle) * 1.0D) + 1.0D);
    seg2.rotateAngleZ = -upangle - 0.929F;
    seg3.rotateAngleZ = -upangle + 0.632F;
    seg2.rotationPointY += (float)(11.5D * Math.sin(seg2.rotateAngleZ));
    seg3.rotationPointY += (float)(11.5D * Math.sin(seg3.rotateAngleZ));
    seg4.rotationPointY += 6.5F;
  }
  
  private void doRightLeg(ModelRenderer seg1, ModelRenderer seg2, ModelRenderer seg3, ModelRenderer seg4, ModelRenderer seg5, float angle, float upangle) {
    seg2.rotateAngleY = angle;
    seg3.rotateAngleY = angle;
    seg4.rotateAngleY = angle;
    seg5.rotateAngleY = -angle;
    seg3.rotationPointZ = (float)(seg2.rotationPointZ + Math.sin(angle) * 6.0D);
    seg3.rotationPointX = (float)(seg2.rotationPointX + Math.abs(Math.sin(angle) * 6.0D) - 6.0D);
    seg4.rotationPointZ = (float)(seg3.rotationPointZ + Math.sin(angle) * 9.0D);
    seg4.rotationPointX = (float)(seg3.rotationPointX + Math.abs(Math.sin(angle) * 9.0D) - 9.0D);
    seg5.rotationPointZ = (float)(seg4.rotationPointZ + Math.sin(angle) * 1.0D);
    seg5.rotationPointX = (float)(seg4.rotationPointX + Math.abs(Math.sin(angle) * 1.0D) - 1.0D);
    seg2.rotateAngleZ = upangle + 0.929F;
    seg3.rotateAngleZ = upangle - 0.632F;
    seg2.rotationPointY -= (float)(11.5D * Math.sin(seg2.rotateAngleZ));
    seg3.rotationPointY -= (float)(11.5D * Math.sin(seg3.rotateAngleZ));
    seg4.rotationPointY += 6.5F;
  }
  
  private void doLeftClaw(float angle) {
    this.LeftArmSeg1.rotateAngleY = -1.57F + angle;
    this.LeftArmSeg2.rotationPointZ = (float)(-22.0D - Math.cos(this.LeftArmSeg1.rotateAngleY) * 12.0D);
    this.LeftArmSeg2.rotationPointZ -= 11.0F;
    this.LeftArmSeg2.rotationPointZ -= 11.0F;
    this.LeftArmSeg2.rotationPointZ -= 11.0F;
    this.LeftArmSeg3.rotateAngleY = 0.074F + angle;
    this.LeftPincer.rotateAngleY = 0.371F - angle;
  }
  
  private void doRightClaw(float angle) {
    this.RightArmSeg1.rotateAngleY = 1.57F - angle;
    this.RightArmSeg2.rotationPointZ = (float)(-22.0D - Math.cos(this.RightArmSeg1.rotateAngleY) * 12.0D);
    this.RightArmSeg2.rotationPointZ -= 11.0F;
    this.RightArmSeg2.rotationPointZ -= 11.0F;
    this.RightArmSeg2.rotationPointZ -= 11.0F;
    this.RightArmSeg3.rotateAngleY = -0.074F - angle;
    this.RightPincer.rotateAngleY = -0.371F + angle;
  }
  
  private void doTail(float angle) {
    this.Tailseg1.rotateAngleX = 0.594F + angle;
    this.Tailseg2.rotateAngleX = this.Tailseg1.rotateAngleX + 0.48399997F + angle;
    this.Tailseg2.rotationPointY = (float)(this.Tailseg1.rotationPointY - Math.sin(this.Tailseg1.rotateAngleX) * 9.0D);
    this.Tailseg2.rotationPointZ = (float)(this.Tailseg1.rotationPointZ + Math.cos(this.Tailseg1.rotateAngleX) * 9.0D);
    this.Tailseg3.rotateAngleX = this.Tailseg2.rotateAngleX + 0.6320001F + angle;
    this.Tailseg3.rotationPointY = (float)(this.Tailseg2.rotationPointY - Math.sin(this.Tailseg2.rotateAngleX) * 10.0D);
    this.Tailseg3.rotationPointZ = (float)(this.Tailseg2.rotationPointZ + Math.cos(this.Tailseg2.rotateAngleX) * 10.0D);
    this.Tailseg4.rotateAngleX = this.Tailseg3.rotateAngleX + 0.5569999F - angle;
    this.Tailseg4.rotationPointY = (float)(this.Tailseg3.rotationPointY - Math.sin(this.Tailseg3.rotateAngleX) * 10.0D);
    this.Tailseg4.rotationPointZ = (float)(this.Tailseg3.rotationPointZ + Math.cos(this.Tailseg3.rotateAngleX) * 10.0D);
    this.Tailseg5.rotateAngleX = this.Tailseg4.rotateAngleX + 0.63199997F - angle;
    this.Tailseg5.rotationPointY = (float)(this.Tailseg4.rotationPointY - Math.sin(this.Tailseg4.rotateAngleX) * 10.0D);
    this.Tailseg5.rotationPointZ = (float)(this.Tailseg4.rotationPointZ + Math.cos(this.Tailseg4.rotateAngleX) * 10.0D);
    this.Tailseg6.rotateAngleX = this.Tailseg5.rotateAngleX + -5.501F - angle * 3.0F / 2.0F - 0.4F;
    this.Tailseg6.rotationPointY = (float)(this.Tailseg5.rotationPointY - Math.sin(this.Tailseg5.rotateAngleX) * 10.0D);
    this.Tailseg6.rotationPointZ = (float)(this.Tailseg5.rotationPointZ + Math.cos(this.Tailseg5.rotateAngleX) * 10.0D);
    this.Tailseg7.rotateAngleX = this.Tailseg6.rotateAngleX + -2.822F - angle * 2.5F - 2.2F;
    this.Tailseg7.rotationPointY = (float)(this.Tailseg6.rotationPointY - Math.sin(this.Tailseg6.rotateAngleX) * 10.0D);
    this.Tailseg7.rotationPointZ = (float)(this.Tailseg6.rotationPointZ + Math.cos(this.Tailseg6.rotateAngleX) * 10.0D);
    this.Tailseg8.rotateAngleX = this.Tailseg7.rotateAngleX;
    this.Tailseg8.rotationPointY = this.Tailseg7.rotationPointY;
    this.Tailseg8.rotationPointZ = this.Tailseg7.rotationPointZ;
    this.Stinger1.rotateAngleX = this.Tailseg7.rotateAngleX + 0.0F + angle * 0.66F;
    this.Stinger1.rotationPointY = (float)(this.Tailseg7.rotationPointY - Math.sin(this.Tailseg7.rotateAngleX) * 10.0D);
    this.Stinger1.rotationPointZ = (float)(this.Tailseg7.rotationPointZ + Math.cos(this.Tailseg7.rotateAngleX) * 10.0D);
    this.Stinger2.rotateAngleX = this.Stinger1.rotateAngleX + -0.48F + angle;
    this.Stinger2.rotationPointY = (float)(this.Stinger1.rotationPointY - Math.sin(this.Stinger1.rotateAngleX) * 3.0D);
    this.Stinger2.rotationPointZ = (float)(this.Stinger1.rotationPointZ + Math.cos(this.Stinger1.rotateAngleX) * 3.0D);
    this.Stinger3.rotateAngleX = this.Stinger2.rotateAngleX + -1.01F + angle * 1.7F;
    this.Stinger3.rotationPointY = (float)(this.Stinger2.rotationPointY - Math.sin(this.Stinger2.rotateAngleX) * 3.0D);
    this.Stinger3.rotationPointZ = (float)(this.Stinger2.rotationPointZ + Math.cos(this.Stinger2.rotateAngleX) * 3.0D);
  }
}
