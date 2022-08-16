package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelWaterDragon extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Head;
    ModelRenderer neck1;
    ModelRenderer body1;
    ModelRenderer Leg8;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg1;
    ModelRenderer neck2;
    ModelRenderer neck3;
    ModelRenderer neck4;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer tail1;
    ModelRenderer tailmiddle;
    ModelRenderer tailtop;
    ModelRenderer tailbottom;
    ModelRenderer nose;
    ModelRenderer headfin;
    ModelRenderer rightear;
    ModelRenderer leftear;
    ModelRenderer neackfin;
    ModelRenderer Bodyfin;
    ModelRenderer jaw;
    
    public ModelWaterDragon(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this, 79, 64);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 7, 8, 8);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Head.setTextureSize(128, 128);
        this.Head.mirror = true;
        setRotation(Head, 0.0F, 0.0F, 0.0F);
        this.neck1 = new ModelRenderer(this, 29, 70);
        this.neck1.addBox(-2.0F, 0.0F, -3.0F, 5, 5, 5);
        this.neck1.setRotationPoint(-1.0F, 4.0F, -5.0F);
        this.neck1.setTextureSize(128, 128);
        this.neck1.mirror = true;
        setRotation(neck1, -0.1858931F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 33);
        this.body1.addBox(-5.0F, -4.0F, -6.0F, 9, 9, 9);
        this.body1.setRotationPoint(0.0F, 19.0F, 2.0F);
        this.body1.setTextureSize(128, 128);
        this.body1.mirror = true;
        setRotation(body1, 0.0F, 0.0F, 0.0F);
        this.Leg8 = new ModelRenderer(this, 23, 25);
        this.Leg8.addBox(0.0F, -1.0F, -1.0F, 9, 2, 3);
        this.Leg8.setRotationPoint(3.0F, 22.0F, -2.0F);
        this.Leg8.setTextureSize(128, 128);
        this.Leg8.mirror = true;
        setRotation(Leg8, 0.0F, 0.5759587F, 0.1919862F);
        this.Leg2 = new ModelRenderer(this, 80, 18);
        this.Leg2.addBox(0.0F, -1.0F, -1.0F, 9, 2, 3);
        this.Leg2.setRotationPoint(2.0F, 22.0F, 13.0F);
        this.Leg2.setTextureSize(128, 128);
        this.Leg2.mirror = true;
        setRotation(Leg2, 0.0F, -0.5759587F, 0.1919862F);
        this.Leg7 = new ModelRenderer(this, 23, 18);
        this.Leg7.addBox(-9.0F, -1.0F, -1.0F, 9, 2, 3);
        this.Leg7.setRotationPoint(-4.0F, 22.0F, -1.0F);
        this.Leg7.setTextureSize(128, 128);
        this.Leg7.mirror = true;
        setRotation(Leg7, 0.0F, -0.5759587F, -0.1919862F);
        this.Leg1 = new ModelRenderer(this, 80, 25);
        this.Leg1.addBox(-9.0F, -1.0F, -2.0F, 9, 2, 3);
        this.Leg1.setRotationPoint(-3.0F, 22.0F, 14.0F);
        this.Leg1.setTextureSize(128, 128);
        this.Leg1.mirror = true;
        setRotation(Leg1, 0.0F, 0.5759587F, -0.1919862F);
        this.neck2 = new ModelRenderer(this, 0, 11);
        this.neck2.addBox(-2.0F, 0.0F, -2.0F, 5, 5, 5);
        this.neck2.setRotationPoint(-1.0F, 9.0F, -7.0F);
        this.neck2.setTextureSize(128, 128);
        this.neck2.mirror = true;
        setRotation(neck2, 0.1115358F, 0.0F, 0.0F);
        this.neck3 = new ModelRenderer(this, 0, 22);
        this.neck3.addBox(-2.0F, 0.0F, -2.0F, 5, 5, 5);
        this.neck3.setRotationPoint(-1.0F, 14.0F, -6.0F);
        this.neck3.setTextureSize(128, 128);
        this.neck3.mirror = true;
        setRotation(neck3, 0.4461433F, 0.0F, 0.0F);
        this.neck4 = new ModelRenderer(this, 26, 12);
        this.neck4.addBox(-3.0F, 0.0F, -2.0F, 5, 3, 3);
        this.neck4.setRotationPoint(0.0F, 18.0F, -4.0F);
        this.neck4.setTextureSize(128, 128);
        this.neck4.mirror = true;
        setRotation(neck4, 1.226894F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 52);
        this.body2.addBox(-5.0F, -5.0F, 0.0F, 7, 7, 9);
        this.body2.setRotationPoint(1.0F, 21.0F, 5.0F);
        this.body2.setTextureSize(128, 128);
        this.body2.mirror = true;
        setRotation(body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 69);
        this.body3.addBox(-3.0F, -3.0F, 0.0F, 5, 5, 7);
        this.body3.setRotationPoint(0.0F, 20.0F, 14.0F);
        this.body3.setTextureSize(128, 128);
        this.body3.mirror = true;
        setRotation(body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 0, 89);
        this.body4.addBox(-1.0F, -1.0F, 0.0F, 3, 3, 5);
        this.body4.setRotationPoint(-1.0F, 19.0F, 21.0F);
        this.body4.setTextureSize(128, 128);
        this.body4.mirror = true;
        setRotation(body4, 0.0F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 82);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
        this.tail1.setRotationPoint(-1.0F, 19.0F, 25.0F);
        this.tail1.setTextureSize(128, 128);
        this.tail1.mirror = true;
        setRotation(tail1, 0.0F, 0.0F, 0.0F);
        this.tailmiddle = new ModelRenderer(this, 55, 37);
        this.tailmiddle.addBox(-1.0F, -6.0F, 0.0F, 2, 11, 9);
        this.tailmiddle.setRotationPoint(0.0F, 19.0F, 28.0F);
        this.tailmiddle.setTextureSize(128, 128);
        this.tailmiddle.mirror = true;
        setRotation(tailmiddle, 0.0F, 0.0F, 0.0F);
        this.tailtop = new ModelRenderer(this, 82, 36);
        this.tailtop.addBox(-1.0F, -11.0F, 0.0F, 2, 11, 9);
        this.tailtop.setRotationPoint(0.0F, 14.0F, 28.0F);
        this.tailtop.setTextureSize(128, 128);
        this.tailtop.mirror = true;
        setRotation(tailtop, -0.6320364F, 0.0F, 0.0F);
        this.tailbottom = new ModelRenderer(this, 56, 60);
        this.tailbottom.addBox(0.0F, 0.0F, 0.0F, 2, 11, 9);
        this.tailbottom.setRotationPoint(-1.0F, 23.0F, 28.0F);
        this.tailbottom.setTextureSize(128, 128);
        this.tailbottom.mirror = true;
        setRotation(tailbottom, 0.6320361F, 0.0F, -0.0174533F);
        this.nose = new ModelRenderer(this, 54, 19);
        this.nose.addBox(-3.0F, -2.0F, -5.0F, 5, 5, 5);
        this.nose.setRotationPoint(0.0F, -2.0F, -11.0F);
        this.nose.setTextureSize(128, 128);
        this.nose.mirror = true;
        setRotation(nose, 0.0F, 0.0F, 0.0F);
        this.headfin = new ModelRenderer(this, 0, 99);
        this.headfin.addBox(0.0F, -5.0F, 0.0F, 0, 10, 9);
        this.headfin.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.headfin.setTextureSize(128, 128);
        this.headfin.mirror = true;
        setRotation(headfin, 0.1396263F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 38, 32);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 0, 5, 5);
        this.rightear.setRotationPoint(-4.0F, -2.0F, -5.0F);
        this.rightear.setTextureSize(128, 128);
        this.rightear.mirror = true;
        setRotation(rightear, 0.0698132F, -0.418879F, 0.0F);
        this.leftear = new ModelRenderer(this, 38, 32);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 0, 5, 5);
        this.leftear.setRotationPoint(3.0F, -2.0F, -5.0F);
        this.leftear.setTextureSize(128, 128);
        this.leftear.mirror = true;
        setRotation(leftear, 0.0698132F, 0.418879F, 0.0F);
        this.neackfin = new ModelRenderer(this, 42, 47);
        this.neackfin.addBox(0.0F, -1.0F, 0.0F, 0, 5, 5);
        this.neackfin.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.neackfin.setTextureSize(128, 128);
        this.neackfin.mirror = true;
        setRotation(neackfin, -0.185895F, 0.0F, 0.0F);
        this.Bodyfin = new ModelRenderer(this, 21, 91);
        this.Bodyfin.addBox(0.0F, -6.0F, -3.0F, 0, 10, 9);
        this.Bodyfin.setRotationPoint(0.0F, 15.0F, 2.0F);
        this.Bodyfin.setTextureSize(128, 128);
        this.Bodyfin.mirror = true;
        setRotation(Bodyfin, -0.0698132F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 76, 8);
        this.jaw.addBox(-2.0F, 0.0F, -5.0F, 5, 1, 5);
        this.jaw.setRotationPoint(-1.0F, 3.0F, -10.0F);
        this.jaw.setTextureSize(128, 128);
        this.jaw.mirror = true;
        setRotation(jaw, 0.0F, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final WaterDragon e = (WaterDragon)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        final float pi4 = 0.7853982f;
        final float root13 = (float)Math.sqrt(13.0);
        final float root14 = (float)Math.sqrt(20.0);
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.2f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.body3.rotateAngleY = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.4f * f1;
        this.body4.rotationPointZ = this.body3.rotationPointZ + (float)Math.cos(this.body3.rotateAngleY) * 7.0f;
        this.body4.rotationPointX = this.body3.rotationPointX - 1.0f + (float)Math.sin(this.body3.rotateAngleY) * 7.0f;
        this.body4.rotateAngleY = MathHelper.cos(f2 * 1.3f * this.wingspeed - pi4) * 3.1415927f * 0.4f * f1;
        this.tail1.rotationPointZ = this.body4.rotationPointZ + (float)Math.cos(this.body4.rotateAngleY) * 5.0f;
        this.tail1.rotationPointX = this.body4.rotationPointX + (float)Math.sin(this.body4.rotateAngleY) * 5.0f;
        this.tail1.rotateAngleY = MathHelper.cos(f2 * 1.3f * this.wingspeed - 2.0f * pi4) * 3.1415927f * 0.4f * f1;
        this.tailmiddle.rotationPointZ = this.tail1.rotationPointZ + (float)Math.cos(this.tail1.rotateAngleY) * 3.0f;
        this.tailmiddle.rotationPointX = this.tail1.rotationPointX + (float)Math.sin(this.tail1.rotateAngleY) * 3.0f;
        this.tailmiddle.rotateAngleY = MathHelper.cos(f2 * 1.3f * this.wingspeed - 3.0f * pi4) * 3.1415927f * 0.4f * f1;
        this.tailtop.rotateAngleY = this.tailmiddle.rotateAngleY;
        this.tailtop.rotationPointZ = this.tailmiddle.rotationPointZ;
        this.tailtop.rotationPointX = this.tailmiddle.rotationPointX;
        this.tailbottom.rotateAngleY = this.tailmiddle.rotateAngleY;
        this.tailbottom.rotationPointZ = this.tailmiddle.rotationPointZ;
        this.tailbottom.rotationPointX = this.tailmiddle.rotationPointX;
        this.Leg8.rotateAngleY = 0.58f + newangle;
        this.Leg2.rotateAngleY = -0.58f + newangle;
        this.Leg7.rotateAngleY = -0.58f - newangle;
        this.Leg1.rotateAngleY = 0.58f - newangle;
        newangle = MathHelper.cos(f2 * 0.8f * this.wingspeed) * 3.1415927f * 0.1f;
        this.leftear.rotateAngleY = 0.62f + newangle;
        this.rightear.rotateAngleY = -0.62f - newangle;
        newangle = MathHelper.cos(f2 * 0.7f * this.wingspeed) * 3.1415927f * 0.02f;
        if (e.isSitting()) {
            newangle = 0.0f;
        }
        this.Bodyfin.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.6f * this.wingspeed) * 3.1415927f * 0.1f;
        if (e.isSitting()) {
            newangle = 0.0f;
        }
        this.neackfin.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 0.5f * this.wingspeed) * 3.1415927f * 0.05f;
        if (e.isSitting()) {
            newangle = 0.0f;
        }
        this.headfin.rotateAngleY = newangle;
        if (e.getAttacking() == 1) {
            newangle = MathHelper.cos(f2 * 1.2f * this.wingspeed) * 3.1415927f * 0.25f;
            this.jaw.rotateAngleX = newangle;
        }
        else if (e.getAttacking() == 2) {
            this.jaw.rotateAngleX = 0.45f;
        }
        else {
            this.jaw.rotateAngleX = -0.25f;
        }
        newangle = (float)Math.toRadians(f3) * 0.75f;
        this.Head.rotateAngleY = newangle;
        this.nose.rotateAngleY = newangle;
        this.nose.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY) * 8.0f;
        this.nose.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY) * 8.0f;
        this.jaw.rotateAngleY = newangle;
        this.jaw.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY) * 7.0f;
        this.jaw.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY) * 7.0f - 1.0f;
        this.headfin.rotateAngleY = newangle;
        this.headfin.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY) * 3.0f;
        this.headfin.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY) * 3.0f;
        final ModelRenderer leftear = this.leftear;
        leftear.rotateAngleY += newangle;
        this.leftear.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY - pi4) * root13;
        this.leftear.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY - pi4) * root13;
        final ModelRenderer rightear = this.rightear;
        rightear.rotateAngleY += newangle;
        this.rightear.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY + pi4) * root14;
        this.rightear.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY + pi4) * root14;
        this.Head.render(f5);
        this.neck1.render(f5);
        this.body1.render(f5);
        this.Leg8.render(f5);
        this.Leg2.render(f5);
        this.Leg7.render(f5);
        this.Leg1.render(f5);
        this.neck2.render(f5);
        this.neck3.render(f5);
        this.neck4.render(f5);
        this.body2.render(f5);
        this.body3.render(f5);
        this.body4.render(f5);
        this.tail1.render(f5);
        this.tailmiddle.render(f5);
        this.tailtop.render(f5);
        this.tailbottom.render(f5);
        this.nose.render(f5);
        this.headfin.render(f5);
        this.rightear.render(f5);
        this.leftear.render(f5);
        this.neackfin.render(f5);
        this.Bodyfin.render(f5);
        this.jaw.render(f5);
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
