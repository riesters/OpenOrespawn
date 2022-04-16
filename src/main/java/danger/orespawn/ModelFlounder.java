package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFlounder extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer head;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer rfin;
  
  ModelRenderer lfin;
  
  public ModelFlounder() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 16);
    this.body.addBox(-4.0F, 0.0F, -5.0F, 8, 1, 12);
    this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 5);
    this.head.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 2);
    this.head.setRotationPoint(0.0F, 22.0F, -7.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 30, 0);
    this.tail1.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 2);
    this.tail1.setRotationPoint(0.0F, 22.0F, 7.0F);
    this.tail1.setTextureSize(64, 32);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 30, 4);
    this.tail2.addBox(-3.0F, 0.0F, 2.0F, 6, 1, 3);
    this.tail2.setRotationPoint(0.0F, 22.0F, 7.0F);
    this.tail2.setTextureSize(64, 32);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.rfin = new ModelRenderer(this, 12, 0);
    this.rfin.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 2);
    this.rfin.setRotationPoint(-4.0F, 22.0F, -2.0F);
    this.rfin.setTextureSize(64, 32);
    this.rfin.mirror = true;
    setRotation(this.rfin, 0.0F, 0.0F, 0.0F);
    this.lfin = new ModelRenderer(this, 0, 0);
    this.lfin.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
    this.lfin.setRotationPoint(4.0F, 22.0F, -2.0F);
    this.lfin.setTextureSize(64, 32);
    this.lfin.mirror = true;
    setRotation(this.lfin, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle, newangle2;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F) * 3.1415927F * 0.25F * f1;
      newangle2 = MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
      newangle2 = 0.0F;
    } 
    this.lfin.rotateAngleZ = newangle;
    this.rfin.rotateAngleZ = newangle2;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.2F) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = MathHelper.cos(f2 * 0.7F) * 3.1415927F * 0.05F;
    } 
    this.tail2.rotateAngleX = newangle;
    this.body.render(f5);
    this.head.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    this.rfin.render(f5);
    this.lfin.render(f5);
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
