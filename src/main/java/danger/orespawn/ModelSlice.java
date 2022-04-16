package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelSlice extends ModelBase {
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
    setRotation(this.Grip, 0.0F, 0.0F, 0.0F);
    this.Blade1 = new ModelRenderer(this, 6, 49);
    this.Blade1.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
    this.Blade1.setRotationPoint(0.5F, 0.0F, -2.3F);
    this.Blade1.setTextureSize(64, 128);
    this.Blade1.mirror = true;
    setRotation(this.Blade1, 0.0F, 0.3490659F, 0.0F);
    this.Handguard2 = new ModelRenderer(this, 16, 0);
    this.Handguard2.addBox(0.0F, -7.0F, -4.0F, 1, 1, 9);
    this.Handguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Handguard2.setTextureSize(64, 128);
    this.Handguard2.mirror = true;
    setRotation(this.Handguard2, 0.0F, 0.0F, 0.0F);
    this.Handguard1 = new ModelRenderer(this, 18, 12);
    this.Handguard1.addBox(-3.0F, -7.0F, 0.0F, 7, 1, 1);
    this.Handguard1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Handguard1.setTextureSize(64, 128);
    this.Handguard1.mirror = true;
    setRotation(this.Handguard1, 0.0F, 0.0F, 0.0F);
    this.hg2 = new ModelRenderer(this, 0, 15);
    this.hg2.addBox(0.0F, -9.0F, -7.0F, 1, 3, 3);
    this.hg2.setRotationPoint(0.5F, 0.0F, 0.0F);
    this.hg2.setTextureSize(64, 128);
    this.hg2.mirror = true;
    setRotation(this.hg2, 0.0F, 0.0F, 0.0F);
    this.hg4 = new ModelRenderer(this, 0, 22);
    this.hg4.addBox(0.0F, -9.0F, 5.0F, 1, 3, 3);
    this.hg4.setRotationPoint(0.5F, 0.0F, 0.0F);
    this.hg4.setTextureSize(64, 128);
    this.hg4.mirror = true;
    setRotation(this.hg4, 0.0F, 0.0F, 0.0F);
    this.hg3 = new ModelRenderer(this, 0, 29);
    this.hg3.addBox(-4.0F, -9.0F, 0.0F, 3, 3, 1);
    this.hg3.setRotationPoint(-2.0F, 0.0F, 0.5F);
    this.hg3.setTextureSize(64, 128);
    this.hg3.mirror = true;
    setRotation(this.hg3, 0.0F, 0.0F, 0.0F);
    this.hg1 = new ModelRenderer(this, 0, 34);
    this.hg1.addBox(4.0F, -9.0F, 0.0F, 3, 3, 1);
    this.hg1.setRotationPoint(0.0F, 0.0F, 0.5F);
    this.hg1.setTextureSize(64, 128);
    this.hg1.mirror = true;
    setRotation(this.hg1, 0.0F, 0.0F, 0.0F);
    this.BaseGrip = new ModelRenderer(this, 0, 39);
    this.BaseGrip.addBox(-1.0F, 5.0F, -1.0F, 3, 1, 3);
    this.BaseGrip.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.BaseGrip.setTextureSize(64, 128);
    this.BaseGrip.mirror = true;
    setRotation(this.BaseGrip, 0.0F, 0.0F, 0.0F);
    this.Bottom = new ModelRenderer(this, 0, 45);
    this.Bottom.addBox(0.0F, 6.0F, 0.0F, 1, 1, 1);
    this.Bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Bottom.setTextureSize(64, 128);
    this.Bottom.mirror = true;
    setRotation(this.Bottom, 0.0F, 0.0F, 0.0F);
    this.Blade2 = new ModelRenderer(this, 24, 49);
    this.Blade2.addBox(-1.0F, -41.0F, 0.0F, 1, 34, 3);
    this.Blade2.setRotationPoint(0.5F, 0.0F, -2.3F);
    this.Blade2.setTextureSize(64, 128);
    this.Blade2.mirror = true;
    setRotation(this.Blade2, 0.0F, -0.3490659F, 0.0F);
    this.Blade3 = new ModelRenderer(this, 15, 49);
    this.Blade3.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
    this.Blade3.setRotationPoint(1.5F, 0.0F, 0.4F);
    this.Blade3.setTextureSize(64, 128);
    this.Blade3.mirror = true;
    setRotation(this.Blade3, 0.0F, -0.3490659F, 0.0F);
    this.Blade4 = new ModelRenderer(this, 33, 49);
    this.Blade4.addBox(0.0F, -41.0F, 0.0F, 1, 34, 3);
    this.Blade4.setRotationPoint(-1.5F, 0.0F, 0.7F);
    this.Blade4.setTextureSize(64, 128);
    this.Blade4.mirror = true;
    setRotation(this.Blade4, 0.0F, 0.3490659F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 6, 0);
    this.Shape1.addBox(0.0F, -6.0F, 0.0F, 1, 6, 3);
    this.Shape1.setRotationPoint(0.5F, -40.0F, -1.0F);
    this.Shape1.setTextureSize(64, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
  }
  
  public void render() {
    float f5 = 1.0F;
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
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
