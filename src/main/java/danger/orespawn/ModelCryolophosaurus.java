package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCryolophosaurus extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer jaw;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  ModelRenderer rightleg;
  
  ModelRenderer Shape11;
  
  ModelRenderer rightleg2;
  
  ModelRenderer rightleg3;
  
  ModelRenderer rightleg4;
  
  ModelRenderer leftleg;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  ModelRenderer leftleg2;
  
  ModelRenderer leftleg3;
  
  ModelRenderer leftleg4;
  
  public ModelCryolophosaurus(float f1) {
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.wingspeed = f1;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 18);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(128, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 53, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 4, 11);
    this.Shape2.setRotationPoint(1.0F, -2.0F, -7.0F);
    this.Shape2.setTextureSize(128, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, -0.2268928F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 41);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10);
    this.Shape3.setRotationPoint(1.0F, -2.0F, -15.0F);
    this.Shape3.setTextureSize(128, 128);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 0, 30);
    this.jaw.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
    this.jaw.setRotationPoint(2.0F, 1.0F, -8.0F);
    this.jaw.setTextureSize(128, 128);
    this.jaw.mirror = true;
    setRotation(this.jaw, -1.256637F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 91, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 6, 6, 7);
    this.Shape5.setRotationPoint(1.0F, 0.0F, 18.0F);
    this.Shape5.setTextureSize(128, 128);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 36, 31);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 4, 14);
    this.Shape6.setRotationPoint(2.0F, 0.0F, 25.0F);
    this.Shape6.setTextureSize(128, 128);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 43, 8);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2);
    this.Shape7.setRotationPoint(-1.0F, 8.0F, 0.0F);
    this.Shape7.setTextureSize(128, 128);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.1919862F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 9, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape8.setRotationPoint(-1.0F, 11.0F, 1.0F);
    this.Shape8.setTextureSize(128, 128);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, -0.2617994F, 0.0F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.Shape9.setRotationPoint(3.0F, -4.0F, -9.0F);
    this.Shape9.setTextureSize(128, 128);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, -0.9424778F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 0, 58);
    this.rightleg.addBox(0.0F, 0.0F, 0.0F, 2, 10, 6);
    this.rightleg.setRotationPoint(-1.0F, 2.0F, 12.0F);
    this.rightleg.setTextureSize(128, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, -0.2792527F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 39, 0);
    this.Shape11.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3);
    this.Shape11.setRotationPoint(2.0F, -1.0F, -18.0F);
    this.Shape11.setTextureSize(128, 128);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 0, 77);
    this.rightleg2.addBox(0.0F, 7.0F, -5.0F, 2, 10, 3);
    this.rightleg2.setRotationPoint(-1.0F, 2.0F, 12.0F);
    this.rightleg2.setTextureSize(128, 128);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, 0.3839724F, 0.0F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 35, 31);
    this.rightleg3.addBox(0.0F, 10.0F, 12.0F, 2, 7, 2);
    this.rightleg3.setRotationPoint(-1.0F, 2.0F, 12.0F);
    this.rightleg3.setTextureSize(128, 128);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, -0.6806784F, 0.0F, 0.0F);
    this.rightleg4 = new ModelRenderer(this, 68, 55);
    this.rightleg4.addBox(0.0F, 20.0F, -5.0F, 2, 2, 6);
    this.rightleg4.setRotationPoint(-1.0F, 2.0F, 12.0F);
    this.rightleg4.setTextureSize(128, 128);
    this.rightleg4.mirror = true;
    setRotation(this.rightleg4, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 22, 58);
    this.leftleg.addBox(0.0F, 0.0F, 0.0F, 2, 10, 6);
    this.leftleg.setRotationPoint(7.0F, 2.0F, 12.0F);
    this.leftleg.setTextureSize(128, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, -0.2792527F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 0, 8);
    this.Shape16.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2);
    this.Shape16.setRotationPoint(8.0F, 8.0F, 0.0F);
    this.Shape16.setTextureSize(128, 128);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.1919862F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 9, 9);
    this.Shape17.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape17.setRotationPoint(8.0F, 11.0F, 1.0F);
    this.Shape17.setTextureSize(128, 128);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, -0.2617994F, 0.0F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 16, 77);
    this.leftleg2.addBox(0.0F, 7.0F, -5.0F, 2, 10, 3);
    this.leftleg2.setRotationPoint(7.0F, 2.0F, 12.0F);
    this.leftleg2.setTextureSize(128, 128);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, 0.3839724F, 0.0F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 67, 31);
    this.leftleg3.addBox(0.0F, 10.0F, 12.0F, 2, 7, 2);
    this.leftleg3.setRotationPoint(7.0F, 2.0F, 12.0F);
    this.leftleg3.setTextureSize(128, 128);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, -0.6806784F, 0.0F, 0.0F);
    this.leftleg4 = new ModelRenderer(this, 47, 56);
    this.leftleg4.addBox(0.0F, 20.0F, -5.0F, 2, 2, 6);
    this.leftleg4.setRotationPoint(7.0F, 2.0F, 12.0F);
    this.leftleg4.setTextureSize(128, 128);
    this.leftleg4.mirror = true;
    setRotation(this.leftleg4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.rightleg.rotateAngleX = -0.2792527F + newangle;
    this.rightleg2.rotateAngleX = 0.384F + newangle;
    this.rightleg3.rotateAngleX = -0.68F + newangle;
    this.rightleg4.rotateAngleX = newangle;
    this.leftleg.rotateAngleX = -0.2792527F - newangle;
    this.leftleg2.rotateAngleX = 0.384F - newangle;
    this.leftleg3.rotateAngleX = -0.68F - newangle;
    this.leftleg4.rotateAngleX = -newangle;
    this.jaw.rotateAngleX = -1.15F + MathHelper.cos(f2 * 0.28F) * 3.1415927F * 0.1F;
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.jaw.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
    this.rightleg.render(f5);
    this.Shape11.render(f5);
    this.rightleg2.render(f5);
    this.rightleg3.render(f5);
    this.rightleg4.render(f5);
    this.leftleg.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
    this.leftleg2.render(f5);
    this.leftleg3.render(f5);
    this.leftleg4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
}
