package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelAlosaurus extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer jaw;
    ModelRenderer leftleg;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer Shape11;
    ModelRenderer rightleg;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer leftleg4;
    ModelRenderer rightleg4;
    ModelRenderer Shape17;
    
    public ModelAlosaurus(final float f1) {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.wingspeed = f1;
        this.Shape18 = new ModelRenderer(this, 91, 114);
        this.Shape18.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
        this.Shape18.setRotationPoint(3.3F, -25.0F, -27.0F);
        this.Shape18.setTextureSize(128, 128);
        this.Shape18.mirror = true;
        setRotation(Shape18, 0.5759587F, 0.5585054F);
        this.Shape19 = new ModelRenderer(this, 71, 114);
        this.Shape19.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
        this.Shape19.setRotationPoint(-4.0F, -24.0F, -28.0F);
        this.Shape19.setTextureSize(128, 128);
        this.Shape19.mirror = true;
        setRotation(Shape19, 0.5759587F, -0.5585054F);
        this.Shape20 = new ModelRenderer(this, 91, 30);
        this.Shape20.addBox(0.0F, 0.0F, 0.0F, 2, 7, 5);
        this.Shape20.setRotationPoint(5.0F, -8.0F, -6.0F);
        this.Shape20.setTextureSize(128, 128);
        this.Shape20.mirror = true;
        setRotation(Shape20, 0.3839724F, 0.0F);
        this.Shape21 = new ModelRenderer(this, 93, 46);
        this.Shape21.addBox(-2.0F, 0.0F, 0.0F, 2, 7, 5);
        this.Shape21.setRotationPoint(-4.0F, -8.0F, -6.0F);
        this.Shape21.setTextureSize(128, 128);
        this.Shape21.mirror = true;
        setRotation(Shape21, 0.3839724F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(-7.0F, 0.0F, 0.0F, 10, 18, 31);
        this.Shape1.setRotationPoint(2.5F, -19.0F, -8.0F);
        this.Shape1.setTextureSize(128, 128);
        this.Shape1.mirror = true;
        setRotation(Shape1, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 62, 0);
        this.Shape2.addBox(-5.0F, 0.0F, 0.0F, 10, 11, 11);
        this.Shape2.setRotationPoint(0.5F, -19.0F, 23.0F);
        this.Shape2.setTextureSize(128, 128);
        this.Shape2.mirror = true;
        setRotation(Shape2, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 10, 54);
        this.Shape3.addBox(-3.0F, 0.0F, 0.0F, 7, 7, 25);
        this.Shape3.setRotationPoint(0.0F, -19.0F, 34.0F);
        this.Shape3.setTextureSize(128, 128);
        this.Shape3.mirror = true;
        setRotation(Shape3, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 68, 88);
        this.Shape4.addBox(-5.0F, 0.0F, 0.0F, 8, 9, 16);
        this.Shape4.setRotationPoint(1.5F, -25.0F, -16.0F);
        this.Shape4.setTextureSize(128, 128);
        this.Shape4.mirror = true;
        setRotation(Shape4, -0.4014257F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 75, 65);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 9, 9, 12);
        this.Shape5.setRotationPoint(-4.0F, -25.0F, -27.0F);
        this.Shape5.setTextureSize(128, 128);
        this.Shape5.mirror = true;
        setRotation(Shape5, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 0, 50);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 7, 9, 9);
        this.Shape6.setRotationPoint(-3.0F, -25.0F, -36.0F);
        this.Shape6.setTextureSize(128, 128);
        this.Shape6.mirror = true;
        setRotation(Shape6, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 0, 86);
        this.jaw.addBox(-5.0F, 0.0F, -10.0F, 7, 1, 13);
        this.jaw.setRotationPoint(2.0F, -15.0F, -24.0F);
        this.jaw.setTextureSize(128, 128);
        this.jaw.mirror = true;
        setRotation(jaw, 0.5201081F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 0);
        this.leftleg.addBox(-1.0F, 0.0F, 0.0F, 3, 16, 10);
        this.leftleg.setRotationPoint(6.0F, -10.0F, 11.0F);
        this.leftleg.setTextureSize(128, 128);
        this.leftleg.mirror = true;
        setRotation(leftleg, -0.1745329F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 0, 106);
        this.leftleg2.addBox(-1.0F, 12.0F, -8.0F, 3, 15, 5);
        this.leftleg2.setRotationPoint(6.0F, -10.0F, 11.0F);
        this.leftleg2.setTextureSize(128, 128);
        this.leftleg2.mirror = true;
        setRotation(leftleg2, 0.5061455F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 112, 89);
        this.leftleg3.addBox(-1.0F, 19.0F, 16.0F, 3, 9, 3);
        this.leftleg3.setRotationPoint(6.0F, -10.0F, 11.0F);
        this.leftleg3.setTextureSize(128, 128);
        this.leftleg3.mirror = true;
        setRotation(leftleg3, -0.4014257F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 0, 72);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2);
        this.Shape11.setRotationPoint(5.0F, -5.0F, -3.0F);
        this.Shape11.setTextureSize(128, 128);
        this.Shape11.mirror = true;
        setRotation(Shape11, -0.5235988F, 0.0F);
        this.rightleg = new ModelRenderer(this, 54, 51);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 3, 16, 10);
        this.rightleg.setRotationPoint(-7.0F, -10.0F, 11.0F);
        this.rightleg.setTextureSize(128, 128);
        this.rightleg.mirror = true;
        setRotation(rightleg, -0.1745329F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 23, 106);
        this.rightleg2.addBox(0.0F, 12.0F, -8.0F, 3, 15, 5);
        this.rightleg2.setRotationPoint(-7.0F, -10.0F, 11.0F);
        this.rightleg2.setTextureSize(128, 128);
        this.rightleg2.mirror = true;
        setRotation(rightleg2, 0.5061455F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 70, 90);
        this.rightleg3.addBox(0.0F, 19.0F, 16.0F, 3, 9, 3);
        this.rightleg3.setRotationPoint(-7.0F, -10.0F, 11.0F);
        this.rightleg3.setTextureSize(128, 128);
        this.rightleg3.mirror = true;
        setRotation(rightleg3, -0.4014257F, 0.0F);
        this.leftleg4 = new ModelRenderer(this, 42, 113);
        this.leftleg4.addBox(-1.0F, 31.0F, -1.0F, 3, 3, 8);
        this.leftleg4.setRotationPoint(6.0F, -10.0F, 11.0F);
        this.leftleg4.setTextureSize(128, 128);
        this.leftleg4.mirror = true;
        setRotation(leftleg4, 0.0F, 0.0F);
        this.rightleg4 = new ModelRenderer(this, 44, 93);
        this.rightleg4.addBox(0.0F, 31.0F, -1.0F, 3, 3, 8);
        this.rightleg4.setRotationPoint(-7.0F, -10.0F, 11.0F);
        this.rightleg4.setTextureSize(128, 128);
        this.rightleg4.mirror = true;
        setRotation(rightleg4, 0.0F, 0.0F);
        this.Shape17 = new ModelRenderer(this, 112, 60);
        this.Shape17.addBox(-2.0F, 0.0F, 0.0F, 2, 10, 2);
        this.Shape17.setRotationPoint(-4.0F, -3.533333F, -3.0F);
        this.Shape17.setTextureSize(128, 128);
        this.Shape17.mirror = true;
        setRotation(Shape17, -0.5235988F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Alosaurus e = (Alosaurus)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.rightleg.rotateAngleX = -0.174f + newangle;
        this.rightleg2.rotateAngleX = 0.506f + newangle;
        this.rightleg3.rotateAngleX = -0.401f + newangle;
        this.rightleg4.rotateAngleX = newangle;
        this.leftleg.rotateAngleX = -0.174f - newangle;
        this.leftleg2.rotateAngleX = 0.506f - newangle;
        this.leftleg3.rotateAngleX = -0.401f - newangle;
        this.leftleg4.rotateAngleX = -newangle;
        if (e.getAttacking() != 0) {
            this.jaw.rotateAngleX = 0.52f + MathHelper.cos(f2 * 0.45f) * 3.1415927f * 0.18f;
        }
        else {
            this.jaw.rotateAngleX = 0.1f;
        }
        this.Shape17.rotateAngleX = -0.523f + MathHelper.cos(f2 * 0.1f) * 3.1415927f * 0.05f;
        this.Shape11.rotateAngleX = -0.523f + MathHelper.cos(f2 * 0.1f) * 3.1415927f * 0.05f;
        this.Shape18.render(f5);
        this.Shape19.render(f5);
        this.Shape20.render(f5);
        this.Shape21.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.jaw.render(f5);
        this.leftleg.render(f5);
        this.leftleg2.render(f5);
        this.leftleg3.render(f5);
        this.Shape11.render(f5);
        this.rightleg.render(f5);
        this.rightleg2.render(f5);
        this.rightleg3.render(f5);
        this.leftleg4.render(f5);
        this.rightleg4.render(f5);
        this.Shape17.render(f5);
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
