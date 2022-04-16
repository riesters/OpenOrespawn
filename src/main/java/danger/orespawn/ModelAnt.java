package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAnt extends ModelBase {
  ModelRenderer thorax;
  
  ModelRenderer thorax1;
  
  ModelRenderer thorax3;
  
  ModelRenderer abdomen;
  
  ModelRenderer abdomen1;
  
  ModelRenderer head;
  
  ModelRenderer jawsr;
  
  ModelRenderer jawsl;
  
  ModelRenderer llegtop1;
  
  ModelRenderer llegbot1;
  
  ModelRenderer llegtop2;
  
  ModelRenderer llegbot2;
  
  ModelRenderer llegtop3;
  
  ModelRenderer llegbot3;
  
  ModelRenderer rlegtop1;
  
  ModelRenderer rlegbot1;
  
  ModelRenderer rlegtop2;
  
  ModelRenderer rlegbot2;
  
  ModelRenderer rlegtop3;
  
  ModelRenderer rlegbot3;
  
  public ModelAnt() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.thorax = new ModelRenderer(this, 22, 0);
    this.thorax.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
    this.thorax.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.thorax.setTextureSize(64, 32);
    this.thorax.mirror = true;
    setRotation(this.thorax, 0.0F, 0.0F, 0.0F);
    this.thorax1 = new ModelRenderer(this, 18, 0);
    this.thorax1.addBox(1.0F, 1.0F, -1.0F, 1, 1, 1);
    this.thorax1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.thorax1.setTextureSize(64, 32);
    this.thorax1.mirror = true;
    setRotation(this.thorax1, 0.0F, 0.0F, 0.0F);
    this.thorax3 = new ModelRenderer(this, 34, 0);
    this.thorax3.addBox(1.0F, 1.0F, 3.0F, 1, 1, 1);
    this.thorax3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.thorax3.setTextureSize(64, 32);
    this.thorax3.mirror = true;
    setRotation(this.thorax3, 0.0F, 0.0F, 0.0F);
    this.abdomen = new ModelRenderer(this, 38, 0);
    this.abdomen.addBox(0.0F, 0.0F, 4.0F, 3, 3, 5);
    this.abdomen.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.abdomen.setTextureSize(64, 32);
    this.abdomen.mirror = true;
    setRotation(this.abdomen, 0.0F, 0.0F, 0.0F);
    this.abdomen1 = new ModelRenderer(this, 54, 0);
    this.abdomen1.addBox(1.0F, 1.0F, 9.0F, 1, 1, 1);
    this.abdomen1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.abdomen1.setTextureSize(64, 32);
    this.abdomen1.mirror = true;
    setRotation(this.abdomen1, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 6, 0);
    this.head.addBox(0.0F, -1.0F, -4.0F, 3, 3, 3);
    this.head.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.jawsr = new ModelRenderer(this, 0, 9);
    this.jawsr.addBox(-1.0F, 0.0F, -6.0F, 1, 1, 3);
    this.jawsr.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.jawsr.setTextureSize(64, 32);
    this.jawsr.mirror = true;
    setRotation(this.jawsr, 0.0F, 0.0F, 0.0F);
    this.jawsl = new ModelRenderer(this, 0, 14);
    this.jawsl.addBox(3.0F, 0.0F, -6.0F, 1, 1, 3);
    this.jawsl.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.jawsl.setTextureSize(64, 32);
    this.jawsl.mirror = true;
    setRotation(this.jawsl, 0.0F, 0.0F, 0.0F);
    this.llegtop1 = new ModelRenderer(this, 15, 10);
    this.llegtop1.addBox(3.0F, 1.0F, 1.0F, 3, 1, 1);
    this.llegtop1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegtop1.setTextureSize(64, 32);
    this.llegtop1.mirror = true;
    setRotation(this.llegtop1, 0.0F, 0.0F, 0.3839724F);
    this.llegbot1 = new ModelRenderer(this, 15, 19);
    this.llegbot1.addBox(5.0F, -3.0F, 1.0F, 3, 1, 1);
    this.llegbot1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegbot1.setTextureSize(64, 32);
    this.llegbot1.mirror = true;
    setRotation(this.llegbot1, 0.0F, 0.0F, 1.064651F);
    this.llegtop2 = new ModelRenderer(this, 15, 13);
    this.llegtop2.addBox(3.0F, 1.0F, 2.0F, 3, 1, 1);
    this.llegtop2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegtop2.setTextureSize(64, 32);
    this.llegtop2.mirror = true;
    setRotation(this.llegtop2, 0.0F, -0.2094395F, 0.3839724F);
    this.llegbot2 = new ModelRenderer(this, 15, 22);
    this.llegbot2.addBox(5.0F, -3.0F, 2.0F, 3, 1, 1);
    this.llegbot2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegbot2.setTextureSize(64, 32);
    this.llegbot2.mirror = true;
    setRotation(this.llegbot2, 0.0F, -0.2268928F, 1.064651F);
    this.llegtop3 = new ModelRenderer(this, 15, 16);
    this.llegtop3.addBox(3.0F, 1.0F, 0.0F, 3, 1, 1);
    this.llegtop3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegtop3.setTextureSize(64, 32);
    this.llegtop3.mirror = true;
    setRotation(this.llegtop3, 0.0F, 0.3490659F, 0.3839724F);
    this.llegbot3 = new ModelRenderer(this, 15, 25);
    this.llegbot3.addBox(5.0F, -3.0F, 0.0F, 3, 1, 1);
    this.llegbot3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.llegbot3.setTextureSize(64, 32);
    this.llegbot3.mirror = true;
    setRotation(this.llegbot3, 0.0F, 0.3490659F, 1.064651F);
    this.rlegtop1 = new ModelRenderer(this, 25, 10);
    this.rlegtop1.addBox(-4.0F, 2.0F, 1.0F, 3, 1, 1);
    this.rlegtop1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegtop1.setTextureSize(64, 32);
    this.rlegtop1.mirror = true;
    setRotation(this.rlegtop1, 0.0F, 0.0F, -0.4712389F);
    this.rlegbot1 = new ModelRenderer(this, 25, 19);
    this.rlegbot1.addBox(-7.0F, 0.0F, 1.0F, 3, 1, 1);
    this.rlegbot1.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegbot1.setTextureSize(64, 32);
    this.rlegbot1.mirror = true;
    setRotation(this.rlegbot1, 0.0F, 0.0F, -0.9773844F);
    this.rlegtop2 = new ModelRenderer(this, 25, 13);
    this.rlegtop2.addBox(-4.0F, 2.0F, 0.0F, 3, 1, 1);
    this.rlegtop2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegtop2.setTextureSize(64, 32);
    this.rlegtop2.mirror = true;
    setRotation(this.rlegtop2, 0.0F, -0.5934119F, -0.4712389F);
    this.rlegbot2 = new ModelRenderer(this, 25, 22);
    this.rlegbot2.addBox(-7.0F, 0.0F, 0.0F, 3, 1, 1);
    this.rlegbot2.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegbot2.setTextureSize(64, 32);
    this.rlegbot2.mirror = true;
    setRotation(this.rlegbot2, 0.0F, -0.5934119F, -0.9773844F);
    this.rlegtop3 = new ModelRenderer(this, 25, 16);
    this.rlegtop3.addBox(-4.0F, 2.0F, 2.0F, 3, 1, 1);
    this.rlegtop3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegtop3.setTextureSize(64, 32);
    this.rlegtop3.mirror = true;
    setRotation(this.rlegtop3, 0.0F, 0.418879F, -0.4712389F);
    this.rlegbot3 = new ModelRenderer(this, 25, 25);
    this.rlegbot3.addBox(-7.0F, 0.0F, 2.0F, 3, 1, 1);
    this.rlegbot3.setRotationPoint(0.0F, 17.0F, 0.0F);
    this.rlegbot3.setTextureSize(64, 32);
    this.rlegbot3.mirror = true;
    setRotation(this.rlegbot3, 0.0F, 0.418879F, -0.9773844F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.llegtop1.rotateAngleX = MathHelper.cos(f2 * 2.7F) * 3.1415927F * 0.45F * f1;
    this.llegbot1.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegtop2.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegbot2.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegtop3.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegbot3.rotateAngleX = this.llegtop1.rotateAngleX;
    this.rlegtop1.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.rlegbot1.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegtop2.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegbot2.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegtop3.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.llegbot3.rotateAngleX = -this.llegtop1.rotateAngleX;
    this.jawsl.rotateAngleY = MathHelper.cos(f2 * 0.4F) * 3.1415927F * 0.05F;
    this.jawsr.rotateAngleY = -this.jawsl.rotateAngleY;
    this.thorax.render(f5);
    this.thorax1.render(f5);
    this.thorax3.render(f5);
    this.abdomen.render(f5);
    this.abdomen1.render(f5);
    this.head.render(f5);
    this.jawsr.render(f5);
    this.jawsl.render(f5);
    this.llegtop1.render(f5);
    this.llegbot1.render(f5);
    this.llegtop2.render(f5);
    this.llegbot2.render(f5);
    this.llegtop3.render(f5);
    this.llegbot3.render(f5);
    this.rlegtop1.render(f5);
    this.rlegbot1.render(f5);
    this.rlegtop2.render(f5);
    this.rlegbot2.render(f5);
    this.rlegtop3.render(f5);
    this.rlegbot3.render(f5);
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