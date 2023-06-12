package danger.orespawn.entity.model;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import danger.orespawn.entity.*;

public class ModelWormDoom extends ModelBase
{
    ModelRenderer head1;
    ModelRenderer tooth1;
    ModelRenderer tooth2;
    ModelRenderer tooth3;
    ModelRenderer tooth4;
    ModelRenderer tooth5;
    ModelRenderer tooth6;
    ModelRenderer tooth7;
    ModelRenderer tooth8;
    ModelRenderer head2;
    ModelRenderer body1;
    ModelRenderer body2;
    float worm_scale;
    
    public ModelWormDoom() {
        this.worm_scale = 2.0f;
        this.textureWidth = 64;
        this.textureHeight = 256;
        (this.head1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-8.0f, -8.0f, -6.0f, 16, 16, 12);
        this.head1.setRotationPoint(0.0f, 12.0f, 0.0f);
        this.head1.setTextureSize(64, 256);
        this.head1.mirror = true;
        this.setRotation(this.head1, 0.0f, 0.0f, 0.0f);
        (this.tooth1 = new ModelRenderer((ModelBase)this, 0, 220)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth1.setRotationPoint(0.0f, 21.0f, -6.0f);
        this.tooth1.setTextureSize(64, 256);
        this.tooth1.mirror = true;
        this.setRotation(this.tooth1, 0.0f, 0.0f, 0.0f);
        (this.tooth2 = new ModelRenderer((ModelBase)this, 0, 210)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth2.setRotationPoint(0.0f, 3.0f, -6.0f);
        this.tooth2.setTextureSize(64, 256);
        this.tooth2.mirror = true;
        this.setRotation(this.tooth2, 0.0f, 0.0f, 0.0f);
        (this.tooth3 = new ModelRenderer((ModelBase)this, 0, 200)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth3.setRotationPoint(9.0f, 12.0f, -6.0f);
        this.tooth3.setTextureSize(64, 256);
        this.tooth3.mirror = true;
        this.setRotation(this.tooth3, 0.0f, 0.0f, 0.0f);
        (this.tooth4 = new ModelRenderer((ModelBase)this, 0, 190)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth4.setRotationPoint(-9.0f, 12.0f, -6.0f);
        this.tooth4.setTextureSize(64, 256);
        this.tooth4.mirror = true;
        this.setRotation(this.tooth4, 0.0f, 0.0f, 0.0f);
        (this.tooth5 = new ModelRenderer((ModelBase)this, 0, 180)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth5.setRotationPoint(-6.0f, 6.0f, -6.0f);
        this.tooth5.setTextureSize(64, 256);
        this.tooth5.mirror = true;
        this.setRotation(this.tooth5, 0.0f, 0.0f, 0.0f);
        (this.tooth6 = new ModelRenderer((ModelBase)this, 0, 170)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth6.setRotationPoint(6.0f, 18.0f, -6.0f);
        this.tooth6.setTextureSize(64, 256);
        this.tooth6.mirror = true;
        this.setRotation(this.tooth6, 0.0f, 0.0f, 0.0f);
        (this.tooth7 = new ModelRenderer((ModelBase)this, 0, 160)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth7.setRotationPoint(6.0f, 6.0f, -6.0f);
        this.tooth7.setTextureSize(64, 256);
        this.tooth7.mirror = true;
        this.setRotation(this.tooth7, 0.0f, 0.0f, 0.0f);
        (this.tooth8 = new ModelRenderer((ModelBase)this, 0, 150)).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7);
        this.tooth8.setRotationPoint(-6.0f, 18.0f, -6.0f);
        this.tooth8.setTextureSize(64, 256);
        this.tooth8.mirror = true;
        this.setRotation(this.tooth8, 0.0f, 0.0f, 0.0f);
        (this.head2 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-8.0f, -8.0f, -6.0f, 16, 16, 12);
        this.head2.setRotationPoint(0.0f, 12.0f, 0.0f);
        this.head2.setTextureSize(64, 256);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0f, 0.0f, 0.7853982f);
        (this.body1 = new ModelRenderer((ModelBase)this, 0, 82)).addBox(-8.0f, -8.0f, -6.0f, 16, 16, 12);
        this.body1.setRotationPoint(0.0f, 12.0f, 4.0f);
        this.body1.setTextureSize(64, 256);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0f, 0.0f, 0.0f);
        (this.body2 = new ModelRenderer((ModelBase)this, 0, 114)).addBox(-8.0f, -8.0f, -6.0f, 16, 16, 12);
        this.body2.setRotationPoint(0.0f, 12.0f, 4.0f);
        this.body2.setTextureSize(64, 256);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0f, 0.0f, 0.7853982f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float scale) {
        GL11.glPushMatrix();
        if (!entity.world.isRemote) {
            return;
        }
        if (!(entity instanceof WormDoom)) {
            return;
        }
        final WormDoom dw = (WormDoom)entity;
        float newangle = 0.0f;
        final float newangle2 = 0.0f;
        double dist = 32.0;
        dist = 6.0;
        final double d1 = (float)(Math.cos(newangle) * dist);
        final double d2 = (float)(Math.sin(newangle) * dist);
        this.tooth1.rotationPointZ = (float)(this.head1.rotationPointZ - d1);
        final double d3 = (float)(Math.sin(newangle2) * d1);
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
        newangle = (float)Math.cos(Math.toRadians(f * 5.7f)) * 3.1415927f * 0.35f;
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
        GL11.glPushMatrix();
        GL11.glScalef(this.worm_scale, this.worm_scale, this.worm_scale);
        GL11.glRotatef(dw.rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(dw.rotationPitch, 1.0f, 0.0f, 0.0f);
        this.head1.render(scale);
        this.head2.render(scale);
        this.tooth1.render(scale);
        this.tooth2.render(scale);
        this.tooth3.render(scale);
        this.tooth4.render(scale);
        this.tooth5.render(scale);
        this.tooth6.render(scale);
        this.tooth7.render(scale);
        this.tooth8.render(scale);
        GL11.glPopMatrix();
        for (int i = 0; i < 100; ++i) {
            final double dx = dw.lposx[0] - dw.lposx[i];
            final double dy = dw.lposy[0] - dw.lposy[i];
            final double dz = dw.lposz[0] - dw.lposz[i];
            GL11.glPushMatrix();
            GL11.glTranslated(dx, dy, dz);
            if (dw.rotyaw[i] != 0.0) {
                GL11.glRotated(dw.rotyaw[i], 0.0, 1.0, 0.0);
            }
            if (dw.rotpitch[i] != 0.0) {
                GL11.glRotated(dw.rotpitch[i], 1.0, 0.0, 0.0);
            }
            double scale2 = 1.0;
            if (i > 25) {
                scale2 = (75.0 - (i - 25)) / 75.0;
            }
            scale2 *= 2.0 - Math.cos(Math.toRadians(i * 3));
            if (scale2 < 0.009999999776482582) {
                scale2 = 0.009999999776482582;
            }
            GL11.glScaled(scale2 * this.worm_scale, scale2 * this.worm_scale, (double)(1.5f * this.worm_scale));
            this.body1.render(scale);
            this.body2.render(scale);
            if (i > 75) {
                GL11.glTranslatef(0.0f, 1.0f / this.worm_scale, 0.0f);
                this.body1.render(scale);
                this.body2.render(scale);
            }
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
