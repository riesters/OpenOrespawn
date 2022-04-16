package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWormSmall extends ModelBase {
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer tail;
  
  public ModelWormSmall() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
    this.head.setRotationPoint(0.0F, 14.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 6, 0);
    this.body.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
    this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 12, 0);
    this.tail.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
    this.tail.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = MathHelper.cos(f2 * 0.55F) * 3.1415927F * 0.15F;
    this.tail.rotateAngleX = newangle;
    float d1 = (float)(Math.sin(newangle) * 5.0D);
    float d2 = (float)(Math.cos(newangle) * 5.0D);
    this.tail.rotationPointZ -= d1;
    newangle = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.1F;
    this.tail.rotateAngleZ = newangle;
    float d3 = (float)(Math.cos(newangle) * d2);
    float d4 = (float)(Math.sin(newangle) * d2);
    this.tail.rotationPointX += d4;
    this.body.rotationPointY = (float)(this.tail.rotationPointY - 5.0D + 5.0D - d3);
    newangle = MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.15F;
    this.body.rotateAngleX = newangle;
    d1 = (float)(Math.sin(newangle) * 5.0D);
    d2 = (float)(Math.cos(newangle) * 5.0D);
    this.body.rotationPointZ -= d1;
    newangle = MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.1F;
    this.body.rotateAngleZ = newangle;
    d3 = (float)(Math.cos(newangle) * d2);
    d4 = (float)(Math.sin(newangle) * d2);
    this.body.rotationPointX += d4;
    this.head.rotationPointY = (float)(this.body.rotationPointY - 5.0D + 5.0D - d3);
    this.head.rotateAngleX = 0.62F + MathHelper.cos(f2 * 0.65F) * 3.1415927F * 0.15F;
    this.head.rotateAngleZ = MathHelper.cos(f2 * 0.3F) * 3.1415927F * 0.05F;
    this.head.render(f5);
    this.body.render(f5);
    this.tail.render(f5);
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
