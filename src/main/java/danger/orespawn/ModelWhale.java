package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelWhale extends ModelBase
{
    ModelRenderer belly;
    ModelRenderer body;
    ModelRenderer back;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tailfin1;
    ModelRenderer tailfin2;
    ModelRenderer backfin;
    ModelRenderer head;
    ModelRenderer jaw;
    ModelRenderer lfin1;
    ModelRenderer lfin2;
    ModelRenderer rfin1;
    ModelRenderer rfin2;
    
    public ModelWhale() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.belly = new ModelRenderer(this, 0, 92);
        this.belly.addBox(-6.0F, 0.0F, 0.0F, 12, 2, 32);
        this.belly.setRotationPoint(0.0F, 22.0F, 6.0F);
        this.belly.setTextureSize(256, 256);
        this.belly.mirror = true;
        setRotation(belly, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 188);
        this.body.addBox(-10.0F, 0.0F, 0.0F, 20, 12, 52);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.setTextureSize(256, 256);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F);
        this.back = new ModelRenderer(this, 0, 45);
        this.back.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 40);
        this.back.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.back.setTextureSize(256, 256);
        this.back.mirror = true;
        setRotation(back, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 186, 0);
        this.tail1.addBox(-6.0F, 0.0F, 0.0F, 12, 7, 14);
        this.tail1.setRotationPoint(0.0F, 11.0F, 52.0F);
        this.tail1.setTextureSize(256, 256);
        this.tail1.mirror = true;
        setRotation(tail1, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 186, 24);
        this.tail2.addBox(-4.0F, 0.0F, 0.0F, 8, 5, 10);
        this.tail2.setRotationPoint(0.0F, 12.0F, 66.0F);
        this.tail2.setTextureSize(256, 256);
        this.tail2.mirror = true;
        setRotation(tail2, 0.0F, 0.0F);
        this.tailfin1 = new ModelRenderer(this, 186, 43);
        this.tailfin1.addBox(0.0F, 0.0F, 0.0F, 17, 2, 11);
        this.tailfin1.setRotationPoint(2.0F, 13.0F, 74.0F);
        this.tailfin1.setTextureSize(256, 256);
        this.tailfin1.mirror = true;
        setRotation(tailfin1, 0.0872665F, -0.0872665F);
        this.tailfin2 = new ModelRenderer(this, 186, 59);
        this.tailfin2.addBox(-17.0F, 0.0F, 0.0F, 17, 2, 11);
        this.tailfin2.setRotationPoint(-2.0F, 13.0F, 74.0F);
        this.tailfin2.setTextureSize(256, 256);
        this.tailfin2.mirror = true;
        setRotation(tailfin2, 0.0872665F, 0.0872665F);
        this.backfin = new ModelRenderer(this, 0, 15);
        this.backfin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 8);
        this.backfin.setRotationPoint(0.0F, 8.0F, 11.0F);
        this.backfin.setTextureSize(256, 256);
        this.backfin.mirror = true;
        setRotation(backfin, 0.3665191F, 0.0F);
        this.head = new ModelRenderer(this, 0, 155);
        this.head.addBox(-8.0F, 0.0F, -16.0F, 16, 8, 22);
        this.head.setRotationPoint(0.0F, 11.0F, -6.0F);
        this.head.setTextureSize(256, 256);
        this.head.mirror = true;
        setRotation(head, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 0, 130);
        this.jaw.addBox(-7.0F, -1.0F, -20.0F, 14, 2, 20);
        this.jaw.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.jaw.setTextureSize(256, 256);
        this.jaw.mirror = true;
        setRotation(jaw, 0.0698132F, 0.0F);
        this.lfin1 = new ModelRenderer(this, 96, 0);
        this.lfin1.addBox(0.0F, -1.0F, -3.0F, 4, 3, 6);
        this.lfin1.setRotationPoint(10.0F, 18.0F, 8.0F);
        this.lfin1.setTextureSize(256, 256);
        this.lfin1.mirror = true;
        setRotation(lfin1, 0.0F, -0.0872665F);
        this.lfin2 = new ModelRenderer(this, 120, 0);
        this.lfin2.addBox(2.0F, -0.5F, -3.0F, 22, 2, 8);
        this.lfin2.setRotationPoint(10.0F, 18.0F, 8.0F);
        this.lfin2.setTextureSize(256, 256);
        this.lfin2.mirror = true;
        setRotation(lfin2, 0.0F, -0.0872665F);
        this.rfin1 = new ModelRenderer(this, 96, 12);
        this.rfin1.addBox(-4.0F, -1.0F, -3.0F, 4, 3, 6);
        this.rfin1.setRotationPoint(-10.0F, 18.0F, 8.0F);
        this.rfin1.setTextureSize(256, 256);
        this.rfin1.mirror = true;
        setRotation(rfin1, 0.0F, 0.0872665F);
        this.rfin2 = new ModelRenderer(this, 120, 13);
        this.rfin2.addBox(-24.0F, -0.5F, -3.0F, 22, 2, 8);
        this.rfin2.setRotationPoint(-10.0F, 18.0F, 8.0F);
        this.rfin2.setTextureSize(256, 256);
        this.rfin2.mirror = true;
        setRotation(rfin2, 0.0F, 0.0872665F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 0.3f) * 3.1415927f * 0.2f * f1;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.08f) * 3.1415927f * 0.05f;
        }
        this.lfin2.rotateAngleZ = 0.436f + newangle;
        this.lfin1.rotateAngleZ = this.lfin2.rotateAngleZ / 2.0f;
        this.rfin2.rotateAngleZ = -0.436f - newangle;
        this.rfin1.rotateAngleZ = this.rfin2.rotateAngleZ / 2.0f;
        newangle = MathHelper.cos(f2 * 0.03f) * 3.1415927f * 0.02f;
        this.jaw.rotateAngleX = 0.087f + newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 0.4f) * 3.1415927f * 0.16f * f1;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.05f) * 3.1415927f * 0.03f;
        }
        this.tail1.rotateAngleX = newangle * 0.5f;
        this.tail2.rotateAngleX = newangle * 1.25f;
        final ModelRenderer tailfin1 = this.tailfin1;
        final ModelRenderer tailfin2 = this.tailfin2;
        final float n = newangle * 2.25f;
        tailfin2.rotateAngleX = n;
        tailfin1.rotateAngleX = n;
        this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float)Math.cos(this.tail1.rotateAngleX) * 14.0f;
        this.tail2.rotationPointY = this.tail1.rotationPointY - (float)Math.sin(this.tail1.rotateAngleX) * 14.0f;
        final ModelRenderer tailfin3 = this.tailfin1;
        final ModelRenderer tailfin4 = this.tailfin2;
        final float n2 = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleX) * 8.0f;
        tailfin4.rotationPointZ = n2;
        tailfin3.rotationPointZ = n2;
        final ModelRenderer tailfin5 = this.tailfin1;
        final ModelRenderer tailfin6 = this.tailfin2;
        final float n3 = this.tail2.rotationPointY - (float)Math.sin(this.tail2.rotateAngleX) * 8.0f;
        tailfin6.rotationPointY = n3;
        tailfin5.rotationPointY = n3;
        this.belly.render(f5);
        this.body.render(f5);
        this.back.render(f5);
        this.tail1.render(f5);
        this.tail2.render(f5);
        this.tailfin1.render(f5);
        this.tailfin2.render(f5);
        this.backfin.render(f5);
        this.head.render(f5);
        this.jaw.render(f5);
        this.lfin1.render(f5);
        this.lfin2.render(f5);
        this.rfin1.render(f5);
        this.rfin2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
