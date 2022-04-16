package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLizard extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer BodyBack;
  
  ModelRenderer TopBackLeftLeg;
  
  ModelRenderer TailTip;
  
  ModelRenderer BodyFront;
  
  ModelRenderer TailBase1;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tail3;
  
  ModelRenderer Tail4;
  
  ModelRenderer Neck;
  
  ModelRenderer TopFrontLeftLeg;
  
  ModelRenderer TopBackRightLeg;
  
  ModelRenderer BottomBackRightLeg;
  
  ModelRenderer TopFrontRightLeg;
  
  ModelRenderer BottomBackLeftLeg;
  
  ModelRenderer BottomFrontRightLeg;
  
  ModelRenderer BottomFrontLeftLeg;
  
  ModelRenderer BodyCenter;
  
  ModelRenderer Toe7;
  
  ModelRenderer Toe6;
  
  ModelRenderer BackLeftFoot;
  
  ModelRenderer Toe4;
  
  ModelRenderer Toe5;
  
  ModelRenderer BackRightFoot;
  
  ModelRenderer Toe8;
  
  ModelRenderer Toe1;
  
  ModelRenderer FrontLeftFoot;
  
  ModelRenderer Toe3;
  
  ModelRenderer Toe2;
  
  ModelRenderer FrontRightFoot;
  
  ModelRenderer FinRidge7;
  
  ModelRenderer FinRidge6;
  
  ModelRenderer FinRidge5;
  
  ModelRenderer FinRidge4;
  
  ModelRenderer FinRidge3;
  
  ModelRenderer FinRidge2;
  
  ModelRenderer FinRidge1;
  
  ModelRenderer Fin10;
  
  ModelRenderer Fin9;
  
  ModelRenderer Fin8;
  
  ModelRenderer Fin7;
  
  ModelRenderer Fin6;
  
  ModelRenderer Fin5;
  
  ModelRenderer Fin3;
  
  ModelRenderer Fin2;
  
  ModelRenderer Tooth11;
  
  ModelRenderer Tooth10;
  
  ModelRenderer Tooth8;
  
  ModelRenderer Tooth7;
  
  ModelRenderer Tooth6;
  
  ModelRenderer Tooth5;
  
  ModelRenderer Tooth4;
  
  ModelRenderer Tooth3;
  
  ModelRenderer Tooth2;
  
  ModelRenderer CenterRightNose;
  
  ModelRenderer CenterLeftNose;
  
  ModelRenderer Tooth1;
  
  ModelRenderer BottomNose;
  
  ModelRenderer TopNose;
  
  ModelRenderer JawTop;
  
  ModelRenderer CenterMiddleNose;
  
  ModelRenderer RightEye;
  
  ModelRenderer LeftEye;
  
  ModelRenderer Tooth16;
  
  ModelRenderer Tooth15;
  
  ModelRenderer Tooth14;
  
  ModelRenderer Tooth13;
  
  ModelRenderer Tooth12;
  
  ModelRenderer Tooth9;
  
  ModelRenderer BottomJaw;
  
  ModelRenderer Hat1;
  
  ModelRenderer Hat2;
  
  public ModelLizard(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.BodyBack = new ModelRenderer(this, 92, 48);
    this.BodyBack.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 8);
    this.BodyBack.setRotationPoint(0.0F, 14.0F, 0.0F);
    this.BodyBack.setTextureSize(64, 32);
    this.BodyBack.mirror = true;
    setRotation(this.BodyBack, 0.0F, 0.0F, 0.0F);
    this.TopBackLeftLeg = new ModelRenderer(this, 54, 32);
    this.TopBackLeftLeg.addBox(0.0F, -2.0F, -2.0F, 8, 3, 3);
    this.TopBackLeftLeg.setRotationPoint(3.0F, 13.0F, 2.0F);
    this.TopBackLeftLeg.setTextureSize(64, 32);
    this.TopBackLeftLeg.mirror = true;
    setRotation(this.TopBackLeftLeg, 0.0F, 0.0F, 0.2617994F);
    this.TailTip = new ModelRenderer(this, 100, 118);
    this.TailTip.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
    this.TailTip.setRotationPoint(0.0F, 23.0F, 41.0F);
    this.TailTip.setTextureSize(64, 32);
    this.TailTip.mirror = true;
    setRotation(this.TailTip, 0.0F, 0.0F, 0.0F);
    this.BodyFront = new ModelRenderer(this, 92, 16);
    this.BodyFront.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
    this.BodyFront.setRotationPoint(0.0F, 14.0F, -8.0F);
    this.BodyFront.setTextureSize(64, 32);
    this.BodyFront.mirror = true;
    setRotation(this.BodyFront, 0.0F, 0.0F, 0.0F);
    this.TailBase1 = new ModelRenderer(this, 88, 64);
    this.TailBase1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 14);
    this.TailBase1.setRotationPoint(0.0F, 14.0F, 7.0F);
    this.TailBase1.setTextureSize(64, 32);
    this.TailBase1.mirror = true;
    setRotation(this.TailBase1, -0.2617994F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 95, 84);
    this.Tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 10);
    this.Tail2.setRotationPoint(0.0F, 17.0F, 19.0F);
    this.Tail2.setTextureSize(64, 32);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, -0.5235988F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 100, 98);
    this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
    this.Tail3.setRotationPoint(0.0F, 21.0F, 26.0F);
    this.Tail3.setTextureSize(64, 32);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, -0.2617994F, 0.0F, 0.0F);
    this.Tail4 = new ModelRenderer(this, 100, 108);
    this.Tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
    this.Tail4.setRotationPoint(0.0F, 23.0F, 33.0F);
    this.Tail4.setTextureSize(64, 32);
    this.Tail4.mirror = true;
    setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer(this, 100, 9);
    this.Neck.addBox(-3.0F, -2.0F, -2.0F, 6, 5, 2);
    this.Neck.setRotationPoint(0.0F, 12.0F, -16.0F);
    this.Neck.setTextureSize(64, 32);
    this.Neck.mirror = true;
    setRotation(this.Neck, 0.0F, 0.0F, 0.0F);
    this.TopFrontLeftLeg = new ModelRenderer(this, 26, 12);
    this.TopFrontLeftLeg.addBox(0.0F, -2.0F, -2.0F, 8, 3, 3);
    this.TopFrontLeftLeg.setRotationPoint(3.0F, 13.0F, -12.0F);
    this.TopFrontLeftLeg.setTextureSize(64, 32);
    this.TopFrontLeftLeg.mirror = true;
    setRotation(this.TopFrontLeftLeg, 0.0F, 0.0F, 0.2617994F);
    this.TopBackRightLeg = new ModelRenderer(this, 26, 32);
    this.TopBackRightLeg.addBox(-8.0F, -2.0F, -2.0F, 8, 3, 3);
    this.TopBackRightLeg.setRotationPoint(-3.0F, 13.0F, 2.0F);
    this.TopBackRightLeg.setTextureSize(64, 32);
    this.TopBackRightLeg.mirror = true;
    setRotation(this.TopBackRightLeg, 0.0F, 0.0F, -0.2617994F);
    this.BottomBackRightLeg = new ModelRenderer(this, 25, 26);
    this.BottomBackRightLeg.addBox(-12.0F, -8.0F, -2.0F, 9, 3, 3);
    this.BottomBackRightLeg.setRotationPoint(-3.0F, 13.0F, 2.0F);
    this.BottomBackRightLeg.setTextureSize(64, 32);
    this.BottomBackRightLeg.mirror = true;
    setRotation(this.BottomBackRightLeg, 0.0F, 0.0F, -1.308997F);
    this.TopFrontRightLeg = new ModelRenderer(this, 54, 12);
    this.TopFrontRightLeg.addBox(-8.0F, -2.0F, -2.0F, 8, 3, 3);
    this.TopFrontRightLeg.setRotationPoint(-3.0F, 13.0F, -12.0F);
    this.TopFrontRightLeg.setTextureSize(64, 32);
    this.TopFrontRightLeg.mirror = true;
    setRotation(this.TopFrontRightLeg, 0.0F, 0.0F, -0.2617994F);
    this.BottomBackLeftLeg = new ModelRenderer(this, 53, 26);
    this.BottomBackLeftLeg.addBox(3.0F, -8.0F, -2.0F, 9, 3, 3);
    this.BottomBackLeftLeg.setRotationPoint(3.0F, 13.0F, 2.0F);
    this.BottomBackLeftLeg.setTextureSize(64, 32);
    this.BottomBackLeftLeg.mirror = true;
    setRotation(this.BottomBackLeftLeg, 0.0F, 0.0F, 1.308997F);
    this.BottomFrontRightLeg = new ModelRenderer(this, 53, 18);
    this.BottomFrontRightLeg.addBox(-12.0F, -8.0F, -2.0F, 9, 3, 3);
    this.BottomFrontRightLeg.setRotationPoint(-3.0F, 13.0F, -12.0F);
    this.BottomFrontRightLeg.setTextureSize(64, 32);
    this.BottomFrontRightLeg.mirror = true;
    setRotation(this.BottomFrontRightLeg, 0.0F, 0.0F, -1.308997F);
    this.BottomFrontLeftLeg = new ModelRenderer(this, 25, 18);
    this.BottomFrontLeftLeg.addBox(3.0F, -8.0F, -2.0F, 9, 3, 3);
    this.BottomFrontLeftLeg.setRotationPoint(3.0F, 13.0F, -12.0F);
    this.BottomFrontLeftLeg.setTextureSize(64, 32);
    this.BottomFrontLeftLeg.mirror = true;
    setRotation(this.BottomFrontLeftLeg, 0.0F, 0.0F, 1.308997F);
    this.BodyCenter = new ModelRenderer(this, 92, 32);
    this.BodyCenter.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.BodyCenter.setRotationPoint(0.0F, 14.0F, -4.0F);
    this.BodyCenter.setTextureSize(64, 32);
    this.BodyCenter.mirror = true;
    setRotation(this.BodyCenter, 0.0F, 0.0F, 0.0F);
    this.Toe7 = new ModelRenderer(this, 104, 0);
    this.Toe7.addBox(10.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe7.setRotationPoint(3.0F, 13.0F, 2.0F);
    this.Toe7.setTextureSize(64, 32);
    this.Toe7.mirror = true;
    setRotation(this.Toe7, 0.0F, 0.0F, 0.0F);
    this.Toe6 = new ModelRenderer(this, 108, 0);
    this.Toe6.addBox(8.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe6.setRotationPoint(3.0F, 13.0F, 2.0F);
    this.Toe6.setTextureSize(64, 32);
    this.Toe6.mirror = true;
    setRotation(this.Toe6, 0.0F, 0.0F, 0.0F);
    this.BackLeftFoot = new ModelRenderer(this, 20, 0);
    this.BackLeftFoot.addBox(7.0F, 9.0F, -4.0F, 4, 2, 6);
    this.BackLeftFoot.setRotationPoint(3.0F, 13.0F, 2.0F);
    this.BackLeftFoot.setTextureSize(64, 32);
    this.BackLeftFoot.mirror = true;
    setRotation(this.BackLeftFoot, 0.0F, 0.0F, 0.0F);
    this.Toe4 = new ModelRenderer(this, 80, 0);
    this.Toe4.addBox(-11.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe4.setRotationPoint(-3.0F, 13.0F, 2.0F);
    this.Toe4.setTextureSize(64, 32);
    this.Toe4.mirror = true;
    setRotation(this.Toe4, 0.0F, 0.0F, 0.0F);
    this.Toe5 = new ModelRenderer(this, 84, 0);
    this.Toe5.addBox(-9.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe5.setRotationPoint(-3.0F, 13.0F, 2.0F);
    this.Toe5.setTextureSize(64, 32);
    this.Toe5.mirror = true;
    setRotation(this.Toe5, 0.0F, 0.0F, 0.0F);
    this.BackRightFoot = new ModelRenderer(this, 60, 0);
    this.BackRightFoot.addBox(-11.0F, 9.0F, -4.0F, 4, 2, 6);
    this.BackRightFoot.setRotationPoint(-3.0F, 13.0F, 2.0F);
    this.BackRightFoot.setTextureSize(64, 32);
    this.BackRightFoot.mirror = true;
    setRotation(this.BackRightFoot, 0.0F, 0.0F, 0.0F);
    this.Toe8 = new ModelRenderer(this, 100, 0);
    this.Toe8.addBox(10.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe8.setRotationPoint(3.0F, 13.0F, -12.0F);
    this.Toe8.setTextureSize(64, 32);
    this.Toe8.mirror = true;
    setRotation(this.Toe8, 0.0F, 0.0F, 0.0F);
    this.Toe1 = new ModelRenderer(this, 96, 0);
    this.Toe1.addBox(8.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe1.setRotationPoint(3.0F, 13.0F, -12.0F);
    this.Toe1.setTextureSize(64, 32);
    this.Toe1.mirror = true;
    setRotation(this.Toe1, 0.0F, 0.0F, 0.0F);
    this.FrontLeftFoot = new ModelRenderer(this, 40, 0);
    this.FrontLeftFoot.addBox(7.0F, 9.0F, -4.0F, 4, 2, 6);
    this.FrontLeftFoot.setRotationPoint(3.0F, 13.0F, -12.0F);
    this.FrontLeftFoot.setTextureSize(64, 32);
    this.FrontLeftFoot.mirror = true;
    setRotation(this.FrontLeftFoot, 0.0F, 0.0F, 0.0F);
    this.Toe3 = new ModelRenderer(this, 88, 0);
    this.Toe3.addBox(-11.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe3.setRotationPoint(-3.0F, 13.0F, -12.0F);
    this.Toe3.setTextureSize(64, 32);
    this.Toe3.mirror = true;
    setRotation(this.Toe3, 0.0F, 0.0F, 0.0F);
    this.Toe2 = new ModelRenderer(this, 92, 0);
    this.Toe2.addBox(-9.0F, 10.0F, -5.0F, 1, 1, 1);
    this.Toe2.setRotationPoint(-3.0F, 13.0F, -12.0F);
    this.Toe2.setTextureSize(64, 32);
    this.Toe2.mirror = true;
    setRotation(this.Toe2, 0.0F, 0.0F, 0.0F);
    this.FrontRightFoot = new ModelRenderer(this, 0, 0);
    this.FrontRightFoot.addBox(-11.0F, 9.0F, -4.0F, 4, 2, 6);
    this.FrontRightFoot.setRotationPoint(-3.0F, 13.0F, -12.0F);
    this.FrontRightFoot.setTextureSize(64, 32);
    this.FrontRightFoot.mirror = true;
    setRotation(this.FrontRightFoot, 0.0F, 0.0F, 0.0F);
    this.FinRidge7 = new ModelRenderer(this, 0, 99);
    this.FinRidge7.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge7.setRotationPoint(-1.0F, 10.0F, -4.5F);
    this.FinRidge7.setTextureSize(64, 32);
    this.FinRidge7.mirror = true;
    setRotation(this.FinRidge7, -0.9666439F, 0.0F, 0.0F);
    this.FinRidge6 = new ModelRenderer(this, 6, 98);
    this.FinRidge6.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge6.setRotationPoint(-1.0F, 10.0F, -4.0F);
    this.FinRidge6.setTextureSize(64, 32);
    this.FinRidge6.mirror = true;
    setRotation(this.FinRidge6, -0.5205006F, 0.0F, 0.0F);
    this.FinRidge5 = new ModelRenderer(this, 12, 99);
    this.FinRidge5.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge5.setRotationPoint(-1.0F, 10.0F, -4.0F);
    this.FinRidge5.setTextureSize(64, 32);
    this.FinRidge5.mirror = true;
    setRotation(this.FinRidge5, 0.0F, 0.0F, 0.0F);
    this.FinRidge4 = new ModelRenderer(this, 6, 114);
    this.FinRidge4.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge4.setRotationPoint(-1.0F, 10.0F, -3.5F);
    this.FinRidge4.setTextureSize(64, 32);
    this.FinRidge4.mirror = true;
    setRotation(this.FinRidge4, 0.9666439F, 0.0F, 0.0F);
    this.FinRidge3 = new ModelRenderer(this, 12, 115);
    this.FinRidge3.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge3.setRotationPoint(-1.0F, 10.0F, -4.0F);
    this.FinRidge3.setTextureSize(64, 32);
    this.FinRidge3.mirror = true;
    setRotation(this.FinRidge3, 0.5205006F, 0.0F, 0.0F);
    this.FinRidge2 = new ModelRenderer(this, 0, 84);
    this.FinRidge2.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge2.setRotationPoint(-1.0F, 10.0F, -4.5F);
    this.FinRidge2.setTextureSize(64, 32);
    this.FinRidge2.mirror = true;
    setRotation(this.FinRidge2, -1.375609F, 0.0F, 0.0F);
    this.FinRidge1 = new ModelRenderer(this, 0, 114);
    this.FinRidge1.addBox(0.0F, -13.0F, 0.0F, 2, 13, 1);
    this.FinRidge1.setRotationPoint(-1.0F, 10.0F, -3.5F);
    this.FinRidge1.setTextureSize(64, 32);
    this.FinRidge1.mirror = true;
    setRotation(this.FinRidge1, 1.412787F, 0.0F, 0.0F);
    this.Fin10 = new ModelRenderer(this, 0, 58);
    this.Fin10.addBox(0.0F, -13.0F, -2.0F, 0, 11, 6);
    this.Fin10.setRotationPoint(0.0F, 10.5F, -5.0F);
    this.Fin10.setTextureSize(64, 32);
    this.Fin10.mirror = true;
    setRotation(this.Fin10, 0.2094395F, 0.0F, 0.0F);
    this.Fin9 = new ModelRenderer(this, 7, 84);
    this.Fin9.addBox(0.0F, -11.0F, 0.0F, 0, 11, 3);
    this.Fin9.setRotationPoint(0.0F, 10.0F, -5.0F);
    this.Fin9.setTextureSize(64, 32);
    this.Fin9.mirror = true;
    setRotation(this.Fin9, 1.570796F, 0.0F, 0.0F);
    this.Fin8 = new ModelRenderer(this, 12, 34);
    this.Fin8.addBox(0.0F, -7.0F, -4.0F, 0, 7, 4);
    this.Fin8.setRotationPoint(0.0F, 10.0F, 1.0F);
    this.Fin8.setTextureSize(64, 32);
    this.Fin8.mirror = true;
    setRotation(this.Fin8, -1.570796F, 0.0F, 0.0F);
    this.Fin7 = new ModelRenderer(this, 12, 46);
    this.Fin7.addBox(0.0F, -8.0F, -4.0F, 0, 8, 4);
    this.Fin7.setRotationPoint(0.0F, 10.0F, 1.0F);
    this.Fin7.setTextureSize(64, 32);
    this.Fin7.mirror = true;
    setRotation(this.Fin7, -1.033256F, 0.0F, 0.0F);
    this.Fin6 = new ModelRenderer(this, 0, 31);
    this.Fin6.addBox(0.0F, -10.0F, -4.0F, 0, 10, 4);
    this.Fin6.setRotationPoint(0.0F, 10.0F, -1.0F);
    this.Fin6.setTextureSize(64, 32);
    this.Fin6.mirror = true;
    setRotation(this.Fin6, -0.7267386F, 0.0F, 0.0F);
    this.Fin5 = new ModelRenderer(this, 30, 59);
    this.Fin5.addBox(0.0F, -12.0F, -5.0F, 0, 11, 6);
    this.Fin5.setRotationPoint(0.0F, 10.0F, -2.0F);
    this.Fin5.setTextureSize(64, 32);
    this.Fin5.mirror = true;
    setRotation(this.Fin5, -0.3003206F, 0.0F, 0.0F);
    this.Fin3 = new ModelRenderer(this, 14, 60);
    this.Fin3.addBox(0.0F, -12.0F, -3.0F, 0, 12, 6);
    this.Fin3.setRotationPoint(0.0F, 10.0F, -4.0F);
    this.Fin3.setTextureSize(64, 32);
    this.Fin3.mirror = true;
    setRotation(this.Fin3, 0.7073231F, 0.0F, 0.0F);
    this.Fin2 = new ModelRenderer(this, 14, 79);
    this.Fin2.addBox(0.0F, -12.0F, -4.0F, 0, 11, 6);
    this.Fin2.setRotationPoint(0.0F, 10.0F, -4.0F);
    this.Fin2.setTextureSize(64, 32);
    this.Fin2.mirror = true;
    setRotation(this.Fin2, 1.048747F, 0.0F, 0.0F);
    this.Tooth11 = new ModelRenderer(this, 24, 110);
    this.Tooth11.addBox(3.0F, 3.0F, -8.0F, 1, 1, 1);
    this.Tooth11.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth11.setTextureSize(64, 32);
    this.Tooth11.mirror = true;
    setRotation(this.Tooth11, 0.0F, 0.0F, 0.0F);
    this.Tooth10 = new ModelRenderer(this, 24, 106);
    this.Tooth10.addBox(3.0F, 3.0F, -10.0F, 1, 1, 1);
    this.Tooth10.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth10.setTextureSize(64, 32);
    this.Tooth10.mirror = true;
    setRotation(this.Tooth10, 0.0F, 0.0F, 0.0F);
    this.Tooth8 = new ModelRenderer(this, 28, 95);
    this.Tooth8.addBox(3.0F, 3.0F, -14.0F, 1, 1, 1);
    this.Tooth8.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth8.setTextureSize(64, 32);
    this.Tooth8.mirror = true;
    setRotation(this.Tooth8, 0.0F, 0.0F, 0.0F);
    this.Tooth7 = new ModelRenderer(this, 70, 106);
    this.Tooth7.addBox(-4.0F, 3.0F, -10.0F, 1, 1, 1);
    this.Tooth7.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth7.setTextureSize(64, 32);
    this.Tooth7.mirror = true;
    setRotation(this.Tooth7, 0.0F, 0.0F, 0.0F);
    this.Tooth6 = new ModelRenderer(this, 70, 102);
    this.Tooth6.addBox(-4.0F, 3.0F, -12.0F, 1, 1, 1);
    this.Tooth6.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth6.setTextureSize(64, 32);
    this.Tooth6.mirror = true;
    setRotation(this.Tooth6, 0.0F, 0.0F, 0.0F);
    this.Tooth5 = new ModelRenderer(this, 66, 95);
    this.Tooth5.addBox(-4.0F, 3.0F, -14.0F, 1, 1, 1);
    this.Tooth5.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth5.setTextureSize(64, 32);
    this.Tooth5.mirror = true;
    setRotation(this.Tooth5, 0.0F, 0.0F, 0.0F);
    this.Tooth4 = new ModelRenderer(this, 60, 95);
    this.Tooth4.addBox(1.0F, 3.0F, -14.0F, 1, 1, 1);
    this.Tooth4.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth4.setTextureSize(64, 32);
    this.Tooth4.mirror = true;
    setRotation(this.Tooth4, 0.0F, 0.0F, 0.0F);
    this.Tooth3 = new ModelRenderer(this, 34, 95);
    this.Tooth3.addBox(-2.0F, 3.0F, -14.0F, 1, 1, 1);
    this.Tooth3.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth3.setTextureSize(64, 32);
    this.Tooth3.mirror = true;
    setRotation(this.Tooth3, 0.0F, 0.0F, 0.0F);
    this.Tooth2 = new ModelRenderer(this, 70, 110);
    this.Tooth2.addBox(-4.0F, 3.0F, -8.0F, 1, 1, 1);
    this.Tooth2.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth2.setTextureSize(64, 32);
    this.Tooth2.mirror = true;
    setRotation(this.Tooth2, 0.0F, 0.0F, 0.0F);
    this.CenterRightNose = new ModelRenderer(this, 40, 88);
    this.CenterRightNose.addBox(-4.0F, 0.0F, -14.0F, 1, 1, 1);
    this.CenterRightNose.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.CenterRightNose.setTextureSize(64, 32);
    this.CenterRightNose.mirror = true;
    setRotation(this.CenterRightNose, 0.0F, 0.0F, 0.0F);
    this.CenterLeftNose = new ModelRenderer(this, 54, 88);
    this.CenterLeftNose.addBox(3.0F, 0.0F, -14.0F, 1, 1, 1);
    this.CenterLeftNose.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.CenterLeftNose.setTextureSize(64, 32);
    this.CenterLeftNose.mirror = true;
    setRotation(this.CenterLeftNose, 0.0F, 0.0F, 0.0F);
    this.Tooth1 = new ModelRenderer(this, 24, 102);
    this.Tooth1.addBox(3.0F, 3.0F, -12.0F, 1, 1, 1);
    this.Tooth1.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Tooth1.setTextureSize(64, 32);
    this.Tooth1.mirror = true;
    setRotation(this.Tooth1, 0.0F, 0.0F, 0.0F);
    this.BottomNose = new ModelRenderer(this, 40, 90);
    this.BottomNose.addBox(-4.0F, 1.0F, -14.0F, 8, 2, 1);
    this.BottomNose.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.BottomNose.setTextureSize(64, 32);
    this.BottomNose.mirror = true;
    setRotation(this.BottomNose, 0.0F, 0.0F, 0.0F);
    this.TopNose = new ModelRenderer(this, 40, 84);
    this.TopNose.addBox(-4.0F, -3.0F, -14.0F, 8, 3, 1);
    this.TopNose.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.TopNose.setTextureSize(64, 32);
    this.TopNose.mirror = true;
    setRotation(this.TopNose, 0.0F, 0.0F, 0.0F);
    this.JawTop = new ModelRenderer(this, 28, 97);
    this.JawTop.addBox(-4.0F, -3.0F, -13.0F, 8, 6, 13);
    this.JawTop.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.JawTop.setTextureSize(64, 32);
    this.JawTop.mirror = true;
    setRotation(this.JawTop, 0.0F, 0.0F, 0.0F);
    this.CenterMiddleNose = new ModelRenderer(this, 46, 88);
    this.CenterMiddleNose.addBox(-1.0F, 0.0F, -14.0F, 2, 1, 1);
    this.CenterMiddleNose.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.CenterMiddleNose.setTextureSize(64, 32);
    this.CenterMiddleNose.mirror = true;
    setRotation(this.CenterMiddleNose, 0.0F, 0.0F, 0.0F);
    this.RightEye = new ModelRenderer(this, 116, 10);
    this.RightEye.addBox(-2.0F, -4.0F, -4.0F, 2, 2, 1);
    this.RightEye.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.RightEye.setTextureSize(64, 32);
    this.RightEye.mirror = true;
    setRotation(this.RightEye, 0.0F, 0.7853982F, 0.3490659F);
    this.LeftEye = new ModelRenderer(this, 94, 10);
    this.LeftEye.addBox(0.0F, -4.0F, -4.0F, 2, 2, 1);
    this.LeftEye.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.LeftEye.setTextureSize(64, 32);
    this.LeftEye.mirror = true;
    setRotation(this.LeftEye, 0.0F, -0.7853982F, -0.3490659F);
    this.Tooth16 = new ModelRenderer(this, 24, 97);
    this.Tooth16.addBox(3.0F, -1.0F, -10.0F, 1, 1, 1);
    this.Tooth16.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth16.setTextureSize(64, 32);
    this.Tooth16.mirror = true;
    setRotation(this.Tooth16, 0.5235988F, 0.0F, 0.0F);
    this.Tooth15 = new ModelRenderer(this, 70, 97);
    this.Tooth15.addBox(-4.0F, -1.0F, -10.0F, 1, 1, 1);
    this.Tooth15.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth15.setTextureSize(64, 32);
    this.Tooth15.mirror = true;
    setRotation(this.Tooth15, 0.5235988F, 0.0F, 0.0F);
    this.Tooth14 = new ModelRenderer(this, 42, 95);
    this.Tooth14.addBox(-2.0F, -1.0F, -10.0F, 1, 1, 1);
    this.Tooth14.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth14.setTextureSize(64, 32);
    this.Tooth14.mirror = true;
    setRotation(this.Tooth14, 0.5235988F, 0.0F, 0.0F);
    this.Tooth13 = new ModelRenderer(this, 52, 95);
    this.Tooth13.addBox(1.0F, -1.0F, -10.0F, 1, 1, 1);
    this.Tooth13.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth13.setTextureSize(64, 32);
    this.Tooth13.mirror = true;
    setRotation(this.Tooth13, 0.5235988F, 0.0F, 0.0F);
    this.Tooth12 = new ModelRenderer(this, 24, 114);
    this.Tooth12.addBox(3.0F, -1.0F, -7.0F, 1, 1, 1);
    this.Tooth12.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth12.setTextureSize(64, 32);
    this.Tooth12.mirror = true;
    setRotation(this.Tooth12, 0.5235988F, 0.0F, 0.0F);
    this.Tooth9 = new ModelRenderer(this, 70, 114);
    this.Tooth9.addBox(-4.0F, -1.0F, -7.0F, 1, 1, 1);
    this.Tooth9.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.Tooth9.setTextureSize(64, 32);
    this.Tooth9.mirror = true;
    setRotation(this.Tooth9, 0.5235988F, 0.0F, 0.0F);
    this.BottomJaw = new ModelRenderer(this, 31, 116);
    this.BottomJaw.addBox(-4.0F, 0.0F, -10.0F, 8, 2, 10);
    this.BottomJaw.setRotationPoint(0.0F, 14.0F, -19.0F);
    this.BottomJaw.setTextureSize(64, 32);
    this.BottomJaw.mirror = true;
    setRotation(this.BottomJaw, 0.5235988F, 0.0F, 0.0F);
    this.Hat1 = new ModelRenderer(this, 30, 40);
    this.Hat1.addBox(-2.0F, -4.0F, -6.0F, 4, 1, 6);
    this.Hat1.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Hat1.setTextureSize(128, 128);
    this.Hat1.mirror = true;
    setRotation(this.Hat1, 0.0F, 0.0F, 0.0F);
    this.Hat2 = new ModelRenderer(this, 30, 40);
    this.Hat2.addBox(-1.5F, -6.0F, -4.0F, 3, 2, 4);
    this.Hat2.setRotationPoint(0.0F, 12.0F, -18.0F);
    this.Hat2.setTextureSize(128, 128);
    this.Hat2.mirror = true;
    setRotation(this.Hat2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Lizard e = (Lizard)entity;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.TopFrontLeftLeg.rotateAngleY = newangle;
    this.BottomFrontLeftLeg.rotateAngleX = newangle;
    this.FrontLeftFoot.rotateAngleY = newangle;
    this.Toe8.rotateAngleY = newangle;
    this.Toe1.rotateAngleY = newangle;
    this.TopFrontRightLeg.rotateAngleY = newangle;
    this.BottomFrontRightLeg.rotateAngleX = -newangle;
    this.FrontRightFoot.rotateAngleY = newangle;
    this.Toe3.rotateAngleY = newangle;
    this.Toe2.rotateAngleY = newangle;
    this.TopBackLeftLeg.rotateAngleY = -newangle;
    this.BottomBackLeftLeg.rotateAngleX = -newangle;
    this.BackLeftFoot.rotateAngleY = -newangle;
    this.Toe7.rotateAngleY = -newangle;
    this.Toe6.rotateAngleY = -newangle;
    this.TopBackRightLeg.rotateAngleY = -newangle;
    this.BottomBackRightLeg.rotateAngleX = newangle;
    this.BackRightFoot.rotateAngleY = -newangle;
    this.Toe4.rotateAngleY = -newangle;
    this.Toe5.rotateAngleY = -newangle;
    if (e.getAttacking() != 0) {
      this.BottomJaw.rotateAngleX = 0.52F + MathHelper.cos(f2 * 0.45F) * 0.35F;
    } else {
      this.BottomJaw.rotateAngleX = 0.25F;
    } 
    this.Tooth9.rotateAngleX = this.BottomJaw.rotateAngleX;
    this.Tooth15.rotateAngleX = this.BottomJaw.rotateAngleX;
    this.Tooth14.rotateAngleX = this.BottomJaw.rotateAngleX;
    this.Tooth13.rotateAngleX = this.BottomJaw.rotateAngleX;
    this.Tooth16.rotateAngleX = this.BottomJaw.rotateAngleX;
    this.Tooth12.rotateAngleX = this.BottomJaw.rotateAngleX;
    newangle = MathHelper.cos(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.05F;
    if (e.getAttacking() != 0)
      newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed) * 3.1415927F * 0.35F; 
    this.TailBase1.rotateAngleY = newangle * 0.25F;
    this.TailBase1.rotationPointZ += (float)Math.cos(this.TailBase1.rotateAngleY) * 12.0F;
    this.TailBase1.rotationPointX += (float)Math.sin(this.TailBase1.rotateAngleY) * 12.0F;
    this.Tail2.rotateAngleY = newangle * 0.5F;
    this.Tail2.rotationPointZ += (float)Math.cos(this.Tail2.rotateAngleY) * 9.0F;
    this.Tail2.rotationPointX += (float)Math.sin(this.Tail2.rotateAngleY) * 9.0F;
    this.Tail3.rotateAngleY = newangle * 0.75F;
    this.Tail3.rotationPointZ += (float)Math.cos(this.Tail3.rotateAngleY) * 7.0F;
    this.Tail3.rotationPointX += (float)Math.sin(this.Tail3.rotateAngleY) * 7.0F;
    this.Tail4.rotateAngleY = newangle * 1.0F;
    this.Tail4.rotationPointZ += (float)Math.cos(this.Tail4.rotateAngleY) * 7.0F;
    this.Tail4.rotationPointX += (float)Math.sin(this.Tail4.rotateAngleY) * 7.0F;
    this.TailTip.rotateAngleY = newangle * 1.25F;
    this.Neck.rotateAngleY = (float)Math.toRadians(f3) * 0.25F;
    this.Neck.rotationPointZ -= (float)Math.cos(this.Neck.rotateAngleY) * 2.0F;
    this.Neck.rotationPointX -= (float)Math.sin(this.Neck.rotateAngleY) * 2.0F;
    this.JawTop.rotateAngleY = (float)Math.toRadians(f3) * 0.5F;
    this.TopNose.rotationPointZ = this.JawTop.rotationPointZ;
    this.TopNose.rotationPointX = this.JawTop.rotationPointX;
    this.TopNose.rotateAngleY = this.JawTop.rotateAngleY;
    this.BottomNose.rotationPointZ = this.JawTop.rotationPointZ;
    this.BottomNose.rotationPointX = this.JawTop.rotationPointX;
    this.BottomNose.rotateAngleY = this.JawTop.rotateAngleY;
    this.CenterRightNose.rotationPointZ = this.JawTop.rotationPointZ;
    this.CenterRightNose.rotationPointX = this.JawTop.rotationPointX;
    this.CenterRightNose.rotateAngleY = this.JawTop.rotateAngleY;
    this.CenterMiddleNose.rotationPointZ = this.JawTop.rotationPointZ;
    this.CenterMiddleNose.rotationPointX = this.JawTop.rotationPointX;
    this.CenterMiddleNose.rotateAngleY = this.JawTop.rotateAngleY;
    this.CenterLeftNose.rotationPointZ = this.JawTop.rotationPointZ;
    this.CenterLeftNose.rotationPointX = this.JawTop.rotationPointX;
    this.CenterLeftNose.rotateAngleY = this.JawTop.rotateAngleY;
    this.RightEye.rotationPointZ = this.JawTop.rotationPointZ;
    this.RightEye.rotationPointX = this.JawTop.rotationPointX;
    this.JawTop.rotateAngleY += 0.78F;
    this.LeftEye.rotationPointZ = this.JawTop.rotationPointZ;
    this.LeftEye.rotationPointX = this.JawTop.rotationPointX;
    this.JawTop.rotateAngleY -= 0.78F;
    this.Tooth11.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth11.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth11.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth10.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth10.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth10.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth1.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth1.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth1.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth8.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth8.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth8.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth4.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth4.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth4.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth3.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth3.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth3.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth5.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth5.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth5.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth6.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth6.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth6.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth7.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth7.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth7.rotateAngleY = this.JawTop.rotateAngleY;
    this.Tooth2.rotationPointZ = this.JawTop.rotationPointZ;
    this.Tooth2.rotationPointX = this.JawTop.rotationPointX;
    this.Tooth2.rotateAngleY = this.JawTop.rotateAngleY;
    this.Hat1.rotationPointZ = this.JawTop.rotationPointZ;
    this.Hat1.rotationPointX = this.JawTop.rotationPointX;
    this.Hat1.rotateAngleY = this.JawTop.rotateAngleY;
    this.Hat2.rotationPointZ = this.JawTop.rotationPointZ;
    this.Hat2.rotationPointX = this.JawTop.rotationPointX;
    this.Hat2.rotateAngleY = this.JawTop.rotateAngleY;
    this.Neck.rotationPointZ -= (float)Math.cos(this.Neck.rotateAngleY) * 3.0F;
    this.Neck.rotationPointX -= (float)Math.sin(this.Neck.rotateAngleY) * 3.0F;
    this.BottomJaw.rotateAngleY = (float)Math.toRadians(f3) * 0.5F;
    this.Tooth9.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth9.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth9.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.Tooth16.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth16.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth16.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.Tooth15.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth15.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth15.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.Tooth14.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth14.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth14.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.Tooth13.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth13.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth13.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.Tooth12.rotationPointZ = this.BottomJaw.rotationPointZ;
    this.Tooth12.rotationPointX = this.BottomJaw.rotationPointX;
    this.Tooth12.rotateAngleY = this.BottomJaw.rotateAngleY;
    this.BodyBack.render(f5);
    this.TopBackLeftLeg.render(f5);
    this.TailTip.render(f5);
    this.BodyFront.render(f5);
    this.TailBase1.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.Tail4.render(f5);
    this.Neck.render(f5);
    this.TopFrontLeftLeg.render(f5);
    this.TopBackRightLeg.render(f5);
    this.BottomBackRightLeg.render(f5);
    this.TopFrontRightLeg.render(f5);
    this.BottomBackLeftLeg.render(f5);
    this.BottomFrontRightLeg.render(f5);
    this.BottomFrontLeftLeg.render(f5);
    this.BodyCenter.render(f5);
    this.Toe7.render(f5);
    this.Toe6.render(f5);
    this.BackLeftFoot.render(f5);
    this.Toe4.render(f5);
    this.Toe5.render(f5);
    this.BackRightFoot.render(f5);
    this.Toe8.render(f5);
    this.Toe1.render(f5);
    this.FrontLeftFoot.render(f5);
    this.Toe3.render(f5);
    this.Toe2.render(f5);
    this.FrontRightFoot.render(f5);
    this.FinRidge7.render(f5);
    this.FinRidge6.render(f5);
    this.FinRidge5.render(f5);
    this.FinRidge4.render(f5);
    this.FinRidge3.render(f5);
    this.FinRidge2.render(f5);
    this.FinRidge1.render(f5);
    this.Tooth11.render(f5);
    this.Tooth10.render(f5);
    this.Tooth8.render(f5);
    this.Tooth7.render(f5);
    this.Tooth6.render(f5);
    this.Tooth5.render(f5);
    this.Tooth4.render(f5);
    this.Tooth3.render(f5);
    this.Tooth2.render(f5);
    this.CenterRightNose.render(f5);
    this.CenterLeftNose.render(f5);
    this.Tooth1.render(f5);
    this.BottomNose.render(f5);
    this.TopNose.render(f5);
    this.JawTop.render(f5);
    this.CenterMiddleNose.render(f5);
    this.RightEye.render(f5);
    this.LeftEye.render(f5);
    this.Tooth16.render(f5);
    this.Tooth15.render(f5);
    this.Tooth14.render(f5);
    this.Tooth13.render(f5);
    this.Tooth12.render(f5);
    this.Tooth9.render(f5);
    this.BottomJaw.render(f5);
    if (e instanceof EntityCannonFodder && 
      e.get_is_activated() != 0) {
      this.Hat1.render(f5);
      if (e.get_is_activated() > 1)
        this.Hat2.render(f5); 
    } 
    this.Fin10.render(f5);
    this.Fin9.render(f5);
    this.Fin8.render(f5);
    this.Fin7.render(f5);
    this.Fin6.render(f5);
    this.Fin5.render(f5);
    this.Fin3.render(f5);
    this.Fin2.render(f5);
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
