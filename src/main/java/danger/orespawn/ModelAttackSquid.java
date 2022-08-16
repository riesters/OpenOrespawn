package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelAttackSquid extends ModelBase
{
    private final float wingspeed;
    ModelRenderer tent1;
    ModelRenderer tent2;
    ModelRenderer tent3;
    ModelRenderer tent4;
    ModelRenderer tent5;
    ModelRenderer tent6;
    ModelRenderer tent7;
    ModelRenderer body;
    ModelRenderer tent8;
    
    public ModelAttackSquid(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tent1 = new ModelRenderer(this, 0, 18);
        this.tent1.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2);
        this.tent1.setRotationPoint(5.0F, 15.0F, -1.0F);
        this.tent1.setTextureSize(64, 32);
        this.tent1.mirror = true;
        setRotation(tent1, -0.9250245F, -1.745329F, 0.0F);
        this.tent2 = new ModelRenderer(this, 0, 18);
        this.tent2.addBox(-8.0F, -1.0F, -1.0F, 8, 2, 2);
        this.tent2.setRotationPoint(-2.0F, 15.0F, -3.0F);
        this.tent2.setTextureSize(64, 32);
        this.tent2.mirror = true;
        setRotation(tent2, -0.1745329F, -0.6632251F, -0.2443461F);
        this.tent3 = new ModelRenderer(this, 0, 18);
        this.tent3.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
        this.tent3.setRotationPoint(1.0F, 15.0F, -4.0F);
        this.tent3.setTextureSize(64, 32);
        this.tent3.mirror = true;
        setRotation(tent3, -1.134464F, 0.3316126F, 0.0F);
        this.tent4 = new ModelRenderer(this, 0, 18);
        this.tent4.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
        this.tent4.setRotationPoint(-3.0F, 15.0F, -1.0F);
        this.tent4.setTextureSize(64, 32);
        this.tent4.mirror = true;
        setRotation(tent4, 0.5585054F, -1.692969F, 0.0F);
        this.tent5 = new ModelRenderer(this, 0, 18);
        this.tent5.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2);
        this.tent5.setRotationPoint(1.0F, 15.0F, 3.0F);
        this.tent5.setTextureSize(64, 32);
        this.tent5.mirror = true;
        setRotation(tent5, 0.5410521F, 0.2268928F, 0.0F);
        this.tent6 = new ModelRenderer(this, 0, 18);
        this.tent6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
        this.tent6.setRotationPoint(-2.0F, 15.0F, 2.0F);
        this.tent6.setTextureSize(64, 32);
        this.tent6.mirror = true;
        setRotation(tent6, -0.418879F, -0.6806784F, 0.0F);
        this.tent7 = new ModelRenderer(this, 0, 18);
        this.tent7.addBox(0.0F, -1.0F, -1.0F, 8, 2, 2);
        this.tent7.setRotationPoint(3.0F, 15.0F, 1.0F);
        this.tent7.setTextureSize(64, 32);
        this.tent7.mirror = true;
        setRotation(tent7, -0.1919862F, -0.6632251F, 0.418879F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8);
        this.body.setRotationPoint(1.0F, 16.0F, -1.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body, -0.1919862F, -0.6806784F, 0.0F);
        this.tent8 = new ModelRenderer(this, 0, 18);
        this.tent8.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8);
        this.tent8.setRotationPoint(3.0F, 15.0F, -4.0F);
        this.tent8.setTextureSize(64, 32);
        this.tent8.mirror = true;
        setRotation(tent8, 0.1919862F, -0.6806784F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangleA;
        float newangleB;
        float newangle8;
        float newangle9;
        float newangle10;
        float newangle11;
        float newangle12;
        float newangle13;
        float newangle14;
        float newangle15;
        if (f1 > 0.1) {
            newangleA = MathHelper.cos(f2 * 0.25f * this.wingspeed) * 3.1415927f * 0.04f * f1;
            newangleB = MathHelper.cos(f2 * 0.39f * this.wingspeed) * 3.1415927f * 0.04f * f1;
            newangle9 = MathHelper.cos(f2 * 1.2f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle10 = MathHelper.cos(f2 * 1.1f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle11 = MathHelper.cos(f2 * 1.0f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle12 = MathHelper.cos(f2 * 1.9f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle13 = MathHelper.cos(f2 * 1.8f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle14 = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle15 = MathHelper.cos(f2 * 1.6f * this.wingspeed) * 3.1415927f * 0.4f * f1;
            newangle8 = MathHelper.cos(f2 * 1.5f * this.wingspeed) * 3.1415927f * 0.4f * f1;
        }
        else {
            newangleA = MathHelper.cos(f2 * 0.25f * this.wingspeed) * 3.1415927f * 0.01f;
            newangleB = MathHelper.cos(f2 * 0.39f * this.wingspeed) * 3.1415927f * 0.01f;
            newangle9 = MathHelper.cos(f2 * 1.2f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle10 = MathHelper.cos(f2 * 1.1f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle11 = MathHelper.cos(f2 * 1.0f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle12 = MathHelper.cos(f2 * 1.9f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle13 = MathHelper.cos(f2 * 1.8f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle14 = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle15 = MathHelper.cos(f2 * 1.6f * this.wingspeed) * 3.1415927f * 0.1f;
            newangle8 = MathHelper.cos(f2 * 1.5f * this.wingspeed) * 3.1415927f * 0.1f;
        }
        this.tent1.rotateAngleX = newangle9 - 1.03f;
        this.tent7.rotateAngleZ = newangle10 + 0.37f;
        this.tent5.rotateAngleX = newangle11 + 0.6f;
        this.tent6.rotateAngleX = newangle12 - 0.48f;
        this.tent4.rotateAngleX = newangle13 + 0.63f;
        this.tent2.rotateAngleZ = newangle14 - 0.26f;
        this.tent3.rotateAngleX = newangle15 - 1.03f;
        this.tent8.rotateAngleX = newangle8 + 0.43f;
        this.body.rotateAngleX = newangleA;
        this.body.rotateAngleZ = newangleB;
        newangleA = (float)Math.toRadians(f3) * 0.75f;
        this.body.rotateAngleY = newangleA;
        this.tent1.render(f5);
        this.tent2.render(f5);
        this.tent3.render(f5);
        this.tent4.render(f5);
        this.tent5.render(f5);
        this.tent6.render(f5);
        this.tent7.render(f5);
        this.body.render(f5);
        this.tent8.render(f5);
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
