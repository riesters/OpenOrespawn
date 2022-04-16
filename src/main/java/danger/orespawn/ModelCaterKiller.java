package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCaterKiller extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Head;
  
  ModelRenderer falsehead;
  
  ModelRenderer seg1;
  
  ModelRenderer ltusk1;
  
  ModelRenderer ltusk2;
  
  ModelRenderer rtusk1;
  
  ModelRenderer rtusk2;
  
  ModelRenderer ljaw;
  
  ModelRenderer rjaw;
  
  ModelRenderer seg1lspike;
  
  ModelRenderer seg1rspike;
  
  ModelRenderer seg1ltopspike;
  
  ModelRenderer seg1rtopspike;
  
  ModelRenderer seg1lleg;
  
  ModelRenderer seg1rleg;
  
  ModelRenderer seg2;
  
  ModelRenderer seg2lfoot;
  
  ModelRenderer seg2rfoot;
  
  ModelRenderer seg2ltopspike;
  
  ModelRenderer seg2rtopspike;
  
  ModelRenderer seg2lspike;
  
  ModelRenderer seg2rspike;
  
  ModelRenderer seg3;
  
  ModelRenderer seg3lfoot;
  
  ModelRenderer seg3rfoot;
  
  ModelRenderer seg3lspike;
  
  ModelRenderer seg3rspike;
  
  ModelRenderer seg3ltopspike;
  
  ModelRenderer seg3rtopspike;
  
  ModelRenderer seg3lbackspike;
  
  ModelRenderer seg3rbackspike;
  
  public ModelCaterKiller(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 512;
    this.Head = new ModelRenderer(this, 0, 50);
    this.Head.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 8);
    this.Head.setRotationPoint(0.0F, -8.0F, -12.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.falsehead = new ModelRenderer(this, 0, 100);
    this.falsehead.addBox(-10.0F, -27.0F, -11.0F, 20, 20, 10);
    this.falsehead.setRotationPoint(0.0F, -8.0F, -12.0F);
    this.falsehead.setTextureSize(64, 32);
    this.falsehead.mirror = true;
    setRotation(this.falsehead, -0.1570796F, 0.0F, 0.0F);
    this.seg1 = new ModelRenderer(this, 0, 200);
    this.seg1.addBox(-14.0F, -31.0F, 0.0F, 28, 32, 14);
    this.seg1.setRotationPoint(0.0F, -8.0F, -12.0F);
    this.seg1.setTextureSize(64, 32);
    this.seg1.mirror = true;
    setRotation(this.seg1, 0.0F, 0.0F, 0.0F);
    this.ltusk1 = new ModelRenderer(this, 0, 140);
    this.ltusk1.addBox(-1.0F, -1.0F, -1.0F, 33, 3, 3);
    this.ltusk1.setRotationPoint(9.0F, -25.0F, -19.0F);
    this.ltusk1.setTextureSize(64, 32);
    this.ltusk1.mirror = true;
    setRotation(this.ltusk1, 0.0F, 0.5585054F, 0.0F);
    this.ltusk2 = new ModelRenderer(this, 0, 160);
    this.ltusk2.addBox(0.0F, 0.0F, 0.0F, 20, 1, 1);
    this.ltusk2.setRotationPoint(36.0F, -25.0F, -36.0F);
    this.ltusk2.setTextureSize(64, 32);
    this.ltusk2.mirror = true;
    setRotation(this.ltusk2, 0.0F, 0.8028515F, 0.0F);
    this.rtusk1 = new ModelRenderer(this, 0, 150);
    this.rtusk1.addBox(-33.0F, 0.0F, 0.0F, 33, 3, 3);
    this.rtusk1.setRotationPoint(-8.0F, -25.0F, -17.0F);
    this.rtusk1.setTextureSize(64, 32);
    this.rtusk1.mirror = true;
    setRotation(this.rtusk1, 0.0F, -0.5585054F, 0.0F);
    this.rtusk2 = new ModelRenderer(this, 0, 170);
    this.rtusk2.addBox(-20.0F, 0.0F, 0.0F, 20, 1, 1);
    this.rtusk2.setRotationPoint(-36.0F, -24.0F, -34.0F);
    this.rtusk2.setTextureSize(64, 32);
    this.rtusk2.mirror = true;
    setRotation(this.rtusk2, 0.0F, -0.8028515F, 0.0F);
    this.ljaw = new ModelRenderer(this, 100, 50);
    this.ljaw.addBox(0.0F, 0.0F, 0.0F, 1, 7, 4);
    this.ljaw.setRotationPoint(4.0F, -1.0F, -18.0F);
    this.ljaw.setTextureSize(64, 32);
    this.ljaw.mirror = true;
    setRotation(this.ljaw, 0.0F, 0.0F, 0.1396263F);
    this.rjaw = new ModelRenderer(this, 125, 50);
    this.rjaw.addBox(0.0F, 0.0F, 0.0F, 1, 7, 4);
    this.rjaw.setRotationPoint(-5.0F, -1.0F, -18.0F);
    this.rjaw.setTextureSize(64, 32);
    this.rjaw.mirror = true;
    setRotation(this.rjaw, 0.0F, 0.0F, -0.1396263F);
    this.seg1lspike = new ModelRenderer(this, 0, 260);
    this.seg1lspike.addBox(-1.0F, -1.0F, -1.0F, 33, 2, 2);
    this.seg1lspike.setRotationPoint(14.0F, -32.0F, -6.0F);
    this.seg1lspike.setTextureSize(64, 32);
    this.seg1lspike.mirror = true;
    setRotation(this.seg1lspike, 0.0F, 0.3316126F, -0.122173F);
    this.seg1rspike = new ModelRenderer(this, 0, 270);
    this.seg1rspike.addBox(-33.0F, -1.0F, -1.0F, 33, 2, 2);
    this.seg1rspike.setRotationPoint(-13.0F, -32.0F, -6.0F);
    this.seg1rspike.setTextureSize(64, 32);
    this.seg1rspike.mirror = true;
    setRotation(this.seg1rspike, 0.0F, -0.3316126F, 0.122173F);
    this.seg1ltopspike = new ModelRenderer(this, 125, 260);
    this.seg1ltopspike.addBox(-2.0F, -8.0F, -2.0F, 4, 9, 4);
    this.seg1ltopspike.setRotationPoint(8.0F, -39.0F, -6.0F);
    this.seg1ltopspike.setTextureSize(64, 32);
    this.seg1ltopspike.mirror = true;
    setRotation(this.seg1ltopspike, 0.0F, 0.0F, 0.1396263F);
    this.seg1rtopspike = new ModelRenderer(this, 150, 260);
    this.seg1rtopspike.addBox(-2.0F, -8.0F, -2.0F, 4, 9, 4);
    this.seg1rtopspike.setRotationPoint(-10.0F, -39.0F, -6.0F);
    this.seg1rtopspike.setTextureSize(64, 32);
    this.seg1rtopspike.mirror = true;
    setRotation(this.seg1rtopspike, 0.0F, 0.0F, -0.1396263F);
    this.seg1lleg = new ModelRenderer(this, 125, 200);
    this.seg1lleg.addBox(-1.0F, 0.0F, -1.0F, 2, 16, 2);
    this.seg1lleg.setRotationPoint(8.0F, -8.0F, -5.0F);
    this.seg1lleg.setTextureSize(64, 32);
    this.seg1lleg.mirror = true;
    setRotation(this.seg1lleg, 0.0F, 0.0F, 0.1570796F);
    this.seg1rleg = new ModelRenderer(this, 150, 200);
    this.seg1rleg.addBox(0.0F, 0.0F, 0.0F, 2, 16, 2);
    this.seg1rleg.setRotationPoint(-9.0F, -8.0F, -5.0F);
    this.seg1rleg.setTextureSize(64, 32);
    this.seg1rleg.mirror = true;
    setRotation(this.seg1rleg, 0.0F, 0.0F, -0.1570796F);
    this.seg2 = new ModelRenderer(this, 0, 300);
    this.seg2.addBox(-20.0F, -17.0F, -9.0F, 40, 34, 18);
    this.seg2.setRotationPoint(0.0F, -2.0F, 32.0F);
    this.seg2.setTextureSize(64, 32);
    this.seg2.mirror = true;
    setRotation(this.seg2, 0.0F, 0.0F, 0.0F);
    this.seg2lfoot = new ModelRenderer(this, 125, 300);
    this.seg2lfoot.addBox(-5.0F, 0.0F, -5.0F, 10, 10, 10);
    this.seg2lfoot.setRotationPoint(13.0F, 14.0F, 32.0F);
    this.seg2lfoot.setTextureSize(64, 32);
    this.seg2lfoot.mirror = true;
    setRotation(this.seg2lfoot, 0.0F, 0.0F, 0.0F);
    this.seg2rfoot = new ModelRenderer(this, 175, 300);
    this.seg2rfoot.addBox(-5.0F, 0.0F, -5.0F, 10, 10, 10);
    this.seg2rfoot.setRotationPoint(-13.0F, 14.0F, 32.0F);
    this.seg2rfoot.setTextureSize(64, 32);
    this.seg2rfoot.mirror = true;
    setRotation(this.seg2rfoot, 0.0F, 0.0F, 0.0F);
    this.seg2ltopspike = new ModelRenderer(this, 100, 360);
    this.seg2ltopspike.addBox(-2.0F, -9.0F, -2.0F, 4, 9, 4);
    this.seg2ltopspike.setRotationPoint(14.0F, -18.0F, 32.0F);
    this.seg2ltopspike.setTextureSize(64, 32);
    this.seg2ltopspike.mirror = true;
    setRotation(this.seg2ltopspike, 0.0F, 0.0F, 0.1396263F);
    this.seg2rtopspike = new ModelRenderer(this, 125, 360);
    this.seg2rtopspike.addBox(-2.0F, -9.0F, -2.0F, 4, 9, 4);
    this.seg2rtopspike.setRotationPoint(-14.0F, -18.0F, 32.0F);
    this.seg2rtopspike.setTextureSize(64, 32);
    this.seg2rtopspike.mirror = true;
    setRotation(this.seg2rtopspike, 0.0F, 0.0F, -0.1396263F);
    this.seg2lspike = new ModelRenderer(this, 0, 360);
    this.seg2lspike.addBox(0.0F, -1.0F, -1.0F, 20, 2, 2);
    this.seg2lspike.setRotationPoint(18.0F, -9.0F, 32.0F);
    this.seg2lspike.setTextureSize(64, 32);
    this.seg2lspike.mirror = true;
    setRotation(this.seg2lspike, 0.0F, 0.0F, -0.0698132F);
    this.seg2rspike = new ModelRenderer(this, 0, 370);
    this.seg2rspike.addBox(-20.0F, -1.0F, -1.0F, 20, 2, 2);
    this.seg2rspike.setRotationPoint(-18.0F, -9.0F, 32.0F);
    this.seg2rspike.setTextureSize(64, 32);
    this.seg2rspike.mirror = true;
    setRotation(this.seg2rspike, 0.0F, 0.0F, 0.0698132F);
    this.seg3 = new ModelRenderer(this, 0, 400);
    this.seg3.addBox(-15.0F, -14.0F, -7.0F, 30, 28, 14);
    this.seg3.setRotationPoint(0.0F, 3.0F, 48.0F);
    this.seg3.setTextureSize(64, 32);
    this.seg3.mirror = true;
    setRotation(this.seg3, 0.0F, 0.0F, 0.0F);
    this.seg3lfoot = new ModelRenderer(this, 100, 400);
    this.seg3lfoot.addBox(-4.0F, 0.0F, -6.0F, 8, 8, 12);
    this.seg3lfoot.setRotationPoint(10.0F, 16.0F, 48.0F);
    this.seg3lfoot.setTextureSize(64, 32);
    this.seg3lfoot.mirror = true;
    setRotation(this.seg3lfoot, 0.0F, 0.0F, 0.0F);
    this.seg3rfoot = new ModelRenderer(this, 150, 400);
    this.seg3rfoot.addBox(-4.0F, 0.0F, -6.0F, 8, 8, 12);
    this.seg3rfoot.setRotationPoint(-10.0F, 16.0F, 48.0F);
    this.seg3rfoot.setTextureSize(64, 32);
    this.seg3rfoot.mirror = true;
    setRotation(this.seg3rfoot, 0.0F, 0.0F, 0.0F);
    this.seg3lspike = new ModelRenderer(this, 0, 450);
    this.seg3lspike.addBox(0.0F, -1.0F, -1.0F, 14, 2, 2);
    this.seg3lspike.setRotationPoint(14.0F, -4.0F, 48.0F);
    this.seg3lspike.setTextureSize(64, 32);
    this.seg3lspike.mirror = true;
    setRotation(this.seg3lspike, 0.0F, 0.0F, -0.0698132F);
    this.seg3rspike = new ModelRenderer(this, 0, 460);
    this.seg3rspike.addBox(-14.0F, -1.0F, -1.0F, 14, 2, 2);
    this.seg3rspike.setRotationPoint(-14.0F, -4.0F, 48.0F);
    this.seg3rspike.setTextureSize(64, 32);
    this.seg3rspike.mirror = true;
    setRotation(this.seg3rspike, 0.0F, 0.0F, 0.0698132F);
    this.seg3ltopspike = new ModelRenderer(this, 100, 450);
    this.seg3ltopspike.addBox(-2.0F, -13.0F, -2.0F, 3, 13, 3);
    this.seg3ltopspike.setRotationPoint(10.0F, -10.0F, 48.0F);
    this.seg3ltopspike.setTextureSize(64, 32);
    this.seg3ltopspike.mirror = true;
    setRotation(this.seg3ltopspike, 0.0F, 0.0F, 0.1396263F);
    this.seg3rtopspike = new ModelRenderer(this, 120, 450);
    this.seg3rtopspike.addBox(-2.0F, -13.0F, -2.0F, 3, 13, 3);
    this.seg3rtopspike.setRotationPoint(-10.0F, -10.0F, 48.0F);
    this.seg3rtopspike.setTextureSize(64, 32);
    this.seg3rtopspike.mirror = true;
    setRotation(this.seg3rtopspike, 0.0F, 0.0F, -0.1396263F);
    this.seg3lbackspike = new ModelRenderer(this, 50, 450);
    this.seg3lbackspike.addBox(-2.0F, -20.0F, -2.0F, 4, 20, 4);
    this.seg3lbackspike.setRotationPoint(13.0F, -8.0F, 54.0F);
    this.seg3lbackspike.setTextureSize(64, 32);
    this.seg3lbackspike.mirror = true;
    setRotation(this.seg3lbackspike, -0.9773844F, 0.2792527F, 0.1396263F);
    this.seg3rbackspike = new ModelRenderer(this, 75, 450);
    this.seg3rbackspike.addBox(-2.0F, -20.0F, -2.0F, 4, 20, 4);
    this.seg3rbackspike.setRotationPoint(-13.0F, -8.0F, 54.0F);
    this.seg3rbackspike.setTextureSize(64, 32);
    this.seg3rbackspike.mirror = true;
    setRotation(this.seg3rbackspike, -0.9773844F, -0.3490659F, 0.1396263F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    CaterKiller e = (CaterKiller)entity;
    float newangle = 0.0F;
    float headoff = 0.0F;
    float zpi = 0.0F;
    float zdist = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 3.1415927F * 0.07F;
    } else {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.025F;
    } 
    this.ljaw.rotateAngleZ = 0.139F + newangle;
    this.rjaw.rotateAngleZ = -0.139F - newangle;
    if (e.getAttacking() != 0) {
      headoff = MathHelper.cos(f2 * 1.7F * this.wingspeed) * 8.0F;
    } else {
      headoff = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 2.0F;
    } 
    this.Head.rotationPointY = -8.0F + headoff;
    this.falsehead.rotationPointY = -8.0F + headoff;
    this.ltusk1.rotationPointY = -25.0F + headoff;
    this.ltusk2.rotationPointY = -25.0F + headoff;
    this.rtusk1.rotationPointY = -25.0F + headoff;
    this.rtusk2.rotationPointY = -25.0F + headoff;
    this.ljaw.rotationPointY = -1.0F + headoff;
    this.rjaw.rotationPointY = -1.0F + headoff;
    newangle = MathHelper.cos(f2 * 2.11F * this.wingspeed) * 3.1415927F * 0.08F;
    this.ltusk2.rotateAngleY = 0.802F + newangle;
    newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.08F;
    this.rtusk2.rotateAngleY = -0.802F + newangle;
    this.Head.render(f5);
    this.falsehead.render(f5);
    this.ltusk1.render(f5);
    this.ltusk2.render(f5);
    this.rtusk1.render(f5);
    this.rtusk2.render(f5);
    this.ljaw.render(f5);
    this.rjaw.render(f5);
    int i;
    for (i = 0; i < 3; i++) {
      this.seg1.rotationPointY = -8.0F + headoff / (i + 1) + (8 * i);
      this.seg1lspike.rotationPointY = -32.0F + headoff / (i + 1) + (8 * i);
      this.seg1rspike.rotationPointY = -32.0F + headoff / (i + 1) + (8 * i);
      this.seg1ltopspike.rotationPointY = -39.0F + headoff / (i + 1) + (8 * i);
      this.seg1rtopspike.rotationPointY = -39.0F + headoff / (i + 1) + (8 * i);
      this.seg1lleg.rotationPointY = -8.0F + headoff / (i + 1) + (8 * i);
      this.seg1rleg.rotationPointY = -8.0F + headoff / (i + 1) + (8 * i);
      this.seg1.rotationPointZ = (-12 + 14 * i);
      this.seg1lspike.rotationPointZ = (-6 + 14 * i);
      this.seg1rspike.rotationPointZ = (-6 + 14 * i);
      this.seg1ltopspike.rotationPointZ = (-6 + 14 * i);
      this.seg1rtopspike.rotationPointZ = (-6 + 14 * i);
      this.seg1lleg.rotationPointZ = (-5 + 14 * i);
      this.seg1rleg.rotationPointZ = (-5 + 14 * i);
      newangle = MathHelper.cos((float)((f2 * 0.91F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.08F;
      this.seg1lspike.rotateAngleZ = newangle;
      this.seg1rspike.rotateAngleZ = -newangle;
      if (e.getAttacking() != 0) {
        newangle = MathHelper.cos((float)((f2 * 2.91F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.15F;
      } else {
        newangle = MathHelper.cos((float)((f2 * 0.35F * this.wingspeed) + 0.39269908169872414D * i)) * 3.1415927F * 0.04F;
      } 
      this.seg1lleg.rotateAngleX = newangle;
      this.seg1rleg.rotateAngleX = -newangle;
      this.seg1.render(f5);
      this.seg1lspike.render(f5);
      this.seg1rspike.render(f5);
      this.seg1ltopspike.render(f5);
      this.seg1rtopspike.render(f5);
      this.seg1lleg.render(f5);
      this.seg1rleg.render(f5);
    } 
    for (i = 0; i < 6; i++) {
      zdist = MathHelper.cos(f2 * 1.7F * this.wingspeed + zpi) * 1.5F * f1;
      this.seg2.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2lfoot.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2rfoot.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2ltopspike.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2rtopspike.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2lspike.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      this.seg2rspike.rotationPointZ = 39.0F + (16.0F + zdist) * i;
      newangle = MathHelper.cos((float)((f2 * 0.4F * this.wingspeed) - 0.39269908169872414D * i)) * 3.1415927F * 0.07F;
      this.seg2lspike.rotateAngleZ = newangle;
      this.seg2rspike.rotateAngleZ = -newangle;
      this.seg2.render(f5);
      this.seg2lfoot.render(f5);
      this.seg2rfoot.render(f5);
      this.seg2ltopspike.render(f5);
      this.seg2rtopspike.render(f5);
      this.seg2lspike.render(f5);
      this.seg2rspike.render(f5);
      zpi += 0.7853982F;
    } 
    this.seg2rspike.rotationPointZ += 16.0F;
    this.seg3lfoot.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3rfoot.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3lspike.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3rspike.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3ltopspike.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3rtopspike.rotationPointZ = this.seg3.rotationPointZ;
    this.seg3.rotationPointZ += 6.0F;
    this.seg3.rotationPointZ += 6.0F;
    i = 6;
    newangle = MathHelper.cos((float)((f2 * 0.4F * this.wingspeed) - 0.39269908169872414D * i)) * 3.1415927F * 0.07F;
    this.seg3lspike.rotateAngleZ = newangle;
    this.seg3rspike.rotateAngleZ = -newangle;
    newangle = MathHelper.cos(f2 * 0.81F * this.wingspeed) * 3.1415927F * 0.04F;
    this.seg3lbackspike.rotateAngleX = -0.977F + newangle;
    newangle = MathHelper.cos(f2 * 0.87F * this.wingspeed) * 3.1415927F * 0.04F;
    this.seg3rbackspike.rotateAngleX = -0.977F + newangle;
    newangle = MathHelper.cos(f2 * 1.11F * this.wingspeed) * 3.1415927F * 0.04F;
    this.seg3lbackspike.rotateAngleY = 0.28F + newangle;
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.04F;
    this.seg3rbackspike.rotateAngleY = -0.28F + newangle;
    this.seg3.render(f5);
    this.seg3lfoot.render(f5);
    this.seg3rfoot.render(f5);
    this.seg3lspike.render(f5);
    this.seg3rspike.render(f5);
    this.seg3ltopspike.render(f5);
    this.seg3rtopspike.render(f5);
    this.seg3lbackspike.render(f5);
    this.seg3rbackspike.render(f5);
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
