package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRobot2 extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer rleg1;
  
  ModelRenderer rleg2;
  
  ModelRenderer Shape3;
  
  ModelRenderer lleg2;
  
  ModelRenderer lleg1;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer rarm3;
  
  ModelRenderer rarm2;
  
  ModelRenderer rarm1;
  
  ModelRenderer larm3;
  
  ModelRenderer larm2;
  
  ModelRenderer larm1;
  
  ModelRenderer head;
  
  public ModelRobot2(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 512;
    this.rleg1 = new ModelRenderer(this, 10, 250);
    this.rleg1.addBox(-14.0F, 24.0F, -7.0F, 16, 24, 16);
    this.rleg1.setRotationPoint(-10.0F, -24.0F, 0.0F);
    this.rleg1.setTextureSize(256, 512);
    this.rleg1.mirror = true;
    setRotation(this.rleg1, 0.0F, 0.0F, 0.0F);
    this.rleg2 = new ModelRenderer(this, 10, 150);
    this.rleg2.addBox(-12.0F, 0.0F, -6.0F, 12, 24, 12);
    this.rleg2.setRotationPoint(-10.0F, -24.0F, 1.0F);
    this.rleg2.setTextureSize(256, 512);
    this.rleg2.mirror = true;
    setRotation(this.rleg2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 10, 50);
    this.Shape3.addBox(-4.0F, 0.0F, -2.0F, 26, 8, 12);
    this.Shape3.setRotationPoint(-9.0F, -32.0F, -3.0F);
    this.Shape3.setTextureSize(256, 512);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.lleg2 = new ModelRenderer(this, 10, 200);
    this.lleg2.addBox(0.0F, 0.0F, -6.0F, 12, 24, 12);
    this.lleg2.setRotationPoint(10.0F, -24.0F, 1.0F);
    this.lleg2.setTextureSize(256, 512);
    this.lleg2.mirror = true;
    setRotation(this.lleg2, 0.0F, 0.0F, 0.0F);
    this.lleg1 = new ModelRenderer(this, 10, 300);
    this.lleg1.addBox(-2.0F, 24.0F, -7.0F, 16, 24, 16);
    this.lleg1.setRotationPoint(10.0F, -24.0F, 0.0F);
    this.lleg1.setTextureSize(256, 512);
    this.lleg1.mirror = true;
    setRotation(this.lleg1, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 10, 100);
    this.Shape6.addBox(-4.0F, -8.0F, -3.0F, 8, 8, 8);
    this.Shape6.setRotationPoint(0.0F, -32.0F, 0.0F);
    this.Shape6.setTextureSize(256, 512);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 10, 350);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 26, 8, 12);
    this.Shape7.setRotationPoint(-13.0F, -48.0F, -5.0F);
    this.Shape7.setTextureSize(256, 512);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 16, 400);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 44, 18, 14);
    this.Shape8.setRotationPoint(-22.0F, -66.0F, -6.0F);
    this.Shape8.setTextureSize(256, 512);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
    this.rarm3 = new ModelRenderer(this, 100, 100);
    this.rarm3.addBox(-16.0F, -16.0F, -7.0F, 16, 24, 17);
    this.rarm3.setRotationPoint(-22.0F, -58.0F, 0.0F);
    this.rarm3.setTextureSize(256, 512);
    this.rarm3.mirror = true;
    setRotation(this.rarm3, 0.0F, 0.0F, 0.0F);
    this.rarm2 = new ModelRenderer(this, 100, 200);
    this.rarm2.addBox(-14.0F, 8.0F, -5.0F, 12, 24, 12);
    this.rarm2.setRotationPoint(-22.0F, -58.0F, 0.0F);
    this.rarm2.setTextureSize(256, 512);
    this.rarm2.mirror = true;
    setRotation(this.rarm2, 0.0F, 0.0F, 0.0F);
    this.rarm1 = new ModelRenderer(this, 100, 300);
    this.rarm1.addBox(-14.0F, 32.0F, -5.0F, 12, 24, 12);
    this.rarm1.setRotationPoint(-22.0F, -58.0F, 0.0F);
    this.rarm1.setTextureSize(256, 512);
    this.rarm1.mirror = true;
    setRotation(this.rarm1, 0.0F, 0.0F, 0.0F);
    this.larm3 = new ModelRenderer(this, 100, 50);
    this.larm3.addBox(0.0F, -16.0F, -7.0F, 16, 24, 17);
    this.larm3.setRotationPoint(22.0F, -58.0F, 0.0F);
    this.larm3.setTextureSize(256, 512);
    this.larm3.mirror = true;
    setRotation(this.larm3, 0.0F, 0.0F, 0.0F);
    this.larm2 = new ModelRenderer(this, 100, 150);
    this.larm2.addBox(2.0F, 8.0F, -5.0F, 12, 24, 12);
    this.larm2.setRotationPoint(21.0F, -58.0F, 0.0F);
    this.larm2.setTextureSize(256, 512);
    this.larm2.mirror = true;
    setRotation(this.larm2, 0.0F, 0.0F, 0.0F);
    this.larm1 = new ModelRenderer(this, 100, 250);
    this.larm1.addBox(2.0F, 32.0F, -5.0F, 12, 24, 12);
    this.larm1.setRotationPoint(21.0F, -58.0F, 0.0F);
    this.larm1.setTextureSize(256, 512);
    this.larm1.mirror = true;
    setRotation(this.larm1, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 50, 10);
    this.head.addBox(-7.0F, -12.0F, -5.0F, 15, 12, 10);
    this.head.setRotationPoint(0.0F, -66.0F, 1.0F);
    this.head.setTextureSize(256, 512);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Robot2 e = (Robot2)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.12F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lleg1.rotateAngleX = newangle;
    this.lleg2.rotateAngleX = newangle;
    this.rleg1.rotateAngleX = -newangle;
    this.rleg2.rotateAngleX = -newangle;
    this.head.rotateAngleY = (float)Math.toRadians(f3);
    newangle = MathHelper.sin((float)Math.toRadians((f2 * 20.0F * this.wingspeed)));
    float nextangle = MathHelper.sin((float)Math.toRadians((f2 * 20.0F * this.wingspeed + 1.5F)));
    r = e.getRenderInfo();
    if (nextangle > 0.0F && newangle < 0.0F) {
      r.ri1 = 0;
      if (e.getAttacking() == 0) {
        r.ri1 = 0;
      } else {
        for (; r.ri1 == 0; r.ri1 = e.worldObj.rand.nextInt(4));
      } 
    } 
    newangle = (float)Math.toRadians((f2 * 20.0F * this.wingspeed));
    if (r.ri1 == 1 || r.ri1 == 3) {
      this.rarm1.rotateAngleX = newangle;
      this.rarm2.rotateAngleX = newangle;
      this.rarm3.rotateAngleX = newangle;
    } else {
      this.rarm1.rotateAngleX = 0.0F;
      this.rarm2.rotateAngleX = 0.0F;
      this.rarm3.rotateAngleX = 0.0F;
    } 
    if (r.ri1 == 2 || r.ri1 == 3) {
      this.larm1.rotateAngleX = newangle;
      this.larm2.rotateAngleX = newangle;
      this.larm3.rotateAngleX = newangle;
    } else {
      this.larm1.rotateAngleX = 0.0F;
      this.larm2.rotateAngleX = 0.0F;
      this.larm3.rotateAngleX = 0.0F;
    } 
    e.setRenderInfo(r);
    this.rleg1.render(f5);
    this.rleg2.render(f5);
    this.Shape3.render(f5);
    this.lleg2.render(f5);
    this.lleg1.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.rarm3.render(f5);
    this.rarm2.render(f5);
    this.rarm1.render(f5);
    this.larm3.render(f5);
    this.larm2.render(f5);
    this.larm1.render(f5);
    this.head.render(f5);
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
