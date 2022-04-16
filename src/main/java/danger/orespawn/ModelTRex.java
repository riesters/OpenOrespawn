package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTRex extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Shape18;
  
  ModelRenderer Shape19;
  
  ModelRenderer Shape20;
  
  ModelRenderer Shape21;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer jaw;
  
  ModelRenderer leftleg;
  
  ModelRenderer leftleg2;
  
  ModelRenderer leftleg3;
  
  ModelRenderer Shape11;
  
  ModelRenderer rightleg;
  
  ModelRenderer rightleg2;
  
  ModelRenderer rightleg3;
  
  ModelRenderer leftleg4;
  
  ModelRenderer rightleg4;
  
  ModelRenderer Shape17;
  
  ModelRenderer TailExtension;
  
  ModelRenderer Spine1;
  
  ModelRenderer Spine2;
  
  ModelRenderer Spine3;
  
  ModelRenderer Spine4;
  
  ModelRenderer Spine5;
  
  public ModelTRex(float f1) {
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.wingspeed = f1;
    this.Shape18 = new ModelRenderer(this, 91, 114);
    this.Shape18.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
    this.Shape18.setRotationPoint(3.3F, -25.0F, -23.0F);
    this.Shape18.setTextureSize(128, 128);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.5759587F, 0.0F, 0.5585054F);
    this.Shape19 = new ModelRenderer(this, 71, 114);
    this.Shape19.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
    this.Shape19.setRotationPoint(-4.0F, -24.0F, -23.0F);
    this.Shape19.setTextureSize(128, 128);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, 0.5759587F, 0.0F, -0.5585054F);
    this.Shape20 = new ModelRenderer(this, 91, 30);
    this.Shape20.addBox(0.0F, 0.0F, 0.0F, 2, 7, 5);
    this.Shape20.setRotationPoint(5.0F, -8.0F, -6.0F);
    this.Shape20.setTextureSize(128, 128);
    this.Shape20.mirror = true;
    setRotation(this.Shape20, 0.3839724F, 0.0F, 0.0F);
    this.Shape21 = new ModelRenderer(this, 93, 46);
    this.Shape21.addBox(-2.0F, 0.0F, 0.0F, 2, 7, 5);
    this.Shape21.setRotationPoint(-4.0F, -8.0F, -6.0F);
    this.Shape21.setTextureSize(128, 128);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, 0.3839724F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-7.0F, 0.0F, 0.0F, 10, 18, 31);
    this.Shape1.setRotationPoint(2.5F, -19.0F, -8.0F);
    this.Shape1.setTextureSize(128, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 62, 0);
    this.Shape2.addBox(-5.0F, 0.0F, 0.0F, 10, 11, 11);
    this.Shape2.setRotationPoint(0.5F, -19.0F, 23.0F);
    this.Shape2.setTextureSize(128, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 10, 54);
    this.Shape3.addBox(-3.0F, 0.0F, 0.0F, 7, 7, 25);
    this.Shape3.setRotationPoint(0.0F, -19.0F, 34.0F);
    this.Shape3.setTextureSize(128, 128);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 68, 88);
    this.Shape4.addBox(-5.0F, 0.0F, 0.0F, 8, 9, 16);
    this.Shape4.setRotationPoint(1.5F, -25.0F, -16.0F);
    this.Shape4.setTextureSize(128, 128);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, -0.4014257F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 75, 65);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 9, 9, 12);
    this.Shape5.setRotationPoint(-4.0F, -25.0F, -27.0F);
    this.Shape5.setTextureSize(128, 128);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 50);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 7, 9, 9);
    this.Shape6.setRotationPoint(-3.0F, -25.0F, -36.0F);
    this.Shape6.setTextureSize(128, 128);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 0, 86);
    this.jaw.addBox(-5.0F, 0.0F, -10.0F, 7, 1, 13);
    this.jaw.setRotationPoint(2.0F, -15.0F, -24.0F);
    this.jaw.setTextureSize(128, 128);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.5201081F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 0);
    this.leftleg.addBox(-1.0F, 0.0F, 0.0F, 3, 16, 10);
    this.leftleg.setRotationPoint(6.0F, -10.0F, 11.0F);
    this.leftleg.setTextureSize(128, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, -0.1745329F, 0.0F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 0, 106);
    this.leftleg2.addBox(-1.0F, 12.0F, -8.0F, 3, 15, 5);
    this.leftleg2.setRotationPoint(6.0F, -10.0F, 11.0F);
    this.leftleg2.setTextureSize(128, 128);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, 0.5061455F, 0.0F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 112, 89);
    this.leftleg3.addBox(-1.0F, 19.0F, 16.0F, 3, 9, 3);
    this.leftleg3.setRotationPoint(6.0F, -10.0F, 11.0F);
    this.leftleg3.setTextureSize(128, 128);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, -0.4014257F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 0, 72);
    this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2);
    this.Shape11.setRotationPoint(5.0F, -5.0F, -3.0F);
    this.Shape11.setTextureSize(128, 128);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, -0.5235988F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 54, 51);
    this.rightleg.addBox(0.0F, 0.0F, 0.0F, 3, 16, 10);
    this.rightleg.setRotationPoint(-7.0F, -10.0F, 11.0F);
    this.rightleg.setTextureSize(128, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, -0.1745329F, 0.0F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 23, 106);
    this.rightleg2.addBox(0.0F, 12.0F, -8.0F, 3, 15, 5);
    this.rightleg2.setRotationPoint(-7.0F, -10.0F, 11.0F);
    this.rightleg2.setTextureSize(128, 128);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, 0.5061455F, 0.0F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 70, 90);
    this.rightleg3.addBox(0.0F, 19.0F, 16.0F, 3, 9, 3);
    this.rightleg3.setRotationPoint(-7.0F, -10.0F, 11.0F);
    this.rightleg3.setTextureSize(128, 128);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, -0.4014257F, 0.0F, 0.0F);
    this.leftleg4 = new ModelRenderer(this, 42, 113);
    this.leftleg4.addBox(-1.0F, 31.0F, -1.0F, 3, 3, 8);
    this.leftleg4.setRotationPoint(6.0F, -10.0F, 11.0F);
    this.leftleg4.setTextureSize(128, 128);
    this.leftleg4.mirror = true;
    setRotation(this.leftleg4, 0.0F, 0.0F, 0.0F);
    this.rightleg4 = new ModelRenderer(this, 44, 93);
    this.rightleg4.addBox(0.0F, 31.0F, -1.0F, 3, 3, 8);
    this.rightleg4.setRotationPoint(-7.0F, -10.0F, 11.0F);
    this.rightleg4.setTextureSize(128, 128);
    this.rightleg4.mirror = true;
    setRotation(this.rightleg4, 0.0F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 112, 60);
    this.Shape17.addBox(-2.0F, 0.0F, 0.0F, 2, 10, 2);
    this.Shape17.setRotationPoint(-4.0F, -3.533333F, -3.0F);
    this.Shape17.setTextureSize(128, 128);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, -0.5235988F, 0.0F, 0.0F);
    this.TailExtension = new ModelRenderer(this, 0, 10);
    this.TailExtension.addBox(0.0F, 0.0F, 0.0F, 3, 3, 10);
    this.TailExtension.setRotationPoint(-1.0F, -19.0F, 59.0F);
    this.TailExtension.setTextureSize(128, 128);
    this.TailExtension.mirror = true;
    setRotation(this.TailExtension, 0.0F, 0.0F, 0.0F);
    this.Spine1 = new ModelRenderer(this, 73, 0);
    this.Spine1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.Spine1.setRotationPoint(-1.0F, -21.0F, 0.0F);
    this.Spine1.setTextureSize(128, 128);
    this.Spine1.mirror = true;
    setRotation(this.Spine1, 0.0F, 0.0F, 0.0F);
    this.Spine2 = new ModelRenderer(this, 73, 0);
    this.Spine2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.Spine2.setRotationPoint(-0.5F, -21.0F, 6.0F);
    this.Spine2.setTextureSize(128, 128);
    this.Spine2.mirror = true;
    setRotation(this.Spine2, 0.0F, 0.0F, 0.0F);
    this.Spine3 = new ModelRenderer(this, 73, 0);
    this.Spine3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.Spine3.setRotationPoint(-0.5F, -21.0F, 12.0F);
    this.Spine3.setTextureSize(128, 128);
    this.Spine3.mirror = true;
    setRotation(this.Spine3, 0.0F, 0.0F, 0.0F);
    this.Spine4 = new ModelRenderer(this, 73, 0);
    this.Spine4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.Spine4.setRotationPoint(-0.5F, -24.0F, -9.0F);
    this.Spine4.setTextureSize(128, 128);
    this.Spine4.mirror = true;
    setRotation(this.Spine4, -0.4014257F, 0.0F, 0.0F);
    this.Spine5 = new ModelRenderer(this, 73, 0);
    this.Spine5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.Spine5.setRotationPoint(-0.5F, -26.0F, -14.0F);
    this.Spine5.setTextureSize(128, 128);
    this.Spine5.mirror = true;
    setRotation(this.Spine5, -0.4014257F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    TRex e = (TRex)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.rightleg.rotateAngleX = -0.174F + newangle;
    this.rightleg2.rotateAngleX = 0.506F + newangle;
    this.rightleg3.rotateAngleX = -0.401F + newangle;
    this.rightleg4.rotateAngleX = newangle;
    this.leftleg.rotateAngleX = -0.174F - newangle;
    this.leftleg2.rotateAngleX = 0.506F - newangle;
    this.leftleg3.rotateAngleX = -0.401F - newangle;
    this.leftleg4.rotateAngleX = -newangle;
    if (e.getAttacking() != 0) {
      this.jaw.rotateAngleX = 0.52F + MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.18F;
    } else {
      this.jaw.rotateAngleX = 0.1F;
    } 
    this.Shape17.rotateAngleX = -0.523F + MathHelper.cos(f2 * 0.1F) * 3.1415927F * 0.05F;
    this.Shape11.rotateAngleX = -0.523F + MathHelper.cos(f2 * 0.1F) * 3.1415927F * 0.05F;
    this.Shape18.render(f5);
    this.Shape19.render(f5);
    this.Shape20.render(f5);
    this.Shape21.render(f5);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.jaw.render(f5);
    this.leftleg.render(f5);
    this.leftleg2.render(f5);
    this.leftleg3.render(f5);
    this.Shape11.render(f5);
    this.rightleg.render(f5);
    this.rightleg2.render(f5);
    this.rightleg3.render(f5);
    this.leftleg4.render(f5);
    this.rightleg4.render(f5);
    this.Shape17.render(f5);
    this.TailExtension.render(f5);
    this.Spine1.render(f5);
    this.Spine2.render(f5);
    this.Spine3.render(f5);
    this.Spine4.render(f5);
    this.Spine5.render(f5);
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
