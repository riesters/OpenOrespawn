package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGodzilla extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer LToe1;
  
  ModelRenderer LToe3;
  
  ModelRenderer LToe2;
  
  ModelRenderer LToe9;
  
  ModelRenderer LToe8;
  
  ModelRenderer LToe7;
  
  ModelRenderer LToe6;
  
  ModelRenderer LToe5;
  
  ModelRenderer LToe4;
  
  ModelRenderer RToe9;
  
  ModelRenderer RToe6;
  
  ModelRenderer RToe5;
  
  ModelRenderer RToe2;
  
  ModelRenderer RToe1;
  
  ModelRenderer RToe4;
  
  ModelRenderer RToe7;
  
  ModelRenderer RToe8;
  
  ModelRenderer RToe3;
  
  ModelRenderer LThigh;
  
  ModelRenderer LLowerLeg;
  
  ModelRenderer LUpperLeg;
  
  ModelRenderer TailTip;
  
  ModelRenderer RLegLower;
  
  ModelRenderer RLegUpper;
  
  ModelRenderer RThigh;
  
  ModelRenderer LowerJaw;
  
  ModelRenderer TailBase;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tail3;
  
  ModelRenderer Tail4;
  
  ModelRenderer Tail5;
  
  ModelRenderer Tail6;
  
  ModelRenderer Tail7;
  
  ModelRenderer BodyBottom;
  
  ModelRenderer RLowerArm;
  
  ModelRenderer BodyCenter;
  
  ModelRenderer Neck;
  
  ModelRenderer TopJaw;
  
  ModelRenderer Head;
  
  ModelRenderer BodyTop;
  
  ModelRenderer RShoulder;
  
  ModelRenderer RThumbTip;
  
  ModelRenderer RUpperArm;
  
  ModelRenderer RHand;
  
  ModelRenderer RThumbBase;
  
  ModelRenderer R3rdFingerTip;
  
  ModelRenderer R3rdFingerBase;
  
  ModelRenderer RIndexTip;
  
  ModelRenderer RIndexBase;
  
  ModelRenderer LShoulder;
  
  ModelRenderer LUpperArm;
  
  ModelRenderer LLowerArm;
  
  ModelRenderer LIndexBase;
  
  ModelRenderer LIndexTip;
  
  ModelRenderer LHand;
  
  ModelRenderer LThumbBase;
  
  ModelRenderer LThumbTip;
  
  ModelRenderer L3rdFingerTip;
  
  ModelRenderer L3rdFingerBase;
  
  ModelRenderer Lspikes1;
  
  ModelRenderer Rspikes1;
  
  ModelRenderer Lspike2;
  
  ModelRenderer Rspike2;
  
  ModelRenderer Lspike3;
  
  ModelRenderer Rspike3;
  
  ModelRenderer Lspike4;
  
  ModelRenderer Rspike4;
  
  ModelRenderer Lspike5;
  
  ModelRenderer Rspike5;
  
  ModelRenderer Spike6;
  
  ModelRenderer Spikes7;
  
  public ModelGodzilla(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 1024;
    this.textureHeight = 1024;
    this.LToe1 = new ModelRenderer(this, 45, 1002);
    this.LToe1.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.LToe1.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe1.setTextureSize(1024, 1024);
    this.LToe1.mirror = true;
    setRotation(this.LToe1, 0.0F, 0.7853982F, 0.0F);
    this.LToe3 = new ModelRenderer(this, 0, 955);
    this.LToe3.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 30);
    this.LToe3.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe3.setTextureSize(1024, 1024);
    this.LToe3.mirror = true;
    setRotation(this.LToe3, 0.0F, 0.7853982F, 0.0F);
    this.LToe2 = new ModelRenderer(this, 0, 1002);
    this.LToe2.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.LToe2.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe2.setTextureSize(1024, 1024);
    this.LToe2.mirror = true;
    setRotation(this.LToe2, 0.0F, 0.7853982F, 0.0F);
    this.LToe9 = new ModelRenderer(this, 0, 955);
    this.LToe9.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 30);
    this.LToe9.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe9.setTextureSize(1024, 1024);
    this.LToe9.mirror = true;
    setRotation(this.LToe9, 0.0F, -0.7853982F, 0.0F);
    this.LToe8 = new ModelRenderer(this, 0, 1002);
    this.LToe8.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.LToe8.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe8.setTextureSize(1024, 1024);
    this.LToe8.mirror = true;
    setRotation(this.LToe8, 0.0F, -0.7853982F, 0.0F);
    this.LToe7 = new ModelRenderer(this, 45, 1002);
    this.LToe7.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.LToe7.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe7.setTextureSize(1024, 1024);
    this.LToe7.mirror = true;
    setRotation(this.LToe7, 0.0F, -0.7853982F, 0.0F);
    this.LToe6 = new ModelRenderer(this, 92, 955);
    this.LToe6.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 36);
    this.LToe6.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe6.setTextureSize(1024, 1024);
    this.LToe6.mirror = true;
    setRotation(this.LToe6, 0.0F, 0.0F, 0.0F);
    this.LToe5 = new ModelRenderer(this, 0, 1002);
    this.LToe5.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.LToe5.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe5.setTextureSize(1024, 1024);
    this.LToe5.mirror = true;
    setRotation(this.LToe5, 0.0F, 0.0F, 0.0F);
    this.LToe4 = new ModelRenderer(this, 45, 1002);
    this.LToe4.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.LToe4.setRotationPoint(54.0F, 16.0F, 6.0F);
    this.LToe4.setTextureSize(1024, 1024);
    this.LToe4.mirror = true;
    setRotation(this.LToe4, 0.0F, 0.0F, 0.0F);
    this.RToe9 = new ModelRenderer(this, 0, 955);
    this.RToe9.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 30);
    this.RToe9.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe9.setTextureSize(1024, 1024);
    this.RToe9.mirror = true;
    setRotation(this.RToe9, 0.0F, 0.7853982F, 0.0F);
    this.RToe6 = new ModelRenderer(this, 92, 955);
    this.RToe6.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 36);
    this.RToe6.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe6.setTextureSize(1024, 1024);
    this.RToe6.mirror = true;
    setRotation(this.RToe6, 0.0F, 0.0F, 0.0F);
    this.RToe5 = new ModelRenderer(this, 0, 1002);
    this.RToe5.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.RToe5.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe5.setTextureSize(1024, 1024);
    this.RToe5.mirror = true;
    setRotation(this.RToe5, 0.0F, 0.0F, 0.0F);
    this.RToe2 = new ModelRenderer(this, 0, 1002);
    this.RToe2.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.RToe2.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe2.setTextureSize(1024, 1024);
    this.RToe2.mirror = true;
    setRotation(this.RToe2, 0.0F, -0.7853982F, 0.0F);
    this.RToe1 = new ModelRenderer(this, 45, 1002);
    this.RToe1.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.RToe1.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe1.setTextureSize(1024, 1024);
    this.RToe1.mirror = true;
    setRotation(this.RToe1, 0.0F, -0.7853982F, 0.0F);
    this.RToe4 = new ModelRenderer(this, 45, 1002);
    this.RToe4.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.RToe4.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe4.setTextureSize(1024, 1024);
    this.RToe4.mirror = true;
    setRotation(this.RToe4, 0.0F, 0.0F, 0.0F);
    this.RToe7 = new ModelRenderer(this, 45, 1002);
    this.RToe7.addBox(-5.0F, -2.0F, -40.0F, 10, 10, 6);
    this.RToe7.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe7.setTextureSize(1024, 1024);
    this.RToe7.mirror = true;
    setRotation(this.RToe7, 0.0F, 0.7853982F, 0.0F);
    this.RToe8 = new ModelRenderer(this, 0, 1002);
    this.RToe8.addBox(-7.0F, -6.0F, -34.0F, 14, 14, 8);
    this.RToe8.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe8.setTextureSize(1024, 1024);
    this.RToe8.mirror = true;
    setRotation(this.RToe8, 0.0F, 0.7853982F, 0.0F);
    this.RToe3 = new ModelRenderer(this, 0, 955);
    this.RToe3.addBox(-8.0F, -8.0F, -26.0F, 16, 16, 30);
    this.RToe3.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RToe3.setTextureSize(1024, 1024);
    this.RToe3.mirror = true;
    setRotation(this.RToe3, 0.0F, -0.7853982F, 0.0F);
    this.LThigh = new ModelRenderer(this, 192, 350);
    this.LThigh.addBox(0.0F, -14.0F, -21.0F, 28, 28, 42);
    this.LThigh.setRotationPoint(40.0F, -91.0F, 2.0F);
    this.LThigh.setTextureSize(1024, 1024);
    this.LThigh.mirror = true;
    setRotation(this.LThigh, -0.5585054F, 0.0F, 0.0F);
    this.LLowerLeg = new ModelRenderer(this, 202, 556);
    this.LLowerLeg.addBox(-15.0F, -62.0F, -15.0F, 30, 62, 30);
    this.LLowerLeg.setRotationPoint(54.0F, 14.0F, 6.0F);
    this.LLowerLeg.setTextureSize(1024, 1024);
    this.LLowerLeg.mirror = true;
    setRotation(this.LLowerLeg, 0.1745329F, -0.1308997F, 0.0F);
    this.LUpperLeg = new ModelRenderer(this, 152, 420);
    this.LUpperLeg.addBox(-16.0F, -52.0F, -16.0F, 32, 52, 32);
    this.LUpperLeg.setRotationPoint(56.0F, -36.0F, -5.0F);
    this.LUpperLeg.setTextureSize(1024, 1024);
    this.LUpperLeg.mirror = true;
    setRotation(this.LUpperLeg, -0.1745329F, -0.3926991F, -0.0872665F);
    this.TailTip = new ModelRenderer(this, 0, 694);
    this.TailTip.addBox(-6.0F, 0.0F, -5.0F, 12, 21, 10);
    this.TailTip.setRotationPoint(0.0F, 18.0F, 203.0F);
    this.TailTip.setTextureSize(1024, 1024);
    this.TailTip.mirror = true;
    setRotation(this.TailTip, 1.53589F, 0.0F, 0.0F);
    this.RLegLower = new ModelRenderer(this, 200, 646);
    this.RLegLower.addBox(-15.0F, -62.0F, -15.0F, 30, 62, 30);
    this.RLegLower.setRotationPoint(-54.0F, 16.0F, 6.0F);
    this.RLegLower.setTextureSize(1024, 1024);
    this.RLegLower.mirror = true;
    setRotation(this.RLegLower, 0.1745329F, 0.1308997F, 0.0F);
    this.RLegUpper = new ModelRenderer(this, 152, 420);
    this.RLegUpper.addBox(-16.0F, -52.0F, -16.0F, 32, 52, 32);
    this.RLegUpper.setRotationPoint(-56.0F, -36.0F, -5.0F);
    this.RLegUpper.setTextureSize(1024, 1024);
    this.RLegUpper.mirror = true;
    setRotation(this.RLegUpper, -0.1745329F, 0.3926991F, 0.0872665F);
    this.RThigh = new ModelRenderer(this, 192, 350);
    this.RThigh.addBox(-28.0F, -14.0F, -21.0F, 28, 28, 42);
    this.RThigh.setRotationPoint(-40.0F, -91.0F, 2.0F);
    this.RThigh.setTextureSize(1024, 1024);
    this.RThigh.mirror = true;
    setRotation(this.RThigh, -0.5585054F, 0.0F, 0.0F);
    this.LowerJaw = new ModelRenderer(this, 272, 0);
    this.LowerJaw.addBox(-13.0F, -5.0F, -50.0F, 26, 11, 50);
    this.LowerJaw.setRotationPoint(0.0F, -142.0F, -109.0F);
    this.LowerJaw.setTextureSize(1024, 1024);
    this.LowerJaw.mirror = true;
    setRotation(this.LowerJaw, 0.5235988F, 0.0F, 0.0F);
    this.TailBase = new ModelRenderer(this, 0, 240);
    this.TailBase.addBox(-32.0F, 0.0F, -29.0F, 64, 40, 58);
    this.TailBase.setRotationPoint(0.0F, -73.0F, 26.0F);
    this.TailBase.setTextureSize(1024, 1024);
    this.TailBase.mirror = true;
    setRotation(this.TailBase, 0.7853982F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 0, 338);
    this.Tail2.addBox(-25.0F, 0.0F, -23.0F, 50, 36, 46);
    this.Tail2.setRotationPoint(0.0F, -48.0F, 48.0F);
    this.Tail2.setTextureSize(1024, 1024);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 0.6981317F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 0, 420);
    this.Tail3.addBox(-20.0F, 0.0F, -18.0F, 40, 36, 36);
    this.Tail3.setRotationPoint(0.0F, -24.0F, 66.0F);
    this.Tail3.setTextureSize(1024, 1024);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, 0.8726646F, 0.0F, 0.0F);
    this.Tail4 = new ModelRenderer(this, 0, 492);
    this.Tail4.addBox(-16.0F, 0.0F, -14.0F, 32, 42, 28);
    this.Tail4.setRotationPoint(0.0F, -3.0F, 87.0F);
    this.Tail4.setTextureSize(1024, 1024);
    this.Tail4.mirror = true;
    setRotation(this.Tail4, 1.134464F, 0.0F, 0.0F);
    this.Tail5 = new ModelRenderer(this, 0, 556);
    this.Tail5.addBox(-13.0F, 0.0F, -11.0F, 26, 42, 22);
    this.Tail5.setRotationPoint(0.0F, 12.0F, 116.0F);
    this.Tail5.setTextureSize(1024, 1024);
    this.Tail5.mirror = true;
    setRotation(this.Tail5, 1.53589F, 0.0F, 0.0F);
    this.Tail6 = new ModelRenderer(this, 0, 614);
    this.Tail6.addBox(-10.0F, 0.0F, -9.0F, 20, 32, 18);
    this.Tail6.setRotationPoint(0.0F, 14.0F, 154.0F);
    this.Tail6.setTextureSize(1024, 1024);
    this.Tail6.mirror = true;
    setRotation(this.Tail6, 1.53589F, 0.0F, 0.0F);
    this.Tail7 = new ModelRenderer(this, 0, 658);
    this.Tail7.addBox(-8.0F, 0.0F, -7.0F, 16, 22, 14);
    this.Tail7.setRotationPoint(0.0F, 16.0F, 185.0F);
    this.Tail7.setTextureSize(1024, 1024);
    this.Tail7.mirror = true;
    setRotation(this.Tail7, 1.53589F, 0.0F, 0.0F);
    this.BodyBottom = new ModelRenderer(this, 0, 104);
    this.BodyBottom.addBox(-40.0F, 0.0F, -36.0F, 80, 64, 72);
    this.BodyBottom.setRotationPoint(0.0F, -112.0F, -20.0F);
    this.BodyBottom.setTextureSize(1024, 1024);
    this.BodyBottom.mirror = true;
    setRotation(this.BodyBottom, 0.8726646F, 0.0F, 0.0F);
    this.RLowerArm = new ModelRenderer(this, 245, 240);
    this.RLowerArm.addBox(-48.0F, -11.0F, -11.0F, 48, 22, 22);
    this.RLowerArm.setRotationPoint(-80.0F, -115.0F, -61.0F);
    this.RLowerArm.setTextureSize(1024, 1024);
    this.RLowerArm.mirror = true;
    setRotation(this.RLowerArm, 0.0F, -0.7853982F, -0.2617994F);
    this.BodyCenter = new ModelRenderer(this, 0, 0);
    this.BodyCenter.addBox(-36.0F, -32.0F, -32.0F, 72, 40, 64);
    this.BodyCenter.setRotationPoint(0.0F, -112.0F, -20.0F);
    this.BodyCenter.setTextureSize(1024, 1024);
    this.BodyCenter.mirror = true;
    setRotation(this.BodyCenter, 1.134464F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer(this, 0, 720);
    this.Neck.addBox(-23.0F, -23.0F, -32.0F, 46, 46, 32);
    this.Neck.setRotationPoint(0.0F, -144.0F, -71.0F);
    this.Neck.setTextureSize(1024, 1024);
    this.Neck.mirror = true;
    setRotation(this.Neck, -0.0698132F, 0.0F, 0.0F);
    this.TopJaw = new ModelRenderer(this, 0, 892);
    this.TopJaw.addBox(-14.0F, -8.0F, -73.0F, 28, 26, 33);
    this.TopJaw.setRotationPoint(0.0F, -156.0F, -98.0F);
    this.TopJaw.setTextureSize(1024, 1024);
    this.TopJaw.mirror = true;
    setRotation(this.TopJaw, 0.0872665F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 0, 808);
    this.Head.addBox(-17.0F, -18.0F, -40.0F, 34, 36, 40);
    this.Head.setRotationPoint(0.0F, -156.0F, -98.0F);
    this.Head.setTextureSize(1024, 1024);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0872665F, 0.0F, 0.0F);
    this.BodyTop = new ModelRenderer(this, 0, 0);
    this.BodyTop.addBox(-36.0F, -32.0F, -32.0F, 72, 40, 64);
    this.BodyTop.setRotationPoint(0.0F, -126.0F, -50.0F);
    this.BodyTop.setTextureSize(1024, 1024);
    this.BodyTop.mirror = true;
    setRotation(this.BodyTop, 1.308997F, 0.0F, 0.0F);
    this.RShoulder = new ModelRenderer(this, 304, 96);
    this.RShoulder.addBox(-16.0F, -32.0F, -32.0F, 16, 42, 46);
    this.RShoulder.setRotationPoint(-36.0F, -130.0F, -42.0F);
    this.RShoulder.setTextureSize(1024, 1024);
    this.RShoulder.mirror = true;
    setRotation(this.RShoulder, 1.308997F, 0.0F, 0.0F);
    this.RThumbTip = new ModelRenderer(this, 422, 18);
    this.RThumbTip.addBox(5.0F, 1.0F, -43.0F, 8, 8, 12);
    this.RThumbTip.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.RThumbTip.setTextureSize(1024, 1024);
    this.RThumbTip.mirror = true;
    setRotation(this.RThumbTip, 0.0F, 0.0F, 0.0F);
    this.RUpperArm = new ModelRenderer(this, 304, 184);
    this.RUpperArm.addBox(-54.0F, -13.0F, -13.0F, 54, 26, 26);
    this.RUpperArm.setRotationPoint(-38.0F, -130.0F, -52.0F);
    this.RUpperArm.setTextureSize(1024, 1024);
    this.RUpperArm.mirror = true;
    setRotation(this.RUpperArm, 0.0F, -0.2617994F, -0.3490659F);
    this.RHand = new ModelRenderer(this, 245, 292);
    this.RHand.addBox(-13.0F, -13.0F, -13.0F, 26, 26, 26);
    this.RHand.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.RHand.setTextureSize(1024, 1024);
    this.RHand.mirror = true;
    setRotation(this.RHand, -1.071467F, 2.007129F, 0.1745329F);
    this.RThumbBase = new ModelRenderer(this, 424, 57);
    this.RThumbBase.addBox(2.0F, 1.0F, -32.0F, 8, 8, 20);
    this.RThumbBase.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.RThumbBase.setTextureSize(1024, 1024);
    this.RThumbBase.mirror = true;
    setRotation(this.RThumbBase, 0.0F, -0.1047198F, 0.0F);
    this.R3rdFingerTip = new ModelRenderer(this, 422, 18);
    this.R3rdFingerTip.addBox(-10.0F, 0.0F, -41.0F, 8, 8, 12);
    this.R3rdFingerTip.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.R3rdFingerTip.setTextureSize(1024, 1024);
    this.R3rdFingerTip.mirror = true;
    setRotation(this.R3rdFingerTip, 0.0F, 0.6806784F, 0.0F);
    this.R3rdFingerBase = new ModelRenderer(this, 424, 57);
    this.R3rdFingerBase.addBox(-11.0F, -3.0F, -30.0F, 8, 8, 20);
    this.R3rdFingerBase.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.R3rdFingerBase.setTextureSize(1024, 1024);
    this.R3rdFingerBase.mirror = true;
    setRotation(this.R3rdFingerBase, 0.122173F, 0.6457718F, 0.0F);
    this.RIndexTip = new ModelRenderer(this, 422, 18);
    this.RIndexTip.addBox(-4.0F, -12.0F, -43.0F, 8, 8, 12);
    this.RIndexTip.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.RIndexTip.setTextureSize(1024, 1024);
    this.RIndexTip.mirror = true;
    setRotation(this.RIndexTip, -0.2094395F, 0.1745329F, 0.0F);
    this.RIndexBase = new ModelRenderer(this, 424, 57);
    this.RIndexBase.addBox(-4.0F, -9.0F, -34.0F, 8, 8, 20);
    this.RIndexBase.setRotationPoint(-115.0F, -100.0F, -99.0F);
    this.RIndexBase.setTextureSize(1024, 1024);
    this.RIndexBase.mirror = true;
    setRotation(this.RIndexBase, -0.2792527F, 0.1570796F, 0.0F);
    this.LShoulder = new ModelRenderer(this, 304, 96);
    this.LShoulder.addBox(0.0F, -32.0F, -32.0F, 16, 42, 46);
    this.LShoulder.setRotationPoint(36.0F, -130.0F, -42.0F);
    this.LShoulder.setTextureSize(1024, 1024);
    this.LShoulder.mirror = true;
    setRotation(this.LShoulder, 1.308997F, 0.0F, 0.0F);
    this.LUpperArm = new ModelRenderer(this, 304, 184);
    this.LUpperArm.addBox(0.0F, -13.0F, -13.0F, 54, 26, 26);
    this.LUpperArm.setRotationPoint(38.0F, -130.0F, -52.0F);
    this.LUpperArm.setTextureSize(1024, 1024);
    this.LUpperArm.mirror = true;
    setRotation(this.LUpperArm, 0.0F, 0.296706F, 0.3490659F);
    this.LLowerArm = new ModelRenderer(this, 245, 240);
    this.LLowerArm.addBox(0.0F, -11.0F, -11.0F, 48, 22, 22);
    this.LLowerArm.setRotationPoint(80.0F, -115.0F, -61.0F);
    this.LLowerArm.setTextureSize(1024, 1024);
    this.LLowerArm.mirror = true;
    setRotation(this.LLowerArm, 0.0F, 0.7853982F, 0.2617994F);
    this.LIndexBase = new ModelRenderer(this, 424, 57);
    this.LIndexBase.addBox(-4.0F, -13.0F, -32.0F, 8, 8, 20);
    this.LIndexBase.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.LIndexBase.setTextureSize(1024, 1024);
    this.LIndexBase.mirror = true;
    setRotation(this.LIndexBase, -0.1570796F, -0.1396263F, 0.0F);
    this.LIndexTip = new ModelRenderer(this, 422, 18);
    this.LIndexTip.addBox(-1.0F, -18.0F, -41.0F, 8, 8, 12);
    this.LIndexTip.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.LIndexTip.setTextureSize(1024, 1024);
    this.LIndexTip.mirror = true;
    setRotation(this.LIndexTip, 0.0F, -0.0349066F, 0.0F);
    this.LHand = new ModelRenderer(this, 245, 292);
    this.LHand.addBox(-13.0F, -13.0F, -13.0F, 26, 26, 26);
    this.LHand.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.LHand.setTextureSize(1024, 1024);
    this.LHand.mirror = true;
    setRotation(this.LHand, 0.9599311F, 1.308997F, 0.1745329F);
    this.LThumbBase = new ModelRenderer(this, 424, 57);
    this.LThumbBase.addBox(-8.0F, -2.0F, -32.0F, 8, 8, 20);
    this.LThumbBase.setRotationPoint(115.0F, -100.0F, -98.0F);
    this.LThumbBase.setTextureSize(1024, 1024);
    this.LThumbBase.mirror = true;
    setRotation(this.LThumbBase, 0.1396263F, 0.2617994F, 0.0F);
    this.LThumbTip = new ModelRenderer(this, 422, 18);
    this.LThumbTip.addBox(-12.0F, 2.0F, -40.0F, 8, 8, 12);
    this.LThumbTip.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.LThumbTip.setTextureSize(1024, 1024);
    this.LThumbTip.mirror = true;
    setRotation(this.LThumbTip, 0.0F, 0.1396263F, 0.0F);
    this.L3rdFingerTip = new ModelRenderer(this, 422, 18);
    this.L3rdFingerTip.addBox(9.0F, 2.0F, -42.0F, 8, 8, 12);
    this.L3rdFingerTip.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.L3rdFingerTip.setTextureSize(1024, 1024);
    this.L3rdFingerTip.mirror = true;
    setRotation(this.L3rdFingerTip, 0.0349066F, -0.3316126F, 0.0F);
    this.L3rdFingerBase = new ModelRenderer(this, 424, 57);
    this.L3rdFingerBase.addBox(4.0F, -5.0F, -33.0F, 8, 8, 20);
    this.L3rdFingerBase.setRotationPoint(115.0F, -100.0F, -99.0F);
    this.L3rdFingerBase.setTextureSize(1024, 1024);
    this.L3rdFingerBase.mirror = true;
    setRotation(this.L3rdFingerBase, 0.2617994F, -0.4712389F, 0.0F);
    this.Lspikes1 = new ModelRenderer(this, 500, 0);
    this.Lspikes1.addBox(0.0F, -10.0F, 0.0F, 0, 10, 11);
    this.Lspikes1.setRotationPoint(5.0F, -168.0F, -86.0F);
    this.Lspikes1.setTextureSize(1024, 1024);
    this.Lspikes1.mirror = true;
    setRotation(this.Lspikes1, -0.0872665F, 0.0F, -0.0174533F);
    this.Rspikes1 = new ModelRenderer(this, 500, 0);
    this.Rspikes1.addBox(0.0F, -10.0F, 0.0F, 0, 10, 11);
    this.Rspikes1.setRotationPoint(-5.0F, -168.0F, -86.0F);
    this.Rspikes1.setTextureSize(1024, 1024);
    this.Rspikes1.mirror = true;
    setRotation(this.Rspikes1, -0.0872665F, 0.0F, -0.0174533F);
    this.Lspike2 = new ModelRenderer(this, 500, 30);
    this.Lspike2.addBox(0.0F, -25.0F, 0.0F, 0, 25, 21);
    this.Lspike2.setRotationPoint(10.0F, -162.0F, -63.0F);
    this.Lspike2.setTextureSize(1024, 1024);
    this.Lspike2.mirror = true;
    setRotation(this.Lspike2, -0.2617994F, 0.0F, -0.0174533F);
    this.Rspike2 = new ModelRenderer(this, 500, 30);
    this.Rspike2.addBox(0.0F, -25.0F, 0.0F, 0, 25, 21);
    this.Rspike2.setRotationPoint(-10.0F, -162.0F, -63.0F);
    this.Rspike2.setTextureSize(1024, 1024);
    this.Rspike2.mirror = true;
    setRotation(this.Rspike2, -0.2617994F, 0.0F, -0.0174533F);
    this.Lspike3 = new ModelRenderer(this, 500, 80);
    this.Lspike3.addBox(0.0F, -45.0F, 0.0F, 0, 45, 34);
    this.Lspike3.setRotationPoint(14.0F, -153.0F, -32.0F);
    this.Lspike3.setTextureSize(1024, 1024);
    this.Lspike3.mirror = true;
    setRotation(this.Lspike3, -0.4363323F, 0.0F, -0.0174533F);
    this.Rspike3 = new ModelRenderer(this, 500, 80);
    this.Rspike3.addBox(0.0F, -45.0F, 0.0F, 0, 45, 34);
    this.Rspike3.setRotationPoint(-14.0F, -153.0F, -32.0F);
    this.Rspike3.setTextureSize(1024, 1024);
    this.Rspike3.mirror = true;
    setRotation(this.Rspike3, -0.4363323F, 0.0F, -0.0174533F);
    this.Lspike4 = new ModelRenderer(this, 500, 165);
    this.Lspike4.addBox(0.0F, -50.0F, 0.0F, 0, 50, 36);
    this.Lspike4.setRotationPoint(18.0F, -131.0F, 13.0F);
    this.Lspike4.setTextureSize(1024, 1024);
    this.Lspike4.mirror = true;
    setRotation(this.Lspike4, -0.715585F, 0.0F, -0.0174533F);
    this.Rspike4 = new ModelRenderer(this, 500, 165);
    this.Rspike4.addBox(0.0F, -50.0F, 0.0F, 0, 50, 36);
    this.Rspike4.setRotationPoint(-18.0F, -131.0F, 13.0F);
    this.Rspike4.setTextureSize(1024, 1024);
    this.Rspike4.mirror = true;
    setRotation(this.Rspike4, -0.715585F, 0.0F, -0.0174533F);
    this.Lspike5 = new ModelRenderer(this, 500, 255);
    this.Lspike5.addBox(12.0F, -67.0F, 5.0F, 0, 39, 27);
    this.Lspike5.setRotationPoint(0.0F, -73.0F, 26.0F);
    this.Lspike5.setTextureSize(1024, 1024);
    this.Lspike5.mirror = true;
    setRotation(this.Lspike5, -0.7853982F, 0.0F, -0.0174533F);
    this.Rspike5 = new ModelRenderer(this, 500, 255);
    this.Rspike5.addBox(-12.0F, -67.0F, 5.0F, 0, 39, 27);
    this.Rspike5.setRotationPoint(0.0F, -73.0F, 26.0F);
    this.Rspike5.setTextureSize(1024, 1024);
    this.Rspike5.mirror = true;
    setRotation(this.Rspike5, -0.7853982F, 0.0F, -0.0174533F);
    this.Spike6 = new ModelRenderer(this, 500, 325);
    this.Spike6.addBox(0.0F, -48.0F, 11.0F, 0, 25, 21);
    this.Spike6.setRotationPoint(0.0F, -48.0F, 48.0F);
    this.Spike6.setTextureSize(1024, 1024);
    this.Spike6.mirror = true;
    setRotation(this.Spike6, -0.8901179F, 0.0F, -0.0174533F);
    this.Spikes7 = new ModelRenderer(this, 500, 376);
    this.Spikes7.addBox(0.0F, -29.0F, 20.0F, 0, 10, 11);
    this.Spikes7.setRotationPoint(0.0F, -24.0F, 66.0F);
    this.Spikes7.setTextureSize(1024, 1024);
    this.Spikes7.mirror = true;
    setRotation(this.Spikes7, -0.7504916F, 0.0F, -0.0174533F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Godzilla e = (Godzilla)entity;
    RenderInfo r = null;
    float newangle = 0.0F;
    float newangle2 = 0.0F;
    float pscale = 1.0F;
    float pi4 = 0.7853982F;
    float clawZ = 6.0F;
    float clawY = 16.0F;
    float clawZamp = 35.0F * pscale;
    float clawYamp = 18.0F * pscale;
    float spikeamp = 1.0F;
    float spikefreq = 1.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderInfo();
    float t1 = 0.0F;
    float t2 = 0.0F;
    if (f1 > 0.001D) {
      newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed / pscale);
      newangle2 = MathHelper.cos(f2 * 0.75F * this.wingspeed / pscale + pi4);
      t1 = MathHelper.sin(f2 * 0.75F * this.wingspeed / pscale);
    } else {
      newangle = newangle2 = 0.0F;
      t1 = 0.0F;
      t2 = 0.0F;
    } 
    if (t1 > 0.0F) {
      t2 = t1 * clawYamp * f1;
      this.LToe1.rotationPointY = clawY - t2;
    } else {
      this.LToe1.rotationPointY = clawY;
    } 
    this.LToe1.rotationPointZ = clawZ + clawZamp * newangle * f1;
    this.LToe9.rotationPointZ = this.LToe1.rotationPointZ;
    this.LToe9.rotationPointY = this.LToe1.rotationPointY;
    this.LLowerLeg.rotationPointZ = this.LToe1.rotationPointZ;
    this.LLowerLeg.rotationPointY = this.LToe1.rotationPointY;
    this.LLowerLeg.rotateAngleX = 0.22F + newangle * 3.1415927F * 0.09F * f1;
    this.LUpperLeg.rotateAngleX = -0.17F + newangle2 * 3.1415927F * 0.15F * f1;
    this.LLowerLeg.rotationPointY -= (float)Math.cos(this.LLowerLeg.rotateAngleX) * 55.0F;
    this.LLowerLeg.rotationPointZ -= (float)Math.sin(this.LLowerLeg.rotateAngleX) * 55.0F;
    this.LThigh.rotateAngleX = -0.558F + newangle2 * 3.1415927F * 0.1F * f1;
    this.LThigh.rotationPointZ = 2.0F + clawZamp * newangle * f1 / 4.0F;
    t1 = 0.0F;
    t2 = 0.0F;
    if (f1 > 0.001D) {
      newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed / pscale + pi4 * 4.0F);
      newangle2 = MathHelper.cos(f2 * 0.75F * this.wingspeed / pscale + pi4 * 5.0F);
      t1 = MathHelper.sin(f2 * 0.75F * this.wingspeed / pscale + pi4 * 4.0F);
    } else {
      newangle = 0.0F;
      t1 = 0.0F;
      t2 = 0.0F;
    } 
    if (t1 > 0.0F) {
      t2 = t1 * clawYamp * f1;
      this.RToe1.rotationPointY = clawY - t2;
    } else {
      this.RToe1.rotationPointY = clawY;
    } 
    this.RToe1.rotationPointZ = clawZ + clawZamp * newangle * f1;
    this.RToe9.rotationPointZ = this.RToe1.rotationPointZ;
    this.RToe9.rotationPointY = this.RToe1.rotationPointY;
    this.RLegLower.rotationPointZ = this.RToe1.rotationPointZ;
    this.RLegLower.rotationPointY = this.RToe1.rotationPointY;
    this.RLegLower.rotateAngleX = 0.22F + newangle * 3.1415927F * 0.09F * f1;
    this.RLegUpper.rotateAngleX = -0.17F + newangle2 * 3.1415927F * 0.15F * f1;
    this.RLegLower.rotationPointY -= (float)Math.cos(this.RLegLower.rotateAngleX) * 55.0F;
    this.RLegLower.rotationPointZ -= (float)Math.sin(this.RLegLower.rotateAngleX) * 55.0F;
    this.RThigh.rotateAngleX = -0.558F + newangle2 * 3.1415927F * 0.1F * f1;
    this.RThigh.rotationPointZ = 2.0F + clawZamp * newangle * f1 / 4.0F;
    this.LToe1.rotateAngleX = 0.0F;
    this.RToe1.rotateAngleX = 0.0F;
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * this.wingspeed * 1.75F) * 3.1415927F * 0.2F;
    } else {
      newangle = MathHelper.cos(f2 * this.wingspeed * 0.75F) * 3.1415927F * 0.05F;
    } 
    doTail(newangle);
    newangle = (float)Math.toRadians(f3) * 0.55F;
    this.Head.rotateAngleY = newangle;
    this.TopJaw.rotateAngleY = newangle;
    this.LowerJaw.rotateAngleY = newangle;
    this.Head.rotationPointZ -= (float)Math.cos(this.Head.rotateAngleY) * 11.0F;
    this.Head.rotationPointX -= (float)Math.sin(this.Head.rotateAngleY) * 11.0F;
    this.Head.rotateAngleX = (float)Math.toRadians(f4);
    newangle = MathHelper.cos(f2 * this.wingspeed * 1.5F) * 3.1415927F * 0.12F;
    float newrf1 = f2 * 1.5F * this.wingspeed % 6.2831855F;
    newrf1 = Math.abs(newrf1);
    if (newrf1 < r.rf2) {
      r.ri2 = 0;
      if (e.getAttacking() == 0) {
        if (e.worldObj.rand.nextInt(20) == 1)
          r.ri2 |= 0x1; 
      } else if (e.worldObj.rand.nextInt(2) == 1) {
        r.ri2 |= 0x1;
      } 
    } 
    r.rf2 = newrf1;
    if ((r.ri2 & 0x1) == 0)
      newangle = 0.0F; 
    this.LowerJaw.rotateAngleX = 0.52F + newangle + this.TopJaw.rotateAngleX;
    newangle = newangle2 = MathHelper.sin(f2 * this.wingspeed * 1.75F) * 3.1415927F * 0.16F;
    newrf1 = f2 * 1.75F * this.wingspeed % 6.2831855F;
    newrf1 = Math.abs(newrf1);
    if (newrf1 < r.rf1) {
      r.ri1 = 0;
      if (e.getAttacking() == 0) {
        if (e.worldObj.rand.nextInt(20) == 1)
          r.ri1 |= 0x1; 
        if (e.worldObj.rand.nextInt(20) == 1)
          r.ri1 |= 0x2; 
      } else {
        if (e.worldObj.rand.nextInt(2) == 1)
          r.ri1 |= 0x1; 
        if (e.worldObj.rand.nextInt(2) == 1)
          r.ri1 |= 0x2; 
      } 
    } 
    r.rf1 = newrf1;
    if ((r.ri1 & 0x1) == 0)
      newangle = 0.0F; 
    if ((r.ri1 & 0x2) == 0)
      newangle2 = 0.0F; 
    this.LUpperArm.rotateAngleY = 0.65F + newangle;
    this.LLowerArm.rotateAngleY = 0.78F + newangle * 3.0F / 2.0F;
    this.LUpperArm.rotationPointZ -= (float)Math.sin(this.LUpperArm.rotateAngleY) * 50.0F;
    this.LUpperArm.rotationPointX += (float)Math.cos(this.LUpperArm.rotateAngleY) * 50.0F;
    this.LLowerArm.rotationPointY = this.LUpperArm.rotationPointY - (float)Math.sin(this.LUpperArm.rotateAngleY) * 10.0F + 18.0F;
    this.LLowerArm.rotationPointZ -= (float)Math.sin(this.LLowerArm.rotateAngleY) * 45.0F;
    this.LLowerArm.rotationPointX += (float)Math.cos(this.LLowerArm.rotateAngleY) * 45.0F;
    this.LHand.rotationPointY = this.LLowerArm.rotationPointY - (float)Math.sin(this.LLowerArm.rotateAngleY) * 10.0F + 15.0F;
    this.L3rdFingerBase.rotationPointZ = this.LHand.rotationPointZ;
    this.L3rdFingerTip.rotationPointZ = this.LHand.rotationPointZ;
    this.L3rdFingerBase.rotationPointY = this.LHand.rotationPointY;
    this.L3rdFingerTip.rotationPointY = this.LHand.rotationPointY;
    this.L3rdFingerBase.rotationPointX = this.LHand.rotationPointX;
    this.L3rdFingerTip.rotationPointX = this.LHand.rotationPointX;
    this.LHand.rotateAngleY = 1.308F + newangle * 2.0F;
    this.LIndexBase.rotateAngleY = -0.139F + newangle * 2.0F;
    this.LIndexTip.rotateAngleY = -0.034F + newangle * 2.0F;
    this.LThumbBase.rotateAngleY = 0.261F + newangle;
    this.LThumbTip.rotateAngleY = 0.139F + newangle;
    this.L3rdFingerBase.rotateAngleY = -0.471F + newangle * 3.0F;
    this.L3rdFingerTip.rotateAngleY = -0.331F + newangle * 3.0F;
    this.RUpperArm.rotateAngleY = -0.65F - newangle2;
    this.RLowerArm.rotateAngleY = -0.78F - newangle2 * 3.0F / 2.0F;
    this.RUpperArm.rotationPointZ += (float)Math.sin(this.RUpperArm.rotateAngleY) * 50.0F;
    this.RUpperArm.rotationPointX -= (float)Math.cos(this.RUpperArm.rotateAngleY) * 50.0F;
    this.RLowerArm.rotationPointY = this.RUpperArm.rotationPointY + (float)Math.sin(this.RUpperArm.rotateAngleY) * 10.0F + 18.0F;
    this.RLowerArm.rotationPointZ += (float)Math.sin(this.RLowerArm.rotateAngleY) * 45.0F;
    this.RLowerArm.rotationPointX -= (float)Math.cos(this.RLowerArm.rotateAngleY) * 45.0F;
    this.RHand.rotationPointY = this.RLowerArm.rotationPointY + (float)Math.sin(this.RLowerArm.rotateAngleY) * 10.0F + 15.0F;
    this.R3rdFingerBase.rotationPointZ = this.RHand.rotationPointZ;
    this.R3rdFingerTip.rotationPointZ = this.RHand.rotationPointZ;
    this.R3rdFingerBase.rotationPointY = this.RHand.rotationPointY;
    this.R3rdFingerTip.rotationPointY = this.RHand.rotationPointY;
    this.R3rdFingerBase.rotationPointX = this.RHand.rotationPointX;
    this.R3rdFingerTip.rotationPointX = this.RHand.rotationPointX;
    this.RHand.rotateAngleY = -2.0F - newangle2 * 2.0F;
    this.RIndexBase.rotateAngleY = 0.157F - newangle2 * 2.0F;
    this.RIndexTip.rotateAngleY = 0.174F - newangle2 * 2.0F;
    this.RThumbBase.rotateAngleY = -0.104F - newangle2;
    this.RThumbTip.rotateAngleY = 0.001F - newangle2;
    this.R3rdFingerTip.rotateAngleY = 0.68F - newangle2 * 3.0F;
    this.R3rdFingerBase.rotateAngleY = 0.645F - newangle2 * 3.0F;
    e.setRenderInfo(r);
    this.LToe1.render(f5);
    this.LToe3.render(f5);
    this.LToe2.render(f5);
    this.LToe9.render(f5);
    this.LToe8.render(f5);
    this.LToe7.render(f5);
    this.LToe6.render(f5);
    this.LToe5.render(f5);
    this.LToe4.render(f5);
    this.RToe9.render(f5);
    this.RToe6.render(f5);
    this.RToe5.render(f5);
    this.RToe2.render(f5);
    this.RToe1.render(f5);
    this.RToe4.render(f5);
    this.RToe7.render(f5);
    this.RToe8.render(f5);
    this.RToe3.render(f5);
    this.LThigh.render(f5);
    this.LLowerLeg.render(f5);
    this.LUpperLeg.render(f5);
    this.TailTip.render(f5);
    this.RLegLower.render(f5);
    this.RLegUpper.render(f5);
    this.RThigh.render(f5);
    this.LowerJaw.render(f5);
    this.TailBase.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.Tail4.render(f5);
    this.Tail5.render(f5);
    this.Tail6.render(f5);
    this.Tail7.render(f5);
    this.BodyBottom.render(f5);
    this.RLowerArm.render(f5);
    this.BodyCenter.render(f5);
    this.Neck.render(f5);
    this.TopJaw.render(f5);
    this.Head.render(f5);
    this.BodyTop.render(f5);
    this.RShoulder.render(f5);
    this.RThumbTip.render(f5);
    this.RUpperArm.render(f5);
    this.RHand.render(f5);
    this.RThumbBase.render(f5);
    this.R3rdFingerTip.render(f5);
    this.R3rdFingerBase.render(f5);
    this.RIndexTip.render(f5);
    this.RIndexBase.render(f5);
    this.LShoulder.render(f5);
    this.LUpperArm.render(f5);
    this.LLowerArm.render(f5);
    this.LIndexBase.render(f5);
    this.LIndexTip.render(f5);
    this.LHand.render(f5);
    this.LThumbBase.render(f5);
    this.LThumbTip.render(f5);
    this.L3rdFingerTip.render(f5);
    this.L3rdFingerBase.render(f5);
    this.Lspikes1.render(f5);
    this.Rspikes1.render(f5);
    this.Lspike2.render(f5);
    this.Rspike2.render(f5);
    this.Lspike3.render(f5);
    this.Rspike3.render(f5);
    this.Lspike4.render(f5);
    this.Rspike4.render(f5);
    this.Lspike5.render(f5);
    this.Rspike5.render(f5);
    this.Spike6.render(f5);
    this.Spikes7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void doTail(float angle) {
    this.TailBase.rotateAngleY = angle * 0.25F;
    this.Rspike5.rotateAngleY = this.TailBase.rotateAngleY;
    this.Tail2.rotateAngleY = angle * 0.5F;
    this.TailBase.rotationPointZ += (float)Math.cos(this.TailBase.rotateAngleY) * 25.0F;
    this.TailBase.rotationPointX += (float)Math.sin(this.TailBase.rotateAngleY) * 25.0F;
    this.Spike6.rotateAngleY = this.Tail2.rotateAngleY;
    this.Spike6.rotationPointZ = this.Tail2.rotationPointZ;
    this.Spike6.rotationPointX = this.Tail2.rotationPointX;
    this.Tail3.rotateAngleY = angle * 0.75F;
    this.Tail2.rotationPointZ += (float)Math.cos(this.Tail2.rotateAngleY) * 20.0F;
    this.Tail2.rotationPointX += (float)Math.sin(this.Tail2.rotateAngleY) * 20.0F;
    this.Spikes7.rotateAngleY = this.Tail3.rotateAngleY;
    this.Spikes7.rotationPointZ = this.Tail3.rotationPointZ;
    this.Spikes7.rotationPointX = this.Tail3.rotationPointX;
    this.Tail4.rotateAngleY = angle * 1.25F;
    this.Tail3.rotationPointZ += (float)Math.cos(this.Tail3.rotateAngleY) * 20.0F;
    this.Tail3.rotationPointX += (float)Math.sin(this.Tail3.rotateAngleY) * 20.0F;
    this.Tail5.rotateAngleY = angle * 1.5F;
    this.Tail4.rotationPointZ += (float)Math.cos(this.Tail4.rotateAngleY) * 25.0F;
    this.Tail4.rotationPointX += (float)Math.sin(this.Tail4.rotateAngleY) * 25.0F;
    this.Tail6.rotateAngleY = angle * 1.75F;
    this.Tail5.rotationPointZ += (float)Math.cos(this.Tail5.rotateAngleY) * 27.0F;
    this.Tail5.rotationPointX += (float)Math.sin(this.Tail5.rotateAngleY) * 27.0F;
    this.Tail7.rotateAngleY = angle * 2.0F;
    this.Tail6.rotationPointZ += (float)Math.cos(this.Tail6.rotateAngleY) * 28.0F;
    this.Tail6.rotationPointX += (float)Math.sin(this.Tail6.rotateAngleY) * 28.0F;
    this.TailTip.rotateAngleY = angle * 2.25F;
    this.Tail7.rotationPointZ += (float)Math.cos(this.Tail7.rotateAngleY) * 18.0F;
    this.Tail7.rotationPointX += (float)Math.sin(this.Tail7.rotateAngleY) * 18.0F;
  }
}
