package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPitchBlack extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer lclaw1;
  
  ModelRenderer body;
  
  ModelRenderer leftleg1;
  
  ModelRenderer tail1;
  
  ModelRenderer leftleg2;
  
  ModelRenderer body2;
  
  ModelRenderer leftleg3;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer lclaw2;
  
  ModelRenderer lclaw3;
  
  ModelRenderer lclaw4;
  
  ModelRenderer lclaw5;
  
  ModelRenderer lclaw6;
  
  ModelRenderer lclaw7;
  
  ModelRenderer tail4;
  
  ModelRenderer tail5;
  
  ModelRenderer tail6;
  
  ModelRenderer tail7;
  
  ModelRenderer tail8;
  
  ModelRenderer tail9;
  
  ModelRenderer tailpoint1;
  
  ModelRenderer tailpoint2;
  
  ModelRenderer llegspike;
  
  ModelRenderer tailspike1;
  
  ModelRenderer tailspike2;
  
  ModelRenderer tailspike3;
  
  ModelRenderer tailspike4;
  
  ModelRenderer tailspike5;
  
  ModelRenderer tailspike6;
  
  ModelRenderer neck1;
  
  ModelRenderer neck2;
  
  ModelRenderer neck3;
  
  ModelRenderer head1;
  
  ModelRenderer leye;
  
  ModelRenderer reye;
  
  ModelRenderer head2;
  
  ModelRenderer head3;
  
  ModelRenderer head4;
  
  ModelRenderer head5;
  
  ModelRenderer head6;
  
  ModelRenderer jaw1;
  
  ModelRenderer jaw2;
  
  ModelRenderer jaw3;
  
  ModelRenderer jaw4;
  
  ModelRenderer tooth1;
  
  ModelRenderer tooth2;
  
  ModelRenderer tooth3;
  
  ModelRenderer tooth4;
  
  ModelRenderer tooth5;
  
  ModelRenderer jaw5;
  
  ModelRenderer head7;
  
  ModelRenderer tooth6;
  
  ModelRenderer tooth7;
  
  ModelRenderer tooth8;
  
  ModelRenderer tooth9;
  
  ModelRenderer tooth10;
  
  ModelRenderer tooth11;
  
  ModelRenderer tooth12;
  
  ModelRenderer tooth13;
  
  ModelRenderer rightleg1;
  
  ModelRenderer rightleg2;
  
  ModelRenderer tooth14;
  
  ModelRenderer tooth15;
  
  ModelRenderer tooth16;
  
  ModelRenderer tooth17;
  
  ModelRenderer tooth18;
  
  ModelRenderer tooth19;
  
  ModelRenderer tooth20;
  
  ModelRenderer tooth21;
  
  ModelRenderer tooth22;
  
  ModelRenderer tooth23;
  
  ModelRenderer rightleg3;
  
  ModelRenderer llegspike2;
  
  ModelRenderer rclaw2;
  
  ModelRenderer rclaw4;
  
  ModelRenderer rclaw1;
  
  ModelRenderer rclaw5;
  
  ModelRenderer rclaw7;
  
  ModelRenderer rclaw3;
  
  ModelRenderer rclaw6;
  
  ModelRenderer wing1;
  
  ModelRenderer wing2;
  
  ModelRenderer wing3;
  
  ModelRenderer mem1;
  
  ModelRenderer mem2;
  
  ModelRenderer mem3;
  
  ModelRenderer wingclaw1;
  
  ModelRenderer wingclaw2;
  
  ModelRenderer wingclaw3;
  
  ModelRenderer lshoulder;
  
  ModelRenderer rshoulder;
  
  ModelRenderer rwing1;
  
  ModelRenderer rmem1;
  
  ModelRenderer rwing2;
  
  ModelRenderer rmem2;
  
  ModelRenderer rwing3;
  
  ModelRenderer rmem3;
  
  ModelRenderer rwingclaw1;
  
  ModelRenderer rwingclaw2;
  
  ModelRenderer rwingclaw3;
  
  public ModelPitchBlack(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.lclaw1 = new ModelRenderer(this, 300, 111);
    this.lclaw1.addBox(-3.0F, 0.0F, -3.0F, 2, 3, 6);
    this.lclaw1.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw1.setTextureSize(512, 256);
    this.lclaw1.mirror = true;
    setRotation(this.lclaw1, 0.0F, 0.6632251F, 0.0F);
    this.body = new ModelRenderer(this, 400, 26);
    this.body.addBox(-6.0F, -12.0F, -9.0F, 12, 12, 9);
    this.body.setRotationPoint(0.0F, 0.0F, 9.0F);
    this.body.setTextureSize(512, 256);
    this.body.mirror = true;
    setRotation(this.body, 0.0698132F, 0.0F, 0.0F);
    this.leftleg1 = new ModelRenderer(this, 300, 10);
    this.leftleg1.addBox(-1.0F, -5.0F, -20.0F, 5, 10, 10);
    this.leftleg1.setRotationPoint(7.0F, 5.0F, 23.0F);
    this.leftleg1.setTextureSize(512, 256);
    this.leftleg1.mirror = true;
    setRotation(this.leftleg1, -0.5759587F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 400, 82);
    this.tail1.addBox(-5.0F, -6.0F, 0.0F, 8, 10, 12);
    this.tail1.setRotationPoint(1.0F, -3.0F, 22.0F);
    this.tail1.setTextureSize(512, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, -0.1745329F, 0.0F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 300, 31);
    this.leftleg2.addBox(-1.0F, -10.0F, -4.0F, 4, 12, 5);
    this.leftleg2.setRotationPoint(7.0F, 5.0F, 23.0F);
    this.leftleg2.setTextureSize(512, 256);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, 0.9773844F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 400, 50);
    this.body2.addBox(0.0F, -3.0F, -3.0F, 12, 14, 16);
    this.body2.setRotationPoint(-6.0F, -9.0F, 10.0F);
    this.body2.setTextureSize(512, 256);
    this.body2.mirror = true;
    setRotation(this.body2, -0.1047198F, 0.0F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 300, 51);
    this.leftleg3.addBox(-1.0F, -19.0F, 1.0F, 3, 18, 4);
    this.leftleg3.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.leftleg3.setTextureSize(512, 256);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, -0.5235988F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 400, 106);
    this.tail2.addBox(-3.0F, -4.0F, 0.0F, 6, 8, 10);
    this.tail2.setRotationPoint(0.0F, -2.0F, 33.0F);
    this.tail2.setTextureSize(512, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.1396263F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 400, 126);
    this.tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 10);
    this.tail3.setRotationPoint(0.0F, -1.0F, 42.0F);
    this.tail3.setTextureSize(512, 256);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.1396263F, 0.0F, 0.0F);
    this.lclaw2 = new ModelRenderer(this, 300, 76);
    this.lclaw2.addBox(-1.0F, -1.0F, -6.0F, 3, 4, 13);
    this.lclaw2.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw2.setTextureSize(512, 256);
    this.lclaw2.mirror = true;
    setRotation(this.lclaw2, 0.0F, 0.0F, 0.0F);
    this.lclaw3 = new ModelRenderer(this, 300, 95);
    this.lclaw3.addBox(2.0F, 0.0F, -6.0F, 2, 3, 10);
    this.lclaw3.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw3.setTextureSize(512, 256);
    this.lclaw3.mirror = true;
    setRotation(this.lclaw3, 0.0F, -0.6632251F, 0.0F);
    this.lclaw4 = new ModelRenderer(this, 310, 123);
    this.lclaw4.addBox(0.0F, 1.0F, -9.0F, 1, 2, 3);
    this.lclaw4.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw4.setTextureSize(512, 256);
    this.lclaw4.mirror = true;
    setRotation(this.lclaw4, 0.0F, 0.0F, 0.0F);
    this.lclaw5 = new ModelRenderer(this, 300, 123);
    this.lclaw5.addBox(-2.5F, 1.0F, -5.0F, 1, 2, 2);
    this.lclaw5.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw5.setTextureSize(512, 256);
    this.lclaw5.mirror = true;
    setRotation(this.lclaw5, 0.0F, 0.6632251F, 0.0F);
    this.lclaw6 = new ModelRenderer(this, 322, 123);
    this.lclaw6.addBox(2.5F, 1.0F, -9.0F, 1, 2, 3);
    this.lclaw6.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.lclaw6.setTextureSize(512, 256);
    this.lclaw6.mirror = true;
    setRotation(this.lclaw6, 0.0F, -0.6632251F, 0.0F);
    this.lclaw7 = new ModelRenderer(this, 333, 123);
    this.lclaw7.addBox(0.0F, 1.0F, 7.0F, 1, 2, 3);
    this.lclaw7.setRotationPoint(7.0F, 21.0F, 11.0F);
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
    this.tail5.setRotationPoint(0.0F, 1.0F, 59.0F);
    this.tail5.setTextureSize(512, 256);
    this.tail5.mirror = true;
    setRotation(this.tail5, -0.1396263F, 0.0F, 0.0F);
    this.tail6 = new ModelRenderer(this, 400, 180);
    this.tail6.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
    this.tail6.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tail6.setTextureSize(512, 256);
    this.tail6.mirror = true;
    setRotation(this.tail6, -0.1396263F, 0.1745329F, 0.0F);
    this.tail7 = new ModelRenderer(this, 400, 180);
    this.tail7.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 10);
    this.tail7.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tail7.setTextureSize(512, 256);
    this.tail7.mirror = true;
    setRotation(this.tail7, -0.1396263F, -0.1745329F, 0.0F);
    this.tail8 = new ModelRenderer(this, 400, 180);
    this.tail8.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
    this.tail8.setRotationPoint(-4.0F, 1.0F, 77.0F);
    this.tail8.setTextureSize(512, 256);
    this.tail8.mirror = true;
    setRotation(this.tail8, -0.1396263F, -0.1745329F, 0.0F);
    this.tail9 = new ModelRenderer(this, 400, 180);
    this.tail9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
    this.tail9.setRotationPoint(2.0F, 1.0F, 77.0F);
    this.tail9.setTextureSize(512, 256);
    this.tail9.mirror = true;
    setRotation(this.tail9, -0.1396263F, 0.1745329F, 0.0F);
    this.tailpoint1 = new ModelRenderer(this, 400, 200);
    this.tailpoint1.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 22);
    this.tailpoint1.setRotationPoint(5.0F, 3.0F, 85.0F);
    this.tailpoint1.setTextureSize(512, 256);
    this.tailpoint1.mirror = true;
    setRotation(this.tailpoint1, -0.1919862F, 0.1745329F, 0.0F);
    this.tailpoint2 = new ModelRenderer(this, 400, 200);
    this.tailpoint2.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 22);
    this.tailpoint2.setRotationPoint(-4.0F, 3.0F, 86.0F);
    this.tailpoint2.setTextureSize(512, 256);
    this.tailpoint2.mirror = true;
    setRotation(this.tailpoint2, -0.1919862F, -0.1745329F, 0.0F);
    this.llegspike = new ModelRenderer(this, 300, 131);
    this.llegspike.addBox(0.0F, -28.0F, 1.0F, 1, 12, 1);
    this.llegspike.setRotationPoint(7.0F, 21.0F, 11.0F);
    this.llegspike.setTextureSize(512, 256);
    this.llegspike.mirror = true;
    setRotation(this.llegspike, -0.6981317F, 0.0F, 0.0F);
    this.tailspike1 = new ModelRenderer(this, 400, 230);
    this.tailspike1.addBox(1.0F, -1.0F, 0.0F, 1, 1, 1);
    this.tailspike1.setRotationPoint(2.0F, 1.0F, 77.0F);
    this.tailspike1.setTextureSize(512, 256);
    this.tailspike1.mirror = true;
    setRotation(this.tailspike1, -0.1396263F, 0.1745329F, 0.0F);
    this.tailspike2 = new ModelRenderer(this, 400, 230);
    this.tailspike2.addBox(1.0F, -1.0F, 6.0F, 1, 1, 1);
    this.tailspike2.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tailspike2.setTextureSize(512, 256);
    this.tailspike2.mirror = true;
    setRotation(this.tailspike2, -0.1396263F, 0.1745329F, 0.0F);
    this.tailspike3 = new ModelRenderer(this, 400, 230);
    this.tailspike3.addBox(1.0F, -1.0F, 2.0F, 1, 1, 1);
    this.tailspike3.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tailspike3.setTextureSize(512, 256);
    this.tailspike3.mirror = true;
    setRotation(this.tailspike3, -0.1396263F, 0.1745329F, 0.0F);
    this.tailspike4 = new ModelRenderer(this, 400, 230);
    this.tailspike4.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1);
    this.tailspike4.setRotationPoint(-4.0F, 1.0F, 77.0F);
    this.tailspike4.setTextureSize(512, 256);
    this.tailspike4.mirror = true;
    setRotation(this.tailspike4, -0.1396263F, -0.1745329F, 0.0F);
    this.tailspike5 = new ModelRenderer(this, 400, 230);
    this.tailspike5.addBox(-2.0F, -1.0F, 6.0F, 1, 1, 1);
    this.tailspike5.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tailspike5.setTextureSize(512, 256);
    this.tailspike5.mirror = true;
    setRotation(this.tailspike5, -0.1396263F, -0.1745329F, 0.0F);
    this.tailspike6 = new ModelRenderer(this, 400, 230);
    this.tailspike6.addBox(-2.0F, -1.0F, 2.0F, 1, 1, 1);
    this.tailspike6.setRotationPoint(0.0F, 0.0F, 68.0F);
    this.tailspike6.setTextureSize(512, 256);
    this.tailspike6.mirror = true;
    setRotation(this.tailspike6, -0.1396263F, -0.1745329F, 0.0F);
    this.neck1 = new ModelRenderer(this, 400, 7);
    this.neck1.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 8);
    this.neck1.setRotationPoint(0.0F, -4.0F, -5.0F);
    this.neck1.setTextureSize(512, 256);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.0872665F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 375, 10);
    this.neck2.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 4);
    this.neck2.setRotationPoint(0.0F, -4.0F, -5.0F);
    this.neck2.setTextureSize(512, 256);
    this.neck2.mirror = true;
    setRotation(this.neck2, -0.0523599F, 0.0F, 0.0F);
    this.neck3 = new ModelRenderer(this, 375, 23);
    this.neck3.addBox(-2.0F, -2.0F, -6.0F, 4, 4, 8);
    this.neck3.setRotationPoint(0.0F, -4.0F, -9.0F);
    this.neck3.setTextureSize(512, 256);
    this.neck3.mirror = true;
    setRotation(this.neck3, -0.2443461F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 123, 3);
    this.head1.addBox(-18.0F, -1.0F, -12.0F, 36, 1, 12);
    this.head1.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head1.setTextureSize(512, 256);
    this.head1.mirror = true;
    setRotation(this.head1, -0.2443461F, 0.0F, 0.0F);
    this.leye = new ModelRenderer(this, 76, 2);
    this.leye.addBox(18.0F, -1.0F, -13.0F, 3, 3, 15);
    this.leye.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.leye.setTextureSize(512, 256);
    this.leye.mirror = true;
    setRotation(this.leye, -0.2443461F, 0.0F, 0.0F);
    this.reye = new ModelRenderer(this, 32, 2);
    this.reye.addBox(-21.0F, -1.0F, -13.0F, 3, 3, 15);
    this.reye.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.reye.setTextureSize(512, 256);
    this.reye.mirror = true;
    setRotation(this.reye, -0.2443461F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 140, 18);
    this.head2.addBox(-8.0F, -2.0F, -11.0F, 16, 1, 11);
    this.head2.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head2.setTextureSize(512, 256);
    this.head2.mirror = true;
    setRotation(this.head2, -0.2443461F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 143, 32);
    this.head3.addBox(-2.0F, -4.0F, -14.0F, 4, 4, 16);
    this.head3.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head3.setTextureSize(512, 256);
    this.head3.mirror = true;
    setRotation(this.head3, -0.2443461F, 0.0F, 0.0F);
    this.head4 = new ModelRenderer(this, 152, 55);
    this.head4.addBox(-1.0F, -10.0F, -13.0F, 2, 8, 12);
    this.head4.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head4.setTextureSize(512, 256);
    this.head4.mirror = true;
    setRotation(this.head4, -0.3665191F, 0.0F, 0.0F);
    this.head5 = new ModelRenderer(this, 154, 77);
    this.head5.addBox(-0.5F, -18.0F, -11.0F, 1, 9, 9);
    this.head5.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head5.setTextureSize(512, 256);
    this.head5.mirror = true;
    setRotation(this.head5, -0.4363323F, 0.0F, 0.0F);
    this.head6 = new ModelRenderer(this, 160, 97);
    this.head6.addBox(-0.5F, -24.0F, -10.0F, 1, 8, 4);
    this.head6.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head6.setTextureSize(512, 256);
    this.head6.mirror = true;
    setRotation(this.head6, -0.6632251F, 0.0F, 0.0F);
    this.jaw1 = new ModelRenderer(this, 143, 114);
    this.jaw1.addBox(-2.0F, 1.0F, -14.0F, 4, 4, 15);
    this.jaw1.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.jaw1.setTextureSize(512, 256);
    this.jaw1.mirror = true;
    setRotation(this.jaw1, 0.1919862F, 0.0F, 0.0F);
    this.jaw2 = new ModelRenderer(this, 150, 149);
    this.jaw2.addBox(-1.0F, 4.0F, -12.0F, 2, 5, 11);
    this.jaw2.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.jaw2.setTextureSize(512, 256);
    this.jaw2.mirror = true;
    setRotation(this.jaw2, 0.2617994F, 0.0F, 0.0F);
    this.jaw3 = new ModelRenderer(this, 154, 168);
    this.jaw3.addBox(-0.5F, 8.0F, -10.0F, 1, 4, 8);
    this.jaw3.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.jaw3.setTextureSize(512, 256);
    this.jaw3.mirror = true;
    setRotation(this.jaw3, 0.3316126F, 0.0F, 0.0F);
    this.jaw4 = new ModelRenderer(this, 158, 182);
    this.jaw4.addBox(-0.5F, 11.0F, -7.0F, 1, 4, 4);
    this.jaw4.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.jaw4.setTextureSize(512, 256);
    this.jaw4.mirror = true;
    setRotation(this.jaw4, 0.4014257F, 0.0F, 0.0F);
    this.tooth1 = new ModelRenderer(this, 0, 0);
    this.tooth1.addBox(-2.0F, 0.0F, -14.0F, 1, 3, 1);
    this.tooth1.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth1.setTextureSize(512, 256);
    this.tooth1.mirror = true;
    setRotation(this.tooth1, -0.2443461F, 0.0F, 0.0F);
    this.tooth2 = new ModelRenderer(this, 0, 0);
    this.tooth2.addBox(-0.5F, 0.0F, -14.0F, 1, 2, 1);
    this.tooth2.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth2.setTextureSize(512, 256);
    this.tooth2.mirror = true;
    setRotation(this.tooth2, -0.2443461F, 0.0F, 0.0F);
    this.tooth3 = new ModelRenderer(this, 0, 0);
    this.tooth3.addBox(1.0F, 0.0F, -14.0F, 1, 3, 1);
    this.tooth3.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth3.setTextureSize(512, 256);
    this.tooth3.mirror = true;
    setRotation(this.tooth3, -0.2443461F, 0.0F, 0.0F);
    this.tooth4 = new ModelRenderer(this, 0, 0);
    this.tooth4.addBox(-2.0F, 0.0F, -12.0F, 1, 3, 1);
    this.tooth4.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth4.setTextureSize(512, 256);
    this.tooth4.mirror = true;
    setRotation(this.tooth4, -0.2443461F, 0.0F, 0.0F);
    this.tooth5 = new ModelRenderer(this, 0, 0);
    this.tooth5.addBox(1.0F, 0.0F, -12.0F, 1, 3, 1);
    this.tooth5.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth5.setTextureSize(512, 256);
    this.tooth5.mirror = true;
    setRotation(this.tooth5, -0.2443461F, 0.0F, 0.0F);
    this.jaw5 = new ModelRenderer(this, 151, 135);
    this.jaw5.addBox(-3.0F, 1.0F, -4.0F, 6, 5, 7);
    this.jaw5.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.jaw5.setTextureSize(512, 256);
    this.jaw5.mirror = true;
    setRotation(this.jaw5, 0.1919862F, 0.0F, 0.0F);
    this.head7 = new ModelRenderer(this, 185, 34);
    this.head7.addBox(-3.0F, -5.0F, -3.0F, 6, 5, 7);
    this.head7.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.head7.setTextureSize(512, 256);
    this.head7.mirror = true;
    setRotation(this.head7, -0.2443461F, 0.0F, 0.0F);
    this.tooth6 = new ModelRenderer(this, 0, 0);
    this.tooth6.addBox(-2.0F, 0.0F, -10.0F, 1, 2, 1);
    this.tooth6.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth6.setTextureSize(512, 256);
    this.tooth6.mirror = true;
    setRotation(this.tooth6, -0.2443461F, 0.0F, 0.0F);
    this.tooth7 = new ModelRenderer(this, 0, 0);
    this.tooth7.addBox(1.0F, 0.0F, -10.0F, 1, 2, 1);
    this.tooth7.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth7.setTextureSize(512, 256);
    this.tooth7.mirror = true;
    setRotation(this.tooth7, -0.2443461F, 0.0F, 0.0F);
    this.tooth8 = new ModelRenderer(this, 0, 0);
    this.tooth8.addBox(-2.0F, 0.0F, -8.0F, 1, 2, 1);
    this.tooth8.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth8.setTextureSize(512, 256);
    this.tooth8.mirror = true;
    setRotation(this.tooth8, -0.2443461F, 0.0F, 0.0F);
    this.tooth9 = new ModelRenderer(this, 0, 0);
    this.tooth9.addBox(1.0F, 0.0F, -8.0F, 1, 2, 1);
    this.tooth9.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth9.setTextureSize(512, 256);
    this.tooth9.mirror = true;
    setRotation(this.tooth9, -0.2443461F, 0.0F, 0.0F);
    this.tooth10 = new ModelRenderer(this, 0, 0);
    this.tooth10.addBox(-2.0F, 0.0F, -6.0F, 1, 2, 1);
    this.tooth10.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth10.setTextureSize(512, 256);
    this.tooth10.mirror = true;
    setRotation(this.tooth10, -0.2443461F, 0.0F, 0.0F);
    this.tooth11 = new ModelRenderer(this, 0, 0);
    this.tooth11.addBox(1.0F, 0.0F, -6.0F, 1, 2, 1);
    this.tooth11.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth11.setTextureSize(512, 256);
    this.tooth11.mirror = true;
    setRotation(this.tooth11, -0.2443461F, 0.0F, 0.0F);
    this.tooth12 = new ModelRenderer(this, 0, 0);
    this.tooth12.addBox(-2.0F, 0.0F, -4.0F, 1, 1, 1);
    this.tooth12.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth12.setTextureSize(512, 256);
    this.tooth12.mirror = true;
    setRotation(this.tooth12, -0.2443461F, 0.0F, 0.0F);
    this.tooth13 = new ModelRenderer(this, -1, 0);
    this.tooth13.addBox(1.0F, 0.0F, -4.0F, 1, 1, 1);
    this.tooth13.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth13.setTextureSize(512, 256);
    this.tooth13.mirror = true;
    setRotation(this.tooth13, -0.2443461F, 0.0F, 0.0F);
    this.rightleg1 = new ModelRenderer(this, 250, 10);
    this.rightleg1.addBox(-1.0F, -5.0F, -20.0F, 5, 10, 10);
    this.rightleg1.setRotationPoint(-10.0F, 5.0F, 23.0F);
    this.rightleg1.setTextureSize(512, 256);
    this.rightleg1.mirror = true;
    setRotation(this.rightleg1, -0.5934119F, 0.0F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 250, 32);
    this.rightleg2.addBox(0.0F, -10.0F, -4.0F, 4, 12, 5);
    this.rightleg2.setRotationPoint(-10.0F, 5.0F, 23.0F);
    this.rightleg2.setTextureSize(512, 256);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, 0.9773844F, 0.0F, 0.0F);
    this.tooth14 = new ModelRenderer(this, 0, 0);
    this.tooth14.addBox(0.5F, -2.0F, -14.0F, 1, 3, 1);
    this.tooth14.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth14.setTextureSize(512, 256);
    this.tooth14.mirror = true;
    setRotation(this.tooth14, 0.1919862F, 0.0F, 0.0F);
    this.tooth15 = new ModelRenderer(this, 0, 0);
    this.tooth15.addBox(-1.5F, -2.0F, -14.0F, 1, 3, 1);
    this.tooth15.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth15.setTextureSize(512, 256);
    this.tooth15.mirror = true;
    setRotation(this.tooth15, 0.1919862F, 0.0F, 0.0F);
    this.tooth16 = new ModelRenderer(this, 0, 0);
    this.tooth16.addBox(1.0F, -1.0F, -12.0F, 1, 2, 1);
    this.tooth16.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth16.setTextureSize(512, 256);
    this.tooth16.mirror = true;
    setRotation(this.tooth16, 0.1919862F, 0.0F, 0.0F);
    this.tooth17 = new ModelRenderer(this, 0, 0);
    this.tooth17.addBox(-2.0F, -1.0F, -12.0F, 1, 2, 1);
    this.tooth17.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth17.setTextureSize(512, 256);
    this.tooth17.mirror = true;
    setRotation(this.tooth17, 0.1919862F, 0.0F, 0.0F);
    this.tooth18 = new ModelRenderer(this, 0, 0);
    this.tooth18.addBox(1.0F, -1.0F, -10.0F, 1, 2, 1);
    this.tooth18.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth18.setTextureSize(512, 256);
    this.tooth18.mirror = true;
    setRotation(this.tooth18, 0.1919862F, 0.0F, 0.0F);
    this.tooth19 = new ModelRenderer(this, 0, 0);
    this.tooth19.addBox(-2.0F, -1.0F, -10.0F, 1, 2, 1);
    this.tooth19.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth19.setTextureSize(512, 256);
    this.tooth19.mirror = true;
    setRotation(this.tooth19, 0.1919862F, 0.0F, 0.0F);
    this.tooth20 = new ModelRenderer(this, 0, 0);
    this.tooth20.addBox(-2.0F, -1.0F, -8.0F, 1, 2, 1);
    this.tooth20.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth20.setTextureSize(512, 256);
    this.tooth20.mirror = true;
    setRotation(this.tooth20, 0.1919862F, 0.0F, 0.0F);
    this.tooth21 = new ModelRenderer(this, 0, 0);
    this.tooth21.addBox(1.0F, -1.0F, -8.0F, 1, 2, 1);
    this.tooth21.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth21.setTextureSize(512, 256);
    this.tooth21.mirror = true;
    setRotation(this.tooth21, 0.1919862F, 0.0F, 0.0F);
    this.tooth22 = new ModelRenderer(this, 0, 0);
    this.tooth22.addBox(1.0F, 0.0F, -6.0F, 1, 1, 1);
    this.tooth22.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth22.setTextureSize(512, 256);
    this.tooth22.mirror = true;
    setRotation(this.tooth22, 0.1919862F, 0.0F, 0.0F);
    this.tooth23 = new ModelRenderer(this, 0, 0);
    this.tooth23.addBox(-2.0F, 0.0F, -6.0F, 1, 1, 1);
    this.tooth23.setRotationPoint(0.0F, -6.0F, -14.0F);
    this.tooth23.setTextureSize(512, 256);
    this.tooth23.mirror = true;
    setRotation(this.tooth23, 0.1919862F, 0.0F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 250, 52);
    this.rightleg3.addBox(-1.0F, -19.0F, 1.0F, 3, 18, 4);
    this.rightleg3.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rightleg3.setTextureSize(512, 256);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, -0.5235988F, 0.0F, 0.0F);
    this.llegspike2 = new ModelRenderer(this, 250, 130);
    this.llegspike2.addBox(0.0F, -28.0F, 1.0F, 1, 12, 1);
    this.llegspike2.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.llegspike2.setTextureSize(512, 256);
    this.llegspike2.mirror = true;
    setRotation(this.llegspike2, -0.6981317F, 0.0F, 0.0F);
    this.rclaw2 = new ModelRenderer(this, 250, 76);
    this.rclaw2.addBox(-1.0F, -1.0F, -6.0F, 3, 4, 13);
    this.rclaw2.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw2.setTextureSize(512, 256);
    this.rclaw2.mirror = true;
    setRotation(this.rclaw2, 0.0F, 0.0F, 0.0F);
    this.rclaw4 = new ModelRenderer(this, 250, 123);
    this.rclaw4.addBox(0.0F, 1.0F, -9.0F, 1, 2, 3);
    this.rclaw4.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw4.setTextureSize(512, 256);
    this.rclaw4.mirror = true;
    setRotation(this.rclaw4, 0.0F, 0.0F, 0.0F);
    this.rclaw1 = new ModelRenderer(this, 250, 111);
    this.rclaw1.addBox(2.0F, 0.0F, -4.0F, 2, 3, 6);
    this.rclaw1.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw1.setTextureSize(512, 256);
    this.rclaw1.mirror = true;
    setRotation(this.rclaw1, 0.0F, -0.6632251F, 0.0F);
    this.rclaw5 = new ModelRenderer(this, 261, 123);
    this.rclaw5.addBox(2.5F, 1.0F, -6.0F, 1, 2, 2);
    this.rclaw5.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw5.setTextureSize(512, 256);
    this.rclaw5.mirror = true;
    setRotation(this.rclaw5, 0.0F, -0.6632251F, 0.0F);
    this.rclaw7 = new ModelRenderer(this, 283, 123);
    this.rclaw7.addBox(0.0F, 1.0F, 7.0F, 1, 2, 3);
    this.rclaw7.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw7.setTextureSize(512, 256);
    this.rclaw7.mirror = true;
    setRotation(this.rclaw7, 0.0F, 0.0F, 0.0F);
    this.rclaw3 = new ModelRenderer(this, 250, 95);
    this.rclaw3.addBox(-3.0F, 0.0F, -6.0F, 2, 3, 10);
    this.rclaw3.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw3.setTextureSize(512, 256);
    this.rclaw3.mirror = true;
    setRotation(this.rclaw3, 0.0F, 0.6632251F, 0.0F);
    this.rclaw6 = new ModelRenderer(this, 270, 123);
    this.rclaw6.addBox(-2.5F, 1.0F, -9.0F, 1, 2, 3);
    this.rclaw6.setRotationPoint(-8.0F, 21.0F, 11.0F);
    this.rclaw6.setTextureSize(512, 256);
    this.rclaw6.mirror = true;
    setRotation(this.rclaw6, 0.0F, 0.6632251F, 0.0F);
    this.wing1 = new ModelRenderer(this, 10, 30);
    this.wing1.addBox(-1.0F, -1.0F, -1.0F, 23, 3, 3);
    this.wing1.setRotationPoint(6.0F, -12.0F, 3.0F);
    this.wing1.setTextureSize(512, 256);
    this.wing1.mirror = true;
    setRotation(this.wing1, 0.0F, 0.0872665F, -0.1396263F);
    this.wing2 = new ModelRenderer(this, 10, 40);
    this.wing2.addBox(-1.0F, -1.0F, -1.0F, 44, 2, 2);
    this.wing2.setRotationPoint(27.0F, -15.0F, 1.0F);
    this.wing2.setTextureSize(512, 256);
    this.wing2.mirror = true;
    setRotation(this.wing2, 0.0F, 0.0F, 0.0F);
    this.wing3 = new ModelRenderer(this, 10, 50);
    this.wing3.addBox(-1.0F, -1.0F, -1.0F, 23, 2, 2);
    this.wing3.setRotationPoint(70.0F, -15.0F, 1.0F);
    this.wing3.setTextureSize(512, 256);
    this.wing3.mirror = true;
    setRotation(this.wing3, 0.0F, -0.0872665F, 0.1745329F);
    this.mem1 = new ModelRenderer(this, 10, 60);
    this.mem1.addBox(-2.0F, 0.0F, 0.0F, 24, 1, 21);
    this.mem1.setRotationPoint(6.0F, -12.0F, 3.0F);
    this.mem1.setTextureSize(512, 256);
    this.mem1.mirror = true;
    setRotation(this.mem1, 0.0F, 0.0872665F, -0.1396263F);
    this.mem2 = new ModelRenderer(this, 10, 85);
    this.mem2.addBox(0.0F, 0.0F, 0.0F, 43, 1, 21);
    this.mem2.setRotationPoint(27.0F, -15.0F, 1.0F);
    this.mem2.setTextureSize(512, 256);
    this.mem2.mirror = true;
    setRotation(this.mem2, 0.0F, 0.0F, 0.0F);
    this.mem3 = new ModelRenderer(this, 10, 110);
    this.mem3.addBox(0.0F, 0.0F, 0.0F, 23, 1, 21);
    this.mem3.setRotationPoint(70.0F, -15.0F, 1.0F);
    this.mem3.setTextureSize(512, 256);
    this.mem3.mirror = true;
    setRotation(this.mem3, 0.0F, -0.0872665F, 0.1745329F);
    this.wingclaw1 = new ModelRenderer(this, 85, 49);
    this.wingclaw1.addBox(0.0F, 0.0F, -9.0F, 1, 1, 8);
    this.wingclaw1.setRotationPoint(70.0F, -15.0F, 1.0F);
    this.wingclaw1.setTextureSize(512, 256);
    this.wingclaw1.mirror = true;
    setRotation(this.wingclaw1, 0.0F, 0.0F, 0.0F);
    this.wingclaw2 = new ModelRenderer(this, 67, 50);
    this.wingclaw2.addBox(0.0F, 0.0F, -7.0F, 1, 1, 6);
    this.wingclaw2.setRotationPoint(70.0F, -15.0F, 1.0F);
    this.wingclaw2.setTextureSize(512, 256);
    this.wingclaw2.mirror = true;
    setRotation(this.wingclaw2, 0.0F, 0.6108652F, 0.0F);
    this.wingclaw3 = new ModelRenderer(this, 106, 50);
    this.wingclaw3.addBox(1.0F, 0.0F, -7.0F, 1, 1, 5);
    this.wingclaw3.setRotationPoint(69.0F, -15.0F, 1.0F);
    this.wingclaw3.setTextureSize(512, 256);
    this.wingclaw3.mirror = true;
    setRotation(this.wingclaw3, 0.0F, -0.6108652F, 0.0F);
    this.lshoulder = new ModelRenderer(this, 370, 40);
    this.lshoulder.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6);
    this.lshoulder.setRotationPoint(3.0F, -13.0F, 1.0F);
    this.lshoulder.setTextureSize(512, 256);
    this.lshoulder.mirror = true;
    setRotation(this.lshoulder, 0.0698132F, 0.0F, 0.0F);
    this.rshoulder = new ModelRenderer(this, 370, 50);
    this.rshoulder.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6);
    this.rshoulder.setRotationPoint(-6.0F, -13.0F, 1.0F);
    this.rshoulder.setTextureSize(512, 256);
    this.rshoulder.mirror = true;
    setRotation(this.rshoulder, 0.0698132F, 0.0F, 0.0F);
    this.rwing1 = new ModelRenderer(this, 10, 140);
    this.rwing1.addBox(-22.0F, -1.0F, -1.0F, 23, 3, 3);
    this.rwing1.setRotationPoint(-6.0F, -12.0F, 3.0F);
    this.rwing1.setTextureSize(512, 256);
    this.rwing1.mirror = true;
    setRotation(this.rwing1, 0.0F, -0.0872665F, 0.1396263F);
    this.rmem1 = new ModelRenderer(this, 10, 170);
    this.rmem1.addBox(-22.0F, 0.0F, 0.0F, 24, 1, 21);
    this.rmem1.setRotationPoint(-6.0F, -12.0F, 3.0F);
    this.rmem1.setTextureSize(512, 256);
    this.rmem1.mirror = true;
    setRotation(this.rmem1, 0.0F, -0.0872665F, 0.1396263F);
    this.rwing2 = new ModelRenderer(this, 10, 150);
    this.rwing2.addBox(-43.0F, -1.0F, -1.0F, 44, 2, 2);
    this.rwing2.setRotationPoint(-27.0F, -15.0F, 1.0F);
    this.rwing2.setTextureSize(512, 256);
    this.rwing2.mirror = true;
    setRotation(this.rwing2, 0.0F, 0.0F, 0.0F);
    this.rmem2 = new ModelRenderer(this, 10, 195);
    this.rmem2.addBox(-43.0F, 0.0F, 0.0F, 43, 1, 21);
    this.rmem2.setRotationPoint(-27.0F, -15.0F, 1.0F);
    this.rmem2.setTextureSize(512, 256);
    this.rmem2.mirror = true;
    setRotation(this.rmem2, 0.0F, 0.0F, 0.0F);
    this.rwing3 = new ModelRenderer(this, 10, 160);
    this.rwing3.addBox(-22.0F, -1.0F, -1.0F, 23, 2, 2);
    this.rwing3.setRotationPoint(-70.0F, -15.0F, 1.0F);
    this.rwing3.setTextureSize(512, 256);
    this.rwing3.mirror = true;
    setRotation(this.rwing3, 0.0F, 0.0872665F, -0.1745329F);
    this.rmem3 = new ModelRenderer(this, 10, 220);
    this.rmem3.addBox(-23.0F, 0.0F, 0.0F, 23, 1, 21);
    this.rmem3.setRotationPoint(-70.0F, -15.0F, 1.0F);
    this.rmem3.setTextureSize(512, 256);
    this.rmem3.mirror = true;
    setRotation(this.rmem3, 0.0F, 0.0872665F, -0.1745329F);
    this.rwingclaw1 = new ModelRenderer(this, 81, 157);
    this.rwingclaw1.addBox(0.0F, 0.0F, -9.0F, 1, 1, 8);
    this.rwingclaw1.setRotationPoint(-70.0F, -15.0F, 1.0F);
    this.rwingclaw1.setTextureSize(512, 256);
    this.rwingclaw1.mirror = true;
    setRotation(this.rwingclaw1, 0.0F, 0.0F, 0.0F);
    this.rwingclaw2 = new ModelRenderer(this, 64, 160);
    this.rwingclaw2.addBox(0.0F, 0.0F, -7.0F, 1, 1, 6);
    this.rwingclaw2.setRotationPoint(-70.0F, -15.0F, 1.0F);
    this.rwingclaw2.setTextureSize(512, 256);
    this.rwingclaw2.mirror = true;
    setRotation(this.rwingclaw2, 0.0F, -0.6108652F, 0.0F);
    this.rwingclaw3 = new ModelRenderer(this, 103, 159);
    this.rwingclaw3.addBox(0.0F, 0.0F, -6.0F, 1, 1, 5);
    this.rwingclaw3.setRotationPoint(-70.0F, -15.0F, 1.0F);
    this.rwingclaw3.setTextureSize(512, 256);
    this.rwingclaw3.mirror = true;
    setRotation(this.rwingclaw3, 0.0F, 0.6108652F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast danger/orespawn/PitchBlack
    //   4: astore #8
    //   6: fconst_0
    //   7: fstore #9
    //   9: fconst_0
    //   10: fstore #10
    //   12: aconst_null
    //   13: astore #11
    //   15: ldc_w 0.76
    //   18: fstore #12
    //   20: ldc_w 0.25
    //   23: fstore #13
    //   25: ldc_w 0.7853982
    //   28: fstore #14
    //   30: aload #8
    //   32: invokevirtual getPitchBlackScale : ()F
    //   35: fstore #17
    //   37: aload_0
    //   38: aload_1
    //   39: fload_2
    //   40: fload_3
    //   41: fload #4
    //   43: fload #5
    //   45: fload #6
    //   47: fload #7
    //   49: invokespecial render : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   52: aload_0
    //   53: fload_2
    //   54: fload_3
    //   55: fload #4
    //   57: fload #5
    //   59: fload #6
    //   61: fload #7
    //   63: aload_1
    //   64: invokevirtual setRotationAngles : (FFFFFFLnet/minecraft/entity/Entity;)V
    //   67: aload #8
    //   69: invokevirtual getRenderInfo : ()Ldanger/orespawn/RenderInfo;
    //   72: astore #11
    //   74: aload #8
    //   76: invokevirtual getActivity : ()I
    //   79: ifeq -> 112
    //   82: fload #4
    //   84: ldc_w 0.45
    //   87: fmul
    //   88: aload_0
    //   89: getfield wingspeed : F
    //   92: fmul
    //   93: fload #17
    //   95: fdiv
    //   96: invokestatic cos : (F)F
    //   99: ldc_w 3.1415927
    //   102: fmul
    //   103: ldc_w 0.24
    //   106: fmul
    //   107: fstore #9
    //   109: goto -> 143
    //   112: fload #14
    //   114: fneg
    //   115: fload #4
    //   117: ldc_w 0.05
    //   120: fmul
    //   121: aload_0
    //   122: getfield wingspeed : F
    //   125: fmul
    //   126: fload #17
    //   128: fdiv
    //   129: invokestatic cos : (F)F
    //   132: ldc_w 3.1415927
    //   135: fmul
    //   136: ldc_w 0.02
    //   139: fmul
    //   140: fadd
    //   141: fstore #9
    //   143: aload_0
    //   144: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   147: fload #9
    //   149: putfield rotateAngleZ : F
    //   152: aload_0
    //   153: getfield mem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   156: fload #9
    //   158: putfield rotateAngleZ : F
    //   161: aload_0
    //   162: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   165: fload #9
    //   167: ldc 5.0
    //   169: fmul
    //   170: ldc 3.0
    //   172: fdiv
    //   173: putfield rotateAngleZ : F
    //   176: aload_0
    //   177: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   180: aload_0
    //   181: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   184: getfield rotationPointY : F
    //   187: aload_0
    //   188: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   191: getfield rotateAngleZ : F
    //   194: f2d
    //   195: invokestatic sin : (D)D
    //   198: d2f
    //   199: ldc 21.0
    //   201: fmul
    //   202: fadd
    //   203: putfield rotationPointY : F
    //   206: aload_0
    //   207: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   210: aload_0
    //   211: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   214: getfield rotationPointX : F
    //   217: aload_0
    //   218: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   221: getfield rotateAngleZ : F
    //   224: f2d
    //   225: invokestatic cos : (D)D
    //   228: d2f
    //   229: ldc 21.0
    //   231: fmul
    //   232: fadd
    //   233: putfield rotationPointX : F
    //   236: aload_0
    //   237: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   240: fload #9
    //   242: ldc 5.0
    //   244: fmul
    //   245: ldc 3.0
    //   247: fdiv
    //   248: putfield rotateAngleZ : F
    //   251: aload_0
    //   252: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   255: aload_0
    //   256: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   259: getfield rotationPointY : F
    //   262: putfield rotationPointY : F
    //   265: aload_0
    //   266: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   269: aload_0
    //   270: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   273: getfield rotationPointX : F
    //   276: putfield rotationPointX : F
    //   279: aload_0
    //   280: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   283: fload #9
    //   285: fconst_2
    //   286: fmul
    //   287: putfield rotateAngleZ : F
    //   290: aload_0
    //   291: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   294: aload_0
    //   295: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   298: getfield rotationPointY : F
    //   301: aload_0
    //   302: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   305: getfield rotateAngleZ : F
    //   308: f2d
    //   309: invokestatic sin : (D)D
    //   312: d2f
    //   313: ldc_w 43.0
    //   316: fmul
    //   317: fadd
    //   318: putfield rotationPointY : F
    //   321: aload_0
    //   322: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   325: aload_0
    //   326: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   329: getfield rotationPointX : F
    //   332: aload_0
    //   333: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   336: getfield rotateAngleZ : F
    //   339: f2d
    //   340: invokestatic cos : (D)D
    //   343: d2f
    //   344: ldc_w 43.0
    //   347: fmul
    //   348: fadd
    //   349: putfield rotationPointX : F
    //   352: aload_0
    //   353: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   356: fload #9
    //   358: fconst_2
    //   359: fmul
    //   360: putfield rotateAngleZ : F
    //   363: aload_0
    //   364: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   367: aload_0
    //   368: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   371: getfield rotationPointY : F
    //   374: putfield rotationPointY : F
    //   377: aload_0
    //   378: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   381: aload_0
    //   382: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   385: getfield rotationPointX : F
    //   388: putfield rotationPointX : F
    //   391: aload_0
    //   392: getfield wingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   395: aload_0
    //   396: getfield wingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   399: aload_0
    //   400: getfield wingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   403: fload #9
    //   405: ldc 3.0
    //   407: fmul
    //   408: fconst_2
    //   409: fdiv
    //   410: dup_x1
    //   411: putfield rotateAngleZ : F
    //   414: dup_x1
    //   415: putfield rotateAngleZ : F
    //   418: putfield rotateAngleZ : F
    //   421: aload_0
    //   422: getfield wingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   425: aload_0
    //   426: getfield wingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   429: aload_0
    //   430: getfield wingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   433: aload_0
    //   434: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   437: getfield rotationPointY : F
    //   440: dup_x1
    //   441: putfield rotationPointY : F
    //   444: dup_x1
    //   445: putfield rotationPointY : F
    //   448: putfield rotationPointY : F
    //   451: aload_0
    //   452: getfield wingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   455: aload_0
    //   456: getfield wingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   459: aload_0
    //   460: getfield wingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   463: aload_0
    //   464: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   467: getfield rotationPointX : F
    //   470: dup_x1
    //   471: putfield rotationPointX : F
    //   474: dup_x1
    //   475: putfield rotationPointX : F
    //   478: putfield rotationPointX : F
    //   481: aload_0
    //   482: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   485: fload #9
    //   487: fneg
    //   488: putfield rotateAngleZ : F
    //   491: aload_0
    //   492: getfield rmem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   495: fload #9
    //   497: fneg
    //   498: putfield rotateAngleZ : F
    //   501: aload_0
    //   502: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   505: fload #9
    //   507: fneg
    //   508: ldc 5.0
    //   510: fmul
    //   511: ldc 3.0
    //   513: fdiv
    //   514: putfield rotateAngleZ : F
    //   517: aload_0
    //   518: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   521: aload_0
    //   522: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   525: getfield rotationPointY : F
    //   528: aload_0
    //   529: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   532: getfield rotateAngleZ : F
    //   535: f2d
    //   536: invokestatic sin : (D)D
    //   539: d2f
    //   540: ldc 21.0
    //   542: fmul
    //   543: fsub
    //   544: putfield rotationPointY : F
    //   547: aload_0
    //   548: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   551: aload_0
    //   552: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   555: getfield rotationPointX : F
    //   558: aload_0
    //   559: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   562: getfield rotateAngleZ : F
    //   565: f2d
    //   566: invokestatic cos : (D)D
    //   569: d2f
    //   570: ldc 21.0
    //   572: fmul
    //   573: fsub
    //   574: putfield rotationPointX : F
    //   577: aload_0
    //   578: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   581: fload #9
    //   583: fneg
    //   584: ldc 5.0
    //   586: fmul
    //   587: ldc 3.0
    //   589: fdiv
    //   590: putfield rotateAngleZ : F
    //   593: aload_0
    //   594: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   597: aload_0
    //   598: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   601: getfield rotationPointY : F
    //   604: putfield rotationPointY : F
    //   607: aload_0
    //   608: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   611: aload_0
    //   612: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   615: getfield rotationPointX : F
    //   618: putfield rotationPointX : F
    //   621: aload_0
    //   622: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   625: fload #9
    //   627: fneg
    //   628: fconst_2
    //   629: fmul
    //   630: putfield rotateAngleZ : F
    //   633: aload_0
    //   634: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   637: aload_0
    //   638: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   641: getfield rotationPointY : F
    //   644: aload_0
    //   645: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   648: getfield rotateAngleZ : F
    //   651: f2d
    //   652: invokestatic sin : (D)D
    //   655: d2f
    //   656: ldc_w 43.0
    //   659: fmul
    //   660: fsub
    //   661: putfield rotationPointY : F
    //   664: aload_0
    //   665: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   668: aload_0
    //   669: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   672: getfield rotationPointX : F
    //   675: aload_0
    //   676: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   679: getfield rotateAngleZ : F
    //   682: f2d
    //   683: invokestatic cos : (D)D
    //   686: d2f
    //   687: ldc_w 43.0
    //   690: fmul
    //   691: fsub
    //   692: putfield rotationPointX : F
    //   695: aload_0
    //   696: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   699: fload #9
    //   701: fneg
    //   702: fconst_2
    //   703: fmul
    //   704: putfield rotateAngleZ : F
    //   707: aload_0
    //   708: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   711: aload_0
    //   712: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   715: getfield rotationPointY : F
    //   718: putfield rotationPointY : F
    //   721: aload_0
    //   722: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   725: aload_0
    //   726: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   729: getfield rotationPointX : F
    //   732: putfield rotationPointX : F
    //   735: aload_0
    //   736: getfield rwingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   739: aload_0
    //   740: getfield rwingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   743: aload_0
    //   744: getfield rwingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   747: fload #9
    //   749: fneg
    //   750: ldc 3.0
    //   752: fmul
    //   753: fconst_2
    //   754: fdiv
    //   755: dup_x1
    //   756: putfield rotateAngleZ : F
    //   759: dup_x1
    //   760: putfield rotateAngleZ : F
    //   763: putfield rotateAngleZ : F
    //   766: aload_0
    //   767: getfield rwingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   770: aload_0
    //   771: getfield rwingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   774: aload_0
    //   775: getfield rwingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   778: aload_0
    //   779: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   782: getfield rotationPointY : F
    //   785: dup_x1
    //   786: putfield rotationPointY : F
    //   789: dup_x1
    //   790: putfield rotationPointY : F
    //   793: putfield rotationPointY : F
    //   796: aload_0
    //   797: getfield rwingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   800: aload_0
    //   801: getfield rwingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   804: aload_0
    //   805: getfield rwingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   808: aload_0
    //   809: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   812: getfield rotationPointX : F
    //   815: dup_x1
    //   816: putfield rotationPointX : F
    //   819: dup_x1
    //   820: putfield rotationPointX : F
    //   823: putfield rotationPointX : F
    //   826: fload #5
    //   828: ldc_w 360.0
    //   831: frem
    //   832: fstore #5
    //   834: aload #8
    //   836: invokevirtual getActivity : ()I
    //   839: ifeq -> 856
    //   842: fload #5
    //   844: ldc_w 0.2
    //   847: fmul
    //   848: dup
    //   849: fstore #5
    //   851: fstore #5
    //   853: goto -> 867
    //   856: fload #5
    //   858: ldc_w 0.55
    //   861: fmul
    //   862: dup
    //   863: fstore #5
    //   865: fstore #5
    //   867: aload_0
    //   868: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   871: fload #5
    //   873: f2d
    //   874: invokestatic toRadians : (D)D
    //   877: d2f
    //   878: ldc_w 0.5
    //   881: fmul
    //   882: putfield rotateAngleY : F
    //   885: aload_0
    //   886: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   889: aload_0
    //   890: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   893: aload_0
    //   894: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   897: aload_0
    //   898: getfield head4 : Lnet/minecraft/client/model/ModelRenderer;
    //   901: fload #5
    //   903: f2d
    //   904: invokestatic toRadians : (D)D
    //   907: d2f
    //   908: dup_x1
    //   909: putfield rotateAngleY : F
    //   912: dup_x1
    //   913: putfield rotateAngleY : F
    //   916: dup_x1
    //   917: putfield rotateAngleY : F
    //   920: putfield rotateAngleY : F
    //   923: aload_0
    //   924: getfield head5 : Lnet/minecraft/client/model/ModelRenderer;
    //   927: aload_0
    //   928: getfield head6 : Lnet/minecraft/client/model/ModelRenderer;
    //   931: aload_0
    //   932: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   935: aload_0
    //   936: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   939: getfield rotateAngleY : F
    //   942: dup_x1
    //   943: putfield rotateAngleY : F
    //   946: dup_x1
    //   947: putfield rotateAngleY : F
    //   950: putfield rotateAngleY : F
    //   953: aload_0
    //   954: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   957: aload_0
    //   958: getfield jaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   961: aload_0
    //   962: getfield jaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   965: aload_0
    //   966: getfield jaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   969: aload_0
    //   970: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   973: aload_0
    //   974: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   977: getfield rotateAngleY : F
    //   980: dup_x1
    //   981: putfield rotateAngleY : F
    //   984: dup_x1
    //   985: putfield rotateAngleY : F
    //   988: dup_x1
    //   989: putfield rotateAngleY : F
    //   992: dup_x1
    //   993: putfield rotateAngleY : F
    //   996: putfield rotateAngleY : F
    //   999: aload_0
    //   1000: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1003: aload_0
    //   1004: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1007: aload_0
    //   1008: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1011: aload_0
    //   1012: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1015: aload_0
    //   1016: getfield tooth5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1019: aload_0
    //   1020: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1023: getfield rotateAngleY : F
    //   1026: dup_x1
    //   1027: putfield rotateAngleY : F
    //   1030: dup_x1
    //   1031: putfield rotateAngleY : F
    //   1034: dup_x1
    //   1035: putfield rotateAngleY : F
    //   1038: dup_x1
    //   1039: putfield rotateAngleY : F
    //   1042: putfield rotateAngleY : F
    //   1045: aload_0
    //   1046: getfield tooth6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1049: aload_0
    //   1050: getfield tooth7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1053: aload_0
    //   1054: getfield tooth8 : Lnet/minecraft/client/model/ModelRenderer;
    //   1057: aload_0
    //   1058: getfield tooth9 : Lnet/minecraft/client/model/ModelRenderer;
    //   1061: aload_0
    //   1062: getfield tooth10 : Lnet/minecraft/client/model/ModelRenderer;
    //   1065: aload_0
    //   1066: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1069: getfield rotateAngleY : F
    //   1072: dup_x1
    //   1073: putfield rotateAngleY : F
    //   1076: dup_x1
    //   1077: putfield rotateAngleY : F
    //   1080: dup_x1
    //   1081: putfield rotateAngleY : F
    //   1084: dup_x1
    //   1085: putfield rotateAngleY : F
    //   1088: putfield rotateAngleY : F
    //   1091: aload_0
    //   1092: getfield tooth11 : Lnet/minecraft/client/model/ModelRenderer;
    //   1095: aload_0
    //   1096: getfield tooth12 : Lnet/minecraft/client/model/ModelRenderer;
    //   1099: aload_0
    //   1100: getfield tooth13 : Lnet/minecraft/client/model/ModelRenderer;
    //   1103: aload_0
    //   1104: getfield tooth14 : Lnet/minecraft/client/model/ModelRenderer;
    //   1107: aload_0
    //   1108: getfield tooth15 : Lnet/minecraft/client/model/ModelRenderer;
    //   1111: aload_0
    //   1112: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1115: getfield rotateAngleY : F
    //   1118: dup_x1
    //   1119: putfield rotateAngleY : F
    //   1122: dup_x1
    //   1123: putfield rotateAngleY : F
    //   1126: dup_x1
    //   1127: putfield rotateAngleY : F
    //   1130: dup_x1
    //   1131: putfield rotateAngleY : F
    //   1134: putfield rotateAngleY : F
    //   1137: aload_0
    //   1138: getfield tooth16 : Lnet/minecraft/client/model/ModelRenderer;
    //   1141: aload_0
    //   1142: getfield tooth17 : Lnet/minecraft/client/model/ModelRenderer;
    //   1145: aload_0
    //   1146: getfield tooth18 : Lnet/minecraft/client/model/ModelRenderer;
    //   1149: aload_0
    //   1150: getfield tooth19 : Lnet/minecraft/client/model/ModelRenderer;
    //   1153: aload_0
    //   1154: getfield tooth20 : Lnet/minecraft/client/model/ModelRenderer;
    //   1157: aload_0
    //   1158: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1161: getfield rotateAngleY : F
    //   1164: dup_x1
    //   1165: putfield rotateAngleY : F
    //   1168: dup_x1
    //   1169: putfield rotateAngleY : F
    //   1172: dup_x1
    //   1173: putfield rotateAngleY : F
    //   1176: dup_x1
    //   1177: putfield rotateAngleY : F
    //   1180: putfield rotateAngleY : F
    //   1183: aload_0
    //   1184: getfield tooth21 : Lnet/minecraft/client/model/ModelRenderer;
    //   1187: aload_0
    //   1188: getfield tooth22 : Lnet/minecraft/client/model/ModelRenderer;
    //   1191: aload_0
    //   1192: getfield tooth23 : Lnet/minecraft/client/model/ModelRenderer;
    //   1195: aload_0
    //   1196: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1199: getfield rotateAngleY : F
    //   1202: dup_x1
    //   1203: putfield rotateAngleY : F
    //   1206: dup_x1
    //   1207: putfield rotateAngleY : F
    //   1210: putfield rotateAngleY : F
    //   1213: aload_0
    //   1214: getfield reye : Lnet/minecraft/client/model/ModelRenderer;
    //   1217: aload_0
    //   1218: getfield leye : Lnet/minecraft/client/model/ModelRenderer;
    //   1221: aload_0
    //   1222: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1225: getfield rotateAngleY : F
    //   1228: dup_x1
    //   1229: putfield rotateAngleY : F
    //   1232: putfield rotateAngleY : F
    //   1235: aload #8
    //   1237: invokevirtual getAttacking : ()I
    //   1240: ifeq -> 1278
    //   1243: fload #4
    //   1245: ldc_w 0.85
    //   1248: fmul
    //   1249: aload_0
    //   1250: getfield wingspeed : F
    //   1253: fmul
    //   1254: invokestatic cos : (F)F
    //   1257: ldc_w 3.1415927
    //   1260: fmul
    //   1261: ldc_w 0.16
    //   1264: fmul
    //   1265: fstore #9
    //   1267: fload #9
    //   1269: ldc_w 0.5
    //   1272: fadd
    //   1273: fstore #9
    //   1275: goto -> 1405
    //   1278: fload #4
    //   1280: ldc_w 0.7
    //   1283: fmul
    //   1284: aload_0
    //   1285: getfield wingspeed : F
    //   1288: fmul
    //   1289: ldc_w 6.2831855
    //   1292: frem
    //   1293: fstore #9
    //   1295: fload #9
    //   1297: invokestatic abs : (F)F
    //   1300: fstore #9
    //   1302: fload #9
    //   1304: aload #11
    //   1306: getfield rf1 : F
    //   1309: fcmpg
    //   1310: ifge -> 1347
    //   1313: aload #11
    //   1315: iconst_0
    //   1316: putfield ri1 : I
    //   1319: aload #8
    //   1321: getfield worldObj : Lnet/minecraft/world/World;
    //   1324: getfield rand : Ljava/util/Random;
    //   1327: bipush #20
    //   1329: invokevirtual nextInt : (I)I
    //   1332: iconst_1
    //   1333: if_icmpne -> 1347
    //   1336: aload #11
    //   1338: dup
    //   1339: getfield ri1 : I
    //   1342: iconst_1
    //   1343: ior
    //   1344: putfield ri1 : I
    //   1347: aload #11
    //   1349: fload #9
    //   1351: putfield rf1 : F
    //   1354: aload #11
    //   1356: getfield ri1 : I
    //   1359: ifeq -> 1397
    //   1362: fload #4
    //   1364: ldc_w 0.85
    //   1367: fmul
    //   1368: aload_0
    //   1369: getfield wingspeed : F
    //   1372: fmul
    //   1373: invokestatic sin : (F)F
    //   1376: ldc_w 3.1415927
    //   1379: fmul
    //   1380: ldc_w 0.16
    //   1383: fmul
    //   1384: fstore #9
    //   1386: fload #9
    //   1388: ldc_w 0.5
    //   1391: fadd
    //   1392: fstore #9
    //   1394: goto -> 1405
    //   1397: fload #14
    //   1399: ldc_w 4.0
    //   1402: fdiv
    //   1403: fstore #9
    //   1405: aload_0
    //   1406: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1409: aload_0
    //   1410: getfield jaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1413: aload_0
    //   1414: getfield jaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1417: aload_0
    //   1418: getfield jaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1421: aload_0
    //   1422: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1425: fload #9
    //   1427: dup_x1
    //   1428: putfield rotateAngleX : F
    //   1431: dup_x1
    //   1432: putfield rotateAngleX : F
    //   1435: dup_x1
    //   1436: putfield rotateAngleX : F
    //   1439: dup_x1
    //   1440: putfield rotateAngleX : F
    //   1443: putfield rotateAngleX : F
    //   1446: aload_0
    //   1447: getfield tooth14 : Lnet/minecraft/client/model/ModelRenderer;
    //   1450: aload_0
    //   1451: getfield tooth15 : Lnet/minecraft/client/model/ModelRenderer;
    //   1454: fload #9
    //   1456: dup_x1
    //   1457: putfield rotateAngleX : F
    //   1460: putfield rotateAngleX : F
    //   1463: aload_0
    //   1464: getfield tooth16 : Lnet/minecraft/client/model/ModelRenderer;
    //   1467: aload_0
    //   1468: getfield tooth17 : Lnet/minecraft/client/model/ModelRenderer;
    //   1471: aload_0
    //   1472: getfield tooth18 : Lnet/minecraft/client/model/ModelRenderer;
    //   1475: aload_0
    //   1476: getfield tooth19 : Lnet/minecraft/client/model/ModelRenderer;
    //   1479: aload_0
    //   1480: getfield tooth20 : Lnet/minecraft/client/model/ModelRenderer;
    //   1483: fload #9
    //   1485: dup_x1
    //   1486: putfield rotateAngleX : F
    //   1489: dup_x1
    //   1490: putfield rotateAngleX : F
    //   1493: dup_x1
    //   1494: putfield rotateAngleX : F
    //   1497: dup_x1
    //   1498: putfield rotateAngleX : F
    //   1501: putfield rotateAngleX : F
    //   1504: aload_0
    //   1505: getfield tooth21 : Lnet/minecraft/client/model/ModelRenderer;
    //   1508: aload_0
    //   1509: getfield tooth22 : Lnet/minecraft/client/model/ModelRenderer;
    //   1512: aload_0
    //   1513: getfield tooth23 : Lnet/minecraft/client/model/ModelRenderer;
    //   1516: fload #9
    //   1518: dup_x1
    //   1519: putfield rotateAngleX : F
    //   1522: dup_x1
    //   1523: putfield rotateAngleX : F
    //   1526: putfield rotateAngleX : F
    //   1529: ldc 7.0
    //   1531: fstore #18
    //   1533: ldc 21.0
    //   1535: fstore #19
    //   1537: ldc_w 12.0
    //   1540: fload #17
    //   1542: fmul
    //   1543: fstore #20
    //   1545: ldc 6.0
    //   1547: fload #17
    //   1549: fmul
    //   1550: fstore #21
    //   1552: aload #8
    //   1554: invokevirtual getActivity : ()I
    //   1557: ifne -> 2587
    //   1560: fconst_0
    //   1561: fstore #15
    //   1563: fconst_0
    //   1564: fstore #16
    //   1566: fload_3
    //   1567: f2d
    //   1568: ldc2_w 0.001
    //   1571: dcmpl
    //   1572: ifle -> 1616
    //   1575: fload #4
    //   1577: ldc_w 0.75
    //   1580: fmul
    //   1581: aload_0
    //   1582: getfield wingspeed : F
    //   1585: fmul
    //   1586: fload #17
    //   1588: fdiv
    //   1589: invokestatic cos : (F)F
    //   1592: fstore #9
    //   1594: fload #4
    //   1596: ldc_w 0.75
    //   1599: fmul
    //   1600: aload_0
    //   1601: getfield wingspeed : F
    //   1604: fmul
    //   1605: fload #17
    //   1607: fdiv
    //   1608: invokestatic sin : (F)F
    //   1611: fstore #15
    //   1613: goto -> 1625
    //   1616: fconst_0
    //   1617: fstore #9
    //   1619: fconst_0
    //   1620: fstore #15
    //   1622: fconst_0
    //   1623: fstore #16
    //   1625: fload #15
    //   1627: fconst_0
    //   1628: fcmpl
    //   1629: ifle -> 1656
    //   1632: fload #15
    //   1634: fload #21
    //   1636: fmul
    //   1637: fload_3
    //   1638: fmul
    //   1639: fstore #16
    //   1641: aload_0
    //   1642: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1645: fload #19
    //   1647: fload #16
    //   1649: fsub
    //   1650: putfield rotationPointY : F
    //   1653: goto -> 1665
    //   1656: aload_0
    //   1657: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1660: fload #19
    //   1662: putfield rotationPointY : F
    //   1665: aload_0
    //   1666: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1669: fload #18
    //   1671: fload #20
    //   1673: fload #9
    //   1675: fmul
    //   1676: fload_3
    //   1677: fmul
    //   1678: fadd
    //   1679: putfield rotationPointZ : F
    //   1682: aload_0
    //   1683: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1686: aload_0
    //   1687: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1690: aload_0
    //   1691: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1694: aload_0
    //   1695: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1698: aload_0
    //   1699: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1702: aload_0
    //   1703: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1706: aload_0
    //   1707: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1710: getfield rotationPointZ : F
    //   1713: dup_x1
    //   1714: putfield rotationPointZ : F
    //   1717: dup_x1
    //   1718: putfield rotationPointZ : F
    //   1721: dup_x1
    //   1722: putfield rotationPointZ : F
    //   1725: dup_x1
    //   1726: putfield rotationPointZ : F
    //   1729: dup_x1
    //   1730: putfield rotationPointZ : F
    //   1733: putfield rotationPointZ : F
    //   1736: aload_0
    //   1737: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1740: aload_0
    //   1741: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1744: aload_0
    //   1745: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   1748: aload_0
    //   1749: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   1752: aload_0
    //   1753: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   1756: aload_0
    //   1757: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   1760: aload_0
    //   1761: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1764: getfield rotationPointY : F
    //   1767: dup_x1
    //   1768: putfield rotationPointY : F
    //   1771: dup_x1
    //   1772: putfield rotationPointY : F
    //   1775: dup_x1
    //   1776: putfield rotationPointY : F
    //   1779: dup_x1
    //   1780: putfield rotationPointY : F
    //   1783: dup_x1
    //   1784: putfield rotationPointY : F
    //   1787: putfield rotationPointY : F
    //   1790: aload_0
    //   1791: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   1794: aload_0
    //   1795: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1798: aload_0
    //   1799: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1802: getfield rotationPointZ : F
    //   1805: dup_x1
    //   1806: putfield rotationPointZ : F
    //   1809: putfield rotationPointZ : F
    //   1812: aload_0
    //   1813: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   1816: aload_0
    //   1817: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1820: aload_0
    //   1821: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1824: getfield rotationPointY : F
    //   1827: dup_x1
    //   1828: putfield rotationPointY : F
    //   1831: putfield rotationPointY : F
    //   1834: aload_0
    //   1835: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1838: ldc_w -0.61
    //   1841: fload #9
    //   1843: ldc_w 3.1415927
    //   1846: fmul
    //   1847: ldc_w 0.18
    //   1850: fmul
    //   1851: fload_3
    //   1852: fmul
    //   1853: fadd
    //   1854: putfield rotateAngleX : F
    //   1857: aload_0
    //   1858: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   1861: ldc_w -0.785
    //   1864: fload #9
    //   1866: ldc_w 3.1415927
    //   1869: fmul
    //   1870: ldc_w 0.18
    //   1873: fmul
    //   1874: fload_3
    //   1875: fmul
    //   1876: fadd
    //   1877: putfield rotateAngleX : F
    //   1880: aload_0
    //   1881: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1884: ldc_w -0.576
    //   1887: fload #9
    //   1889: ldc_w 3.1415927
    //   1892: fmul
    //   1893: ldc_w 0.18
    //   1896: fmul
    //   1897: fload_3
    //   1898: fmul
    //   1899: fadd
    //   1900: putfield rotateAngleX : F
    //   1903: aload_0
    //   1904: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1907: ldc_w 0.977
    //   1910: fload #9
    //   1912: ldc_w 3.1415927
    //   1915: fmul
    //   1916: ldc_w 0.18
    //   1919: fmul
    //   1920: fload_3
    //   1921: fmul
    //   1922: fadd
    //   1923: putfield rotateAngleX : F
    //   1926: aload_0
    //   1927: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1930: aload_0
    //   1931: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1934: aload_0
    //   1935: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1938: getfield rotationPointY : F
    //   1941: aload_0
    //   1942: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1945: getfield rotateAngleX : F
    //   1948: f2d
    //   1949: invokestatic cos : (D)D
    //   1952: d2f
    //   1953: ldc_w 17.0
    //   1956: fmul
    //   1957: fsub
    //   1958: fload #16
    //   1960: fconst_2
    //   1961: fdiv
    //   1962: fadd
    //   1963: dup_x1
    //   1964: putfield rotationPointY : F
    //   1967: putfield rotationPointY : F
    //   1970: aload_0
    //   1971: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   1974: aload_0
    //   1975: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   1978: aload_0
    //   1979: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1982: getfield rotationPointZ : F
    //   1985: aload_0
    //   1986: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   1989: getfield rotateAngleX : F
    //   1992: f2d
    //   1993: invokestatic sin : (D)D
    //   1996: d2f
    //   1997: ldc_w 17.0
    //   2000: fmul
    //   2001: fsub
    //   2002: dup_x1
    //   2003: putfield rotationPointZ : F
    //   2006: putfield rotationPointZ : F
    //   2009: fconst_0
    //   2010: fstore #15
    //   2012: fconst_0
    //   2013: fstore #16
    //   2015: fload_3
    //   2016: f2d
    //   2017: ldc2_w 0.001
    //   2020: dcmpl
    //   2021: ifle -> 2079
    //   2024: fload #4
    //   2026: ldc_w 0.75
    //   2029: fmul
    //   2030: aload_0
    //   2031: getfield wingspeed : F
    //   2034: fmul
    //   2035: fload #17
    //   2037: fdiv
    //   2038: fload #14
    //   2040: ldc_w 4.0
    //   2043: fmul
    //   2044: fadd
    //   2045: invokestatic cos : (F)F
    //   2048: fstore #9
    //   2050: fload #4
    //   2052: ldc_w 0.75
    //   2055: fmul
    //   2056: aload_0
    //   2057: getfield wingspeed : F
    //   2060: fmul
    //   2061: fload #17
    //   2063: fdiv
    //   2064: fload #14
    //   2066: ldc_w 4.0
    //   2069: fmul
    //   2070: fadd
    //   2071: invokestatic sin : (F)F
    //   2074: fstore #15
    //   2076: goto -> 2088
    //   2079: fconst_0
    //   2080: fstore #9
    //   2082: fconst_0
    //   2083: fstore #15
    //   2085: fconst_0
    //   2086: fstore #16
    //   2088: fload #15
    //   2090: fconst_0
    //   2091: fcmpl
    //   2092: ifle -> 2119
    //   2095: fload #15
    //   2097: fload #21
    //   2099: fmul
    //   2100: fload_3
    //   2101: fmul
    //   2102: fstore #16
    //   2104: aload_0
    //   2105: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2108: fload #19
    //   2110: fload #16
    //   2112: fsub
    //   2113: putfield rotationPointY : F
    //   2116: goto -> 2128
    //   2119: aload_0
    //   2120: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2123: fload #19
    //   2125: putfield rotationPointY : F
    //   2128: aload_0
    //   2129: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2132: fload #18
    //   2134: fload #20
    //   2136: fload #9
    //   2138: fmul
    //   2139: fload_3
    //   2140: fmul
    //   2141: fadd
    //   2142: putfield rotationPointZ : F
    //   2145: aload_0
    //   2146: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2149: aload_0
    //   2150: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2153: aload_0
    //   2154: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2157: aload_0
    //   2158: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2161: aload_0
    //   2162: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2165: aload_0
    //   2166: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2169: aload_0
    //   2170: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2173: getfield rotationPointZ : F
    //   2176: dup_x1
    //   2177: putfield rotationPointZ : F
    //   2180: dup_x1
    //   2181: putfield rotationPointZ : F
    //   2184: dup_x1
    //   2185: putfield rotationPointZ : F
    //   2188: dup_x1
    //   2189: putfield rotationPointZ : F
    //   2192: dup_x1
    //   2193: putfield rotationPointZ : F
    //   2196: putfield rotationPointZ : F
    //   2199: aload_0
    //   2200: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2203: aload_0
    //   2204: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2207: aload_0
    //   2208: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2211: aload_0
    //   2212: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2215: aload_0
    //   2216: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2219: aload_0
    //   2220: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2223: aload_0
    //   2224: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2227: getfield rotationPointY : F
    //   2230: dup_x1
    //   2231: putfield rotationPointY : F
    //   2234: dup_x1
    //   2235: putfield rotationPointY : F
    //   2238: dup_x1
    //   2239: putfield rotationPointY : F
    //   2242: dup_x1
    //   2243: putfield rotationPointY : F
    //   2246: dup_x1
    //   2247: putfield rotationPointY : F
    //   2250: putfield rotationPointY : F
    //   2253: aload_0
    //   2254: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2257: aload_0
    //   2258: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2261: aload_0
    //   2262: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2265: getfield rotationPointZ : F
    //   2268: dup_x1
    //   2269: putfield rotationPointZ : F
    //   2272: putfield rotationPointZ : F
    //   2275: aload_0
    //   2276: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2279: aload_0
    //   2280: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2283: aload_0
    //   2284: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2287: getfield rotationPointY : F
    //   2290: dup_x1
    //   2291: putfield rotationPointY : F
    //   2294: putfield rotationPointY : F
    //   2297: aload_0
    //   2298: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2301: ldc_w -0.61
    //   2304: fload #9
    //   2306: ldc_w 3.1415927
    //   2309: fmul
    //   2310: ldc_w 0.18
    //   2313: fmul
    //   2314: fload_3
    //   2315: fmul
    //   2316: fadd
    //   2317: putfield rotateAngleX : F
    //   2320: aload_0
    //   2321: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2324: ldc_w -0.785
    //   2327: fload #9
    //   2329: ldc_w 3.1415927
    //   2332: fmul
    //   2333: ldc_w 0.18
    //   2336: fmul
    //   2337: fload_3
    //   2338: fmul
    //   2339: fadd
    //   2340: putfield rotateAngleX : F
    //   2343: aload_0
    //   2344: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2347: ldc_w -0.576
    //   2350: fload #9
    //   2352: ldc_w 3.1415927
    //   2355: fmul
    //   2356: ldc_w 0.18
    //   2359: fmul
    //   2360: fload_3
    //   2361: fmul
    //   2362: fadd
    //   2363: putfield rotateAngleX : F
    //   2366: aload_0
    //   2367: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2370: ldc_w 0.977
    //   2373: fload #9
    //   2375: ldc_w 3.1415927
    //   2378: fmul
    //   2379: ldc_w 0.18
    //   2382: fmul
    //   2383: fload_3
    //   2384: fmul
    //   2385: fadd
    //   2386: putfield rotateAngleX : F
    //   2389: aload_0
    //   2390: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2393: aload_0
    //   2394: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2397: aload_0
    //   2398: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2401: getfield rotationPointY : F
    //   2404: aload_0
    //   2405: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2408: getfield rotateAngleX : F
    //   2411: f2d
    //   2412: invokestatic cos : (D)D
    //   2415: d2f
    //   2416: ldc_w 17.0
    //   2419: fmul
    //   2420: fsub
    //   2421: fload #16
    //   2423: fconst_2
    //   2424: fdiv
    //   2425: fadd
    //   2426: dup_x1
    //   2427: putfield rotationPointY : F
    //   2430: putfield rotationPointY : F
    //   2433: aload_0
    //   2434: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2437: aload_0
    //   2438: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2441: aload_0
    //   2442: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2445: getfield rotationPointZ : F
    //   2448: aload_0
    //   2449: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2452: getfield rotateAngleX : F
    //   2455: f2d
    //   2456: invokestatic sin : (D)D
    //   2459: d2f
    //   2460: ldc_w 17.0
    //   2463: fmul
    //   2464: fsub
    //   2465: dup_x1
    //   2466: putfield rotationPointZ : F
    //   2469: putfield rotationPointZ : F
    //   2472: aload_0
    //   2473: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2476: aload_0
    //   2477: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2480: aload_0
    //   2481: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2484: aload_0
    //   2485: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2488: aload_0
    //   2489: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2492: aload_0
    //   2493: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2496: aload_0
    //   2497: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2500: fconst_0
    //   2501: dup_x1
    //   2502: putfield rotateAngleX : F
    //   2505: dup_x1
    //   2506: putfield rotateAngleX : F
    //   2509: dup_x1
    //   2510: putfield rotateAngleX : F
    //   2513: dup_x1
    //   2514: putfield rotateAngleX : F
    //   2517: dup_x1
    //   2518: putfield rotateAngleX : F
    //   2521: dup_x1
    //   2522: putfield rotateAngleX : F
    //   2525: putfield rotateAngleX : F
    //   2528: aload_0
    //   2529: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2532: aload_0
    //   2533: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2536: aload_0
    //   2537: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2540: aload_0
    //   2541: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2544: aload_0
    //   2545: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2548: aload_0
    //   2549: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2552: aload_0
    //   2553: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2556: fconst_0
    //   2557: dup_x1
    //   2558: putfield rotateAngleX : F
    //   2561: dup_x1
    //   2562: putfield rotateAngleX : F
    //   2565: dup_x1
    //   2566: putfield rotateAngleX : F
    //   2569: dup_x1
    //   2570: putfield rotateAngleX : F
    //   2573: dup_x1
    //   2574: putfield rotateAngleX : F
    //   2577: dup_x1
    //   2578: putfield rotateAngleX : F
    //   2581: putfield rotateAngleX : F
    //   2584: goto -> 3436
    //   2587: ldc 7.0
    //   2589: fstore #18
    //   2591: ldc 9.0
    //   2593: fstore #19
    //   2595: aload #8
    //   2597: invokevirtual getAttacking : ()I
    //   2600: ifeq -> 2629
    //   2603: fload #4
    //   2605: ldc_w 0.85
    //   2608: fmul
    //   2609: aload_0
    //   2610: getfield wingspeed : F
    //   2613: fmul
    //   2614: fload #17
    //   2616: fdiv
    //   2617: invokestatic cos : (F)F
    //   2620: ldc_w 0.2
    //   2623: fmul
    //   2624: fstore #9
    //   2626: goto -> 2632
    //   2629: fconst_0
    //   2630: fstore #9
    //   2632: aload_0
    //   2633: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2636: fload #18
    //   2638: putfield rotationPointZ : F
    //   2641: aload_0
    //   2642: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2645: fload #19
    //   2647: fload #9
    //   2649: ldc_w 30.0
    //   2652: fmul
    //   2653: fadd
    //   2654: putfield rotationPointY : F
    //   2657: aload_0
    //   2658: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2661: ldc_w -0.7
    //   2664: fload #9
    //   2666: fadd
    //   2667: putfield rotateAngleX : F
    //   2670: aload_0
    //   2671: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2674: aload_0
    //   2675: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2678: aload_0
    //   2679: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2682: aload_0
    //   2683: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2686: aload_0
    //   2687: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2690: aload_0
    //   2691: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2694: aload_0
    //   2695: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2698: getfield rotationPointZ : F
    //   2701: dup_x1
    //   2702: putfield rotationPointZ : F
    //   2705: dup_x1
    //   2706: putfield rotationPointZ : F
    //   2709: dup_x1
    //   2710: putfield rotationPointZ : F
    //   2713: dup_x1
    //   2714: putfield rotationPointZ : F
    //   2717: dup_x1
    //   2718: putfield rotationPointZ : F
    //   2721: putfield rotationPointZ : F
    //   2724: aload_0
    //   2725: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2728: aload_0
    //   2729: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2732: aload_0
    //   2733: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2736: aload_0
    //   2737: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2740: aload_0
    //   2741: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2744: aload_0
    //   2745: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2748: aload_0
    //   2749: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2752: getfield rotationPointY : F
    //   2755: dup_x1
    //   2756: putfield rotationPointY : F
    //   2759: dup_x1
    //   2760: putfield rotationPointY : F
    //   2763: dup_x1
    //   2764: putfield rotationPointY : F
    //   2767: dup_x1
    //   2768: putfield rotationPointY : F
    //   2771: dup_x1
    //   2772: putfield rotationPointY : F
    //   2775: putfield rotationPointY : F
    //   2778: aload_0
    //   2779: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2782: aload_0
    //   2783: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2786: aload_0
    //   2787: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   2790: aload_0
    //   2791: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   2794: aload_0
    //   2795: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   2798: aload_0
    //   2799: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   2802: aload_0
    //   2803: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2806: getfield rotateAngleX : F
    //   2809: dup_x1
    //   2810: putfield rotateAngleX : F
    //   2813: dup_x1
    //   2814: putfield rotateAngleX : F
    //   2817: dup_x1
    //   2818: putfield rotateAngleX : F
    //   2821: dup_x1
    //   2822: putfield rotateAngleX : F
    //   2825: dup_x1
    //   2826: putfield rotateAngleX : F
    //   2829: putfield rotateAngleX : F
    //   2832: aload_0
    //   2833: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   2836: aload_0
    //   2837: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2840: aload_0
    //   2841: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2844: getfield rotationPointZ : F
    //   2847: dup_x1
    //   2848: putfield rotationPointZ : F
    //   2851: putfield rotationPointZ : F
    //   2854: aload_0
    //   2855: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   2858: aload_0
    //   2859: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2862: aload_0
    //   2863: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2866: getfield rotationPointY : F
    //   2869: dup_x1
    //   2870: putfield rotationPointY : F
    //   2873: putfield rotationPointY : F
    //   2876: aload_0
    //   2877: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2880: ldc_w -0.61
    //   2883: aload_0
    //   2884: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2887: getfield rotateAngleX : F
    //   2890: fadd
    //   2891: putfield rotateAngleX : F
    //   2894: aload_0
    //   2895: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   2898: ldc_w -0.785
    //   2901: aload_0
    //   2902: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2905: getfield rotateAngleX : F
    //   2908: fadd
    //   2909: putfield rotateAngleX : F
    //   2912: aload_0
    //   2913: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2916: ldc_w -0.576
    //   2919: aload_0
    //   2920: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2923: getfield rotateAngleX : F
    //   2926: ldc_w 4.0
    //   2929: fdiv
    //   2930: fsub
    //   2931: putfield rotateAngleX : F
    //   2934: aload_0
    //   2935: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2938: ldc_w 0.977
    //   2941: aload_0
    //   2942: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2945: getfield rotateAngleX : F
    //   2948: ldc_w 4.0
    //   2951: fdiv
    //   2952: fsub
    //   2953: putfield rotateAngleX : F
    //   2956: aload_0
    //   2957: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2960: aload_0
    //   2961: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   2964: aload_0
    //   2965: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2968: getfield rotationPointY : F
    //   2971: aload_0
    //   2972: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   2975: getfield rotateAngleX : F
    //   2978: f2d
    //   2979: invokestatic cos : (D)D
    //   2982: d2f
    //   2983: ldc_w 17.0
    //   2986: fmul
    //   2987: fsub
    //   2988: dup_x1
    //   2989: putfield rotationPointY : F
    //   2992: putfield rotationPointY : F
    //   2995: aload_0
    //   2996: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   2999: aload_0
    //   3000: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3003: aload_0
    //   3004: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3007: getfield rotationPointZ : F
    //   3010: aload_0
    //   3011: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3014: getfield rotateAngleX : F
    //   3017: f2d
    //   3018: invokestatic sin : (D)D
    //   3021: d2f
    //   3022: ldc_w 17.0
    //   3025: fmul
    //   3026: fsub
    //   3027: dup_x1
    //   3028: putfield rotationPointZ : F
    //   3031: putfield rotationPointZ : F
    //   3034: aload_0
    //   3035: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3038: fload #18
    //   3040: putfield rotationPointZ : F
    //   3043: aload_0
    //   3044: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3047: fload #19
    //   3049: fload #9
    //   3051: ldc_w 30.0
    //   3054: fmul
    //   3055: fsub
    //   3056: putfield rotationPointY : F
    //   3059: aload_0
    //   3060: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3063: ldc_w -0.7
    //   3066: fload #9
    //   3068: fsub
    //   3069: putfield rotateAngleX : F
    //   3072: aload_0
    //   3073: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3076: aload_0
    //   3077: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3080: aload_0
    //   3081: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3084: aload_0
    //   3085: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3088: aload_0
    //   3089: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3092: aload_0
    //   3093: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3096: aload_0
    //   3097: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3100: getfield rotationPointZ : F
    //   3103: dup_x1
    //   3104: putfield rotationPointZ : F
    //   3107: dup_x1
    //   3108: putfield rotationPointZ : F
    //   3111: dup_x1
    //   3112: putfield rotationPointZ : F
    //   3115: dup_x1
    //   3116: putfield rotationPointZ : F
    //   3119: dup_x1
    //   3120: putfield rotationPointZ : F
    //   3123: putfield rotationPointZ : F
    //   3126: aload_0
    //   3127: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3130: aload_0
    //   3131: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3134: aload_0
    //   3135: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3138: aload_0
    //   3139: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3142: aload_0
    //   3143: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3146: aload_0
    //   3147: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3150: aload_0
    //   3151: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3154: getfield rotationPointY : F
    //   3157: dup_x1
    //   3158: putfield rotationPointY : F
    //   3161: dup_x1
    //   3162: putfield rotationPointY : F
    //   3165: dup_x1
    //   3166: putfield rotationPointY : F
    //   3169: dup_x1
    //   3170: putfield rotationPointY : F
    //   3173: dup_x1
    //   3174: putfield rotationPointY : F
    //   3177: putfield rotationPointY : F
    //   3180: aload_0
    //   3181: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3184: aload_0
    //   3185: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3188: aload_0
    //   3189: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3192: aload_0
    //   3193: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3196: aload_0
    //   3197: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3200: aload_0
    //   3201: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   3204: aload_0
    //   3205: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3208: getfield rotateAngleX : F
    //   3211: dup_x1
    //   3212: putfield rotateAngleX : F
    //   3215: dup_x1
    //   3216: putfield rotateAngleX : F
    //   3219: dup_x1
    //   3220: putfield rotateAngleX : F
    //   3223: dup_x1
    //   3224: putfield rotateAngleX : F
    //   3227: dup_x1
    //   3228: putfield rotateAngleX : F
    //   3231: putfield rotateAngleX : F
    //   3234: aload_0
    //   3235: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3238: aload_0
    //   3239: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3242: aload_0
    //   3243: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3246: getfield rotationPointZ : F
    //   3249: dup_x1
    //   3250: putfield rotationPointZ : F
    //   3253: putfield rotationPointZ : F
    //   3256: aload_0
    //   3257: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3260: aload_0
    //   3261: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3264: aload_0
    //   3265: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3268: getfield rotationPointY : F
    //   3271: dup_x1
    //   3272: putfield rotationPointY : F
    //   3275: putfield rotationPointY : F
    //   3278: aload_0
    //   3279: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3282: ldc_w -0.61
    //   3285: aload_0
    //   3286: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3289: getfield rotateAngleX : F
    //   3292: fadd
    //   3293: putfield rotateAngleX : F
    //   3296: aload_0
    //   3297: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3300: ldc_w -0.785
    //   3303: aload_0
    //   3304: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3307: getfield rotateAngleX : F
    //   3310: fadd
    //   3311: putfield rotateAngleX : F
    //   3314: aload_0
    //   3315: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3318: ldc_w -0.576
    //   3321: aload_0
    //   3322: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3325: getfield rotateAngleX : F
    //   3328: ldc_w 4.0
    //   3331: fdiv
    //   3332: fsub
    //   3333: putfield rotateAngleX : F
    //   3336: aload_0
    //   3337: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3340: ldc_w 0.977
    //   3343: aload_0
    //   3344: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3347: getfield rotateAngleX : F
    //   3350: ldc_w 4.0
    //   3353: fdiv
    //   3354: fsub
    //   3355: putfield rotateAngleX : F
    //   3358: aload_0
    //   3359: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3362: aload_0
    //   3363: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3366: aload_0
    //   3367: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3370: getfield rotationPointY : F
    //   3373: aload_0
    //   3374: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3377: getfield rotateAngleX : F
    //   3380: f2d
    //   3381: invokestatic cos : (D)D
    //   3384: d2f
    //   3385: ldc_w 17.0
    //   3388: fmul
    //   3389: fsub
    //   3390: dup_x1
    //   3391: putfield rotationPointY : F
    //   3394: putfield rotationPointY : F
    //   3397: aload_0
    //   3398: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3401: aload_0
    //   3402: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3405: aload_0
    //   3406: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3409: getfield rotationPointZ : F
    //   3412: aload_0
    //   3413: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3416: getfield rotateAngleX : F
    //   3419: f2d
    //   3420: invokestatic sin : (D)D
    //   3423: d2f
    //   3424: ldc_w 17.0
    //   3427: fmul
    //   3428: fsub
    //   3429: dup_x1
    //   3430: putfield rotationPointZ : F
    //   3433: putfield rotationPointZ : F
    //   3436: aload #8
    //   3438: invokevirtual getAttacking : ()I
    //   3441: ifeq -> 3460
    //   3444: ldc_w 0.76
    //   3447: fload #17
    //   3449: fdiv
    //   3450: fstore #12
    //   3452: ldc_w 0.25
    //   3455: fstore #13
    //   3457: goto -> 3473
    //   3460: ldc_w 0.26
    //   3463: fload #17
    //   3465: fdiv
    //   3466: fstore #12
    //   3468: ldc_w 0.08
    //   3471: fstore #13
    //   3473: aload_0
    //   3474: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3477: fload #4
    //   3479: fload #12
    //   3481: fmul
    //   3482: aload_0
    //   3483: getfield wingspeed : F
    //   3486: fmul
    //   3487: invokestatic cos : (F)F
    //   3490: ldc_w 3.1415927
    //   3493: fmul
    //   3494: fload #13
    //   3496: fmul
    //   3497: fconst_2
    //   3498: fdiv
    //   3499: putfield rotateAngleY : F
    //   3502: aload_0
    //   3503: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3506: aload_0
    //   3507: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3510: getfield rotationPointZ : F
    //   3513: aload_0
    //   3514: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3517: getfield rotateAngleY : F
    //   3520: f2d
    //   3521: invokestatic cos : (D)D
    //   3524: d2f
    //   3525: ldc 11.0
    //   3527: fmul
    //   3528: fadd
    //   3529: putfield rotationPointZ : F
    //   3532: aload_0
    //   3533: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3536: aload_0
    //   3537: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3540: getfield rotationPointX : F
    //   3543: fconst_1
    //   3544: fsub
    //   3545: aload_0
    //   3546: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   3549: getfield rotateAngleY : F
    //   3552: f2d
    //   3553: invokestatic sin : (D)D
    //   3556: d2f
    //   3557: ldc 11.0
    //   3559: fmul
    //   3560: fadd
    //   3561: putfield rotationPointX : F
    //   3564: aload_0
    //   3565: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3568: fload #4
    //   3570: fload #12
    //   3572: fmul
    //   3573: aload_0
    //   3574: getfield wingspeed : F
    //   3577: fmul
    //   3578: fload #14
    //   3580: fsub
    //   3581: invokestatic cos : (F)F
    //   3584: ldc_w 3.1415927
    //   3587: fmul
    //   3588: fload #13
    //   3590: fmul
    //   3591: putfield rotateAngleY : F
    //   3594: aload_0
    //   3595: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3598: aload_0
    //   3599: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3602: getfield rotationPointZ : F
    //   3605: aload_0
    //   3606: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3609: getfield rotateAngleY : F
    //   3612: f2d
    //   3613: invokestatic cos : (D)D
    //   3616: d2f
    //   3617: ldc 9.0
    //   3619: fmul
    //   3620: fadd
    //   3621: putfield rotationPointZ : F
    //   3624: aload_0
    //   3625: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3628: aload_0
    //   3629: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3632: getfield rotationPointX : F
    //   3635: aload_0
    //   3636: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3639: getfield rotateAngleY : F
    //   3642: f2d
    //   3643: invokestatic sin : (D)D
    //   3646: d2f
    //   3647: ldc 9.0
    //   3649: fmul
    //   3650: fadd
    //   3651: putfield rotationPointX : F
    //   3654: aload_0
    //   3655: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3658: fload #4
    //   3660: fload #12
    //   3662: fmul
    //   3663: aload_0
    //   3664: getfield wingspeed : F
    //   3667: fmul
    //   3668: fconst_2
    //   3669: fload #14
    //   3671: fmul
    //   3672: fsub
    //   3673: invokestatic cos : (F)F
    //   3676: ldc_w 3.1415927
    //   3679: fmul
    //   3680: fload #13
    //   3682: fmul
    //   3683: putfield rotateAngleY : F
    //   3686: aload_0
    //   3687: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3690: aload_0
    //   3691: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3694: getfield rotationPointZ : F
    //   3697: aload_0
    //   3698: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3701: getfield rotateAngleY : F
    //   3704: f2d
    //   3705: invokestatic cos : (D)D
    //   3708: d2f
    //   3709: ldc 9.0
    //   3711: fmul
    //   3712: fadd
    //   3713: putfield rotationPointZ : F
    //   3716: aload_0
    //   3717: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3720: aload_0
    //   3721: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3724: getfield rotationPointX : F
    //   3727: aload_0
    //   3728: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3731: getfield rotateAngleY : F
    //   3734: f2d
    //   3735: invokestatic sin : (D)D
    //   3738: d2f
    //   3739: ldc 9.0
    //   3741: fmul
    //   3742: fadd
    //   3743: putfield rotationPointX : F
    //   3746: aload_0
    //   3747: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3750: fload #4
    //   3752: fload #12
    //   3754: fmul
    //   3755: aload_0
    //   3756: getfield wingspeed : F
    //   3759: fmul
    //   3760: ldc 3.0
    //   3762: fload #14
    //   3764: fmul
    //   3765: fsub
    //   3766: invokestatic cos : (F)F
    //   3769: ldc_w 3.1415927
    //   3772: fmul
    //   3773: fload #13
    //   3775: fmul
    //   3776: putfield rotateAngleY : F
    //   3779: aload_0
    //   3780: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3783: aload_0
    //   3784: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3787: getfield rotationPointZ : F
    //   3790: aload_0
    //   3791: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3794: getfield rotateAngleY : F
    //   3797: f2d
    //   3798: invokestatic cos : (D)D
    //   3801: d2f
    //   3802: ldc 9.0
    //   3804: fmul
    //   3805: fadd
    //   3806: putfield rotationPointZ : F
    //   3809: aload_0
    //   3810: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3813: aload_0
    //   3814: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3817: getfield rotationPointX : F
    //   3820: aload_0
    //   3821: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3824: getfield rotateAngleY : F
    //   3827: f2d
    //   3828: invokestatic sin : (D)D
    //   3831: d2f
    //   3832: ldc 9.0
    //   3834: fmul
    //   3835: fadd
    //   3836: putfield rotationPointX : F
    //   3839: fload #4
    //   3841: fload #12
    //   3843: fmul
    //   3844: aload_0
    //   3845: getfield wingspeed : F
    //   3848: fmul
    //   3849: ldc 3.0
    //   3851: fload #14
    //   3853: fmul
    //   3854: fsub
    //   3855: invokestatic cos : (F)F
    //   3858: ldc_w 3.1415927
    //   3861: fmul
    //   3862: fload #13
    //   3864: fmul
    //   3865: fstore #9
    //   3867: fload #9
    //   3869: fconst_2
    //   3870: fdiv
    //   3871: fstore #9
    //   3873: aload_0
    //   3874: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3877: aload_0
    //   3878: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   3881: getfield rotateAngleY : F
    //   3884: fload #9
    //   3886: fadd
    //   3887: putfield rotateAngleY : F
    //   3890: aload_0
    //   3891: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3894: aload_0
    //   3895: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3898: getfield rotationPointZ : F
    //   3901: aload_0
    //   3902: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3905: getfield rotateAngleY : F
    //   3908: f2d
    //   3909: invokestatic cos : (D)D
    //   3912: d2f
    //   3913: ldc 9.0
    //   3915: fmul
    //   3916: fadd
    //   3917: putfield rotationPointZ : F
    //   3920: aload_0
    //   3921: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3924: aload_0
    //   3925: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3928: getfield rotationPointX : F
    //   3931: aload_0
    //   3932: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3935: getfield rotateAngleY : F
    //   3938: f2d
    //   3939: invokestatic sin : (D)D
    //   3942: d2f
    //   3943: ldc 9.0
    //   3945: fmul
    //   3946: fadd
    //   3947: putfield rotationPointX : F
    //   3950: aload_0
    //   3951: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3954: ldc_w 0.174
    //   3957: aload_0
    //   3958: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   3961: getfield rotateAngleY : F
    //   3964: fadd
    //   3965: fload #9
    //   3967: fadd
    //   3968: putfield rotateAngleY : F
    //   3971: aload_0
    //   3972: getfield tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3975: aload_0
    //   3976: getfield tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   3979: aload_0
    //   3980: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   3983: getfield rotationPointZ : F
    //   3986: dup_x1
    //   3987: putfield rotationPointZ : F
    //   3990: putfield rotationPointZ : F
    //   3993: aload_0
    //   3994: getfield tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   3997: aload_0
    //   3998: getfield tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4001: aload_0
    //   4002: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4005: getfield rotationPointX : F
    //   4008: dup_x1
    //   4009: putfield rotationPointX : F
    //   4012: putfield rotationPointX : F
    //   4015: aload_0
    //   4016: getfield tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4019: aload_0
    //   4020: getfield tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4023: aload_0
    //   4024: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4027: getfield rotateAngleY : F
    //   4030: dup_x1
    //   4031: putfield rotateAngleY : F
    //   4034: putfield rotateAngleY : F
    //   4037: aload_0
    //   4038: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4041: aload_0
    //   4042: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4045: getfield rotationPointZ : F
    //   4048: aload_0
    //   4049: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4052: getfield rotateAngleY : F
    //   4055: f2d
    //   4056: invokestatic cos : (D)D
    //   4059: d2f
    //   4060: ldc 9.0
    //   4062: fmul
    //   4063: fadd
    //   4064: putfield rotationPointZ : F
    //   4067: aload_0
    //   4068: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4071: aload_0
    //   4072: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4075: getfield rotationPointX : F
    //   4078: aload_0
    //   4079: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4082: getfield rotateAngleY : F
    //   4085: f2d
    //   4086: invokestatic sin : (D)D
    //   4089: d2f
    //   4090: ldc 9.0
    //   4092: fmul
    //   4093: fadd
    //   4094: putfield rotationPointX : F
    //   4097: aload_0
    //   4098: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4101: aload_0
    //   4102: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4105: getfield rotateAngleY : F
    //   4108: fload #9
    //   4110: fadd
    //   4111: putfield rotateAngleY : F
    //   4114: aload_0
    //   4115: getfield tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4118: aload_0
    //   4119: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4122: getfield rotationPointZ : F
    //   4125: putfield rotationPointZ : F
    //   4128: aload_0
    //   4129: getfield tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4132: aload_0
    //   4133: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4136: getfield rotationPointX : F
    //   4139: putfield rotationPointX : F
    //   4142: aload_0
    //   4143: getfield tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4146: aload_0
    //   4147: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4150: getfield rotateAngleY : F
    //   4153: putfield rotateAngleY : F
    //   4156: aload_0
    //   4157: getfield tailpoint1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4160: aload_0
    //   4161: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4164: getfield rotationPointZ : F
    //   4167: aload_0
    //   4168: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4171: getfield rotateAngleY : F
    //   4174: f2d
    //   4175: invokestatic cos : (D)D
    //   4178: d2f
    //   4179: ldc 9.0
    //   4181: fmul
    //   4182: fadd
    //   4183: putfield rotationPointZ : F
    //   4186: aload_0
    //   4187: getfield tailpoint1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4190: aload_0
    //   4191: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4194: getfield rotationPointX : F
    //   4197: aload_0
    //   4198: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4201: getfield rotateAngleY : F
    //   4204: f2d
    //   4205: invokestatic sin : (D)D
    //   4208: d2f
    //   4209: ldc 9.0
    //   4211: fmul
    //   4212: fadd
    //   4213: putfield rotationPointX : F
    //   4216: aload_0
    //   4217: getfield tailpoint1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4220: aload_0
    //   4221: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4224: getfield rotateAngleY : F
    //   4227: fload #9
    //   4229: fadd
    //   4230: putfield rotateAngleY : F
    //   4233: aload_0
    //   4234: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4237: aload_0
    //   4238: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4241: getfield rotationPointZ : F
    //   4244: aload_0
    //   4245: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4248: getfield rotateAngleY : F
    //   4251: f2d
    //   4252: invokestatic cos : (D)D
    //   4255: d2f
    //   4256: ldc 9.0
    //   4258: fmul
    //   4259: fadd
    //   4260: putfield rotationPointZ : F
    //   4263: aload_0
    //   4264: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4267: aload_0
    //   4268: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4271: getfield rotationPointX : F
    //   4274: aload_0
    //   4275: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4278: getfield rotateAngleY : F
    //   4281: f2d
    //   4282: invokestatic sin : (D)D
    //   4285: d2f
    //   4286: ldc 9.0
    //   4288: fmul
    //   4289: fadd
    //   4290: putfield rotationPointX : F
    //   4293: aload_0
    //   4294: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4297: ldc_w -0.174
    //   4300: aload_0
    //   4301: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4304: getfield rotateAngleY : F
    //   4307: fadd
    //   4308: fload #9
    //   4310: fadd
    //   4311: putfield rotateAngleY : F
    //   4314: aload_0
    //   4315: getfield tailspike5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4318: aload_0
    //   4319: getfield tailspike6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4322: aload_0
    //   4323: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4326: getfield rotationPointZ : F
    //   4329: dup_x1
    //   4330: putfield rotationPointZ : F
    //   4333: putfield rotationPointZ : F
    //   4336: aload_0
    //   4337: getfield tailspike5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4340: aload_0
    //   4341: getfield tailspike6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4344: aload_0
    //   4345: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4348: getfield rotationPointX : F
    //   4351: dup_x1
    //   4352: putfield rotationPointX : F
    //   4355: putfield rotationPointX : F
    //   4358: aload_0
    //   4359: getfield tailspike5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4362: aload_0
    //   4363: getfield tailspike6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4366: aload_0
    //   4367: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4370: getfield rotateAngleY : F
    //   4373: dup_x1
    //   4374: putfield rotateAngleY : F
    //   4377: putfield rotateAngleY : F
    //   4380: aload_0
    //   4381: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4384: aload_0
    //   4385: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4388: getfield rotationPointZ : F
    //   4391: aload_0
    //   4392: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4395: getfield rotateAngleY : F
    //   4398: f2d
    //   4399: invokestatic cos : (D)D
    //   4402: d2f
    //   4403: ldc 9.0
    //   4405: fmul
    //   4406: fadd
    //   4407: putfield rotationPointZ : F
    //   4410: aload_0
    //   4411: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4414: aload_0
    //   4415: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4418: getfield rotationPointX : F
    //   4421: aload_0
    //   4422: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4425: getfield rotateAngleY : F
    //   4428: f2d
    //   4429: invokestatic sin : (D)D
    //   4432: d2f
    //   4433: ldc 9.0
    //   4435: fmul
    //   4436: fadd
    //   4437: putfield rotationPointX : F
    //   4440: aload_0
    //   4441: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4444: aload_0
    //   4445: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4448: getfield rotateAngleY : F
    //   4451: fload #9
    //   4453: fadd
    //   4454: putfield rotateAngleY : F
    //   4457: aload_0
    //   4458: getfield tailspike4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4461: aload_0
    //   4462: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4465: getfield rotationPointZ : F
    //   4468: putfield rotationPointZ : F
    //   4471: aload_0
    //   4472: getfield tailspike4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4475: aload_0
    //   4476: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4479: getfield rotationPointX : F
    //   4482: putfield rotationPointX : F
    //   4485: aload_0
    //   4486: getfield tailspike4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4489: aload_0
    //   4490: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4493: getfield rotateAngleY : F
    //   4496: putfield rotateAngleY : F
    //   4499: aload_0
    //   4500: getfield tailpoint2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4503: aload_0
    //   4504: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4507: getfield rotationPointZ : F
    //   4510: aload_0
    //   4511: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4514: getfield rotateAngleY : F
    //   4517: f2d
    //   4518: invokestatic cos : (D)D
    //   4521: d2f
    //   4522: ldc 9.0
    //   4524: fmul
    //   4525: fadd
    //   4526: putfield rotationPointZ : F
    //   4529: aload_0
    //   4530: getfield tailpoint2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4533: aload_0
    //   4534: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4537: getfield rotationPointX : F
    //   4540: aload_0
    //   4541: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4544: getfield rotateAngleY : F
    //   4547: f2d
    //   4548: invokestatic sin : (D)D
    //   4551: d2f
    //   4552: ldc 9.0
    //   4554: fmul
    //   4555: fadd
    //   4556: putfield rotationPointX : F
    //   4559: aload_0
    //   4560: getfield tailpoint2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4563: aload_0
    //   4564: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4567: getfield rotateAngleY : F
    //   4570: fload #9
    //   4572: fadd
    //   4573: putfield rotateAngleY : F
    //   4576: aload #8
    //   4578: aload #11
    //   4580: invokevirtual setRenderInfo : (Ldanger/orespawn/RenderInfo;)V
    //   4583: aload_0
    //   4584: getfield lclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4587: fload #7
    //   4589: invokevirtual render : (F)V
    //   4592: aload_0
    //   4593: getfield body : Lnet/minecraft/client/model/ModelRenderer;
    //   4596: fload #7
    //   4598: invokevirtual render : (F)V
    //   4601: aload_0
    //   4602: getfield leftleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4605: fload #7
    //   4607: invokevirtual render : (F)V
    //   4610: aload_0
    //   4611: getfield tail1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4614: fload #7
    //   4616: invokevirtual render : (F)V
    //   4619: aload_0
    //   4620: getfield leftleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4623: fload #7
    //   4625: invokevirtual render : (F)V
    //   4628: aload_0
    //   4629: getfield body2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4632: fload #7
    //   4634: invokevirtual render : (F)V
    //   4637: aload_0
    //   4638: getfield leftleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4641: fload #7
    //   4643: invokevirtual render : (F)V
    //   4646: aload_0
    //   4647: getfield tail2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4650: fload #7
    //   4652: invokevirtual render : (F)V
    //   4655: aload_0
    //   4656: getfield tail3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4659: fload #7
    //   4661: invokevirtual render : (F)V
    //   4664: aload_0
    //   4665: getfield lclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4668: fload #7
    //   4670: invokevirtual render : (F)V
    //   4673: aload_0
    //   4674: getfield lclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4677: fload #7
    //   4679: invokevirtual render : (F)V
    //   4682: aload_0
    //   4683: getfield lclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4686: fload #7
    //   4688: invokevirtual render : (F)V
    //   4691: aload_0
    //   4692: getfield lclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4695: fload #7
    //   4697: invokevirtual render : (F)V
    //   4700: aload_0
    //   4701: getfield lclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4704: fload #7
    //   4706: invokevirtual render : (F)V
    //   4709: aload_0
    //   4710: getfield lclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4713: fload #7
    //   4715: invokevirtual render : (F)V
    //   4718: aload_0
    //   4719: getfield tail4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4722: fload #7
    //   4724: invokevirtual render : (F)V
    //   4727: aload_0
    //   4728: getfield tail5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4731: fload #7
    //   4733: invokevirtual render : (F)V
    //   4736: aload_0
    //   4737: getfield tail6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4740: fload #7
    //   4742: invokevirtual render : (F)V
    //   4745: aload_0
    //   4746: getfield tail7 : Lnet/minecraft/client/model/ModelRenderer;
    //   4749: fload #7
    //   4751: invokevirtual render : (F)V
    //   4754: aload_0
    //   4755: getfield tail8 : Lnet/minecraft/client/model/ModelRenderer;
    //   4758: fload #7
    //   4760: invokevirtual render : (F)V
    //   4763: aload_0
    //   4764: getfield tail9 : Lnet/minecraft/client/model/ModelRenderer;
    //   4767: fload #7
    //   4769: invokevirtual render : (F)V
    //   4772: aload_0
    //   4773: getfield tailpoint1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4776: fload #7
    //   4778: invokevirtual render : (F)V
    //   4781: aload_0
    //   4782: getfield tailpoint2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4785: fload #7
    //   4787: invokevirtual render : (F)V
    //   4790: aload_0
    //   4791: getfield llegspike : Lnet/minecraft/client/model/ModelRenderer;
    //   4794: fload #7
    //   4796: invokevirtual render : (F)V
    //   4799: aload_0
    //   4800: getfield tailspike1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4803: fload #7
    //   4805: invokevirtual render : (F)V
    //   4808: aload_0
    //   4809: getfield tailspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4812: fload #7
    //   4814: invokevirtual render : (F)V
    //   4817: aload_0
    //   4818: getfield tailspike3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4821: fload #7
    //   4823: invokevirtual render : (F)V
    //   4826: aload_0
    //   4827: getfield tailspike4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4830: fload #7
    //   4832: invokevirtual render : (F)V
    //   4835: aload_0
    //   4836: getfield tailspike5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4839: fload #7
    //   4841: invokevirtual render : (F)V
    //   4844: aload_0
    //   4845: getfield tailspike6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4848: fload #7
    //   4850: invokevirtual render : (F)V
    //   4853: aload_0
    //   4854: getfield neck1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4857: fload #7
    //   4859: invokevirtual render : (F)V
    //   4862: aload_0
    //   4863: getfield neck2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4866: fload #7
    //   4868: invokevirtual render : (F)V
    //   4871: aload_0
    //   4872: getfield neck3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4875: fload #7
    //   4877: invokevirtual render : (F)V
    //   4880: aload_0
    //   4881: getfield head1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4884: fload #7
    //   4886: invokevirtual render : (F)V
    //   4889: aload_0
    //   4890: getfield leye : Lnet/minecraft/client/model/ModelRenderer;
    //   4893: fload #7
    //   4895: invokevirtual render : (F)V
    //   4898: aload_0
    //   4899: getfield reye : Lnet/minecraft/client/model/ModelRenderer;
    //   4902: fload #7
    //   4904: invokevirtual render : (F)V
    //   4907: aload_0
    //   4908: getfield head2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4911: fload #7
    //   4913: invokevirtual render : (F)V
    //   4916: aload_0
    //   4917: getfield head3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4920: fload #7
    //   4922: invokevirtual render : (F)V
    //   4925: aload_0
    //   4926: getfield head4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4929: fload #7
    //   4931: invokevirtual render : (F)V
    //   4934: aload_0
    //   4935: getfield head5 : Lnet/minecraft/client/model/ModelRenderer;
    //   4938: fload #7
    //   4940: invokevirtual render : (F)V
    //   4943: aload_0
    //   4944: getfield head6 : Lnet/minecraft/client/model/ModelRenderer;
    //   4947: fload #7
    //   4949: invokevirtual render : (F)V
    //   4952: aload_0
    //   4953: getfield jaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4956: fload #7
    //   4958: invokevirtual render : (F)V
    //   4961: aload_0
    //   4962: getfield jaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   4965: fload #7
    //   4967: invokevirtual render : (F)V
    //   4970: aload_0
    //   4971: getfield jaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   4974: fload #7
    //   4976: invokevirtual render : (F)V
    //   4979: aload_0
    //   4980: getfield jaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   4983: fload #7
    //   4985: invokevirtual render : (F)V
    //   4988: aload_0
    //   4989: getfield tooth1 : Lnet/minecraft/client/model/ModelRenderer;
    //   4992: fload #7
    //   4994: invokevirtual render : (F)V
    //   4997: aload_0
    //   4998: getfield tooth2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5001: fload #7
    //   5003: invokevirtual render : (F)V
    //   5006: aload_0
    //   5007: getfield tooth3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5010: fload #7
    //   5012: invokevirtual render : (F)V
    //   5015: aload_0
    //   5016: getfield tooth4 : Lnet/minecraft/client/model/ModelRenderer;
    //   5019: fload #7
    //   5021: invokevirtual render : (F)V
    //   5024: aload_0
    //   5025: getfield tooth5 : Lnet/minecraft/client/model/ModelRenderer;
    //   5028: fload #7
    //   5030: invokevirtual render : (F)V
    //   5033: aload_0
    //   5034: getfield jaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   5037: fload #7
    //   5039: invokevirtual render : (F)V
    //   5042: aload_0
    //   5043: getfield head7 : Lnet/minecraft/client/model/ModelRenderer;
    //   5046: fload #7
    //   5048: invokevirtual render : (F)V
    //   5051: aload_0
    //   5052: getfield tooth6 : Lnet/minecraft/client/model/ModelRenderer;
    //   5055: fload #7
    //   5057: invokevirtual render : (F)V
    //   5060: aload_0
    //   5061: getfield tooth7 : Lnet/minecraft/client/model/ModelRenderer;
    //   5064: fload #7
    //   5066: invokevirtual render : (F)V
    //   5069: aload_0
    //   5070: getfield tooth8 : Lnet/minecraft/client/model/ModelRenderer;
    //   5073: fload #7
    //   5075: invokevirtual render : (F)V
    //   5078: aload_0
    //   5079: getfield tooth9 : Lnet/minecraft/client/model/ModelRenderer;
    //   5082: fload #7
    //   5084: invokevirtual render : (F)V
    //   5087: aload_0
    //   5088: getfield tooth10 : Lnet/minecraft/client/model/ModelRenderer;
    //   5091: fload #7
    //   5093: invokevirtual render : (F)V
    //   5096: aload_0
    //   5097: getfield tooth11 : Lnet/minecraft/client/model/ModelRenderer;
    //   5100: fload #7
    //   5102: invokevirtual render : (F)V
    //   5105: aload_0
    //   5106: getfield tooth12 : Lnet/minecraft/client/model/ModelRenderer;
    //   5109: fload #7
    //   5111: invokevirtual render : (F)V
    //   5114: aload_0
    //   5115: getfield tooth13 : Lnet/minecraft/client/model/ModelRenderer;
    //   5118: fload #7
    //   5120: invokevirtual render : (F)V
    //   5123: aload_0
    //   5124: getfield rightleg1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5127: fload #7
    //   5129: invokevirtual render : (F)V
    //   5132: aload_0
    //   5133: getfield rightleg2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5136: fload #7
    //   5138: invokevirtual render : (F)V
    //   5141: aload_0
    //   5142: getfield tooth14 : Lnet/minecraft/client/model/ModelRenderer;
    //   5145: fload #7
    //   5147: invokevirtual render : (F)V
    //   5150: aload_0
    //   5151: getfield tooth15 : Lnet/minecraft/client/model/ModelRenderer;
    //   5154: fload #7
    //   5156: invokevirtual render : (F)V
    //   5159: aload_0
    //   5160: getfield tooth16 : Lnet/minecraft/client/model/ModelRenderer;
    //   5163: fload #7
    //   5165: invokevirtual render : (F)V
    //   5168: aload_0
    //   5169: getfield tooth17 : Lnet/minecraft/client/model/ModelRenderer;
    //   5172: fload #7
    //   5174: invokevirtual render : (F)V
    //   5177: aload_0
    //   5178: getfield tooth18 : Lnet/minecraft/client/model/ModelRenderer;
    //   5181: fload #7
    //   5183: invokevirtual render : (F)V
    //   5186: aload_0
    //   5187: getfield tooth19 : Lnet/minecraft/client/model/ModelRenderer;
    //   5190: fload #7
    //   5192: invokevirtual render : (F)V
    //   5195: aload_0
    //   5196: getfield tooth20 : Lnet/minecraft/client/model/ModelRenderer;
    //   5199: fload #7
    //   5201: invokevirtual render : (F)V
    //   5204: aload_0
    //   5205: getfield tooth21 : Lnet/minecraft/client/model/ModelRenderer;
    //   5208: fload #7
    //   5210: invokevirtual render : (F)V
    //   5213: aload_0
    //   5214: getfield tooth22 : Lnet/minecraft/client/model/ModelRenderer;
    //   5217: fload #7
    //   5219: invokevirtual render : (F)V
    //   5222: aload_0
    //   5223: getfield tooth23 : Lnet/minecraft/client/model/ModelRenderer;
    //   5226: fload #7
    //   5228: invokevirtual render : (F)V
    //   5231: aload_0
    //   5232: getfield rightleg3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5235: fload #7
    //   5237: invokevirtual render : (F)V
    //   5240: aload_0
    //   5241: getfield llegspike2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5244: fload #7
    //   5246: invokevirtual render : (F)V
    //   5249: aload_0
    //   5250: getfield rclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5253: fload #7
    //   5255: invokevirtual render : (F)V
    //   5258: aload_0
    //   5259: getfield rclaw4 : Lnet/minecraft/client/model/ModelRenderer;
    //   5262: fload #7
    //   5264: invokevirtual render : (F)V
    //   5267: aload_0
    //   5268: getfield rclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5271: fload #7
    //   5273: invokevirtual render : (F)V
    //   5276: aload_0
    //   5277: getfield rclaw5 : Lnet/minecraft/client/model/ModelRenderer;
    //   5280: fload #7
    //   5282: invokevirtual render : (F)V
    //   5285: aload_0
    //   5286: getfield rclaw7 : Lnet/minecraft/client/model/ModelRenderer;
    //   5289: fload #7
    //   5291: invokevirtual render : (F)V
    //   5294: aload_0
    //   5295: getfield rclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5298: fload #7
    //   5300: invokevirtual render : (F)V
    //   5303: aload_0
    //   5304: getfield rclaw6 : Lnet/minecraft/client/model/ModelRenderer;
    //   5307: fload #7
    //   5309: invokevirtual render : (F)V
    //   5312: aload_0
    //   5313: getfield wing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5316: fload #7
    //   5318: invokevirtual render : (F)V
    //   5321: aload_0
    //   5322: getfield wing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5325: fload #7
    //   5327: invokevirtual render : (F)V
    //   5330: aload_0
    //   5331: getfield wing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5334: fload #7
    //   5336: invokevirtual render : (F)V
    //   5339: aload_0
    //   5340: getfield mem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5343: fload #7
    //   5345: invokevirtual render : (F)V
    //   5348: aload_0
    //   5349: getfield mem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5352: fload #7
    //   5354: invokevirtual render : (F)V
    //   5357: aload_0
    //   5358: getfield mem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5361: fload #7
    //   5363: invokevirtual render : (F)V
    //   5366: aload_0
    //   5367: getfield wingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5370: fload #7
    //   5372: invokevirtual render : (F)V
    //   5375: aload_0
    //   5376: getfield wingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5379: fload #7
    //   5381: invokevirtual render : (F)V
    //   5384: aload_0
    //   5385: getfield wingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5388: fload #7
    //   5390: invokevirtual render : (F)V
    //   5393: aload_0
    //   5394: getfield lshoulder : Lnet/minecraft/client/model/ModelRenderer;
    //   5397: fload #7
    //   5399: invokevirtual render : (F)V
    //   5402: aload_0
    //   5403: getfield rshoulder : Lnet/minecraft/client/model/ModelRenderer;
    //   5406: fload #7
    //   5408: invokevirtual render : (F)V
    //   5411: aload_0
    //   5412: getfield rwing1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5415: fload #7
    //   5417: invokevirtual render : (F)V
    //   5420: aload_0
    //   5421: getfield rmem1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5424: fload #7
    //   5426: invokevirtual render : (F)V
    //   5429: aload_0
    //   5430: getfield rwing2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5433: fload #7
    //   5435: invokevirtual render : (F)V
    //   5438: aload_0
    //   5439: getfield rmem2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5442: fload #7
    //   5444: invokevirtual render : (F)V
    //   5447: aload_0
    //   5448: getfield rwing3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5451: fload #7
    //   5453: invokevirtual render : (F)V
    //   5456: aload_0
    //   5457: getfield rmem3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5460: fload #7
    //   5462: invokevirtual render : (F)V
    //   5465: aload_0
    //   5466: getfield rwingclaw1 : Lnet/minecraft/client/model/ModelRenderer;
    //   5469: fload #7
    //   5471: invokevirtual render : (F)V
    //   5474: aload_0
    //   5475: getfield rwingclaw2 : Lnet/minecraft/client/model/ModelRenderer;
    //   5478: fload #7
    //   5480: invokevirtual render : (F)V
    //   5483: aload_0
    //   5484: getfield rwingclaw3 : Lnet/minecraft/client/model/ModelRenderer;
    //   5487: fload #7
    //   5489: invokevirtual render : (F)V
    //   5492: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #737	-> 0
    //   #738	-> 6
    //   #739	-> 9
    //   #740	-> 12
    //   #741	-> 15
    //   #742	-> 20
    //   #743	-> 25
    //   #745	-> 30
    //   #747	-> 37
    //   #748	-> 52
    //   #751	-> 67
    //   #757	-> 74
    //   #758	-> 82
    //   #760	-> 112
    //   #763	-> 143
    //   #764	-> 152
    //   #765	-> 161
    //   #766	-> 176
    //   #767	-> 206
    //   #768	-> 236
    //   #769	-> 251
    //   #770	-> 265
    //   #771	-> 279
    //   #772	-> 290
    //   #773	-> 321
    //   #774	-> 352
    //   #775	-> 363
    //   #776	-> 377
    //   #777	-> 391
    //   #778	-> 421
    //   #779	-> 451
    //   #781	-> 481
    //   #782	-> 491
    //   #783	-> 501
    //   #784	-> 517
    //   #785	-> 547
    //   #786	-> 577
    //   #787	-> 593
    //   #788	-> 607
    //   #789	-> 621
    //   #790	-> 633
    //   #791	-> 664
    //   #792	-> 695
    //   #793	-> 707
    //   #794	-> 721
    //   #795	-> 735
    //   #796	-> 766
    //   #797	-> 796
    //   #803	-> 826
    //   #804	-> 834
    //   #805	-> 842
    //   #807	-> 856
    //   #809	-> 867
    //   #810	-> 885
    //   #811	-> 923
    //   #812	-> 953
    //   #813	-> 999
    //   #814	-> 1045
    //   #815	-> 1091
    //   #816	-> 1137
    //   #817	-> 1183
    //   #818	-> 1213
    //   #824	-> 1235
    //   #825	-> 1243
    //   #826	-> 1267
    //   #828	-> 1278
    //   #829	-> 1295
    //   #831	-> 1302
    //   #833	-> 1313
    //   #834	-> 1319
    //   #837	-> 1347
    //   #839	-> 1354
    //   #840	-> 1362
    //   #841	-> 1386
    //   #843	-> 1397
    //   #846	-> 1405
    //   #847	-> 1446
    //   #848	-> 1463
    //   #849	-> 1504
    //   #856	-> 1529
    //   #857	-> 1533
    //   #858	-> 1537
    //   #859	-> 1545
    //   #861	-> 1552
    //   #863	-> 1560
    //   #864	-> 1563
    //   #865	-> 1566
    //   #866	-> 1575
    //   #867	-> 1594
    //   #869	-> 1616
    //   #870	-> 1619
    //   #871	-> 1622
    //   #873	-> 1625
    //   #874	-> 1632
    //   #875	-> 1641
    //   #877	-> 1656
    //   #880	-> 1665
    //   #881	-> 1682
    //   #882	-> 1736
    //   #884	-> 1790
    //   #885	-> 1812
    //   #886	-> 1834
    //   #887	-> 1857
    //   #890	-> 1880
    //   #891	-> 1903
    //   #892	-> 1926
    //   #893	-> 1970
    //   #895	-> 2009
    //   #896	-> 2012
    //   #897	-> 2015
    //   #898	-> 2024
    //   #899	-> 2050
    //   #901	-> 2079
    //   #902	-> 2082
    //   #903	-> 2085
    //   #905	-> 2088
    //   #906	-> 2095
    //   #907	-> 2104
    //   #909	-> 2119
    //   #911	-> 2128
    //   #912	-> 2145
    //   #913	-> 2199
    //   #915	-> 2253
    //   #916	-> 2275
    //   #917	-> 2297
    //   #918	-> 2320
    //   #921	-> 2343
    //   #922	-> 2366
    //   #923	-> 2389
    //   #924	-> 2433
    //   #926	-> 2472
    //   #927	-> 2528
    //   #931	-> 2587
    //   #932	-> 2591
    //   #933	-> 2595
    //   #934	-> 2603
    //   #936	-> 2629
    //   #938	-> 2632
    //   #939	-> 2641
    //   #940	-> 2657
    //   #941	-> 2670
    //   #942	-> 2724
    //   #943	-> 2778
    //   #945	-> 2832
    //   #946	-> 2854
    //   #947	-> 2876
    //   #948	-> 2894
    //   #951	-> 2912
    //   #952	-> 2934
    //   #953	-> 2956
    //   #954	-> 2995
    //   #957	-> 3034
    //   #958	-> 3043
    //   #959	-> 3059
    //   #960	-> 3072
    //   #961	-> 3126
    //   #962	-> 3180
    //   #964	-> 3234
    //   #965	-> 3256
    //   #966	-> 3278
    //   #967	-> 3296
    //   #970	-> 3314
    //   #971	-> 3336
    //   #972	-> 3358
    //   #973	-> 3397
    //   #979	-> 3436
    //   #980	-> 3444
    //   #981	-> 3452
    //   #983	-> 3460
    //   #984	-> 3468
    //   #986	-> 3473
    //   #988	-> 3502
    //   #989	-> 3532
    //   #990	-> 3564
    //   #992	-> 3594
    //   #993	-> 3624
    //   #994	-> 3654
    //   #996	-> 3686
    //   #997	-> 3716
    //   #998	-> 3746
    //   #1000	-> 3779
    //   #1001	-> 3809
    //   #1004	-> 3839
    //   #1005	-> 3867
    //   #1006	-> 3873
    //   #1011	-> 3890
    //   #1012	-> 3920
    //   #1013	-> 3950
    //   #1015	-> 3971
    //   #1016	-> 3993
    //   #1017	-> 4015
    //   #1019	-> 4037
    //   #1020	-> 4067
    //   #1021	-> 4097
    //   #1023	-> 4114
    //   #1024	-> 4128
    //   #1025	-> 4142
    //   #1027	-> 4156
    //   #1028	-> 4186
    //   #1029	-> 4216
    //   #1035	-> 4233
    //   #1036	-> 4263
    //   #1037	-> 4293
    //   #1039	-> 4314
    //   #1040	-> 4336
    //   #1041	-> 4358
    //   #1043	-> 4380
    //   #1044	-> 4410
    //   #1045	-> 4440
    //   #1047	-> 4457
    //   #1048	-> 4471
    //   #1049	-> 4485
    //   #1051	-> 4499
    //   #1052	-> 4529
    //   #1053	-> 4559
    //   #1056	-> 4576
    //   #1061	-> 4583
    //   #1062	-> 4592
    //   #1063	-> 4601
    //   #1064	-> 4610
    //   #1065	-> 4619
    //   #1066	-> 4628
    //   #1067	-> 4637
    //   #1068	-> 4646
    //   #1069	-> 4655
    //   #1070	-> 4664
    //   #1071	-> 4673
    //   #1072	-> 4682
    //   #1073	-> 4691
    //   #1074	-> 4700
    //   #1075	-> 4709
    //   #1076	-> 4718
    //   #1077	-> 4727
    //   #1078	-> 4736
    //   #1079	-> 4745
    //   #1080	-> 4754
    //   #1081	-> 4763
    //   #1082	-> 4772
    //   #1083	-> 4781
    //   #1084	-> 4790
    //   #1085	-> 4799
    //   #1086	-> 4808
    //   #1087	-> 4817
    //   #1088	-> 4826
    //   #1089	-> 4835
    //   #1090	-> 4844
    //   #1091	-> 4853
    //   #1092	-> 4862
    //   #1093	-> 4871
    //   #1094	-> 4880
    //   #1095	-> 4889
    //   #1096	-> 4898
    //   #1097	-> 4907
    //   #1098	-> 4916
    //   #1099	-> 4925
    //   #1100	-> 4934
    //   #1101	-> 4943
    //   #1102	-> 4952
    //   #1103	-> 4961
    //   #1104	-> 4970
    //   #1105	-> 4979
    //   #1106	-> 4988
    //   #1107	-> 4997
    //   #1108	-> 5006
    //   #1109	-> 5015
    //   #1110	-> 5024
    //   #1111	-> 5033
    //   #1112	-> 5042
    //   #1113	-> 5051
    //   #1114	-> 5060
    //   #1115	-> 5069
    //   #1116	-> 5078
    //   #1117	-> 5087
    //   #1118	-> 5096
    //   #1119	-> 5105
    //   #1120	-> 5114
    //   #1121	-> 5123
    //   #1122	-> 5132
    //   #1123	-> 5141
    //   #1124	-> 5150
    //   #1125	-> 5159
    //   #1126	-> 5168
    //   #1127	-> 5177
    //   #1128	-> 5186
    //   #1129	-> 5195
    //   #1130	-> 5204
    //   #1131	-> 5213
    //   #1132	-> 5222
    //   #1133	-> 5231
    //   #1134	-> 5240
    //   #1135	-> 5249
    //   #1136	-> 5258
    //   #1137	-> 5267
    //   #1138	-> 5276
    //   #1139	-> 5285
    //   #1140	-> 5294
    //   #1141	-> 5303
    //   #1142	-> 5312
    //   #1143	-> 5321
    //   #1144	-> 5330
    //   #1145	-> 5339
    //   #1146	-> 5348
    //   #1147	-> 5357
    //   #1148	-> 5366
    //   #1149	-> 5375
    //   #1150	-> 5384
    //   #1151	-> 5393
    //   #1152	-> 5402
    //   #1153	-> 5411
    //   #1154	-> 5420
    //   #1155	-> 5429
    //   #1156	-> 5438
    //   #1157	-> 5447
    //   #1158	-> 5456
    //   #1159	-> 5465
    //   #1160	-> 5474
    //   #1161	-> 5483
    //   #1163	-> 5492
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1563	1024	15	t1	F
    //   1566	1021	16	t2	F
    //   0	5493	0	this	Ldanger/orespawn/ModelPitchBlack;
    //   0	5493	1	entity	Lnet/minecraft/entity/Entity;
    //   0	5493	2	f	F
    //   0	5493	3	f1	F
    //   0	5493	4	f2	F
    //   0	5493	5	f3	F
    //   0	5493	6	f4	F
    //   0	5493	7	f5	F
    //   6	5487	8	e	Ldanger/orespawn/PitchBlack;
    //   9	5484	9	newangle	F
    //   12	5481	10	lspeed	F
    //   15	5478	11	r	Ldanger/orespawn/RenderInfo;
    //   20	5473	12	tailspeed	F
    //   25	5468	13	tailamp	F
    //   30	5463	14	pi4	F
    //   37	5456	17	pscale	F
    //   1533	3960	18	clawZ	F
    //   1537	3956	19	clawY	F
    //   1545	3948	20	clawZamp	F
    //   1552	3941	21	clawYamp	F
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
