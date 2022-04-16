package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEasterBunny extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer tail;
  
  ModelRenderer lfoot;
  
  ModelRenderer lleg;
  
  ModelRenderer upperbody;
  
  ModelRenderer head;
  
  ModelRenderer nose;
  
  ModelRenderer lear;
  
  ModelRenderer lpaw;
  
  ModelRenderer rleg;
  
  ModelRenderer rfoot;
  
  ModelRenderer rear;
  
  ModelRenderer rpaw;
  
  public ModelEasterBunny(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.body = new ModelRenderer(this, 0, 44);
    this.body.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 7);
    this.body.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 0, 58);
    this.tail.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4);
    this.tail.setRotationPoint(0.0F, 19.0F, 6.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0F, 0.0F, 0.0F);
    this.lfoot = new ModelRenderer(this, 0, 30);
    this.lfoot.addBox(-1.0F, 2.0F, -5.0F, 3, 1, 7);
    this.lfoot.setRotationPoint(3.0F, 21.0F, 1.0F);
    this.lfoot.setTextureSize(64, 32);
    this.lfoot.mirror = true;
    setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
    this.lleg = new ModelRenderer(this, 0, 20);
    this.lleg.addBox(0.0F, -2.0F, -2.0F, 1, 4, 5);
    this.lleg.setRotationPoint(3.0F, 21.0F, 1.0F);
    this.lleg.setTextureSize(64, 32);
    this.lleg.mirror = true;
    setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
    this.upperbody = new ModelRenderer(this, 42, 27);
    this.upperbody.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 5);
    this.upperbody.setRotationPoint(0.0F, 16.0F, -1.0F);
    this.upperbody.setTextureSize(64, 32);
    this.upperbody.mirror = true;
    setRotation(this.upperbody, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 40, 17);
    this.head.addBox(-2.5F, 0.0F, -2.0F, 5, 4, 5);
    this.head.setRotationPoint(0.0F, 12.0F, -2.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 44, 9);
    this.nose.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1);
    this.nose.setRotationPoint(0.0F, 15.0F, -5.0F);
    this.nose.setTextureSize(64, 32);
    this.nose.mirror = true;
    setRotation(this.nose, 0.0F, 0.0F, 0.0F);
    this.lear = new ModelRenderer(this, 54, 0);
    this.lear.addBox(0.0F, -10.0F, -1.0F, 1, 10, 3);
    this.lear.setRotationPoint(2.0F, 13.0F, -1.0F);
    this.lear.setTextureSize(64, 32);
    this.lear.mirror = true;
    setRotation(this.lear, -0.2268928F, 0.0F, 0.0F);
    this.lpaw = new ModelRenderer(this, 6, 7);
    this.lpaw.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.lpaw.setRotationPoint(0.5F, 19.0F, -4.0F);
    this.lpaw.setTextureSize(64, 32);
    this.lpaw.mirror = true;
    setRotation(this.lpaw, 0.0F, 0.0F, 0.0F);
    this.rleg = new ModelRenderer(this, 21, 20);
    this.rleg.addBox(0.0F, -2.0F, -2.0F, 1, 4, 5);
    this.rleg.setRotationPoint(-4.0F, 21.0F, 1.0F);
    this.rleg.setTextureSize(64, 32);
    this.rleg.mirror = true;
    setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
    this.rfoot = new ModelRenderer(this, 21, 30);
    this.rfoot.addBox(-1.0F, 2.0F, -5.0F, 3, 1, 7);
    this.rfoot.setRotationPoint(-4.0F, 21.0F, 1.0F);
    this.rfoot.setTextureSize(64, 32);
    this.rfoot.mirror = true;
    setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
    this.rear = new ModelRenderer(this, 32, 0);
    this.rear.addBox(0.0F, -10.0F, -1.0F, 1, 10, 3);
    this.rear.setRotationPoint(-3.0F, 13.0F, -1.0F);
    this.rear.setTextureSize(64, 32);
    this.rear.mirror = true;
    setRotation(this.rear, -0.418879F, 0.0F, 0.0F);
    this.rpaw = new ModelRenderer(this, 0, 7);
    this.rpaw.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.rpaw.setRotationPoint(-1.5F, 19.0F, -4.0F);
    this.rpaw.setTextureSize(64, 32);
    this.rpaw.mirror = true;
    setRotation(this.rpaw, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    EasterBunny e = (EasterBunny)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    float newangle2 = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.15F * f1;
      newangle2 = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F * f1;
    } else {
      newangle = 0.0F;
      newangle2 = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.01F;
    } 
    this.lfoot.rotateAngleX = newangle;
    this.rfoot.rotateAngleX = -newangle;
    this.lear.rotateAngleX = -0.226F + newangle2;
    this.rear.rotateAngleX = -0.418F - newangle2;
    this.body.render(f5);
    this.tail.render(f5);
    this.lfoot.render(f5);
    this.lleg.render(f5);
    this.upperbody.render(f5);
    this.head.render(f5);
    this.nose.render(f5);
    this.lear.render(f5);
    this.lpaw.render(f5);
    this.rleg.render(f5);
    this.rfoot.render(f5);
    this.rear.render(f5);
    this.rpaw.render(f5);
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
