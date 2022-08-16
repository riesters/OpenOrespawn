package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;

public class ModelGammaMetroid extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Shell3;
    ModelRenderer Shell4;
    ModelRenderer Head;
    ModelRenderer BeakUpper;
    ModelRenderer BeakLower;
    ModelRenderer LeftTusk;
    ModelRenderer MiddleTusk;
    ModelRenderer RightTusk;
    ModelRenderer LeftFrontUpperLeg;
    ModelRenderer LeftFrontLowerLeg;
    ModelRenderer LeftRearUpperLeg;
    ModelRenderer LeftRearLowerLeg;
    ModelRenderer RightFrontUpperLeg;
    ModelRenderer RightFrontLowerLeg;
    ModelRenderer RightRearUpperLeg;
    ModelRenderer RightRearLowerLeg;
    ModelRenderer Core;
    ModelRenderer Bellyinside;
    ModelRenderer Bellyoutside;
    ModelRenderer Shell1;
    ModelRenderer Shell2;
    
    public ModelGammaMetroid(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 256;
        this.textureHeight = 64;
        this.Shell3 = new ModelRenderer(this, 128, 0);
        this.Shell3.addBox(-6.0F, -6.0F, 0.0F, 12, 12, 7);
        this.Shell3.setRotationPoint(0.0F, 7.0F, 10.0F);
        this.Shell3.setTextureSize(256, 64);
        this.Shell3.mirror = true;
        setRotation(Shell3, -0.9599311F, 0.6283185F, 0.5235988F);
        this.Shell4 = new ModelRenderer(this, 48, 34);
        this.Shell4.addBox(0.0F, 0.0F, 0.0F, 6, 6, 8);
        this.Shell4.setRotationPoint(-3.0F, 9.0F, 13.0F);
        this.Shell4.setTextureSize(256, 64);
        this.Shell4.mirror = true;
        setRotation(Shell4, -0.2792527F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 48, 48);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 16, 8, 6);
        this.Head.setRotationPoint(-8.0F, -1.0F, -11.0F);
        this.Head.setTextureSize(256, 64);
        this.Head.mirror = true;
        setRotation(Head, 0.0F, 0.0F, 0.0F);
        this.BeakUpper = new ModelRenderer(this, 114, 44);
        this.BeakUpper.addBox(-3.0F, 0.0F, -3.0F, 6, 4, 6);
        this.BeakUpper.setRotationPoint(0.0F, 5.0F, -11.0F);
        this.BeakUpper.setTextureSize(256, 64);
        this.BeakUpper.mirror = true;
        setRotation(BeakUpper, 0.1047198F, 0.7853982F, 0.1047198F);
        this.BeakLower = new ModelRenderer(this, 120, 54);
        this.BeakLower.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3);
        this.BeakLower.setRotationPoint(0.0F, 9.0F, -12.0F);
        this.BeakLower.setTextureSize(256, 64);
        this.BeakLower.mirror = true;
        setRotation(BeakLower, 0.1396263F, 0.7853982F, 0.1396263F);
        this.LeftTusk = new ModelRenderer(this, 76, 50);
        this.LeftTusk.addBox(0.0F, 0.0F, -12.0F, 2, 2, 12);
        this.LeftTusk.setRotationPoint(5.0F, 6.0F, -10.0F);
        this.LeftTusk.setTextureSize(256, 64);
        this.LeftTusk.mirror = true;
        setRotation(LeftTusk, 0.1047198F, 0.0872665F, 0.0F);
        this.MiddleTusk = new ModelRenderer(this, 76, 50);
        this.MiddleTusk.addBox(-1.0F, 0.0F, -12.0F, 2, 2, 12);
        this.MiddleTusk.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.MiddleTusk.setTextureSize(256, 64);
        this.MiddleTusk.mirror = true;
        setRotation(MiddleTusk, 0.122173F, 0.0F, 0.0F);
        this.RightTusk = new ModelRenderer(this, 76, 50);
        this.RightTusk.addBox(-2.0F, 0.0F, -12.0F, 2, 2, 12);
        this.RightTusk.setRotationPoint(-5.0F, 6.0F, -10.0F);
        this.RightTusk.setTextureSize(256, 64);
        this.RightTusk.mirror = true;
        setRotation(RightTusk, 0.1047198F, -0.0872665F, 0.0F);
        this.LeftFrontUpperLeg = new ModelRenderer(this, 64, 0);
        this.LeftFrontUpperLeg.addBox(0.0F, 0.0F, -1.5F, 3, 8, 3);
        this.LeftFrontUpperLeg.setRotationPoint(8.0F, 8.0F, -2.0F);
        this.LeftFrontUpperLeg.setTextureSize(256, 64);
        this.LeftFrontUpperLeg.mirror = true;
        setRotation(LeftFrontUpperLeg, -0.1745329F, 0.0F, -0.6632251F);
        this.LeftFrontLowerLeg = new ModelRenderer(this, 48, 0);
        this.LeftFrontLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2);
        this.LeftFrontLowerLeg.setRotationPoint(14.0F, 13.0F, -3.5F);
        this.LeftFrontLowerLeg.setTextureSize(256, 64);
        this.LeftFrontLowerLeg.mirror = true;
        setRotation(LeftFrontLowerLeg, -0.2617994F, 0.1396263F, 0.0F);
        this.LeftRearUpperLeg = new ModelRenderer(this, 64, 0);
        this.LeftRearUpperLeg.addBox(-1.0F, 0.0F, -1.5F, 3, 8, 3);
        this.LeftRearUpperLeg.setRotationPoint(8.0F, 9.0F, 7.0F);
        this.LeftRearUpperLeg.setTextureSize(256, 64);
        this.LeftRearUpperLeg.mirror = true;
        setRotation(LeftRearUpperLeg, 0.1745329F, 0.0F, -0.8203047F);
        this.LeftRearLowerLeg = new ModelRenderer(this, 48, 0);
        this.LeftRearLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2);
        this.LeftRearLowerLeg.setRotationPoint(14.0F, 14.0F, 8.5F);
        this.LeftRearLowerLeg.setTextureSize(256, 64);
        this.LeftRearLowerLeg.mirror = true;
        setRotation(LeftRearLowerLeg, 0.3141593F, -0.1570796F, -0.2792527F);
        this.RightFrontUpperLeg = new ModelRenderer(this, 64, 0);
        this.RightFrontUpperLeg.addBox(-3.0F, 0.0F, -1.5F, 3, 8, 3);
        this.RightFrontUpperLeg.setRotationPoint(-8.0F, 8.0F, -2.0F);
        this.RightFrontUpperLeg.setTextureSize(256, 64);
        this.RightFrontUpperLeg.mirror = true;
        setRotation(RightFrontUpperLeg, -0.1745329F, 0.0F, 0.6632251F);
        this.RightFrontLowerLeg = new ModelRenderer(this, 48, 0);
        this.RightFrontLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2);
        this.RightFrontLowerLeg.setRotationPoint(-14.0F, 13.0F, -3.5F);
        this.RightFrontLowerLeg.setTextureSize(256, 64);
        this.RightFrontLowerLeg.mirror = true;
        setRotation(RightFrontLowerLeg, -0.2617994F, -0.1396263F, 0.0F);
        this.RightRearUpperLeg = new ModelRenderer(this, 64, 0);
        this.RightRearUpperLeg.addBox(-2.0F, 0.0F, -1.5F, 3, 8, 3);
        this.RightRearUpperLeg.setRotationPoint(-8.0F, 9.0F, 7.0F);
        this.RightRearUpperLeg.setTextureSize(256, 64);
        this.RightRearUpperLeg.mirror = true;
        setRotation(RightRearUpperLeg, 0.1745329F, 0.0F, 0.8203047F);
        this.RightRearLowerLeg = new ModelRenderer(this, 48, 0);
        this.RightRearLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2);
        this.RightRearLowerLeg.setRotationPoint(-14.0F, 14.0F, 8.5F);
        this.RightRearLowerLeg.setTextureSize(256, 64);
        this.RightRearLowerLeg.mirror = true;
        setRotation(RightRearLowerLeg, 0.3141593F, 0.1570796F, 0.2792527F);
        this.Core = new ModelRenderer(this, 82, 33);
        this.Core.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6);
        this.Core.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.Core.setTextureSize(256, 64);
        this.Core.mirror = true;
        setRotation(Core, -0.122173F, 0.0F, 0.0F);
        this.Bellyinside = new ModelRenderer(this, 150, 3);
        this.Bellyinside.addBox(-8.0F, -1.0F, -8.0F, 16, 1, 16);
        this.Bellyinside.setRotationPoint(0.0F, 8.0F, 2.0F);
        this.Bellyinside.setTextureSize(256, 64);
        this.Bellyinside.mirror = true;
        setRotation(Bellyinside, -0.122173F, 0.0F, 0.0F);
        this.Bellyoutside = new ModelRenderer(this, 0, 0);
        this.Bellyoutside.addBox(-8.0F, -6.0F, -8.0F, 16, 14, 16);
        this.Bellyoutside.setRotationPoint(0.0F, 8.0F, 2.0F);
        this.Bellyoutside.setTextureSize(256, 64);
        this.Bellyoutside.mirror = true;
        setRotation(Bellyoutside, -0.122173F, 0.0F, 0.0F);
        this.Shell1 = new ModelRenderer(this, 64, 0);
        this.Shell1.addBox(-10.0F, -10.0F, 2.0F, 19, 19, 12);
        this.Shell1.setRotationPoint(0.0F, 4.0F, -7.0F);
        this.Shell1.setTextureSize(256, 64);
        this.Shell1.mirror = true;
        setRotation(Shell1, 0.0F, 0.0F, 0.7853982F);
        this.Shell2 = new ModelRenderer(this, 0, 30);
        this.Shell2.addBox(-9.0F, -9.0F, 0.0F, 16, 16, 8);
        this.Shell2.setRotationPoint(0.0F, 4.5F, 5.0F);
        this.Shell2.setTextureSize(256, 64);
        this.Shell2.mirror = true;
        setRotation(Shell2, -0.5235988F, 0.3665191F, 0.715585F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final GammaMetroid e = (GammaMetroid)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        newangle = MathHelper.cos(f2 * 0.81f * this.wingspeed) * 3.1415927f * 0.08f;
        this.LeftTusk.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.87f * this.wingspeed) * 3.1415927f * 0.08f;
        this.RightTusk.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.99f * this.wingspeed) * 3.1415927f * 0.08f;
        this.MiddleTusk.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 1.11f * this.wingspeed) * 3.1415927f * 0.08f;
        this.LeftTusk.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 1.17f * this.wingspeed) * 3.1415927f * 0.08f;
        this.RightTusk.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 1.25f * this.wingspeed) * 3.1415927f * 0.08f;
        this.MiddleTusk.rotateAngleY = newangle;
        float nextangle;
        float upangle;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed) * 3.1415927f * 0.12f * f1;
        nextangle = MathHelper.cos((f2 + 0.1f) * 2.0f * this.wingspeed) * 3.1415927f * 0.12f * f1;
        upangle = 0.0f;
        if (nextangle > newangle) {
            upangle = 0.47f * f1 - Math.abs(newangle);
        }
        this.doLeftFLeg(this.LeftFrontUpperLeg, this.LeftFrontLowerLeg, newangle, upangle);
        this.doRightFLeg(this.RightFrontUpperLeg, this.RightFrontLowerLeg, -newangle, upangle);
        this.doLeftRLeg(this.LeftRearUpperLeg, this.LeftRearLowerLeg, -newangle, upangle);
        this.doRightRLeg(this.RightRearUpperLeg, this.RightRearLowerLeg, newangle, upangle);
        newangle = MathHelper.cos(f2 * 0.4f * this.wingspeed) * 3.1415927f * 0.05f;
        if (e.isSitting()) {
            newangle = 0.0f;
        }
        this.Shell1.rotateAngleX = newangle / 4.0f;
        this.Shell1.rotateAngleY = -(newangle / 4.0f);
        this.Shell2.rotateAngleX = newangle - 0.49f;
        this.Shell2.rotateAngleY = -newangle + 0.33f;
        this.Shell3.rotateAngleX = newangle - 0.96f;
        this.Shell3.rotateAngleY = -newangle + 0.63f;
        this.Shell4.rotateAngleX = newangle - 0.28f;
        newangle = MathHelper.cos(f2 * 0.75f * this.wingspeed) * 3.1415927f * 0.1f;
        newangle = Math.abs(newangle);
        this.BeakLower.rotateAngleX = newangle + 0.14f;
        this.BeakLower.rotateAngleZ = newangle + 0.14f;
        GL11.glEnable(2977);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.Core.render(f5);
        this.Shell3.render(f5);
        this.Shell4.render(f5);
        this.Head.render(f5);
        this.BeakUpper.render(f5);
        this.BeakLower.render(f5);
        this.LeftTusk.render(f5);
        this.MiddleTusk.render(f5);
        this.RightTusk.render(f5);
        this.LeftFrontUpperLeg.render(f5);
        this.LeftFrontLowerLeg.render(f5);
        this.LeftRearUpperLeg.render(f5);
        this.LeftRearLowerLeg.render(f5);
        this.RightFrontUpperLeg.render(f5);
        this.RightFrontLowerLeg.render(f5);
        this.RightRearUpperLeg.render(f5);
        this.RightRearLowerLeg.render(f5);
        this.Bellyinside.render(f5);
        this.Shell1.render(f5);
        this.Shell2.render(f5);
        this.Bellyoutside.render(f5);
        GL11.glDisable(3042);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
    
    private void doLeftFLeg(final ModelRenderer seg2, final ModelRenderer seg3, final float angle, final float upangle) {
        seg2.rotateAngleX = angle - 0.17f;
        seg3.rotateAngleX = angle - 0.26f;
        seg3.rotationPointZ = (float)(seg2.rotationPointZ + Math.sin(seg2.rotateAngleX) * 7.0) - 0.5f;
        seg2.rotateAngleZ = -upangle - 0.66f;
        seg3.rotateAngleZ = -upangle;
        seg3.rotationPointY = seg2.rotationPointY + (float)(5.0 * Math.cos(seg2.rotateAngleX));
        seg3.rotationPointX = (float)(seg2.rotationPointX + Math.abs(Math.sin(seg2.rotateAngleZ) * 7.0) + 1.0);
    }
    
    private void doLeftRLeg(final ModelRenderer seg2, final ModelRenderer seg3, final float angle, final float upangle) {
        seg2.rotateAngleX = angle + 0.17f;
        seg3.rotateAngleX = angle + 0.31f;
        seg3.rotationPointZ = (float)(seg2.rotationPointZ + Math.sin(seg2.rotateAngleX) * 7.0) - 0.5f;
        seg2.rotateAngleZ = -upangle - 0.82f;
        seg3.rotateAngleZ = -upangle;
        seg3.rotationPointY = seg2.rotationPointY + (float)(5.0 * Math.cos(seg2.rotateAngleX));
        seg3.rotationPointX = (float)(seg2.rotationPointX + Math.abs(Math.sin(seg2.rotateAngleZ) * 7.0) + 1.5);
    }
    
    private void doRightFLeg(final ModelRenderer seg2, final ModelRenderer seg3, final float angle, final float upangle) {
        seg2.rotateAngleX = angle - 0.17f;
        seg3.rotateAngleX = angle - 0.26f;
        seg3.rotationPointZ = (float)(seg2.rotationPointZ + Math.sin(seg2.rotateAngleX) * 7.0) - 0.5f;
        seg2.rotateAngleZ = -upangle + 0.34f;
        seg3.rotateAngleZ = -upangle;
        seg3.rotationPointY = seg2.rotationPointY + (float)(5.0 * Math.cos(seg2.rotateAngleX));
        seg3.rotationPointX = (float)(seg2.rotationPointX - Math.abs(Math.sin(seg2.rotateAngleZ) * 7.0) - 1.0);
    }
    
    private void doRightRLeg(final ModelRenderer seg2, final ModelRenderer seg3, final float angle, final float upangle) {
        seg2.rotateAngleX = angle + 0.17f;
        seg3.rotateAngleX = angle + 0.31f;
        seg3.rotationPointZ = (float)(seg2.rotationPointZ + Math.sin(seg2.rotateAngleX) * 7.0) - 0.5f;
        seg2.rotateAngleZ = -upangle + 0.82f;
        seg3.rotateAngleZ = -upangle;
        seg3.rotationPointY = seg2.rotationPointY + (float)(5.0 * Math.cos(seg2.rotateAngleX));
        seg3.rotationPointX = (float)(seg2.rotationPointX - Math.abs(Math.sin(seg2.rotateAngleZ) * 7.0) - 1.5);
    }
}
