package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAntRobot extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Leg1;
  
  ModelRenderer Leg2;
  
  ModelRenderer Leg3;
  
  ModelRenderer Foot1;
  
  ModelRenderer Foot2;
  
  ModelRenderer Foot3;
  
  ModelRenderer Foot4;
  
  ModelRenderer Foot5;
  
  ModelRenderer Foot6;
  
  ModelRenderer Foot7;
  
  ModelRenderer Body;
  
  ModelRenderer Abdomen;
  
  ModelRenderer Head;
  
  ModelRenderer Jet1;
  
  ModelRenderer Jet2;
  
  ModelRenderer Hip1;
  
  ModelRenderer Hip2;
  
  ModelRenderer LJaw1;
  
  ModelRenderer RJaw1;
  
  ModelRenderer LJaw2;
  
  ModelRenderer RJaw2;
  
  ModelRenderer LAntenna;
  
  ModelRenderer RAntenna;
  
  ModelRenderer Hip3;
  
  ModelRenderer Hip4;
  
  ModelRenderer Hip5;
  
  ModelRenderer Hip6;
  
  public ModelAntRobot(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 256;
    this.Leg1 = new ModelRenderer(this, 19, 40);
    this.Leg1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 50);
    this.Leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Leg1.setTextureSize(64, 32);
    this.Leg1.mirror = true;
    setRotation(this.Leg1, 0.7853982F, 0.0F, 0.0F);
    this.Leg2 = new ModelRenderer(this, 19, 41);
    this.Leg2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 50);
    this.Leg2.setRotationPoint(0.0F, -35.0F, 35.0F);
    this.Leg2.setTextureSize(64, 32);
    this.Leg2.mirror = true;
    setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
    this.Leg3 = new ModelRenderer(this, 20, 42);
    this.Leg3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 50);
    this.Leg3.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Leg3.setTextureSize(64, 32);
    this.Leg3.mirror = true;
    setRotation(this.Leg3, -0.7853982F, 0.0F, 0.0F);
    this.Foot1 = new ModelRenderer(this, 28, 0);
    this.Foot1.addBox(-2.5F, -0.5F, 50.0F, 5, 1, 2);
    this.Foot1.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot1.setTextureSize(64, 32);
    this.Foot1.mirror = true;
    setRotation(this.Foot1, -0.7853982F, 0.0F, 0.0F);
    this.Foot2 = new ModelRenderer(this, 30, 4);
    this.Foot2.addBox(1.5F, -0.5F, 52.0F, 1, 1, 3);
    this.Foot2.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot2.setTextureSize(64, 32);
    this.Foot2.mirror = true;
    setRotation(this.Foot2, -0.7853982F, 0.0F, 0.0F);
    this.Foot3 = new ModelRenderer(this, 44, 0);
    this.Foot3.addBox(-0.5F, -0.5F, 52.0F, 1, 1, 5);
    this.Foot3.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot3.setTextureSize(64, 32);
    this.Foot3.mirror = true;
    setRotation(this.Foot3, -0.7853982F, 0.0F, 0.0F);
    this.Foot4 = new ModelRenderer(this, 30, 9);
    this.Foot4.addBox(-2.5F, -0.5F, 52.0F, 1, 1, 3);
    this.Foot4.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot4.setTextureSize(64, 32);
    this.Foot4.mirror = true;
    setRotation(this.Foot4, -0.7853982F, 0.0F, 0.0F);
    this.Foot5 = new ModelRenderer(this, 40, 8);
    this.Foot5.addBox(-0.5F, -2.5F, 50.0F, 1, 5, 2);
    this.Foot5.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot5.setTextureSize(64, 32);
    this.Foot5.mirror = true;
    setRotation(this.Foot5, -0.7853982F, 0.0F, 0.0F);
    this.Foot6 = new ModelRenderer(this, 48, 9);
    this.Foot6.addBox(-0.5F, -2.5F, 52.0F, 1, 1, 2);
    this.Foot6.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot6.setTextureSize(64, 32);
    this.Foot6.mirror = true;
    setRotation(this.Foot6, -0.7853982F, 0.0F, 0.0F);
    this.Foot7 = new ModelRenderer(this, 48, 14);
    this.Foot7.addBox(-0.5F, 1.5F, 52.0F, 1, 1, 2);
    this.Foot7.setRotationPoint(0.0F, -35.0F, 85.0F);
    this.Foot7.setTextureSize(64, 32);
    this.Foot7.mirror = true;
    setRotation(this.Foot7, -0.7853982F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 0, 151);
    this.Body.addBox(-11.0F, 0.0F, -16.0F, 22, 14, 32);
    this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Body.setTextureSize(64, 32);
    this.Body.mirror = true;
    setRotation(this.Body, 0.0F, 0.0F, 0.0F);
    this.Abdomen = new ModelRenderer(this, 0, 199);
    this.Abdomen.addBox(-15.0F, -10.0F, 16.0F, 30, 22, 34);
    this.Abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Abdomen.setTextureSize(64, 32);
    this.Abdomen.mirror = true;
    setRotation(this.Abdomen, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 0, 120);
    this.Head.addBox(-7.0F, 4.0F, -34.0F, 14, 11, 18);
    this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Jet1 = new ModelRenderer(this, 78, 0);
    this.Jet1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 18);
    this.Jet1.setRotationPoint(8.0F, -12.0F, 35.0F);
    this.Jet1.setTextureSize(64, 32);
    this.Jet1.mirror = true;
    setRotation(this.Jet1, 0.0F, 0.0F, 0.0F);
    this.Jet2 = new ModelRenderer(this, 78, 0);
    this.Jet2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 18);
    this.Jet2.setRotationPoint(-14.0F, -12.0F, 35.0F);
    this.Jet2.setTextureSize(64, 32);
    this.Jet2.mirror = true;
    setRotation(this.Jet2, 0.0F, 0.0F, 0.0F);
    this.Hip1 = new ModelRenderer(this, 0, 96);
    this.Hip1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip1.setRotationPoint(11.0F, 9.0F, -3.0F);
    this.Hip1.setTextureSize(128, 256);
    this.Hip1.mirror = true;
    setRotation(this.Hip1, 0.0F, 0.0F, 0.0F);
    this.Hip2 = new ModelRenderer(this, 0, 96);
    this.Hip2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip2.setRotationPoint(-17.0F, 9.0F, -3.0F);
    this.Hip2.setTextureSize(128, 256);
    this.Hip2.mirror = true;
    setRotation(this.Hip2, 0.0F, 0.0F, 0.0F);
    this.LJaw1 = new ModelRenderer(this, 0, 33);
    this.LJaw1.addBox(-2.0F, 0.0F, -2.0F, 17, 1, 4);
    this.LJaw1.setRotationPoint(5.0F, 13.0F, -33.0F);
    this.LJaw1.setTextureSize(128, 256);
    this.LJaw1.mirror = true;
    setRotation(this.LJaw1, 0.0F, 0.8901179F, 0.0F);
    this.RJaw1 = new ModelRenderer(this, 0, 33);
    this.RJaw1.addBox(-2.0F, 0.0F, -2.0F, 17, 1, 4);
    this.RJaw1.setRotationPoint(-5.0F, 13.0F, -33.0F);
    this.RJaw1.setTextureSize(128, 256);
    this.RJaw1.mirror = true;
    setRotation(this.RJaw1, 0.0F, 2.216568F, 0.0F);
    this.LJaw2 = new ModelRenderer(this, 0, 27);
    this.LJaw2.addBox(12.0F, 0.0F, 5.0F, 17, 1, 3);
    this.LJaw2.setRotationPoint(5.0F, 13.0F, -33.0F);
    this.LJaw2.setTextureSize(128, 256);
    this.LJaw2.mirror = true;
    setRotation(this.LJaw2, 0.0F, 1.37881F, 0.0F);
    this.RJaw2 = new ModelRenderer(this, 0, 27);
    this.RJaw2.addBox(12.0F, 0.0F, -8.0F, 17, 1, 3);
    this.RJaw2.setRotationPoint(-5.0F, 13.0F, -33.0F);
    this.RJaw2.setTextureSize(128, 256);
    this.RJaw2.mirror = true;
    setRotation(this.RJaw2, 0.0F, 1.745329F, 0.0F);
    this.LAntenna = new ModelRenderer(this, 70, 0);
    this.LAntenna.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1);
    this.LAntenna.setRotationPoint(0.0F, 4.0F, -32.0F);
    this.LAntenna.setTextureSize(128, 256);
    this.LAntenna.mirror = true;
    setRotation(this.LAntenna, 0.0F, 0.0F, 0.5410521F);
    this.RAntenna = new ModelRenderer(this, 70, 0);
    this.RAntenna.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1);
    this.RAntenna.setRotationPoint(0.0F, 4.0F, -32.0F);
    this.RAntenna.setTextureSize(128, 256);
    this.RAntenna.mirror = true;
    setRotation(this.RAntenna, 0.0F, 0.0F, -0.5410521F);
    this.Hip3 = new ModelRenderer(this, 0, 96);
    this.Hip3.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip3.setRotationPoint(-17.0F, 9.0F, 10.0F);
    this.Hip3.setTextureSize(128, 256);
    this.Hip3.mirror = true;
    setRotation(this.Hip3, 0.0F, 0.0F, 0.0F);
    this.Hip4 = new ModelRenderer(this, 0, 96);
    this.Hip4.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip4.setRotationPoint(11.0F, 9.0F, 10.0F);
    this.Hip4.setTextureSize(128, 256);
    this.Hip4.mirror = true;
    setRotation(this.Hip4, 0.0F, 0.0F, 0.0F);
    this.Hip5 = new ModelRenderer(this, 0, 96);
    this.Hip5.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip5.setRotationPoint(11.0F, 9.0F, -16.0F);
    this.Hip5.setTextureSize(128, 256);
    this.Hip5.mirror = true;
    setRotation(this.Hip5, 0.0F, 0.0F, 0.0F);
    this.Hip6 = new ModelRenderer(this, 0, 96);
    this.Hip6.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
    this.Hip6.setRotationPoint(-17.0F, 9.0F, -16.0F);
    this.Hip6.setTextureSize(128, 256);
    this.Hip6.mirror = true;
    setRotation(this.Hip6, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    AntRobot e = (AntRobot)entity;
    RenderSpiderRobotInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderSpiderRobotInfo();
    for (int i = 0; i < 6; i++) {
      this.Leg3.rotateAngleY = r.ydisplayangle[i];
      this.Foot1.rotateAngleY = r.ydisplayangle[i];
      this.Foot2.rotateAngleY = r.ydisplayangle[i];
      this.Foot3.rotateAngleY = r.ydisplayangle[i];
      this.Foot4.rotateAngleY = r.ydisplayangle[i];
      this.Foot5.rotateAngleY = r.ydisplayangle[i];
      this.Foot6.rotateAngleY = r.ydisplayangle[i];
      this.Foot7.rotateAngleY = r.ydisplayangle[i];
      this.Leg1.rotateAngleX = (float)r.p1xangle[i] + r.uddisplayangle[i];
      this.Leg2.rotateAngleX = (float)r.p2xangle[i] + r.uddisplayangle[i];
      this.Leg3.rotateAngleX = (float)r.p3xangle[i] + r.uddisplayangle[i];
      this.Foot1.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot2.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot3.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot4.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot5.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot6.rotateAngleX = this.Leg3.rotateAngleX;
      this.Foot7.rotateAngleX = this.Leg3.rotateAngleX;
      this.Leg1.rotationPointX = -((float)Math.cos(r.ymid[i])) * r.legoff[i] * 16.0F;
      this.Leg1.rotationPointZ = (float)Math.sin(r.ymid[i]) * r.legoff[i] * 16.0F;
      this.Leg1.rotationPointY = r.yoff[i] * -16.0F;
      this.Leg1.rotationPointY -= (float)Math.sin(this.Leg1.rotateAngleX) * 49.0F;
      this.Leg1.rotationPointZ += (float)Math.cos(this.Leg1.rotateAngleX) * (float)Math.cos(this.Leg1.rotateAngleY) * 49.0F;
      this.Leg1.rotationPointX += (float)Math.cos(this.Leg1.rotateAngleX) * (float)Math.sin(this.Leg1.rotateAngleY) * 49.0F;
      this.Leg2.rotationPointY -= (float)Math.sin(this.Leg2.rotateAngleX) * 49.0F;
      this.Leg2.rotationPointZ += (float)Math.cos(this.Leg2.rotateAngleX) * (float)Math.cos(this.Leg2.rotateAngleY) * 49.0F;
      this.Leg2.rotationPointX += (float)Math.cos(this.Leg2.rotateAngleX) * (float)Math.sin(this.Leg2.rotateAngleY) * 49.0F;
      this.Foot1.rotationPointX = this.Leg3.rotationPointX;
      this.Foot1.rotationPointY = this.Leg3.rotationPointY;
      this.Foot1.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot2.rotationPointX = this.Leg3.rotationPointX;
      this.Foot2.rotationPointY = this.Leg3.rotationPointY;
      this.Foot2.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot3.rotationPointX = this.Leg3.rotationPointX;
      this.Foot3.rotationPointY = this.Leg3.rotationPointY;
      this.Foot3.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot4.rotationPointX = this.Leg3.rotationPointX;
      this.Foot4.rotationPointY = this.Leg3.rotationPointY;
      this.Foot4.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot5.rotationPointX = this.Leg3.rotationPointX;
      this.Foot5.rotationPointY = this.Leg3.rotationPointY;
      this.Foot5.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot6.rotationPointX = this.Leg3.rotationPointX;
      this.Foot6.rotationPointY = this.Leg3.rotationPointY;
      this.Foot6.rotationPointZ = this.Leg3.rotationPointZ;
      this.Foot7.rotationPointX = this.Leg3.rotationPointX;
      this.Foot7.rotationPointY = this.Leg3.rotationPointY;
      this.Foot7.rotationPointZ = this.Leg3.rotationPointZ;
      this.Leg1.render(f5);
      this.Leg2.render(f5);
      this.Leg3.render(f5);
      this.Foot1.render(f5);
      this.Foot2.render(f5);
      this.Foot3.render(f5);
      this.Foot4.render(f5);
      this.Foot5.render(f5);
      this.Foot6.render(f5);
      this.Foot7.render(f5);
    } 
    if (e.getAttacking() == 0) {
      this.LJaw1.rotateAngleY = 0.89F;
      this.LJaw2.rotateAngleY = 1.378F;
      this.RJaw1.rotateAngleY = 2.216F;
      this.RJaw2.rotateAngleY = 1.745F;
      this.LAntenna.rotateAngleX = MathHelper.cos(r.gpcounter * 0.35F) * 3.1415927F * 0.05F;
      this.LAntenna.rotateAngleZ = 0.54F + MathHelper.cos(r.gpcounter * 0.25F) * 3.1415927F * 0.05F;
      this.RAntenna.rotateAngleX = MathHelper.cos(r.gpcounter * 0.3F) * 3.1415927F * 0.05F;
      this.RAntenna.rotateAngleZ = -0.54F + MathHelper.cos(r.gpcounter * 0.45F) * 3.1415927F * 0.05F;
    } else {
      float newangle = MathHelper.cos(r.gpcounter * 0.25F) * 3.1415927F * 0.22F;
      this.LJaw1.rotateAngleY = newangle + 0.89F;
      this.LJaw2.rotateAngleY = newangle + 1.378F;
      this.RJaw1.rotateAngleY = -newangle + 2.216F;
      this.RJaw2.rotateAngleY = 1.745F - newangle;
      this.LAntenna.rotateAngleX = MathHelper.cos(r.gpcounter * 0.45F) * 3.1415927F * 0.1F;
      this.LAntenna.rotateAngleZ = 0.54F + MathHelper.cos(r.gpcounter * 0.35F) * 3.1415927F * 0.1F;
      this.RAntenna.rotateAngleX = MathHelper.cos(r.gpcounter * 0.4F) * 3.1415927F * 0.1F;
      this.RAntenna.rotateAngleZ = -0.54F + MathHelper.cos(r.gpcounter * 0.55F) * 3.1415927F * 0.1F;
    } 
    this.Body.render(f5);
    this.Abdomen.render(f5);
    this.Head.render(f5);
    this.Jet1.render(f5);
    this.Jet2.render(f5);
    this.Hip1.render(f5);
    this.Hip2.render(f5);
    this.Hip3.render(f5);
    this.Hip4.render(f5);
    this.Hip5.render(f5);
    this.Hip6.render(f5);
    this.LJaw1.render(f5);
    this.RJaw1.render(f5);
    this.LJaw2.render(f5);
    this.RJaw2.render(f5);
    this.LAntenna.render(f5);
    this.RAntenna.render(f5);
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
