package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPointysaurus extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer lfleg;
  
  ModelRenderer rfleg;
  
  ModelRenderer lrleg;
  
  ModelRenderer rrleg;
  
  ModelRenderer body1;
  
  ModelRenderer head;
  
  ModelRenderer body2;
  
  ModelRenderer body3;
  
  ModelRenderer guard;
  
  ModelRenderer nose;
  
  ModelRenderer lhorn;
  
  ModelRenderer rhorn;
  
  ModelRenderer chorn;
  
  ModelRenderer tail;
  
  ModelRenderer bump1;
  
  ModelRenderer bump2;
  
  ModelRenderer bump3;
  
  ModelRenderer bump4;
  
  ModelRenderer bump5;
  
  ModelRenderer bump6;
  
  ModelRenderer bump7;
  
  ModelRenderer bump8;
  
  ModelRenderer bump9;
  
  ModelRenderer bump10;
  
  ModelRenderer bump11;
  
  ModelRenderer bump12;
  
  ModelRenderer bump13;
  
  ModelRenderer bump14;
  
  ModelRenderer bump15;
  
  ModelRenderer bump16;
  
  public ModelPointysaurus(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.lfleg = new ModelRenderer(this, 102, 66);
    this.lfleg.addBox(-3.0F, 0.0F, -3.0F, 6, 8, 6);
    this.lfleg.setRotationPoint(9.0F, 16.0F, -8.0F);
    this.lfleg.setTextureSize(128, 128);
    this.lfleg.mirror = true;
    setRotation(this.lfleg, 0.0F, 0.0F, 0.0F);
    this.rfleg = new ModelRenderer(this, 102, 66);
    this.rfleg.addBox(-3.0F, 0.0F, -3.0F, 6, 8, 6);
    this.rfleg.setRotationPoint(-9.0F, 16.0F, -8.0F);
    this.rfleg.setTextureSize(128, 128);
    this.rfleg.mirror = true;
    setRotation(this.rfleg, 0.0F, 0.0F, 0.0F);
    this.lrleg = new ModelRenderer(this, 0, 0);
    this.lrleg.addBox(-4.0F, 0.0F, -4.0F, 8, 8, 8);
    this.lrleg.setRotationPoint(9.0F, 16.0F, 12.0F);
    this.lrleg.setTextureSize(128, 128);
    this.lrleg.mirror = true;
    setRotation(this.lrleg, 0.0F, 0.0F, 0.0F);
    this.rrleg = new ModelRenderer(this, 0, 0);
    this.rrleg.addBox(-4.0F, 0.0F, -4.0F, 8, 8, 8);
    this.rrleg.setRotationPoint(-9.0F, 16.0F, 12.0F);
    this.rrleg.setTextureSize(128, 128);
    this.rrleg.mirror = true;
    setRotation(this.rrleg, 0.0F, 0.0F, 0.0F);
    this.body1 = new ModelRenderer(this, 0, 87);
    this.body1.addBox(-4.0F, 0.0F, 0.0F, 22, 9, 30);
    this.body1.setRotationPoint(-7.0F, 9.0F, -12.0F);
    this.body1.setTextureSize(128, 128);
    this.body1.mirror = true;
    setRotation(this.body1, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 70, 0);
    this.head.addBox(-6.0F, -10.0F, -12.0F, 12, 10, 12);
    this.head.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.head.setTextureSize(128, 128);
    this.head.mirror = true;
    setRotation(this.head, -0.1919862F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 63);
    this.body2.addBox(-9.0F, 0.0F, 0.0F, 18, 7, 15);
    this.body2.setRotationPoint(0.0F, 2.0F, -9.0F);
    this.body2.setTextureSize(128, 128);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 0, 44);
    this.body3.addBox(-8.0F, 0.0F, 0.0F, 16, 6, 11);
    this.body3.setRotationPoint(0.0F, 3.0F, 6.0F);
    this.body3.setTextureSize(128, 128);
    this.body3.mirror = true;
    setRotation(this.body3, 0.0F, 0.0F, 0.0F);
    this.guard = new ModelRenderer(this, 60, 34);
    this.guard.addBox(-14.0F, -20.0F, -8.0F, 28, 23, 3);
    this.guard.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.guard.setTextureSize(128, 128);
    this.guard.mirror = true;
    setRotation(this.guard, -0.2617994F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 39, 0);
    this.nose.addBox(-5.0F, -9.0F, -15.0F, 10, 6, 5);
    this.nose.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.nose.setTextureSize(128, 128);
    this.nose.mirror = true;
    setRotation(this.nose, 0.0F, 0.0F, 0.0F);
    this.lhorn = new ModelRenderer(this, 0, 18);
    this.lhorn.addBox(8.0F, -16.0F, -29.0F, 2, 2, 23);
    this.lhorn.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.lhorn.setTextureSize(128, 128);
    this.lhorn.mirror = true;
    setRotation(this.lhorn, -0.1570796F, -0.1396263F, 0.0F);
    this.rhorn = new ModelRenderer(this, 0, 18);
    this.rhorn.addBox(-9.0F, -16.0F, -29.0F, 2, 2, 23);
    this.rhorn.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.rhorn.setTextureSize(128, 128);
    this.rhorn.mirror = true;
    setRotation(this.rhorn, -0.1570796F, 0.1396263F, 0.0F);
    this.chorn = new ModelRenderer(this, 52, 13);
    this.chorn.addBox(-1.5F, -9.0F, -20.0F, 3, 3, 5);
    this.chorn.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.chorn.setTextureSize(128, 128);
    this.chorn.mirror = true;
    setRotation(this.chorn, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 68, 70);
    this.tail.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 9);
    this.tail.setRotationPoint(0.0F, 7.0F, 15.0F);
    this.tail.setTextureSize(128, 128);
    this.tail.mirror = true;
    setRotation(this.tail, 0.2792527F, 0.0F, 0.0F);
    this.bump1 = new ModelRenderer(this, 57, 17);
    this.bump1.addBox(14.0F, -20.0F, -8.0F, 2, 2, 2);
    this.bump1.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump1.setTextureSize(128, 128);
    this.bump1.mirror = true;
    setRotation(this.bump1, -0.2617994F, 0.0F, 0.0F);
    this.bump2 = new ModelRenderer(this, 57, 17);
    this.bump2.addBox(14.0F, -15.0F, -8.0F, 2, 2, 2);
    this.bump2.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump2.setTextureSize(128, 128);
    this.bump2.mirror = true;
    setRotation(this.bump2, -0.2617994F, 0.0F, 0.0F);
    this.bump3 = new ModelRenderer(this, 57, 17);
    this.bump3.addBox(14.0F, -10.0F, -8.0F, 2, 2, 2);
    this.bump3.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump3.setTextureSize(128, 128);
    this.bump3.mirror = true;
    setRotation(this.bump3, -0.2617994F, 0.0F, 0.0F);
    this.bump4 = new ModelRenderer(this, 57, 17);
    this.bump4.addBox(14.0F, -5.0F, -8.0F, 2, 2, 2);
    this.bump4.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump4.setTextureSize(128, 128);
    this.bump4.mirror = true;
    setRotation(this.bump4, -0.2617994F, 0.0F, 0.0F);
    this.bump5 = new ModelRenderer(this, 57, 17);
    this.bump5.addBox(14.0F, 0.0F, -8.0F, 2, 2, 2);
    this.bump5.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump5.setTextureSize(128, 128);
    this.bump5.mirror = true;
    setRotation(this.bump5, -0.2617994F, 0.0F, 0.0F);
    this.bump6 = new ModelRenderer(this, 57, 17);
    this.bump6.addBox(-16.0F, -20.0F, -8.0F, 2, 2, 2);
    this.bump6.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump6.setTextureSize(128, 128);
    this.bump6.mirror = true;
    setRotation(this.bump6, -0.2617994F, 0.0F, 0.0F);
    this.bump7 = new ModelRenderer(this, 57, 17);
    this.bump7.addBox(-16.0F, -15.0F, -8.0F, 2, 2, 2);
    this.bump7.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump7.setTextureSize(128, 128);
    this.bump7.mirror = true;
    setRotation(this.bump7, -0.2617994F, 0.0F, 0.0F);
    this.bump8 = new ModelRenderer(this, 57, 17);
    this.bump8.addBox(-16.0F, -10.0F, -8.0F, 2, 2, 2);
    this.bump8.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump8.setTextureSize(128, 128);
    this.bump8.mirror = true;
    setRotation(this.bump8, -0.2617994F, 0.0F, 0.0F);
    this.bump9 = new ModelRenderer(this, 57, 17);
    this.bump9.addBox(-16.0F, -5.0F, -8.0F, 2, 2, 2);
    this.bump9.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump9.setTextureSize(128, 128);
    this.bump9.mirror = true;
    setRotation(this.bump9, -0.2617994F, 0.0F, 0.0F);
    this.bump10 = new ModelRenderer(this, 57, 17);
    this.bump10.addBox(-16.0F, 0.0F, -8.0F, 2, 2, 2);
    this.bump10.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump10.setTextureSize(128, 128);
    this.bump10.mirror = true;
    setRotation(this.bump10, -0.2617994F, 0.0F, 0.0F);
    this.bump11 = new ModelRenderer(this, 57, 17);
    this.bump11.addBox(12.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump11.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump11.setTextureSize(128, 128);
    this.bump11.mirror = true;
    setRotation(this.bump11, -0.2617994F, 0.0F, 0.0F);
    this.bump12 = new ModelRenderer(this, 57, 17);
    this.bump12.addBox(7.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump12.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump12.setTextureSize(128, 128);
    this.bump12.mirror = true;
    setRotation(this.bump12, -0.2617994F, 0.0F, 0.0F);
    this.bump13 = new ModelRenderer(this, 57, 17);
    this.bump13.addBox(2.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump13.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump13.setTextureSize(128, 128);
    this.bump13.mirror = true;
    setRotation(this.bump13, -0.2617994F, 0.0F, 0.0F);
    this.bump14 = new ModelRenderer(this, 57, 17);
    this.bump14.addBox(-4.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump14.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump14.setTextureSize(128, 128);
    this.bump14.mirror = true;
    setRotation(this.bump14, -0.2617994F, 0.0F, 0.0F);
    this.bump15 = new ModelRenderer(this, 57, 17);
    this.bump15.addBox(-9.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump15.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump15.setTextureSize(128, 128);
    this.bump15.mirror = true;
    setRotation(this.bump15, -0.2617994F, 0.0F, 0.0F);
    this.bump16 = new ModelRenderer(this, 57, 17);
    this.bump16.addBox(-14.0F, -22.0F, -8.0F, 2, 2, 2);
    this.bump16.setRotationPoint(0.0F, 11.0F, -7.0F);
    this.bump16.setTextureSize(128, 128);
    this.bump16.mirror = true;
    setRotation(this.bump16, -0.2617994F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Pointysaurus e = (Pointysaurus)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lfleg.rotateAngleX = newangle;
    this.rrleg.rotateAngleX = newangle;
    this.rfleg.rotateAngleX = -newangle;
    this.lrleg.rotateAngleX = -newangle;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.45F;
    this.nose.rotateAngleY = this.head.rotateAngleY;
    this.chorn.rotateAngleY = this.head.rotateAngleY;
    this.head.rotateAngleY -= 0.14F;
    this.head.rotateAngleY += 0.14F;
    this.guard.rotateAngleY = this.head.rotateAngleY;
    this.bump1.rotateAngleY = this.head.rotateAngleY;
    this.bump2.rotateAngleY = this.head.rotateAngleY;
    this.bump3.rotateAngleY = this.head.rotateAngleY;
    this.bump4.rotateAngleY = this.head.rotateAngleY;
    this.bump5.rotateAngleY = this.head.rotateAngleY;
    this.bump6.rotateAngleY = this.head.rotateAngleY;
    this.bump7.rotateAngleY = this.head.rotateAngleY;
    this.bump8.rotateAngleY = this.head.rotateAngleY;
    this.bump9.rotateAngleY = this.head.rotateAngleY;
    this.bump10.rotateAngleY = this.head.rotateAngleY;
    this.bump11.rotateAngleY = this.head.rotateAngleY;
    this.bump12.rotateAngleY = this.head.rotateAngleY;
    this.bump13.rotateAngleY = this.head.rotateAngleY;
    this.bump14.rotateAngleY = this.head.rotateAngleY;
    this.bump15.rotateAngleY = this.head.rotateAngleY;
    this.bump16.rotateAngleY = this.head.rotateAngleY;
    this.head.rotateAngleX = (float)Math.toRadians(f4) * 0.45F;
    this.nose.rotateAngleX = this.head.rotateAngleX;
    this.chorn.rotateAngleX = this.head.rotateAngleX;
    this.head.rotateAngleX -= 0.16F;
    this.head.rotateAngleX -= 0.16F;
    this.head.rotateAngleX -= 0.262F;
    this.bump1.rotateAngleX = this.guard.rotateAngleX;
    this.bump2.rotateAngleX = this.guard.rotateAngleX;
    this.bump3.rotateAngleX = this.guard.rotateAngleX;
    this.bump4.rotateAngleX = this.guard.rotateAngleX;
    this.bump5.rotateAngleX = this.guard.rotateAngleX;
    this.bump6.rotateAngleX = this.guard.rotateAngleX;
    this.bump7.rotateAngleX = this.guard.rotateAngleX;
    this.bump8.rotateAngleX = this.guard.rotateAngleX;
    this.bump9.rotateAngleX = this.guard.rotateAngleX;
    this.bump10.rotateAngleX = this.guard.rotateAngleX;
    this.bump11.rotateAngleX = this.guard.rotateAngleX;
    this.bump12.rotateAngleX = this.guard.rotateAngleX;
    this.bump13.rotateAngleX = this.guard.rotateAngleX;
    this.bump14.rotateAngleX = this.guard.rotateAngleX;
    this.bump15.rotateAngleX = this.guard.rotateAngleX;
    this.bump16.rotateAngleX = this.guard.rotateAngleX;
    if (e.getAttacking() != 0) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
    } else {
      newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.05F;
    } 
    this.tail.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.02F * this.wingspeed) * 3.1415927F * 0.15F;
    this.tail.rotateAngleX = newangle + 0.28F;
    this.lfleg.render(f5);
    this.rfleg.render(f5);
    this.lrleg.render(f5);
    this.rrleg.render(f5);
    this.body1.render(f5);
    this.head.render(f5);
    this.body2.render(f5);
    this.body3.render(f5);
    this.guard.render(f5);
    this.nose.render(f5);
    this.lhorn.render(f5);
    this.rhorn.render(f5);
    this.chorn.render(f5);
    this.tail.render(f5);
    this.bump1.render(f5);
    this.bump2.render(f5);
    this.bump3.render(f5);
    this.bump4.render(f5);
    this.bump5.render(f5);
    this.bump6.render(f5);
    this.bump7.render(f5);
    this.bump8.render(f5);
    this.bump9.render(f5);
    this.bump10.render(f5);
    this.bump11.render(f5);
    this.bump12.render(f5);
    this.bump13.render(f5);
    this.bump14.render(f5);
    this.bump15.render(f5);
    this.bump16.render(f5);
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
