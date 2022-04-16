package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelQueenBattleAxe extends ModelBase {
  ModelRenderer Handle1;
  
  ModelRenderer Head1;
  
  ModelRenderer Grip;
  
  ModelRenderer Pin;
  
  ModelRenderer Blade1;
  
  ModelRenderer Blade2;
  
  ModelRenderer Blade3;
  
  ModelRenderer Blade4;
  
  ModelRenderer Top;
  
  public ModelQueenBattleAxe() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.Handle1 = new ModelRenderer(this, 0, 0);
    this.Handle1.addBox(-7.0F, -0.5F, 0.0F, 31, 1, 1);
    this.Handle1.setRotationPoint(-0.5F, -12.0F, 0.0F);
    this.Handle1.setTextureSize(128, 64);
    this.Handle1.mirror = true;
    setRotation(this.Handle1, 0.0F, 0.0F, 1.570796F);
    this.Head1 = new ModelRenderer(this, 29, 18);
    this.Head1.addBox(-2.0F, -4.5F, -0.5F, 3, 4, 2);
    this.Head1.setRotationPoint(0.0F, -12.0F, 0.0F);
    this.Head1.setTextureSize(128, 64);
    this.Head1.mirror = true;
    setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
    this.Grip = new ModelRenderer(this, 0, 7);
    this.Grip.addBox(-1.92F, 13.0F, -0.5F, 2, 11, 2);
    this.Grip.setRotationPoint(0.5F, -12.0F, 0.0F);
    this.Grip.setTextureSize(128, 64);
    this.Grip.mirror = true;
    setRotation(this.Grip, 0.0F, 0.0F, 0.0F);
    this.Pin = new ModelRenderer(this, 38, 11);
    this.Pin.addBox(-1.0F, -3.0F, -1.0F, 1, 1, 3);
    this.Pin.setRotationPoint(0.0F, -12.0F, 0.0F);
    this.Pin.setTextureSize(128, 64);
    this.Pin.mirror = true;
    setRotation(this.Pin, 0.0F, 0.0F, 0.0F);
    this.Blade1 = new ModelRenderer(this, 70, 0);
    this.Blade1.addBox(-10.0F, -2.0F, 0.0F, 20, 4, 1);
    this.Blade1.setRotationPoint(-0.5F, -14.5F, 0.0F);
    this.Blade1.setTextureSize(128, 64);
    this.Blade1.mirror = true;
    setRotation(this.Blade1, 0.0F, 0.0F, -0.5934119F);
    this.Blade2 = new ModelRenderer(this, 70, 0);
    this.Blade2.addBox(-10.0F, -2.0F, 0.0F, 20, 4, 1);
    this.Blade2.setRotationPoint(-0.5F, -14.5F, 0.0F);
    this.Blade2.setTextureSize(128, 64);
    this.Blade2.mirror = true;
    setRotation(this.Blade2, 0.0F, 0.0F, -0.1919862F);
    this.Blade3 = new ModelRenderer(this, 70, 0);
    this.Blade3.addBox(-10.0F, -2.0F, 0.0F, 20, 4, 1);
    this.Blade3.setRotationPoint(-0.5F, -14.5F, 0.0F);
    this.Blade3.setTextureSize(128, 64);
    this.Blade3.mirror = true;
    setRotation(this.Blade3, 0.0F, 0.0F, 0.2094395F);
    this.Blade4 = new ModelRenderer(this, 70, 0);
    this.Blade4.addBox(-10.0F, -2.0F, 0.0F, 20, 4, 1);
    this.Blade4.setRotationPoint(-0.5F, -14.5F, 0.0F);
    this.Blade4.setTextureSize(128, 64);
    this.Blade4.mirror = true;
    setRotation(this.Blade4, 0.0F, 0.0F, 0.5934119F);
    this.Top = new ModelRenderer(this, 13, 4);
    this.Top.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.Top.setRotationPoint(-1.5F, -21.0F, -0.5F);
    this.Top.setTextureSize(128, 64);
    this.Top.mirror = true;
    setRotation(this.Top, 0.0F, 0.0F, 0.0F);
  }
  
  public void render() {
    float f5 = 1.0F;
    this.Handle1.render(f5);
    this.Head1.render(f5);
    this.Grip.render(f5);
    this.Pin.render(f5);
    this.Blade1.render(f5);
    this.Blade2.render(f5);
    this.Blade3.render(f5);
    this.Blade4.render(f5);
    this.Top.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
