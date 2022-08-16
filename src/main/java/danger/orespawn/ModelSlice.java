package danger.orespawn;

import net.minecraft.client.model.*;

public class ModelSlice extends ModelBase
{
    ModelRenderer Grip;
    ModelRenderer Blade1;
    ModelRenderer Handguard2;
    ModelRenderer Handguard1;
    ModelRenderer hg2;
    ModelRenderer hg4;
    ModelRenderer hg3;
    ModelRenderer hg1;
    ModelRenderer BaseGrip;
    ModelRenderer Bottom;
    ModelRenderer Blade2;
    ModelRenderer Blade3;
    ModelRenderer Blade4;
    ModelRenderer Shape1;
    
    public ModelSlice() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.Grip = new ModelRenderer(this, 0, 0);
        this.Grip.addBox(0.0F, -6.0F, 0.0F, 1, 12, 1);
        this.Grip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Grip.setTextureSize(64, 128);
        this.Grip.mirror = true;
        setRotation(Grip, 0.0F);
        this.Blade1 = new ModelRenderer(this, 6, 49);
        this.Blade1.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
        this.Blade1.setRotationPoint(0.5F, 0.0F, -2.3F);
        this.Blade1.setTextureSize(64, 128);
        this.Blade1.mirror = true;
        setRotation(Blade1, 0.3490659F);
        this.Handguard2 = new ModelRenderer(this, 16, 0);
        this.Handguard2.addBox(0.0F, -7.0F, -4.0F, 1, 1, 9);
        this.Handguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handguard2.setTextureSize(64, 128);
        this.Handguard2.mirror = true;
        setRotation(Handguard2, 0.0F);
        this.Handguard1 = new ModelRenderer(this, 18, 12);
        this.Handguard1.addBox(-3.0F, -7.0F, 0.0F, 7, 1, 1);
        this.Handguard1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handguard1.setTextureSize(64, 128);
        this.Handguard1.mirror = true;
        setRotation(Handguard1, 0.0F);
        this.hg2 = new ModelRenderer(this, 0, 15);
        this.hg2.addBox(0.0F, -9.0F, -7.0F, 1, 3, 3);
        this.hg2.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.hg2.setTextureSize(64, 128);
        this.hg2.mirror = true;
        setRotation(hg2, 0.0F);
        this.hg4 = new ModelRenderer(this, 0, 22);
        this.hg4.addBox(0.0F, -9.0F, 5.0F, 1, 3, 3);
        this.hg4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.hg4.setTextureSize(64, 128);
        this.hg4.mirror = true;
        setRotation(hg4, 0.0F);
        this.hg3 = new ModelRenderer(this, 0, 29);
        this.hg3.addBox(-4.0F, -9.0F, 0.0F, 3, 3, 1);
        this.hg3.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.hg3.setTextureSize(64, 128);
        this.hg3.mirror = true;
        setRotation(hg3, 0.0F);
        this.hg1 = new ModelRenderer(this, 0, 34);
        this.hg1.addBox(4.0F, -9.0F, 0.0F, 3, 3, 1);
        this.hg1.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.hg1.setTextureSize(64, 128);
        this.hg1.mirror = true;
        setRotation(hg1, 0.0F);
        this.BaseGrip = new ModelRenderer(this, 0, 39);
        this.BaseGrip.addBox(-1.0F, 5.0F, -1.0F, 3, 1, 3);
        this.BaseGrip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BaseGrip.setTextureSize(64, 128);
        this.BaseGrip.mirror = true;
        setRotation(BaseGrip, 0.0F);
        this.Bottom = new ModelRenderer(this, 0, 45);
        this.Bottom.addBox(0.0F, 6.0F, 0.0F, 1, 1, 1);
        this.Bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bottom.setTextureSize(64, 128);
        this.Bottom.mirror = true;
        setRotation(Bottom, 0.0F);
        this.Blade2 = new ModelRenderer(this, 24, 49);
        this.Blade2.addBox(-1.0F, -41.0F, 0.0F, 1, 34, 3);
        this.Blade2.setRotationPoint(0.5F, 0.0F, -2.3F);
        this.Blade2.setTextureSize(64, 128);
        this.Blade2.mirror = true;
        setRotation(Blade2, -0.3490659F);
        this.Blade3 = new ModelRenderer(this, 15, 49);
        this.Blade3.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
        this.Blade3.setRotationPoint(1.5F, 0.0F, 0.4F);
        this.Blade3.setTextureSize(64, 128);
        this.Blade3.mirror = true;
        setRotation(Blade3, -0.3490659F);
        this.Blade4 = new ModelRenderer(this, 33, 49);
        this.Blade4.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
        this.Blade4.setRotationPoint(-1.5F, 0.0F, 0.7F);
        this.Blade4.setTextureSize(64, 128);
        this.Blade4.mirror = true;
        setRotation(Blade4, 0.3490659F);
        this.Shape1 = new ModelRenderer(this, 6, 0);
        this.Shape1.addBox(0.0F, -6.0F, 0.0F, 1, 6, 3);
        this.Shape1.setRotationPoint(0.5F, -40.0F, -1.0F);
        this.Shape1.setTextureSize(64, 128);
        this.Shape1.mirror = true;
        setRotation(Shape1, 0.0F);
    }
    
    public void render() {
        final float f5 = 1.0f;
        this.Grip.render(f5);
        this.Blade1.render(f5);
        this.Handguard2.render(f5);
        this.Handguard1.render(f5);
        this.hg2.render(f5);
        this.hg4.render(f5);
        this.hg3.render(f5);
        this.hg1.render(f5);
        this.BaseGrip.render(f5);
        this.Bottom.render(f5);
        this.Blade2.render(f5);
        this.Blade3.render(f5);
        this.Blade4.render(f5);
        this.Shape1.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float y) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = y;
        model.rotateAngleZ = (float) 0.0;
    }
}
