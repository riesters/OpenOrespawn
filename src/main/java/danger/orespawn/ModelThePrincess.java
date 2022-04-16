package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelThePrincess extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer neck1;
  
  ModelRenderer neck;
  
  ModelRenderer neckbase;
  
  ModelRenderer head;
  
  ModelRenderer Rleg1;
  
  ModelRenderer Lleg1;
  
  ModelRenderer snout;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer tail4;
  
  ModelRenderer Lwing;
  
  ModelRenderer Rwing;
  
  ModelRenderer Tail5;
  
  ModelRenderer Tail6;
  
  ModelRenderer Lneck1;
  
  ModelRenderer Lneck;
  
  ModelRenderer Lhead;
  
  ModelRenderer Lsnout;
  
  ModelRenderer Rneck1;
  
  ModelRenderer Rneck;
  
  ModelRenderer Rhead;
  
  ModelRenderer Rsnout;
  
  ModelRenderer headfin;
  
  ModelRenderer Lheadfin;
  
  ModelRenderer Rheadfin;
  
  ModelRenderer Backfin;
  
  ModelRenderer Rwing2;
  
  ModelRenderer Rwing3;
  
  ModelRenderer Lwing2;
  
  ModelRenderer Lwing3;
  
  ModelRenderer Ljaw;
  
  ModelRenderer jaw;
  
  ModelRenderer Rjaw;
  
  ModelRenderer Lpower;
  
  ModelRenderer Cpower;
  
  ModelRenderer Rpower;
  
  public ModelThePrincess(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.body = new ModelRenderer(this, 59, 34);
    this.body.addBox(-7.0F, -3.0F, -3.0F, 13, 8, 8);
    this.body.setRotationPoint(0.5F, 15.0F, 1.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 20, 45);
    this.neck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
    this.neck1.setRotationPoint(0.0F, 15.0F, -5.0F);
    this.neck1.setTextureSize(64, 32);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 20, 31);
    this.neck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
    this.neck.setRotationPoint(0.0F, 14.0F, -6.0F);
    this.neck.setTextureSize(64, 32);
    this.neck.mirror = true;
    setRotation(this.neck, 0.0F, 0.0F, 0.0F);
    this.neckbase = new ModelRenderer(this, 0, 76);
    this.neckbase.addBox(-4.5F, -4.0F, 0.0F, 9, 6, 3);
    this.neckbase.setRotationPoint(0.0F, 17.0F, 5.0F);
    this.neckbase.setTextureSize(64, 32);
    this.neckbase.mirror = true;
    setRotation(this.neckbase, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 20, 20);
    this.head.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
    this.head.setRotationPoint(0.0F, 7.0F, -6.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.Rleg1 = new ModelRenderer(this, 0, 58);
    this.Rleg1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4);
    this.Rleg1.setRotationPoint(6.0F, 16.0F, 1.0F);
    this.Rleg1.setTextureSize(64, 32);
    this.Rleg1.mirror = true;
    setRotation(this.Rleg1, 0.0F, 0.0F, 0.0F);
    this.Lleg1 = new ModelRenderer(this, 15, 58);
    this.Lleg1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4);
    this.Lleg1.setRotationPoint(-6.0F, 16.0F, 1.0F);
    this.Lleg1.setTextureSize(64, 32);
    this.Lleg1.mirror = true;
    setRotation(this.Lleg1, 0.0F, 0.0F, 0.0F);
    this.snout = new ModelRenderer(this, 20, 11);
    this.snout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
    this.snout.setRotationPoint(0.0F, 7.0F, -6.0F);
    this.snout.setTextureSize(64, 32);
    this.snout.mirror = true;
    setRotation(this.snout, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 0, 86);
    this.tail2.addBox(-3.0F, -2.5F, 0.0F, 6, 4, 7);
    this.tail2.setRotationPoint(0.0F, 16.0F, 7.0F);
    this.tail2.setTextureSize(64, 32);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.3839724F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 0, 98);
    this.tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 3, 6);
    this.tail3.setRotationPoint(0.0F, 18.2F, 13.0F);
    this.tail3.setTextureSize(64, 32);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 0, 108);
    this.tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 2, 5);
    this.tail4.setRotationPoint(0.0F, 19.5F, 18.0F);
    this.tail4.setTextureSize(64, 32);
    this.tail4.mirror = true;
    setRotation(this.tail4, -0.0698132F, 0.0F, 0.0F);
    this.Lwing = new ModelRenderer(this, 59, 0);
    this.Lwing.addBox(-22.0F, 0.0F, -3.0F, 22, 0, 10);
    this.Lwing.setRotationPoint(-6.0F, 12.6F, 0.0F);
    this.Lwing.setTextureSize(64, 32);
    this.Lwing.mirror = true;
    setRotation(this.Lwing, 0.0F, 0.0F, 0.4014257F);
    this.Rwing = new ModelRenderer(this, 59, 66);
    this.Rwing.addBox(0.0F, 0.0F, -3.0F, 22, 0, 10);
    this.Rwing.setRotationPoint(6.0F, 12.6F, 0.0F);
    this.Rwing.setTextureSize(64, 32);
    this.Rwing.mirror = true;
    setRotation(this.Rwing, 0.0F, 0.0F, -0.4014257F);
    this.Tail5 = new ModelRenderer(this, 0, 116);
    this.Tail5.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 4);
    this.Tail5.setRotationPoint(0.0F, 18.0F, 22.0F);
    this.Tail5.setTextureSize(64, 32);
    this.Tail5.mirror = true;
    setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
    this.Tail6 = new ModelRenderer(this, 0, 123);
    this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2);
    this.Tail6.setRotationPoint(0.0F, 18.0F, 26.0F);
    this.Tail6.setTextureSize(64, 32);
    this.Tail6.mirror = true;
    setRotation(this.Tail6, 0.0F, 0.0F, 0.0F);
    this.Lneck1 = new ModelRenderer(this, 0, 45);
    this.Lneck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
    this.Lneck1.setRotationPoint(4.5F, 15.0F, -5.0F);
    this.Lneck1.setTextureSize(64, 32);
    this.Lneck1.mirror = true;
    setRotation(this.Lneck1, 0.0F, 0.0F, 0.0F);
    this.Lneck = new ModelRenderer(this, 0, 30);
    this.Lneck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
    this.Lneck.setRotationPoint(4.5F, 14.0F, -6.0F);
    this.Lneck.setTextureSize(64, 32);
    this.Lneck.mirror = true;
    setRotation(this.Lneck, 0.0F, 0.0F, 0.0F);
    this.Lhead = new ModelRenderer(this, 0, 20);
    this.Lhead.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
    this.Lhead.setRotationPoint(4.5F, 7.0F, -6.0F);
    this.Lhead.setTextureSize(64, 32);
    this.Lhead.mirror = true;
    setRotation(this.Lhead, -0.0174533F, 0.0F, 0.0F);
    this.Lsnout = new ModelRenderer(this, 0, 11);
    this.Lsnout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
    this.Lsnout.setRotationPoint(4.5F, 7.0F, -6.0F);
    this.Lsnout.setTextureSize(64, 32);
    this.Lsnout.mirror = true;
    setRotation(this.Lsnout, 0.0F, 0.0F, 0.0F);
    this.Rneck1 = new ModelRenderer(this, 40, 45);
    this.Rneck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
    this.Rneck1.setRotationPoint(-4.5F, 15.0F, -5.0F);
    this.Rneck1.setTextureSize(64, 32);
    this.Rneck1.mirror = true;
    setRotation(this.Rneck1, 0.0F, 0.0F, 0.0F);
    this.Rneck = new ModelRenderer(this, 40, 31);
    this.Rneck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
    this.Rneck.setRotationPoint(-4.5F, 14.0F, -6.0F);
    this.Rneck.setTextureSize(64, 32);
    this.Rneck.mirror = true;
    setRotation(this.Rneck, 0.0F, 0.0F, 0.0F);
    this.Rhead = new ModelRenderer(this, 40, 20);
    this.Rhead.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
    this.Rhead.setRotationPoint(-4.5F, 7.0F, -6.0F);
    this.Rhead.setTextureSize(64, 32);
    this.Rhead.mirror = true;
    setRotation(this.Rhead, 0.0F, 0.0F, 0.0F);
    this.Rsnout = new ModelRenderer(this, 40, 11);
    this.Rsnout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
    this.Rsnout.setRotationPoint(-4.5F, 7.0F, -6.0F);
    this.Rsnout.setTextureSize(64, 32);
    this.Rsnout.mirror = true;
    setRotation(this.Rsnout, 0.0F, 0.0F, 0.0F);
    this.headfin = new ModelRenderer(this, 20, 0);
    this.headfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
    this.headfin.setRotationPoint(0.0F, 7.0F, -6.0F);
    this.headfin.setTextureSize(64, 32);
    this.headfin.mirror = true;
    setRotation(this.headfin, -0.122173F, 0.0F, 0.0F);
    this.Lheadfin = new ModelRenderer(this, 0, 0);
    this.Lheadfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
    this.Lheadfin.setRotationPoint(4.5F, 7.0F, -6.0F);
    this.Lheadfin.setTextureSize(64, 32);
    this.Lheadfin.mirror = true;
    setRotation(this.Lheadfin, -0.122173F, 0.0F, 0.0F);
    this.Rheadfin = new ModelRenderer(this, 40, 0);
    this.Rheadfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
    this.Rheadfin.setRotationPoint(-4.5F, 7.0F, -6.0F);
    this.Rheadfin.setTextureSize(64, 32);
    this.Rheadfin.mirror = true;
    setRotation(this.Rheadfin, -0.122173F, 0.0F, 0.0F);
    this.Backfin = new ModelRenderer(this, 35, 57);
    this.Backfin.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 5);
    this.Backfin.setRotationPoint(0.0F, 12.0F, -1.0F);
    this.Backfin.setTextureSize(64, 32);
    this.Backfin.mirror = true;
    setRotation(this.Backfin, 0.5061455F, 0.0F, 0.0F);
    this.Rwing2 = new ModelRenderer(this, 59, 77);
    this.Rwing2.addBox(0.0F, 0.0F, -3.0F, 12, 0, 10);
    this.Rwing2.setRotationPoint(6.0F, 12.6F, 0.0F);
    this.Rwing2.setTextureSize(64, 32);
    this.Rwing2.mirror = true;
    setRotation(this.Rwing2, 0.0F, 0.0F, -0.6981317F);
    this.Rwing3 = new ModelRenderer(this, 59, 88);
    this.Rwing3.addBox(0.0F, 0.0F, -3.0F, 10, 0, 10);
    this.Rwing3.setRotationPoint(6.0F, 12.6F, 0.0F);
    this.Rwing3.setTextureSize(64, 32);
    this.Rwing3.mirror = true;
    setRotation(this.Rwing3, 0.0F, 0.0F, -0.0698132F);
    this.Lwing2 = new ModelRenderer(this, 59, 11);
    this.Lwing2.addBox(-12.0F, 0.0F, -3.0F, 12, 0, 10);
    this.Lwing2.setRotationPoint(-6.0F, 12.6F, 0.0F);
    this.Lwing2.setTextureSize(64, 32);
    this.Lwing2.mirror = true;
    setRotation(this.Lwing2, 0.0F, 0.0F, 0.6981317F);
    this.Lwing3 = new ModelRenderer(this, 59, 22);
    this.Lwing3.addBox(-10.0F, 0.0F, -3.0F, 10, 0, 10);
    this.Lwing3.setRotationPoint(-6.0F, 12.6F, 0.0F);
    this.Lwing3.setTextureSize(64, 32);
    this.Lwing3.mirror = true;
    setRotation(this.Lwing3, 0.0F, 0.0F, 0.0698132F);
    this.Ljaw = new ModelRenderer(this, 30, 70);
    this.Ljaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
    this.Ljaw.setRotationPoint(4.5F, 7.0F, -7.0F);
    this.Ljaw.setTextureSize(64, 32);
    this.Ljaw.mirror = true;
    setRotation(this.Ljaw, 0.2443461F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 30, 80);
    this.jaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
    this.jaw.setRotationPoint(0.0F, 7.0F, -7.0F);
    this.jaw.setTextureSize(64, 32);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.2443461F, 0.0F, 0.0F);
    this.Rjaw = new ModelRenderer(this, 30, 90);
    this.Rjaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
    this.Rjaw.setRotationPoint(-4.5F, 7.0F, -7.0F);
    this.Rjaw.setTextureSize(64, 32);
    this.Rjaw.mirror = true;
    setRotation(this.Rjaw, 0.2443461F, 0.0F, 0.0F);
    this.Lpower = new ModelRenderer(this, 30, 100);
    this.Lpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
    this.Lpower.setRotationPoint(4.5F, 17.0F, -5.0F);
    this.Lpower.setTextureSize(128, 128);
    this.Lpower.mirror = true;
    setRotation(this.Lpower, 0.0F, 0.0F, 0.0F);
    this.Cpower = new ModelRenderer(this, 50, 100);
    this.Cpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
    this.Cpower.setRotationPoint(0.0F, 17.0F, -5.0F);
    this.Cpower.setTextureSize(128, 128);
    this.Cpower.mirror = true;
    setRotation(this.Cpower, 0.0F, 0.0F, 0.0F);
    this.Rpower = new ModelRenderer(this, 70, 100);
    this.Rpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
    this.Rpower.setRotationPoint(-4.5F, 17.0F, -5.0F);
    this.Rpower.setTextureSize(128, 128);
    this.Rpower.mirror = true;
    setRotation(this.Rpower, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    ThePrincess c = (ThePrincess)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    int current_activity = c.getActivity();
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D || c.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.4F * f1;
    } else {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.04F;
    } 
    this.Rwing.rotateAngleZ = newangle - 0.4F;
    this.Rwing2.rotateAngleZ = newangle - 0.6F;
    this.Rwing3.rotateAngleZ = newangle - 0.2F;
    this.Lwing.rotateAngleZ = -newangle + 0.4F;
    this.Lwing2.rotateAngleZ = -newangle + 0.6F;
    this.Lwing3.rotateAngleZ = -newangle + 0.2F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    if (current_activity != 2 || c.getAttacking() != 0) {
      this.Rleg1.rotateAngleX = newangle;
      this.Lleg1.rotateAngleX = -newangle;
    } else {
      newangle = -1.0F;
      this.Rleg1.rotateAngleX = newangle;
      this.Lleg1.rotateAngleX = newangle;
    } 
    newangle = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.06F;
    if (c.isSitting() == true)
      newangle = 0.0F; 
    if (c.getAttacking() != 0)
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.12F; 
    this.tail2.rotateAngleY = newangle;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 6.0F;
    this.tail2.rotationPointX += (float)Math.sin(this.tail2.rotateAngleY) * 6.0F;
    this.tail3.rotateAngleY = newangle * 1.6F;
    this.tail3.rotationPointZ += (float)Math.cos(this.tail3.rotateAngleY) * 5.0F;
    this.tail3.rotationPointX += (float)Math.sin(this.tail3.rotateAngleY) * 5.0F;
    this.tail4.rotateAngleY = newangle * 2.6F;
    this.tail4.rotationPointZ += (float)Math.cos(this.tail4.rotateAngleY) * 4.0F;
    this.tail4.rotationPointX += (float)Math.sin(this.tail4.rotateAngleY) * 4.0F;
    this.Tail5.rotateAngleY = newangle * 3.6F;
    this.Tail5.rotationPointZ += (float)Math.cos(this.Tail5.rotateAngleY) * 4.0F;
    this.Tail5.rotationPointX += (float)Math.sin(this.Tail5.rotateAngleY) * 4.0F;
    this.Tail6.rotateAngleY = newangle * 4.6F;
    float h3 = f3 * 2.0F / 3.0F, h2 = h3, h1 = h2;
    float d3 = f4 * 2.0F / 3.0F, d2 = d3, d1 = d2;
    if (h1 < 0.0F) {
      h2 = h3 = h1 / 2.0F;
      d2 = d3 = d1 / 2.0F;
    } else {
      h2 = h1 = h3 / 2.0F;
      d2 = d1 = d3 / 2.0F;
    } 
    this.head.rotateAngleY = (float)Math.toRadians(h2);
    this.snout.rotateAngleY = (float)Math.toRadians(h2);
    this.headfin.rotateAngleY = (float)Math.toRadians(h2);
    this.jaw.rotateAngleY = (float)Math.toRadians(h2);
    this.snout.rotationPointZ -= (float)Math.cos(this.snout.rotateAngleY);
    this.snout.rotationPointX -= (float)Math.sin(this.snout.rotateAngleY);
    this.neck.rotateAngleY = (float)Math.toRadians(h2) / 2.0F;
    this.Lhead.rotateAngleY = (float)Math.toRadians(h1);
    this.Lsnout.rotateAngleY = (float)Math.toRadians(h1);
    this.Lheadfin.rotateAngleY = (float)Math.toRadians(h1);
    this.Ljaw.rotateAngleY = (float)Math.toRadians(h1);
    this.Lsnout.rotationPointZ -= (float)Math.cos(this.Lsnout.rotateAngleY);
    this.Lsnout.rotationPointX -= (float)Math.sin(this.Lsnout.rotateAngleY);
    this.Lneck.rotateAngleY = (float)Math.toRadians(h1) / 2.0F;
    this.Rhead.rotateAngleY = (float)Math.toRadians(h3);
    this.Rsnout.rotateAngleY = (float)Math.toRadians(h3);
    this.Rheadfin.rotateAngleY = (float)Math.toRadians(h3);
    this.Rjaw.rotateAngleY = (float)Math.toRadians(h3);
    this.Rsnout.rotationPointZ -= (float)Math.cos(this.Rsnout.rotateAngleY);
    this.Rsnout.rotationPointX -= (float)Math.sin(this.Rsnout.rotateAngleY);
    this.Rneck.rotateAngleY = (float)Math.toRadians(h3) / 2.0F;
    float Rjx = 0.0F, jx = Rjx, Ljx = jx;
    if (c.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.9F * this.wingspeed) * 3.1415927F * 0.2F;
      Ljx = 0.2F + newangle;
      newangle = MathHelper.cos(f2 * 2.1F * this.wingspeed) * 3.1415927F * 0.2F;
      Rjx = 0.2F + newangle;
      newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.2F;
      jx = 0.2F + newangle;
    } 
    this.head.rotateAngleX = (float)Math.toRadians(d2);
    this.snout.rotateAngleX = (float)Math.toRadians(d2);
    this.headfin.rotateAngleX = (float)Math.toRadians(d2);
    this.jaw.rotateAngleX = (float)Math.toRadians(d2) + jx;
    this.Lhead.rotateAngleX = (float)Math.toRadians(d1);
    this.Lsnout.rotateAngleX = (float)Math.toRadians(d1);
    this.Lheadfin.rotateAngleX = (float)Math.toRadians(d1);
    this.Ljaw.rotateAngleX = (float)Math.toRadians(d1) + Ljx;
    this.Rhead.rotateAngleX = (float)Math.toRadians(d3);
    this.Rsnout.rotateAngleX = (float)Math.toRadians(d3);
    this.Rheadfin.rotateAngleX = (float)Math.toRadians(d3);
    this.Rjaw.rotateAngleX = (float)Math.toRadians(d3) + Rjx;
    d1 = c.getHead1Ext();
    d2 = c.getHead2Ext();
    d3 = c.getHead3Ext();
    this.Lneck.rotateAngleX = (float)Math.toRadians(d1);
    this.neck.rotateAngleX = (float)Math.toRadians(d2);
    this.Rneck.rotateAngleX = (float)Math.toRadians(d3);
    this.Lneck.rotationPointY -= (float)Math.cos(this.Lneck.rotateAngleX) * 7.0F;
    this.Ljaw.rotationPointY = this.Lhead.rotationPointY;
    this.Lneck.rotationPointZ -= (float)Math.sin(this.Lneck.rotateAngleX) * 7.0F;
    this.Ljaw.rotationPointZ = this.Lhead.rotationPointZ;
    this.Lneck.rotationPointX -= (float)Math.sin(this.Lneck.rotateAngleY) * 7.0F * (float)Math.sin(this.Lneck.rotateAngleX);
    this.Ljaw.rotationPointX = this.Lhead.rotationPointX;
    this.Rneck.rotationPointY -= (float)Math.cos(this.Rneck.rotateAngleX) * 7.0F;
    this.Rjaw.rotationPointY = this.Rhead.rotationPointY;
    this.Rneck.rotationPointZ -= (float)Math.sin(this.Rneck.rotateAngleX) * 7.0F;
    this.Rjaw.rotationPointZ = this.Rhead.rotationPointZ;
    this.Rneck.rotationPointX -= (float)Math.sin(this.Rneck.rotateAngleY) * 7.0F * (float)Math.sin(this.Rneck.rotateAngleX);
    this.Rjaw.rotationPointX = this.Rhead.rotationPointX;
    this.neck.rotationPointY -= (float)Math.cos(this.neck.rotateAngleX) * 7.0F;
    this.jaw.rotationPointY = this.head.rotationPointY;
    this.neck.rotationPointZ -= (float)Math.sin(this.neck.rotateAngleX) * 7.0F;
    this.jaw.rotationPointZ = this.head.rotationPointZ;
    this.neck.rotationPointX -= (float)Math.sin(this.neck.rotateAngleY) * 7.0F * (float)Math.sin(this.neck.rotateAngleX);
    this.jaw.rotationPointX = this.head.rotationPointX;
    this.Lpower.rotateAngleX += 0.03F;
    if (this.Lpower.rotateAngleX > Math.PI)
      this.Lpower.rotateAngleX = (float)(this.Lpower.rotateAngleX - 6.283185307179586D); 
    this.Cpower.rotateAngleX += 0.04F;
    if (this.Cpower.rotateAngleX > Math.PI)
      this.Cpower.rotateAngleX = (float)(this.Cpower.rotateAngleX - 6.283185307179586D); 
    this.Rpower.rotateAngleX += 0.05F;
    if (this.Rpower.rotateAngleX > Math.PI)
      this.Rpower.rotateAngleX = (float)(this.Rpower.rotateAngleX - 6.283185307179586D); 
    this.Lpower.rotateAngleY += 0.035F;
    if (this.Lpower.rotateAngleY > Math.PI)
      this.Lpower.rotateAngleY = (float)(this.Lpower.rotateAngleY - 6.283185307179586D); 
    this.Cpower.rotateAngleY += 0.046F;
    if (this.Cpower.rotateAngleY > Math.PI)
      this.Cpower.rotateAngleY = (float)(this.Cpower.rotateAngleY - 6.283185307179586D); 
    this.Rpower.rotateAngleY += 0.065F;
    if (this.Rpower.rotateAngleY > Math.PI)
      this.Rpower.rotateAngleY = (float)(this.Rpower.rotateAngleY - 6.283185307179586D); 
    this.Lpower.rotateAngleZ += 0.05F;
    if (this.Lpower.rotateAngleZ > Math.PI)
      this.Lpower.rotateAngleZ = (float)(this.Lpower.rotateAngleZ - 6.283185307179586D); 
    this.Cpower.rotateAngleZ += 0.13F;
    if (this.Cpower.rotateAngleZ > Math.PI)
      this.Cpower.rotateAngleZ = (float)(this.Cpower.rotateAngleZ - 6.283185307179586D); 
    this.Rpower.rotateAngleZ += 0.03F;
    if (this.Rpower.rotateAngleZ > Math.PI)
      this.Rpower.rotateAngleZ = (float)(this.Rpower.rotateAngleZ - 6.283185307179586D); 
    this.body.render(f5);
    this.neck1.render(f5);
    this.neck.render(f5);
    this.neckbase.render(f5);
    this.head.render(f5);
    this.Rleg1.render(f5);
    this.Lleg1.render(f5);
    this.snout.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
    this.Tail5.render(f5);
    this.Tail6.render(f5);
    this.Lneck1.render(f5);
    this.Lneck.render(f5);
    this.Lhead.render(f5);
    this.Lsnout.render(f5);
    this.Rneck1.render(f5);
    this.Rneck.render(f5);
    this.Rhead.render(f5);
    this.Rsnout.render(f5);
    this.headfin.render(f5);
    this.Lheadfin.render(f5);
    this.Rheadfin.render(f5);
    this.Backfin.render(f5);
    this.Ljaw.render(f5);
    this.jaw.render(f5);
    this.Rjaw.render(f5);
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.55F);
    this.Rwing2.render(f5);
    this.Rwing3.render(f5);
    this.Lwing2.render(f5);
    this.Lwing3.render(f5);
    this.Lwing.render(f5);
    this.Rwing.render(f5);
    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
    this.Lpower.render(f5);
    this.Cpower.render(f5);
    this.Rpower.render(f5);
    GL11.glDisable(3042);
    GL11.glPopMatrix();
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
