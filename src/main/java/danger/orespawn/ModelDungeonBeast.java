package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDungeonBeast extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer tail7;
  
  ModelRenderer head3;
  
  ModelRenderer neck;
  
  ModelRenderer lhornbase;
  
  ModelRenderer leye;
  
  ModelRenderer ljaw3;
  
  ModelRenderer ljaw1;
  
  ModelRenderer ljaw2;
  
  ModelRenderer rjaw1;
  
  ModelRenderer rjaw2;
  
  ModelRenderer rjaw3;
  
  ModelRenderer t1s3;
  
  ModelRenderer rshoulder;
  
  ModelRenderer rheel;
  
  ModelRenderer lshoulder;
  
  ModelRenderer rleg1;
  
  ModelRenderer rleg2;
  
  ModelRenderer lleg1;
  
  ModelRenderer lleg2;
  
  ModelRenderer rfoot;
  
  ModelRenderer ltoe3;
  
  ModelRenderer ltoe2;
  
  ModelRenderer ltoe1;
  
  ModelRenderer head1;
  
  ModelRenderer horn2;
  
  ModelRenderer rhornbase;
  
  ModelRenderer rh1;
  
  ModelRenderer lh1;
  
  ModelRenderer lh2;
  
  ModelRenderer rh2;
  
  ModelRenderer rh3;
  
  ModelRenderer lh3;
  
  ModelRenderer lh4;
  
  ModelRenderer rh4;
  
  ModelRenderer horn1;
  
  ModelRenderer t2s3;
  
  ModelRenderer tail3;
  
  ModelRenderer t4s1;
  
  ModelRenderer t6s1;
  
  ModelRenderer tail6;
  
  ModelRenderer body;
  
  ModelRenderer bodys1;
  
  ModelRenderer bodys2;
  
  ModelRenderer tail1;
  
  ModelRenderer bodys3;
  
  ModelRenderer t1s1;
  
  ModelRenderer t1s2;
  
  ModelRenderer tail2;
  
  ModelRenderer t3s2;
  
  ModelRenderer t2s2;
  
  ModelRenderer t2s1;
  
  ModelRenderer t3s1;
  
  ModelRenderer tail4;
  
  ModelRenderer tail5;
  
  ModelRenderer t5s1;
  
  ModelRenderer head2;
  
  ModelRenderer reye;
  
  ModelRenderer lfoot;
  
  ModelRenderer rfoot2;
  
  ModelRenderer lfoot2;
  
  ModelRenderer lheel;
  
  ModelRenderer rtoe3;
  
  ModelRenderer rtoe2;
  
  ModelRenderer rtoe1;
  
  public ModelDungeonBeast(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.tail7 = new ModelRenderer(this, 0, 0);
    this.tail7.addBox(-1.0F, -0.5F, -0.5333334F, 3, 1, 1);
    this.tail7.setRotationPoint(-24.0F, 23.5F, 0.0F);
    this.tail7.setTextureSize(64, 32);
    this.tail7.mirror = true;
    setRotation(this.tail7, 0.0F, 0.0F, 3.141593F);
    this.head3 = new ModelRenderer(this, 0, 0);
    this.head3.addBox(2.0F, -2.466667F, 4.3F, 4, 4, 2);
    this.head3.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.head3.setTextureSize(64, 32);
    this.head3.mirror = true;
    setRotation(this.head3, 0.0F, 0.8028515F, 0.0F);
    this.neck = new ModelRenderer(this, 0, 0);
    this.neck.addBox(0.0F, -1.5F, -2.533333F, 3, 3, 5);
    this.neck.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.neck.setTextureSize(64, 32);
    this.neck.mirror = true;
    setRotation(this.neck, 0.0F, 0.0F, -0.1745329F);
    this.lhornbase = new ModelRenderer(this, 0, 0);
    this.lhornbase.addBox(2.5F, -3.0F, 0.5F, 3, 1, 2);
    this.lhornbase.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lhornbase.setTextureSize(64, 32);
    this.lhornbase.mirror = true;
    setRotation(this.lhornbase, 0.0F, 0.0F, 0.0F);
    this.leye = new ModelRenderer(this, 14, 15);
    this.leye.addBox(3.0F, -1.466667F, 3.3F, 2, 1, 2);
    this.leye.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.leye.setTextureSize(64, 32);
    this.leye.mirror = true;
    setRotation(this.leye, 0.0F, 0.4363323F, 0.0F);
    this.ljaw3 = new ModelRenderer(this, 10, 28);
    this.ljaw3.addBox(3.5F, 0.0F, 1.5F, 1, 1, 1);
    this.ljaw3.setRotationPoint(10.0F, 16.0F, 2.0F);
    this.ljaw3.setTextureSize(64, 32);
    this.ljaw3.mirror = true;
    setRotation(this.ljaw3, 0.0F, 0.5235988F, 0.0F);
    this.ljaw1 = new ModelRenderer(this, 10, 20);
    this.ljaw1.addBox(0.0F, 0.0F, -1.466667F, 3, 1, 2);
    this.ljaw1.setRotationPoint(10.0F, 16.0F, 2.0F);
    this.ljaw1.setTextureSize(64, 32);
    this.ljaw1.mirror = true;
    setRotation(this.ljaw1, 0.0F, -0.3490659F, 0.0F);
    this.ljaw2 = new ModelRenderer(this, 10, 24);
    this.ljaw2.addBox(2.0F, 0.0F, 0.3F, 2, 1, 2);
    this.ljaw2.setRotationPoint(10.0F, 16.0F, 2.0F);
    this.ljaw2.setTextureSize(64, 32);
    this.ljaw2.mirror = true;
    setRotation(this.ljaw2, 0.0F, 0.3490659F, 0.0F);
    this.rjaw1 = new ModelRenderer(this, 10, 20);
    this.rjaw1.addBox(0.0F, 0.0F, -0.4666667F, 3, 1, 2);
    this.rjaw1.setRotationPoint(10.0F, 16.0F, -2.0F);
    this.rjaw1.setTextureSize(64, 32);
    this.rjaw1.mirror = true;
    setRotation(this.rjaw1, 0.0F, 0.3490659F, 0.0F);
    this.rjaw2 = new ModelRenderer(this, 10, 24);
    this.rjaw2.addBox(2.0F, 0.0F, -2.3F, 2, 1, 2);
    this.rjaw2.setRotationPoint(10.0F, 16.0F, -2.0F);
    this.rjaw2.setTextureSize(64, 32);
    this.rjaw2.mirror = true;
    setRotation(this.rjaw2, 0.0F, -0.3490659F, 0.0F);
    this.rjaw3 = new ModelRenderer(this, 10, 28);
    this.rjaw3.addBox(3.5F, 0.0F, -2.5F, 1, 1, 1);
    this.rjaw3.setRotationPoint(10.0F, 16.0F, -2.0F);
    this.rjaw3.setTextureSize(64, 32);
    this.rjaw3.mirror = true;
    setRotation(this.rjaw3, 0.0F, -0.5235988F, 0.0F);
    this.t1s3 = new ModelRenderer(this, 75, 0);
    this.t1s3.addBox(-3.0F, -7.0F, -0.5F, 1, 4, 1);
    this.t1s3.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.t1s3.setTextureSize(64, 32);
    this.t1s3.mirror = true;
    setRotation(this.t1s3, 0.0F, 0.0F, -0.8726646F);
    this.rshoulder = new ModelRenderer(this, 0, 0);
    this.rshoulder.addBox(2.0F, -2.2F, -5.0F, 4, 4, 2);
    this.rshoulder.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.rshoulder.setTextureSize(64, 32);
    this.rshoulder.mirror = true;
    setRotation(this.rshoulder, 0.0F, 0.0F, 0.0F);
    this.rheel = new ModelRenderer(this, 0, 0);
    this.rheel.addBox(-2.3F, 0.3F, 6.0F, 1, 1, 1);
    this.rheel.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rheel.setTextureSize(64, 32);
    this.rheel.mirror = true;
    setRotation(this.rheel, -1.570796F, 0.0F, 0.0F);
    this.lshoulder = new ModelRenderer(this, 0, 0);
    this.lshoulder.addBox(2.0F, -2.2F, 3.0F, 4, 4, 2);
    this.lshoulder.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.lshoulder.setTextureSize(64, 32);
    this.lshoulder.mirror = true;
    setRotation(this.lshoulder, 0.0F, 0.0F, 0.0F);
    this.rleg1 = new ModelRenderer(this, 0, 0);
    this.rleg1.addBox(-1.466667F, -2.0F, -5.0F, 3, 3, 6);
    this.rleg1.setRotationPoint(3.0F, 15.0F, -4.0F);
    this.rleg1.setTextureSize(64, 32);
    this.rleg1.mirror = true;
    setRotation(this.rleg1, 0.6981317F, 0.0F, 0.0F);
    this.rleg2 = new ModelRenderer(this, 0, 0);
    this.rleg2.addBox(-1.0F, -0.2F, 0.0F, 2, 2, 6);
    this.rleg2.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rleg2.setTextureSize(64, 32);
    this.rleg2.mirror = true;
    setRotation(this.rleg2, -1.570796F, 0.0F, 0.0F);
    this.lleg1 = new ModelRenderer(this, 0, 0);
    this.lleg1.addBox(-1.466667F, -2.0F, -1.0F, 3, 3, 6);
    this.lleg1.setRotationPoint(3.0F, 15.0F, 4.0F);
    this.lleg1.setTextureSize(64, 32);
    this.lleg1.mirror = true;
    setRotation(this.lleg1, -0.6981317F, 0.0F, 0.0F);
    this.lleg2 = new ModelRenderer(this, 0, 0);
    this.lleg2.addBox(-1.0F, -1.8F, 0.0F, 2, 2, 6);
    this.lleg2.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.lleg2.setTextureSize(64, 32);
    this.lleg2.mirror = true;
    setRotation(this.lleg2, -1.570796F, 0.0F, 0.0F);
    this.rfoot = new ModelRenderer(this, 0, 0);
    this.rfoot.addBox(-1.5F, -0.7F, 5.0F, 3, 3, 2);
    this.rfoot.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rfoot.setTextureSize(64, 32);
    this.rfoot.mirror = true;
    setRotation(this.rfoot, -1.570796F, 0.0F, 0.0F);
    this.ltoe3 = new ModelRenderer(this, 32, 0);
    this.ltoe3.addBox(-3.7F, -1.5F, 4.5F, 1, 1, 2);
    this.ltoe3.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.ltoe3.setTextureSize(64, 32);
    this.ltoe3.mirror = true;
    setRotation(this.ltoe3, -1.570796F, 0.7853982F, -0.7853982F);
    this.ltoe2 = new ModelRenderer(this, 32, 0);
    this.ltoe2.addBox(-3.0F, -1.3F, 5.2F, 1, 1, 2);
    this.ltoe2.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.ltoe2.setTextureSize(64, 32);
    this.ltoe2.mirror = true;
    setRotation(this.ltoe2, -1.570796F, 0.0F, -0.7853982F);
    this.ltoe1 = new ModelRenderer(this, 32, 0);
    this.ltoe1.addBox(-3.0F, -0.6F, 5.2F, 1, 1, 2);
    this.ltoe1.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.ltoe1.setTextureSize(64, 32);
    this.ltoe1.mirror = true;
    setRotation(this.ltoe1, -1.570796F, -0.7853982F, -0.7853982F);
    this.head1 = new ModelRenderer(this, 0, 0);
    this.head1.addBox(2.0F, -2.466667F, -3.0F, 4, 4, 6);
    this.head1.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.head1.setTextureSize(64, 32);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.horn2 = new ModelRenderer(this, 75, 6);
    this.horn2.addBox(-7.0F, -4.0F, -0.5F, 1, 2, 1);
    this.horn2.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.horn2.setTextureSize(64, 32);
    this.horn2.mirror = true;
    setRotation(this.horn2, 0.0F, 0.0F, 2.181662F);
    this.rhornbase = new ModelRenderer(this, 0, 0);
    this.rhornbase.addBox(2.5F, -3.0F, -2.5F, 3, 1, 2);
    this.rhornbase.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.rhornbase.setTextureSize(64, 32);
    this.rhornbase.mirror = true;
    setRotation(this.rhornbase, 0.0F, 0.0F, 0.0F);
    this.rh1 = new ModelRenderer(this, 0, 28);
    this.rh1.addBox(4.0F, -3.0F, -2.5F, 2, 3, 2);
    this.rh1.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.rh1.setTextureSize(64, 32);
    this.rh1.mirror = true;
    setRotation(this.rh1, 0.0F, 0.0F, -0.5235988F);
    this.lh1 = new ModelRenderer(this, 0, 28);
    this.lh1.addBox(4.0F, -3.0F, 0.5F, 2, 3, 2);
    this.lh1.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lh1.setTextureSize(64, 32);
    this.lh1.mirror = true;
    setRotation(this.lh1, 0.0F, 0.0F, -0.5235988F);
    this.lh2 = new ModelRenderer(this, 0, 23);
    this.lh2.addBox(5.0F, -4.0F, 1.0F, 1, 3, 1);
    this.lh2.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lh2.setTextureSize(64, 32);
    this.lh2.mirror = true;
    setRotation(this.lh2, 0.0F, 0.0F, -0.8726646F);
    this.rh2 = new ModelRenderer(this, 0, 23);
    this.rh2.addBox(5.0F, -4.0F, -2.0F, 1, 3, 1);
    this.rh2.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.rh2.setTextureSize(64, 32);
    this.rh2.mirror = true;
    setRotation(this.rh2, 0.0F, 0.0F, -0.8726646F);
    this.rh3 = new ModelRenderer(this, 0, 19);
    this.rh3.addBox(6.1F, -2.4F, -2.0F, 1, 2, 1);
    this.rh3.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.rh3.setTextureSize(64, 32);
    this.rh3.mirror = true;
    setRotation(this.rh3, 0.0F, 0.0F, -1.396263F);
    this.lh3 = new ModelRenderer(this, 0, 19);
    this.lh3.addBox(6.1F, -2.4F, 1.0F, 1, 2, 1);
    this.lh3.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lh3.setTextureSize(64, 32);
    this.lh3.mirror = true;
    setRotation(this.lh3, 0.0F, 0.0F, -1.396263F);
    this.lh4 = new ModelRenderer(this, 0, 15);
    this.lh4.addBox(6.5F, -1.8F, 1.0F, 1, 2, 1);
    this.lh4.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lh4.setTextureSize(64, 32);
    this.lh4.mirror = true;
    setRotation(this.lh4, 0.0F, 0.0F, -1.745329F);
    this.rh4 = new ModelRenderer(this, 0, 15);
    this.rh4.addBox(6.5F, -1.8F, -2.0F, 1, 2, 1);
    this.rh4.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.rh4.setTextureSize(64, 32);
    this.rh4.mirror = true;
    setRotation(this.rh4, 0.0F, 0.0F, -1.745329F);
    this.horn1 = new ModelRenderer(this, 75, 6);
    this.horn1.addBox(-8.0F, -2.5F, -0.5F, 1, 2, 1);
    this.horn1.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.horn1.setTextureSize(64, 32);
    this.horn1.mirror = true;
    setRotation(this.horn1, 0.0F, 0.0F, 2.617994F);
    this.t2s3 = new ModelRenderer(this, 75, 0);
    this.t2s3.addBox(3.0F, 3.466667F, -0.5333334F, 1, 3, 1);
    this.t2s3.setRotationPoint(-6.0F, 17.0F, 0.0F);
    this.t2s3.setTextureSize(64, 32);
    this.t2s3.mirror = true;
    setRotation(this.t2s3, 0.0F, 0.0F, 2.007129F);
    this.tail3 = new ModelRenderer(this, 0, 0);
    this.tail3.addBox(-1.0F, -1.5F, -2.5F, 6, 3, 5);
    this.tail3.setRotationPoint(-10.0F, 20.0F, 0.0F);
    this.tail3.setTextureSize(64, 32);
    this.tail3.mirror = true;
    setRotation(this.tail3, 0.0F, 0.0F, 2.530727F);
    this.t4s1 = new ModelRenderer(this, 75, 0);
    this.t4s1.addBox(0.5333334F, 1.533333F, -0.4666667F, 1, 2, 1);
    this.t4s1.setRotationPoint(-14.0F, 22.8F, 0.0F);
    this.t4s1.setTextureSize(64, 32);
    this.t4s1.mirror = true;
    setRotation(this.t4s1, 0.0F, 0.0F, 2.356194F);
    this.t6s1 = new ModelRenderer(this, 75, 0);
    this.t6s1.addBox(0.0F, 0.5F, -0.5F, 1, 1, 1);
    this.t6s1.setRotationPoint(-21.0F, 23.5F, 0.0F);
    this.t6s1.setTextureSize(64, 32);
    this.t6s1.mirror = true;
    setRotation(this.t6s1, 0.0F, 0.0F, 2.356194F);
    this.tail6 = new ModelRenderer(this, 0, 0);
    this.tail6.addBox(-1.0F, -0.5F, -1.0F, 4, 1, 2);
    this.tail6.setRotationPoint(-21.0F, 23.5F, 0.0F);
    this.tail6.setTextureSize(64, 32);
    this.tail6.mirror = true;
    setRotation(this.tail6, 0.0F, 0.0F, 3.141593F);
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, -3.0F, -4.0F, 7, 6, 8);
    this.body.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.bodys1 = new ModelRenderer(this, 75, 0);
    this.bodys1.addBox(6.0F, -3.0F, -0.5F, 1, 4, 1);
    this.bodys1.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.bodys1.setTextureSize(64, 32);
    this.bodys1.mirror = true;
    setRotation(this.bodys1, 0.0F, 0.0F, -0.5235988F);
    this.bodys2 = new ModelRenderer(this, 75, 0);
    this.bodys2.addBox(4.0F, -4.0F, -0.5F, 1, 4, 1);
    this.bodys2.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.bodys2.setTextureSize(64, 32);
    this.bodys2.mirror = true;
    setRotation(this.bodys2, 0.0F, 0.0F, -0.5235988F);
    this.tail1 = new ModelRenderer(this, 0, 0);
    this.tail1.addBox(-1.0F, -2.533333F, -3.5F, 7, 5, 7);
    this.tail1.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.tail1.setTextureSize(64, 32);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 2.792527F);
    this.bodys3 = new ModelRenderer(this, 75, 0);
    this.bodys3.addBox(2.0F, -5.0F, -0.5F, 1, 4, 1);
    this.bodys3.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.bodys3.setTextureSize(64, 32);
    this.bodys3.mirror = true;
    setRotation(this.bodys3, 0.0F, 0.0F, -0.5235988F);
    this.t1s1 = new ModelRenderer(this, 75, 0);
    this.t1s1.addBox(1.0F, -5.0F, -0.5F, 1, 4, 1);
    this.t1s1.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.t1s1.setTextureSize(64, 32);
    this.t1s1.mirror = true;
    setRotation(this.t1s1, 0.0F, 0.0F, -0.8726646F);
    this.t1s2 = new ModelRenderer(this, 75, 0);
    this.t1s2.addBox(-1.0F, -6.0F, -0.5F, 1, 4, 1);
    this.t1s2.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.t1s2.setTextureSize(64, 32);
    this.t1s2.mirror = true;
    setRotation(this.t1s2, 0.0F, 0.0F, -0.8726646F);
    this.tail2 = new ModelRenderer(this, 0, 0);
    this.tail2.addBox(-1.0F, -2.0F, -3.0F, 7, 4, 6);
    this.tail2.setRotationPoint(-6.0F, 17.0F, 0.0F);
    this.tail2.setTextureSize(64, 32);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 2.530727F);
    this.t3s2 = new ModelRenderer(this, 75, 0);
    this.t3s2.addBox(2.5F, 2.466667F, -0.5333334F, 1, 3, 1);
    this.t3s2.setRotationPoint(-10.0F, 20.0F, 0.0F);
    this.t3s2.setTextureSize(64, 32);
    this.t3s2.mirror = true;
    setRotation(this.t3s2, 0.0F, 0.0F, 2.007129F);
    this.t2s2 = new ModelRenderer(this, 75, 0);
    this.t2s2.addBox(1.0F, 2.466667F, -0.5333334F, 1, 3, 1);
    this.t2s2.setRotationPoint(-6.0F, 17.0F, 0.0F);
    this.t2s2.setTextureSize(64, 32);
    this.t2s2.mirror = true;
    setRotation(this.t2s2, 0.0F, 0.0F, 2.007129F);
    this.t2s1 = new ModelRenderer(this, 75, 0);
    this.t2s1.addBox(-1.0F, 1.466667F, -0.5333334F, 1, 3, 1);
    this.t2s1.setRotationPoint(-6.0F, 17.0F, 0.0F);
    this.t2s1.setTextureSize(64, 32);
    this.t2s1.mirror = true;
    setRotation(this.t2s1, 0.0F, 0.0F, 2.007129F);
    this.t3s1 = new ModelRenderer(this, 75, 0);
    this.t3s1.addBox(0.5F, 1.466667F, -0.5333334F, 1, 3, 1);
    this.t3s1.setRotationPoint(-10.0F, 20.0F, 0.0F);
    this.t3s1.setTextureSize(64, 32);
    this.t3s1.mirror = true;
    setRotation(this.t3s1, 0.0F, 0.0F, 2.007129F);
    this.tail4 = new ModelRenderer(this, 0, 0);
    this.tail4.addBox(-1.0F, -1.0F, -2.0F, 5, 2, 4);
    this.tail4.setRotationPoint(-14.0F, 22.8F, 0.0F);
    this.tail4.setTextureSize(64, 32);
    this.tail4.mirror = true;
    setRotation(this.tail4, 0.0F, 0.0F, 3.054326F);
    this.tail5 = new ModelRenderer(this, 0, 0);
    this.tail5.addBox(-1.0F, -0.5F, -1.5F, 4, 1, 3);
    this.tail5.setRotationPoint(-18.0F, 23.2F, 0.0F);
    this.tail5.setTextureSize(64, 32);
    this.tail5.mirror = true;
    setRotation(this.tail5, 0.0F, 0.0F, 3.054326F);
    this.t5s1 = new ModelRenderer(this, 75, 0);
    this.t5s1.addBox(0.0F, 0.5F, -0.5F, 1, 2, 1);
    this.t5s1.setRotationPoint(-18.0F, 23.2F, 0.0F);
    this.t5s1.setTextureSize(64, 32);
    this.t5s1.mirror = true;
    setRotation(this.t5s1, 0.0F, 0.0F, 2.356194F);
    this.head2 = new ModelRenderer(this, 0, 0);
    this.head2.addBox(2.0F, -2.466667F, -6.3F, 4, 4, 2);
    this.head2.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.head2.setTextureSize(64, 32);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, -0.8028515F, 0.0F);
    this.reye = new ModelRenderer(this, 5, 15);
    this.reye.addBox(3.0F, -1.466667F, -5.3F, 2, 1, 2);
    this.reye.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.reye.setTextureSize(64, 32);
    this.reye.mirror = true;
    setRotation(this.reye, 0.0F, -0.4363323F, 0.0F);
    this.lfoot = new ModelRenderer(this, 0, 0);
    this.lfoot.addBox(-1.5F, -2.3F, 5.0F, 3, 3, 2);
    this.lfoot.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.lfoot.setTextureSize(64, 32);
    this.lfoot.mirror = true;
    setRotation(this.lfoot, -1.570796F, 0.0F, 0.0F);
    this.rfoot2 = new ModelRenderer(this, 0, 0);
    this.rfoot2.addBox(0.6F, -1.5F, 5.0F, 2, 2, 2);
    this.rfoot2.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rfoot2.setTextureSize(64, 32);
    this.rfoot2.mirror = true;
    setRotation(this.rfoot2, -1.570796F, 0.7853982F, 0.0F);
    this.lfoot2 = new ModelRenderer(this, 0, 0);
    this.lfoot2.addBox(0.7F, -0.5F, 5.0F, 2, 2, 2);
    this.lfoot2.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.lfoot2.setTextureSize(64, 32);
    this.lfoot2.mirror = true;
    setRotation(this.lfoot2, -1.570796F, -0.7853982F, 0.0F);
    this.lheel = new ModelRenderer(this, 0, 0);
    this.lheel.addBox(-2.3F, -1.3F, 6.0F, 1, 1, 1);
    this.lheel.setRotationPoint(3.0F, 17.0F, 7.0F);
    this.lheel.setTextureSize(64, 32);
    this.lheel.mirror = true;
    setRotation(this.lheel, -1.570796F, 0.0F, 0.0F);
    this.rtoe3 = new ModelRenderer(this, 32, 0);
    this.rtoe3.addBox(-3.7F, 0.6F, 4.5F, 1, 1, 2);
    this.rtoe3.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rtoe3.setTextureSize(64, 32);
    this.rtoe3.mirror = true;
    setRotation(this.rtoe3, -1.570796F, -0.7853982F, -0.7853982F);
    this.rtoe2 = new ModelRenderer(this, 32, 0);
    this.rtoe2.addBox(-3.0F, 0.3F, 5.2F, 1, 1, 2);
    this.rtoe2.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rtoe2.setTextureSize(64, 32);
    this.rtoe2.mirror = true;
    setRotation(this.rtoe2, -1.570796F, 0.0F, -0.7853982F);
    this.rtoe1 = new ModelRenderer(this, 32, 0);
    this.rtoe1.addBox(-3.0F, -0.6F, 5.2F, 1, 1, 2);
    this.rtoe1.setRotationPoint(3.0F, 17.0F, -7.0F);
    this.rtoe1.setTextureSize(64, 32);
    this.rtoe1.mirror = true;
    setRotation(this.rtoe1, -1.570796F, 0.7853982F, -0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    DungeonBeast e = (DungeonBeast)entity;
    RenderInfo r = null;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
    float tailamp = 0.0F;
    float pi4 = 0.39269876F;
    newangle = MathHelper.cos(f2 * 1.4F * this.wingspeed) * 3.1415927F * 0.22F * f1;
    this.rheel.rotateAngleZ = newangle;
    this.rtoe2.rotateAngleZ = -0.785F + newangle;
    this.lheel.rotateAngleZ = -newangle;
    this.ltoe2.rotateAngleZ = -0.785F - newangle;
    this.bodys1.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.07F;
    this.bodys2.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed + pi4) * 3.1415927F * 0.07F;
    this.bodys3.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed + 2.0F * pi4) * 3.1415927F * 0.07F;
    this.t1s1.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed + 3.0F * pi4) * 3.1415927F * 0.07F;
    this.t1s2.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed + 4.0F * pi4) * 3.1415927F * 0.07F;
    this.t1s3.rotateAngleX = MathHelper.cos(f2 * 0.5F * this.wingspeed + 5.0F * pi4) * 3.1415927F * 0.07F;
    this.t2s1.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 6.0F * pi4) * 3.1415927F * 0.07F;
    this.t2s2.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 7.0F * pi4) * 3.1415927F * 0.07F;
    this.t2s3.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 8.0F * pi4) * 3.1415927F * 0.07F;
    this.t3s1.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 9.0F * pi4) * 3.1415927F * 0.07F;
    this.t3s2.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 10.0F * pi4) * 3.1415927F * 0.07F;
    this.t4s1.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 11.0F * pi4) * 3.1415927F * 0.07F;
    this.t5s1.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 12.0F * pi4) * 3.1415927F * 0.07F;
    this.t6s1.rotateAngleX = -MathHelper.cos(f2 * 0.5F * this.wingspeed + 13.0F * pi4) * 3.1415927F * 0.07F;
    if (e.getAttacking() == 0) {
      tailamp = f1;
    } else {
      tailamp = 1.25F;
    } 
    newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed) * 3.1415927F * 0.25F * tailamp;
    this.tail1.rotateAngleY = newangle * 0.25F;
    this.t1s3.rotateAngleY = this.tail1.rotateAngleY;
    this.tail2.rotateAngleY = newangle * 0.5F;
    this.tail1.rotationPointX -= (float)Math.cos(this.tail1.rotateAngleY) * 6.0F;
    this.tail1.rotationPointZ -= (float)Math.sin(this.tail1.rotateAngleY) * 6.0F;
    this.t2s3.rotateAngleY = this.tail2.rotateAngleY;
    this.t2s3.rotationPointZ = this.tail2.rotationPointZ;
    this.t2s3.rotationPointX = this.tail2.rotationPointX;
    this.tail3.rotateAngleY = newangle * 0.75F;
    this.tail2.rotationPointX -= (float)Math.cos(this.tail2.rotateAngleY) * 5.0F;
    this.tail2.rotationPointZ -= (float)Math.sin(this.tail2.rotateAngleY) * 5.0F;
    this.t3s2.rotateAngleY = this.tail3.rotateAngleY;
    this.t3s2.rotationPointZ = this.tail3.rotationPointZ;
    this.t3s2.rotationPointX = this.tail3.rotationPointX;
    this.tail4.rotateAngleY = newangle;
    this.tail3.rotationPointX -= (float)Math.cos(this.tail3.rotateAngleY) * 4.5F;
    this.tail3.rotationPointZ -= (float)Math.sin(this.tail3.rotateAngleY) * 4.5F;
    this.t4s1.rotateAngleY = this.tail4.rotateAngleY;
    this.t4s1.rotationPointZ = this.tail4.rotationPointZ;
    this.t4s1.rotationPointX = this.tail4.rotationPointX;
    this.tail5.rotateAngleY = newangle * 1.25F;
    this.tail4.rotationPointX -= (float)Math.cos(this.tail4.rotateAngleY) * 4.0F;
    this.tail4.rotationPointZ -= (float)Math.sin(this.tail4.rotateAngleY) * 4.0F;
    this.t5s1.rotateAngleY = this.tail5.rotateAngleY;
    this.t5s1.rotationPointZ = this.tail5.rotationPointZ;
    this.t5s1.rotationPointX = this.tail5.rotationPointX;
    this.tail6.rotateAngleY = newangle * 1.5F;
    this.tail5.rotationPointX -= (float)Math.cos(this.tail5.rotateAngleY) * 3.0F;
    this.tail5.rotationPointZ -= (float)Math.sin(this.tail5.rotateAngleY) * 3.0F;
    this.t6s1.rotateAngleY = this.tail6.rotateAngleY;
    this.t6s1.rotationPointZ = this.tail6.rotationPointZ;
    this.t6s1.rotationPointX = this.tail6.rotationPointX;
    this.tail7.rotateAngleY = newangle * 1.75F;
    this.tail6.rotationPointX -= (float)Math.cos(this.tail6.rotateAngleY) * 3.0F;
    this.tail6.rotationPointZ -= (float)Math.sin(this.tail6.rotateAngleY) * 3.0F;
    r = e.getRenderInfo();
    newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.15F;
    nextangle = MathHelper.cos((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.15F;
    if (nextangle > 0.0F && newangle < 0.0F)
      if (e.getAttacking() == 0) {
        r.ri1 = e.worldObj.rand.nextInt(15);
        r.ri2 = e.worldObj.rand.nextInt(15);
      } else {
        r.ri1 = 0;
        r.ri2 = 0;
      }  
    if (r.ri1 == 0) {
      this.ljaw1.rotateAngleY = -0.349F + newangle;
      this.ljaw2.rotateAngleY = 0.349F + newangle;
      this.ljaw3.rotateAngleY = 0.523F + newangle;
      this.rjaw1.rotateAngleY = 0.349F - newangle;
      this.rjaw2.rotateAngleY = -0.349F - newangle;
      this.rjaw3.rotateAngleY = -0.523F - newangle;
    } else {
      this.ljaw1.rotateAngleY = -0.349F;
      this.ljaw2.rotateAngleY = 0.349F;
      this.ljaw3.rotateAngleY = 0.523F;
      this.rjaw1.rotateAngleY = 0.349F;
      this.rjaw2.rotateAngleY = -0.349F;
      this.rjaw3.rotateAngleY = -0.523F;
    } 
    e.setRenderInfo(r);
    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
    this.tail7.render(f5);
    this.head3.render(f5);
    this.neck.render(f5);
    this.lhornbase.render(f5);
    this.leye.render(f5);
    this.ljaw3.render(f5);
    this.ljaw1.render(f5);
    this.ljaw2.render(f5);
    this.rjaw1.render(f5);
    this.rjaw2.render(f5);
    this.rjaw3.render(f5);
    this.t1s3.render(f5);
    this.rshoulder.render(f5);
    this.rheel.render(f5);
    this.lshoulder.render(f5);
    this.rleg1.render(f5);
    this.rleg2.render(f5);
    this.lleg1.render(f5);
    this.lleg2.render(f5);
    this.rfoot.render(f5);
    this.ltoe2.render(f5);
    this.head1.render(f5);
    this.horn2.render(f5);
    this.rhornbase.render(f5);
    this.rh1.render(f5);
    this.lh1.render(f5);
    this.lh2.render(f5);
    this.rh2.render(f5);
    this.rh3.render(f5);
    this.lh3.render(f5);
    this.lh4.render(f5);
    this.rh4.render(f5);
    this.horn1.render(f5);
    this.t2s3.render(f5);
    this.tail3.render(f5);
    this.t4s1.render(f5);
    this.t6s1.render(f5);
    this.tail6.render(f5);
    this.body.render(f5);
    this.bodys1.render(f5);
    this.bodys2.render(f5);
    this.tail1.render(f5);
    this.bodys3.render(f5);
    this.t1s1.render(f5);
    this.t1s2.render(f5);
    this.tail2.render(f5);
    this.t3s2.render(f5);
    this.t2s2.render(f5);
    this.t2s1.render(f5);
    this.t3s1.render(f5);
    this.tail4.render(f5);
    this.tail5.render(f5);
    this.t5s1.render(f5);
    this.head2.render(f5);
    this.reye.render(f5);
    this.lfoot.render(f5);
    this.rfoot2.render(f5);
    this.lfoot2.render(f5);
    this.lheel.render(f5);
    this.rtoe2.render(f5);
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
