package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAlien extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer torso;
  
  ModelRenderer stomach;
  
  ModelRenderer rThigh;
  
  ModelRenderer lThigh;
  
  ModelRenderer lShin;
  
  ModelRenderer rShin;
  
  ModelRenderer lShin1;
  
  ModelRenderer rShin1;
  
  ModelRenderer lFoot;
  
  ModelRenderer rFoot;
  
  ModelRenderer neck;
  
  ModelRenderer fan;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer tail4;
  
  ModelRenderer tail5;
  
  ModelRenderer tail1;
  
  ModelRenderer fanl1;
  
  ModelRenderer fanr1;
  
  ModelRenderer fanl2;
  
  ModelRenderer fanr2;
  
  ModelRenderer fanl3;
  
  ModelRenderer fanr3;
  
  ModelRenderer fanl4;
  
  ModelRenderer fanr4;
  
  ModelRenderer fanl5;
  
  ModelRenderer fanr5;
  
  ModelRenderer fanl6;
  
  ModelRenderer fanr6;
  
  ModelRenderer spike4;
  
  ModelRenderer spike5;
  
  ModelRenderer spike3;
  
  ModelRenderer fanl7;
  
  ModelRenderer fanr7;
  
  ModelRenderer head;
  
  ModelRenderer head1;
  
  ModelRenderer jaw1;
  
  ModelRenderer head2;
  
  ModelRenderer jaw2;
  
  ModelRenderer fang1;
  
  ModelRenderer fang2;
  
  ModelRenderer fang3;
  
  ModelRenderer fang4;
  
  ModelRenderer spike2;
  
  ModelRenderer spike1;
  
  ModelRenderer arml1;
  
  ModelRenderer armr1;
  
  ModelRenderer arml2;
  
  ModelRenderer armr2;
  
  ModelRenderer clawr1;
  
  ModelRenderer clawr2;
  
  ModelRenderer clawr3;
  
  ModelRenderer clawl2;
  
  ModelRenderer clawl3;
  
  ModelRenderer clawl1;
  
  public ModelAlien(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.torso = new ModelRenderer(this, 0, 46);
    this.torso.addBox(-4.5F, -2.0F, 0.0F, 9, 8, 10);
    this.torso.setRotationPoint(0.0F, -2.5F, -8.0F);
    this.torso.setTextureSize(64, 32);
    this.torso.mirror = true;
    setRotation(this.torso, -0.1919862F, 0.0F, 0.0F);
    this.stomach = new ModelRenderer(this, 0, 27);
    this.stomach.addBox(-3.5F, -5.0F, 8.0F, 7, 6, 12);
    this.stomach.setRotationPoint(0.0F, -2.5F, -8.0F);
    this.stomach.setTextureSize(64, 32);
    this.stomach.mirror = true;
    setRotation(this.stomach, -0.5585054F, 0.0F, 0.0F);
    this.rThigh = new ModelRenderer(this, 59, 45);
    this.rThigh.addBox(-1.5F, -4.0F, -2.5F, 4, 14, 5);
    this.rThigh.setRotationPoint(-4.5F, 7.0F, 8.0F);
    this.rThigh.setTextureSize(64, 32);
    this.rThigh.mirror = true;
    setRotation(this.rThigh, -0.8028515F, 0.2443461F, 0.418879F);
    this.lThigh = new ModelRenderer(this, 40, 45);
    this.lThigh.addBox(-2.5F, -4.0F, -2.5F, 4, 14, 5);
    this.lThigh.setRotationPoint(4.5F, 7.0F, 8.0F);
    this.lThigh.setTextureSize(64, 32);
    this.lThigh.mirror = true;
    setRotation(this.lThigh, -0.8028515F, -0.2443461F, -0.418879F);
    this.lShin = new ModelRenderer(this, 79, 49);
    this.lShin.addBox(-2.0F, 8.0F, -5.5F, 3, 3, 12);
    this.lShin.setRotationPoint(4.5F, 7.0F, 8.0F);
    this.lShin.setTextureSize(64, 32);
    this.lShin.mirror = true;
    setRotation(this.lShin, -0.4014257F, -0.2443461F, -0.418879F);
    this.rShin = new ModelRenderer(this, 79, 33);
    this.rShin.addBox(-1.0F, 8.0F, -5.5F, 3, 3, 12);
    this.rShin.setRotationPoint(-4.5F, 7.0F, 8.0F);
    this.rShin.setTextureSize(64, 32);
    this.rShin.mirror = true;
    setRotation(this.rShin, -0.4014257F, 0.2443461F, 0.418879F);
    this.lShin1 = new ModelRenderer(this, 113, 40);
    this.lShin1.addBox(-1.5F, 5.5F, 9.0F, 2, 9, 2);
    this.lShin1.setRotationPoint(4.5F, 7.0F, 8.0F);
    this.lShin1.setTextureSize(64, 32);
    this.lShin1.mirror = true;
    setRotation(this.lShin1, -0.8028515F, -0.2443461F, -0.418879F);
    this.rShin1 = new ModelRenderer(this, 113, 53);
    this.rShin1.addBox(-0.5F, 5.5F, 9.0F, 2, 9, 2);
    this.rShin1.setRotationPoint(-4.5F, 7.0F, 8.0F);
    this.rShin1.setTextureSize(64, 32);
    this.rShin1.mirror = true;
    setRotation(this.rShin1, -0.8028515F, 0.2443461F, 0.418879F);
    this.lFoot = new ModelRenderer(this, 110, 24);
    this.lFoot.addBox(5.0F, 15.0F, -8.0F, 2, 2, 6);
    this.lFoot.setRotationPoint(4.5F, 7.0F, 8.0F);
    this.lFoot.setTextureSize(64, 32);
    this.lFoot.mirror = true;
    setRotation(this.lFoot, 0.0F, -0.2443461F, 0.0F);
    this.rFoot = new ModelRenderer(this, 95, 24);
    this.rFoot.addBox(-7.0F, 15.0F, -8.0F, 2, 2, 6);
    this.rFoot.setRotationPoint(-4.5F, 7.0F, 8.0F);
    this.rFoot.setTextureSize(64, 32);
    this.rFoot.mirror = true;
    setRotation(this.rFoot, 0.0F, 0.2443461F, 0.0F);
    this.neck = new ModelRenderer(this, 23, 86);
    this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 6, 5);
    this.neck.setRotationPoint(0.0F, -2.5F, -8.0F);
    this.neck.setTextureSize(64, 32);
    this.neck.mirror = true;
    setRotation(this.neck, -0.1919862F, 0.0F, 0.0F);
    this.fan = new ModelRenderer(this, 149, 10);
    this.fan.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fan.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fan.setTextureSize(64, 32);
    this.fan.mirror = true;
    setRotation(this.fan, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 85, 66);
    this.tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 11);
    this.tail2.setRotationPoint(0.0F, 9.5F, 20.5F);
    this.tail2.setTextureSize(64, 32);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.3141593F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 118, 66);
    this.tail3.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 11);
    this.tail3.setRotationPoint(0.0F, 13.5F, 30.5F);
    this.tail3.setTextureSize(64, 32);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 149, 66);
    this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11);
    this.tail4.setRotationPoint(0.0F, 15.5F, 40.5F);
    this.tail4.setTextureSize(64, 32);
    this.tail4.mirror = true;
    setRotation(this.tail4, -0.1396263F, 0.0F, 0.0F);
    this.tail5 = new ModelRenderer(this, 178, 66);
    this.tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
    this.tail5.setRotationPoint(0.0F, 17.5F, 50.5F);
    this.tail5.setTextureSize(64, 32);
    this.tail5.mirror = true;
    setRotation(this.tail5, -0.0523599F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 50, 66);
    this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11);
    this.tail1.setRotationPoint(0.0F, 6.5F, 10.5F);
    this.tail1.setTextureSize(64, 32);
    this.tail1.mirror = true;
    setRotation(this.tail1, -0.4014257F, 0.0F, 0.0F);
    this.fanl1 = new ModelRenderer(this, 130, 10);
    this.fanl1.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl1.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl1.setTextureSize(64, 32);
    this.fanl1.mirror = true;
    setRotation(this.fanl1, 0.0F, 0.0F, 0.2617994F);
    this.fanr1 = new ModelRenderer(this, 130, 10);
    this.fanr1.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr1.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr1.setTextureSize(64, 32);
    this.fanr1.mirror = true;
    setRotation(this.fanr1, 0.0F, 0.0F, -0.2617994F);
    this.fanl2 = new ModelRenderer(this, 130, 10);
    this.fanl2.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl2.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl2.setTextureSize(64, 32);
    this.fanl2.mirror = true;
    setRotation(this.fanl2, 0.0F, 0.0F, 0.5235988F);
    this.fanr2 = new ModelRenderer(this, 130, 10);
    this.fanr2.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr2.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr2.setTextureSize(64, 32);
    this.fanr2.mirror = true;
    setRotation(this.fanr2, 0.0F, 0.0F, -0.5235988F);
    this.fanl3 = new ModelRenderer(this, 130, 10);
    this.fanl3.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl3.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl3.setTextureSize(64, 32);
    this.fanl3.mirror = true;
    setRotation(this.fanl3, 0.0F, 0.0F, 0.7853982F);
    this.fanr3 = new ModelRenderer(this, 130, 10);
    this.fanr3.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr3.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr3.setTextureSize(64, 32);
    this.fanr3.mirror = true;
    setRotation(this.fanr3, 0.0F, 0.0F, -0.7853982F);
    this.fanl4 = new ModelRenderer(this, 130, 10);
    this.fanl4.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl4.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl4.setTextureSize(64, 32);
    this.fanl4.mirror = true;
    setRotation(this.fanl4, 0.0F, 0.0F, 1.047198F);
    this.fanr4 = new ModelRenderer(this, 130, 10);
    this.fanr4.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr4.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr4.setTextureSize(64, 32);
    this.fanr4.mirror = true;
    setRotation(this.fanr4, 0.0F, 0.0F, -1.047198F);
    this.fanl5 = new ModelRenderer(this, 130, 10);
    this.fanl5.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl5.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl5.setTextureSize(64, 32);
    this.fanl5.mirror = true;
    setRotation(this.fanl5, 0.0F, 0.0F, 1.308997F);
    this.fanr5 = new ModelRenderer(this, 130, 10);
    this.fanr5.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr5.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr5.setTextureSize(64, 32);
    this.fanr5.mirror = true;
    setRotation(this.fanr5, 0.0F, 0.0F, -1.308997F);
    this.fanl6 = new ModelRenderer(this, 130, 10);
    this.fanl6.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl6.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl6.setTextureSize(64, 32);
    this.fanl6.mirror = true;
    setRotation(this.fanl6, 0.0F, 0.0F, 1.570796F);
    this.fanr6 = new ModelRenderer(this, 130, 10);
    this.fanr6.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr6.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr6.setTextureSize(64, 32);
    this.fanr6.mirror = true;
    setRotation(this.fanr6, 0.0F, 0.0F, -1.570796F);
    this.spike4 = new ModelRenderer(this, 178, 66);
    this.spike4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
    this.spike4.setRotationPoint(0.0F, 16.0F, 41.0F);
    this.spike4.setTextureSize(64, 32);
    this.spike4.mirror = true;
    setRotation(this.spike4, -0.0523599F, 0.5235988F, 0.0F);
    this.spike5 = new ModelRenderer(this, 178, 66);
    this.spike5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
    this.spike5.setRotationPoint(0.0F, 16.0F, 41.0F);
    this.spike5.setTextureSize(64, 32);
    this.spike5.mirror = true;
    setRotation(this.spike5, -0.0523599F, -0.5759587F, 0.0F);
    this.spike3 = new ModelRenderer(this, 178, 66);
    this.spike3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
    this.spike3.setRotationPoint(0.0F, 13.5F, 30.5F);
    this.spike3.setTextureSize(64, 32);
    this.spike3.mirror = true;
    setRotation(this.spike3, 0.3141593F, 0.0F, 0.0F);
    this.fanl7 = new ModelRenderer(this, 130, 10);
    this.fanl7.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanl7.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanl7.setTextureSize(64, 32);
    this.fanl7.mirror = true;
    setRotation(this.fanl7, 0.0F, 0.0F, 1.832596F);
    this.fanr7 = new ModelRenderer(this, 130, 10);
    this.fanr7.addBox(-3.0F, -24.0F, 0.0F, 6, 24, 1);
    this.fanr7.setRotationPoint(0.0F, -7.0F, -10.0F);
    this.fanr7.setTextureSize(64, 32);
    this.fanr7.mirror = true;
    setRotation(this.fanr7, 0.0F, 0.0F, -1.832596F);
    this.head = new ModelRenderer(this, 200, 0);
    this.head.addBox(-3.0F, -4.0F, -7.0F, 6, 7, 8);
    this.head.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 200, 18);
    this.head1.addBox(-2.5F, -2.0F, -15.0F, 5, 2, 8);
    this.head1.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.head1.setTextureSize(64, 32);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.jaw1 = new ModelRenderer(this, 200, 43);
    this.jaw1.addBox(-2.0F, -1.0F, -7.0F, 4, 2, 8);
    this.jaw1.setRotationPoint(0.0F, -2.0F, -19.0F);
    this.jaw1.setTextureSize(64, 32);
    this.jaw1.mirror = true;
    setRotation(this.jaw1, 0.0F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 200, 31);
    this.head2.addBox(-2.0F, -2.0F, -22.0F, 4, 2, 7);
    this.head2.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.head2.setTextureSize(64, 32);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.jaw2 = new ModelRenderer(this, 200, 56);
    this.jaw2.addBox(-1.5F, -1.0F, -13.0F, 3, 2, 6);
    this.jaw2.setRotationPoint(0.0F, -2.0F, -19.0F);
    this.jaw2.setTextureSize(64, 32);
    this.jaw2.mirror = true;
    setRotation(this.jaw2, 0.0F, 0.0F, 0.0F);
    this.fang1 = new ModelRenderer(this, 42, 0);
    this.fang1.addBox(1.0F, 0.0F, -20.0F, 1, 5, 1);
    this.fang1.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.fang1.setTextureSize(64, 32);
    this.fang1.mirror = true;
    setRotation(this.fang1, 0.0F, 0.0F, 0.0F);
    this.fang2 = new ModelRenderer(this, 50, 0);
    this.fang2.addBox(-2.0F, 0.0F, -20.0F, 1, 5, 1);
    this.fang2.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.fang2.setTextureSize(64, 32);
    this.fang2.mirror = true;
    setRotation(this.fang2, 0.0F, 0.0F, 0.0F);
    this.fang3 = new ModelRenderer(this, 60, 0);
    this.fang3.addBox(1.0F, 0.0F, -14.0F, 1, 3, 1);
    this.fang3.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.fang3.setTextureSize(64, 32);
    this.fang3.mirror = true;
    setRotation(this.fang3, 0.0F, 0.0F, 0.0F);
    this.fang4 = new ModelRenderer(this, 69, 0);
    this.fang4.addBox(-2.0F, 0.0F, -14.0F, 1, 3, 1);
    this.fang4.setRotationPoint(0.0F, -3.0F, -11.0F);
    this.fang4.setTextureSize(64, 32);
    this.fang4.mirror = true;
    setRotation(this.fang4, 0.0F, 0.0F, 0.0F);
    this.spike2 = new ModelRenderer(this, 178, 66);
    this.spike2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11);
    this.spike2.setRotationPoint(0.0F, 9.5F, 20.5F);
    this.spike2.setTextureSize(64, 32);
    this.spike2.mirror = true;
    setRotation(this.spike2, 0.3141593F, 0.0F, 0.0F);
    this.spike1 = new ModelRenderer(this, 178, 66);
    this.spike1.addBox(-0.5F, -1.5F, 0.0F, 1, 1, 11);
    this.spike1.setRotationPoint(0.0F, 6.5F, 10.5F);
    this.spike1.setTextureSize(64, 32);
    this.spike1.mirror = true;
    setRotation(this.spike1, 0.3141593F, 0.0F, 0.0F);
    this.arml1 = new ModelRenderer(this, 50, 98);
    this.arml1.addBox(0.0F, 0.0F, -2.0F, 11, 3, 4);
    this.arml1.setRotationPoint(2.0F, -1.0F, -6.0F);
    this.arml1.setTextureSize(64, 32);
    this.arml1.mirror = true;
    setRotation(this.arml1, 0.0F, -0.5235988F, 0.1745329F);
    this.armr1 = new ModelRenderer(this, 49, 88);
    this.armr1.addBox(0.0F, 0.0F, -2.0F, 11, 3, 4);
    this.armr1.setRotationPoint(-3.0F, -1.0F, -6.0F);
    this.armr1.setTextureSize(64, 32);
    this.armr1.mirror = true;
    setRotation(this.armr1, 0.0F, -2.617994F, -0.1745329F);
    this.arml2 = new ModelRenderer(this, 41, 107);
    this.arml2.addBox(0.0F, -1.0F, -1.0F, 15, 3, 3);
    this.arml2.setRotationPoint(11.0F, 2.0F, -1.0F);
    this.arml2.setTextureSize(64, 32);
    this.arml2.mirror = true;
    setRotation(this.arml2, 0.0F, 0.8552113F, 0.0F);
    this.armr2 = new ModelRenderer(this, 42, 115);
    this.armr2.addBox(0.0F, -1.0F, -2.0F, 15, 3, 3);
    this.armr2.setRotationPoint(-11.0F, 2.0F, -1.0F);
    this.armr2.setTextureSize(64, 32);
    this.armr2.mirror = true;
    setRotation(this.armr2, 0.0F, 2.268928F, 0.0F);
    this.clawr1 = new ModelRenderer(this, 100, 85);
    this.clawr1.addBox(-0.5F, -1.0F, -6.0F, 1, 1, 6);
    this.clawr1.setRotationPoint(-21.0F, 2.0F, -12.0F);
    this.clawr1.setTextureSize(64, 32);
    this.clawr1.mirror = true;
    setRotation(this.clawr1, -0.1745329F, 0.4363323F, 0.0F);
    this.clawr2 = new ModelRenderer(this, 100, 94);
    this.clawr2.addBox(0.0F, 0.0F, -10.0F, 1, 1, 10);
    this.clawr2.setRotationPoint(-21.0F, 2.0F, -12.0F);
    this.clawr2.setTextureSize(64, 32);
    this.clawr2.mirror = true;
    setRotation(this.clawr2, 0.0F, 0.8726646F, 0.0F);
    this.clawr3 = new ModelRenderer(this, 100, 107);
    this.clawr3.addBox(0.0F, 1.0F, -6.0F, 1, 1, 6);
    this.clawr3.setRotationPoint(-21.0F, 2.0F, -12.0F);
    this.clawr3.setTextureSize(64, 32);
    this.clawr3.mirror = true;
    setRotation(this.clawr3, 0.1745329F, 0.4363323F, 0.0F);
    this.clawl2 = new ModelRenderer(this, 130, 94);
    this.clawl2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10);
    this.clawl2.setRotationPoint(21.0F, 2.0F, -12.0F);
    this.clawl2.setTextureSize(64, 32);
    this.clawl2.mirror = true;
    setRotation(this.clawl2, 0.0F, 2.268928F, 0.0F);
    this.clawl3 = new ModelRenderer(this, 130, 109);
    this.clawl3.addBox(0.0F, 1.0F, 0.0F, 1, 1, 6);
    this.clawl3.setRotationPoint(21.0F, 2.0F, -12.0F);
    this.clawl3.setTextureSize(64, 32);
    this.clawl3.mirror = true;
    setRotation(this.clawl3, -0.1745329F, 2.70526F, 0.0F);
    this.clawl1 = new ModelRenderer(this, 130, 83);
    this.clawl1.addBox(0.0F, -1.0F, 0.0F, 1, 1, 6);
    this.clawl1.setRotationPoint(21.0F, 2.0F, -12.0F);
    this.clawl1.setTextureSize(64, 32);
    this.clawl1.mirror = true;
    setRotation(this.clawl1, 0.1745329F, 2.70526F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Alien e = (Alien)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F, nextangle = 0.0F;
    newangle = MathHelper.cos(f2 * 4.0F * this.wingspeed) * 3.1415927F * 0.5F * f1;
    doLeftLeg(newangle);
    doRightLeg(-newangle);
    if (e.getAttacking() == 0) {
      this.fan.rotateAngleZ = 0.0F;
      this.fanl1.rotateAngleZ = 0.0F;
      this.fanl2.rotateAngleZ = 0.0F;
      this.fanl3.rotateAngleZ = 0.0F;
      this.fanl4.rotateAngleZ = 0.0F;
      this.fanl5.rotateAngleZ = 0.0F;
      this.fanl6.rotateAngleZ = 0.0F;
      this.fanl7.rotateAngleZ = 0.0F;
      this.fanr1.rotateAngleZ = 0.0F;
      this.fanr2.rotateAngleZ = 0.0F;
      this.fanr3.rotateAngleZ = 0.0F;
      this.fanr4.rotateAngleZ = 0.0F;
      this.fanr5.rotateAngleZ = 0.0F;
      this.fanr6.rotateAngleZ = 0.0F;
      this.fanr7.rotateAngleZ = 0.0F;
      this.fan.rotateAngleX = -1.85F;
      this.fanl1.rotateAngleX = -1.85F;
      this.fanl2.rotateAngleX = -1.85F;
      this.fanl3.rotateAngleX = -1.85F;
      this.fanl4.rotateAngleX = -1.85F;
      this.fanl5.rotateAngleX = -1.85F;
      this.fanl6.rotateAngleX = -1.85F;
      this.fanl7.rotateAngleX = -1.85F;
      this.fanr1.rotateAngleX = -1.85F;
      this.fanr2.rotateAngleX = -1.85F;
      this.fanr3.rotateAngleX = -1.85F;
      this.fanr4.rotateAngleX = -1.85F;
      this.fanr5.rotateAngleX = -1.85F;
      this.fanr6.rotateAngleX = -1.85F;
      this.fanr7.rotateAngleX = -1.85F;
    } else {
      float pi6 = 0.5235988F;
      float fanspeed = 1.22F;
      float fanamp = 0.1F;
      this.fan.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed) * 3.1415927F * fanamp;
      this.fanl1.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 1.0F * pi6) * 3.1415927F * fanamp;
      this.fanl2.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 2.0F * pi6) * 3.1415927F * fanamp;
      this.fanl3.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 3.0F * pi6) * 3.1415927F * fanamp;
      this.fanl4.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 4.0F * pi6) * 3.1415927F * fanamp;
      this.fanl5.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 5.0F * pi6) * 3.1415927F * fanamp;
      this.fanl6.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 6.0F * pi6) * 3.1415927F * fanamp;
      this.fanl7.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 7.0F * pi6) * 3.1415927F * fanamp;
      this.fanr1.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 1.0F * pi6) * 3.1415927F * fanamp;
      this.fanr2.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 2.0F * pi6) * 3.1415927F * fanamp;
      this.fanr3.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 3.0F * pi6) * 3.1415927F * fanamp;
      this.fanr4.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 4.0F * pi6) * 3.1415927F * fanamp;
      this.fanr5.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 5.0F * pi6) * 3.1415927F * fanamp;
      this.fanr6.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 6.0F * pi6) * 3.1415927F * fanamp;
      this.fanr7.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 7.0F * pi6) * 3.1415927F * fanamp;
      this.fan.rotateAngleZ = 0.0F;
      this.fanl1.rotateAngleZ = 0.261F;
      this.fanl2.rotateAngleZ = 0.523F;
      this.fanl3.rotateAngleZ = 0.785F;
      this.fanl4.rotateAngleZ = 1.047F;
      this.fanl5.rotateAngleZ = 1.309F;
      this.fanl6.rotateAngleZ = 1.571F;
      this.fanl7.rotateAngleZ = 1.832F;
      this.fanr1.rotateAngleZ = -0.261F;
      this.fanr2.rotateAngleZ = -0.523F;
      this.fanr3.rotateAngleZ = -0.785F;
      this.fanr4.rotateAngleZ = -1.047F;
      this.fanr5.rotateAngleZ = -1.309F;
      this.fanr6.rotateAngleZ = -1.571F;
      this.fanr7.rotateAngleZ = -1.832F;
    } 
    this.neck.rotateAngleY = (float)Math.toRadians(f3) * 0.35F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.75F;
    this.neck.rotationPointZ -= (float)Math.cos(this.neck.rotateAngleY) * 3.0F;
    this.neck.rotationPointX += (float)Math.sin(this.neck.rotateAngleY) * 3.0F;
    this.head1.rotateAngleY = this.head.rotateAngleY;
    this.head1.rotationPointZ = this.head.rotationPointZ;
    this.head1.rotationPointX = this.head.rotationPointX;
    this.head2.rotateAngleY = this.head.rotateAngleY;
    this.head2.rotationPointZ = this.head.rotationPointZ;
    this.head2.rotationPointX = this.head.rotationPointX;
    this.fang1.rotateAngleY = this.head.rotateAngleY;
    this.fang1.rotationPointZ = this.head.rotationPointZ;
    this.fang1.rotationPointX = this.head.rotationPointX;
    this.fang2.rotateAngleY = this.head.rotateAngleY;
    this.fang2.rotationPointZ = this.head.rotationPointZ;
    this.fang2.rotationPointX = this.head.rotationPointX;
    this.fang3.rotateAngleY = this.head.rotateAngleY;
    this.fang3.rotationPointZ = this.head.rotationPointZ;
    this.fang3.rotationPointX = this.head.rotationPointX;
    this.fang4.rotateAngleY = this.head.rotateAngleY;
    this.fang4.rotationPointZ = this.head.rotationPointZ;
    this.fang4.rotationPointX = this.head.rotationPointX;
    this.jaw1.rotateAngleY = this.head.rotateAngleY;
    this.head.rotationPointZ -= (float)Math.cos(this.head.rotateAngleY) * 8.0F;
    this.head.rotationPointX -= (float)Math.sin(this.head.rotateAngleY) * 8.0F;
    this.jaw2.rotateAngleY = this.jaw1.rotateAngleY;
    this.jaw2.rotationPointZ = this.jaw1.rotationPointZ;
    this.jaw2.rotationPointX = this.jaw1.rotationPointX;
    r = e.getRenderInfo();
    newangle = MathHelper.cos(f2 * 3.5F * this.wingspeed) * 3.1415927F * 0.5F;
    nextangle = MathHelper.cos((f2 + 0.2F) * 3.5F * this.wingspeed) * 3.1415927F * 0.5F;
    if (nextangle > 0.0F && newangle < 0.0F)
      if (e.getAttacking() == 0) {
        r.ri1 = e.worldObj.rand.nextInt(15);
        r.ri2 = e.worldObj.rand.nextInt(15);
        r.ri3 = e.worldObj.rand.nextInt(15);
      } else {
        r.ri1 = e.worldObj.rand.nextInt(4);
        r.ri2 = e.worldObj.rand.nextInt(2);
        r.ri3 = 1;
      }  
    if (r.ri2 == 1) {
      doTail(newangle);
    } else {
      newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.05F;
      doTail(newangle);
    } 
    if (r.ri3 == 1) {
      newangle = MathHelper.cos(f2 * 3.5F * this.wingspeed) * 3.1415927F * 0.35F;
      doJaw(newangle);
    } else {
      newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.02F;
      doJaw(newangle);
    } 
    newangle = MathHelper.cos(f2 * this.wingspeed * 3.5F) * 3.1415927F * 0.2F;
    if (r.ri1 == 1 || r.ri1 == 3) {
      doLeftClaw(newangle);
    } else {
      newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.03F;
      doLeftClaw(newangle);
    } 
    if (r.ri1 == 2 || r.ri1 == 3) {
      doRightClaw(-newangle);
    } else {
      newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.03F;
      doRightClaw(-newangle);
    } 
    e.setRenderInfo(r);
    this.torso.render(f5);
    this.stomach.render(f5);
    this.rThigh.render(f5);
    this.lThigh.render(f5);
    this.lShin.render(f5);
    this.rShin.render(f5);
    this.lShin1.render(f5);
    this.rShin1.render(f5);
    this.lFoot.render(f5);
    this.rFoot.render(f5);
    this.neck.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
    this.tail5.render(f5);
    this.tail1.render(f5);
    this.spike4.render(f5);
    this.spike5.render(f5);
    this.spike3.render(f5);
    this.head.render(f5);
    this.head1.render(f5);
    this.jaw1.render(f5);
    this.head2.render(f5);
    this.jaw2.render(f5);
    this.fang1.render(f5);
    this.fang2.render(f5);
    this.fang3.render(f5);
    this.fang4.render(f5);
    this.spike2.render(f5);
    this.spike1.render(f5);
    this.arml1.render(f5);
    this.armr1.render(f5);
    this.arml2.render(f5);
    this.armr2.render(f5);
    this.clawr1.render(f5);
    this.clawr2.render(f5);
    this.clawr3.render(f5);
    this.clawl2.render(f5);
    this.clawl3.render(f5);
    this.clawl1.render(f5);
    this.fan.render(f5);
    this.fanl1.render(f5);
    this.fanr1.render(f5);
    this.fanl2.render(f5);
    this.fanr2.render(f5);
    this.fanl3.render(f5);
    this.fanr3.render(f5);
    this.fanl4.render(f5);
    this.fanr4.render(f5);
    this.fanl5.render(f5);
    this.fanr5.render(f5);
    this.fanl6.render(f5);
    this.fanr6.render(f5);
    this.fanl7.render(f5);
    this.fanr7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void doLeftLeg(float angle) {
    this.lFoot.rotateAngleX = angle;
    this.lShin.rotateAngleX = angle - 0.4F;
    this.lShin1.rotateAngleX = angle - 0.8F;
    this.lThigh.rotateAngleX = angle - 0.8F;
  }
  
  private void doRightLeg(float angle) {
    this.rFoot.rotateAngleX = angle;
    this.rShin.rotateAngleX = angle - 0.4F;
    this.rShin1.rotateAngleX = angle - 0.8F;
    this.rThigh.rotateAngleX = angle - 0.8F;
  }
  
  private void doJaw(float angle) {
    this.jaw1.rotateAngleX = Math.abs(angle);
    this.jaw2.rotateAngleX = this.jaw1.rotateAngleX;
  }
  
  private void doTail(float angle) {
    this.tail1.rotateAngleY = angle * 0.25F;
    this.spike1.rotateAngleY = this.tail1.rotateAngleY;
    this.tail2.rotateAngleY = angle * 0.5F;
    this.tail1.rotationPointZ += (float)Math.cos(this.tail1.rotateAngleY) * 10.0F;
    this.tail1.rotationPointX += (float)Math.sin(this.tail1.rotateAngleY) * 10.0F;
    this.spike2.rotateAngleY = this.tail2.rotateAngleY;
    this.spike2.rotationPointZ = this.tail2.rotationPointZ;
    this.spike2.rotationPointX = this.tail2.rotationPointX;
    this.tail3.rotateAngleY = angle * 0.8F;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 10.0F;
    this.tail2.rotationPointX += (float)Math.sin(this.tail2.rotateAngleY) * 10.0F;
    this.spike3.rotateAngleY = this.tail3.rotateAngleY;
    this.spike3.rotationPointZ = this.tail3.rotationPointZ;
    this.spike3.rotationPointX = this.tail3.rotationPointX;
    this.tail4.rotateAngleY = angle * 1.25F;
    this.tail3.rotationPointZ += (float)Math.cos(this.tail3.rotateAngleY) * 10.0F;
    this.tail3.rotationPointX += (float)Math.sin(this.tail3.rotateAngleY) * 10.0F;
    this.tail4.rotateAngleY += 0.52F;
    this.spike4.rotationPointZ = this.tail4.rotationPointZ;
    this.spike4.rotationPointX = this.tail4.rotationPointX;
    this.tail4.rotateAngleY -= 0.52F;
    this.spike5.rotationPointZ = this.tail4.rotationPointZ;
    this.spike5.rotationPointX = this.tail4.rotationPointX;
    this.tail5.rotateAngleY = angle * 1.5F;
    this.tail4.rotationPointZ += (float)Math.cos(this.tail4.rotateAngleY) * 10.0F;
    this.tail4.rotationPointX += (float)Math.sin(this.tail4.rotateAngleY) * 10.0F;
  }
  
  private void doLeftClaw(float angle) {
    this.arml1.rotateAngleY = -0.52F + Math.abs(angle * 2.0F);
    this.arml1.rotationPointZ -= (float)Math.sin(this.arml1.rotateAngleY) * 9.0F;
    this.arml1.rotationPointX += (float)Math.cos(this.arml1.rotateAngleY) * 9.0F;
    this.arml2.rotateAngleY = 0.855F + Math.abs(angle);
    this.arml2.rotationPointZ -= (float)Math.sin(this.arml2.rotateAngleY) * 14.0F;
    this.arml2.rotationPointX += (float)Math.cos(this.arml2.rotateAngleY) * 14.0F;
    this.clawl1.rotateAngleY = 2.7F + Math.abs(angle * 4.0F);
    this.clawl2.rotationPointZ = this.clawl1.rotationPointZ;
    this.clawl2.rotationPointX = this.clawl1.rotationPointX;
    this.clawl2.rotateAngleY = 2.27F + Math.abs(angle * 4.0F);
    this.clawl3.rotationPointZ = this.clawl1.rotationPointZ;
    this.clawl3.rotationPointX = this.clawl1.rotationPointX;
    this.clawl3.rotateAngleY = 2.7F + Math.abs(angle * 4.0F);
  }
  
  private void doRightClaw(float angle) {
    this.armr1.rotateAngleY = -2.61F - Math.abs(angle * 2.0F);
    this.armr1.rotationPointZ -= (float)Math.sin(this.armr1.rotateAngleY) * 9.0F;
    this.armr1.rotationPointX += (float)Math.cos(this.armr1.rotateAngleY) * 9.0F;
    this.armr2.rotateAngleY = 2.27F - Math.abs(angle);
    this.armr2.rotationPointZ -= (float)Math.sin(this.armr2.rotateAngleY) * 14.0F;
    this.armr2.rotationPointX += (float)Math.cos(this.armr2.rotateAngleY) * 14.0F;
    this.clawr1.rotateAngleY = 0.436F - Math.abs(angle * 4.0F);
    this.clawr2.rotationPointZ = this.clawr1.rotationPointZ;
    this.clawr2.rotationPointX = this.clawr1.rotationPointX;
    this.clawr2.rotateAngleY = 0.87F - Math.abs(angle * 4.0F);
    this.clawr3.rotationPointZ = this.clawr1.rotationPointZ;
    this.clawr3.rotationPointX = this.clawr1.rotationPointX;
    this.clawr3.rotateAngleY = 0.436F - Math.abs(angle * 4.0F);
  }
}
