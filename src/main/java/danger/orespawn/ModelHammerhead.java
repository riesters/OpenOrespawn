package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHammerhead extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer chest;
  
  ModelRenderer abdomen;
  
  ModelRenderer neck;
  
  ModelRenderer head;
  
  ModelRenderer snout;
  
  ModelRenderer neck_armour;
  
  ModelRenderer horn_base;
  
  ModelRenderer horn_1;
  
  ModelRenderer horn_2;
  
  ModelRenderer horn_R;
  
  ModelRenderer horn_L;
  
  ModelRenderer back_armour1;
  
  ModelRenderer back_armour_2;
  
  ModelRenderer back_armour_3;
  
  ModelRenderer back_armour_3R;
  
  ModelRenderer back_armour_4;
  
  ModelRenderer back_armour_4R;
  
  ModelRenderer tail;
  
  ModelRenderer leg_1R;
  
  ModelRenderer leg_1;
  
  ModelRenderer leg_2;
  
  ModelRenderer leg_2R;
  
  ModelRenderer leg_3R;
  
  ModelRenderer leg_3;
  
  ModelRenderer leg_1Rb;
  
  ModelRenderer leg_1b;
  
  ModelRenderer leg_2b;
  
  ModelRenderer leg_2Rb;
  
  ModelRenderer leg_3Rb;
  
  ModelRenderer leg_3b;
  
  ModelRenderer fan1;
  
  ModelRenderer Lfan2;
  
  ModelRenderer Rfan2;
  
  ModelRenderer Lfan3;
  
  ModelRenderer Rfan3;
  
  ModelRenderer Lear;
  
  ModelRenderer Rear;
  
  public ModelHammerhead(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 222;
    this.textureHeight = 256;
    this.chest = new ModelRenderer(this, 0, 0);
    this.chest.addBox(-9.0F, -1.0F, 0.0F, 19, 16, 17);
    this.chest.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.chest.setTextureSize(222, 256);
    this.chest.mirror = true;
    setRotation(this.chest, 0.0349066F, 0.0F, 0.0F);
    this.abdomen = new ModelRenderer(this, 0, 34);
    this.abdomen.addBox(-7.5F, 0.0F, 0.0F, 16, 14, 16);
    this.abdomen.setRotationPoint(0.0F, -2.0F, 4.0F);
    this.abdomen.setTextureSize(222, 256);
    this.abdomen.mirror = true;
    setRotation(this.abdomen, -0.0349066F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 146, 59);
    this.neck.addBox(-6.5F, -0.5F, -12.0F, 14, 13, 13);
    this.neck.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.neck.setTextureSize(222, 256);
    this.neck.mirror = true;
    setRotation(this.neck, 0.1570796F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 101, 59);
    this.head.addBox(-6.0F, -0.5F, -21.0F, 13, 11, 9);
    this.head.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.head.setTextureSize(222, 256);
    this.head.mirror = true;
    setRotation(this.head, 0.2094395F, 0.0F, 0.0F);
    this.snout = new ModelRenderer(this, 166, 86);
    this.snout.addBox(-4.0F, -6.0F, -27.0F, 9, 8, 8);
    this.snout.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.snout.setTextureSize(222, 256);
    this.snout.mirror = true;
    setRotation(this.snout, 0.6108652F, 0.0F, 0.0F);
    this.neck_armour = new ModelRenderer(this, 73, 0);
    this.neck_armour.addBox(-7.0F, -1.5F, -18.0F, 15, 4, 18);
    this.neck_armour.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.neck_armour.setTextureSize(222, 256);
    this.neck_armour.mirror = true;
    setRotation(this.neck_armour, 0.1570796F, 0.0F, 0.0F);
    this.horn_base = new ModelRenderer(this, 49, 35);
    this.horn_base.addBox(-7.0F, -1.5F, -27.0F, 15, 5, 9);
    this.horn_base.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.horn_base.setTextureSize(222, 256);
    this.horn_base.mirror = true;
    setRotation(this.horn_base, 0.0872665F, 0.0F, 0.0F);
    this.horn_1 = new ModelRenderer(this, 122, 23);
    this.horn_1.addBox(-12.0F, -4.5F, -40.0F, 25, 6, 14);
    this.horn_1.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.horn_1.setTextureSize(222, 256);
    this.horn_1.mirror = true;
    setRotation(this.horn_1, 0.1919862F, 0.0F, 0.0F);
    this.horn_2 = new ModelRenderer(this, 106, 44);
    this.horn_2.addBox(-18.0F, -3.5F, -37.0F, 37, 4, 10);
    this.horn_2.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.horn_2.setTextureSize(222, 256);
    this.horn_2.mirror = true;
    setRotation(this.horn_2, 0.1919862F, 0.0F, 0.0F);
    this.horn_R = new ModelRenderer(this, 158, 0);
    this.horn_R.addBox(-26.0F, -5.5F, -38.5F, 8, 7, 13);
    this.horn_R.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.horn_R.setTextureSize(222, 256);
    this.horn_R.mirror = true;
    setRotation(this.horn_R, 0.1919862F, 0.0F, -0.0174533F);
    this.horn_L = new ModelRenderer(this, 158, 0);
    this.horn_L.addBox(19.0F, -5.5F, -38.5F, 8, 7, 13);
    this.horn_L.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.horn_L.setTextureSize(222, 256);
    this.horn_L.mirror = true;
    setRotation(this.horn_L, 0.1919862F, 0.0F, -0.0174533F);
    this.back_armour1 = new ModelRenderer(this, 0, 98);
    this.back_armour1.addBox(-5.0F, -2.5F, -6.0F, 9, 3, 7);
    this.back_armour1.setRotationPoint(1.0F, -4.0F, -15.0F);
    this.back_armour1.setTextureSize(222, 256);
    this.back_armour1.mirror = true;
    setRotation(this.back_armour1, -0.0872665F, 0.0F, 0.0F);
    this.back_armour_2 = new ModelRenderer(this, 0, 65);
    this.back_armour_2.addBox(-8.0F, -4.5F, -13.0F, 17, 4, 28);
    this.back_armour_2.setRotationPoint(0.0F, -1.0F, -3.0F);
    this.back_armour_2.setTextureSize(222, 256);
    this.back_armour_2.mirror = true;
    setRotation(this.back_armour_2, -0.122173F, 0.0F, 0.0F);
    this.back_armour_3 = new ModelRenderer(this, 15, 104);
    this.back_armour_3.addBox(0.5F, -3.5F, -13.0F, 4, 4, 20);
    this.back_armour_3.setRotationPoint(8.0F, 1.0F, -2.0F);
    this.back_armour_3.setTextureSize(222, 256);
    this.back_armour_3.mirror = true;
    setRotation(this.back_armour_3, 0.0174533F, 0.1570796F, 0.0F);
    this.back_armour_3R = new ModelRenderer(this, 15, 104);
    this.back_armour_3R.addBox(-3.5F, -3.5F, -13.0F, 4, 4, 20);
    this.back_armour_3R.setRotationPoint(-8.0F, 1.0F, -2.0F);
    this.back_armour_3R.setTextureSize(222, 256);
    this.back_armour_3R.mirror = true;
    setRotation(this.back_armour_3R, 0.0174533F, -0.1570796F, 0.0F);
    this.back_armour_4 = new ModelRenderer(this, 0, 65);
    this.back_armour_4.addBox(1.5F, -1.5F, -3.0F, 3, 4, 10);
    this.back_armour_4.setRotationPoint(6.0F, 5.0F, -10.0F);
    this.back_armour_4.setTextureSize(222, 256);
    this.back_armour_4.mirror = true;
    setRotation(this.back_armour_4, -0.1396263F, 0.3490659F, 0.0F);
    this.back_armour_4R = new ModelRenderer(this, 0, 65);
    this.back_armour_4R.addBox(-1.5F, -1.5F, -3.0F, 3, 4, 10);
    this.back_armour_4R.setRotationPoint(-8.0F, 5.0F, -11.0F);
    this.back_armour_4R.setTextureSize(222, 256);
    this.back_armour_4R.mirror = true;
    setRotation(this.back_armour_4R, -0.1396263F, -0.3490659F, 0.0F);
    this.tail = new ModelRenderer(this, 66, 52);
    this.tail.addBox(-2.0F, 0.0F, -3.0F, 5, 5, 3);
    this.tail.setRotationPoint(0.0F, 0.0F, 20.0F);
    this.tail.setTextureSize(222, 256);
    this.tail.mirror = true;
    setRotation(this.tail, 0.5061455F, 0.0F, 0.0F);
    this.leg_1R = new ModelRenderer(this, 71, 102);
    this.leg_1R.addBox(-2.5F, -2.5F, -3.0F, 5, 10, 6);
    this.leg_1R.setRotationPoint(-9.0F, 11.0F, -10.0F);
    this.leg_1R.setTextureSize(222, 256);
    this.leg_1R.mirror = true;
    setRotation(this.leg_1R, -0.0872665F, 0.0F, 0.0F);
    this.leg_1 = new ModelRenderer(this, 64, 76);
    this.leg_1.addBox(-1.5F, -2.5F, -3.0F, 5, 10, 6);
    this.leg_1.setRotationPoint(9.0F, 11.0F, -10.0F);
    this.leg_1.setTextureSize(222, 256);
    this.leg_1.mirror = true;
    setRotation(this.leg_1, -0.0872665F, 0.0F, 0.0F);
    this.leg_2 = new ModelRenderer(this, 98, 28);
    this.leg_2.addBox(-1.5F, -2.5F, -3.0F, 5, 9, 6);
    this.leg_2.setRotationPoint(9.0F, 12.0F, -2.0F);
    this.leg_2.setTextureSize(222, 256);
    this.leg_2.mirror = true;
    setRotation(this.leg_2, -0.0523599F, 0.0F, 0.0F);
    this.leg_2R = new ModelRenderer(this, 98, 80);
    this.leg_2R.addBox(-1.5F, -2.5F, -3.0F, 5, 9, 6);
    this.leg_2R.setRotationPoint(-10.0F, 12.0F, -2.0F);
    this.leg_2R.setTextureSize(222, 256);
    this.leg_2R.mirror = true;
    setRotation(this.leg_2R, -0.0523599F, 0.0F, 0.0F);
    this.leg_3R = new ModelRenderer(this, 44, 129);
    this.leg_3R.addBox(-3.5F, -2.5F, -3.0F, 5, 11, 8);
    this.leg_3R.setRotationPoint(-7.0F, 9.0F, 14.0F);
    this.leg_3R.setTextureSize(222, 256);
    this.leg_3R.mirror = true;
    setRotation(this.leg_3R, -0.3490659F, 0.0F, 0.0F);
    this.leg_3 = new ModelRenderer(this, 44, 99);
    this.leg_3.addBox(-3.5F, -2.5F, -3.0F, 5, 11, 8);
    this.leg_3.setRotationPoint(10.0F, 9.0F, 14.0F);
    this.leg_3.setTextureSize(222, 256);
    this.leg_3.mirror = true;
    setRotation(this.leg_3, -0.3490659F, 0.0F, 0.0F);
    this.leg_1Rb = new ModelRenderer(this, 15, 129);
    this.leg_1Rb.addBox(-2.0F, 5.5F, -3.0F, 4, 8, 5);
    this.leg_1Rb.setRotationPoint(-9.0F, 11.0F, -10.0F);
    this.leg_1Rb.setTextureSize(222, 256);
    this.leg_1Rb.mirror = true;
    setRotation(this.leg_1Rb, 0.0F, 0.0F, 0.0F);
    this.leg_1b = new ModelRenderer(this, 15, 110);
    this.leg_1b.addBox(-1.0F, 5.5F, -3.0F, 4, 8, 5);
    this.leg_1b.setRotationPoint(9.0F, 11.0F, -10.0F);
    this.leg_1b.setTextureSize(222, 256);
    this.leg_1b.mirror = true;
    setRotation(this.leg_1b, 0.0F, 0.0F, 0.0F);
    this.leg_2b = new ModelRenderer(this, 57, 1);
    this.leg_2b.addBox(-1.0F, 5.5F, -3.0F, 4, 7, 5);
    this.leg_2b.setRotationPoint(9.0F, 12.0F, -2.0F);
    this.leg_2b.setTextureSize(222, 256);
    this.leg_2b.mirror = true;
    setRotation(this.leg_2b, 0.0523599F, 0.0F, 0.0F);
    this.leg_2Rb = new ModelRenderer(this, 94, 106);
    this.leg_2Rb.addBox(-2.0F, 5.5F, -3.0F, 4, 7, 5);
    this.leg_2Rb.setRotationPoint(-9.0F, 12.0F, -2.0F);
    this.leg_2Rb.setTextureSize(222, 256);
    this.leg_2Rb.mirror = true;
    setRotation(this.leg_2Rb, 0.0523599F, 0.0F, 0.0F);
    this.leg_3Rb = new ModelRenderer(this, 122, 81);
    this.leg_3Rb.addBox(-2.0F, 6.5F, -5.0F, 4, 9, 5);
    this.leg_3Rb.setRotationPoint(-8.0F, 9.0F, 14.0F);
    this.leg_3Rb.setTextureSize(222, 256);
    this.leg_3Rb.mirror = true;
    setRotation(this.leg_3Rb, 0.122173F, 0.0F, 0.0F);
    this.leg_3b = new ModelRenderer(this, 122, 0);
    this.leg_3b.addBox(-3.0F, 6.5F, -5.0F, 4, 9, 5);
    this.leg_3b.setRotationPoint(10.0F, 9.0F, 14.0F);
    this.leg_3b.setTextureSize(222, 256);
    this.leg_3b.mirror = true;
    setRotation(this.leg_3b, 0.122173F, 0.0F, 0.0F);
    this.fan1 = new ModelRenderer(this, 0, 109);
    this.fan1.addBox(-1.0F, -7.0F, -34.0F, 4, 15, 1);
    this.fan1.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.fan1.setTextureSize(222, 256);
    this.fan1.mirror = true;
    setRotation(this.fan1, -0.1396263F, 0.0F, 0.0F);
    this.Lfan2 = new ModelRenderer(this, 0, 109);
    this.Lfan2.addBox(-1.0F, -3.0F, -31.5F, 4, 12, 1);
    this.Lfan2.setRotationPoint(0.0F, -1.0F, -14.0F);
    this.Lfan2.setTextureSize(222, 256);
    this.Lfan2.mirror = true;
    setRotation(this.Lfan2, -0.2094395F, -0.122173F, 0.0F);
    this.Rfan2 = new ModelRenderer(this, 0, 109);
    this.Rfan2.addBox(-1.0F, -3.0F, -33.5F, 4, 12, 1);
    this.Rfan2.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.Rfan2.setTextureSize(222, 256);
    this.Rfan2.mirror = true;
    setRotation(this.Rfan2, -0.2094395F, 0.122173F, 0.0F);
    this.Lfan3 = new ModelRenderer(this, 0, 109);
    this.Lfan3.addBox(-1.0F, 4.0F, -32.0F, 4, 9, 1);
    this.Lfan3.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.Lfan3.setTextureSize(222, 256);
    this.Lfan3.mirror = true;
    setRotation(this.Lfan3, -0.3316126F, -0.2268928F, 0.0F);
    this.Rfan3 = new ModelRenderer(this, 0, 109);
    this.Rfan3.addBox(-1.0F, 4.0F, -32.0F, 4, 9, 1);
    this.Rfan3.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.Rfan3.setTextureSize(222, 256);
    this.Rfan3.mirror = true;
    setRotation(this.Rfan3, -0.3316126F, 0.2443461F, 0.0F);
    this.Lear = new ModelRenderer(this, 0, 80);
    this.Lear.addBox(8.5F, 2.5F, -10.0F, 1, 1, 10);
    this.Lear.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.Lear.setTextureSize(222, 256);
    this.Lear.mirror = true;
    setRotation(this.Lear, 0.3665191F, 0.2268928F, 0.0F);
    this.Rear = new ModelRenderer(this, 0, 80);
    this.Rear.addBox(-8.5F, 2.5F, -11.0F, 1, 1, 10);
    this.Rear.setRotationPoint(0.0F, -1.0F, -12.0F);
    this.Rear.setTextureSize(222, 256);
    this.Rear.mirror = true;
    setRotation(this.Rear, 0.3665191F, -0.2268928F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Hammerhead e = (Hammerhead)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    float newangle2 = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F * f1;
      newangle2 = MathHelper.cos((float)((f2 * 1.3F * this.wingspeed) + 0.7853981633974483D)) * 3.1415927F * 0.1F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.leg_1.rotateAngleX = -0.087F + newangle;
    this.leg_1b.rotateAngleX = newangle;
    this.leg_1R.rotateAngleX = -0.087F - newangle;
    this.leg_1Rb.rotateAngleX = -newangle;
    this.leg_2.rotateAngleX = -0.052F + newangle2;
    this.leg_2b.rotateAngleX = newangle2;
    this.leg_2R.rotateAngleX = -0.052F - newangle2;
    this.leg_2Rb.rotateAngleX = -newangle2;
    this.leg_3.rotateAngleX = -0.349F - newangle;
    this.leg_3b.rotateAngleX = -newangle;
    this.leg_3R.rotateAngleX = -0.349F + newangle;
    this.leg_3Rb.rotateAngleX = newangle;
    this.neck.rotateAngleY = (float)Math.toRadians(f3) * 0.25F;
    this.neck_armour.rotateAngleY = this.neck.rotateAngleY;
    this.horn_base.rotateAngleY = this.neck.rotateAngleY;
    this.horn_1.rotateAngleY = this.neck.rotateAngleY;
    this.horn_2.rotateAngleY = this.neck.rotateAngleY;
    this.horn_L.rotateAngleY = this.neck.rotateAngleY;
    this.horn_R.rotateAngleY = this.neck.rotateAngleY;
    this.head.rotateAngleY = this.neck.rotateAngleY;
    this.snout.rotateAngleY = this.neck.rotateAngleY;
    this.fan1.rotateAngleY = this.neck.rotateAngleY;
    this.neck.rotateAngleY -= 0.122F;
    this.neck.rotateAngleY -= 0.226F;
    this.neck.rotateAngleY += 0.122F;
    this.neck.rotateAngleY += 0.226F;
    this.neck.rotateAngleY += 0.227F;
    this.neck.rotateAngleY -= 0.227F;
    newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.03F;
    this.back_armour_4.rotateAngleY = 0.349F + newangle;
    this.back_armour_4R.rotateAngleY = -0.349F - newangle;
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.13F;
    } else {
      newangle = 0.0F;
    } 
    this.neck.rotateAngleX = newangle + 0.157F;
    this.neck_armour.rotateAngleX = newangle + 0.157F;
    this.horn_base.rotateAngleX = newangle + 0.087F;
    this.horn_1.rotateAngleX = newangle + 0.192F;
    this.horn_2.rotateAngleX = newangle + 0.192F;
    this.horn_L.rotateAngleX = newangle + 0.192F;
    this.horn_R.rotateAngleX = newangle + 0.192F;
    this.head.rotateAngleX = newangle + 0.209F;
    this.snout.rotateAngleX = newangle + 0.611F;
    this.fan1.rotateAngleX = newangle - 0.139F;
    this.Lfan2.rotateAngleX = newangle - 0.209F;
    this.Lfan3.rotateAngleX = newangle - 0.331F;
    this.Rfan2.rotateAngleX = newangle - 0.209F;
    this.Rfan3.rotateAngleX = newangle - 0.331F;
    this.Lear.rotateAngleX = newangle + 0.366F;
    this.Rear.rotateAngleX = newangle + 0.366F;
    this.chest.render(f5);
    this.abdomen.render(f5);
    this.neck.render(f5);
    this.head.render(f5);
    this.snout.render(f5);
    this.neck_armour.render(f5);
    this.horn_base.render(f5);
    this.horn_1.render(f5);
    this.horn_2.render(f5);
    this.horn_R.render(f5);
    this.horn_L.render(f5);
    this.back_armour1.render(f5);
    this.back_armour_2.render(f5);
    this.back_armour_3.render(f5);
    this.back_armour_3R.render(f5);
    this.back_armour_4.render(f5);
    this.back_armour_4R.render(f5);
    this.tail.render(f5);
    this.leg_1R.render(f5);
    this.leg_1.render(f5);
    this.leg_2.render(f5);
    this.leg_2R.render(f5);
    this.leg_3R.render(f5);
    this.leg_3.render(f5);
    this.leg_1Rb.render(f5);
    this.leg_1b.render(f5);
    this.leg_2b.render(f5);
    this.leg_2Rb.render(f5);
    this.leg_3Rb.render(f5);
    this.leg_3b.render(f5);
    this.fan1.render(f5);
    this.Lfan2.render(f5);
    this.Rfan2.render(f5);
    this.Lfan3.render(f5);
    this.Rfan3.render(f5);
    this.Lear.render(f5);
    this.Rear.render(f5);
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
