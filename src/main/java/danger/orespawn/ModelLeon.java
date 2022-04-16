package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLeon extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer chest;
  
  ModelRenderer neck_1;
  
  ModelRenderer neck_2;
  
  ModelRenderer neck_3;
  
  ModelRenderer abdomen;
  
  ModelRenderer head;
  
  ModelRenderer upper_jaw;
  
  ModelRenderer bottom_jaw;
  
  ModelRenderer chest_ridge;
  
  ModelRenderer upper_sail_1;
  
  ModelRenderer upper_sail2_;
  
  ModelRenderer upper_sail3;
  
  ModelRenderer lower_sail1;
  
  ModelRenderer lower_sail2;
  
  ModelRenderer lower_sail_3;
  
  ModelRenderer eye_ridge_L;
  
  ModelRenderer eye_ridge_R;
  
  ModelRenderer anntena_1_L;
  
  ModelRenderer anntena_1_R;
  
  ModelRenderer anntena_2_L;
  
  ModelRenderer anntena_2_R;
  
  ModelRenderer arm_1_L;
  
  ModelRenderer arm_2_L;
  
  ModelRenderer wing_1_L;
  
  ModelRenderer wing_2_L;
  
  ModelRenderer arm_1_R;
  
  ModelRenderer arm_2_R;
  
  ModelRenderer wing_1_R;
  
  ModelRenderer wing_2_R;
  
  ModelRenderer leg_1_L;
  
  ModelRenderer leg_1_R;
  
  ModelRenderer leg_2_L;
  
  ModelRenderer leg_2_R;
  
  ModelRenderer footL;
  
  ModelRenderer footR;
  
  ModelRenderer wing_3_L;
  
  ModelRenderer wing_3_R;
  
  ModelRenderer wing_4_L;
  
  ModelRenderer wing_4_R;
  
  ModelRenderer claw_L;
  
  ModelRenderer claw_R;
  
  ModelRenderer claw_L2;
  
  ModelRenderer claw_R_2;
  
  ModelRenderer wing_5_L;
  
  ModelRenderer wing_6_L;
  
  ModelRenderer wing_7_L;
  
  ModelRenderer wing_5_R;
  
  ModelRenderer wing_6_R;
  
  ModelRenderer wing_7_R;
  
  ModelRenderer fchest;
  
  ModelRenderer fneck_1;
  
  ModelRenderer fneck_2;
  
  ModelRenderer fneck_3;
  
  ModelRenderer fabdomen;
  
  ModelRenderer fhead;
  
  ModelRenderer fupper_jaw;
  
  ModelRenderer fbottom_jaw;
  
  ModelRenderer fchest_ridge;
  
  ModelRenderer fupper_sail_1;
  
  ModelRenderer fupper_sail2_;
  
  ModelRenderer fupper_sail3;
  
  ModelRenderer flower_sail1;
  
  ModelRenderer flower_sail2;
  
  ModelRenderer flower_sail_3;
  
  ModelRenderer feye_ridge_L;
  
  ModelRenderer feye_ridge_R;
  
  ModelRenderer fanntena_1_L;
  
  ModelRenderer fanntena_1_R;
  
  ModelRenderer fanntena_2_L;
  
  ModelRenderer fanntena_2_R;
  
  ModelRenderer farm_1_L;
  
  ModelRenderer farm_2_L;
  
  ModelRenderer fwing_1_L;
  
  ModelRenderer fwing_2_L;
  
  ModelRenderer farm_1_R;
  
  ModelRenderer farm_2_R;
  
  ModelRenderer fwing_1_R;
  
  ModelRenderer fwing_2_R;
  
  ModelRenderer fleg_1_L;
  
  ModelRenderer fleg_1_R;
  
  ModelRenderer fleg_2_L;
  
  ModelRenderer fleg_2_R;
  
  ModelRenderer ffootL;
  
  ModelRenderer ffootR;
  
  ModelRenderer fwing_3_L;
  
  ModelRenderer fwing_3_R;
  
  ModelRenderer fwing_4_L;
  
  ModelRenderer fwing_4_R;
  
  ModelRenderer fclaw_L;
  
  ModelRenderer fclaw_R;
  
  ModelRenderer fclaw_L2;
  
  ModelRenderer fclaw_R_2;
  
  ModelRenderer fwing_5_L;
  
  ModelRenderer fwing_6_L;
  
  ModelRenderer fwing_7_L;
  
  ModelRenderer fwing_5_R;
  
  ModelRenderer fwing_6_R;
  
  ModelRenderer fwing_7_R;
  
  public ModelLeon(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.chest = new ModelRenderer(this, 80, 0);
    this.chest.addBox(-8.0F, -9.5F, -9.5F, 16, 19, 19);
    this.chest.setRotationPoint(0.0F, -2.0F, -7.0F);
    this.chest.setTextureSize(256, 256);
    this.chest.mirror = true;
    setRotation(this.chest, -0.4363323F, 0.0F, 0.0F);
    this.neck_1 = new ModelRenderer(this, 106, 68);
    this.neck_1.addBox(-5.5F, -7.0F, -9.0F, 11, 14, 11);
    this.neck_1.setRotationPoint(0.0F, -6.0F, -13.0F);
    this.neck_1.setTextureSize(256, 256);
    this.neck_1.mirror = true;
    setRotation(this.neck_1, -0.8726646F, 0.0F, 0.0F);
    this.neck_2 = new ModelRenderer(this, 71, 69);
    this.neck_2.addBox(-4.0F, -5.0F, -8.0F, 8, 10, 9);
    this.neck_2.setRotationPoint(0.0F, -12.0F, -17.0F);
    this.neck_2.setTextureSize(256, 256);
    this.neck_2.mirror = true;
    setRotation(this.neck_2, -1.064651F, 0.0F, 0.0F);
    this.neck_3 = new ModelRenderer(this, 102, 94);
    this.neck_3.addBox(-3.0F, -4.0F, -17.0F, 6, 8, 18);
    this.neck_3.setRotationPoint(0.0F, -19.0F, -21.0F);
    this.neck_3.setTextureSize(256, 256);
    this.neck_3.mirror = true;
    setRotation(this.neck_3, -1.029744F, 0.0F, 0.0F);
    this.abdomen = new ModelRenderer(this, 96, 39);
    this.abdomen.addBox(-5.0F, -2.0F, 1.0F, 10, 11, 17);
    this.abdomen.setRotationPoint(0.0F, -5.0F, 4.0F);
    this.abdomen.setTextureSize(256, 256);
    this.abdomen.mirror = true;
    setRotation(this.abdomen, -0.6457718F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 61, 49);
    this.head.addBox(-4.0F, -2.0F, -4.0F, 8, 8, 9);
    this.head.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.head.setTextureSize(256, 256);
    this.head.mirror = true;
    setRotation(this.head, -1.413717F, 0.0F, 0.0F);
    this.upper_jaw = new ModelRenderer(this, 83, 89);
    this.upper_jaw.addBox(-3.0F, 4.0F, -4.0F, 6, 13, 5);
    this.upper_jaw.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.upper_jaw.setTextureSize(256, 256);
    this.upper_jaw.mirror = true;
    setRotation(this.upper_jaw, -1.37881F, 0.0F, 0.0F);
    this.bottom_jaw = new ModelRenderer(this, 85, 108);
    this.bottom_jaw.addBox(-2.5F, -1.0F, -1.5F, 5, 12, 3);
    this.bottom_jaw.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.bottom_jaw.setTextureSize(256, 256);
    this.bottom_jaw.mirror = true;
    setRotation(this.bottom_jaw, -1.413717F, 0.0F, 0.0F);
    this.chest_ridge = new ModelRenderer(this, 113, 129);
    this.chest_ridge.addBox(-2.0F, 7.0F, -3.0F, 4, 3, 17);
    this.chest_ridge.setRotationPoint(0.0F, -2.0F, -7.0F);
    this.chest_ridge.setTextureSize(256, 256);
    this.chest_ridge.mirror = true;
    setRotation(this.chest_ridge, -0.6283185F, 0.0F, 0.0F);
    this.upper_sail_1 = new ModelRenderer(this, 76, 110);
    this.upper_sail_1.addBox(-1.0F, -17.0F, -16.0F, 2, 14, 2);
    this.upper_sail_1.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.upper_sail_1.setTextureSize(256, 256);
    this.upper_sail_1.mirror = true;
    setRotation(this.upper_sail_1, 0.2443461F, 0.0F, 0.0F);
    this.upper_sail2_ = new ModelRenderer(this, 63, 110);
    this.upper_sail2_.addBox(-0.5F, -15.0F, -16.0F, 1, 12, 5);
    this.upper_sail2_.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.upper_sail2_.setTextureSize(256, 256);
    this.upper_sail2_.mirror = true;
    setRotation(this.upper_sail2_, 0.1396263F, 0.0F, 0.0F);
    this.upper_sail3 = new ModelRenderer(this, 0, 82);
    this.upper_sail3.addBox(0.0F, -1.5F, -18.0F, 0, 9, 13);
    this.upper_sail3.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.upper_sail3.setTextureSize(256, 256);
    this.upper_sail3.mirror = true;
    setRotation(this.upper_sail3, -0.7504916F, 0.0F, 0.0F);
    this.lower_sail1 = new ModelRenderer(this, 0, 2);
    this.lower_sail1.addBox(-1.0F, 0.0F, -10.0F, 2, 11, 2);
    this.lower_sail1.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.lower_sail1.setTextureSize(256, 256);
    this.lower_sail1.mirror = true;
    setRotation(this.lower_sail1, 0.1919862F, 0.0F, 0.0F);
    this.lower_sail2 = new ModelRenderer(this, 52, 94);
    this.lower_sail2.addBox(-0.5F, 0.5F, -9.0F, 1, 9, 4);
    this.lower_sail2.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.lower_sail2.setTextureSize(256, 256);
    this.lower_sail2.mirror = true;
    setRotation(this.lower_sail2, 0.296706F, 0.0F, 0.0F);
    this.lower_sail_3 = new ModelRenderer(this, 66, 90);
    this.lower_sail_3.addBox(0.0F, 1.5F, -4.0F, 0, 9, 7);
    this.lower_sail_3.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.lower_sail_3.setTextureSize(256, 256);
    this.lower_sail_3.mirror = true;
    setRotation(this.lower_sail_3, -0.4886922F, 0.0F, 0.0F);
    this.eye_ridge_L = new ModelRenderer(this, 0, 68);
    this.eye_ridge_L.addBox(0.0F, -4.0F, -5.0F, 5, 2, 11);
    this.eye_ridge_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.eye_ridge_L.setTextureSize(256, 256);
    this.eye_ridge_L.mirror = true;
    setRotation(this.eye_ridge_L, 0.2094395F, 0.5585054F, 0.2268928F);
    this.eye_ridge_R = new ModelRenderer(this, 0, 68);
    this.eye_ridge_R.addBox(-5.0F, -4.0F, -5.0F, 5, 2, 11);
    this.eye_ridge_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.eye_ridge_R.setTextureSize(256, 256);
    this.eye_ridge_R.mirror = true;
    setRotation(this.eye_ridge_R, 0.2094395F, -0.5585054F, -0.2268928F);
    this.anntena_1_L = new ModelRenderer(this, 0, 40);
    this.anntena_1_L.addBox(3.0F, -4.2F, 5.0F, 2, 2, 5);
    this.anntena_1_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.anntena_1_L.setTextureSize(256, 256);
    this.anntena_1_L.mirror = true;
    setRotation(this.anntena_1_L, 0.2443461F, 0.3665191F, 0.2268928F);
    this.anntena_1_R = new ModelRenderer(this, 0, 40);
    this.anntena_1_R.addBox(-5.0F, -4.2F, 5.0F, 2, 2, 5);
    this.anntena_1_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.anntena_1_R.setTextureSize(256, 256);
    this.anntena_1_R.mirror = true;
    setRotation(this.anntena_1_R, 0.2443461F, -0.3665191F, -0.2268928F);
    this.anntena_2_L = new ModelRenderer(this, 46, 91);
    this.anntena_2_L.addBox(5.0F, -6.0F, 7.0F, 1, 1, 17);
    this.anntena_2_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.anntena_2_L.setTextureSize(256, 256);
    this.anntena_2_L.mirror = true;
    setRotation(this.anntena_2_L, 0.0698132F, 0.1396263F, 0.2268928F);
    this.anntena_2_R = new ModelRenderer(this, 46, 91);
    this.anntena_2_R.addBox(-6.0F, -6.0F, 7.0F, 1, 1, 17);
    this.anntena_2_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.anntena_2_R.setTextureSize(256, 256);
    this.anntena_2_R.mirror = true;
    setRotation(this.anntena_2_R, 0.0698132F, -0.1396263F, -0.2268928F);
    this.arm_1_L = new ModelRenderer(this, 77, 150);
    this.arm_1_L.addBox(0.0F, -1.0F, -1.0F, 3, 18, 5);
    this.arm_1_L.setRotationPoint(8.0F, -8.0F, -10.0F);
    this.arm_1_L.setTextureSize(256, 256);
    this.arm_1_L.mirror = true;
    setRotation(this.arm_1_L, -0.0698132F, 0.0F, -0.7679449F);
    this.arm_2_L = new ModelRenderer(this, 102, 150);
    this.arm_2_L.addBox(-0.5F, 0.0F, -1.0F, 2, 24, 3);
    this.arm_2_L.setRotationPoint(20.0F, 3.0F, -10.0F);
    this.arm_2_L.setTextureSize(256, 256);
    this.arm_2_L.mirror = true;
    setRotation(this.arm_2_L, -0.4712389F, 0.0F, -0.4886922F);
    this.wing_1_L = new ModelRenderer(this, 0, 33);
    this.wing_1_L.addBox(1.5F, -1.0F, 3.0F, 1, 19, 15);
    this.wing_1_L.setRotationPoint(8.0F, -8.0F, -10.0F);
    this.wing_1_L.setTextureSize(256, 256);
    this.wing_1_L.mirror = true;
    setRotation(this.wing_1_L, -0.1745329F, -0.1919862F, -0.7504916F);
    this.wing_2_L = new ModelRenderer(this, 33, 50);
    this.wing_2_L.addBox(0.0F, -1.0F, 1.0F, 1, 23, 17);
    this.wing_2_L.setRotationPoint(20.0F, 3.0F, -10.0F);
    this.wing_2_L.setTextureSize(256, 256);
    this.wing_2_L.mirror = true;
    setRotation(this.wing_2_L, -0.5235988F, -0.0349066F, -0.4712389F);
    this.arm_1_R = new ModelRenderer(this, 77, 127);
    this.arm_1_R.addBox(-3.0F, -1.0F, -1.0F, 3, 18, 5);
    this.arm_1_R.setRotationPoint(-8.0F, -8.0F, -10.0F);
    this.arm_1_R.setTextureSize(256, 256);
    this.arm_1_R.mirror = true;
    setRotation(this.arm_1_R, -0.0698132F, 0.0F, 0.7679449F);
    this.arm_2_R = new ModelRenderer(this, 102, 123);
    this.arm_2_R.addBox(-1.5F, 0.0F, -1.0F, 2, 24, 3);
    this.arm_2_R.setRotationPoint(-20.0F, 3.0F, -10.0F);
    this.arm_2_R.setTextureSize(256, 256);
    this.arm_2_R.mirror = true;
    setRotation(this.arm_2_R, -0.4712389F, 0.0F, 0.4886922F);
    this.wing_1_R = new ModelRenderer(this, 24, 150);
    this.wing_1_R.addBox(-2.5F, -1.0F, 3.0F, 1, 19, 15);
    this.wing_1_R.setRotationPoint(-8.0F, -8.0F, -10.0F);
    this.wing_1_R.setTextureSize(256, 256);
    this.wing_1_R.mirror = true;
    setRotation(this.wing_1_R, -0.1745329F, 0.1919862F, 0.7504916F);
    this.wing_2_R = new ModelRenderer(this, 150, 50);
    this.wing_2_R.addBox(-1.0F, -1.0F, 0.0F, 1, 23, 17);
    this.wing_2_R.setRotationPoint(-20.0F, 3.0F, -10.0F);
    this.wing_2_R.setTextureSize(256, 256);
    this.wing_2_R.mirror = true;
    setRotation(this.wing_2_R, -0.5235988F, 0.0349066F, 0.4712389F);
    this.leg_1_L = new ModelRenderer(this, 0, 104);
    this.leg_1_L.addBox(0.0F, -3.0F, -4.0F, 3, 15, 7);
    this.leg_1_L.setRotationPoint(5.0F, 5.0F, 10.0F);
    this.leg_1_L.setTextureSize(256, 256);
    this.leg_1_L.mirror = true;
    setRotation(this.leg_1_L, -0.6108652F, 0.0F, -0.3316126F);
    this.leg_1_R = new ModelRenderer(this, 0, 149);
    this.leg_1_R.addBox(-3.0F, -3.0F, -4.0F, 3, 15, 7);
    this.leg_1_R.setRotationPoint(-6.0F, 5.0F, 10.0F);
    this.leg_1_R.setTextureSize(256, 256);
    this.leg_1_R.mirror = true;
    setRotation(this.leg_1_R, -0.6108652F, 0.0F, 0.3316126F);
    this.leg_2_L = new ModelRenderer(this, 21, 108);
    this.leg_2_L.addBox(1.0F, 0.0F, -3.0F, 2, 14, 4);
    this.leg_2_L.setRotationPoint(8.0F, 13.0F, 6.0F);
    this.leg_2_L.setTextureSize(256, 256);
    this.leg_2_L.mirror = true;
    setRotation(this.leg_2_L, 0.6108652F, 0.0F, -0.1745329F);
    this.leg_2_R = new ModelRenderer(this, 21, 108);
    this.leg_2_R.addBox(-2.0F, 0.0F, -3.0F, 2, 14, 4);
    this.leg_2_R.setRotationPoint(-10.0F, 13.0F, 6.0F);
    this.leg_2_R.setTextureSize(256, 256);
    this.leg_2_R.mirror = true;
    setRotation(this.leg_2_R, 0.6108652F, 0.0F, 0.1745329F);
    this.footL = new ModelRenderer(this, 50, 29);
    this.footL.addBox(-2.0F, -1.0F, -8.0F, 4, 2, 9);
    this.footL.setRotationPoint(12.0F, 24.0F, 11.0F);
    this.footL.setTextureSize(256, 256);
    this.footL.mirror = true;
    setRotation(this.footL, 0.0F, 0.0F, 0.0F);
    this.footR = new ModelRenderer(this, 50, 29);
    this.footR.addBox(-1.0F, 1.0F, -8.0F, 4, 2, 9);
    this.footR.setRotationPoint(-14.0F, 22.0F, 11.0F);
    this.footR.setTextureSize(256, 256);
    this.footR.mirror = true;
    setRotation(this.footR, 0.0F, 0.0F, 0.0F);
    this.wing_3_L = new ModelRenderer(this, 0, 0);
    this.wing_3_L.addBox(-7.5F, 0.0F, -5.0F, 16, 1, 26);
    this.wing_3_L.setRotationPoint(-5.0F, 0.0F, 12.0F);
    this.wing_3_L.setTextureSize(256, 256);
    this.wing_3_L.mirror = true;
    setRotation(this.wing_3_L, -0.4886922F, -0.5235988F, 0.4014257F);
    this.wing_3_R = new ModelRenderer(this, 150, 0);
    this.wing_3_R.addBox(-8.5F, 0.0F, -5.0F, 16, 1, 26);
    this.wing_3_R.setRotationPoint(4.0F, 0.0F, 12.0F);
    this.wing_3_R.setTextureSize(256, 256);
    this.wing_3_R.mirror = true;
    setRotation(this.wing_3_R, -0.4886922F, 0.5235988F, -0.4014257F);
    this.wing_4_L = new ModelRenderer(this, 8, 117);
    this.wing_4_L.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 31);
    this.wing_4_L.setRotationPoint(6.0F, 6.0F, 24.0F);
    this.wing_4_L.setTextureSize(256, 256);
    this.wing_4_L.mirror = true;
    setRotation(this.wing_4_L, -0.6283185F, -0.0174533F, 0.0F);
    this.wing_4_R = new ModelRenderer(this, 8, 117);
    this.wing_4_R.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 31);
    this.wing_4_R.setRotationPoint(-7.0F, 6.0F, 24.0F);
    this.wing_4_R.setTextureSize(256, 256);
    this.wing_4_R.mirror = true;
    setRotation(this.wing_4_R, -0.6283185F, 0.0174533F, 0.0F);
    this.claw_L = new ModelRenderer(this, 0, 129);
    this.claw_L.addBox(0.0F, -1.0F, -9.0F, 1, 2, 10);
    this.claw_L.setRotationPoint(30.0F, 23.0F, -20.0F);
    this.claw_L.setTextureSize(256, 256);
    this.claw_L.mirror = true;
    setRotation(this.claw_L, 0.0F, 0.1570796F, 0.0F);
    this.claw_R = new ModelRenderer(this, 0, 129);
    this.claw_R.addBox(0.0F, -1.0F, -9.0F, 1, 2, 10);
    this.claw_R.setRotationPoint(-31.0F, 23.0F, -20.0F);
    this.claw_R.setTextureSize(256, 256);
    this.claw_R.mirror = true;
    setRotation(this.claw_R, 0.0F, -0.1570796F, 0.0F);
    this.claw_L2 = new ModelRenderer(this, 18, 38);
    this.claw_L2.addBox(0.0F, -2.5F, -6.0F, 1, 2, 7);
    this.claw_L2.setRotationPoint(-30.0F, 23.0F, -28.0F);
    this.claw_L2.setTextureSize(256, 256);
    this.claw_L2.mirror = true;
    setRotation(this.claw_L2, 0.5061455F, -0.2792527F, 0.0F);
    this.claw_R_2 = new ModelRenderer(this, 18, 38);
    this.claw_R_2.addBox(-1.0F, -2.5F, -6.0F, 1, 2, 7);
    this.claw_R_2.setRotationPoint(30.0F, 23.0F, -28.0F);
    this.claw_R_2.setTextureSize(256, 256);
    this.claw_R_2.mirror = true;
    setRotation(this.claw_R_2, 0.5061455F, 0.2792527F, 0.0F);
    this.wing_5_L = new ModelRenderer(this, 46, 10);
    this.wing_5_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_5_L.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.wing_5_L.setTextureSize(256, 256);
    this.wing_5_L.mirror = true;
    setRotation(this.wing_5_L, 0.6806784F, 0.0523599F, -0.2792527F);
    this.wing_6_L = new ModelRenderer(this, 46, 10);
    this.wing_6_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_6_L.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.wing_6_L.setTextureSize(256, 256);
    this.wing_6_L.mirror = true;
    setRotation(this.wing_6_L, 0.4537856F, 0.2443461F, -0.3665191F);
    this.wing_7_L = new ModelRenderer(this, 46, 10);
    this.wing_7_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_7_L.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.wing_7_L.setTextureSize(256, 256);
    this.wing_7_L.mirror = true;
    setRotation(this.wing_7_L, 0.1396263F, -0.3316126F, 0.4014257F);
    this.wing_5_R = new ModelRenderer(this, 46, 10);
    this.wing_5_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_5_R.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.wing_5_R.setTextureSize(256, 256);
    this.wing_5_R.mirror = true;
    setRotation(this.wing_5_R, 0.6806784F, -0.0523599F, 0.2792527F);
    this.wing_6_R = new ModelRenderer(this, 46, 10);
    this.wing_6_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_6_R.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.wing_6_R.setTextureSize(256, 256);
    this.wing_6_R.mirror = true;
    setRotation(this.wing_6_R, 0.4537856F, -0.2443461F, 0.3665191F);
    this.wing_7_R = new ModelRenderer(this, 46, 10);
    this.wing_7_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.wing_7_R.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.wing_7_R.setTextureSize(256, 256);
    this.wing_7_R.mirror = true;
    setRotation(this.wing_7_R, 0.1396263F, 0.3316126F, -0.4014257F);
    this.fchest = new ModelRenderer(this, 80, 0);
    this.fchest.addBox(-8.0F, -9.5F, -9.5F, 16, 19, 19);
    this.fchest.setRotationPoint(0.0F, -2.0F, -7.0F);
    this.fchest.setTextureSize(256, 256);
    this.fchest.mirror = true;
    setRotation(this.fchest, -0.4363323F, 0.0F, 0.0F);
    this.fneck_1 = new ModelRenderer(this, 106, 68);
    this.fneck_1.addBox(-5.5F, -7.0F, -9.0F, 11, 14, 11);
    this.fneck_1.setRotationPoint(0.0F, -6.0F, -13.0F);
    this.fneck_1.setTextureSize(256, 256);
    this.fneck_1.mirror = true;
    setRotation(this.fneck_1, -0.8726646F, 0.0F, 0.0F);
    this.fneck_2 = new ModelRenderer(this, 71, 69);
    this.fneck_2.addBox(-4.0F, -5.0F, -8.0F, 8, 10, 9);
    this.fneck_2.setRotationPoint(0.0F, -12.0F, -17.0F);
    this.fneck_2.setTextureSize(256, 256);
    this.fneck_2.mirror = true;
    setRotation(this.fneck_2, -1.064651F, 0.0F, 0.0F);
    this.fneck_3 = new ModelRenderer(this, 102, 94);
    this.fneck_3.addBox(-3.0F, -4.0F, -17.0F, 6, 8, 18);
    this.fneck_3.setRotationPoint(0.0F, -19.0F, -21.0F);
    this.fneck_3.setTextureSize(256, 256);
    this.fneck_3.mirror = true;
    setRotation(this.fneck_3, -1.029744F, 0.0F, 0.0F);
    this.fabdomen = new ModelRenderer(this, 96, 39);
    this.fabdomen.addBox(-5.0F, -2.0F, 1.0F, 10, 11, 17);
    this.fabdomen.setRotationPoint(0.0F, -5.0F, 4.0F);
    this.fabdomen.setTextureSize(256, 256);
    this.fabdomen.mirror = true;
    setRotation(this.fabdomen, -0.6457718F, 0.0F, 0.0F);
    this.fhead = new ModelRenderer(this, 61, 49);
    this.fhead.addBox(-4.0F, -2.0F, -4.0F, 8, 8, 9);
    this.fhead.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fhead.setTextureSize(256, 256);
    this.fhead.mirror = true;
    setRotation(this.fhead, -1.413717F, 0.0F, 0.0F);
    this.fupper_jaw = new ModelRenderer(this, 83, 89);
    this.fupper_jaw.addBox(-3.0F, 4.0F, -4.0F, 6, 13, 5);
    this.fupper_jaw.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fupper_jaw.setTextureSize(256, 256);
    this.fupper_jaw.mirror = true;
    setRotation(this.fupper_jaw, -1.37881F, 0.0F, 0.0F);
    this.fbottom_jaw = new ModelRenderer(this, 85, 108);
    this.fbottom_jaw.addBox(-2.5F, -1.0F, -1.5F, 5, 12, 3);
    this.fbottom_jaw.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.fbottom_jaw.setTextureSize(256, 256);
    this.fbottom_jaw.mirror = true;
    setRotation(this.fbottom_jaw, -1.413717F, 0.0F, 0.0F);
    this.fchest_ridge = new ModelRenderer(this, 113, 129);
    this.fchest_ridge.addBox(-2.0F, 7.0F, -3.0F, 4, 3, 17);
    this.fchest_ridge.setRotationPoint(0.0F, -2.0F, -7.0F);
    this.fchest_ridge.setTextureSize(256, 256);
    this.fchest_ridge.mirror = true;
    setRotation(this.fchest_ridge, -0.6283185F, 0.0F, 0.0F);
    this.fupper_sail_1 = new ModelRenderer(this, 76, 110);
    this.fupper_sail_1.addBox(-1.0F, -17.0F, -16.0F, 2, 14, 2);
    this.fupper_sail_1.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fupper_sail_1.setTextureSize(256, 256);
    this.fupper_sail_1.mirror = true;
    setRotation(this.fupper_sail_1, 0.2443461F, 0.0F, 0.0F);
    this.fupper_sail2_ = new ModelRenderer(this, 63, 110);
    this.fupper_sail2_.addBox(-0.5F, -15.0F, -16.0F, 1, 12, 5);
    this.fupper_sail2_.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fupper_sail2_.setTextureSize(256, 256);
    this.fupper_sail2_.mirror = true;
    setRotation(this.fupper_sail2_, 0.1396263F, 0.0F, 0.0F);
    this.fupper_sail3 = new ModelRenderer(this, 0, 82);
    this.fupper_sail3.addBox(0.0F, -1.5F, -18.0F, 0, 9, 13);
    this.fupper_sail3.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fupper_sail3.setTextureSize(256, 256);
    this.fupper_sail3.mirror = true;
    setRotation(this.fupper_sail3, -0.7504916F, 0.0F, 0.0F);
    this.flower_sail1 = new ModelRenderer(this, 0, 2);
    this.flower_sail1.addBox(-1.0F, 0.0F, -10.0F, 2, 11, 2);
    this.flower_sail1.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.flower_sail1.setTextureSize(256, 256);
    this.flower_sail1.mirror = true;
    setRotation(this.flower_sail1, 0.1919862F, 0.0F, 0.0F);
    this.flower_sail2 = new ModelRenderer(this, 52, 94);
    this.flower_sail2.addBox(-0.5F, 0.5F, -9.0F, 1, 9, 4);
    this.flower_sail2.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.flower_sail2.setTextureSize(256, 256);
    this.flower_sail2.mirror = true;
    setRotation(this.flower_sail2, 0.296706F, 0.0F, 0.0F);
    this.flower_sail_3 = new ModelRenderer(this, 66, 90);
    this.flower_sail_3.addBox(0.0F, 1.5F, -4.0F, 0, 9, 7);
    this.flower_sail_3.setRotationPoint(0.0F, -28.0F, -34.0F);
    this.flower_sail_3.setTextureSize(256, 256);
    this.flower_sail_3.mirror = true;
    setRotation(this.flower_sail_3, -0.4886922F, 0.0F, 0.0F);
    this.feye_ridge_L = new ModelRenderer(this, 0, 68);
    this.feye_ridge_L.addBox(0.0F, -4.0F, -5.0F, 5, 2, 11);
    this.feye_ridge_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.feye_ridge_L.setTextureSize(256, 256);
    this.feye_ridge_L.mirror = true;
    setRotation(this.feye_ridge_L, 0.2094395F, 0.5585054F, 0.2268928F);
    this.feye_ridge_R = new ModelRenderer(this, 0, 68);
    this.feye_ridge_R.addBox(-5.0F, -4.0F, -5.0F, 5, 2, 11);
    this.feye_ridge_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.feye_ridge_R.setTextureSize(256, 256);
    this.feye_ridge_R.mirror = true;
    setRotation(this.feye_ridge_R, 0.2094395F, -0.5585054F, -0.2268928F);
    this.fanntena_1_L = new ModelRenderer(this, 0, 40);
    this.fanntena_1_L.addBox(3.0F, -4.2F, 5.0F, 2, 2, 5);
    this.fanntena_1_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fanntena_1_L.setTextureSize(256, 256);
    this.fanntena_1_L.mirror = true;
    setRotation(this.fanntena_1_L, 0.2443461F, 0.3665191F, 0.2268928F);
    this.fanntena_1_R = new ModelRenderer(this, 0, 40);
    this.fanntena_1_R.addBox(-5.0F, -4.2F, 5.0F, 2, 2, 5);
    this.fanntena_1_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fanntena_1_R.setTextureSize(256, 256);
    this.fanntena_1_R.mirror = true;
    setRotation(this.fanntena_1_R, 0.2443461F, -0.3665191F, -0.2268928F);
    this.fanntena_2_L = new ModelRenderer(this, 46, 91);
    this.fanntena_2_L.addBox(5.0F, -6.0F, 7.0F, 1, 1, 17);
    this.fanntena_2_L.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fanntena_2_L.setTextureSize(256, 256);
    this.fanntena_2_L.mirror = true;
    setRotation(this.fanntena_2_L, 0.0698132F, 0.1396263F, 0.2268928F);
    this.fanntena_2_R = new ModelRenderer(this, 46, 91);
    this.fanntena_2_R.addBox(-6.0F, -6.0F, 7.0F, 1, 1, 17);
    this.fanntena_2_R.setRotationPoint(0.0F, -32.0F, -29.0F);
    this.fanntena_2_R.setTextureSize(256, 256);
    this.fanntena_2_R.mirror = true;
    setRotation(this.fanntena_2_R, 0.0698132F, -0.1396263F, -0.2268928F);
    this.farm_1_L = new ModelRenderer(this, 77, 150);
    this.farm_1_L.addBox(0.0F, -1.0F, -1.0F, 3, 18, 5);
    this.farm_1_L.setRotationPoint(8.0F, -8.0F, -10.0F);
    this.farm_1_L.setTextureSize(256, 256);
    this.farm_1_L.mirror = true;
    setRotation(this.farm_1_L, -0.0698132F, 0.0F, -0.7679449F);
    this.farm_2_L = new ModelRenderer(this, 102, 150);
    this.farm_2_L.addBox(-0.5F, 0.0F, -1.0F, 2, 24, 3);
    this.farm_2_L.setRotationPoint(20.0F, 3.0F, -10.0F);
    this.farm_2_L.setTextureSize(256, 256);
    this.farm_2_L.mirror = true;
    setRotation(this.farm_2_L, -0.4712389F, 0.0F, -0.4886922F);
    this.fwing_1_L = new ModelRenderer(this, 0, 33);
    this.fwing_1_L.addBox(1.5F, -1.0F, 3.0F, 1, 19, 15);
    this.fwing_1_L.setRotationPoint(8.0F, -8.0F, -10.0F);
    this.fwing_1_L.setTextureSize(256, 256);
    this.fwing_1_L.mirror = true;
    setRotation(this.fwing_1_L, -0.1745329F, -0.1919862F, -0.7504916F);
    this.fwing_2_L = new ModelRenderer(this, 33, 50);
    this.fwing_2_L.addBox(0.0F, -1.0F, 1.0F, 1, 23, 17);
    this.fwing_2_L.setRotationPoint(20.0F, 3.0F, -10.0F);
    this.fwing_2_L.setTextureSize(256, 256);
    this.fwing_2_L.mirror = true;
    setRotation(this.fwing_2_L, -0.5235988F, -0.0349066F, -0.4712389F);
    this.farm_1_R = new ModelRenderer(this, 77, 127);
    this.farm_1_R.addBox(-3.0F, -1.0F, -1.0F, 3, 18, 5);
    this.farm_1_R.setRotationPoint(-8.0F, -8.0F, -10.0F);
    this.farm_1_R.setTextureSize(256, 256);
    this.farm_1_R.mirror = true;
    setRotation(this.farm_1_R, -0.0698132F, 0.0F, 0.7679449F);
    this.farm_2_R = new ModelRenderer(this, 102, 123);
    this.farm_2_R.addBox(-1.5F, 0.0F, -1.0F, 2, 24, 3);
    this.farm_2_R.setRotationPoint(-20.0F, 3.0F, -10.0F);
    this.farm_2_R.setTextureSize(256, 256);
    this.farm_2_R.mirror = true;
    setRotation(this.farm_2_R, -0.4712389F, 0.0F, 0.4886922F);
    this.fwing_1_R = new ModelRenderer(this, 24, 150);
    this.fwing_1_R.addBox(-2.5F, -1.0F, 3.0F, 1, 19, 15);
    this.fwing_1_R.setRotationPoint(-8.0F, -8.0F, -10.0F);
    this.fwing_1_R.setTextureSize(256, 256);
    this.fwing_1_R.mirror = true;
    setRotation(this.fwing_1_R, -0.1745329F, 0.1919862F, 0.7504916F);
    this.fwing_2_R = new ModelRenderer(this, 150, 50);
    this.fwing_2_R.addBox(-1.0F, -1.0F, 0.0F, 1, 23, 17);
    this.fwing_2_R.setRotationPoint(-20.0F, 3.0F, -10.0F);
    this.fwing_2_R.setTextureSize(256, 256);
    this.fwing_2_R.mirror = true;
    setRotation(this.fwing_2_R, -0.5235988F, 0.0349066F, 0.4712389F);
    this.fleg_1_L = new ModelRenderer(this, 0, 104);
    this.fleg_1_L.addBox(0.0F, -3.0F, -4.0F, 3, 15, 7);
    this.fleg_1_L.setRotationPoint(5.0F, 5.0F, 10.0F);
    this.fleg_1_L.setTextureSize(256, 256);
    this.fleg_1_L.mirror = true;
    setRotation(this.fleg_1_L, -0.6108652F, 0.0F, -0.3316126F);
    this.fleg_1_R = new ModelRenderer(this, 0, 149);
    this.fleg_1_R.addBox(-3.0F, -3.0F, -4.0F, 3, 15, 7);
    this.fleg_1_R.setRotationPoint(-6.0F, 5.0F, 10.0F);
    this.fleg_1_R.setTextureSize(256, 256);
    this.fleg_1_R.mirror = true;
    setRotation(this.fleg_1_R, -0.6108652F, 0.0F, 0.3316126F);
    this.fleg_2_L = new ModelRenderer(this, 21, 108);
    this.fleg_2_L.addBox(1.0F, 0.0F, -3.0F, 2, 14, 4);
    this.fleg_2_L.setRotationPoint(8.0F, 13.0F, 6.0F);
    this.fleg_2_L.setTextureSize(256, 256);
    this.fleg_2_L.mirror = true;
    setRotation(this.fleg_2_L, 0.6108652F, 0.0F, -0.1745329F);
    this.fleg_2_R = new ModelRenderer(this, 21, 108);
    this.fleg_2_R.addBox(-2.0F, 0.0F, -3.0F, 2, 14, 4);
    this.fleg_2_R.setRotationPoint(-10.0F, 13.0F, 6.0F);
    this.fleg_2_R.setTextureSize(256, 256);
    this.fleg_2_R.mirror = true;
    setRotation(this.fleg_2_R, 0.6108652F, 0.0F, 0.1745329F);
    this.ffootL = new ModelRenderer(this, 50, 29);
    this.ffootL.addBox(-2.0F, -1.0F, -8.0F, 4, 2, 9);
    this.ffootL.setRotationPoint(12.0F, 24.0F, 11.0F);
    this.ffootL.setTextureSize(256, 256);
    this.ffootL.mirror = true;
    setRotation(this.ffootL, 0.0F, 0.0F, 0.0F);
    this.ffootR = new ModelRenderer(this, 50, 29);
    this.ffootR.addBox(-1.0F, 1.0F, -8.0F, 4, 2, 9);
    this.ffootR.setRotationPoint(-14.0F, 22.0F, 11.0F);
    this.ffootR.setTextureSize(256, 256);
    this.ffootR.mirror = true;
    setRotation(this.ffootR, 0.0F, 0.0F, 0.0F);
    this.fwing_3_L = new ModelRenderer(this, 0, 0);
    this.fwing_3_L.addBox(-7.5F, 0.0F, -5.0F, 16, 1, 26);
    this.fwing_3_L.setRotationPoint(-5.0F, 0.0F, 12.0F);
    this.fwing_3_L.setTextureSize(256, 256);
    this.fwing_3_L.mirror = true;
    setRotation(this.fwing_3_L, -0.4886922F, -0.5235988F, 0.4014257F);
    this.fwing_3_R = new ModelRenderer(this, 150, 0);
    this.fwing_3_R.addBox(-8.5F, 0.0F, -5.0F, 16, 1, 26);
    this.fwing_3_R.setRotationPoint(4.0F, 0.0F, 12.0F);
    this.fwing_3_R.setTextureSize(256, 256);
    this.fwing_3_R.mirror = true;
    setRotation(this.fwing_3_R, -0.4886922F, 0.5235988F, -0.4014257F);
    this.fwing_4_L = new ModelRenderer(this, 8, 117);
    this.fwing_4_L.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 31);
    this.fwing_4_L.setRotationPoint(6.0F, 6.0F, 24.0F);
    this.fwing_4_L.setTextureSize(256, 256);
    this.fwing_4_L.mirror = true;
    setRotation(this.fwing_4_L, -0.6283185F, -0.0174533F, 0.0F);
    this.fwing_4_R = new ModelRenderer(this, 8, 117);
    this.fwing_4_R.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 31);
    this.fwing_4_R.setRotationPoint(-7.0F, 6.0F, 24.0F);
    this.fwing_4_R.setTextureSize(256, 256);
    this.fwing_4_R.mirror = true;
    setRotation(this.fwing_4_R, -0.6283185F, 0.0174533F, 0.0F);
    this.fclaw_L = new ModelRenderer(this, 0, 129);
    this.fclaw_L.addBox(0.0F, -1.0F, -9.0F, 1, 2, 10);
    this.fclaw_L.setRotationPoint(30.0F, 23.0F, -20.0F);
    this.fclaw_L.setTextureSize(256, 256);
    this.fclaw_L.mirror = true;
    setRotation(this.fclaw_L, 0.0F, 0.1570796F, 0.0F);
    this.fclaw_R = new ModelRenderer(this, 0, 129);
    this.fclaw_R.addBox(0.0F, -1.0F, -9.0F, 1, 2, 10);
    this.fclaw_R.setRotationPoint(-31.0F, 23.0F, -20.0F);
    this.fclaw_R.setTextureSize(256, 256);
    this.fclaw_R.mirror = true;
    setRotation(this.fclaw_R, 0.0F, -0.1570796F, 0.0F);
    this.fclaw_L2 = new ModelRenderer(this, 18, 38);
    this.fclaw_L2.addBox(0.0F, -2.5F, -6.0F, 1, 2, 7);
    this.fclaw_L2.setRotationPoint(-30.0F, 23.0F, -28.0F);
    this.fclaw_L2.setTextureSize(256, 256);
    this.fclaw_L2.mirror = true;
    setRotation(this.fclaw_L2, 0.5061455F, -0.2792527F, 0.0F);
    this.fclaw_R_2 = new ModelRenderer(this, 18, 38);
    this.fclaw_R_2.addBox(-1.0F, -2.5F, -6.0F, 1, 2, 7);
    this.fclaw_R_2.setRotationPoint(30.0F, 23.0F, -28.0F);
    this.fclaw_R_2.setTextureSize(256, 256);
    this.fclaw_R_2.mirror = true;
    setRotation(this.fclaw_R_2, 0.5061455F, 0.2792527F, 0.0F);
    this.fwing_5_L = new ModelRenderer(this, 46, 10);
    this.fwing_5_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_5_L.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.fwing_5_L.setTextureSize(256, 256);
    this.fwing_5_L.mirror = true;
    setRotation(this.fwing_5_L, 0.6806784F, 0.0523599F, -0.2792527F);
    this.fwing_6_L = new ModelRenderer(this, 46, 10);
    this.fwing_6_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_6_L.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.fwing_6_L.setTextureSize(256, 256);
    this.fwing_6_L.mirror = true;
    setRotation(this.fwing_6_L, 0.4537856F, 0.2443461F, -0.3665191F);
    this.fwing_7_L = new ModelRenderer(this, 46, 10);
    this.fwing_7_L.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_7_L.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.fwing_7_L.setTextureSize(256, 256);
    this.fwing_7_L.mirror = true;
    setRotation(this.fwing_7_L, 0.1396263F, -0.3316126F, 0.4014257F);
    this.fwing_5_R = new ModelRenderer(this, 46, 10);
    this.fwing_5_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_5_R.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.fwing_5_R.setTextureSize(256, 256);
    this.fwing_5_R.mirror = true;
    setRotation(this.fwing_5_R, 0.6806784F, -0.0523599F, 0.2792527F);
    this.fwing_6_R = new ModelRenderer(this, 46, 10);
    this.fwing_6_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_6_R.setRotationPoint(-30.0F, 21.0F, -19.0F);
    this.fwing_6_R.setTextureSize(256, 256);
    this.fwing_6_R.mirror = true;
    setRotation(this.fwing_6_R, 0.4537856F, -0.2443461F, 0.3665191F);
    this.fwing_7_R = new ModelRenderer(this, 46, 10);
    this.fwing_7_R.addBox(-1.0F, -3.0F, -1.0F, 1, 8, 31);
    this.fwing_7_R.setRotationPoint(31.0F, 21.0F, -19.0F);
    this.fwing_7_R.setTextureSize(256, 256);
    this.fwing_7_R.mirror = true;
    setRotation(this.fwing_7_R, 0.1396263F, 0.3316126F, -0.4014257F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Leon e = (Leon)entity;
    RenderInfo r = null;
    float newangle = 0.0F;
    float newangle2 = 0.0F;
    float newangle3 = 0.0F;
    float spd = 1.0F;
    float amp = 1.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.8F * this.wingspeed) * 3.1415927F * 0.25F * f1;
      newangle2 = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
      newangle2 = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.02F;
      if (e.isSitting())
        newangle2 = 0.0F; 
    } 
    if (e.getActivity() == 0) {
      this.leg_1_L.rotateAngleX = -0.611F + newangle;
      this.leg_1_R.rotateAngleX = -0.611F - newangle;
      this.leg_2_L.rotateAngleX = 0.611F + newangle;
      this.leg_2_L.rotationPointZ = (float)(this.leg_1_L.rotationPointZ + Math.sin(this.leg_1_L.rotateAngleX) * 9.0D);
      this.leg_2_L.rotationPointY = (float)(this.leg_1_L.rotationPointY + Math.cos(this.leg_1_L.rotateAngleX) * 9.0D);
      this.leg_2_R.rotateAngleX = 0.611F - newangle;
      this.leg_2_R.rotationPointZ = (float)(this.leg_1_R.rotationPointZ + Math.sin(this.leg_1_R.rotateAngleX) * 9.0D);
      this.leg_2_R.rotationPointY = (float)(this.leg_1_R.rotationPointY + Math.cos(this.leg_1_R.rotateAngleX) * 9.0D);
      this.footL.rotationPointZ = (float)(this.leg_2_L.rotationPointZ + Math.sin(this.leg_2_L.rotateAngleX) * 13.0D);
      this.footL.rotationPointY = (float)(this.leg_2_L.rotationPointY + Math.cos(this.leg_2_L.rotateAngleX) * 13.0D);
      this.footR.rotationPointZ = (float)(this.leg_2_R.rotationPointZ + Math.sin(this.leg_2_R.rotateAngleX) * 11.0D);
      this.footR.rotationPointY = (float)(this.leg_2_R.rotationPointY + Math.cos(this.leg_2_R.rotateAngleX) * 11.0D);
      this.wing_3_R.rotateAngleY = 0.523F - newangle / 10.0F;
      this.wing_3_L.rotateAngleY = -0.523F - newangle / 10.0F;
      newangle /= 2.0F;
      this.arm_1_L.rotateAngleX = -0.07F - newangle;
      this.arm_1_R.rotateAngleX = -0.07F + newangle;
      this.wing_1_L.rotateAngleX = -0.17F - newangle;
      this.wing_1_R.rotateAngleX = -0.17F + newangle;
      this.arm_2_L.rotateAngleX = -0.471F - newangle;
      this.wing_2_L.rotateAngleX = -0.523F - newangle;
      this.wing_2_L.rotationPointZ = (float)(this.arm_1_L.rotationPointZ + Math.sin(this.arm_1_L.rotateAngleX) * 11.0D);
      this.wing_2_L.rotationPointY = (float)(this.arm_1_L.rotationPointY + Math.cos(this.arm_1_L.rotateAngleX) * 11.0D);
      this.wing_5_L.rotateAngleX = 0.68F + newangle2 / 2.0F;
      this.wing_6_L.rotateAngleX = 0.453F + newangle2 / 4.0F;
      this.wing_7_R.rotateAngleX = 0.119F + newangle2 / 8.0F;
      this.wing_5_L.rotationPointZ = (float)(this.arm_2_L.rotationPointZ + Math.sin(this.arm_2_L.rotateAngleX) * 20.0D);
      this.wing_5_L.rotationPointY = (float)(this.arm_2_L.rotationPointY + Math.cos(this.arm_2_L.rotateAngleX) * 20.0D);
      this.wing_6_L.rotationPointZ = this.wing_5_L.rotationPointZ;
      this.wing_6_L.rotationPointY = this.wing_5_L.rotationPointY;
      this.wing_7_R.rotationPointZ = this.wing_5_L.rotationPointZ;
      this.wing_7_R.rotationPointY = this.wing_5_L.rotationPointY;
      this.wing_5_L.rotationPointZ--;
      this.wing_5_L.rotationPointZ -= 9.0F;
      this.wing_5_L.rotationPointY += 2.0F;
      this.wing_5_L.rotationPointY += 2.0F;
      this.arm_2_R.rotateAngleX = -0.471F + newangle;
      this.wing_2_R.rotateAngleX = -0.523F + newangle;
      this.wing_2_R.rotationPointZ = (float)(this.arm_1_R.rotationPointZ + Math.sin(this.arm_1_R.rotateAngleX) * 11.0D);
      this.wing_2_R.rotationPointY = (float)(this.arm_1_R.rotationPointY + Math.cos(this.arm_1_R.rotateAngleX) * 11.0D);
      this.wing_5_R.rotateAngleX = 0.68F + newangle2 / 2.0F;
      this.wing_6_R.rotateAngleX = 0.453F + newangle2 / 4.0F;
      this.wing_7_L.rotateAngleX = 0.119F + newangle2 / 8.0F;
      this.wing_5_R.rotationPointZ = (float)(this.arm_2_R.rotationPointZ + Math.sin(this.arm_2_R.rotateAngleX) * 20.0D);
      this.wing_5_R.rotationPointY = (float)(this.arm_2_R.rotationPointY + Math.cos(this.arm_2_R.rotateAngleX) * 20.0D);
      this.wing_6_R.rotationPointZ = this.wing_5_R.rotationPointZ;
      this.wing_6_R.rotationPointY = this.wing_5_R.rotationPointY;
      this.wing_7_L.rotationPointZ = this.wing_5_R.rotationPointZ;
      this.wing_7_L.rotationPointY = this.wing_5_R.rotationPointY;
      this.wing_5_R.rotationPointZ--;
      this.wing_5_R.rotationPointZ -= 9.0F;
      this.wing_5_R.rotationPointY += 2.0F;
      this.wing_5_R.rotationPointY += 2.0F;
      newangle2 = MathHelper.cos(f2 * 0.6F * this.wingspeed) * 3.1415927F * 0.02F;
      this.chest.rotateAngleX = -0.436F + newangle2 / 8.0F;
      this.chest_ridge.rotateAngleX = this.chest.rotateAngleX;
      this.bottom_jaw.rotateAngleX = -1.308F + newangle2 / 2.0F;
      this.lower_sail1.rotateAngleX = 0.297F + newangle2 / 2.0F;
      this.lower_sail2.rotateAngleX = 0.384F + newangle2 / 2.0F;
      this.lower_sail_3.rotateAngleX = -0.384F + newangle2 / 2.0F;
      newangle = (float)Math.toRadians(f3) * 0.5F;
      this.upper_sail3.rotateAngleY = newangle;
      this.eye_ridge_L.rotateAngleY = 0.558F + newangle;
      this.anntena_1_L.rotateAngleY = 0.366F + newangle;
      this.anntena_2_L.rotateAngleY = 0.139F + newangle;
      this.eye_ridge_R.rotateAngleY = -0.558F + newangle;
      this.anntena_1_R.rotateAngleY = -0.366F + newangle;
      this.anntena_2_R.rotateAngleY = -0.139F + newangle;
      this.lower_sail_3.rotateAngleY = newangle;
      this.bottom_jaw.rotationPointZ = (float)(this.head.rotationPointZ - Math.cos(newangle) * 5.0D);
      this.bottom_jaw.rotationPointX = (float)(this.head.rotationPointX - Math.sin(newangle) * 5.0D);
      this.chest.render(f5);
      this.neck_1.render(f5);
      this.neck_2.render(f5);
      this.neck_3.render(f5);
      this.abdomen.render(f5);
      this.head.render(f5);
      this.upper_jaw.render(f5);
      this.bottom_jaw.render(f5);
      this.chest_ridge.render(f5);
      this.upper_sail_1.render(f5);
      this.upper_sail2_.render(f5);
      this.upper_sail3.render(f5);
      this.lower_sail1.render(f5);
      this.lower_sail2.render(f5);
      this.lower_sail_3.render(f5);
      this.eye_ridge_L.render(f5);
      this.eye_ridge_R.render(f5);
      this.anntena_1_L.render(f5);
      this.anntena_1_R.render(f5);
      this.anntena_2_L.render(f5);
      this.anntena_2_R.render(f5);
      this.arm_1_L.render(f5);
      this.arm_2_L.render(f5);
      this.wing_1_L.render(f5);
      this.wing_2_L.render(f5);
      this.arm_1_R.render(f5);
      this.arm_2_R.render(f5);
      this.wing_1_R.render(f5);
      this.wing_2_R.render(f5);
      this.leg_1_L.render(f5);
      this.leg_1_R.render(f5);
      this.leg_2_L.render(f5);
      this.leg_2_R.render(f5);
      this.footL.render(f5);
      this.footR.render(f5);
      this.wing_3_L.render(f5);
      this.wing_3_R.render(f5);
      this.wing_4_L.render(f5);
      this.wing_4_R.render(f5);
      this.claw_L.render(f5);
      this.claw_R.render(f5);
      this.claw_L2.render(f5);
      this.claw_R_2.render(f5);
      this.wing_5_L.render(f5);
      this.wing_6_L.render(f5);
      this.wing_7_L.render(f5);
      this.wing_5_R.render(f5);
      this.wing_6_R.render(f5);
      this.wing_7_R.render(f5);
    } else {
      if (e.getAttacking() != 0) {
        spd = 1.7F;
        amp = 1.4F;
      } 
      newangle2 = MathHelper.cos(f2 * 1.6F * this.wingspeed * spd) * 3.1415927F * 0.06F;
      this.fchest.rotateAngleX = newangle2 / 8.0F;
      this.fchest_ridge.rotateAngleX = -0.18F + this.fchest.rotateAngleX;
      if (e.getBeingRidden() == 0) {
        this.fchest.rotationPointY = (float)(-2.0D + Math.sin(newangle2) * 10.0D * amp);
      } else {
        this.fchest.rotationPointY = -2.0F;
      } 
      this.fchest_ridge.rotationPointY = this.fchest.rotationPointY;
      this.fabdomen.rotateAngleX = 0.0F;
      this.fabdomen.rotationPointZ = (float)(this.fchest.rotationPointZ + Math.cos(this.fchest.rotateAngleX) * 8.0D);
      this.fabdomen.rotationPointY = (float)(this.fchest.rotationPointY - Math.sin(this.fchest.rotateAngleX) * 8.0D - 6.0D);
      this.fwing_3_R.rotationPointY = this.fabdomen.rotationPointY;
      this.fwing_3_L.rotationPointY = this.fabdomen.rotationPointY;
      this.fwing_3_R.rotateAngleX = this.fwing_3_R.rotateAngleZ = 0.0F;
      this.fwing_3_L.rotateAngleX = this.fwing_3_L.rotateAngleZ = 0.0F;
      this.fwing_3_R.rotateAngleY = 0.785F;
      this.fwing_3_L.rotateAngleY = -0.785F;
      this.fabdomen.rotationPointY += 0.55F;
      this.fabdomen.rotationPointY += 0.55F;
      this.fabdomen.rotationPointZ += 26.0F;
      this.fabdomen.rotationPointZ += 26.0F;
      this.fwing_4_R.rotationPointX = this.fabdomen.rotationPointZ + 8.0F;
      this.fwing_4_L.rotationPointX = this.fabdomen.rotationPointZ - 9.0F;
      this.fwing_4_R.rotateAngleX = newangle2 / 10.0F;
      this.fwing_4_L.rotateAngleX = -newangle2 / 10.0F;
      if (e.getAttacking() == 0) {
        newangle = 1.5707964F;
        this.fabdomen.rotationPointY += 5.0F;
        this.fabdomen.rotationPointY += 5.0F;
        this.fleg_1_L.rotateAngleX = -0.1F + newangle;
        this.fleg_1_R.rotateAngleX = -0.1F + newangle;
        this.fleg_2_L.rotateAngleX = 0.1F + newangle;
        this.fleg_2_L.rotationPointZ = (float)(this.fleg_1_L.rotationPointZ + Math.sin(this.fleg_1_L.rotateAngleX) * 9.0D);
        this.fleg_2_L.rotationPointY = (float)(this.fleg_1_L.rotationPointY + Math.cos(this.fleg_1_L.rotateAngleX) * 9.0D);
        this.fleg_2_R.rotateAngleX = 0.1F + newangle;
        this.fleg_2_R.rotationPointZ = (float)(this.fleg_1_R.rotationPointZ + Math.sin(this.fleg_1_R.rotateAngleX) * 9.0D);
        this.fleg_2_R.rotationPointY = (float)(this.fleg_1_R.rotationPointY + Math.cos(this.fleg_1_R.rotateAngleX) * 9.0D);
        this.ffootL.rotationPointZ = (float)(this.fleg_2_L.rotationPointZ + Math.sin(this.fleg_2_L.rotateAngleX) * 13.0D);
        this.ffootL.rotationPointY = (float)(this.fleg_2_L.rotationPointY + Math.cos(this.fleg_2_L.rotateAngleX) * 13.0D);
        this.ffootR.rotationPointZ = (float)(this.fleg_2_R.rotationPointZ + Math.sin(this.fleg_2_R.rotateAngleX) * 11.0D);
        this.ffootR.rotationPointY = (float)(this.fleg_2_R.rotationPointY + Math.cos(this.fleg_2_R.rotateAngleX) * 11.0D);
        this.ffootL.rotateAngleX = 3.1415927F;
        this.ffootR.rotateAngleX = 3.1415927F;
        this.fleg_2_L.rotationPointX = this.fleg_1_L.rotationPointX;
        this.ffootL.rotationPointX = this.fleg_1_L.rotationPointX;
        this.fleg_2_R.rotationPointX = this.fleg_1_R.rotationPointX;
        this.ffootR.rotationPointX = this.fleg_1_R.rotationPointX;
      } else {
        newangle = -0.7853982F;
        newangle3 = MathHelper.cos(f2 * 3.6F * this.wingspeed) * 3.1415927F * 0.1F;
        this.fabdomen.rotationPointY += 5.0F;
        this.fabdomen.rotationPointY += 5.0F;
        this.fleg_1_L.rotateAngleX = -0.1F + newangle + newangle3;
        this.fleg_1_R.rotateAngleX = -0.1F + newangle - newangle3;
        this.fleg_2_L.rotateAngleX = 0.2F + newangle + newangle3 * 3.0F / 2.0F;
        this.fleg_2_L.rotationPointZ = (float)(this.fleg_1_L.rotationPointZ + Math.sin(this.fleg_1_L.rotateAngleX) * 9.0D);
        this.fleg_2_L.rotationPointY = (float)(this.fleg_1_L.rotationPointY + Math.cos(this.fleg_1_L.rotateAngleX) * 9.0D);
        this.fleg_2_R.rotateAngleX = 0.2F + newangle - newangle3 * 3.0F / 2.0F;
        this.fleg_2_R.rotationPointZ = (float)(this.fleg_1_R.rotationPointZ + Math.sin(this.fleg_1_R.rotateAngleX) * 9.0D);
        this.fleg_2_R.rotationPointY = (float)(this.fleg_1_R.rotationPointY + Math.cos(this.fleg_1_R.rotateAngleX) * 9.0D);
        this.ffootL.rotationPointZ = (float)(this.fleg_2_L.rotationPointZ + Math.sin(this.fleg_2_L.rotateAngleX) * 13.0D);
        this.ffootL.rotationPointY = (float)(this.fleg_2_L.rotationPointY + Math.cos(this.fleg_2_L.rotateAngleX) * 13.0D);
        this.ffootR.rotationPointZ = (float)(this.fleg_2_R.rotationPointZ + Math.sin(this.fleg_2_R.rotateAngleX) * 11.0D);
        this.ffootR.rotationPointY = (float)(this.fleg_2_R.rotationPointY + Math.cos(this.fleg_2_R.rotateAngleX) * 11.0D);
        this.ffootL.rotateAngleX = -0.7853982F + newangle3 * 2.0F;
        this.ffootR.rotateAngleX = -0.7853982F - newangle3 * 2.0F;
        this.fleg_2_L.rotationPointX = 7.0F;
        this.ffootL.rotationPointX = 11.0F;
        this.fleg_2_R.rotationPointX = -9.0F;
        this.ffootR.rotationPointX = -13.0F;
      } 
      newangle = MathHelper.cos(f2 * 1.6F * this.wingspeed * spd) * 3.1415927F * 0.26F * amp;
      this.farm_1_L.rotateAngleZ = (float)(-1.5707963267948966D - newangle);
      this.farm_1_R.rotateAngleZ = (float)(1.5707963267948966D + newangle);
      this.fwing_1_L.rotateAngleZ = (float)(-1.5707963267948966D - newangle);
      this.fwing_1_R.rotateAngleZ = (float)(1.5707963267948966D + newangle);
      this.farm_2_L.rotateAngleZ = (float)(-1.5707963267948966D - (newangle * 1.3F));
      this.fwing_2_L.rotateAngleZ = (float)(-1.5707963267948966D - (newangle * 1.3F));
      this.fwing_2_L.rotationPointX = (float)(this.farm_1_L.rotationPointX + Math.cos(newangle) * 14.0D);
      this.fwing_2_L.rotationPointY = (float)(this.farm_1_L.rotationPointY - Math.sin(newangle) * 14.0D);
      this.fwing_5_L.rotationPointX = (float)(this.farm_2_L.rotationPointX + Math.cos((newangle * 1.3F)) * 20.0D);
      this.fwing_5_L.rotationPointY = (float)(this.farm_2_L.rotationPointY - Math.sin((newangle * 1.3F)) * 20.0D);
      this.fwing_6_L.rotationPointX = this.fwing_5_L.rotationPointX;
      this.fwing_6_L.rotationPointY = this.fwing_5_L.rotationPointY;
      this.fwing_7_R.rotationPointX = this.fwing_5_L.rotationPointX;
      this.fwing_7_R.rotationPointY = this.fwing_5_L.rotationPointY;
      this.fclaw_L.rotationPointX = this.fwing_5_L.rotationPointX;
      this.fclaw_R_2.rotationPointX = this.fwing_5_L.rotationPointX;
      this.fclaw_L.rotationPointY = this.fwing_5_L.rotationPointY;
      this.fclaw_R_2.rotationPointY = this.fwing_5_L.rotationPointY;
      this.fwing_5_L.rotateAngleZ = (float)(-1.5707963267948966D - (newangle * 1.65F));
      this.fwing_6_L.rotateAngleZ = (float)(-1.5707963267948966D - (newangle * 1.65F));
      this.fwing_7_R.rotateAngleZ = (float)(-1.5707963267948966D - (newangle * 1.65F));
      this.fwing_7_R.rotateAngleX = -1.5707964F;
      this.fwing_6_L.rotateAngleX = -1.1780972F;
      this.fwing_5_L.rotateAngleX = -0.7853982F;
      this.farm_2_R.rotateAngleZ = (float)(1.5707963267948966D + (newangle * 1.3F));
      this.fwing_2_R.rotateAngleZ = (float)(1.5707963267948966D + (newangle * 1.3F));
      this.fwing_2_R.rotationPointX = (float)(this.farm_1_R.rotationPointX - Math.cos(newangle) * 14.0D);
      this.fwing_2_R.rotationPointY = (float)(this.farm_1_R.rotationPointY - Math.sin(newangle) * 14.0D);
      this.fwing_5_R.rotationPointX = (float)(this.farm_2_R.rotationPointX - Math.cos((newangle * 1.3F)) * 20.0D);
      this.fwing_5_R.rotationPointY = (float)(this.farm_2_R.rotationPointY - Math.sin((newangle * 1.3F)) * 20.0D);
      this.fwing_6_R.rotationPointX = this.fwing_5_R.rotationPointX;
      this.fwing_6_R.rotationPointY = this.fwing_5_R.rotationPointY;
      this.fwing_7_L.rotationPointX = this.fwing_5_R.rotationPointX;
      this.fwing_7_L.rotationPointY = this.fwing_5_R.rotationPointY;
      this.fclaw_R.rotationPointX = this.fwing_5_R.rotationPointX;
      this.fclaw_L2.rotationPointX = this.fwing_5_R.rotationPointX;
      this.fclaw_R.rotationPointY = this.fwing_5_R.rotationPointY;
      this.fclaw_L2.rotationPointY = this.fwing_5_R.rotationPointY;
      this.fwing_5_R.rotateAngleZ = (float)(1.5707963267948966D + (newangle * 1.65F));
      this.fwing_6_R.rotateAngleZ = (float)(1.5707963267948966D + (newangle * 1.65F));
      this.fwing_7_L.rotateAngleZ = (float)(1.5707963267948966D + (newangle * 1.65F));
      this.fwing_7_L.rotateAngleX = -1.5707964F;
      this.fwing_6_R.rotateAngleX = -1.1780972F;
      this.fwing_5_R.rotateAngleX = -0.7853982F;
      this.fneck_1.rotateAngleX = -newangle / 12.0F;
      this.fneck_1.rotationPointZ = (float)(this.fchest.rotationPointZ - Math.cos(this.fchest.rotateAngleX) * 10.0D);
      this.fneck_1.rotationPointY = (float)(this.fchest.rotationPointY + Math.sin(this.fchest.rotateAngleX) * 8.0D - 1.0D);
      this.fneck_2.rotateAngleX = -newangle / 10.0F;
      this.fneck_2.rotationPointZ = (float)(this.fneck_1.rotationPointZ - Math.cos(this.fneck_1.rotateAngleX) * 7.0D);
      this.fneck_2.rotationPointY = (float)(this.fneck_1.rotationPointY + Math.sin(this.fneck_1.rotateAngleX) * 6.0D - 1.0D);
      this.fneck_3.rotateAngleX = -newangle / 8.0F;
      this.fneck_3.rotationPointZ = (float)(this.fneck_2.rotationPointZ - Math.cos(this.fneck_2.rotateAngleX) * 7.0D);
      this.fneck_3.rotationPointY = (float)(this.fneck_2.rotationPointY + Math.sin(this.fneck_2.rotateAngleX) * 5.0D);
      this.fhead.rotationPointZ = (float)(this.fneck_3.rotationPointZ - Math.cos(this.fneck_3.rotateAngleX) * 16.0D);
      this.fhead.rotationPointY = (float)(this.fneck_3.rotationPointY + Math.sin(this.fneck_3.rotateAngleX) * 15.0D);
      this.fupper_jaw.rotationPointZ = this.fhead.rotationPointZ;
      this.fupper_sail_1.rotationPointZ = this.fhead.rotationPointZ;
      this.fupper_sail2_.rotationPointZ = this.fhead.rotationPointZ;
      this.fupper_sail3.rotationPointZ = this.fhead.rotationPointZ;
      this.feye_ridge_L.rotationPointZ = this.fhead.rotationPointZ;
      this.fanntena_1_L.rotationPointZ = this.fhead.rotationPointZ;
      this.fanntena_2_L.rotationPointZ = this.fhead.rotationPointZ;
      this.feye_ridge_R.rotationPointZ = this.fhead.rotationPointZ;
      this.fanntena_1_R.rotationPointZ = this.fhead.rotationPointZ;
      this.fanntena_2_R.rotationPointZ = this.fhead.rotationPointZ;
      this.fhead.rotationPointZ -= 5.0F;
      this.fhead.rotationPointZ -= 5.0F;
      this.fhead.rotationPointZ -= 5.0F;
      this.fhead.rotationPointZ -= 5.0F;
      this.fupper_jaw.rotationPointY = this.fhead.rotationPointY;
      this.fupper_sail_1.rotationPointY = this.fhead.rotationPointY;
      this.fupper_sail2_.rotationPointY = this.fhead.rotationPointY;
      this.fupper_sail3.rotationPointY = this.fhead.rotationPointY;
      this.feye_ridge_L.rotationPointY = this.fhead.rotationPointY;
      this.fanntena_1_L.rotationPointY = this.fhead.rotationPointY;
      this.fanntena_2_L.rotationPointY = this.fhead.rotationPointY;
      this.feye_ridge_R.rotationPointY = this.fhead.rotationPointY;
      this.fanntena_1_R.rotationPointY = this.fhead.rotationPointY;
      this.fanntena_2_R.rotationPointY = this.fhead.rotationPointY;
      this.fhead.rotationPointY += 4.0F;
      this.fhead.rotationPointY += 4.0F;
      this.fhead.rotationPointY += 4.0F;
      this.fhead.rotationPointY += 4.0F;
      if (e.getBeingRidden() == 0) {
        newangle = (float)Math.toRadians(f3) * 0.5F;
      } else {
        r = e.getRenderInfo();
        f3 = (e.prevRotationYaw - e.rotationYaw) * 8.0F;
        f3 = -f3;
        r.rf1 += (f3 - r.rf1) / 60.0F;
        if (r.rf1 > 50.0F)
          r.rf1 = 50.0F; 
        if (r.rf1 < -50.0F)
          r.rf1 = -50.0F; 
        f3 = r.rf1;
        e.setRenderInfo(r);
        newangle = (float)Math.toRadians(f3) * 0.5F;
      } 
      this.fupper_sail3.rotateAngleY = newangle;
      this.feye_ridge_L.rotateAngleY = 0.558F + newangle;
      this.fanntena_1_L.rotateAngleY = 0.366F + newangle;
      this.fanntena_2_L.rotateAngleY = 0.139F + newangle;
      this.feye_ridge_R.rotateAngleY = -0.558F + newangle;
      this.fanntena_1_R.rotateAngleY = -0.366F + newangle;
      this.fanntena_2_R.rotateAngleY = -0.139F + newangle;
      this.flower_sail_3.rotateAngleY = newangle;
      this.fbottom_jaw.rotationPointZ = (float)(this.fhead.rotationPointZ - Math.cos(newangle) * 5.0D);
      this.fbottom_jaw.rotationPointX = (float)(this.fhead.rotationPointX - Math.sin(newangle) * 5.0D);
      float tf1 = 1.605F;
      float tf2 = 1.6919999F;
      float tf3 = 0.92399997F;
      if (e.getAttacking() == 0) {
        this.fbottom_jaw.rotateAngleX = -1.308F + newangle2 / 2.0F;
      } else {
        newangle2 = MathHelper.cos(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.16F;
        this.fbottom_jaw.rotateAngleX = -0.9F + newangle2;
      } 
      this.fbottom_jaw.rotateAngleX += tf1;
      this.fbottom_jaw.rotateAngleX += tf2;
      this.fbottom_jaw.rotateAngleX += tf3;
      this.fchest.render(f5);
      this.fneck_1.render(f5);
      this.fneck_2.render(f5);
      this.fneck_3.render(f5);
      this.fabdomen.render(f5);
      this.fhead.render(f5);
      this.fupper_jaw.render(f5);
      this.fbottom_jaw.render(f5);
      this.fchest_ridge.render(f5);
      this.fupper_sail_1.render(f5);
      this.fupper_sail2_.render(f5);
      this.fupper_sail3.render(f5);
      this.flower_sail1.render(f5);
      this.flower_sail2.render(f5);
      this.flower_sail_3.render(f5);
      this.feye_ridge_L.render(f5);
      this.feye_ridge_R.render(f5);
      this.fanntena_1_L.render(f5);
      this.fanntena_1_R.render(f5);
      this.fanntena_2_L.render(f5);
      this.fanntena_2_R.render(f5);
      this.farm_1_L.render(f5);
      this.farm_2_L.render(f5);
      this.fwing_1_L.render(f5);
      this.fwing_2_L.render(f5);
      this.farm_1_R.render(f5);
      this.farm_2_R.render(f5);
      this.fwing_1_R.render(f5);
      this.fwing_2_R.render(f5);
      this.fleg_1_L.render(f5);
      this.fleg_1_R.render(f5);
      this.fleg_2_L.render(f5);
      this.fleg_2_R.render(f5);
      this.ffootL.render(f5);
      this.ffootR.render(f5);
      this.fwing_3_L.render(f5);
      this.fwing_3_R.render(f5);
      this.fwing_4_L.render(f5);
      this.fwing_4_R.render(f5);
      this.fclaw_L.render(f5);
      this.fclaw_R.render(f5);
      this.fclaw_L2.render(f5);
      this.fclaw_R_2.render(f5);
      this.fwing_5_L.render(f5);
      this.fwing_6_L.render(f5);
      this.fwing_7_L.render(f5);
      this.fwing_5_R.render(f5);
      this.fwing_6_R.render(f5);
      this.fwing_7_R.render(f5);
    } 
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
