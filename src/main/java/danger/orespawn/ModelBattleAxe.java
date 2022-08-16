package danger.orespawn;

import net.minecraft.client.model.*;

public class ModelBattleAxe extends ModelBase
{
    ModelRenderer Handle1;
    ModelRenderer Head1;
    ModelRenderer Grip;
    ModelRenderer Pin;
    ModelRenderer Top;
    ModelRenderer Blade1;
    ModelRenderer Blade2;
    ModelRenderer Blade3;
    ModelRenderer Blade4;
    ModelRenderer Blade5;
    ModelRenderer Blade6;
    ModelRenderer Blade7;
    ModelRenderer Blade8;
    ModelRenderer Blade9;
    ModelRenderer Blade10;
    
    public ModelBattleAxe() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Handle1 = new ModelRenderer(this, 0, 0);
        this.Handle1.addBox(-7.0F, -0.5F, 0.0F, 31, 2, 1);
        this.Handle1.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Handle1.setTextureSize(128, 64);
        this.Handle1.mirror = true;
        setRotation(Handle1, 1.570796F);
        this.Head1 = new ModelRenderer(this, 29, 18);
        this.Head1.addBox(-2.0F, -4.5F, -0.5F, 3, 4, 2);
        this.Head1.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Head1.setTextureSize(128, 64);
        this.Head1.mirror = true;
        setRotation(Head1, 0.0F);
        this.Grip = new ModelRenderer(this, 0, 7);
        this.Grip.addBox(-1.92F, 13.0F, -0.5F, 3, 11, 2);
        this.Grip.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Grip.setTextureSize(128, 64);
        this.Grip.mirror = true;
        setRotation(Grip, 0.0F);
        this.Pin = new ModelRenderer(this, 38, 11);
        this.Pin.addBox(-1.0F, -3.0F, -1.0F, 1, 1, 3);
        this.Pin.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Pin.setTextureSize(128, 64);
        this.Pin.mirror = true;
        setRotation(Pin, 0.0F);
        this.Top = new ModelRenderer(this, 24, 11);
        this.Top.addBox(-2.0F, -8.0F, -0.5F, 3, 2, 2);
        this.Top.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Top.setTextureSize(128, 64);
        this.Top.mirror = true;
        setRotation(Top, 0.0F);
        this.Blade1 = new ModelRenderer(this, 70, 0);
        this.Blade1.addBox(6.0F, -8.0F, 0.0F, 3, 10, 1);
        this.Blade1.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade1.setTextureSize(128, 64);
        this.Blade1.mirror = true;
        setRotation(Blade1, 0.5061455F);
        this.Blade2 = new ModelRenderer(this, 70, 0);
        this.Blade2.addBox(8.5F, -6.9F, 0.0F, 3, 10, 1);
        this.Blade2.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade2.setTextureSize(128, 64);
        this.Blade2.mirror = true;
        setRotation(Blade2, -0.5061455F);
        this.Blade3 = new ModelRenderer(this, 0, 0);
        this.Blade3.addBox(-1.5F, -3.0F, 0.0F, 10, 1, 1);
        this.Blade3.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade3.setTextureSize(128, 64);
        this.Blade3.mirror = true;
        setRotation(Blade3, 0.0F);
        this.Blade4 = new ModelRenderer(this, 0, 0);
        this.Blade4.addBox(-1.0F, -2.0F, 0.0F, 7, 1, 1);
        this.Blade4.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade4.setTextureSize(128, 64);
        this.Blade4.mirror = true;
        setRotation(Blade4, 0.5061455F);
        this.Blade5 = new ModelRenderer(this, 0, 0);
        this.Blade5.addBox(0.5F, -3.5F, 0.0F, 8, 1, 1);
        this.Blade5.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade5.setTextureSize(128, 64);
        this.Blade5.mirror = true;
        setRotation(Blade5, -0.5061455F);
        this.Blade6 = new ModelRenderer(this, 70, 0);
        this.Blade6.addBox(-12.2F, -5.2F, 0.0F, 3, 10, 1);
        this.Blade6.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.Blade6.setTextureSize(128, 64);
        this.Blade6.mirror = true;
        setRotation(Blade6, 0.5061455F);
        this.Blade7 = new ModelRenderer(this, 0, 0);
        this.Blade7.addBox(-9.9F, -3.0F, 0.0F, 8, 1, 1);
        this.Blade7.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade7.setTextureSize(128, 64);
        this.Blade7.mirror = true;
        setRotation(Blade7, 0.5061455F);
        this.Blade8 = new ModelRenderer(this, 0, 0);
        this.Blade8.addBox(-10.0F, -3.0F, 0.0F, 10, 1, 1);
        this.Blade8.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade8.setTextureSize(128, 64);
        this.Blade8.mirror = true;
        setRotation(Blade8, 0.0F);
        this.Blade9 = new ModelRenderer(this, 70, 0);
        this.Blade9.addBox(-10.0F, -8.5F, 0.0F, 3, 10, 1);
        this.Blade9.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade9.setTextureSize(128, 64);
        this.Blade9.mirror = true;
        setRotation(Blade9, -0.5061455F);
        this.Blade10 = new ModelRenderer(this, 0, 0);
        this.Blade10.addBox(-7.0F, -2.5F, 0.0F, 7, 1, 1);
        this.Blade10.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Blade10.setTextureSize(128, 64);
        this.Blade10.mirror = true;
        setRotation(Blade10, -0.5061455F);
    }
    
    public void render() {
        final float f5 = 1.0f;
        this.Handle1.render(f5);
        this.Head1.render(f5);
        this.Grip.render(f5);
        this.Pin.render(f5);
        this.Top.render(f5);
        this.Blade1.render(f5);
        this.Blade2.render(f5);
        this.Blade3.render(f5);
        this.Blade4.render(f5);
        this.Blade5.render(f5);
        this.Blade6.render(f5);
        this.Blade7.render(f5);
        this.Blade8.render(f5);
        this.Blade9.render(f5);
        this.Blade10.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float z) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = z;
    }
}
