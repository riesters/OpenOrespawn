package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEnderReaper extends ModelBase {
  ModelRenderer rwing1;
  
  ModelRenderer lwing1;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  ModelRenderer Shape10;
  
  ModelRenderer Shape11;
  
  ModelRenderer Shape12;
  
  ModelRenderer Shape13;
  
  ModelRenderer Shape14;
  
  ModelRenderer Shape15;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  ModelRenderer Shape18;
  
  ModelRenderer Shape19;
  
  ModelRenderer Shape20;
  
  ModelRenderer Shape21;
  
  ModelRenderer Shape22;
  
  ModelRenderer Shape23;
  
  ModelRenderer Shape24;
  
  ModelRenderer Shape25;
  
  ModelRenderer Shape26;
  
  ModelRenderer Shape27;
  
  ModelRenderer Shape28;
  
  ModelRenderer Shape29;
  
  ModelRenderer Shape30;
  
  ModelRenderer Shape31;
  
  ModelRenderer Shape32;
  
  ModelRenderer Shape33;
  
  ModelRenderer Shape34;
  
  ModelRenderer Shape35;
  
  ModelRenderer Shape36;
  
  ModelRenderer Shape37;
  
  ModelRenderer Shape38;
  
  ModelRenderer Shape39;
  
  ModelRenderer Shape40;
  
  ModelRenderer Shape41;
  
  ModelRenderer Shape42;
  
  ModelRenderer Shape43;
  
  ModelRenderer Shape44;
  
  ModelRenderer Shape45;
  
  ModelRenderer Shape46;
  
  ModelRenderer Shape47;
  
  ModelRenderer Shape48;
  
  ModelRenderer Shape49;
  
  ModelRenderer rarm2;
  
  ModelRenderer rarm3;
  
  ModelRenderer relbow;
  
  ModelRenderer rarm1;
  
  ModelRenderer Shape54;
  
  ModelRenderer larm3;
  
  ModelRenderer larm2;
  
  ModelRenderer lelbow;
  
  ModelRenderer larm1;
  
  ModelRenderer scythe1;
  
  ModelRenderer scythe2;
  
  ModelRenderer scythe3;
  
  ModelRenderer head;
  
  ModelRenderer lwing3;
  
  ModelRenderer lwing2;
  
  ModelRenderer rwing3;
  
  ModelRenderer rwing2;
  
  private float wingspeed = 1.0F;
  
  public ModelEnderReaper(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.rwing1 = new ModelRenderer(this, 20, 430);
    this.rwing1.addBox(0.0F, 0.0F, 0.0F, 0, 50, 17);
    this.rwing1.setRotationPoint(-4.0F, -6.9F, 8.5F);
    this.rwing1.setTextureSize(512, 512);
    this.rwing1.mirror = true;
    setRotation(this.rwing1, 1.745F, -0.785F, 0.0F);
    this.lwing1 = new ModelRenderer(this, 20, 350);
    this.lwing1.addBox(0.0F, 0.0F, 0.0F, 0, 50, 17);
    this.lwing1.setRotationPoint(4.0F, -6.9F, 8.5F);
    this.lwing1.setTextureSize(512, 512);
    this.lwing1.mirror = true;
    setRotation(this.lwing1, 1.745F, 0.785F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 20, 320);
    this.Shape3.addBox(-4.0F, 0.0F, -2.0F, 2, 12, 1);
    this.Shape3.setRotationPoint(3.0F, -14.0F, 10.0F);
    this.Shape3.setTextureSize(512, 512);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 40, 320);
    this.Shape4.addBox(-4.0F, 0.0F, -2.0F, 2, 6, 1);
    this.Shape4.setRotationPoint(3.0F, -2.0F, 10.0F);
    this.Shape4.setTextureSize(512, 512);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, -0.247F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 20, 310);
    this.Shape5.addBox(-4.0F, 0.0F, -2.0F, 1, 3, 1);
    this.Shape5.setRotationPoint(3.5F, 4.0F, 8.0F);
    this.Shape5.setTextureSize(512, 512);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, -0.768F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 20, 292);
    this.Shape6.addBox(-4.0F, 0.0F, -2.0F, 2, 6, 2);
    this.Shape6.setRotationPoint(3.0F, -12.0F, 7.5F);
    this.Shape6.setTextureSize(512, 512);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, -2.356F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 20, 280);
    this.Shape7.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape7.setRotationPoint(5.0F, -14.0F, 10.0F);
    this.Shape7.setTextureSize(512, 512);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 20, 269);
    this.Shape8.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape8.setRotationPoint(-1.0F, -14.0F, 10.0F);
    this.Shape8.setTextureSize(512, 512);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 20, 257);
    this.Shape9.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape9.setRotationPoint(-1.0F, -12.0F, 10.0F);
    this.Shape9.setTextureSize(512, 512);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 20, 246);
    this.Shape10.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape10.setRotationPoint(-1.0F, -10.0F, 10.0F);
    this.Shape10.setTextureSize(512, 512);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 20, 237);
    this.Shape11.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape11.setRotationPoint(-1.0F, -8.0F, 10.0F);
    this.Shape11.setTextureSize(512, 512);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 20, 228);
    this.Shape12.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape12.setRotationPoint(1.0F, -6.0F, 10.0F);
    this.Shape12.setTextureSize(512, 512);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
    this.Shape13 = new ModelRenderer(this, 20, 219);
    this.Shape13.addBox(-4.0F, 0.0F, -2.0F, 3, 1, 1);
    this.Shape13.setRotationPoint(1.0F, -4.0F, 10.0F);
    this.Shape13.setTextureSize(512, 512);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
    this.Shape14 = new ModelRenderer(this, 20, 209);
    this.Shape14.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape14.setRotationPoint(3.5F, -14.0F, 11.0F);
    this.Shape14.setTextureSize(512, 512);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 20, 201);
    this.Shape15.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape15.setRotationPoint(3.5F, -12.0F, 11.0F);
    this.Shape15.setTextureSize(512, 512);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 20, 194);
    this.Shape16.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape16.setRotationPoint(3.5F, -10.0F, 11.0F);
    this.Shape16.setTextureSize(512, 512);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 20, 185);
    this.Shape17.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape17.setRotationPoint(3.5F, -8.0F, 11.0F);
    this.Shape17.setTextureSize(512, 512);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
    this.Shape18 = new ModelRenderer(this, 20, 175);
    this.Shape18.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape18.setRotationPoint(3.5F, -6.0F, 11.0F);
    this.Shape18.setTextureSize(512, 512);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
    this.Shape19 = new ModelRenderer(this, 20, 165);
    this.Shape19.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1);
    this.Shape19.setRotationPoint(3.5F, -4.0F, 11.0F);
    this.Shape19.setTextureSize(512, 512);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
    this.Shape20 = new ModelRenderer(this, 20, 155);
    this.Shape20.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape20.setRotationPoint(5.0F, -12.0F, 10.0F);
    this.Shape20.setTextureSize(512, 512);
    this.Shape20.mirror = true;
    setRotation(this.Shape20, 0.0F, 0.0F, 0.0F);
    this.Shape21 = new ModelRenderer(this, 20, 146);
    this.Shape21.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape21.setRotationPoint(5.0F, -10.0F, 10.0F);
    this.Shape21.setTextureSize(512, 512);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, 0.0F, 0.0F, 0.0F);
    this.Shape22 = new ModelRenderer(this, 20, 139);
    this.Shape22.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape22.setRotationPoint(5.0F, -8.0F, 10.0F);
    this.Shape22.setTextureSize(512, 512);
    this.Shape22.mirror = true;
    setRotation(this.Shape22, 0.0F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 20, 132);
    this.Shape23.addBox(-4.0F, 0.0F, -2.0F, 3, 1, 1);
    this.Shape23.setRotationPoint(5.0F, -6.0F, 10.0F);
    this.Shape23.setTextureSize(512, 512);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
    this.Shape24 = new ModelRenderer(this, 20, 124);
    this.Shape24.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape24.setRotationPoint(5.0F, -4.0F, 10.0F);
    this.Shape24.setTextureSize(512, 512);
    this.Shape24.mirror = true;
    setRotation(this.Shape24, 0.0F, 0.0F, 0.0F);
    this.Shape25 = new ModelRenderer(this, 20, 114);
    this.Shape25.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 3);
    this.Shape25.setRotationPoint(6.0F, -4.0F, 8.0F);
    this.Shape25.setTextureSize(512, 512);
    this.Shape25.mirror = true;
    setRotation(this.Shape25, 0.0F, 0.0F, 0.0F);
    this.Shape26 = new ModelRenderer(this, 20, 106);
    this.Shape26.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape26.setRotationPoint(5.0F, -4.0F, 8.0F);
    this.Shape26.setTextureSize(512, 512);
    this.Shape26.mirror = true;
    setRotation(this.Shape26, 0.0F, 0.0F, 0.0F);
    this.Shape27 = new ModelRenderer(this, 20, 94);
    this.Shape27.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 5);
    this.Shape27.setRotationPoint(7.0F, -6.0F, 6.0F);
    this.Shape27.setTextureSize(512, 512);
    this.Shape27.mirror = true;
    setRotation(this.Shape27, 0.0F, 0.0F, 0.0F);
    this.Shape28 = new ModelRenderer(this, 20, 83);
    this.Shape28.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 5);
    this.Shape28.setRotationPoint(8.0F, -8.0F, 5.0F);
    this.Shape28.setTextureSize(512, 512);
    this.Shape28.mirror = true;
    setRotation(this.Shape28, 0.0F, 0.0F, 0.0F);
    this.Shape29 = new ModelRenderer(this, 20, 70);
    this.Shape29.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape29.setRotationPoint(8.0F, -10.0F, 4.0F);
    this.Shape29.setTextureSize(512, 512);
    this.Shape29.mirror = true;
    setRotation(this.Shape29, 0.0F, 0.0F, 0.0F);
    this.Shape30 = new ModelRenderer(this, 20, 59);
    this.Shape30.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape30.setRotationPoint(8.0F, -12.0F, 4.0F);
    this.Shape30.setTextureSize(512, 512);
    this.Shape30.mirror = true;
    setRotation(this.Shape30, 0.0F, 0.0F, 0.0F);
    this.Shape31 = new ModelRenderer(this, 20, 47);
    this.Shape31.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape31.setRotationPoint(8.0F, -14.0F, 4.0F);
    this.Shape31.setTextureSize(512, 512);
    this.Shape31.mirror = true;
    setRotation(this.Shape31, 0.0F, 0.0F, 0.0F);
    this.Shape32 = new ModelRenderer(this, 20, 37);
    this.Shape32.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape32.setRotationPoint(6.0F, -6.0F, 6.0F);
    this.Shape32.setTextureSize(512, 512);
    this.Shape32.mirror = true;
    setRotation(this.Shape32, 0.0F, 0.0F, 0.0F);
    this.Shape33 = new ModelRenderer(this, 20, 29);
    this.Shape33.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape33.setRotationPoint(5.0F, -8.0F, 5.0F);
    this.Shape33.setTextureSize(512, 512);
    this.Shape33.mirror = true;
    setRotation(this.Shape33, 0.0F, 0.0F, 0.0F);
    this.Shape34 = new ModelRenderer(this, 40, 312);
    this.Shape34.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape34.setRotationPoint(5.0F, -10.0F, 4.0F);
    this.Shape34.setTextureSize(512, 512);
    this.Shape34.mirror = true;
    setRotation(this.Shape34, 0.0F, 0.0F, 0.0F);
    this.Shape35 = new ModelRenderer(this, 40, 301);
    this.Shape35.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape35.setRotationPoint(5.0F, -12.0F, 4.0F);
    this.Shape35.setTextureSize(512, 512);
    this.Shape35.mirror = true;
    setRotation(this.Shape35, 0.0F, 0.0F, 0.0F);
    this.Shape36 = new ModelRenderer(this, 40, 291);
    this.Shape36.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape36.setRotationPoint(5.0F, -14.0F, 4.0F);
    this.Shape36.setTextureSize(512, 512);
    this.Shape36.mirror = true;
    setRotation(this.Shape36, 0.0F, 0.0F, 0.0F);
    this.Shape37 = new ModelRenderer(this, 40, 278);
    this.Shape37.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 3);
    this.Shape37.setRotationPoint(1.0F, -4.0F, 8.0F);
    this.Shape37.setTextureSize(512, 512);
    this.Shape37.mirror = true;
    setRotation(this.Shape37, 0.0F, 0.0F, 0.0F);
    this.Shape38 = new ModelRenderer(this, 40, 265);
    this.Shape38.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 5);
    this.Shape38.setRotationPoint(0.0F, -6.0F, 6.0F);
    this.Shape38.setTextureSize(512, 512);
    this.Shape38.mirror = true;
    setRotation(this.Shape38, 0.0F, 0.0F, 0.0F);
    this.Shape39 = new ModelRenderer(this, 40, 251);
    this.Shape39.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape39.setRotationPoint(-1.0F, -8.0F, 5.0F);
    this.Shape39.setTextureSize(512, 512);
    this.Shape39.mirror = true;
    setRotation(this.Shape39, 0.0F, 0.0F, 0.0F);
    this.Shape40 = new ModelRenderer(this, 40, 235);
    this.Shape40.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape40.setRotationPoint(-1.0F, -10.0F, 4.0F);
    this.Shape40.setTextureSize(512, 512);
    this.Shape40.mirror = true;
    setRotation(this.Shape40, 0.0F, 0.0F, 0.0F);
    this.Shape41 = new ModelRenderer(this, 40, 222);
    this.Shape41.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape41.setRotationPoint(-1.0F, -12.0F, 4.0F);
    this.Shape41.setTextureSize(512, 512);
    this.Shape41.mirror = true;
    setRotation(this.Shape41, 0.0F, 0.0F, 0.0F);
    this.Shape42 = new ModelRenderer(this, 40, 209);
    this.Shape42.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 6);
    this.Shape42.setRotationPoint(-1.0F, -14.0F, 4.0F);
    this.Shape42.setTextureSize(512, 512);
    this.Shape42.mirror = true;
    setRotation(this.Shape42, 0.0F, 0.0F, 0.0F);
    this.Shape43 = new ModelRenderer(this, 40, 200);
    this.Shape43.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape43.setRotationPoint(1.0F, -4.0F, 8.0F);
    this.Shape43.setTextureSize(512, 512);
    this.Shape43.mirror = true;
    setRotation(this.Shape43, 0.0F, 0.0F, 0.0F);
    this.Shape44 = new ModelRenderer(this, 40, 189);
    this.Shape44.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 1);
    this.Shape44.setRotationPoint(0.0F, -6.0F, 6.0F);
    this.Shape44.setTextureSize(512, 512);
    this.Shape44.mirror = true;
    setRotation(this.Shape44, 0.0F, 0.0F, 0.0F);
    this.Shape45 = new ModelRenderer(this, 40, 180);
    this.Shape45.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape45.setRotationPoint(-1.0F, -8.0F, 5.0F);
    this.Shape45.setTextureSize(512, 512);
    this.Shape45.mirror = true;
    setRotation(this.Shape45, 0.0F, 0.0F, 0.0F);
    this.Shape46 = new ModelRenderer(this, 40, 170);
    this.Shape46.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape46.setRotationPoint(-1.0F, -10.0F, 4.0F);
    this.Shape46.setTextureSize(512, 512);
    this.Shape46.mirror = true;
    setRotation(this.Shape46, 0.0F, 0.0F, 0.0F);
    this.Shape47 = new ModelRenderer(this, 40, 161);
    this.Shape47.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape47.setRotationPoint(-1.0F, -12.0F, 4.0F);
    this.Shape47.setTextureSize(512, 512);
    this.Shape47.mirror = true;
    setRotation(this.Shape47, 0.0F, 0.0F, 0.0F);
    this.Shape48 = new ModelRenderer(this, 40, 151);
    this.Shape48.addBox(-4.0F, 0.0F, -2.0F, 4, 1, 1);
    this.Shape48.setRotationPoint(-1.0F, -14.0F, 4.0F);
    this.Shape48.setTextureSize(512, 512);
    this.Shape48.mirror = true;
    setRotation(this.Shape48, 0.0F, 0.0F, 0.0F);
    this.Shape49 = new ModelRenderer(this, 40, 140);
    this.Shape49.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
    this.Shape49.setRotationPoint(-7.5F, -15.5F, 3.0F);
    this.Shape49.setTextureSize(512, 512);
    this.Shape49.mirror = true;
    setRotation(this.Shape49, 0.0F, 0.0F, 0.524F);
    this.rarm2 = new ModelRenderer(this, 40, 122);
    this.rarm2.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 1);
    this.rarm2.setRotationPoint(-5.0F, -11.5F, 8.0F);
    this.rarm2.setTextureSize(512, 512);
    this.rarm2.mirror = true;
    setRotation(this.rarm2, 0.0F, -0.5F, 0.524F);
    this.rarm3 = new ModelRenderer(this, 49, 122);
    this.rarm3.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 1);
    this.rarm3.setRotationPoint(-4.0F, -11.5F, 6.0F);
    this.rarm3.setTextureSize(512, 512);
    this.rarm3.mirror = true;
    setRotation(this.rarm3, 0.0F, -0.5F, 0.524F);
    this.relbow = new ModelRenderer(this, 40, 111);
    this.relbow.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
    this.relbow.setRotationPoint(-11.0F, -3.5F, 3.0F);
    this.relbow.setTextureSize(512, 512);
    this.relbow.mirror = true;
    setRotation(this.relbow, 0.0F, -0.5F, 0.524F);
    this.rarm1 = new ModelRenderer(this, 40, 91);
    this.rarm1.addBox(-2.0F, -1.0F, -1.0F, 1, 11, 2);
    this.rarm1.setRotationPoint(-10.5F, -2.0F, 2.5F);
    this.rarm1.setTextureSize(512, 512);
    this.rarm1.mirror = true;
    setRotation(this.rarm1, -0.76F, 0.0F, 0.3F);
    this.Shape54 = new ModelRenderer(this, 40, 78);
    this.Shape54.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
    this.Shape54.setRotationPoint(5.0F, -14.0F, 3.0F);
    this.Shape54.setTextureSize(512, 512);
    this.Shape54.mirror = true;
    setRotation(this.Shape54, 0.0F, 0.0F, -0.524F);
    this.larm3 = new ModelRenderer(this, 40, 58);
    this.larm3.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 1);
    this.larm3.setRotationPoint(9.5F, -15.0F, 3.0F);
    this.larm3.setTextureSize(512, 512);
    this.larm3.mirror = true;
    setRotation(this.larm3, 0.0F, 0.5F, -0.524F);
    this.larm2 = new ModelRenderer(this, 40, 35);
    this.larm2.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 1);
    this.larm2.setRotationPoint(10.5F, -15.0F, 5.0F);
    this.larm2.setTextureSize(512, 512);
    this.larm2.mirror = true;
    setRotation(this.larm2, 0.0F, 0.5F, -0.524F);
    this.lelbow = new ModelRenderer(this, 55, 38);
    this.lelbow.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
    this.lelbow.setRotationPoint(10.0F, -3.0F, 3.0F);
    this.lelbow.setTextureSize(512, 512);
    this.lelbow.mirror = true;
    setRotation(this.lelbow, 0.0F, 0.5F, -0.524F);
    this.larm1 = new ModelRenderer(this, 56, 53);
    this.larm1.addBox(0.0F, 0.0F, -1.0F, 1, 9, 2);
    this.larm1.setRotationPoint(12.0F, -3.0F, 2.5F);
    this.larm1.setTextureSize(512, 512);
    this.larm1.mirror = true;
    setRotation(this.larm1, 0.0F, -0.6F, -0.3F);
    this.scythe1 = new ModelRenderer(this, 57, 70);
    this.scythe1.addBox(0.0F, -39.0F, 1.0F, 1, 39, 1);
    this.scythe1.setRotationPoint(-17.0F, 6.0F, -2.0F);
    this.scythe1.setTextureSize(512, 512);
    this.scythe1.mirror = true;
    setRotation(this.scythe1, 0.0F, 0.0F, 1.0F);
    this.scythe2 = new ModelRenderer(this, 58, 118);
    this.scythe2.addBox(0.0F, -39.0F, 1.0F, 16, 6, 0);
    this.scythe2.setRotationPoint(-17.0F, 6.0F, -2.0F);
    this.scythe2.setTextureSize(512, 512);
    this.scythe2.mirror = true;
    setRotation(this.scythe2, 0.0F, 0.0F, 1.0F);
    this.scythe3 = new ModelRenderer(this, 61, 133);
    this.scythe3.addBox(9.0F, -34.0F, 1.0F, 7, 5, 0);
    this.scythe3.setRotationPoint(-17.0F, 6.0F, -2.0F);
    this.scythe3.setTextureSize(512, 512);
    this.scythe3.mirror = true;
    setRotation(this.scythe3, 0.0F, 0.0F, 1.0F);
    this.head = new ModelRenderer(this, 58, 145);
    this.head.addBox(-3.0F, -6.0F, -3.0F, 6, 6, 5);
    this.head.setRotationPoint(0.0F, -16.0F, 4.0F);
    this.head.setTextureSize(512, 512);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.lwing3 = new ModelRenderer(this, 71, 58);
    this.lwing3.addBox(-0.5F, 0.0F, 0.0F, 1, 19, 3);
    this.lwing3.setRotationPoint(4.0F, -11.7F, 8.5F);
    this.lwing3.setTextureSize(512, 512);
    this.lwing3.mirror = true;
    setRotation(this.lwing3, 2.356F, 0.785F, 0.0F);
    this.lwing2 = new ModelRenderer(this, 58, 168);
    this.lwing2.addBox(-0.5F, 11.0F, -2.0F, 1, 19, 3);
    this.lwing2.setRotationPoint(4.0F, -23.9F, 8.5F);
    this.lwing2.setTextureSize(512, 512);
    this.lwing2.mirror = true;
    setRotation(this.lwing2, 1.745F, 0.785F, 0.0F);
    this.rwing3 = new ModelRenderer(this, 71, 88);
    this.rwing3.addBox(-0.5F, 0.0F, 0.0F, 1, 19, 3);
    this.rwing3.setRotationPoint(-4.0F, -11.7F, 8.5F);
    this.rwing3.setTextureSize(512, 512);
    this.rwing3.mirror = true;
    setRotation(this.rwing3, 2.356F, -0.785F, 0.0F);
    this.rwing2 = new ModelRenderer(this, 73, 168);
    this.rwing2.addBox(-0.5F, 12.0F, -2.0F, 1, 19, 3);
    this.rwing2.setRotationPoint(-4.0F, -23.9F, 8.5F);
    this.rwing2.setTextureSize(512, 512);
    this.rwing2.mirror = true;
    setRotation(this.rwing2, 1.745F, -0.785F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    EnderReaper e = (EnderReaper)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.scythe1.rotateAngleZ = 1.0F - Math.abs(newangle);
    if (e.isScreaming()) {
      newangle = MathHelper.cos(f2 * 1.9F * this.wingspeed) * 3.1415927F * 0.25F;
      this.scythe1.rotateAngleZ = 1.0F + newangle;
      this.larm1.rotateAngleX = -0.436F;
      this.larm1.rotateAngleY = -0.488F;
      newangle = MathHelper.cos(f2 * 2.7F * this.wingspeed) * 3.1415927F * 0.3F;
    } else {
      this.larm1.rotateAngleX = -2.436F;
      this.larm1.rotateAngleY = 1.0F;
      newangle = MathHelper.cos(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.06F;
    } 
    this.lwing3.rotateAngleY = 0.785F + newangle;
    this.rwing3.rotateAngleY = -0.785F - newangle;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.45F;
    if (this.head.rotateAngleY > 0.45F)
      this.head.rotateAngleY = 0.45F; 
    if (this.head.rotateAngleY < -0.45F)
      this.head.rotateAngleY = -0.45F; 
    this.rwing1.render(f5);
    this.lwing1.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
    this.Shape10.render(f5);
    this.Shape11.render(f5);
    this.Shape12.render(f5);
    this.Shape13.render(f5);
    this.Shape14.render(f5);
    this.Shape15.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
    this.Shape18.render(f5);
    this.Shape19.render(f5);
    this.Shape20.render(f5);
    this.Shape21.render(f5);
    this.Shape22.render(f5);
    this.Shape23.render(f5);
    this.Shape24.render(f5);
    this.Shape25.render(f5);
    this.Shape26.render(f5);
    this.Shape27.render(f5);
    this.Shape28.render(f5);
    this.Shape29.render(f5);
    this.Shape30.render(f5);
    this.Shape31.render(f5);
    this.Shape32.render(f5);
    this.Shape33.render(f5);
    this.Shape34.render(f5);
    this.Shape35.render(f5);
    this.Shape36.render(f5);
    this.Shape37.render(f5);
    this.Shape38.render(f5);
    this.Shape39.render(f5);
    this.Shape40.render(f5);
    this.Shape41.render(f5);
    this.Shape42.render(f5);
    this.Shape43.render(f5);
    this.Shape44.render(f5);
    this.Shape45.render(f5);
    this.Shape46.render(f5);
    this.Shape47.render(f5);
    this.Shape48.render(f5);
    this.Shape49.render(f5);
    this.rarm2.render(f5);
    this.rarm3.render(f5);
    this.relbow.render(f5);
    this.rarm1.render(f5);
    this.Shape54.render(f5);
    this.larm3.render(f5);
    this.larm2.render(f5);
    this.lelbow.render(f5);
    this.larm1.render(f5);
    this.scythe1.render(f5);
    this.scythe2.render(f5);
    this.scythe3.render(f5);
    this.head.render(f5);
    this.lwing3.render(f5);
    this.lwing2.render(f5);
    this.rwing3.render(f5);
    this.rwing2.render(f5);
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
