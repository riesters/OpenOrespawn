package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelThePrinceTeen extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer leftleg1;
  
  ModelRenderer tail1;
  
  ModelRenderer leftleg2;
  
  ModelRenderer body2;
  
  ModelRenderer leftleg3;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer lclaw2;
  
  ModelRenderer lclaw4;
  
  ModelRenderer lclaw5;
  
  ModelRenderer lclaw6;
  
  ModelRenderer lclaw7;
  
  ModelRenderer tail4;
  
  ModelRenderer tail5;
  
  ModelRenderer neck1;
  
  ModelRenderer neck3;
  
  ModelRenderer head3;
  
  ModelRenderer jaw1;
  
  ModelRenderer jaw5;
  
  ModelRenderer head7;
  
  ModelRenderer rightleg1;
  
  ModelRenderer rightleg2;
  
  ModelRenderer rightleg3;
  
  ModelRenderer rclaw2;
  
  ModelRenderer rclaw4;
  
  ModelRenderer rclaw5;
  
  ModelRenderer rclaw7;
  
  ModelRenderer rclaw6;
  
  ModelRenderer wing1;
  
  ModelRenderer wing2;
  
  ModelRenderer mem1;
  
  ModelRenderer mem2;
  
  ModelRenderer lshoulder;
  
  ModelRenderer rshoulder;
  
  ModelRenderer rwing1;
  
  ModelRenderer rmem1;
  
  ModelRenderer rwing2;
  
  ModelRenderer rmem2;
  
  ModelRenderer neck4;
  
  ModelRenderer neck5;
  
  ModelRenderer wing3;
  
  ModelRenderer mem3;
  
  ModelRenderer rwing3;
  
  ModelRenderer rmem3;
  
  ModelRenderer wing4;
  
  ModelRenderer mem4;
  
  ModelRenderer rwing4;
  
  ModelRenderer rmem4;
  
  ModelRenderer Tailspike1;
  
  ModelRenderer Tailspike2;
  
  ModelRenderer Tailspike3;
  
  ModelRenderer headfin;
  
  ModelRenderer backfin1;
  
  ModelRenderer backfin2;
  
  ModelRenderer neck3L;
  
  ModelRenderer neck4L;
  
  ModelRenderer neck3R;
  
  ModelRenderer neck4R;
  
  ModelRenderer neck5L;
  
  ModelRenderer neck5R;
  
  ModelRenderer jaw5L;
  
  ModelRenderer jaw5R;
  
  ModelRenderer head7L;
  
  ModelRenderer headfinL;
  
  ModelRenderer headfinR;
  
  ModelRenderer head7R;
  
  ModelRenderer jaw1L;
  
  ModelRenderer jaw1R;
  
  ModelRenderer head3L;
  
  ModelRenderer head3R;
  
  public ModelThePrinceTeen(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.body = new ModelRenderer(this, 400, 26);
    this.body.addBox(-12.5F, -12.0F, -9.0F, 25, 12, 9);
    this.body.setRotationPoint(0.0F, 0.0F, 9.0F);
    this.body.setTextureSize(512, 256);
    this.body.mirror = true;
    setRotation(this.body, 0.0698132F, 0.0F, 0.0F);
    this.leftleg1 = new ModelRenderer(this, 300, 10);
    this.leftleg1.addBox(-1.0F, -1.0F, -3.0F, 5, 9, 9);
    this.leftleg1.setRotationPoint(14.0F, -8.0F, 13.0F);
    this.leftleg1.setTextureSize(512, 256);
    this.leftleg1.mirror = true;
    setRotation(this.leftleg1, -0.5759587F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 400, 82);
    this.tail1.addBox(-9.0F, -6.0F, 0.0F, 18, 10, 12);
    this.tail1.setRotationPoint(0.0F, -3.0F, 22.0F);
    this.tail1.setTextureSize(512, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, -0.1745329F, 0.0F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 300, 31);
    this.leftleg2.addBox(-1.0F, 6.0F, -7.0F, 4, 12, 5);
    this.leftleg2.setRotationPoint(14.0F, -8.0F, 13.0F);
    this.leftleg2.setTextureSize(512, 256);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, 0.9773844F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 400, 50);
    this.body2.addBox(0.0F, -3.0F, -3.0F, 26, 14, 16);
    this.body2.setRotationPoint(-13.0F, -9.0F, 10.0F);
    this.body2.setTextureSize(512, 256);
    this.body2.mirror = true;
    setRotation(this.body2, -0.1047198F, 0.0F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 300, 51);
    this.leftleg3.addBox(-1.0F, -1.0F, -2.0F, 3, 19, 4);
    this.leftleg3.setRotationPoint(14.0F, 7.0F, 22.0F);
    this.leftleg3.setTextureSize(512, 256);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, -0.5235988F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 400, 106);
    this.tail2.addBox(-5.0F, -4.0F, 0.0F, 10, 7, 10);
    this.tail2.setRotationPoint(0.0F, -2.0F, 33.0F);
    this.tail2.setTextureSize(512, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.1396263F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 400, 126);
    this.tail3.addBox(-3.0F, -2.0F, 0.0F, 6, 5, 10);
    this.tail3.setRotationPoint(0.0F, -2.0F, 42.0F);
    this.tail3.setTextureSize(512, 256);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.1396263F, 0.0F, 0.0F);
    this.lclaw2 = new ModelRenderer(this, 300, 76);
    this.lclaw2.addBox(-3.0F, 0.0F, -3.0F, 7, 3, 8);
    this.lclaw2.setRotationPoint(14.0F, 21.0F, 13.0F);
    this.lclaw2.setTextureSize(512, 256);
    this.lclaw2.mirror = true;
    setRotation(this.lclaw2, 0.0F, 0.0F, 0.0F);
    this.lclaw4 = new ModelRenderer(this, 310, 123);
    this.lclaw4.addBox(0.0F, 1.0F, -7.0F, 1, 2, 4);
    this.lclaw4.setRotationPoint(14.0F, 21.0F, 13.0F);
    this.lclaw4.setTextureSize(512, 256);
    this.lclaw4.mirror = true;
    setRotation(this.lclaw4, 0.0F, 0.0F, 0.0F);
    this.lclaw5 = new ModelRenderer(this, 297, 123);
    this.lclaw5.addBox(-2.5F, 1.0F, -7.0F, 1, 2, 4);
    this.lclaw5.setRotationPoint(14.0F, 21.0F, 13.0F);
    this.lclaw5.setTextureSize(512, 256);
    this.lclaw5.mirror = true;
    setRotation(this.lclaw5, 0.0F, 0.0F, 0.0F);
    this.lclaw6 = new ModelRenderer(this, 322, 123);
    this.lclaw6.addBox(2.5F, 1.0F, -7.0F, 1, 2, 4);
    this.lclaw6.setRotationPoint(14.0F, 21.0F, 13.0F);
    this.lclaw6.setTextureSize(512, 256);
    this.lclaw6.mirror = true;
    setRotation(this.lclaw6, 0.0F, 0.0F, 0.0F);
    this.lclaw7 = new ModelRenderer(this, 334, 123);
    this.lclaw7.addBox(0.0F, 1.0F, 5.0F, 1, 2, 3);
    this.lclaw7.setRotationPoint(14.0F, 21.0F, 13.0F);
    this.lclaw7.setTextureSize(512, 256);
    this.lclaw7.mirror = true;
    setRotation(this.lclaw7, 0.0F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 400, 143);
    this.tail4.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 10);
    this.tail4.setRotationPoint(0.0F, 0.0F, 51.0F);
    this.tail4.setTextureSize(512, 256);
    this.tail4.mirror = true;
    setRotation(this.tail4, -0.1396263F, 0.0F, 0.0F);
    this.tail5 = new ModelRenderer(this, 400, 159);
    this.tail5.addBox(-1.5F, -2.0F, 0.0F, 3, 3, 10);
    this.tail5.setRotationPoint(0.0F, 2.0F, 59.0F);
    this.tail5.setTextureSize(512, 256);
    this.tail5.mirror = true;
    setRotation(this.tail5, -0.1396263F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 400, 7);
    this.neck1.addBox(-12.0F, -4.0F, 0.0F, 24, 8, 8);
    this.neck1.setRotationPoint(0.0F, -7.0F, -5.0F);
    this.neck1.setTextureSize(512, 256);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.0872665F, 0.0F, 0.0F);
    this.neck3 = new ModelRenderer(this, 365, 5);
    this.neck3.addBox(-3.0F, -3.0F, -9.0F, 6, 6, 10);
    this.neck3.setRotationPoint(0.0F, -8.0F, -5.0F);
    this.neck3.setTextureSize(512, 256);
    this.neck3.mirror = true;
    setRotation(this.neck3, 0.0174533F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 143, 149);
    this.head3.addBox(-2.0F, -3.0F, -15.0F, 4, 4, 17);
    this.head3.setRotationPoint(0.0F, -6.0F, -34.0F);
    this.head3.setTextureSize(512, 256);
    this.head3.mirror = true;
    setRotation(this.head3, -0.2443461F, 0.0F, 0.0F);
    this.jaw1 = new ModelRenderer(this, 143, 173);
    this.jaw1.addBox(-1.5F, 1.0F, -14.0F, 3, 2, 12);
    this.jaw1.setRotationPoint(0.0F, -6.0F, -34.0F);
    this.jaw1.setTextureSize(512, 256);
    this.jaw1.mirror = true;
    setRotation(this.jaw1, 0.1919862F, 0.0F, 0.0F);
    this.jaw5 = new ModelRenderer(this, 144, 206);
    this.jaw5.addBox(-2.5F, 1.0F, -3.0F, 5, 2, 6);
    this.jaw5.setRotationPoint(0.0F, -6.0F, -34.0F);
    this.jaw5.setTextureSize(512, 256);
    this.jaw5.mirror = true;
    setRotation(this.jaw5, 0.1919862F, 0.0F, 0.0F);
    this.head7 = new ModelRenderer(this, 144, 192);
    this.head7.addBox(-3.0F, -4.0F, -3.0F, 6, 5, 7);
    this.head7.setRotationPoint(0.0F, -6.0F, -34.0F);
    this.head7.setTextureSize(512, 256);
    this.head7.mirror = true;
    setRotation(this.head7, -0.2443461F, 0.0F, 0.0F);
    this.rightleg1 = new ModelRenderer(this, 250, 10);
    this.rightleg1.addBox(-1.0F, -1.0F, -3.0F, 5, 9, 9);
    this.rightleg1.setRotationPoint(-17.0F, -8.0F, 13.0F);
    this.rightleg1.setTextureSize(512, 256);
    this.rightleg1.mirror = true;
    setRotation(this.rightleg1, -0.5934119F, 0.0F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 250, 32);
    this.rightleg2.addBox(0.0F, 6.0F, -7.0F, 4, 12, 5);
    this.rightleg2.setRotationPoint(-17.0F, -8.0F, 13.0F);
    this.rightleg2.setTextureSize(512, 256);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, 0.9773844F, 0.0F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 250, 52);
    this.rightleg3.addBox(1.0F, 1.0F, -2.0F, 3, 19, 4);
    this.rightleg3.setRotationPoint(-17.0F, 5.0F, 23.0F);
    this.rightleg3.setTextureSize(512, 256);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, -0.5235988F, 0.0F, 0.0F);
    this.rclaw2 = new ModelRenderer(this, 250, 76);
    this.rclaw2.addBox(-1.0F, 0.0F, -3.0F, 7, 3, 8);
    this.rclaw2.setRotationPoint(-17.0F, 21.0F, 13.0F);
    this.rclaw2.setTextureSize(512, 256);
    this.rclaw2.mirror = true;
    setRotation(this.rclaw2, 0.0F, 0.0F, 0.0F);
    this.rclaw4 = new ModelRenderer(this, 247, 123);
    this.rclaw4.addBox(2.0F, 1.0F, -7.0F, 1, 2, 4);
    this.rclaw4.setRotationPoint(-17.0F, 21.0F, 13.0F);
    this.rclaw4.setTextureSize(512, 256);
    this.rclaw4.mirror = true;
    setRotation(this.rclaw4, 0.0F, 0.0F, 0.0F);
    this.rclaw5 = new ModelRenderer(this, 258, 123);
    this.rclaw5.addBox(-0.5F, 1.0F, -7.0F, 1, 2, 4);
    this.rclaw5.setRotationPoint(-17.0F, 21.0F, 13.0F);
    this.rclaw5.setTextureSize(512, 256);
    this.rclaw5.mirror = true;
    setRotation(this.rclaw5, 0.0F, 0.0F, 0.0F);
    this.rclaw7 = new ModelRenderer(this, 283, 123);
    this.rclaw7.addBox(2.0F, 1.0F, 5.0F, 1, 2, 3);
    this.rclaw7.setRotationPoint(-17.0F, 21.0F, 13.0F);
    this.rclaw7.setTextureSize(512, 256);
    this.rclaw7.mirror = true;
    setRotation(this.rclaw7, 0.0F, 0.0F, 0.0F);
    this.rclaw6 = new ModelRenderer(this, 270, 123);
    this.rclaw6.addBox(4.5F, 1.0F, -7.0F, 1, 2, 4);
    this.rclaw6.setRotationPoint(-17.0F, 21.0F, 13.0F);
    this.rclaw6.setTextureSize(512, 256);
    this.rclaw6.mirror = true;
    setRotation(this.rclaw6, 0.0F, 0.0F, 0.0F);
    this.wing1 = new ModelRenderer(this, 10, 30);
    this.wing1.addBox(-1.0F, -1.0F, -1.0F, 23, 2, 2);
    this.wing1.setRotationPoint(13.0F, -12.0F, 3.0F);
    this.wing1.setTextureSize(512, 256);
    this.wing1.mirror = true;
    setRotation(this.wing1, 0.0F, 0.0872665F, 0.0F);
    this.wing2 = new ModelRenderer(this, 10, 40);
    this.wing2.addBox(-1.0F, -1.0F, -1.0F, 44, 2, 2);
    this.wing2.setRotationPoint(34.0F, -12.0F, 1.0F);
    this.wing2.setTextureSize(512, 256);
    this.wing2.mirror = true;
    setRotation(this.wing2, 0.0F, 0.0F, 0.0F);
    this.mem1 = new ModelRenderer(this, 10, 60);
    this.mem1.addBox(-2.0F, 0.0F, 0.0F, 24, 1, 21);
    this.mem1.setRotationPoint(13.0F, -12.0F, 3.0F);
    this.mem1.setTextureSize(512, 256);
    this.mem1.mirror = true;
    setRotation(this.mem1, 0.0F, 0.0872665F, 0.0F);
    this.mem2 = new ModelRenderer(this, 10, 85);
    this.mem2.addBox(0.0F, 0.0F, 0.0F, 43, 1, 21);
    this.mem2.setRotationPoint(34.0F, -12.0F, 1.0F);
    this.mem2.setTextureSize(512, 256);
    this.mem2.mirror = true;
    setRotation(this.mem2, 0.0F, 0.0F, 0.0F);
    this.lshoulder = new ModelRenderer(this, 370, 78);
    this.lshoulder.addBox(0.0F, 0.0F, 0.0F, 5, 2, 8);
    this.lshoulder.setRotationPoint(8.0F, -13.0F, 1.0F);
    this.lshoulder.setTextureSize(512, 256);
    this.lshoulder.mirror = true;
    setRotation(this.lshoulder, 0.0698132F, 0.0F, 0.0F);
    this.rshoulder = new ModelRenderer(this, 370, 66);
    this.rshoulder.addBox(0.0F, 0.0F, 0.0F, 5, 2, 8);
    this.rshoulder.setRotationPoint(-13.0F, -13.0F, 1.0F);
    this.rshoulder.setTextureSize(512, 256);
    this.rshoulder.mirror = true;
    setRotation(this.rshoulder, 0.0698132F, 0.0F, 0.0F);
    this.rwing1 = new ModelRenderer(this, 10, 140);
    this.rwing1.addBox(-22.0F, -1.0F, -1.0F, 23, 2, 2);
    this.rwing1.setRotationPoint(-13.0F, -12.0F, 3.0F);
    this.rwing1.setTextureSize(512, 256);
    this.rwing1.mirror = true;
    setRotation(this.rwing1, 0.0F, -0.0872665F, 0.0F);
    this.rmem1 = new ModelRenderer(this, 10, 170);
    this.rmem1.addBox(-22.0F, 0.0F, 0.0F, 24, 1, 21);
    this.rmem1.setRotationPoint(-13.0F, -12.0F, 3.0F);
    this.rmem1.setTextureSize(512, 256);
    this.rmem1.mirror = true;
    setRotation(this.rmem1, 0.0F, -0.0872665F, 0.0F);
    this.rwing2 = new ModelRenderer(this, 10, 150);
    this.rwing2.addBox(-43.0F, -1.0F, -1.0F, 44, 2, 2);
    this.rwing2.setRotationPoint(-34.0F, -12.0F, 1.0F);
    this.rwing2.setTextureSize(512, 256);
    this.rwing2.mirror = true;
    setRotation(this.rwing2, 0.0F, 0.0F, 0.0F);
    this.rmem2 = new ModelRenderer(this, 10, 195);
    this.rmem2.addBox(-43.0F, 0.0F, 0.0F, 43, 1, 21);
    this.rmem2.setRotationPoint(-34.0F, -12.0F, 1.0F);
    this.rmem2.setTextureSize(512, 256);
    this.rmem2.mirror = true;
    setRotation(this.rmem2, 0.0F, 0.0F, 0.0F);
    this.neck4 = new ModelRenderer(this, 366, 23);
    this.neck4.addBox(-2.5F, -2.5F, -9.0F, 5, 5, 10);
    this.neck4.setRotationPoint(0.0F, -8.0F, -14.0F);
    this.neck4.setTextureSize(512, 256);
    this.neck4.mirror = true;
    setRotation(this.neck4, 0.1396263F, 0.0F, 0.0F);
    this.neck5 = new ModelRenderer(this, 369, 41);
    this.neck5.addBox(-2.0F, -2.0F, -9.0F, 4, 4, 10);
    this.neck5.setRotationPoint(0.0F, -7.0F, -22.0F);
    this.neck5.setTextureSize(512, 256);
    this.neck5.mirror = true;
    setRotation(this.neck5, 0.1396263F, 0.0F, 0.0F);
    this.wing3 = new ModelRenderer(this, 10, 46);
    this.wing3.addBox(0.0F, 0.0F, 0.0F, 44, 2, 2);
    this.wing3.setRotationPoint(13.0F, -13.0F, 3.0F);
    this.wing3.setTextureSize(512, 256);
    this.wing3.mirror = true;
    setRotation(this.wing3, 0.0F, 0.0F, -0.3490659F);
    this.mem3 = new ModelRenderer(this, 10, 110);
    this.mem3.addBox(0.0F, 0.0F, 0.0F, 43, 1, 21);
    this.mem3.setRotationPoint(13.0F, -12.5F, 5.0F);
    this.mem3.setTextureSize(512, 256);
    this.mem3.mirror = true;
    setRotation(this.mem3, 0.0F, 0.0F, -0.3490659F);
    this.rwing3 = new ModelRenderer(this, 10, 156);
    this.rwing3.addBox(-43.0F, 0.0F, 0.0F, 44, 2, 2);
    this.rwing3.setRotationPoint(-13.0F, -13.0F, 3.0F);
    this.rwing3.setTextureSize(512, 256);
    this.rwing3.mirror = true;
    setRotation(this.rwing3, 0.0F, 0.0F, 0.3490659F);
    this.rmem3 = new ModelRenderer(this, 10, 221);
    this.rmem3.addBox(-42.0F, 0.0F, 0.0F, 43, 1, 21);
    this.rmem3.setRotationPoint(-13.0F, -12.5F, 5.0F);
    this.rmem3.setTextureSize(512, 256);
    this.rmem3.mirror = true;
    setRotation(this.rmem3, 0.0F, 0.0F, 0.3490659F);
    this.wing4 = new ModelRenderer(this, 10, 46);
    this.wing4.addBox(0.0F, 0.0F, 0.0F, 44, 2, 2);
    this.wing4.setRotationPoint(13.0F, -12.0F, 3.0F);
    this.wing4.setTextureSize(512, 256);
    this.wing4.mirror = true;
    setRotation(this.wing4, 0.0F, 0.0F, 0.3490659F);
    this.mem4 = new ModelRenderer(this, 10, 110);
    this.mem4.addBox(0.0F, 0.0F, 0.0F, 43, 1, 21);
    this.mem4.setRotationPoint(13.0F, -11.5F, 5.0F);
    this.mem4.setTextureSize(512, 256);
    this.mem4.mirror = true;
    setRotation(this.mem4, 0.0F, 0.0F, 0.3490659F);
    this.rwing4 = new ModelRenderer(this, 10, 156);
    this.rwing4.addBox(-43.0F, 0.0F, 0.0F, 44, 2, 2);
    this.rwing4.setRotationPoint(-13.0F, -12.0F, 3.0F);
    this.rwing4.setTextureSize(512, 256);
    this.rwing4.mirror = true;
    setRotation(this.rwing4, 0.0F, 0.0F, -0.3490659F);
    this.rmem4 = new ModelRenderer(this, 10, 221);
    this.rmem4.addBox(-42.0F, 0.0F, 0.0F, 43, 1, 21);
    this.rmem4.setRotationPoint(-13.0F, -11.5F, 5.0F);
    this.rmem4.setTextureSize(512, 256);
    this.rmem4.mirror = true;
    setRotation(this.rmem4, 0.0F, 0.0F, -0.3490659F);
    this.Tailspike1 = new ModelRenderer(this, 150, 0);
    this.Tailspike1.addBox(-7.0F, 0.0F, 0.0F, 14, 2, 6);
    this.Tailspike1.setRotationPoint(0.0F, 2.0F, 69.0F);
    this.Tailspike1.setTextureSize(512, 256);
    this.Tailspike1.mirror = true;
    setRotation(this.Tailspike1, 0.0F, 0.0F, 0.0F);
    this.Tailspike2 = new ModelRenderer(this, 150, 11);
    this.Tailspike2.addBox(-5.0F, 0.0F, 0.0F, 10, 2, 6);
    this.Tailspike2.setRotationPoint(0.0F, 2.0F, 75.0F);
    this.Tailspike2.setTextureSize(512, 256);
    this.Tailspike2.mirror = true;
    setRotation(this.Tailspike2, 0.0F, 0.0F, 0.0F);
    this.Tailspike3 = new ModelRenderer(this, 150, 23);
    this.Tailspike3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 15);
    this.Tailspike3.setRotationPoint(0.0F, 2.0F, 80.0F);
    this.Tailspike3.setTextureSize(512, 256);
    this.Tailspike3.mirror = true;
    setRotation(this.Tailspike3, 0.0F, 0.0F, 0.0F);
    this.headfin = new ModelRenderer(this, 150, 216);
    this.headfin.addBox(-0.5F, -3.0F, 3.0F, 1, 4, 4);
    this.headfin.setRotationPoint(0.0F, -6.0F, -34.0F);
    this.headfin.setTextureSize(512, 256);
    this.headfin.mirror = true;
    setRotation(this.headfin, 0.0872665F, 0.0F, 0.0F);
    this.backfin1 = new ModelRenderer(this, 69, 0);
    this.backfin1.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 6);
    this.backfin1.setRotationPoint(0.0F, -11.0F, 0.0F);
    this.backfin1.setTextureSize(512, 256);
    this.backfin1.mirror = true;
    setRotation(this.backfin1, 0.7853982F, 0.0F, 0.0F);
    this.backfin2 = new ModelRenderer(this, 85, 0);
    this.backfin2.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 4);
    this.backfin2.setRotationPoint(0.0F, -11.0F, 10.0F);
    this.backfin2.setTextureSize(512, 256);
    this.backfin2.mirror = true;
    setRotation(this.backfin2, 0.7853982F, 0.0F, 0.0F);
    this.neck3L = new ModelRenderer(this, 365, 100);
    this.neck3L.addBox(-3.0F, -3.0F, -9.0F, 6, 6, 10);
    this.neck3L.setRotationPoint(8.0F, -8.0F, -5.0F);
    this.neck3L.setTextureSize(512, 256);
    this.neck3L.mirror = true;
    setRotation(this.neck3L, 0.0174533F, 0.0F, 0.0F);
    this.neck4L = new ModelRenderer(this, 366, 119);
    this.neck4L.addBox(-2.5F, -2.5F, -9.0F, 5, 5, 10);
    this.neck4L.setRotationPoint(8.0F, -8.0F, -14.0F);
    this.neck4L.setTextureSize(512, 256);
    this.neck4L.mirror = true;
    setRotation(this.neck4L, 0.1396263F, 0.0F, 0.0F);
    this.neck3R = new ModelRenderer(this, 365, 175);
    this.neck3R.addBox(-3.0F, -3.0F, -9.0F, 6, 6, 10);
    this.neck3R.setRotationPoint(-8.0F, -8.0F, -5.0F);
    this.neck3R.setTextureSize(512, 256);
    this.neck3R.mirror = true;
    setRotation(this.neck3R, 0.0174533F, 0.0F, 0.0F);
    this.neck4R = new ModelRenderer(this, 366, 194);
    this.neck4R.addBox(-2.5F, -2.5F, -9.0F, 5, 5, 10);
    this.neck4R.setRotationPoint(-8.0F, -8.0F, -14.0F);
    this.neck4R.setTextureSize(512, 256);
    this.neck4R.mirror = true;
    setRotation(this.neck4R, 0.1396263F, 0.0F, 0.0F);
    this.neck5L = new ModelRenderer(this, 369, 137);
    this.neck5L.addBox(-2.0F, -2.0F, -9.0F, 4, 4, 10);
    this.neck5L.setRotationPoint(8.0F, -7.0F, -23.0F);
    this.neck5L.setTextureSize(512, 256);
    this.neck5L.mirror = true;
    setRotation(this.neck5L, 0.1396263F, 0.0F, 0.0F);
    this.neck5R = new ModelRenderer(this, 369, 212);
    this.neck5R.addBox(-2.0F, -2.0F, -9.0F, 4, 4, 10);
    this.neck5R.setRotationPoint(-8.0F, -7.0F, -23.0F);
    this.neck5R.setTextureSize(512, 256);
    this.neck5R.mirror = true;
    setRotation(this.neck5R, 0.1396263F, 0.0F, 0.0F);
    this.jaw5L = new ModelRenderer(this, 200, 206);
    this.jaw5L.addBox(-2.5F, 1.0F, -3.0F, 5, 2, 6);
    this.jaw5L.setRotationPoint(8.0F, -6.0F, -34.0F);
    this.jaw5L.setTextureSize(512, 256);
    this.jaw5L.mirror = true;
    setRotation(this.jaw5L, 0.1919862F, 0.0F, 0.0F);
    this.jaw5R = new ModelRenderer(this, 250, 206);
    this.jaw5R.addBox(-2.5F, 1.0F, -3.0F, 5, 2, 6);
    this.jaw5R.setRotationPoint(-8.0F, -6.0F, -34.0F);
    this.jaw5R.setTextureSize(512, 256);
    this.jaw5R.mirror = true;
    setRotation(this.jaw5R, 0.1919862F, 0.0F, 0.0F);
    this.head7L = new ModelRenderer(this, 200, 192);
    this.head7L.addBox(-3.0F, -4.0F, -3.0F, 6, 5, 7);
    this.head7L.setRotationPoint(8.0F, -6.0F, -34.0F);
    this.head7L.setTextureSize(512, 256);
    this.head7L.mirror = true;
    setRotation(this.head7L, -0.2443461F, 0.0F, 0.0F);
    this.headfinL = new ModelRenderer(this, 200, 216);
    this.headfinL.addBox(-0.5F, -3.0F, 3.0F, 1, 4, 4);
    this.headfinL.setRotationPoint(8.0F, -6.0F, -34.0F);
    this.headfinL.setTextureSize(512, 256);
    this.headfinL.mirror = true;
    setRotation(this.headfinL, 0.0872665F, 0.0F, 0.0F);
    this.headfinR = new ModelRenderer(this, 250, 216);
    this.headfinR.addBox(-0.5F, -3.0F, 3.0F, 1, 4, 4);
    this.headfinR.setRotationPoint(-8.0F, -6.0F, -34.0F);
    this.headfinR.setTextureSize(512, 256);
    this.headfinR.mirror = true;
    setRotation(this.headfinR, 0.0872665F, 0.0F, 0.0F);
    this.head7R = new ModelRenderer(this, 250, 192);
    this.head7R.addBox(-3.0F, -4.0F, -3.0F, 6, 5, 7);
    this.head7R.setRotationPoint(-8.0F, -6.0F, -34.0F);
    this.head7R.setTextureSize(512, 256);
    this.head7R.mirror = true;
    setRotation(this.head7R, -0.2443461F, 0.0F, 0.0F);
    this.jaw1L = new ModelRenderer(this, 200, 173);
    this.jaw1L.addBox(-1.5F, 1.0F, -14.0F, 3, 2, 12);
    this.jaw1L.setRotationPoint(8.0F, -6.0F, -34.0F);
    this.jaw1L.setTextureSize(512, 256);
    this.jaw1L.mirror = true;
    setRotation(this.jaw1L, 0.1919862F, 0.0F, 0.0F);
    this.jaw1R = new ModelRenderer(this, 250, 173);
    this.jaw1R.addBox(-1.5F, 1.0F, -14.0F, 3, 2, 12);
    this.jaw1R.setRotationPoint(-8.0F, -6.0F, -34.0F);
    this.jaw1R.setTextureSize(512, 256);
    this.jaw1R.mirror = true;
    setRotation(this.jaw1R, 0.1919862F, 0.0F, 0.0F);
    this.head3L = new ModelRenderer(this, 200, 149);
    this.head3L.addBox(-2.0F, -3.0F, -15.0F, 4, 4, 17);
    this.head3L.setRotationPoint(8.0F, -6.0F, -34.0F);
    this.head3L.setTextureSize(512, 256);
    this.head3L.mirror = true;
    setRotation(this.head3L, -0.2443461F, 0.0F, 0.0F);
    this.head3R = new ModelRenderer(this, 250, 149);
    this.head3R.addBox(-2.0F, -3.0F, -15.0F, 4, 4, 17);
    this.head3R.setRotationPoint(-8.0F, -6.0F, -34.0F);
    this.head3R.setTextureSize(512, 256);
    this.head3R.mirror = true;
    setRotation(this.head3R, -0.2443461F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast danger/orespawn/ThePrinceTeen
    //   4: astore #8
    //   6: aconst_null
    //   7: astore #9
    //   9: fconst_0
    //   10: fstore #10
    //   12: fconst_0
    //   13: fstore #11
    //   15: fconst_0
    //   16: fstore #12
    //   18: fconst_0
    //   19: fstore #13
    //   21: fconst_0
    //   22: fstore #14
    //   24: fconst_0
    //   25: fstore #15
    //   27: ldc_w 0.26
    //   30: fstore #16
    //   32: ldc_w 0.08
    //   35: fstore #17
    //   37: ldc_w 0.7853982
    //   40: fstore #18
    //   42: aload #8
    //   44: invokevirtual getActivity : ()I
    //   47: istore #28
    //   49: aload_0
    //   50: aload_1
    //   51: fload_2
    //   52: fload_3
    //   53: fload #4
    //   55: fload #5
    //   57: fload #6
    //   59: fload #7
    //   61: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   64: aload_0
    //   65: fload_2
    //   66: fload_3
    //   67: fload #4
    //   69: fload #5
    //   71: fload #6
    //   73: fload #7
    //   75: aload_1
    //   76: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   79: aload #8
    //   81: invokevirtual getRenderInfo : ()Ldanger/orespawn/RenderInfo;
    //   84: astore #9
    //   86: fload_3
    //   87: f2d
    //   88: ldc2_w 0.1
    //   91: dcmpl
    //   92: ifle -> 129
    //   95: iload #28
    //   97: ifne -> 129
    //   100: fload #4
    //   102: ldc_w 1.3
    //   105: fmul
    //   106: aload_0
    //   107: getfield wingspeed : F
    //   110: fmul
    //   111: invokestatic cos : (F)F
    //   114: ldc_w 3.1415927
    //   117: fmul
    //   118: ldc_w 0.2
    //   121: fmul
    //   122: fload_3
    //   123: fmul
    //   124: fstore #11
    //   126: goto -> 153
    //   129: fload #4
    //   131: ldc_w 0.3
    //   134: fmul
    //   135: aload_0
    //   136: getfield wingspeed : F
    //   139: fmul
    //   140: invokestatic cos : (F)F
    //   143: ldc_w 3.1415927
    //   146: fmul
    //   147: ldc_w 0.04
    //   150: fmul
    //   151: fstore #11
    //   153: iload #28
    //   155: iconst_1
    //   156: if_icmpne -> 183
    //   159: fload #4
    //   161: ldc_w 1.4
    //   164: fmul
    //   165: aload_0
    //   166: getfield wingspeed : F
    //   169: fmul
    //   170: invokestatic cos : (F)F
    //   173: ldc_w 3.1415927
    //   176: fmul
    //   177: ldc_w 0.4
    //   180: fmul
    //   181: fstore #11
    //   183: aload #8
    //   185: invokevirtual getAttacking : ()I
    //   188: ifeq -> 215
    //   191: fload #4
    //   193: ldc_w 1.7
    //   196: fmul
    //   197: aload_0
    //   198: getfield wingspeed : F
    //   201: fmul
    //   202: invokestatic cos : (F)F
    //   205: ldc_w 3.1415927
    //   208: fmul
    //   209: ldc_w 0.4
    //   212: fmul
    //   213: fstore #11
    //   215: aload_0
    //   216: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   219: fload #11
    //   221: ldc_w 0.4
    //   224: fsub
    //   225: putfield rotateAngleZ : F
    //   228: aload_0
    //   229: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   232: fload #11
    //   234: ldc_w 1.25
    //   237: fmul
    //   238: ldc_w 0.4
    //   241: fsub
    //   242: putfield rotateAngleZ : F
    //   245: aload_0
    //   246: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   249: fload #11
    //   251: ldc_w 0.6
    //   254: fsub
    //   255: putfield rotateAngleZ : F
    //   258: aload_0
    //   259: getfield wing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   262: fload #11
    //   264: ldc_w 0.2
    //   267: fsub
    //   268: putfield rotateAngleZ : F
    //   271: aload_0
    //   272: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   275: aload_0
    //   276: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   279: getfield rotationPointY : F
    //   282: aload_0
    //   283: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   286: getfield rotateAngleZ : F
    //   289: f2d
    //   290: invokestatic sin : (D)D
    //   293: d2f
    //   294: ldc 22.0
    //   296: fmul
    //   297: fadd
    //   298: putfield rotationPointY : F
    //   301: aload_0
    //   302: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   305: aload_0
    //   306: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   309: getfield rotationPointX : F
    //   312: aload_0
    //   313: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   316: getfield rotateAngleZ : F
    //   319: f2d
    //   320: invokestatic cos : (D)D
    //   323: d2f
    //   324: ldc 22.0
    //   326: fmul
    //   327: fadd
    //   328: putfield rotationPointX : F
    //   331: aload_0
    //   332: getfield mem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   335: aload_0
    //   336: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   339: getfield rotateAngleZ : F
    //   342: putfield rotateAngleZ : F
    //   345: aload_0
    //   346: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   349: aload_0
    //   350: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   353: getfield rotateAngleZ : F
    //   356: putfield rotateAngleZ : F
    //   359: aload_0
    //   360: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   363: aload_0
    //   364: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   367: getfield rotateAngleZ : F
    //   370: putfield rotateAngleZ : F
    //   373: aload_0
    //   374: getfield mem4 : Lnet/minecraft/client/model/ModelRenderer;
    //   377: aload_0
    //   378: getfield wing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   381: getfield rotateAngleZ : F
    //   384: putfield rotateAngleZ : F
    //   387: aload_0
    //   388: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   391: aload_0
    //   392: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   395: getfield rotationPointY : F
    //   398: putfield rotationPointY : F
    //   401: aload_0
    //   402: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   405: aload_0
    //   406: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   409: getfield rotationPointX : F
    //   412: putfield rotationPointX : F
    //   415: aload_0
    //   416: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   419: fload #11
    //   421: fneg
    //   422: ldc_w 0.4
    //   425: fadd
    //   426: putfield rotateAngleZ : F
    //   429: aload_0
    //   430: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   433: fload #11
    //   435: fneg
    //   436: ldc_w 1.25
    //   439: fmul
    //   440: ldc_w 0.4
    //   443: fadd
    //   444: putfield rotateAngleZ : F
    //   447: aload_0
    //   448: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   451: fload #11
    //   453: fneg
    //   454: ldc_w 0.6
    //   457: fadd
    //   458: putfield rotateAngleZ : F
    //   461: aload_0
    //   462: getfield rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   465: fload #11
    //   467: fneg
    //   468: ldc_w 0.2
    //   471: fadd
    //   472: putfield rotateAngleZ : F
    //   475: aload_0
    //   476: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   479: aload_0
    //   480: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   483: getfield rotationPointY : F
    //   486: aload_0
    //   487: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   490: getfield rotateAngleZ : F
    //   493: f2d
    //   494: invokestatic sin : (D)D
    //   497: d2f
    //   498: ldc 22.0
    //   500: fmul
    //   501: fsub
    //   502: putfield rotationPointY : F
    //   505: aload_0
    //   506: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   509: aload_0
    //   510: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   513: getfield rotationPointX : F
    //   516: aload_0
    //   517: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   520: getfield rotateAngleZ : F
    //   523: f2d
    //   524: invokestatic cos : (D)D
    //   527: d2f
    //   528: ldc 22.0
    //   530: fmul
    //   531: fsub
    //   532: putfield rotationPointX : F
    //   535: aload_0
    //   536: getfield rmem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   539: aload_0
    //   540: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   543: getfield rotateAngleZ : F
    //   546: putfield rotateAngleZ : F
    //   549: aload_0
    //   550: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   553: aload_0
    //   554: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   557: getfield rotateAngleZ : F
    //   560: putfield rotateAngleZ : F
    //   563: aload_0
    //   564: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   567: aload_0
    //   568: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   571: getfield rotateAngleZ : F
    //   574: putfield rotateAngleZ : F
    //   577: aload_0
    //   578: getfield rmem4 : Lnet/minecraft/client/model/ModelRenderer;
    //   581: aload_0
    //   582: getfield rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   585: getfield rotateAngleZ : F
    //   588: putfield rotateAngleZ : F
    //   591: aload_0
    //   592: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   595: aload_0
    //   596: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   599: getfield rotationPointY : F
    //   602: putfield rotationPointY : F
    //   605: aload_0
    //   606: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   609: aload_0
    //   610: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   613: getfield rotationPointX : F
    //   616: putfield rotationPointX : F
    //   619: fload_3
    //   620: f2d
    //   621: ldc2_w 0.1
    //   624: dcmpl
    //   625: ifle -> 700
    //   628: fload #4
    //   630: ldc_w 0.55
    //   633: fmul
    //   634: aload_0
    //   635: getfield wingspeed : F
    //   638: fmul
    //   639: invokestatic cos : (F)F
    //   642: ldc_w 3.1415927
    //   645: fmul
    //   646: ldc_w 0.25
    //   649: fmul
    //   650: fload_3
    //   651: fmul
    //   652: fstore #11
    //   654: fload #4
    //   656: ldc_w 0.55
    //   659: fmul
    //   660: aload_0
    //   661: getfield wingspeed : F
    //   664: fmul
    //   665: f2d
    //   666: ldc2_w 1.5707963267948966
    //   669: dadd
    //   670: d2f
    //   671: invokestatic cos : (F)F
    //   674: ldc_w 3.1415927
    //   677: fmul
    //   678: ldc_w 0.25
    //   681: fmul
    //   682: fload_3
    //   683: fmul
    //   684: fstore #12
    //   686: fload #11
    //   688: fstore #13
    //   690: fload #12
    //   692: fstore #14
    //   694: fconst_0
    //   695: fstore #15
    //   697: goto -> 715
    //   700: fconst_0
    //   701: fstore #11
    //   703: fconst_0
    //   704: fstore #12
    //   706: fconst_0
    //   707: fstore #13
    //   709: fconst_0
    //   710: fstore #14
    //   712: fconst_0
    //   713: fstore #15
    //   715: aload #8
    //   717: invokevirtual getAttacking : ()I
    //   720: ifeq -> 780
    //   723: fload #4
    //   725: aload_0
    //   726: getfield wingspeed : F
    //   729: fmul
    //   730: invokestatic cos : (F)F
    //   733: ldc_w 3.1415927
    //   736: fmul
    //   737: ldc_w 0.25
    //   740: fmul
    //   741: fstore #11
    //   743: fload #4
    //   745: aload_0
    //   746: getfield wingspeed : F
    //   749: fmul
    //   750: f2d
    //   751: ldc2_w 1.5707963267948966
    //   754: dadd
    //   755: d2f
    //   756: invokestatic cos : (F)F
    //   759: ldc_w 3.1415927
    //   762: fmul
    //   763: ldc_w 0.25
    //   766: fmul
    //   767: fstore #12
    //   769: fload #11
    //   771: fstore #13
    //   773: fload #12
    //   775: fstore #14
    //   777: fconst_0
    //   778: fstore #15
    //   780: iload #28
    //   782: iconst_1
    //   783: if_icmpne -> 813
    //   786: aload #8
    //   788: invokevirtual getAttacking : ()I
    //   791: ifne -> 813
    //   794: ldc -0.5
    //   796: fstore #11
    //   798: ldc_w -1.25
    //   801: fstore #12
    //   803: ldc_w 0.5
    //   806: fstore #13
    //   808: ldc_w 1.25
    //   811: fstore #14
    //   813: iload #28
    //   815: iconst_1
    //   816: if_icmpne -> 824
    //   819: ldc_w -0.685
    //   822: fstore #15
    //   824: aload_0
    //   825: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   828: fload #11
    //   830: ldc_w 0.575
    //   833: fsub
    //   834: putfield rotateAngleX : F
    //   837: aload_0
    //   838: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   841: fload #11
    //   843: ldc_w 0.977
    //   846: fadd
    //   847: putfield rotateAngleX : F
    //   850: aload_0
    //   851: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   854: fload #12
    //   856: ldc_w 0.523
    //   859: fsub
    //   860: putfield rotateAngleX : F
    //   863: aload_0
    //   864: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   867: aload_0
    //   868: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   871: getfield rotationPointY : F
    //   874: aload_0
    //   875: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   878: getfield rotateAngleX : F
    //   881: f2d
    //   882: invokestatic cos : (D)D
    //   885: d2f
    //   886: ldc 14.0
    //   888: fmul
    //   889: fadd
    //   890: ldc 6.0
    //   892: fadd
    //   893: putfield rotationPointY : F
    //   896: aload_0
    //   897: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   900: aload_0
    //   901: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   904: getfield rotationPointZ : F
    //   907: aload_0
    //   908: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   911: getfield rotateAngleX : F
    //   914: f2d
    //   915: invokestatic sin : (D)D
    //   918: d2f
    //   919: ldc 14.0
    //   921: fmul
    //   922: fadd
    //   923: putfield rotationPointZ : F
    //   926: aload_0
    //   927: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   930: aload_0
    //   931: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   934: getfield rotationPointY : F
    //   937: aload_0
    //   938: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   941: getfield rotateAngleX : F
    //   944: f2d
    //   945: invokestatic cos : (D)D
    //   948: d2f
    //   949: ldc_w 17.0
    //   952: fmul
    //   953: fadd
    //   954: putfield rotationPointY : F
    //   957: aload_0
    //   958: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   961: aload_0
    //   962: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   965: getfield rotationPointZ : F
    //   968: aload_0
    //   969: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   972: getfield rotateAngleX : F
    //   975: f2d
    //   976: invokestatic sin : (D)D
    //   979: d2f
    //   980: ldc_w 17.0
    //   983: fmul
    //   984: fadd
    //   985: fconst_1
    //   986: fsub
    //   987: putfield rotationPointZ : F
    //   990: aload_0
    //   991: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   994: aload_0
    //   995: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   998: getfield rotationPointY : F
    //   1001: putfield rotationPointY : F
    //   1004: aload_0
    //   1005: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1008: aload_0
    //   1009: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1012: getfield rotationPointZ : F
    //   1015: putfield rotationPointZ : F
    //   1018: aload_0
    //   1019: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1022: aload_0
    //   1023: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1026: getfield rotationPointY : F
    //   1029: putfield rotationPointY : F
    //   1032: aload_0
    //   1033: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1036: aload_0
    //   1037: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1040: getfield rotationPointZ : F
    //   1043: putfield rotationPointZ : F
    //   1046: aload_0
    //   1047: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1050: aload_0
    //   1051: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1054: getfield rotationPointY : F
    //   1057: putfield rotationPointY : F
    //   1060: aload_0
    //   1061: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1064: aload_0
    //   1065: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1068: getfield rotationPointZ : F
    //   1071: putfield rotationPointZ : F
    //   1074: aload_0
    //   1075: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1078: aload_0
    //   1079: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1082: getfield rotationPointY : F
    //   1085: putfield rotationPointY : F
    //   1088: aload_0
    //   1089: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1092: aload_0
    //   1093: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1096: getfield rotationPointZ : F
    //   1099: putfield rotationPointZ : F
    //   1102: aload_0
    //   1103: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1106: fload #15
    //   1108: putfield rotateAngleX : F
    //   1111: aload_0
    //   1112: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1115: fload #15
    //   1117: putfield rotateAngleX : F
    //   1120: aload_0
    //   1121: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1124: fload #15
    //   1126: putfield rotateAngleX : F
    //   1129: aload_0
    //   1130: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1133: fload #15
    //   1135: putfield rotateAngleX : F
    //   1138: aload_0
    //   1139: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1142: fload #15
    //   1144: putfield rotateAngleX : F
    //   1147: aload_0
    //   1148: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1151: fload #13
    //   1153: fneg
    //   1154: ldc_w 0.575
    //   1157: fsub
    //   1158: putfield rotateAngleX : F
    //   1161: aload_0
    //   1162: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1165: fload #13
    //   1167: fneg
    //   1168: ldc_w 0.977
    //   1171: fadd
    //   1172: putfield rotateAngleX : F
    //   1175: aload_0
    //   1176: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1179: fload #14
    //   1181: fneg
    //   1182: ldc_w 0.523
    //   1185: fsub
    //   1186: putfield rotateAngleX : F
    //   1189: aload_0
    //   1190: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1193: aload_0
    //   1194: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1197: getfield rotationPointY : F
    //   1200: aload_0
    //   1201: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1204: getfield rotateAngleX : F
    //   1207: f2d
    //   1208: invokestatic cos : (D)D
    //   1211: d2f
    //   1212: ldc 14.0
    //   1214: fmul
    //   1215: fadd
    //   1216: ldc 5.0
    //   1218: fadd
    //   1219: putfield rotationPointY : F
    //   1222: aload_0
    //   1223: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1226: aload_0
    //   1227: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1230: getfield rotationPointZ : F
    //   1233: aload_0
    //   1234: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1237: getfield rotateAngleX : F
    //   1240: f2d
    //   1241: invokestatic sin : (D)D
    //   1244: d2f
    //   1245: ldc 14.0
    //   1247: fmul
    //   1248: fadd
    //   1249: putfield rotationPointZ : F
    //   1252: aload_0
    //   1253: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1256: aload_0
    //   1257: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1260: getfield rotationPointY : F
    //   1263: aload_0
    //   1264: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1267: getfield rotateAngleX : F
    //   1270: f2d
    //   1271: invokestatic cos : (D)D
    //   1274: d2f
    //   1275: ldc_w 17.0
    //   1278: fmul
    //   1279: fadd
    //   1280: putfield rotationPointY : F
    //   1283: aload_0
    //   1284: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1287: aload_0
    //   1288: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1291: getfield rotationPointZ : F
    //   1294: aload_0
    //   1295: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1298: getfield rotateAngleX : F
    //   1301: f2d
    //   1302: invokestatic sin : (D)D
    //   1305: d2f
    //   1306: ldc_w 17.0
    //   1309: fmul
    //   1310: fadd
    //   1311: fconst_1
    //   1312: fsub
    //   1313: putfield rotationPointZ : F
    //   1316: aload_0
    //   1317: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1320: aload_0
    //   1321: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1324: getfield rotationPointY : F
    //   1327: putfield rotationPointY : F
    //   1330: aload_0
    //   1331: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1334: aload_0
    //   1335: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1338: getfield rotationPointZ : F
    //   1341: putfield rotationPointZ : F
    //   1344: aload_0
    //   1345: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1348: aload_0
    //   1349: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1352: getfield rotationPointY : F
    //   1355: putfield rotationPointY : F
    //   1358: aload_0
    //   1359: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1362: aload_0
    //   1363: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1366: getfield rotationPointZ : F
    //   1369: putfield rotationPointZ : F
    //   1372: aload_0
    //   1373: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1376: aload_0
    //   1377: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1380: getfield rotationPointY : F
    //   1383: putfield rotationPointY : F
    //   1386: aload_0
    //   1387: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1390: aload_0
    //   1391: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1394: getfield rotationPointZ : F
    //   1397: putfield rotationPointZ : F
    //   1400: aload_0
    //   1401: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1404: aload_0
    //   1405: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1408: getfield rotationPointY : F
    //   1411: putfield rotationPointY : F
    //   1414: aload_0
    //   1415: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1418: aload_0
    //   1419: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1422: getfield rotationPointZ : F
    //   1425: putfield rotationPointZ : F
    //   1428: aload_0
    //   1429: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1432: fload #15
    //   1434: putfield rotateAngleX : F
    //   1437: aload_0
    //   1438: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1441: fload #15
    //   1443: putfield rotateAngleX : F
    //   1446: aload_0
    //   1447: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1450: fload #15
    //   1452: putfield rotateAngleX : F
    //   1455: aload_0
    //   1456: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1459: fload #15
    //   1461: putfield rotateAngleX : F
    //   1464: aload_0
    //   1465: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1468: fload #15
    //   1470: putfield rotateAngleX : F
    //   1473: aload #8
    //   1475: invokevirtual getAttacking : ()I
    //   1478: ifeq -> 1491
    //   1481: ldc_w 0.56
    //   1484: fstore #16
    //   1486: ldc_w 0.19
    //   1489: fstore #17
    //   1491: aload #8
    //   1493: invokevirtual isSitting : ()Z
    //   1496: ifeq -> 1502
    //   1499: fconst_0
    //   1500: fstore #17
    //   1502: aload_0
    //   1503: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1506: fload #4
    //   1508: fload #16
    //   1510: fmul
    //   1511: aload_0
    //   1512: getfield wingspeed : F
    //   1515: fmul
    //   1516: invokestatic cos : (F)F
    //   1519: ldc_w 3.1415927
    //   1522: fmul
    //   1523: fload #17
    //   1525: fmul
    //   1526: ldc_w 4.0
    //   1529: fdiv
    //   1530: putfield rotateAngleY : F
    //   1533: aload_0
    //   1534: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1537: aload_0
    //   1538: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1541: getfield rotationPointZ : F
    //   1544: aload_0
    //   1545: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1548: getfield rotateAngleY : F
    //   1551: f2d
    //   1552: invokestatic cos : (D)D
    //   1555: d2f
    //   1556: ldc_w 11.0
    //   1559: fmul
    //   1560: fadd
    //   1561: putfield rotationPointZ : F
    //   1564: aload_0
    //   1565: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1568: aload_0
    //   1569: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1572: getfield rotationPointX : F
    //   1575: aload_0
    //   1576: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1579: getfield rotateAngleY : F
    //   1582: f2d
    //   1583: invokestatic sin : (D)D
    //   1586: d2f
    //   1587: ldc_w 11.0
    //   1590: fmul
    //   1591: fadd
    //   1592: putfield rotationPointX : F
    //   1595: aload_0
    //   1596: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1599: fload #4
    //   1601: fload #16
    //   1603: fmul
    //   1604: aload_0
    //   1605: getfield wingspeed : F
    //   1608: fmul
    //   1609: fload #18
    //   1611: fsub
    //   1612: invokestatic cos : (F)F
    //   1615: ldc_w 3.1415927
    //   1618: fmul
    //   1619: fload #17
    //   1621: fmul
    //   1622: putfield rotateAngleY : F
    //   1625: aload_0
    //   1626: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1629: aload_0
    //   1630: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1633: getfield rotationPointZ : F
    //   1636: aload_0
    //   1637: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1640: getfield rotateAngleY : F
    //   1643: f2d
    //   1644: invokestatic cos : (D)D
    //   1647: d2f
    //   1648: ldc 9.0
    //   1650: fmul
    //   1651: fadd
    //   1652: putfield rotationPointZ : F
    //   1655: aload_0
    //   1656: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1659: aload_0
    //   1660: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1663: getfield rotationPointX : F
    //   1666: aload_0
    //   1667: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1670: getfield rotateAngleY : F
    //   1673: f2d
    //   1674: invokestatic sin : (D)D
    //   1677: d2f
    //   1678: ldc 9.0
    //   1680: fmul
    //   1681: fadd
    //   1682: putfield rotationPointX : F
    //   1685: aload_0
    //   1686: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1689: fload #4
    //   1691: fload #16
    //   1693: fmul
    //   1694: aload_0
    //   1695: getfield wingspeed : F
    //   1698: fmul
    //   1699: fconst_2
    //   1700: fload #18
    //   1702: fmul
    //   1703: fsub
    //   1704: invokestatic cos : (F)F
    //   1707: ldc_w 3.1415927
    //   1710: fmul
    //   1711: fload #17
    //   1713: fmul
    //   1714: putfield rotateAngleY : F
    //   1717: aload_0
    //   1718: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1721: aload_0
    //   1722: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1725: getfield rotationPointZ : F
    //   1728: aload_0
    //   1729: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1732: getfield rotateAngleY : F
    //   1735: f2d
    //   1736: invokestatic cos : (D)D
    //   1739: d2f
    //   1740: ldc 9.0
    //   1742: fmul
    //   1743: fadd
    //   1744: putfield rotationPointZ : F
    //   1747: aload_0
    //   1748: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1751: aload_0
    //   1752: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1755: getfield rotationPointX : F
    //   1758: aload_0
    //   1759: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1762: getfield rotateAngleY : F
    //   1765: f2d
    //   1766: invokestatic sin : (D)D
    //   1769: d2f
    //   1770: ldc 9.0
    //   1772: fmul
    //   1773: fadd
    //   1774: putfield rotationPointX : F
    //   1777: aload_0
    //   1778: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1781: fload #4
    //   1783: fload #16
    //   1785: fmul
    //   1786: aload_0
    //   1787: getfield wingspeed : F
    //   1790: fmul
    //   1791: ldc 3.0
    //   1793: fload #18
    //   1795: fmul
    //   1796: fsub
    //   1797: invokestatic cos : (F)F
    //   1800: ldc_w 3.1415927
    //   1803: fmul
    //   1804: fload #17
    //   1806: fmul
    //   1807: putfield rotateAngleY : F
    //   1810: fload #4
    //   1812: fload #16
    //   1814: fmul
    //   1815: aload_0
    //   1816: getfield wingspeed : F
    //   1819: fmul
    //   1820: ldc 3.0
    //   1822: fload #18
    //   1824: fmul
    //   1825: fsub
    //   1826: invokestatic cos : (F)F
    //   1829: ldc_w 3.1415927
    //   1832: fmul
    //   1833: fload #17
    //   1835: fmul
    //   1836: fstore #11
    //   1838: fload #11
    //   1840: fconst_2
    //   1841: fdiv
    //   1842: fstore #11
    //   1844: aload_0
    //   1845: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1848: aload_0
    //   1849: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1852: getfield rotationPointZ : F
    //   1855: aload_0
    //   1856: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1859: getfield rotateAngleY : F
    //   1862: f2d
    //   1863: invokestatic cos : (D)D
    //   1866: d2f
    //   1867: ldc 9.0
    //   1869: fmul
    //   1870: fadd
    //   1871: putfield rotationPointZ : F
    //   1874: aload_0
    //   1875: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1878: aload_0
    //   1879: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1882: getfield rotationPointX : F
    //   1885: aload_0
    //   1886: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1889: getfield rotateAngleY : F
    //   1892: f2d
    //   1893: invokestatic sin : (D)D
    //   1896: d2f
    //   1897: ldc 9.0
    //   1899: fmul
    //   1900: fadd
    //   1901: putfield rotationPointX : F
    //   1904: aload_0
    //   1905: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1908: aload_0
    //   1909: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1912: getfield rotateAngleY : F
    //   1915: fload #11
    //   1917: fadd
    //   1918: putfield rotateAngleY : F
    //   1921: aload_0
    //   1922: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1925: aload_0
    //   1926: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1929: getfield rotationPointZ : F
    //   1932: aload_0
    //   1933: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1936: getfield rotateAngleY : F
    //   1939: f2d
    //   1940: invokestatic cos : (D)D
    //   1943: d2f
    //   1944: ldc 9.0
    //   1946: fmul
    //   1947: fadd
    //   1948: putfield rotationPointZ : F
    //   1951: aload_0
    //   1952: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1955: aload_0
    //   1956: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1959: getfield rotationPointX : F
    //   1962: aload_0
    //   1963: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1966: getfield rotateAngleY : F
    //   1969: f2d
    //   1970: invokestatic sin : (D)D
    //   1973: d2f
    //   1974: ldc 9.0
    //   1976: fmul
    //   1977: fadd
    //   1978: putfield rotationPointX : F
    //   1981: aload_0
    //   1982: getfield Tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1985: aload_0
    //   1986: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1989: getfield rotationPointZ : F
    //   1992: aload_0
    //   1993: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1996: getfield rotateAngleY : F
    //   1999: f2d
    //   2000: invokestatic cos : (D)D
    //   2003: d2f
    //   2004: ldc_w 15.0
    //   2007: fmul
    //   2008: fadd
    //   2009: putfield rotationPointZ : F
    //   2012: aload_0
    //   2013: getfield Tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2016: aload_0
    //   2017: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2020: getfield rotationPointX : F
    //   2023: aload_0
    //   2024: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2027: getfield rotateAngleY : F
    //   2030: f2d
    //   2031: invokestatic sin : (D)D
    //   2034: d2f
    //   2035: ldc_w 15.0
    //   2038: fmul
    //   2039: fadd
    //   2040: putfield rotationPointX : F
    //   2043: aload_0
    //   2044: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2047: aload_0
    //   2048: getfield Tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2051: aload_0
    //   2052: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2055: getfield rotateAngleY : F
    //   2058: fload #11
    //   2060: fconst_2
    //   2061: fmul
    //   2062: ldc 3.0
    //   2064: fdiv
    //   2065: fadd
    //   2066: dup_x1
    //   2067: putfield rotateAngleY : F
    //   2070: putfield rotateAngleY : F
    //   2073: aload_0
    //   2074: getfield Tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2077: aload_0
    //   2078: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2081: getfield rotationPointZ : F
    //   2084: aload_0
    //   2085: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2088: getfield rotateAngleY : F
    //   2091: f2d
    //   2092: invokestatic cos : (D)D
    //   2095: d2f
    //   2096: ldc_w 11.0
    //   2099: fmul
    //   2100: fadd
    //   2101: putfield rotationPointZ : F
    //   2104: aload_0
    //   2105: getfield Tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2108: aload_0
    //   2109: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2112: getfield rotationPointX : F
    //   2115: aload_0
    //   2116: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2119: getfield rotateAngleY : F
    //   2122: f2d
    //   2123: invokestatic sin : (D)D
    //   2126: d2f
    //   2127: ldc_w 11.0
    //   2130: fmul
    //   2131: fadd
    //   2132: putfield rotationPointX : F
    //   2135: aload_0
    //   2136: getfield Tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2139: aload_0
    //   2140: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2143: getfield rotateAngleY : F
    //   2146: fload #11
    //   2148: ldc 3.0
    //   2150: fmul
    //   2151: fconst_2
    //   2152: fdiv
    //   2153: fadd
    //   2154: putfield rotateAngleY : F
    //   2157: aload #8
    //   2159: invokevirtual getActivity : ()I
    //   2162: iconst_1
    //   2163: if_icmpne -> 2256
    //   2166: aload #8
    //   2168: getfield prevRotationYaw : F
    //   2171: aload #8
    //   2173: getfield rotationYaw : F
    //   2176: fsub
    //   2177: ldc 10.0
    //   2179: fmul
    //   2180: fstore #5
    //   2182: fload #5
    //   2184: fneg
    //   2185: fstore #5
    //   2187: aload #9
    //   2189: dup
    //   2190: getfield rf1 : F
    //   2193: fload #5
    //   2195: aload #9
    //   2197: getfield rf1 : F
    //   2200: fsub
    //   2201: ldc_w 50.0
    //   2204: fdiv
    //   2205: fadd
    //   2206: putfield rf1 : F
    //   2209: aload #9
    //   2211: getfield rf1 : F
    //   2214: ldc_w 50.0
    //   2217: fcmpl
    //   2218: ifle -> 2229
    //   2221: aload #9
    //   2223: ldc_w 50.0
    //   2226: putfield rf1 : F
    //   2229: aload #9
    //   2231: getfield rf1 : F
    //   2234: ldc_w -50.0
    //   2237: fcmpg
    //   2238: ifge -> 2249
    //   2241: aload #9
    //   2243: ldc_w -50.0
    //   2246: putfield rf1 : F
    //   2249: aload #9
    //   2251: getfield rf1 : F
    //   2254: fstore #5
    //   2256: fload #5
    //   2258: fconst_2
    //   2259: fmul
    //   2260: ldc 3.0
    //   2262: fdiv
    //   2263: dup
    //   2264: fstore #21
    //   2266: dup
    //   2267: fstore #20
    //   2269: fstore #19
    //   2271: fload #6
    //   2273: fconst_2
    //   2274: fmul
    //   2275: ldc 3.0
    //   2277: fdiv
    //   2278: dup
    //   2279: fstore #24
    //   2281: dup
    //   2282: fstore #23
    //   2284: fstore #22
    //   2286: fload #19
    //   2288: fconst_0
    //   2289: fcmpg
    //   2290: ifge -> 2314
    //   2293: fload #19
    //   2295: fconst_2
    //   2296: fdiv
    //   2297: dup
    //   2298: fstore #21
    //   2300: fstore #20
    //   2302: fload #22
    //   2304: fconst_2
    //   2305: fdiv
    //   2306: dup
    //   2307: fstore #24
    //   2309: fstore #23
    //   2311: goto -> 2332
    //   2314: fload #21
    //   2316: fconst_2
    //   2317: fdiv
    //   2318: dup
    //   2319: fstore #19
    //   2321: fstore #20
    //   2323: fload #24
    //   2325: fconst_2
    //   2326: fdiv
    //   2327: dup
    //   2328: fstore #22
    //   2330: fstore #23
    //   2332: aload_0
    //   2333: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2336: fload #20
    //   2338: f2d
    //   2339: invokestatic toRadians : (D)D
    //   2342: d2f
    //   2343: putfield rotateAngleY : F
    //   2346: aload_0
    //   2347: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2350: fload #20
    //   2352: f2d
    //   2353: invokestatic toRadians : (D)D
    //   2356: d2f
    //   2357: putfield rotateAngleY : F
    //   2360: aload_0
    //   2361: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   2364: fload #20
    //   2366: f2d
    //   2367: invokestatic toRadians : (D)D
    //   2370: d2f
    //   2371: putfield rotateAngleY : F
    //   2374: aload_0
    //   2375: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2378: fload #20
    //   2380: f2d
    //   2381: invokestatic toRadians : (D)D
    //   2384: d2f
    //   2385: putfield rotateAngleY : F
    //   2388: aload_0
    //   2389: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2392: fload #20
    //   2394: f2d
    //   2395: invokestatic toRadians : (D)D
    //   2398: d2f
    //   2399: putfield rotateAngleY : F
    //   2402: aload_0
    //   2403: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2406: fload #20
    //   2408: f2d
    //   2409: invokestatic toRadians : (D)D
    //   2412: d2f
    //   2413: ldc 8.0
    //   2415: fdiv
    //   2416: putfield rotateAngleY : F
    //   2419: aload_0
    //   2420: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2423: fload #20
    //   2425: f2d
    //   2426: invokestatic toRadians : (D)D
    //   2429: d2f
    //   2430: ldc_w 4.0
    //   2433: fdiv
    //   2434: putfield rotateAngleY : F
    //   2437: aload_0
    //   2438: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2441: fload #20
    //   2443: f2d
    //   2444: invokestatic toRadians : (D)D
    //   2447: d2f
    //   2448: fconst_2
    //   2449: fdiv
    //   2450: putfield rotateAngleY : F
    //   2453: aload_0
    //   2454: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   2457: fload #19
    //   2459: f2d
    //   2460: invokestatic toRadians : (D)D
    //   2463: d2f
    //   2464: putfield rotateAngleY : F
    //   2467: aload_0
    //   2468: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   2471: fload #19
    //   2473: f2d
    //   2474: invokestatic toRadians : (D)D
    //   2477: d2f
    //   2478: putfield rotateAngleY : F
    //   2481: aload_0
    //   2482: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   2485: fload #19
    //   2487: f2d
    //   2488: invokestatic toRadians : (D)D
    //   2491: d2f
    //   2492: putfield rotateAngleY : F
    //   2495: aload_0
    //   2496: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   2499: fload #19
    //   2501: f2d
    //   2502: invokestatic toRadians : (D)D
    //   2505: d2f
    //   2506: putfield rotateAngleY : F
    //   2509: aload_0
    //   2510: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   2513: fload #19
    //   2515: f2d
    //   2516: invokestatic toRadians : (D)D
    //   2519: d2f
    //   2520: putfield rotateAngleY : F
    //   2523: aload_0
    //   2524: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   2527: fload #19
    //   2529: f2d
    //   2530: invokestatic toRadians : (D)D
    //   2533: d2f
    //   2534: ldc 8.0
    //   2536: fdiv
    //   2537: putfield rotateAngleY : F
    //   2540: aload_0
    //   2541: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   2544: fload #19
    //   2546: f2d
    //   2547: invokestatic toRadians : (D)D
    //   2550: d2f
    //   2551: ldc_w 4.0
    //   2554: fdiv
    //   2555: putfield rotateAngleY : F
    //   2558: aload_0
    //   2559: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   2562: fload #19
    //   2564: f2d
    //   2565: invokestatic toRadians : (D)D
    //   2568: d2f
    //   2569: fconst_2
    //   2570: fdiv
    //   2571: putfield rotateAngleY : F
    //   2574: aload_0
    //   2575: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   2578: fload #21
    //   2580: f2d
    //   2581: invokestatic toRadians : (D)D
    //   2584: d2f
    //   2585: putfield rotateAngleY : F
    //   2588: aload_0
    //   2589: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   2592: fload #21
    //   2594: f2d
    //   2595: invokestatic toRadians : (D)D
    //   2598: d2f
    //   2599: putfield rotateAngleY : F
    //   2602: aload_0
    //   2603: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   2606: fload #21
    //   2608: f2d
    //   2609: invokestatic toRadians : (D)D
    //   2612: d2f
    //   2613: putfield rotateAngleY : F
    //   2616: aload_0
    //   2617: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   2620: fload #21
    //   2622: f2d
    //   2623: invokestatic toRadians : (D)D
    //   2626: d2f
    //   2627: putfield rotateAngleY : F
    //   2630: aload_0
    //   2631: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   2634: fload #21
    //   2636: f2d
    //   2637: invokestatic toRadians : (D)D
    //   2640: d2f
    //   2641: putfield rotateAngleY : F
    //   2644: aload_0
    //   2645: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   2648: fload #21
    //   2650: f2d
    //   2651: invokestatic toRadians : (D)D
    //   2654: d2f
    //   2655: ldc 8.0
    //   2657: fdiv
    //   2658: putfield rotateAngleY : F
    //   2661: aload_0
    //   2662: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   2665: fload #21
    //   2667: f2d
    //   2668: invokestatic toRadians : (D)D
    //   2671: d2f
    //   2672: ldc_w 4.0
    //   2675: fdiv
    //   2676: putfield rotateAngleY : F
    //   2679: aload_0
    //   2680: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   2683: fload #21
    //   2685: f2d
    //   2686: invokestatic toRadians : (D)D
    //   2689: d2f
    //   2690: fconst_2
    //   2691: fdiv
    //   2692: putfield rotateAngleY : F
    //   2695: fconst_0
    //   2696: dup
    //   2697: fstore #26
    //   2699: dup
    //   2700: fstore #27
    //   2702: fstore #25
    //   2704: aload #8
    //   2706: invokevirtual getAttacking : ()I
    //   2709: ifeq -> 2811
    //   2712: fload #4
    //   2714: ldc_w 0.9
    //   2717: fmul
    //   2718: aload_0
    //   2719: getfield wingspeed : F
    //   2722: fmul
    //   2723: invokestatic cos : (F)F
    //   2726: ldc_w 3.1415927
    //   2729: fmul
    //   2730: ldc_w 0.1
    //   2733: fmul
    //   2734: fstore #11
    //   2736: ldc_w 0.25
    //   2739: fload #11
    //   2741: fadd
    //   2742: fstore #25
    //   2744: fload #4
    //   2746: ldc_w 1.1
    //   2749: fmul
    //   2750: aload_0
    //   2751: getfield wingspeed : F
    //   2754: fmul
    //   2755: invokestatic cos : (F)F
    //   2758: ldc_w 3.1415927
    //   2761: fmul
    //   2762: ldc_w 0.1
    //   2765: fmul
    //   2766: fstore #11
    //   2768: ldc_w 0.25
    //   2771: fload #11
    //   2773: fadd
    //   2774: fstore #26
    //   2776: fload #4
    //   2778: ldc_w 1.3
    //   2781: fmul
    //   2782: aload_0
    //   2783: getfield wingspeed : F
    //   2786: fmul
    //   2787: invokestatic cos : (F)F
    //   2790: ldc_w 3.1415927
    //   2793: fmul
    //   2794: ldc_w 0.1
    //   2797: fmul
    //   2798: fstore #11
    //   2800: ldc_w 0.25
    //   2803: fload #11
    //   2805: fadd
    //   2806: fstore #27
    //   2808: goto -> 2907
    //   2811: fload #4
    //   2813: ldc_w 0.25
    //   2816: fmul
    //   2817: aload_0
    //   2818: getfield wingspeed : F
    //   2821: fmul
    //   2822: invokestatic cos : (F)F
    //   2825: ldc_w 3.1415927
    //   2828: fmul
    //   2829: ldc_w 0.02
    //   2832: fmul
    //   2833: fstore #11
    //   2835: ldc_w 0.1
    //   2838: fload #11
    //   2840: fadd
    //   2841: fstore #25
    //   2843: fload #4
    //   2845: ldc_w 0.3
    //   2848: fmul
    //   2849: aload_0
    //   2850: getfield wingspeed : F
    //   2853: fmul
    //   2854: invokestatic cos : (F)F
    //   2857: ldc_w 3.1415927
    //   2860: fmul
    //   2861: ldc_w 0.02
    //   2864: fmul
    //   2865: fstore #11
    //   2867: ldc_w 0.1
    //   2870: fload #11
    //   2872: fadd
    //   2873: fstore #26
    //   2875: fload #4
    //   2877: ldc_w 0.35
    //   2880: fmul
    //   2881: aload_0
    //   2882: getfield wingspeed : F
    //   2885: fmul
    //   2886: invokestatic cos : (F)F
    //   2889: ldc_w 3.1415927
    //   2892: fmul
    //   2893: ldc_w 0.02
    //   2896: fmul
    //   2897: fstore #11
    //   2899: ldc_w 0.1
    //   2902: fload #11
    //   2904: fadd
    //   2905: fstore #27
    //   2907: aload_0
    //   2908: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2911: fload #23
    //   2913: f2d
    //   2914: invokestatic toRadians : (D)D
    //   2917: d2f
    //   2918: putfield rotateAngleX : F
    //   2921: aload_0
    //   2922: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2925: fload #23
    //   2927: f2d
    //   2928: invokestatic toRadians : (D)D
    //   2931: d2f
    //   2932: putfield rotateAngleX : F
    //   2935: aload_0
    //   2936: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   2939: fload #23
    //   2941: f2d
    //   2942: invokestatic toRadians : (D)D
    //   2945: d2f
    //   2946: ldc_w 0.5
    //   2949: fadd
    //   2950: putfield rotateAngleX : F
    //   2953: aload_0
    //   2954: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2957: fload #23
    //   2959: f2d
    //   2960: invokestatic toRadians : (D)D
    //   2963: d2f
    //   2964: fload #27
    //   2966: fadd
    //   2967: putfield rotateAngleX : F
    //   2970: aload_0
    //   2971: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2974: fload #23
    //   2976: f2d
    //   2977: invokestatic toRadians : (D)D
    //   2980: d2f
    //   2981: fload #27
    //   2983: fadd
    //   2984: putfield rotateAngleX : F
    //   2987: aload_0
    //   2988: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   2991: fload #22
    //   2993: f2d
    //   2994: invokestatic toRadians : (D)D
    //   2997: d2f
    //   2998: putfield rotateAngleX : F
    //   3001: aload_0
    //   3002: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3005: fload #22
    //   3007: f2d
    //   3008: invokestatic toRadians : (D)D
    //   3011: d2f
    //   3012: putfield rotateAngleX : F
    //   3015: aload_0
    //   3016: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   3019: fload #22
    //   3021: f2d
    //   3022: invokestatic toRadians : (D)D
    //   3025: d2f
    //   3026: ldc_w 0.5
    //   3029: fadd
    //   3030: putfield rotateAngleX : F
    //   3033: aload_0
    //   3034: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3037: fload #22
    //   3039: f2d
    //   3040: invokestatic toRadians : (D)D
    //   3043: d2f
    //   3044: fload #25
    //   3046: fadd
    //   3047: putfield rotateAngleX : F
    //   3050: aload_0
    //   3051: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   3054: fload #22
    //   3056: f2d
    //   3057: invokestatic toRadians : (D)D
    //   3060: d2f
    //   3061: fload #25
    //   3063: fadd
    //   3064: putfield rotateAngleX : F
    //   3067: aload_0
    //   3068: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   3071: fload #24
    //   3073: f2d
    //   3074: invokestatic toRadians : (D)D
    //   3077: d2f
    //   3078: putfield rotateAngleX : F
    //   3081: aload_0
    //   3082: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   3085: fload #24
    //   3087: f2d
    //   3088: invokestatic toRadians : (D)D
    //   3091: d2f
    //   3092: putfield rotateAngleX : F
    //   3095: aload_0
    //   3096: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   3099: fload #24
    //   3101: f2d
    //   3102: invokestatic toRadians : (D)D
    //   3105: d2f
    //   3106: ldc_w 0.5
    //   3109: fadd
    //   3110: putfield rotateAngleX : F
    //   3113: aload_0
    //   3114: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   3117: fload #24
    //   3119: f2d
    //   3120: invokestatic toRadians : (D)D
    //   3123: d2f
    //   3124: fload #26
    //   3126: fadd
    //   3127: putfield rotateAngleX : F
    //   3130: aload_0
    //   3131: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   3134: fload #24
    //   3136: f2d
    //   3137: invokestatic toRadians : (D)D
    //   3140: d2f
    //   3141: fload #26
    //   3143: fadd
    //   3144: putfield rotateAngleX : F
    //   3147: aload #8
    //   3149: invokevirtual getHead1Ext : ()I
    //   3152: i2f
    //   3153: fstore #22
    //   3155: aload #8
    //   3157: invokevirtual getHead2Ext : ()I
    //   3160: i2f
    //   3161: fstore #23
    //   3163: aload #8
    //   3165: invokevirtual getHead3Ext : ()I
    //   3168: i2f
    //   3169: fstore #24
    //   3171: aload_0
    //   3172: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3175: fload #22
    //   3177: f2d
    //   3178: ldc2_w 3.0
    //   3181: ddiv
    //   3182: invokestatic toRadians : (D)D
    //   3185: d2f
    //   3186: fneg
    //   3187: putfield rotateAngleX : F
    //   3190: aload_0
    //   3191: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3194: fload #22
    //   3196: f2d
    //   3197: ldc2_w 2.0
    //   3200: dmul
    //   3201: ldc2_w 3.0
    //   3204: ddiv
    //   3205: invokestatic toRadians : (D)D
    //   3208: d2f
    //   3209: fneg
    //   3210: putfield rotateAngleX : F
    //   3213: aload_0
    //   3214: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3217: fload #22
    //   3219: f2d
    //   3220: invokestatic toRadians : (D)D
    //   3223: d2f
    //   3224: fneg
    //   3225: putfield rotateAngleX : F
    //   3228: aload_0
    //   3229: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3232: fload #23
    //   3234: f2d
    //   3235: ldc2_w 3.0
    //   3238: ddiv
    //   3239: invokestatic toRadians : (D)D
    //   3242: d2f
    //   3243: fneg
    //   3244: putfield rotateAngleX : F
    //   3247: aload_0
    //   3248: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3251: fload #23
    //   3253: f2d
    //   3254: ldc2_w 2.0
    //   3257: dmul
    //   3258: ldc2_w 3.0
    //   3261: ddiv
    //   3262: invokestatic toRadians : (D)D
    //   3265: d2f
    //   3266: fneg
    //   3267: putfield rotateAngleX : F
    //   3270: aload_0
    //   3271: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3274: fload #23
    //   3276: f2d
    //   3277: invokestatic toRadians : (D)D
    //   3280: d2f
    //   3281: fneg
    //   3282: putfield rotateAngleX : F
    //   3285: aload_0
    //   3286: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   3289: fload #24
    //   3291: f2d
    //   3292: ldc2_w 3.0
    //   3295: ddiv
    //   3296: invokestatic toRadians : (D)D
    //   3299: d2f
    //   3300: fneg
    //   3301: putfield rotateAngleX : F
    //   3304: aload_0
    //   3305: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   3308: fload #24
    //   3310: f2d
    //   3311: ldc2_w 2.0
    //   3314: dmul
    //   3315: ldc2_w 3.0
    //   3318: ddiv
    //   3319: invokestatic toRadians : (D)D
    //   3322: d2f
    //   3323: fneg
    //   3324: putfield rotateAngleX : F
    //   3327: aload_0
    //   3328: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   3331: fload #24
    //   3333: f2d
    //   3334: invokestatic toRadians : (D)D
    //   3337: d2f
    //   3338: fneg
    //   3339: putfield rotateAngleX : F
    //   3342: aload_0
    //   3343: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3346: aload_0
    //   3347: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3350: getfield rotationPointY : F
    //   3353: aload_0
    //   3354: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3357: getfield rotateAngleX : F
    //   3360: f2d
    //   3361: invokestatic sin : (D)D
    //   3364: d2f
    //   3365: ldc 9.0
    //   3367: fmul
    //   3368: fadd
    //   3369: putfield rotationPointY : F
    //   3372: aload_0
    //   3373: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3376: aload_0
    //   3377: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3380: getfield rotationPointZ : F
    //   3383: aload_0
    //   3384: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3387: getfield rotateAngleX : F
    //   3390: f2d
    //   3391: invokestatic cos : (D)D
    //   3394: d2f
    //   3395: ldc 9.0
    //   3397: fmul
    //   3398: fsub
    //   3399: putfield rotationPointZ : F
    //   3402: aload_0
    //   3403: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3406: aload_0
    //   3407: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3410: getfield rotationPointX : F
    //   3413: aload_0
    //   3414: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3417: getfield rotateAngleY : F
    //   3420: f2d
    //   3421: invokestatic sin : (D)D
    //   3424: d2f
    //   3425: ldc 9.0
    //   3427: fmul
    //   3428: aload_0
    //   3429: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3432: getfield rotateAngleX : F
    //   3435: f2d
    //   3436: invokestatic cos : (D)D
    //   3439: d2f
    //   3440: fmul
    //   3441: fsub
    //   3442: putfield rotationPointX : F
    //   3445: aload_0
    //   3446: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3449: aload_0
    //   3450: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3453: getfield rotationPointY : F
    //   3456: aload_0
    //   3457: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3460: getfield rotateAngleX : F
    //   3463: f2d
    //   3464: invokestatic sin : (D)D
    //   3467: d2f
    //   3468: ldc 9.0
    //   3470: fmul
    //   3471: fadd
    //   3472: putfield rotationPointY : F
    //   3475: aload_0
    //   3476: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3479: aload_0
    //   3480: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3483: getfield rotationPointZ : F
    //   3486: aload_0
    //   3487: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3490: getfield rotateAngleX : F
    //   3493: f2d
    //   3494: invokestatic cos : (D)D
    //   3497: d2f
    //   3498: ldc 9.0
    //   3500: fmul
    //   3501: fsub
    //   3502: putfield rotationPointZ : F
    //   3505: aload_0
    //   3506: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3509: aload_0
    //   3510: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3513: getfield rotationPointX : F
    //   3516: aload_0
    //   3517: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3520: getfield rotateAngleY : F
    //   3523: f2d
    //   3524: invokestatic sin : (D)D
    //   3527: d2f
    //   3528: ldc 9.0
    //   3530: fmul
    //   3531: aload_0
    //   3532: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3535: getfield rotateAngleX : F
    //   3538: f2d
    //   3539: invokestatic cos : (D)D
    //   3542: d2f
    //   3543: fmul
    //   3544: fsub
    //   3545: putfield rotationPointX : F
    //   3548: aload_0
    //   3549: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3552: aload_0
    //   3553: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3556: getfield rotationPointY : F
    //   3559: aload_0
    //   3560: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3563: getfield rotateAngleX : F
    //   3566: f2d
    //   3567: invokestatic sin : (D)D
    //   3570: d2f
    //   3571: ldc 9.0
    //   3573: fmul
    //   3574: fadd
    //   3575: putfield rotationPointY : F
    //   3578: aload_0
    //   3579: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   3582: aload_0
    //   3583: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3586: aload_0
    //   3587: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3590: aload_0
    //   3591: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3594: aload_0
    //   3595: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3598: getfield rotationPointY : F
    //   3601: dup_x1
    //   3602: putfield rotationPointY : F
    //   3605: dup_x1
    //   3606: putfield rotationPointY : F
    //   3609: dup_x1
    //   3610: putfield rotationPointY : F
    //   3613: putfield rotationPointY : F
    //   3616: aload_0
    //   3617: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3620: aload_0
    //   3621: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3624: getfield rotationPointZ : F
    //   3627: aload_0
    //   3628: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3631: getfield rotateAngleX : F
    //   3634: f2d
    //   3635: invokestatic cos : (D)D
    //   3638: d2f
    //   3639: ldc 9.0
    //   3641: fmul
    //   3642: fsub
    //   3643: putfield rotationPointZ : F
    //   3646: aload_0
    //   3647: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   3650: aload_0
    //   3651: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3654: aload_0
    //   3655: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3658: aload_0
    //   3659: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3662: aload_0
    //   3663: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3666: getfield rotationPointZ : F
    //   3669: dup_x1
    //   3670: putfield rotationPointZ : F
    //   3673: dup_x1
    //   3674: putfield rotationPointZ : F
    //   3677: dup_x1
    //   3678: putfield rotationPointZ : F
    //   3681: putfield rotationPointZ : F
    //   3684: aload_0
    //   3685: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3688: aload_0
    //   3689: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3692: getfield rotationPointX : F
    //   3695: aload_0
    //   3696: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3699: getfield rotateAngleY : F
    //   3702: f2d
    //   3703: invokestatic sin : (D)D
    //   3706: d2f
    //   3707: ldc 9.0
    //   3709: fmul
    //   3710: aload_0
    //   3711: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3714: getfield rotateAngleX : F
    //   3717: f2d
    //   3718: invokestatic cos : (D)D
    //   3721: d2f
    //   3722: fmul
    //   3723: fsub
    //   3724: putfield rotationPointX : F
    //   3727: aload_0
    //   3728: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   3731: aload_0
    //   3732: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3735: aload_0
    //   3736: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3739: aload_0
    //   3740: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3743: aload_0
    //   3744: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3747: getfield rotationPointX : F
    //   3750: dup_x1
    //   3751: putfield rotationPointX : F
    //   3754: dup_x1
    //   3755: putfield rotationPointX : F
    //   3758: dup_x1
    //   3759: putfield rotationPointX : F
    //   3762: putfield rotationPointX : F
    //   3765: aload_0
    //   3766: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3769: aload_0
    //   3770: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3773: getfield rotationPointY : F
    //   3776: aload_0
    //   3777: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3780: getfield rotateAngleX : F
    //   3783: f2d
    //   3784: invokestatic sin : (D)D
    //   3787: d2f
    //   3788: ldc 9.0
    //   3790: fmul
    //   3791: fadd
    //   3792: putfield rotationPointY : F
    //   3795: aload_0
    //   3796: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3799: aload_0
    //   3800: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3803: getfield rotationPointZ : F
    //   3806: aload_0
    //   3807: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3810: getfield rotateAngleX : F
    //   3813: f2d
    //   3814: invokestatic cos : (D)D
    //   3817: d2f
    //   3818: ldc 9.0
    //   3820: fmul
    //   3821: fsub
    //   3822: putfield rotationPointZ : F
    //   3825: aload_0
    //   3826: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3829: aload_0
    //   3830: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3833: getfield rotationPointX : F
    //   3836: aload_0
    //   3837: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3840: getfield rotateAngleY : F
    //   3843: f2d
    //   3844: invokestatic sin : (D)D
    //   3847: d2f
    //   3848: ldc 9.0
    //   3850: fmul
    //   3851: aload_0
    //   3852: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   3855: getfield rotateAngleX : F
    //   3858: f2d
    //   3859: invokestatic cos : (D)D
    //   3862: d2f
    //   3863: fmul
    //   3864: fsub
    //   3865: putfield rotationPointX : F
    //   3868: aload_0
    //   3869: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3872: aload_0
    //   3873: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3876: getfield rotationPointY : F
    //   3879: aload_0
    //   3880: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3883: getfield rotateAngleX : F
    //   3886: f2d
    //   3887: invokestatic sin : (D)D
    //   3890: d2f
    //   3891: ldc 9.0
    //   3893: fmul
    //   3894: fadd
    //   3895: putfield rotationPointY : F
    //   3898: aload_0
    //   3899: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3902: aload_0
    //   3903: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3906: getfield rotationPointZ : F
    //   3909: aload_0
    //   3910: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3913: getfield rotateAngleX : F
    //   3916: f2d
    //   3917: invokestatic cos : (D)D
    //   3920: d2f
    //   3921: ldc 9.0
    //   3923: fmul
    //   3924: fsub
    //   3925: putfield rotationPointZ : F
    //   3928: aload_0
    //   3929: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3932: aload_0
    //   3933: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3936: getfield rotationPointX : F
    //   3939: aload_0
    //   3940: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3943: getfield rotateAngleY : F
    //   3946: f2d
    //   3947: invokestatic sin : (D)D
    //   3950: d2f
    //   3951: ldc 9.0
    //   3953: fmul
    //   3954: aload_0
    //   3955: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   3958: getfield rotateAngleX : F
    //   3961: f2d
    //   3962: invokestatic cos : (D)D
    //   3965: d2f
    //   3966: fmul
    //   3967: fsub
    //   3968: putfield rotationPointX : F
    //   3971: aload_0
    //   3972: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   3975: aload_0
    //   3976: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3979: getfield rotationPointY : F
    //   3982: aload_0
    //   3983: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   3986: getfield rotateAngleX : F
    //   3989: f2d
    //   3990: invokestatic sin : (D)D
    //   3993: d2f
    //   3994: ldc 9.0
    //   3996: fmul
    //   3997: fadd
    //   3998: putfield rotationPointY : F
    //   4001: aload_0
    //   4002: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   4005: aload_0
    //   4006: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4009: aload_0
    //   4010: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   4013: aload_0
    //   4014: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   4017: aload_0
    //   4018: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   4021: getfield rotationPointY : F
    //   4024: dup_x1
    //   4025: putfield rotationPointY : F
    //   4028: dup_x1
    //   4029: putfield rotationPointY : F
    //   4032: dup_x1
    //   4033: putfield rotationPointY : F
    //   4036: putfield rotationPointY : F
    //   4039: aload_0
    //   4040: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   4043: aload_0
    //   4044: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4047: getfield rotationPointZ : F
    //   4050: aload_0
    //   4051: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4054: getfield rotateAngleX : F
    //   4057: f2d
    //   4058: invokestatic cos : (D)D
    //   4061: d2f
    //   4062: ldc 9.0
    //   4064: fmul
    //   4065: fsub
    //   4066: putfield rotationPointZ : F
    //   4069: aload_0
    //   4070: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   4073: aload_0
    //   4074: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4077: aload_0
    //   4078: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   4081: aload_0
    //   4082: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   4085: aload_0
    //   4086: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   4089: getfield rotationPointZ : F
    //   4092: dup_x1
    //   4093: putfield rotationPointZ : F
    //   4096: dup_x1
    //   4097: putfield rotationPointZ : F
    //   4100: dup_x1
    //   4101: putfield rotationPointZ : F
    //   4104: putfield rotationPointZ : F
    //   4107: aload_0
    //   4108: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   4111: aload_0
    //   4112: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4115: getfield rotationPointX : F
    //   4118: aload_0
    //   4119: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4122: getfield rotateAngleY : F
    //   4125: f2d
    //   4126: invokestatic sin : (D)D
    //   4129: d2f
    //   4130: ldc 9.0
    //   4132: fmul
    //   4133: aload_0
    //   4134: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4137: getfield rotateAngleX : F
    //   4140: f2d
    //   4141: invokestatic cos : (D)D
    //   4144: d2f
    //   4145: fmul
    //   4146: fsub
    //   4147: putfield rotationPointX : F
    //   4150: aload_0
    //   4151: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   4154: aload_0
    //   4155: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   4158: aload_0
    //   4159: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   4162: aload_0
    //   4163: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   4166: aload_0
    //   4167: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   4170: getfield rotationPointX : F
    //   4173: dup_x1
    //   4174: putfield rotationPointX : F
    //   4177: dup_x1
    //   4178: putfield rotationPointX : F
    //   4181: dup_x1
    //   4182: putfield rotationPointX : F
    //   4185: putfield rotationPointX : F
    //   4188: aload_0
    //   4189: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4192: aload_0
    //   4193: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4196: getfield rotationPointY : F
    //   4199: aload_0
    //   4200: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4203: getfield rotateAngleX : F
    //   4206: f2d
    //   4207: invokestatic sin : (D)D
    //   4210: d2f
    //   4211: ldc 9.0
    //   4213: fmul
    //   4214: fadd
    //   4215: putfield rotationPointY : F
    //   4218: aload_0
    //   4219: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4222: aload_0
    //   4223: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4226: getfield rotationPointZ : F
    //   4229: aload_0
    //   4230: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4233: getfield rotateAngleX : F
    //   4236: f2d
    //   4237: invokestatic cos : (D)D
    //   4240: d2f
    //   4241: ldc 9.0
    //   4243: fmul
    //   4244: fsub
    //   4245: putfield rotationPointZ : F
    //   4248: aload_0
    //   4249: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4252: aload_0
    //   4253: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4256: getfield rotationPointX : F
    //   4259: aload_0
    //   4260: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4263: getfield rotateAngleY : F
    //   4266: f2d
    //   4267: invokestatic sin : (D)D
    //   4270: d2f
    //   4271: ldc 9.0
    //   4273: fmul
    //   4274: aload_0
    //   4275: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4278: getfield rotateAngleX : F
    //   4281: f2d
    //   4282: invokestatic cos : (D)D
    //   4285: d2f
    //   4286: fmul
    //   4287: fsub
    //   4288: putfield rotationPointX : F
    //   4291: aload_0
    //   4292: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4295: aload_0
    //   4296: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4299: getfield rotationPointY : F
    //   4302: aload_0
    //   4303: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4306: getfield rotateAngleX : F
    //   4309: f2d
    //   4310: invokestatic sin : (D)D
    //   4313: d2f
    //   4314: ldc 9.0
    //   4316: fmul
    //   4317: fadd
    //   4318: putfield rotationPointY : F
    //   4321: aload_0
    //   4322: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4325: aload_0
    //   4326: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4329: getfield rotationPointZ : F
    //   4332: aload_0
    //   4333: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4336: getfield rotateAngleX : F
    //   4339: f2d
    //   4340: invokestatic cos : (D)D
    //   4343: d2f
    //   4344: ldc 9.0
    //   4346: fmul
    //   4347: fsub
    //   4348: putfield rotationPointZ : F
    //   4351: aload_0
    //   4352: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4355: aload_0
    //   4356: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4359: getfield rotationPointX : F
    //   4362: aload_0
    //   4363: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4366: getfield rotateAngleY : F
    //   4369: f2d
    //   4370: invokestatic sin : (D)D
    //   4373: d2f
    //   4374: ldc 9.0
    //   4376: fmul
    //   4377: aload_0
    //   4378: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   4381: getfield rotateAngleX : F
    //   4384: f2d
    //   4385: invokestatic cos : (D)D
    //   4388: d2f
    //   4389: fmul
    //   4390: fsub
    //   4391: putfield rotationPointX : F
    //   4394: aload_0
    //   4395: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4398: aload_0
    //   4399: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4402: getfield rotationPointY : F
    //   4405: aload_0
    //   4406: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4409: getfield rotateAngleX : F
    //   4412: f2d
    //   4413: invokestatic sin : (D)D
    //   4416: d2f
    //   4417: ldc 9.0
    //   4419: fmul
    //   4420: fadd
    //   4421: putfield rotationPointY : F
    //   4424: aload_0
    //   4425: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   4428: aload_0
    //   4429: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4432: aload_0
    //   4433: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   4436: aload_0
    //   4437: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4440: aload_0
    //   4441: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4444: getfield rotationPointY : F
    //   4447: dup_x1
    //   4448: putfield rotationPointY : F
    //   4451: dup_x1
    //   4452: putfield rotationPointY : F
    //   4455: dup_x1
    //   4456: putfield rotationPointY : F
    //   4459: putfield rotationPointY : F
    //   4462: aload_0
    //   4463: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4466: aload_0
    //   4467: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4470: getfield rotationPointZ : F
    //   4473: aload_0
    //   4474: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4477: getfield rotateAngleX : F
    //   4480: f2d
    //   4481: invokestatic cos : (D)D
    //   4484: d2f
    //   4485: ldc 9.0
    //   4487: fmul
    //   4488: fsub
    //   4489: putfield rotationPointZ : F
    //   4492: aload_0
    //   4493: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   4496: aload_0
    //   4497: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4500: aload_0
    //   4501: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   4504: aload_0
    //   4505: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4508: aload_0
    //   4509: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4512: getfield rotationPointZ : F
    //   4515: dup_x1
    //   4516: putfield rotationPointZ : F
    //   4519: dup_x1
    //   4520: putfield rotationPointZ : F
    //   4523: dup_x1
    //   4524: putfield rotationPointZ : F
    //   4527: putfield rotationPointZ : F
    //   4530: aload_0
    //   4531: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4534: aload_0
    //   4535: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4538: getfield rotationPointX : F
    //   4541: aload_0
    //   4542: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4545: getfield rotateAngleY : F
    //   4548: f2d
    //   4549: invokestatic sin : (D)D
    //   4552: d2f
    //   4553: ldc 9.0
    //   4555: fmul
    //   4556: aload_0
    //   4557: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4560: getfield rotateAngleX : F
    //   4563: f2d
    //   4564: invokestatic cos : (D)D
    //   4567: d2f
    //   4568: fmul
    //   4569: fsub
    //   4570: putfield rotationPointX : F
    //   4573: aload_0
    //   4574: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   4577: aload_0
    //   4578: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   4581: aload_0
    //   4582: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   4585: aload_0
    //   4586: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   4589: aload_0
    //   4590: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   4593: getfield rotationPointX : F
    //   4596: dup_x1
    //   4597: putfield rotationPointX : F
    //   4600: dup_x1
    //   4601: putfield rotationPointX : F
    //   4604: dup_x1
    //   4605: putfield rotationPointX : F
    //   4608: putfield rotationPointX : F
    //   4611: aload #8
    //   4613: aload #9
    //   4615: invokevirtual setRenderInfo : (Ldanger/orespawn/RenderInfo;)V
    //   4618: aload_0
    //   4619: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   4622: fload #7
    //   4624: invokevirtual render : (F)V
    //   4627: aload_0
    //   4628: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4631: fload #7
    //   4633: invokevirtual render : (F)V
    //   4636: aload_0
    //   4637: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4640: fload #7
    //   4642: invokevirtual render : (F)V
    //   4645: aload_0
    //   4646: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4649: fload #7
    //   4651: invokevirtual render : (F)V
    //   4654: aload_0
    //   4655: getfield body2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4658: fload #7
    //   4660: invokevirtual render : (F)V
    //   4663: aload_0
    //   4664: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4667: fload #7
    //   4669: invokevirtual render : (F)V
    //   4672: aload_0
    //   4673: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4676: fload #7
    //   4678: invokevirtual render : (F)V
    //   4681: aload_0
    //   4682: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4685: fload #7
    //   4687: invokevirtual render : (F)V
    //   4690: aload_0
    //   4691: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4694: fload #7
    //   4696: invokevirtual render : (F)V
    //   4699: aload_0
    //   4700: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4703: fload #7
    //   4705: invokevirtual render : (F)V
    //   4708: aload_0
    //   4709: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4712: fload #7
    //   4714: invokevirtual render : (F)V
    //   4717: aload_0
    //   4718: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4721: fload #7
    //   4723: invokevirtual render : (F)V
    //   4726: aload_0
    //   4727: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4730: fload #7
    //   4732: invokevirtual render : (F)V
    //   4735: aload_0
    //   4736: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4739: fload #7
    //   4741: invokevirtual render : (F)V
    //   4744: aload_0
    //   4745: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4748: fload #7
    //   4750: invokevirtual render : (F)V
    //   4753: aload_0
    //   4754: getfield neck1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4757: fload #7
    //   4759: invokevirtual render : (F)V
    //   4762: aload_0
    //   4763: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4766: fload #7
    //   4768: invokevirtual render : (F)V
    //   4771: aload_0
    //   4772: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4775: fload #7
    //   4777: invokevirtual render : (F)V
    //   4780: aload_0
    //   4781: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4784: fload #7
    //   4786: invokevirtual render : (F)V
    //   4789: aload_0
    //   4790: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4793: fload #7
    //   4795: invokevirtual render : (F)V
    //   4798: aload_0
    //   4799: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4802: fload #7
    //   4804: invokevirtual render : (F)V
    //   4807: aload_0
    //   4808: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4811: fload #7
    //   4813: invokevirtual render : (F)V
    //   4816: aload_0
    //   4817: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4820: fload #7
    //   4822: invokevirtual render : (F)V
    //   4825: aload_0
    //   4826: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4829: fload #7
    //   4831: invokevirtual render : (F)V
    //   4834: aload_0
    //   4835: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4838: fload #7
    //   4840: invokevirtual render : (F)V
    //   4843: aload_0
    //   4844: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4847: fload #7
    //   4849: invokevirtual render : (F)V
    //   4852: aload_0
    //   4853: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4856: fload #7
    //   4858: invokevirtual render : (F)V
    //   4861: aload_0
    //   4862: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4865: fload #7
    //   4867: invokevirtual render : (F)V
    //   4870: aload_0
    //   4871: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4874: fload #7
    //   4876: invokevirtual render : (F)V
    //   4879: aload_0
    //   4880: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4883: fload #7
    //   4885: invokevirtual render : (F)V
    //   4888: aload_0
    //   4889: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4892: fload #7
    //   4894: invokevirtual render : (F)V
    //   4897: aload_0
    //   4898: getfield lshoulder : Lnet/minecraft/client/model/ModelRenderer;
    //   4901: fload #7
    //   4903: invokevirtual render : (F)V
    //   4906: aload_0
    //   4907: getfield rshoulder : Lnet/minecraft/client/model/ModelRenderer;
    //   4910: fload #7
    //   4912: invokevirtual render : (F)V
    //   4915: aload_0
    //   4916: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4919: fload #7
    //   4921: invokevirtual render : (F)V
    //   4924: aload_0
    //   4925: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4928: fload #7
    //   4930: invokevirtual render : (F)V
    //   4933: aload_0
    //   4934: getfield neck4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4937: fload #7
    //   4939: invokevirtual render : (F)V
    //   4942: aload_0
    //   4943: getfield neck5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4946: fload #7
    //   4948: invokevirtual render : (F)V
    //   4951: aload_0
    //   4952: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4955: fload #7
    //   4957: invokevirtual render : (F)V
    //   4960: aload_0
    //   4961: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4964: fload #7
    //   4966: invokevirtual render : (F)V
    //   4969: aload_0
    //   4970: getfield wing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4973: fload #7
    //   4975: invokevirtual render : (F)V
    //   4978: aload_0
    //   4979: getfield rwing4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4982: fload #7
    //   4984: invokevirtual render : (F)V
    //   4987: aload_0
    //   4988: getfield Tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4991: fload #7
    //   4993: invokevirtual render : (F)V
    //   4996: aload_0
    //   4997: getfield Tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5000: fload #7
    //   5002: invokevirtual render : (F)V
    //   5005: aload_0
    //   5006: getfield Tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5009: fload #7
    //   5011: invokevirtual render : (F)V
    //   5014: aload_0
    //   5015: getfield headfin : Lnet/minecraft/client/model/ModelRenderer;
    //   5018: fload #7
    //   5020: invokevirtual render : (F)V
    //   5023: aload_0
    //   5024: getfield backfin1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5027: fload #7
    //   5029: invokevirtual render : (F)V
    //   5032: aload_0
    //   5033: getfield backfin2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5036: fload #7
    //   5038: invokevirtual render : (F)V
    //   5041: aload_0
    //   5042: getfield neck3L : Lnet/minecraft/client/model/ModelRenderer;
    //   5045: fload #7
    //   5047: invokevirtual render : (F)V
    //   5050: aload_0
    //   5051: getfield neck4L : Lnet/minecraft/client/model/ModelRenderer;
    //   5054: fload #7
    //   5056: invokevirtual render : (F)V
    //   5059: aload_0
    //   5060: getfield neck3R : Lnet/minecraft/client/model/ModelRenderer;
    //   5063: fload #7
    //   5065: invokevirtual render : (F)V
    //   5068: aload_0
    //   5069: getfield neck4R : Lnet/minecraft/client/model/ModelRenderer;
    //   5072: fload #7
    //   5074: invokevirtual render : (F)V
    //   5077: aload_0
    //   5078: getfield neck5L : Lnet/minecraft/client/model/ModelRenderer;
    //   5081: fload #7
    //   5083: invokevirtual render : (F)V
    //   5086: aload_0
    //   5087: getfield neck5R : Lnet/minecraft/client/model/ModelRenderer;
    //   5090: fload #7
    //   5092: invokevirtual render : (F)V
    //   5095: aload_0
    //   5096: getfield jaw5L : Lnet/minecraft/client/model/ModelRenderer;
    //   5099: fload #7
    //   5101: invokevirtual render : (F)V
    //   5104: aload_0
    //   5105: getfield jaw5R : Lnet/minecraft/client/model/ModelRenderer;
    //   5108: fload #7
    //   5110: invokevirtual render : (F)V
    //   5113: aload_0
    //   5114: getfield head7L : Lnet/minecraft/client/model/ModelRenderer;
    //   5117: fload #7
    //   5119: invokevirtual render : (F)V
    //   5122: aload_0
    //   5123: getfield headfinL : Lnet/minecraft/client/model/ModelRenderer;
    //   5126: fload #7
    //   5128: invokevirtual render : (F)V
    //   5131: aload_0
    //   5132: getfield headfinR : Lnet/minecraft/client/model/ModelRenderer;
    //   5135: fload #7
    //   5137: invokevirtual render : (F)V
    //   5140: aload_0
    //   5141: getfield head7R : Lnet/minecraft/client/model/ModelRenderer;
    //   5144: fload #7
    //   5146: invokevirtual render : (F)V
    //   5149: aload_0
    //   5150: getfield jaw1L : Lnet/minecraft/client/model/ModelRenderer;
    //   5153: fload #7
    //   5155: invokevirtual render : (F)V
    //   5158: aload_0
    //   5159: getfield jaw1R : Lnet/minecraft/client/model/ModelRenderer;
    //   5162: fload #7
    //   5164: invokevirtual render : (F)V
    //   5167: aload_0
    //   5168: getfield head3L : Lnet/minecraft/client/model/ModelRenderer;
    //   5171: fload #7
    //   5173: invokevirtual render : (F)V
    //   5176: aload_0
    //   5177: getfield head3R : Lnet/minecraft/client/model/ModelRenderer;
    //   5180: fload #7
    //   5182: invokevirtual render : (F)V
    //   5185: invokestatic glPushMatrix : ()V
    //   5188: sipush #2977
    //   5191: invokestatic glEnable : (I)V
    //   5194: sipush #3042
    //   5197: invokestatic glEnable : (I)V
    //   5200: sipush #770
    //   5203: sipush #771
    //   5206: invokestatic glBlendFunc : (II)V
    //   5209: ldc_w 0.75
    //   5212: ldc_w 0.75
    //   5215: ldc_w 0.75
    //   5218: ldc_w 0.55
    //   5221: invokestatic glColor4f : (FFFF)V
    //   5224: aload_0
    //   5225: getfield mem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5228: fload #7
    //   5230: invokevirtual render : (F)V
    //   5233: aload_0
    //   5234: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5237: fload #7
    //   5239: invokevirtual render : (F)V
    //   5242: aload_0
    //   5243: getfield rmem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5246: fload #7
    //   5248: invokevirtual render : (F)V
    //   5251: aload_0
    //   5252: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5255: fload #7
    //   5257: invokevirtual render : (F)V
    //   5260: aload_0
    //   5261: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5264: fload #7
    //   5266: invokevirtual render : (F)V
    //   5269: aload_0
    //   5270: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5273: fload #7
    //   5275: invokevirtual render : (F)V
    //   5278: aload_0
    //   5279: getfield mem4 : Lnet/minecraft/client/model/ModelRenderer;
    //   5282: fload #7
    //   5284: invokevirtual render : (F)V
    //   5287: aload_0
    //   5288: getfield rmem4 : Lnet/minecraft/client/model/ModelRenderer;
    //   5291: fload #7
    //   5293: invokevirtual render : (F)V
    //   5296: sipush #3042
    //   5299: invokestatic glDisable : (I)V
    //   5302: invokestatic glPopMatrix : ()V
    //   5305: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #526	-> 0
    //   #527	-> 6
    //   #528	-> 9
    //   #529	-> 12
    //   #530	-> 15
    //   #531	-> 18
    //   #532	-> 21
    //   #533	-> 24
    //   #534	-> 27
    //   #535	-> 32
    //   #536	-> 37
    //   #540	-> 42
    //   #542	-> 49
    //   #543	-> 64
    //   #546	-> 79
    //   #550	-> 86
    //   #551	-> 100
    //   #553	-> 129
    //   #555	-> 153
    //   #556	-> 159
    //   #558	-> 183
    //   #559	-> 191
    //   #562	-> 215
    //   #563	-> 228
    //   #564	-> 245
    //   #565	-> 258
    //   #566	-> 271
    //   #567	-> 301
    //   #569	-> 331
    //   #570	-> 345
    //   #571	-> 359
    //   #572	-> 373
    //   #573	-> 387
    //   #574	-> 401
    //   #576	-> 415
    //   #577	-> 429
    //   #578	-> 447
    //   #579	-> 461
    //   #580	-> 475
    //   #581	-> 505
    //   #583	-> 535
    //   #584	-> 549
    //   #585	-> 563
    //   #586	-> 577
    //   #587	-> 591
    //   #588	-> 605
    //   #592	-> 619
    //   #593	-> 628
    //   #594	-> 654
    //   #595	-> 686
    //   #596	-> 690
    //   #597	-> 694
    //   #599	-> 700
    //   #600	-> 703
    //   #601	-> 706
    //   #602	-> 709
    //   #603	-> 712
    //   #606	-> 715
    //   #607	-> 723
    //   #608	-> 743
    //   #609	-> 769
    //   #610	-> 773
    //   #611	-> 777
    //   #614	-> 780
    //   #616	-> 794
    //   #617	-> 798
    //   #618	-> 803
    //   #619	-> 808
    //   #622	-> 813
    //   #623	-> 819
    //   #626	-> 824
    //   #627	-> 837
    //   #628	-> 850
    //   #629	-> 863
    //   #630	-> 896
    //   #632	-> 926
    //   #633	-> 957
    //   #635	-> 990
    //   #636	-> 1004
    //   #637	-> 1018
    //   #638	-> 1032
    //   #639	-> 1046
    //   #640	-> 1060
    //   #641	-> 1074
    //   #642	-> 1088
    //   #644	-> 1102
    //   #645	-> 1111
    //   #646	-> 1120
    //   #647	-> 1129
    //   #648	-> 1138
    //   #651	-> 1147
    //   #652	-> 1161
    //   #653	-> 1175
    //   #654	-> 1189
    //   #655	-> 1222
    //   #657	-> 1252
    //   #658	-> 1283
    //   #660	-> 1316
    //   #661	-> 1330
    //   #662	-> 1344
    //   #663	-> 1358
    //   #664	-> 1372
    //   #665	-> 1386
    //   #666	-> 1400
    //   #667	-> 1414
    //   #669	-> 1428
    //   #670	-> 1437
    //   #671	-> 1446
    //   #672	-> 1455
    //   #673	-> 1464
    //   #677	-> 1473
    //   #678	-> 1481
    //   #679	-> 1486
    //   #681	-> 1491
    //   #682	-> 1499
    //   #684	-> 1502
    //   #685	-> 1533
    //   #686	-> 1564
    //   #687	-> 1595
    //   #688	-> 1625
    //   #689	-> 1655
    //   #690	-> 1685
    //   #691	-> 1717
    //   #692	-> 1747
    //   #693	-> 1777
    //   #694	-> 1810
    //   #695	-> 1838
    //   #696	-> 1844
    //   #697	-> 1874
    //   #698	-> 1904
    //   #699	-> 1921
    //   #700	-> 1951
    //   #701	-> 1981
    //   #702	-> 2012
    //   #703	-> 2043
    //   #704	-> 2073
    //   #705	-> 2104
    //   #706	-> 2135
    //   #710	-> 2157
    //   #713	-> 2166
    //   #714	-> 2182
    //   #715	-> 2187
    //   #716	-> 2209
    //   #717	-> 2229
    //   #718	-> 2249
    //   #722	-> 2256
    //   #723	-> 2271
    //   #724	-> 2286
    //   #725	-> 2293
    //   #726	-> 2302
    //   #728	-> 2314
    //   #729	-> 2323
    //   #731	-> 2332
    //   #732	-> 2346
    //   #733	-> 2360
    //   #734	-> 2374
    //   #735	-> 2388
    //   #736	-> 2402
    //   #737	-> 2419
    //   #738	-> 2437
    //   #740	-> 2453
    //   #741	-> 2467
    //   #742	-> 2481
    //   #743	-> 2495
    //   #744	-> 2509
    //   #745	-> 2523
    //   #746	-> 2540
    //   #747	-> 2558
    //   #749	-> 2574
    //   #750	-> 2588
    //   #751	-> 2602
    //   #752	-> 2616
    //   #753	-> 2630
    //   #754	-> 2644
    //   #755	-> 2661
    //   #756	-> 2679
    //   #759	-> 2695
    //   #760	-> 2704
    //   #761	-> 2712
    //   #762	-> 2736
    //   #763	-> 2744
    //   #764	-> 2768
    //   #765	-> 2776
    //   #766	-> 2800
    //   #768	-> 2811
    //   #769	-> 2835
    //   #770	-> 2843
    //   #771	-> 2867
    //   #772	-> 2875
    //   #773	-> 2899
    //   #776	-> 2907
    //   #777	-> 2921
    //   #778	-> 2935
    //   #779	-> 2953
    //   #780	-> 2970
    //   #782	-> 2987
    //   #783	-> 3001
    //   #784	-> 3015
    //   #785	-> 3033
    //   #786	-> 3050
    //   #788	-> 3067
    //   #789	-> 3081
    //   #790	-> 3095
    //   #791	-> 3113
    //   #792	-> 3130
    //   #797	-> 3147
    //   #798	-> 3155
    //   #799	-> 3163
    //   #801	-> 3171
    //   #802	-> 3190
    //   #803	-> 3213
    //   #804	-> 3228
    //   #805	-> 3247
    //   #806	-> 3270
    //   #807	-> 3285
    //   #808	-> 3304
    //   #809	-> 3327
    //   #826	-> 3342
    //   #827	-> 3372
    //   #828	-> 3402
    //   #829	-> 3445
    //   #830	-> 3475
    //   #831	-> 3505
    //   #832	-> 3548
    //   #833	-> 3578
    //   #834	-> 3616
    //   #835	-> 3646
    //   #836	-> 3684
    //   #837	-> 3727
    //   #839	-> 3765
    //   #840	-> 3795
    //   #841	-> 3825
    //   #842	-> 3868
    //   #843	-> 3898
    //   #844	-> 3928
    //   #845	-> 3971
    //   #846	-> 4001
    //   #847	-> 4039
    //   #848	-> 4069
    //   #849	-> 4107
    //   #850	-> 4150
    //   #852	-> 4188
    //   #853	-> 4218
    //   #854	-> 4248
    //   #855	-> 4291
    //   #856	-> 4321
    //   #857	-> 4351
    //   #858	-> 4394
    //   #859	-> 4424
    //   #860	-> 4462
    //   #861	-> 4492
    //   #862	-> 4530
    //   #863	-> 4573
    //   #866	-> 4611
    //   #869	-> 4618
    //   #870	-> 4627
    //   #871	-> 4636
    //   #872	-> 4645
    //   #873	-> 4654
    //   #874	-> 4663
    //   #875	-> 4672
    //   #876	-> 4681
    //   #877	-> 4690
    //   #878	-> 4699
    //   #879	-> 4708
    //   #880	-> 4717
    //   #881	-> 4726
    //   #882	-> 4735
    //   #883	-> 4744
    //   #884	-> 4753
    //   #885	-> 4762
    //   #886	-> 4771
    //   #887	-> 4780
    //   #888	-> 4789
    //   #889	-> 4798
    //   #890	-> 4807
    //   #891	-> 4816
    //   #892	-> 4825
    //   #893	-> 4834
    //   #894	-> 4843
    //   #895	-> 4852
    //   #896	-> 4861
    //   #897	-> 4870
    //   #898	-> 4879
    //   #899	-> 4888
    //   #900	-> 4897
    //   #901	-> 4906
    //   #902	-> 4915
    //   #903	-> 4924
    //   #904	-> 4933
    //   #905	-> 4942
    //   #906	-> 4951
    //   #907	-> 4960
    //   #908	-> 4969
    //   #909	-> 4978
    //   #910	-> 4987
    //   #911	-> 4996
    //   #912	-> 5005
    //   #913	-> 5014
    //   #914	-> 5023
    //   #915	-> 5032
    //   #916	-> 5041
    //   #917	-> 5050
    //   #918	-> 5059
    //   #919	-> 5068
    //   #920	-> 5077
    //   #921	-> 5086
    //   #922	-> 5095
    //   #923	-> 5104
    //   #924	-> 5113
    //   #925	-> 5122
    //   #926	-> 5131
    //   #927	-> 5140
    //   #928	-> 5149
    //   #929	-> 5158
    //   #930	-> 5167
    //   #931	-> 5176
    //   #933	-> 5185
    //   #934	-> 5188
    //   #935	-> 5194
    //   #936	-> 5200
    //   #938	-> 5209
    //   #939	-> 5224
    //   #940	-> 5233
    //   #941	-> 5242
    //   #942	-> 5251
    //   #943	-> 5260
    //   #944	-> 5269
    //   #945	-> 5278
    //   #946	-> 5287
    //   #947	-> 5296
    //   #948	-> 5302
    //   #949	-> 5305
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5306	0	this	Ldanger/orespawn/ModelThePrinceTeen;
    //   0	5306	1	entity	Lnet/minecraft/entity/Entity;
    //   0	5306	2	f	F
    //   0	5306	3	f1	F
    //   0	5306	4	f2	F
    //   0	5306	5	f3	F
    //   0	5306	6	f4	F
    //   0	5306	7	f5	F
    //   6	5300	8	c	Ldanger/orespawn/ThePrinceTeen;
    //   9	5297	9	r	Ldanger/orespawn/RenderInfo;
    //   12	5294	10	hf	F
    //   15	5291	11	newangle	F
    //   18	5288	12	newangle2	F
    //   21	5285	13	rnewangle	F
    //   24	5282	14	rnewangle2	F
    //   27	5279	15	clawangle	F
    //   32	5274	16	tailspeed	F
    //   37	5269	17	tailamp	F
    //   42	5264	18	pi4	F
    //   2271	3035	19	h1	F
    //   2269	3037	20	h2	F
    //   2266	3040	21	h3	F
    //   2286	3020	22	d1	F
    //   2284	3022	23	d2	F
    //   2281	3025	24	d3	F
    //   2704	2602	25	Ljx	F
    //   2699	2607	26	Rjx	F
    //   2702	2604	27	jx	F
    //   49	5257	28	current_activity	I
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
