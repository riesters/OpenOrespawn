package danger.orespawn;

import net.minecraft.client.model.*;

public class ModelChainsaw extends ModelBase
{
    ModelRenderer engine;
    ModelRenderer handle1;
    ModelRenderer handle2;
    ModelRenderer handle3;
    ModelRenderer muffler;
    ModelRenderer blade1;
    ModelRenderer blade2;
    ModelRenderer tooth;
    float toothpos;
    int toothdir;
    float toothpos1;
    int toothdir1;
    float toothpos2;
    int toothdir2;
    float toothpos3;
    int toothdir3;
    float toothpos4;
    int toothdir4;
    float toothpos5;
    int toothdir5;

    public ModelChainsaw() {
        this.toothpos = 0.0f;
        this.toothdir = 0;
        this.toothpos1 = 7.0f;
        this.toothdir1 = 0;
        this.toothpos2 = 14.0f;
        this.toothdir2 = 0;
        this.toothpos3 = 20.0f;
        this.toothdir3 = 1;
        this.toothpos4 = 13.0f;
        this.toothdir4 = 1;
        this.toothpos5 = 6.0f;
        this.toothdir5 = 1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.engine = new ModelRenderer(this, 0, 19);
        this.engine.addBox(-2.0F, -4.0F, -4.0F, 4, 7, 8);
        this.engine.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.engine.setTextureSize(64, 64);
        this.engine.mirror = true;
        setRotation(engine, 0.0F);
        this.handle1 = new ModelRenderer(this, 49, 0);
        this.handle1.addBox(0.0F, -3.0F, 3.0F, 1, 1, 5);
        this.handle1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle1.setTextureSize(64, 64);
        this.handle1.mirror = true;
        setRotation(handle1, -0.1919862F);
        this.handle2 = new ModelRenderer(this, 50, 13);
        this.handle2.addBox(0.0F, 2.0F, 4.0F, 1, 1, 4);
        this.handle2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle2.setTextureSize(64, 64);
        this.handle2.mirror = true;
        setRotation(handle2, 0.0F);
        this.handle3 = new ModelRenderer(this, 52, 7);
        this.handle3.addBox(0.0F, -2.0F, 7.0F, 1, 4, 1);
        this.handle3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle3.setTextureSize(64, 64);
        this.handle3.mirror = true;
        setRotation(handle3, -0.0872665F);
        this.muffler = new ModelRenderer(this, 14, 0);
        this.muffler.addBox(-3.0F, 0.0F, 1.0F, 1, 3, 3);
        this.muffler.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.muffler.setTextureSize(64, 64);
        this.muffler.mirror = true;
        setRotation(muffler, 0.0F);
        this.blade1 = new ModelRenderer(this, 0, 35);
        this.blade1.addBox(0.0F, -2.0F, -28.0F, 1, 4, 24);
        this.blade1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.blade1.setTextureSize(64, 64);
        this.blade1.mirror = true;
        setRotation(blade1, 0.0F);
        this.blade2 = new ModelRenderer(this, 0, 8);
        this.blade2.addBox(0.0F, -2.5F, -2.5F, 1, 5, 5);
        this.blade2.setRotationPoint(0.0F, 0.0F, -28.0F);
        this.blade2.setTextureSize(64, 64);
        this.blade2.mirror = true;
        setRotation(blade2, 0.0F);
        this.tooth = new ModelRenderer(this, 0, 0);
        this.tooth.addBox(0.0F, -1.0F, -0.5F, 1, 1, 1);
        this.tooth.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.tooth.setTextureSize(64, 64);
        this.tooth.mirror = true;
        setRotation(tooth, 0.0F);
    }

    public void render() {
        final float f5 = 1.0f;
        this.renderTooth();
        this.renderTooth1();
        this.renderTooth2();
        this.renderTooth3();
        this.renderTooth4();
        this.renderTooth5();
        final ModelRenderer blade2 = this.blade2;
        blade2.rotateAngleX += (float)0.10471975511965977;
        if (this.blade2.rotateAngleX > 6.283185307179586) {
            this.blade2.rotateAngleX = 0.0f;
        }
        this.engine.render(f5);
        this.handle1.render(f5);
        this.handle2.render(f5);
        this.handle3.render(f5);
        this.muffler.render(f5);
        this.blade1.render(f5);
        this.blade2.render(f5);
    }

    private void setRotation(final ModelRenderer model, final float x) {
        model.rotateAngleX = x;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }

    private void renderTooth() {
        if (this.toothdir == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos;
            this.toothpos += 0.5f;
            if (this.toothpos > 21.0f) {
                this.toothpos = 21.0f;
                this.toothdir = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos;
            this.toothpos -= 0.5f;
            if (this.toothpos < 0.0f) {
                this.toothpos = 0.0f;
                this.toothdir = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }

    private void renderTooth1() {
        if (this.toothdir1 == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos1;
            this.toothpos1 += 0.5f;
            if (this.toothpos1 > 21.0f) {
                this.toothpos1 = 21.0f;
                this.toothdir1 = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos1;
            this.toothpos1 -= 0.5f;
            if (this.toothpos1 < 0.0f) {
                this.toothpos1 = 0.0f;
                this.toothdir1 = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }

    private void renderTooth2() {
        if (this.toothdir2 == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos2;
            this.toothpos2 += 0.5f;
            if (this.toothpos2 > 21.0f) {
                this.toothpos2 = 21.0f;
                this.toothdir2 = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos2;
            this.toothpos2 -= 0.5f;
            if (this.toothpos2 < 0.0f) {
                this.toothpos2 = 0.0f;
                this.toothdir2 = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }

    private void renderTooth3() {
        if (this.toothdir3 == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos3;
            this.toothpos3 += 0.5f;
            if (this.toothpos3 > 21.0f) {
                this.toothpos3 = 21.0f;
                this.toothdir3 = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos3;
            this.toothpos3 -= 0.5f;
            if (this.toothpos3 < 0.0f) {
                this.toothpos3 = 0.0f;
                this.toothdir3 = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }

    private void renderTooth4() {
        if (this.toothdir4 == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos4;
            this.toothpos4 += 0.5f;
            if (this.toothpos4 > 21.0f) {
                this.toothpos4 = 21.0f;
                this.toothdir4 = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos4;
            this.toothpos4 -= 0.5f;
            if (this.toothpos4 < 0.0f) {
                this.toothpos4 = 0.0f;
                this.toothdir4 = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }

    private void renderTooth5() {
        if (this.toothdir5 == 0) {
            this.tooth.rotationPointY = -2.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos5;
            this.toothpos5 += 0.5f;
            if (this.toothpos5 > 21.0f) {
                this.toothpos5 = 21.0f;
                this.toothdir5 = 1;
            }
        }
        else {
            this.tooth.rotationPointY = 3.0f;
            this.tooth.rotationPointZ = -5.0f - this.toothpos5;
            this.toothpos5 -= 0.5f;
            if (this.toothpos5 < 0.0f) {
                this.toothpos5 = 0.0f;
                this.toothdir5 = 0;
            }
        }
        this.tooth.render((float) 1.0);
    }
}
