package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRobot3 extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer rleg1;
  
  ModelRenderer lleg1;
  
  ModelRenderer rleg2;
  
  ModelRenderer lleg2;
  
  ModelRenderer hips;
  
  ModelRenderer waist1;
  
  ModelRenderer waist2;
  
  ModelRenderer body3;
  
  ModelRenderer lazer;
  
  ModelRenderer body2;
  
  ModelRenderer body1;
  
  ModelRenderer body4;
  
  ModelRenderer waist3;
  
  ModelRenderer larm3;
  
  ModelRenderer rarm3;
  
  ModelRenderer larm2;
  
  ModelRenderer rarm2;
  
  ModelRenderer larm1;
  
  ModelRenderer rarm1;
  
  public ModelRobot3(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.rleg1 = new ModelRenderer(this, 20, 100);
    this.rleg1.addBox(-23.0F, 26.0F, -8.0F, 16, 29, 16);
    this.rleg1.setRotationPoint(-9.0F, -31.0F, 0.0F);
    this.rleg1.setTextureSize(512, 512);
    this.rleg1.mirror = true;
    setRotation(this.rleg1, 0.0F, 0.0F, 0.0F);
    this.lleg1 = new ModelRenderer(this, 20, 159);
    this.lleg1.addBox(7.0F, 25.0F, -8.0F, 16, 29, 16);
    this.lleg1.setRotationPoint(9.0F, -30.0F, 0.0F);
    this.lleg1.setTextureSize(512, 512);
    this.lleg1.mirror = true;
    setRotation(this.lleg1, 0.0F, 0.0F, 0.0F);
    this.rleg2 = new ModelRenderer(this, 20, 212);
    this.rleg2.addBox(-14.0F, 0.0F, -7.0F, 14, 29, 14);
    this.rleg2.setRotationPoint(-9.0F, -31.0F, 0.0F);
    this.rleg2.setTextureSize(512, 512);
    this.rleg2.mirror = true;
    setRotation(this.rleg2, 0.0F, 0.0F, 0.2792527F);
    this.lleg2 = new ModelRenderer(this, 20, 265);
    this.lleg2.addBox(0.0F, 0.0F, -7.0F, 13, 29, 14);
    this.lleg2.setRotationPoint(9.0F, -31.0F, 0.0F);
    this.lleg2.setTextureSize(512, 512);
    this.lleg2.mirror = true;
    setRotation(this.lleg2, 0.0F, 0.0F, -0.2792527F);
    this.hips = new ModelRenderer(this, 20, 316);
    this.hips.addBox(0.0F, 0.0F, 0.0F, 18, 16, 16);
    this.hips.setRotationPoint(-9.0F, -43.0F, -8.0F);
    this.hips.setTextureSize(512, 512);
    this.hips.mirror = true;
    setRotation(this.hips, 0.0F, 0.0F, 0.0F);
    this.waist1 = new ModelRenderer(this, 20, 359);
    this.waist1.addBox(0.0F, 0.0F, 0.0F, 12, 12, 12);
    this.waist1.setRotationPoint(-6.0F, -55.0F, -4.0F);
    this.waist1.setTextureSize(512, 512);
    this.waist1.mirror = true;
    setRotation(this.waist1, -0.1F, 0.0F, 0.0F);
    this.waist2 = new ModelRenderer(this, 20, 391);
    this.waist2.addBox(0.0F, 0.0F, 0.0F, 12, 12, 12);
    this.waist2.setRotationPoint(-6.0F, -67.0F, -4.0F);
    this.waist2.setTextureSize(512, 512);
    this.waist2.mirror = true;
    setRotation(this.waist2, 0.0F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 20, 426);
    this.body3.addBox(-23.0F, -25.0F, 10.0F, 47, 47, 25);
    this.body3.setRotationPoint(0.0F, -88.0F, -10.0F);
    this.body3.setTextureSize(512, 512);
    this.body3.mirror = true;
    setRotation(this.body3, 0.2F, 0.0F, 0.0F);
    this.lazer = new ModelRenderer(this, 20, 50);
    this.lazer.addBox(-8.0F, -8.0F, -22.0F, 17, 16, 22);
    this.lazer.setRotationPoint(0.0F, -88.0F, -11.0F);
    this.lazer.setTextureSize(512, 512);
    this.lazer.mirror = true;
    setRotation(this.lazer, 0.4F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 101, 103);
    this.body2.addBox(9.0F, -24.0F, -12.0F, 15, 47, 47);
    this.body2.setRotationPoint(0.0F, -88.0F, -11.0F);
    this.body2.setTextureSize(512, 512);
    this.body2.mirror = true;
    setRotation(this.body2, 0.2F, 0.0F, 0.0F);
    this.body1 = new ModelRenderer(this, 101, 210);
    this.body1.addBox(-23.0F, -24.0F, -12.0F, 15, 47, 47);
    this.body1.setRotationPoint(0.0F, -88.0F, -11.0F);
    this.body1.setTextureSize(512, 512);
    this.body1.mirror = true;
    setRotation(this.body1, 0.2F, 0.0F, 0.0F);
    this.body4 = new ModelRenderer(this, 101, 321);
    this.body4.addBox(-8.0F, -24.0F, -12.0F, 18, 16, 22);
    this.body4.setRotationPoint(0.0F, -88.0F, -11.0F);
    this.body4.setTextureSize(512, 512);
    this.body4.mirror = true;
    setRotation(this.body4, 0.2F, 0.0F, 0.0F);
    this.waist3 = new ModelRenderer(this, 99, 375);
    this.waist3.addBox(0.0F, 0.0F, -1.0F, 12, 17, 12);
    this.waist3.setRotationPoint(-6.0F, -83.0F, -6.0F);
    this.waist3.setTextureSize(512, 512);
    this.waist3.mirror = true;
    setRotation(this.waist3, 0.2F, 0.0F, 0.0F);
    this.larm3 = new ModelRenderer(this, 121, 54);
    this.larm3.addBox(0.0F, -10.0F, -9.0F, 20, 18, 18);
    this.larm3.setRotationPoint(24.0F, -92.0F, 2.0F);
    this.larm3.setTextureSize(512, 512);
    this.larm3.mirror = true;
    setRotation(this.larm3, 1.0F, 0.0F, 0.0F);
    this.rarm3 = new ModelRenderer(this, 26, 8);
    this.rarm3.addBox(-20.0F, -9.0F, -9.0F, 20, 18, 18);
    this.rarm3.setRotationPoint(-23.0F, -92.0F, 2.0F);
    this.rarm3.setTextureSize(512, 512);
    this.rarm3.mirror = true;
    setRotation(this.rarm3, 1.0F, 0.0F, 0.0F);
    this.larm2 = new ModelRenderer(this, 207, 47);
    this.larm2.addBox(3.0F, 8.0F, -7.0F, 14, 29, 14);
    this.larm2.setRotationPoint(24.0F, -92.0F, 2.0F);
    this.larm2.setTextureSize(512, 512);
    this.larm2.mirror = true;
    setRotation(this.larm2, 1.0F, 0.0F, 0.0F);
    this.rarm2 = new ModelRenderer(this, 161, 372);
    this.rarm2.addBox(-17.0F, 9.0F, -7.0F, 14, 29, 14);
    this.rarm2.setRotationPoint(-23.0F, -92.0F, 2.0F);
    this.rarm2.setTextureSize(512, 512);
    this.rarm2.mirror = true;
    setRotation(this.rarm2, 1.0F, 0.0F, 0.0F);
    this.larm1 = new ModelRenderer(this, 185, 433);
    this.larm1.addBox(0.0F, -12.0F, 30.0F, 14, 37, 14);
    this.larm1.setRotationPoint(27.0F, -92.0F, 2.0F);
    this.larm1.setTextureSize(512, 512);
    this.larm1.mirror = true;
    setRotation(this.larm1, -1.0F, 0.0F, 0.0F);
    this.rarm1 = new ModelRenderer(this, 239, 105);
    this.rarm1.addBox(-17.0F, -12.0F, 30.0F, 14, 37, 14);
    this.rarm1.setRotationPoint(-23.0F, -92.0F, 2.0F);
    this.rarm1.setTextureSize(512, 512);
    this.rarm1.mirror = true;
    setRotation(this.rarm1, -1.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Robot3 e = (Robot3)entity;
    RenderInfo r = null;
    float newangle = 0.0F;
    float nextangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 0.55F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lleg1.rotateAngleX = newangle;
    this.lleg2.rotateAngleX = newangle;
    this.rleg1.rotateAngleX = -newangle;
    this.rleg2.rotateAngleX = -newangle;
    this.lazer.rotateAngleY = (float)Math.toRadians(f3 / 2.0D);
    r = e.getRenderInfo();
    newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
    nextangle = MathHelper.cos((f2 + 0.3F) * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
    if (nextangle > 0.0F && newangle < 0.0F) {
      r.ri1 = 0;
      if (e.getAttacking() != 0)
        r.ri1 = 1; 
    } 
    if (r.ri1 == 0)
      newangle = 0.0F; 
    this.rarm1.rotateAngleX = newangle - 1.0F;
    this.rarm2.rotateAngleX = newangle + 1.0F;
    this.rarm3.rotateAngleX = newangle + 1.0F;
    this.larm1.rotateAngleX = newangle - 1.0F;
    this.larm2.rotateAngleX = newangle + 1.0F;
    this.larm3.rotateAngleX = newangle + 1.0F;
    e.setRenderInfo(r);
    this.rleg1.render(f5);
    this.lleg1.render(f5);
    this.rleg2.render(f5);
    this.lleg2.render(f5);
    this.hips.render(f5);
    this.waist1.render(f5);
    this.waist2.render(f5);
    this.body3.render(f5);
    this.lazer.render(f5);
    this.body2.render(f5);
    this.body1.render(f5);
    this.body4.render(f5);
    this.waist3.render(f5);
    this.larm3.render(f5);
    this.rarm3.render(f5);
    this.larm2.render(f5);
    this.rarm2.render(f5);
    this.larm1.render(f5);
    this.rarm1.render(f5);
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
