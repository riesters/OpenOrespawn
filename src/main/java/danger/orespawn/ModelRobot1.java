package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRobot1 extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape2a;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  ModelRenderer Shape10;
  
  ModelRenderer Shape11;
  
  ModelRenderer Shape12;
  
  ModelRenderer Shape13;
  
  ModelRenderer Shape14;
  
  ModelRenderer Shape15;
  
  ModelRenderer Shape15a;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  ModelRenderer Shape18;
  
  ModelRenderer rfoot;
  
  ModelRenderer lfoot;
  
  ModelRenderer key2;
  
  ModelRenderer key1;
  
  ModelRenderer key3;
  
  ModelRenderer key4;
  
  ModelRenderer key5;
  
  public ModelRobot1(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3);
    this.Shape1.setRotationPoint(-1.0F, 13.0F, -1.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 9, 5);
    this.Shape2.setRotationPoint(0.0F, 13.0F, -2.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape2a = new ModelRenderer(this, 0, 0);
    this.Shape2a.addBox(0.0F, 0.0F, 0.0F, 5, 9, 1);
    this.Shape2a.setRotationPoint(-2.0F, 13.0F, 0.0F);
    this.Shape2a.setTextureSize(64, 32);
    this.Shape2a.mirror = true;
    setRotation(this.Shape2a, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 7, 7, 3);
    this.Shape3.setRotationPoint(-3.0F, 14.0F, -1.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 3, 7, 7);
    this.Shape4.setRotationPoint(-1.0F, 14.0F, -3.0F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 5, 7, 5);
    this.Shape5.setRotationPoint(-2.0F, 14.0F, -2.0F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 5, 5, 7);
    this.Shape6.setRotationPoint(-2.0F, 15.0F, -3.0F);
    this.Shape6.setTextureSize(64, 32);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
    this.Shape7.setRotationPoint(0.0F, 15.0F, 4.0F);
    this.Shape7.setTextureSize(64, 32);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 7, 5, 5);
    this.Shape8.setRotationPoint(-3.0F, 15.0F, -2.0F);
    this.Shape8.setTextureSize(64, 32);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(0.0F, 0.0F, 0.0F, 9, 5, 1);
    this.Shape9.setRotationPoint(-4.0F, 15.0F, 0.0F);
    this.Shape9.setTextureSize(64, 32);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 0, 0);
    this.Shape10.addBox(0.0F, 0.0F, 1.0F, 3, 3, 8);
    this.Shape10.setRotationPoint(-1.0F, 16.0F, -4.0F);
    this.Shape10.setTextureSize(64, 32);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 0, 0);
    this.Shape11.addBox(0.0F, 0.0F, 0.0F, 9, 3, 3);
    this.Shape11.setRotationPoint(-4.0F, 16.0F, -1.0F);
    this.Shape11.setTextureSize(64, 32);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 0, 0);
    this.Shape12.addBox(0.0F, 0.0F, 0.0F, 7, 3, 7);
    this.Shape12.setRotationPoint(-3.0F, 16.0F, -3.0F);
    this.Shape12.setTextureSize(64, 32);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
    this.Shape13 = new ModelRenderer(this, 0, 0);
    this.Shape13.addBox(0.0F, 0.0F, 0.0F, 9, 1, 5);
    this.Shape13.setRotationPoint(-4.0F, 17.0F, -2.0F);
    this.Shape13.setTextureSize(64, 32);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
    this.Shape14 = new ModelRenderer(this, 0, 0);
    this.Shape14.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1);
    this.Shape14.setRotationPoint(-2.0F, 17.0F, 4.0F);
    this.Shape14.setTextureSize(64, 32);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 32, 0);
    this.Shape15.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape15.setRotationPoint(-2.0F, 15.0F, -4.0F);
    this.Shape15.setTextureSize(64, 32);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
    this.Shape15a = new ModelRenderer(this, 32, 0);
    this.Shape15a.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape15a.setRotationPoint(1.0F, 15.0F, -4.0F);
    this.Shape15a.setTextureSize(64, 32);
    this.Shape15a.mirror = true;
    setRotation(this.Shape15a, 0.0F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 45, 0);
    this.Shape16.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.Shape16.setRotationPoint(-1.0F, 12.0F, -1.0F);
    this.Shape16.setTextureSize(64, 32);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 33, 7);
    this.Shape17.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.Shape17.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.Shape17.setTextureSize(64, 32);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
    this.Shape18 = new ModelRenderer(this, 33, 7);
    this.Shape18.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.Shape18.setRotationPoint(1.7F, 8.733334F, 0.0F);
    this.Shape18.setTextureSize(64, 32);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.0F, 0.0F, 0.9667472F);
    this.rfoot = new ModelRenderer(this, 46, 8);
    this.rfoot.addBox(0.0F, 3.0F, -2.0F, 2, 2, 4);
    this.rfoot.setRotationPoint(-3.0F, 19.0F, 0.0F);
    this.rfoot.setTextureSize(64, 32);
    this.rfoot.mirror = true;
    setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
    this.lfoot = new ModelRenderer(this, 46, 8);
    this.lfoot.addBox(0.0F, 3.0F, -2.0F, 2, 2, 4);
    this.lfoot.setRotationPoint(2.0F, 19.0F, 0.0F);
    this.lfoot.setTextureSize(64, 32);
    this.lfoot.mirror = true;
    setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
    this.key2 = new ModelRenderer(this, 46, 8);
    this.key2.addBox(-0.5F, -1.5F, 1.0F, 1, 3, 1);
    this.key2.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.key2.setTextureSize(64, 32);
    this.key2.mirror = true;
    setRotation(this.key2, 0.0F, 0.0F, 0.0F);
    this.key1 = new ModelRenderer(this, 46, 8);
    this.key1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3);
    this.key1.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.key1.setTextureSize(64, 32);
    this.key1.mirror = true;
    setRotation(this.key1, 0.0F, 0.0F, 0.0F);
    this.key3 = new ModelRenderer(this, 46, 8);
    this.key3.addBox(-0.5F, -2.5F, 1.0F, 1, 1, 2);
    this.key3.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.key3.setTextureSize(64, 32);
    this.key3.mirror = true;
    setRotation(this.key3, 0.0F, 0.0F, 0.0F);
    this.key4 = new ModelRenderer(this, 46, 8);
    this.key4.addBox(-0.5F, 1.5F, 1.0F, 1, 1, 2);
    this.key4.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.key4.setTextureSize(64, 32);
    this.key4.mirror = true;
    setRotation(this.key4, 0.0F, 0.0F, 0.0F);
    this.key5 = new ModelRenderer(this, 46, 8);
    this.key5.addBox(-0.5F, -1.5F, 3.0F, 1, 3, 1);
    this.key5.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.key5.setTextureSize(64, 32);
    this.key5.mirror = true;
    setRotation(this.key5, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Robot1 e = (Robot1)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.75F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lfoot.rotateAngleX = newangle;
    this.rfoot.rotateAngleX = -newangle;
    newangle = (float)Math.toRadians((f2 * 0.75F * this.wingspeed));
    this.key1.rotateAngleZ = newangle;
    this.key2.rotateAngleZ = newangle;
    this.key3.rotateAngleZ = newangle;
    this.key4.rotateAngleZ = newangle;
    this.key5.rotateAngleZ = newangle;
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape2a.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
    this.Shape10.render(f5);
    this.Shape11.render(f5);
    this.Shape12.render(f5);
    this.Shape13.render(f5);
    this.Shape14.render(f5);
    this.Shape15.render(f5);
    this.Shape15a.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
    this.Shape18.render(f5);
    this.rfoot.render(f5);
    this.lfoot.render(f5);
    this.key2.render(f5);
    this.key1.render(f5);
    this.key3.render(f5);
    this.key4.render(f5);
    this.key5.render(f5);
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
