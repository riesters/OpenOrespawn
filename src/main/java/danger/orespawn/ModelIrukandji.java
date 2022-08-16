package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelIrukandji extends ModelBase
{
    ModelRenderer body;
    ModelRenderer t11;
    ModelRenderer t12;
    ModelRenderer t21;
    ModelRenderer t22;
    ModelRenderer t31;
    ModelRenderer t32;
    ModelRenderer t41;
    ModelRenderer t42;
    
    public ModelIrukandji() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 0, 9);
        this.body.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4);
        this.body.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body);
        this.t11 = new ModelRenderer(this, 25, 0);
        this.t11.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t11.setRotationPoint(1.0F, 10.0F, -2.0F);
        this.t11.setTextureSize(64, 32);
        this.t11.mirror = true;
        setRotation(t11);
        this.t12 = new ModelRenderer(this, 5, 0);
        this.t12.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t12.setRotationPoint(1.0F, 17.0F, -2.0F);
        this.t12.setTextureSize(64, 32);
        this.t12.mirror = true;
        setRotation(t12);
        this.t21 = new ModelRenderer(this, 0, 0);
        this.t21.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t21.setRotationPoint(-2.0F, 10.0F, -2.0F);
        this.t21.setTextureSize(64, 32);
        this.t21.mirror = true;
        setRotation(t21);
        this.t22 = new ModelRenderer(this, 20, 0);
        this.t22.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t22.setRotationPoint(-2.0F, 17.0F, -2.0F);
        this.t22.setTextureSize(64, 32);
        this.t22.mirror = true;
        setRotation(t22);
        this.t31 = new ModelRenderer(this, 30, 0);
        this.t31.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t31.setRotationPoint(1.0F, 10.0F, 1.0F);
        this.t31.setTextureSize(64, 32);
        this.t31.mirror = true;
        setRotation(t31);
        this.t32 = new ModelRenderer(this, 10, 0);
        this.t32.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t32.setRotationPoint(1.0F, 17.0F, 1.0F);
        this.t32.setTextureSize(64, 32);
        this.t32.mirror = true;
        setRotation(t32);
        this.t41 = new ModelRenderer(this, 35, 0);
        this.t41.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t41.setRotationPoint(-2.0F, 10.0F, 1.0F);
        this.t41.setTextureSize(64, 32);
        this.t41.mirror = true;
        setRotation(t41);
        this.t42 = new ModelRenderer(this, 15, 0);
        this.t42.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.t42.setRotationPoint(-2.0F, 17.0F, 1.0F);
        this.t42.setTextureSize(64, 32);
        this.t42.mirror = true;
        setRotation(t42);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        newangle = MathHelper.cos(f2 * 0.55f) * 3.1415927f * 0.15f;
        this.t11.rotateAngleX = newangle;
        float d1 = (float)(Math.sin(newangle) * 7.0);
        float d2 = (float)(Math.cos(newangle) * 7.0);
        this.t12.rotationPointZ = this.t11.rotationPointZ + d1;
        newangle = MathHelper.cos(f2 * 0.35f) * 3.1415927f * 0.1f;
        this.t11.rotateAngleZ = newangle;
        float d3 = (float)(Math.cos(newangle) * d2);
        float d4 = (float)(Math.sin(newangle) * d2);
        this.t12.rotationPointX = this.t11.rotationPointX - d4;
        this.t12.rotationPointY = this.t11.rotationPointY + d3;
        newangle = MathHelper.cos(f2 * 0.45f) * 3.1415927f * 0.15f;
        this.t12.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.25f) * 3.1415927f * 0.1f;
        this.t12.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.65f) * 3.1415927f * 0.15f;
        this.t21.rotateAngleX = newangle;
        d1 = (float)(Math.sin(newangle) * 7.0);
        d2 = (float)(Math.cos(newangle) * 7.0);
        this.t22.rotationPointZ = this.t21.rotationPointZ + d1;
        newangle = MathHelper.cos(f2 * 0.45f) * 3.1415927f * 0.1f;
        this.t21.rotateAngleZ = newangle;
        d3 = (float)(Math.cos(newangle) * d2);
        d4 = (float)(Math.sin(newangle) * d2);
        this.t22.rotationPointX = this.t21.rotationPointX - d4;
        this.t22.rotationPointY = this.t21.rotationPointY + d3;
        newangle = MathHelper.cos(f2 * 0.55f) * 3.1415927f * 0.15f;
        this.t22.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.35f) * 3.1415927f * 0.1f;
        this.t22.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.5f) * 3.1415927f * 0.15f;
        this.t31.rotateAngleX = newangle;
        d1 = (float)(Math.sin(newangle) * 7.0);
        d2 = (float)(Math.cos(newangle) * 7.0);
        this.t32.rotationPointZ = this.t31.rotationPointZ + d1;
        newangle = MathHelper.cos(f2 * 0.3f) * 3.1415927f * 0.1f;
        this.t31.rotateAngleZ = newangle;
        d3 = (float)(Math.cos(newangle) * d2);
        d4 = (float)(Math.sin(newangle) * d2);
        this.t32.rotationPointX = this.t31.rotationPointX - d4;
        this.t32.rotationPointY = this.t31.rotationPointY + d3;
        newangle = MathHelper.cos(f2 * 0.4f) * 3.1415927f * 0.15f;
        this.t32.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.2f) * 3.1415927f * 0.1f;
        this.t32.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.57f) * 3.1415927f * 0.15f;
        this.t41.rotateAngleX = newangle;
        d1 = (float)(Math.sin(newangle) * 7.0);
        d2 = (float)(Math.cos(newangle) * 7.0);
        this.t42.rotationPointZ = this.t41.rotationPointZ + d1;
        newangle = MathHelper.cos(f2 * 0.37f) * 3.1415927f * 0.1f;
        this.t41.rotateAngleZ = newangle;
        d3 = (float)(Math.cos(newangle) * d2);
        d4 = (float)(Math.sin(newangle) * d2);
        this.t42.rotationPointX = this.t41.rotationPointX - d4;
        this.t42.rotationPointY = this.t41.rotationPointY + d3;
        newangle = MathHelper.cos(f2 * 0.48f) * 3.1415927f * 0.15f;
        this.t42.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.29f) * 3.1415927f * 0.1f;
        this.t42.rotateAngleZ = newangle;
        this.body.render(f5);
        this.t11.render(f5);
        this.t12.render(f5);
        this.t21.render(f5);
        this.t22.render(f5);
        this.t31.render(f5);
        this.t32.render(f5);
        this.t41.render(f5);
        this.t42.render(f5);
    }
    
    private void setRotation(final ModelRenderer model) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
