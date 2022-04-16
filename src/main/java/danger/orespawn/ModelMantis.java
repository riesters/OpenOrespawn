package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMantis extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer lfleg1;
  
  ModelRenderer lfleg2;
  
  ModelRenderer lfleg3;
  
  ModelRenderer lfleg4;
  
  ModelRenderer lrleg1;
  
  ModelRenderer lrleg2;
  
  ModelRenderer lrleg3;
  
  ModelRenderer lrleg4;
  
  ModelRenderer abdomen;
  
  ModelRenderer thorax;
  
  ModelRenderer neck1;
  
  ModelRenderer neck2;
  
  ModelRenderer head1;
  
  ModelRenderer head2;
  
  ModelRenderer leye;
  
  ModelRenderer reye;
  
  ModelRenderer lantenna;
  
  ModelRenderer rantenna;
  
  ModelRenderer larm1;
  
  ModelRenderer larm2;
  
  ModelRenderer larm3;
  
  ModelRenderer lfwing;
  
  ModelRenderer rfwing;
  
  ModelRenderer lrwing;
  
  ModelRenderer rrwing;
  
  ModelRenderer rarm1;
  
  ModelRenderer rarm2;
  
  ModelRenderer rarm3;
  
  ModelRenderer rlfleg3;
  
  ModelRenderer rfleg4;
  
  ModelRenderer rfleg2;
  
  ModelRenderer rfleg1;
  
  ModelRenderer rrleg3;
  
  ModelRenderer rrleg4;
  
  ModelRenderer rrleg2;
  
  ModelRenderer rrleg1;
  
  public ModelMantis(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.lfleg1 = new ModelRenderer(this, 28, 35);
    this.lfleg1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.lfleg1.setRotationPoint(27.0F, 16.0F, -3.0F);
    this.lfleg1.setTextureSize(256, 256);
    this.lfleg1.mirror = true;
    setRotation(this.lfleg1, 0.0F, 0.0F, -0.6283185F);
    this.lfleg2 = new ModelRenderer(this, 0, 32);
    this.lfleg2.addBox(0.0F, 0.0F, 0.0F, 1, 22, 1);
    this.lfleg2.setRotationPoint(21.0F, -5.0F, -3.0F);
    this.lfleg2.setTextureSize(256, 256);
    this.lfleg2.mirror = true;
    setRotation(this.lfleg2, 0.0F, 0.0F, -0.2792527F);
    this.lfleg3 = new ModelRenderer(this, 64, 2);
    this.lfleg3.addBox(0.0F, 0.0F, 0.0F, 20, 1, 1);
    this.lfleg3.setRotationPoint(2.0F, -5.0F, 0.0F);
    this.lfleg3.setTextureSize(256, 256);
    this.lfleg3.mirror = true;
    setRotation(this.lfleg3, 0.0F, 0.1570796F, 0.0F);
    this.lfleg4 = new ModelRenderer(this, 64, 20);
    this.lfleg4.addBox(15.0F, 0.0F, -2.0F, 4, 1, 5);
    this.lfleg4.setRotationPoint(2.0F, -5.0F, 0.0F);
    this.lfleg4.setTextureSize(256, 256);
    this.lfleg4.mirror = true;
    setRotation(this.lfleg4, 0.0F, 0.1570796F, 0.0F);
    this.lrleg1 = new ModelRenderer(this, 35, 35);
    this.lrleg1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.lrleg1.setRotationPoint(32.0F, 18.0F, 11.0F);
    this.lrleg1.setTextureSize(256, 256);
    this.lrleg1.mirror = true;
    setRotation(this.lrleg1, 0.0F, 0.0F, -0.8726646F);
    this.lrleg2 = new ModelRenderer(this, 14, 32);
    this.lrleg2.addBox(0.0F, 0.0F, 0.0F, 1, 22, 1);
    this.lrleg2.setRotationPoint(21.0F, 0.0F, 11.0F);
    this.lrleg2.setTextureSize(256, 256);
    this.lrleg2.mirror = true;
    setRotation(this.lrleg2, 0.0F, 0.0F, -0.5410521F);
    this.lrleg3 = new ModelRenderer(this, 64, 11);
    this.lrleg3.addBox(0.0F, 0.0F, 0.0F, 20, 1, 1);
    this.lrleg3.setRotationPoint(2.0F, 0.0F, 8.0F);
    this.lrleg3.setTextureSize(256, 256);
    this.lrleg3.mirror = true;
    setRotation(this.lrleg3, 0.0F, -0.1570796F, 0.0F);
    this.lrleg4 = new ModelRenderer(this, 64, 36);
    this.lrleg4.addBox(15.0F, 0.0F, -2.0F, 4, 1, 5);
    this.lrleg4.setRotationPoint(2.0F, 0.0F, 8.0F);
    this.lrleg4.setTextureSize(256, 256);
    this.lrleg4.mirror = true;
    setRotation(this.lrleg4, 0.0F, -0.1570796F, 0.0F);
    this.abdomen = new ModelRenderer(this, 118, 0);
    this.abdomen.addBox(0.0F, 0.0F, 0.0F, 9, 5, 53);
    this.abdomen.setRotationPoint(-4.0F, -11.0F, 0.0F);
    this.abdomen.setTextureSize(256, 256);
    this.abdomen.mirror = true;
    setRotation(this.abdomen, -0.5061455F, 0.0F, 0.0F);
    this.thorax = new ModelRenderer(this, 145, 62);
    this.thorax.addBox(0.0F, 0.0F, 0.0F, 15, 3, 13);
    this.thorax.setRotationPoint(-7.0F, -14.0F, -12.0F);
    this.thorax.setTextureSize(256, 256);
    this.thorax.mirror = true;
    setRotation(this.thorax, -0.2443461F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 145, 82);
    this.neck1.addBox(0.0F, 0.0F, 0.0F, 9, 1, 15);
    this.neck1.setRotationPoint(-4.0F, -15.0F, -27.0F);
    this.neck1.setTextureSize(256, 256);
    this.neck1.mirror = true;
    setRotation(this.neck1, -0.0698132F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 40, 150);
    this.neck2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
    this.neck2.setRotationPoint(-1.0F, -15.0F, -29.0F);
    this.neck2.setTextureSize(256, 256);
    this.neck2.mirror = true;
    setRotation(this.neck2, 0.0F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 0, 150);
    this.head1.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1);
    this.head1.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.head1.setTextureSize(256, 256);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.1396263F);
    this.head2 = new ModelRenderer(this, 10, 150);
    this.head2.addBox(-2.0F, 0.0F, 0.0F, 2, 6, 1);
    this.head2.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.head2.setTextureSize(256, 256);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, -0.1745329F);
    this.leye = new ModelRenderer(this, 20, 150);
    this.leye.addBox(1.0F, 0.0F, -0.5F, 2, 2, 1);
    this.leye.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.leye.setTextureSize(256, 256);
    this.leye.mirror = true;
    setRotation(this.leye, 0.0F, 0.0F, 0.1396263F);
    this.reye = new ModelRenderer(this, 30, 150);
    this.reye.addBox(-3.0F, 0.0F, -0.5F, 2, 2, 1);
    this.reye.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.reye.setTextureSize(256, 256);
    this.reye.mirror = true;
    setRotation(this.reye, 0.0F, 0.0F, -0.1745329F);
    this.lantenna = new ModelRenderer(this, 53, 150);
    this.lantenna.addBox(0.0F, -20.0F, 0.0F, 1, 20, 1);
    this.lantenna.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.lantenna.setTextureSize(256, 256);
    this.lantenna.mirror = true;
    setRotation(this.lantenna, 0.0F, 0.0F, 0.2792527F);
    this.rantenna = new ModelRenderer(this, 60, 150);
    this.rantenna.addBox(-1.0F, -20.0F, 0.0F, 1, 20, 1);
    this.rantenna.setRotationPoint(0.0F, -16.0F, -30.0F);
    this.rantenna.setTextureSize(256, 256);
    this.rantenna.mirror = true;
    setRotation(this.rantenna, 0.0F, 0.0F, -0.2792527F);
    this.larm1 = new ModelRenderer(this, 51, 0);
    this.larm1.addBox(0.0F, 0.0F, -1.0F, 1, 23, 4);
    this.larm1.setRotationPoint(2.0F, -14.0F, -23.0F);
    this.larm1.setTextureSize(256, 256);
    this.larm1.mirror = true;
    setRotation(this.larm1, 0.0349066F, 0.0F, 0.0F);
    this.larm2 = new ModelRenderer(this, 30, 0);
    this.larm2.addBox(0.0F, -18.0F, -2.0F, 1, 18, 2);
    this.larm2.setRotationPoint(2.0F, 8.0F, -22.0F);
    this.larm2.setTextureSize(256, 256);
    this.larm2.mirror = true;
    setRotation(this.larm2, 0.5585054F, 0.0F, 0.0F);
    this.larm3 = new ModelRenderer(this, 16, 0);
    this.larm3.addBox(0.0F, 0.0F, 0.0F, 1, 21, 1);
    this.larm3.setRotationPoint(2.0F, -7.0F, -33.0F);
    this.larm3.setTextureSize(256, 256);
    this.larm3.mirror = true;
    setRotation(this.larm3, 0.0F, 0.0F, 0.0F);
    this.lfwing = new ModelRenderer(this, 0, 67);
    this.lfwing.addBox(0.0F, 0.0F, 0.0F, 48, 1, 12);
    this.lfwing.setRotationPoint(2.0F, -11.0F, 0.0F);
    this.lfwing.setTextureSize(256, 256);
    this.lfwing.mirror = true;
    setRotation(this.lfwing, -0.2268928F, 0.0F, -0.6981317F);
    this.rfwing = new ModelRenderer(this, 0, 83);
    this.rfwing.addBox(-48.0F, 0.0F, 0.0F, 48, 1, 12);
    this.rfwing.setRotationPoint(-1.0F, -11.0F, 0.0F);
    this.rfwing.setTextureSize(256, 256);
    this.rfwing.mirror = true;
    setRotation(this.rfwing, -0.2268928F, 0.0F, 0.6981317F);
    this.lrwing = new ModelRenderer(this, 0, 100);
    this.lrwing.addBox(0.0F, 0.0F, 0.0F, 42, 1, 17);
    this.lrwing.setRotationPoint(2.0F, -6.0F, 10.0F);
    this.lrwing.setTextureSize(256, 256);
    this.lrwing.mirror = true;
    setRotation(this.lrwing, -0.2268928F, 0.0F, -0.3490659F);
    this.rrwing = new ModelRenderer(this, 0, 122);
    this.rrwing.addBox(-42.0F, 0.0F, 0.0F, 42, 1, 17);
    this.rrwing.setRotationPoint(-1.0F, -6.0F, 10.0F);
    this.rrwing.setTextureSize(256, 256);
    this.rrwing.mirror = true;
    setRotation(this.rrwing, -0.2268928F, 0.0F, 0.3490659F);
    this.rarm1 = new ModelRenderer(this, 38, 0);
    this.rarm1.addBox(0.0F, 0.0F, -1.0F, 1, 23, 4);
    this.rarm1.setRotationPoint(-1.0F, -14.0F, -23.0F);
    this.rarm1.setTextureSize(256, 256);
    this.rarm1.mirror = true;
    setRotation(this.rarm1, 0.0349066F, 0.0F, 0.0F);
    this.rarm2 = new ModelRenderer(this, 22, 0);
    this.rarm2.addBox(0.0F, -18.0F, -2.0F, 1, 18, 2);
    this.rarm2.setRotationPoint(-1.0F, 8.0F, -22.0F);
    this.rarm2.setTextureSize(256, 256);
    this.rarm2.mirror = true;
    setRotation(this.rarm2, 0.5585054F, 0.0F, 0.0F);
    this.rarm3 = new ModelRenderer(this, 10, 0);
    this.rarm3.addBox(0.0F, 0.0F, 0.0F, 1, 21, 1);
    this.rarm3.setRotationPoint(-1.0F, -7.0F, -33.0F);
    this.rarm3.setTextureSize(256, 256);
    this.rarm3.mirror = true;
    setRotation(this.rarm3, 0.0F, 0.0F, 0.0F);
    this.rlfleg3 = new ModelRenderer(this, 64, 6);
    this.rlfleg3.addBox(-20.0F, 0.0F, 0.0F, 20, 1, 1);
    this.rlfleg3.setRotationPoint(-1.0F, -5.0F, 0.0F);
    this.rlfleg3.setTextureSize(256, 256);
    this.rlfleg3.mirror = true;
    setRotation(this.rlfleg3, 0.0F, -0.1570796F, 0.0F);
    this.rfleg4 = new ModelRenderer(this, 64, 28);
    this.rfleg4.addBox(-19.0F, 0.0F, -2.0F, 4, 1, 5);
    this.rfleg4.setRotationPoint(-1.0F, -5.0F, 0.0F);
    this.rfleg4.setTextureSize(256, 256);
    this.rfleg4.mirror = true;
    setRotation(this.rfleg4, 0.0F, -0.1570796F, 0.0F);
    this.rfleg2 = new ModelRenderer(this, 7, 32);
    this.rfleg2.addBox(0.0F, 0.0F, 0.0F, 1, 22, 1);
    this.rfleg2.setRotationPoint(-21.0F, -5.0F, -3.0F);
    this.rfleg2.setTextureSize(256, 256);
    this.rfleg2.mirror = true;
    setRotation(this.rfleg2, 0.0F, 0.0F, 0.2792527F);
    this.rfleg1 = new ModelRenderer(this, 42, 35);
    this.rfleg1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.rfleg1.setRotationPoint(-27.0F, 16.0F, -3.0F);
    this.rfleg1.setTextureSize(256, 256);
    this.rfleg1.mirror = true;
    setRotation(this.rfleg1, 0.0F, 0.0F, 0.6283185F);
    this.rrleg3 = new ModelRenderer(this, 64, 16);
    this.rrleg3.addBox(-20.0F, 0.0F, 0.0F, 20, 1, 1);
    this.rrleg3.setRotationPoint(-1.0F, 0.0F, 8.0F);
    this.rrleg3.setTextureSize(256, 256);
    this.rrleg3.mirror = true;
    setRotation(this.rrleg3, 0.0F, 0.1570796F, 0.0F);
    this.rrleg4 = new ModelRenderer(this, 64, 44);
    this.rrleg4.addBox(-19.0F, 0.0F, -2.0F, 4, 1, 5);
    this.rrleg4.setRotationPoint(-1.0F, 0.0F, 8.0F);
    this.rrleg4.setTextureSize(256, 256);
    this.rrleg4.mirror = true;
    setRotation(this.rrleg4, 0.0F, 0.1570796F, 0.0F);
    this.rrleg2 = new ModelRenderer(this, 21, 32);
    this.rrleg2.addBox(0.0F, 0.0F, 0.0F, 1, 22, 1);
    this.rrleg2.setRotationPoint(-21.0F, 0.0F, 11.0F);
    this.rrleg2.setTextureSize(256, 256);
    this.rrleg2.mirror = true;
    setRotation(this.rrleg2, 0.0F, 0.0F, 0.5410521F);
    this.rrleg1 = new ModelRenderer(this, 49, 35);
    this.rrleg1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.rrleg1.setRotationPoint(-32.0F, 18.0F, 11.0F);
    this.rrleg1.setTextureSize(256, 256);
    this.rrleg1.mirror = true;
    setRotation(this.rrleg1, 0.0F, 0.0F, 0.8726646F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float a1, newangle = 0.0F;
    Mantis b = (Mantis)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.25F;
    this.lfwing.rotateAngleZ = -0.698F - newangle;
    this.rfwing.rotateAngleZ = 0.698F + newangle;
    newangle = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.35F;
    this.lrwing.rotateAngleZ = -0.349F + newangle;
    this.rrwing.rotateAngleZ = 0.349F - newangle;
    if (b.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.051F * this.wingspeed) * 3.1415927F * 0.013F;
      a1 = -0.2F;
    } else {
      newangle = MathHelper.cos(f2 * 0.51F * this.wingspeed) * 3.1415927F * 0.25F;
      a1 = -0.698F;
    } 
    this.larm1.rotateAngleX = a1 + newangle;
    this.larm2.rotationPointZ = (float)((this.larm1.rotationPointZ + 1.0F) + Math.sin(this.larm1.rotateAngleX) * 22.0D);
    this.larm2.rotationPointY = (float)(this.larm1.rotationPointY + Math.cos(this.larm1.rotateAngleX) * 22.0D);
    this.larm2.rotateAngleX = -a1 - newangle;
    this.larm3.rotationPointZ = (float)((this.larm2.rotationPointZ + 1.0F) - Math.sin(this.larm2.rotateAngleX) * 17.0D);
    this.larm3.rotationPointY = (float)(this.larm2.rotationPointY - Math.cos(this.larm2.rotateAngleX) * 17.0D);
    this.larm3.rotateAngleX = a1 + newangle;
    this.rarm1.rotateAngleX = a1 - newangle;
    this.rarm2.rotationPointZ = (float)((this.rarm1.rotationPointZ + 1.0F) + Math.sin(this.rarm1.rotateAngleX) * 22.0D);
    this.rarm2.rotationPointY = (float)(this.rarm1.rotationPointY + Math.cos(this.rarm1.rotateAngleX) * 22.0D);
    this.rarm2.rotateAngleX = -a1 + newangle;
    this.rarm3.rotationPointZ = (float)((this.rarm2.rotationPointZ + 1.0F) - Math.sin(this.rarm2.rotateAngleX) * 17.0D);
    this.rarm3.rotationPointY = (float)(this.rarm2.rotationPointY - Math.cos(this.rarm2.rotateAngleX) * 17.0D);
    this.rarm3.rotateAngleX = a1 - newangle;
    this.lfleg1.render(f5);
    this.lfleg2.render(f5);
    this.lfleg3.render(f5);
    this.lfleg4.render(f5);
    this.lrleg1.render(f5);
    this.lrleg2.render(f5);
    this.lrleg3.render(f5);
    this.lrleg4.render(f5);
    this.abdomen.render(f5);
    this.thorax.render(f5);
    this.neck1.render(f5);
    this.neck2.render(f5);
    this.head1.render(f5);
    this.head2.render(f5);
    this.leye.render(f5);
    this.reye.render(f5);
    this.lantenna.render(f5);
    this.rantenna.render(f5);
    this.larm1.render(f5);
    this.larm2.render(f5);
    this.larm3.render(f5);
    this.lfwing.render(f5);
    this.rfwing.render(f5);
    this.lrwing.render(f5);
    this.rrwing.render(f5);
    this.rarm1.render(f5);
    this.rarm2.render(f5);
    this.rarm3.render(f5);
    this.rlfleg3.render(f5);
    this.rfleg4.render(f5);
    this.rfleg2.render(f5);
    this.rfleg1.render(f5);
    this.rrleg3.render(f5);
    this.rrleg4.render(f5);
    this.rrleg2.render(f5);
    this.rrleg1.render(f5);
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