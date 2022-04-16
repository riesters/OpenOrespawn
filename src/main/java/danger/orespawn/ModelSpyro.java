package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpyro extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer RightFrontPaw;
  
  ModelRenderer WingLeft;
  
  ModelRenderer LegRightFrontTop;
  
  ModelRenderer LegRightFrontBottom;
  
  ModelRenderer LegRightBackTop;
  
  ModelRenderer LegRightBackBottom;
  
  ModelRenderer RightBackPaw;
  
  ModelRenderer LegLeftFrontTop;
  
  ModelRenderer SnoutRight;
  
  ModelRenderer LeftFrontPaw;
  
  ModelRenderer LegLeftBackTop;
  
  ModelRenderer LegLeftBackBottom;
  
  ModelRenderer LeftBackPaw;
  
  ModelRenderer LegLeftFrontBottom;
  
  ModelRenderer TailPieceSmall;
  
  ModelRenderer JawPiece;
  
  ModelRenderer HeadPieceBottom;
  
  ModelRenderer HeadPieceTop;
  
  ModelRenderer HornRightBottom;
  
  ModelRenderer HornLeftBottom;
  
  ModelRenderer HornRightTop;
  
  ModelRenderer HornLeftTop;
  
  ModelRenderer Torso;
  
  ModelRenderer SnoutLeft;
  
  ModelRenderer WingPieceLeft;
  
  ModelRenderer WingRight;
  
  ModelRenderer WingPieceRight;
  
  ModelRenderer Neck;
  
  ModelRenderer TailBack;
  
  ModelRenderer TailFront;
  
  ModelRenderer ScaleBackHead;
  
  ModelRenderer TailPieceLarge;
  
  ModelRenderer ScaleTailPiece;
  
  ModelRenderer ScaleHead;
  
  ModelRenderer ScaleTop1;
  
  ModelRenderer ScaleBackPiece1;
  
  ModelRenderer ScaleBackPiece2;
  
  public ModelSpyro(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.RightFrontPaw = new ModelRenderer(this, 12, 31);
    this.RightFrontPaw.addBox(0.0F, 5.0F, -4.0F, 2, 1, 4);
    this.RightFrontPaw.setRotationPoint(3.0F, 18.0F, -2.0F);
    this.RightFrontPaw.setTextureSize(64, 64);
    this.RightFrontPaw.mirror = true;
    setRotation(this.RightFrontPaw, 0.0F, 0.0F, 0.0F);
    this.WingLeft = new ModelRenderer(this, 2, 51);
    this.WingLeft.addBox(-10.0F, -1.0F, -2.0F, 10, 0, 4);
    this.WingLeft.setRotationPoint(-1.0F, 16.0F, 0.0F);
    this.WingLeft.setTextureSize(64, 64);
    this.WingLeft.mirror = true;
    setRotation(this.WingLeft, 0.1745329F, 0.0F, -0.1745329F);
    this.LegRightFrontTop = new ModelRenderer(this, 20, 19);
    this.LegRightFrontTop.addBox(0.0F, 0.0F, -2.0F, 2, 3, 3);
    this.LegRightFrontTop.setRotationPoint(3.0F, 18.0F, -2.0F);
    this.LegRightFrontTop.setTextureSize(64, 64);
    this.LegRightFrontTop.mirror = true;
    setRotation(this.LegRightFrontTop, -0.0872665F, 0.0F, 0.0F);
    this.LegRightFrontBottom = new ModelRenderer(this, 0, 25);
    this.LegRightFrontBottom.addBox(0.0F, 2.0F, -1.5F, 2, 4, 2);
    this.LegRightFrontBottom.setRotationPoint(3.0F, 18.0F, -2.0F);
    this.LegRightFrontBottom.setTextureSize(64, 64);
    this.LegRightFrontBottom.mirror = true;
    setRotation(this.LegRightFrontBottom, -0.1745329F, 0.0F, 0.0F);
    this.LegRightBackTop = new ModelRenderer(this, 30, 19);
    this.LegRightBackTop.addBox(0.0F, 0.0F, -2.0F, 2, 3, 3);
    this.LegRightBackTop.setRotationPoint(3.0F, 18.0F, 3.0F);
    this.LegRightBackTop.setTextureSize(64, 64);
    this.LegRightBackTop.mirror = true;
    setRotation(this.LegRightBackTop, 0.1396263F, 0.0F, 0.0F);
    this.LegRightBackBottom = new ModelRenderer(this, 16, 25);
    this.LegRightBackBottom.addBox(0.0F, 2.0F, -1.0F, 2, 4, 2);
    this.LegRightBackBottom.setRotationPoint(3.0F, 18.0F, 3.0F);
    this.LegRightBackBottom.setTextureSize(64, 64);
    this.LegRightBackBottom.mirror = true;
    setRotation(this.LegRightBackBottom, -0.1745329F, 0.0F, 0.0F);
    this.RightBackPaw = new ModelRenderer(this, 36, 31);
    this.RightBackPaw.addBox(0.0F, 5.0F, -3.0F, 2, 1, 4);
    this.RightBackPaw.setRotationPoint(3.0F, 18.0F, 3.0F);
    this.RightBackPaw.setTextureSize(64, 64);
    this.RightBackPaw.mirror = true;
    setRotation(this.RightBackPaw, 0.0F, 0.0F, 0.0F);
    this.LegLeftFrontTop = new ModelRenderer(this, 0, 19);
    this.LegLeftFrontTop.addBox(-2.0F, 0.0F, -1.0F, 2, 3, 3);
    this.LegLeftFrontTop.setRotationPoint(-2.0F, 18.0F, -3.0F);
    this.LegLeftFrontTop.setTextureSize(64, 64);
    this.LegLeftFrontTop.mirror = true;
    setRotation(this.LegLeftFrontTop, -0.0872665F, 0.0F, 0.0F);
    this.SnoutRight = new ModelRenderer(this, 48, 2);
    this.SnoutRight.addBox(1.0F, -3.0F, -5.0F, 1, 1, 1);
    this.SnoutRight.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.SnoutRight.setTextureSize(64, 64);
    this.SnoutRight.mirror = true;
    setRotation(this.SnoutRight, 0.0F, 0.0F, 0.0F);
    this.LeftFrontPaw = new ModelRenderer(this, 0, 31);
    this.LeftFrontPaw.addBox(-2.0F, 5.0F, -3.0F, 2, 1, 4);
    this.LeftFrontPaw.setRotationPoint(-2.0F, 18.0F, -3.0F);
    this.LeftFrontPaw.setTextureSize(64, 64);
    this.LeftFrontPaw.mirror = true;
    setRotation(this.LeftFrontPaw, 0.0F, 0.0F, 0.0F);
    this.LegLeftBackTop = new ModelRenderer(this, 10, 19);
    this.LegLeftBackTop.addBox(-2.0F, 0.0F, -2.0F, 2, 3, 3);
    this.LegLeftBackTop.setRotationPoint(-2.0F, 18.0F, 3.0F);
    this.LegLeftBackTop.setTextureSize(64, 64);
    this.LegLeftBackTop.mirror = true;
    setRotation(this.LegLeftBackTop, 0.1396263F, 0.0F, 0.0F);
    this.LegLeftBackBottom = new ModelRenderer(this, 24, 25);
    this.LegLeftBackBottom.addBox(-2.0F, 2.0F, -1.0F, 2, 4, 2);
    this.LegLeftBackBottom.setRotationPoint(-2.0F, 18.0F, 3.0F);
    this.LegLeftBackBottom.setTextureSize(64, 64);
    this.LegLeftBackBottom.mirror = true;
    setRotation(this.LegLeftBackBottom, -0.1745329F, 0.0F, 0.0F);
    this.LeftBackPaw = new ModelRenderer(this, 24, 31);
    this.LeftBackPaw.addBox(-2.0F, 5.0F, -3.0F, 2, 1, 4);
    this.LeftBackPaw.setRotationPoint(-2.0F, 18.0F, 3.0F);
    this.LeftBackPaw.setTextureSize(64, 64);
    this.LeftBackPaw.mirror = true;
    setRotation(this.LeftBackPaw, 0.0F, 0.0F, 0.0F);
    this.LegLeftFrontBottom = new ModelRenderer(this, 8, 25);
    this.LegLeftFrontBottom.addBox(-2.0F, 2.0F, -0.5F, 2, 4, 2);
    this.LegLeftFrontBottom.setRotationPoint(-2.0F, 18.0F, -3.0F);
    this.LegLeftFrontBottom.setTextureSize(64, 64);
    this.LegLeftFrontBottom.mirror = true;
    setRotation(this.LegLeftFrontBottom, -0.1745329F, 0.0F, 0.0F);
    this.TailPieceSmall = new ModelRenderer(this, 28, 36);
    this.TailPieceSmall.addBox(0.0F, -0.5F, 4.0F, 1, 1, 1);
    this.TailPieceSmall.setRotationPoint(0.0F, 16.0F, 7.0F);
    this.TailPieceSmall.setTextureSize(64, 64);
    this.TailPieceSmall.mirror = true;
    setRotation(this.TailPieceSmall, 0.1745329F, 0.0F, 0.0F);
    this.JawPiece = new ModelRenderer(this, 52, 0);
    this.JawPiece.addBox(-2.0F, -1.0F, -4.0F, 3, 1, 3);
    this.JawPiece.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.JawPiece.setTextureSize(64, 64);
    this.JawPiece.mirror = true;
    setRotation(this.JawPiece, 0.1745329F, 0.0F, 0.0F);
    this.HeadPieceBottom = new ModelRenderer(this, 30, 7);
    this.HeadPieceBottom.addBox(-3.0F, -2.0F, -5.0F, 5, 2, 6);
    this.HeadPieceBottom.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HeadPieceBottom.setTextureSize(64, 64);
    this.HeadPieceBottom.mirror = true;
    setRotation(this.HeadPieceBottom, 0.0F, 0.0F, 0.0F);
    this.HeadPieceTop = new ModelRenderer(this, 30, 0);
    this.HeadPieceTop.addBox(-3.0F, -5.0F, -3.0F, 5, 3, 4);
    this.HeadPieceTop.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HeadPieceTop.setTextureSize(64, 64);
    this.HeadPieceTop.mirror = true;
    setRotation(this.HeadPieceTop, 0.0F, 0.0F, 0.0F);
    this.HornRightBottom = new ModelRenderer(this, 8, 14);
    this.HornRightBottom.addBox(0.0F, -6.0F, -3.5F, 2, 3, 2);
    this.HornRightBottom.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HornRightBottom.setTextureSize(64, 64);
    this.HornRightBottom.mirror = true;
    setRotation(this.HornRightBottom, -0.7853982F, 0.7853982F, 0.0F);
    this.HornLeftBottom = new ModelRenderer(this, 0, 14);
    this.HornLeftBottom.addBox(-2.75F, -6.5F, -3.0F, 2, 3, 2);
    this.HornLeftBottom.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HornLeftBottom.setTextureSize(64, 64);
    this.HornLeftBottom.mirror = true;
    setRotation(this.HornLeftBottom, -0.7853982F, -0.7853982F, 0.0F);
    this.HornRightTop = new ModelRenderer(this, 20, 14);
    this.HornRightTop.addBox(0.5F, -9.0F, -3.0F, 1, 3, 1);
    this.HornRightTop.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HornRightTop.setTextureSize(64, 64);
    this.HornRightTop.mirror = true;
    setRotation(this.HornRightTop, -0.7853982F, 0.7853982F, 0.0F);
    this.HornLeftTop = new ModelRenderer(this, 16, 14);
    this.HornLeftTop.addBox(-2.2F, -9.5F, -2.5F, 1, 3, 1);
    this.HornLeftTop.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.HornLeftTop.setTextureSize(64, 64);
    this.HornLeftTop.mirror = true;
    setRotation(this.HornLeftTop, -0.7853982F, -0.7853982F, 0.0F);
    this.Torso = new ModelRenderer(this, 0, 0);
    this.Torso.addBox(-2.0F, -2.0F, -5.0F, 5, 4, 10);
    this.Torso.setRotationPoint(0.0F, 19.0F, 0.0F);
    this.Torso.setTextureSize(64, 64);
    this.Torso.mirror = true;
    setRotation(this.Torso, 0.0F, 0.0F, 0.0F);
    this.SnoutLeft = new ModelRenderer(this, 48, 0);
    this.SnoutLeft.addBox(-3.0F, -3.0F, -5.0F, 1, 1, 1);
    this.SnoutLeft.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.SnoutLeft.setTextureSize(64, 64);
    this.SnoutLeft.mirror = true;
    setRotation(this.SnoutLeft, 0.0F, 0.0F, 0.0F);
    this.WingPieceLeft = new ModelRenderer(this, 4, 42);
    this.WingPieceLeft.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1);
    this.WingPieceLeft.setRotationPoint(0.0F, 17.2F, 0.0F);
    this.WingPieceLeft.setTextureSize(64, 64);
    this.WingPieceLeft.mirror = true;
    setRotation(this.WingPieceLeft, 0.1745329F, 0.0F, -0.1745329F);
    this.WingRight = new ModelRenderer(this, 2, 45);
    this.WingRight.addBox(0.0F, -1.0F, -2.0F, 10, 0, 4);
    this.WingRight.setRotationPoint(2.0F, 16.0F, 0.0F);
    this.WingRight.setTextureSize(64, 64);
    this.WingRight.mirror = true;
    setRotation(this.WingRight, 0.1745329F, 0.0F, 0.1745329F);
    this.WingPieceRight = new ModelRenderer(this, 0, 42);
    this.WingPieceRight.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1);
    this.WingPieceRight.setRotationPoint(2.0F, 17.5F, -1.0F);
    this.WingPieceRight.setTextureSize(64, 64);
    this.WingPieceRight.mirror = true;
    setRotation(this.WingPieceRight, 0.1745329F, 0.0F, 0.1745329F);
    this.Neck = new ModelRenderer(this, 52, 7);
    this.Neck.addBox(-1.0F, -2.0F, -1.0F, 3, 3, 3);
    this.Neck.setRotationPoint(0.0F, 17.0F, -4.0F);
    this.Neck.setTextureSize(64, 64);
    this.Neck.mirror = true;
    setRotation(this.Neck, 0.4537856F, 0.0F, 0.0F);
    this.TailBack = new ModelRenderer(this, 0, 36);
    this.TailBack.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 4);
    this.TailBack.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.TailBack.setTextureSize(64, 64);
    this.TailBack.mirror = true;
    setRotation(this.TailBack, 0.4537856F, 0.0F, 0.0F);
    this.TailFront = new ModelRenderer(this, 12, 36);
    this.TailFront.addBox(0.0F, 0.0F, -1.0F, 1, 1, 4);
    this.TailFront.setRotationPoint(0.0F, 16.0F, 7.0F);
    this.TailFront.setTextureSize(64, 64);
    this.TailFront.mirror = true;
    setRotation(this.TailFront, 0.2617994F, 0.0F, 0.0F);
    this.ScaleBackHead = new ModelRenderer(this, 38, 36);
    this.ScaleBackHead.addBox(-1.0F, -3.0F, 2.0F, 1, 2, 1);
    this.ScaleBackHead.setRotationPoint(1.0F, 16.0F, -4.0F);
    this.ScaleBackHead.setTextureSize(64, 64);
    this.ScaleBackHead.mirror = true;
    setRotation(this.ScaleBackHead, 0.0F, 0.0F, 0.0F);
    this.TailPieceLarge = new ModelRenderer(this, 22, 36);
    this.TailPieceLarge.addBox(0.0F, -1.0F, 2.0F, 1, 2, 2);
    this.TailPieceLarge.setRotationPoint(0.0F, 16.0F, 7.0F);
    this.TailPieceLarge.setTextureSize(64, 64);
    this.TailPieceLarge.mirror = true;
    setRotation(this.TailPieceLarge, 0.1745329F, 0.0F, 0.0F);
    this.ScaleTailPiece = new ModelRenderer(this, 48, 36);
    this.ScaleTailPiece.addBox(-0.5F, -2.0F, 0.2F, 1, 1, 2);
    this.ScaleTailPiece.setRotationPoint(0.5F, 17.5F, 5.0F);
    this.ScaleTailPiece.setTextureSize(64, 64);
    this.ScaleTailPiece.mirror = true;
    setRotation(this.ScaleTailPiece, 0.4537856F, 0.0F, 0.0F);
    this.ScaleHead = new ModelRenderer(this, 42, 36);
    this.ScaleHead.addBox(-1.0F, -6.0F, 0.0F, 1, 2, 2);
    this.ScaleHead.setRotationPoint(1.0F, 16.0F, -3.0F);
    this.ScaleHead.setTextureSize(64, 64);
    this.ScaleHead.mirror = true;
    setRotation(this.ScaleHead, 0.0F, 0.0F, 0.0F);
    this.ScaleTop1 = new ModelRenderer(this, 48, 36);
    this.ScaleTop1.addBox(-1.0F, -6.0F, -4.0F, 1, 1, 2);
    this.ScaleTop1.setRotationPoint(1.0F, 16.0F, -2.0F);
    this.ScaleTop1.setTextureSize(64, 64);
    this.ScaleTop1.mirror = true;
    setRotation(this.ScaleTop1, 0.0F, 0.0F, 0.0F);
    this.ScaleBackPiece1 = new ModelRenderer(this, 48, 36);
    this.ScaleBackPiece1.addBox(0.0F, -1.0F, -1.0F, 1, 1, 2);
    this.ScaleBackPiece1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.ScaleBackPiece1.setTextureSize(64, 64);
    this.ScaleBackPiece1.mirror = true;
    setRotation(this.ScaleBackPiece1, 0.0F, 0.0F, 0.0F);
    this.ScaleBackPiece2 = new ModelRenderer(this, 48, 36);
    this.ScaleBackPiece2.addBox(0.0F, -1.0F, -1.0F, 1, 1, 2);
    this.ScaleBackPiece2.setRotationPoint(0.0F, 17.0F, 3.0F);
    this.ScaleBackPiece2.setTextureSize(64, 64);
    this.ScaleBackPiece2.mirror = true;
    setRotation(this.ScaleBackPiece2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Spyro c = (Spyro)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    int current_activity = c.getActivity();
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.4F * f1;
    } else {
      newangle = 0.0F;
    } 
    if (current_activity == 3)
      newangle *= 0.5F; 
    this.WingLeft.rotateAngleZ = newangle;
    this.WingRight.rotateAngleZ = -newangle;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    if (current_activity == 3)
      newangle = 0.0F; 
    if (current_activity != 2) {
      this.LegRightFrontTop.rotateAngleX = newangle - 0.087F;
      this.LegRightFrontBottom.rotateAngleX = newangle - 0.17F;
      this.RightFrontPaw.rotateAngleX = newangle;
      this.LegLeftFrontTop.rotateAngleX = -newangle - 0.087F;
      this.LegLeftFrontBottom.rotateAngleX = -newangle - 0.17F;
      this.LeftFrontPaw.rotateAngleX = -newangle;
      this.LegRightBackBottom.rotateAngleX = -newangle + 0.139F;
      this.LegRightBackTop.rotateAngleX = -newangle - 0.174F;
      this.RightBackPaw.rotateAngleX = -newangle;
      this.LegLeftBackBottom.rotateAngleX = newangle + 0.139F;
      this.LegLeftBackTop.rotateAngleX = newangle - 0.174F;
      this.LeftBackPaw.rotateAngleX = newangle;
    } else {
      newangle = -1.0F;
      this.LegRightFrontTop.rotateAngleX = newangle - 0.087F;
      this.LegRightFrontBottom.rotateAngleX = newangle - 0.17F;
      this.RightFrontPaw.rotateAngleX = newangle;
      this.LegLeftFrontTop.rotateAngleX = newangle - 0.087F;
      this.LegLeftFrontBottom.rotateAngleX = newangle - 0.17F;
      this.LeftFrontPaw.rotateAngleX = newangle;
      newangle = 1.0F;
      this.LegRightBackBottom.rotateAngleX = newangle + 0.139F;
      this.LegRightBackTop.rotateAngleX = newangle - 0.174F;
      this.RightBackPaw.rotateAngleX = newangle;
      this.LegLeftBackBottom.rotateAngleX = newangle + 0.139F;
      this.LegLeftBackTop.rotateAngleX = newangle - 0.174F;
      this.LeftBackPaw.rotateAngleX = newangle;
    } 
    newangle = MathHelper.cos(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.25F;
    if (c.isSitting() == true || current_activity == 3)
      newangle = 0.0F; 
    this.TailBack.rotateAngleY = newangle;
    this.ScaleTailPiece.rotateAngleY = newangle;
    this.TailBack.rotationPointZ += (float)Math.cos(this.TailBack.rotateAngleY) * 3.0F;
    this.TailFront.rotationPointX = this.TailBack.rotationPointX + (float)Math.sin(this.TailBack.rotateAngleY) * 3.0F - 0.5F;
    this.TailFront.rotateAngleY = newangle * 1.6F;
    this.TailPieceLarge.rotationPointZ = this.TailFront.rotationPointZ;
    this.TailPieceLarge.rotationPointX = this.TailFront.rotationPointX;
    this.TailPieceLarge.rotateAngleY = this.TailFront.rotateAngleY;
    this.TailPieceSmall.rotationPointZ = this.TailFront.rotationPointZ;
    this.TailPieceSmall.rotationPointX = this.TailFront.rotationPointX;
    this.TailPieceSmall.rotateAngleY = this.TailFront.rotateAngleY;
    this.HeadPieceTop.rotateAngleY = (float)Math.toRadians(f3);
    this.HeadPieceBottom.rotateAngleY = (float)Math.toRadians(f3);
    this.JawPiece.rotateAngleY = (float)Math.toRadians(f3);
    this.SnoutRight.rotateAngleY = (float)Math.toRadians(f3);
    this.SnoutLeft.rotateAngleY = (float)Math.toRadians(f3);
    this.ScaleTop1.rotateAngleY = (float)Math.toRadians(f3);
    this.ScaleHead.rotateAngleY = (float)Math.toRadians(f3);
    this.ScaleBackHead.rotateAngleY = (float)Math.toRadians(f3);
    this.HornRightBottom.rotateAngleY = (float)Math.toRadians(f3) + 0.785F;
    this.HornRightTop.rotateAngleY = (float)Math.toRadians(f3) + 0.785F;
    this.HornLeftBottom.rotateAngleY = (float)Math.toRadians(f3) - 0.785F;
    this.HornLeftTop.rotateAngleY = (float)Math.toRadians(f3) - 0.785F;
    this.HeadPieceTop.rotateAngleX = (float)Math.toRadians(f4);
    this.HeadPieceBottom.rotateAngleX = (float)Math.toRadians(f4);
    this.JawPiece.rotateAngleX = (float)Math.toRadians(f4);
    this.SnoutRight.rotateAngleX = (float)Math.toRadians(f4);
    this.SnoutLeft.rotateAngleX = (float)Math.toRadians(f4);
    this.ScaleTop1.rotateAngleX = (float)Math.toRadians(f4);
    this.ScaleHead.rotateAngleX = (float)Math.toRadians(f4);
    this.ScaleBackHead.rotateAngleX = (float)Math.toRadians(f4);
    this.HornRightBottom.rotateAngleX = (float)Math.toRadians(f4) - 0.785F;
    this.HornRightTop.rotateAngleX = (float)Math.toRadians(f4) - 0.785F;
    this.HornLeftBottom.rotateAngleX = (float)Math.toRadians(f4) - 0.785F;
    this.HornLeftTop.rotateAngleX = (float)Math.toRadians(f4) - 0.785F;
    this.RightFrontPaw.render(f5);
    this.WingLeft.render(f5);
    this.LegRightFrontTop.render(f5);
    this.LegRightFrontBottom.render(f5);
    this.LegRightBackTop.render(f5);
    this.LegRightBackBottom.render(f5);
    this.RightBackPaw.render(f5);
    this.LegLeftFrontTop.render(f5);
    this.SnoutRight.render(f5);
    this.LeftFrontPaw.render(f5);
    this.LegLeftBackTop.render(f5);
    this.LegLeftBackBottom.render(f5);
    this.LeftBackPaw.render(f5);
    this.LegLeftFrontBottom.render(f5);
    this.TailPieceSmall.render(f5);
    this.JawPiece.render(f5);
    this.HeadPieceBottom.render(f5);
    this.HeadPieceTop.render(f5);
    this.HornRightBottom.render(f5);
    this.HornLeftBottom.render(f5);
    this.HornRightTop.render(f5);
    this.HornLeftTop.render(f5);
    this.Torso.render(f5);
    this.SnoutLeft.render(f5);
    this.WingPieceLeft.render(f5);
    this.WingRight.render(f5);
    this.WingPieceRight.render(f5);
    this.Neck.render(f5);
    this.TailBack.render(f5);
    this.TailFront.render(f5);
    this.ScaleBackHead.render(f5);
    this.TailPieceLarge.render(f5);
    this.ScaleTailPiece.render(f5);
    this.ScaleHead.render(f5);
    this.ScaleTop1.render(f5);
    this.ScaleBackPiece1.render(f5);
    this.ScaleBackPiece2.render(f5);
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
