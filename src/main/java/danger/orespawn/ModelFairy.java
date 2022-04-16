package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelFairy extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer head;
  
  ModelRenderer chest;
  
  ModelRenderer waist;
  
  ModelRenderer hips;
  
  ModelRenderer lleg1;
  
  ModelRenderer lleg2;
  
  ModelRenderer rleg;
  
  ModelRenderer b1;
  
  ModelRenderer b2;
  
  ModelRenderer larm;
  
  ModelRenderer rarm;
  
  ModelRenderer lwing2;
  
  ModelRenderer lwing1;
  
  ModelRenderer rwing2;
  
  ModelRenderer rwing1;
  
  public ModelFairy(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-2.5F, -5.0F, -2.5F, 5, 5, 5);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.chest = new ModelRenderer(this, 31, 5);
    this.chest.addBox(-3.5F, 0.0F, -1.0F, 7, 4, 3);
    this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.chest.setTextureSize(64, 64);
    this.chest.mirror = true;
    setRotation(this.chest, 0.0F, 0.0F, 0.0F);
    this.waist = new ModelRenderer(this, 33, 13);
    this.waist.addBox(-2.5F, 4.0F, -1.0F, 5, 3, 3);
    this.waist.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.waist.setTextureSize(64, 64);
    this.waist.mirror = true;
    setRotation(this.waist, 0.0F, 0.0F, 0.0F);
    this.hips = new ModelRenderer(this, 31, 20);
    this.hips.addBox(-3.0F, 7.0F, -1.0F, 6, 4, 4);
    this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hips.setTextureSize(64, 64);
    this.hips.mirror = true;
    setRotation(this.hips, 0.0F, 0.0F, 0.0F);
    this.lleg1 = new ModelRenderer(this, 53, 8);
    this.lleg1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2);
    this.lleg1.setRotationPoint(1.0F, 10.0F, 0.0F);
    this.lleg1.setTextureSize(64, 64);
    this.lleg1.mirror = true;
    setRotation(this.lleg1, -0.7853982F, 0.0F, 0.0F);
    this.lleg2 = new ModelRenderer(this, 53, 18);
    this.lleg2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    this.lleg2.setRotationPoint(1.0F, 15.0F, -5.0F);
    this.lleg2.setTextureSize(64, 64);
    this.lleg2.mirror = true;
    setRotation(this.lleg2, 0.7679449F, 0.0F, 0.0F);
    this.rleg = new ModelRenderer(this, 51, 30);
    this.rleg.addBox(-3.0F, 0.0F, 0.0F, 2, 13, 2);
    this.rleg.setRotationPoint(0.0F, 11.0F, 0.0F);
    this.rleg.setTextureSize(64, 64);
    this.rleg.mirror = true;
    setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
    this.b1 = new ModelRenderer(this, 42, 1);
    this.b1.addBox(1.0F, 1.0F, -2.0F, 2, 2, 1);
    this.b1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.b1.setTextureSize(64, 64);
    this.b1.mirror = true;
    setRotation(this.b1, 0.0F, 0.0F, 0.0F);
    this.b2 = new ModelRenderer(this, 32, 1);
    this.b2.addBox(-3.0F, 2.0F, -2.0F, 2, 2, 1);
    this.b2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b2.setTextureSize(64, 64);
    this.b2.mirror = true;
    setRotation(this.b2, 0.0F, 0.0F, 0.0F);
    this.larm = new ModelRenderer(this, 7, 14);
    this.larm.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.larm.setRotationPoint(3.0F, 0.0F, 0.0F);
    this.larm.setTextureSize(64, 64);
    this.larm.mirror = true;
    setRotation(this.larm, -0.0174533F, 0.0F, -0.122173F);
    this.rarm = new ModelRenderer(this, 2, 14);
    this.rarm.addBox(-1.0F, 0.0F, 0.0F, 1, 10, 1);
    this.rarm.setRotationPoint(-3.0F, 0.0F, 0.0F);
    this.rarm.setTextureSize(64, 64);
    this.rarm.mirror = true;
    setRotation(this.rarm, -0.0174533F, 0.0F, 0.122173F);
    this.lwing2 = new ModelRenderer(this, 0, 47);
    this.lwing2.addBox(0.0F, -9.0F, 0.0F, 26, 16, 0);
    this.lwing2.setRotationPoint(2.0F, 0.0F, 2.0F);
    this.lwing2.setTextureSize(64, 64);
    this.lwing2.mirror = true;
    setRotation(this.lwing2, 0.0F, -0.5934119F, 0.0F);
    this.lwing1 = new ModelRenderer(this, 0, 30);
    this.lwing1.addBox(0.0F, -7.0F, 0.0F, 24, 16, 0);
    this.lwing1.setRotationPoint(2.0F, 3.0F, 2.0F);
    this.lwing1.setTextureSize(64, 64);
    this.lwing1.mirror = true;
    setRotation(this.lwing1, 0.0F, -0.8203047F, 0.0F);
    this.rwing2 = new ModelRenderer(this, 0, 30);
    this.rwing2.addBox(0.0F, -7.0F, 0.0F, 24, 16, 0);
    this.rwing2.setRotationPoint(-2.0F, 3.0F, 2.0F);
    this.rwing2.setTextureSize(64, 64);
    this.rwing2.mirror = true;
    setRotation(this.rwing2, 0.0F, -2.356194F, 0.0F);
    this.rwing1 = new ModelRenderer(this, 0, 47);
    this.rwing1.addBox(0.0F, -9.0F, 0.0F, 26, 16, 0);
    this.rwing1.setRotationPoint(-2.0F, 0.0F, 2.0F);
    this.rwing1.setTextureSize(64, 64);
    this.rwing1.mirror = true;
    setRotation(this.rwing1, 0.0F, -2.548181F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Fairy fly = (Fairy)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float onoff = 0.0F;
    this.lwing1.rotateAngleY = -0.6F + MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.35F;
    this.rwing1.rotateAngleY = -2.55F - MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.35F;
    this.lwing2.rotateAngleY = -0.6F + MathHelper.cos(f2 * this.wingspeed * 0.85F) * 3.1415927F * 0.25F;
    this.rwing2.rotateAngleY = -2.55F - MathHelper.cos(f2 * this.wingspeed * 0.85F) * 3.1415927F * 0.25F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.45F;
    if (this.head.rotateAngleY > 0.45F)
      this.head.rotateAngleY = 0.45F; 
    if (this.head.rotateAngleY < -0.45F)
      this.head.rotateAngleY = -0.45F; 
    this.head.rotateAngleX = (float)Math.toRadians(f4);
    this.larm.rotateAngleX = -0.2F + MathHelper.cos(f2 * this.wingspeed * 0.15F) * 3.1415927F * 0.05F;
    this.rarm.rotateAngleX = -0.2F + MathHelper.cos(f2 * this.wingspeed * 0.12F) * 3.1415927F * 0.05F;
    this.larm.rotateAngleZ = -0.15F + MathHelper.cos(f2 * this.wingspeed * 0.1F) * 3.1415927F * 0.03F;
    this.rarm.rotateAngleZ = 0.15F + MathHelper.cos(f2 * this.wingspeed * 0.11F) * 3.1415927F * 0.03F;
    this.lwing2.render(f5);
    this.lwing1.render(f5);
    this.rwing2.render(f5);
    this.rwing1.render(f5);
    onoff = fly.getBlink();
    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, onoff, 240.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.head.render(f5);
    this.chest.render(f5);
    this.waist.render(f5);
    this.hips.render(f5);
    this.lleg1.render(f5);
    this.lleg2.render(f5);
    this.rleg.render(f5);
    this.b1.render(f5);
    this.b2.render(f5);
    this.larm.render(f5);
    this.rarm.render(f5);
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
