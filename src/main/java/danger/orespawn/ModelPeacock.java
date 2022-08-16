package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelPeacock extends ModelBase
{
    private final float wingspeed;
    ModelRenderer lleg;
    ModelRenderer rleg;
    ModelRenderer body;
    ModelRenderer neck;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer hf1;
    ModelRenderer hf2;
    ModelRenderer hf3;
    ModelRenderer tailf1;
    ModelRenderer tailf2;
    ModelRenderer tailf3;
    ModelRenderer tailf4;
    ModelRenderer tailf5;
    ModelRenderer tailf6;
    ModelRenderer tailf7;
    
    public ModelPeacock(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.lleg = new ModelRenderer(this, 0, 20);
        this.lleg.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.lleg.setRotationPoint(1.0F, 17.0F, 0.0F);
        this.lleg.setTextureSize(128, 128);
        this.lleg.mirror = true;
        setRotation(lleg, 0.0F);
        this.rleg = new ModelRenderer(this, 5, 20);
        this.rleg.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
        this.rleg.setRotationPoint(-1.0F, 17.0F, 0.0F);
        this.rleg.setTextureSize(128, 128);
        this.rleg.mirror = true;
        setRotation(rleg, 0.0F);
        this.body = new ModelRenderer(this, 88, 0);
        this.body.addBox(-2.0F, -2.0F, -5.0F, 5, 4, 11);
        this.body.setRotationPoint(0.0F, 15.0F, 1.0F);
        this.body.setTextureSize(128, 128);
        this.body.mirror = true;
        setRotation(body, -0.1396263F);
        this.neck = new ModelRenderer(this, 70, 0);
        this.neck.addBox(-0.5F, -1.0F, -6.0F, 2, 2, 6);
        this.neck.setRotationPoint(0.0F, 14.0F, -3.0F);
        this.neck.setTextureSize(128, 128);
        this.neck.mirror = true;
        setRotation(neck, -0.5585054F);
        this.head1 = new ModelRenderer(this, 56, 0);
        this.head1.addBox(-0.5F, -2.0F, -2.0F, 2, 2, 4);
        this.head1.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.head1.setTextureSize(128, 128);
        this.head1.mirror = true;
        setRotation(head1, 0.0F);
        this.head2 = new ModelRenderer(this, 48, 0);
        this.head2.addBox(0.0F, -1.0F, -4.0F, 1, 1, 2);
        this.head2.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.head2.setTextureSize(128, 128);
        this.head2.mirror = true;
        setRotation(head2, 0.0F);
        this.hf1 = new ModelRenderer(this, 8, 0);
        this.hf1.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
        this.hf1.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.hf1.setTextureSize(128, 128);
        this.hf1.mirror = true;
        setRotation(hf1, 0.4014257F);
        this.hf2 = new ModelRenderer(this, 8, 0);
        this.hf2.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
        this.hf2.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.hf2.setTextureSize(128, 128);
        this.hf2.mirror = true;
        setRotation(hf2, -0.1745329F);
        this.hf3 = new ModelRenderer(this, 8, 0);
        this.hf3.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
        this.hf3.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.hf3.setTextureSize(128, 128);
        this.hf3.mirror = true;
        setRotation(hf3, -0.6981317F);
        this.tailf1 = new ModelRenderer(this, 0, 50);
        this.tailf1.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf1.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf1.setTextureSize(128, 128);
        this.tailf1.mirror = true;
        setRotation(tailf1, 0.0F);
        this.tailf2 = new ModelRenderer(this, 0, 50);
        this.tailf2.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf2.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf2.setTextureSize(128, 128);
        this.tailf2.mirror = true;
        setRotation(tailf2, 0.0F);
        this.tailf3 = new ModelRenderer(this, 0, 50);
        this.tailf3.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf3.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf3.setTextureSize(128, 128);
        this.tailf3.mirror = true;
        setRotation(tailf3, 0.0F);
        this.tailf4 = new ModelRenderer(this, 0, 50);
        this.tailf4.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf4.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf4.setTextureSize(128, 128);
        this.tailf4.mirror = true;
        setRotation(tailf4, 0.0F);
        this.tailf5 = new ModelRenderer(this, 0, 50);
        this.tailf5.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf5.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf5.setTextureSize(128, 128);
        this.tailf5.mirror = true;
        setRotation(tailf5, 0.0F);
        this.tailf6 = new ModelRenderer(this, 0, 50);
        this.tailf6.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf6.setRotationPoint(0.5F, 14.0F, 7.0F);
        this.tailf6.setTextureSize(128, 128);
        this.tailf6.mirror = true;
        setRotation(tailf6, 0.0F);
        this.tailf7 = new ModelRenderer(this, 0, 50);
        this.tailf7.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
        this.tailf7.setRotationPoint(0.514F, 14.0F, 7.0F);
        this.tailf7.setTextureSize(128, 128);
        this.tailf7.mirror = true;
        setRotation(tailf7, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Peacock p = (Peacock)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.15f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.lleg.rotateAngleX = newangle;
        this.rleg.rotateAngleX = -newangle;
        if (p.getBlink() > 0) {
            this.hf1.rotateAngleX = 0.401f;
            this.hf2.rotateAngleX = -0.174f;
            this.hf3.rotateAngleX = -0.698f;
            this.tailf1.rotateAngleX = 1.047f;
            this.tailf2.rotateAngleX = 1.047f;
            this.tailf3.rotateAngleX = 1.047f;
            this.tailf4.rotateAngleX = 1.047f;
            this.tailf5.rotateAngleX = 1.047f;
            this.tailf6.rotateAngleX = 1.047f;
            this.tailf7.rotateAngleX = 1.047f;
            this.tailf1.rotateAngleZ = -0.4f;
            this.tailf2.rotateAngleZ = -0.8f;
            this.tailf3.rotateAngleZ = -1.2f;
            this.tailf4.rotateAngleZ = 0.4f;
            this.tailf5.rotateAngleZ = 0.8f;
            this.tailf6.rotateAngleZ = 1.2f;
        }
        else {
            this.hf1.rotateAngleX = -1.06f;
            this.hf2.rotateAngleX = -1.06f;
            this.hf3.rotateAngleX = -1.06f;
            this.tailf1.rotateAngleX = 0.0f;
            this.tailf2.rotateAngleX = 0.0f;
            this.tailf3.rotateAngleX = 0.0f;
            this.tailf4.rotateAngleX = 0.0f;
            this.tailf5.rotateAngleX = 0.0f;
            this.tailf6.rotateAngleX = 0.0f;
            this.tailf7.rotateAngleX = 0.0f;
            this.tailf1.rotateAngleZ = 0.0f;
            this.tailf2.rotateAngleZ = 0.0f;
            this.tailf3.rotateAngleZ = 0.0f;
            this.tailf4.rotateAngleZ = 0.0f;
            this.tailf5.rotateAngleZ = 0.0f;
            this.tailf6.rotateAngleZ = 0.0f;
        }
        this.lleg.render(f5);
        this.rleg.render(f5);
        this.body.render(f5);
        this.neck.render(f5);
        this.head1.render(f5);
        this.head2.render(f5);
        this.hf1.render(f5);
        this.hf2.render(f5);
        this.hf3.render(f5);
        this.tailf1.render(f5);
        this.tailf2.render(f5);
        this.tailf3.render(f5);
        this.tailf4.render(f5);
        this.tailf5.render(f5);
        this.tailf6.render(f5);
        this.tailf7.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x) {
        model.rotateAngleX = x;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
