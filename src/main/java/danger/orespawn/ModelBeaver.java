package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBeaver extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer head;
  
  ModelRenderer nose;
  
  ModelRenderer teeth;
  
  ModelRenderer body;
  
  ModelRenderer tail;
  
  ModelRenderer rff;
  
  ModelRenderer lff;
  
  ModelRenderer rrf;
  
  ModelRenderer lrf;
  
  public ModelBeaver(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.head = new ModelRenderer(this, 0, 3);
    this.head.addBox(0.0F, 0.0F, 0.0F, 6, 5, 5);
    this.head.setRotationPoint(0.0F, 15.0F, -8.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 6, 0);
    this.nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
    this.nose.setRotationPoint(2.0F, 18.0F, -8.5F);
    this.nose.setTextureSize(64, 32);
    this.nose.mirror = true;
    setRotation(this.nose, 0.0F, 0.0F, 0.0F);
    this.teeth = new ModelRenderer(this, 0, 0);
    this.teeth.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.teeth.setRotationPoint(2.0F, 19.0F, -8.2F);
    this.teeth.setTextureSize(64, 32);
    this.teeth.mirror = true;
    setRotation(this.teeth, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 0, 13);
    this.body.addBox(0.0F, 0.0F, 0.0F, 8, 8, 10);
    this.body.setRotationPoint(-1.0F, 14.0F, -3.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 22, 0);
    this.tail.addBox(0.0F, -1.0F, 0.0F, 5, 1, 8);
    this.tail.setRotationPoint(0.5F, 21.0F, 7.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0F, 0.0F, 0.0F);
    this.rff = new ModelRenderer(this, 22, 9);
    this.rff.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.rff.setRotationPoint(-0.5F, 22.0F, -2.5F);
    this.rff.setTextureSize(64, 32);
    this.rff.mirror = true;
    setRotation(this.rff, 0.0F, 0.0F, 0.0F);
    this.lff = new ModelRenderer(this, 22, 9);
    this.lff.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.lff.setRotationPoint(4.5F, 22.0F, -2.5F);
    this.lff.setTextureSize(64, 32);
    this.lff.mirror = true;
    setRotation(this.lff, 0.0F, 0.0F, 0.0F);
    this.rrf = new ModelRenderer(this, 22, 9);
    this.rrf.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.rrf.setRotationPoint(-0.5F, 22.0F, 4.5F);
    this.rrf.setTextureSize(64, 32);
    this.rrf.mirror = true;
    setRotation(this.rrf, 0.0F, 0.0F, 0.0F);
    this.lrf = new ModelRenderer(this, 22, 9);
    this.lrf.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.lrf.setRotationPoint(4.5F, 22.0F, 4.5F);
    this.lrf.setTextureSize(64, 32);
    this.lrf.mirror = true;
    setRotation(this.lrf, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * 3.7F * this.wingspeed) * 3.1415927F * 0.45F * f1;
    this.lrf.rotateAngleX = newangle;
    this.rrf.rotateAngleX = -newangle;
    newangle = MathHelper.cos(f2 * 2.7F * this.wingspeed) * 3.1415927F * 0.25F;
    this.teeth.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.05F;
    this.tail.rotateAngleX = newangle;
    this.head.render(f5);
    this.nose.render(f5);
    this.teeth.render(f5);
    this.body.render(f5);
    this.tail.render(f5);
    this.rff.render(f5);
    this.lff.render(f5);
    this.rrf.render(f5);
    this.lrf.render(f5);
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
