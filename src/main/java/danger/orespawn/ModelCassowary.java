package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCassowary extends ModelBase
{
    private final float wingspeed;
    ModelRenderer tail;
    ModelRenderer body;
    ModelRenderer neck1;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer beak;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer crest;
    ModelRenderer foot1;
    ModelRenderer foot2;
    ModelRenderer gobbler;
    
    public ModelCassowary(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tail = new ModelRenderer(this, 38, 16);
        this.tail.addBox(-3.0F, 0.0F, 0.0F, 6, 9, 7);
        this.tail.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.tail.setTextureSize(64, 32);
        this.tail.mirror = true;
        setRotation(tail, 0.8922867F);
        this.body = new ModelRenderer(this, 0, 13);
        this.body.addBox(-4.0F, 0.0F, 0.0F, 8, 10, 9);
        this.body.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body, 0.3346075F);
        this.neck1 = new ModelRenderer(this, 48, 0);
        this.neck1.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 4);
        this.neck1.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.neck1.setTextureSize(64, 32);
        this.neck1.mirror = true;
        setRotation(neck1, -1.189716F);
        this.neck = new ModelRenderer(this, 38, 0);
        this.neck.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2);
        this.neck.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.neck.setTextureSize(64, 32);
        this.neck.mirror = true;
        setRotation(neck, -2.806985F);
        this.head = new ModelRenderer(this, 24, 0);
        this.head.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 4);
        this.head.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        setRotation(head, 0.0371786F);
        this.beak = new ModelRenderer(this, 28, 7);
        this.beak.addBox(-0.5F, 0.0F, 3.0F, 1, 1, 3);
        this.beak.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.beak.setTextureSize(64, 32);
        this.beak.mirror = true;
        setRotation(beak, -3.104414F);
        this.leg1 = new ModelRenderer(this, 0, 0);
        this.leg1.addBox(-0.5F, 0.0F, -1.0F, 1, 11, 2);
        this.leg1.setRotationPoint(3.0F, 12.0F, 3.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        setRotation(leg1, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 0);
        this.leg2.addBox(-0.5F, 0.0F, -1.0F, 1, 11, 2);
        this.leg2.setRotationPoint(-3.0F, 12.0F, 3.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        setRotation(leg2, 0.0F);
        this.crest = new ModelRenderer(this, 10, 0);
        this.crest.addBox(-0.5F, -4.0F, 1.0F, 1, 4, 5);
        this.crest.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.crest.setTextureSize(64, 32);
        this.crest.mirror = true;
        setRotation(crest, 1.710216F);
        this.foot1 = new ModelRenderer(this, 47, 10);
        this.foot1.addBox(-1.033333F, 11.0F, -2.0F, 2, 1, 3);
        this.foot1.setRotationPoint(-3.0F, 12.0F, 3.0F);
        this.foot1.setTextureSize(64, 32);
        this.foot1.mirror = true;
        setRotation(foot1, 0.0F);
        this.foot2 = new ModelRenderer(this, 47, 10);
        this.foot2.addBox(-1.0F, 11.0F, -2.0F, 2, 1, 3);
        this.foot2.setRotationPoint(3.0F, 12.0F, 3.0F);
        this.foot2.setTextureSize(64, 32);
        this.foot2.mirror = true;
        setRotation(foot2, 0.0F);
        this.gobbler = new ModelRenderer(this, 38, 10);
        this.gobbler.addBox(-0.5F, -1.0F, -2.5F, 1, 5, 1);
        this.gobbler.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.gobbler.setTextureSize(64, 32);
        this.gobbler.mirror = true;
        setRotation(gobbler, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        float newangle2;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.15f * f1;
            newangle2 = MathHelper.cos(f2 * 2.6f * this.wingspeed) * 3.1415927f * 0.1f * f1;
        }
        else {
            newangle2 = (newangle = 0.0f);
        }
        final ModelRenderer leg1 = this.leg1;
        final ModelRenderer foot2 = this.foot2;
        final float n = newangle;
        foot2.rotateAngleX = n;
        leg1.rotateAngleX = n;
        final ModelRenderer leg2 = this.leg2;
        final ModelRenderer foot3 = this.foot1;
        final float n2 = -newangle;
        foot3.rotateAngleX = n2;
        leg2.rotateAngleX = n2;
        this.neck.rotateAngleX = -2.827f + newangle2;
        this.gobbler.rotateAngleX = newangle2;
        final ModelRenderer head = this.head;
        final ModelRenderer crest = this.crest;
        final ModelRenderer beak = this.beak;
        final float rotationPointZ = this.neck.rotationPointZ + MathHelper.sin(this.neck.rotateAngleX) * 7.0f;
        beak.rotationPointZ = rotationPointZ;
        crest.rotationPointZ = rotationPointZ;
        head.rotationPointZ = rotationPointZ;
        final ModelRenderer head2 = this.head;
        final ModelRenderer crest2 = this.crest;
        final ModelRenderer beak2 = this.beak;
        final float rotationPointY = this.neck.rotationPointY + MathHelper.cos(this.neck.rotateAngleX) * 7.0f;
        beak2.rotationPointY = rotationPointY;
        crest2.rotationPointY = rotationPointY;
        head2.rotationPointY = rotationPointY;
        this.tail.render(f5);
        this.body.render(f5);
        this.neck1.render(f5);
        this.neck.render(f5);
        this.head.render(f5);
        this.beak.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.crest.render(f5);
        this.foot1.render(f5);
        this.foot2.render(f5);
        this.gobbler.render(f5);
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
