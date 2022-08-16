package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelUrchin extends ModelBase
{
    private final float wingspeed;
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
    
    public ModelUrchin(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.if1 = new ModelRenderer(this, 0, 35);
        this.if1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.if1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.if1.setTextureSize(128, 128);
        this.if1.mirror = true;
        setRotation(if1, 0.2617994F, 0.0F);
        this.if2 = new ModelRenderer(this, 5, 35);
        this.if2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.if2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.if2.setTextureSize(128, 128);
        this.if2.mirror = true;
        setRotation(if2, -0.2617994F, 0.0F);
        this.if3 = new ModelRenderer(this, 10, 35);
        this.if3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.if3.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.if3.setTextureSize(128, 128);
        this.if3.mirror = true;
        setRotation(if3, 0.0F, 0.2617994F);
        this.if4 = new ModelRenderer(this, 15, 35);
        this.if4.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.if4.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.if4.setTextureSize(128, 128);
        this.if4.mirror = true;
        setRotation(if4, 0.0F, -0.2617994F);
        this.of1 = new ModelRenderer(this, 0, 45);
        this.of1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.of1.setRotationPoint(2.0F, 16.0F, 0.0F);
        this.of1.setTextureSize(128, 128);
        this.of1.mirror = true;
        setRotation(of1, 0.0F, -0.5235988F);
        this.of2 = new ModelRenderer(this, 5, 45);
        this.of2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.of2.setRotationPoint(-2.0F, 16.0F, 0.0F);
        this.of2.setTextureSize(128, 128);
        this.of2.mirror = true;
        setRotation(of2, 0.0F, 0.5235988F);
        this.of3 = new ModelRenderer(this, 10, 45);
        this.of3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.of3.setRotationPoint(0.0F, 16.0F, -2.0F);
        this.of3.setTextureSize(128, 128);
        this.of3.mirror = true;
        setRotation(of3, -0.5235988F, 0.0F);
        this.of4 = new ModelRenderer(this, 15, 45);
        this.of4.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        this.of4.setRotationPoint(0.0F, 16.0F, 2.0F);
        this.of4.setTextureSize(128, 128);
        this.of4.mirror = true;
        setRotation(of4, 0.5235988F, 0.0F);
        this.center = new ModelRenderer(this, 0, 0);
        this.center.addBox(0.0F, -30.0F, 0.0F, 1, 30, 1);
        this.center.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.center.setTextureSize(128, 128);
        this.center.mirror = true;
        setRotation(center, 0.0F, 0.0F);
        this.tis1 = new ModelRenderer(this, 25, 0);
        this.tis1.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
        this.tis1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.tis1.setTextureSize(128, 128);
        this.tis1.mirror = true;
        setRotation(tis1, 0.2617994F, 0.0F);
        this.tis2 = new ModelRenderer(this, 30, 0);
        this.tis2.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
        this.tis2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.tis2.setTextureSize(128, 128);
        this.tis2.mirror = true;
        setRotation(tis2, -0.2617994F, 0.0F);
        this.tis3 = new ModelRenderer(this, 35, 0);
        this.tis3.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
        this.tis3.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.tis3.setTextureSize(128, 128);
        this.tis3.mirror = true;
        setRotation(tis3, 0.0F, 0.2617994F);
        this.tis4 = new ModelRenderer(this, 40, 0);
        this.tis4.addBox(0.0F, -25.0F, 0.0F, 1, 25, 1);
        this.tis4.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.tis4.setTextureSize(128, 128);
        this.tis4.mirror = true;
        setRotation(tis4, 0.0F, -0.2617994F);
        this.tos1 = new ModelRenderer(this, 5, 0);
        this.tos1.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
        this.tos1.setRotationPoint(0.0F, 16.0F, 2.0F);
        this.tos1.setTextureSize(128, 128);
        this.tos1.mirror = true;
        setRotation(tos1, -0.5235988F, 0.0F);
        this.tos2 = new ModelRenderer(this, 10, 0);
        this.tos2.addBox(-2.0F, -20.0F, 0.0F, 1, 20, 1);
        this.tos2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.tos2.setTextureSize(128, 128);
        this.tos2.mirror = true;
        setRotation(tos2, 0.0F, -0.5235988F);
        this.tos3 = new ModelRenderer(this, 15, 0);
        this.tos3.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
        this.tos3.setRotationPoint(2.0F, 16.0F, 0.0F);
        this.tos3.setTextureSize(128, 128);
        this.tos3.mirror = true;
        setRotation(tos3, 0.0F, 0.5235988F);
        this.tos4 = new ModelRenderer(this, 20, 0);
        this.tos4.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
        this.tos4.setRotationPoint(0.0F, 16.0F, -2.0F);
        this.tos4.setTextureSize(128, 128);
        this.tos4.mirror = true;
        setRotation(tos4, 0.5235988F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Urchin u = (Urchin)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        float newangle2;
        float newangle3;
        float newangle4;
        float newangle5;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 0.7f * this.wingspeed) * 3.1415927f * 0.15f * f1;
            newangle2 = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.15f * f1;
            newangle3 = MathHelper.cos(f2 * 1.65f * this.wingspeed) * 3.1415927f * 0.15f * f1;
            newangle4 = MathHelper.cos(f2 * 1.75f * this.wingspeed) * 3.1415927f * 0.15f * f1;
            newangle5 = MathHelper.cos(f2 * 1.8f * this.wingspeed) * 3.1415927f * 0.15f * f1;
        }
        else {
            newangle = 0.0f;
            newangle2 = 0.0f;
            newangle3 = 0.0f;
            newangle4 = 0.0f;
            newangle5 = 0.0f;
        }
        this.if1.rotateAngleX = 0.261f + newangle2;
        this.if2.rotateAngleX = -0.261f - newangle3;
        this.if3.rotateAngleX = newangle4;
        this.if4.rotateAngleX = -newangle5;
        this.of1.rotateAngleZ = -0.523f + newangle;
        this.of2.rotateAngleZ = 0.523f - newangle;
        this.of3.rotateAngleX = -0.523f + newangle;
        this.of4.rotateAngleX = 0.523f - newangle;
        float newangle6;
        float newangle7;
        float newangle8;
        float newangle9;
        if (u.getAttacking() != 0) {
            newangle = (float)(f2 * 0.2f % 6.283185307179586);
            newangle2 = MathHelper.cos(f2 * 0.7f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle3 = MathHelper.cos(f2 * 0.65f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle4 = MathHelper.cos(f2 * 0.75f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle5 = MathHelper.cos(f2 * 0.8f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle6 = MathHelper.cos(f2 * 0.55f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle7 = MathHelper.cos(f2 * 0.45f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle8 = MathHelper.cos(f2 * 0.35f * this.wingspeed) * 3.1415927f * 0.06f;
            newangle9 = MathHelper.cos(f2 * 0.4f * this.wingspeed) * 3.1415927f * 0.06f;
        }
        else {
            newangle = (float)(f2 * 0.02f % 6.283185307179586);
            newangle2 = MathHelper.cos(f2 * 0.07f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle3 = MathHelper.cos(f2 * 0.065f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle4 = MathHelper.cos(f2 * 0.075f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle5 = MathHelper.cos(f2 * 0.08f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle6 = MathHelper.cos(f2 * 0.055f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle7 = MathHelper.cos(f2 * 0.045f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle8 = MathHelper.cos(f2 * 0.035f * this.wingspeed) * 3.1415927f * 0.02f;
            newangle9 = MathHelper.cos(f2 * 0.04f * this.wingspeed) * 3.1415927f * 0.02f;
        }
        this.center.rotateAngleY = newangle;
        this.tis1.rotateAngleX = 0.261f + newangle2;
        this.tis2.rotateAngleX = -0.261f + newangle3;
        this.tis3.rotateAngleX = newangle4;
        this.tis4.rotateAngleX = newangle5;
        this.tis1.rotateAngleZ = newangle6;
        this.tis2.rotateAngleZ = newangle7;
        this.tis3.rotateAngleZ = 0.261f + newangle8;
        this.tis4.rotateAngleZ = -0.261f + newangle9;
        this.tos1.rotateAngleX = -0.532f + newangle2;
        this.tos2.rotateAngleX = newangle8;
        this.tos3.rotateAngleX = newangle4;
        this.tos4.rotateAngleX = 0.532f + newangle6;
        this.tos1.rotateAngleZ = newangle5;
        this.tos2.rotateAngleZ = -0.523f + newangle7;
        this.tos3.rotateAngleZ = 0.523f + newangle3;
        this.tos4.rotateAngleZ = newangle9;
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
    
    private void setRotation(final ModelRenderer model, final float x, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
