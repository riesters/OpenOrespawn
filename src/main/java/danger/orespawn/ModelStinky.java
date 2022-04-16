package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelStinky extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer neck1;
  
  ModelRenderer neck;
  
  ModelRenderer neckbase;
  
  ModelRenderer head;
  
  ModelRenderer Rleg1;
  
  ModelRenderer Lleg1;
  
  ModelRenderer Lhorn1;
  
  ModelRenderer Rhorn1;
  
  ModelRenderer snout;
  
  ModelRenderer Lhorn2;
  
  ModelRenderer Rhorn2;
  
  ModelRenderer tail1;
  
  ModelRenderer Rleg2;
  
  ModelRenderer Lleg2;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer tail4;
  
  ModelRenderer Lwing;
  
  ModelRenderer Rwing;
  
  public ModelStinky(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 12);
    this.body.addBox(-4.5F, -3.0F, -5.0F, 8, 8, 10);
    this.body.setRotationPoint(0.5F, 15.0F, 1.0F);
    this.body.setTextureSize(128, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 0, 31);
    this.neck1.addBox(-2.0F, -3.0F, -2.0F, 4, 5, 5);
    this.neck1.setRotationPoint(0.0F, 16.0F, -5.0F);
    this.neck1.setTextureSize(128, 64);
    this.neck1.mirror = true;
    setRotation(this.neck1, 0.715585F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 0, 42);
    this.neck.addBox(-2.0F, -8.0F, -3.0F, 4, 8, 4);
    this.neck.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.neck.setTextureSize(128, 64);
    this.neck.mirror = true;
    setRotation(this.neck, 0.0F, 0.0F, 0.0F);
    this.neckbase = new ModelRenderer(this, 0, 55);
    this.neckbase.addBox(-3.0F, -4.0F, 0.0F, 6, 6, 3);
    this.neckbase.setRotationPoint(0.0F, 17.0F, 5.0F);
    this.neckbase.setTextureSize(128, 64);
    this.neckbase.mirror = true;
    setRotation(this.neckbase, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-2.5F, -10.0F, -3.5F, 5, 5, 5);
    this.head.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.head.setTextureSize(128, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.Rleg1 = new ModelRenderer(this, 19, 53);
    this.Rleg1.addBox(-1.5F, 0.0F, -1.0F, 3, 8, 3);
    this.Rleg1.setRotationPoint(2.0F, 16.0F, 5.5F);
    this.Rleg1.setTextureSize(128, 64);
    this.Rleg1.mirror = true;
    setRotation(this.Rleg1, 0.0F, 0.0F, 0.0F);
    this.Lleg1 = new ModelRenderer(this, 19, 53);
    this.Lleg1.addBox(-1.5F, 0.0F, -0.5F, 3, 8, 3);
    this.Lleg1.setRotationPoint(-2.0F, 16.0F, 5.0F);
    this.Lleg1.setTextureSize(128, 64);
    this.Lleg1.mirror = true;
    setRotation(this.Lleg1, 0.0F, 0.0F, 0.0F);
    this.Lhorn1 = new ModelRenderer(this, 19, 47);
    this.Lhorn1.addBox(-3.0F, -10.5F, -1.0F, 2, 2, 3);
    this.Lhorn1.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.Lhorn1.setTextureSize(128, 64);
    this.Lhorn1.mirror = true;
    setRotation(this.Lhorn1, 0.0F, 0.0F, 0.0F);
    this.Rhorn1 = new ModelRenderer(this, 19, 47);
    this.Rhorn1.addBox(1.0F, -10.5F, -1.0F, 2, 2, 3);
    this.Rhorn1.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.Rhorn1.setTextureSize(128, 64);
    this.Rhorn1.mirror = true;
    setRotation(this.Rhorn1, 0.0F, 0.0F, 0.0F);
    this.snout = new ModelRenderer(this, 32, 57);
    this.snout.addBox(-1.5F, -8.0F, -6.5F, 3, 3, 4);
    this.snout.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.snout.setTextureSize(128, 64);
    this.snout.mirror = true;
    setRotation(this.snout, 0.0F, 0.0F, 0.0F);
    this.Lhorn2 = new ModelRenderer(this, 19, 42);
    this.Lhorn2.addBox(-2.5F, -10.0F, 1.0F, 1, 1, 3);
    this.Lhorn2.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.Lhorn2.setTextureSize(128, 64);
    this.Lhorn2.mirror = true;
    setRotation(this.Lhorn2, 0.0F, 0.0F, 0.0F);
    this.Rhorn2 = new ModelRenderer(this, 19, 42);
    this.Rhorn2.addBox(1.5F, -10.0F, 1.0F, 1, 1, 3);
    this.Rhorn2.setRotationPoint(0.0F, 15.0F, -5.5F);
    this.Rhorn2.setTextureSize(128, 64);
    this.Rhorn2.mirror = true;
    setRotation(this.Rhorn2, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 47, 55);
    this.tail1.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 3);
    this.tail1.setRotationPoint(0.0F, 16.5F, -2.0F);
    this.tail1.setTextureSize(128, 64);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.Rleg2 = new ModelRenderer(this, 19, 53);
    this.Rleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3);
    this.Rleg2.setRotationPoint(2.0F, 16.0F, -3.0F);
    this.Rleg2.setTextureSize(128, 64);
    this.Rleg2.mirror = true;
    setRotation(this.Rleg2, 0.0F, 0.0F, 0.0F);
    this.Lleg2 = new ModelRenderer(this, 19, 53);
    this.Lleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3);
    this.Lleg2.setRotationPoint(-2.0F, 16.0F, -3.0F);
    this.Lleg2.setTextureSize(128, 64);
    this.Lleg2.mirror = true;
    setRotation(this.Lleg2, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 19, 31);
    this.tail2.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 5);
    this.tail2.setRotationPoint(0.0F, 16.0F, 7.0F);
    this.tail2.setTextureSize(128, 64);
    this.tail2.mirror = true;
    setRotation(this.tail2, -0.3839724F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 32, 46);
    this.tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.tail3.setRotationPoint(0.0F, 17.2F, 11.0F);
    this.tail3.setTextureSize(128, 64);
    this.tail3.mirror = true;
    setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 37, 13);
    this.tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5);
    this.tail4.setRotationPoint(0.0F, 17.5F, 14.0F);
    this.tail4.setTextureSize(128, 64);
    this.tail4.mirror = true;
    setRotation(this.tail4, -0.0698132F, 0.0F, 0.0F);
    this.Lwing = new ModelRenderer(this, 59, 0);
    this.Lwing.addBox(-18.0F, 0.0F, -5.0F, 18, 0, 10);
    this.Lwing.setRotationPoint(-2.0F, 12.6F, 0.0F);
    this.Lwing.setTextureSize(128, 64);
    this.Lwing.mirror = true;
    setRotation(this.Lwing, 0.0F, 0.0F, 0.4014257F);
    this.Rwing = new ModelRenderer(this, 59, 11);
    this.Rwing.addBox(0.0F, 0.0F, -5.0F, 18, 0, 10);
    this.Rwing.setRotationPoint(2.0F, 12.6F, 0.0F);
    this.Rwing.setTextureSize(128, 64);
    this.Rwing.mirror = true;
    setRotation(this.Rwing, 0.0F, 0.0F, -0.4014257F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Stinky c = (Stinky)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    int current_activity = c.getActivity();
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.3F * this.wingspeed) * 3.1415927F * 0.4F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.Rwing.rotateAngleZ = newangle - 0.4F;
    this.Lwing.rotateAngleZ = -newangle + 0.4F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    if (current_activity != 2) {
      this.Rleg1.rotateAngleX = newangle;
      this.Lleg1.rotateAngleX = -newangle;
      this.Rleg2.rotateAngleX = -newangle;
      this.Lleg2.rotateAngleX = newangle;
    } else {
      newangle = -1.0F;
      this.Rleg2.rotateAngleX = newangle;
      this.Lleg2.rotateAngleX = newangle;
      newangle = 1.0F;
      this.Rleg1.rotateAngleX = newangle;
      this.Lleg1.rotateAngleX = newangle;
    } 
    newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.2F;
    if (c.isSitting() == true)
      newangle = 0.0F; 
    this.tail2.rotateAngleY = newangle;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 4.0F;
    this.tail3.rotationPointX = this.tail2.rotationPointX + (float)Math.sin(this.tail2.rotateAngleY) * 4.0F - 0.5F;
    this.tail3.rotateAngleY = newangle * 1.6F;
    this.tail3.rotationPointZ += (float)Math.cos(this.tail3.rotateAngleY) * 3.0F;
    this.tail4.rotationPointX = this.tail3.rotationPointX + (float)Math.sin(this.tail3.rotateAngleY) * 3.0F - 0.5F;
    this.tail4.rotateAngleY = newangle * 2.6F;
    this.head.rotateAngleY = (float)Math.toRadians(f3);
    this.snout.rotateAngleY = (float)Math.toRadians(f3);
    this.neck.rotateAngleY = (float)Math.toRadians(f3) / 2.0F;
    this.Rhorn1.rotateAngleY = (float)Math.toRadians(f3);
    this.Rhorn2.rotateAngleY = (float)Math.toRadians(f3);
    this.Lhorn1.rotateAngleY = (float)Math.toRadians(f3);
    this.Lhorn2.rotateAngleY = (float)Math.toRadians(f3);
    this.head.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.snout.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.neck.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.Rhorn1.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.Rhorn2.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.Lhorn1.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.Lhorn2.rotateAngleX = (float)Math.toRadians(f4) / 3.0F;
    this.body.render(f5);
    this.neck1.render(f5);
    this.neck.render(f5);
    this.neckbase.render(f5);
    this.head.render(f5);
    this.Rleg1.render(f5);
    this.Lleg1.render(f5);
    this.Lhorn1.render(f5);
    this.Rhorn1.render(f5);
    this.snout.render(f5);
    this.Lhorn2.render(f5);
    this.Rhorn2.render(f5);
    this.tail1.render(f5);
    this.Rleg2.render(f5);
    this.Lleg2.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
    this.Lwing.render(f5);
    this.Rwing.render(f5);
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
