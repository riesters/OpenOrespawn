package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCephadrome extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer leftfoot;
  
  ModelRenderer butt;
  
  ModelRenderer rightfoot;
  
  ModelRenderer topfin1;
  
  ModelRenderer topfin2;
  
  ModelRenderer topfin3;
  
  ModelRenderer topfin4;
  
  ModelRenderer leftshoulder;
  
  ModelRenderer lefwingfin1;
  
  ModelRenderer tailfin1;
  
  ModelRenderer tailmembrane2;
  
  ModelRenderer tailfin2;
  
  ModelRenderer tailfin4;
  
  ModelRenderer tailfin3;
  
  ModelRenderer tailmembrane1;
  
  ModelRenderer topmem1;
  
  ModelRenderer topmem2;
  
  ModelRenderer topmem3;
  
  ModelRenderer topmem4;
  
  ModelRenderer neck1;
  
  ModelRenderer body;
  
  ModelRenderer chest1;
  
  ModelRenderer leftleg1;
  
  ModelRenderer mouth;
  
  ModelRenderer neck2;
  
  ModelRenderer head;
  
  ModelRenderer hammerhead;
  
  ModelRenderer chest;
  
  ModelRenderer neck3;
  
  ModelRenderer tail1;
  
  ModelRenderer rightleg1;
  
  ModelRenderer leftleg2;
  
  ModelRenderer rightleg2;
  
  ModelRenderer body2;
  
  ModelRenderer leftleg3;
  
  ModelRenderer rightleg3;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer tailmembrane3;
  
  ModelRenderer leftwingfin2;
  
  ModelRenderer leftwingfin3;
  
  ModelRenderer leftwingfin4;
  
  ModelRenderer leftwingmembrane;
  
  ModelRenderer rightshoulder;
  
  ModelRenderer rightwingfin1;
  
  ModelRenderer rightwingfin2;
  
  ModelRenderer rightwingfin3;
  
  ModelRenderer rightwingfin4;
  
  ModelRenderer rightwingmembrane;
  
  ModelRenderer hammerhead2;
  
  public ModelCephadrome(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.leftfoot = new ModelRenderer(this, 41, 194);
    this.leftfoot.addBox(-2.0F, 34.0F, -12.0F, 9, 4, 10);
    this.leftfoot.setRotationPoint(7.0F, -14.0F, 17.0F);
    this.leftfoot.setTextureSize(512, 256);
    this.leftfoot.mirror = true;
    setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
    this.butt = new ModelRenderer(this, 367, 235);
    this.butt.addBox(0.0F, 0.0F, -2.0F, 9, 14, 6);
    this.butt.setRotationPoint(-4.5F, -8.0F, 29.0F);
    this.butt.setTextureSize(512, 256);
    this.butt.mirror = true;
    setRotation(this.butt, -0.8726646F, 0.0F, 0.0F);
    this.rightfoot = new ModelRenderer(this, 41, 170);
    this.rightfoot.addBox(-7.0F, 34.0F, -12.0F, 9, 4, 10);
    this.rightfoot.setRotationPoint(-7.0F, -14.0F, 17.0F);
    this.rightfoot.setTextureSize(512, 256);
    this.rightfoot.mirror = true;
    setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
    this.topfin1 = new ModelRenderer(this, 64, 112);
    this.topfin1.addBox(-3.0F, -2.0F, -30.0F, 6, 3, 30);
    this.topfin1.setRotationPoint(0.0F, -15.0F, -7.0F);
    this.topfin1.setTextureSize(512, 256);
    this.topfin1.mirror = true;
    setRotation(this.topfin1, -1.850049F, 0.0F, 0.0F);
    this.topfin2 = new ModelRenderer(this, 69, 81);
    this.topfin2.addBox(-3.0F, -2.0F, -25.0F, 6, 3, 25);
    this.topfin2.setRotationPoint(0.0F, -15.0F, -2.0F);
    this.topfin2.setTextureSize(512, 256);
    this.topfin2.mirror = true;
    setRotation(this.topfin2, -2.076942F, 0.0F, 0.0F);
    this.topfin3 = new ModelRenderer(this, -1, 140);
    this.topfin3.addBox(-3.0F, -2.0F, -20.0F, 6, 3, 20);
    this.topfin3.setRotationPoint(0.0F, -16.0F, 3.0F);
    this.topfin3.setTextureSize(512, 256);
    this.topfin3.mirror = true;
    setRotation(this.topfin3, -2.426008F, 0.0F, 0.0F);
    this.topfin4 = new ModelRenderer(this, 148, 148);
    this.topfin4.addBox(-3.0F, -2.0F, -10.0F, 6, 3, 10);
    this.topfin4.setRotationPoint(0.0F, -17.0F, 13.0F);
    this.topfin4.setTextureSize(512, 256);
    this.topfin4.mirror = true;
    setRotation(this.topfin4, -2.635447F, 0.0F, 0.0F);
    this.leftshoulder = new ModelRenderer(this, 144, 236);
    this.leftshoulder.addBox(0.0F, 0.0F, 1.0F, 6, 8, 11);
    this.leftshoulder.setRotationPoint(6.0F, -16.0F, -14.0F);
    this.leftshoulder.setTextureSize(512, 256);
    this.leftshoulder.mirror = true;
    setRotation(this.leftshoulder, -0.1745329F, 0.0F, 0.0F);
    this.lefwingfin1 = new ModelRenderer(this, 147, 96);
    this.lefwingfin1.addBox(0.0F, -2.0F, -2.0F, 70, 5, 3);
    this.lefwingfin1.setRotationPoint(9.0F, -12.0F, -11.0F);
    this.lefwingfin1.setTextureSize(512, 256);
    this.lefwingfin1.mirror = true;
    setRotation(this.lefwingfin1, -0.2617994F, -0.1745329F, 0.0F);
    this.tailfin1 = new ModelRenderer(this, 168, 0);
    this.tailfin1.addBox(-6.0F, -1.0F, 0.0F, 12, 3, 30);
    this.tailfin1.setRotationPoint(0.0F, -9.0F, 56.0F);
    this.tailfin1.setTextureSize(512, 256);
    this.tailfin1.mirror = true;
    setRotation(this.tailfin1, 0.1396263F, 0.0F, 0.0F);
    this.tailmembrane2 = new ModelRenderer(this, 201, 38);
    this.tailmembrane2.addBox(0.0F, -8.0F, 3.0F, 0, 10, 19);
    this.tailmembrane2.setRotationPoint(0.0F, 0.0F, 56.0F);
    this.tailmembrane2.setTextureSize(512, 256);
    this.tailmembrane2.mirror = true;
    setRotation(this.tailmembrane2, -0.296706F, 0.0F, 0.0F);
    this.tailfin2 = new ModelRenderer(this, 186, 184);
    this.tailfin2.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 27);
    this.tailfin2.setRotationPoint(0.0F, -7.0F, 56.0F);
    this.tailfin2.setTextureSize(512, 256);
    this.tailfin2.mirror = true;
    setRotation(this.tailfin2, -0.1919862F, 0.0F, 0.0F);
    this.tailfin4 = new ModelRenderer(this, 186, 137);
    this.tailfin4.addBox(-4.0F, 1.0F, 1.0F, 8, 3, 22);
    this.tailfin4.setRotationPoint(0.0F, -3.0F, 56.0F);
    this.tailfin4.setTextureSize(512, 256);
    this.tailfin4.mirror = true;
    setRotation(this.tailfin4, -0.837758F, 0.0F, 0.0F);
    this.tailfin3 = new ModelRenderer(this, 185, 216);
    this.tailfin3.addBox(-4.0F, 0.0F, 1.0F, 8, 2, 23);
    this.tailfin3.setRotationPoint(0.0F, -5.0F, 57.0F);
    this.tailfin3.setTextureSize(512, 256);
    this.tailfin3.mirror = true;
    setRotation(this.tailfin3, -0.5759587F, 0.0F, 0.0F);
    this.tailmembrane1 = new ModelRenderer(this, 245, 38);
    this.tailmembrane1.addBox(0.0F, 0.0F, 4.0F, 0, 11, 21);
    this.tailmembrane1.setRotationPoint(0.0F, -9.0F, 56.0F);
    this.tailmembrane1.setTextureSize(512, 256);
    this.tailmembrane1.mirror = true;
    setRotation(this.tailmembrane1, 0.1396263F, 0.0F, 0.0F);
    this.topmem1 = new ModelRenderer(this, 25, 0);
    this.topmem1.addBox(0.0F, -25.0F, 0.0F, 0, 24, 10);
    this.topmem1.setRotationPoint(0.0F, -15.0F, -6.0F);
    this.topmem1.setTextureSize(512, 256);
    this.topmem1.mirror = true;
    setRotation(this.topmem1, -0.2617994F, 0.0F, 0.0F);
    this.topmem2 = new ModelRenderer(this, 135, 0);
    this.topmem2.addBox(1.0F, -22.0F, 0.0F, 0, 20, 10);
    this.topmem2.setRotationPoint(-1.0F, -15.0F, -2.0F);
    this.topmem2.setTextureSize(512, 256);
    this.topmem2.mirror = true;
    setRotation(this.topmem2, -0.5235988F, 0.0F, 0.0F);
    this.topmem3 = new ModelRenderer(this, 258, 0);
    this.topmem3.addBox(0.0F, -18.0F, 0.0F, 0, 18, 8);
    this.topmem3.setRotationPoint(0.0F, -16.0F, 3.0F);
    this.topmem3.setTextureSize(512, 256);
    this.topmem3.mirror = true;
    setRotation(this.topmem3, -0.8901179F, 0.0F, 0.0F);
    this.topmem4 = new ModelRenderer(this, 282, 0);
    this.topmem4.addBox(0.0F, -9.0F, 0.0F, 0, 9, 10);
    this.topmem4.setRotationPoint(0.0F, -17.0F, 13.0F);
    this.topmem4.setTextureSize(512, 256);
    this.topmem4.mirror = true;
    setRotation(this.topmem4, -1.117011F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 404, 235);
    this.neck1.addBox(-6.0F, -5.0F, -10.0F, 10, 9, 10);
    this.neck1.setRotationPoint(1.0F, -6.0F, -33.0F);
    this.neck1.setTextureSize(512, 256);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.3665191F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 28, 220);
    this.body.addBox(-6.0F, -11.0F, -10.0F, 12, 15, 19);
    this.body.setRotationPoint(0.0F, -7.0F, 3.0F);
    this.body.setTextureSize(512, 256);
    this.body.mirror = true;
    setRotation(this.body, 0.1745329F, 0.0F, 0.0F);
    this.chest1 = new ModelRenderer(this, 98, 210);
    this.chest1.addBox(-3.0F, -4.0F, -2.0F, 10, 11, 5);
    this.chest1.setRotationPoint(-2.0F, -6.0F, -13.0F);
    this.chest1.setTextureSize(512, 256);
    this.chest1.mirror = true;
    setRotation(this.chest1, 1.029744F, 0.0F, 0.0F);
    this.leftleg1 = new ModelRenderer(this, 135, 183);
    this.leftleg1.addBox(-1.0F, 0.0F, -4.0F, 7, 18, 10);
    this.leftleg1.setRotationPoint(7.0F, -14.0F, 17.0F);
    this.leftleg1.setTextureSize(512, 256);
    this.leftleg1.mirror = true;
    setRotation(this.leftleg1, -0.5759587F, 0.0F, 0.0F);
    this.mouth = new ModelRenderer(this, 92, 150);
    this.mouth.addBox(-7.0F, 1.0F, 3.0F, 14, 15, 4);
    this.mouth.setRotationPoint(0.0F, -6.0F, -43.0F);
    this.mouth.setTextureSize(512, 256);
    this.mouth.mirror = true;
    setRotation(this.mouth, -0.8726646F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 152, 110);
    this.neck2.addBox(-6.0F, -5.0F, -17.0F, 11, 10, 17);
    this.neck2.setRotationPoint(0.5F, -10.0F, -19.0F);
    this.neck2.setTextureSize(512, 256);
    this.neck2.mirror = true;
    setRotation(this.neck2, 0.2617994F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 275, 219);
    this.head.addBox(-10.0F, -3.0F, -16.0F, 20, 7, 16);
    this.head.setRotationPoint(0.0F, -6.0F, -43.0F);
    this.head.setTextureSize(512, 256);
    this.head.mirror = true;
    setRotation(this.head, 0.5061455F, 0.0F, 0.0F);
    this.hammerhead = new ModelRenderer(this, 258, 134);
    this.hammerhead.addBox(-18.0F, -2.0F, -15.0F, 36, 6, 14);
    this.hammerhead.setRotationPoint(0.0F, -6.0F, -43.0F);
    this.hammerhead.setTextureSize(512, 256);
    this.hammerhead.mirror = true;
    setRotation(this.hammerhead, 0.4537856F, 0.0F, 0.0F);
    this.chest = new ModelRenderer(this, 100, 15);
    this.chest.addBox(-3.0F, -3.0F, 0.0F, 9, 29, 7);
    this.chest.setRotationPoint(-1.5F, 0.0F, -5.0F);
    this.chest.setTextureSize(512, 256);
    this.chest.mirror = true;
    setRotation(this.chest, 1.413717F, 0.0F, 0.0F);
    this.neck3 = new ModelRenderer(this, 264, 173);
    this.neck3.addBox(-6.0F, -5.0F, -16.0F, 12, 11, 16);
    this.neck3.setRotationPoint(0.0F, -11.0F, -6.0F);
    this.neck3.setTextureSize(512, 256);
    this.neck3.mirror = true;
    setRotation(this.neck3, 0.0872665F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 51, 5);
    this.tail1.addBox(-5.0F, -6.0F, 0.0F, 10, 13, 14);
    this.tail1.setRotationPoint(0.0F, -10.0F, 22.0F);
    this.tail1.setTextureSize(512, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, -0.1745329F, 0.0F, 0.0F);
    this.rightleg1 = new ModelRenderer(this, 94, 175);
    this.rightleg1.addBox(-6.0F, 0.0F, -4.0F, 7, 18, 10);
    this.rightleg1.setRotationPoint(-7.0F, -14.0F, 17.0F);
    this.rightleg1.setTextureSize(512, 256);
    this.rightleg1.mirror = true;
    setRotation(this.rightleg1, -0.5759587F, 0.0F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 28, 112);
    this.leftleg2.addBox(-1.0F, 6.0F, -17.0F, 7, 12, 7);
    this.leftleg2.setRotationPoint(7.0F, -14.0F, 17.0F);
    this.leftleg2.setTextureSize(512, 256);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, 0.9773844F, 0.0F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 32, 90);
    this.rightleg2.addBox(-6.0F, 6.0F, -17.0F, 7, 12, 7);
    this.rightleg2.setRotationPoint(-7.0F, -14.0F, 17.0F);
    this.rightleg2.setTextureSize(512, 256);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, 0.9773844F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 400, 179);
    this.body2.addBox(0.0F, 3.0F, 3.0F, 12, 16, 16);
    this.body2.setRotationPoint(-6.0F, -23.0F, 6.0F);
    this.body2.setTextureSize(512, 256);
    this.body2.mirror = true;
    setRotation(this.body2, -0.1919862F, 0.0F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 351, 192);
    this.leftleg3.addBox(-1.0F, 17.0F, 10.0F, 7, 17, 6);
    this.leftleg3.setRotationPoint(7.0F, -14.0F, 17.0F);
    this.leftleg3.setTextureSize(512, 256);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, -0.5235988F, 0.0F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 323, 192);
    this.rightleg3.addBox(-6.0F, 17.0F, 10.0F, 7, 17, 6);
    this.rightleg3.setRotationPoint(-7.0F, -14.0F, 17.0F);
    this.rightleg3.setTextureSize(512, 256);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, -0.5235988F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 51, 55);
    this.tail2.addBox(-6.0F, -6.0F, 0.0F, 9, 12, 14);
    this.tail2.setRotationPoint(1.5F, -7.0F, 35.0F);
    this.tail2.setTextureSize(512, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.1396263F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 105, 52);
    this.tail3.addBox(-5.0F, -6.0F, 0.0F, 8, 11, 14);
    this.tail3.setRotationPoint(1.0F, -5.0F, 48.0F);
    this.tail3.setTextureSize(512, 256);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.1396263F, 0.0F, 0.0F);
    this.tailmembrane3 = new ModelRenderer(this, 155, 38);
    this.tailmembrane3.addBox(0.0F, -10.0F, 0.0F, 0, 10, 18);
    this.tailmembrane3.setRotationPoint(0.0F, 2.0F, 56.0F);
    this.tailmembrane3.setTextureSize(512, 256);
    this.tailmembrane3.mirror = true;
    setRotation(this.tailmembrane3, -0.837758F, 0.0F, 0.0F);
    this.leftwingfin2 = new ModelRenderer(this, 160, 83);
    this.leftwingfin2.addBox(0.0F, -2.0F, 0.0F, 64, 4, 2);
    this.leftwingfin2.setRotationPoint(9.0F, -12.0F, -11.0F);
    this.leftwingfin2.setTextureSize(512, 256);
    this.leftwingfin2.mirror = true;
    setRotation(this.leftwingfin2, -0.2617994F, -0.4363323F, 0.0F);
    this.leftwingfin3 = new ModelRenderer(this, 209, 106);
    this.leftwingfin3.addBox(0.0F, -2.0F, 0.0F, 48, 4, 2);
    this.leftwingfin3.setRotationPoint(9.0F, -11.0F, -10.0F);
    this.leftwingfin3.setTextureSize(512, 256);
    this.leftwingfin3.mirror = true;
    setRotation(this.leftwingfin3, -0.2617994F, -0.7853982F, 0.0F);
    this.leftwingfin4 = new ModelRenderer(this, 233, 120);
    this.leftwingfin4.addBox(0.0F, 0.0F, 0.0F, 37, 4, 2);
    this.leftwingfin4.setRotationPoint(9.0F, -13.0F, -6.0F);
    this.leftwingfin4.setTextureSize(512, 256);
    this.leftwingfin4.mirror = true;
    setRotation(this.leftwingfin4, -0.2617994F, -1.186824F, 0.0F);
    this.leftwingmembrane = new ModelRenderer(this, 300, 27);
    this.leftwingmembrane.addBox(3.0F, 0.0F, 0.0F, 64, 0, 34);
    this.leftwingmembrane.setRotationPoint(9.0F, -13.0F, -10.0F);
    this.leftwingmembrane.setTextureSize(512, 256);
    this.leftwingmembrane.mirror = true;
    setRotation(this.leftwingmembrane, -0.0872665F, -0.1745329F, 0.0F);
    this.rightshoulder = new ModelRenderer(this, 0, 193);
    this.rightshoulder.addBox(0.0F, 0.0F, 0.0F, 6, 8, 11);
    this.rightshoulder.setRotationPoint(-12.0F, -16.0F, -13.0F);
    this.rightshoulder.setTextureSize(512, 256);
    this.rightshoulder.mirror = true;
    setRotation(this.rightshoulder, -0.1745329F, 0.0F, 0.0F);
    this.rightwingfin1 = new ModelRenderer(this, 344, 109);
    this.rightwingfin1.addBox(-69.0F, -2.0F, 0.0F, 69, 5, 3);
    this.rightwingfin1.setRotationPoint(-10.0F, -12.0F, -13.0F);
    this.rightwingfin1.setTextureSize(512, 256);
    this.rightwingfin1.mirror = true;
    setRotation(this.rightwingfin1, -0.2617994F, 0.1745329F, 0.0F);
    this.rightwingfin2 = new ModelRenderer(this, 349, 119);
    this.rightwingfin2.addBox(-63.0F, -2.0F, 0.0F, 64, 4, 2);
    this.rightwingfin2.setRotationPoint(-9.0F, -12.0F, -11.0F);
    this.rightwingfin2.setTextureSize(512, 256);
    this.rightwingfin2.mirror = true;
    setRotation(this.rightwingfin2, -0.2617994F, 0.4363323F, 0.0F);
    this.rightwingfin3 = new ModelRenderer(this, 368, 128);
    this.rightwingfin3.addBox(-49.0F, 0.0F, 0.0F, 48, 4, 2);
    this.rightwingfin3.setRotationPoint(-9.0F, -13.0F, -9.0F);
    this.rightwingfin3.setTextureSize(512, 256);
    this.rightwingfin3.mirror = true;
    setRotation(this.rightwingfin3, -0.2617994F, 0.7679449F, 0.0F);
    this.rightwingfin4 = new ModelRenderer(this, 379, 137);
    this.rightwingfin4.addBox(-35.0F, 0.0F, 0.0F, 37, 4, 2);
    this.rightwingfin4.setRotationPoint(-9.0F, -13.0F, -6.0F);
    this.rightwingfin4.setTextureSize(512, 256);
    this.rightwingfin4.mirror = true;
    setRotation(this.rightwingfin4, -0.2617994F, 1.186824F, 0.0F);
    this.rightwingmembrane = new ModelRenderer(this, 300, 67);
    this.rightwingmembrane.addBox(-67.0F, -1.0F, 0.0F, 64, 0, 34);
    this.rightwingmembrane.setRotationPoint(-9.0F, -12.0F, -12.0F);
    this.rightwingmembrane.setTextureSize(512, 256);
    this.rightwingmembrane.mirror = true;
    setRotation(this.rightwingmembrane, -0.0872665F, 0.1745329F, 0.0F);
    this.hammerhead2 = new ModelRenderer(this, 258, 157);
    this.hammerhead2.addBox(-25.0F, 0.0F, -14.0F, 50, 4, 7);
    this.hammerhead2.setRotationPoint(0.0F, -7.0F, -43.0F);
    this.hammerhead2.setTextureSize(512, 256);
    this.hammerhead2.mirror = true;
    setRotation(this.hammerhead2, 0.4537856F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Cephadrome e = (Cephadrome)entity;
    RenderInfo r = null;
    float newangle = 0.0F;
    float lspeed = 0.0F;
    float pi4 = 0.7853982F;
    float tailspeed = 0.76F;
    float tailamp = 0.1F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderInfo();
    if (f1 > 0.001D) {
      lspeed = (float)((e.prevPosX - e.posX) * (e.prevPosX - e.posX) + (e.prevPosZ - e.posZ) * (e.prevPosZ - e.posZ));
      lspeed = (float)Math.sqrt(lspeed);
      newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed) * 3.1415927F * lspeed * 0.4F;
      if (newangle > 0.5D)
        newangle = 0.75F; 
      if (newangle < -0.5D)
        newangle = -0.75F; 
    } else {
      newangle = 0.0F;
    } 
    if (e.getActivity() != 0) {
      newangle = 1.0F;
      this.rightleg1.rotateAngleX = -0.58F + newangle;
      this.rightleg2.rotateAngleX = 0.98F + newangle;
      this.rightleg3.rotateAngleX = -0.52F + newangle;
      this.rightfoot.rotateAngleX = newangle;
      this.leftleg1.rotateAngleX = -0.58F + newangle;
      this.leftleg2.rotateAngleX = 0.98F + newangle;
      this.leftleg3.rotateAngleX = -0.52F + newangle;
      this.leftfoot.rotateAngleX = newangle;
    } else {
      this.rightleg1.rotateAngleX = -0.58F + newangle;
      this.rightleg2.rotateAngleX = 0.98F + newangle;
      this.rightleg3.rotateAngleX = -0.52F + newangle;
      this.rightfoot.rotateAngleX = newangle;
      this.leftleg1.rotateAngleX = -0.58F - newangle;
      this.leftleg2.rotateAngleX = 0.98F - newangle;
      this.leftleg3.rotateAngleX = -0.52F - newangle;
      this.leftfoot.rotateAngleX = -newangle;
    } 
    if (e.getActivity() != 0) {
      newangle = MathHelper.cos(f2 * 0.55F * this.wingspeed) * 3.1415927F * 0.28F;
    } else if (e.getAttacking() == 0) {
      newangle = -0.85F + MathHelper.cos(f2 * 0.2F * this.wingspeed) * 3.1415927F * 0.028F;
    } else {
      newangle = -0.65F + MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.068F;
    } 
    this.lefwingfin1.rotateAngleZ = newangle;
    this.leftwingfin2.rotateAngleZ = newangle;
    this.leftwingfin3.rotateAngleZ = newangle;
    this.leftwingfin4.rotateAngleZ = newangle;
    this.leftwingmembrane.rotateAngleZ = newangle;
    this.rightwingfin1.rotateAngleZ = -newangle;
    this.rightwingfin2.rotateAngleZ = -newangle;
    this.rightwingfin3.rotateAngleZ = -newangle;
    this.rightwingfin4.rotateAngleZ = -newangle;
    this.rightwingmembrane.rotateAngleZ = -newangle;
    newangle = MathHelper.cos(f2 * 0.15F * this.wingspeed) * 3.1415927F * 0.05F;
    this.topfin1.rotateAngleX = -1.85F - Math.abs(newangle);
    this.topmem1.rotateAngleX = -0.26F - Math.abs(newangle);
    this.topfin2.rotateAngleX = -2.07F - Math.abs(newangle / 2.0F);
    this.topmem2.rotateAngleX = -0.52F - Math.abs(newangle / 2.0F);
    this.topfin3.rotateAngleX = -2.42F - Math.abs(newangle / 4.0F);
    this.topmem3.rotateAngleX = -0.89F - Math.abs(newangle / 4.0F);
    this.topfin4.rotateAngleX = -2.63F - Math.abs(newangle / 8.0F);
    this.topmem4.rotateAngleX = -1.11F - Math.abs(newangle / 8.0F);
    if (e.getActivity() == 0 && e.getAttacking() == 0) {
      tailspeed = 0.22F;
      tailamp = 0.03F;
    } 
    this.tail1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * 3.1415927F * 0.04F;
    this.tail1.rotationPointZ += (float)Math.cos(this.tail1.rotateAngleY) * 13.0F;
    this.tail2.rotationPointX = this.tail1.rotationPointX + 1.5F + (float)Math.sin(this.tail1.rotateAngleY) * 13.0F;
    this.tail2.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - pi4) * 3.1415927F * tailamp;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 13.0F;
    this.tail3.rotationPointX = this.tail2.rotationPointX - 0.5F + (float)Math.sin(this.tail2.rotateAngleY) * 13.0F;
    this.tail3.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - 2.0F * pi4) * 3.1415927F * tailamp;
    this.tail3.rotationPointZ += (float)Math.cos(this.tail3.rotateAngleY) * 10.0F;
    this.tailfin1.rotationPointX = this.tail3.rotationPointX - 1.0F + (float)Math.sin(this.tail3.rotateAngleY) * 10.0F;
    this.tailfin1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - 3.0F * pi4) * 3.1415927F * tailamp;
    this.tailfin2.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin2.rotationPointX = this.tailfin1.rotationPointX;
    this.tailfin2.rotateAngleY = this.tailfin1.rotateAngleY;
    this.tailfin3.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin3.rotationPointX = this.tailfin1.rotationPointX;
    this.tailfin3.rotateAngleY = this.tailfin1.rotateAngleY;
    this.tailfin4.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin4.rotationPointX = this.tailfin1.rotationPointX;
    this.tailfin4.rotateAngleY = this.tailfin1.rotateAngleY;
    this.tailmembrane1.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane1.rotationPointX = this.tailfin1.rotationPointX;
    this.tailmembrane1.rotateAngleY = this.tailfin1.rotateAngleY;
    this.tailmembrane2.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane2.rotationPointX = this.tailfin1.rotationPointX;
    this.tailmembrane2.rotateAngleY = this.tailfin1.rotateAngleY;
    this.tailmembrane3.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane3.rotationPointX = this.tailfin1.rotationPointX;
    this.tailmembrane3.rotateAngleY = this.tailfin1.rotateAngleY;
    if (e.getActivity() == 1) {
      f3 = (e.prevRotationYaw - e.rotationYaw) * 10.0F;
      f3 = -f3;
      r.rf1 += (f3 - r.rf1) / 50.0F;
      if (r.rf1 > 50.0F)
        r.rf1 = 50.0F; 
      if (r.rf1 < -50.0F)
        r.rf1 = -50.0F; 
      f3 = r.rf1;
    } else {
      f3 /= 2.0F;
    } 
    this.neck3.rotateAngleY = (float)Math.toRadians(f3) * 0.125F;
    this.neck3.rotationPointZ -= (float)Math.cos(this.neck3.rotateAngleY) * 14.0F;
    this.neck2.rotationPointX = this.neck3.rotationPointX + 0.5F - (float)Math.sin(this.neck3.rotateAngleY) * 14.0F;
    this.neck2.rotateAngleY = (float)Math.toRadians(f3) * 0.25F;
    this.neck2.rotationPointZ -= (float)Math.cos(this.neck2.rotateAngleY) * 14.0F;
    this.neck1.rotationPointX = this.neck2.rotationPointX + 0.5F - (float)Math.sin(this.neck2.rotateAngleY) * 14.0F;
    this.neck1.rotateAngleY = (float)Math.toRadians(f3) * 0.5F;
    this.neck1.rotationPointZ -= (float)Math.cos(this.neck1.rotateAngleY) * 8.0F;
    this.neck1.rotationPointX -= (float)Math.sin(this.neck1.rotateAngleY) * 8.0F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.75F;
    this.hammerhead.rotationPointZ = this.head.rotationPointZ;
    this.hammerhead.rotationPointX = this.head.rotationPointX;
    this.hammerhead.rotateAngleY = this.head.rotateAngleY;
    this.hammerhead2.rotationPointZ = this.head.rotationPointZ;
    this.hammerhead2.rotationPointX = this.head.rotationPointX;
    this.hammerhead2.rotateAngleY = this.head.rotateAngleY;
    this.mouth.rotationPointZ = this.head.rotationPointZ;
    this.mouth.rotationPointX = this.head.rotationPointX;
    this.mouth.rotateAngleY = this.head.rotateAngleY;
    newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.14F;
    if (e.getAttacking() != 0) {
      this.mouth.rotateAngleX = -0.61F + newangle;
    } else {
      this.mouth.rotateAngleX = -0.87F;
    } 
    e.setRenderInfo(r);
    this.leftfoot.render(f5);
    this.butt.render(f5);
    this.rightfoot.render(f5);
    this.topfin1.render(f5);
    this.topfin2.render(f5);
    this.topfin3.render(f5);
    this.topfin4.render(f5);
    this.leftshoulder.render(f5);
    this.lefwingfin1.render(f5);
    this.tailfin1.render(f5);
    this.tailmembrane2.render(f5);
    this.tailfin2.render(f5);
    this.tailfin4.render(f5);
    this.tailfin3.render(f5);
    this.tailmembrane1.render(f5);
    this.topmem1.render(f5);
    this.topmem2.render(f5);
    this.topmem3.render(f5);
    this.topmem4.render(f5);
    this.neck1.render(f5);
    this.body.render(f5);
    this.chest1.render(f5);
    this.leftleg1.render(f5);
    this.mouth.render(f5);
    this.neck2.render(f5);
    this.head.render(f5);
    this.hammerhead.render(f5);
    this.chest.render(f5);
    this.neck3.render(f5);
    this.tail1.render(f5);
    this.rightleg1.render(f5);
    this.leftleg2.render(f5);
    this.rightleg2.render(f5);
    this.body2.render(f5);
    this.leftleg3.render(f5);
    this.rightleg3.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tailmembrane3.render(f5);
    this.leftwingfin2.render(f5);
    this.leftwingfin3.render(f5);
    this.leftwingfin4.render(f5);
    this.leftwingmembrane.render(f5);
    this.rightshoulder.render(f5);
    this.rightwingfin1.render(f5);
    this.rightwingfin2.render(f5);
    this.rightwingfin3.render(f5);
    this.rightwingfin4.render(f5);
    this.rightwingmembrane.render(f5);
    this.hammerhead2.render(f5);
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