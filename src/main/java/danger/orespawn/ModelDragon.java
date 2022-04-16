package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDragon extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer horn1;
  
  ModelRenderer horn2;
  
  ModelRenderer tail6;
  
  ModelRenderer wing15;
  
  ModelRenderer spike1;
  
  ModelRenderer spike2;
  
  ModelRenderer spike3;
  
  ModelRenderer spike4;
  
  ModelRenderer wing14;
  
  ModelRenderer spike5;
  
  ModelRenderer spike6;
  
  ModelRenderer spike7;
  
  ModelRenderer spike8;
  
  ModelRenderer spike9;
  
  ModelRenderer spike10;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer body2;
  
  ModelRenderer neck1;
  
  ModelRenderer body3;
  
  ModelRenderer neck2;
  
  ModelRenderer neck3;
  
  ModelRenderer leg5;
  
  ModelRenderer leg6;
  
  ModelRenderer leg7;
  
  ModelRenderer leg9;
  
  ModelRenderer foot1;
  
  ModelRenderer foot2;
  
  ModelRenderer leg10;
  
  ModelRenderer leg11;
  
  ModelRenderer foot3;
  
  ModelRenderer foot4;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer mouth1;
  
  ModelRenderer mouth2;
  
  ModelRenderer tail5;
  
  ModelRenderer wing1;
  
  ModelRenderer wing2;
  
  ModelRenderer wing3;
  
  ModelRenderer wing4;
  
  ModelRenderer wing5;
  
  ModelRenderer wing6;
  
  ModelRenderer wing7;
  
  ModelRenderer wing8;
  
  ModelRenderer wing9;
  
  ModelRenderer wing10;
  
  ModelRenderer wing11;
  
  ModelRenderer wing12;
  
  ModelRenderer tail4;
  
  public ModelDragon(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.horn1 = new ModelRenderer(this, 0, 39);
    this.horn1.addBox(2.0F, -4.0F, 1.0F, 2, 2, 6);
    this.horn1.setRotationPoint(0.0F, 6.0F, -23.0F);
    this.horn1.setTextureSize(256, 128);
    this.horn1.mirror = true;
    setRotation(this.horn1, 0.4089647F, 0.2602503F, 0.0F);
    this.horn2 = new ModelRenderer(this, 0, 39);
    this.horn2.addBox(-4.0F, -4.0F, 1.0F, 2, 2, 6);
    this.horn2.setRotationPoint(0.0F, 6.0F, -23.0F);
    this.horn2.setTextureSize(256, 128);
    this.horn2.mirror = true;
    setRotation(this.horn2, 0.4089647F, -0.2602503F, 0.0F);
    this.tail6 = new ModelRenderer(this, 0, 49);
    this.tail6.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 4);
    this.tail6.setRotationPoint(0.0F, 7.0F, 43.0F);
    this.tail6.setTextureSize(256, 128);
    this.tail6.mirror = true;
    setRotation(this.tail6, 1.570796F, 0.0F, 0.0F);
    this.wing15 = new ModelRenderer(this, 0, 62);
    this.wing15.addBox(1.0F, -1.0F, 1.0F, 12, 1, 8);
    this.wing15.setRotationPoint(4.0F, 3.0F, -5.0F);
    this.wing15.setTextureSize(256, 128);
    this.wing15.mirror = true;
    setRotation(this.wing15, -0.0743572F, -0.4089594F, 0.0F);
    this.spike1 = new ModelRenderer(this, 0, 73);
    this.spike1.addBox(-1.0F, -3.0F, -5.0F, 2, 2, 4);
    this.spike1.setRotationPoint(0.0F, 6.0F, -17.0F);
    this.spike1.setTextureSize(256, 128);
    this.spike1.mirror = true;
    setRotation(this.spike1, 0.0F, 0.0F, 0.0F);
    this.spike2 = new ModelRenderer(this, 0, 73);
    this.spike2.addBox(-1.0F, -3.0F, -5.0F, 2, 2, 4);
    this.spike2.setRotationPoint(0.0F, 6.0F, -11.0F);
    this.spike2.setTextureSize(256, 128);
    this.spike2.mirror = true;
    setRotation(this.spike2, 0.0F, 0.0F, 0.0F);
    this.spike3 = new ModelRenderer(this, 0, 73);
    this.spike3.addBox(-1.0F, -4.0F, 1.0F, 2, 2, 4);
    this.spike3.setRotationPoint(0.0F, 7.0F, 25.0F);
    this.spike3.setTextureSize(256, 128);
    this.spike3.mirror = true;
    setRotation(this.spike3, 0.0F, 0.0F, 0.0F);
    this.spike4 = new ModelRenderer(this, 0, 73);
    this.spike4.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 4);
    this.spike4.setRotationPoint(0.0F, 3.0F, -7.0F);
    this.spike4.setTextureSize(256, 128);
    this.spike4.mirror = true;
    setRotation(this.spike4, 0.0F, 0.0F, 0.0F);
    this.wing14 = new ModelRenderer(this, 0, 62);
    this.wing14.addBox(-13.0F, -1.0F, 0.0F, 12, 1, 8);
    this.wing14.setRotationPoint(-4.0F, 3.0F, -5.0F);
    this.wing14.setTextureSize(256, 128);
    this.wing14.mirror = true;
    setRotation(this.wing14, -0.0698132F, 0.4089656F, 0.0F);
    this.spike5 = new ModelRenderer(this, 0, 73);
    this.spike5.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 4);
    this.spike5.setRotationPoint(0.0F, 3.0F, -1.0F);
    this.spike5.setTextureSize(256, 128);
    this.spike5.mirror = true;
    setRotation(this.spike5, 0.0F, 0.0F, 0.0F);
    this.spike6 = new ModelRenderer(this, 0, 73);
    this.spike6.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 4);
    this.spike6.setRotationPoint(0.0F, 3.0F, 5.0F);
    this.spike6.setTextureSize(256, 128);
    this.spike6.mirror = true;
    setRotation(this.spike6, 0.0F, 0.0F, 0.0F);
    this.spike7 = new ModelRenderer(this, 0, 73);
    this.spike7.addBox(-1.0F, -4.0F, 1.0F, 2, 2, 4);
    this.spike7.setRotationPoint(0.0F, 7.0F, 13.0F);
    this.spike7.setTextureSize(256, 128);
    this.spike7.mirror = true;
    setRotation(this.spike7, 0.0F, 0.0F, 0.0F);
    this.spike8 = new ModelRenderer(this, 0, 73);
    this.spike8.addBox(-1.0F, -2.0F, 1.0F, 2, 2, 4);
    this.spike8.setRotationPoint(0.0F, 5.0F, 19.0F);
    this.spike8.setTextureSize(256, 128);
    this.spike8.mirror = true;
    setRotation(this.spike8, 0.0F, 0.0F, 0.0F);
    this.spike9 = new ModelRenderer(this, 0, 73);
    this.spike9.addBox(-1.0F, -4.0F, 1.0F, 2, 2, 4);
    this.spike9.setRotationPoint(0.0F, 7.0F, 31.0F);
    this.spike9.setTextureSize(256, 128);
    this.spike9.mirror = true;
    setRotation(this.spike9, 0.0F, 0.0F, 0.0F);
    this.spike10 = new ModelRenderer(this, 0, 73);
    this.spike10.addBox(-1.0F, -4.0F, 2.0F, 2, 2, 4);
    this.spike10.setRotationPoint(0.0F, 7.0F, 36.0F);
    this.spike10.setTextureSize(256, 128);
    this.spike10.mirror = true;
    setRotation(this.spike10, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 81);
    this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 6.0F, -23.0F);
    this.head.setTextureSize(256, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 1, 99);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.setTextureSize(256, 128);
    this.body.mirror = true;
    setRotation(this.body, 1.570796F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 47, 112);
    this.leg1.addBox(-4.0F, -1.0F, -2.0F, 4, 9, 5);
    this.leg1.setRotationPoint(-4.0F, 11.0F, 8.0F);
    this.leg1.setTextureSize(256, 128);
    this.leg1.mirror = true;
    setRotation(this.leg1, -0.6320364F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 47, 112);
    this.leg2.addBox(1.0F, -1.0F, -2.0F, 4, 9, 5);
    this.leg2.setRotationPoint(3.0F, 11.0F, 8.0F);
    this.leg2.setTextureSize(256, 128);
    this.leg2.mirror = true;
    setRotation(this.leg2, -0.6320364F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 18, 47);
    this.leg3.addBox(-3.0F, -2.0F, -2.0F, 4, 9, 4);
    this.leg3.setRotationPoint(-4.0F, 11.0F, -5.0F);
    this.leg3.setTextureSize(256, 128);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.5576792F, 0.0F, 0.0F);
    this.leg4 = new ModelRenderer(this, 18, 47);
    this.leg4.addBox(0.0F, -2.0F, -2.0F, 4, 9, 4);
    this.leg4.setRotationPoint(3.0F, 11.0F, -5.0F);
    this.leg4.setTextureSize(256, 128);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.5576792F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 68, 94);
    this.body2.addBox(-5.0F, 0.0F, 0.0F, 10, 22, 10);
    this.body2.setRotationPoint(0.0F, 12.0F, -10.0F);
    this.body2.setTextureSize(256, 128);
    this.body2.mirror = true;
    setRotation(this.body2, 1.570796F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 43, 85);
    this.neck1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 6);
    this.neck1.setRotationPoint(0.0F, 7.0F, 25.0F);
    this.neck1.setTextureSize(256, 128);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.0F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 70, 59);
    this.body3.addBox(-4.0F, 0.0F, 0.0F, 8, 24, 8);
    this.body3.setRotationPoint(0.0F, 11.0F, -11.0F);
    this.body3.setTextureSize(256, 128);
    this.body3.mirror = true;
    setRotation(this.body3, 1.570796F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 43, 85);
    this.neck2.addBox(-3.0F, -2.0F, -6.0F, 6, 6, 6);
    this.neck2.setRotationPoint(0.0F, 6.0F, -11.0F);
    this.neck2.setTextureSize(256, 128);
    this.neck2.mirror = true;
    setRotation(this.neck2, 0.0F, 0.0F, 0.0F);
    this.neck3 = new ModelRenderer(this, 43, 85);
    this.neck3.addBox(-3.0F, -2.0F, -6.0F, 6, 6, 6);
    this.neck3.setRotationPoint(0.0F, 6.0F, -17.0F);
    this.neck3.setTextureSize(256, 128);
    this.neck3.mirror = true;
    setRotation(this.neck3, 0.0F, 0.0F, 0.0F);
    this.leg5 = new ModelRenderer(this, 47, 99);
    this.leg5.addBox(0.0F, 3.0F, 3.0F, 4, 8, 4);
    this.leg5.setRotationPoint(3.0F, 11.0F, -5.0F);
    this.leg5.setTextureSize(256, 128);
    this.leg5.mirror = true;
    setRotation(this.leg5, -0.5576792F, 0.0F, 0.0F);
    this.leg6 = new ModelRenderer(this, 47, 99);
    this.leg6.addBox(-3.0F, 3.0F, 3.0F, 4, 8, 4);
    this.leg6.setRotationPoint(-4.0F, 11.0F, -5.0F);
    this.leg6.setTextureSize(256, 128);
    this.leg6.mirror = true;
    setRotation(this.leg6, -0.5576792F, 0.0F, 0.0F);
    this.leg7 = new ModelRenderer(this, 38, 73);
    this.leg7.addBox(1.0F, 2.0F, -8.0F, 4, 5, 4);
    this.leg7.setRotationPoint(3.0F, 11.0F, 8.0F);
    this.leg7.setTextureSize(256, 128);
    this.leg7.mirror = true;
    setRotation(this.leg7, 0.8922867F, 0.0F, 0.0F);
    this.leg9 = new ModelRenderer(this, 38, 73);
    this.leg9.addBox(-4.0F, 2.0F, -8.0F, 4, 5, 4);
    this.leg9.setRotationPoint(-4.0F, 11.0F, 8.0F);
    this.leg9.setTextureSize(256, 128);
    this.leg9.mirror = true;
    setRotation(this.leg9, 0.8922867F, 0.0F, 0.0F);
    this.foot1 = new ModelRenderer(this, 43, 63);
    this.foot1.addBox(-3.0F, 11.0F, -5.0F, 4, 2, 6);
    this.foot1.setRotationPoint(-4.0F, 11.0F, -5.0F);
    this.foot1.setTextureSize(256, 128);
    this.foot1.mirror = true;
    setRotation(this.foot1, 0.0F, 0.0F, 0.0F);
    this.foot2 = new ModelRenderer(this, 43, 63);
    this.foot2.addBox(0.0F, 11.0F, -5.0F, 4, 2, 6);
    this.foot2.setRotationPoint(3.0F, 11.0F, -5.0F);
    this.foot2.setTextureSize(256, 128);
    this.foot2.mirror = true;
    setRotation(this.foot2, 0.0F, 0.0F, 0.0F);
    this.leg10 = new ModelRenderer(this, 39, 52);
    this.leg10.addBox(1.0F, 6.0F, 2.0F, 4, 5, 4);
    this.leg10.setRotationPoint(3.0F, 11.0F, 8.0F);
    this.leg10.setTextureSize(256, 128);
    this.leg10.mirror = true;
    setRotation(this.leg10, -0.5576792F, 0.0F, 0.0F);
    this.leg11 = new ModelRenderer(this, 39, 52);
    this.leg11.addBox(-4.0F, 6.0F, 2.0F, 4, 5, 4);
    this.leg11.setRotationPoint(-4.0F, 11.0F, 8.0F);
    this.leg11.setTextureSize(256, 128);
    this.leg11.mirror = true;
    setRotation(this.leg11, -0.5576792F, 0.0F, 0.0F);
    this.foot3 = new ModelRenderer(this, 43, 63);
    this.foot3.addBox(1.0F, 11.0F, -7.0F, 4, 2, 6);
    this.foot3.setRotationPoint(3.0F, 11.0F, 8.0F);
    this.foot3.setTextureSize(256, 128);
    this.foot3.mirror = true;
    setRotation(this.foot3, 0.0F, 0.0F, 0.0F);
    this.foot4 = new ModelRenderer(this, 43, 63);
    this.foot4.addBox(-4.0F, 11.0F, -7.0F, 4, 2, 6);
    this.foot4.setRotationPoint(-4.0F, 11.0F, 8.0F);
    this.foot4.setTextureSize(256, 128);
    this.foot4.mirror = true;
    setRotation(this.foot4, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 43, 85);
    this.tail1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 6);
    this.tail1.setRotationPoint(0.0F, 7.0F, 13.0F);
    this.tail1.setTextureSize(256, 128);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 43, 85);
    this.tail2.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 6);
    this.tail2.setRotationPoint(0.0F, 7.0F, 19.0F);
    this.tail2.setTextureSize(256, 128);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 56, 45);
    this.tail3.addBox(-3.0F, -3.0F, 0.0F, 4, 6, 6);
    this.tail3.setRotationPoint(1.0F, 7.0F, 31.0F);
    this.tail3.setTextureSize(256, 128);
    this.tail3.mirror = true;
    setRotation(this.tail3, 0.0F, 0.0F, 0.0F);
    this.mouth1 = new ModelRenderer(this, 90, 22);
    this.mouth1.addBox(-3.0F, -1.0F, -15.0F, 6, 3, 8);
    this.mouth1.setRotationPoint(0.0F, 6.0F, -23.0F);
    this.mouth1.setTextureSize(256, 128);
    this.mouth1.mirror = true;
    setRotation(this.mouth1, 0.0F, 0.0F, 0.0F);
    this.mouth2 = new ModelRenderer(this, 90, 6);
    this.mouth2.addBox(-2.0F, 1.0F, -5.0F, 4, 2, 8);
    this.mouth2.setRotationPoint(0.0F, 7.0F, -32.0F);
    this.mouth2.setTextureSize(256, 128);
    this.mouth2.mirror = true;
    setRotation(this.mouth2, 0.0698132F, 0.0F, 0.0F);
    this.tail5 = new ModelRenderer(this, 87, 36);
    this.tail5.addBox(0.0F, 0.0F, -5.0F, 0, 11, 10);
    this.tail5.setRotationPoint(0.0F, 7.0F, 49.0F);
    this.tail5.setTextureSize(256, 128);
    this.tail5.mirror = true;
    setRotation(this.tail5, 1.570796F, 0.0F, 0.0F);
    this.wing1 = new ModelRenderer(this, 26, 40);
    this.wing1.addBox(0.0F, -1.0F, -1.0F, 11, 2, 2);
    this.wing1.setRotationPoint(4.0F, 3.0F, -5.0F);
    this.wing1.setTextureSize(256, 128);
    this.wing1.mirror = true;
    setRotation(this.wing1, 0.0F, -0.4833219F, 0.0F);
    this.wing2 = new ModelRenderer(this, 110, 88);
    this.wing2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 36);
    this.wing2.setRotationPoint(19.0F, 3.0F, -23.0F);
    this.wing2.setTextureSize(256, 128);
    this.wing2.mirror = true;
    setRotation(this.wing2, 0.0F, 1.041001F, 0.0F);
    this.wing3 = new ModelRenderer(this, 109, 60);
    this.wing3.addBox(-1.0F, -1.0F, -24.0F, 2, 2, 24);
    this.wing3.setRotationPoint(12.0F, 3.0F, -1.0F);
    this.wing3.setTextureSize(256, 128);
    this.wing3.mirror = true;
    setRotation(this.wing3, -0.0090881F, -0.3497888F, 0.0F);
    this.wing4 = new ModelRenderer(this, 26, 40);
    this.wing4.addBox(-11.0F, -1.0F, -1.0F, 11, 2, 2);
    this.wing4.setRotationPoint(-4.0F, 3.0F, -5.0F);
    this.wing4.setTextureSize(256, 128);
    this.wing4.mirror = true;
    setRotation(this.wing4, 0.0F, 0.4833166F, 0.0F);
    this.wing5 = new ModelRenderer(this, 109, 60);
    this.wing5.addBox(-1.0F, -1.0F, -24.0F, 2, 2, 24);
    this.wing5.setRotationPoint(-12.0F, 3.0F, -1.0F);
    this.wing5.setTextureSize(256, 128);
    this.wing5.mirror = true;
    setRotation(this.wing5, -0.0090932F, 0.3323281F, 0.0F);
    this.wing6 = new ModelRenderer(this, 110, 88);
    this.wing6.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 36);
    this.wing6.setRotationPoint(-20.0F, 3.0F, -23.0F);
    this.wing6.setTextureSize(256, 128);
    this.wing6.mirror = true;
    setRotation(this.wing6, 0.0F, -1.041002F, 0.0F);
    this.wing7 = new ModelRenderer(this, 124, 21);
    this.wing7.addBox(-8.0F, 0.0F, 1.0F, 8, 1, 36);
    this.wing7.setRotationPoint(19.0F, 2.0F, -23.0F);
    this.wing7.setTextureSize(256, 128);
    this.wing7.mirror = true;
    setRotation(this.wing7, 0.0F, 1.041001F, 0.0F);
    this.wing8 = new ModelRenderer(this, 122, 10);
    this.wing8.addBox(-11.0F, -1.0F, 0.0F, 28, 1, 8);
    this.wing8.setRotationPoint(12.0F, 3.0F, -1.0F);
    this.wing8.setTextureSize(256, 128);
    this.wing8.mirror = true;
    setRotation(this.wing8, 0.002272F, 1.264073F, -0.0174533F);
    this.wing9 = new ModelRenderer(this, 0, 10);
    this.wing9.addBox(-25.0F, -1.0F, 7.0F, 18, 1, 26);
    this.wing9.setRotationPoint(19.0F, 3.0F, -23.0F);
    this.wing9.setTextureSize(256, 128);
    this.wing9.mirror = true;
    setRotation(this.wing9, 0.002272F, 1.264073F, 0.0F);
    this.wing10 = new ModelRenderer(this, 122, 10);
    this.wing10.addBox(-23.0F, -1.0F, 0.0F, 33, 1, 8);
    this.wing10.setRotationPoint(-12.0F, 3.0F, -1.0F);
    this.wing10.setTextureSize(256, 128);
    this.wing10.mirror = true;
    setRotation(this.wing10, -0.0022689F, -1.226894F, 0.0F);
    this.wing11 = new ModelRenderer(this, 124, 21);
    this.wing11.addBox(0.0F, -1.0F, 1.0F, 8, 1, 36);
    this.wing11.setRotationPoint(-20.0F, 3.0F, -23.0F);
    this.wing11.setTextureSize(256, 128);
    this.wing11.mirror = true;
    setRotation(this.wing11, 0.0F, -1.041002F, 0.0F);
    this.wing12 = new ModelRenderer(this, 0, 10);
    this.wing12.addBox(7.0F, -1.0F, 7.0F, 18, 1, 26);
    this.wing12.setRotationPoint(-20.0F, 3.0F, -23.0F);
    this.wing12.setTextureSize(256, 128);
    this.wing12.mirror = true;
    setRotation(this.wing12, 0.002272F, -1.264072F, 0.0F);
    this.tail4 = new ModelRenderer(this, 56, 45);
    this.tail4.addBox(-3.0F, -3.0F, 0.0F, 4, 6, 6);
    this.tail4.setRotationPoint(1.0F, 7.0F, 37.0F);
    this.tail4.setTextureSize(256, 128);
    this.tail4.mirror = true;
    setRotation(this.tail4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Dragon e = (Dragon)entity;
    float newangle = 0.0F;
    float lspeed = 0.0F;
    RenderInfo r = null;
    float tailspeed = 0.76F;
    float tailamp = 0.45F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderInfo();
    if (f1 > 0.001D) {
      lspeed = (float)((e.prevPosX - e.posX) * (e.prevPosX - e.posX) + (e.prevPosZ - e.posZ) * (e.prevPosZ - e.posZ));
      lspeed = (float)Math.sqrt(lspeed);
      newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed) * 3.1415927F * lspeed * 0.6F;
    } else {
      newangle = 0.0F;
    } 
    if (e.getActivity() != 0) {
      newangle = 1.0F;
      this.leg4.rotateAngleX = 0.557F - newangle;
      this.leg5.rotateAngleX = -0.557F - newangle;
      this.foot2.rotateAngleX = -newangle;
      this.leg3.rotateAngleX = 0.557F - newangle;
      this.leg6.rotateAngleX = -0.557F - newangle;
      this.foot1.rotateAngleX = -newangle;
      this.leg2.rotateAngleX = -0.632F + newangle;
      this.leg7.rotateAngleX = 0.89F + newangle;
      this.leg10.rotateAngleX = -0.557F + newangle;
      this.foot3.rotateAngleX = newangle;
      this.leg1.rotateAngleX = -0.632F + newangle;
      this.leg9.rotateAngleX = 0.89F + newangle;
      this.leg11.rotateAngleX = -0.557F + newangle;
      this.foot4.rotateAngleX = newangle;
    } else {
      this.leg4.rotateAngleX = 0.557F + newangle;
      this.leg5.rotateAngleX = -0.557F + newangle;
      this.foot2.rotateAngleX = newangle;
      this.leg3.rotateAngleX = 0.557F - newangle;
      this.leg6.rotateAngleX = -0.557F - newangle;
      this.foot1.rotateAngleX = -newangle;
      this.leg2.rotateAngleX = -0.632F - newangle;
      this.leg7.rotateAngleX = 0.89F - newangle;
      this.leg10.rotateAngleX = -0.557F - newangle;
      this.foot3.rotateAngleX = -newangle;
      this.leg1.rotateAngleX = -0.632F + newangle;
      this.leg9.rotateAngleX = 0.89F + newangle;
      this.leg11.rotateAngleX = -0.557F + newangle;
      this.foot4.rotateAngleX = newangle;
    } 
    if (e.getAttacking() != 0) {
      if (e.getActivity() != 0) {
        newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.28F;
      } else {
        newangle = -0.45F + MathHelper.cos(f2 * 0.85F * this.wingspeed) * 3.1415927F * 0.2F;
      } 
    } else if (e.getActivity() != 0) {
      newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.28F;
    } else {
      newangle = -0.85F + MathHelper.cos(f2 * 0.2F * this.wingspeed) * 3.1415927F * 0.028F;
    } 
    this.wing1.rotateAngleZ = newangle;
    this.wing15.rotateAngleZ = newangle;
    this.wing3.rotateAngleZ = newangle * 4.0F / 3.0F;
    this.wing1.rotationPointY += (float)Math.sin(this.wing1.rotateAngleZ) * 7.0F;
    this.wing1.rotationPointX += (float)Math.cos(this.wing1.rotateAngleZ) * 7.0F;
    this.wing8.rotateAngleZ = newangle * 4.0F / 3.0F;
    this.wing8.rotationPointY = this.wing3.rotationPointY;
    this.wing8.rotationPointX = this.wing3.rotationPointX;
    this.wing2.rotateAngleZ = newangle * 3.0F / 2.0F;
    this.wing3.rotationPointY += (float)Math.sin(this.wing3.rotateAngleZ) * 6.0F;
    this.wing3.rotationPointX += (float)Math.cos(this.wing3.rotateAngleZ) * 6.0F;
    this.wing7.rotateAngleZ = newangle * 3.0F / 2.0F;
    this.wing7.rotationPointY = this.wing2.rotationPointY;
    this.wing7.rotationPointX = this.wing2.rotationPointX;
    this.wing9.rotateAngleZ = newangle * 3.0F / 2.0F;
    this.wing9.rotationPointY = this.wing2.rotationPointY;
    this.wing9.rotationPointX = this.wing2.rotationPointX;
    this.wing4.rotateAngleZ = -newangle;
    this.wing14.rotateAngleZ = -newangle;
    this.wing5.rotateAngleZ = -newangle * 4.0F / 3.0F;
    this.wing4.rotationPointY -= (float)Math.sin(this.wing4.rotateAngleZ) * 7.0F;
    this.wing4.rotationPointX -= (float)Math.cos(this.wing4.rotateAngleZ) * 7.0F;
    this.wing10.rotateAngleZ = -newangle * 4.0F / 3.0F;
    this.wing10.rotationPointY = this.wing5.rotationPointY;
    this.wing10.rotationPointX = this.wing5.rotationPointX;
    this.wing6.rotateAngleZ = -newangle * 3.0F / 2.0F;
    this.wing5.rotationPointY -= (float)Math.sin(this.wing5.rotateAngleZ) * 6.0F;
    this.wing5.rotationPointX -= (float)Math.cos(this.wing5.rotateAngleZ) * 6.0F;
    this.wing11.rotateAngleZ = -newangle * 3.0F / 2.0F;
    this.wing11.rotationPointY = this.wing6.rotationPointY;
    this.wing11.rotationPointX = this.wing6.rotationPointX;
    this.wing12.rotateAngleZ = -newangle * 3.0F / 2.0F;
    this.wing12.rotationPointY = this.wing6.rotationPointY;
    this.wing12.rotationPointX = this.wing6.rotationPointX;
    if (e.getAttacking() != 0) {
      tailspeed = 0.96F;
      tailamp = 0.75F;
    } 
    if (e.getActivity() == 0 && e.getAttacking() == 0) {
      tailspeed = 0.22F;
      tailamp = 0.22F;
    } 
    if (e.isSitting()) {
      tailspeed = 0.0F;
      tailamp = 0.0F;
    } 
    this.tail1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * 0.04F;
    this.spike10.rotationPointZ = this.tail1.rotationPointZ;
    this.spike10.rotationPointX = this.tail1.rotationPointX;
    this.spike10.rotateAngleY = this.tail1.rotateAngleY;
    this.tail1.rotationPointZ += (float)Math.cos(this.tail1.rotateAngleY) * 6.0F;
    this.tail1.rotationPointX += (float)Math.sin(this.tail1.rotateAngleY) * 6.0F;
    this.tail2.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.125F;
    this.spike7.rotationPointZ = this.tail2.rotationPointZ;
    this.spike7.rotationPointX = this.tail2.rotationPointX;
    this.spike7.rotateAngleY = this.tail2.rotateAngleY;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 6.0F;
    this.tail2.rotationPointX += (float)Math.sin(this.tail2.rotateAngleY) * 6.0F;
    this.neck1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.25F;
    this.spike8.rotationPointZ = this.neck1.rotationPointZ;
    this.spike8.rotationPointX = this.neck1.rotationPointX;
    this.spike8.rotateAngleY = this.neck1.rotateAngleY;
    this.neck1.rotationPointZ += (float)Math.cos(this.neck1.rotateAngleY) * 6.0F;
    this.tail3.rotationPointX = this.neck1.rotationPointX + 1.0F + (float)Math.sin(this.neck1.rotateAngleY) * 6.0F;
    this.tail3.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.375F;
    this.spike3.rotationPointZ = this.tail3.rotationPointZ;
    this.tail3.rotationPointX--;
    this.spike3.rotateAngleY = this.tail3.rotateAngleY;
    this.tail3.rotationPointZ += (float)Math.cos(this.tail3.rotateAngleY) * 6.0F;
    this.tail3.rotationPointX += (float)Math.sin(this.tail3.rotateAngleY) * 6.0F;
    this.tail4.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.5F;
    this.spike9.rotationPointZ = this.tail4.rotationPointZ;
    this.tail4.rotationPointX--;
    this.spike9.rotateAngleY = this.tail4.rotateAngleY;
    this.tail4.rotationPointZ += (float)Math.cos(this.tail4.rotateAngleY) * 6.0F;
    this.tail6.rotationPointX = this.tail4.rotationPointX - 1.0F + (float)Math.sin(this.tail4.rotateAngleY) * 6.0F;
    this.tail6.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.625F;
    this.tail6.rotationPointZ += (float)Math.cos(this.tail6.rotateAngleY) * 6.0F;
    this.tail5.rotationPointX = this.tail6.rotationPointX - 0.5F + (float)Math.sin(this.tail6.rotateAngleY) * 6.0F;
    this.tail5.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * tailamp * 0.75F;
    if (e.getActivity() == 1) {
      f3 = (e.prevRotationYaw - e.rotationYaw) * 8.0F;
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
    this.neck2.rotateAngleY = (float)Math.toRadians(f3) * 0.25F;
    this.spike2.rotateAngleY = this.neck2.rotateAngleY;
    this.neck2.rotationPointZ -= (float)Math.cos(this.neck2.rotateAngleY) * 6.0F;
    this.neck2.rotationPointX -= (float)Math.sin(this.neck2.rotateAngleY) * 6.0F;
    this.neck3.rotateAngleY = (float)Math.toRadians(f3) * 0.5F;
    this.spike1.rotationPointZ = this.neck3.rotationPointZ;
    this.spike1.rotationPointX = this.neck3.rotationPointX;
    this.spike1.rotateAngleY = this.neck3.rotateAngleY;
    this.neck3.rotationPointZ -= (float)Math.cos(this.neck3.rotateAngleY) * 6.0F;
    this.neck3.rotationPointX -= (float)Math.sin(this.neck3.rotateAngleY) * 6.0F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.75F;
    this.mouth1.rotationPointZ = this.head.rotationPointZ;
    this.mouth1.rotationPointX = this.head.rotationPointX;
    this.mouth1.rotateAngleY = this.head.rotateAngleY;
    this.horn1.rotationPointZ = this.head.rotationPointZ;
    this.horn1.rotationPointX = this.head.rotationPointX;
    this.head.rotateAngleY += 0.26F;
    this.horn2.rotationPointZ = this.head.rotationPointZ;
    this.horn2.rotationPointX = this.head.rotationPointX;
    this.head.rotateAngleY -= 0.26F;
    this.head.rotationPointZ -= (float)Math.cos(this.head.rotateAngleY) * 9.0F;
    this.head.rotationPointX -= (float)Math.sin(this.head.rotateAngleY) * 9.0F;
    this.mouth2.rotateAngleY = this.head.rotateAngleY;
    newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.14F;
    if (e.getAttacking() != 0) {
      this.mouth2.rotateAngleX = 0.4F + newangle;
    } else {
      this.mouth2.rotateAngleX = 0.07F;
    } 
    e.setRenderInfo(r);
    this.horn1.render(f5);
    this.horn2.render(f5);
    this.tail6.render(f5);
    this.wing15.render(f5);
    this.spike1.render(f5);
    this.spike2.render(f5);
    this.spike3.render(f5);
    this.spike4.render(f5);
    this.wing14.render(f5);
    this.spike5.render(f5);
    this.spike6.render(f5);
    this.spike7.render(f5);
    this.spike8.render(f5);
    this.spike9.render(f5);
    this.spike10.render(f5);
    this.head.render(f5);
    this.body.render(f5);
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg4.render(f5);
    this.body2.render(f5);
    this.neck1.render(f5);
    this.body3.render(f5);
    this.neck2.render(f5);
    this.neck3.render(f5);
    this.leg5.render(f5);
    this.leg6.render(f5);
    this.leg7.render(f5);
    this.leg9.render(f5);
    this.foot1.render(f5);
    this.foot2.render(f5);
    this.leg10.render(f5);
    this.leg11.render(f5);
    this.foot3.render(f5);
    this.foot4.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.mouth1.render(f5);
    this.mouth2.render(f5);
    this.tail5.render(f5);
    this.wing1.render(f5);
    this.wing2.render(f5);
    this.wing3.render(f5);
    this.wing4.render(f5);
    this.wing5.render(f5);
    this.wing6.render(f5);
    this.wing7.render(f5);
    this.wing8.render(f5);
    this.wing9.render(f5);
    this.wing10.render(f5);
    this.wing11.render(f5);
    this.wing12.render(f5);
    this.tail4.render(f5);
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
