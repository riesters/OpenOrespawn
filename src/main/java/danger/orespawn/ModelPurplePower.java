package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelPurplePower extends ModelBase {
  float wingspeed = 1.0F;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  public ModelPurplePower(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 12);
    this.Shape1.addBox(-2.0F, -0.5F, -0.5F, 4, 1, 1);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 7);
    this.Shape2.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1);
    this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    PurplePower p = (PurplePower)entity;
    float rf1 = 1.0F;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.55F);
    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
    rf1 = p.worldObj.rand.nextFloat() * 360.0F;
    GL11.glRotatef(rf1, 1.0F, 0.0F, 0.0F);
    int i;
    for (i = 0; i < 6; i++) {
      this.Shape1.rotateAngleZ = newangle;
      this.Shape1.render(f5);
      newangle += 1.0471976F;
    } 
    GL11.glRotatef(rf1, 1.0F, 0.0F, 0.0F);
    newangle = 0.0F;
    rf1 = p.worldObj.rand.nextFloat() * 360.0F;
    GL11.glRotatef(rf1, 0.0F, 1.0F, 0.0F);
    for (i = 0; i < 6; i++) {
      this.Shape2.rotateAngleZ = newangle;
      this.Shape2.render(f5);
      newangle += 1.0471976F;
    } 
    GL11.glRotatef(rf1, 0.0F, 1.0F, 0.0F);
    newangle = 0.0F;
    rf1 = p.worldObj.rand.nextFloat() * 360.0F;
    GL11.glRotatef(rf1, 0.0F, 0.0F, 1.0F);
    for (i = 0; i < 6; i++) {
      this.Shape3.rotateAngleZ = newangle;
      this.Shape3.render(f5);
      newangle += 1.0471976F;
    } 
    GL11.glRotatef(rf1, 0.0F, 0.0F, 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
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
}
