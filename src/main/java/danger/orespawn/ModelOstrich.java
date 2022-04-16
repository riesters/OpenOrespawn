package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOstrich extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Body1;
  
  ModelRenderer body2;
  
  ModelRenderer LLeg1;
  
  ModelRenderer Rleg1;
  
  ModelRenderer LLeg2;
  
  ModelRenderer Lfoot1;
  
  ModelRenderer RLeg2;
  
  ModelRenderer Lfoot2;
  
  ModelRenderer Lfoot3;
  
  ModelRenderer LClaw1;
  
  ModelRenderer LClaw2;
  
  ModelRenderer LClaw3;
  
  ModelRenderer Lfoot4;
  
  ModelRenderer LClaw4;
  
  ModelRenderer Rfoot1;
  
  ModelRenderer Rfoot2;
  
  ModelRenderer Rclaw1;
  
  ModelRenderer Rfoot3;
  
  ModelRenderer Rclaw3;
  
  ModelRenderer Rfoot4;
  
  ModelRenderer Rclaw2;
  
  ModelRenderer Rclaw4;
  
  ModelRenderer Body3;
  
  ModelRenderer Tail1;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tail3;
  
  ModelRenderer Body4;
  
  ModelRenderer head;
  
  ModelRenderer leftleg;
  
  ModelRenderer Neck1;
  
  ModelRenderer Head1;
  
  ModelRenderer mouth1;
  
  ModelRenderer neck2;
  
  ModelRenderer rightleg;
  
  ModelRenderer Lwing;
  
  ModelRenderer Rwing;
  
  ModelRenderer Hat1;
  
  ModelRenderer Hat2;
  
  public ModelOstrich(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.Body1 = new ModelRenderer(this, 0, 28);
    this.Body1.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8);
    this.Body1.setRotationPoint(0.0F, 0.0F, -6.0F);
    this.Body1.setTextureSize(256, 128);
    this.Body1.mirror = true;
    setRotation(this.Body1, -0.2230717F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 25, 111);
    this.body2.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 8);
    this.body2.setRotationPoint(0.0F, 2.0F, -1.0F);
    this.body2.setTextureSize(256, 128);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.LLeg1 = new ModelRenderer(this, 25, 70);
    this.LLeg1.addBox(-1.0F, 3.0F, -5.0F, 2, 7, 3);
    this.LLeg1.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LLeg1.setTextureSize(256, 128);
    this.LLeg1.mirror = true;
    setRotation(this.LLeg1, 0.4833219F, 0.0F, 0.0F);
    this.Rleg1 = new ModelRenderer(this, 25, 70);
    this.Rleg1.addBox(-2.0F, 3.0F, -5.0F, 2, 7, 3);
    this.Rleg1.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rleg1.setTextureSize(256, 128);
    this.Rleg1.mirror = true;
    setRotation(this.Rleg1, 0.4833219F, 0.0F, 0.0F);
    this.LLeg2 = new ModelRenderer(this, 29, 59);
    this.LLeg2.addBox(-1.0F, 7.0F, 4.0F, 2, 7, 3);
    this.LLeg2.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LLeg2.setTextureSize(256, 128);
    this.LLeg2.mirror = true;
    setRotation(this.LLeg2, -0.4370552F, 0.0F, 0.0F);
    this.Lfoot1 = new ModelRenderer(this, 29, 50);
    this.Lfoot1.addBox(-1.0F, 14.0F, -5.0F, 2, 2, 6);
    this.Lfoot1.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.Lfoot1.setTextureSize(256, 128);
    this.Lfoot1.mirror = true;
    setRotation(this.Lfoot1, 0.0F, 0.0F, 0.0F);
    this.RLeg2 = new ModelRenderer(this, 29, 59);
    this.RLeg2.addBox(-2.0F, 7.0F, 4.0F, 2, 7, 3);
    this.RLeg2.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.RLeg2.setTextureSize(256, 128);
    this.RLeg2.mirror = true;
    setRotation(this.RLeg2, -0.4370552F, 0.0F, 0.0F);
    this.Lfoot2 = new ModelRenderer(this, 0, 9);
    this.Lfoot2.addBox(-1.0F, 15.0F, -4.0F, 2, 1, 5);
    this.Lfoot2.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.Lfoot2.setTextureSize(256, 128);
    this.Lfoot2.mirror = true;
    setRotation(this.Lfoot2, 0.0F, 0.2602503F, 0.0F);
    this.Lfoot3 = new ModelRenderer(this, 0, 9);
    this.Lfoot3.addBox(-1.0F, 15.0F, -4.0F, 2, 1, 5);
    this.Lfoot3.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.Lfoot3.setTextureSize(256, 128);
    this.Lfoot3.mirror = true;
    setRotation(this.Lfoot3, 0.0F, -0.260246F, 0.0F);
    this.LClaw1 = new ModelRenderer(this, 16, 10);
    this.LClaw1.addBox(0.0F, 14.0F, -7.0F, 0, 2, 3);
    this.LClaw1.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LClaw1.setTextureSize(256, 128);
    this.LClaw1.mirror = true;
    setRotation(this.LClaw1, 0.0F, 0.0F, 0.0F);
    this.LClaw2 = new ModelRenderer(this, 19, 16);
    this.LClaw2.addBox(-0.5F, 15.0F, -5.0F, 0, 1, 3);
    this.LClaw2.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LClaw2.setTextureSize(256, 128);
    this.LClaw2.mirror = true;
    setRotation(this.LClaw2, 0.0F, 0.260246F, 0.0F);
    this.LClaw3 = new ModelRenderer(this, 19, 16);
    this.LClaw3.addBox(0.5F, 15.0F, -5.0F, 0, 1, 3);
    this.LClaw3.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LClaw3.setTextureSize(256, 128);
    this.LClaw3.mirror = true;
    setRotation(this.LClaw3, 0.0F, -0.260246F, 0.0F);
    this.Lfoot4 = new ModelRenderer(this, 0, 0);
    this.Lfoot4.addBox(-1.0F, 14.0F, -1.0F, 2, 2, 4);
    this.Lfoot4.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.Lfoot4.setTextureSize(256, 128);
    this.Lfoot4.mirror = true;
    setRotation(this.Lfoot4, 0.0F, 0.0F, 0.0F);
    this.LClaw4 = new ModelRenderer(this, 16, 10);
    this.LClaw4.addBox(0.0F, 14.0F, 2.0F, 0, 2, 3);
    this.LClaw4.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.LClaw4.setTextureSize(256, 128);
    this.LClaw4.mirror = true;
    setRotation(this.LClaw4, 0.0F, 0.0F, 0.0F);
    this.Rfoot1 = new ModelRenderer(this, 29, 50);
    this.Rfoot1.addBox(-2.0F, 14.0F, -5.0F, 2, 2, 6);
    this.Rfoot1.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rfoot1.setTextureSize(256, 128);
    this.Rfoot1.mirror = true;
    setRotation(this.Rfoot1, 0.0F, 0.0F, 0.0F);
    this.Rfoot2 = new ModelRenderer(this, 0, 0);
    this.Rfoot2.addBox(-2.0F, 14.0F, -1.0F, 2, 2, 4);
    this.Rfoot2.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rfoot2.setTextureSize(256, 128);
    this.Rfoot2.mirror = true;
    setRotation(this.Rfoot2, 0.0F, 0.0F, 0.0F);
    this.Rclaw1 = new ModelRenderer(this, 16, 10);
    this.Rclaw1.addBox(-1.0F, 14.0F, -7.0F, 0, 2, 3);
    this.Rclaw1.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rclaw1.setTextureSize(256, 128);
    this.Rclaw1.mirror = true;
    setRotation(this.Rclaw1, 0.0F, 0.0F, 0.0F);
    this.Rfoot3 = new ModelRenderer(this, 0, 9);
    this.Rfoot3.addBox(-2.0F, 15.0F, -4.0F, 2, 1, 5);
    this.Rfoot3.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rfoot3.setTextureSize(256, 128);
    this.Rfoot3.mirror = true;
    setRotation(this.Rfoot3, 0.0F, -0.260246F, 0.0F);
    this.Rclaw3 = new ModelRenderer(this, 19, 16);
    this.Rclaw3.addBox(-0.5F, 15.0F, -5.0F, 0, 1, 3);
    this.Rclaw3.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rclaw3.setTextureSize(256, 128);
    this.Rclaw3.mirror = true;
    setRotation(this.Rclaw3, 0.0F, -0.260246F, 0.0F);
    this.Rfoot4 = new ModelRenderer(this, 0, 9);
    this.Rfoot4.addBox(-2.0F, 15.0F, -4.0F, 2, 1, 5);
    this.Rfoot4.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rfoot4.setTextureSize(256, 128);
    this.Rfoot4.mirror = true;
    setRotation(this.Rfoot4, 0.0F, 0.2602503F, 0.0F);
    this.Rclaw2 = new ModelRenderer(this, 19, 16);
    this.Rclaw2.addBox(-1.5F, 15.0F, -5.0F, 0, 1, 3);
    this.Rclaw2.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rclaw2.setTextureSize(256, 128);
    this.Rclaw2.mirror = true;
    setRotation(this.Rclaw2, 0.0F, 0.260246F, 0.0F);
    this.Rclaw4 = new ModelRenderer(this, 16, 10);
    this.Rclaw4.addBox(-1.0F, 14.0F, 2.0F, 0, 2, 3);
    this.Rclaw4.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.Rclaw4.setTextureSize(256, 128);
    this.Rclaw4.mirror = true;
    setRotation(this.Rclaw4, 0.0F, 0.0F, 0.0F);
    this.Body3 = new ModelRenderer(this, 17, 96);
    this.Body3.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 3);
    this.Body3.setRotationPoint(0.0F, 2.0F, 6.0F);
    this.Body3.setTextureSize(256, 128);
    this.Body3.mirror = true;
    setRotation(this.Body3, 0.0F, 0.0F, 0.0F);
    this.Tail1 = new ModelRenderer(this, 33, 81);
    this.Tail1.addBox(-2.0F, 0.0F, 0.0F, 4, 0, 14);
    this.Tail1.setRotationPoint(0.0F, 3.0F, 9.0F);
    this.Tail1.setTextureSize(256, 128);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, -0.5948578F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 36, 97);
    this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 3, 0, 13);
    this.Tail2.setRotationPoint(0.0F, 3.0F, 8.0F);
    this.Tail2.setTextureSize(256, 128);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, -0.5948578F, 0.3346075F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 36, 97);
    this.Tail3.addBox(-2.0F, 0.0F, 0.0F, 3, 0, 13);
    this.Tail3.setRotationPoint(0.0F, 3.0F, 8.0F);
    this.Tail3.setTextureSize(256, 128);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, -0.5948578F, -0.3346145F, 0.0F);
    this.Body4 = new ModelRenderer(this, 17, 89);
    this.Body4.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 3);
    this.Body4.setRotationPoint(0.0F, 6.0F, 7.0F);
    this.Body4.setTextureSize(256, 128);
    this.Body4.mirror = true;
    setRotation(this.Body4, 1.003822F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 74, 48);
    this.head.addBox(-1.0F, -24.0F, -7.0F, 2, 2, 4);
    this.head.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.head.setTextureSize(256, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 5);
    this.leftleg.setRotationPoint(3.0F, 8.0F, 1.0F);
    this.leftleg.setTextureSize(256, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, -0.2974289F, 0.0F, 0.0F);
    this.Neck1 = new ModelRenderer(this, 79, 84);
    this.Neck1.addBox(-1.5F, -21.0F, -2.0F, 3, 21, 3);
    this.Neck1.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.Neck1.setTextureSize(256, 128);
    this.Neck1.mirror = true;
    setRotation(this.Neck1, 0.0F, -0.0349066F, 0.0F);
    this.Head1 = new ModelRenderer(this, 0, 70);
    this.Head1.addBox(-2.0F, -25.0F, -3.0F, 4, 4, 4);
    this.Head1.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.Head1.setTextureSize(256, 128);
    this.Head1.mirror = true;
    setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
    this.mouth1 = new ModelRenderer(this, 74, 64);
    this.mouth1.addBox(-1.0F, -22.0F, -6.0F, 2, 1, 3);
    this.mouth1.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.mouth1.setTextureSize(256, 128);
    this.mouth1.mirror = true;
    setRotation(this.mouth1, 0.0F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 0, 99);
    this.neck2.addBox(-1.0F, -2.0F, -2.0F, 2, 4, 3);
    this.neck2.setRotationPoint(0.0F, 5.0F, -6.9F);
    this.neck2.setTextureSize(256, 128);
    this.neck2.mirror = true;
    setRotation(this.neck2, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 0, 16);
    this.rightleg.addBox(-3.0F, 0.0F, -2.0F, 4, 6, 5);
    this.rightleg.setRotationPoint(-2.0F, 8.0F, 1.0F);
    this.rightleg.setTextureSize(256, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, -0.2974216F, 0.0F, 0.0F);
    this.Lwing = new ModelRenderer(this, 0, 107);
    this.Lwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 11);
    this.Lwing.setRotationPoint(4.0F, 1.0F, -5.0F);
    this.Lwing.setTextureSize(256, 128);
    this.Lwing.mirror = true;
    setRotation(this.Lwing, 0.0F, 0.0F, 0.0F);
    this.Rwing = new ModelRenderer(this, 0, 107);
    this.Rwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 11);
    this.Rwing.setRotationPoint(-5.0F, 1.0F, -5.0F);
    this.Rwing.setTextureSize(256, 128);
    this.Rwing.mirror = true;
    setRotation(this.Rwing, 0.0F, 0.0F, 0.0F);
    this.Hat1 = new ModelRenderer(this, 40, 0);
    this.Hat1.addBox(-2.5F, -26.0F, -4.0F, 5, 1, 5);
    this.Hat1.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.Hat1.setTextureSize(256, 128);
    this.Hat1.mirror = true;
    setRotation(this.Hat1, 0.0F, 0.0F, 0.0F);
    this.Hat2 = new ModelRenderer(this, 40, 0);
    this.Hat2.addBox(-2.0F, -28.0F, -3.0F, 4, 2, 4);
    this.Hat2.setRotationPoint(0.0F, 5.0F, -7.0F);
    this.Hat2.setTextureSize(256, 128);
    this.Hat2.mirror = true;
    setRotation(this.Hat2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Ostrich o = (Ostrich)entity;
    RenderInfo r = null;
    float hf = 0.0F;
    float newangle = 0.0F;
    float nextangle = 0.0F;
    float lspeed = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    lspeed = (float)((o.prevPosX - o.posX) * (o.prevPosX - o.posX) + (o.prevPosZ - o.posZ) * (o.prevPosZ - o.posZ));
    lspeed = (float)Math.sqrt(lspeed);
    newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed) * 3.1415927F * lspeed * 0.4F;
    if (newangle > 0.5D)
      newangle = 0.75F; 
    if (newangle < -0.5D)
      newangle = -0.75F; 
    this.leftleg.rotateAngleX = -0.297F + newangle;
    this.LLeg1.rotateAngleX = 0.483F + newangle;
    this.LLeg2.rotateAngleX = -0.437F + newangle;
    this.Lfoot1.rotateAngleX = newangle;
    this.Lfoot2.rotateAngleX = newangle;
    this.Lfoot3.rotateAngleX = newangle;
    this.Lfoot4.rotateAngleX = newangle;
    this.LClaw1.rotateAngleX = newangle;
    this.LClaw2.rotateAngleX = newangle;
    this.LClaw3.rotateAngleX = newangle;
    this.LClaw4.rotateAngleX = newangle;
    this.rightleg.rotateAngleX = -0.297F - newangle;
    this.Rleg1.rotateAngleX = 0.483F - newangle;
    this.RLeg2.rotateAngleX = -0.437F - newangle;
    this.Rfoot1.rotateAngleX = -newangle;
    this.Rfoot2.rotateAngleX = -newangle;
    this.Rfoot3.rotateAngleX = -newangle;
    this.Rfoot4.rotateAngleX = -newangle;
    this.Rclaw1.rotateAngleX = -newangle;
    this.Rclaw2.rotateAngleX = -newangle;
    this.Rclaw3.rotateAngleX = -newangle;
    this.Rclaw4.rotateAngleX = -newangle;
    this.Tail1.rotateAngleX = -0.594F + MathHelper.cos(f2 * 0.05F) * 3.1415927F * 0.06F;
    this.Tail2.rotateAngleX = this.Tail1.rotateAngleX;
    this.Tail3.rotateAngleX = this.Tail1.rotateAngleX;
    this.Tail3.rotateAngleY = -0.334F + MathHelper.cos(f2 * 0.061F) * 3.1415927F * 0.08F;
    this.Tail2.rotateAngleY = 0.334F - MathHelper.cos(f2 * 0.072F) * 3.1415927F * 0.08F;
    r = o.getRenderInfo();
    if (o.riddenByEntity != null) {
      f3 = (o.prevRotationYaw - o.rotationYaw) * 20.0F;
      f3 = -f3;
      r.rf1 += (f3 - r.rf1) / 60.0F;
      if (r.rf1 > 50.0F)
        r.rf1 = 50.0F; 
      if (r.rf1 < -50.0F)
        r.rf1 = -50.0F; 
      f3 = r.rf1;
    } else {
      f3 /= 2.0F;
    } 
    if (o.isSitting() == true && o.get_is_activated() == 0) {
      f3 = 0.0F;
      this.Head1.rotateAngleX = 3.1415F;
      this.head.rotateAngleX = this.Head1.rotateAngleX;
      this.mouth1.rotateAngleX = this.Head1.rotateAngleX;
      this.Neck1.rotateAngleX = this.Head1.rotateAngleX;
      this.Hat1.rotateAngleX = this.Head1.rotateAngleX;
      this.Hat2.rotateAngleX = this.Head1.rotateAngleX;
    } else {
      this.Head1.rotateAngleX = 0.0F;
      this.head.rotateAngleX = this.Head1.rotateAngleX;
      this.mouth1.rotateAngleX = this.Head1.rotateAngleX;
      this.Neck1.rotateAngleX = this.Head1.rotateAngleX;
      this.Hat1.rotateAngleX = this.Head1.rotateAngleX;
      this.Hat2.rotateAngleX = this.Head1.rotateAngleX;
    } 
    this.Head1.rotateAngleY = (float)Math.toRadians(f3) * 0.65F;
    this.head.rotateAngleY = this.Head1.rotateAngleY;
    this.mouth1.rotateAngleY = this.Head1.rotateAngleY;
    this.Hat1.rotateAngleY = this.Head1.rotateAngleY;
    this.Hat2.rotateAngleY = this.Head1.rotateAngleY;
    newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
    nextangle = MathHelper.cos((f2 + 0.3F) * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
    if (nextangle > 0.0F && newangle < 0.0F) {
      r.ri1 = 0;
      if (o.worldObj.rand.nextInt(3) == 1)
        r.ri1 = 1; 
    } 
    if (r.ri1 == 0)
      newangle = 0.0F; 
    newangle = Math.abs(newangle);
    this.Lwing.rotateAngleZ = -newangle;
    this.Lwing.rotateAngleY = newangle / 2.0F;
    this.Rwing.rotateAngleZ = newangle;
    this.Rwing.rotateAngleY = -newangle / 2.0F;
    o.setRenderInfo(r);
    this.Body1.render(f5);
    this.body2.render(f5);
    this.LLeg1.render(f5);
    this.Rleg1.render(f5);
    this.LLeg2.render(f5);
    this.Lfoot1.render(f5);
    this.RLeg2.render(f5);
    this.Lfoot2.render(f5);
    this.Lfoot3.render(f5);
    this.LClaw1.render(f5);
    this.LClaw2.render(f5);
    this.LClaw3.render(f5);
    this.Lfoot4.render(f5);
    this.LClaw4.render(f5);
    this.Rfoot1.render(f5);
    this.Rfoot2.render(f5);
    this.Rclaw1.render(f5);
    this.Rfoot3.render(f5);
    this.Rclaw3.render(f5);
    this.Rfoot4.render(f5);
    this.Rclaw2.render(f5);
    this.Rclaw4.render(f5);
    this.Body3.render(f5);
    this.Tail1.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.Body4.render(f5);
    this.head.render(f5);
    this.leftleg.render(f5);
    this.Neck1.render(f5);
    this.Head1.render(f5);
    this.mouth1.render(f5);
    this.neck2.render(f5);
    this.rightleg.render(f5);
    this.Lwing.render(f5);
    this.Rwing.render(f5);
    if (o instanceof EntityCannonFodder && 
      o.get_is_activated() != 0) {
      this.Hat1.render(f5);
      if (o.get_is_activated() > 1)
        this.Hat2.render(f5); 
    } 
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
