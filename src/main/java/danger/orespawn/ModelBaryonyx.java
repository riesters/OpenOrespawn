package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBaryonyx extends ModelBase {
  private float wingspeed = 1.0F;
  
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
  
  ModelRenderer Shape50;
  
  ModelRenderer Shape51;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
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
  
  ModelRenderer Shape52;
  
  public ModelBaryonyx(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.Shape27 = new ModelRenderer(this, 0, 0);
    this.Shape27.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape27.setRotationPoint(0.0F, -17.0F, -10.0F);
    this.Shape27.setTextureSize(128, 128);
    this.Shape27.mirror = true;
    setRotation(this.Shape27, 0.0F, 0.0F, 0.0F);
    this.Shape28 = new ModelRenderer(this, 0, 0);
    this.Shape28.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape28.setRotationPoint(0.0F, -17.0F, -7.0F);
    this.Shape28.setTextureSize(128, 128);
    this.Shape28.mirror = true;
    setRotation(this.Shape28, 0.0F, 0.0F, 0.0F);
    this.Shape29 = new ModelRenderer(this, 0, 0);
    this.Shape29.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape29.setRotationPoint(0.0F, -17.0F, -4.0F);
    this.Shape29.setTextureSize(128, 128);
    this.Shape29.mirror = true;
    setRotation(this.Shape29, 0.0F, 0.0F, 0.0F);
    this.Shape30 = new ModelRenderer(this, 0, 0);
    this.Shape30.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape30.setRotationPoint(0.0F, -17.0F, -1.0F);
    this.Shape30.setTextureSize(128, 128);
    this.Shape30.mirror = true;
    setRotation(this.Shape30, 0.0F, 0.0F, 0.0F);
    this.Shape31 = new ModelRenderer(this, 0, 0);
    this.Shape31.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape31.setRotationPoint(0.0F, -17.0F, 2.0F);
    this.Shape31.setTextureSize(128, 128);
    this.Shape31.mirror = true;
    setRotation(this.Shape31, 0.0F, 0.0F, 0.0F);
    this.Shape32 = new ModelRenderer(this, 0, 0);
    this.Shape32.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape32.setRotationPoint(0.0F, -17.0F, 5.0F);
    this.Shape32.setTextureSize(128, 128);
    this.Shape32.mirror = true;
    setRotation(this.Shape32, 0.0F, 0.0F, 0.0F);
    this.Shape33 = new ModelRenderer(this, 0, 0);
    this.Shape33.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape33.setRotationPoint(0.0F, -17.0F, 8.0F);
    this.Shape33.setTextureSize(128, 128);
    this.Shape33.mirror = true;
    setRotation(this.Shape33, 0.0F, 0.0F, 0.0F);
    this.Shape34 = new ModelRenderer(this, 0, 0);
    this.Shape34.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape34.setRotationPoint(0.0F, -17.0F, 11.0F);
    this.Shape34.setTextureSize(128, 128);
    this.Shape34.mirror = true;
    setRotation(this.Shape34, 0.0F, 0.0F, 0.0F);
    this.Shape35 = new ModelRenderer(this, 0, 0);
    this.Shape35.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape35.setRotationPoint(0.0F, -17.0F, 14.0F);
    this.Shape35.setTextureSize(128, 128);
    this.Shape35.mirror = true;
    setRotation(this.Shape35, 0.0F, 0.0F, 0.0F);
    this.Shape36 = new ModelRenderer(this, 0, 0);
    this.Shape36.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape36.setRotationPoint(0.0F, -17.0F, 17.0F);
    this.Shape36.setTextureSize(128, 128);
    this.Shape36.mirror = true;
    setRotation(this.Shape36, 0.0F, 0.0F, 0.0F);
    this.Shape37 = new ModelRenderer(this, 0, 0);
    this.Shape37.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape37.setRotationPoint(0.0F, -17.0F, 20.0F);
    this.Shape37.setTextureSize(128, 128);
    this.Shape37.mirror = true;
    setRotation(this.Shape37, 0.0F, 0.0F, 0.0F);
    this.Shape38 = new ModelRenderer(this, 0, 0);
    this.Shape38.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape38.setRotationPoint(0.0F, -17.0F, 23.0F);
    this.Shape38.setTextureSize(128, 128);
    this.Shape38.mirror = true;
    setRotation(this.Shape38, 0.0F, 0.0F, 0.0F);
    this.Shape39 = new ModelRenderer(this, 0, 0);
    this.Shape39.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape39.setRotationPoint(0.0F, -17.0F, 26.0F);
    this.Shape39.setTextureSize(128, 128);
    this.Shape39.mirror = true;
    setRotation(this.Shape39, 0.0F, 0.0F, 0.0F);
    this.Shape40 = new ModelRenderer(this, 0, 0);
    this.Shape40.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape40.setRotationPoint(0.0F, -17.0F, 29.0F);
    this.Shape40.setTextureSize(128, 128);
    this.Shape40.mirror = true;
    setRotation(this.Shape40, 0.0F, 0.0F, 0.0F);
    this.Shape41 = new ModelRenderer(this, 0, 0);
    this.Shape41.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape41.setRotationPoint(0.0F, -17.0F, 32.0F);
    this.Shape41.setTextureSize(128, 128);
    this.Shape41.mirror = true;
    setRotation(this.Shape41, 0.0F, 0.0F, 0.0F);
    this.Shape42 = new ModelRenderer(this, 0, 0);
    this.Shape42.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape42.setRotationPoint(0.0F, -17.0F, 35.0F);
    this.Shape42.setTextureSize(128, 128);
    this.Shape42.mirror = true;
    setRotation(this.Shape42, 0.0F, 0.0F, 0.0F);
    this.Shape43 = new ModelRenderer(this, 0, 0);
    this.Shape43.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape43.setRotationPoint(0.0F, -17.0F, 38.0F);
    this.Shape43.setTextureSize(128, 128);
    this.Shape43.mirror = true;
    setRotation(this.Shape43, 0.0F, 0.0F, 0.0F);
    this.Shape44 = new ModelRenderer(this, 0, 0);
    this.Shape44.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape44.setRotationPoint(0.0F, -17.0F, 41.0F);
    this.Shape44.setTextureSize(128, 128);
    this.Shape44.mirror = true;
    setRotation(this.Shape44, 0.0F, 0.0F, 0.0F);
    this.Shape45 = new ModelRenderer(this, 0, 0);
    this.Shape45.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape45.setRotationPoint(0.0F, -17.0F, 44.0F);
    this.Shape45.setTextureSize(128, 128);
    this.Shape45.mirror = true;
    setRotation(this.Shape45, 0.0F, 0.0F, 0.0F);
    this.Shape46 = new ModelRenderer(this, 0, 0);
    this.Shape46.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape46.setRotationPoint(0.0F, -12.0F, -11.0F);
    this.Shape46.setTextureSize(128, 128);
    this.Shape46.mirror = true;
    setRotation(this.Shape46, 0.0F, 0.0F, 0.0F);
    this.Shape47 = new ModelRenderer(this, 0, 0);
    this.Shape47.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape47.setRotationPoint(0.0F, -13.0F, -13.0F);
    this.Shape47.setTextureSize(128, 128);
    this.Shape47.mirror = true;
    setRotation(this.Shape47, 0.0F, 0.0F, 0.0F);
    this.Shape48 = new ModelRenderer(this, 0, 0);
    this.Shape48.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape48.setRotationPoint(0.0F, -15.0F, -15.0F);
    this.Shape48.setTextureSize(128, 128);
    this.Shape48.mirror = true;
    setRotation(this.Shape48, 0.0F, 0.0F, 0.0F);
    this.Shape49 = new ModelRenderer(this, 0, 0);
    this.Shape49.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1);
    this.Shape49.setRotationPoint(0.0F, -16.0F, -16.0F);
    this.Shape49.setTextureSize(128, 128);
    this.Shape49.mirror = true;
    setRotation(this.Shape49, 0.0F, 0.0F, 0.0F);
    this.Shape50 = new ModelRenderer(this, 0, 0);
    this.Shape50.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
    this.Shape50.setRotationPoint(0.0F, -19.0F, -17.0F);
    this.Shape50.setTextureSize(128, 128);
    this.Shape50.mirror = true;
    setRotation(this.Shape50, 0.0F, 0.0F, 0.0F);
    this.Shape51 = new ModelRenderer(this, 0, 0);
    this.Shape51.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
    this.Shape51.setRotationPoint(0.0F, -19.0F, -19.0F);
    this.Shape51.setTextureSize(128, 128);
    this.Shape51.mirror = true;
    setRotation(this.Shape51, 0.0F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 10, 17, 25);
    this.Shape1.setRotationPoint(-5.0F, -15.0F, -10.0F);
    this.Shape1.setTextureSize(128, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 93);
    this.Shape2.addBox(-3.0F, 0.0F, -11.0F, 6, 10, 11);
    this.Shape2.setRotationPoint(0.0F, -10.0F, -6.0F);
    this.Shape2.setTextureSize(128, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, -0.1919862F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 29, 110);
    this.Shape3.addBox(-2.0F, -9.0F, -8.0F, 4, 9, 8);
    this.Shape3.setRotationPoint(0.0F, -10.0F, -11.0F);
    this.Shape3.setTextureSize(128, 128);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.7504916F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 54, 108);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 6, 7, 12);
    this.Shape4.setRotationPoint(-3.0F, -18.0F, -28.0F);
    this.Shape4.setTextureSize(128, 128);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 54, 86);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 3, 6, 15);
    this.Shape5.setRotationPoint(-1.5F, -17.5F, -43.0F);
    this.Shape5.setTextureSize(128, 128);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 43);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 8, 11, 8);
    this.Shape6.setRotationPoint(-4.0F, -15.0F, 15.0F);
    this.Shape6.setTextureSize(128, 128);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 0, 63);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 6, 6, 23);
    this.Shape7.setRotationPoint(-3.0F, -15.0F, 23.0F);
    this.Shape7.setTextureSize(128, 128);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 47, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3);
    this.Shape8.setRotationPoint(5.0F, 0.0F, -7.0F);
    this.Shape8.setTextureSize(128, 128);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 49, 10);
    this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2);
    this.Shape9.setRotationPoint(5.1F, 3.0F, -6.0F);
    this.Shape9.setTextureSize(128, 128);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, -0.3839724F, 0.0F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 13, 17);
    this.Shape10.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3);
    this.Shape10.setRotationPoint(5.0F, 7.0F, -8.0F);
    this.Shape10.setTextureSize(128, 128);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 0, 17);
    this.Shape11.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2);
    this.Shape11.setRotationPoint(5.0F, 8.0F, -8.0F);
    this.Shape11.setTextureSize(128, 128);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 0, 21);
    this.Shape12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Shape12.setRotationPoint(5.0F, 9.0F, -11.0F);
    this.Shape12.setTextureSize(128, 128);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
    this.Shape13 = new ModelRenderer(this, 95, 36);
    this.Shape13.addBox(0.0F, 0.0F, 0.0F, 3, 21, 13);
    this.Shape13.setRotationPoint(5.0F, -15.0F, 2.0F);
    this.Shape13.setTextureSize(128, 128);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
    this.Shape14 = new ModelRenderer(this, 36, 94);
    this.Shape14.addBox(0.0F, 0.0F, -3.0F, 3, 5, 3);
    this.Shape14.setRotationPoint(-1.5F, -17.0F, -43.0F);
    this.Shape14.setTextureSize(128, 128);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 113, 71);
    this.Shape15.addBox(0.0F, 18.0F, 8.0F, 3, 18, 4);
    this.Shape15.setRotationPoint(5.0F, -15.0F, 2.0F);
    this.Shape15.setTextureSize(128, 128);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, -0.1745329F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 13, 11);
    this.Shape16.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 3);
    this.Shape16.setRotationPoint(5.0F, 10.0F, -8.0F);
    this.Shape16.setTextureSize(128, 128);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 0, 74);
    this.Shape17.addBox(0.0F, 35.0F, -1.0F, 3, 3, 6);
    this.Shape17.setRotationPoint(5.0F, -15.0F, 2.0F);
    this.Shape17.setTextureSize(128, 128);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
    this.Shape18 = new ModelRenderer(this, 58, 0);
    this.Shape18.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3);
    this.Shape18.setRotationPoint(-5.0F, 0.0F, -7.0F);
    this.Shape18.setTextureSize(128, 128);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
    this.Shape19 = new ModelRenderer(this, 59, 10);
    this.Shape19.addBox(-2.0F, 0.0F, 0.0F, 2, 6, 2);
    this.Shape19.setRotationPoint(-5.1F, 3.0F, -6.0F);
    this.Shape19.setTextureSize(128, 128);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, -0.3839724F, 0.0F, 0.0F);
    this.Shape20 = new ModelRenderer(this, 71, 5);
    this.Shape20.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3);
    this.Shape20.setRotationPoint(-5.0F, 7.0F, -8.0F);
    this.Shape20.setTextureSize(128, 128);
    this.Shape20.mirror = true;
    setRotation(this.Shape20, 0.0F, 0.0F, 0.0F);
    this.Shape21 = new ModelRenderer(this, 71, 0);
    this.Shape21.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3);
    this.Shape21.setRotationPoint(-5.0F, 10.0F, -8.0F);
    this.Shape21.setTextureSize(128, 128);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, 0.0F, 0.0F, 0.0F);
    this.Shape22 = new ModelRenderer(this, 0, 10);
    this.Shape22.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2);
    this.Shape22.setRotationPoint(-5.0F, 8.0F, -8.0F);
    this.Shape22.setTextureSize(128, 128);
    this.Shape22.mirror = true;
    setRotation(this.Shape22, 0.0F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 0, 14);
    this.Shape23.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Shape23.setRotationPoint(-5.0F, 9.0F, -11.0F);
    this.Shape23.setTextureSize(128, 128);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
    this.Shape24 = new ModelRenderer(this, 95, 0);
    this.Shape24.addBox(-3.0F, 0.0F, 0.0F, 3, 22, 13);
    this.Shape24.setRotationPoint(-5.0F, -15.0F, 2.0F);
    this.Shape24.setTextureSize(128, 128);
    this.Shape24.mirror = true;
    setRotation(this.Shape24, 0.0F, 0.0F, 0.0F);
    this.Shape25 = new ModelRenderer(this, 96, 71);
    this.Shape25.addBox(-3.0F, 18.0F, 8.0F, 3, 18, 4);
    this.Shape25.setRotationPoint(-5.0F, -15.0F, 2.0F);
    this.Shape25.setTextureSize(128, 128);
    this.Shape25.mirror = true;
    setRotation(this.Shape25, -0.1745329F, 0.0F, 0.0F);
    this.Shape26 = new ModelRenderer(this, 0, 64);
    this.Shape26.addBox(-3.0F, 35.0F, -1.0F, 3, 3, 6);
    this.Shape26.setRotationPoint(-5.0F, -15.0F, 2.0F);
    this.Shape26.setTextureSize(128, 128);
    this.Shape26.mirror = true;
    setRotation(this.Shape26, 0.0F, 0.0F, 0.0F);
    this.Shape52 = new ModelRenderer(this, 9, 0);
    this.Shape52.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2);
    this.Shape52.setRotationPoint(0.0F, -19.0F, -30.0F);
    this.Shape52.setTextureSize(128, 128);
    this.Shape52.mirror = true;
    setRotation(this.Shape52, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Baryonyx e = (Baryonyx)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.15F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.Shape24.rotateAngleX = newangle;
    this.Shape25.rotateAngleX = -0.17F + newangle;
    this.Shape26.rotateAngleX = newangle;
    this.Shape13.rotateAngleX = -newangle;
    this.Shape15.rotateAngleX = -0.17F - newangle;
    this.Shape17.rotateAngleX = -newangle;
    newangle = MathHelper.cos(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.25F;
    this.Shape21.rotateAngleZ = newangle;
    this.Shape16.rotateAngleZ = -newangle;
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
    this.Shape50.render(f5);
    this.Shape51.render(f5);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
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
    this.Shape52.render(f5);
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
