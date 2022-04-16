package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTriffid extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer r9;
  
  ModelRenderer b14;
  
  ModelRenderer base;
  
  ModelRenderer b3;
  
  ModelRenderer l57;
  
  ModelRenderer l30;
  
  ModelRenderer b6;
  
  ModelRenderer b7;
  
  ModelRenderer b8;
  
  ModelRenderer b9;
  
  ModelRenderer b11;
  
  ModelRenderer b16;
  
  ModelRenderer h18;
  
  ModelRenderer b13;
  
  ModelRenderer b15;
  
  ModelRenderer h8;
  
  ModelRenderer h1;
  
  ModelRenderer h13;
  
  ModelRenderer h7;
  
  ModelRenderer h3;
  
  ModelRenderer h17;
  
  ModelRenderer h16;
  
  ModelRenderer h23;
  
  ModelRenderer h4;
  
  ModelRenderer h2;
  
  ModelRenderer h21;
  
  ModelRenderer h19;
  
  ModelRenderer h20;
  
  ModelRenderer b10;
  
  ModelRenderer b17;
  
  ModelRenderer h6;
  
  ModelRenderer h11;
  
  ModelRenderer h14;
  
  ModelRenderer h15;
  
  ModelRenderer h10;
  
  ModelRenderer h9;
  
  ModelRenderer h5;
  
  ModelRenderer h12;
  
  ModelRenderer c2;
  
  ModelRenderer c11;
  
  ModelRenderer c1;
  
  ModelRenderer c5;
  
  ModelRenderer c3;
  
  ModelRenderer c4;
  
  ModelRenderer c10;
  
  ModelRenderer c6;
  
  ModelRenderer c7;
  
  ModelRenderer c8;
  
  ModelRenderer c9;
  
  ModelRenderer b1;
  
  ModelRenderer l15;
  
  ModelRenderer b2;
  
  ModelRenderer l43;
  
  ModelRenderer l1;
  
  ModelRenderer l2;
  
  ModelRenderer l3;
  
  ModelRenderer leaf3;
  
  ModelRenderer l4;
  
  ModelRenderer l5;
  
  ModelRenderer l6;
  
  ModelRenderer l7;
  
  ModelRenderer l8;
  
  ModelRenderer l9;
  
  ModelRenderer l10;
  
  ModelRenderer l11;
  
  ModelRenderer l12;
  
  ModelRenderer l13;
  
  ModelRenderer l14;
  
  ModelRenderer b4;
  
  ModelRenderer l31;
  
  ModelRenderer l32;
  
  ModelRenderer leaf32;
  
  ModelRenderer l33;
  
  ModelRenderer l34;
  
  ModelRenderer l35;
  
  ModelRenderer l36;
  
  ModelRenderer l37;
  
  ModelRenderer l38;
  
  ModelRenderer l39;
  
  ModelRenderer l40;
  
  ModelRenderer l41;
  
  ModelRenderer l42;
  
  ModelRenderer l17;
  
  ModelRenderer l18;
  
  ModelRenderer l19;
  
  ModelRenderer l20;
  
  ModelRenderer l21;
  
  ModelRenderer l22;
  
  ModelRenderer l23;
  
  ModelRenderer l24;
  
  ModelRenderer l25;
  
  ModelRenderer l26;
  
  ModelRenderer l27;
  
  ModelRenderer l28;
  
  ModelRenderer l29;
  
  ModelRenderer b5;
  
  ModelRenderer l45;
  
  ModelRenderer l46;
  
  ModelRenderer l47;
  
  ModelRenderer l48;
  
  ModelRenderer l49;
  
  ModelRenderer leaf49;
  
  ModelRenderer l50;
  
  ModelRenderer l51;
  
  ModelRenderer l52;
  
  ModelRenderer l53;
  
  ModelRenderer l54;
  
  ModelRenderer l55;
  
  ModelRenderer l56;
  
  ModelRenderer h22;
  
  ModelRenderer t15;
  
  ModelRenderer t14;
  
  ModelRenderer t13;
  
  ModelRenderer t12;
  
  ModelRenderer t11;
  
  ModelRenderer t10;
  
  ModelRenderer t9;
  
  ModelRenderer t6;
  
  ModelRenderer t2;
  
  ModelRenderer t8;
  
  ModelRenderer t7;
  
  ModelRenderer t5;
  
  ModelRenderer t4;
  
  ModelRenderer t3;
  
  ModelRenderer t1;
  
  ModelRenderer r47;
  
  ModelRenderer r2;
  
  ModelRenderer r6;
  
  ModelRenderer r5;
  
  ModelRenderer r10;
  
  ModelRenderer r7;
  
  ModelRenderer r12;
  
  ModelRenderer r8;
  
  ModelRenderer r11;
  
  ModelRenderer r4;
  
  ModelRenderer r40;
  
  ModelRenderer r45;
  
  ModelRenderer r49;
  
  ModelRenderer r44;
  
  ModelRenderer root43;
  
  ModelRenderer r43;
  
  ModelRenderer r46;
  
  ModelRenderer r48;
  
  ModelRenderer r35;
  
  ModelRenderer r38;
  
  ModelRenderer r42;
  
  ModelRenderer r39;
  
  ModelRenderer r41;
  
  ModelRenderer r18;
  
  ModelRenderer r3;
  
  ModelRenderer r50;
  
  ModelRenderer r31;
  
  ModelRenderer r36;
  
  ModelRenderer r37;
  
  ModelRenderer r22;
  
  ModelRenderer r30;
  
  ModelRenderer r33;
  
  ModelRenderer r34;
  
  ModelRenderer r29;
  
  ModelRenderer r20;
  
  ModelRenderer r24;
  
  ModelRenderer r28;
  
  ModelRenderer r26;
  
  ModelRenderer r25;
  
  ModelRenderer r27;
  
  ModelRenderer r23;
  
  ModelRenderer r21;
  
  ModelRenderer r1;
  
  ModelRenderer r13;
  
  ModelRenderer r16;
  
  ModelRenderer r19;
  
  ModelRenderer r15;
  
  ModelRenderer r14;
  
  ModelRenderer r17;
  
  ModelRenderer r32;
  
  ModelRenderer l16;
  
  ModelRenderer l44;
  
  ModelRenderer root;
  
  public ModelTriffid(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 532;
    this.textureHeight = 715;
    this.r9 = new ModelRenderer(this, 111, 0);
    this.r9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 9);
    this.r9.setRotationPoint(-15.0F, 22.0F, -17.0F);
    this.r9.setTextureSize(532, 715);
    this.r9.mirror = true;
    setRotation(this.r9, -0.296706F, 1.151917F, 1.708151F);
    this.b14 = new ModelRenderer(this, 0, 0);
    this.b14.addBox(-4.0F, -4.0F, -4.0F, 7, 7, 7);
    this.b14.setRotationPoint(0.0F, -22.0F, -2.5F);
    this.b14.setTextureSize(532, 715);
    this.b14.mirror = true;
    setRotation(this.b14, -0.4165037F, 1.689355F, 0.1948779F);
    this.base = new ModelRenderer(this, 150, 0);
    this.base.addBox(0.0F, 0.0F, 0.0F, 9, 8, 9);
    this.base.setRotationPoint(-5.0F, 16.0F, -5.0F);
    this.base.setTextureSize(532, 715);
    this.base.mirror = true;
    setRotation(this.base, 0.0F, 0.0F, 0.0F);
    this.b3 = new ModelRenderer(this, 0, 0);
    this.b3.addBox(-4.0F, -4.0F, -4.0F, 7, 8, 8);
    this.b3.setRotationPoint(-2.0F, 16.0F, -2.0F);
    this.b3.setTextureSize(532, 715);
    this.b3.mirror = true;
    setRotation(this.b3, 0.0523599F, 0.1745329F, -0.2094395F);
    this.l57 = new ModelRenderer(this, 40, 0);
    this.l57.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.l57.setRotationPoint(0.0F, -24.0F, 6.0F);
    this.l57.setTextureSize(532, 715);
    this.l57.mirror = true;
    setRotation(this.l57, 2.286381F, 0.0F, 0.0F);
    this.l30 = new ModelRenderer(this, 40, 0);
    this.l30.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.l30.setRotationPoint(-0.5F, -24.5F, -6.0F);
    this.l30.setTextureSize(532, 715);
    this.l30.mirror = true;
    setRotation(this.l30, -2.268928F, 0.0F, 0.0F);
    this.b6 = new ModelRenderer(this, 0, 0);
    this.b6.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.b6.setRotationPoint(-4.5F, 2.0F, -4.5F);
    this.b6.setTextureSize(532, 715);
    this.b6.mirror = true;
    setRotation(this.b6, -0.1047198F, -0.1396263F, -0.2617994F);
    this.b7 = new ModelRenderer(this, 0, 0);
    this.b7.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.b7.setRotationPoint(-3.0F, 4.0F, -4.5F);
    this.b7.setTextureSize(532, 715);
    this.b7.mirror = true;
    setRotation(this.b7, 0.4014257F, 0.3490659F, -0.6283185F);
    this.b8 = new ModelRenderer(this, 0, 0);
    this.b8.addBox(-4.0F, -4.0F, -4.0F, 7, 8, 8);
    this.b8.setRotationPoint(-3.0F, -5.0F, -4.5F);
    this.b8.setTextureSize(532, 715);
    this.b8.mirror = true;
    setRotation(this.b8, -0.0818962F, -0.1342561F, -0.8513902F);
    this.b9 = new ModelRenderer(this, 0, 0);
    this.b9.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    this.b9.setRotationPoint(-3.0F, -5.0F, -5.5F);
    this.b9.setTextureSize(532, 715);
    this.b9.mirror = true;
    setRotation(this.b9, -0.0447176F, 1.208305F, -0.1449966F);
    this.b11 = new ModelRenderer(this, 0, 0);
    this.b11.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.b11.setRotationPoint(-3.0F, -12.0F, -5.5F);
    this.b11.setTextureSize(532, 715);
    this.b11.mirror = true;
    setRotation(this.b11, -0.0447176F, 1.208305F, -0.1449966F);
    this.b16 = new ModelRenderer(this, 0, 0);
    this.b16.addBox(-4.0F, -4.0F, -4.0F, 7, 8, 7);
    this.b16.setRotationPoint(0.0F, -17.0F, -5.5F);
    this.b16.setTextureSize(532, 715);
    this.b16.mirror = true;
    setRotation(this.b16, -0.2306107F, 0.8365188F, -0.5911399F);
    this.h18 = new ModelRenderer(this, 80, 0);
    this.h18.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h18.setRotationPoint(2.0F, -40.5F, -3.0F);
    this.h18.setTextureSize(532, 715);
    this.h18.mirror = true;
    setRotation(this.h18, 0.0523599F, -0.4537856F, 0.0F);
    this.b13 = new ModelRenderer(this, 0, 0);
    this.b13.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.b13.setRotationPoint(0.0F, -28.0F, -1.5F);
    this.b13.setTextureSize(532, 715);
    this.b13.mirror = true;
    setRotation(this.b13, 0.3531968F, 1.505734F, -0.3308896F);
    this.b15 = new ModelRenderer(this, 0, 0);
    this.b15.addBox(-3.0F, -3.0F, -3.0F, 5, 5, 5);
    this.b15.setRotationPoint(0.0F, -27.0F, -0.5F);
    this.b15.setTextureSize(532, 715);
    this.b15.mirror = true;
    setRotation(this.b15, 0.5205006F, 1.412787F, 0.8179294F);
    this.h8 = new ModelRenderer(this, 80, 0);
    this.h8.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1);
    this.h8.setRotationPoint(-1.0F, -35.0F, 0.5F);
    this.h8.setTextureSize(532, 715);
    this.h8.mirror = true;
    setRotation(this.h8, -0.296706F, 0.1745329F, 0.0F);
    this.h1 = new ModelRenderer(this, 80, 0);
    this.h1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1);
    this.h1.setRotationPoint(-1.0F, -34.5F, -3.0F);
    this.h1.setTextureSize(532, 715);
    this.h1.mirror = true;
    setRotation(this.h1, 0.296706F, -0.1745329F, 0.0F);
    this.h13 = new ModelRenderer(this, 80, 0);
    this.h13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.h13.setRotationPoint(-2.0F, -41.0F, -2.5F);
    this.h13.setTextureSize(532, 715);
    this.h13.mirror = true;
    setRotation(this.h13, 0.5934119F, -0.0174533F, 0.0F);
    this.h7 = new ModelRenderer(this, 80, 0);
    this.h7.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h7.setRotationPoint(-1.0F, -37.5F, 1.0F);
    this.h7.setTextureSize(532, 715);
    this.h7.mirror = true;
    setRotation(this.h7, -0.1745329F, 0.2094395F, 0.0F);
    this.h3 = new ModelRenderer(this, 80, 0);
    this.h3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h3.setRotationPoint(-1.0F, -40.5F, -3.5F);
    this.h3.setTextureSize(532, 715);
    this.h3.mirror = true;
    setRotation(this.h3, -0.0523599F, -0.2094395F, 0.0F);
    this.h17 = new ModelRenderer(this, 80, 0);
    this.h17.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.h17.setRotationPoint(2.0F, -41.7F, -2.5F);
    this.h17.setTextureSize(532, 715);
    this.h17.mirror = true;
    setRotation(this.h17, 0.0F, 0.0F, 0.6806784F);
    this.h16 = new ModelRenderer(this, 80, 0);
    this.h16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h16.setRotationPoint(-1.5F, -34.5F, -2.5F);
    this.h16.setTextureSize(532, 715);
    this.h16.mirror = true;
    setRotation(this.h16, 0.2617994F, 0.0F, 0.0F);
    this.h23 = new ModelRenderer(this, 80, 0);
    this.h23.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h23.setRotationPoint(2.0F, -40.5F, 0.0F);
    this.h23.setTextureSize(532, 715);
    this.h23.mirror = true;
    setRotation(this.h23, 0.0872665F, 0.7504916F, 0.0F);
    this.h4 = new ModelRenderer(this, 80, 0);
    this.h4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.h4.setRotationPoint(-1.0F, -40.5F, -3.5F);
    this.h4.setTextureSize(532, 715);
    this.h4.mirror = true;
    setRotation(this.h4, 0.6108652F, -0.0174533F, 0.0F);
    this.h2 = new ModelRenderer(this, 80, 0);
    this.h2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h2.setRotationPoint(-1.0F, -37.5F, -3.5F);
    this.h2.setTextureSize(532, 715);
    this.h2.mirror = true;
    setRotation(this.h2, 0.1745329F, -0.2094395F, 0.0F);
    this.h21 = new ModelRenderer(this, 80, 0);
    this.h21.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h21.setRotationPoint(3.0F, -34.5F, -0.5F);
    this.h21.setTextureSize(532, 715);
    this.h21.mirror = true;
    setRotation(this.h21, 0.1745329F, -0.7853982F, 0.3839724F);
    this.h19 = new ModelRenderer(this, 80, 0);
    this.h19.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h19.setRotationPoint(3.0F, -37.5F, -2.0F);
    this.h19.setTextureSize(532, 715);
    this.h19.mirror = true;
    setRotation(this.h19, 0.1745329F, -0.7853982F, 0.0F);
    this.h20 = new ModelRenderer(this, 80, 0);
    this.h20.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h20.setRotationPoint(3.0F, -34.5F, -1.5F);
    this.h20.setTextureSize(532, 715);
    this.h20.mirror = true;
    setRotation(this.h20, 0.5759587F, -0.7853982F, -0.2094395F);
    this.b10 = new ModelRenderer(this, 0, 0);
    this.b10.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.b10.setRotationPoint(0.0F, -12.0F, -6.5F);
    this.b10.setTextureSize(532, 715);
    this.b10.mirror = true;
    setRotation(this.b10, -0.2677893F, 0.7249829F, -0.4052469F);
    this.b17 = new ModelRenderer(this, 0, 0);
    this.b17.addBox(-3.0F, -3.0F, -3.0F, 5, 5, 5);
    this.b17.setRotationPoint(0.0F, -20.5F, -2.5F);
    this.b17.setTextureSize(532, 715);
    this.b17.mirror = true;
    setRotation(this.b17, 0.7063936F, 1.896109F, 0.7435722F);
    this.h6 = new ModelRenderer(this, 80, 0);
    this.h6.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h6.setRotationPoint(-1.0F, -40.5F, 1.0F);
    this.h6.setTextureSize(532, 715);
    this.h6.mirror = true;
    setRotation(this.h6, 0.0523599F, 0.2094395F, 0.0F);
    this.h11 = new ModelRenderer(this, 80, 0);
    this.h11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h11.setRotationPoint(-1.5F, -40.5F, 0.5F);
    this.h11.setTextureSize(532, 715);
    this.h11.mirror = true;
    setRotation(this.h11, 0.0523599F, 0.2094395F, 0.0F);
    this.h14 = new ModelRenderer(this, 80, 0);
    this.h14.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h14.setRotationPoint(-1.5F, -40.5F, -3.0F);
    this.h14.setTextureSize(532, 715);
    this.h14.mirror = true;
    setRotation(this.h14, -0.0349066F, 0.1396263F, 0.0F);
    this.h15 = new ModelRenderer(this, 80, 0);
    this.h15.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h15.setRotationPoint(-1.5F, -37.5F, -3.0F);
    this.h15.setTextureSize(532, 715);
    this.h15.mirror = true;
    setRotation(this.h15, 0.1919862F, 0.1396263F, 0.0F);
    this.h10 = new ModelRenderer(this, 80, 0);
    this.h10.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h10.setRotationPoint(-1.5F, -37.5F, 0.5F);
    this.h10.setTextureSize(532, 715);
    this.h10.mirror = true;
    setRotation(this.h10, -0.1919862F, 0.0F, 0.0F);
    this.h9 = new ModelRenderer(this, 80, 0);
    this.h9.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.h9.setRotationPoint(-1.5F, -34.5F, -0.5F);
    this.h9.setTextureSize(532, 715);
    this.h9.mirror = true;
    setRotation(this.h9, -0.2617994F, 0.0F, 0.0F);
    this.h5 = new ModelRenderer(this, 80, 0);
    this.h5.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.h5.setRotationPoint(-1.0F, -42.5F, -0.5F);
    this.h5.setTextureSize(532, 715);
    this.h5.mirror = true;
    setRotation(this.h5, -0.6108652F, 0.296706F, 0.0F);
    this.h12 = new ModelRenderer(this, 80, 0);
    this.h12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.h12.setRotationPoint(-2.0F, -42.0F, -0.5F);
    this.h12.setTextureSize(532, 715);
    this.h12.mirror = true;
    setRotation(this.h12, -0.6108652F, 0.296706F, 0.0F);
    this.c2 = new ModelRenderer(this, 0, 0);
    this.c2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c2.setRotationPoint(-2.0F, -29.0F, -3.0F);
    this.c2.setTextureSize(532, 715);
    this.c2.mirror = true;
    setRotation(this.c2, 0.0F, -0.6632251F, 0.2792527F);
    this.c11 = new ModelRenderer(this, 0, 0);
    this.c11.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c11.setRotationPoint(-3.0F, -29.0F, 0.0F);
    this.c11.setTextureSize(532, 715);
    this.c11.mirror = true;
    setRotation(this.c11, 0.0713623F, 0.5948578F, 0.6335855F);
    this.c1 = new ModelRenderer(this, 0, 0);
    this.c1.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c1.setRotationPoint(-3.0F, -29.0F, -2.0F);
    this.c1.setTextureSize(532, 715);
    this.c1.mirror = true;
    setRotation(this.c1, 0.1745329F, 0.0F, 0.2792527F);
    this.c5 = new ModelRenderer(this, 0, 0);
    this.c5.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c5.setRotationPoint(2.5F, -29.0F, -2.5F);
    this.c5.setTextureSize(532, 715);
    this.c5.mirror = true;
    setRotation(this.c5, 0.0F, -2.617994F, 0.3700098F);
    this.c3 = new ModelRenderer(this, 0, 0);
    this.c3.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c3.setRotationPoint(0.0F, -29.0F, -3.533333F);
    this.c3.setTextureSize(532, 715);
    this.c3.mirror = true;
    setRotation(this.c3, 0.0F, -1.32645F, 0.2792527F);
    this.c4 = new ModelRenderer(this, 0, 0);
    this.c4.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c4.setRotationPoint(2.5F, -29.0F, -4.0F);
    this.c4.setTextureSize(532, 715);
    this.c4.mirror = true;
    setRotation(this.c4, 0.0F, -1.553343F, 0.2792527F);
    this.c10 = new ModelRenderer(this, 0, 0);
    this.c10.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c10.setRotationPoint(0.0F, -30.0F, 2.5F);
    this.c10.setTextureSize(532, 715);
    this.c10.mirror = true;
    setRotation(this.c10, 0.0F, -2.019315F, -0.5222769F);
    this.c6 = new ModelRenderer(this, 0, 0);
    this.c6.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c6.setRotationPoint(4.5F, -29.0F, -0.5F);
    this.c6.setTextureSize(532, 715);
    this.c6.mirror = true;
    setRotation(this.c6, 0.0F, -2.373648F, 0.3700098F);
    this.c7 = new ModelRenderer(this, 0, 0);
    this.c7.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c7.setRotationPoint(4.5F, -30.0F, -0.5F);
    this.c7.setTextureSize(532, 715);
    this.c7.mirror = true;
    setRotation(this.c7, 0.0F, -0.1801097F, -0.2992052F);
    this.c8 = new ModelRenderer(this, 0, 0);
    this.c8.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c8.setRotationPoint(4.0F, -30.0F, 0.5F);
    this.c8.setTextureSize(532, 715);
    this.c8.mirror = true;
    setRotation(this.c8, 0.1487144F, -0.866778F, -0.6709913F);
    this.c9 = new ModelRenderer(this, 0, 0);
    this.c9.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2);
    this.c9.setRotationPoint(2.0F, -30.0F, 2.0F);
    this.c9.setTextureSize(532, 715);
    this.c9.mirror = true;
    setRotation(this.c9, -0.2230717F, -1.573172F, -0.8197058F);
    this.b1 = new ModelRenderer(this, 0, 0);
    this.b1.addBox(-4.0F, -4.0F, -4.0F, 9, 8, 9);
    this.b1.setRotationPoint(-1.0F, 13.0F, -5.0F);
    this.b1.setTextureSize(532, 715);
    this.b1.mirror = true;
    setRotation(this.b1, -0.2268928F, -0.3748843F, 0.3520608F);
    this.l15 = new ModelRenderer(this, 0, 0);
    this.l15.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.l15.setRotationPoint(-5.5F, -31.0F, -5.0F);
    this.l15.setTextureSize(532, 715);
    this.l15.mirror = true;
    setRotation(this.l15, 0.0204482F, -0.065992F, 0.7831261F);
    this.b2 = new ModelRenderer(this, 0, 0);
    this.b2.addBox(-4.0F, -4.0F, -4.0F, 9, 8, 9);
    this.b2.setRotationPoint(-2.0F, 8.0F, -4.0F);
    this.b2.setTextureSize(532, 715);
    this.b2.mirror = true;
    setRotation(this.b2, -0.2268928F, -0.3748843F, 0.3520608F);
    this.l43 = new ModelRenderer(this, 40, 0);
    this.l43.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.l43.setRotationPoint(5.5F, -25.5F, -1.5F);
    this.l43.setTextureSize(532, 715);
    this.l43.mirror = true;
    setRotation(this.l43, 0.0F, 0.0F, -0.5722408F);
    this.l1 = new ModelRenderer(this, 40, 0);
    this.l1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 5);
    this.l1.setRotationPoint(-7.0F, 10.0F, -4.0F);
    this.l1.setTextureSize(532, 715);
    this.l1.mirror = true;
    setRotation(this.l1, 0.0F, -0.2230717F, -0.7435722F);
    this.l2 = new ModelRenderer(this, 40, 0);
    this.l2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
    this.l2.setRotationPoint(-9.0F, 8.5F, -5.0F);
    this.l2.setTextureSize(532, 715);
    this.l2.mirror = true;
    setRotation(this.l2, 0.0698132F, -0.1707118F, -0.9006519F);
    this.l3 = new ModelRenderer(this, 0, 0);
    this.l3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7);
    this.l3.setRotationPoint(-10.0F, 5.5F, -6.0F);
    this.l3.setTextureSize(532, 715);
    this.l3.mirror = true;
    setRotation(this.l3, 0.0698132F, -0.1532585F, -0.3801513F);
    this.leaf3 = new ModelRenderer(this, 40, 0);
    this.leaf3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7);
    this.leaf3.setRotationPoint(-10.0F, 5.5F, -6.0F);
    this.leaf3.setTextureSize(532, 715);
    this.leaf3.mirror = true;
    setRotation(this.leaf3, 0.0698132F, -0.1532585F, -0.3801513F);
    this.l4 = new ModelRenderer(this, 40, 0);
    this.l4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 8);
    this.l4.setRotationPoint(-11.0F, 1.5F, -7.0F);
    this.l4.setTextureSize(532, 715);
    this.l4.mirror = true;
    setRotation(this.l4, 0.0698132F, -0.1532585F, -0.1942582F);
    this.l5 = new ModelRenderer(this, 40, 0);
    this.l5.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
    this.l5.setRotationPoint(-11.5F, -2.5F, -8.0F);
    this.l5.setTextureSize(532, 715);
    this.l5.mirror = true;
    setRotation(this.l5, 0.0698132F, -0.1008986F, -0.1418984F);
    this.l6 = new ModelRenderer(this, 40, 0);
    this.l6.addBox(0.0F, 0.0F, 0.0F, 1, 6, 10);
    this.l6.setRotationPoint(-12.0F, -7.5F, -9.0F);
    this.l6.setTextureSize(532, 715);
    this.l6.mirror = true;
    setRotation(this.l6, 0.1047198F, -0.1532585F, -0.176805F);
    this.l7 = new ModelRenderer(this, 40, 0);
    this.l7.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
    this.l7.setRotationPoint(-13.0F, -11.5F, -9.0F);
    this.l7.setTextureSize(532, 715);
    this.l7.mirror = true;
    setRotation(this.l7, 0.0698132F, -0.1532585F, -0.2291648F);
    this.l8 = new ModelRenderer(this, 40, 0);
    this.l8.addBox(0.0F, 0.0F, 0.0F, 1, 4, 8);
    this.l8.setRotationPoint(-13.0F, -15.5F, -8.5F);
    this.l8.setTextureSize(532, 715);
    this.l8.mirror = true;
    setRotation(this.l8, 0.0204482F, -0.1532585F, -0.0197253F);
    this.l9 = new ModelRenderer(this, 40, 0);
    this.l9.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7);
    this.l9.setRotationPoint(-12.5F, -19.5F, -8.0F);
    this.l9.setTextureSize(532, 715);
    this.l9.mirror = true;
    setRotation(this.l9, 0.0204482F, -0.1008986F, 0.1722609F);
    this.l10 = new ModelRenderer(this, 40, 0);
    this.l10.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6);
    this.l10.setRotationPoint(-11.0F, -23.3F, -7.5F);
    this.l10.setTextureSize(532, 715);
    this.l10.mirror = true;
    setRotation(this.l10, 0.0204482F, -0.065992F, 0.416607F);
    this.l11 = new ModelRenderer(this, 40, 0);
    this.l11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 5);
    this.l11.setRotationPoint(-9.5F, -26.0F, -7.0F);
    this.l11.setTextureSize(532, 715);
    this.l11.mirror = true;
    setRotation(this.l11, 0.0204482F, -0.065992F, 0.5038735F);
    this.l12 = new ModelRenderer(this, 40, 0);
    this.l12.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4);
    this.l12.setRotationPoint(-8.5F, -28.0F, -6.5F);
    this.l12.setTextureSize(532, 715);
    this.l12.mirror = true;
    setRotation(this.l12, 0.0204482F, -0.065992F, 0.5038735F);
    this.l13 = new ModelRenderer(this, 40, 0);
    this.l13.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
    this.l13.setRotationPoint(-7.5F, -29.0F, -6.0F);
    this.l13.setTextureSize(532, 715);
    this.l13.mirror = true;
    setRotation(this.l13, 0.0204482F, -0.065992F, 0.7482196F);
    this.l14 = new ModelRenderer(this, 40, 0);
    this.l14.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2);
    this.l14.setRotationPoint(-6.5F, -30.0F, -5.5F);
    this.l14.setTextureSize(532, 715);
    this.l14.mirror = true;
    setRotation(this.l14, 0.0204482F, -0.065992F, 0.7831261F);
    this.b4 = new ModelRenderer(this, 0, 0);
    this.b4.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
    this.b4.setRotationPoint(-4.5F, 9.0F, -4.5F);
    this.b4.setTextureSize(532, 715);
    this.b4.mirror = true;
    setRotation(this.b4, -0.2617994F, -0.1396263F, -0.2617994F);
    this.l31 = new ModelRenderer(this, 40, 0);
    this.l31.addBox(0.0F, 0.0F, 0.0F, 1, 5, 5);
    this.l31.setRotationPoint(7.5F, 9.0F, -3.5F);
    this.l31.setTextureSize(532, 715);
    this.l31.mirror = true;
    setRotation(this.l31, 0.0F, 0.0F, 0.7086656F);
    this.l32 = new ModelRenderer(this, 40, 0);
    this.l32.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
    this.l32.setRotationPoint(9.0F, 6.5F, -4.0F);
    this.l32.setTextureSize(532, 715);
    this.l32.mirror = true;
    setRotation(this.l32, 0.0F, 0.0F, 0.5341327F);
    this.leaf32 = new ModelRenderer(this, 40, 0);
    this.leaf32.addBox(0.0F, 0.0F, 0.0F, 1, 3, 7);
    this.leaf32.setRotationPoint(10.5F, 4.5F, -4.5F);
    this.leaf32.setTextureSize(532, 715);
    this.leaf32.mirror = true;
    setRotation(this.leaf32, 0.0F, 0.0F, 0.5864926F);
    this.l33 = new ModelRenderer(this, 0, 0);
    this.l33.addBox(0.0F, 0.0F, 0.0F, 1, 3, 7);
    this.l33.setRotationPoint(10.5F, 4.5F, -4.5F);
    this.l33.setTextureSize(532, 715);
    this.l33.mirror = true;
    setRotation(this.l33, 0.0F, 0.0F, 0.5864926F);
    this.l34 = new ModelRenderer(this, 40, 0);
    this.l34.addBox(0.0F, 0.0F, 0.0F, 1, 4, 8);
    this.l34.setRotationPoint(11.5F, 1.0F, -5.0F);
    this.l34.setTextureSize(532, 715);
    this.l34.mirror = true;
    setRotation(this.l34, 0.0F, 0.0F, 0.3004238F);
    this.l35 = new ModelRenderer(this, 40, 0);
    this.l35.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
    this.l35.setRotationPoint(12.5F, -2.5F, -5.5F);
    this.l35.setTextureSize(532, 715);
    this.l35.mirror = true;
    setRotation(this.l35, 0.0F, 0.0F, 0.248064F);
    this.l36 = new ModelRenderer(this, 40, 0);
    this.l36.addBox(0.0F, 0.0F, 0.0F, 1, 5, 10);
    this.l36.setRotationPoint(12.5F, -7.5F, -6.0F);
    this.l36.setTextureSize(532, 715);
    this.l36.mirror = true;
    setRotation(this.l36, 0.0F, 0.0F, 0.0037179F);
    this.l37 = new ModelRenderer(this, 40, 0);
    this.l37.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9);
    this.l37.setRotationPoint(12.0F, -11.5F, -5.5F);
    this.l37.setTextureSize(532, 715);
    this.l37.mirror = true;
    setRotation(this.l37, 0.0F, 0.0F, -0.1184552F);
    this.l38 = new ModelRenderer(this, 40, 0);
    this.l38.addBox(0.0F, 0.0F, 0.0F, 1, 4, 8);
    this.l38.setRotationPoint(11.0F, -15.0F, -5.0F);
    this.l38.setTextureSize(532, 715);
    this.l38.mirror = true;
    setRotation(this.l38, 0.0F, 0.0F, -0.2755348F);
    this.l39 = new ModelRenderer(this, 40, 0);
    this.l39.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7);
    this.l39.setRotationPoint(9.5F, -18.5F, -4.5F);
    this.l39.setTextureSize(532, 715);
    this.l39.mirror = true;
    setRotation(this.l39, 0.0F, 0.0F, -0.4151612F);
    this.l40 = new ModelRenderer(this, 40, 0);
    this.l40.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
    this.l40.setRotationPoint(8.5F, -21.0F, -4.0F);
    this.l40.setTextureSize(532, 715);
    this.l40.mirror = true;
    setRotation(this.l40, 0.0F, 0.0F, -0.4151612F);
    this.l41 = new ModelRenderer(this, 40, 0);
    this.l41.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4);
    this.l41.setRotationPoint(7.0F, -23.5F, -3.0F);
    this.l41.setTextureSize(532, 715);
    this.l41.mirror = true;
    setRotation(this.l41, 0.0F, 0.0F, -0.5373342F);
    this.l42 = new ModelRenderer(this, 40, 0);
    this.l42.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2);
    this.l42.setRotationPoint(6.0F, -25.0F, -2.0F);
    this.l42.setTextureSize(532, 715);
    this.l42.mirror = true;
    setRotation(this.l42, 0.0F, 0.0F, -0.5722408F);
    this.l17 = new ModelRenderer(this, 40, 0);
    this.l17.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3);
    this.l17.setRotationPoint(-2.5F, 8.5F, -11.0F);
    this.l17.setTextureSize(532, 715);
    this.l17.mirror = true;
    setRotation(this.l17, -0.6283185F, 0.0F, 0.0F);
    this.l18 = new ModelRenderer(this, 40, 0);
    this.l18.addBox(0.0F, 0.0F, 0.0F, 7, 1, 3);
    this.l18.setRotationPoint(-3.0F, 7.0F, -13.0F);
    this.l18.setTextureSize(532, 715);
    this.l18.mirror = true;
    setRotation(this.l18, -0.6457718F, 0.0F, 0.0F);
    this.l19 = new ModelRenderer(this, 40, 0);
    this.l19.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4);
    this.l19.setRotationPoint(-3.5F, 4.5F, -16.0F);
    this.l19.setTextureSize(532, 715);
    this.l19.mirror = true;
    setRotation(this.l19, -0.6981317F, 0.0F, 0.0F);
    this.l20 = new ModelRenderer(this, 40, 0);
    this.l20.addBox(0.0F, 0.0F, 0.0F, 9, 1, 4);
    this.l20.setRotationPoint(-4.0F, 2.0F, -18.0F);
    this.l20.setTextureSize(532, 715);
    this.l20.mirror = true;
    setRotation(this.l20, -0.9075712F, 0.0F, 0.0F);
    this.l21 = new ModelRenderer(this, 40, 0);
    this.l21.addBox(0.0F, 0.0F, 0.0F, 10, 1, 5);
    this.l21.setRotationPoint(-4.5F, -2.0F, -19.0F);
    this.l21.setTextureSize(532, 715);
    this.l21.mirror = true;
    setRotation(this.l21, -1.291544F, 0.0F, 0.0F);
    this.l22 = new ModelRenderer(this, 40, 0);
    this.l22.addBox(0.0F, 0.0F, 0.0F, 9, 1, 4);
    this.l22.setRotationPoint(-4.0F, -5.5F, -18.5F);
    this.l22.setTextureSize(532, 715);
    this.l22.mirror = true;
    setRotation(this.l22, -1.64061F, 0.0F, 0.0F);
    this.l23 = new ModelRenderer(this, 40, 0);
    this.l23.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4);
    this.l23.setRotationPoint(-4.0F, -8.5F, -17.5F);
    this.l23.setTextureSize(532, 715);
    this.l23.mirror = true;
    setRotation(this.l23, -1.850049F, 0.0F, 0.0F);
    this.l24 = new ModelRenderer(this, 40, 0);
    this.l24.addBox(0.0F, 0.0F, 0.0F, 7, 1, 4);
    this.l24.setRotationPoint(-3.5F, -12.0F, -15.5F);
    this.l24.setTextureSize(532, 715);
    this.l24.mirror = true;
    setRotation(this.l24, -2.111848F, 0.0F, 0.0F);
    this.l25 = new ModelRenderer(this, 40, 0);
    this.l25.addBox(0.0F, 0.0F, 0.0F, 6, 1, 4);
    this.l25.setRotationPoint(-3.0F, -15.0F, -13.0F);
    this.l25.setTextureSize(532, 715);
    this.l25.mirror = true;
    setRotation(this.l25, -2.234021F, 0.0F, 0.0F);
    this.l26 = new ModelRenderer(this, 40, 0);
    this.l26.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4);
    this.l26.setRotationPoint(-2.5F, -18.0F, -10.5F);
    this.l26.setTextureSize(532, 715);
    this.l26.mirror = true;
    setRotation(this.l26, -2.268928F, 0.0F, 0.0F);
    this.l27 = new ModelRenderer(this, 40, 0);
    this.l27.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3);
    this.l27.setRotationPoint(-2.0F, -20.0F, -9.0F);
    this.l27.setTextureSize(532, 715);
    this.l27.mirror = true;
    setRotation(this.l27, -2.268928F, 0.0F, 0.0F);
    this.l28 = new ModelRenderer(this, 40, 0);
    this.l28.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
    this.l28.setRotationPoint(-1.5F, -21.5F, -8.0F);
    this.l28.setTextureSize(532, 715);
    this.l28.mirror = true;
    setRotation(this.l28, -2.268928F, 0.0F, 0.0F);
    this.l29 = new ModelRenderer(this, 40, 0);
    this.l29.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
    this.l29.setRotationPoint(-1.0F, -23.0F, -7.0F);
    this.l29.setTextureSize(532, 715);
    this.l29.mirror = true;
    setRotation(this.l29, -2.268928F, 0.0F, 0.0F);
    this.b5 = new ModelRenderer(this, 0, 0);
    this.b5.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
    this.b5.setRotationPoint(-2.5F, 9.0F, -5.5F);
    this.b5.setTextureSize(532, 715);
    this.b5.mirror = true;
    setRotation(this.b5, 0.1919862F, -0.1396263F, 0.1745329F);
    this.l45 = new ModelRenderer(this, 40, 0);
    this.l45.addBox(0.0F, 0.0F, 0.0F, 6, 1, 4);
    this.l45.setRotationPoint(-3.0F, 6.0F, 8.5F);
    this.l45.setTextureSize(532, 715);
    this.l45.mirror = true;
    setRotation(this.l45, 0.8901179F, 0.0F, 0.0F);
    this.l46 = new ModelRenderer(this, 40, 0);
    this.l46.addBox(0.0F, 0.0F, 0.0F, 7, 1, 3);
    this.l46.setRotationPoint(-3.5F, 3.0F, 11.0F);
    this.l46.setTextureSize(532, 715);
    this.l46.mirror = true;
    setRotation(this.l46, 1.134464F, 0.0F, 0.0F);
    this.l47 = new ModelRenderer(this, 40, 0);
    this.l47.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4);
    this.l47.setRotationPoint(-4.0F, 1.0F, 12.0F);
    this.l47.setTextureSize(532, 715);
    this.l47.mirror = true;
    setRotation(this.l47, 1.343904F, 0.0F, 0.0F);
    this.l48 = new ModelRenderer(this, 40, 0);
    this.l48.addBox(0.0F, 0.0F, 0.0F, 9, 1, 3);
    this.l48.setRotationPoint(-4.0F, -3.0F, 13.0F);
    this.l48.setTextureSize(532, 715);
    this.l48.mirror = true;
    setRotation(this.l48, 1.43117F, 0.0F, 0.0F);
    this.l49 = new ModelRenderer(this, 40, 0);
    this.l49.addBox(0.0F, 0.0F, 0.0F, 10, 1, 5);
    this.l49.setRotationPoint(-4.5F, -6.0F, 13.5F);
    this.l49.setTextureSize(532, 715);
    this.l49.mirror = true;
    setRotation(this.l49, 1.53589F, 0.0F, 0.0F);
    this.leaf49 = new ModelRenderer(this, 40, 0);
    this.leaf49.addBox(0.0F, 0.0F, 0.0F, 9, 1, 3);
    this.leaf49.setRotationPoint(-4.0F, -11.0F, 13.5F);
    this.leaf49.setTextureSize(532, 715);
    this.leaf49.mirror = true;
    setRotation(this.leaf49, 1.658063F, 0.0F, 0.0F);
    this.l50 = new ModelRenderer(this, 0, 0);
    this.l50.addBox(0.0F, 0.0F, 0.0F, 9, 1, 3);
    this.l50.setRotationPoint(-4.0F, -11.0F, 13.5F);
    this.l50.setTextureSize(532, 715);
    this.l50.mirror = true;
    setRotation(this.l50, 1.658063F, 0.0F, 0.0F);
    this.l51 = new ModelRenderer(this, 40, 0);
    this.l51.addBox(0.0F, 0.0F, 0.0F, 8, 1, 3);
    this.l51.setRotationPoint(-3.5F, -14.0F, 13.0F);
    this.l51.setTextureSize(532, 715);
    this.l51.mirror = true;
    setRotation(this.l51, 1.797689F, 0.0F, 0.0F);
    this.l52 = new ModelRenderer(this, 40, 0);
    this.l52.addBox(0.0F, 0.0F, 0.0F, 7, 1, 3);
    this.l52.setRotationPoint(-3.0F, -16.5F, 12.5F);
    this.l52.setTextureSize(532, 715);
    this.l52.mirror = true;
    setRotation(this.l52, 2.146755F, 0.0F, 0.0F);
    this.l53 = new ModelRenderer(this, 40, 0);
    this.l53.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3);
    this.l53.setRotationPoint(-2.5F, -19.0F, 11.0F);
    this.l53.setTextureSize(532, 715);
    this.l53.mirror = true;
    setRotation(this.l53, 2.286381F, 0.0F, 0.0F);
    this.l54 = new ModelRenderer(this, 40, 0);
    this.l54.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2);
    this.l54.setRotationPoint(-2.0F, -21.0F, 9.0F);
    this.l54.setTextureSize(532, 715);
    this.l54.mirror = true;
    setRotation(this.l54, 2.286381F, 0.0F, 0.0F);
    this.l55 = new ModelRenderer(this, 40, 0);
    this.l55.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2);
    this.l55.setRotationPoint(-1.5F, -22.0F, 8.0F);
    this.l55.setTextureSize(532, 715);
    this.l55.mirror = true;
    setRotation(this.l55, 2.286381F, 0.0F, 0.0F);
    this.l56 = new ModelRenderer(this, 40, 0);
    this.l56.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
    this.l56.setRotationPoint(-0.5F, -23.0F, 7.0F);
    this.l56.setTextureSize(532, 715);
    this.l56.mirror = true;
    setRotation(this.l56, 2.286381F, 0.0F, 0.0F);
    this.h22 = new ModelRenderer(this, 80, 0);
    this.h22.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 1);
    this.h22.setRotationPoint(2.0F, -37.5F, 0.0F);
    this.h22.setTextureSize(532, 715);
    this.h22.mirror = true;
    setRotation(this.h22, -0.1745329F, 0.6108652F, 0.0F);
    this.t15 = new ModelRenderer(this, 0, 40);
    this.t15.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t15.setRotationPoint(-1.0F, -40.5F, -1.0F);
    this.t15.setTextureSize(532, 715);
    this.t15.mirror = true;
    setRotation(this.t15, 0.0174533F, 0.0F, 0.0F);
    this.t14 = new ModelRenderer(this, 0, 40);
    this.t14.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t14.setRotationPoint(-3.0F, -38.0F, -1.0F);
    this.t14.setTextureSize(532, 715);
    this.t14.mirror = true;
    setRotation(this.t14, 0.0F, 0.0349066F, -0.2443461F);
    this.t13 = new ModelRenderer(this, 0, 40);
    this.t13.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t13.setRotationPoint(-5.5F, -36.8F, -1.0F);
    this.t13.setTextureSize(532, 715);
    this.t13.mirror = true;
    setRotation(this.t13, 0.0F, -0.1047198F, -0.3141593F);
    this.t12 = new ModelRenderer(this, 0, 40);
    this.t12.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t12.setRotationPoint(-7.5F, -36.0F, -1.0F);
    this.t12.setTextureSize(532, 715);
    this.t12.mirror = true;
    setRotation(this.t12, 0.0F, -0.1396263F, -0.3665191F);
    this.t11 = new ModelRenderer(this, 0, 40);
    this.t11.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t11.setRotationPoint(-10.0F, -35.5F, -1.5F);
    this.t11.setTextureSize(532, 715);
    this.t11.mirror = true;
    setRotation(this.t11, 0.0F, 0.0698132F, -0.2443461F);
    this.t10 = new ModelRenderer(this, 0, 40);
    this.t10.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t10.setRotationPoint(-12.5F, -35.5F, -1.0F);
    this.t10.setTextureSize(532, 715);
    this.t10.mirror = true;
    setRotation(this.t10, -0.0174533F, -0.0174533F, -0.0174533F);
    this.t9 = new ModelRenderer(this, 0, 40);
    this.t9.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t9.setRotationPoint(-14.5F, -35.5F, -1.0F);
    this.t9.setTextureSize(532, 715);
    this.t9.mirror = true;
    setRotation(this.t9, -0.0174533F, -0.0174533F, -0.0174533F);
    this.t6 = new ModelRenderer(this, 0, 40);
    this.t6.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t6.setRotationPoint(-29.5F, -35.5F, -1.0F);
    this.t6.setTextureSize(532, 715);
    this.t6.mirror = true;
    setRotation(this.t6, -0.0174533F, -0.1396263F, 0.0872665F);
    this.t2 = new ModelRenderer(this, 0, 50);
    this.t2.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t2.setRotationPoint(-46.5F, -32.0F, -1.5F);
    this.t2.setTextureSize(532, 715);
    this.t2.mirror = true;
    setRotation(this.t2, 0.0523599F, 0.2792527F, -0.4363323F);
    this.t8 = new ModelRenderer(this, 0, 40);
    this.t8.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t8.setRotationPoint(-19.5F, -35.5F, -1.0F);
    this.t8.setTextureSize(532, 715);
    this.t8.mirror = true;
    setRotation(this.t8, -0.0174533F, -0.0349066F, 0.1745329F);
    this.t7 = new ModelRenderer(this, 0, 40);
    this.t7.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t7.setRotationPoint(-24.5F, -36.0F, -1.0F);
    this.t7.setTextureSize(532, 715);
    this.t7.mirror = true;
    setRotation(this.t7, -0.0174533F, 0.2268928F, -0.0523599F);
    this.t5 = new ModelRenderer(this, 0, 40);
    this.t5.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t5.setRotationPoint(-34.5F, -36.0F, -1.0F);
    this.t5.setTextureSize(532, 715);
    this.t5.mirror = true;
    setRotation(this.t5, -0.0174533F, 0.1396263F, -0.296706F);
    this.t4 = new ModelRenderer(this, 0, 40);
    this.t4.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1);
    this.t4.setRotationPoint(-39.5F, -34.0F, -1.0F);
    this.t4.setTextureSize(532, 715);
    this.t4.mirror = true;
    setRotation(this.t4, -0.0174533F, 0.3839724F, -0.2094395F);
    this.t3 = new ModelRenderer(this, 0, 40);
    this.t3.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t3.setRotationPoint(-44.5F, -33.0F, -1.0F);
    this.t3.setTextureSize(532, 715);
    this.t3.mirror = true;
    setRotation(this.t3, 0.1396263F, 0.122173F, -0.3839724F);
    this.t1 = new ModelRenderer(this, 0, 50);
    this.t1.addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1);
    this.t1.setRotationPoint(-46.5F, -32.0F, -0.5F);
    this.t1.setTextureSize(532, 715);
    this.t1.mirror = true;
    setRotation(this.t1, 0.1396263F, -0.2792527F, -0.4537856F);
    this.r47 = new ModelRenderer(this, 111, 0);
    this.r47.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r47.setRotationPoint(-12.0F, 22.0F, -0.4F);
    this.r47.setTextureSize(532, 715);
    this.r47.mirror = true;
    setRotation(this.r47, 0.0F, -0.0872665F, -0.2094395F);
    this.r2 = new ModelRenderer(this, 0, 0);
    this.r2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r2.setRotationPoint(-11.0F, 22.0F, -11.0F);
    this.r2.setTextureSize(532, 715);
    this.r2.mirror = true;
    setRotation(this.r2, 0.418879F, 0.7330383F, 0.3817004F);
    this.r6 = new ModelRenderer(this, 111, 0);
    this.r6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r6.setRotationPoint(-17.0F, 24.5F, -6.5F);
    this.r6.setTextureSize(532, 715);
    this.r6.mirror = true;
    setRotation(this.r6, 0.7330383F, 1.797689F, 0.7831261F);
    this.r5 = new ModelRenderer(this, 111, 0);
    this.r5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6);
    this.r5.setRotationPoint(-16.0F, 22.0F, -11.0F);
    this.r5.setTextureSize(532, 715);
    this.r5.mirror = true;
    setRotation(this.r5, 0.5061455F, 1.151917F, 1.463804F);
    this.r10 = new ModelRenderer(this, 111, 0);
    this.r10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r10.setRotationPoint(-18.0F, 24.0F, -13.5F);
    this.r10.setTextureSize(532, 715);
    this.r10.mirror = true;
    setRotation(this.r10, 0.5992297F, 1.27409F, 0.5759587F);
    this.r7 = new ModelRenderer(this, 111, 0);
    this.r7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r7.setRotationPoint(-20.0F, 24.5F, -10.5F);
    this.r7.setTextureSize(532, 715);
    this.r7.mirror = true;
    setRotation(this.r7, 0.5061455F, 1.186824F, 0.416607F);
    this.r12 = new ModelRenderer(this, 111, 0);
    this.r12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r12.setRotationPoint(-14.0F, 24.0F, -18.5F);
    this.r12.setTextureSize(532, 715);
    this.r12.mirror = true;
    setRotation(this.r12, 0.3665191F, 0.2268928F, -0.0349066F);
    this.r8 = new ModelRenderer(this, 111, 0);
    this.r8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r8.setRotationPoint(-22.0F, 25.0F, -14.5F);
    this.r8.setTextureSize(532, 715);
    this.r8.mirror = true;
    setRotation(this.r8, 0.1396263F, 0.418879F, 0.0F);
    this.r11 = new ModelRenderer(this, 111, 0);
    this.r11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.r11.setRotationPoint(-18.0F, 24.0F, -19.5F);
    this.r11.setTextureSize(532, 715);
    this.r11.mirror = true;
    setRotation(this.r11, 0.3665191F, 0.4712389F, -0.0349066F);
    this.r4 = new ModelRenderer(this, 111, 0);
    this.r4.addBox(0.0F, 0.0F, -3.0F, 1, 1, 5);
    this.r4.setRotationPoint(-7.5F, 21.5F, -15.0F);
    this.r4.setTextureSize(532, 715);
    this.r4.mirror = true;
    setRotation(this.r4, 0.0F, -0.0174533F, -0.3665191F);
    this.r40 = new ModelRenderer(this, 111, 0);
    this.r40.addBox(0.0F, 0.0F, 1.0F, 1, 1, 5);
    this.r40.setRotationPoint(-13.0F, 21.0F, 14.6F);
    this.r40.setTextureSize(532, 715);
    this.r40.mirror = true;
    setRotation(this.r40, -0.0349066F, 2.530727F, 0.2268928F);
    this.r45 = new ModelRenderer(this, 111, 0);
    this.r45.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6);
    this.r45.setRotationPoint(-14.0F, 21.5F, -2.9F);
    this.r45.setTextureSize(532, 715);
    this.r45.mirror = true;
    setRotation(this.r45, -0.2443461F, -2.061864F, 0.122173F);
    this.r49 = new ModelRenderer(this, 111, 0);
    this.r49.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r49.setRotationPoint(-12.0F, 22.0F, 4.6F);
    this.r49.setTextureSize(532, 715);
    this.r49.mirror = true;
    setRotation(this.r49, 0.1919862F, 1.518436F, 0.1919862F);
    this.r44 = new ModelRenderer(this, 111, 0);
    this.r44.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r44.setRotationPoint(-16.0F, 22.0F, 6.6F);
    this.r44.setTextureSize(532, 715);
    this.r44.mirror = true;
    setRotation(this.r44, -0.0174533F, 2.007129F, 0.1396263F);
    this.root43 = new ModelRenderer(this, 111, 0);
    this.root43.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.root43.setRotationPoint(-16.0F, 22.0F, 6.6F);
    this.root43.setTextureSize(532, 715);
    this.root43.mirror = true;
    setRotation(this.root43, -0.0174533F, 2.007129F, 0.1396263F);
    this.r43 = new ModelRenderer(this, 111, 0);
    this.r43.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6);
    this.r43.setRotationPoint(-22.0F, 22.5F, 8.1F);
    this.r43.setTextureSize(532, 715);
    this.r43.mirror = true;
    setRotation(this.r43, -0.0174533F, 1.902409F, 0.1396263F);
    this.r46 = new ModelRenderer(this, 111, 0);
    this.r46.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6);
    this.r46.setRotationPoint(-11.0F, 22.5F, 0.1F);
    this.r46.setTextureSize(532, 715);
    this.r46.mirror = true;
    setRotation(this.r46, 0.0872665F, -2.323663F, -0.0698132F);
    this.r48 = new ModelRenderer(this, 111, 0);
    this.r48.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6);
    this.r48.setRotationPoint(-11.0F, 22.5F, 3.1F);
    this.r48.setTextureSize(532, 715);
    this.r48.mirror = true;
    setRotation(this.r48, -0.296706F, -2.131677F, 0.1919862F);
    this.r35 = new ModelRenderer(this, 111, 0);
    this.r35.addBox(0.0F, 0.0F, -0.5F, 1, 1, 4);
    this.r35.setRotationPoint(2.0F, 21.5F, 12.6F);
    this.r35.setTextureSize(532, 715);
    this.r35.mirror = true;
    setRotation(this.r35, -0.2435199F, 1.963237F, -0.1776311F);
    this.r38 = new ModelRenderer(this, 111, 0);
    this.r38.addBox(0.0F, 0.0F, -1.0F, 1, 1, 5);
    this.r38.setRotationPoint(-3.0F, 21.5F, 10.6F);
    this.r38.setTextureSize(532, 715);
    this.r38.mirror = true;
    setRotation(this.r38, -0.3665191F, 1.064651F, 0.2443461F);
    this.r42 = new ModelRenderer(this, 111, 0);
    this.r42.addBox(0.0F, 0.0F, 1.0F, 2, 2, 5);
    this.r42.setRotationPoint(-8.0F, 21.0F, 8.6F);
    this.r42.setTextureSize(532, 715);
    this.r42.mirror = true;
    setRotation(this.r42, 0.0F, 2.199115F, 0.1745329F);
    this.r39 = new ModelRenderer(this, 111, 0);
    this.r39.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r39.setRotationPoint(-8.0F, 21.0F, 8.6F);
    this.r39.setTextureSize(532, 715);
    this.r39.mirror = true;
    setRotation(this.r39, 0.0F, 1.117011F, 0.1570796F);
    this.r41 = new ModelRenderer(this, 111, 0);
    this.r41.addBox(0.0F, 0.0F, 1.0F, 2, 2, 5);
    this.r41.setRotationPoint(-11.0F, 21.0F, 11.6F);
    this.r41.setTextureSize(532, 715);
    this.r41.mirror = true;
    setRotation(this.r41, 0.0F, 2.338741F, 0.1745329F);
    this.r18 = new ModelRenderer(this, 111, 0);
    this.r18.addBox(0.0F, 0.0F, -5.0F, 1, 1, 6);
    this.r18.setRotationPoint(1.0F, 22.0F, -16.0F);
    this.r18.setTextureSize(532, 715);
    this.r18.mirror = true;
    setRotation(this.r18, 0.5304149F, -0.3531968F, -0.4848711F);
    this.r3 = new ModelRenderer(this, 111, 0);
    this.r3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r3.setRotationPoint(-8.0F, 21.0F, -14.0F);
    this.r3.setTextureSize(532, 715);
    this.r3.mirror = true;
    setRotation(this.r3, 0.0F, -0.1396263F, 0.0F);
    this.r50 = new ModelRenderer(this, 111, 0);
    this.r50.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r50.setRotationPoint(-8.0F, 21.0F, 4.6F);
    this.r50.setTextureSize(532, 715);
    this.r50.mirror = true;
    setRotation(this.r50, 0.0F, 1.500983F, 0.1745329F);
    this.r31 = new ModelRenderer(this, 111, 0);
    this.r31.addBox(2.0F, -2.0F, 0.0F, 1, 1, 4);
    this.r31.setRotationPoint(5.5F, 21.5F, 8.0F);
    this.r31.setTextureSize(532, 715);
    this.r31.mirror = true;
    setRotation(this.r31, 0.2230717F, 1.580091F, 0.6404016F);
    this.r36 = new ModelRenderer(this, 111, 0);
    this.r36.addBox(0.0F, 0.0F, -4.0F, 1, 1, 5);
    this.r36.setRotationPoint(2.0F, 21.5F, 8.6F);
    this.r36.setTextureSize(532, 715);
    this.r36.mirror = true;
    setRotation(this.r36, 0.3141593F, -2.064859F, -0.418879F);
    this.r37 = new ModelRenderer(this, 111, 0);
    this.r37.addBox(0.0F, 0.0F, -4.0F, 2, 2, 5);
    this.r37.setRotationPoint(0.0F, 21.0F, 4.6F);
    this.r37.setTextureSize(532, 715);
    this.r37.mirror = true;
    setRotation(this.r37, 0.0F, -2.658271F, 0.1570796F);
    this.r22 = new ModelRenderer(this, 111, 0);
    this.r22.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
    this.r22.setRotationPoint(9.0F, 21.0F, -5.0F);
    this.r22.setTextureSize(532, 715);
    this.r22.mirror = true;
    setRotation(this.r22, 0.1115358F, 2.189201F, 0.0F);
    this.r30 = new ModelRenderer(this, 111, 0);
    this.r30.addBox(0.0F, 0.0F, -4.0F, 1, 1, 5);
    this.r30.setRotationPoint(9.5F, 20.5F, 5.0F);
    this.r30.setTextureSize(532, 715);
    this.r30.mirror = true;
    setRotation(this.r30, 0.669215F, -2.212127F, 0.5288657F);
    this.r33 = new ModelRenderer(this, 111, 0);
    this.r33.addBox(0.0F, 0.0F, -4.0F, 1, 1, 5);
    this.r33.setRotationPoint(6.5F, 21.5F, 8.0F);
    this.r33.setTextureSize(532, 715);
    this.r33.mirror = true;
    setRotation(this.r33, 0.2230717F, 3.141593F, 0.6404016F);
    this.r34 = new ModelRenderer(this, 111, 0);
    this.r34.addBox(0.0F, 0.0F, -4.0F, 2, 2, 6);
    this.r34.setRotationPoint(5.0F, 21.0F, 4.6F);
    this.r34.setTextureSize(532, 715);
    this.r34.mirror = true;
    setRotation(this.r34, 0.0F, -2.658271F, 0.1570796F);
    this.r29 = new ModelRenderer(this, 111, 0);
    this.r29.addBox(0.0F, 0.0F, -4.0F, 5, 2, 2);
    this.r29.setRotationPoint(5.0F, 21.0F, 2.6F);
    this.r29.setTextureSize(532, 715);
    this.r29.mirror = true;
    setRotation(this.r29, 0.0F, 0.3665191F, 0.0F);
    this.r20 = new ModelRenderer(this, 111, 0);
    this.r20.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.r20.setRotationPoint(6.0F, 21.5F, -10.5F);
    this.r20.setTextureSize(532, 715);
    this.r20.mirror = true;
    setRotation(this.r20, 2.509556F, -0.2788396F, 2.658271F);
    this.r24 = new ModelRenderer(this, 111, 0);
    this.r24.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
    this.r24.setRotationPoint(6.0F, 21.0F, -2.0F);
    this.r24.setTextureSize(532, 715);
    this.r24.mirror = true;
    setRotation(this.r24, 0.1115358F, 1.07219F, 0.0F);
    this.r28 = new ModelRenderer(this, 111, 0);
    this.r28.addBox(0.0F, 0.0F, -4.0F, 5, 2, 2);
    this.r28.setRotationPoint(9.0F, 21.0F, 1.0F);
    this.r28.setTextureSize(532, 715);
    this.r28.mirror = true;
    setRotation(this.r28, 0.0F, 0.1055459F, 0.0F);
    this.r26 = new ModelRenderer(this, 111, 0);
    this.r26.addBox(0.0F, 0.0F, -4.0F, 4, 1, 1);
    this.r26.setRotationPoint(12.0F, 21.5F, 0.5F);
    this.r26.setTextureSize(532, 715);
    this.r26.mirror = true;
    setRotation(this.r26, 0.0174533F, -0.4521332F, 0.4363323F);
    this.r25 = new ModelRenderer(this, 111, 0);
    this.r25.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.r25.setRotationPoint(15.0F, 23.0F, -1.5F);
    this.r25.setTextureSize(532, 715);
    this.r25.mirror = true;
    setRotation(this.r25, -0.0371786F, 0.3194262F, -0.1532585F);
    this.r27 = new ModelRenderer(this, 111, 0);
    this.r27.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.r27.setRotationPoint(11.0F, 22.5F, -2.5F);
    this.r27.setTextureSize(532, 715);
    this.r27.mirror = true;
    setRotation(this.r27, 0.3346075F, -1.019004F, 0.2557062F);
    this.r23 = new ModelRenderer(this, 111, 0);
    this.r23.addBox(-1.0F, 0.0F, -1.0F, 5, 1, 1);
    this.r23.setRotationPoint(11.0F, 21.5F, -6.5F);
    this.r23.setTextureSize(532, 715);
    this.r23.mirror = true;
    setRotation(this.r23, 0.3346075F, 0.2078904F, 0.5903137F);
    this.r21 = new ModelRenderer(this, 111, 0);
    this.r21.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.r21.setRotationPoint(6.0F, 21.5F, -10.5F);
    this.r21.setTextureSize(532, 715);
    this.r21.mirror = true;
    setRotation(this.r21, -3.141593F, -1.691627F, 2.658271F);
    this.r1 = new ModelRenderer(this, 111, 0);
    this.r1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.r1.setRotationPoint(-8.0F, 21.0F, -8.0F);
    this.r1.setTextureSize(532, 715);
    this.r1.mirror = true;
    setRotation(this.r1, 0.418879F, 0.6108652F, -0.2617994F);
    this.r13 = new ModelRenderer(this, 111, 0);
    this.r13.addBox(0.0F, 0.0F, -5.0F, 2, 2, 5);
    this.r13.setRotationPoint(-1.0F, 20.0F, -6.0F);
    this.r13.setTextureSize(532, 715);
    this.r13.mirror = true;
    setRotation(this.r13, 0.418879F, 0.6108652F, -0.2617994F);
    this.r16 = new ModelRenderer(this, 111, 0);
    this.r16.addBox(0.0F, 0.0F, -5.0F, 2, 2, 5);
    this.r16.setRotationPoint(-2.0F, 20.0F, -12.0F);
    this.r16.setTextureSize(532, 715);
    this.r16.mirror = true;
    setRotation(this.r16, 0.418879F, -0.4673145F, -0.2617994F);
    this.r19 = new ModelRenderer(this, 111, 0);
    this.r19.addBox(0.0F, 0.0F, -7.0F, 1, 1, 7);
    this.r19.setRotationPoint(-2.0F, 20.0F, -12.0F);
    this.r19.setTextureSize(532, 715);
    this.r19.mirror = true;
    setRotation(this.r19, 0.5304149F, -1.508316F, -0.2617994F);
    this.r15 = new ModelRenderer(this, 111, 0);
    this.r15.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5);
    this.r15.setRotationPoint(-2.0F, 20.0F, -12.0F);
    this.r15.setTextureSize(532, 715);
    this.r15.mirror = true;
    setRotation(this.r15, 0.5304149F, 0.6108652F, -0.2617994F);
    this.r14 = new ModelRenderer(this, 111, 0);
    this.r14.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5);
    this.r14.setRotationPoint(-2.0F, 20.0F, -12.0F);
    this.r14.setTextureSize(532, 715);
    this.r14.mirror = true;
    setRotation(this.r14, 0.5304149F, 3.141593F, -0.2617994F);
    this.r17 = new ModelRenderer(this, 111, 0);
    this.r17.addBox(0.0F, 0.0F, -5.0F, 1, 1, 5);
    this.r17.setRotationPoint(1.0F, 22.0F, -16.0F);
    this.r17.setTextureSize(532, 715);
    this.r17.mirror = true;
    setRotation(this.r17, 0.5304149F, 0.8365188F, -0.4848711F);
    this.r32 = new ModelRenderer(this, 111, 0);
    this.r32.addBox(0.0F, 0.0F, -4.0F, 1, 1, 5);
    this.r32.setRotationPoint(6.5F, 21.5F, 8.0F);
    this.r32.setTextureSize(532, 715);
    this.r32.mirror = true;
    setRotation(this.r32, 0.669215F, -2.212127F, 0.5288657F);
    this.l16 = new ModelRenderer(this, 40, 0);
    this.l16.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5);
    this.l16.setRotationPoint(-2.0F, 10.0F, -9.0F);
    this.l16.setTextureSize(532, 715);
    this.l16.mirror = true;
    setRotation(this.l16, -0.5585054F, 0.0F, 0.0F);
    this.l44 = new ModelRenderer(this, 40, 0);
    this.l44.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5);
    this.l44.setRotationPoint(-2.5F, 9.0F, 4.5F);
    this.l44.setTextureSize(532, 715);
    this.l44.mirror = true;
    setRotation(this.l44, 0.6457718F, 0.0F, 0.0F);
    this.root = new ModelRenderer(this, 111, 0);
    this.root.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.root.setRotationPoint(-11.0F, 22.0F, -11.0F);
    this.root.setTextureSize(532, 715);
    this.root.mirror = true;
    setRotation(this.root, 0.418879F, 0.7330383F, 0.3817004F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Triffid e = (Triffid)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    float delta = 0.0F;
    if (e.getOpenClosed() == 0) {
      newangle = 0.122522116F;
    } else {
      newangle = MathHelper.cos(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.039F;
    } 
    this.l1.rotateAngleZ = -0.95F + newangle;
    this.l1.rotationPointY = (float)(10.0D - Math.cos(this.l1.rotateAngleZ) * 5.0D) + 3.0F;
    this.l1.rotationPointX = (float)(-7.0D + Math.sin(this.l1.rotateAngleZ) * 5.0D) + 3.0F;
    leafpartA(newangle, this.l1, this.l2, 3);
    leafpartA(newangle, this.l2, this.l3, 4);
    leafpartA(newangle, this.l3, this.leaf3, 4);
    leafpartA(newangle, this.leaf3, this.l4, 4);
    leafpartA(newangle, this.l4, this.l5, 4);
    leafpartA(newangle, this.l5, this.l6, 6);
    leafpartA(newangle, this.l6, this.l7, 4);
    leafpartA(newangle, this.l7, this.l8, 4);
    leafpartA(newangle, this.l8, this.l9, 4);
    leafpartA(newangle, this.l9, this.l10, 4);
    leafpartA(newangle, this.l10, this.l11, 3);
    leafpartA(newangle, this.l11, this.l12, 3);
    leafpartA(newangle, this.l12, this.l13, 2);
    leafpartA(newangle, this.l13, this.l14, 2);
    leafpartA(newangle, this.l14, this.l15, 2);
    this.l31.rotateAngleZ = 0.95F - newangle;
    this.l31.rotationPointY = (float)(10.0D - Math.cos(this.l31.rotateAngleZ) * 5.0D) + 3.0F;
    this.l31.rotationPointX = (float)(7.0D + Math.sin(this.l31.rotateAngleZ) * 5.0D) - 3.0F;
    leafpartC(-newangle, this.l31, this.l32, 3);
    leafpartC(-newangle, this.l32, this.leaf32, 3);
    leafpartC(-newangle, this.leaf32, this.l33, 3);
    leafpartC(-newangle, this.l33, this.l34, 4);
    leafpartC(-newangle, this.l34, this.l35, 4);
    leafpartC(-newangle, this.l35, this.l36, 5);
    leafpartC(-newangle, this.l36, this.l37, 4);
    leafpartC(-newangle, this.l37, this.l38, 4);
    leafpartC(-newangle, this.l38, this.l39, 4);
    leafpartC(-newangle, this.l39, this.l40, 3);
    leafpartC(-newangle, this.l40, this.l41, 3);
    leafpartC(-newangle, this.l41, this.l42, 2);
    leafpartC(-newangle, this.l42, this.l43, 1);
    this.l16.rotateAngleX = -0.75F - newangle;
    this.l16.rotationPointY = (float)(10.0D + Math.cos(this.l16.rotateAngleX) * 5.0D);
    this.l16.rotationPointZ = (float)(-9.0D - Math.sin(this.l16.rotateAngleX) * 5.0D) - 3.0F;
    leafpartB(-newangle, this.l16, this.l17, 3);
    leafpartB(-newangle, this.l17, this.l18, 3);
    leafpartB(-newangle, this.l18, this.l19, 4);
    leafpartB(-newangle, this.l19, this.l20, 4);
    leafpartB(-newangle, this.l20, this.l21, 5);
    leafpartB(-newangle, this.l21, this.l22, 4);
    leafpartB(-newangle, this.l22, this.l23, 4);
    leafpartB(-newangle, this.l23, this.l24, 4);
    leafpartB(-newangle, this.l24, this.l25, 4);
    leafpartB(-newangle, this.l25, this.l26, 4);
    leafpartB(-newangle, this.l26, this.l27, 3);
    leafpartB(-newangle, this.l27, this.l28, 2);
    leafpartB(-newangle, this.l28, this.l29, 2);
    leafpartB(-newangle, this.l29, this.l30, 2);
    this.l44.rotateAngleX = 0.75F + newangle;
    leafpartD(newangle, this.l44, this.l45, 5);
    leafpartD(newangle, this.l45, this.l46, 4);
    leafpartD(newangle, this.l46, this.l47, 3);
    leafpartD(newangle, this.l47, this.l48, 4);
    leafpartD(newangle, this.l48, this.l49, 3);
    leafpartD(newangle, this.l49, this.leaf49, 5);
    leafpartD(newangle, this.leaf49, this.l50, 3);
    leafpartD(newangle, this.l50, this.l51, 3);
    leafpartD(newangle, this.l51, this.l52, 3);
    leafpartD(newangle, this.l52, this.l53, 3);
    leafpartD(newangle, this.l53, this.l54, 3);
    leafpartD(newangle, this.l54, this.l55, 2);
    leafpartD(newangle, this.l55, this.l56, 2);
    leafpartD(newangle, this.l56, this.l57, 2);
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 0.25F * this.wingspeed) * 3.1415927F * 0.5F;
      newangle = Math.abs(newangle);
    } else {
      newangle = 1.5707964F;
    } 
    delta = -0.6F;
    this.t15.rotateAngleZ = -newangle + delta;
    this.t14.rotateAngleZ = newangle + delta;
    this.t14.rotationPointY = (float)(this.t15.rotationPointY - Math.sin(this.t15.rotateAngleZ) * 6.0D);
    this.t14.rotationPointX = (float)(this.t15.rotationPointX - Math.cos(this.t15.rotateAngleZ) * 6.0D);
    this.t13.rotateAngleZ = -newangle + delta;
    this.t13.rotationPointY = (float)(this.t14.rotationPointY - Math.sin(this.t14.rotateAngleZ) * 3.0D);
    this.t13.rotationPointX = (float)(this.t14.rotationPointX - Math.cos(this.t14.rotateAngleZ) * 3.0D);
    this.t12.rotateAngleZ = newangle + delta;
    this.t12.rotationPointY = (float)(this.t13.rotationPointY - Math.sin(this.t13.rotateAngleZ) * 3.0D);
    this.t12.rotationPointX = (float)(this.t13.rotationPointX - Math.cos(this.t13.rotateAngleZ) * 3.0D);
    this.t11.rotateAngleZ = -newangle + delta;
    this.t11.rotationPointY = (float)(this.t12.rotationPointY - Math.sin(this.t12.rotateAngleZ) * 3.0D);
    this.t11.rotationPointX = (float)(this.t12.rotationPointX - Math.cos(this.t12.rotateAngleZ) * 3.0D);
    this.t10.rotateAngleZ = newangle + delta;
    this.t10.rotationPointY = (float)(this.t11.rotationPointY - Math.sin(this.t11.rotateAngleZ) * 3.0D);
    this.t10.rotationPointX = (float)(this.t11.rotationPointX - Math.cos(this.t11.rotateAngleZ) * 3.0D);
    this.t9.rotateAngleZ = -newangle + delta;
    this.t9.rotationPointY = (float)(this.t10.rotationPointY - Math.sin(this.t10.rotateAngleZ) * 3.0D);
    this.t9.rotationPointX = (float)(this.t10.rotationPointX - Math.cos(this.t10.rotateAngleZ) * 3.0D);
    this.t8.rotateAngleZ = newangle + delta;
    this.t8.rotationPointY = (float)(this.t9.rotationPointY - Math.sin(this.t9.rotateAngleZ) * 6.0D);
    this.t8.rotationPointX = (float)(this.t9.rotationPointX - Math.cos(this.t9.rotateAngleZ) * 6.0D);
    this.t7.rotateAngleZ = -newangle + delta;
    this.t7.rotationPointY = (float)(this.t8.rotationPointY - Math.sin(this.t8.rotateAngleZ) * 6.0D);
    this.t7.rotationPointX = (float)(this.t8.rotationPointX - Math.cos(this.t8.rotateAngleZ) * 6.0D);
    this.t6.rotateAngleZ = newangle + delta;
    this.t6.rotationPointY = (float)(this.t7.rotationPointY - Math.sin(this.t7.rotateAngleZ) * 6.0D);
    this.t6.rotationPointX = (float)(this.t7.rotationPointX - Math.cos(this.t7.rotateAngleZ) * 6.0D);
    this.t5.rotateAngleZ = -newangle + delta;
    this.t5.rotationPointY = (float)(this.t6.rotationPointY - Math.sin(this.t6.rotateAngleZ) * 6.0D);
    this.t5.rotationPointX = (float)(this.t6.rotationPointX - Math.cos(this.t6.rotateAngleZ) * 6.0D);
    this.t4.rotateAngleZ = newangle + delta;
    this.t4.rotationPointY = (float)(this.t5.rotationPointY - Math.sin(this.t5.rotateAngleZ) * 6.0D);
    this.t4.rotationPointX = (float)(this.t5.rotationPointX - Math.cos(this.t5.rotateAngleZ) * 6.0D);
    this.t3.rotateAngleZ = -newangle + delta;
    this.t3.rotationPointY = (float)(this.t4.rotationPointY - Math.sin(this.t4.rotateAngleZ) * 6.0D);
    this.t3.rotationPointX = (float)(this.t4.rotationPointX - Math.cos(this.t4.rotateAngleZ) * 6.0D);
    this.t1.rotationPointY = (float)(this.t3.rotationPointY - Math.sin(this.t3.rotateAngleZ) * 3.0D);
    this.t1.rotationPointX = (float)(this.t3.rotationPointX - Math.cos(this.t3.rotateAngleZ) * 3.0D);
    newangle = 0.0F;
    this.t3.rotateAngleY = newangle;
    this.t4.rotateAngleY = newangle;
    this.t5.rotateAngleY = newangle;
    this.t6.rotateAngleY = newangle;
    this.t7.rotateAngleY = newangle;
    this.t8.rotateAngleY = newangle;
    this.t9.rotateAngleY = newangle;
    this.t10.rotateAngleY = newangle;
    this.t11.rotateAngleY = newangle;
    this.t12.rotateAngleY = newangle;
    this.t13.rotateAngleY = newangle;
    this.t14.rotateAngleY = newangle;
    this.t15.rotateAngleY = newangle;
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    this.r9.render(f5);
    this.b14.render(f5);
    this.base.render(f5);
    this.b3.render(f5);
    this.l57.render(f5);
    this.l30.render(f5);
    this.b6.render(f5);
    this.b7.render(f5);
    this.b8.render(f5);
    this.b9.render(f5);
    this.b11.render(f5);
    this.b16.render(f5);
    this.h18.render(f5);
    this.b13.render(f5);
    this.b15.render(f5);
    this.h8.render(f5);
    this.h1.render(f5);
    this.h13.render(f5);
    this.h7.render(f5);
    this.h3.render(f5);
    this.h17.render(f5);
    this.h16.render(f5);
    this.h23.render(f5);
    this.h4.render(f5);
    this.h2.render(f5);
    this.h21.render(f5);
    this.h19.render(f5);
    this.h20.render(f5);
    this.b10.render(f5);
    this.b17.render(f5);
    this.h6.render(f5);
    this.h11.render(f5);
    this.h14.render(f5);
    this.h15.render(f5);
    this.h10.render(f5);
    this.h9.render(f5);
    this.h5.render(f5);
    this.h12.render(f5);
    this.c2.render(f5);
    this.c11.render(f5);
    this.c1.render(f5);
    this.c5.render(f5);
    this.c3.render(f5);
    this.c4.render(f5);
    this.c10.render(f5);
    this.c6.render(f5);
    this.c7.render(f5);
    this.c8.render(f5);
    this.c9.render(f5);
    this.b1.render(f5);
    this.l15.render(f5);
    this.b2.render(f5);
    this.l43.render(f5);
    this.l1.render(f5);
    this.l2.render(f5);
    this.l3.render(f5);
    this.leaf3.render(f5);
    this.l4.render(f5);
    this.l5.render(f5);
    this.l6.render(f5);
    this.l7.render(f5);
    this.l8.render(f5);
    this.l9.render(f5);
    this.l10.render(f5);
    this.l11.render(f5);
    this.l12.render(f5);
    this.l13.render(f5);
    this.l14.render(f5);
    this.b4.render(f5);
    this.l31.render(f5);
    this.l32.render(f5);
    this.leaf32.render(f5);
    this.l33.render(f5);
    this.l34.render(f5);
    this.l35.render(f5);
    this.l36.render(f5);
    this.l37.render(f5);
    this.l38.render(f5);
    this.l39.render(f5);
    this.l40.render(f5);
    this.l41.render(f5);
    this.l42.render(f5);
    this.l17.render(f5);
    this.l18.render(f5);
    this.l19.render(f5);
    this.l20.render(f5);
    this.l21.render(f5);
    this.l22.render(f5);
    this.l23.render(f5);
    this.l24.render(f5);
    this.l25.render(f5);
    this.l26.render(f5);
    this.l27.render(f5);
    this.l28.render(f5);
    this.l29.render(f5);
    this.b5.render(f5);
    this.l45.render(f5);
    this.l46.render(f5);
    this.l47.render(f5);
    this.l48.render(f5);
    this.l49.render(f5);
    this.leaf49.render(f5);
    this.l50.render(f5);
    this.l51.render(f5);
    this.l52.render(f5);
    this.l53.render(f5);
    this.l54.render(f5);
    this.l55.render(f5);
    this.l56.render(f5);
    this.h22.render(f5);
    this.t15.render(f5);
    this.t14.render(f5);
    this.t13.render(f5);
    this.t12.render(f5);
    this.t11.render(f5);
    this.t10.render(f5);
    this.t9.render(f5);
    this.t6.render(f5);
    this.t2.render(f5);
    this.t8.render(f5);
    this.t7.render(f5);
    this.t5.render(f5);
    this.t4.render(f5);
    this.t3.render(f5);
    this.t1.render(f5);
    this.r47.render(f5);
    this.r2.render(f5);
    this.r6.render(f5);
    this.r5.render(f5);
    this.r10.render(f5);
    this.r7.render(f5);
    this.r12.render(f5);
    this.r8.render(f5);
    this.r11.render(f5);
    this.r4.render(f5);
    this.r40.render(f5);
    this.r45.render(f5);
    this.r49.render(f5);
    this.r44.render(f5);
    this.root43.render(f5);
    this.r43.render(f5);
    this.r46.render(f5);
    this.r48.render(f5);
    this.r35.render(f5);
    this.r38.render(f5);
    this.r42.render(f5);
    this.r39.render(f5);
    this.r41.render(f5);
    this.r18.render(f5);
    this.r3.render(f5);
    this.r50.render(f5);
    this.r31.render(f5);
    this.r36.render(f5);
    this.r37.render(f5);
    this.r22.render(f5);
    this.r30.render(f5);
    this.r33.render(f5);
    this.r34.render(f5);
    this.r29.render(f5);
    this.r20.render(f5);
    this.r24.render(f5);
    this.r28.render(f5);
    this.r26.render(f5);
    this.r25.render(f5);
    this.r27.render(f5);
    this.r23.render(f5);
    this.r21.render(f5);
    this.r1.render(f5);
    this.r13.render(f5);
    this.r16.render(f5);
    this.r19.render(f5);
    this.r15.render(f5);
    this.r14.render(f5);
    this.r17.render(f5);
    this.r32.render(f5);
    this.l16.render(f5);
    this.l44.render(f5);
    this.root.render(f5);
    GL11.glPopMatrix();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  
  private void leafpartA(float newangle, ModelRenderer l1, ModelRenderer l2, int j) {
    l1.rotateAngleZ += newangle;
    l2.rotationPointY = (float)(l1.rotationPointY - Math.cos(l1.rotateAngleZ) * j);
    l2.rotationPointX = (float)(l1.rotationPointX + Math.sin(l1.rotateAngleZ) * j);
  }
  
  private void leafpartC(float newangle, ModelRenderer l1, ModelRenderer l2, int j) {
    l1.rotateAngleZ += newangle;
    l2.rotationPointY = (float)(l1.rotationPointY - Math.cos(l1.rotateAngleZ) * j);
    l2.rotationPointX = (float)(l1.rotationPointX + Math.sin(l1.rotateAngleZ) * j);
  }
  
  private void leafpartB(float newangle, ModelRenderer l1, ModelRenderer l2, int j) {
    l1.rotateAngleX += newangle;
    l2.rotationPointY = (float)(l1.rotationPointY + Math.sin(l1.rotateAngleX) * j);
    l2.rotationPointZ = (float)(l1.rotationPointZ - Math.cos(l1.rotateAngleX) * j);
  }
  
  private void leafpartD(float newangle, ModelRenderer l1, ModelRenderer l2, int j) {
    l1.rotateAngleX += newangle;
    l2.rotationPointY = (float)(l1.rotationPointY - Math.sin(l1.rotateAngleX) * j);
    l2.rotationPointZ = (float)(l1.rotationPointZ + Math.cos(l1.rotateAngleX) * j);
  }
}
