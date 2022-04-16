package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrab extends ModelBase {
  ModelRenderer body1;
  
  ModelRenderer body2;
  
  ModelRenderer leg1;
  
  ModelRenderer body3;
  
  ModelRenderer body4;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer body5;
  
  ModelRenderer body6;
  
  ModelRenderer Leye1;
  
  ModelRenderer Reye1;
  
  ModelRenderer Leye2;
  
  ModelRenderer Reye2;
  
  ModelRenderer Lclaw1;
  
  ModelRenderer Lclaw2;
  
  ModelRenderer Lclaw3;
  
  ModelRenderer Lclaw4;
  
  ModelRenderer Lclaw5;
  
  ModelRenderer Rclaw1;
  
  ModelRenderer Rclaw2;
  
  ModelRenderer Rclaw3;
  
  ModelRenderer Rclaw4;
  
  ModelRenderer Rclaw5;
  
  ModelRenderer Rmouth;
  
  ModelRenderer Lmouth;
  
  public ModelCrab(float f) {
    this.textureWidth = 256;
    this.textureHeight = 512;
    this.body1 = new ModelRenderer(this, 0, 450);
    this.body1.addBox(-38.0F, -5.0F, -8.0F, 76, 10, 48);
    this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body1.setTextureSize(64, 32);
    this.body1.mirror = true;
    setRotation(this.body1, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 406);
    this.body2.addBox(-32.0F, -10.0F, -10.0F, 64, 5, 34);
    this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body2.setTextureSize(64, 32);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 128, 0);
    this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leg1.setRotationPoint(36.0F, 3.0F, 0.0F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, -1.343904F, -1.500983F, 0.0F);
    this.body3 = new ModelRenderer(this, 0, 357);
    this.body3.addBox(0.0F, 0.0F, 0.0F, 8, 4, 40);
    this.body3.setRotationPoint(38.0F, -5.0F, -6.0F);
    this.body3.setTextureSize(64, 32);
    this.body3.mirror = true;
    setRotation(this.body3, 0.0F, 0.0F, 0.0F);
    this.body4 = new ModelRenderer(this, 100, 357);
    this.body4.addBox(0.0F, 0.0F, 0.0F, 8, 4, 40);
    this.body4.setRotationPoint(-46.0F, -5.0F, -6.0F);
    this.body4.setTextureSize(64, 32);
    this.body4.mirror = true;
    setRotation(this.body4, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 128, 20);
    this.leg2.addBox(-1.0F, 10.0F, -6.0F, 3, 16, 3);
    this.leg2.setRotationPoint(36.0F, 3.0F, 0.0F);
    this.leg2.setTextureSize(256, 512);
    this.leg2.mirror = true;
    setRotation(this.leg2, -0.9599311F, -1.500983F, 0.0F);
    this.leg3 = new ModelRenderer(this, 128, 43);
    this.leg3.addBox(0.0F, 21.0F, -15.0F, 2, 16, 2);
    this.leg3.setRotationPoint(36.0F, 3.0F, 0.0F);
    this.leg3.setTextureSize(256, 512);
    this.leg3.mirror = true;
    setRotation(this.leg3, -0.5759587F, -1.500983F, 0.0F);
    this.body5 = new ModelRenderer(this, 0, 339);
    this.body5.addBox(-25.0F, 0.0F, 0.0F, 50, 4, 10);
    this.body5.setRotationPoint(0.0F, -4.0F, 40.0F);
    this.body5.setTextureSize(64, 32);
    this.body5.mirror = true;
    setRotation(this.body5, 0.0F, 0.0F, 0.0F);
    this.body6 = new ModelRenderer(this, 124, 342);
    this.body6.addBox(-14.0F, 0.0F, 0.0F, 28, 3, 4);
    this.body6.setRotationPoint(0.0F, -10.0F, -14.0F);
    this.body6.setTextureSize(64, 32);
    this.body6.mirror = true;
    setRotation(this.body6, 0.0F, 0.0F, 0.0F);
    this.Leye1 = new ModelRenderer(this, 62, 0);
    this.Leye1.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1);
    this.Leye1.setRotationPoint(9.0F, -9.0F, -11.0F);
    this.Leye1.setTextureSize(64, 32);
    this.Leye1.mirror = true;
    setRotation(this.Leye1, 0.0F, 0.0F, 0.4886922F);
    this.Reye1 = new ModelRenderer(this, 40, 0);
    this.Reye1.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1);
    this.Reye1.setRotationPoint(-9.0F, -9.0F, -11.0F);
    this.Reye1.setTextureSize(64, 32);
    this.Reye1.mirror = true;
    setRotation(this.Reye1, 0.0F, 0.0F, -0.4886922F);
    this.Leye2 = new ModelRenderer(this, 50, 0);
    this.Leye2.addBox(-1.0F, -14.0F, -1.0F, 2, 2, 2);
    this.Leye2.setRotationPoint(9.0F, -9.0F, -11.0F);
    this.Leye2.setTextureSize(64, 32);
    this.Leye2.mirror = true;
    setRotation(this.Leye2, 0.0F, 0.0F, 0.4886922F);
    this.Reye2 = new ModelRenderer(this, 26, 0);
    this.Reye2.addBox(-1.0F, -14.0F, -1.0F, 2, 2, 2);
    this.Reye2.setRotationPoint(-9.0F, -9.0F, -11.0F);
    this.Reye2.setTextureSize(64, 32);
    this.Reye2.mirror = true;
    setRotation(this.Reye2, 0.0F, 0.0F, -0.4886922F);
    this.Lclaw1 = new ModelRenderer(this, 0, 80);
    this.Lclaw1.addBox(-4.0F, 0.0F, -14.0F, 8, 4, 18);
    this.Lclaw1.setRotationPoint(31.0F, -2.0F, -8.0F);
    this.Lclaw1.setTextureSize(64, 32);
    this.Lclaw1.mirror = true;
    setRotation(this.Lclaw1, 0.0F, -0.4886922F, 0.0F);
    this.Lclaw2 = new ModelRenderer(this, 0, 105);
    this.Lclaw2.addBox(-7.0F, -3.0F, -12.0F, 17, 6, 16);
    this.Lclaw2.setRotationPoint(37.0F, 0.0F, -20.0F);
    this.Lclaw2.setTextureSize(64, 32);
    this.Lclaw2.mirror = true;
    setRotation(this.Lclaw2, 0.0F, -0.1745329F, 0.0F);
    this.Lclaw3 = new ModelRenderer(this, 0, 131);
    this.Lclaw3.addBox(0.0F, -5.0F, -25.0F, 17, 10, 30);
    this.Lclaw3.setRotationPoint(37.0F, 0.0F, -31.0F);
    this.Lclaw3.setTextureSize(64, 32);
    this.Lclaw3.mirror = true;
    setRotation(this.Lclaw3, 0.0F, -0.4537856F, 0.0F);
    this.Lclaw4 = new ModelRenderer(this, 0, 175);
    this.Lclaw4.addBox(2.0F, -3.0F, -32.0F, 11, 5, 12);
    this.Lclaw4.setRotationPoint(37.0F, 0.0F, -31.0F);
    this.Lclaw4.setTextureSize(64, 32);
    this.Lclaw4.mirror = true;
    setRotation(this.Lclaw4, 0.0F, -0.3490659F, 0.0F);
    this.Lclaw5 = new ModelRenderer(this, 0, 197);
    this.Lclaw5.addBox(-4.0F, -3.0F, -27.0F, 7, 5, 32);
    this.Lclaw5.setRotationPoint(36.0F, 0.0F, -31.0F);
    this.Lclaw5.setTextureSize(64, 32);
    this.Lclaw5.mirror = true;
    setRotation(this.Lclaw5, 0.0F, 0.3839724F, 0.0F);
    this.Rclaw1 = new ModelRenderer(this, 102, 78);
    this.Rclaw1.addBox(-4.0F, 0.0F, -14.0F, 8, 4, 18);
    this.Rclaw1.setRotationPoint(-31.0F, -2.0F, -8.0F);
    this.Rclaw1.setTextureSize(64, 32);
    this.Rclaw1.mirror = true;
    setRotation(this.Rclaw1, 0.0F, 0.4886922F, 0.0F);
    this.Rclaw2 = new ModelRenderer(this, 103, 106);
    this.Rclaw2.addBox(-10.0F, -3.0F, -12.0F, 17, 6, 16);
    this.Rclaw2.setRotationPoint(-37.0F, 0.0F, -20.0F);
    this.Rclaw2.setTextureSize(64, 32);
    this.Rclaw2.mirror = true;
    setRotation(this.Rclaw2, 0.0F, 0.1745329F, 0.0F);
    this.Rclaw3 = new ModelRenderer(this, 100, 131);
    this.Rclaw3.addBox(-17.0F, -5.0F, -25.0F, 17, 10, 30);
    this.Rclaw3.setRotationPoint(-37.0F, 0.0F, -31.0F);
    this.Rclaw3.setTextureSize(64, 32);
    this.Rclaw3.mirror = true;
    setRotation(this.Rclaw3, 0.0F, 0.4537856F, 0.0F);
    this.Rclaw4 = new ModelRenderer(this, 101, 175);
    this.Rclaw4.addBox(-13.0F, -3.0F, -32.0F, 11, 5, 12);
    this.Rclaw4.setRotationPoint(-37.0F, 0.0F, -31.0F);
    this.Rclaw4.setTextureSize(64, 32);
    this.Rclaw4.mirror = true;
    setRotation(this.Rclaw4, 0.0F, 0.3490659F, 0.0F);
    this.Rclaw5 = new ModelRenderer(this, 100, 197);
    this.Rclaw5.addBox(-4.0F, -3.0F, -27.0F, 7, 5, 32);
    this.Rclaw5.setRotationPoint(-36.0F, 0.0F, -31.0F);
    this.Rclaw5.setTextureSize(64, 32);
    this.Rclaw5.mirror = true;
    setRotation(this.Rclaw5, 0.0F, -0.3839724F, 0.0F);
    this.Rmouth = new ModelRenderer(this, 0, 28);
    this.Rmouth.addBox(0.0F, 0.0F, -0.5F, 6, 3, 1);
    this.Rmouth.setRotationPoint(-7.0F, 0.0F, -7.5F);
    this.Rmouth.setTextureSize(256, 512);
    this.Rmouth.mirror = true;
    setRotation(this.Rmouth, 0.0F, 0.3665191F, 0.0F);
    this.Lmouth = new ModelRenderer(this, 0, 19);
    this.Lmouth.addBox(-6.0F, 0.0F, -0.5F, 6, 3, 1);
    this.Lmouth.setRotationPoint(7.0F, 0.0F, -7.5F);
    this.Lmouth.setTextureSize(256, 512);
    this.Lmouth.mirror = true;
    setRotation(this.Lmouth, 0.0F, -0.3665191F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Crab e = (Crab)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.leg3.rotationPointX = 36.0F;
    this.leg3.rotationPointY = 3.0F;
    this.leg3.rotationPointZ = 0.0F;
    this.leg3.rotateAngleY = (float)(-1.5707963267948966D + (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 10.0F;
    this.leg3.rotateAngleY = (float)(-1.5707963267948966D - (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 20.0F;
    this.leg3.rotateAngleY = (float)(-1.5707963267948966D + (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 30.0F;
    this.leg3.rotateAngleY = (float)(-1.5707963267948966D - (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointX = -36.0F;
    this.leg3.rotationPointY = 3.0F;
    this.leg3.rotationPointZ = 0.0F;
    this.leg3.rotateAngleY = (float)-(-1.5707963267948966D + (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 10.0F;
    this.leg3.rotateAngleY = (float)-(-1.5707963267948966D - (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 20.0F;
    this.leg3.rotateAngleY = (float)-(-1.5707963267948966D + (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg3.rotationPointZ = 30.0F;
    this.leg3.rotateAngleY = (float)-(-1.5707963267948966D - (MathHelper.cos(f2 * 1.7F) * 3.1415927F * 0.15F * f1));
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    if (e.getAttacking() == 0) {
      this.Leye2.rotateAngleX = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.05F;
      this.Leye2.rotateAngleZ = 0.54F + MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.05F;
      this.Reye2.rotateAngleX = MathHelper.cos(f2 * 0.3F) * 3.1415927F * 0.05F;
      this.Reye2.rotateAngleZ = -0.54F + MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.05F;
      this.Lmouth.rotateAngleY = -0.72F + MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.05F;
      this.Rmouth.rotateAngleY = 0.72F - MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.05F;
      float newangle = MathHelper.cos(f2 * 0.15F) * 3.1415927F * 0.03F;
      this.Lclaw3.rotateAngleY = -0.453F + newangle;
      this.Lclaw4.rotateAngleY = -0.349F + newangle;
      this.Lclaw5.rotateAngleY = 0.384F - newangle;
      newangle = MathHelper.cos(f2 * 0.13F) * 3.1415927F * 0.02F;
      this.Rclaw3.rotateAngleY = 0.453F + newangle;
      this.Rclaw4.rotateAngleY = 0.349F + newangle;
      this.Rclaw5.rotateAngleY = -0.384F - newangle;
    } else {
      this.Leye2.rotateAngleX = MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.1F;
      this.Leye2.rotateAngleZ = 0.54F + MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.1F;
      this.Reye2.rotateAngleX = MathHelper.cos(f2 * 0.4F) * 3.1415927F * 0.1F;
      this.Reye2.rotateAngleZ = -0.54F + MathHelper.cos(f2 * 0.55F) * 3.1415927F * 0.1F;
      this.Lmouth.rotateAngleY = -0.72F + MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.15F;
      this.Rmouth.rotateAngleY = 0.72F - MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.15F;
      float newangle = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.13F;
      this.Lclaw3.rotateAngleY = -0.453F + newangle;
      this.Lclaw4.rotateAngleY = -0.349F + newangle;
      this.Lclaw5.rotateAngleY = 0.384F - newangle;
      newangle = MathHelper.cos(f2 * 0.43F) * 3.1415927F * 0.12F;
      this.Rclaw3.rotateAngleY = 0.453F + newangle;
      this.Rclaw4.rotateAngleY = 0.349F + newangle;
      this.Rclaw5.rotateAngleY = -0.384F - newangle;
    } 
    this.body1.render(f5);
    this.body2.render(f5);
    this.body3.render(f5);
    this.body4.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.body5.render(f5);
    this.body6.render(f5);
    this.Leye1.render(f5);
    this.Reye1.render(f5);
    this.Leye2.render(f5);
    this.Reye2.render(f5);
    this.Lclaw1.render(f5);
    this.Lclaw2.render(f5);
    this.Lclaw3.render(f5);
    this.Lclaw4.render(f5);
    this.Lclaw5.render(f5);
    this.Rclaw1.render(f5);
    this.Rclaw2.render(f5);
    this.Rclaw3.render(f5);
    this.Rclaw4.render(f5);
    this.Rclaw5.render(f5);
    this.Rmouth.render(f5);
    this.Lmouth.render(f5);
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
