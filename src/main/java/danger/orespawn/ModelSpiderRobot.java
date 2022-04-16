package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpiderRobot extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Leg1p1;
  
  ModelRenderer Leg1p2;
  
  ModelRenderer Leg1p3;
  
  ModelRenderer Foot;
  
  ModelRenderer FootSpike1;
  
  ModelRenderer FootSpike2;
  
  ModelRenderer FootSpike3;
  
  ModelRenderer FootSpike4;
  
  ModelRenderer AnkleSpike1;
  
  ModelRenderer AnkleSpike2;
  
  ModelRenderer AnkleSpike3;
  
  ModelRenderer AnkleSpike4;
  
  ModelRenderer LowerKnee;
  
  ModelRenderer UpperKnee;
  
  ModelRenderer LegBump1;
  
  ModelRenderer LegBump2;
  
  ModelRenderer LowerKnee2;
  
  ModelRenderer UpperKnee2;
  
  ModelRenderer HipJoint;
  
  ModelRenderer BodyCenter;
  
  ModelRenderer Abdomen;
  
  ModelRenderer Head;
  
  ModelRenderer Ljaw1;
  
  ModelRenderer Rjaw1;
  
  ModelRenderer Ljaw2;
  
  ModelRenderer Rjaw2;
  
  ModelRenderer Ljaw3;
  
  ModelRenderer Rjaw3;
  
  ModelRenderer Tail;
  
  ModelRenderer HeadSpike1;
  
  ModelRenderer HeadSpike2;
  
  ModelRenderer Hip1;
  
  ModelRenderer Hip2;
  
  ModelRenderer Hip3;
  
  ModelRenderer Hip4;
  
  ModelRenderer Hip5;
  
  ModelRenderer Hip6;
  
  ModelRenderer Hip7;
  
  ModelRenderer Hip8;
  
  public ModelSpiderRobot(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 512;
    this.Leg1p1 = new ModelRenderer(this, 0, 149);
    this.Leg1p1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 100);
    this.Leg1p1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Leg1p1.setTextureSize(64, 32);
    this.Leg1p1.mirror = true;
    setRotation(this.Leg1p1, 0.7853982F, 0.0F, 0.0F);
    this.Leg1p2 = new ModelRenderer(this, 0, 149);
    this.Leg1p2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 100);
    this.Leg1p2.setRotationPoint(0.0F, -70.0F, 70.0F);
    this.Leg1p2.setTextureSize(64, 32);
    this.Leg1p2.mirror = true;
    setRotation(this.Leg1p2, 0.0F, 0.0F, 0.0F);
    this.Leg1p3 = new ModelRenderer(this, 0, 149);
    this.Leg1p3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 100);
    this.Leg1p3.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.Leg1p3.setTextureSize(64, 32);
    this.Leg1p3.mirror = true;
    setRotation(this.Leg1p3, -0.7853982F, 0.0F, 0.0F);
    this.Foot = new ModelRenderer(this, 0, 28);
    this.Foot.addBox(-3.0F, -3.0F, 93.0F, 6, 6, 6);
    this.Foot.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.Foot.setTextureSize(64, 32);
    this.Foot.mirror = true;
    setRotation(this.Foot, -0.7853982F, 0.0F, 0.0F);
    this.FootSpike1 = new ModelRenderer(this, 29, 27);
    this.FootSpike1.addBox(2.0F, 2.0F, 99.0F, 1, 1, 5);
    this.FootSpike1.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.FootSpike1.setTextureSize(64, 32);
    this.FootSpike1.mirror = true;
    setRotation(this.FootSpike1, -0.7853982F, 0.0F, 0.0F);
    this.FootSpike2 = new ModelRenderer(this, 29, 34);
    this.FootSpike2.addBox(-3.0F, 2.0F, 99.0F, 1, 1, 5);
    this.FootSpike2.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.FootSpike2.setTextureSize(64, 32);
    this.FootSpike2.mirror = true;
    setRotation(this.FootSpike2, -0.7853982F, 0.0F, 0.0F);
    this.FootSpike3 = new ModelRenderer(this, 43, 27);
    this.FootSpike3.addBox(2.0F, -3.0F, 99.0F, 1, 1, 5);
    this.FootSpike3.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.FootSpike3.setTextureSize(64, 32);
    this.FootSpike3.mirror = true;
    setRotation(this.FootSpike3, -0.7853982F, 0.0F, 0.0F);
    this.FootSpike4 = new ModelRenderer(this, 43, 34);
    this.FootSpike4.addBox(-3.0F, -3.0F, 99.0F, 1, 1, 5);
    this.FootSpike4.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.FootSpike4.setTextureSize(64, 32);
    this.FootSpike4.mirror = true;
    setRotation(this.FootSpike4, -0.7853982F, 0.0F, 0.0F);
    this.AnkleSpike1 = new ModelRenderer(this, 1, 42);
    this.AnkleSpike1.addBox(3.0F, -10.0F, 92.0F, 1, 20, 1);
    this.AnkleSpike1.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.AnkleSpike1.setTextureSize(64, 32);
    this.AnkleSpike1.mirror = true;
    setRotation(this.AnkleSpike1, -0.7853982F, 0.0F, 0.0F);
    this.AnkleSpike2 = new ModelRenderer(this, 7, 42);
    this.AnkleSpike2.addBox(-4.0F, -10.0F, 92.0F, 1, 20, 1);
    this.AnkleSpike2.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.AnkleSpike2.setTextureSize(64, 32);
    this.AnkleSpike2.mirror = true;
    setRotation(this.AnkleSpike2, -0.7853982F, 0.0F, 0.0F);
    this.AnkleSpike3 = new ModelRenderer(this, 14, 42);
    this.AnkleSpike3.addBox(-10.0F, 3.0F, 92.0F, 20, 1, 1);
    this.AnkleSpike3.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.AnkleSpike3.setTextureSize(64, 32);
    this.AnkleSpike3.mirror = true;
    setRotation(this.AnkleSpike3, -0.7853982F, 0.0F, 0.0F);
    this.AnkleSpike4 = new ModelRenderer(this, 14, 46);
    this.AnkleSpike4.addBox(-10.0F, -4.0F, 92.0F, 20, 1, 1);
    this.AnkleSpike4.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.AnkleSpike4.setTextureSize(64, 32);
    this.AnkleSpike4.mirror = true;
    setRotation(this.AnkleSpike4, -0.7853982F, 0.0F, 0.0F);
    this.LowerKnee = new ModelRenderer(this, 14, 49);
    this.LowerKnee.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 15);
    this.LowerKnee.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.LowerKnee.setTextureSize(64, 32);
    this.LowerKnee.mirror = true;
    setRotation(this.LowerKnee, -0.7853982F, 0.0F, 0.0F);
    this.UpperKnee = new ModelRenderer(this, 0, 69);
    this.UpperKnee.addBox(-2.5F, -2.5F, 81.0F, 5, 5, 20);
    this.UpperKnee.setRotationPoint(0.0F, -70.0F, 70.0F);
    this.UpperKnee.setTextureSize(64, 32);
    this.UpperKnee.mirror = true;
    setRotation(this.UpperKnee, 0.0F, 0.0F, 0.0F);
    this.LegBump1 = new ModelRenderer(this, 52, 50);
    this.LegBump1.addBox(-0.5F, -2.0F, 80.0F, 1, 1, 1);
    this.LegBump1.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.LegBump1.setTextureSize(64, 32);
    this.LegBump1.mirror = true;
    setRotation(this.LegBump1, -0.7853982F, 0.0F, 0.0F);
    this.LegBump2 = new ModelRenderer(this, 52, 54);
    this.LegBump2.addBox(-0.5F, -2.0F, 70.0F, 1, 1, 1);
    this.LegBump2.setRotationPoint(0.0F, -70.0F, 169.0F);
    this.LegBump2.setTextureSize(64, 32);
    this.LegBump2.mirror = true;
    setRotation(this.LegBump2, -0.7853982F, 0.0F, 0.0F);
    this.LowerKnee2 = new ModelRenderer(this, 0, 96);
    this.LowerKnee2.addBox(-2.5F, -2.5F, -1.0F, 5, 5, 15);
    this.LowerKnee2.setRotationPoint(0.0F, -70.0F, 70.0F);
    this.LowerKnee2.setTextureSize(64, 32);
    this.LowerKnee2.mirror = true;
    setRotation(this.LowerKnee2, 0.0F, 0.0F, 0.0F);
    this.UpperKnee2 = new ModelRenderer(this, 0, 119);
    this.UpperKnee2.addBox(-3.0F, -3.0F, 81.0F, 6, 6, 20);
    this.UpperKnee2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.UpperKnee2.setTextureSize(64, 32);
    this.UpperKnee2.mirror = true;
    setRotation(this.UpperKnee2, 0.7853982F, 0.0F, 0.0F);
    this.HipJoint = new ModelRenderer(this, 0, 149);
    this.HipJoint.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 16);
    this.HipJoint.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HipJoint.setTextureSize(64, 32);
    this.HipJoint.mirror = true;
    setRotation(this.HipJoint, 0.7853982F, 0.0F, 0.0F);
    this.BodyCenter = new ModelRenderer(this, 0, 321);
    this.BodyCenter.addBox(-18.0F, -12.0F, -21.0F, 36, 24, 51);
    this.BodyCenter.setRotationPoint(0.0F, -4.0F, 0.0F);
    this.BodyCenter.setTextureSize(64, 32);
    this.BodyCenter.mirror = true;
    setRotation(this.BodyCenter, 0.0F, 0.0F, 0.0F);
    this.Abdomen = new ModelRenderer(this, 0, 398);
    this.Abdomen.addBox(-24.0F, -30.0F, 29.0F, 48, 40, 73);
    this.Abdomen.setRotationPoint(0.0F, -4.0F, 0.0F);
    this.Abdomen.setTextureSize(64, 32);
    this.Abdomen.mirror = true;
    setRotation(this.Abdomen, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 0, 256);
    this.Head.addBox(-15.0F, -16.0F, -57.0F, 30, 26, 36);
    this.Head.setRotationPoint(0.0F, -4.0F, 0.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Ljaw1 = new ModelRenderer(this, 75, 26);
    this.Ljaw1.addBox(-4.0F, 0.0F, -4.0F, 8, 3, 8);
    this.Ljaw1.setRotationPoint(14.0F, -3.0F, -56.0F);
    this.Ljaw1.setTextureSize(64, 32);
    this.Ljaw1.mirror = true;
    setRotation(this.Ljaw1, 0.0F, 0.0F, 0.0F);
    this.Rjaw1 = new ModelRenderer(this, 75, 26);
    this.Rjaw1.addBox(-4.0F, 0.0F, -4.0F, 8, 3, 8);
    this.Rjaw1.setRotationPoint(-14.0F, -3.0F, -56.0F);
    this.Rjaw1.setTextureSize(64, 32);
    this.Rjaw1.mirror = true;
    setRotation(this.Rjaw1, 0.0F, 0.0F, 0.0F);
    this.Ljaw2 = new ModelRenderer(this, 63, 40);
    this.Ljaw2.addBox(0.0F, 1.0F, -3.0F, 21, 2, 6);
    this.Ljaw2.setRotationPoint(14.0F, -3.0F, -56.0F);
    this.Ljaw2.setTextureSize(64, 32);
    this.Ljaw2.mirror = true;
    setRotation(this.Ljaw2, 0.0F, 0.7504916F, 0.0F);
    this.Rjaw2 = new ModelRenderer(this, 63, 40);
    this.Rjaw2.addBox(0.0F, 1.0F, -3.0F, 21, 2, 6);
    this.Rjaw2.setRotationPoint(-14.0F, -3.0F, -56.0F);
    this.Rjaw2.setTextureSize(64, 32);
    this.Rjaw2.mirror = true;
    setRotation(this.Rjaw2, 0.0F, 2.303835F, 0.0F);
    this.Ljaw3 = new ModelRenderer(this, 0, 18);
    this.Ljaw3.addBox(11.0F, 2.0F, 14.0F, 23, 1, 4);
    this.Ljaw3.setRotationPoint(14.0F, -3.0F, -56.0F);
    this.Ljaw3.setTextureSize(64, 32);
    this.Ljaw3.mirror = true;
    setRotation(this.Ljaw3, 0.0F, 1.710423F, 0.0F);
    this.Rjaw3 = new ModelRenderer(this, 0, 18);
    this.Rjaw3.addBox(11.0F, 2.0F, -17.0F, 23, 1, 4);
    this.Rjaw3.setRotationPoint(-14.0F, -3.0F, -56.0F);
    this.Rjaw3.setTextureSize(64, 32);
    this.Rjaw3.mirror = true;
    setRotation(this.Rjaw3, 0.0F, 1.413717F, 0.0F);
    this.Tail = new ModelRenderer(this, 130, 0);
    this.Tail.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 49);
    this.Tail.setRotationPoint(0.0F, -32.0F, 69.0F);
    this.Tail.setTextureSize(64, 32);
    this.Tail.mirror = true;
    setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
    this.HeadSpike1 = new ModelRenderer(this, 74, 0);
    this.HeadSpike1.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 21);
    this.HeadSpike1.setRotationPoint(6.0F, -20.0F, -60.0F);
    this.HeadSpike1.setTextureSize(64, 32);
    this.HeadSpike1.mirror = true;
    setRotation(this.HeadSpike1, 0.0F, 0.0F, 0.0F);
    this.HeadSpike2 = new ModelRenderer(this, 74, 0);
    this.HeadSpike2.addBox(-1.0F, -1.0F, -10.0F, 2, 2, 21);
    this.HeadSpike2.setRotationPoint(-6.0F, -20.0F, -60.0F);
    this.HeadSpike2.setTextureSize(64, 32);
    this.HeadSpike2.mirror = true;
    setRotation(this.HeadSpike2, 0.0F, 0.0F, 0.0F);
    this.Hip1 = new ModelRenderer(this, 70, 60);
    this.Hip1.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip1.setRotationPoint(22.0F, -3.0F, 44.0F);
    this.Hip1.setTextureSize(256, 512);
    this.Hip1.mirror = true;
    setRotation(this.Hip1, 0.0F, 0.0F, 0.0F);
    this.Hip2 = new ModelRenderer(this, 70, 60);
    this.Hip2.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip2.setRotationPoint(-32.0F, -3.0F, 44.0F);
    this.Hip2.setTextureSize(256, 512);
    this.Hip2.mirror = true;
    setRotation(this.Hip2, 0.0F, 0.0F, 0.0F);
    this.Hip3 = new ModelRenderer(this, 70, 60);
    this.Hip3.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip3.setRotationPoint(16.0F, -1.0F, 12.0F);
    this.Hip3.setTextureSize(256, 512);
    this.Hip3.mirror = true;
    setRotation(this.Hip3, 0.0F, 0.0F, 0.0F);
    this.Hip4 = new ModelRenderer(this, 70, 60);
    this.Hip4.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip4.setRotationPoint(-26.0F, -1.0F, 12.0F);
    this.Hip4.setTextureSize(256, 512);
    this.Hip4.mirror = true;
    setRotation(this.Hip4, 0.0F, 0.0F, 0.0F);
    this.Hip5 = new ModelRenderer(this, 70, 60);
    this.Hip5.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip5.setRotationPoint(16.0F, -1.0F, -11.0F);
    this.Hip5.setTextureSize(256, 512);
    this.Hip5.mirror = true;
    setRotation(this.Hip5, 0.0F, 0.0F, 0.0F);
    this.Hip6 = new ModelRenderer(this, 70, 60);
    this.Hip6.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip6.setRotationPoint(-26.0F, -1.0F, -11.0F);
    this.Hip6.setTextureSize(256, 512);
    this.Hip6.mirror = true;
    setRotation(this.Hip6, 0.0F, 0.0F, 0.0F);
    this.Hip7 = new ModelRenderer(this, 70, 60);
    this.Hip7.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip7.setRotationPoint(13.0F, -3.0F, -33.0F);
    this.Hip7.setTextureSize(256, 512);
    this.Hip7.mirror = true;
    setRotation(this.Hip7, 0.0F, 0.0F, 0.0F);
    this.Hip8 = new ModelRenderer(this, 70, 60);
    this.Hip8.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10);
    this.Hip8.setRotationPoint(-23.0F, -3.0F, -33.0F);
    this.Hip8.setTextureSize(256, 512);
    this.Hip8.mirror = true;
    setRotation(this.Hip8, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    SpiderRobot e = (SpiderRobot)entity;
    RenderSpiderRobotInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderSpiderRobotInfo();
    for (int i = 0; i < 8; i++) {
      this.Leg1p3.rotateAngleY = r.ydisplayangle[i];
      this.Foot.rotateAngleY = r.ydisplayangle[i];
      this.FootSpike1.rotateAngleY = r.ydisplayangle[i];
      this.FootSpike2.rotateAngleY = r.ydisplayangle[i];
      this.FootSpike3.rotateAngleY = r.ydisplayangle[i];
      this.FootSpike4.rotateAngleY = r.ydisplayangle[i];
      this.AnkleSpike1.rotateAngleY = r.ydisplayangle[i];
      this.AnkleSpike2.rotateAngleY = r.ydisplayangle[i];
      this.AnkleSpike3.rotateAngleY = r.ydisplayangle[i];
      this.AnkleSpike4.rotateAngleY = r.ydisplayangle[i];
      this.LowerKnee.rotateAngleY = r.ydisplayangle[i];
      this.UpperKnee.rotateAngleY = r.ydisplayangle[i];
      this.LegBump1.rotateAngleY = r.ydisplayangle[i];
      this.LegBump2.rotateAngleY = r.ydisplayangle[i];
      this.LowerKnee2.rotateAngleY = r.ydisplayangle[i];
      this.UpperKnee2.rotateAngleY = r.ydisplayangle[i];
      this.HipJoint.rotateAngleY = r.ydisplayangle[i];
      this.Leg1p1.rotateAngleX = (float)r.p1xangle[i] + r.uddisplayangle[i];
      this.UpperKnee2.rotateAngleX = this.Leg1p1.rotateAngleX;
      this.HipJoint.rotateAngleX = this.Leg1p1.rotateAngleX;
      this.Leg1p2.rotateAngleX = (float)r.p2xangle[i] + r.uddisplayangle[i];
      this.UpperKnee.rotateAngleX = this.Leg1p2.rotateAngleX;
      this.LowerKnee2.rotateAngleX = this.Leg1p2.rotateAngleX;
      this.Leg1p3.rotateAngleX = (float)r.p3xangle[i] + r.uddisplayangle[i];
      this.Foot.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.FootSpike1.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.FootSpike2.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.FootSpike3.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.FootSpike4.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.AnkleSpike1.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.AnkleSpike2.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.AnkleSpike3.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.AnkleSpike4.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.LegBump1.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.LegBump2.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.LowerKnee.rotateAngleX = this.Leg1p3.rotateAngleX;
      this.Leg1p1.rotationPointX = -((float)Math.cos(r.ymid[i])) * r.legoff[i] * 16.0F;
      this.Leg1p1.rotationPointZ = (float)Math.sin(r.ymid[i]) * r.legoff[i] * 16.0F;
      this.Leg1p1.rotationPointY = r.yoff[i] * -16.0F;
      this.UpperKnee2.rotationPointX = this.Leg1p1.rotationPointX;
      this.UpperKnee2.rotationPointY = this.Leg1p1.rotationPointY;
      this.UpperKnee2.rotationPointZ = this.Leg1p1.rotationPointZ;
      this.HipJoint.rotationPointX = this.Leg1p1.rotationPointX;
      this.HipJoint.rotationPointY = this.Leg1p1.rotationPointY;
      this.HipJoint.rotationPointZ = this.Leg1p1.rotationPointZ;
      this.Leg1p1.rotationPointY -= (float)Math.sin(this.Leg1p1.rotateAngleX) * 99.0F;
      this.Leg1p1.rotationPointZ += (float)Math.cos(this.Leg1p1.rotateAngleX) * (float)Math.cos(this.Leg1p1.rotateAngleY) * 99.0F;
      this.Leg1p1.rotationPointX += (float)Math.cos(this.Leg1p1.rotateAngleX) * (float)Math.sin(this.Leg1p1.rotateAngleY) * 99.0F;
      this.UpperKnee.rotationPointX = this.Leg1p2.rotationPointX;
      this.UpperKnee.rotationPointY = this.Leg1p2.rotationPointY;
      this.UpperKnee.rotationPointZ = this.Leg1p2.rotationPointZ;
      this.LowerKnee2.rotationPointX = this.Leg1p2.rotationPointX;
      this.LowerKnee2.rotationPointY = this.Leg1p2.rotationPointY;
      this.LowerKnee2.rotationPointZ = this.Leg1p2.rotationPointZ;
      this.Leg1p2.rotationPointY -= (float)Math.sin(this.Leg1p2.rotateAngleX) * 99.0F;
      this.Leg1p2.rotationPointZ += (float)Math.cos(this.Leg1p2.rotateAngleX) * (float)Math.cos(this.Leg1p2.rotateAngleY) * 99.0F;
      this.Leg1p2.rotationPointX += (float)Math.cos(this.Leg1p2.rotateAngleX) * (float)Math.sin(this.Leg1p2.rotateAngleY) * 99.0F;
      this.Foot.rotationPointX = this.Leg1p3.rotationPointX;
      this.Foot.rotationPointY = this.Leg1p3.rotationPointY;
      this.Foot.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.FootSpike1.rotationPointX = this.Leg1p3.rotationPointX;
      this.FootSpike1.rotationPointY = this.Leg1p3.rotationPointY;
      this.FootSpike1.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.FootSpike2.rotationPointX = this.Leg1p3.rotationPointX;
      this.FootSpike2.rotationPointY = this.Leg1p3.rotationPointY;
      this.FootSpike2.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.FootSpike3.rotationPointX = this.Leg1p3.rotationPointX;
      this.FootSpike3.rotationPointY = this.Leg1p3.rotationPointY;
      this.FootSpike3.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.FootSpike4.rotationPointX = this.Leg1p3.rotationPointX;
      this.FootSpike4.rotationPointY = this.Leg1p3.rotationPointY;
      this.FootSpike4.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.AnkleSpike1.rotationPointX = this.Leg1p3.rotationPointX;
      this.AnkleSpike1.rotationPointY = this.Leg1p3.rotationPointY;
      this.AnkleSpike1.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.AnkleSpike2.rotationPointX = this.Leg1p3.rotationPointX;
      this.AnkleSpike2.rotationPointY = this.Leg1p3.rotationPointY;
      this.AnkleSpike2.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.AnkleSpike3.rotationPointX = this.Leg1p3.rotationPointX;
      this.AnkleSpike3.rotationPointY = this.Leg1p3.rotationPointY;
      this.AnkleSpike3.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.AnkleSpike4.rotationPointX = this.Leg1p3.rotationPointX;
      this.AnkleSpike4.rotationPointY = this.Leg1p3.rotationPointY;
      this.AnkleSpike4.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.LegBump1.rotationPointX = this.Leg1p3.rotationPointX;
      this.LegBump1.rotationPointY = this.Leg1p3.rotationPointY;
      this.LegBump1.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.LegBump2.rotationPointX = this.Leg1p3.rotationPointX;
      this.LegBump2.rotationPointY = this.Leg1p3.rotationPointY;
      this.LegBump2.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.LowerKnee.rotationPointX = this.Leg1p3.rotationPointX;
      this.LowerKnee.rotationPointY = this.Leg1p3.rotationPointY;
      this.LowerKnee.rotationPointZ = this.Leg1p3.rotationPointZ;
      this.Leg1p1.render(f5);
      this.Leg1p2.render(f5);
      this.Leg1p3.render(f5);
      this.Foot.render(f5);
      this.FootSpike1.render(f5);
      this.FootSpike2.render(f5);
      this.FootSpike3.render(f5);
      this.FootSpike4.render(f5);
      this.AnkleSpike1.render(f5);
      this.AnkleSpike2.render(f5);
      this.AnkleSpike3.render(f5);
      this.AnkleSpike4.render(f5);
      this.LowerKnee.render(f5);
      this.UpperKnee.render(f5);
      this.LegBump1.render(f5);
      this.LegBump2.render(f5);
      this.LowerKnee2.render(f5);
      this.UpperKnee2.render(f5);
      this.HipJoint.render(f5);
    } 
    if (e.getAttacking() == 0) {
      this.Ljaw1.rotateAngleY = 0.0F;
      this.Ljaw2.rotateAngleY = 0.75F;
      this.Ljaw3.rotateAngleY = 1.71F;
      this.Rjaw1.rotateAngleY = 0.0F;
      this.Rjaw2.rotateAngleY = 2.3F;
      this.Rjaw3.rotateAngleY = 1.41F;
    } else {
      float newangle = MathHelper.cos(r.gpcounter * 0.25F) * 3.1415927F * 0.22F;
      this.Ljaw1.rotateAngleY = newangle;
      this.Ljaw2.rotateAngleY = newangle + 0.75F;
      this.Ljaw3.rotateAngleY = newangle + 1.71F;
      this.Rjaw1.rotateAngleY = -newangle;
      this.Rjaw2.rotateAngleY = 2.3F - newangle;
      this.Rjaw3.rotateAngleY = 1.41F - newangle;
    } 
    this.BodyCenter.render(f5);
    this.Abdomen.render(f5);
    this.Head.render(f5);
    this.Ljaw1.render(f5);
    this.Rjaw1.render(f5);
    this.Ljaw2.render(f5);
    this.Rjaw2.render(f5);
    this.Ljaw3.render(f5);
    this.Rjaw3.render(f5);
    this.Tail.render(f5);
    this.HeadSpike1.render(f5);
    this.HeadSpike2.render(f5);
    this.Hip1.render(f5);
    this.Hip2.render(f5);
    this.Hip3.render(f5);
    this.Hip4.render(f5);
    this.Hip5.render(f5);
    this.Hip6.render(f5);
    this.Hip7.render(f5);
    this.Hip8.render(f5);
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
