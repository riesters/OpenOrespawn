package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelWormLarge extends ModelBase
{
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer neck1;
    ModelRenderer neck4;
    ModelRenderer neck5;
    ModelRenderer neck2;
    ModelRenderer neck3;
    ModelRenderer tail1;
    ModelRenderer tailtip;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tooth1;
    ModelRenderer tooth2;
    ModelRenderer tooth3;
    ModelRenderer tooth4;
    ModelRenderer tooth5;
    ModelRenderer tooth6;
    ModelRenderer tooth7;
    ModelRenderer tooth8;
    
    public ModelWormLarge() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.head1 = new ModelRenderer(this, 0, 0);
        this.head1.addBox(-8.0F, -8.0F, -20.0F, 16, 16, 20);
        this.head1.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.head1.setTextureSize(256, 256);
        this.head1.mirror = true;
        setRotation(head1, 0.0F);
        this.head2 = new ModelRenderer(this, 83, 27);
        this.head2.addBox(8.0F, -3.0F, -20.0F, 3, 6, 19);
        this.head2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.head2.setTextureSize(256, 256);
        this.head2.mirror = true;
        setRotation(head2, 0.0F);
        this.head3 = new ModelRenderer(this, 9, 65);
        this.head3.addBox(-11.0F, -3.0F, -20.0F, 3, 6, 19);
        this.head3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.head3.setTextureSize(256, 256);
        this.head3.mirror = true;
        setRotation(head3, 0.0F);
        this.head4 = new ModelRenderer(this, 77, 0);
        this.head4.addBox(-3.0F, -11.0F, -20.0F, 6, 3, 20);
        this.head4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.head4.setTextureSize(256, 256);
        this.head4.mirror = true;
        setRotation(head4, 0.0F);
        this.head5 = new ModelRenderer(this, 10, 39);
        this.head5.addBox(-3.0F, 8.0F, -20.0F, 6, 3, 20);
        this.head5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.head5.setTextureSize(256, 256);
        this.head5.mirror = true;
        setRotation(head5, 0.0F);
        this.neck1 = new ModelRenderer(this, 25, 94);
        this.neck1.addBox(-6.0F, -6.0F, -36.0F, 12, 12, 36);
        this.neck1.setRotationPoint(0.0F, 20.0F, 33.0F);
        this.neck1.setTextureSize(256, 256);
        this.neck1.mirror = true;
        setRotation(neck1, -0.6981317F);
        this.neck4 = new ModelRenderer(this, 25, 146);
        this.neck4.addBox(-2.0F, -8.0F, -38.0F, 4, 2, 38);
        this.neck4.setRotationPoint(0.0F, 20.0F, 33.0F);
        this.neck4.setTextureSize(256, 256);
        this.neck4.mirror = true;
        setRotation(neck4, -0.6981317F);
        this.neck5 = new ModelRenderer(this, 125, 189);
        this.neck5.addBox(-2.0F, 6.0F, -31.0F, 4, 2, 31);
        this.neck5.setRotationPoint(0.0F, 20.0F, 33.0F);
        this.neck5.setTextureSize(256, 256);
        this.neck5.mirror = true;
        setRotation(neck5, -0.6981317F);
        this.neck2 = new ModelRenderer(this, 25, 189);
        this.neck2.addBox(6.0F, -2.0F, -34.0F, 2, 4, 34);
        this.neck2.setRotationPoint(0.0F, 20.0F, 33.0F);
        this.neck2.setTextureSize(256, 256);
        this.neck2.mirror = true;
        setRotation(neck2, -0.6981317F);
        this.neck3 = new ModelRenderer(this, 125, 147);
        this.neck3.addBox(-8.0F, -2.0F, -34.0F, 2, 4, 34);
        this.neck3.setRotationPoint(0.0F, 20.0F, 33.0F);
        this.neck3.setTextureSize(256, 256);
        this.neck3.mirror = true;
        setRotation(neck3, -0.6981317F);
        this.tail1 = new ModelRenderer(this, 145, 21);
        this.tail1.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 24);
        this.tail1.setRotationPoint(0.0F, 20.0F, 29.0F);
        this.tail1.setTextureSize(256, 256);
        this.tail1.mirror = true;
        setRotation(tail1, 0.0F);
        this.tailtip = new ModelRenderer(this, 180, 0);
        this.tailtip.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 12);
        this.tailtip.setRotationPoint(0.0F, 19.5F, 52.0F);
        this.tailtip.setTextureSize(256, 256);
        this.tailtip.mirror = true;
        setRotation(tailtip, 0.3490659F);
        this.tail2 = new ModelRenderer(this, 145, 56);
        this.tail2.addBox(4.0F, -1.0F, 2.0F, 1, 2, 14);
        this.tail2.setRotationPoint(0.0F, 20.0F, 29.0F);
        this.tail2.setTextureSize(256, 256);
        this.tail2.mirror = true;
        setRotation(tail2, 0.0F);
        this.tail3 = new ModelRenderer(this, 145, 90);
        this.tail3.addBox(-5.0F, -1.0F, 2.0F, 1, 2, 14);
        this.tail3.setRotationPoint(0.0F, 20.0F, 29.0F);
        this.tail3.setTextureSize(256, 256);
        this.tail3.mirror = true;
        setRotation(tail3, 0.0F);
        this.tail4 = new ModelRenderer(this, 145, 76);
        this.tail4.addBox(-1.0F, -5.0F, 7.0F, 2, 1, 9);
        this.tail4.setRotationPoint(0.0F, 20.0F, 29.0F);
        this.tail4.setTextureSize(256, 256);
        this.tail4.mirror = true;
        setRotation(tail4, 0.0F);
        this.tooth1 = new ModelRenderer(this, 0, 220);
        this.tooth1.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth1.setRotationPoint(0.0F, 9.0F, -10.0F);
        this.tooth1.setTextureSize(256, 256);
        this.tooth1.mirror = true;
        setRotation(tooth1, 0.0F);
        this.tooth2 = new ModelRenderer(this, 0, 210);
        this.tooth2.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth2.setRotationPoint(0.0F, -9.0F, -10.0F);
        this.tooth2.setTextureSize(256, 256);
        this.tooth2.mirror = true;
        setRotation(tooth2, 0.0F);
        this.tooth3 = new ModelRenderer(this, 0, 200);
        this.tooth3.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth3.setRotationPoint(9.0F, 0.0F, -10.0F);
        this.tooth3.setTextureSize(256, 256);
        this.tooth3.mirror = true;
        setRotation(tooth3, 0.0F);
        this.tooth4 = new ModelRenderer(this, 0, 190);
        this.tooth4.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth4.setRotationPoint(-9.0F, 0.0F, -10.0F);
        this.tooth4.setTextureSize(256, 256);
        this.tooth4.mirror = true;
        setRotation(tooth4, 0.0F);
        this.tooth5 = new ModelRenderer(this, 0, 180);
        this.tooth5.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth5.setRotationPoint(-6.0F, -6.0F, -10.0F);
        this.tooth5.setTextureSize(256, 256);
        this.tooth5.mirror = true;
        setRotation(tooth5, 0.0F);
        this.tooth6 = new ModelRenderer(this, 0, 170);
        this.tooth6.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth6.setRotationPoint(6.0F, 6.0F, -10.0F);
        this.tooth6.setTextureSize(256, 256);
        this.tooth6.mirror = true;
        setRotation(tooth6, 0.0F);
        this.tooth7 = new ModelRenderer(this, 0, 160);
        this.tooth7.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth7.setRotationPoint(6.0F, -6.0F, -10.0F);
        this.tooth7.setTextureSize(256, 256);
        this.tooth7.mirror = true;
        setRotation(tooth7, 0.0F);
        this.tooth8 = new ModelRenderer(this, 0, 150);
        this.tooth8.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
        this.tooth8.setRotationPoint(-6.0F, 6.0F, -10.0F);
        this.tooth8.setTextureSize(256, 256);
        this.tooth8.mirror = true;
        setRotation(tooth8, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        double dist = 32.0;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle = MathHelper.cos(f2 * 0.25f) * 3.1415927f * 0.08f;
        newangle -= 0.698f;
        this.neck1.rotateAngleX = newangle;
        float newangle2 = MathHelper.cos(f2 * 0.15f) * 3.1415927f * 0.07f;
        this.neck1.rotateAngleY = newangle2;
        final ModelRenderer neck2 = this.neck2;
        final ModelRenderer neck3 = this.neck3;
        final ModelRenderer neck4 = this.neck4;
        final ModelRenderer neck5 = this.neck5;
        final float rotateAngleX = this.neck1.rotateAngleX;
        neck5.rotateAngleX = rotateAngleX;
        neck4.rotateAngleX = rotateAngleX;
        neck3.rotateAngleX = rotateAngleX;
        neck2.rotateAngleX = rotateAngleX;
        final ModelRenderer neck6 = this.neck2;
        final ModelRenderer neck7 = this.neck3;
        final ModelRenderer neck8 = this.neck4;
        final ModelRenderer neck9 = this.neck5;
        final float rotateAngleY = this.neck1.rotateAngleY;
        neck9.rotateAngleY = rotateAngleY;
        neck8.rotateAngleY = rotateAngleY;
        neck7.rotateAngleY = rotateAngleY;
        neck6.rotateAngleY = rotateAngleY;
        double d1 = (float)(Math.cos(newangle) * dist);
        double d2 = (float)(Math.sin(newangle) * dist);
        this.head1.rotationPointZ = (float)(this.neck1.rotationPointZ - d1);
        double d3 = (float)(Math.sin(newangle2) * d1);
        this.head1.rotationPointX = (float)(this.neck1.rotationPointX - d3);
        this.head1.rotationPointY = (float)(this.neck1.rotationPointY + d2);
        newangle = (this.head1.rotateAngleX = MathHelper.cos(f2 * 0.35f) * 3.1415927f * 0.15f);
        newangle2 = (this.head1.rotateAngleY = MathHelper.cos(f2 * 0.45f) * 3.1415927f * 0.05f);
        final ModelRenderer head2 = this.head2;
        final ModelRenderer head3 = this.head3;
        final ModelRenderer head4 = this.head4;
        final ModelRenderer head5 = this.head5;
        final float rotationPointX = this.head1.rotationPointX;
        head5.rotationPointX = rotationPointX;
        head4.rotationPointX = rotationPointX;
        head3.rotationPointX = rotationPointX;
        head2.rotationPointX = rotationPointX;
        final ModelRenderer head6 = this.head2;
        final ModelRenderer head7 = this.head3;
        final ModelRenderer head8 = this.head4;
        final ModelRenderer head9 = this.head5;
        final float rotationPointY = this.head1.rotationPointY;
        head9.rotationPointY = rotationPointY;
        head8.rotationPointY = rotationPointY;
        head7.rotationPointY = rotationPointY;
        head6.rotationPointY = rotationPointY;
        final ModelRenderer head10 = this.head2;
        final ModelRenderer head11 = this.head3;
        final ModelRenderer head12 = this.head4;
        final ModelRenderer head13 = this.head5;
        final float rotationPointZ = this.head1.rotationPointZ;
        head13.rotationPointZ = rotationPointZ;
        head12.rotationPointZ = rotationPointZ;
        head11.rotationPointZ = rotationPointZ;
        head10.rotationPointZ = rotationPointZ;
        final ModelRenderer head14 = this.head2;
        final ModelRenderer head15 = this.head3;
        final ModelRenderer head16 = this.head4;
        final ModelRenderer head17 = this.head5;
        final float rotateAngleX2 = this.head1.rotateAngleX;
        head17.rotateAngleX = rotateAngleX2;
        head16.rotateAngleX = rotateAngleX2;
        head15.rotateAngleX = rotateAngleX2;
        head14.rotateAngleX = rotateAngleX2;
        final ModelRenderer head18 = this.head2;
        final ModelRenderer head19 = this.head3;
        final ModelRenderer head20 = this.head4;
        final ModelRenderer head21 = this.head5;
        final float rotateAngleY2 = this.head1.rotateAngleY;
        head21.rotateAngleY = rotateAngleY2;
        head20.rotateAngleY = rotateAngleY2;
        head19.rotateAngleY = rotateAngleY2;
        head18.rotateAngleY = rotateAngleY2;
        dist = 19.0;
        d1 = (float)(Math.cos(newangle) * dist);
        d2 = (float)(Math.sin(newangle) * dist);
        this.tooth1.rotationPointZ = (float)(this.head1.rotationPointZ - d1);
        d3 = (float)(Math.sin(newangle2) * d1);
        this.tooth1.rotationPointX = (float)(this.head1.rotationPointX - d3);
        this.tooth1.rotationPointY = (float)(this.head1.rotationPointY + d2 - 9.0);
        this.tooth2.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth2.rotationPointX = this.tooth1.rotationPointX;
        this.tooth2.rotationPointY = this.tooth1.rotationPointY + 18.0f;
        this.tooth3.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth3.rotationPointX = this.tooth1.rotationPointX + 9.0f;
        this.tooth3.rotationPointY = this.tooth1.rotationPointY + 9.0f;
        this.tooth4.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth4.rotationPointX = this.tooth1.rotationPointX - 9.0f;
        this.tooth4.rotationPointY = this.tooth1.rotationPointY + 9.0f;
        this.tooth5.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth5.rotationPointX = this.tooth1.rotationPointX - 6.0f;
        this.tooth5.rotationPointY = this.tooth1.rotationPointY + 9.0f - 6.0f;
        this.tooth6.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth6.rotationPointX = this.tooth1.rotationPointX + 6.0f;
        this.tooth6.rotationPointY = this.tooth1.rotationPointY + 9.0f + 6.0f;
        this.tooth7.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth7.rotationPointX = this.tooth1.rotationPointX + 6.0f;
        this.tooth7.rotationPointY = this.tooth1.rotationPointY + 9.0f - 6.0f;
        this.tooth8.rotationPointZ = this.tooth1.rotationPointZ;
        this.tooth8.rotationPointX = this.tooth1.rotationPointX - 6.0f;
        this.tooth8.rotationPointY = this.tooth1.rotationPointY + 9.0f + 6.0f;
        final ModelRenderer tooth1 = this.tooth1;
        tooth1.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleX) * 9.0);
        final ModelRenderer tooth2 = this.tooth2;
        tooth2.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleX) * 9.0);
        final ModelRenderer tooth3 = this.tooth3;
        tooth3.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleY) * 9.0);
        final ModelRenderer tooth4 = this.tooth4;
        tooth4.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleY) * 9.0);
        final ModelRenderer tooth5 = this.tooth7;
        tooth5.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleX) * 6.0);
        final ModelRenderer tooth6 = this.tooth7;
        tooth6.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleY) * 6.0);
        final ModelRenderer tooth7 = this.tooth6;
        tooth7.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleX) * 6.0);
        final ModelRenderer tooth8 = this.tooth6;
        tooth8.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleY) * 6.0);
        final ModelRenderer tooth9 = this.tooth5;
        tooth9.rotationPointZ -= (float)(Math.sin(this.head1.rotateAngleX) * 6.0);
        final ModelRenderer tooth10 = this.tooth5;
        tooth10.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleY) * 6.0);
        final ModelRenderer tooth11 = this.tooth8;
        tooth11.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleX) * 6.0);
        final ModelRenderer tooth12 = this.tooth8;
        tooth12.rotationPointZ += (float)(Math.sin(this.head1.rotateAngleY) * 6.0);
        newangle = MathHelper.cos(f2 * 0.57f) * 3.1415927f * 0.35f;
        this.tooth1.rotateAngleX = this.head1.rotateAngleX + newangle;
        this.tooth2.rotateAngleX = this.head1.rotateAngleX - newangle;
        this.tooth3.rotateAngleY = this.head1.rotateAngleY + newangle;
        this.tooth4.rotateAngleY = this.head1.rotateAngleY - newangle;
        this.tooth5.rotateAngleX = this.head1.rotateAngleX + newangle;
        this.tooth7.rotateAngleX = this.head1.rotateAngleX + newangle;
        this.tooth6.rotateAngleX = this.head1.rotateAngleX - newangle;
        this.tooth8.rotateAngleX = this.head1.rotateAngleX - newangle;
        this.tooth6.rotateAngleY = this.head1.rotateAngleY + newangle;
        this.tooth7.rotateAngleY = this.head1.rotateAngleY + newangle;
        this.tooth5.rotateAngleY = this.head1.rotateAngleY - newangle;
        this.tooth8.rotateAngleY = this.head1.rotateAngleY - newangle;
        newangle = MathHelper.cos(f2 * 0.63f) * 3.1415927f * 0.15f;
        this.tailtip.rotateAngleX = newangle + 0.35f;
        newangle = MathHelper.cos((float)(f2 * 0.63f + 1.57075)) * 3.1415927f * 0.15f;
        this.tailtip.rotateAngleY = newangle;
        this.head1.render(f5);
        this.head2.render(f5);
        this.head3.render(f5);
        this.head4.render(f5);
        this.head5.render(f5);
        this.neck1.render(f5);
        this.neck4.render(f5);
        this.neck5.render(f5);
        this.neck2.render(f5);
        this.neck3.render(f5);
        this.tail1.render(f5);
        this.tailtip.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.tooth1.render(f5);
        this.tooth2.render(f5);
        this.tooth3.render(f5);
        this.tooth4.render(f5);
        this.tooth5.render(f5);
        this.tooth6.render(f5);
        this.tooth7.render(f5);
        this.tooth8.render(f5);
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
