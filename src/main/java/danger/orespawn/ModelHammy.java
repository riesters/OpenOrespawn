package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelHammy extends ModelBase {
  ModelRenderer Handle1;
  
  ModelRenderer Handle2;
  
  ModelRenderer Handle3;
  
  ModelRenderer Head1;
  
  ModelRenderer Head2;
  
  ModelRenderer Head3;
  
  ModelRenderer Head4;
  
  ModelRenderer Band1;
  
  ModelRenderer Band2;
  
  ModelRenderer Band3;
  
  ModelRenderer Band4;
  
  ModelRenderer Band5;
  
  ModelRenderer Band6;
  
  ModelRenderer Band7;
  
  ModelRenderer Band8;
  
  ModelRenderer Point1;
  
  ModelRenderer Spike1;
  
  ModelRenderer Spike2;
  
  ModelRenderer Spike3;
  
  ModelRenderer Spike4;
  
  ModelRenderer Band1b;
  
  ModelRenderer Band2b;
  
  ModelRenderer Band3b;
  
  ModelRenderer Band4b;
  
  ModelRenderer Band5b;
  
  ModelRenderer Band6b;
  
  ModelRenderer Band7b;
  
  ModelRenderer Band8b;
  
  ModelRenderer Point1b;
  
  ModelRenderer Spike2b;
  
  ModelRenderer Spike1b;
  
  ModelRenderer Spike3b;
  
  ModelRenderer Spike4b;
  
  public ModelHammy() {
    this.textureWidth = 128;
    this.textureHeight = 256;
    this.Handle1 = new ModelRenderer(this, 0, 0);
    this.Handle1.addBox(-0.5F, -12.0F, -1.0F, 1, 36, 2);
    this.Handle1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Handle1.setTextureSize(128, 256);
    this.Handle1.mirror = true;
    setRotation(this.Handle1, 0.0F, 0.0F, 0.0F);
    this.Handle2 = new ModelRenderer(this, 7, 0);
    this.Handle2.addBox(-0.5F, -12.0F, -1.0F, 1, 36, 2);
    this.Handle2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Handle2.setTextureSize(128, 256);
    this.Handle2.mirror = true;
    setRotation(this.Handle2, 0.0F, 1.047198F, 0.0F);
    this.Handle3 = new ModelRenderer(this, 14, 0);
    this.Handle3.addBox(-0.5F, -12.0F, -1.0F, 1, 36, 2);
    this.Handle3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Handle3.setTextureSize(128, 256);
    this.Handle3.mirror = true;
    setRotation(this.Handle3, 0.0F, -1.047198F, 0.0F);
    this.Head1 = new ModelRenderer(this, 0, 230);
    this.Head1.addBox(-20.0F, -22.0F, -7.0F, 40, 6, 14);
    this.Head1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Head1.setTextureSize(128, 256);
    this.Head1.mirror = true;
    setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
    this.Head2 = new ModelRenderer(this, 0, 184);
    this.Head2.addBox(-20.0F, -26.0F, -3.0F, 40, 14, 6);
    this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Head2.setTextureSize(128, 256);
    this.Head2.mirror = true;
    setRotation(this.Head2, 0.0F, 0.0F, 0.0F);
    this.Head3 = new ModelRenderer(this, 0, 161);
    this.Head3.addBox(-20.0F, -16.5F, 6.4F, 40, 6, 14);
    this.Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Head3.setTextureSize(128, 256);
    this.Head3.mirror = true;
    setRotation(this.Head3, 0.7853982F, 0.0F, 0.0F);
    this.Head4 = new ModelRenderer(this, 0, 207);
    this.Head4.addBox(-20.0F, -16.5F, -20.4F, 40, 6, 14);
    this.Head4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Head4.setTextureSize(128, 256);
    this.Head4.mirror = true;
    setRotation(this.Head4, -0.7853982F, 0.0F, 0.0F);
    this.Band1 = new ModelRenderer(this, 0, 88);
    this.Band1.addBox(12.0F, -22.5F, -8.0F, 5, 7, 1);
    this.Band1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band1.setTextureSize(128, 256);
    this.Band1.mirror = true;
    setRotation(this.Band1, 0.0F, 0.0F, 0.0F);
    this.Band2 = new ModelRenderer(this, 0, 128);
    this.Band2.addBox(12.0F, -22.5F, 7.0F, 5, 7, 1);
    this.Band2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band2.setTextureSize(128, 256);
    this.Band2.mirror = true;
    setRotation(this.Band2, 0.0F, 0.0F, 0.0F);
    this.Band3 = new ModelRenderer(this, 0, 98);
    this.Band3.addBox(12.0F, -17.0F, 5.4F, 5, 7, 1);
    this.Band3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band3.setTextureSize(128, 256);
    this.Band3.mirror = true;
    setRotation(this.Band3, 0.7853982F, 0.0F, 0.0F);
    this.Band4 = new ModelRenderer(this, 0, 118);
    this.Band4.addBox(12.0F, -16.9F, -6.4F, 5, 7, 1);
    this.Band4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band4.setTextureSize(128, 256);
    this.Band4.mirror = true;
    setRotation(this.Band4, -0.7853982F, 0.0F, 0.0F);
    this.Band5 = new ModelRenderer(this, 0, 108);
    this.Band5.addBox(12.0F, -12.0F, -3.5F, 5, 1, 7);
    this.Band5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band5.setTextureSize(128, 256);
    this.Band5.mirror = true;
    setRotation(this.Band5, 0.0F, 0.0F, 0.0F);
    this.Band6 = new ModelRenderer(this, 0, 79);
    this.Band6.addBox(12.0F, -16.5F, -21.4F, 5, 6, 1);
    this.Band6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band6.setTextureSize(128, 256);
    this.Band6.mirror = true;
    setRotation(this.Band6, -0.7853982F, 0.0F, 0.0F);
    this.Band7 = new ModelRenderer(this, 0, 138);
    this.Band7.addBox(12.0F, -17.0F, 20.4F, 5, 7, 1);
    this.Band7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band7.setTextureSize(128, 256);
    this.Band7.mirror = true;
    setRotation(this.Band7, 0.7853982F, 0.0F, 0.0F);
    this.Band8 = new ModelRenderer(this, 0, 148);
    this.Band8.addBox(12.0F, -27.0F, -3.5F, 5, 1, 7);
    this.Band8.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band8.setTextureSize(128, 256);
    this.Band8.mirror = true;
    setRotation(this.Band8, 0.0F, 0.0F, 0.0F);
    this.Point1 = new ModelRenderer(this, 28, 130);
    this.Point1.addBox(-2.5F, -29.5F, -0.5F, 5, 5, 1);
    this.Point1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Point1.setTextureSize(128, 256);
    this.Point1.mirror = true;
    setRotation(this.Point1, 0.0F, 0.0F, 0.7853982F);
    this.Spike1 = new ModelRenderer(this, 67, 0);
    this.Spike1.addBox(14.0F, -20.0F, -10.0F, 1, 1, 20);
    this.Spike1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike1.setTextureSize(128, 256);
    this.Spike1.mirror = true;
    setRotation(this.Spike1, 0.0F, 0.0F, 0.0F);
    this.Spike2 = new ModelRenderer(this, 49, 0);
    this.Spike2.addBox(14.0F, -29.0F, 0.0F, 1, 20, 1);
    this.Spike2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike2.setTextureSize(128, 256);
    this.Spike2.mirror = true;
    setRotation(this.Spike2, 0.0F, 0.0F, 0.0F);
    this.Spike3 = new ModelRenderer(this, 55, 0);
    this.Spike3.addBox(14.0F, -23.5F, 13.0F, 1, 20, 1);
    this.Spike3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike3.setTextureSize(128, 256);
    this.Spike3.mirror = true;
    setRotation(this.Spike3, 0.7853982F, 0.0F, 0.0F);
    this.Spike4 = new ModelRenderer(this, 61, 0);
    this.Spike4.addBox(-15.0F, -23.5F, -14.0F, 1, 20, 1);
    this.Spike4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike4.setTextureSize(128, 256);
    this.Spike4.mirror = true;
    setRotation(this.Spike4, -0.7853982F, 0.0F, 0.0F);
    this.Band1b = new ModelRenderer(this, 0, 88);
    this.Band1b.addBox(-17.0F, -22.5F, -8.0F, 5, 7, 1);
    this.Band1b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band1b.setTextureSize(128, 256);
    this.Band1b.mirror = true;
    setRotation(this.Band1b, 0.0F, 0.0F, 0.0F);
    this.Band2b = new ModelRenderer(this, 0, 128);
    this.Band2b.addBox(-17.0F, -22.5F, 7.0F, 5, 7, 1);
    this.Band2b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band2b.setTextureSize(128, 256);
    this.Band2b.mirror = true;
    setRotation(this.Band2b, 0.0F, 0.0F, 0.0F);
    this.Band3b = new ModelRenderer(this, 0, 98);
    this.Band3b.addBox(-17.0F, -17.0F, 5.4F, 5, 7, 1);
    this.Band3b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band3b.setTextureSize(128, 256);
    this.Band3b.mirror = true;
    setRotation(this.Band3b, 0.7853982F, 0.0F, 0.0F);
    this.Band4b = new ModelRenderer(this, 0, 118);
    this.Band4b.addBox(-17.0F, -16.9F, -6.4F, 5, 7, 1);
    this.Band4b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band4b.setTextureSize(128, 256);
    this.Band4b.mirror = true;
    setRotation(this.Band4b, -0.7853982F, 0.0F, 0.0F);
    this.Band5b = new ModelRenderer(this, 0, 108);
    this.Band5b.addBox(-17.0F, -12.0F, -3.5F, 5, 1, 7);
    this.Band5b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band5b.setTextureSize(128, 256);
    this.Band5b.mirror = true;
    setRotation(this.Band5b, 0.0F, 0.0F, 0.0F);
    this.Band6b = new ModelRenderer(this, 0, 79);
    this.Band6b.addBox(-17.0F, -16.5F, -21.4F, 5, 6, 1);
    this.Band6b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band6b.setTextureSize(128, 256);
    this.Band6b.mirror = true;
    setRotation(this.Band6b, -0.7853982F, 0.0F, 0.0F);
    this.Band7b = new ModelRenderer(this, 0, 138);
    this.Band7b.addBox(-17.0F, -17.0F, 20.4F, 5, 7, 1);
    this.Band7b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band7b.setTextureSize(128, 256);
    this.Band7b.mirror = true;
    setRotation(this.Band7b, 0.7853982F, 0.0F, 0.0F);
    this.Band8b = new ModelRenderer(this, 0, 148);
    this.Band8b.addBox(-17.0F, -27.0F, -3.5F, 5, 1, 7);
    this.Band8b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Band8b.setTextureSize(128, 256);
    this.Band8b.mirror = true;
    setRotation(this.Band8b, 0.0F, 0.0F, 0.0F);
    this.Point1b = new ModelRenderer(this, 28, 130);
    this.Point1b.addBox(-29.5F, -2.5F, -0.5F, 5, 5, 1);
    this.Point1b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Point1b.setTextureSize(128, 256);
    this.Point1b.mirror = true;
    setRotation(this.Point1b, 0.0F, 0.0F, 0.7853982F);
    this.Spike2b = new ModelRenderer(this, 49, 0);
    this.Spike2b.addBox(-15.0F, -29.0F, 0.0F, 1, 20, 1);
    this.Spike2b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike2b.setTextureSize(128, 256);
    this.Spike2b.mirror = true;
    setRotation(this.Spike2b, 0.0F, 0.0F, 0.0F);
    this.Spike1b = new ModelRenderer(this, 67, 0);
    this.Spike1b.addBox(-15.0F, -20.0F, -10.0F, 1, 1, 20);
    this.Spike1b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike1b.setTextureSize(128, 256);
    this.Spike1b.mirror = true;
    setRotation(this.Spike1b, 0.0F, 0.0F, 0.0F);
    this.Spike3b = new ModelRenderer(this, 55, 0);
    this.Spike3b.addBox(-15.0F, -23.5F, 13.0F, 1, 20, 1);
    this.Spike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike3b.setTextureSize(128, 256);
    this.Spike3b.mirror = true;
    setRotation(this.Spike3b, 0.7853982F, 0.0F, 0.0F);
    this.Spike4b = new ModelRenderer(this, 61, 0);
    this.Spike4b.addBox(14.0F, -23.5F, -14.0F, 1, 20, 1);
    this.Spike4b.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Spike4b.setTextureSize(128, 256);
    this.Spike4b.mirror = true;
    setRotation(this.Spike4b, -0.7853982F, 0.0F, 0.0F);
  }
  
  public void render() {
    float f5 = 1.0F;
    this.Handle1.render(f5);
    this.Handle2.render(f5);
    this.Handle3.render(f5);
    this.Head1.render(f5);
    this.Head2.render(f5);
    this.Head3.render(f5);
    this.Head4.render(f5);
    this.Band1.render(f5);
    this.Band2.render(f5);
    this.Band3.render(f5);
    this.Band4.render(f5);
    this.Band5.render(f5);
    this.Band6.render(f5);
    this.Band7.render(f5);
    this.Band8.render(f5);
    this.Point1.render(f5);
    this.Spike1.render(f5);
    this.Spike2.render(f5);
    this.Spike3.render(f5);
    this.Spike4.render(f5);
    this.Band1b.render(f5);
    this.Band2b.render(f5);
    this.Band3b.render(f5);
    this.Band4b.render(f5);
    this.Band5b.render(f5);
    this.Band6b.render(f5);
    this.Band7b.render(f5);
    this.Band8b.render(f5);
    this.Point1b.render(f5);
    this.Spike2b.render(f5);
    this.Spike1b.render(f5);
    this.Spike3b.render(f5);
    this.Spike4b.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
