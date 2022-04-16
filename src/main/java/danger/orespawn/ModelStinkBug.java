package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelStinkBug extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer f6;
  
  ModelRenderer b10;
  
  ModelRenderer l6;
  
  ModelRenderer l4;
  
  ModelRenderer f4;
  
  ModelRenderer l5;
  
  ModelRenderer f5;
  
  ModelRenderer l3;
  
  ModelRenderer l2;
  
  ModelRenderer l1;
  
  ModelRenderer f3;
  
  ModelRenderer f2;
  
  ModelRenderer f1;
  
  ModelRenderer jaw;
  
  ModelRenderer b9;
  
  ModelRenderer head;
  
  ModelRenderer b4;
  
  ModelRenderer h1;
  
  ModelRenderer h2;
  
  ModelRenderer body;
  
  ModelRenderer t21;
  
  ModelRenderer tail;
  
  ModelRenderer t22;
  
  ModelRenderer t20;
  
  ModelRenderer t19;
  
  ModelRenderer t6;
  
  ModelRenderer t11;
  
  ModelRenderer t9;
  
  ModelRenderer t4;
  
  ModelRenderer t2;
  
  ModelRenderer t7;
  
  ModelRenderer t12;
  
  ModelRenderer t10;
  
  ModelRenderer t8;
  
  ModelRenderer t5;
  
  ModelRenderer t3;
  
  ModelRenderer t1;
  
  ModelRenderer t18;
  
  ModelRenderer t16;
  
  ModelRenderer t14;
  
  ModelRenderer t13;
  
  ModelRenderer t15;
  
  ModelRenderer t17;
  
  ModelRenderer b1;
  
  ModelRenderer b2;
  
  ModelRenderer b3;
  
  ModelRenderer b8;
  
  ModelRenderer b7;
  
  ModelRenderer b6;
  
  ModelRenderer b5;
  
  public ModelStinkBug(float ff1) {
    this.wingspeed = ff1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.f6 = new ModelRenderer(this, 20, 16);
    this.f6.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f6.setRotationPoint(-3.5F, 16.0F, 3.0F);
    this.f6.setTextureSize(64, 32);
    this.f6.mirror = true;
    setRotation(this.f6, 0.0F, 0.0F, 0.0F);
    this.b10 = new ModelRenderer(this, 0, 2);
    this.b10.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1);
    this.b10.setRotationPoint(0.0F, 11.0F, 1.0F);
    this.b10.setTextureSize(64, 32);
    this.b10.mirror = true;
    setRotation(this.b10, -0.5235988F, 0.0F, 0.0F);
    this.l6 = new ModelRenderer(this, 20, 13);
    this.l6.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l6.setRotationPoint(-3.0F, 15.0F, 3.0F);
    this.l6.setTextureSize(64, 32);
    this.l6.mirror = true;
    setRotation(this.l6, 0.0F, 0.0F, 0.0F);
    this.l4 = new ModelRenderer(this, 20, 13);
    this.l4.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l4.setRotationPoint(-3.0F, 15.0F, -3.0F);
    this.l4.setTextureSize(64, 32);
    this.l4.mirror = true;
    setRotation(this.l4, 0.0F, 0.0F, 0.0F);
    this.f4 = new ModelRenderer(this, 20, 16);
    this.f4.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f4.setRotationPoint(-3.5F, 16.0F, -3.0F);
    this.f4.setTextureSize(64, 32);
    this.f4.mirror = true;
    setRotation(this.f4, 0.0F, 0.0F, 0.0F);
    this.l5 = new ModelRenderer(this, 20, 13);
    this.l5.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l5.setRotationPoint(-3.0F, 15.0F, 0.0F);
    this.l5.setTextureSize(64, 32);
    this.l5.mirror = true;
    setRotation(this.l5, 0.0F, 0.0F, 0.0F);
    this.f5 = new ModelRenderer(this, 20, 16);
    this.f5.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f5.setRotationPoint(-3.5F, 16.0F, 0.0F);
    this.f5.setTextureSize(64, 32);
    this.f5.mirror = true;
    setRotation(this.f5, 0.0F, 0.0F, 0.0F);
    this.l3 = new ModelRenderer(this, 20, 13);
    this.l3.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l3.setRotationPoint(3.0F, 15.0F, 3.0F);
    this.l3.setTextureSize(64, 32);
    this.l3.mirror = true;
    setRotation(this.l3, 0.0F, 0.0F, 0.0F);
    this.l2 = new ModelRenderer(this, 20, 13);
    this.l2.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l2.setRotationPoint(3.0F, 15.0F, 0.0F);
    this.l2.setTextureSize(64, 32);
    this.l2.mirror = true;
    setRotation(this.l2, 0.0F, 0.0F, 0.0F);
    this.l1 = new ModelRenderer(this, 20, 13);
    this.l1.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
    this.l1.setRotationPoint(3.0F, 15.0F, -3.0F);
    this.l1.setTextureSize(64, 32);
    this.l1.mirror = true;
    setRotation(this.l1, 0.0F, 0.0F, 0.0F);
    this.f3 = new ModelRenderer(this, 20, 16);
    this.f3.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f3.setRotationPoint(3.5F, 16.0F, 3.0F);
    this.f3.setTextureSize(64, 32);
    this.f3.mirror = true;
    setRotation(this.f3, 0.0F, 0.0F, 0.0F);
    this.f2 = new ModelRenderer(this, 20, 16);
    this.f2.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f2.setRotationPoint(3.5F, 16.0F, 0.0F);
    this.f2.setTextureSize(64, 32);
    this.f2.mirror = true;
    setRotation(this.f2, 0.0F, 0.0F, 0.0F);
    this.f1 = new ModelRenderer(this, 20, 16);
    this.f1.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
    this.f1.setRotationPoint(3.5F, 16.0F, -3.0F);
    this.f1.setTextureSize(64, 32);
    this.f1.mirror = true;
    setRotation(this.f1, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 28, 8);
    this.jaw.addBox(-3.5F, 0.0F, -8.0F, 5, 1, 4);
    this.jaw.setRotationPoint(1.0F, 15.0F, 0.0F);
    this.jaw.setTextureSize(64, 32);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.122173F, 0.0F, 0.0F);
    this.b9 = new ModelRenderer(this, 0, 2);
    this.b9.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1);
    this.b9.setRotationPoint(0.0F, 11.0F, -1.0F);
    this.b9.setTextureSize(64, 32);
    this.b9.mirror = true;
    setRotation(this.b9, 0.5235988F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 28, 0);
    this.head.addBox(-3.5F, -3.5F, -8.0F, 5, 4, 4);
    this.head.setRotationPoint(1.0F, 15.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.b4 = new ModelRenderer(this, 0, 0);
    this.b4.addBox(1.0F, -0.5F, 2.5F, 1, 1, 1);
    this.b4.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b4.setTextureSize(64, 32);
    this.b4.mirror = true;
    setRotation(this.b4, 0.0F, 0.0F, 0.0F);
    this.h1 = new ModelRenderer(this, 0, 2);
    this.h1.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1);
    this.h1.setRotationPoint(-1.5F, 12.0F, -7.0F);
    this.h1.setTextureSize(64, 32);
    this.h1.mirror = true;
    setRotation(this.h1, 0.5235988F, 0.3490659F, 0.0F);
    this.h2 = new ModelRenderer(this, 0, 2);
    this.h2.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1);
    this.h2.setRotationPoint(1.5F, 12.0F, -7.0F);
    this.h2.setTextureSize(64, 32);
    this.h2.mirror = true;
    setRotation(this.h2, 0.5235988F, -0.3490659F, 0.0F);
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(-4.0F, -4.0F, -4.0F, 6, 5, 8);
    this.body.setRotationPoint(1.0F, 15.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.t21 = new ModelRenderer(this, 0, 0);
    this.t21.addBox(0.5F, 3.5F, 4.0F, 1, 1, 1);
    this.t21.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t21.setTextureSize(64, 32);
    this.t21.mirror = true;
    setRotation(this.t21, -0.3316126F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 0, 13);
    this.tail.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 6);
    this.tail.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, -0.3316126F, 0.0F, 0.0F);
    this.t22 = new ModelRenderer(this, 0, 0);
    this.t22.addBox(-1.5F, 3.5F, 4.0F, 1, 1, 1);
    this.t22.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t22.setTextureSize(64, 32);
    this.t22.mirror = true;
    setRotation(this.t22, -0.3316126F, 0.0F, 0.0F);
    this.t20 = new ModelRenderer(this, 0, 0);
    this.t20.addBox(-1.5F, 3.5F, 2.0F, 1, 1, 1);
    this.t20.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t20.setTextureSize(64, 32);
    this.t20.mirror = true;
    setRotation(this.t20, -0.3316126F, 0.0F, 0.0F);
    this.t19 = new ModelRenderer(this, 0, 0);
    this.t19.addBox(0.5F, 3.5F, 2.0F, 1, 1, 1);
    this.t19.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t19.setTextureSize(64, 32);
    this.t19.mirror = true;
    setRotation(this.t19, -0.3316126F, 0.0F, 0.0F);
    this.t6 = new ModelRenderer(this, 0, 0);
    this.t6.addBox(1.5F, 2.5F, 4.0F, 1, 1, 1);
    this.t6.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t6.setTextureSize(64, 32);
    this.t6.mirror = true;
    setRotation(this.t6, -0.3316126F, 0.0F, 0.0F);
    this.t11 = new ModelRenderer(this, 0, 0);
    this.t11.addBox(0.5F, -0.5F, 4.0F, 1, 1, 1);
    this.t11.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t11.setTextureSize(64, 32);
    this.t11.mirror = true;
    setRotation(this.t11, -0.3316126F, 0.0F, 0.0F);
    this.t9 = new ModelRenderer(this, 0, 0);
    this.t9.addBox(0.5F, -0.5F, 2.0F, 1, 1, 1);
    this.t9.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t9.setTextureSize(64, 32);
    this.t9.mirror = true;
    setRotation(this.t9, -0.3316126F, 0.0F, 0.0F);
    this.t4 = new ModelRenderer(this, 0, 0);
    this.t4.addBox(1.5F, 2.5F, 2.0F, 1, 1, 1);
    this.t4.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t4.setTextureSize(64, 32);
    this.t4.mirror = true;
    setRotation(this.t4, -0.3316126F, 0.0F, 0.0F);
    this.t2 = new ModelRenderer(this, 0, 0);
    this.t2.addBox(1.5F, 2.5F, 0.0F, 1, 1, 1);
    this.t2.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t2.setTextureSize(64, 32);
    this.t2.mirror = true;
    setRotation(this.t2, -0.3316126F, 0.0F, 0.0F);
    this.t7 = new ModelRenderer(this, 0, 0);
    this.t7.addBox(0.5F, -0.5F, 0.0F, 1, 1, 1);
    this.t7.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t7.setTextureSize(64, 32);
    this.t7.mirror = true;
    setRotation(this.t7, -0.3316126F, 0.0F, 0.0F);
    this.t12 = new ModelRenderer(this, 0, 0);
    this.t12.addBox(-1.5F, -0.5F, 4.0F, 1, 1, 1);
    this.t12.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t12.setTextureSize(64, 32);
    this.t12.mirror = true;
    setRotation(this.t12, -0.3316126F, 0.0F, 0.0F);
    this.t10 = new ModelRenderer(this, 0, 0);
    this.t10.addBox(-1.5F, -0.5F, 2.0F, 1, 1, 1);
    this.t10.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t10.setTextureSize(64, 32);
    this.t10.mirror = true;
    setRotation(this.t10, -0.3316126F, 0.0F, 0.0F);
    this.t8 = new ModelRenderer(this, 0, 0);
    this.t8.addBox(-1.5F, -0.5F, 0.0F, 1, 1, 1);
    this.t8.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t8.setTextureSize(64, 32);
    this.t8.mirror = true;
    setRotation(this.t8, -0.3316126F, 0.0F, 0.0F);
    this.t5 = new ModelRenderer(this, 0, 0);
    this.t5.addBox(1.5F, 0.5F, 4.0F, 1, 1, 1);
    this.t5.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t5.setTextureSize(64, 32);
    this.t5.mirror = true;
    setRotation(this.t5, -0.3316126F, 0.0F, 0.0F);
    this.t3 = new ModelRenderer(this, 0, 0);
    this.t3.addBox(1.5F, 0.5F, 2.0F, 1, 1, 1);
    this.t3.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t3.setTextureSize(64, 32);
    this.t3.mirror = true;
    setRotation(this.t3, -0.3316126F, 0.0F, 0.0F);
    this.t1 = new ModelRenderer(this, 0, 0);
    this.t1.addBox(1.5F, 0.5F, 0.0F, 1, 1, 1);
    this.t1.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t1.setTextureSize(64, 32);
    this.t1.mirror = true;
    setRotation(this.t1, -0.3316126F, 0.0F, 0.0F);
    this.t18 = new ModelRenderer(this, 0, 0);
    this.t18.addBox(-2.5F, 2.5F, 4.0F, 1, 1, 1);
    this.t18.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t18.setTextureSize(64, 32);
    this.t18.mirror = true;
    setRotation(this.t18, -0.3316126F, 0.0F, 0.0F);
    this.t16 = new ModelRenderer(this, 0, 0);
    this.t16.addBox(-2.5F, 2.5F, 2.0F, 1, 1, 1);
    this.t16.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t16.setTextureSize(64, 32);
    this.t16.mirror = true;
    setRotation(this.t16, -0.3316126F, 0.0F, 0.0F);
    this.t14 = new ModelRenderer(this, 0, 0);
    this.t14.addBox(-2.5F, 2.5F, 0.0F, 1, 1, 1);
    this.t14.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t14.setTextureSize(64, 32);
    this.t14.mirror = true;
    setRotation(this.t14, -0.3316126F, 0.0F, 0.0F);
    this.t13 = new ModelRenderer(this, 0, 0);
    this.t13.addBox(-2.5F, 0.5F, 0.0F, 1, 1, 1);
    this.t13.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t13.setTextureSize(64, 32);
    this.t13.mirror = true;
    setRotation(this.t13, -0.3316126F, 0.0F, 0.0F);
    this.t15 = new ModelRenderer(this, 0, 0);
    this.t15.addBox(-2.5F, 0.5F, 2.0F, 1, 1, 1);
    this.t15.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t15.setTextureSize(64, 32);
    this.t15.mirror = true;
    setRotation(this.t15, -0.3316126F, 0.0F, 0.0F);
    this.t17 = new ModelRenderer(this, 0, 0);
    this.t17.addBox(-2.5F, 0.5F, 4.0F, 1, 1, 1);
    this.t17.setRotationPoint(0.0F, 11.5F, 4.0F);
    this.t17.setTextureSize(64, 32);
    this.t17.mirror = true;
    setRotation(this.t17, -0.3316126F, 0.0F, 0.0F);
    this.b1 = new ModelRenderer(this, 0, 0);
    this.b1.addBox(1.0F, -0.5F, -3.5F, 1, 1, 1);
    this.b1.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b1.setTextureSize(64, 32);
    this.b1.mirror = true;
    setRotation(this.b1, 0.0F, 0.0F, 0.0F);
    this.b2 = new ModelRenderer(this, 0, 0);
    this.b2.addBox(1.5F, -0.5F, -1.5F, 1, 1, 1);
    this.b2.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b2.setTextureSize(64, 32);
    this.b2.mirror = true;
    setRotation(this.b2, 0.0F, 0.0F, 0.0F);
    this.b3 = new ModelRenderer(this, 0, 0);
    this.b3.addBox(1.5F, -0.5F, 0.5F, 1, 1, 1);
    this.b3.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b3.setTextureSize(64, 32);
    this.b3.mirror = true;
    setRotation(this.b3, 0.0F, 0.0F, 0.0F);
    this.b8 = new ModelRenderer(this, 0, 0);
    this.b8.addBox(-2.0F, -0.5F, 2.5F, 1, 1, 1);
    this.b8.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b8.setTextureSize(64, 32);
    this.b8.mirror = true;
    setRotation(this.b8, 0.0F, 0.0F, 0.0F);
    this.b7 = new ModelRenderer(this, 0, 0);
    this.b7.addBox(-2.5F, -0.5F, 0.5F, 1, 1, 1);
    this.b7.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b7.setTextureSize(64, 32);
    this.b7.mirror = true;
    setRotation(this.b7, 0.0F, 0.0F, 0.0F);
    this.b6 = new ModelRenderer(this, 0, 0);
    this.b6.addBox(-2.5F, -0.5F, -1.5F, 1, 1, 1);
    this.b6.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b6.setTextureSize(64, 32);
    this.b6.mirror = true;
    setRotation(this.b6, 0.0F, 0.0F, 0.0F);
    this.b5 = new ModelRenderer(this, 0, 0);
    this.b5.addBox(-1.966667F, -0.5F, -3.5F, 1, 1, 1);
    this.b5.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.b5.setTextureSize(64, 32);
    this.b5.mirror = true;
    setRotation(this.b5, 0.0F, 0.0F, 0.0F);
    this.f6.rotationPointY += 6.0F;
    this.b10.rotationPointY += 6.0F;
    this.l6.rotationPointY += 6.0F;
    this.l4.rotationPointY += 6.0F;
    this.f4.rotationPointY += 6.0F;
    this.l5.rotationPointY += 6.0F;
    this.f5.rotationPointY += 6.0F;
    this.l3.rotationPointY += 6.0F;
    this.l2.rotationPointY += 6.0F;
    this.l1.rotationPointY += 6.0F;
    this.f3.rotationPointY += 6.0F;
    this.f2.rotationPointY += 6.0F;
    this.f1.rotationPointY += 6.0F;
    this.jaw.rotationPointY += 6.0F;
    this.b9.rotationPointY += 6.0F;
    this.head.rotationPointY += 6.0F;
    this.b4.rotationPointY += 6.0F;
    this.h1.rotationPointY += 6.0F;
    this.h2.rotationPointY += 6.0F;
    this.body.rotationPointY += 6.0F;
    this.t21.rotationPointY += 6.0F;
    this.tail.rotationPointY += 6.0F;
    this.t22.rotationPointY += 6.0F;
    this.t20.rotationPointY += 6.0F;
    this.t19.rotationPointY += 6.0F;
    this.t6.rotationPointY += 6.0F;
    this.t11.rotationPointY += 6.0F;
    this.t9.rotationPointY += 6.0F;
    this.t4.rotationPointY += 6.0F;
    this.t2.rotationPointY += 6.0F;
    this.t7.rotationPointY += 6.0F;
    this.t12.rotationPointY += 6.0F;
    this.t10.rotationPointY += 6.0F;
    this.t8.rotationPointY += 6.0F;
    this.t5.rotationPointY += 6.0F;
    this.t3.rotationPointY += 6.0F;
    this.t1.rotationPointY += 6.0F;
    this.t18.rotationPointY += 6.0F;
    this.t16.rotationPointY += 6.0F;
    this.t14.rotationPointY += 6.0F;
    this.t13.rotationPointY += 6.0F;
    this.t15.rotationPointY += 6.0F;
    this.t17.rotationPointY += 6.0F;
    this.b1.rotationPointY += 6.0F;
    this.b2.rotationPointY += 6.0F;
    this.b3.rotationPointY += 6.0F;
    this.b8.rotationPointY += 6.0F;
    this.b7.rotationPointY += 6.0F;
    this.b6.rotationPointY += 6.0F;
    this.b5.rotationPointY += 6.0F;
  }
  
  public void render(Entity entity, float ff, float ff1, float ff2, float ff3, float ff4, float ff5) {
    super.render(entity, ff, ff1, ff2, ff3, ff4, ff5);
    setRotationAngles(ff, ff1, ff2, ff3, ff4, ff5, entity);
    float newangle = 0.0F;
    newangle = MathHelper.sin(ff2 * 3.1F * this.wingspeed) * 3.1415927F * 0.3F * ff1;
    this.f3.rotateAngleX = newangle;
    this.f6.rotateAngleX = -newangle;
    newangle = MathHelper.sin(ff2 * 0.4F * this.wingspeed) * 3.1415927F * 0.2F;
    this.b9.rotateAngleZ = newangle;
    this.b10.rotateAngleZ = -newangle;
    newangle = MathHelper.sin(ff2 * 0.2F * this.wingspeed) * 3.1415927F * 0.04F;
    this.jaw.rotateAngleX = 0.18F + newangle;
    this.h1.rotateAngleX = 0.52F + MathHelper.sin(ff2 * 0.4F * this.wingspeed) * 3.1415927F * 0.15F;
    this.h1.rotateAngleY = -0.3F + MathHelper.sin(ff2 * 0.43F * this.wingspeed) * 3.1415927F * 0.15F;
    this.h2.rotateAngleX = 0.52F + MathHelper.sin(ff2 * 0.46F * this.wingspeed) * 3.1415927F * 0.15F;
    this.h2.rotateAngleY = 0.3F + MathHelper.sin(ff2 * 0.49F * this.wingspeed) * 3.1415927F * 0.15F;
    this.tail.rotateAngleX = -0.2F + MathHelper.sin(ff2 * 0.1F * this.wingspeed) * 3.1415927F * 0.1F;
    this.t5.rotateAngleX = this.tail.rotateAngleX;
    this.t10.rotateAngleX = this.tail.rotateAngleX;
    this.t15.rotateAngleX = this.tail.rotateAngleX;
    this.t20.rotateAngleX = this.tail.rotateAngleX;
    this.t22.rotateAngleX = this.tail.rotateAngleX;
    this.f6.render(ff5);
    this.b10.render(ff5);
    this.l6.render(ff5);
    this.l4.render(ff5);
    this.f4.render(ff5);
    this.l5.render(ff5);
    this.f5.render(ff5);
    this.l3.render(ff5);
    this.l2.render(ff5);
    this.l1.render(ff5);
    this.f3.render(ff5);
    this.f2.render(ff5);
    this.f1.render(ff5);
    this.jaw.render(ff5);
    this.b9.render(ff5);
    this.head.render(ff5);
    this.b4.render(ff5);
    this.h1.render(ff5);
    this.h2.render(ff5);
    this.body.render(ff5);
    this.t21.render(ff5);
    this.tail.render(ff5);
    this.t22.render(ff5);
    this.t20.render(ff5);
    this.t19.render(ff5);
    this.t6.render(ff5);
    this.t11.render(ff5);
    this.t9.render(ff5);
    this.t4.render(ff5);
    this.t2.render(ff5);
    this.t7.render(ff5);
    this.t12.render(ff5);
    this.t10.render(ff5);
    this.t8.render(ff5);
    this.t5.render(ff5);
    this.t3.render(ff5);
    this.t1.render(ff5);
    this.t18.render(ff5);
    this.t16.render(ff5);
    this.t14.render(ff5);
    this.t13.render(ff5);
    this.t15.render(ff5);
    this.t17.render(ff5);
    this.b1.render(ff5);
    this.b2.render(ff5);
    this.b3.render(ff5);
    this.b8.render(ff5);
    this.b7.render(ff5);
    this.b6.render(ff5);
    this.b5.render(ff5);
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
