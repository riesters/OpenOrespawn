package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelChipmunk extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Cheek2;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail2;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer MouthUnder;
    ModelRenderer Cheek1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Ear1;
    ModelRenderer Body;
    ModelRenderer BodyTail;
    ModelRenderer Tail1;
    ModelRenderer Hat1;
    ModelRenderer Hat2;
    
    public ModelChipmunk(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Cheek2 = new ModelRenderer(this, 14, 0);
        this.Cheek2.addBox(0.5F, -1.5F, -3.5F, 2, 2, 2);
        this.Cheek2.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Cheek2.setTextureSize(64, 32);
        this.Cheek2.mirror = true;
        setRotation(Cheek2, 0.0F);
        this.Leg1 = new ModelRenderer(this, 22, 7);
        this.Leg1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Leg1.setRotationPoint(-2.0F, 23.0F, -4.0F);
        this.Leg1.setTextureSize(64, 32);
        this.Leg1.mirror = true;
        setRotation(Leg1, 0.0F);
        this.Leg2 = new ModelRenderer(this, 22, 9);
        this.Leg2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Leg2.setRotationPoint(1.0F, 23.0F, -4.0F);
        this.Leg2.setTextureSize(64, 32);
        this.Leg2.mirror = true;
        setRotation(Leg2, 0.0F);
        this.Leg3 = new ModelRenderer(this, 22, 11);
        this.Leg3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Leg3.setRotationPoint(1.0F, 23.0F, 0.0F);
        this.Leg3.setTextureSize(64, 32);
        this.Leg3.mirror = true;
        setRotation(Leg3, 0.0F);
        this.Leg4 = new ModelRenderer(this, 22, 13);
        this.Leg4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Leg4.setRotationPoint(-2.0F, 23.0F, 0.0F);
        this.Leg4.setTextureSize(64, 32);
        this.Leg4.mirror = true;
        setRotation(Leg4, 0.0F);
        this.Tail2 = new ModelRenderer(this, 28, 15);
        this.Tail2.addBox(-0.5F, 1.0F, 2.5F, 3, 3, 4);
        this.Tail2.setRotationPoint(-1.0F, 20.0F, 1.0F);
        this.Tail2.setTextureSize(64, 32);
        this.Tail2.mirror = true;
        setRotation(Tail2, 0.7662421F);
        this.Neck = new ModelRenderer(this, 26, 9);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4);
        this.Neck.setRotationPoint(-1.5F, 22.0F, -5.0F);
        this.Neck.setTextureSize(64, 32);
        this.Neck.mirror = true;
        setRotation(Neck, 1.570796F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.addBox(-2.0F, -3.0F, 0.0F, 4, 4, 3);
        this.Head.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        setRotation(Head, 1.570796F);
        this.MouthUnder = new ModelRenderer(this, 20, 4);
        this.MouthUnder.addBox(-1.0F, -1.9F, -3.8F, 2, 2, 1);
        this.MouthUnder.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.MouthUnder.setTextureSize(64, 32);
        this.MouthUnder.mirror = true;
        setRotation(MouthUnder, 0.0F);
        this.Cheek1 = new ModelRenderer(this, 22, 0);
        this.Cheek1.addBox(-2.5F, -1.5F, -3.5F, 2, 2, 2);
        this.Cheek1.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Cheek1.setTextureSize(64, 32);
        this.Cheek1.mirror = true;
        setRotation(Cheek1, 0.0F);
        this.Ear2 = new ModelRenderer(this, 18, 11);
        this.Ear2.addBox(1.0F, 0.0F, 3.0F, 1, 1, 1);
        this.Ear2.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Ear2.setTextureSize(64, 32);
        this.Ear2.mirror = true;
        setRotation(Ear2, 1.570796F);
        this.Nose = new ModelRenderer(this, 18, 7);
        this.Nose.addBox(-0.5F, -2.0F, -4.2F, 1, 1, 1);
        this.Nose.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Nose.setTextureSize(64, 32);
        this.Nose.mirror = true;
        setRotation(Nose, 0.0F);
        this.Ear1 = new ModelRenderer(this, 18, 9);
        this.Ear1.addBox(-2.0F, 0.0F, 3.0F, 1, 1, 1);
        this.Ear1.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Ear1.setTextureSize(64, 32);
        this.Ear1.mirror = true;
        setRotation(Ear1, 1.570796F);
        this.Body = new ModelRenderer(this, 0, 7);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5);
        this.Body.setRotationPoint(-2.0F, 20.0F, -4.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        setRotation(Body, 0.0F);
        this.BodyTail = new ModelRenderer(this, 0, 15);
        this.BodyTail.addBox(0.0F, 0.0F, 0.0F, 5, 4, 3);
        this.BodyTail.setRotationPoint(-2.5F, 19.0F, -1.0F);
        this.BodyTail.setTextureSize(64, 32);
        this.BodyTail.mirror = true;
        setRotation(BodyTail, 0.0F);
        this.Tail1 = new ModelRenderer(this, 16, 15);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
        this.Tail1.setRotationPoint(-1.0F, 20.0F, 1.0F);
        this.Tail1.setTextureSize(64, 32);
        this.Tail1.mirror = true;
        setRotation(Tail1, 0.3064968F);
        this.Hat1 = new ModelRenderer(this, 40, 0);
        this.Hat1.addBox(-2.5F, -4.0F, -4.0F, 5, 1, 5);
        this.Hat1.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Hat1.setTextureSize(64, 32);
        this.Hat1.mirror = true;
        setRotation(Hat1, 0.0F);
        this.Hat2 = new ModelRenderer(this, 40, 0);
        this.Hat2.addBox(-2.0F, -6.0F, -3.0F, 4, 2, 4);
        this.Hat2.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.Hat2.setTextureSize(64, 32);
        this.Hat2.mirror = true;
        setRotation(Hat2, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Chipmunk c = (Chipmunk)entity;
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 2.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.Leg1.rotateAngleX = newangle;
        this.Leg3.rotateAngleX = newangle;
        this.Leg2.rotateAngleX = -newangle;
        this.Leg4.rotateAngleX = -newangle;
        this.Head.rotateAngleY = (float)Math.toRadians(f3) * 0.45f;
        this.Nose.rotateAngleY = this.Head.rotateAngleY;
        this.Ear1.rotateAngleY = this.Head.rotateAngleY;
        this.Ear2.rotateAngleY = this.Head.rotateAngleY;
        this.MouthUnder.rotateAngleY = this.Head.rotateAngleY;
        this.Cheek1.rotateAngleY = this.Head.rotateAngleY;
        this.Cheek2.rotateAngleY = this.Head.rotateAngleY;
        this.Hat1.rotateAngleY = this.Head.rotateAngleY;
        this.Hat2.rotateAngleY = this.Head.rotateAngleY;
        if (!c.isSitting()) {
            this.Tail1.rotateAngleX = 0.306f + MathHelper.cos(f2 * 0.25f) * 3.1415927f * 0.06f;
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
            final ModelRenderer tail1 = this.Tail1;
            tail1.rotateAngleX += newangle;
            this.Tail2.rotateAngleX = 0.306f + this.Tail1.rotateAngleX;
        }
        this.Cheek2.render(f5);
        this.Leg1.render(f5);
        this.Leg2.render(f5);
        this.Leg3.render(f5);
        this.Leg4.render(f5);
        this.Tail2.render(f5);
        this.Neck.render(f5);
        this.Head.render(f5);
        this.MouthUnder.render(f5);
        this.Cheek1.render(f5);
        this.Ear2.render(f5);
        this.Nose.render(f5);
        this.Ear1.render(f5);
        this.Body.render(f5);
        this.BodyTail.render(f5);
        this.Tail1.render(f5);
        if (c.get_is_activated() != 0) {
            this.Hat1.render(f5);
            if (c.get_is_activated() > 1) {
                this.Hat2.render(f5);
            }
        }
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
