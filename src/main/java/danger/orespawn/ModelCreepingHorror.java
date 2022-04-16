package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCreepingHorror extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg1part2;
  
  ModelRenderer leg2;
  
  ModelRenderer leg2part2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg3part2;
  
  ModelRenderer leg4;
  
  ModelRenderer leg4part2;
  
  ModelRenderer tailseg1;
  
  ModelRenderer tailseg2;
  
  ModelRenderer tailseg3;
  
  ModelRenderer pincer1;
  
  ModelRenderer pincer1part2;
  
  ModelRenderer pincer2;
  
  ModelRenderer pincer2part2;
  
  ModelRenderer spike1;
  
  ModelRenderer spike2;
  
  ModelRenderer spike3;
  
  ModelRenderer spike4;
  
  ModelRenderer spike5;
  
  ModelRenderer insides1;
  
  ModelRenderer insides2;
  
  ModelRenderer insides3;
  
  ModelRenderer insides4;
  
  ModelRenderer insides5;
  
  public ModelCreepingHorror() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.body = new ModelRenderer(this, 0, 30);
    this.body.addBox(-4.0F, -5.0F, -4.0F, 8, 8, 8);
    this.body.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.body.setTextureSize(128, 128);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 65, 0);
    this.leg1.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
    this.leg1.setRotationPoint(4.0F, 18.0F, -2.0F);
    this.leg1.setTextureSize(128, 128);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.5759587F, 0.1919862F);
    this.leg1part2 = new ModelRenderer(this, 37, 5);
    this.leg1part2.addBox(13.01F, -1.01F, -1.0F, 2, 5, 2);
    this.leg1part2.setRotationPoint(4.0F, 18.0F, -2.0F);
    this.leg1part2.setTextureSize(128, 128);
    this.leg1part2.mirror = true;
    setRotation(this.leg1part2, 0.0F, 0.5759587F, 0.1919862F);
    this.leg2 = new ModelRenderer(this, 65, 0);
    this.leg2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
    this.leg2.setRotationPoint(4.0F, 18.0F, 2.0F);
    this.leg2.setTextureSize(128, 128);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, -0.5759587F, 0.1919862F);
    this.leg2part2 = new ModelRenderer(this, 37, 5);
    this.leg2part2.addBox(13.01F, -1.01F, -1.0F, 2, 5, 2);
    this.leg2part2.setRotationPoint(4.0F, 18.0F, 2.0F);
    this.leg2part2.setTextureSize(128, 128);
    this.leg2part2.mirror = true;
    setRotation(this.leg2part2, 0.0F, -0.5759587F, 0.1919862F);
    this.leg3 = new ModelRenderer(this, 28, 0);
    this.leg3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
    this.leg3.setRotationPoint(-4.0F, 18.0F, -2.0F);
    this.leg3.setTextureSize(128, 128);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, -0.5759587F, -0.1919862F);
    this.leg3part2 = new ModelRenderer(this, 28, 5);
    this.leg3part2.addBox(-15.01F, -1.01F, -1.0F, 2, 5, 2);
    this.leg3part2.setRotationPoint(-4.0F, 18.0F, -2.0F);
    this.leg3part2.setTextureSize(128, 128);
    this.leg3part2.mirror = true;
    setRotation(this.leg3part2, 0.0F, -0.5759587F, -0.1919862F);
    this.leg4 = new ModelRenderer(this, 28, 0);
    this.leg4.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
    this.leg4.setRotationPoint(-4.0F, 18.0F, 2.0F);
    this.leg4.setTextureSize(128, 128);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.5759587F, -0.1919862F);
    this.leg4part2 = new ModelRenderer(this, 28, 5);
    this.leg4part2.addBox(-15.01F, -1.01F, -1.0F, 2, 5, 2);
    this.leg4part2.setRotationPoint(-4.0F, 18.0F, 2.0F);
    this.leg4part2.setTextureSize(128, 128);
    this.leg4part2.mirror = true;
    setRotation(this.leg4part2, 0.0F, 0.5759587F, -0.1919862F);
    this.tailseg1 = new ModelRenderer(this, 0, 13);
    this.tailseg1.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 7);
    this.tailseg1.setRotationPoint(0.0F, 17.0F, 3.0F);
    this.tailseg1.setTextureSize(128, 128);
    this.tailseg1.mirror = true;
    setRotation(this.tailseg1, -0.5576792F, 0.0F, 0.0F);
    this.tailseg2 = new ModelRenderer(this, 0, 0);
    this.tailseg2.addBox(-1.0F, 3.0F, 7.0F, 2, 1, 11);
    this.tailseg2.setRotationPoint(0.0F, 17.0F, 3.0F);
    this.tailseg2.setTextureSize(128, 128);
    this.tailseg2.mirror = true;
    setRotation(this.tailseg2, -0.0349066F, 0.0F, 0.0F);
    this.tailseg3 = new ModelRenderer(this, 0, 24);
    this.tailseg3.addBox(-1.5F, 1.0F, 6.0F, 3, 2, 2);
    this.tailseg3.setRotationPoint(0.0F, 17.0F, 3.0F);
    this.tailseg3.setTextureSize(128, 128);
    this.tailseg3.mirror = true;
    setRotation(this.tailseg3, -0.2230717F, 0.0F, 0.0F);
    this.pincer1 = new ModelRenderer(this, 26, 30);
    this.pincer1.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.pincer1.setRotationPoint(-3.0F, 19.0F, -3.0F);
    this.pincer1.setTextureSize(128, 128);
    this.pincer1.mirror = true;
    setRotation(this.pincer1, 0.0F, -0.2230717F, 0.0F);
    this.pincer1part2 = new ModelRenderer(this, 26, 30);
    this.pincer1part2.addBox(-0.5F, -0.5F, -5.01F, 2, 1, 0);
    this.pincer1part2.setRotationPoint(-3.0F, 19.0F, -3.0F);
    this.pincer1part2.setTextureSize(128, 128);
    this.pincer1part2.mirror = true;
    setRotation(this.pincer1part2, 0.0F, -0.2230717F, 0.0F);
    this.pincer2 = new ModelRenderer(this, 26, 30);
    this.pincer2.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.pincer2.setRotationPoint(3.0F, 19.0F, -3.0F);
    this.pincer2.setTextureSize(128, 128);
    this.pincer2.mirror = true;
    setRotation(this.pincer2, 0.0F, 0.2230705F, 0.0F);
    this.pincer2part2 = new ModelRenderer(this, 26, 28);
    this.pincer2part2.addBox(-1.5F, -0.5F, -5.01F, 2, 1, 0);
    this.pincer2part2.setRotationPoint(3.0F, 19.0F, -3.0F);
    this.pincer2part2.setTextureSize(128, 128);
    this.pincer2part2.mirror = true;
    setRotation(this.pincer2part2, 0.0F, 0.2230705F, 0.0F);
    this.spike1 = new ModelRenderer(this, 26, 13);
    this.spike1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
    this.spike1.setRotationPoint(-3.0F, 16.0F, -2.0F);
    this.spike1.setTextureSize(128, 128);
    this.spike1.mirror = true;
    setRotation(this.spike1, 0.7063936F, -0.2602503F, 0.0F);
    this.spike2 = new ModelRenderer(this, 26, 13);
    this.spike2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
    this.spike2.setRotationPoint(-1.0F, 16.0F, 1.0F);
    this.spike2.setTextureSize(128, 128);
    this.spike2.mirror = true;
    setRotation(this.spike2, 0.7063936F, -0.111544F, 0.0F);
    this.spike3 = new ModelRenderer(this, 26, 13);
    this.spike3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
    this.spike3.setRotationPoint(1.0F, 16.0F, 1.0F);
    this.spike3.setTextureSize(128, 128);
    this.spike3.mirror = true;
    setRotation(this.spike3, 0.7063936F, 0.1115358F, 0.0F);
    this.spike4 = new ModelRenderer(this, 26, 13);
    this.spike4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
    this.spike4.setRotationPoint(3.0F, 16.0F, -2.0F);
    this.spike4.setTextureSize(128, 128);
    this.spike4.mirror = true;
    setRotation(this.spike4, 0.7063936F, 0.260246F, 0.0F);
    this.spike5 = new ModelRenderer(this, 26, 13);
    this.spike5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
    this.spike5.setRotationPoint(0.0F, 16.0F, -3.0F);
    this.spike5.setTextureSize(128, 128);
    this.spike5.mirror = true;
    setRotation(this.spike5, 0.7063936F, 0.0F, 0.0F);
    this.insides1 = new ModelRenderer(this, 0, 30);
    this.insides1.addBox(-2.0F, -3.0F, -3.0F, 4, 4, 0);
    this.insides1.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.insides1.setTextureSize(128, 128);
    this.insides1.mirror = true;
    setRotation(this.insides1, 0.0F, 0.0F, 0.0F);
    this.insides2 = new ModelRenderer(this, -1, 29);
    this.insides2.addBox(-2.0F, -3.0F, -4.0F, 4, 0, 1);
    this.insides2.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.insides2.setTextureSize(128, 128);
    this.insides2.mirror = true;
    setRotation(this.insides2, 0.0F, 0.0F, 0.0F);
    this.insides3 = new ModelRenderer(this, -1, 29);
    this.insides3.addBox(-2.0F, 1.0F, -4.0F, 4, 0, 1);
    this.insides3.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.insides3.setTextureSize(128, 128);
    this.insides3.mirror = true;
    setRotation(this.insides3, 0.0F, 0.0F, 0.0F);
    this.insides4 = new ModelRenderer(this, 0, 29);
    this.insides4.addBox(-2.0F, -3.0F, -4.0F, 0, 4, 1);
    this.insides4.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.insides4.setTextureSize(128, 128);
    this.insides4.mirror = true;
    setRotation(this.insides4, 0.0F, 0.0F, 0.0F);
    this.insides5 = new ModelRenderer(this, 0, 29);
    this.insides5.addBox(2.0F, -3.0F, -4.0F, 0, 4, 1);
    this.insides5.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.insides5.setTextureSize(128, 128);
    this.insides5.mirror = true;
    setRotation(this.insides5, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = MathHelper.cos(f2 * 1.25F) * 3.1415927F * 0.35F * f1;
    this.leg1.rotateAngleY = 0.576F + newangle;
    this.leg1part2.rotateAngleY = this.leg1.rotateAngleY;
    this.leg2.rotateAngleY = -0.576F - newangle;
    this.leg2part2.rotateAngleY = this.leg2.rotateAngleY;
    this.leg3.rotateAngleY = -0.576F - newangle;
    this.leg3part2.rotateAngleY = this.leg3.rotateAngleY;
    this.leg4.rotateAngleY = 0.576F + newangle;
    this.leg4part2.rotateAngleY = this.leg4.rotateAngleY;
    newangle = MathHelper.cos(f2 * 0.48F) * 3.1415927F * 0.15F;
    this.pincer1.rotateAngleY = newangle;
    this.pincer1part2.rotateAngleY = newangle;
    this.pincer2.rotateAngleY = -newangle;
    this.pincer2part2.rotateAngleY = -newangle;
    newangle = MathHelper.cos(f2 * 0.11F) * 3.1415927F * 0.25F;
    newangle = Math.abs(newangle);
    this.tailseg1.rotateAngleX = -0.55F + newangle;
    this.tailseg3.rotateAngleX = -0.22F + newangle;
    this.tailseg2.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.81F) * 3.1415927F * 0.08F;
    this.spike1.rotateAngleX = 0.7F + newangle;
    newangle = MathHelper.cos(f2 * 0.87F) * 3.1415927F * 0.08F;
    this.spike2.rotateAngleX = 0.7F + newangle;
    newangle = MathHelper.cos(f2 * 0.99F) * 3.1415927F * 0.08F;
    this.spike3.rotateAngleX = 0.7F + newangle;
    newangle = MathHelper.cos(f2 * 0.103F) * 3.1415927F * 0.08F;
    this.spike4.rotateAngleX = 0.7F + newangle;
    newangle = MathHelper.cos(f2 * 0.107F) * 3.1415927F * 0.08F;
    this.spike5.rotateAngleX = 0.7F + newangle;
    newangle = MathHelper.cos(f2 * 1.11F) * 3.1415927F * 0.08F;
    this.spike1.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 1.17F) * 3.1415927F * 0.08F;
    this.spike2.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 1.25F) * 3.1415927F * 0.08F;
    this.spike3.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 1.28F) * 3.1415927F * 0.08F;
    this.spike4.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 1.31F) * 3.1415927F * 0.08F;
    this.spike5.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 1.41F) * 3.1415927F * 0.08F;
    this.spike1.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 1.47F) * 3.1415927F * 0.08F;
    this.spike2.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 1.55F) * 3.1415927F * 0.08F;
    this.spike3.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 1.58F) * 3.1415927F * 0.08F;
    this.spike4.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 1.61F) * 3.1415927F * 0.08F;
    this.spike5.rotateAngleZ = newangle;
    this.body.render(f5);
    this.leg1.render(f5);
    this.leg1part2.render(f5);
    this.leg2.render(f5);
    this.leg2part2.render(f5);
    this.leg3.render(f5);
    this.leg3part2.render(f5);
    this.leg4.render(f5);
    this.leg4part2.render(f5);
    this.tailseg1.render(f5);
    this.tailseg2.render(f5);
    this.tailseg3.render(f5);
    this.pincer1.render(f5);
    this.pincer1part2.render(f5);
    this.pincer2.render(f5);
    this.pincer2part2.render(f5);
    this.spike1.render(f5);
    this.spike2.render(f5);
    this.spike3.render(f5);
    this.spike4.render(f5);
    this.spike5.render(f5);
    this.insides1.render(f5);
    this.insides2.render(f5);
    this.insides3.render(f5);
    this.insides4.render(f5);
    this.insides5.render(f5);
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
