package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelIsland extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  public ModelIsland(float f) {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.Shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 32, 0);
    this.Shape2.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.Shape2.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.7853982F, 0.7853982F, 0.7853982F);
    this.Shape3 = new ModelRenderer(this, 32, 16);
    this.Shape3.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.Shape3.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.7853982F, 0.7853982F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    newangle = MathHelper.cos(f2 * 0.05F * this.wingspeed) * 3.1415927F;
    this.Shape1.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.051F * this.wingspeed) * 3.1415927F;
    this.Shape1.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.052F * this.wingspeed) * 3.1415927F;
    this.Shape1.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.053F * this.wingspeed) * 3.1415927F;
    this.Shape2.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.054F * this.wingspeed) * 3.1415927F;
    this.Shape2.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.055F * this.wingspeed) * 3.1415927F;
    this.Shape2.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.056F * this.wingspeed) * 3.1415927F;
    this.Shape3.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.057F * this.wingspeed) * 3.1415927F;
    this.Shape3.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.058F * this.wingspeed) * 3.1415927F;
    this.Shape3.rotateAngleZ = newangle;
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
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
