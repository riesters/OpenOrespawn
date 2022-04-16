package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRobot4 extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer leftfootfront;
  
  ModelRenderer leftfootbase;
  
  ModelRenderer leftfootback;
  
  ModelRenderer leftfoottip;
  
  ModelRenderer leftshin;
  
  ModelRenderer leftcalf;
  
  ModelRenderer leftkneegaurd;
  
  ModelRenderer leftthigh;
  
  ModelRenderer rightfootfront;
  
  ModelRenderer rightfoottip;
  
  ModelRenderer rightfootbase;
  
  ModelRenderer rightfootback;
  
  ModelRenderer rightshin;
  
  ModelRenderer rightcalf;
  
  ModelRenderer rightkneegaurd;
  
  ModelRenderer rightthigh;
  
  ModelRenderer hips;
  
  ModelRenderer stomach;
  
  ModelRenderer chest;
  
  ModelRenderer neck;
  
  ModelRenderer head;
  
  ModelRenderer righttopspinebase;
  
  ModelRenderer lefttopspinebase;
  
  ModelRenderer righttopspinetip;
  
  ModelRenderer lefttopspinetip;
  
  ModelRenderer middlerightspinebase;
  
  ModelRenderer middleleftspinebase;
  
  ModelRenderer middleleftspinetip;
  
  ModelRenderer middlerightspinetip;
  
  ModelRenderer torso;
  
  ModelRenderer rightsholder;
  
  ModelRenderer leftsholder;
  
  ModelRenderer rightsholdergaurd;
  
  ModelRenderer sheildbase;
  
  ModelRenderer sheildtip;
  
  ModelRenderer rightupperarm;
  
  ModelRenderer rightlowerarm;
  
  ModelRenderer sheildend;
  
  ModelRenderer leftupperarm;
  
  ModelRenderer sholdergaurdtip;
  
  ModelRenderer cannonbase;
  
  ModelRenderer cannonend;
  
  ModelRenderer leftcannonpiece;
  
  ModelRenderer topcannonpiece;
  
  ModelRenderer rightcannonpiece;
  
  ModelRenderer bottomcannonpiece;
  
  ModelRenderer glowycannonbit1;
  
  ModelRenderer glowycannonbit2;
  
  ModelRenderer glowycannonbit3;
  
  ModelRenderer glowycannonbit4;
  
  ModelRenderer glowycannonbit5;
  
  ModelRenderer cannonammo;
  
  ModelRenderer lowerrightspinebase;
  
  ModelRenderer lowerleftspinebase;
  
  ModelRenderer lowerrightspinetip;
  
  ModelRenderer lowerleftspinetip;
  
  public ModelRobot4(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.leftfootfront = new ModelRenderer(this, 20, 50);
    this.leftfootfront.addBox(-6.0F, 22.0F, -9.0F, 8, 5, 7);
    this.leftfootfront.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftfootfront.setTextureSize(512, 512);
    this.leftfootfront.mirror = true;
    setRotation(this.leftfootfront, 0.0F, 0.0F, 0.0F);
    this.leftfootbase = new ModelRenderer(this, 20, 100);
    this.leftfootbase.addBox(-4.0F, 22.0F, -4.0F, 4, 5, 5);
    this.leftfootbase.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftfootbase.setTextureSize(512, 512);
    this.leftfootbase.mirror = true;
    setRotation(this.leftfootbase, 0.0F, 0.0F, 0.0F);
    this.leftfootback = new ModelRenderer(this, 20, 150);
    this.leftfootback.addBox(-4.5F, 22.0F, 1.0F, 5, 5, 4);
    this.leftfootback.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftfootback.setTextureSize(512, 512);
    this.leftfootback.mirror = true;
    setRotation(this.leftfootback, 0.0F, 0.0F, 0.0F);
    this.leftfoottip = new ModelRenderer(this, 20, 200);
    this.leftfoottip.addBox(-4.5F, 23.0F, -12.0F, 5, 4, 3);
    this.leftfoottip.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftfoottip.setTextureSize(512, 512);
    this.leftfoottip.mirror = true;
    setRotation(this.leftfoottip, 0.0F, 0.0F, 0.0F);
    this.leftshin = new ModelRenderer(this, 20, 250);
    this.leftshin.addBox(-5.0F, 10.0F, -9.0F, 6, 13, 6);
    this.leftshin.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftshin.setTextureSize(512, 512);
    this.leftshin.mirror = true;
    setRotation(this.leftshin, 0.1745329F, 0.0F, 0.0F);
    this.leftcalf = new ModelRenderer(this, 20, 300);
    this.leftcalf.addBox(-6.0F, 10.0F, -9.0F, 8, 8, 9);
    this.leftcalf.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftcalf.setTextureSize(512, 512);
    this.leftcalf.mirror = true;
    setRotation(this.leftcalf, 0.1745329F, 0.0F, 0.0F);
    this.leftkneegaurd = new ModelRenderer(this, 20, 350);
    this.leftkneegaurd.addBox(-5.5F, 4.0F, -14.0F, 7, 7, 1);
    this.leftkneegaurd.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftkneegaurd.setTextureSize(512, 512);
    this.leftkneegaurd.mirror = true;
    setRotation(this.leftkneegaurd, 0.6283185F, 0.0F, 0.0F);
    this.leftthigh = new ModelRenderer(this, 20, 400);
    this.leftthigh.addBox(-5.0F, 0.0F, -4.0F, 6, 13, 8);
    this.leftthigh.setRotationPoint(-8.0F, -3.0F, 6.0F);
    this.leftthigh.setTextureSize(512, 512);
    this.leftthigh.mirror = true;
    setRotation(this.leftthigh, -0.1745329F, 0.1745329F, 0.0F);
    this.rightfootfront = new ModelRenderer(this, 20, 450);
    this.rightfootfront.addBox(0.0F, 22.0F, -9.0F, 8, 5, 7);
    this.rightfootfront.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightfootfront.setTextureSize(512, 512);
    this.rightfootfront.mirror = true;
    setRotation(this.rightfootfront, 0.0F, 0.0F, 0.0F);
    this.rightfoottip = new ModelRenderer(this, 100, 50);
    this.rightfoottip.addBox(1.5F, 23.0F, -12.0F, 5, 4, 3);
    this.rightfoottip.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightfoottip.setTextureSize(512, 512);
    this.rightfoottip.mirror = true;
    setRotation(this.rightfoottip, 0.0F, 0.0F, 0.0F);
    this.rightfootbase = new ModelRenderer(this, 100, 150);
    this.rightfootbase.addBox(2.0F, 22.0F, -4.0F, 4, 5, 5);
    this.rightfootbase.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightfootbase.setTextureSize(512, 512);
    this.rightfootbase.mirror = true;
    setRotation(this.rightfootbase, 0.0F, 0.0F, 0.0F);
    this.rightfootback = new ModelRenderer(this, 100, 100);
    this.rightfootback.addBox(1.5F, 22.0F, 1.0F, 5, 5, 4);
    this.rightfootback.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightfootback.setTextureSize(512, 512);
    this.rightfootback.mirror = true;
    setRotation(this.rightfootback, 0.0F, 0.0F, 0.0F);
    this.rightshin = new ModelRenderer(this, 100, 200);
    this.rightshin.addBox(1.0F, 10.0F, -9.0F, 6, 13, 6);
    this.rightshin.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightshin.setTextureSize(512, 512);
    this.rightshin.mirror = true;
    setRotation(this.rightshin, 0.1745329F, 0.0F, 0.0F);
    this.rightcalf = new ModelRenderer(this, 100, 250);
    this.rightcalf.addBox(0.0F, 10.0F, -10.0F, 8, 8, 9);
    this.rightcalf.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightcalf.setTextureSize(512, 512);
    this.rightcalf.mirror = true;
    setRotation(this.rightcalf, 0.1745329F, 0.0F, 0.0F);
    this.rightkneegaurd = new ModelRenderer(this, 100, 300);
    this.rightkneegaurd.addBox(0.5F, 4.0F, -15.0F, 7, 7, 1);
    this.rightkneegaurd.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightkneegaurd.setTextureSize(512, 512);
    this.rightkneegaurd.mirror = true;
    setRotation(this.rightkneegaurd, 0.6283185F, 0.0F, 0.0F);
    this.rightthigh = new ModelRenderer(this, 100, 400);
    this.rightthigh.addBox(0.0F, 0.0F, -5.0F, 6, 13, 8);
    this.rightthigh.setRotationPoint(5.0F, -3.0F, 6.0F);
    this.rightthigh.setTextureSize(512, 512);
    this.rightthigh.mirror = true;
    setRotation(this.rightthigh, -0.1745329F, -0.1745329F, 0.0F);
    this.rightthigh.mirror = false;
    this.hips = new ModelRenderer(this, 100, 350);
    this.hips.addBox(0.0F, 0.0F, 0.0F, 14, 7, 8);
    this.hips.setRotationPoint(-8.0F, -3.0F, 2.0F);
    this.hips.setTextureSize(512, 512);
    this.hips.mirror = true;
    setRotation(this.hips, 0.1396263F, 0.0F, 0.0F);
    this.stomach = new ModelRenderer(this, 100, 450);
    this.stomach.addBox(0.0F, 0.0F, 0.0F, 12, 6, 7);
    this.stomach.setRotationPoint(-7.0F, -9.0F, 2.0F);
    this.stomach.setTextureSize(512, 512);
    this.stomach.mirror = true;
    setRotation(this.stomach, 0.1396263F, 0.0F, 0.0F);
    this.chest = new ModelRenderer(this, 200, 50);
    this.chest.addBox(0.0F, 0.0F, 0.0F, 18, 12, 13);
    this.chest.setRotationPoint(-10.0F, -23.0F, -4.0F);
    this.chest.setTextureSize(512, 512);
    this.chest.mirror = true;
    setRotation(this.chest, 0.2443461F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 200, 100);
    this.neck.addBox(0.0F, 0.0F, 0.0F, 6, 7, 6);
    this.neck.setRotationPoint(-4.0F, -22.0F, -7.0F);
    this.neck.setTextureSize(512, 512);
    this.neck.mirror = true;
    setRotation(this.neck, 0.8726646F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 200, 150);
    this.head.addBox(-3.0F, -3.0F, -5.0F, 6, 6, 8);
    this.head.setRotationPoint(-1.0F, -26.0F, -5.0F);
    this.head.setTextureSize(512, 512);
    this.head.mirror = true;
    setRotation(this.head, 0.5235988F, 0.0F, 0.0F);
    this.righttopspinebase = new ModelRenderer(this, 200, 200);
    this.righttopspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.righttopspinebase.setRotationPoint(3.0F, -29.0F, 5.0F);
    this.righttopspinebase.setTextureSize(512, 512);
    this.righttopspinebase.mirror = true;
    setRotation(this.righttopspinebase, -0.1396263F, 0.0F, 0.0F);
    this.lefttopspinebase = new ModelRenderer(this, 200, 250);
    this.lefttopspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.lefttopspinebase.setRotationPoint(-7.0F, -29.0F, 5.0F);
    this.lefttopspinebase.setTextureSize(512, 512);
    this.lefttopspinebase.mirror = true;
    setRotation(this.lefttopspinebase, -0.1396263F, 0.0F, 0.0F);
    this.righttopspinetip = new ModelRenderer(this, 200, 300);
    this.righttopspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.righttopspinetip.setRotationPoint(3.5F, -35.0F, 8.0F);
    this.righttopspinetip.setTextureSize(512, 512);
    this.righttopspinetip.mirror = true;
    setRotation(this.righttopspinetip, -0.3316126F, 0.0F, 0.0F);
    this.lefttopspinetip = new ModelRenderer(this, 200, 350);
    this.lefttopspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.lefttopspinetip.setRotationPoint(-6.5F, -35.0F, 8.0F);
    this.lefttopspinetip.setTextureSize(512, 512);
    this.lefttopspinetip.mirror = true;
    setRotation(this.lefttopspinetip, -0.3316126F, 0.0F, 0.0F);
    this.middlerightspinebase = new ModelRenderer(this, 200, 400);
    this.middlerightspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.middlerightspinebase.setRotationPoint(-6.0F, -25.0F, 14.0F);
    this.middlerightspinebase.setTextureSize(512, 512);
    this.middlerightspinebase.mirror = true;
    setRotation(this.middlerightspinebase, -0.6981317F, 0.0F, 0.0F);
    this.middleleftspinebase = new ModelRenderer(this, 200, 450);
    this.middleleftspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.middleleftspinebase.setRotationPoint(2.0F, -25.0F, 14.0F);
    this.middleleftspinebase.setTextureSize(512, 512);
    this.middleleftspinebase.mirror = true;
    setRotation(this.middleleftspinebase, -0.6981317F, 0.0F, 0.0F);
    this.middleleftspinetip = new ModelRenderer(this, 300, 50);
    this.middleleftspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.middleleftspinetip.setRotationPoint(2.5F, -28.0F, 18.0F);
    this.middleleftspinetip.setTextureSize(512, 512);
    this.middleleftspinetip.mirror = true;
    setRotation(this.middleleftspinetip, -0.7853982F, 0.0F, 0.0F);
    this.middlerightspinetip = new ModelRenderer(this, 300, 100);
    this.middlerightspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.middlerightspinetip.setRotationPoint(-5.5F, -28.0F, 18.0F);
    this.middlerightspinetip.setTextureSize(512, 512);
    this.middlerightspinetip.mirror = true;
    setRotation(this.middlerightspinetip, -0.7853982F, 0.0F, 0.0F);
    this.torso = new ModelRenderer(this, 300, 150);
    this.torso.addBox(0.0F, 0.0F, 0.0F, 14, 6, 10);
    this.torso.setRotationPoint(-8.0F, -13.0F, 0.0F);
    this.torso.setTextureSize(512, 512);
    this.torso.mirror = true;
    setRotation(this.torso, 0.1396263F, 0.0F, 0.0F);
    this.rightsholder = new ModelRenderer(this, 300, 200);
    this.rightsholder.addBox(0.0F, -3.0F, -3.0F, 6, 6, 6);
    this.rightsholder.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.rightsholder.setTextureSize(512, 512);
    this.rightsholder.mirror = true;
    setRotation(this.rightsholder, 0.0F, 0.0F, 0.0F);
    this.leftsholder = new ModelRenderer(this, 300, 250);
    this.leftsholder.addBox(-6.0F, -3.0F, -3.0F, 6, 6, 6);
    this.leftsholder.setRotationPoint(-9.0F, -18.0F, 4.0F);
    this.leftsholder.setTextureSize(512, 512);
    this.leftsholder.mirror = true;
    setRotation(this.leftsholder, 0.0F, 0.0F, 0.0F);
    this.rightsholdergaurd = new ModelRenderer(this, 300, 300);
    this.rightsholdergaurd.addBox(8.0F, -4.0F, -4.0F, 4, 12, 9);
    this.rightsholdergaurd.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.rightsholdergaurd.setTextureSize(512, 512);
    this.rightsholdergaurd.mirror = true;
    setRotation(this.rightsholdergaurd, -0.2094395F, 0.0F, 0.0F);
    this.sheildbase = new ModelRenderer(this, 300, 350);
    this.sheildbase.addBox(8.0F, -4.0F, -30.0F, 3, 12, 19);
    this.sheildbase.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.sheildbase.setTextureSize(512, 512);
    this.sheildbase.mirror = true;
    setRotation(this.sheildbase, 1.047198F, 0.0F, 0.0F);
    this.sheildtip = new ModelRenderer(this, 300, 400);
    this.sheildtip.addBox(9.0F, -2.0F, -34.0F, 3, 8, 4);
    this.sheildtip.setRotationPoint(6.0F, -18.0F, 4.0F);
    this.sheildtip.setTextureSize(512, 512);
    this.sheildtip.mirror = true;
    setRotation(this.sheildtip, 1.047198F, 0.0F, 0.0F);
    this.rightupperarm = new ModelRenderer(this, 300, 450);
    this.rightupperarm.addBox(3.0F, -1.0F, -4.0F, 6, 13, 6);
    this.rightupperarm.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.rightupperarm.setTextureSize(512, 512);
    this.rightupperarm.mirror = true;
    setRotation(this.rightupperarm, -0.2094395F, 0.0F, 0.0F);
    this.rightlowerarm = new ModelRenderer(this, 350, 50);
    this.rightlowerarm.addBox(3.0F, 0.0F, -25.0F, 6, 6, 14);
    this.rightlowerarm.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.rightlowerarm.setTextureSize(512, 512);
    this.rightlowerarm.mirror = true;
    setRotation(this.rightlowerarm, 1.047198F, 0.0F, 0.0F);
    this.sheildend = new ModelRenderer(this, 350, 100);
    this.sheildend.addBox(8.0F, -1.0F, -11.0F, 3, 8, 4);
    this.sheildend.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.sheildend.setTextureSize(512, 512);
    this.sheildend.mirror = true;
    setRotation(this.sheildend, 1.047198F, 0.0F, 0.0F);
    this.leftupperarm = new ModelRenderer(this, 350, 200);
    this.leftupperarm.addBox(-9.0F, -1.0F, -4.0F, 6, 15, 6);
    this.leftupperarm.setRotationPoint(-9.0F, -18.0F, 4.0F);
    this.leftupperarm.setTextureSize(512, 512);
    this.leftupperarm.mirror = true;
    setRotation(this.leftupperarm, -0.2094395F, 0.0F, 0.0F);
    this.sholdergaurdtip = new ModelRenderer(this, 350, 250);
    this.sholdergaurdtip.addBox(10.0F, -3.0F, -7.0F, 2, 5, 3);
    this.sholdergaurdtip.setRotationPoint(7.0F, -18.0F, 4.0F);
    this.sholdergaurdtip.setTextureSize(512, 512);
    this.sholdergaurdtip.mirror = true;
    setRotation(this.sholdergaurdtip, -0.2094395F, 0.0F, 0.0F);
    this.cannonbase = new ModelRenderer(this, 350, 300);
    this.cannonbase.addBox(-4.0F, 0.0F, -4.0F, 8, 12, 8);
    this.cannonbase.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.cannonbase.setTextureSize(512, 512);
    this.cannonbase.mirror = true;
    setRotation(this.cannonbase, -0.6981317F, 0.0F, 0.0F);
    this.cannonend = new ModelRenderer(this, 350, 400);
    this.cannonend.addBox(-3.0F, 11.0F, -3.0F, 6, 4, 6);
    this.cannonend.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.cannonend.setTextureSize(512, 512);
    this.cannonend.mirror = true;
    setRotation(this.cannonend, -0.6981317F, 0.0F, 0.0F);
    this.leftcannonpiece = new ModelRenderer(this, 20, 20);
    this.leftcannonpiece.addBox(-5.0F, 11.0F, -1.5F, 3, 6, 3);
    this.leftcannonpiece.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.leftcannonpiece.setTextureSize(512, 512);
    this.leftcannonpiece.mirror = true;
    setRotation(this.leftcannonpiece, -0.6981317F, 0.0F, 0.0F);
    this.topcannonpiece = new ModelRenderer(this, 40, 20);
    this.topcannonpiece.addBox(-1.5F, 11.0F, -5.0F, 3, 6, 3);
    this.topcannonpiece.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.topcannonpiece.setTextureSize(512, 512);
    this.topcannonpiece.mirror = true;
    setRotation(this.topcannonpiece, -0.6981317F, 0.0F, 0.0F);
    this.rightcannonpiece = new ModelRenderer(this, 80, 20);
    this.rightcannonpiece.addBox(2.0F, 11.0F, -1.5F, 3, 6, 3);
    this.rightcannonpiece.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.rightcannonpiece.setTextureSize(512, 512);
    this.rightcannonpiece.mirror = true;
    setRotation(this.rightcannonpiece, -0.6981317F, 0.0F, 0.0F);
    this.bottomcannonpiece = new ModelRenderer(this, 100, 20);
    this.bottomcannonpiece.addBox(-1.5F, 11.0F, 2.0F, 3, 6, 3);
    this.bottomcannonpiece.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.bottomcannonpiece.setTextureSize(512, 512);
    this.bottomcannonpiece.mirror = true;
    setRotation(this.bottomcannonpiece, -0.6981317F, 0.0F, 0.0F);
    this.glowycannonbit1 = new ModelRenderer(this, 150, 20);
    this.glowycannonbit1.addBox(-3.5F, 0.0F, -11.0F, 2, 5, 2);
    this.glowycannonbit1.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.glowycannonbit1.setTextureSize(512, 512);
    this.glowycannonbit1.mirror = true;
    setRotation(this.glowycannonbit1, 0.1745329F, 0.0F, 0.0F);
    this.glowycannonbit2 = new ModelRenderer(this, 200, 20);
    this.glowycannonbit2.addBox(1.5F, 0.0F, -11.0F, 2, 5, 2);
    this.glowycannonbit2.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.glowycannonbit2.setTextureSize(512, 512);
    this.glowycannonbit2.mirror = true;
    setRotation(this.glowycannonbit2, 0.1745329F, 0.0F, 0.0F);
    this.glowycannonbit3 = new ModelRenderer(this, 250, 20);
    this.glowycannonbit3.addBox(-3.0F, -2.0F, -8.0F, 2, 5, 2);
    this.glowycannonbit3.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.glowycannonbit3.setTextureSize(512, 512);
    this.glowycannonbit3.mirror = true;
    setRotation(this.glowycannonbit3, 0.0872665F, 0.0F, 0.0F);
    this.glowycannonbit4 = new ModelRenderer(this, 300, 20);
    this.glowycannonbit4.addBox(1.0F, -2.0F, -8.0F, 2, 5, 2);
    this.glowycannonbit4.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.glowycannonbit4.setTextureSize(512, 512);
    this.glowycannonbit4.mirror = true;
    setRotation(this.glowycannonbit4, 0.0872665F, 0.0F, 0.0F);
    this.glowycannonbit5 = new ModelRenderer(this, 350, 20);
    this.glowycannonbit5.addBox(-1.0F, -5.0F, -5.0F, 2, 5, 2);
    this.glowycannonbit5.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.glowycannonbit5.setTextureSize(512, 512);
    this.glowycannonbit5.mirror = true;
    setRotation(this.glowycannonbit5, 0.0F, 0.0F, 0.0F);
    this.cannonammo = new ModelRenderer(this, 400, 400);
    this.cannonammo.addBox(-6.0F, 3.0F, 0.0F, 5, 5, 5);
    this.cannonammo.setRotationPoint(-15.0F, -5.0F, 1.0F);
    this.cannonammo.setTextureSize(512, 512);
    this.cannonammo.mirror = true;
    setRotation(this.cannonammo, -0.6981317F, 0.0F, 0.0F);
    this.lowerrightspinebase = new ModelRenderer(this, 400, 450);
    this.lowerrightspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.lowerrightspinebase.setRotationPoint(4.0F, -19.0F, 15.0F);
    this.lowerrightspinebase.setTextureSize(512, 512);
    this.lowerrightspinebase.mirror = true;
    setRotation(this.lowerrightspinebase, -1.047198F, 0.0F, 0.0F);
    this.lowerleftspinebase = new ModelRenderer(this, 360, 450);
    this.lowerleftspinebase.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.lowerleftspinebase.setRotationPoint(-8.0F, -19.0F, 15.0F);
    this.lowerleftspinebase.setTextureSize(512, 512);
    this.lowerleftspinebase.mirror = true;
    setRotation(this.lowerleftspinebase, -1.047198F, 0.0F, 0.0F);
    this.lowerrightspinetip = new ModelRenderer(this, 250, 100);
    this.lowerrightspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.lowerrightspinetip.setRotationPoint(4.5F, -21.0F, 20.0F);
    this.lowerrightspinetip.setTextureSize(512, 512);
    this.lowerrightspinetip.mirror = true;
    setRotation(this.lowerrightspinetip, -1.134464F, 0.0F, 0.0F);
    this.lowerleftspinetip = new ModelRenderer(this, 150, 100);
    this.lowerleftspinetip.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.lowerleftspinetip.setRotationPoint(-7.5F, -21.0F, 20.0F);
    this.lowerleftspinetip.setTextureSize(512, 512);
    this.lowerleftspinetip.mirror = true;
    setRotation(this.lowerleftspinetip, -1.134464F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Robot4 e = (Robot4)entity;
    float newangle = 0.0F;
    float nextangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.15F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.leftfootfront.rotateAngleX = newangle;
    this.leftfootbase.rotateAngleX = newangle;
    this.leftfootback.rotateAngleX = newangle;
    this.leftfoottip.rotateAngleX = newangle;
    this.leftshin.rotateAngleX = newangle;
    this.leftcalf.rotateAngleX = newangle + 0.175F;
    this.leftkneegaurd.rotateAngleX = newangle + 0.63F;
    this.leftthigh.rotateAngleX = newangle - 0.175F;
    this.rightfootfront.rotateAngleX = -newangle;
    this.rightfoottip.rotateAngleX = -newangle;
    this.rightfootbase.rotateAngleX = -newangle;
    this.rightfootback.rotateAngleX = -newangle;
    this.rightshin.rotateAngleX = -newangle;
    this.rightcalf.rotateAngleX = -newangle + 0.175F;
    this.rightkneegaurd.rotateAngleX = -newangle + 0.63F;
    this.rightthigh.rotateAngleX = -newangle - 0.175F;
    this.head.rotateAngleY = (float)Math.toRadians(f3 / 1.5D);
    float amp = 0.7853982F;
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos((float)Math.toRadians((f2 % 360.0F)) * this.wingspeed * 6.0F) * amp;
      newangle = Math.abs(newangle);
      newangle += 0.75F;
    } else {
      newangle = 0.0F;
    } 
    if (newangle > amp / 3.0D) {
      e.setShielding(1);
    } else {
      e.setShielding(0);
    } 
    this.rightsholder.rotateAngleX = -newangle;
    this.rightsholdergaurd.rotateAngleX = -newangle - 0.21F;
    this.sheildbase.rotateAngleX = -newangle + 1.047F;
    this.sheildtip.rotateAngleX = -newangle + 1.047F;
    this.rightupperarm.rotateAngleX = -newangle - 0.21F;
    this.rightlowerarm.rotateAngleX = -newangle + 1.047F;
    this.sheildend.rotateAngleX = -newangle + 1.04F;
    this.sholdergaurdtip.rotateAngleX = -newangle - 0.21F;
    if (e.getAttacking() != 0) {
      newangle = 0.85F;
    } else {
      newangle = 0.0F;
    } 
    this.leftsholder.rotateAngleX = -newangle;
    this.leftupperarm.rotateAngleX = -newangle - 0.21F;
    this.cannonbase.rotateAngleX = -newangle - 0.7F;
    this.cannonend.rotateAngleX = -newangle - 0.7F;
    this.leftcannonpiece.rotateAngleX = -newangle - 0.7F;
    this.topcannonpiece.rotateAngleX = -newangle - 0.7F;
    this.rightcannonpiece.rotateAngleX = -newangle - 0.7F;
    this.bottomcannonpiece.rotateAngleX = -newangle - 0.7F;
    this.glowycannonbit1.rotateAngleX = -newangle + 0.17F;
    this.glowycannonbit2.rotateAngleX = -newangle + 0.17F;
    this.glowycannonbit3.rotateAngleX = -newangle + 0.08F;
    this.glowycannonbit4.rotateAngleX = -newangle + 0.08F;
    this.glowycannonbit5.rotateAngleX = -newangle;
    this.cannonammo.rotateAngleX = -newangle - 0.7F;
    double newposy = (float)(this.leftsholder.rotationPointY + Math.cos(this.leftupperarm.rotateAngleX) * 14.0D);
    double newposz = (float)(this.leftsholder.rotationPointZ + Math.sin(this.leftupperarm.rotateAngleX) * 14.0D);
    this.cannonbase.rotationPointY = (float)newposy;
    this.cannonbase.rotationPointZ = (float)newposz;
    this.cannonend.rotationPointY = (float)newposy;
    this.cannonend.rotationPointZ = (float)newposz;
    this.leftcannonpiece.rotationPointY = (float)newposy;
    this.leftcannonpiece.rotationPointZ = (float)newposz;
    this.topcannonpiece.rotationPointY = (float)newposy;
    this.topcannonpiece.rotationPointZ = (float)newposz;
    this.rightcannonpiece.rotationPointY = (float)newposy;
    this.rightcannonpiece.rotationPointZ = (float)newposz;
    this.bottomcannonpiece.rotationPointY = (float)newposy;
    this.bottomcannonpiece.rotationPointZ = (float)newposz;
    this.glowycannonbit1.rotationPointY = (float)newposy;
    this.glowycannonbit1.rotationPointZ = (float)newposz;
    this.glowycannonbit2.rotationPointY = (float)newposy;
    this.glowycannonbit2.rotationPointZ = (float)newposz;
    this.glowycannonbit3.rotationPointY = (float)newposy;
    this.glowycannonbit3.rotationPointZ = (float)newposz;
    this.glowycannonbit4.rotationPointY = (float)newposy;
    this.glowycannonbit4.rotationPointZ = (float)newposz;
    this.glowycannonbit5.rotationPointY = (float)newposy;
    this.glowycannonbit5.rotationPointZ = (float)newposz;
    this.cannonammo.rotationPointY = (float)newposy;
    this.cannonammo.rotationPointZ = (float)newposz;
    this.leftfootfront.render(f5);
    this.leftfootbase.render(f5);
    this.leftfootback.render(f5);
    this.leftfoottip.render(f5);
    this.leftshin.render(f5);
    this.leftcalf.render(f5);
    this.leftkneegaurd.render(f5);
    this.leftthigh.render(f5);
    this.rightfootfront.render(f5);
    this.rightfoottip.render(f5);
    this.rightfootbase.render(f5);
    this.rightfootback.render(f5);
    this.rightshin.render(f5);
    this.rightcalf.render(f5);
    this.rightkneegaurd.render(f5);
    this.rightthigh.render(f5);
    this.hips.render(f5);
    this.stomach.render(f5);
    this.chest.render(f5);
    this.neck.render(f5);
    this.head.render(f5);
    this.righttopspinebase.render(f5);
    this.lefttopspinebase.render(f5);
    this.righttopspinetip.render(f5);
    this.lefttopspinetip.render(f5);
    this.middlerightspinebase.render(f5);
    this.middleleftspinebase.render(f5);
    this.middleleftspinetip.render(f5);
    this.middlerightspinetip.render(f5);
    this.torso.render(f5);
    this.rightsholder.render(f5);
    this.leftsholder.render(f5);
    this.rightsholdergaurd.render(f5);
    this.sheildbase.render(f5);
    this.sheildtip.render(f5);
    this.rightupperarm.render(f5);
    this.rightlowerarm.render(f5);
    this.sheildend.render(f5);
    this.leftupperarm.render(f5);
    this.sholdergaurdtip.render(f5);
    this.cannonbase.render(f5);
    this.cannonend.render(f5);
    this.leftcannonpiece.render(f5);
    this.topcannonpiece.render(f5);
    this.rightcannonpiece.render(f5);
    this.bottomcannonpiece.render(f5);
    this.glowycannonbit1.render(f5);
    this.glowycannonbit2.render(f5);
    this.glowycannonbit3.render(f5);
    this.glowycannonbit4.render(f5);
    this.glowycannonbit5.render(f5);
    this.cannonammo.render(f5);
    this.lowerrightspinebase.render(f5);
    this.lowerleftspinebase.render(f5);
    this.lowerrightspinetip.render(f5);
    this.lowerleftspinetip.render(f5);
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
