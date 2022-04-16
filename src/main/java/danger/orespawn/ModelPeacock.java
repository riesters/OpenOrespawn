package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPeacock extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer lleg;
  
  ModelRenderer rleg;
  
  ModelRenderer body;
  
  ModelRenderer neck;
  
  ModelRenderer head1;
  
  ModelRenderer head2;
  
  ModelRenderer hf1;
  
  ModelRenderer hf2;
  
  ModelRenderer hf3;
  
  ModelRenderer tailf1;
  
  ModelRenderer tailf2;
  
  ModelRenderer tailf3;
  
  ModelRenderer tailf4;
  
  ModelRenderer tailf5;
  
  ModelRenderer tailf6;
  
  ModelRenderer tailf7;
  
  public ModelPeacock(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.lleg = new ModelRenderer(this, 0, 20);
    this.lleg.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.lleg.setRotationPoint(1.0F, 17.0F, 0.0F);
    this.lleg.setTextureSize(128, 128);
    this.lleg.mirror = true;
    setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
    this.rleg = new ModelRenderer(this, 5, 20);
    this.rleg.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.rleg.setRotationPoint(-1.0F, 17.0F, 0.0F);
    this.rleg.setTextureSize(128, 128);
    this.rleg.mirror = true;
    setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 88, 0);
    this.body.addBox(-2.0F, -2.0F, -5.0F, 5, 4, 11);
    this.body.setRotationPoint(0.0F, 15.0F, 1.0F);
    this.body.setTextureSize(128, 128);
    this.body.mirror = true;
    setRotation(this.body, -0.1396263F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 70, 0);
    this.neck.addBox(-0.5F, -1.0F, -6.0F, 2, 2, 6);
    this.neck.setRotationPoint(0.0F, 14.0F, -3.0F);
    this.neck.setTextureSize(128, 128);
    this.neck.mirror = true;
    setRotation(this.neck, -0.5585054F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 56, 0);
    this.head1.addBox(-0.5F, -2.0F, -2.0F, 2, 2, 4);
    this.head1.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.head1.setTextureSize(128, 128);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 48, 0);
    this.head2.addBox(0.0F, -1.0F, -4.0F, 1, 1, 2);
    this.head2.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.head2.setTextureSize(128, 128);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.hf1 = new ModelRenderer(this, 8, 0);
    this.hf1.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
    this.hf1.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.hf1.setTextureSize(128, 128);
    this.hf1.mirror = true;
    setRotation(this.hf1, 0.4014257F, 0.0F, 0.0F);
    this.hf2 = new ModelRenderer(this, 8, 0);
    this.hf2.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
    this.hf2.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.hf2.setTextureSize(128, 128);
    this.hf2.mirror = true;
    setRotation(this.hf2, -0.1745329F, 0.0F, 0.0F);
    this.hf3 = new ModelRenderer(this, 8, 0);
    this.hf3.addBox(0.5F, -9.0F, -1.5F, 0, 7, 3);
    this.hf3.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.hf3.setTextureSize(128, 128);
    this.hf3.mirror = true;
    setRotation(this.hf3, -0.6981317F, 0.0F, 0.0F);
    this.tailf1 = new ModelRenderer(this, 0, 50);
    this.tailf1.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf1.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf1.setTextureSize(128, 128);
    this.tailf1.mirror = true;
    setRotation(this.tailf1, 0.0F, 0.0F, 0.0F);
    this.tailf2 = new ModelRenderer(this, 0, 50);
    this.tailf2.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf2.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf2.setTextureSize(128, 128);
    this.tailf2.mirror = true;
    setRotation(this.tailf2, 0.0F, 0.0F, 0.0F);
    this.tailf3 = new ModelRenderer(this, 0, 50);
    this.tailf3.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf3.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf3.setTextureSize(128, 128);
    this.tailf3.mirror = true;
    setRotation(this.tailf3, 0.0F, 0.0F, 0.0F);
    this.tailf4 = new ModelRenderer(this, 0, 50);
    this.tailf4.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf4.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf4.setTextureSize(128, 128);
    this.tailf4.mirror = true;
    setRotation(this.tailf4, 0.0F, 0.0F, 0.0F);
    this.tailf5 = new ModelRenderer(this, 0, 50);
    this.tailf5.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf5.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf5.setTextureSize(128, 128);
    this.tailf5.mirror = true;
    setRotation(this.tailf5, 0.0F, 0.0F, 0.0F);
    this.tailf6 = new ModelRenderer(this, 0, 50);
    this.tailf6.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf6.setRotationPoint(0.5F, 14.0F, 7.0F);
    this.tailf6.setTextureSize(128, 128);
    this.tailf6.mirror = true;
    setRotation(this.tailf6, 0.0F, 0.0F, 0.0F);
    this.tailf7 = new ModelRenderer(this, 0, 50);
    this.tailf7.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 30);
    this.tailf7.setRotationPoint(0.514F, 14.0F, 7.0F);
    this.tailf7.setTextureSize(128, 128);
    this.tailf7.mirror = true;
    setRotation(this.tailf7, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Peacock p = (Peacock)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.15F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lleg.rotateAngleX = newangle;
    this.rleg.rotateAngleX = -newangle;
    if (p.getBlink() > 0) {
      this.hf1.rotateAngleX = 0.401F;
      this.hf2.rotateAngleX = -0.174F;
      this.hf3.rotateAngleX = -0.698F;
      this.tailf1.rotateAngleX = 1.047F;
      this.tailf2.rotateAngleX = 1.047F;
      this.tailf3.rotateAngleX = 1.047F;
      this.tailf4.rotateAngleX = 1.047F;
      this.tailf5.rotateAngleX = 1.047F;
      this.tailf6.rotateAngleX = 1.047F;
      this.tailf7.rotateAngleX = 1.047F;
      this.tailf1.rotateAngleZ = -0.4F;
      this.tailf2.rotateAngleZ = -0.8F;
      this.tailf3.rotateAngleZ = -1.2F;
      this.tailf4.rotateAngleZ = 0.4F;
      this.tailf5.rotateAngleZ = 0.8F;
      this.tailf6.rotateAngleZ = 1.2F;
    } else {
      this.hf1.rotateAngleX = -1.06F;
      this.hf2.rotateAngleX = -1.06F;
      this.hf3.rotateAngleX = -1.06F;
      this.tailf1.rotateAngleX = 0.0F;
      this.tailf2.rotateAngleX = 0.0F;
      this.tailf3.rotateAngleX = 0.0F;
      this.tailf4.rotateAngleX = 0.0F;
      this.tailf5.rotateAngleX = 0.0F;
      this.tailf6.rotateAngleX = 0.0F;
      this.tailf7.rotateAngleX = 0.0F;
      this.tailf1.rotateAngleZ = 0.0F;
      this.tailf2.rotateAngleZ = 0.0F;
      this.tailf3.rotateAngleZ = 0.0F;
      this.tailf4.rotateAngleZ = 0.0F;
      this.tailf5.rotateAngleZ = 0.0F;
      this.tailf6.rotateAngleZ = 0.0F;
    } 
    this.lleg.render(f5);
    this.rleg.render(f5);
    this.body.render(f5);
    this.neck.render(f5);
    this.head1.render(f5);
    this.head2.render(f5);
    this.hf1.render(f5);
    this.hf2.render(f5);
    this.hf3.render(f5);
    this.tailf1.render(f5);
    this.tailf2.render(f5);
    this.tailf3.render(f5);
    this.tailf4.render(f5);
    this.tailf5.render(f5);
    this.tailf6.render(f5);
    this.tailf7.render(f5);
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
