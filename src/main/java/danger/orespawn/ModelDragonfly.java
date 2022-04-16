package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDragonfly extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer lfwing;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer rjaw;
  
  ModelRenderer ljaw;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer Shape10;
  
  ModelRenderer Shape11;
  
  ModelRenderer Shape12;
  
  ModelRenderer Shape13;
  
  ModelRenderer Shape14;
  
  ModelRenderer Shape15;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  ModelRenderer Shape18;
  
  ModelRenderer Shape19;
  
  ModelRenderer Shape20;
  
  ModelRenderer Shape21;
  
  ModelRenderer Shape22;
  
  ModelRenderer Shape23;
  
  ModelRenderer lrwing;
  
  ModelRenderer rfwing;
  
  ModelRenderer rrwing;
  
  public ModelDragonfly(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 5, 4, 7);
    this.Shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.Shape1.setTextureSize(64, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.lfwing = new ModelRenderer(this, 0, 33);
    this.lfwing.addBox(0.0F, 0.0F, 0.0F, 10, 1, 3);
    this.lfwing.setRotationPoint(5.0F, 16.0F, 1.0F);
    this.lfwing.setTextureSize(64, 64);
    this.lfwing.mirror = true;
    setRotation(this.lfwing, 0.0F, 0.4886922F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 13);
    this.Shape3.addBox(-2.0F, 0.0F, -4.0F, 4, 3, 4);
    this.Shape3.setRotationPoint(2.5F, 16.0F, -1.0F);
    this.Shape3.setTextureSize(64, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.4886922F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 9, 21);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
    this.Shape4.setRotationPoint(1.0F, 18.0F, -6.0F);
    this.Shape4.setTextureSize(64, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.4886922F, 0.1745329F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 21);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
    this.Shape5.setRotationPoint(3.0F, 18.0F, -6.0F);
    this.Shape5.setTextureSize(64, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.4886922F, -0.1745329F, 0.0F);
    this.rjaw = new ModelRenderer(this, 0, 27);
    this.rjaw.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1);
    this.rjaw.setRotationPoint(2.0F, 19.0F, -5.0F);
    this.rjaw.setTextureSize(64, 64);
    this.rjaw.mirror = true;
    setRotation(this.rjaw, 0.4363323F, 0.1745329F, 0.0F);
    this.ljaw = new ModelRenderer(this, 5, 27);
    this.ljaw.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.ljaw.setRotationPoint(3.0F, 19.0F, -5.0F);
    this.ljaw.setTextureSize(64, 64);
    this.ljaw.mirror = true;
    setRotation(this.ljaw, 0.4363323F, -0.1745329F, 0.0F);
    this.tail1 = new ModelRenderer(this, 25, 0);
    this.tail1.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 7);
    this.tail1.setRotationPoint(2.0F, 16.0F, 7.0F);
    this.tail1.setTextureSize(64, 64);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 25, 11);
    this.tail2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 9);
    this.tail2.setRotationPoint(2.0F, 16.0F, 14.0F);
    this.tail2.setTextureSize(64, 64);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 23, 0);
    this.Shape10.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1);
    this.Shape10.setRotationPoint(1.0F, 18.0F, 0.0F);
    this.Shape10.setTextureSize(64, 64);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, -0.2792527F, 0.0F, 0.3490659F);
    this.Shape11 = new ModelRenderer(this, 40, 0);
    this.Shape11.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4);
    this.Shape11.setRotationPoint(-1.0F, 21.0F, 0.0F);
    this.Shape11.setTextureSize(64, 64);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 18, 12);
    this.Shape12.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape12.setRotationPoint(0.0F, 21.0F, -4.0F);
    this.Shape12.setTextureSize(64, 64);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, -0.1919862F);
    this.Shape13 = new ModelRenderer(this, 18, 0);
    this.Shape13.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
    this.Shape13.setRotationPoint(4.0F, 18.0F, 0.0F);
    this.Shape13.setTextureSize(64, 64);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, -0.2792527F, 0.0F, -0.3490659F);
    this.Shape14 = new ModelRenderer(this, 51, 0);
    this.Shape14.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4);
    this.Shape14.setRotationPoint(5.0F, 21.0F, 0.0F);
    this.Shape14.setTextureSize(64, 64);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 13, 12);
    this.Shape15.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape15.setRotationPoint(5.0F, 21.0F, -4.0F);
    this.Shape15.setTextureSize(64, 64);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, 0.0F, 0.0F, 0.1919862F);
    this.Shape16 = new ModelRenderer(this, 9, 53);
    this.Shape16.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
    this.Shape16.setRotationPoint(5.0F, 19.5F, 3.0F);
    this.Shape16.setTextureSize(64, 64);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.0F, 0.0F, 0.6457718F);
    this.Shape17 = new ModelRenderer(this, 0, 56);
    this.Shape17.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape17.setRotationPoint(6.0F, 21.0F, 3.0F);
    this.Shape17.setTextureSize(64, 64);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
    this.Shape18 = new ModelRenderer(this, 0, 53);
    this.Shape18.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.Shape18.setRotationPoint(0.0F, 19.5F, 3.0F);
    this.Shape18.setTextureSize(64, 64);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.0F, 0.0F, -0.6457718F);
    this.Shape19 = new ModelRenderer(this, 5, 56);
    this.Shape19.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape19.setRotationPoint(-1.0F, 21.0F, 3.0F);
    this.Shape19.setTextureSize(64, 64);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
    this.Shape20 = new ModelRenderer(this, 9, 61);
    this.Shape20.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
    this.Shape20.setRotationPoint(4.0F, 19.5F, 6.0F);
    this.Shape20.setTextureSize(64, 64);
    this.Shape20.mirror = true;
    setRotation(this.Shape20, 0.0F, -0.6457718F, 0.5061455F);
    this.Shape21 = new ModelRenderer(this, 0, 61);
    this.Shape21.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1);
    this.Shape21.setRotationPoint(1.5F, 19.5F, 7.0F);
    this.Shape21.setTextureSize(64, 64);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, 0.0F, -2.391101F, 0.5061455F);
    this.Shape22 = new ModelRenderer(this, 0, 0);
    this.Shape22.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape22.setRotationPoint(-1.0F, 21.0F, 7.5F);
    this.Shape22.setTextureSize(64, 64);
    this.Shape22.mirror = true;
    setRotation(this.Shape22, 0.0F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 0, 13);
    this.Shape23.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Shape23.setRotationPoint(5.0F, 21.0F, 7.5F);
    this.Shape23.setTextureSize(64, 64);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
    this.lrwing = new ModelRenderer(this, 0, 38);
    this.lrwing.addBox(0.0F, 0.0F, -3.0F, 10, 1, 3);
    this.lrwing.setRotationPoint(5.0F, 16.0F, 6.0F);
    this.lrwing.setTextureSize(64, 64);
    this.lrwing.mirror = true;
    setRotation(this.lrwing, 0.0F, -0.3839724F, 0.0F);
    this.rfwing = new ModelRenderer(this, 0, 48);
    this.rfwing.addBox(-10.0F, 0.0F, 0.0F, 10, 1, 3);
    this.rfwing.setRotationPoint(0.0F, 16.0F, 1.0F);
    this.rfwing.setTextureSize(64, 64);
    this.rfwing.mirror = true;
    setRotation(this.rfwing, 0.0F, -0.4886922F, 0.0F);
    this.rrwing = new ModelRenderer(this, 0, 43);
    this.rrwing.addBox(-10.0F, 0.0F, -3.0F, 10, 1, 3);
    this.rrwing.setRotationPoint(0.0F, 16.0F, 6.0F);
    this.rrwing.setTextureSize(64, 64);
    this.rrwing.mirror = true;
    setRotation(this.rrwing, 0.0F, 0.3839724F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
    this.lfwing.rotateAngleZ = newangle;
    this.rfwing.rotateAngleZ = -newangle;
    this.lrwing.rotateAngleZ = newangle + 3.14F;
    this.rrwing.rotateAngleZ = -newangle + 3.14F;
    newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.1F;
    this.ljaw.rotateAngleX = newangle;
    this.rjaw.rotateAngleX = -newangle;
    this.Shape1.render(f5);
    this.lfwing.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.rjaw.render(f5);
    this.ljaw.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    this.Shape10.render(f5);
    this.Shape11.render(f5);
    this.Shape12.render(f5);
    this.Shape13.render(f5);
    this.Shape14.render(f5);
    this.Shape15.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
    this.Shape18.render(f5);
    this.Shape19.render(f5);
    this.Shape20.render(f5);
    this.Shape21.render(f5);
    this.Shape22.render(f5);
    this.Shape23.render(f5);
    this.lrwing.render(f5);
    this.rfwing.render(f5);
    this.rrwing.render(f5);
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
