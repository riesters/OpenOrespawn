package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRat extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer lfleg;
  
  ModelRenderer rfleg;
  
  ModelRenderer lrleg;
  
  ModelRenderer rrleg;
  
  ModelRenderer body2;
  
  ModelRenderer head;
  
  ModelRenderer nose;
  
  ModelRenderer lear;
  
  ModelRenderer rear;
  
  public ModelRat(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 27, 0);
    this.body.addBox(-2.0F, -1.0F, 0.0F, 5, 3, 10);
    this.body.setRotationPoint(0.0F, 20.0F, -3.0F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 0, 30);
    this.tail1.addBox(-0.5F, -1.0F, 0.0F, 2, 2, 9);
    this.tail1.setRotationPoint(0.0F, 21.0F, 7.0F);
    this.tail1.setTextureSize(64, 64);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 0, 43);
    this.tail2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12);
    this.tail2.setRotationPoint(0.0F, 21.0F, 16.0F);
    this.tail2.setTextureSize(64, 64);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.lfleg = new ModelRenderer(this, 0, 14);
    this.lfleg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.lfleg.setRotationPoint(2.0F, 22.0F, -2.0F);
    this.lfleg.setTextureSize(64, 64);
    this.lfleg.mirror = true;
    setRotation(this.lfleg, 0.0F, 0.0F, 0.0F);
    this.rfleg = new ModelRenderer(this, 10, 14);
    this.rfleg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.rfleg.setRotationPoint(-2.0F, 22.0F, -2.0F);
    this.rfleg.setTextureSize(64, 64);
    this.rfleg.mirror = true;
    setRotation(this.rfleg, 0.0F, 0.0F, 0.0F);
    this.lrleg = new ModelRenderer(this, 0, 18);
    this.lrleg.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2);
    this.lrleg.setRotationPoint(2.0F, 20.0F, 4.0F);
    this.lrleg.setTextureSize(64, 64);
    this.lrleg.mirror = true;
    setRotation(this.lrleg, 0.0F, 0.0F, 0.0F);
    this.rrleg = new ModelRenderer(this, 9, 18);
    this.rrleg.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2);
    this.rrleg.setRotationPoint(-3.0F, 20.0F, 4.0F);
    this.rrleg.setTextureSize(64, 64);
    this.rrleg.mirror = true;
    setRotation(this.rrleg, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 0);
    this.body2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6);
    this.body2.setRotationPoint(0.0F, 18.0F, 0.0F);
    this.body2.setTextureSize(64, 64);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 27, 17);
    this.head.addBox(-1.0F, -2.0F, -3.0F, 3, 2, 4);
    this.head.setRotationPoint(0.0F, 22.0F, -4.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 27, 25);
    this.nose.addBox(0.0F, -1.0F, -5.0F, 1, 1, 2);
    this.nose.setRotationPoint(0.0F, 22.0F, -4.0F);
    this.nose.setTextureSize(64, 64);
    this.nose.mirror = true;
    setRotation(this.nose, 0.0F, 0.0F, 0.0F);
    this.lear = new ModelRenderer(this, 0, 9);
    this.lear.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.lear.setRotationPoint(1.5F, 19.5F, -4.0F);
    this.lear.setTextureSize(64, 64);
    this.lear.mirror = true;
    setRotation(this.lear, 0.0F, 0.0F, 0.0F);
    this.rear = new ModelRenderer(this, 5, 9);
    this.rear.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.rear.setRotationPoint(-1.5F, 19.5F, -4.0F);
    this.rear.setTextureSize(64, 64);
    this.rear.mirror = true;
    setRotation(this.rear, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Rat r = (Rat)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.rfleg.rotateAngleX = newangle;
    this.lfleg.rotateAngleX = -newangle;
    this.rrleg.rotateAngleX = -newangle;
    this.lrleg.rotateAngleX = newangle;
    if (r.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.25F;
    } else {
      newangle = MathHelper.cos(f2 * 0.4F * this.wingspeed) * 3.1415927F * 0.05F;
    } 
    this.tail1.rotateAngleY = newangle * 0.5F;
    this.tail2.rotateAngleY = newangle * 1.25F;
    this.tail1.rotationPointZ += (float)Math.cos(this.tail1.rotateAngleY) * 9.0F;
    this.tail1.rotationPointX += (float)Math.sin(this.tail1.rotateAngleY) * 9.0F;
    this.body.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    this.lfleg.render(f5);
    this.rfleg.render(f5);
    this.lrleg.render(f5);
    this.rrleg.render(f5);
    this.body2.render(f5);
    this.head.render(f5);
    this.nose.render(f5);
    this.lear.render(f5);
    this.rear.render(f5);
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
