package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCaveFisher extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Nose;
    ModelRenderer EyeLeft;
    ModelRenderer HeadMid;
    ModelRenderer HeadEnd;
    ModelRenderer TailTuft;
    ModelRenderer EyeRight;
    ModelRenderer BodyTopLeft4;
    ModelRenderer BodyTopRight4;
    ModelRenderer BodyTopLeft1;
    ModelRenderer BodyTopRight1;
    ModelRenderer BodyTopRight2;
    ModelRenderer BodyTopLeft2;
    ModelRenderer BodyTopRight3;
    ModelRenderer BodyTopLeft3;
    ModelRenderer HeadBase;
    ModelRenderer TailBase;
    ModelRenderer BodyLow2;
    ModelRenderer BodyLow1;
    ModelRenderer Spine5;
    ModelRenderer Spine1;
    ModelRenderer Spine2;
    ModelRenderer Spine3;
    ModelRenderer Spine4;
    ModelRenderer RightArmSeg4;
    ModelRenderer LeftArmSeg1;
    ModelRenderer LeftArmSeg3;
    ModelRenderer RightArmSeg2;
    ModelRenderer RightArmSeg1;
    ModelRenderer LeftArmSeg5;
    ModelRenderer LeftArmSeg2;
    ModelRenderer LeftClawTop;
    ModelRenderer RightArmSeg3;
    ModelRenderer RightArmSeg5;
    ModelRenderer LeftArmSeg4;
    ModelRenderer LeftClawBase;
    ModelRenderer RightClawBase;
    ModelRenderer LeftClawLow;
    ModelRenderer RightClawTop;
    ModelRenderer RightClawLow;
    ModelRenderer LBLeg1;
    ModelRenderer LBLeg3;
    ModelRenderer RBLeg1;
    ModelRenderer RBLeg3;
    ModelRenderer LBLeg2;
    ModelRenderer RBLeg2;
    ModelRenderer LBLeg4;
    ModelRenderer RBLeg4;
    ModelRenderer RBLeg5;
    ModelRenderer LBLeg6;
    ModelRenderer RBLeg6;
    ModelRenderer LBLeg5;
    ModelRenderer RFLeg1;
    ModelRenderer RFLeg2;
    ModelRenderer RFLeg3;
    ModelRenderer RFLeg4;
    ModelRenderer RFLeg5;
    ModelRenderer RFLeg6;
    ModelRenderer RMLeg1;
    ModelRenderer RMLeg2;
    ModelRenderer RMLeg3;
    ModelRenderer RMLeg4;
    ModelRenderer RMLeg5;
    ModelRenderer RMLeg6;
    ModelRenderer LFLeg1;
    ModelRenderer LFLeg2;
    ModelRenderer LFLeg3;
    ModelRenderer LFLeg4;
    ModelRenderer LFLeg5;
    ModelRenderer LFLeg6;
    ModelRenderer LMLeg1;
    ModelRenderer LMLeg2;
    ModelRenderer LMLeg4;
    ModelRenderer LMLeg3;
    ModelRenderer LMLeg5;
    ModelRenderer LMLeg6;
    
    public ModelCaveFisher(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Nose = new ModelRenderer(this, 0, 0);
        this.Nose.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 6);
        this.Nose.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.Nose.setTextureSize(64, 32);
        this.Nose.mirror = true;
        setRotation(Nose, 0.0F, 0.0F, 0.0F);
        this.EyeLeft = new ModelRenderer(this, 0, 28);
        this.EyeLeft.addBox(0.5F, -2.5F, -2.5F, 3, 2, 2);
        this.EyeLeft.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.EyeLeft.setTextureSize(64, 32);
        this.EyeLeft.mirror = true;
        setRotation(EyeLeft, 0.0F, 0.0F, 0.0F);
        this.HeadMid = new ModelRenderer(this, 0, 0);
        this.HeadMid.addBox(-2.5F, -1.5F, -5.0F, 5, 3, 2);
        this.HeadMid.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.HeadMid.setTextureSize(64, 32);
        this.HeadMid.mirror = true;
        setRotation(HeadMid, 0.0F, 0.0F, 0.0F);
        this.HeadEnd = new ModelRenderer(this, 0, 0);
        this.HeadEnd.addBox(-2.0F, -1.0F, -6.0F, 4, 2, 1);
        this.HeadEnd.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.HeadEnd.setTextureSize(64, 32);
        this.HeadEnd.mirror = true;
        setRotation(HeadEnd, 0.0F, 0.0F, 0.0F);
        this.TailTuft = new ModelRenderer(this, 0, 23);
        this.TailTuft.addBox(-2.0F, -1.0F, 3.0F, 4, 1, 2);
        this.TailTuft.setRotationPoint(0.0F, 19.0F, 10.0F);
        this.TailTuft.setTextureSize(64, 32);
        this.TailTuft.mirror = true;
        setRotation(TailTuft, 0.0F, 0.0F, 0.0F);
        this.EyeRight = new ModelRenderer(this, 0, 28);
        this.EyeRight.addBox(-3.5F, -2.5F, -2.5F, 3, 2, 2);
        this.EyeRight.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.EyeRight.setTextureSize(64, 32);
        this.EyeRight.mirror = true;
        setRotation(EyeRight, 0.0F, 0.0F, 0.0F);
        this.BodyTopLeft4 = new ModelRenderer(this, 0, 0);
        this.BodyTopLeft4.addBox(0.0F, 0.0F, 0.0F, 6, 3, 4);
        this.BodyTopLeft4.setRotationPoint(0.0F, 16.2F, 7.0F);
        this.BodyTopLeft4.setTextureSize(64, 32);
        this.BodyTopLeft4.mirror = true;
        setRotation(BodyTopLeft4, 0.1047198F, 0.1047198F, 0.1047198F);
        this.BodyTopRight4 = new ModelRenderer(this, 0, 0);
        this.BodyTopRight4.addBox(-5.0F, 0.0F, 0.0F, 6, 3, 4);
        this.BodyTopRight4.setRotationPoint(-1.0F, 16.2F, 7.0F);
        this.BodyTopRight4.setTextureSize(64, 32);
        this.BodyTopRight4.mirror = true;
        setRotation(BodyTopRight4, 0.1047198F, -0.1047198F, -0.1047198F);
        this.BodyTopLeft1 = new ModelRenderer(this, 0, 0);
        this.BodyTopLeft1.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4);
        this.BodyTopLeft1.setRotationPoint(0.0F, 16.0F, -4.0F);
        this.BodyTopLeft1.setTextureSize(64, 32);
        this.BodyTopLeft1.mirror = true;
        setRotation(BodyTopLeft1, 0.1745329F, 0.1745329F, 0.1047198F);
        this.BodyTopRight1 = new ModelRenderer(this, 0, 0);
        this.BodyTopRight1.addBox(-5.0F, 0.0F, 0.0F, 5, 3, 4);
        this.BodyTopRight1.setRotationPoint(0.0F, 16.0F, -4.0F);
        this.BodyTopRight1.setTextureSize(64, 32);
        this.BodyTopRight1.mirror = true;
        setRotation(BodyTopRight1, 0.1745329F, -0.1745329F, -0.1047198F);
        this.BodyTopRight2 = new ModelRenderer(this, 0, 0);
        this.BodyTopRight2.addBox(-5.0F, 0.0F, 0.0F, 7, 3, 4);
        this.BodyTopRight2.setRotationPoint(-1.0F, 16.0F, -1.0F);
        this.BodyTopRight2.setTextureSize(64, 32);
        this.BodyTopRight2.mirror = true;
        setRotation(BodyTopRight2, 0.2094395F, -0.1745329F, -0.1047198F);
        this.BodyTopLeft2 = new ModelRenderer(this, 0, 0);
        this.BodyTopLeft2.addBox(-1.0F, 0.0F, 0.0F, 7, 3, 4);
        this.BodyTopLeft2.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.BodyTopLeft2.setTextureSize(64, 32);
        this.BodyTopLeft2.mirror = true;
        setRotation(BodyTopLeft2, 0.2094395F, 0.1745329F, 0.1047198F);
        this.BodyTopRight3 = new ModelRenderer(this, 0, 0);
        this.BodyTopRight3.addBox(-5.0F, 0.0F, 0.0F, 6, 3, 4);
        this.BodyTopRight3.setRotationPoint(-1.0F, 16.0F, 3.0F);
        this.BodyTopRight3.setTextureSize(64, 32);
        this.BodyTopRight3.mirror = true;
        setRotation(BodyTopRight3, 0.1396263F, -0.1396263F, -0.1047198F);
        this.BodyTopLeft3 = new ModelRenderer(this, 0, 0);
        this.BodyTopLeft3.addBox(0.0F, 0.0F, 0.0F, 6, 3, 4);
        this.BodyTopLeft3.setRotationPoint(0.0F, 16.0F, 3.0F);
        this.BodyTopLeft3.setTextureSize(64, 32);
        this.BodyTopLeft3.mirror = true;
        setRotation(BodyTopLeft3, 0.1396263F, 0.1396263F, 0.1047198F);
        this.HeadBase = new ModelRenderer(this, 0, 0);
        this.HeadBase.addBox(-3.0F, -2.0F, -3.0F, 6, 4, 3);
        this.HeadBase.setRotationPoint(0.0F, 19.0F, -4.0F);
        this.HeadBase.setTextureSize(64, 32);
        this.HeadBase.mirror = true;
        setRotation(HeadBase, 0.0F, 0.0F, 0.0F);
        this.TailBase = new ModelRenderer(this, 0, 0);
        this.TailBase.addBox(-3.0F, -2.0F, 0.0F, 6, 3, 3);
        this.TailBase.setRotationPoint(0.0F, 19.0F, 10.0F);
        this.TailBase.setTextureSize(64, 32);
        this.TailBase.mirror = true;
        setRotation(TailBase, 0.0F, 0.0F, 0.0F);
        this.BodyLow2 = new ModelRenderer(this, 34, 0);
        this.BodyLow2.addBox(0.0F, 0.0F, 0.0F, 8, 2, 7);
        this.BodyLow2.setRotationPoint(-4.0F, 18.3F, 3.0F);
        this.BodyLow2.setTextureSize(64, 32);
        this.BodyLow2.mirror = true;
        setRotation(BodyLow2, 0.0F, 0.0F, 0.0F);
        this.BodyLow1 = new ModelRenderer(this, 34, 0);
        this.BodyLow1.addBox(0.0F, 0.0F, 0.0F, 8, 2, 7);
        this.BodyLow1.setRotationPoint(-4.0F, 18.7F, -4.0F);
        this.BodyLow1.setTextureSize(64, 32);
        this.BodyLow1.mirror = true;
        setRotation(BodyLow1, 0.0F, 0.0F, 0.0F);
        this.Spine5 = new ModelRenderer(this, 0, 0);
        this.Spine5.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4);
        this.Spine5.setRotationPoint(0.0F, 16.0F, 8.6F);
        this.Spine5.setTextureSize(64, 32);
        this.Spine5.mirror = true;
        setRotation(Spine5, 0.0F, 0.0F, 0.0F);
        this.Spine1 = new ModelRenderer(this, 0, 0);
        this.Spine1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4);
        this.Spine1.setRotationPoint(0.0F, 16.0F, -4.2F);
        this.Spine1.setTextureSize(64, 32);
        this.Spine1.mirror = true;
        setRotation(Spine1, 0.2443461F, 0.0F, 0.0F);
        this.Spine2 = new ModelRenderer(this, 0, 0);
        this.Spine2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 5);
        this.Spine2.setRotationPoint(0.0F, 16.0F, -1.2F);
        this.Spine2.setTextureSize(64, 32);
        this.Spine2.mirror = true;
        setRotation(Spine2, 0.3141593F, 0.0F, 0.0F);
        this.Spine3 = new ModelRenderer(this, 0, 0);
        this.Spine3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 6);
        this.Spine3.setRotationPoint(0.0F, 16.0F, 1.8F);
        this.Spine3.setTextureSize(64, 32);
        this.Spine3.mirror = true;
        setRotation(Spine3, 0.2792527F, 0.0F, 0.0F);
        this.Spine4 = new ModelRenderer(this, 0, 0);
        this.Spine4.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 8);
        this.Spine4.setRotationPoint(0.0F, 16.0F, 3.8F);
        this.Spine4.setTextureSize(64, 32);
        this.Spine4.mirror = true;
        setRotation(Spine4, 0.1745329F, 0.0F, 0.0F);
        this.RightArmSeg4 = new ModelRenderer(this, 0, 0);
        this.RightArmSeg4.addBox(-3.2F, -1.0F, -10.5F, 2, 2, 4);
        this.RightArmSeg4.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightArmSeg4.setTextureSize(64, 32);
        this.RightArmSeg4.mirror = true;
        setRotation(RightArmSeg4, 0.0F, 0.0872665F, 0.0F);
        this.LeftArmSeg1 = new ModelRenderer(this, 0, 13);
        this.LeftArmSeg1.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4);
        this.LeftArmSeg1.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftArmSeg1.setTextureSize(64, 32);
        this.LeftArmSeg1.mirror = true;
        setRotation(LeftArmSeg1, 0.0F, -0.5235988F, 0.0F);
        this.LeftArmSeg3 = new ModelRenderer(this, 0, 13);
        this.LeftArmSeg3.addBox(1.0F, -0.5F, -8.0F, 1, 1, 3);
        this.LeftArmSeg3.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftArmSeg3.setTextureSize(64, 32);
        this.LeftArmSeg3.mirror = true;
        setRotation(LeftArmSeg3, 0.0F, -0.1745329F, 0.0F);
        this.RightArmSeg2 = new ModelRenderer(this, 0, 0);
        this.RightArmSeg2.addBox(-1.5F, -1.0F, -6.0F, 2, 2, 4);
        this.RightArmSeg2.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightArmSeg2.setTextureSize(64, 32);
        this.RightArmSeg2.mirror = true;
        setRotation(RightArmSeg2, 0.0F, 0.3490659F, 0.0F);
        this.RightArmSeg1 = new ModelRenderer(this, 0, 13);
        this.RightArmSeg1.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4);
        this.RightArmSeg1.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightArmSeg1.setTextureSize(64, 32);
        this.RightArmSeg1.mirror = true;
        setRotation(RightArmSeg1, 0.0F, 0.5235988F, 0.0F);
        this.LeftArmSeg5 = new ModelRenderer(this, 0, 13);
        this.LeftArmSeg5.addBox(2.4F, -0.5F, -12.0F, 1, 1, 3);
        this.LeftArmSeg5.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftArmSeg5.setTextureSize(64, 32);
        this.LeftArmSeg5.mirror = true;
        setRotation(LeftArmSeg5, 0.0F, 0.0F, 0.0F);
        this.LeftArmSeg2 = new ModelRenderer(this, 0, 0);
        this.LeftArmSeg2.addBox(-0.5F, -1.0F, -6.0F, 2, 2, 4);
        this.LeftArmSeg2.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftArmSeg2.setTextureSize(64, 32);
        this.LeftArmSeg2.mirror = true;
        setRotation(LeftArmSeg2, 0.0F, -0.3490659F, 0.0F);
        this.LeftClawTop = new ModelRenderer(this, 15, 15);
        this.LeftClawTop.addBox(1.8F, 4.7F, -15.0F, 2, 2, 5);
        this.LeftClawTop.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftClawTop.setTextureSize(64, 32);
        this.LeftClawTop.mirror = true;
        setRotation(LeftClawTop, -0.5410521F, 0.0F, 0.0F);
        this.RightArmSeg3 = new ModelRenderer(this, 0, 13);
        this.RightArmSeg3.addBox(-2.0F, -0.5F, -8.0F, 1, 1, 3);
        this.RightArmSeg3.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightArmSeg3.setTextureSize(64, 32);
        this.RightArmSeg3.mirror = true;
        setRotation(RightArmSeg3, 0.0F, 0.1745329F, 0.0F);
        this.RightArmSeg5 = new ModelRenderer(this, 0, 13);
        this.RightArmSeg5.addBox(-3.6F, -0.5F, -12.0F, 1, 1, 3);
        this.RightArmSeg5.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightArmSeg5.setTextureSize(64, 32);
        this.RightArmSeg5.mirror = true;
        setRotation(RightArmSeg5, 0.0F, 0.0F, 0.0F);
        this.LeftArmSeg4 = new ModelRenderer(this, 0, 0);
        this.LeftArmSeg4.addBox(1.1F, -1.0F, -10.5F, 2, 2, 4);
        this.LeftArmSeg4.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftArmSeg4.setTextureSize(64, 32);
        this.LeftArmSeg4.mirror = true;
        setRotation(LeftArmSeg4, 0.0F, -0.0872665F, 0.0F);
        this.LeftClawBase = new ModelRenderer(this, 0, 0);
        this.LeftClawBase.addBox(1.8F, -1.0F, -13.0F, 2, 2, 2);
        this.LeftClawBase.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftClawBase.setTextureSize(64, 32);
        this.LeftClawBase.mirror = true;
        setRotation(LeftClawBase, 0.0F, 0.0F, 0.0F);
        this.RightClawBase = new ModelRenderer(this, 0, 0);
        this.RightClawBase.addBox(-4.2F, -1.0F, -13.0F, 2, 2, 2);
        this.RightClawBase.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightClawBase.setTextureSize(64, 32);
        this.RightClawBase.mirror = true;
        setRotation(RightClawBase, 0.0F, 0.0F, 0.0F);
        this.LeftClawLow = new ModelRenderer(this, 25, 25);
        this.LeftClawLow.addBox(1.8F, -4.3F, -15.0F, 2, 1, 4);
        this.LeftClawLow.setRotationPoint(4.7F, 17.5F, -3.0F);
        this.LeftClawLow.setTextureSize(64, 32);
        this.LeftClawLow.mirror = true;
        setRotation(LeftClawLow, 0.3490659F, 0.0F, 0.0F);
        this.RightClawTop = new ModelRenderer(this, 15, 15);
        this.RightClawTop.addBox(-4.2F, 4.7F, -15.0F, 2, 2, 5);
        this.RightClawTop.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightClawTop.setTextureSize(64, 32);
        this.RightClawTop.mirror = true;
        setRotation(RightClawTop, -0.5410521F, 0.0F, 0.0F);
        this.RightClawLow = new ModelRenderer(this, 25, 25);
        this.RightClawLow.addBox(-4.2F, -4.3F, -15.0F, 2, 1, 4);
        this.RightClawLow.setRotationPoint(-4.7F, 17.5F, -3.0F);
        this.RightClawLow.setTextureSize(64, 32);
        this.RightClawLow.mirror = true;
        setRotation(RightClawLow, 0.3490659F, 0.0F, 0.0F);
        this.LBLeg1 = new ModelRenderer(this, 0, 13);
        this.LBLeg1.addBox(0.5F, -0.5F, -0.5F, 3, 1, 1);
        this.LBLeg1.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg1.setTextureSize(64, 32);
        this.LBLeg1.mirror = true;
        setRotation(LBLeg1, 0.0F, 0.0F, -0.4363323F);
        this.LBLeg3 = new ModelRenderer(this, 2, 0);
        this.LBLeg3.addBox(5.1F, -1.5F, -1.0F, 3, 1, 2);
        this.LBLeg3.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg3.setTextureSize(64, 32);
        this.LBLeg3.mirror = true;
        setRotation(LBLeg3, 0.0F, 0.0F, -0.5759587F);
        this.RBLeg1 = new ModelRenderer(this, 0, 13);
        this.RBLeg1.addBox(-3.5F, -0.5F, -0.5F, 3, 1, 1);
        this.RBLeg1.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg1.setTextureSize(64, 32);
        this.RBLeg1.mirror = true;
        setRotation(RBLeg1, 0.0F, 0.0F, 0.4363323F);
        this.RBLeg3 = new ModelRenderer(this, 2, 0);
        this.RBLeg3.addBox(-8.1F, -1.5F, -1.0F, 3, 1, 2);
        this.RBLeg3.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg3.setTextureSize(64, 32);
        this.RBLeg3.mirror = true;
        setRotation(RBLeg3, 0.0F, 0.0F, 0.5759587F);
        this.LBLeg2 = new ModelRenderer(this, 0, 0);
        this.LBLeg2.addBox(2.5F, 0.5F, -1.0F, 3, 2, 2);
        this.LBLeg2.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg2.setTextureSize(64, 32);
        this.LBLeg2.mirror = true;
        setRotation(LBLeg2, 0.0F, 0.0F, -0.9599311F);
        this.RBLeg2 = new ModelRenderer(this, 0, 0);
        this.RBLeg2.addBox(-5.5F, 0.5F, -1.0F, 3, 2, 2);
        this.RBLeg2.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg2.setTextureSize(64, 32);
        this.RBLeg2.mirror = true;
        setRotation(RBLeg2, 0.0F, 0.0F, 0.9599311F);
        this.LBLeg4 = new ModelRenderer(this, 0, 13);
        this.LBLeg4.addBox(5.0F, -3.0F, -0.5F, 1, 3, 1);
        this.LBLeg4.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg4.setTextureSize(64, 32);
        this.LBLeg4.mirror = true;
        setRotation(LBLeg4, 0.0F, 0.0F, -0.2094395F);
        this.RBLeg4 = new ModelRenderer(this, 0, 13);
        this.RBLeg4.addBox(-6.0F, -3.0F, -0.5F, 1, 3, 1);
        this.RBLeg4.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg4.setTextureSize(64, 32);
        this.RBLeg4.mirror = true;
        setRotation(RBLeg4, 0.0F, 0.0F, 0.2094395F);
        this.RBLeg5 = new ModelRenderer(this, 0, 0);
        this.RBLeg5.addBox(-6.4F, -1.0F, -1.0F, 2, 6, 2);
        this.RBLeg5.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg5.setTextureSize(64, 32);
        this.RBLeg5.mirror = true;
        setRotation(RBLeg5, 0.0F, 0.0F, 0.1047198F);
        this.LBLeg6 = new ModelRenderer(this, 0, 13);
        this.LBLeg6.addBox(5.5F, 3.0F, -0.5F, 1, 3, 1);
        this.LBLeg6.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg6.setTextureSize(64, 32);
        this.LBLeg6.mirror = true;
        setRotation(LBLeg6, 0.0F, 0.0F, 0.0F);
        this.RBLeg6 = new ModelRenderer(this, 0, 13);
        this.RBLeg6.addBox(-6.5F, 3.0F, -0.5F, 1, 3, 1);
        this.RBLeg6.setRotationPoint(-5.0F, 18.0F, 8.5F);
        this.RBLeg6.setTextureSize(64, 32);
        this.RBLeg6.mirror = true;
        setRotation(RBLeg6, 0.0F, 0.0F, 0.0F);
        this.LBLeg5 = new ModelRenderer(this, 0, 0);
        this.LBLeg5.addBox(4.6F, -1.0F, -1.0F, 2, 6, 2);
        this.LBLeg5.setRotationPoint(5.0F, 18.0F, 8.5F);
        this.LBLeg5.setTextureSize(64, 32);
        this.LBLeg5.mirror = true;
        setRotation(LBLeg5, 0.0F, 0.0F, -0.1047198F);
        this.RFLeg1 = new ModelRenderer(this, 0, 13);
        this.RFLeg1.addBox(-3.5F, -0.5F, -0.5F, 3, 1, 1);
        this.RFLeg1.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg1.setTextureSize(64, 32);
        this.RFLeg1.mirror = true;
        setRotation(RFLeg1, 0.0F, 0.0F, 0.4363323F);
        this.RFLeg2 = new ModelRenderer(this, 0, 0);
        this.RFLeg2.addBox(-5.5F, 0.5F, -1.0F, 3, 2, 2);
        this.RFLeg2.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg2.setTextureSize(64, 32);
        this.RFLeg2.mirror = true;
        setRotation(RFLeg2, 0.0F, 0.0F, 0.9599311F);
        this.RFLeg3 = new ModelRenderer(this, 2, 0);
        this.RFLeg3.addBox(-8.1F, -1.5F, -1.0F, 3, 1, 2);
        this.RFLeg3.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg3.setTextureSize(64, 32);
        this.RFLeg3.mirror = true;
        setRotation(RFLeg3, 0.0F, 0.0F, 0.5759587F);
        this.RFLeg4 = new ModelRenderer(this, 0, 13);
        this.RFLeg4.addBox(-6.0F, -3.0F, -0.5F, 1, 3, 1);
        this.RFLeg4.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg4.setTextureSize(64, 32);
        this.RFLeg4.mirror = true;
        setRotation(RFLeg4, 0.0F, 0.0F, 0.2094395F);
        this.RFLeg5 = new ModelRenderer(this, 0, 0);
        this.RFLeg5.addBox(-6.4F, -1.0F, -1.0F, 2, 6, 2);
        this.RFLeg5.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg5.setTextureSize(64, 32);
        this.RFLeg5.mirror = true;
        setRotation(RFLeg5, 0.0F, 0.0F, 0.1047198F);
        this.RFLeg6 = new ModelRenderer(this, 0, 13);
        this.RFLeg6.addBox(-6.5F, 3.0F, -0.5F, 1, 3, 1);
        this.RFLeg6.setRotationPoint(-5.0F, 18.0F, 0.5F);
        this.RFLeg6.setTextureSize(64, 32);
        this.RFLeg6.mirror = true;
        setRotation(RFLeg6, 0.0F, 0.0F, 0.0F);
        this.RMLeg1 = new ModelRenderer(this, 0, 13);
        this.RMLeg1.addBox(-3.5F, -0.5F, -0.5F, 3, 1, 1);
        this.RMLeg1.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg1.setTextureSize(64, 32);
        this.RMLeg1.mirror = true;
        setRotation(RMLeg1, 0.0F, 0.0F, 0.4363323F);
        this.RMLeg2 = new ModelRenderer(this, 0, 0);
        this.RMLeg2.addBox(-5.5F, 0.5F, -1.0F, 3, 2, 2);
        this.RMLeg2.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg2.setTextureSize(64, 32);
        this.RMLeg2.mirror = true;
        setRotation(RMLeg2, 0.0F, 0.0F, 0.9599311F);
        this.RMLeg3 = new ModelRenderer(this, 2, 0);
        this.RMLeg3.addBox(-8.1F, -1.5F, -1.0F, 3, 1, 2);
        this.RMLeg3.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg3.setTextureSize(64, 32);
        this.RMLeg3.mirror = true;
        setRotation(RMLeg3, 0.0F, 0.0F, 0.5759587F);
        this.RMLeg4 = new ModelRenderer(this, 0, 13);
        this.RMLeg4.addBox(-6.0F, -3.0F, -0.5F, 1, 3, 1);
        this.RMLeg4.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg4.setTextureSize(64, 32);
        this.RMLeg4.mirror = true;
        setRotation(RMLeg4, 0.0F, 0.0F, 0.2094395F);
        this.RMLeg5 = new ModelRenderer(this, 0, 0);
        this.RMLeg5.addBox(-6.4F, -1.0F, -1.0F, 2, 6, 2);
        this.RMLeg5.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg5.setTextureSize(64, 32);
        this.RMLeg5.mirror = true;
        setRotation(RMLeg5, 0.0F, 0.0F, 0.1047198F);
        this.RMLeg6 = new ModelRenderer(this, 0, 13);
        this.RMLeg6.addBox(-6.5F, 3.0F, -0.5F, 1, 3, 1);
        this.RMLeg6.setRotationPoint(-5.0F, 18.0F, 4.5F);
        this.RMLeg6.setTextureSize(64, 32);
        this.RMLeg6.mirror = true;
        setRotation(RMLeg6, 0.0F, 0.0F, 0.0F);
        this.LFLeg1 = new ModelRenderer(this, 0, 13);
        this.LFLeg1.addBox(0.5F, -0.5F, -0.5F, 3, 1, 1);
        this.LFLeg1.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg1.setTextureSize(64, 32);
        this.LFLeg1.mirror = true;
        setRotation(LFLeg1, 0.0F, 0.0F, -0.4363323F);
        this.LFLeg2 = new ModelRenderer(this, 0, 0);
        this.LFLeg2.addBox(2.5F, 0.5F, -1.0F, 3, 2, 2);
        this.LFLeg2.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg2.setTextureSize(64, 32);
        this.LFLeg2.mirror = true;
        setRotation(LFLeg2, 0.0F, 0.0F, -0.9599311F);
        this.LFLeg3 = new ModelRenderer(this, 2, 0);
        this.LFLeg3.addBox(5.1F, -1.5F, -1.0F, 3, 1, 2);
        this.LFLeg3.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg3.setTextureSize(64, 32);
        this.LFLeg3.mirror = true;
        setRotation(LFLeg3, 0.0F, 0.0F, -0.5759587F);
        this.LFLeg4 = new ModelRenderer(this, 0, 13);
        this.LFLeg4.addBox(5.0F, -3.0F, -0.5F, 1, 3, 1);
        this.LFLeg4.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg4.setTextureSize(64, 32);
        this.LFLeg4.mirror = true;
        setRotation(LFLeg4, 0.0F, 0.0F, -0.2094395F);
        this.LFLeg5 = new ModelRenderer(this, 0, 0);
        this.LFLeg5.addBox(4.6F, -1.0F, -1.0F, 2, 6, 2);
        this.LFLeg5.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg5.setTextureSize(64, 32);
        this.LFLeg5.mirror = true;
        setRotation(LFLeg5, 0.0F, 0.0F, -0.1047198F);
        this.LFLeg6 = new ModelRenderer(this, 0, 13);
        this.LFLeg6.addBox(5.5F, 3.0F, -0.5F, 1, 3, 1);
        this.LFLeg6.setRotationPoint(5.0F, 18.0F, 0.5F);
        this.LFLeg6.setTextureSize(64, 32);
        this.LFLeg6.mirror = true;
        setRotation(LFLeg6, 0.0F, 0.0F, 0.0F);
        this.LMLeg1 = new ModelRenderer(this, 0, 13);
        this.LMLeg1.addBox(0.5F, -0.5F, -0.5F, 3, 1, 1);
        this.LMLeg1.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg1.setTextureSize(64, 32);
        this.LMLeg1.mirror = true;
        setRotation(LMLeg1, 0.0F, 0.0F, -0.4363323F);
        this.LMLeg2 = new ModelRenderer(this, 0, 0);
        this.LMLeg2.addBox(2.5F, 0.5F, -1.0F, 3, 2, 2);
        this.LMLeg2.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg2.setTextureSize(64, 32);
        this.LMLeg2.mirror = true;
        setRotation(LMLeg2, 0.0F, 0.0F, -0.9599311F);
        this.LMLeg4 = new ModelRenderer(this, 0, 13);
        this.LMLeg4.addBox(5.0F, -3.0F, -0.5F, 1, 3, 1);
        this.LMLeg4.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg4.setTextureSize(64, 32);
        this.LMLeg4.mirror = true;
        setRotation(LMLeg4, 0.0F, 0.0F, -0.2094395F);
        this.LMLeg3 = new ModelRenderer(this, 2, 0);
        this.LMLeg3.addBox(5.1F, -1.5F, -1.0F, 3, 1, 2);
        this.LMLeg3.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg3.setTextureSize(64, 32);
        this.LMLeg3.mirror = true;
        setRotation(LMLeg3, 0.0F, 0.0F, -0.5759587F);
        this.LMLeg5 = new ModelRenderer(this, 0, 0);
        this.LMLeg5.addBox(4.6F, -1.0F, -1.0F, 2, 6, 2);
        this.LMLeg5.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg5.setTextureSize(64, 32);
        this.LMLeg5.mirror = true;
        setRotation(LMLeg5, 0.0F, 0.0F, -0.1047198F);
        this.LMLeg6 = new ModelRenderer(this, 0, 13);
        this.LMLeg6.addBox(5.5F, 3.0F, -0.5F, 1, 3, 1);
        this.LMLeg6.setRotationPoint(5.0F, 18.0F, 4.5F);
        this.LMLeg6.setTextureSize(64, 32);
        this.LMLeg6.mirror = true;
        setRotation(LMLeg6, 0.0F, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final CaveFisher e = (CaveFisher)entity;
        RenderInfo r;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        float nextangle;
        final float pi4 = 1.570795f;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed) * 3.1415927f * 0.12f * f1;
        this.LFLeg1.rotateAngleY = newangle;
        this.LFLeg2.rotateAngleY = newangle;
        this.LFLeg3.rotateAngleY = newangle;
        this.LFLeg4.rotateAngleY = newangle;
        this.LFLeg5.rotateAngleY = newangle;
        this.LFLeg6.rotateAngleY = newangle;
        this.RFLeg1.rotateAngleY = -newangle;
        this.RFLeg2.rotateAngleY = -newangle;
        this.RFLeg3.rotateAngleY = -newangle;
        this.RFLeg4.rotateAngleY = -newangle;
        this.RFLeg5.rotateAngleY = -newangle;
        this.RFLeg6.rotateAngleY = -newangle;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed - pi4) * 3.1415927f * 0.12f * f1;
        this.LMLeg1.rotateAngleY = newangle;
        this.LMLeg2.rotateAngleY = newangle;
        this.LMLeg3.rotateAngleY = newangle;
        this.LMLeg4.rotateAngleY = newangle;
        this.LMLeg5.rotateAngleY = newangle;
        this.LMLeg6.rotateAngleY = newangle;
        this.RMLeg1.rotateAngleY = -newangle;
        this.RMLeg2.rotateAngleY = -newangle;
        this.RMLeg3.rotateAngleY = -newangle;
        this.RMLeg4.rotateAngleY = -newangle;
        this.RMLeg5.rotateAngleY = -newangle;
        this.RMLeg6.rotateAngleY = -newangle;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed - 2.0f * pi4) * 3.1415927f * 0.12f * f1;
        this.LBLeg1.rotateAngleY = newangle;
        this.LBLeg2.rotateAngleY = newangle;
        this.LBLeg3.rotateAngleY = newangle;
        this.LBLeg4.rotateAngleY = newangle;
        this.LBLeg5.rotateAngleY = newangle;
        this.LBLeg6.rotateAngleY = newangle;
        this.RBLeg1.rotateAngleY = -newangle;
        this.RBLeg2.rotateAngleY = -newangle;
        this.RBLeg3.rotateAngleY = -newangle;
        this.RBLeg4.rotateAngleY = -newangle;
        this.RBLeg5.rotateAngleY = -newangle;
        this.RBLeg6.rotateAngleY = -newangle;
        r = e.getRenderInfo();
        newangle = MathHelper.cos(f2 * 3.0f * this.wingspeed) * 3.1415927f * 0.15f;
        nextangle = MathHelper.cos((f2 + 0.1f) * 3.0f * this.wingspeed) * 3.1415927f * 0.15f;
        if (nextangle > 0.0f && newangle < 0.0f) {
            r.ri1 = 0;
            if (e.getAttacking() == 0) {
                r.ri1 = e.worldObj.rand.nextInt(20);
                r.ri2 = e.worldObj.rand.nextInt(25);
            }
            else {
                r.ri1 = e.worldObj.rand.nextInt(4);
                r.ri2 = e.worldObj.rand.nextInt(3);
            }
        }
        if (r.ri1 == 1 || r.ri1 == 3) {
            this.doLeftClaw(newangle);
            this.doRightClaw(newangle);
        }
        else {
            this.doLeftClaw(0.0f);
            this.doRightClaw(0.0f);
        }
        e.setRenderInfo(r);
        this.Nose.render(f5);
        this.EyeLeft.render(f5);
        this.HeadMid.render(f5);
        this.HeadEnd.render(f5);
        this.TailTuft.render(f5);
        this.EyeRight.render(f5);
        this.BodyTopLeft4.render(f5);
        this.BodyTopRight4.render(f5);
        this.BodyTopLeft1.render(f5);
        this.BodyTopRight1.render(f5);
        this.BodyTopRight2.render(f5);
        this.BodyTopLeft2.render(f5);
        this.BodyTopRight3.render(f5);
        this.BodyTopLeft3.render(f5);
        this.HeadBase.render(f5);
        this.TailBase.render(f5);
        this.BodyLow2.render(f5);
        this.BodyLow1.render(f5);
        this.Spine5.render(f5);
        this.Spine1.render(f5);
        this.Spine2.render(f5);
        this.Spine3.render(f5);
        this.Spine4.render(f5);
        this.RightArmSeg4.render(f5);
        this.LeftArmSeg1.render(f5);
        this.LeftArmSeg3.render(f5);
        this.RightArmSeg2.render(f5);
        this.RightArmSeg1.render(f5);
        this.LeftArmSeg5.render(f5);
        this.LeftArmSeg2.render(f5);
        this.LeftClawTop.render(f5);
        this.RightArmSeg3.render(f5);
        this.RightArmSeg5.render(f5);
        this.LeftArmSeg4.render(f5);
        this.LeftClawBase.render(f5);
        this.RightClawBase.render(f5);
        this.LeftClawLow.render(f5);
        this.RightClawTop.render(f5);
        this.RightClawLow.render(f5);
        this.LBLeg1.render(f5);
        this.LBLeg3.render(f5);
        this.RBLeg1.render(f5);
        this.RBLeg3.render(f5);
        this.LBLeg2.render(f5);
        this.RBLeg2.render(f5);
        this.LBLeg4.render(f5);
        this.RBLeg4.render(f5);
        this.RBLeg5.render(f5);
        this.LBLeg6.render(f5);
        this.RBLeg6.render(f5);
        this.LBLeg5.render(f5);
        this.RFLeg1.render(f5);
        this.RFLeg2.render(f5);
        this.RFLeg3.render(f5);
        this.RFLeg4.render(f5);
        this.RFLeg5.render(f5);
        this.RFLeg6.render(f5);
        this.RMLeg1.render(f5);
        this.RMLeg2.render(f5);
        this.RMLeg3.render(f5);
        this.RMLeg4.render(f5);
        this.RMLeg5.render(f5);
        this.RMLeg6.render(f5);
        this.LFLeg1.render(f5);
        this.LFLeg2.render(f5);
        this.LFLeg3.render(f5);
        this.LFLeg4.render(f5);
        this.LFLeg5.render(f5);
        this.LFLeg6.render(f5);
        this.LMLeg1.render(f5);
        this.LMLeg2.render(f5);
        this.LMLeg4.render(f5);
        this.LMLeg3.render(f5);
        this.LMLeg5.render(f5);
        this.LMLeg6.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
    
    private void doLeftClaw(final float angle) {
        this.LeftArmSeg1.rotateAngleX = Math.abs(angle);
        this.LeftArmSeg2.rotateAngleX = Math.abs(angle);
        this.LeftArmSeg3.rotateAngleX = Math.abs(angle);
        this.LeftArmSeg4.rotateAngleX = Math.abs(angle);
        this.LeftArmSeg5.rotateAngleX = Math.abs(angle);
        this.LeftClawBase.rotateAngleX = Math.abs(angle);
        this.LeftClawTop.rotateAngleX = Math.abs(angle) - 0.54f;
        this.LeftClawLow.rotateAngleX = Math.abs(angle) + 0.35f;
    }
    
    private void doRightClaw(final float angle) {
        this.RightArmSeg1.rotateAngleX = Math.abs(angle);
        this.RightArmSeg2.rotateAngleX = Math.abs(angle);
        this.RightArmSeg3.rotateAngleX = Math.abs(angle);
        this.RightArmSeg4.rotateAngleX = Math.abs(angle);
        this.RightArmSeg5.rotateAngleX = Math.abs(angle);
        this.RightClawBase.rotateAngleX = Math.abs(angle);
        this.RightClawTop.rotateAngleX = Math.abs(angle) - 0.54f;
        this.RightClawLow.rotateAngleX = Math.abs(angle) + 0.35f;
    }
}
