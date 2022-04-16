package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTheKing extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer LCClaw1;
  
  ModelRenderer LThigh;
  
  ModelRenderer LUpperLeg;
  
  ModelRenderer TailTip;
  
  ModelRenderer Tail1;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tail3;
  
  ModelRenderer Tail4;
  
  ModelRenderer Tail5;
  
  ModelRenderer Tail6;
  
  ModelRenderer Tail7;
  
  ModelRenderer Body1;
  
  ModelRenderer Chest;
  
  ModelRenderer NeckC1;
  
  ModelRenderer LLowerLeg;
  
  ModelRenderer LFoot;
  
  ModelRenderer LLClaw1;
  
  ModelRenderer LRClaw1;
  
  ModelRenderer LCClaw2;
  
  ModelRenderer LLClaw2;
  
  ModelRenderer TailSpike;
  
  ModelRenderer LRClaw2;
  
  ModelRenderer LClawRear;
  
  ModelRenderer NeckL1;
  
  ModelRenderer NeckR1;
  
  ModelRenderer RThigh;
  
  ModelRenderer RUpperLeg;
  
  ModelRenderer RLowerLeg;
  
  ModelRenderer RFoot;
  
  ModelRenderer RClawRear;
  
  ModelRenderer RLClaw1;
  
  ModelRenderer RCClaw1;
  
  ModelRenderer RRClaw1;
  
  ModelRenderer RLClaw2;
  
  ModelRenderer RCClaw2;
  
  ModelRenderer RRClaw2;
  
  ModelRenderer NeckL2;
  
  ModelRenderer NeckC2;
  
  ModelRenderer NeckR2;
  
  ModelRenderer NeckL3;
  
  ModelRenderer NeckC3;
  
  ModelRenderer NeckR3;
  
  ModelRenderer NeckL4;
  
  ModelRenderer LHead1;
  
  ModelRenderer LHead2;
  
  ModelRenderer LHead3;
  
  ModelRenderer LJaw1;
  
  ModelRenderer LJaw2;
  
  ModelRenderer LJaw3;
  
  ModelRenderer LTooth1;
  
  ModelRenderer LTooth2;
  
  ModelRenderer LTooth3;
  
  ModelRenderer LTooth4;
  
  ModelRenderer NeckC4;
  
  ModelRenderer NeckR4;
  
  ModelRenderer CHead1;
  
  ModelRenderer RHead1;
  
  ModelRenderer CHead2;
  
  ModelRenderer RHead2;
  
  ModelRenderer CHead3;
  
  ModelRenderer RHead3;
  
  ModelRenderer CJaw1;
  
  ModelRenderer CJaw2;
  
  ModelRenderer CJaw3;
  
  ModelRenderer RJaw1;
  
  ModelRenderer RJaw2;
  
  ModelRenderer RJaw3;
  
  ModelRenderer CTooth3;
  
  ModelRenderer CTooth4;
  
  ModelRenderer CTooth1;
  
  ModelRenderer CTooth2;
  
  ModelRenderer RTooth3;
  
  ModelRenderer RTooth4;
  
  ModelRenderer RTooth1;
  
  ModelRenderer RTooth2;
  
  ModelRenderer LLEye;
  
  ModelRenderer LREye;
  
  ModelRenderer CLEye;
  
  ModelRenderer CREye;
  
  ModelRenderer RLEye;
  
  ModelRenderer RREye;
  
  ModelRenderer LHeadMane;
  
  ModelRenderer CHeadMane;
  
  ModelRenderer RHeadMane;
  
  ModelRenderer LLNoseSpike;
  
  ModelRenderer LRNoseSpike;
  
  ModelRenderer CLNoseSpike;
  
  ModelRenderer CRNoseSpike;
  
  ModelRenderer RLNoseSpike;
  
  ModelRenderer RRNoseSpike;
  
  ModelRenderer Back1;
  
  ModelRenderer Back2;
  
  ModelRenderer Lwing1;
  
  ModelRenderer Lwing2;
  
  ModelRenderer Lwing3;
  
  ModelRenderer Lwing4;
  
  ModelRenderer Lwing5;
  
  ModelRenderer Lwing6;
  
  ModelRenderer Lwing7;
  
  ModelRenderer Lwing9;
  
  ModelRenderer Lwing8;
  
  ModelRenderer Lwing10;
  
  ModelRenderer Rwing1;
  
  ModelRenderer Rwing2;
  
  ModelRenderer Rwing3;
  
  ModelRenderer Rwing4;
  
  ModelRenderer Rwing5;
  
  ModelRenderer Rwing6;
  
  ModelRenderer Rwing7;
  
  ModelRenderer Rwing8;
  
  ModelRenderer Rwing9;
  
  ModelRenderer Rwing10;
  
  ModelRenderer TailTip2;
  
  ModelRenderer Ridge1;
  
  ModelRenderer Ridge2;
  
  ModelRenderer Ridge3;
  
  ModelRenderer Ridge4;
  
  ModelRenderer Ridge5;
  
  ModelRenderer Ridge6;
  
  public ModelTheKing(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 2048;
    this.textureHeight = 2048;
    this.LCClaw1 = new ModelRenderer(this, 0, 1450);
    this.LCClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.LCClaw1.setRotationPoint(52.0F, -2.0F, -7.0F);
    this.LCClaw1.setTextureSize(64, 32);
    this.LCClaw1.mirror = true;
    setRotation(this.LCClaw1, 0.3839724F, 0.0F, 0.0F);
    this.LThigh = new ModelRenderer(this, 0, 1050);
    this.LThigh.addBox(0.0F, -14.0F, -21.0F, 25, 34, 42);
    this.LThigh.setRotationPoint(40.0F, -91.0F, 2.0F);
    this.LThigh.setTextureSize(64, 32);
    this.LThigh.mirror = true;
    setRotation(this.LThigh, 0.7853982F, 0.0F, 0.0F);
    this.LUpperLeg = new ModelRenderer(this, 0, 1137);
    this.LUpperLeg.addBox(0.0F, 12.0F, -16.0F, 24, 52, 24);
    this.LUpperLeg.setRotationPoint(40.0F, -91.0F, 2.0F);
    this.LUpperLeg.setTextureSize(64, 32);
    this.LUpperLeg.mirror = true;
    setRotation(this.LUpperLeg, 0.7853982F, 0.0F, 0.0F);
    this.TailTip = new ModelRenderer(this, 500, 102);
    this.TailTip.addBox(-51.0F, -3.0F, 0.0F, 100, 6, 36);
    this.TailTip.setRotationPoint(0.0F, -86.0F, 308.0F);
    this.TailTip.setTextureSize(64, 32);
    this.TailTip.mirror = true;
    setRotation(this.TailTip, 0.0F, 0.0F, 0.0F);
    this.Tail1 = new ModelRenderer(this, 500, 614);
    this.Tail1.addBox(-32.0F, 0.0F, 0.0F, 64, 52, 58);
    this.Tail1.setRotationPoint(0.0F, -114.0F, 29.0F);
    this.Tail1.setTextureSize(64, 32);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, 0.0F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 500, 520);
    this.Tail2.addBox(-25.0F, -19.0F, -3.0F, 50, 42, 46);
    this.Tail2.setRotationPoint(0.0F, -90.0F, 79.0F);
    this.Tail2.setTextureSize(64, 32);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 0.0F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 500, 432);
    this.Tail3.addBox(-20.0F, -18.0F, 0.0F, 40, 36, 45);
    this.Tail3.setRotationPoint(0.0F, -88.0F, 117.0F);
    this.Tail3.setTextureSize(64, 32);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, 0.0F, 0.0F, 0.0F);
    this.Tail4 = new ModelRenderer(this, 500, 355);
    this.Tail4.addBox(-16.0F, -15.0F, 0.0F, 32, 30, 38);
    this.Tail4.setRotationPoint(0.0F, -87.0F, 156.0F);
    this.Tail4.setTextureSize(64, 32);
    this.Tail4.mirror = true;
    setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
    this.Tail5 = new ModelRenderer(this, 500, 286);
    this.Tail5.addBox(-13.0F, -12.0F, 0.0F, 26, 24, 38);
    this.Tail5.setRotationPoint(0.0F, -87.0F, 189.0F);
    this.Tail5.setTextureSize(64, 32);
    this.Tail5.mirror = true;
    setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
    this.Tail6 = new ModelRenderer(this, 500, 218);
    this.Tail6.addBox(-10.0F, -9.0F, 0.0F, 20, 18, 44);
    this.Tail6.setRotationPoint(0.0F, -87.0F, 222.0F);
    this.Tail6.setTextureSize(64, 32);
    this.Tail6.mirror = true;
    setRotation(this.Tail6, 0.0F, 0.0F, 0.0F);
    this.Tail7 = new ModelRenderer(this, 500, 150);
    this.Tail7.addBox(-8.0F, -6.0F, -7.0F, 16, 12, 49);
    this.Tail7.setRotationPoint(0.0F, -87.0F, 268.0F);
    this.Tail7.setTextureSize(64, 32);
    this.Tail7.mirror = true;
    setRotation(this.Tail7, 0.0F, 0.0F, 0.0F);
    this.Body1 = new ModelRenderer(this, 500, 732);
    this.Body1.addBox(-40.0F, -32.0F, -36.0F, 80, 64, 72);
    this.Body1.setRotationPoint(0.0F, -89.0F, 1.0F);
    this.Body1.setTextureSize(64, 32);
    this.Body1.mirror = true;
    setRotation(this.Body1, 0.0F, 0.0F, 0.0F);
    this.Chest = new ModelRenderer(this, 0, 73);
    this.Chest.addBox(-41.0F, -32.0F, -60.0F, 82, 44, 60);
    this.Chest.setRotationPoint(0.0F, -91.0F, -22.0F);
    this.Chest.setTextureSize(64, 32);
    this.Chest.mirror = true;
    setRotation(this.Chest, 0.0F, 0.0F, 0.0F);
    this.NeckC1 = new ModelRenderer(this, 700, 1100);
    this.NeckC1.addBox(-12.0F, -12.0F, -24.0F, 24, 24, 24);
    this.NeckC1.setRotationPoint(0.0F, -113.0F, -76.0F);
    this.NeckC1.setTextureSize(64, 32);
    this.NeckC1.mirror = true;
    setRotation(this.NeckC1, -0.1047198F, 0.0F, 0.0F);
    this.LLowerLeg = new ModelRenderer(this, 0, 1220);
    this.LLowerLeg.addBox(-11.0F, 0.0F, -10.0F, 22, 59, 20);
    this.LLowerLeg.setRotationPoint(52.0F, -52.0F, 36.0F);
    this.LLowerLeg.setTextureSize(64, 32);
    this.LLowerLeg.mirror = true;
    setRotation(this.LLowerLeg, -0.6283185F, 0.0F, 0.0F);
    this.LFoot = new ModelRenderer(this, 0, 1307);
    this.LFoot.addBox(-18.0F, 59.0F, -10.0F, 36, 12, 20);
    this.LFoot.setRotationPoint(52.0F, -52.0F, 36.0F);
    this.LFoot.setTextureSize(64, 32);
    this.LFoot.mirror = true;
    setRotation(this.LFoot, -0.6283185F, 0.0F, 0.0F);
    this.LLClaw1 = new ModelRenderer(this, 0, 1400);
    this.LLClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.LLClaw1.setRotationPoint(67.0F, -2.0F, -7.0F);
    this.LLClaw1.setTextureSize(64, 32);
    this.LLClaw1.mirror = true;
    setRotation(this.LLClaw1, 0.3839724F, 0.0F, 0.0F);
    this.LRClaw1 = new ModelRenderer(this, 0, 1500);
    this.LRClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.LRClaw1.setRotationPoint(37.0F, -2.0F, -7.0F);
    this.LRClaw1.setTextureSize(64, 32);
    this.LRClaw1.mirror = true;
    setRotation(this.LRClaw1, 0.3839724F, 0.0F, 0.0F);
    this.LCClaw2 = new ModelRenderer(this, 0, 1600);
    this.LCClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.LCClaw2.setRotationPoint(52.0F, -2.0F, -7.0F);
    this.LCClaw2.setTextureSize(64, 32);
    this.LCClaw2.mirror = true;
    setRotation(this.LCClaw2, 0.6457718F, 0.0F, 0.0F);
    this.LLClaw2 = new ModelRenderer(this, 0, 1550);
    this.LLClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.LLClaw2.setRotationPoint(67.0F, -2.0F, -7.0F);
    this.LLClaw2.setTextureSize(64, 32);
    this.LLClaw2.mirror = true;
    setRotation(this.LLClaw2, 0.6457718F, 0.0F, 0.0F);
    this.TailSpike = new ModelRenderer(this, 500, 0);
    this.TailSpike.addBox(-2.0F, -1.0F, -7.0F, 4, 4, 53);
    this.TailSpike.setRotationPoint(0.0F, -87.0F, 375.0F);
    this.TailSpike.setTextureSize(64, 32);
    this.TailSpike.mirror = true;
    setRotation(this.TailSpike, 0.0F, 0.0F, 0.0F);
    this.LRClaw2 = new ModelRenderer(this, 0, 1650);
    this.LRClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.LRClaw2.setRotationPoint(37.0F, -2.0F, -7.0F);
    this.LRClaw2.setTextureSize(64, 32);
    this.LRClaw2.mirror = true;
    setRotation(this.LRClaw2, 0.6457718F, 0.0F, 0.0F);
    this.LClawRear = new ModelRenderer(this, 0, 1350);
    this.LClawRear.addBox(-2.0F, -3.0F, 0.0F, 4, 9, 28);
    this.LClawRear.setRotationPoint(52.0F, 4.0F, 4.0F);
    this.LClawRear.setTextureSize(64, 32);
    this.LClawRear.mirror = true;
    setRotation(this.LClawRear, -0.9250245F, 0.0F, 0.0F);
    this.NeckL1 = new ModelRenderer(this, 500, 1100);
    this.NeckL1.addBox(-12.0F, -12.0F, -24.0F, 24, 24, 24);
    this.NeckL1.setRotationPoint(30.0F, -113.0F, -76.0F);
    this.NeckL1.setTextureSize(64, 32);
    this.NeckL1.mirror = true;
    setRotation(this.NeckL1, -0.0523599F, -0.1047198F, 0.0F);
    this.NeckR1 = new ModelRenderer(this, 900, 1100);
    this.NeckR1.addBox(-12.0F, -12.0F, -24.0F, 24, 24, 24);
    this.NeckR1.setRotationPoint(-30.0F, -113.0F, -76.0F);
    this.NeckR1.setTextureSize(64, 32);
    this.NeckR1.mirror = true;
    setRotation(this.NeckR1, -0.0523599F, 0.1047198F, 0.0F);
    this.RThigh = new ModelRenderer(this, 200, 1050);
    this.RThigh.addBox(0.0F, -14.0F, -21.0F, 25, 34, 42);
    this.RThigh.setRotationPoint(-65.0F, -91.0F, 2.0F);
    this.RThigh.setTextureSize(64, 32);
    this.RThigh.mirror = true;
    setRotation(this.RThigh, 0.7853982F, 0.0F, 0.0F);
    this.RUpperLeg = new ModelRenderer(this, 200, 1137);
    this.RUpperLeg.addBox(0.0F, 12.0F, -16.0F, 24, 52, 24);
    this.RUpperLeg.setRotationPoint(-64.0F, -91.0F, 2.0F);
    this.RUpperLeg.setTextureSize(64, 32);
    this.RUpperLeg.mirror = true;
    setRotation(this.RUpperLeg, 0.7853982F, 0.0F, 0.0F);
    this.RLowerLeg = new ModelRenderer(this, 200, 1220);
    this.RLowerLeg.addBox(-4.0F, 0.0F, -10.0F, 22, 59, 20);
    this.RLowerLeg.setRotationPoint(-59.0F, -52.0F, 36.0F);
    this.RLowerLeg.setTextureSize(64, 32);
    this.RLowerLeg.mirror = true;
    setRotation(this.RLowerLeg, -0.6283185F, 0.0F, 0.0F);
    this.RFoot = new ModelRenderer(this, 200, 1307);
    this.RFoot.addBox(-11.0F, 59.0F, -10.0F, 36, 12, 20);
    this.RFoot.setRotationPoint(-59.0F, -52.0F, 36.0F);
    this.RFoot.setTextureSize(64, 32);
    this.RFoot.mirror = true;
    setRotation(this.RFoot, -0.6283185F, 0.0F, 0.0F);
    this.RClawRear = new ModelRenderer(this, 200, 1350);
    this.RClawRear.addBox(-2.0F, -3.0F, 0.0F, 4, 9, 28);
    this.RClawRear.setRotationPoint(-52.0F, 4.0F, 4.0F);
    this.RClawRear.setTextureSize(64, 32);
    this.RClawRear.mirror = true;
    setRotation(this.RClawRear, -0.9250245F, 0.0F, 0.0F);
    this.RLClaw1 = new ModelRenderer(this, 200, 1400);
    this.RLClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.RLClaw1.setRotationPoint(-37.0F, -2.0F, -7.0F);
    this.RLClaw1.setTextureSize(64, 32);
    this.RLClaw1.mirror = true;
    setRotation(this.RLClaw1, 0.3839724F, 0.0F, 0.0F);
    this.RCClaw1 = new ModelRenderer(this, 200, 1450);
    this.RCClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.RCClaw1.setRotationPoint(-52.0F, -2.0F, -7.0F);
    this.RCClaw1.setTextureSize(64, 32);
    this.RCClaw1.mirror = true;
    setRotation(this.RCClaw1, 0.3839724F, 0.0F, 0.0F);
    this.RRClaw1 = new ModelRenderer(this, 200, 1500);
    this.RRClaw1.addBox(-5.0F, -5.0F, -20.0F, 10, 10, 20);
    this.RRClaw1.setRotationPoint(-67.0F, -2.0F, -7.0F);
    this.RRClaw1.setTextureSize(64, 32);
    this.RRClaw1.mirror = true;
    setRotation(this.RRClaw1, 0.3839724F, 0.0F, 0.0F);
    this.RLClaw2 = new ModelRenderer(this, 200, 1550);
    this.RLClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.RLClaw2.setRotationPoint(-37.0F, -2.0F, -7.0F);
    this.RLClaw2.setTextureSize(64, 32);
    this.RLClaw2.mirror = true;
    setRotation(this.RLClaw2, 0.6457718F, 0.0F, 0.0F);
    this.RCClaw2 = new ModelRenderer(this, 200, 1600);
    this.RCClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.RCClaw2.setRotationPoint(-52.0F, -2.0F, -7.0F);
    this.RCClaw2.setTextureSize(64, 32);
    this.RCClaw2.mirror = true;
    setRotation(this.RCClaw2, 0.6457718F, 0.0F, 0.0F);
    this.RRClaw2 = new ModelRenderer(this, 200, 1650);
    this.RRClaw2.addBox(-2.0F, -7.0F, -46.0F, 4, 7, 28);
    this.RRClaw2.setRotationPoint(-67.0F, -2.0F, -7.0F);
    this.RRClaw2.setTextureSize(64, 32);
    this.RRClaw2.mirror = true;
    setRotation(this.RRClaw2, 0.6457718F, 0.0F, 0.0F);
    this.NeckL2 = new ModelRenderer(this, 500, 1154);
    this.NeckL2.addBox(-11.0F, -11.0F, -40.0F, 22, 22, 40);
    this.NeckL2.setRotationPoint(32.0F, -114.0F, -95.0F);
    this.NeckL2.setTextureSize(64, 32);
    this.NeckL2.mirror = true;
    setRotation(this.NeckL2, 0.0F, -0.1745329F, 0.0F);
    this.NeckC2 = new ModelRenderer(this, 700, 1154);
    this.NeckC2.addBox(-11.0F, -11.0F, -40.0F, 22, 22, 40);
    this.NeckC2.setRotationPoint(0.0F, -115.0F, -95.0F);
    this.NeckC2.setTextureSize(64, 32);
    this.NeckC2.mirror = true;
    setRotation(this.NeckC2, -0.1570796F, 0.0F, 0.0F);
    this.NeckR2 = new ModelRenderer(this, 900, 1154);
    this.NeckR2.addBox(-11.0F, -11.0F, -40.0F, 22, 22, 40);
    this.NeckR2.setRotationPoint(-32.0F, -114.0F, -95.0F);
    this.NeckR2.setTextureSize(64, 32);
    this.NeckR2.mirror = true;
    setRotation(this.NeckR2, -0.0523599F, 0.1745329F, 0.0F);
    this.NeckL3 = new ModelRenderer(this, 500, 1222);
    this.NeckL3.addBox(-10.0F, -10.0F, -40.0F, 20, 20, 40);
    this.NeckL3.setRotationPoint(38.0F, -114.0F, -131.0F);
    this.NeckL3.setTextureSize(64, 32);
    this.NeckL3.mirror = true;
    setRotation(this.NeckL3, 0.0698132F, -0.2617994F, 0.0F);
    this.NeckC3 = new ModelRenderer(this, 700, 1222);
    this.NeckC3.addBox(-10.0F, -10.0F, -40.0F, 20, 20, 40);
    this.NeckC3.setRotationPoint(0.0F, -120.0F, -131.0F);
    this.NeckC3.setTextureSize(64, 32);
    this.NeckC3.mirror = true;
    setRotation(this.NeckC3, -0.2094395F, 0.0F, 0.0F);
    this.NeckR3 = new ModelRenderer(this, 900, 1222);
    this.NeckR3.addBox(-10.0F, -10.0F, -40.0F, 20, 20, 40);
    this.NeckR3.setRotationPoint(-37.0F, -116.0F, -128.0F);
    this.NeckR3.setTextureSize(64, 32);
    this.NeckR3.mirror = true;
    setRotation(this.NeckR3, -0.0523599F, 0.3141593F, 0.0F);
    this.NeckL4 = new ModelRenderer(this, 500, 1300);
    this.NeckL4.addBox(-9.0F, -9.0F, -40.0F, 18, 18, 40);
    this.NeckL4.setRotationPoint(46.0F, -112.0F, -163.0F);
    this.NeckL4.setTextureSize(64, 32);
    this.NeckL4.mirror = true;
    setRotation(this.NeckL4, 0.1396263F, -0.3839724F, 0.0F);
    this.LHead1 = new ModelRenderer(this, 500, 1425);
    this.LHead1.addBox(-13.0F, -13.0F, -30.0F, 26, 26, 30);
    this.LHead1.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LHead1.setTextureSize(64, 32);
    this.LHead1.mirror = true;
    setRotation(this.LHead1, 0.1396263F, -0.3839724F, 0.0F);
    this.LHead2 = new ModelRenderer(this, 500, 1550);
    this.LHead2.addBox(-10.0F, -7.0F, -58.0F, 20, 20, 28);
    this.LHead2.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LHead2.setTextureSize(64, 32);
    this.LHead2.mirror = true;
    setRotation(this.LHead2, 0.1396263F, -0.3839724F, 0.0F);
    this.LHead3 = new ModelRenderer(this, 500, 1605);
    this.LHead3.addBox(-8.0F, -3.0F, -83.0F, 16, 16, 26);
    this.LHead3.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LHead3.setTextureSize(64, 32);
    this.LHead3.mirror = true;
    setRotation(this.LHead3, 0.1396263F, -0.3839724F, 0.0F);
    this.LJaw1 = new ModelRenderer(this, 500, 1660);
    this.LJaw1.addBox(-14.0F, -2.0F, -14.0F, 28, 7, 16);
    this.LJaw1.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LJaw1.setTextureSize(64, 32);
    this.LJaw1.mirror = true;
    setRotation(this.LJaw1, 0.2443461F, -0.3839724F, 0.0F);
    this.LJaw2 = new ModelRenderer(this, 500, 1700);
    this.LJaw2.addBox(-12.0F, -2.0F, -55.0F, 24, 6, 46);
    this.LJaw2.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LJaw2.setTextureSize(64, 32);
    this.LJaw2.mirror = true;
    setRotation(this.LJaw2, 0.2443461F, -0.3839724F, 0.0F);
    this.LJaw3 = new ModelRenderer(this, 500, 1765);
    this.LJaw3.addBox(-10.0F, -2.0F, -77.0F, 20, 6, 22);
    this.LJaw3.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LJaw3.setTextureSize(64, 32);
    this.LJaw3.mirror = true;
    setRotation(this.LJaw3, 0.2443461F, -0.3839724F, 0.0F);
    this.LTooth1 = new ModelRenderer(this, 10, 0);
    this.LTooth1.addBox(-10.0F, -10.0F, -77.0F, 2, 8, 2);
    this.LTooth1.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LTooth1.setTextureSize(64, 32);
    this.LTooth1.mirror = true;
    setRotation(this.LTooth1, 0.2443461F, -0.3839724F, 0.0F);
    this.LTooth2 = new ModelRenderer(this, 20, 0);
    this.LTooth2.addBox(8.0F, -10.0F, -77.0F, 2, 8, 2);
    this.LTooth2.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LTooth2.setTextureSize(64, 32);
    this.LTooth2.mirror = true;
    setRotation(this.LTooth2, 0.2443461F, -0.3839724F, 0.0F);
    this.LTooth3 = new ModelRenderer(this, 30, 0);
    this.LTooth3.addBox(-12.0F, -8.0F, -55.0F, 2, 6, 2);
    this.LTooth3.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LTooth3.setTextureSize(64, 32);
    this.LTooth3.mirror = true;
    setRotation(this.LTooth3, 0.2443461F, -0.3839724F, 0.0F);
    this.LTooth4 = new ModelRenderer(this, 40, 0);
    this.LTooth4.addBox(10.0F, -8.0F, -55.0F, 2, 6, 2);
    this.LTooth4.setRotationPoint(59.0F, -100.0F, -196.0F);
    this.LTooth4.setTextureSize(64, 32);
    this.LTooth4.mirror = true;
    setRotation(this.LTooth4, 0.2443461F, -0.3839724F, 0.0F);
    this.NeckC4 = new ModelRenderer(this, 700, 1300);
    this.NeckC4.addBox(-9.0F, -9.0F, -40.0F, 18, 18, 40);
    this.NeckC4.setRotationPoint(0.0F, -126.0F, -162.0F);
    this.NeckC4.setTextureSize(64, 32);
    this.NeckC4.mirror = true;
    setRotation(this.NeckC4, -0.2617994F, 0.0F, 0.0F);
    this.NeckR4 = new ModelRenderer(this, 900, 1300);
    this.NeckR4.addBox(-9.0F, -9.0F, -40.0F, 18, 18, 40);
    this.NeckR4.setRotationPoint(-47.0F, -118.0F, -161.0F);
    this.NeckR4.setTextureSize(64, 32);
    this.NeckR4.mirror = true;
    setRotation(this.NeckR4, -0.1047198F, 0.3665191F, 0.0F);
    this.CHead1 = new ModelRenderer(this, 700, 1425);
    this.CHead1.addBox(-13.0F, -13.0F, -30.0F, 26, 26, 30);
    this.CHead1.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CHead1.setTextureSize(64, 32);
    this.CHead1.mirror = true;
    setRotation(this.CHead1, -0.296706F, 0.0F, 0.0F);
    this.RHead1 = new ModelRenderer(this, 900, 1425);
    this.RHead1.addBox(-13.0F, -13.0F, -30.0F, 26, 26, 30);
    this.RHead1.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RHead1.setTextureSize(64, 32);
    this.RHead1.mirror = true;
    setRotation(this.RHead1, -0.122173F, 0.418879F, 0.0F);
    this.CHead2 = new ModelRenderer(this, 700, 1550);
    this.CHead2.addBox(-10.0F, -7.0F, -58.0F, 20, 20, 28);
    this.CHead2.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CHead2.setTextureSize(64, 32);
    this.CHead2.mirror = true;
    setRotation(this.CHead2, -0.296706F, 0.0F, 0.0F);
    this.RHead2 = new ModelRenderer(this, 900, 1550);
    this.RHead2.addBox(-10.0F, -7.0F, -58.0F, 20, 20, 28);
    this.RHead2.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RHead2.setTextureSize(64, 32);
    this.RHead2.mirror = true;
    setRotation(this.RHead2, -0.122173F, 0.418879F, 0.0F);
    this.CHead3 = new ModelRenderer(this, 700, 1605);
    this.CHead3.addBox(-8.0F, -3.0F, -83.0F, 16, 16, 26);
    this.CHead3.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CHead3.setTextureSize(64, 32);
    this.CHead3.mirror = true;
    setRotation(this.CHead3, -0.296706F, 0.0F, 0.0F);
    this.RHead3 = new ModelRenderer(this, 900, 1605);
    this.RHead3.addBox(-8.0F, -3.0F, -83.0F, 16, 16, 26);
    this.RHead3.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RHead3.setTextureSize(64, 32);
    this.RHead3.mirror = true;
    setRotation(this.RHead3, -0.122173F, 0.418879F, 0.0F);
    this.CJaw1 = new ModelRenderer(this, 700, 1660);
    this.CJaw1.addBox(-14.0F, -2.0F, -14.0F, 28, 7, 16);
    this.CJaw1.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CJaw1.setTextureSize(64, 32);
    this.CJaw1.mirror = true;
    setRotation(this.CJaw1, -0.1047198F, 0.0F, 0.0F);
    this.CJaw2 = new ModelRenderer(this, 700, 1700);
    this.CJaw2.addBox(-12.0F, -2.0F, -55.0F, 24, 6, 46);
    this.CJaw2.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CJaw2.setTextureSize(64, 32);
    this.CJaw2.mirror = true;
    setRotation(this.CJaw2, -0.1047198F, 0.0F, 0.0F);
    this.CJaw3 = new ModelRenderer(this, 700, 1765);
    this.CJaw3.addBox(-10.0F, -2.0F, -77.0F, 20, 6, 22);
    this.CJaw3.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CJaw3.setTextureSize(64, 32);
    this.CJaw3.mirror = true;
    setRotation(this.CJaw3, -0.1047198F, 0.0F, 0.0F);
    this.RJaw1 = new ModelRenderer(this, 900, 1660);
    this.RJaw1.addBox(-14.0F, -2.0F, -14.0F, 28, 7, 16);
    this.RJaw1.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RJaw1.setTextureSize(64, 32);
    this.RJaw1.mirror = true;
    setRotation(this.RJaw1, 0.1570796F, 0.418879F, 0.0F);
    this.RJaw2 = new ModelRenderer(this, 900, 1700);
    this.RJaw2.addBox(-12.0F, -2.0F, -55.0F, 24, 6, 46);
    this.RJaw2.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RJaw2.setTextureSize(64, 32);
    this.RJaw2.mirror = true;
    setRotation(this.RJaw2, 0.1570796F, 0.418879F, 0.0F);
    this.RJaw3 = new ModelRenderer(this, 900, 1765);
    this.RJaw3.addBox(-10.0F, -2.0F, -77.0F, 20, 6, 22);
    this.RJaw3.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RJaw3.setTextureSize(64, 32);
    this.RJaw3.mirror = true;
    setRotation(this.RJaw3, 0.1570796F, 0.418879F, 0.0F);
    this.CTooth3 = new ModelRenderer(this, 70, 0);
    this.CTooth3.addBox(-12.0F, -8.0F, -55.0F, 2, 6, 2);
    this.CTooth3.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CTooth3.setTextureSize(64, 32);
    this.CTooth3.mirror = true;
    setRotation(this.CTooth3, -0.1047198F, 0.0F, 0.0F);
    this.CTooth4 = new ModelRenderer(this, 80, 0);
    this.CTooth4.addBox(10.0F, -8.0F, -55.0F, 2, 6, 2);
    this.CTooth4.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CTooth4.setTextureSize(64, 32);
    this.CTooth4.mirror = true;
    setRotation(this.CTooth4, -0.1047198F, 0.0F, 0.0F);
    this.CTooth1 = new ModelRenderer(this, 50, 0);
    this.CTooth1.addBox(-10.0F, -10.0F, -77.0F, 2, 8, 2);
    this.CTooth1.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CTooth1.setTextureSize(64, 32);
    this.CTooth1.mirror = true;
    setRotation(this.CTooth1, -0.1047198F, 0.0F, 0.0F);
    this.CTooth2 = new ModelRenderer(this, 60, 0);
    this.CTooth2.addBox(8.0F, -10.0F, -77.0F, 2, 8, 2);
    this.CTooth2.setRotationPoint(0.0F, -130.0F, -201.0F);
    this.CTooth2.setTextureSize(64, 32);
    this.CTooth2.mirror = true;
    setRotation(this.CTooth2, -0.1047198F, 0.0F, 0.0F);
    this.RTooth3 = new ModelRenderer(this, 110, 0);
    this.RTooth3.addBox(-12.0F, -8.0F, -55.0F, 2, 6, 2);
    this.RTooth3.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RTooth3.setTextureSize(64, 32);
    this.RTooth3.mirror = true;
    setRotation(this.RTooth3, 0.1570796F, 0.418879F, 0.0F);
    this.RTooth4 = new ModelRenderer(this, 120, 0);
    this.RTooth4.addBox(10.0F, -8.0F, -55.0F, 2, 6, 2);
    this.RTooth4.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RTooth4.setTextureSize(64, 32);
    this.RTooth4.mirror = true;
    setRotation(this.RTooth4, 0.1570796F, 0.418879F, 0.0F);
    this.RTooth1 = new ModelRenderer(this, 90, 0);
    this.RTooth1.addBox(-10.0F, -10.0F, -77.0F, 2, 8, 2);
    this.RTooth1.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RTooth1.setTextureSize(64, 32);
    this.RTooth1.mirror = true;
    setRotation(this.RTooth1, 0.1570796F, 0.418879F, 0.0F);
    this.RTooth2 = new ModelRenderer(this, 100, 0);
    this.RTooth2.addBox(8.0F, -10.0F, -77.0F, 2, 8, 2);
    this.RTooth2.setRotationPoint(-62.0F, -115.0F, -200.0F);
    this.RTooth2.setTextureSize(64, 32);
    this.RTooth2.mirror = true;
    setRotation(this.RTooth2, 0.1570796F, 0.418879F, 0.0F);
    this.LLEye = new ModelRenderer(this, 500, 1500);
    this.LLEye.addBox(13.0F, -12.0F, -29.0F, 2, 6, 10);
    this.LLEye.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LLEye.setTextureSize(64, 32);
    this.LLEye.mirror = true;
    setRotation(this.LLEye, 0.1396263F, -0.3839724F, 0.0F);
    this.LREye = new ModelRenderer(this, 533, 1500);
    this.LREye.addBox(-15.0F, -12.0F, -29.0F, 2, 6, 10);
    this.LREye.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LREye.setTextureSize(64, 32);
    this.LREye.mirror = true;
    setRotation(this.LREye, 0.1396263F, -0.3839724F, 0.0F);
    this.CLEye = new ModelRenderer(this, 700, 1500);
    this.CLEye.addBox(13.0F, -12.0F, -29.0F, 2, 6, 10);
    this.CLEye.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CLEye.setTextureSize(64, 32);
    this.CLEye.mirror = true;
    setRotation(this.CLEye, -0.296706F, 0.0F, 0.0F);
    this.CREye = new ModelRenderer(this, 733, 1500);
    this.CREye.addBox(-15.0F, -12.0F, -29.0F, 2, 6, 10);
    this.CREye.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CREye.setTextureSize(64, 32);
    this.CREye.mirror = true;
    setRotation(this.CREye, -0.296706F, 0.0F, 0.0F);
    this.RLEye = new ModelRenderer(this, 900, 1500);
    this.RLEye.addBox(13.0F, -12.0F, -29.0F, 2, 6, 10);
    this.RLEye.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RLEye.setTextureSize(64, 32);
    this.RLEye.mirror = true;
    setRotation(this.RLEye, -0.122173F, 0.418879F, 0.0F);
    this.RREye = new ModelRenderer(this, 933, 1500);
    this.RREye.addBox(-15.0F, -12.0F, -29.0F, 2, 5, 10);
    this.RREye.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RREye.setTextureSize(64, 32);
    this.RREye.mirror = true;
    setRotation(this.RREye, -0.122173F, 0.418879F, 0.0F);
    this.LHeadMane = new ModelRenderer(this, 500, 1375);
    this.LHeadMane.addBox(0.0F, -14.0F, 0.0F, 1, 23, 19);
    this.LHeadMane.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LHeadMane.setTextureSize(64, 32);
    this.LHeadMane.mirror = true;
    setRotation(this.LHeadMane, 0.5235988F, -0.3839724F, 0.0F);
    this.CHeadMane = new ModelRenderer(this, 700, 1375);
    this.CHeadMane.addBox(0.0F, -14.0F, 0.0F, 1, 23, 19);
    this.CHeadMane.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CHeadMane.setTextureSize(64, 32);
    this.CHeadMane.mirror = true;
    setRotation(this.CHeadMane, 0.1047198F, 0.0F, 0.0F);
    this.RHeadMane = new ModelRenderer(this, 900, 1375);
    this.RHeadMane.addBox(0.0F, -14.0F, 0.0F, 1, 23, 19);
    this.RHeadMane.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RHeadMane.setTextureSize(64, 32);
    this.RHeadMane.mirror = true;
    setRotation(this.RHeadMane, 0.3665191F, 0.418879F, 0.0F);
    this.LLNoseSpike = new ModelRenderer(this, 0, 300);
    this.LLNoseSpike.addBox(24.0F, -23.0F, -76.0F, 1, 1, 17);
    this.LLNoseSpike.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LLNoseSpike.setTextureSize(64, 32);
    this.LLNoseSpike.mirror = true;
    setRotation(this.LLNoseSpike, 0.4014257F, -0.1570796F, 0.0F);
    this.LRNoseSpike = new ModelRenderer(this, 0, 325);
    this.LRNoseSpike.addBox(-26.0F, -24.0F, -75.0F, 1, 1, 17);
    this.LRNoseSpike.setRotationPoint(59.0F, -114.0F, -195.0F);
    this.LRNoseSpike.setTextureSize(64, 32);
    this.LRNoseSpike.mirror = true;
    setRotation(this.LRNoseSpike, 0.418879F, -0.6283185F, 0.0F);
    this.CLNoseSpike = new ModelRenderer(this, 0, 350);
    this.CLNoseSpike.addBox(24.0F, -23.0F, -76.0F, 1, 1, 17);
    this.CLNoseSpike.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CLNoseSpike.setTextureSize(64, 32);
    this.CLNoseSpike.mirror = true;
    setRotation(this.CLNoseSpike, -0.0523599F, 0.2443461F, 0.0F);
    this.CRNoseSpike = new ModelRenderer(this, 0, 375);
    this.CRNoseSpike.addBox(-26.0F, -24.0F, -75.0F, 1, 1, 17);
    this.CRNoseSpike.setRotationPoint(0.0F, -141.0F, -195.0F);
    this.CRNoseSpike.setTextureSize(64, 32);
    this.CRNoseSpike.mirror = true;
    setRotation(this.CRNoseSpike, -0.0349066F, -0.2617994F, 0.0F);
    this.RLNoseSpike = new ModelRenderer(this, 0, 400);
    this.RLNoseSpike.addBox(24.0F, -23.0F, -76.0F, 1, 1, 17);
    this.RLNoseSpike.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RLNoseSpike.setTextureSize(64, 32);
    this.RLNoseSpike.mirror = true;
    setRotation(this.RLNoseSpike, 0.1396263F, 0.6457718F, 0.0F);
    this.RRNoseSpike = new ModelRenderer(this, 0, 425);
    this.RRNoseSpike.addBox(-26.0F, -24.0F, -75.0F, 1, 1, 17);
    this.RRNoseSpike.setRotationPoint(-60.0F, -128.0F, -195.0F);
    this.RRNoseSpike.setTextureSize(64, 32);
    this.RRNoseSpike.mirror = true;
    setRotation(this.RRNoseSpike, 0.1570796F, 0.1745329F, 0.0F);
    this.Back1 = new ModelRenderer(this, 167, 186);
    this.Back1.addBox(0.0F, 0.0F, 0.0F, 30, 15, 49);
    this.Back1.setRotationPoint(-45.0F, -127.0F, -58.0F);
    this.Back1.setTextureSize(64, 32);
    this.Back1.mirror = true;
    setRotation(this.Back1, -0.0698132F, 0.0F, 0.0F);
    this.Back2 = new ModelRenderer(this, 0, 186);
    this.Back2.addBox(0.0F, 0.0F, 0.0F, 30, 15, 49);
    this.Back2.setRotationPoint(15.0F, -127.0F, -58.0F);
    this.Back2.setTextureSize(64, 32);
    this.Back2.mirror = true;
    setRotation(this.Back2, -0.0698132F, 0.0F, 0.0F);
    this.Lwing1 = new ModelRenderer(this, 250, 1000);
    this.Lwing1.addBox(0.0F, 0.0F, 0.0F, 87, 5, 5);
    this.Lwing1.setRotationPoint(40.0F, -121.0F, -50.0F);
    this.Lwing1.setTextureSize(64, 32);
    this.Lwing1.mirror = true;
    setRotation(this.Lwing1, 0.0F, 0.0349066F, 0.0F);
    this.Lwing2 = new ModelRenderer(this, 1220, 782);
    this.Lwing2.addBox(0.0F, 2.0F, 0.0F, 87, 1, 110);
    this.Lwing2.setRotationPoint(40.0F, -121.0F, -49.0F);
    this.Lwing2.setTextureSize(64, 32);
    this.Lwing2.mirror = true;
    setRotation(this.Lwing2, 0.0F, 0.0349066F, 0.0F);
    this.Lwing3 = new ModelRenderer(this, 250, 975);
    this.Lwing3.addBox(0.0F, 0.0F, 0.0F, 188, 5, 5);
    this.Lwing3.setRotationPoint(124.0F, -121.0F, -53.0F);
    this.Lwing3.setTextureSize(64, 32);
    this.Lwing3.mirror = true;
    setRotation(this.Lwing3, 0.0F, 0.0F, 0.0F);
    this.Lwing4 = new ModelRenderer(this, 1341, 625);
    this.Lwing4.addBox(0.0F, 2.0F, 0.0F, 188, 1, 147);
    this.Lwing4.setRotationPoint(124.0F, -121.0F, -50.0F);
    this.Lwing4.setTextureSize(64, 32);
    this.Lwing4.mirror = true;
    setRotation(this.Lwing4, 0.0F, 0.0F, 0.0F);
    this.Lwing5 = new ModelRenderer(this, 245, 950);
    this.Lwing5.addBox(0.0F, 0.0F, 0.0F, 87, 5, 5);
    this.Lwing5.setRotationPoint(309.0F, -121.0F, -53.0F);
    this.Lwing5.setTextureSize(64, 32);
    this.Lwing5.mirror = true;
    setRotation(this.Lwing5, 0.0F, -0.0349066F, 0.0F);
    this.Lwing6 = new ModelRenderer(this, 1300, 1300);
    this.Lwing6.addBox(0.0F, 2.0F, 1.0F, 87, 1, 125);
    this.Lwing6.setRotationPoint(309.0F, -121.0F, -50.0F);
    this.Lwing6.setTextureSize(64, 32);
    this.Lwing6.mirror = true;
    setRotation(this.Lwing6, 0.0F, 0.0F, 0.0F);
    this.Lwing7 = new ModelRenderer(this, 250, 900);
    this.Lwing7.addBox(0.0F, 0.0F, 0.0F, 150, 5, 5);
    this.Lwing7.setRotationPoint(124.0F, -121.0F, -53.0F);
    this.Lwing7.setTextureSize(64, 32);
    this.Lwing7.mirror = true;
    setRotation(this.Lwing7, 0.0F, 0.0F, 0.2617994F);
    this.Lwing9 = new ModelRenderer(this, 250, 925);
    this.Lwing9.addBox(0.0F, 0.0F, 0.0F, 175, 5, 5);
    this.Lwing9.setRotationPoint(124.0F, -121.0F, -53.0F);
    this.Lwing9.setTextureSize(64, 32);
    this.Lwing9.mirror = true;
    setRotation(this.Lwing9, 0.0F, 0.0F, -0.2617994F);
    this.Lwing8 = new ModelRenderer(this, 1300, 1156);
    this.Lwing8.addBox(0.0F, 2.0F, 0.0F, 150, 1, 120);
    this.Lwing8.setRotationPoint(124.0F, -121.0F, -50.0F);
    this.Lwing8.setTextureSize(64, 32);
    this.Lwing8.mirror = true;
    setRotation(this.Lwing8, 0.0F, 0.0F, 0.2617994F);
    this.Lwing10 = new ModelRenderer(this, 1392, 326);
    this.Lwing10.addBox(0.0F, 2.0F, 0.0F, 176, 1, 136);
    this.Lwing10.setRotationPoint(124.0F, -121.0F, -50.0F);
    this.Lwing10.setTextureSize(64, 32);
    this.Lwing10.mirror = true;
    setRotation(this.Lwing10, 0.0F, 0.0F, -0.2617994F);
    this.Rwing1 = new ModelRenderer(this, 650, 1000);
    this.Rwing1.addBox(-87.0F, 0.0F, 0.0F, 87, 5, 5);
    this.Rwing1.setRotationPoint(-40.0F, -121.0F, -50.0F);
    this.Rwing1.setTextureSize(64, 32);
    this.Rwing1.mirror = true;
    setRotation(this.Rwing1, 0.0F, -0.0349066F, 0.0F);
    this.Rwing2 = new ModelRenderer(this, 1619, 782);
    this.Rwing2.addBox(-87.0F, 2.0F, 0.0F, 87, 1, 110);
    this.Rwing2.setRotationPoint(-40.0F, -121.0F, -49.0F);
    this.Rwing2.setTextureSize(64, 32);
    this.Rwing2.mirror = true;
    setRotation(this.Rwing2, 0.0F, -0.0349066F, 0.0F);
    this.Rwing3 = new ModelRenderer(this, 550, 950);
    this.Rwing3.addBox(-188.0F, 0.0F, 0.0F, 188, 5, 5);
    this.Rwing3.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing3.setTextureSize(64, 32);
    this.Rwing3.mirror = true;
    setRotation(this.Rwing3, 0.0F, 0.0F, 0.0F);
    this.Rwing4 = new ModelRenderer(this, 1341, 470);
    this.Rwing4.addBox(-188.0F, 2.0F, 0.0F, 188, 1, 147);
    this.Rwing4.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing4.setTextureSize(64, 32);
    this.Rwing4.mirror = true;
    setRotation(this.Rwing4, 0.0F, 0.0F, 0.0F);
    this.Rwing5 = new ModelRenderer(this, 750, 975);
    this.Rwing5.addBox(-87.0F, 0.0F, 0.0F, 87, 5, 5);
    this.Rwing5.setRotationPoint(-309.0F, -121.0F, -53.0F);
    this.Rwing5.setTextureSize(64, 32);
    this.Rwing5.mirror = true;
    setRotation(this.Rwing5, 0.0F, 0.0349066F, 0.0F);
    this.Rwing6 = new ModelRenderer(this, 1300, 1436);
    this.Rwing6.addBox(-87.0F, 2.0F, 1.0F, 87, 1, 125);
    this.Rwing6.setRotationPoint(-309.0F, -121.0F, -50.0F);
    this.Rwing6.setTextureSize(64, 32);
    this.Rwing6.mirror = true;
    setRotation(this.Rwing6, 0.0F, 0.0F, 0.0F);
    this.Rwing7 = new ModelRenderer(this, 650, 900);
    this.Rwing7.addBox(-150.0F, 0.0F, 0.0F, 150, 5, 5);
    this.Rwing7.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing7.setTextureSize(64, 32);
    this.Rwing7.mirror = true;
    setRotation(this.Rwing7, 0.0F, 0.0F, -0.2617994F);
    this.Rwing8 = new ModelRenderer(this, 1300, 1024);
    this.Rwing8.addBox(-150.0F, 2.0F, 0.0F, 150, 1, 120);
    this.Rwing8.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing8.setTextureSize(64, 32);
    this.Rwing8.mirror = true;
    setRotation(this.Rwing8, 0.0F, 0.0F, -0.2617994F);
    this.Rwing9 = new ModelRenderer(this, 621, 925);
    this.Rwing9.addBox(-175.0F, 0.0F, 0.0F, 175, 5, 5);
    this.Rwing9.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing9.setTextureSize(64, 32);
    this.Rwing9.mirror = true;
    setRotation(this.Rwing9, 0.0F, 0.0F, 0.2617994F);
    this.Rwing10 = new ModelRenderer(this, 1391, 184);
    this.Rwing10.addBox(-176.0F, 2.0F, 0.0F, 176, 1, 136);
    this.Rwing10.setRotationPoint(-124.0F, -121.0F, -53.0F);
    this.Rwing10.setTextureSize(64, 32);
    this.Rwing10.mirror = true;
    setRotation(this.Rwing10, 0.0F, 0.0F, 0.2617994F);
    this.TailTip2 = new ModelRenderer(this, 500, 63);
    this.TailTip2.addBox(-35.0F, -2.0F, 36.0F, 70, 4, 26);
    this.TailTip2.setRotationPoint(0.0F, -86.0F, 308.0F);
    this.TailTip2.setTextureSize(64, 32);
    this.TailTip2.mirror = true;
    setRotation(this.TailTip2, 0.0F, 0.0F, 0.0F);
    this.Ridge1 = new ModelRenderer(this, 850, 717);
    this.Ridge1.addBox(-1.0F, 0.0F, 0.0F, 3, 10, 24);
    this.Ridge1.setRotationPoint(0.0F, -122.0F, -75.0F);
    this.Ridge1.setTextureSize(64, 32);
    this.Ridge1.mirror = true;
    setRotation(this.Ridge1, 0.3665191F, 0.0F, 0.0F);
    this.Ridge2 = new ModelRenderer(this, 850, 676);
    this.Ridge2.addBox(-1.0F, 0.0F, 0.0F, 3, 10, 24);
    this.Ridge2.setRotationPoint(0.0F, -122.0F, -50.0F);
    this.Ridge2.setTextureSize(64, 32);
    this.Ridge2.mirror = true;
    setRotation(this.Ridge2, 0.3665191F, 0.0F, 0.0F);
    this.Ridge3 = new ModelRenderer(this, 800, 600);
    this.Ridge3.addBox(-1.0F, 0.0F, 0.0F, 3, 20, 49);
    this.Ridge3.setRotationPoint(0.0F, -120.0F, -20.0F);
    this.Ridge3.setTextureSize(64, 32);
    this.Ridge3.mirror = true;
    setRotation(this.Ridge3, 0.3665191F, 0.0F, 0.0F);
    this.Ridge4 = new ModelRenderer(this, 800, 550);
    this.Ridge4.addBox(-1.0F, 3.0F, 9.0F, 3, 10, 22);
    this.Ridge4.setRotationPoint(0.0F, -114.0F, 29.0F);
    this.Ridge4.setTextureSize(64, 32);
    this.Ridge4.mirror = true;
    setRotation(this.Ridge4, 0.3665191F, 0.0F, 0.0F);
    this.Ridge5 = new ModelRenderer(this, 800, 500);
    this.Ridge5.addBox(-1.0F, 13.0F, 33.0F, 3, 10, 20);
    this.Ridge5.setRotationPoint(0.0F, -114.0F, 29.0F);
    this.Ridge5.setTextureSize(64, 32);
    this.Ridge5.mirror = true;
    setRotation(this.Ridge5, 0.3665191F, 0.0F, 0.0F);
    this.Ridge6 = new ModelRenderer(this, 638, 165);
    this.Ridge6.addBox(-1.0F, 2.0F, 20.0F, 3, 10, 20);
    this.Ridge6.setRotationPoint(0.0F, -87.0F, 268.0F);
    this.Ridge6.setTextureSize(64, 32);
    this.Ridge6.mirror = true;
    setRotation(this.Ridge6, 0.3665191F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: fconst_0
    //   1: fstore #8
    //   3: aload_1
    //   4: checkcast danger/orespawn/TheKing
    //   7: astore #9
    //   9: ldc_w 0.26
    //   12: fstore #10
    //   14: ldc_w 0.08
    //   17: fstore #11
    //   19: ldc 0.7853982
    //   21: fstore #12
    //   23: fconst_0
    //   24: fstore #13
    //   26: fconst_0
    //   27: fstore #14
    //   29: fconst_0
    //   30: fstore #15
    //   32: fconst_0
    //   33: fstore #16
    //   35: fconst_0
    //   36: fstore #17
    //   38: fconst_0
    //   39: fstore #18
    //   41: fconst_0
    //   42: fstore #19
    //   44: fconst_0
    //   45: fstore #20
    //   47: fconst_0
    //   48: fstore #21
    //   50: aload_0
    //   51: aload_1
    //   52: fload_2
    //   53: fload_3
    //   54: fload #4
    //   56: fload #5
    //   58: fload #6
    //   60: fload #7
    //   62: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   65: aload_0
    //   66: fload_2
    //   67: fload_3
    //   68: fload #4
    //   70: fload #5
    //   72: fload #6
    //   74: fload #7
    //   76: aload_1
    //   77: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   80: aload #9
    //   82: invokevirtual getAttacking : ()I
    //   85: ifeq -> 115
    //   88: fload #4
    //   90: ldc_w 0.75
    //   93: fmul
    //   94: aload_0
    //   95: getfield wingspeed : F
    //   98: fmul
    //   99: invokestatic cos : (F)F
    //   102: ldc_w 3.1415927
    //   105: fmul
    //   106: ldc_w 0.21
    //   109: fmul
    //   110: fstore #8
    //   112: goto -> 139
    //   115: fload #4
    //   117: ldc_w 0.35
    //   120: fmul
    //   121: aload_0
    //   122: getfield wingspeed : F
    //   125: fmul
    //   126: invokestatic cos : (F)F
    //   129: ldc_w 3.1415927
    //   132: fmul
    //   133: ldc_w 0.15
    //   136: fmul
    //   137: fstore #8
    //   139: aload_0
    //   140: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   143: fload #8
    //   145: putfield rotateAngleZ : F
    //   148: aload_0
    //   149: getfield Lwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   152: fload #8
    //   154: putfield rotateAngleZ : F
    //   157: aload_0
    //   158: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   161: fload #8
    //   163: ldc_w 5.0
    //   166: fmul
    //   167: ldc_w 3.0
    //   170: fdiv
    //   171: putfield rotateAngleZ : F
    //   174: aload_0
    //   175: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   178: aload_0
    //   179: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   182: getfield rotationPointY : F
    //   185: aload_0
    //   186: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   189: getfield rotateAngleZ : F
    //   192: f2d
    //   193: invokestatic sin : (D)D
    //   196: d2f
    //   197: ldc_w 84.0
    //   200: fmul
    //   201: fadd
    //   202: putfield rotationPointY : F
    //   205: aload_0
    //   206: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   209: aload_0
    //   210: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   213: getfield rotationPointX : F
    //   216: aload_0
    //   217: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   220: getfield rotateAngleZ : F
    //   223: f2d
    //   224: invokestatic cos : (D)D
    //   227: d2f
    //   228: ldc_w 84.0
    //   231: fmul
    //   232: fadd
    //   233: putfield rotationPointX : F
    //   236: aload_0
    //   237: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   240: aload_0
    //   241: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   244: getfield rotateAngleZ : F
    //   247: putfield rotateAngleZ : F
    //   250: aload_0
    //   251: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   254: aload_0
    //   255: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   258: getfield rotationPointY : F
    //   261: putfield rotationPointY : F
    //   264: aload_0
    //   265: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   268: aload_0
    //   269: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   272: getfield rotationPointX : F
    //   275: putfield rotationPointX : F
    //   278: aload_0
    //   279: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   282: fload #8
    //   284: ldc_w 7.0
    //   287: fmul
    //   288: ldc_w 3.0
    //   291: fdiv
    //   292: putfield rotateAngleZ : F
    //   295: aload_0
    //   296: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   299: aload_0
    //   300: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   303: getfield rotationPointY : F
    //   306: aload_0
    //   307: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   310: getfield rotateAngleZ : F
    //   313: f2d
    //   314: invokestatic sin : (D)D
    //   317: d2f
    //   318: ldc_w 184.0
    //   321: fmul
    //   322: fadd
    //   323: putfield rotationPointY : F
    //   326: aload_0
    //   327: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   330: aload_0
    //   331: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   334: getfield rotationPointX : F
    //   337: aload_0
    //   338: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   341: getfield rotateAngleZ : F
    //   344: f2d
    //   345: invokestatic cos : (D)D
    //   348: d2f
    //   349: ldc_w 184.0
    //   352: fmul
    //   353: fadd
    //   354: putfield rotationPointX : F
    //   357: aload_0
    //   358: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   361: aload_0
    //   362: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   365: getfield rotateAngleZ : F
    //   368: putfield rotateAngleZ : F
    //   371: aload_0
    //   372: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   375: aload_0
    //   376: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   379: getfield rotationPointY : F
    //   382: putfield rotationPointY : F
    //   385: aload_0
    //   386: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   389: aload_0
    //   390: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   393: getfield rotationPointX : F
    //   396: putfield rotationPointX : F
    //   399: aload_0
    //   400: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   403: aload_0
    //   404: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   407: aload_0
    //   408: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   411: getfield rotationPointY : F
    //   414: dup_x1
    //   415: putfield rotationPointY : F
    //   418: putfield rotationPointY : F
    //   421: aload_0
    //   422: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   425: aload_0
    //   426: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   429: aload_0
    //   430: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   433: getfield rotationPointX : F
    //   436: dup_x1
    //   437: putfield rotationPointX : F
    //   440: putfield rotationPointX : F
    //   443: aload_0
    //   444: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   447: aload_0
    //   448: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   451: aload_0
    //   452: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   455: getfield rotationPointY : F
    //   458: dup_x1
    //   459: putfield rotationPointY : F
    //   462: putfield rotationPointY : F
    //   465: aload_0
    //   466: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   469: aload_0
    //   470: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   473: aload_0
    //   474: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   477: getfield rotationPointX : F
    //   480: dup_x1
    //   481: putfield rotationPointX : F
    //   484: putfield rotationPointX : F
    //   487: aload_0
    //   488: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   491: aload_0
    //   492: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   495: ldc_w 0.261
    //   498: aload_0
    //   499: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   502: getfield rotateAngleZ : F
    //   505: fadd
    //   506: dup_x1
    //   507: putfield rotateAngleZ : F
    //   510: putfield rotateAngleZ : F
    //   513: aload_0
    //   514: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   517: aload_0
    //   518: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   521: ldc_w -0.261
    //   524: aload_0
    //   525: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   528: getfield rotateAngleZ : F
    //   531: fadd
    //   532: dup_x1
    //   533: putfield rotateAngleZ : F
    //   536: putfield rotateAngleZ : F
    //   539: aload_0
    //   540: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   543: fload #8
    //   545: fneg
    //   546: putfield rotateAngleZ : F
    //   549: aload_0
    //   550: getfield Rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   553: fload #8
    //   555: fneg
    //   556: putfield rotateAngleZ : F
    //   559: aload_0
    //   560: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   563: fload #8
    //   565: fneg
    //   566: ldc_w 5.0
    //   569: fmul
    //   570: ldc_w 3.0
    //   573: fdiv
    //   574: putfield rotateAngleZ : F
    //   577: aload_0
    //   578: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   581: aload_0
    //   582: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   585: getfield rotationPointY : F
    //   588: aload_0
    //   589: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   592: getfield rotateAngleZ : F
    //   595: f2d
    //   596: invokestatic sin : (D)D
    //   599: d2f
    //   600: ldc_w 84.0
    //   603: fmul
    //   604: fsub
    //   605: putfield rotationPointY : F
    //   608: aload_0
    //   609: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   612: aload_0
    //   613: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   616: getfield rotationPointX : F
    //   619: aload_0
    //   620: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   623: getfield rotateAngleZ : F
    //   626: f2d
    //   627: invokestatic cos : (D)D
    //   630: d2f
    //   631: ldc_w 84.0
    //   634: fmul
    //   635: fsub
    //   636: putfield rotationPointX : F
    //   639: aload_0
    //   640: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   643: aload_0
    //   644: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   647: getfield rotateAngleZ : F
    //   650: putfield rotateAngleZ : F
    //   653: aload_0
    //   654: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   657: aload_0
    //   658: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   661: getfield rotationPointY : F
    //   664: putfield rotationPointY : F
    //   667: aload_0
    //   668: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   671: aload_0
    //   672: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   675: getfield rotationPointX : F
    //   678: putfield rotationPointX : F
    //   681: aload_0
    //   682: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   685: fload #8
    //   687: fneg
    //   688: ldc_w 7.0
    //   691: fmul
    //   692: ldc_w 3.0
    //   695: fdiv
    //   696: putfield rotateAngleZ : F
    //   699: aload_0
    //   700: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   703: aload_0
    //   704: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   707: getfield rotationPointY : F
    //   710: aload_0
    //   711: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   714: getfield rotateAngleZ : F
    //   717: f2d
    //   718: invokestatic sin : (D)D
    //   721: d2f
    //   722: ldc_w 184.0
    //   725: fmul
    //   726: fsub
    //   727: putfield rotationPointY : F
    //   730: aload_0
    //   731: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   734: aload_0
    //   735: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   738: getfield rotationPointX : F
    //   741: aload_0
    //   742: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   745: getfield rotateAngleZ : F
    //   748: f2d
    //   749: invokestatic cos : (D)D
    //   752: d2f
    //   753: ldc_w 184.0
    //   756: fmul
    //   757: fsub
    //   758: putfield rotationPointX : F
    //   761: aload_0
    //   762: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   765: aload_0
    //   766: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   769: getfield rotateAngleZ : F
    //   772: putfield rotateAngleZ : F
    //   775: aload_0
    //   776: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   779: aload_0
    //   780: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   783: getfield rotationPointY : F
    //   786: putfield rotationPointY : F
    //   789: aload_0
    //   790: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   793: aload_0
    //   794: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   797: getfield rotationPointX : F
    //   800: putfield rotationPointX : F
    //   803: aload_0
    //   804: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   807: aload_0
    //   808: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   811: aload_0
    //   812: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   815: getfield rotationPointY : F
    //   818: dup_x1
    //   819: putfield rotationPointY : F
    //   822: putfield rotationPointY : F
    //   825: aload_0
    //   826: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   829: aload_0
    //   830: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   833: aload_0
    //   834: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   837: getfield rotationPointX : F
    //   840: dup_x1
    //   841: putfield rotationPointX : F
    //   844: putfield rotationPointX : F
    //   847: aload_0
    //   848: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   851: aload_0
    //   852: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   855: aload_0
    //   856: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   859: getfield rotationPointY : F
    //   862: dup_x1
    //   863: putfield rotationPointY : F
    //   866: putfield rotationPointY : F
    //   869: aload_0
    //   870: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   873: aload_0
    //   874: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   877: aload_0
    //   878: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   881: getfield rotationPointX : F
    //   884: dup_x1
    //   885: putfield rotationPointX : F
    //   888: putfield rotationPointX : F
    //   891: aload_0
    //   892: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   895: aload_0
    //   896: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   899: ldc_w -0.261
    //   902: aload_0
    //   903: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   906: getfield rotateAngleZ : F
    //   909: fadd
    //   910: dup_x1
    //   911: putfield rotateAngleZ : F
    //   914: putfield rotateAngleZ : F
    //   917: aload_0
    //   918: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   921: aload_0
    //   922: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   925: ldc_w 0.261
    //   928: aload_0
    //   929: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   932: getfield rotateAngleZ : F
    //   935: fadd
    //   936: dup_x1
    //   937: putfield rotateAngleZ : F
    //   940: putfield rotateAngleZ : F
    //   943: aload #9
    //   945: invokevirtual getAttacking : ()I
    //   948: ifeq -> 978
    //   951: fload #4
    //   953: ldc_w 0.75
    //   956: fmul
    //   957: aload_0
    //   958: getfield wingspeed : F
    //   961: fmul
    //   962: invokestatic cos : (F)F
    //   965: ldc_w 3.1415927
    //   968: fmul
    //   969: ldc_w 0.25
    //   972: fmul
    //   973: fstore #8
    //   975: goto -> 981
    //   978: fconst_0
    //   979: fstore #8
    //   981: aload_0
    //   982: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   985: aload_0
    //   986: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   989: ldc_w -0.925
    //   992: fload #8
    //   994: fadd
    //   995: dup_x1
    //   996: putfield rotateAngleX : F
    //   999: putfield rotateAngleX : F
    //   1002: aload_0
    //   1003: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1006: ldc_w 0.384
    //   1009: fload #8
    //   1011: fsub
    //   1012: putfield rotateAngleX : F
    //   1015: aload_0
    //   1016: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1019: ldc_w 0.645
    //   1022: fload #8
    //   1024: fsub
    //   1025: putfield rotateAngleX : F
    //   1028: aload_0
    //   1029: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1032: ldc_w 0.384
    //   1035: fload #8
    //   1037: fsub
    //   1038: putfield rotateAngleX : F
    //   1041: aload_0
    //   1042: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1045: ldc_w 0.645
    //   1048: fload #8
    //   1050: fsub
    //   1051: putfield rotateAngleX : F
    //   1054: aload_0
    //   1055: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1058: ldc_w 0.384
    //   1061: fload #8
    //   1063: fsub
    //   1064: putfield rotateAngleX : F
    //   1067: aload_0
    //   1068: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1071: ldc_w 0.645
    //   1074: fload #8
    //   1076: fsub
    //   1077: putfield rotateAngleX : F
    //   1080: aload_0
    //   1081: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1084: ldc_w 0.384
    //   1087: fload #8
    //   1089: fsub
    //   1090: putfield rotateAngleX : F
    //   1093: aload_0
    //   1094: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1097: ldc_w 0.645
    //   1100: fload #8
    //   1102: fsub
    //   1103: putfield rotateAngleX : F
    //   1106: aload_0
    //   1107: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1110: ldc_w 0.384
    //   1113: fload #8
    //   1115: fsub
    //   1116: putfield rotateAngleX : F
    //   1119: aload_0
    //   1120: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1123: ldc_w 0.645
    //   1126: fload #8
    //   1128: fsub
    //   1129: putfield rotateAngleX : F
    //   1132: aload_0
    //   1133: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1136: ldc_w 0.384
    //   1139: fload #8
    //   1141: fsub
    //   1142: putfield rotateAngleX : F
    //   1145: aload_0
    //   1146: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1149: ldc_w 0.645
    //   1152: fload #8
    //   1154: fsub
    //   1155: putfield rotateAngleX : F
    //   1158: aload #9
    //   1160: invokevirtual getAttacking : ()I
    //   1163: ifeq -> 1193
    //   1166: fload #4
    //   1168: ldc_w 0.6
    //   1171: fmul
    //   1172: aload_0
    //   1173: getfield wingspeed : F
    //   1176: fmul
    //   1177: invokestatic cos : (F)F
    //   1180: ldc_w 3.1415927
    //   1183: fmul
    //   1184: ldc_w 0.45
    //   1187: fmul
    //   1188: fstore #8
    //   1190: goto -> 1196
    //   1193: fconst_0
    //   1194: fstore #8
    //   1196: aload_0
    //   1197: getfield LThigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1200: aload_0
    //   1201: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1204: ldc_w 0.785
    //   1207: fload #8
    //   1209: ldc_w 4.0
    //   1212: fdiv
    //   1213: fadd
    //   1214: dup_x1
    //   1215: putfield rotateAngleX : F
    //   1218: putfield rotateAngleX : F
    //   1221: aload_0
    //   1222: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1225: aload_0
    //   1226: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1229: ldc_w -0.628
    //   1232: fload #8
    //   1234: fconst_2
    //   1235: fdiv
    //   1236: fadd
    //   1237: dup_x1
    //   1238: putfield rotateAngleX : F
    //   1241: putfield rotateAngleX : F
    //   1244: aload_0
    //   1245: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1248: aload_0
    //   1249: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1252: aload_0
    //   1253: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1256: getfield rotationPointY : F
    //   1259: aload_0
    //   1260: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1263: getfield rotateAngleX : F
    //   1266: f2d
    //   1267: invokestatic cos : (D)D
    //   1270: d2f
    //   1271: ldc_w 50.0
    //   1274: fmul
    //   1275: fadd
    //   1276: dup_x1
    //   1277: putfield rotationPointY : F
    //   1280: putfield rotationPointY : F
    //   1283: aload_0
    //   1284: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1287: aload_0
    //   1288: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1291: aload_0
    //   1292: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1295: getfield rotationPointZ : F
    //   1298: aload_0
    //   1299: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1302: getfield rotateAngleX : F
    //   1305: f2d
    //   1306: invokestatic sin : (D)D
    //   1309: d2f
    //   1310: ldc_w 50.0
    //   1313: fmul
    //   1314: fadd
    //   1315: dup_x1
    //   1316: putfield rotationPointZ : F
    //   1319: putfield rotationPointZ : F
    //   1322: aload_0
    //   1323: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1326: aload_0
    //   1327: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1330: aload_0
    //   1331: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1334: getfield rotationPointY : F
    //   1337: aload_0
    //   1338: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1341: getfield rotateAngleX : F
    //   1344: ldc_w 0.1
    //   1347: fsub
    //   1348: f2d
    //   1349: invokestatic cos : (D)D
    //   1352: d2f
    //   1353: ldc_w 66.0
    //   1356: fmul
    //   1357: fadd
    //   1358: dup_x1
    //   1359: putfield rotationPointY : F
    //   1362: putfield rotationPointY : F
    //   1365: aload_0
    //   1366: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1369: aload_0
    //   1370: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1373: aload_0
    //   1374: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1377: getfield rotationPointZ : F
    //   1380: aload_0
    //   1381: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1384: getfield rotateAngleX : F
    //   1387: ldc_w 0.1
    //   1390: fsub
    //   1391: f2d
    //   1392: invokestatic sin : (D)D
    //   1395: d2f
    //   1396: ldc_w 66.0
    //   1399: fmul
    //   1400: fadd
    //   1401: dup_x1
    //   1402: putfield rotationPointZ : F
    //   1405: putfield rotationPointZ : F
    //   1408: aload_0
    //   1409: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1412: aload_0
    //   1413: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1416: aload_0
    //   1417: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1420: getfield rotationPointY : F
    //   1423: dup_x1
    //   1424: putfield rotationPointY : F
    //   1427: putfield rotationPointY : F
    //   1430: aload_0
    //   1431: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1434: aload_0
    //   1435: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1438: aload_0
    //   1439: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1442: getfield rotationPointY : F
    //   1445: dup_x1
    //   1446: putfield rotationPointY : F
    //   1449: putfield rotationPointY : F
    //   1452: aload_0
    //   1453: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1456: aload_0
    //   1457: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1460: aload_0
    //   1461: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1464: getfield rotationPointZ : F
    //   1467: dup_x1
    //   1468: putfield rotationPointZ : F
    //   1471: putfield rotationPointZ : F
    //   1474: aload_0
    //   1475: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1478: aload_0
    //   1479: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1482: aload_0
    //   1483: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1486: getfield rotationPointZ : F
    //   1489: dup_x1
    //   1490: putfield rotationPointZ : F
    //   1493: putfield rotationPointZ : F
    //   1496: aload_0
    //   1497: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   1500: aload_0
    //   1501: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1504: getfield rotationPointY : F
    //   1507: aload_0
    //   1508: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1511: getfield rotateAngleX : F
    //   1514: ldc_w 0.15
    //   1517: fadd
    //   1518: f2d
    //   1519: invokestatic cos : (D)D
    //   1522: d2f
    //   1523: ldc_w 66.0
    //   1526: fmul
    //   1527: fadd
    //   1528: putfield rotationPointY : F
    //   1531: aload_0
    //   1532: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   1535: aload_0
    //   1536: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1539: getfield rotationPointZ : F
    //   1542: aload_0
    //   1543: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1546: getfield rotateAngleX : F
    //   1549: ldc_w 0.15
    //   1552: fadd
    //   1553: f2d
    //   1554: invokestatic sin : (D)D
    //   1557: d2f
    //   1558: ldc_w 66.0
    //   1561: fmul
    //   1562: fadd
    //   1563: putfield rotationPointZ : F
    //   1566: aload_0
    //   1567: getfield RThigh : Lnet/minecraft/client/model/ModelRenderer;
    //   1570: aload_0
    //   1571: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1574: ldc_w 0.785
    //   1577: fload #8
    //   1579: ldc_w 4.0
    //   1582: fdiv
    //   1583: fsub
    //   1584: dup_x1
    //   1585: putfield rotateAngleX : F
    //   1588: putfield rotateAngleX : F
    //   1591: aload_0
    //   1592: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1595: aload_0
    //   1596: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1599: ldc_w -0.628
    //   1602: fload #8
    //   1604: fconst_2
    //   1605: fdiv
    //   1606: fsub
    //   1607: dup_x1
    //   1608: putfield rotateAngleX : F
    //   1611: putfield rotateAngleX : F
    //   1614: aload_0
    //   1615: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1618: aload_0
    //   1619: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1622: aload_0
    //   1623: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1626: getfield rotationPointY : F
    //   1629: aload_0
    //   1630: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1633: getfield rotateAngleX : F
    //   1636: f2d
    //   1637: invokestatic cos : (D)D
    //   1640: d2f
    //   1641: ldc_w 50.0
    //   1644: fmul
    //   1645: fadd
    //   1646: dup_x1
    //   1647: putfield rotationPointY : F
    //   1650: putfield rotationPointY : F
    //   1653: aload_0
    //   1654: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1657: aload_0
    //   1658: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   1661: aload_0
    //   1662: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1665: getfield rotationPointZ : F
    //   1668: aload_0
    //   1669: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1672: getfield rotateAngleX : F
    //   1675: f2d
    //   1676: invokestatic sin : (D)D
    //   1679: d2f
    //   1680: ldc_w 50.0
    //   1683: fmul
    //   1684: fadd
    //   1685: dup_x1
    //   1686: putfield rotationPointZ : F
    //   1689: putfield rotationPointZ : F
    //   1692: aload_0
    //   1693: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1696: aload_0
    //   1697: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1700: aload_0
    //   1701: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1704: getfield rotationPointY : F
    //   1707: aload_0
    //   1708: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1711: getfield rotateAngleX : F
    //   1714: ldc_w 0.1
    //   1717: fsub
    //   1718: f2d
    //   1719: invokestatic cos : (D)D
    //   1722: d2f
    //   1723: ldc_w 66.0
    //   1726: fmul
    //   1727: fadd
    //   1728: dup_x1
    //   1729: putfield rotationPointY : F
    //   1732: putfield rotationPointY : F
    //   1735: aload_0
    //   1736: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1739: aload_0
    //   1740: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1743: aload_0
    //   1744: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1747: getfield rotationPointZ : F
    //   1750: aload_0
    //   1751: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1754: getfield rotateAngleX : F
    //   1757: ldc_w 0.1
    //   1760: fsub
    //   1761: f2d
    //   1762: invokestatic sin : (D)D
    //   1765: d2f
    //   1766: ldc_w 66.0
    //   1769: fmul
    //   1770: fadd
    //   1771: dup_x1
    //   1772: putfield rotationPointZ : F
    //   1775: putfield rotationPointZ : F
    //   1778: aload_0
    //   1779: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1782: aload_0
    //   1783: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1786: aload_0
    //   1787: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1790: getfield rotationPointY : F
    //   1793: dup_x1
    //   1794: putfield rotationPointY : F
    //   1797: putfield rotationPointY : F
    //   1800: aload_0
    //   1801: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1804: aload_0
    //   1805: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1808: aload_0
    //   1809: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1812: getfield rotationPointY : F
    //   1815: dup_x1
    //   1816: putfield rotationPointY : F
    //   1819: putfield rotationPointY : F
    //   1822: aload_0
    //   1823: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1826: aload_0
    //   1827: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1830: aload_0
    //   1831: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1834: getfield rotationPointZ : F
    //   1837: dup_x1
    //   1838: putfield rotationPointZ : F
    //   1841: putfield rotationPointZ : F
    //   1844: aload_0
    //   1845: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1848: aload_0
    //   1849: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1852: aload_0
    //   1853: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1856: getfield rotationPointZ : F
    //   1859: dup_x1
    //   1860: putfield rotationPointZ : F
    //   1863: putfield rotationPointZ : F
    //   1866: aload_0
    //   1867: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   1870: aload_0
    //   1871: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1874: getfield rotationPointY : F
    //   1877: aload_0
    //   1878: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1881: getfield rotateAngleX : F
    //   1884: ldc_w 0.15
    //   1887: fadd
    //   1888: f2d
    //   1889: invokestatic cos : (D)D
    //   1892: d2f
    //   1893: ldc_w 66.0
    //   1896: fmul
    //   1897: fadd
    //   1898: putfield rotationPointY : F
    //   1901: aload_0
    //   1902: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   1905: aload_0
    //   1906: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1909: getfield rotationPointZ : F
    //   1912: aload_0
    //   1913: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   1916: getfield rotateAngleX : F
    //   1919: ldc_w 0.15
    //   1922: fadd
    //   1923: f2d
    //   1924: invokestatic sin : (D)D
    //   1927: d2f
    //   1928: ldc_w 66.0
    //   1931: fmul
    //   1932: fadd
    //   1933: putfield rotationPointZ : F
    //   1936: aload #9
    //   1938: invokevirtual getAttacking : ()I
    //   1941: ifeq -> 1954
    //   1944: ldc_w 0.56
    //   1947: fstore #10
    //   1949: ldc_w 0.19
    //   1952: fstore #11
    //   1954: aload_0
    //   1955: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1958: fload #4
    //   1960: fload #10
    //   1962: fmul
    //   1963: aload_0
    //   1964: getfield wingspeed : F
    //   1967: fmul
    //   1968: invokestatic cos : (F)F
    //   1971: ldc_w 3.1415927
    //   1974: fmul
    //   1975: fload #11
    //   1977: fmul
    //   1978: fconst_2
    //   1979: fdiv
    //   1980: putfield rotateAngleY : F
    //   1983: aload_0
    //   1984: getfield Ridge4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1987: aload_0
    //   1988: getfield Ridge5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1991: aload_0
    //   1992: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1995: getfield rotateAngleY : F
    //   1998: dup_x1
    //   1999: putfield rotateAngleY : F
    //   2002: putfield rotateAngleY : F
    //   2005: aload_0
    //   2006: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2009: aload_0
    //   2010: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2013: getfield rotationPointZ : F
    //   2016: aload_0
    //   2017: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2020: getfield rotateAngleY : F
    //   2023: f2d
    //   2024: invokestatic cos : (D)D
    //   2027: d2f
    //   2028: ldc_w 54.0
    //   2031: fmul
    //   2032: fadd
    //   2033: putfield rotationPointZ : F
    //   2036: aload_0
    //   2037: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2040: aload_0
    //   2041: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2044: getfield rotationPointX : F
    //   2047: fconst_1
    //   2048: fsub
    //   2049: aload_0
    //   2050: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2053: getfield rotateAngleY : F
    //   2056: f2d
    //   2057: invokestatic sin : (D)D
    //   2060: d2f
    //   2061: ldc_w 54.0
    //   2064: fmul
    //   2065: fadd
    //   2066: putfield rotationPointX : F
    //   2069: aload_0
    //   2070: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2073: fload #4
    //   2075: fload #10
    //   2077: fmul
    //   2078: aload_0
    //   2079: getfield wingspeed : F
    //   2082: fmul
    //   2083: fload #12
    //   2085: fsub
    //   2086: invokestatic cos : (F)F
    //   2089: ldc_w 3.1415927
    //   2092: fmul
    //   2093: fload #11
    //   2095: fmul
    //   2096: putfield rotateAngleY : F
    //   2099: aload_0
    //   2100: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2103: aload_0
    //   2104: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2107: getfield rotationPointZ : F
    //   2110: aload_0
    //   2111: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2114: getfield rotateAngleY : F
    //   2117: f2d
    //   2118: invokestatic cos : (D)D
    //   2121: d2f
    //   2122: ldc_w 42.0
    //   2125: fmul
    //   2126: fadd
    //   2127: putfield rotationPointZ : F
    //   2130: aload_0
    //   2131: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2134: aload_0
    //   2135: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2138: getfield rotationPointX : F
    //   2141: aload_0
    //   2142: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2145: getfield rotateAngleY : F
    //   2148: f2d
    //   2149: invokestatic sin : (D)D
    //   2152: d2f
    //   2153: ldc_w 42.0
    //   2156: fmul
    //   2157: fadd
    //   2158: putfield rotationPointX : F
    //   2161: aload_0
    //   2162: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2165: fload #4
    //   2167: fload #10
    //   2169: fmul
    //   2170: aload_0
    //   2171: getfield wingspeed : F
    //   2174: fmul
    //   2175: fconst_2
    //   2176: fload #12
    //   2178: fmul
    //   2179: fsub
    //   2180: invokestatic cos : (F)F
    //   2183: ldc_w 3.1415927
    //   2186: fmul
    //   2187: fload #11
    //   2189: fmul
    //   2190: putfield rotateAngleY : F
    //   2193: aload_0
    //   2194: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2197: aload_0
    //   2198: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2201: getfield rotationPointZ : F
    //   2204: aload_0
    //   2205: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2208: getfield rotateAngleY : F
    //   2211: f2d
    //   2212: invokestatic cos : (D)D
    //   2215: d2f
    //   2216: ldc_w 41.0
    //   2219: fmul
    //   2220: fadd
    //   2221: putfield rotationPointZ : F
    //   2224: aload_0
    //   2225: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2228: aload_0
    //   2229: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2232: getfield rotationPointX : F
    //   2235: aload_0
    //   2236: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2239: getfield rotateAngleY : F
    //   2242: f2d
    //   2243: invokestatic sin : (D)D
    //   2246: d2f
    //   2247: ldc_w 41.0
    //   2250: fmul
    //   2251: fadd
    //   2252: putfield rotationPointX : F
    //   2255: aload_0
    //   2256: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2259: fload #4
    //   2261: fload #10
    //   2263: fmul
    //   2264: aload_0
    //   2265: getfield wingspeed : F
    //   2268: fmul
    //   2269: ldc_w 3.0
    //   2272: fload #12
    //   2274: fmul
    //   2275: fsub
    //   2276: invokestatic cos : (F)F
    //   2279: ldc_w 3.1415927
    //   2282: fmul
    //   2283: fload #11
    //   2285: fmul
    //   2286: putfield rotateAngleY : F
    //   2289: fload #4
    //   2291: fload #10
    //   2293: fmul
    //   2294: aload_0
    //   2295: getfield wingspeed : F
    //   2298: fmul
    //   2299: ldc_w 3.0
    //   2302: fload #12
    //   2304: fmul
    //   2305: fsub
    //   2306: invokestatic cos : (F)F
    //   2309: ldc_w 3.1415927
    //   2312: fmul
    //   2313: fload #11
    //   2315: fmul
    //   2316: fstore #8
    //   2318: fload #8
    //   2320: fconst_2
    //   2321: fdiv
    //   2322: fstore #8
    //   2324: aload_0
    //   2325: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2328: aload_0
    //   2329: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2332: getfield rotationPointZ : F
    //   2335: aload_0
    //   2336: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2339: getfield rotateAngleY : F
    //   2342: f2d
    //   2343: invokestatic cos : (D)D
    //   2346: d2f
    //   2347: ldc_w 34.0
    //   2350: fmul
    //   2351: fadd
    //   2352: putfield rotationPointZ : F
    //   2355: aload_0
    //   2356: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2359: aload_0
    //   2360: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2363: getfield rotationPointX : F
    //   2366: aload_0
    //   2367: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2370: getfield rotateAngleY : F
    //   2373: f2d
    //   2374: invokestatic sin : (D)D
    //   2377: d2f
    //   2378: ldc_w 34.0
    //   2381: fmul
    //   2382: fadd
    //   2383: putfield rotationPointX : F
    //   2386: aload_0
    //   2387: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2390: aload_0
    //   2391: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2394: getfield rotateAngleY : F
    //   2397: fload #8
    //   2399: fadd
    //   2400: putfield rotateAngleY : F
    //   2403: aload_0
    //   2404: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2407: aload_0
    //   2408: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2411: getfield rotationPointZ : F
    //   2414: aload_0
    //   2415: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2418: getfield rotateAngleY : F
    //   2421: f2d
    //   2422: invokestatic cos : (D)D
    //   2425: d2f
    //   2426: ldc_w 34.0
    //   2429: fmul
    //   2430: fadd
    //   2431: putfield rotationPointZ : F
    //   2434: aload_0
    //   2435: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2438: aload_0
    //   2439: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2442: getfield rotationPointX : F
    //   2445: aload_0
    //   2446: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2449: getfield rotateAngleY : F
    //   2452: f2d
    //   2453: invokestatic sin : (D)D
    //   2456: d2f
    //   2457: ldc_w 34.0
    //   2460: fmul
    //   2461: fadd
    //   2462: putfield rotationPointX : F
    //   2465: aload_0
    //   2466: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2469: aload_0
    //   2470: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2473: getfield rotateAngleY : F
    //   2476: fload #8
    //   2478: fadd
    //   2479: putfield rotateAngleY : F
    //   2482: aload_0
    //   2483: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2486: aload_0
    //   2487: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2490: aload_0
    //   2491: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2494: getfield rotationPointZ : F
    //   2497: aload_0
    //   2498: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2501: getfield rotateAngleY : F
    //   2504: f2d
    //   2505: invokestatic cos : (D)D
    //   2508: d2f
    //   2509: ldc 40.0
    //   2511: fmul
    //   2512: fadd
    //   2513: dup_x1
    //   2514: putfield rotationPointZ : F
    //   2517: putfield rotationPointZ : F
    //   2520: aload_0
    //   2521: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2524: aload_0
    //   2525: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2528: aload_0
    //   2529: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2532: getfield rotationPointX : F
    //   2535: aload_0
    //   2536: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2539: getfield rotateAngleY : F
    //   2542: f2d
    //   2543: invokestatic sin : (D)D
    //   2546: d2f
    //   2547: ldc 40.0
    //   2549: fmul
    //   2550: fadd
    //   2551: dup_x1
    //   2552: putfield rotationPointX : F
    //   2555: putfield rotationPointX : F
    //   2558: aload_0
    //   2559: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2562: aload_0
    //   2563: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2566: aload_0
    //   2567: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2570: getfield rotateAngleY : F
    //   2573: fload #8
    //   2575: fadd
    //   2576: dup_x1
    //   2577: putfield rotateAngleY : F
    //   2580: putfield rotateAngleY : F
    //   2583: aload_0
    //   2584: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2587: aload_0
    //   2588: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2591: aload_0
    //   2592: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2595: getfield rotationPointZ : F
    //   2598: aload_0
    //   2599: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2602: getfield rotateAngleY : F
    //   2605: f2d
    //   2606: invokestatic cos : (D)D
    //   2609: d2f
    //   2610: ldc_w 43.0
    //   2613: fmul
    //   2614: fadd
    //   2615: dup_x1
    //   2616: putfield rotationPointZ : F
    //   2619: putfield rotationPointZ : F
    //   2622: aload_0
    //   2623: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2626: aload_0
    //   2627: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2630: aload_0
    //   2631: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2634: getfield rotationPointX : F
    //   2637: aload_0
    //   2638: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2641: getfield rotateAngleY : F
    //   2644: f2d
    //   2645: invokestatic sin : (D)D
    //   2648: d2f
    //   2649: ldc_w 43.0
    //   2652: fmul
    //   2653: fadd
    //   2654: dup_x1
    //   2655: putfield rotationPointX : F
    //   2658: putfield rotationPointX : F
    //   2661: aload_0
    //   2662: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2665: aload_0
    //   2666: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2669: aload_0
    //   2670: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2673: getfield rotateAngleY : F
    //   2676: fload #8
    //   2678: fadd
    //   2679: dup_x1
    //   2680: putfield rotateAngleY : F
    //   2683: putfield rotateAngleY : F
    //   2686: aload_0
    //   2687: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   2690: aload_0
    //   2691: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2694: getfield rotationPointZ : F
    //   2697: aload_0
    //   2698: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2701: getfield rotateAngleY : F
    //   2704: f2d
    //   2705: invokestatic cos : (D)D
    //   2708: d2f
    //   2709: ldc_w 58.0
    //   2712: fmul
    //   2713: fadd
    //   2714: putfield rotationPointZ : F
    //   2717: aload_0
    //   2718: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   2721: aload_0
    //   2722: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2725: getfield rotationPointX : F
    //   2728: aload_0
    //   2729: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2732: getfield rotateAngleY : F
    //   2735: f2d
    //   2736: invokestatic sin : (D)D
    //   2739: d2f
    //   2740: ldc_w 58.0
    //   2743: fmul
    //   2744: fadd
    //   2745: putfield rotationPointX : F
    //   2748: aload_0
    //   2749: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   2752: aload_0
    //   2753: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   2756: getfield rotateAngleY : F
    //   2759: fload #8
    //   2761: fadd
    //   2762: putfield rotateAngleY : F
    //   2765: aload #9
    //   2767: invokevirtual getAttacking : ()I
    //   2770: ifeq -> 3037
    //   2773: fload #4
    //   2775: ldc_w 0.3
    //   2778: fmul
    //   2779: aload_0
    //   2780: getfield wingspeed : F
    //   2783: fmul
    //   2784: invokestatic sin : (F)F
    //   2787: ldc_w 3.1415927
    //   2790: fmul
    //   2791: ldc_w 0.25
    //   2794: fmul
    //   2795: fstore #13
    //   2797: fload #4
    //   2799: ldc_w 0.2
    //   2802: fmul
    //   2803: aload_0
    //   2804: getfield wingspeed : F
    //   2807: fmul
    //   2808: invokestatic sin : (F)F
    //   2811: ldc_w 3.1415927
    //   2814: fmul
    //   2815: ldc_w 0.25
    //   2818: fmul
    //   2819: fstore #14
    //   2821: fload #4
    //   2823: ldc_w 0.85
    //   2826: fmul
    //   2827: aload_0
    //   2828: getfield wingspeed : F
    //   2831: fmul
    //   2832: invokestatic sin : (F)F
    //   2835: ldc_w 3.1415927
    //   2838: fmul
    //   2839: ldc_w 0.12
    //   2842: fmul
    //   2843: fstore #15
    //   2845: fload #4
    //   2847: ldc_w 0.32
    //   2850: fmul
    //   2851: aload_0
    //   2852: getfield wingspeed : F
    //   2855: fmul
    //   2856: invokestatic sin : (F)F
    //   2859: ldc_w 3.1415927
    //   2862: fmul
    //   2863: ldc_w 0.25
    //   2866: fmul
    //   2867: fstore #19
    //   2869: fload #4
    //   2871: ldc_w 0.21
    //   2874: fmul
    //   2875: aload_0
    //   2876: getfield wingspeed : F
    //   2879: fmul
    //   2880: invokestatic sin : (F)F
    //   2883: ldc_w 3.1415927
    //   2886: fmul
    //   2887: ldc_w 0.25
    //   2890: fmul
    //   2891: fstore #20
    //   2893: fload #4
    //   2895: ldc_w 0.95
    //   2898: fmul
    //   2899: aload_0
    //   2900: getfield wingspeed : F
    //   2903: fmul
    //   2904: invokestatic sin : (F)F
    //   2907: ldc_w 3.1415927
    //   2910: fmul
    //   2911: ldc_w 0.12
    //   2914: fmul
    //   2915: fstore #21
    //   2917: fload #4
    //   2919: ldc_w 0.28
    //   2922: fmul
    //   2923: aload_0
    //   2924: getfield wingspeed : F
    //   2927: fmul
    //   2928: invokestatic sin : (F)F
    //   2931: ldc_w 3.1415927
    //   2934: fmul
    //   2935: ldc_w 0.25
    //   2938: fmul
    //   2939: fstore #16
    //   2941: fload #4
    //   2943: ldc_w 0.19
    //   2946: fmul
    //   2947: aload_0
    //   2948: getfield wingspeed : F
    //   2951: fmul
    //   2952: invokestatic sin : (F)F
    //   2955: ldc_w 3.1415927
    //   2958: fmul
    //   2959: ldc_w 0.25
    //   2962: fmul
    //   2963: fstore #17
    //   2965: fload #4
    //   2967: ldc_w 0.75
    //   2970: fmul
    //   2971: aload_0
    //   2972: getfield wingspeed : F
    //   2975: fmul
    //   2976: invokestatic sin : (F)F
    //   2979: ldc_w 3.1415927
    //   2982: fmul
    //   2983: ldc_w 0.12
    //   2986: fmul
    //   2987: fstore #18
    //   2989: fload #15
    //   2991: ldc_w 0.5
    //   2994: fadd
    //   2995: fstore #15
    //   2997: fload #15
    //   2999: fload #14
    //   3001: fadd
    //   3002: fstore #15
    //   3004: fload #18
    //   3006: ldc_w 0.5
    //   3009: fadd
    //   3010: fstore #18
    //   3012: fload #18
    //   3014: fload #17
    //   3016: fadd
    //   3017: fstore #18
    //   3019: fload #21
    //   3021: ldc_w 0.5
    //   3024: fadd
    //   3025: fstore #21
    //   3027: fload #21
    //   3029: fload #20
    //   3031: fadd
    //   3032: fstore #21
    //   3034: goto -> 3298
    //   3037: fload #4
    //   3039: ldc_w 0.17
    //   3042: fmul
    //   3043: aload_0
    //   3044: getfield wingspeed : F
    //   3047: fmul
    //   3048: invokestatic sin : (F)F
    //   3051: ldc_w 3.1415927
    //   3054: fmul
    //   3055: ldc_w 0.08
    //   3058: fmul
    //   3059: fstore #13
    //   3061: fload #4
    //   3063: ldc_w 0.13
    //   3066: fmul
    //   3067: aload_0
    //   3068: getfield wingspeed : F
    //   3071: fmul
    //   3072: invokestatic sin : (F)F
    //   3075: ldc_w 3.1415927
    //   3078: fmul
    //   3079: ldc_w 0.1
    //   3082: fmul
    //   3083: fstore #14
    //   3085: fload #4
    //   3087: ldc_w 0.45
    //   3090: fmul
    //   3091: aload_0
    //   3092: getfield wingspeed : F
    //   3095: fmul
    //   3096: invokestatic sin : (F)F
    //   3099: ldc_w 3.1415927
    //   3102: fmul
    //   3103: ldc_w 0.04
    //   3106: fmul
    //   3107: fstore #15
    //   3109: fload #4
    //   3111: ldc_w 0.19
    //   3114: fmul
    //   3115: aload_0
    //   3116: getfield wingspeed : F
    //   3119: fmul
    //   3120: invokestatic sin : (F)F
    //   3123: ldc_w 3.1415927
    //   3126: fmul
    //   3127: ldc_w 0.08
    //   3130: fmul
    //   3131: fstore #19
    //   3133: fload #4
    //   3135: ldc_w 0.12
    //   3138: fmul
    //   3139: aload_0
    //   3140: getfield wingspeed : F
    //   3143: fmul
    //   3144: invokestatic sin : (F)F
    //   3147: ldc_w 3.1415927
    //   3150: fmul
    //   3151: ldc_w 0.1
    //   3154: fmul
    //   3155: fstore #20
    //   3157: fload #4
    //   3159: ldc_w 0.55
    //   3162: fmul
    //   3163: aload_0
    //   3164: getfield wingspeed : F
    //   3167: fmul
    //   3168: invokestatic sin : (F)F
    //   3171: ldc_w 3.1415927
    //   3174: fmul
    //   3175: ldc_w 0.04
    //   3178: fmul
    //   3179: fstore #21
    //   3181: fload #4
    //   3183: ldc_w 0.13
    //   3186: fmul
    //   3187: aload_0
    //   3188: getfield wingspeed : F
    //   3191: fmul
    //   3192: invokestatic sin : (F)F
    //   3195: ldc_w 3.1415927
    //   3198: fmul
    //   3199: ldc_w 0.08
    //   3202: fmul
    //   3203: fstore #16
    //   3205: fload #4
    //   3207: ldc_w 0.08
    //   3210: fmul
    //   3211: aload_0
    //   3212: getfield wingspeed : F
    //   3215: fmul
    //   3216: invokestatic sin : (F)F
    //   3219: ldc_w 3.1415927
    //   3222: fmul
    //   3223: ldc_w 0.1
    //   3226: fmul
    //   3227: fstore #17
    //   3229: fload #4
    //   3231: ldc_w 0.65
    //   3234: fmul
    //   3235: aload_0
    //   3236: getfield wingspeed : F
    //   3239: fmul
    //   3240: invokestatic sin : (F)F
    //   3243: ldc_w 3.1415927
    //   3246: fmul
    //   3247: ldc_w 0.04
    //   3250: fmul
    //   3251: fstore #18
    //   3253: fload #15
    //   3255: ldc_w 0.25
    //   3258: fadd
    //   3259: fstore #15
    //   3261: fload #15
    //   3263: fload #14
    //   3265: fadd
    //   3266: fstore #15
    //   3268: fload #18
    //   3270: ldc_w 0.25
    //   3273: fadd
    //   3274: fstore #18
    //   3276: fload #18
    //   3278: fload #17
    //   3280: fadd
    //   3281: fstore #18
    //   3283: fload #21
    //   3285: ldc_w 0.25
    //   3288: fadd
    //   3289: fstore #21
    //   3291: fload #21
    //   3293: fload #20
    //   3295: fadd
    //   3296: fstore #21
    //   3298: fload #13
    //   3300: fload #16
    //   3302: fcmpl
    //   3303: ifle -> 3310
    //   3306: fload #16
    //   3308: fstore #13
    //   3310: fload #19
    //   3312: fload #16
    //   3314: fcmpg
    //   3315: ifge -> 3322
    //   3318: fload #16
    //   3320: fstore #19
    //   3322: aload_0
    //   3323: fload #13
    //   3325: fload #14
    //   3327: fload #15
    //   3329: invokespecial moveLeftHead : (FFF)V
    //   3332: aload_0
    //   3333: fload #16
    //   3335: fload #17
    //   3337: fload #18
    //   3339: invokespecial moveCenterHead : (FFF)V
    //   3342: aload_0
    //   3343: fload #19
    //   3345: fload #20
    //   3347: fload #21
    //   3349: invokespecial moveRightHead : (FFF)V
    //   3352: aload_0
    //   3353: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3356: fload #7
    //   3358: invokevirtual render : (F)V
    //   3361: aload_0
    //   3362: getfield LThigh : Lnet/minecraft/client/model/ModelRenderer;
    //   3365: fload #7
    //   3367: invokevirtual render : (F)V
    //   3370: aload_0
    //   3371: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   3374: fload #7
    //   3376: invokevirtual render : (F)V
    //   3379: aload_0
    //   3380: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
    //   3383: fload #7
    //   3385: invokevirtual render : (F)V
    //   3388: aload_0
    //   3389: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3392: fload #7
    //   3394: invokevirtual render : (F)V
    //   3397: aload_0
    //   3398: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3401: fload #7
    //   3403: invokevirtual render : (F)V
    //   3406: aload_0
    //   3407: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3410: fload #7
    //   3412: invokevirtual render : (F)V
    //   3415: aload_0
    //   3416: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3419: fload #7
    //   3421: invokevirtual render : (F)V
    //   3424: aload_0
    //   3425: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3428: fload #7
    //   3430: invokevirtual render : (F)V
    //   3433: aload_0
    //   3434: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3437: fload #7
    //   3439: invokevirtual render : (F)V
    //   3442: aload_0
    //   3443: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3446: fload #7
    //   3448: invokevirtual render : (F)V
    //   3451: aload_0
    //   3452: getfield Body1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3455: fload #7
    //   3457: invokevirtual render : (F)V
    //   3460: aload_0
    //   3461: getfield Chest : Lnet/minecraft/client/model/ModelRenderer;
    //   3464: fload #7
    //   3466: invokevirtual render : (F)V
    //   3469: aload_0
    //   3470: getfield NeckC1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3473: fload #7
    //   3475: invokevirtual render : (F)V
    //   3478: aload_0
    //   3479: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   3482: fload #7
    //   3484: invokevirtual render : (F)V
    //   3487: aload_0
    //   3488: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   3491: fload #7
    //   3493: invokevirtual render : (F)V
    //   3496: aload_0
    //   3497: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3500: fload #7
    //   3502: invokevirtual render : (F)V
    //   3505: aload_0
    //   3506: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3509: fload #7
    //   3511: invokevirtual render : (F)V
    //   3514: aload_0
    //   3515: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3518: fload #7
    //   3520: invokevirtual render : (F)V
    //   3523: aload_0
    //   3524: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3527: fload #7
    //   3529: invokevirtual render : (F)V
    //   3532: aload_0
    //   3533: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   3536: fload #7
    //   3538: invokevirtual render : (F)V
    //   3541: aload_0
    //   3542: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3545: fload #7
    //   3547: invokevirtual render : (F)V
    //   3550: aload_0
    //   3551: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   3554: fload #7
    //   3556: invokevirtual render : (F)V
    //   3559: aload_0
    //   3560: getfield NeckL1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3563: fload #7
    //   3565: invokevirtual render : (F)V
    //   3568: aload_0
    //   3569: getfield NeckR1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3572: fload #7
    //   3574: invokevirtual render : (F)V
    //   3577: aload_0
    //   3578: getfield RThigh : Lnet/minecraft/client/model/ModelRenderer;
    //   3581: fload #7
    //   3583: invokevirtual render : (F)V
    //   3586: aload_0
    //   3587: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   3590: fload #7
    //   3592: invokevirtual render : (F)V
    //   3595: aload_0
    //   3596: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
    //   3599: fload #7
    //   3601: invokevirtual render : (F)V
    //   3604: aload_0
    //   3605: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
    //   3608: fload #7
    //   3610: invokevirtual render : (F)V
    //   3613: aload_0
    //   3614: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
    //   3617: fload #7
    //   3619: invokevirtual render : (F)V
    //   3622: aload_0
    //   3623: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3626: fload #7
    //   3628: invokevirtual render : (F)V
    //   3631: aload_0
    //   3632: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3635: fload #7
    //   3637: invokevirtual render : (F)V
    //   3640: aload_0
    //   3641: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3644: fload #7
    //   3646: invokevirtual render : (F)V
    //   3649: aload_0
    //   3650: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3653: fload #7
    //   3655: invokevirtual render : (F)V
    //   3658: aload_0
    //   3659: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3662: fload #7
    //   3664: invokevirtual render : (F)V
    //   3667: aload_0
    //   3668: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3671: fload #7
    //   3673: invokevirtual render : (F)V
    //   3676: aload_0
    //   3677: getfield NeckL2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3680: fload #7
    //   3682: invokevirtual render : (F)V
    //   3685: aload_0
    //   3686: getfield NeckC2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3689: fload #7
    //   3691: invokevirtual render : (F)V
    //   3694: aload_0
    //   3695: getfield NeckR2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3698: fload #7
    //   3700: invokevirtual render : (F)V
    //   3703: aload_0
    //   3704: getfield NeckL3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3707: fload #7
    //   3709: invokevirtual render : (F)V
    //   3712: aload_0
    //   3713: getfield NeckC3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3716: fload #7
    //   3718: invokevirtual render : (F)V
    //   3721: aload_0
    //   3722: getfield NeckR3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3725: fload #7
    //   3727: invokevirtual render : (F)V
    //   3730: aload_0
    //   3731: getfield NeckL4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3734: fload #7
    //   3736: invokevirtual render : (F)V
    //   3739: aload_0
    //   3740: getfield LHead1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3743: fload #7
    //   3745: invokevirtual render : (F)V
    //   3748: aload_0
    //   3749: getfield LHead2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3752: fload #7
    //   3754: invokevirtual render : (F)V
    //   3757: aload_0
    //   3758: getfield LHead3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3761: fload #7
    //   3763: invokevirtual render : (F)V
    //   3766: aload_0
    //   3767: getfield LJaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3770: fload #7
    //   3772: invokevirtual render : (F)V
    //   3775: aload_0
    //   3776: getfield LJaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3779: fload #7
    //   3781: invokevirtual render : (F)V
    //   3784: aload_0
    //   3785: getfield LJaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3788: fload #7
    //   3790: invokevirtual render : (F)V
    //   3793: aload_0
    //   3794: getfield LTooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3797: fload #7
    //   3799: invokevirtual render : (F)V
    //   3802: aload_0
    //   3803: getfield LTooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3806: fload #7
    //   3808: invokevirtual render : (F)V
    //   3811: aload_0
    //   3812: getfield LTooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3815: fload #7
    //   3817: invokevirtual render : (F)V
    //   3820: aload_0
    //   3821: getfield LTooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3824: fload #7
    //   3826: invokevirtual render : (F)V
    //   3829: aload_0
    //   3830: getfield NeckC4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3833: fload #7
    //   3835: invokevirtual render : (F)V
    //   3838: aload_0
    //   3839: getfield NeckR4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3842: fload #7
    //   3844: invokevirtual render : (F)V
    //   3847: aload_0
    //   3848: getfield CHead1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3851: fload #7
    //   3853: invokevirtual render : (F)V
    //   3856: aload_0
    //   3857: getfield RHead1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3860: fload #7
    //   3862: invokevirtual render : (F)V
    //   3865: aload_0
    //   3866: getfield CHead2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3869: fload #7
    //   3871: invokevirtual render : (F)V
    //   3874: aload_0
    //   3875: getfield RHead2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3878: fload #7
    //   3880: invokevirtual render : (F)V
    //   3883: aload_0
    //   3884: getfield CHead3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3887: fload #7
    //   3889: invokevirtual render : (F)V
    //   3892: aload_0
    //   3893: getfield RHead3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3896: fload #7
    //   3898: invokevirtual render : (F)V
    //   3901: aload_0
    //   3902: getfield CJaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3905: fload #7
    //   3907: invokevirtual render : (F)V
    //   3910: aload_0
    //   3911: getfield CJaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3914: fload #7
    //   3916: invokevirtual render : (F)V
    //   3919: aload_0
    //   3920: getfield CJaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3923: fload #7
    //   3925: invokevirtual render : (F)V
    //   3928: aload_0
    //   3929: getfield RJaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3932: fload #7
    //   3934: invokevirtual render : (F)V
    //   3937: aload_0
    //   3938: getfield RJaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3941: fload #7
    //   3943: invokevirtual render : (F)V
    //   3946: aload_0
    //   3947: getfield RJaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3950: fload #7
    //   3952: invokevirtual render : (F)V
    //   3955: aload_0
    //   3956: getfield CTooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3959: fload #7
    //   3961: invokevirtual render : (F)V
    //   3964: aload_0
    //   3965: getfield CTooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3968: fload #7
    //   3970: invokevirtual render : (F)V
    //   3973: aload_0
    //   3974: getfield CTooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3977: fload #7
    //   3979: invokevirtual render : (F)V
    //   3982: aload_0
    //   3983: getfield CTooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3986: fload #7
    //   3988: invokevirtual render : (F)V
    //   3991: aload_0
    //   3992: getfield RTooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3995: fload #7
    //   3997: invokevirtual render : (F)V
    //   4000: aload_0
    //   4001: getfield RTooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4004: fload #7
    //   4006: invokevirtual render : (F)V
    //   4009: aload_0
    //   4010: getfield RTooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4013: fload #7
    //   4015: invokevirtual render : (F)V
    //   4018: aload_0
    //   4019: getfield RTooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4022: fload #7
    //   4024: invokevirtual render : (F)V
    //   4027: aload_0
    //   4028: getfield LLEye : Lnet/minecraft/client/model/ModelRenderer;
    //   4031: fload #7
    //   4033: invokevirtual render : (F)V
    //   4036: aload_0
    //   4037: getfield LREye : Lnet/minecraft/client/model/ModelRenderer;
    //   4040: fload #7
    //   4042: invokevirtual render : (F)V
    //   4045: aload_0
    //   4046: getfield CLEye : Lnet/minecraft/client/model/ModelRenderer;
    //   4049: fload #7
    //   4051: invokevirtual render : (F)V
    //   4054: aload_0
    //   4055: getfield CREye : Lnet/minecraft/client/model/ModelRenderer;
    //   4058: fload #7
    //   4060: invokevirtual render : (F)V
    //   4063: aload_0
    //   4064: getfield RLEye : Lnet/minecraft/client/model/ModelRenderer;
    //   4067: fload #7
    //   4069: invokevirtual render : (F)V
    //   4072: aload_0
    //   4073: getfield RREye : Lnet/minecraft/client/model/ModelRenderer;
    //   4076: fload #7
    //   4078: invokevirtual render : (F)V
    //   4081: aload_0
    //   4082: getfield LHeadMane : Lnet/minecraft/client/model/ModelRenderer;
    //   4085: fload #7
    //   4087: invokevirtual render : (F)V
    //   4090: aload_0
    //   4091: getfield CHeadMane : Lnet/minecraft/client/model/ModelRenderer;
    //   4094: fload #7
    //   4096: invokevirtual render : (F)V
    //   4099: aload_0
    //   4100: getfield RHeadMane : Lnet/minecraft/client/model/ModelRenderer;
    //   4103: fload #7
    //   4105: invokevirtual render : (F)V
    //   4108: aload_0
    //   4109: getfield LLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4112: fload #7
    //   4114: invokevirtual render : (F)V
    //   4117: aload_0
    //   4118: getfield LRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4121: fload #7
    //   4123: invokevirtual render : (F)V
    //   4126: aload_0
    //   4127: getfield CLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4130: fload #7
    //   4132: invokevirtual render : (F)V
    //   4135: aload_0
    //   4136: getfield CRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4139: fload #7
    //   4141: invokevirtual render : (F)V
    //   4144: aload_0
    //   4145: getfield RLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4148: fload #7
    //   4150: invokevirtual render : (F)V
    //   4153: aload_0
    //   4154: getfield RRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
    //   4157: fload #7
    //   4159: invokevirtual render : (F)V
    //   4162: aload_0
    //   4163: getfield Back1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4166: fload #7
    //   4168: invokevirtual render : (F)V
    //   4171: aload_0
    //   4172: getfield Back2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4175: fload #7
    //   4177: invokevirtual render : (F)V
    //   4180: aload_0
    //   4181: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4184: fload #7
    //   4186: invokevirtual render : (F)V
    //   4189: aload_0
    //   4190: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4193: fload #7
    //   4195: invokevirtual render : (F)V
    //   4198: aload_0
    //   4199: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4202: fload #7
    //   4204: invokevirtual render : (F)V
    //   4207: aload_0
    //   4208: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4211: fload #7
    //   4213: invokevirtual render : (F)V
    //   4216: aload_0
    //   4217: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4220: fload #7
    //   4222: invokevirtual render : (F)V
    //   4225: aload_0
    //   4226: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4229: fload #7
    //   4231: invokevirtual render : (F)V
    //   4234: aload_0
    //   4235: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4238: fload #7
    //   4240: invokevirtual render : (F)V
    //   4243: aload_0
    //   4244: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4247: fload #7
    //   4249: invokevirtual render : (F)V
    //   4252: aload_0
    //   4253: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4256: fload #7
    //   4258: invokevirtual render : (F)V
    //   4261: aload_0
    //   4262: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4265: fload #7
    //   4267: invokevirtual render : (F)V
    //   4270: aload_0
    //   4271: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4274: fload #7
    //   4276: invokevirtual render : (F)V
    //   4279: aload_0
    //   4280: getfield Ridge1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4283: fload #7
    //   4285: invokevirtual render : (F)V
    //   4288: aload_0
    //   4289: getfield Ridge2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4292: fload #7
    //   4294: invokevirtual render : (F)V
    //   4297: aload_0
    //   4298: getfield Ridge3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4301: fload #7
    //   4303: invokevirtual render : (F)V
    //   4306: aload_0
    //   4307: getfield Ridge4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4310: fload #7
    //   4312: invokevirtual render : (F)V
    //   4315: aload_0
    //   4316: getfield Ridge5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4319: fload #7
    //   4321: invokevirtual render : (F)V
    //   4324: aload_0
    //   4325: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4328: fload #7
    //   4330: invokevirtual render : (F)V
    //   4333: invokestatic glPushMatrix : ()V
    //   4336: sipush #2977
    //   4339: invokestatic glEnable : (I)V
    //   4342: sipush #3042
    //   4345: invokestatic glEnable : (I)V
    //   4348: sipush #770
    //   4351: sipush #771
    //   4354: invokestatic glBlendFunc : (II)V
    //   4357: ldc_w 0.75
    //   4360: ldc_w 0.75
    //   4363: ldc_w 0.75
    //   4366: ldc_w 0.55
    //   4369: invokestatic glColor4f : (FFFF)V
    //   4372: aload_0
    //   4373: getfield Lwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4376: fload #7
    //   4378: invokevirtual render : (F)V
    //   4381: aload_0
    //   4382: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4385: fload #7
    //   4387: invokevirtual render : (F)V
    //   4390: aload_0
    //   4391: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4394: fload #7
    //   4396: invokevirtual render : (F)V
    //   4399: aload_0
    //   4400: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4403: fload #7
    //   4405: invokevirtual render : (F)V
    //   4408: aload_0
    //   4409: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   4412: fload #7
    //   4414: invokevirtual render : (F)V
    //   4417: aload_0
    //   4418: getfield Rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4421: fload #7
    //   4423: invokevirtual render : (F)V
    //   4426: aload_0
    //   4427: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4430: fload #7
    //   4432: invokevirtual render : (F)V
    //   4435: aload_0
    //   4436: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4439: fload #7
    //   4441: invokevirtual render : (F)V
    //   4444: aload_0
    //   4445: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4448: fload #7
    //   4450: invokevirtual render : (F)V
    //   4453: aload_0
    //   4454: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
    //   4457: fload #7
    //   4459: invokevirtual render : (F)V
    //   4462: sipush #3042
    //   4465: invokestatic glDisable : (I)V
    //   4468: invokestatic glPopMatrix : ()V
    //   4471: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #863	-> 0
    //   #864	-> 3
    //   #865	-> 9
    //   #866	-> 14
    //   #867	-> 19
    //   #868	-> 23
    //   #869	-> 26
    //   #870	-> 29
    //   #871	-> 32
    //   #872	-> 35
    //   #873	-> 38
    //   #874	-> 41
    //   #875	-> 44
    //   #876	-> 47
    //   #878	-> 50
    //   #879	-> 65
    //   #881	-> 80
    //   #882	-> 88
    //   #884	-> 115
    //   #888	-> 139
    //   #889	-> 148
    //   #890	-> 157
    //   #891	-> 174
    //   #892	-> 205
    //   #893	-> 236
    //   #894	-> 250
    //   #895	-> 264
    //   #896	-> 278
    //   #897	-> 295
    //   #898	-> 326
    //   #899	-> 357
    //   #900	-> 371
    //   #901	-> 385
    //   #902	-> 399
    //   #903	-> 421
    //   #904	-> 443
    //   #905	-> 465
    //   #906	-> 487
    //   #907	-> 513
    //   #909	-> 539
    //   #910	-> 549
    //   #911	-> 559
    //   #912	-> 577
    //   #913	-> 608
    //   #914	-> 639
    //   #915	-> 653
    //   #916	-> 667
    //   #917	-> 681
    //   #918	-> 699
    //   #919	-> 730
    //   #920	-> 761
    //   #921	-> 775
    //   #922	-> 789
    //   #923	-> 803
    //   #924	-> 825
    //   #925	-> 847
    //   #926	-> 869
    //   #927	-> 891
    //   #928	-> 917
    //   #930	-> 943
    //   #931	-> 951
    //   #933	-> 978
    //   #936	-> 981
    //   #938	-> 1002
    //   #939	-> 1015
    //   #940	-> 1028
    //   #941	-> 1041
    //   #942	-> 1054
    //   #943	-> 1067
    //   #945	-> 1080
    //   #946	-> 1093
    //   #947	-> 1106
    //   #948	-> 1119
    //   #949	-> 1132
    //   #950	-> 1145
    //   #952	-> 1158
    //   #953	-> 1166
    //   #955	-> 1193
    //   #958	-> 1196
    //   #959	-> 1221
    //   #960	-> 1244
    //   #961	-> 1283
    //   #962	-> 1322
    //   #963	-> 1365
    //   #964	-> 1408
    //   #965	-> 1430
    //   #966	-> 1452
    //   #967	-> 1474
    //   #968	-> 1496
    //   #969	-> 1531
    //   #971	-> 1566
    //   #972	-> 1591
    //   #973	-> 1614
    //   #974	-> 1653
    //   #975	-> 1692
    //   #976	-> 1735
    //   #977	-> 1778
    //   #978	-> 1800
    //   #979	-> 1822
    //   #980	-> 1844
    //   #981	-> 1866
    //   #982	-> 1901
    //   #985	-> 1936
    //   #986	-> 1944
    //   #987	-> 1949
    //   #990	-> 1954
    //   #991	-> 1983
    //   #993	-> 2005
    //   #994	-> 2036
    //   #995	-> 2069
    //   #997	-> 2099
    //   #998	-> 2130
    //   #999	-> 2161
    //   #1001	-> 2193
    //   #1002	-> 2224
    //   #1003	-> 2255
    //   #1005	-> 2289
    //   #1006	-> 2318
    //   #1007	-> 2324
    //   #1008	-> 2355
    //   #1009	-> 2386
    //   #1011	-> 2403
    //   #1012	-> 2434
    //   #1013	-> 2465
    //   #1015	-> 2482
    //   #1016	-> 2520
    //   #1017	-> 2558
    //   #1019	-> 2583
    //   #1020	-> 2622
    //   #1021	-> 2661
    //   #1023	-> 2686
    //   #1024	-> 2717
    //   #1025	-> 2748
    //   #1029	-> 2765
    //   #1030	-> 2773
    //   #1031	-> 2797
    //   #1032	-> 2821
    //   #1034	-> 2845
    //   #1035	-> 2869
    //   #1036	-> 2893
    //   #1038	-> 2917
    //   #1039	-> 2941
    //   #1040	-> 2965
    //   #1042	-> 2989
    //   #1043	-> 2997
    //   #1044	-> 3004
    //   #1045	-> 3012
    //   #1046	-> 3019
    //   #1047	-> 3027
    //   #1049	-> 3037
    //   #1050	-> 3061
    //   #1051	-> 3085
    //   #1053	-> 3109
    //   #1054	-> 3133
    //   #1055	-> 3157
    //   #1057	-> 3181
    //   #1058	-> 3205
    //   #1059	-> 3229
    //   #1061	-> 3253
    //   #1062	-> 3261
    //   #1063	-> 3268
    //   #1064	-> 3276
    //   #1065	-> 3283
    //   #1066	-> 3291
    //   #1070	-> 3298
    //   #1071	-> 3310
    //   #1074	-> 3322
    //   #1075	-> 3332
    //   #1076	-> 3342
    //   #1083	-> 3352
    //   #1084	-> 3361
    //   #1085	-> 3370
    //   #1086	-> 3379
    //   #1087	-> 3388
    //   #1088	-> 3397
    //   #1089	-> 3406
    //   #1090	-> 3415
    //   #1091	-> 3424
    //   #1092	-> 3433
    //   #1093	-> 3442
    //   #1094	-> 3451
    //   #1095	-> 3460
    //   #1096	-> 3469
    //   #1097	-> 3478
    //   #1098	-> 3487
    //   #1099	-> 3496
    //   #1100	-> 3505
    //   #1101	-> 3514
    //   #1102	-> 3523
    //   #1103	-> 3532
    //   #1104	-> 3541
    //   #1105	-> 3550
    //   #1106	-> 3559
    //   #1107	-> 3568
    //   #1108	-> 3577
    //   #1109	-> 3586
    //   #1110	-> 3595
    //   #1111	-> 3604
    //   #1112	-> 3613
    //   #1113	-> 3622
    //   #1114	-> 3631
    //   #1115	-> 3640
    //   #1116	-> 3649
    //   #1117	-> 3658
    //   #1118	-> 3667
    //   #1119	-> 3676
    //   #1120	-> 3685
    //   #1121	-> 3694
    //   #1122	-> 3703
    //   #1123	-> 3712
    //   #1124	-> 3721
    //   #1125	-> 3730
    //   #1126	-> 3739
    //   #1127	-> 3748
    //   #1128	-> 3757
    //   #1129	-> 3766
    //   #1130	-> 3775
    //   #1131	-> 3784
    //   #1132	-> 3793
    //   #1133	-> 3802
    //   #1134	-> 3811
    //   #1135	-> 3820
    //   #1136	-> 3829
    //   #1137	-> 3838
    //   #1138	-> 3847
    //   #1139	-> 3856
    //   #1140	-> 3865
    //   #1141	-> 3874
    //   #1142	-> 3883
    //   #1143	-> 3892
    //   #1144	-> 3901
    //   #1145	-> 3910
    //   #1146	-> 3919
    //   #1147	-> 3928
    //   #1148	-> 3937
    //   #1149	-> 3946
    //   #1150	-> 3955
    //   #1151	-> 3964
    //   #1152	-> 3973
    //   #1153	-> 3982
    //   #1154	-> 3991
    //   #1155	-> 4000
    //   #1156	-> 4009
    //   #1157	-> 4018
    //   #1158	-> 4027
    //   #1159	-> 4036
    //   #1160	-> 4045
    //   #1161	-> 4054
    //   #1162	-> 4063
    //   #1163	-> 4072
    //   #1164	-> 4081
    //   #1165	-> 4090
    //   #1166	-> 4099
    //   #1167	-> 4108
    //   #1168	-> 4117
    //   #1169	-> 4126
    //   #1170	-> 4135
    //   #1171	-> 4144
    //   #1172	-> 4153
    //   #1173	-> 4162
    //   #1174	-> 4171
    //   #1175	-> 4180
    //   #1176	-> 4189
    //   #1177	-> 4198
    //   #1178	-> 4207
    //   #1179	-> 4216
    //   #1180	-> 4225
    //   #1181	-> 4234
    //   #1182	-> 4243
    //   #1183	-> 4252
    //   #1184	-> 4261
    //   #1185	-> 4270
    //   #1186	-> 4279
    //   #1187	-> 4288
    //   #1188	-> 4297
    //   #1189	-> 4306
    //   #1190	-> 4315
    //   #1191	-> 4324
    //   #1193	-> 4333
    //   #1194	-> 4336
    //   #1195	-> 4342
    //   #1196	-> 4348
    //   #1198	-> 4357
    //   #1199	-> 4372
    //   #1200	-> 4381
    //   #1201	-> 4390
    //   #1202	-> 4399
    //   #1203	-> 4408
    //   #1204	-> 4417
    //   #1205	-> 4426
    //   #1206	-> 4435
    //   #1207	-> 4444
    //   #1208	-> 4453
    //   #1209	-> 4462
    //   #1210	-> 4468
    //   #1213	-> 4471
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	4472	0	this	Ldanger/orespawn/ModelTheKing;
    //   0	4472	1	entity	Lnet/minecraft/entity/Entity;
    //   0	4472	2	f	F
    //   0	4472	3	f1	F
    //   0	4472	4	f2	F
    //   0	4472	5	f3	F
    //   0	4472	6	f4	F
    //   0	4472	7	f5	F
    //   3	4469	8	newangle	F
    //   9	4463	9	k	Ldanger/orespawn/TheKing;
    //   14	4458	10	tailspeed	F
    //   19	4453	11	tailamp	F
    //   23	4449	12	pi4	F
    //   26	4446	13	Lheadlr	F
    //   29	4443	14	Lheadud	F
    //   32	4440	15	Ljawangle	F
    //   35	4437	16	Cheadlr	F
    //   38	4434	17	Cheadud	F
    //   41	4431	18	Cjawangle	F
    //   44	4428	19	Rheadlr	F
    //   47	4425	20	Rheadud	F
    //   50	4422	21	Rjawangle	F
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void moveLeftHead(float Lheadlr, float Lheadud, float Ljawangle) {
    this.LJaw1.rotateAngleX = Ljawangle;
    this.LJaw2.rotateAngleX = Ljawangle;
    this.LJaw3.rotateAngleX = Ljawangle;
    this.LTooth1.rotateAngleX = Ljawangle;
    this.LTooth2.rotateAngleX = Ljawangle;
    this.LTooth3.rotateAngleX = Ljawangle;
    this.LTooth4.rotateAngleX = Ljawangle;
    this.NeckL1.rotateAngleY = Lheadlr * 0.125F;
    this.NeckL1.rotationPointZ -= (float)Math.cos(this.NeckL1.rotateAngleY) * 20.0F;
    this.NeckL1.rotationPointX -= (float)Math.sin(this.NeckL1.rotateAngleY) * 20.0F;
    this.NeckL2.rotateAngleY = Lheadlr * 0.25F;
    this.NeckL2.rotationPointZ -= (float)Math.cos(this.NeckL2.rotateAngleY) * 36.0F;
    this.NeckL2.rotationPointX -= (float)Math.sin(this.NeckL2.rotateAngleY) * 36.0F;
    this.NeckL3.rotateAngleY = Lheadlr * 0.38F;
    this.NeckL3.rotationPointZ -= (float)Math.cos(this.NeckL3.rotateAngleY) * 36.0F;
    this.NeckL3.rotationPointX -= (float)Math.sin(this.NeckL3.rotateAngleY) * 36.0F;
    this.NeckL4.rotateAngleY = Lheadlr * 0.5F;
    this.NeckL4.rotationPointZ -= (float)Math.cos(this.NeckL4.rotateAngleY) * 36.0F;
    this.NeckL4.rotationPointX -= (float)Math.sin(this.NeckL4.rotateAngleY) * 36.0F;
    this.LHead1.rotateAngleY = Lheadlr;
    this.LHead2.rotateAngleY = Lheadlr;
    this.LHead2.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHead2.rotationPointX = this.LHead1.rotationPointX;
    this.LHead3.rotateAngleY = Lheadlr;
    this.LHead3.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHead3.rotationPointX = this.LHead1.rotationPointX;
    this.LHeadMane.rotateAngleY = Lheadlr;
    this.LHeadMane.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHeadMane.rotationPointX = this.LHead1.rotationPointX;
    this.LLEye.rotateAngleY = Lheadlr;
    this.LLEye.rotationPointZ = this.LHead1.rotationPointZ;
    this.LLEye.rotationPointX = this.LHead1.rotationPointX;
    this.LREye.rotateAngleY = Lheadlr;
    this.LREye.rotationPointZ = this.LHead1.rotationPointZ;
    this.LREye.rotationPointX = this.LHead1.rotationPointX;
    this.LLNoseSpike.rotateAngleY = 0.244F + Lheadlr;
    this.LLNoseSpike.rotationPointZ = this.LHead1.rotationPointZ;
    this.LLNoseSpike.rotationPointX = this.LHead1.rotationPointX;
    this.LRNoseSpike.rotateAngleY = -0.261F + Lheadlr;
    this.LRNoseSpike.rotationPointZ = this.LHead1.rotationPointZ;
    this.LRNoseSpike.rotationPointX = this.LHead1.rotationPointX;
    this.LJaw1.rotateAngleY = Lheadlr;
    this.NeckL4.rotationPointZ -= (float)Math.cos(this.NeckL4.rotateAngleY) * 37.0F;
    this.NeckL4.rotationPointX -= (float)Math.sin(this.NeckL4.rotateAngleY) * 37.0F;
    this.LJaw2.rotateAngleY = Lheadlr;
    this.LJaw2.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LJaw2.rotationPointX = this.LJaw1.rotationPointX;
    this.LJaw3.rotateAngleY = Lheadlr;
    this.LJaw3.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LJaw3.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth1.rotateAngleY = Lheadlr;
    this.LTooth1.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth1.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth2.rotateAngleY = Lheadlr;
    this.LTooth2.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth2.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth3.rotateAngleY = Lheadlr;
    this.LTooth3.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth3.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth4.rotateAngleY = Lheadlr;
    this.LTooth4.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth4.rotationPointX = this.LJaw1.rotationPointX;
    this.NeckL1.rotateAngleX = Lheadud * 0.125F;
    this.NeckL1.rotationPointY += (float)Math.sin(this.NeckL1.rotateAngleX) * 20.0F;
    this.NeckL1.rotationPointZ += (this.NeckL2.rotationPointZ - this.NeckL1.rotationPointZ) * (float)Math.cos(this.NeckL1.rotateAngleX);
    this.NeckL1.rotationPointX += (this.NeckL2.rotationPointX - this.NeckL1.rotationPointX) * (float)Math.cos(this.NeckL1.rotateAngleX);
    this.NeckL2.rotateAngleX = Lheadud * 0.25F;
    this.NeckL2.rotationPointY += (float)Math.sin(this.NeckL2.rotateAngleX) * 36.0F;
    this.NeckL2.rotationPointZ += (this.NeckL3.rotationPointZ - this.NeckL2.rotationPointZ) * (float)Math.cos(this.NeckL2.rotateAngleX);
    this.NeckL2.rotationPointX += (this.NeckL3.rotationPointX - this.NeckL2.rotationPointX) * (float)Math.cos(this.NeckL2.rotateAngleX);
    this.NeckL3.rotateAngleX = Lheadud * 0.38F;
    this.NeckL3.rotationPointY += (float)Math.sin(this.NeckL3.rotateAngleX) * 36.0F;
    this.NeckL3.rotationPointZ += (this.NeckL4.rotationPointZ - this.NeckL3.rotationPointZ) * (float)Math.cos(this.NeckL3.rotateAngleX);
    this.NeckL3.rotationPointX += (this.NeckL4.rotationPointX - this.NeckL3.rotationPointX) * (float)Math.cos(this.NeckL3.rotateAngleX);
    this.NeckL4.rotateAngleX = Lheadud * 0.5F;
    this.NeckL4.rotationPointY += (float)Math.sin(this.NeckL4.rotateAngleX) * 36.0F;
    this.NeckL4.rotationPointZ += (this.LHead1.rotationPointZ - this.NeckL4.rotationPointZ) * (float)Math.cos(this.NeckL4.rotateAngleX);
    this.NeckL4.rotationPointX += (this.LHead1.rotationPointX - this.NeckL4.rotationPointX) * (float)Math.cos(this.NeckL4.rotateAngleX);
    this.LHead1.rotateAngleX = Lheadud;
    this.LHead2.rotateAngleX = Lheadud;
    this.LHead2.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHead2.rotationPointX = this.LHead1.rotationPointX;
    this.LHead2.rotationPointY = this.LHead1.rotationPointY;
    this.LHead3.rotateAngleX = Lheadud;
    this.LHead3.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHead3.rotationPointX = this.LHead1.rotationPointX;
    this.LHead3.rotationPointY = this.LHead1.rotationPointY;
    this.LHeadMane.rotateAngleX = 0.384F + Lheadud;
    this.LHeadMane.rotationPointZ = this.LHead1.rotationPointZ;
    this.LHeadMane.rotationPointX = this.LHead1.rotationPointX;
    this.LHeadMane.rotationPointY = this.LHead1.rotationPointY;
    this.LLEye.rotateAngleX = Lheadud;
    this.LLEye.rotationPointZ = this.LHead1.rotationPointZ;
    this.LLEye.rotationPointX = this.LHead1.rotationPointX;
    this.LLEye.rotationPointY = this.LHead1.rotationPointY;
    this.LREye.rotateAngleX = Lheadud;
    this.LREye.rotationPointZ = this.LHead1.rotationPointZ;
    this.LREye.rotationPointX = this.LHead1.rotationPointX;
    this.LREye.rotationPointY = this.LHead1.rotationPointY;
    this.LLNoseSpike.rotateAngleX = 0.244F + Lheadud;
    this.LLNoseSpike.rotationPointZ = this.LHead1.rotationPointZ;
    this.LLNoseSpike.rotationPointX = this.LHead1.rotationPointX;
    this.LLNoseSpike.rotationPointY = this.LHead1.rotationPointY;
    this.LRNoseSpike.rotateAngleX = 0.261F + Lheadud;
    this.LRNoseSpike.rotationPointZ = this.LHead1.rotationPointZ;
    this.LRNoseSpike.rotationPointX = this.LHead1.rotationPointX;
    this.LRNoseSpike.rotationPointY = this.LHead1.rotationPointY;
    this.LHead1.rotationPointY += (float)Math.cos(this.LHead1.rotateAngleX) * 14.0F;
    this.NeckL4.rotationPointZ += (this.LJaw1.rotationPointZ - this.NeckL4.rotationPointZ) * (float)Math.cos(this.NeckL4.rotateAngleX);
    this.LJaw1.rotationPointZ += (float)Math.sin(this.LHead1.rotateAngleX) * 14.0F;
    this.NeckL4.rotationPointX += (this.LJaw1.rotationPointX - this.NeckL4.rotationPointX) * (float)Math.cos(this.NeckL4.rotateAngleX);
    this.LJaw2.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LJaw2.rotationPointX = this.LJaw1.rotationPointX;
    this.LJaw2.rotationPointY = this.LJaw1.rotationPointY;
    this.LJaw3.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LJaw3.rotationPointX = this.LJaw1.rotationPointX;
    this.LJaw3.rotationPointY = this.LJaw1.rotationPointY;
    this.LTooth1.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth1.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth1.rotationPointY = this.LJaw1.rotationPointY;
    this.LTooth2.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth2.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth2.rotationPointY = this.LJaw1.rotationPointY;
    this.LTooth3.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth3.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth3.rotationPointY = this.LJaw1.rotationPointY;
    this.LTooth4.rotationPointZ = this.LJaw1.rotationPointZ;
    this.LTooth4.rotationPointX = this.LJaw1.rotationPointX;
    this.LTooth4.rotationPointY = this.LJaw1.rotationPointY;
  }
  
  private void moveCenterHead(float Cheadlr, float Cheadud, float Cjawangle) {
    this.CJaw1.rotateAngleX = Cjawangle;
    this.CJaw2.rotateAngleX = Cjawangle;
    this.CJaw3.rotateAngleX = Cjawangle;
    this.CTooth1.rotateAngleX = Cjawangle;
    this.CTooth2.rotateAngleX = Cjawangle;
    this.CTooth3.rotateAngleX = Cjawangle;
    this.CTooth4.rotateAngleX = Cjawangle;
    this.NeckC1.rotateAngleY = Cheadlr * 0.125F;
    this.NeckC1.rotationPointZ -= (float)Math.cos(this.NeckC1.rotateAngleY) * 20.0F;
    this.NeckC1.rotationPointX -= (float)Math.sin(this.NeckC1.rotateAngleY) * 20.0F;
    this.NeckC2.rotateAngleY = Cheadlr * 0.25F;
    this.NeckC2.rotationPointZ -= (float)Math.cos(this.NeckC2.rotateAngleY) * 36.0F;
    this.NeckC2.rotationPointX -= (float)Math.sin(this.NeckC2.rotateAngleY) * 36.0F;
    this.NeckC3.rotateAngleY = Cheadlr * 0.38F;
    this.NeckC3.rotationPointZ -= (float)Math.cos(this.NeckC3.rotateAngleY) * 36.0F;
    this.NeckC3.rotationPointX -= (float)Math.sin(this.NeckC3.rotateAngleY) * 36.0F;
    this.NeckC4.rotateAngleY = Cheadlr * 0.5F;
    this.NeckC4.rotationPointZ -= (float)Math.cos(this.NeckC4.rotateAngleY) * 36.0F;
    this.NeckC4.rotationPointX -= (float)Math.sin(this.NeckC4.rotateAngleY) * 36.0F;
    this.CHead1.rotateAngleY = Cheadlr;
    this.CHead2.rotateAngleY = Cheadlr;
    this.CHead2.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHead2.rotationPointX = this.CHead1.rotationPointX;
    this.CHead3.rotateAngleY = Cheadlr;
    this.CHead3.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHead3.rotationPointX = this.CHead1.rotationPointX;
    this.CHeadMane.rotateAngleY = Cheadlr;
    this.CHeadMane.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHeadMane.rotationPointX = this.CHead1.rotationPointX;
    this.CLEye.rotateAngleY = Cheadlr;
    this.CLEye.rotationPointZ = this.CHead1.rotationPointZ;
    this.CLEye.rotationPointX = this.CHead1.rotationPointX;
    this.CREye.rotateAngleY = Cheadlr;
    this.CREye.rotationPointZ = this.CHead1.rotationPointZ;
    this.CREye.rotationPointX = this.CHead1.rotationPointX;
    this.CLNoseSpike.rotateAngleY = 0.244F + Cheadlr;
    this.CLNoseSpike.rotationPointZ = this.CHead1.rotationPointZ;
    this.CLNoseSpike.rotationPointX = this.CHead1.rotationPointX;
    this.CRNoseSpike.rotateAngleY = -0.261F + Cheadlr;
    this.CRNoseSpike.rotationPointZ = this.CHead1.rotationPointZ;
    this.CRNoseSpike.rotationPointX = this.CHead1.rotationPointX;
    this.CJaw1.rotateAngleY = Cheadlr;
    this.NeckC4.rotationPointZ -= (float)Math.cos(this.NeckC4.rotateAngleY) * 37.0F;
    this.NeckC4.rotationPointX -= (float)Math.sin(this.NeckC4.rotateAngleY) * 37.0F;
    this.CJaw2.rotateAngleY = Cheadlr;
    this.CJaw2.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CJaw2.rotationPointX = this.CJaw1.rotationPointX;
    this.CJaw3.rotateAngleY = Cheadlr;
    this.CJaw3.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CJaw3.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth1.rotateAngleY = Cheadlr;
    this.CTooth1.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth1.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth2.rotateAngleY = Cheadlr;
    this.CTooth2.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth2.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth3.rotateAngleY = Cheadlr;
    this.CTooth3.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth3.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth4.rotateAngleY = Cheadlr;
    this.CTooth4.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth4.rotationPointX = this.CJaw1.rotationPointX;
    this.NeckC1.rotateAngleX = Cheadud * 0.125F;
    this.NeckC1.rotationPointY += (float)Math.sin(this.NeckC1.rotateAngleX) * 20.0F;
    this.NeckC1.rotationPointZ += (this.NeckC2.rotationPointZ - this.NeckC1.rotationPointZ) * (float)Math.cos(this.NeckC1.rotateAngleX);
    this.NeckC1.rotationPointX += (this.NeckC2.rotationPointX - this.NeckC1.rotationPointX) * (float)Math.cos(this.NeckC1.rotateAngleX);
    this.NeckC2.rotateAngleX = Cheadud * 0.25F;
    this.NeckC2.rotationPointY += (float)Math.sin(this.NeckC2.rotateAngleX) * 36.0F;
    this.NeckC2.rotationPointZ += (this.NeckC3.rotationPointZ - this.NeckC2.rotationPointZ) * (float)Math.cos(this.NeckC2.rotateAngleX);
    this.NeckC2.rotationPointX += (this.NeckC3.rotationPointX - this.NeckC2.rotationPointX) * (float)Math.cos(this.NeckC2.rotateAngleX);
    this.NeckC3.rotateAngleX = Cheadud * 0.38F;
    this.NeckC3.rotationPointY += (float)Math.sin(this.NeckC3.rotateAngleX) * 36.0F;
    this.NeckC3.rotationPointZ += (this.NeckC4.rotationPointZ - this.NeckC3.rotationPointZ) * (float)Math.cos(this.NeckC3.rotateAngleX);
    this.NeckC3.rotationPointX += (this.NeckC4.rotationPointX - this.NeckC3.rotationPointX) * (float)Math.cos(this.NeckC3.rotateAngleX);
    this.NeckC4.rotateAngleX = Cheadud * 0.5F;
    this.NeckC4.rotationPointY += (float)Math.sin(this.NeckC4.rotateAngleX) * 36.0F;
    this.NeckC4.rotationPointZ += (this.CHead1.rotationPointZ - this.NeckC4.rotationPointZ) * (float)Math.cos(this.NeckC4.rotateAngleX);
    this.NeckC4.rotationPointX += (this.CHead1.rotationPointX - this.NeckC4.rotationPointX) * (float)Math.cos(this.NeckC4.rotateAngleX);
    this.CHead1.rotateAngleX = Cheadud;
    this.CHead2.rotateAngleX = Cheadud;
    this.CHead2.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHead2.rotationPointX = this.CHead1.rotationPointX;
    this.CHead2.rotationPointY = this.CHead1.rotationPointY;
    this.CHead3.rotateAngleX = Cheadud;
    this.CHead3.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHead3.rotationPointX = this.CHead1.rotationPointX;
    this.CHead3.rotationPointY = this.CHead1.rotationPointY;
    this.CHeadMane.rotateAngleX = 0.384F + Cheadud;
    this.CHeadMane.rotationPointZ = this.CHead1.rotationPointZ;
    this.CHeadMane.rotationPointX = this.CHead1.rotationPointX;
    this.CHeadMane.rotationPointY = this.CHead1.rotationPointY;
    this.CLEye.rotateAngleX = Cheadud;
    this.CLEye.rotationPointZ = this.CHead1.rotationPointZ;
    this.CLEye.rotationPointX = this.CHead1.rotationPointX;
    this.CLEye.rotationPointY = this.CHead1.rotationPointY;
    this.CREye.rotateAngleX = Cheadud;
    this.CREye.rotationPointZ = this.CHead1.rotationPointZ;
    this.CREye.rotationPointX = this.CHead1.rotationPointX;
    this.CREye.rotationPointY = this.CHead1.rotationPointY;
    this.CLNoseSpike.rotateAngleX = 0.244F + Cheadud;
    this.CLNoseSpike.rotationPointZ = this.CHead1.rotationPointZ;
    this.CLNoseSpike.rotationPointX = this.CHead1.rotationPointX;
    this.CLNoseSpike.rotationPointY = this.CHead1.rotationPointY;
    this.CRNoseSpike.rotateAngleX = 0.261F + Cheadud;
    this.CRNoseSpike.rotationPointZ = this.CHead1.rotationPointZ;
    this.CRNoseSpike.rotationPointX = this.CHead1.rotationPointX;
    this.CRNoseSpike.rotationPointY = this.CHead1.rotationPointY;
    this.CHead1.rotationPointY += (float)Math.cos(this.CHead1.rotateAngleX) * 14.0F;
    this.NeckC4.rotationPointZ += (this.CJaw1.rotationPointZ - this.NeckC4.rotationPointZ) * (float)Math.cos(this.NeckC4.rotateAngleX);
    this.CJaw1.rotationPointZ += (float)Math.sin(this.CHead1.rotateAngleX) * 14.0F;
    this.NeckC4.rotationPointX += (this.CJaw1.rotationPointX - this.NeckC4.rotationPointX) * (float)Math.cos(this.NeckC4.rotateAngleX);
    this.CJaw2.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CJaw2.rotationPointX = this.CJaw1.rotationPointX;
    this.CJaw2.rotationPointY = this.CJaw1.rotationPointY;
    this.CJaw3.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CJaw3.rotationPointX = this.CJaw1.rotationPointX;
    this.CJaw3.rotationPointY = this.CJaw1.rotationPointY;
    this.CTooth1.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth1.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth1.rotationPointY = this.CJaw1.rotationPointY;
    this.CTooth2.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth2.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth2.rotationPointY = this.CJaw1.rotationPointY;
    this.CTooth3.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth3.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth3.rotationPointY = this.CJaw1.rotationPointY;
    this.CTooth4.rotationPointZ = this.CJaw1.rotationPointZ;
    this.CTooth4.rotationPointX = this.CJaw1.rotationPointX;
    this.CTooth4.rotationPointY = this.CJaw1.rotationPointY;
  }
  
  private void moveRightHead(float Rheadlr, float Rheadud, float Rjawangle) {
    this.RJaw1.rotateAngleX = Rjawangle;
    this.RJaw2.rotateAngleX = Rjawangle;
    this.RJaw3.rotateAngleX = Rjawangle;
    this.RTooth1.rotateAngleX = Rjawangle;
    this.RTooth2.rotateAngleX = Rjawangle;
    this.RTooth3.rotateAngleX = Rjawangle;
    this.RTooth4.rotateAngleX = Rjawangle;
    this.NeckR1.rotateAngleY = Rheadlr * 0.125F;
    this.NeckR1.rotationPointZ -= (float)Math.cos(this.NeckR1.rotateAngleY) * 20.0F;
    this.NeckR1.rotationPointX -= (float)Math.sin(this.NeckR1.rotateAngleY) * 20.0F;
    this.NeckR2.rotateAngleY = Rheadlr * 0.25F;
    this.NeckR2.rotationPointZ -= (float)Math.cos(this.NeckR2.rotateAngleY) * 36.0F;
    this.NeckR2.rotationPointX -= (float)Math.sin(this.NeckR2.rotateAngleY) * 36.0F;
    this.NeckR3.rotateAngleY = Rheadlr * 0.38F;
    this.NeckR3.rotationPointZ -= (float)Math.cos(this.NeckR3.rotateAngleY) * 36.0F;
    this.NeckR3.rotationPointX -= (float)Math.sin(this.NeckR3.rotateAngleY) * 36.0F;
    this.NeckR4.rotateAngleY = Rheadlr * 0.5F;
    this.NeckR4.rotationPointZ -= (float)Math.cos(this.NeckR4.rotateAngleY) * 36.0F;
    this.NeckR4.rotationPointX -= (float)Math.sin(this.NeckR4.rotateAngleY) * 36.0F;
    this.RHead1.rotateAngleY = Rheadlr;
    this.RHead2.rotateAngleY = Rheadlr;
    this.RHead2.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHead2.rotationPointX = this.RHead1.rotationPointX;
    this.RHead3.rotateAngleY = Rheadlr;
    this.RHead3.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHead3.rotationPointX = this.RHead1.rotationPointX;
    this.RHeadMane.rotateAngleY = Rheadlr;
    this.RHeadMane.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHeadMane.rotationPointX = this.RHead1.rotationPointX;
    this.RLEye.rotateAngleY = Rheadlr;
    this.RLEye.rotationPointZ = this.RHead1.rotationPointZ;
    this.RLEye.rotationPointX = this.RHead1.rotationPointX;
    this.RREye.rotateAngleY = Rheadlr;
    this.RREye.rotationPointZ = this.RHead1.rotationPointZ;
    this.RREye.rotationPointX = this.RHead1.rotationPointX;
    this.RLNoseSpike.rotateAngleY = 0.244F + Rheadlr;
    this.RLNoseSpike.rotationPointZ = this.RHead1.rotationPointZ;
    this.RLNoseSpike.rotationPointX = this.RHead1.rotationPointX;
    this.RRNoseSpike.rotateAngleY = -0.261F + Rheadlr;
    this.RRNoseSpike.rotationPointZ = this.RHead1.rotationPointZ;
    this.RRNoseSpike.rotationPointX = this.RHead1.rotationPointX;
    this.RJaw1.rotateAngleY = Rheadlr;
    this.NeckR4.rotationPointZ -= (float)Math.cos(this.NeckR4.rotateAngleY) * 37.0F;
    this.NeckR4.rotationPointX -= (float)Math.sin(this.NeckR4.rotateAngleY) * 37.0F;
    this.RJaw2.rotateAngleY = Rheadlr;
    this.RJaw2.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RJaw2.rotationPointX = this.RJaw1.rotationPointX;
    this.RJaw3.rotateAngleY = Rheadlr;
    this.RJaw3.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RJaw3.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth1.rotateAngleY = Rheadlr;
    this.RTooth1.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth1.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth2.rotateAngleY = Rheadlr;
    this.RTooth2.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth2.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth3.rotateAngleY = Rheadlr;
    this.RTooth3.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth3.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth4.rotateAngleY = Rheadlr;
    this.RTooth4.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth4.rotationPointX = this.RJaw1.rotationPointX;
    this.NeckR1.rotateAngleX = Rheadud * 0.125F;
    this.NeckR1.rotationPointY += (float)Math.sin(this.NeckR1.rotateAngleX) * 20.0F;
    this.NeckR1.rotationPointZ += (this.NeckR2.rotationPointZ - this.NeckR1.rotationPointZ) * (float)Math.cos(this.NeckR1.rotateAngleX);
    this.NeckR1.rotationPointX += (this.NeckR2.rotationPointX - this.NeckR1.rotationPointX) * (float)Math.cos(this.NeckR1.rotateAngleX);
    this.NeckR2.rotateAngleX = Rheadud * 0.25F;
    this.NeckR2.rotationPointY += (float)Math.sin(this.NeckR2.rotateAngleX) * 36.0F;
    this.NeckR2.rotationPointZ += (this.NeckR3.rotationPointZ - this.NeckR2.rotationPointZ) * (float)Math.cos(this.NeckR2.rotateAngleX);
    this.NeckR2.rotationPointX += (this.NeckR3.rotationPointX - this.NeckR2.rotationPointX) * (float)Math.cos(this.NeckR2.rotateAngleX);
    this.NeckR3.rotateAngleX = Rheadud * 0.38F;
    this.NeckR3.rotationPointY += (float)Math.sin(this.NeckR3.rotateAngleX) * 36.0F;
    this.NeckR3.rotationPointZ += (this.NeckR4.rotationPointZ - this.NeckR3.rotationPointZ) * (float)Math.cos(this.NeckR3.rotateAngleX);
    this.NeckR3.rotationPointX += (this.NeckR4.rotationPointX - this.NeckR3.rotationPointX) * (float)Math.cos(this.NeckR3.rotateAngleX);
    this.NeckR4.rotateAngleX = Rheadud * 0.5F;
    this.NeckR4.rotationPointY += (float)Math.sin(this.NeckR4.rotateAngleX) * 36.0F;
    this.NeckR4.rotationPointZ += (this.RHead1.rotationPointZ - this.NeckR4.rotationPointZ) * (float)Math.cos(this.NeckR4.rotateAngleX);
    this.NeckR4.rotationPointX += (this.RHead1.rotationPointX - this.NeckR4.rotationPointX) * (float)Math.cos(this.NeckR4.rotateAngleX);
    this.RHead1.rotateAngleX = Rheadud;
    this.RHead2.rotateAngleX = Rheadud;
    this.RHead2.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHead2.rotationPointX = this.RHead1.rotationPointX;
    this.RHead2.rotationPointY = this.RHead1.rotationPointY;
    this.RHead3.rotateAngleX = Rheadud;
    this.RHead3.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHead3.rotationPointX = this.RHead1.rotationPointX;
    this.RHead3.rotationPointY = this.RHead1.rotationPointY;
    this.RHeadMane.rotateAngleX = 0.384F + Rheadud;
    this.RHeadMane.rotationPointZ = this.RHead1.rotationPointZ;
    this.RHeadMane.rotationPointX = this.RHead1.rotationPointX;
    this.RHeadMane.rotationPointY = this.RHead1.rotationPointY;
    this.RLEye.rotateAngleX = Rheadud;
    this.RLEye.rotationPointZ = this.RHead1.rotationPointZ;
    this.RLEye.rotationPointX = this.RHead1.rotationPointX;
    this.RLEye.rotationPointY = this.RHead1.rotationPointY;
    this.RREye.rotateAngleX = Rheadud;
    this.RREye.rotationPointZ = this.RHead1.rotationPointZ;
    this.RREye.rotationPointX = this.RHead1.rotationPointX;
    this.RREye.rotationPointY = this.RHead1.rotationPointY;
    this.RLNoseSpike.rotateAngleX = 0.244F + Rheadud;
    this.RLNoseSpike.rotationPointZ = this.RHead1.rotationPointZ;
    this.RLNoseSpike.rotationPointX = this.RHead1.rotationPointX;
    this.RLNoseSpike.rotationPointY = this.RHead1.rotationPointY;
    this.RRNoseSpike.rotateAngleX = 0.261F + Rheadud;
    this.RRNoseSpike.rotationPointZ = this.RHead1.rotationPointZ;
    this.RRNoseSpike.rotationPointX = this.RHead1.rotationPointX;
    this.RRNoseSpike.rotationPointY = this.RHead1.rotationPointY;
    this.RHead1.rotationPointY += (float)Math.cos(this.RHead1.rotateAngleX) * 14.0F;
    this.NeckR4.rotationPointZ += (this.RJaw1.rotationPointZ - this.NeckR4.rotationPointZ) * (float)Math.cos(this.NeckR4.rotateAngleX);
    this.RJaw1.rotationPointZ += (float)Math.sin(this.RHead1.rotateAngleX) * 14.0F;
    this.NeckR4.rotationPointX += (this.RJaw1.rotationPointX - this.NeckR4.rotationPointX) * (float)Math.cos(this.NeckR4.rotateAngleX);
    this.RJaw2.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RJaw2.rotationPointX = this.RJaw1.rotationPointX;
    this.RJaw2.rotationPointY = this.RJaw1.rotationPointY;
    this.RJaw3.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RJaw3.rotationPointX = this.RJaw1.rotationPointX;
    this.RJaw3.rotationPointY = this.RJaw1.rotationPointY;
    this.RTooth1.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth1.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth1.rotationPointY = this.RJaw1.rotationPointY;
    this.RTooth2.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth2.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth2.rotationPointY = this.RJaw1.rotationPointY;
    this.RTooth3.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth3.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth3.rotationPointY = this.RJaw1.rotationPointY;
    this.RTooth4.rotationPointZ = this.RJaw1.rotationPointZ;
    this.RTooth4.rotationPointX = this.RJaw1.rotationPointX;
    this.RTooth4.rotationPointY = this.RJaw1.rotationPointY;
  }
}
