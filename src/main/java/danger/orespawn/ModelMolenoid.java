package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMolenoid extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer shoulders;
  
  ModelRenderer head1;
  
  ModelRenderer head2;
  
  ModelRenderer head3;
  
  ModelRenderer nosestar1;
  
  ModelRenderer nosestar2;
  
  ModelRenderer nosestar3;
  
  ModelRenderer larm;
  
  ModelRenderer lhand;
  
  ModelRenderer lclaw1;
  
  ModelRenderer lclaw2;
  
  ModelRenderer lclaw3;
  
  ModelRenderer lclaw4;
  
  ModelRenderer nosestar4;
  
  ModelRenderer nosestar5;
  
  ModelRenderer nosestar6;
  
  ModelRenderer butt;
  
  ModelRenderer tail;
  
  ModelRenderer lleg;
  
  ModelRenderer lfoot;
  
  ModelRenderer ltoe1;
  
  ModelRenderer ltoe2;
  
  ModelRenderer ltoe3;
  
  ModelRenderer ltoe4;
  
  ModelRenderer rarm;
  
  ModelRenderer rhand;
  
  ModelRenderer rclaw1;
  
  ModelRenderer rclaw2;
  
  ModelRenderer rclaw3;
  
  ModelRenderer rclaw4;
  
  ModelRenderer rleg;
  
  ModelRenderer rfoot;
  
  ModelRenderer rtoe1;
  
  ModelRenderer rtoe2;
  
  ModelRenderer rtoe3;
  
  ModelRenderer rtoe4;
  
  public ModelMolenoid(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.body = new ModelRenderer(this, 0, 176);
    this.body.addBox(-16.0F, 0.0F, 0.0F, 32, 20, 56);
    this.body.setRotationPoint(0.0F, 1.0F, 6.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.shoulders = new ModelRenderer(this, 0, 143);
    this.shoulders.addBox(-17.0F, 0.0F, 0.0F, 34, 17, 10);
    this.shoulders.setRotationPoint(0.0F, 3.0F, -4.0F);
    this.shoulders.setTextureSize(64, 32);
    this.shoulders.mirror = true;
    setRotation(this.shoulders, 0.0F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 0, 114);
    this.head1.addBox(-14.0F, 0.0F, 0.0F, 28, 14, 10);
    this.head1.setRotationPoint(0.0F, 5.0F, -14.0F);
    this.head1.setTextureSize(64, 32);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 0, 89);
    this.head2.addBox(-11.0F, 0.0F, 0.0F, 22, 10, 10);
    this.head2.setRotationPoint(0.0F, 6.0F, -24.0F);
    this.head2.setTextureSize(64, 32);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 0, 67);
    this.head3.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 10);
    this.head3.setRotationPoint(0.0F, 7.0F, -34.0F);
    this.head3.setTextureSize(64, 32);
    this.head3.mirror = true;
    setRotation(this.head3, 0.0F, 0.0F, 0.0F);
    this.nosestar1 = new ModelRenderer(this, 0, 32);
    this.nosestar1.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar1.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar1.setTextureSize(64, 32);
    this.nosestar1.mirror = true;
    setRotation(this.nosestar1, 0.0F, 0.0F, 0.0F);
    this.nosestar2 = new ModelRenderer(this, 20, 32);
    this.nosestar2.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar2.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar2.setTextureSize(64, 32);
    this.nosestar2.mirror = true;
    setRotation(this.nosestar2, 0.0F, 0.0F, 1.047198F);
    this.nosestar3 = new ModelRenderer(this, 40, 32);
    this.nosestar3.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar3.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar3.setTextureSize(64, 32);
    this.nosestar3.mirror = true;
    setRotation(this.nosestar3, 0.0F, 0.0F, -1.047198F);
    this.larm = new ModelRenderer(this, 80, 0);
    this.larm.addBox(0.0F, 0.0F, -2.0F, 17, 11, 5);
    this.larm.setRotationPoint(13.0F, 8.0F, 0.0F);
    this.larm.setTextureSize(64, 32);
    this.larm.mirror = true;
    setRotation(this.larm, 0.0F, 0.6283185F, 0.0F);
    this.lhand = new ModelRenderer(this, 80, 20);
    this.lhand.addBox(0.0F, 0.0F, -2.0F, 12, 14, 4);
    this.lhand.setRotationPoint(25.0F, 7.0F, -9.0F);
    this.lhand.setTextureSize(64, 32);
    this.lhand.mirror = true;
    setRotation(this.lhand, 0.0F, 0.0F, 0.0F);
    this.lclaw1 = new ModelRenderer(this, 80, 42);
    this.lclaw1.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.lclaw1.setRotationPoint(35.0F, 20.0F, -9.0F);
    this.lclaw1.setTextureSize(64, 32);
    this.lclaw1.mirror = true;
    setRotation(this.lclaw1, 0.0F, -0.1745329F, 0.0F);
    this.lclaw2 = new ModelRenderer(this, 80, 52);
    this.lclaw2.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.lclaw2.setRotationPoint(35.0F, 15.0F, -9.0F);
    this.lclaw2.setTextureSize(64, 32);
    this.lclaw2.mirror = true;
    setRotation(this.lclaw2, 0.0F, -0.1745329F, 0.0F);
    this.lclaw3 = new ModelRenderer(this, 80, 62);
    this.lclaw3.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.lclaw3.setRotationPoint(35.0F, 10.0F, -9.0F);
    this.lclaw3.setTextureSize(64, 32);
    this.lclaw3.mirror = true;
    setRotation(this.lclaw3, 0.0F, -0.1745329F, 0.0F);
    this.lclaw4 = new ModelRenderer(this, 80, 72);
    this.lclaw4.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.lclaw4.setRotationPoint(35.0F, 5.0F, -9.0F);
    this.lclaw4.setTextureSize(64, 32);
    this.lclaw4.mirror = true;
    setRotation(this.lclaw4, 0.0F, -0.1745329F, 0.0F);
    this.nosestar4 = new ModelRenderer(this, 10, 32);
    this.nosestar4.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar4.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar4.setTextureSize(64, 32);
    this.nosestar4.mirror = true;
    setRotation(this.nosestar4, 0.0F, 0.0F, 0.5235988F);
    this.nosestar5 = new ModelRenderer(this, 30, 32);
    this.nosestar5.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar5.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar5.setTextureSize(64, 32);
    this.nosestar5.mirror = true;
    setRotation(this.nosestar5, 0.0F, 0.0F, 1.570796F);
    this.nosestar6 = new ModelRenderer(this, 50, 32);
    this.nosestar6.addBox(-0.5F, -8.0F, 0.0F, 1, 16, 1);
    this.nosestar6.setRotationPoint(0.0F, 11.0F, -35.0F);
    this.nosestar6.setTextureSize(64, 32);
    this.nosestar6.mirror = true;
    setRotation(this.nosestar6, 0.0F, 0.0F, -0.5235988F);
    this.butt = new ModelRenderer(this, 196, 215);
    this.butt.addBox(-11.0F, 0.0F, 0.0F, 22, 11, 5);
    this.butt.setRotationPoint(0.0F, 6.0F, 62.0F);
    this.butt.setTextureSize(64, 32);
    this.butt.mirror = true;
    setRotation(this.butt, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 196, 200);
    this.tail.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5);
    this.tail.setRotationPoint(0.0F, 7.0F, 67.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0F, 0.0F, 0.0F);
    this.lleg = new ModelRenderer(this, 90, 80);
    this.lleg.addBox(0.0F, 0.0F, -2.0F, 17, 11, 5);
    this.lleg.setRotationPoint(14.0F, 9.0F, 58.0F);
    this.lleg.setTextureSize(64, 32);
    this.lleg.mirror = true;
    setRotation(this.lleg, 0.0F, 0.6283185F, 0.0F);
    this.lfoot = new ModelRenderer(this, 90, 100);
    this.lfoot.addBox(0.0F, 0.0F, -2.0F, 12, 14, 4);
    this.lfoot.setRotationPoint(26.0F, 8.0F, 49.0F);
    this.lfoot.setTextureSize(64, 32);
    this.lfoot.mirror = true;
    setRotation(this.lfoot, 0.0F, 0.0F, 0.0F);
    this.ltoe1 = new ModelRenderer(this, 90, 120);
    this.ltoe1.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.ltoe1.setRotationPoint(36.0F, 21.0F, 48.0F);
    this.ltoe1.setTextureSize(64, 32);
    this.ltoe1.mirror = true;
    setRotation(this.ltoe1, 0.0F, -0.2617994F, 0.0F);
    this.ltoe2 = new ModelRenderer(this, 90, 130);
    this.ltoe2.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.ltoe2.setRotationPoint(36.0F, 16.0F, 48.0F);
    this.ltoe2.setTextureSize(64, 32);
    this.ltoe2.mirror = true;
    setRotation(this.ltoe2, 0.0F, -0.2617994F, 0.0F);
    this.ltoe3 = new ModelRenderer(this, 90, 140);
    this.ltoe3.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.ltoe3.setRotationPoint(36.0F, 11.0F, 48.0F);
    this.ltoe3.setTextureSize(64, 32);
    this.ltoe3.mirror = true;
    setRotation(this.ltoe3, 0.0F, -0.2617994F, 0.0F);
    this.ltoe4 = new ModelRenderer(this, 90, 150);
    this.ltoe4.addBox(0.0F, 0.0F, -1.0F, 13, 3, 2);
    this.ltoe4.setRotationPoint(36.0F, 6.0F, 48.0F);
    this.ltoe4.setTextureSize(64, 32);
    this.ltoe4.mirror = true;
    setRotation(this.ltoe4, 0.0F, -0.2617994F, 0.0F);
    this.rarm = new ModelRenderer(this, 130, 0);
    this.rarm.addBox(-17.0F, 0.0F, -2.0F, 17, 11, 5);
    this.rarm.setRotationPoint(-14.0F, 8.0F, 0.0F);
    this.rarm.setTextureSize(64, 32);
    this.rarm.mirror = true;
    setRotation(this.rarm, 0.0F, -0.6283185F, 0.0F);
    this.rhand = new ModelRenderer(this, 130, 20);
    this.rhand.addBox(-12.0F, 0.0F, -2.0F, 12, 14, 4);
    this.rhand.setRotationPoint(-26.0F, 7.0F, -9.0F);
    this.rhand.setTextureSize(64, 32);
    this.rhand.mirror = true;
    setRotation(this.rhand, 0.0F, 0.0F, 0.0F);
    this.rclaw1 = new ModelRenderer(this, 130, 42);
    this.rclaw1.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rclaw1.setRotationPoint(-36.0F, 20.0F, -9.0F);
    this.rclaw1.setTextureSize(64, 32);
    this.rclaw1.mirror = true;
    setRotation(this.rclaw1, 0.0F, 0.1745329F, 0.0F);
    this.rclaw2 = new ModelRenderer(this, 130, 52);
    this.rclaw2.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rclaw2.setRotationPoint(-36.0F, 15.0F, -9.0F);
    this.rclaw2.setTextureSize(64, 32);
    this.rclaw2.mirror = true;
    setRotation(this.rclaw2, 0.0F, 0.1745329F, 0.0F);
    this.rclaw3 = new ModelRenderer(this, 130, 62);
    this.rclaw3.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rclaw3.setRotationPoint(-36.0F, 10.0F, -9.0F);
    this.rclaw3.setTextureSize(64, 32);
    this.rclaw3.mirror = true;
    setRotation(this.rclaw3, 0.0F, 0.1745329F, 0.0F);
    this.rclaw4 = new ModelRenderer(this, 130, 72);
    this.rclaw4.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rclaw4.setRotationPoint(-36.0F, 5.0F, -9.0F);
    this.rclaw4.setTextureSize(64, 32);
    this.rclaw4.mirror = true;
    setRotation(this.rclaw4, 0.0F, 0.1745329F, 0.0F);
    this.rleg = new ModelRenderer(this, 150, 80);
    this.rleg.addBox(-17.0F, 0.0F, -2.0F, 17, 11, 5);
    this.rleg.setRotationPoint(-14.0F, 9.0F, 58.0F);
    this.rleg.setTextureSize(64, 32);
    this.rleg.mirror = true;
    setRotation(this.rleg, 0.0F, -0.6283185F, 0.0F);
    this.rfoot = new ModelRenderer(this, 150, 100);
    this.rfoot.addBox(-12.0F, 0.0F, -2.0F, 12, 14, 4);
    this.rfoot.setRotationPoint(-26.0F, 8.0F, 49.0F);
    this.rfoot.setTextureSize(64, 32);
    this.rfoot.mirror = true;
    setRotation(this.rfoot, 0.0F, 0.0F, 0.0F);
    this.rtoe1 = new ModelRenderer(this, 150, 120);
    this.rtoe1.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rtoe1.setRotationPoint(-36.0F, 21.0F, 48.0F);
    this.rtoe1.setTextureSize(64, 32);
    this.rtoe1.mirror = true;
    setRotation(this.rtoe1, 0.0F, 0.2617994F, 0.0F);
    this.rtoe2 = new ModelRenderer(this, 150, 130);
    this.rtoe2.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rtoe2.setRotationPoint(-36.0F, 16.0F, 48.0F);
    this.rtoe2.setTextureSize(64, 32);
    this.rtoe2.mirror = true;
    setRotation(this.rtoe2, 0.0F, 0.2617994F, 0.0F);
    this.rtoe3 = new ModelRenderer(this, 150, 140);
    this.rtoe3.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rtoe3.setRotationPoint(-36.0F, 11.0F, 48.0F);
    this.rtoe3.setTextureSize(64, 32);
    this.rtoe3.mirror = true;
    setRotation(this.rtoe3, 0.0F, 0.2617994F, 0.0F);
    this.rtoe4 = new ModelRenderer(this, 150, 150);
    this.rtoe4.addBox(-13.0F, 0.0F, -1.0F, 13, 3, 2);
    this.rtoe4.setRotationPoint(-36.0F, 6.0F, 48.0F);
    this.rtoe4.setTextureSize(64, 32);
    this.rtoe4.mirror = true;
    setRotation(this.rtoe4, 0.0F, 0.2617994F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Molenoid e = (Molenoid)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.25F;
    } else if (f1 > 0.1F) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.larm.rotateAngleY = newangle + 0.628F;
    this.larm.rotationPointZ -= (float)Math.sin(this.larm.rotateAngleY) * 15.0F;
    this.larm.rotationPointX += (float)Math.cos(this.larm.rotateAngleY) * 15.0F;
    this.lhand.rotateAngleY = newangle * 1.25F;
    this.lhand.rotationPointZ -= (float)Math.sin(this.lhand.rotateAngleY) * 10.0F;
    this.lhand.rotationPointX += (float)Math.cos(this.lhand.rotateAngleY) * 10.0F;
    this.lclaw1.rotateAngleY = newangle * 1.5F - 0.174F;
    this.lclaw2.rotationPointZ = this.lclaw1.rotationPointZ;
    this.lclaw2.rotationPointX = this.lclaw1.rotationPointX;
    this.lclaw2.rotateAngleY = this.lclaw1.rotateAngleY;
    this.lclaw3.rotationPointZ = this.lclaw1.rotationPointZ;
    this.lclaw3.rotationPointX = this.lclaw1.rotationPointX;
    this.lclaw3.rotateAngleY = this.lclaw1.rotateAngleY;
    this.lclaw4.rotationPointZ = this.lclaw1.rotationPointZ;
    this.lclaw4.rotationPointX = this.lclaw1.rotationPointX;
    this.lclaw4.rotateAngleY = this.lclaw1.rotateAngleY;
    this.rarm.rotateAngleY = newangle - 0.628F;
    this.rarm.rotationPointZ += (float)Math.sin(this.rarm.rotateAngleY) * 15.0F;
    this.rarm.rotationPointX -= (float)Math.cos(this.rarm.rotateAngleY) * 15.0F;
    this.rhand.rotateAngleY = newangle * 1.25F;
    this.rhand.rotationPointZ += (float)Math.sin(this.rhand.rotateAngleY) * 10.0F;
    this.rhand.rotationPointX -= (float)Math.cos(this.rhand.rotateAngleY) * 10.0F;
    this.rclaw1.rotateAngleY = newangle * 1.5F + 0.174F;
    this.rclaw2.rotationPointZ = this.rclaw1.rotationPointZ;
    this.rclaw2.rotationPointX = this.rclaw1.rotationPointX;
    this.rclaw2.rotateAngleY = this.rclaw1.rotateAngleY;
    this.rclaw3.rotationPointZ = this.rclaw1.rotationPointZ;
    this.rclaw3.rotationPointX = this.rclaw1.rotationPointX;
    this.rclaw3.rotateAngleY = this.rclaw1.rotateAngleY;
    this.rclaw4.rotationPointZ = this.rclaw1.rotationPointZ;
    this.rclaw4.rotationPointX = this.rclaw1.rotationPointX;
    this.rclaw4.rotateAngleY = this.rclaw1.rotateAngleY;
    if (f1 > 0.1F) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lleg.rotateAngleY = -newangle + 0.628F;
    this.lleg.rotationPointZ -= (float)Math.sin(this.lleg.rotateAngleY) * 15.0F;
    this.lleg.rotationPointX += (float)Math.cos(this.lleg.rotateAngleY) * 15.0F;
    this.lfoot.rotateAngleY = -newangle * 1.25F;
    this.lfoot.rotationPointZ -= (float)Math.sin(this.lfoot.rotateAngleY) * 10.0F;
    this.lfoot.rotationPointX += (float)Math.cos(this.lfoot.rotateAngleY) * 10.0F;
    this.ltoe1.rotateAngleY = -newangle * 1.5F - 0.261F;
    this.ltoe2.rotationPointZ = this.ltoe1.rotationPointZ;
    this.ltoe2.rotationPointX = this.ltoe1.rotationPointX;
    this.ltoe2.rotateAngleY = this.ltoe1.rotateAngleY;
    this.ltoe3.rotationPointZ = this.ltoe1.rotationPointZ;
    this.ltoe3.rotationPointX = this.ltoe1.rotationPointX;
    this.ltoe3.rotateAngleY = this.ltoe1.rotateAngleY;
    this.ltoe4.rotationPointZ = this.ltoe1.rotationPointZ;
    this.ltoe4.rotationPointX = this.ltoe1.rotationPointX;
    this.ltoe4.rotateAngleY = this.ltoe1.rotateAngleY;
    this.rleg.rotateAngleY = -newangle - 0.628F;
    this.rleg.rotationPointZ += (float)Math.sin(this.rleg.rotateAngleY) * 15.0F;
    this.rleg.rotationPointX -= (float)Math.cos(this.rleg.rotateAngleY) * 15.0F;
    this.rfoot.rotateAngleY = -newangle * 1.25F;
    this.rfoot.rotationPointZ += (float)Math.sin(this.rfoot.rotateAngleY) * 10.0F;
    this.rfoot.rotationPointX -= (float)Math.cos(this.rfoot.rotateAngleY) * 10.0F;
    this.rtoe1.rotateAngleY = -newangle * 1.5F + 0.261F;
    this.rtoe2.rotationPointZ = this.rtoe1.rotationPointZ;
    this.rtoe2.rotationPointX = this.rtoe1.rotationPointX;
    this.rtoe2.rotateAngleY = this.rtoe1.rotateAngleY;
    this.rtoe3.rotationPointZ = this.rtoe1.rotationPointZ;
    this.rtoe3.rotationPointX = this.rtoe1.rotationPointX;
    this.rtoe3.rotateAngleY = this.rtoe1.rotateAngleY;
    this.rtoe4.rotationPointZ = this.rtoe1.rotationPointZ;
    this.rtoe4.rotationPointX = this.rtoe1.rotationPointX;
    this.rtoe4.rotateAngleY = this.rtoe1.rotateAngleY;
    newangle = MathHelper.cos(f2 * 0.1F * this.wingspeed) * 3.1415927F;
    this.nosestar1.rotateAngleZ = newangle;
    this.nosestar2.rotateAngleZ = newangle + 0.523F;
    this.nosestar3.rotateAngleZ = newangle + 1.047F;
    this.nosestar4.rotateAngleZ = newangle + 1.57F;
    this.nosestar5.rotateAngleZ = newangle - 1.047F;
    this.nosestar6.rotateAngleZ = newangle - 0.523F;
    this.body.render(f5);
    this.shoulders.render(f5);
    this.head1.render(f5);
    this.head2.render(f5);
    this.head3.render(f5);
    this.nosestar1.render(f5);
    this.nosestar2.render(f5);
    this.nosestar3.render(f5);
    this.larm.render(f5);
    this.lhand.render(f5);
    this.lclaw1.render(f5);
    this.lclaw2.render(f5);
    this.lclaw3.render(f5);
    this.lclaw4.render(f5);
    this.nosestar4.render(f5);
    this.nosestar5.render(f5);
    this.nosestar6.render(f5);
    this.butt.render(f5);
    this.tail.render(f5);
    this.lleg.render(f5);
    this.lfoot.render(f5);
    this.ltoe1.render(f5);
    this.ltoe2.render(f5);
    this.ltoe3.render(f5);
    this.ltoe4.render(f5);
    this.rarm.render(f5);
    this.rhand.render(f5);
    this.rclaw1.render(f5);
    this.rclaw2.render(f5);
    this.rclaw3.render(f5);
    this.rclaw4.render(f5);
    this.rleg.render(f5);
    this.rfoot.render(f5);
    this.rtoe1.render(f5);
    this.rtoe2.render(f5);
    this.rtoe3.render(f5);
    this.rtoe4.render(f5);
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
