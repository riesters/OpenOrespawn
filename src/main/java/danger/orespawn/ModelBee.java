package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelBee extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Sting;
    ModelRenderer Abdomnem1;
    ModelRenderer Abdomnem2;
    ModelRenderer Abdomnem3;
    ModelRenderer Abdomnem4;
    ModelRenderer Abdomnem5;
    ModelRenderer MainBody;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer WingRight;
    ModelRenderer WingLeft;
    ModelRenderer RA1;
    ModelRenderer LA1;
    ModelRenderer LA2;
    ModelRenderer RA2;
    ModelRenderer RA3;
    ModelRenderer LA3;
    ModelRenderer LeftPom;
    ModelRenderer RightPom;
    ModelRenderer LeftPincerExtra;
    ModelRenderer LeftPincerMain;
    ModelRenderer RightPincerMain;
    ModelRenderer RightPincerExtra;
    
    public ModelBee(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Sting = new ModelRenderer(this, 68, 0);
        this.Sting.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
        this.Sting.setRotationPoint(0.0F, 16.0F, 1.0F);
        this.Sting.setTextureSize(256, 256);
        this.Sting.mirror = true;
        setRotation(Sting, -0.7853982F, 0.0F, 0.0F);
        this.Abdomnem1 = new ModelRenderer(this, 64, 12);
        this.Abdomnem1.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 4);
        this.Abdomnem1.setRotationPoint(0.0F, 9.0F, 2.0F);
        this.Abdomnem1.setTextureSize(256, 256);
        this.Abdomnem1.mirror = true;
        setRotation(Abdomnem1, -0.5235988F, 0.0F, 0.0F);
        this.Abdomnem2 = new ModelRenderer(this, 60, 24);
        this.Abdomnem2.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 6);
        this.Abdomnem2.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Abdomnem2.setTextureSize(256, 256);
        this.Abdomnem2.mirror = true;
        setRotation(Abdomnem2, 0.0F, 0.0F, 0.0F);
        this.Abdomnem3 = new ModelRenderer(this, 56, 36);
        this.Abdomnem3.addBox(-4.0F, 0.0F, 0.0F, 8, 7, 8);
        this.Abdomnem3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Abdomnem3.setTextureSize(256, 256);
        this.Abdomnem3.mirror = true;
        setRotation(Abdomnem3, 0.2617994F, 0.0F, 0.0F);
        this.Abdomnem4 = new ModelRenderer(this, 53, 51);
        this.Abdomnem4.addBox(-5.0F, 0.0F, 0.0F, 10, 12, 10);
        this.Abdomnem4.setRotationPoint(0.0F, -6.0F, -8.0F);
        this.Abdomnem4.setTextureSize(256, 256);
        this.Abdomnem4.mirror = true;
        setRotation(Abdomnem4, 0.5934119F, 0.0F, 0.0F);
        this.Abdomnem5 = new ModelRenderer(this, 48, 73);
        this.Abdomnem5.addBox(-6.0F, 0.0F, 0.0F, 12, 12, 12);
        this.Abdomnem5.setRotationPoint(0.0F, -6.0F, -15.0F);
        this.Abdomnem5.setTextureSize(256, 256);
        this.Abdomnem5.mirror = true;
        setRotation(Abdomnem5, 1.099557F, 0.0F, 0.0F);
        this.MainBody = new ModelRenderer(this, 48, 97);
        this.MainBody.addBox(-6.0F, 0.0F, -6.0F, 12, 14, 12);
        this.MainBody.setRotationPoint(0.0F, -12.0F, -24.0F);
        this.MainBody.setTextureSize(256, 256);
        this.MainBody.mirror = true;
        setRotation(MainBody, 1.48353F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 55, 123);
        this.Neck.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
        this.Neck.setRotationPoint(0.0F, -12.0F, -23.0F);
        this.Neck.setTextureSize(256, 256);
        this.Neck.mirror = true;
        setRotation(Neck, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 51, 139);
        this.Head.addBox(-5.0F, -5.0F, -10.0F, 10, 10, 10);
        this.Head.setRotationPoint(0.0F, -13.0F, -28.0F);
        this.Head.setTextureSize(256, 256);
        this.Head.mirror = true;
        setRotation(Head, 0.2617994F, 0.0F, 0.0F);
        this.WingRight = new ModelRenderer(this, 0, 91);
        this.WingRight.addBox(0.0F, 0.0F, 0.0F, 0, 8, 24);
        this.WingRight.setRotationPoint(-4.0F, -14.0F, -15.0F);
        this.WingRight.setTextureSize(256, 256);
        this.WingRight.mirror = true;
        setRotation(WingRight, -0.7853982F, -0.5235988F, 2.617994F);
        this.WingLeft = new ModelRenderer(this, 96, 91);
        this.WingLeft.addBox(0.0F, 0.0F, 0.0F, 0, 8, 24);
        this.WingLeft.setRotationPoint(3.0F, -14.0F, -15.0F);
        this.WingLeft.setTextureSize(256, 256);
        this.WingLeft.mirror = true;
        setRotation(WingLeft, -0.7853982F, 0.5235988F, -2.617994F);
        this.RA1 = new ModelRenderer(this, 47, 152);
        this.RA1.addBox(0.0F, -6.0F, -1.0F, 1, 6, 1);
        this.RA1.setRotationPoint(-3.0F, -17.0F, -31.0F);
        this.RA1.setTextureSize(256, 256);
        this.RA1.mirror = true;
        setRotation(RA1, 0.2617994F, 0.5235988F, 0.0F);
        this.LA1 = new ModelRenderer(this, 91, 152);
        this.LA1.addBox(0.0F, -6.0F, -1.0F, 1, 6, 1);
        this.LA1.setRotationPoint(2.0F, -17.0F, -32.0F);
        this.LA1.setTextureSize(256, 256);
        this.LA1.mirror = true;
        setRotation(LA1, 0.2617994F, -0.5235988F, 0.0F);
        this.LA2 = new ModelRenderer(this, 91, 145);
        this.LA2.addBox(0.0F, -11.0F, 0.0F, 1, 6, 1);
        this.LA2.setRotationPoint(2.0F, -17.0F, -32.0F);
        this.LA2.setTextureSize(256, 256);
        this.LA2.mirror = true;
        setRotation(LA2, 0.4363323F, -0.6108652F, 0.0F);
        this.RA2 = new ModelRenderer(this, 47, 145);
        this.RA2.addBox(0.0F, -11.0F, 0.0F, 1, 6, 1);
        this.RA2.setRotationPoint(-3.0F, -17.0F, -31.0F);
        this.RA2.setTextureSize(256, 256);
        this.RA2.mirror = true;
        setRotation(RA2, 0.4363323F, 0.6108652F, 0.0F);
        this.RA3 = new ModelRenderer(this, 47, 138);
        this.RA3.addBox(0.0F, -16.0F, 2.0F, 1, 6, 1);
        this.RA3.setRotationPoint(-3.0F, -17.0F, -31.0F);
        this.RA3.setTextureSize(256, 256);
        this.RA3.mirror = true;
        setRotation(RA3, 0.6108652F, 0.6981317F, 0.0F);
        this.LA3 = new ModelRenderer(this, 91, 138);
        this.LA3.addBox(0.0F, -16.0F, 2.0F, 1, 6, 1);
        this.LA3.setRotationPoint(2.0F, -17.0F, -32.0F);
        this.LA3.setTextureSize(256, 256);
        this.LA3.mirror = true;
        setRotation(LA3, 0.6108652F, -0.6981317F, 0.0F);
        this.LeftPom = new ModelRenderer(this, 89, 134);
        this.LeftPom.addBox(4.0F, -16.0F, -6.0F, 2, 2, 2);
        this.LeftPom.setRotationPoint(2.0F, -17.0F, -32.0F);
        this.LeftPom.setTextureSize(256, 256);
        this.LeftPom.mirror = true;
        setRotation(LeftPom, 0.0F, 0.0F, 0.0F);
        this.RightPom = new ModelRenderer(this, 45, 134);
        this.RightPom.addBox(-5.0F, -16.0F, -7.0F, 2, 2, 2);
        this.RightPom.setRotationPoint(-3.0F, -17.0F, -31.0F);
        this.RightPom.setTextureSize(256, 256);
        this.RightPom.mirror = true;
        setRotation(RightPom, 0.0F, 0.0F, 0.0F);
        this.LeftPincerExtra = new ModelRenderer(this, 71, 166);
        this.LeftPincerExtra.addBox(-2.0F, 0.0F, -6.0F, 2, 1, 2);
        this.LeftPincerExtra.setRotationPoint(2.0F, -8.0F, -36.0F);
        this.LeftPincerExtra.setTextureSize(256, 256);
        this.LeftPincerExtra.mirror = true;
        setRotation(LeftPincerExtra, 0.1745329F, -0.1745329F, 0.0F);
        this.LeftPincerMain = new ModelRenderer(this, 71, 159);
        this.LeftPincerMain.addBox(0.0F, 0.0F, -6.0F, 2, 1, 6);
        this.LeftPincerMain.setRotationPoint(2.0F, -8.0F, -36.0F);
        this.LeftPincerMain.setTextureSize(256, 256);
        this.LeftPincerMain.mirror = true;
        setRotation(LeftPincerMain, 0.1745329F, -0.1745329F, 0.0F);
        this.RightPincerMain = new ModelRenderer(this, 55, 159);
        this.RightPincerMain.addBox(0.0F, 0.0F, -6.0F, 2, 1, 6);
        this.RightPincerMain.setRotationPoint(-4.0F, -8.0F, -36.0F);
        this.RightPincerMain.setTextureSize(256, 256);
        this.RightPincerMain.mirror = true;
        setRotation(RightPincerMain, 0.1745329F, 0.1745329F, 0.0F);
        this.RightPincerExtra = new ModelRenderer(this, 63, 166);
        this.RightPincerExtra.addBox(2.0F, 0.0F, -6.0F, 2, 1, 2);
        this.RightPincerExtra.setRotationPoint(-4.0F, -8.0F, -36.0F);
        this.RightPincerExtra.setTextureSize(256, 256);
        this.RightPincerExtra.mirror = true;
        setRotation(RightPincerExtra, 0.1745329F, 0.1745329F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        final Bee b = (Bee)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        newangle = MathHelper.cos(f2 * 1.1f * this.wingspeed) * 3.1415927f * 0.3f;
        this.WingLeft.rotateAngleZ = -1.745f - newangle;
        this.WingRight.rotateAngleZ = 1.754f + newangle;
        newangle = MathHelper.cos(f2 * 0.3f * this.wingspeed) * 3.1415927f * 0.1f;
        this.LeftPincerMain.rotateAngleY = -0.274f + newangle;
        this.LeftPincerExtra.rotateAngleY = -0.274f + newangle;
        this.RightPincerMain.rotateAngleY = 0.274f - newangle;
        this.RightPincerExtra.rotateAngleY = 0.274f - newangle;
        newangle = MathHelper.cos(f2 * 0.21f * this.wingspeed) * 3.1415927f * 0.06f;
        this.LA1.rotateAngleX = 0.261f + newangle;
        this.LA2.rotateAngleX = 0.436f + newangle;
        this.LA3.rotateAngleX = 0.611f + newangle;
        this.LeftPom.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.27f * this.wingspeed) * 3.1415927f * 0.06f;
        this.RA1.rotateAngleX = 0.261f + newangle;
        this.RA2.rotateAngleX = 0.436f + newangle;
        this.RA3.rotateAngleX = 0.611f + newangle;
        this.RightPom.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.31f * this.wingspeed) * 3.1415927f * 0.06f;
        this.LA1.rotateAngleZ = newangle;
        this.LA2.rotateAngleZ = newangle;
        this.LA3.rotateAngleZ = newangle;
        this.LeftPom.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.37f * this.wingspeed) * 3.1415927f * 0.06f;
        this.RA1.rotateAngleZ = newangle;
        this.RA2.rotateAngleZ = newangle;
        this.RA3.rotateAngleZ = newangle;
        this.RightPom.rotateAngleZ = newangle;
        if (b.getAttacking() == 0) {
            newangle = MathHelper.cos(f2 * 0.021f * this.wingspeed) * 3.1415927f * 0.023f;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.11f * this.wingspeed) * 3.1415927f * 0.055f;
        }
        this.Abdomnem5.rotateAngleX = 1.099f + newangle;
        this.Abdomnem4.rotateAngleX = this.Abdomnem5.rotateAngleX + newangle - 0.35f;
        this.Abdomnem4.rotationPointY = (float)(this.Abdomnem5.rotationPointY + Math.cos(this.Abdomnem5.rotateAngleX) * 10.0);
        this.Abdomnem4.rotationPointZ = (float)(this.Abdomnem5.rotationPointZ + Math.sin(this.Abdomnem5.rotateAngleX) * 10.0);
        this.Abdomnem3.rotateAngleX = this.Abdomnem4.rotateAngleX + newangle - 0.35f;
        this.Abdomnem3.rotationPointY = (float)(this.Abdomnem4.rotationPointY + Math.cos(this.Abdomnem4.rotateAngleX) * 10.0);
        this.Abdomnem3.rotationPointZ = (float)(this.Abdomnem4.rotationPointZ + Math.sin(this.Abdomnem4.rotateAngleX) * 10.0);
        this.Abdomnem2.rotateAngleX = this.Abdomnem3.rotateAngleX + newangle - 0.35f;
        this.Abdomnem2.rotationPointY = (float)(this.Abdomnem3.rotationPointY + Math.cos(this.Abdomnem3.rotateAngleX) * 6.0);
        this.Abdomnem2.rotationPointZ = (float)(this.Abdomnem3.rotationPointZ + Math.sin(this.Abdomnem3.rotateAngleX) * 6.0);
        this.Abdomnem1.rotateAngleX = this.Abdomnem2.rotateAngleX + newangle - 0.35f;
        this.Abdomnem1.rotationPointY = (float)(this.Abdomnem2.rotationPointY + Math.cos(this.Abdomnem2.rotateAngleX) * 5.0);
        this.Abdomnem1.rotationPointZ = (float)(this.Abdomnem2.rotationPointZ + Math.sin(this.Abdomnem2.rotateAngleX) * 5.0);
        this.Sting.rotateAngleX = this.Abdomnem1.rotateAngleX + newangle - 0.35f;
        this.Sting.rotationPointY = (float)(this.Abdomnem1.rotationPointY + Math.cos(this.Abdomnem1.rotateAngleX) * 7.0);
        this.Sting.rotationPointZ = 1.0f + (float)(this.Abdomnem1.rotationPointZ + Math.sin(this.Abdomnem1.rotateAngleX) * 7.0);
        this.Sting.render(f5);
        this.Abdomnem1.render(f5);
        this.Abdomnem2.render(f5);
        this.Abdomnem3.render(f5);
        this.Abdomnem4.render(f5);
        this.Abdomnem5.render(f5);
        this.MainBody.render(f5);
        this.Neck.render(f5);
        this.Head.render(f5);
        this.WingRight.render(f5);
        this.WingLeft.render(f5);
        this.RA1.render(f5);
        this.LA1.render(f5);
        this.LA2.render(f5);
        this.RA2.render(f5);
        this.RA3.render(f5);
        this.LA3.render(f5);
        this.LeftPom.render(f5);
        this.RightPom.render(f5);
        this.LeftPincerExtra.render(f5);
        this.LeftPincerMain.render(f5);
        this.RightPincerMain.render(f5);
        this.RightPincerExtra.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
