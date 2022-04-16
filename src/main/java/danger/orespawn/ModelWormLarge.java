package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWormLarge extends ModelBase {
  ModelRenderer head1;
  
  ModelRenderer head2;
  
  ModelRenderer head3;
  
  ModelRenderer head4;
  
  ModelRenderer head5;
  
  ModelRenderer neck1;
  
  ModelRenderer neck4;
  
  ModelRenderer neck5;
  
  ModelRenderer neck2;
  
  ModelRenderer neck3;
  
  ModelRenderer tail1;
  
  ModelRenderer tailtip;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer tail4;
  
  ModelRenderer tooth1;
  
  ModelRenderer tooth2;
  
  ModelRenderer tooth3;
  
  ModelRenderer tooth4;
  
  ModelRenderer tooth5;
  
  ModelRenderer tooth6;
  
  ModelRenderer tooth7;
  
  ModelRenderer tooth8;
  
  public ModelWormLarge() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.head1 = new ModelRenderer(this, 0, 0);
    this.head1.addBox(-8.0F, -8.0F, -20.0F, 16, 16, 20);
    this.head1.setRotationPoint(0.0F, 0.0F, 10.0F);
    this.head1.setTextureSize(256, 256);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 83, 27);
    this.head2.addBox(8.0F, -3.0F, -20.0F, 3, 6, 19);
    this.head2.setRotationPoint(0.0F, 0.0F, 10.0F);
    this.head2.setTextureSize(256, 256);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 9, 65);
    this.head3.addBox(-11.0F, -3.0F, -20.0F, 3, 6, 19);
    this.head3.setRotationPoint(0.0F, 0.0F, 10.0F);
    this.head3.setTextureSize(256, 256);
    this.head3.mirror = true;
    setRotation(this.head3, 0.0F, 0.0F, 0.0F);
    this.head4 = new ModelRenderer(this, 77, 0);
    this.head4.addBox(-3.0F, -11.0F, -20.0F, 6, 3, 20);
    this.head4.setRotationPoint(0.0F, 0.0F, 10.0F);
    this.head4.setTextureSize(256, 256);
    this.head4.mirror = true;
    setRotation(this.head4, 0.0F, 0.0F, 0.0F);
    this.head5 = new ModelRenderer(this, 10, 39);
    this.head5.addBox(-3.0F, 8.0F, -20.0F, 6, 3, 20);
    this.head5.setRotationPoint(0.0F, 0.0F, 10.0F);
    this.head5.setTextureSize(256, 256);
    this.head5.mirror = true;
    setRotation(this.head5, 0.0F, 0.0F, 0.0F);
    this.neck1 = new ModelRenderer(this, 25, 94);
    this.neck1.addBox(-6.0F, -6.0F, -36.0F, 12, 12, 36);
    this.neck1.setRotationPoint(0.0F, 20.0F, 33.0F);
    this.neck1.setTextureSize(256, 256);
    this.neck1.mirror = true;
    setRotation(this.neck1, -0.6981317F, 0.0F, 0.0F);
    this.neck4 = new ModelRenderer(this, 25, 146);
    this.neck4.addBox(-2.0F, -8.0F, -38.0F, 4, 2, 38);
    this.neck4.setRotationPoint(0.0F, 20.0F, 33.0F);
    this.neck4.setTextureSize(256, 256);
    this.neck4.mirror = true;
    setRotation(this.neck4, -0.6981317F, 0.0F, 0.0F);
    this.neck5 = new ModelRenderer(this, 125, 189);
    this.neck5.addBox(-2.0F, 6.0F, -31.0F, 4, 2, 31);
    this.neck5.setRotationPoint(0.0F, 20.0F, 33.0F);
    this.neck5.setTextureSize(256, 256);
    this.neck5.mirror = true;
    setRotation(this.neck5, -0.6981317F, 0.0F, 0.0F);
    this.neck2 = new ModelRenderer(this, 25, 189);
    this.neck2.addBox(6.0F, -2.0F, -34.0F, 2, 4, 34);
    this.neck2.setRotationPoint(0.0F, 20.0F, 33.0F);
    this.neck2.setTextureSize(256, 256);
    this.neck2.mirror = true;
    setRotation(this.neck2, -0.6981317F, 0.0F, 0.0F);
    this.neck3 = new ModelRenderer(this, 125, 147);
    this.neck3.addBox(-8.0F, -2.0F, -34.0F, 2, 4, 34);
    this.neck3.setRotationPoint(0.0F, 20.0F, 33.0F);
    this.neck3.setTextureSize(256, 256);
    this.neck3.mirror = true;
    setRotation(this.neck3, -0.6981317F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 145, 21);
    this.tail1.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 24);
    this.tail1.setRotationPoint(0.0F, 20.0F, 29.0F);
    this.tail1.setTextureSize(256, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tailtip = new ModelRenderer(this, 180, 0);
    this.tailtip.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 12);
    this.tailtip.setRotationPoint(0.0F, 19.5F, 52.0F);
    this.tailtip.setTextureSize(256, 256);
    this.tailtip.mirror = true;
    setRotation(this.tailtip, 0.3490659F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 145, 56);
    this.tail2.addBox(4.0F, -1.0F, 2.0F, 1, 2, 14);
    this.tail2.setRotationPoint(0.0F, 20.0F, 29.0F);
    this.tail2.setTextureSize(256, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 145, 90);
    this.tail3.addBox(-5.0F, -1.0F, 2.0F, 1, 2, 14);
    this.tail3.setRotationPoint(0.0F, 20.0F, 29.0F);
    this.tail3.setTextureSize(256, 256);
    this.tail3.mirror = true;
    setRotation(this.tail3, 0.0F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 145, 76);
    this.tail4.addBox(-1.0F, -5.0F, 7.0F, 2, 1, 9);
    this.tail4.setRotationPoint(0.0F, 20.0F, 29.0F);
    this.tail4.setTextureSize(256, 256);
    this.tail4.mirror = true;
    setRotation(this.tail4, 0.0F, 0.0F, 0.0F);
    this.tooth1 = new ModelRenderer(this, 0, 220);
    this.tooth1.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth1.setRotationPoint(0.0F, 9.0F, -10.0F);
    this.tooth1.setTextureSize(256, 256);
    this.tooth1.mirror = true;
    setRotation(this.tooth1, 0.0F, 0.0F, 0.0F);
    this.tooth2 = new ModelRenderer(this, 0, 210);
    this.tooth2.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth2.setRotationPoint(0.0F, -9.0F, -10.0F);
    this.tooth2.setTextureSize(256, 256);
    this.tooth2.mirror = true;
    setRotation(this.tooth2, 0.0F, 0.0F, 0.0F);
    this.tooth3 = new ModelRenderer(this, 0, 200);
    this.tooth3.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth3.setRotationPoint(9.0F, 0.0F, -10.0F);
    this.tooth3.setTextureSize(256, 256);
    this.tooth3.mirror = true;
    setRotation(this.tooth3, 0.0F, 0.0F, 0.0F);
    this.tooth4 = new ModelRenderer(this, 0, 190);
    this.tooth4.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth4.setRotationPoint(-9.0F, 0.0F, -10.0F);
    this.tooth4.setTextureSize(256, 256);
    this.tooth4.mirror = true;
    setRotation(this.tooth4, 0.0F, 0.0F, 0.0F);
    this.tooth5 = new ModelRenderer(this, 0, 180);
    this.tooth5.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth5.setRotationPoint(-6.0F, -6.0F, -10.0F);
    this.tooth5.setTextureSize(256, 256);
    this.tooth5.mirror = true;
    setRotation(this.tooth5, 0.0F, 0.0F, 0.0F);
    this.tooth6 = new ModelRenderer(this, 0, 170);
    this.tooth6.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth6.setRotationPoint(6.0F, 6.0F, -10.0F);
    this.tooth6.setTextureSize(256, 256);
    this.tooth6.mirror = true;
    setRotation(this.tooth6, 0.0F, 0.0F, 0.0F);
    this.tooth7 = new ModelRenderer(this, 0, 160);
    this.tooth7.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth7.setRotationPoint(6.0F, -6.0F, -10.0F);
    this.tooth7.setTextureSize(256, 256);
    this.tooth7.mirror = true;
    setRotation(this.tooth7, 0.0F, 0.0F, 0.0F);
    this.tooth8 = new ModelRenderer(this, 0, 150);
    this.tooth8.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 7);
    this.tooth8.setRotationPoint(-6.0F, 6.0F, -10.0F);
    this.tooth8.setTextureSize(256, 256);
    this.tooth8.mirror = true;
    setRotation(this.tooth8, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    double dist = 32.0D;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = MathHelper.cos(f2 * 0.25F) * 3.1415927F * 0.08F;
    newangle -= 0.698F;
    this.neck1.rotateAngleX = newangle;
    float newangle2 = MathHelper.cos(f2 * 0.15F) * 3.1415927F * 0.07F;
    this.neck1.rotateAngleY = newangle2;
    this.neck5.rotateAngleX = this.neck1.rotateAngleX;
    this.neck5.rotateAngleY = this.neck1.rotateAngleY;
    double d1 = (float)(Math.cos(newangle) * dist);
    double d2 = (float)(Math.sin(newangle) * dist);
    this.head1.rotationPointZ = (float)(this.neck1.rotationPointZ - d1);
    double d3 = (float)(Math.sin(newangle2) * d1);
    double d4 = (float)(Math.cos(newangle2) * d1);
    this.head1.rotationPointX = (float)(this.neck1.rotationPointX - d3);
    this.head1.rotationPointY = (float)(this.neck1.rotationPointY + d2);
    this.head1.rotateAngleX = newangle = MathHelper.cos(f2 * 0.35F) * 3.1415927F * 0.15F;
    this.head1.rotateAngleY = newangle2 = MathHelper.cos(f2 * 0.45F) * 3.1415927F * 0.05F;
    this.head5.rotationPointX = this.head1.rotationPointX;
    this.head5.rotationPointY = this.head1.rotationPointY;
    this.head5.rotationPointZ = this.head1.rotationPointZ;
    this.head5.rotateAngleX = this.head1.rotateAngleX;
    this.head5.rotateAngleY = this.head1.rotateAngleY;
    dist = 19.0D;
    d1 = (float)(Math.cos(newangle) * dist);
    d2 = (float)(Math.sin(newangle) * dist);
    this.tooth1.rotationPointZ = (float)(this.head1.rotationPointZ - d1);
    d3 = (float)(Math.sin(newangle2) * d1);
    d4 = (float)(Math.cos(newangle2) * d1);
    this.tooth1.rotationPointX = (float)(this.head1.rotationPointX - d3);
    this.tooth1.rotationPointY = (float)(this.head1.rotationPointY + d2 - 9.0D);
    this.tooth2.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth2.rotationPointX = this.tooth1.rotationPointX;
    this.tooth1.rotationPointY += 18.0F;
    this.tooth3.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX += 9.0F;
    this.tooth1.rotationPointY += 9.0F;
    this.tooth4.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX -= 9.0F;
    this.tooth1.rotationPointY += 9.0F;
    this.tooth5.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX -= 6.0F;
    this.tooth5.rotationPointY = this.tooth1.rotationPointY + 9.0F - 6.0F;
    this.tooth6.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX += 6.0F;
    this.tooth6.rotationPointY = this.tooth1.rotationPointY + 9.0F + 6.0F;
    this.tooth7.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX += 6.0F;
    this.tooth7.rotationPointY = this.tooth1.rotationPointY + 9.0F - 6.0F;
    this.tooth8.rotationPointZ = this.tooth1.rotationPointZ;
    this.tooth1.rotationPointX -= 6.0F;
    this.tooth8.rotationPointY = this.tooth1.rotationPointY + 9.0F + 6.0F;
    this.tooth1.rotationPointZ = (float)(this.tooth1.rotationPointZ - Math.sin(this.head1.rotateAngleX) * 9.0D);
    this.tooth2.rotationPointZ = (float)(this.tooth2.rotationPointZ + Math.sin(this.head1.rotateAngleX) * 9.0D);
    this.tooth3.rotationPointZ = (float)(this.tooth3.rotationPointZ - Math.sin(this.head1.rotateAngleY) * 9.0D);
    this.tooth4.rotationPointZ = (float)(this.tooth4.rotationPointZ + Math.sin(this.head1.rotateAngleY) * 9.0D);
    this.tooth7.rotationPointZ = (float)(this.tooth7.rotationPointZ - Math.sin(this.head1.rotateAngleX) * 6.0D);
    this.tooth7.rotationPointZ = (float)(this.tooth7.rotationPointZ - Math.sin(this.head1.rotateAngleY) * 6.0D);
    this.tooth6.rotationPointZ = (float)(this.tooth6.rotationPointZ + Math.sin(this.head1.rotateAngleX) * 6.0D);
    this.tooth6.rotationPointZ = (float)(this.tooth6.rotationPointZ - Math.sin(this.head1.rotateAngleY) * 6.0D);
    this.tooth5.rotationPointZ = (float)(this.tooth5.rotationPointZ - Math.sin(this.head1.rotateAngleX) * 6.0D);
    this.tooth5.rotationPointZ = (float)(this.tooth5.rotationPointZ + Math.sin(this.head1.rotateAngleY) * 6.0D);
    this.tooth8.rotationPointZ = (float)(this.tooth8.rotationPointZ + Math.sin(this.head1.rotateAngleX) * 6.0D);
    this.tooth8.rotationPointZ = (float)(this.tooth8.rotationPointZ + Math.sin(this.head1.rotateAngleY) * 6.0D);
    newangle = MathHelper.cos(f2 * 0.57F) * 3.1415927F * 0.35F;
    this.head1.rotateAngleX += newangle;
    this.head1.rotateAngleX -= newangle;
    this.head1.rotateAngleY += newangle;
    this.head1.rotateAngleY -= newangle;
    this.head1.rotateAngleX += newangle;
    this.head1.rotateAngleX += newangle;
    this.head1.rotateAngleX -= newangle;
    this.head1.rotateAngleX -= newangle;
    this.head1.rotateAngleY += newangle;
    this.head1.rotateAngleY += newangle;
    this.head1.rotateAngleY -= newangle;
    this.head1.rotateAngleY -= newangle;
    newangle = MathHelper.cos(f2 * 0.63F) * 3.1415927F * 0.15F;
    this.tailtip.rotateAngleX = newangle + 0.35F;
    newangle = MathHelper.cos((float)((f2 * 0.63F) + 1.57075D)) * 3.1415927F * 0.15F;
    this.tailtip.rotateAngleY = newangle;
    this.head1.render(f5);
    this.head2.render(f5);
    this.head3.render(f5);
    this.head4.render(f5);
    this.head5.render(f5);
    this.neck1.render(f5);
    this.neck4.render(f5);
    this.neck5.render(f5);
    this.neck2.render(f5);
    this.neck3.render(f5);
    this.tail1.render(f5);
    this.tailtip.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
    this.tooth1.render(f5);
    this.tooth2.render(f5);
    this.tooth3.render(f5);
    this.tooth4.render(f5);
    this.tooth5.render(f5);
    this.tooth6.render(f5);
    this.tooth7.render(f5);
    this.tooth8.render(f5);
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
