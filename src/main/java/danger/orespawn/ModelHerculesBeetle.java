package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHerculesBeetle extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body1;
  
  ModelRenderer body2;
  
  ModelRenderer head1;
  
  ModelRenderer head2;
  
  ModelRenderer head3;
  
  ModelRenderer head4;
  
  ModelRenderer head5;
  
  ModelRenderer head6;
  
  ModelRenderer head8;
  
  ModelRenderer jaw1;
  
  ModelRenderer jaw2;
  
  ModelRenderer jaw3;
  
  ModelRenderer jaw4;
  
  ModelRenderer head7;
  
  ModelRenderer lfleg1;
  
  ModelRenderer lfleg2;
  
  ModelRenderer lfleg3;
  
  ModelRenderer lmleg1;
  
  ModelRenderer lmleg2;
  
  ModelRenderer lmleg3;
  
  ModelRenderer lrleg1;
  
  ModelRenderer lrleg2;
  
  ModelRenderer lrleg3;
  
  ModelRenderer jaw5;
  
  ModelRenderer jaw6;
  
  ModelRenderer jaw7;
  
  ModelRenderer jaw8;
  
  ModelRenderer rfleg1;
  
  ModelRenderer rfleg2;
  
  ModelRenderer rfleg3;
  
  ModelRenderer rmleg1;
  
  ModelRenderer rmleg2;
  
  ModelRenderer rmleg3;
  
  ModelRenderer rrleg1;
  
  ModelRenderer rrleg2;
  
  ModelRenderer rrleg3;
  
  ModelRenderer jaw9;
  
  public ModelHerculesBeetle(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.body1 = new ModelRenderer(this, 0, 30);
    this.body1.addBox(-8.0F, 0.0F, 0.0F, 16, 16, 23);
    this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body1.setTextureSize(256, 256);
    this.body1.mirror = true;
    setRotation(this.body1, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 80, 41);
    this.body2.addBox(-6.0F, 0.0F, 0.0F, 12, 12, 4);
    this.body2.setRotationPoint(0.0F, 3.0F, 23.0F);
    this.body2.setTextureSize(256, 256);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 0, 71);
    this.head1.addBox(-9.0F, 0.0F, 0.0F, 18, 16, 12);
    this.head1.setRotationPoint(0.0F, -1.0F, -10.0F);
    this.head1.setTextureSize(256, 256);
    this.head1.mirror = true;
    setRotation(this.head1, -0.122173F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 0, 100);
    this.head2.addBox(-7.0F, 0.0F, 0.0F, 14, 10, 6);
    this.head2.setRotationPoint(0.0F, -2.0F, -16.0F);
    this.head2.setTextureSize(256, 256);
    this.head2.mirror = true;
    setRotation(this.head2, -0.122173F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 0, 117);
    this.head3.addBox(-5.0F, 0.0F, 0.0F, 10, 6, 9);
    this.head3.setRotationPoint(0.0F, -3.0F, -25.0F);
    this.head3.setTextureSize(256, 256);
    this.head3.mirror = true;
    setRotation(this.head3, -0.122173F, 0.0F, 0.0F);
    this.head4 = new ModelRenderer(this, 0, 133);
    this.head4.addBox(-4.0F, 0.0F, 0.0F, 8, 4, 12);
    this.head4.setRotationPoint(0.0F, -4.0F, -37.0F);
    this.head4.setTextureSize(256, 256);
    this.head4.mirror = true;
    setRotation(this.head4, -0.122173F, 0.0F, 0.0F);
    this.head5 = new ModelRenderer(this, 0, 150);
    this.head5.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 21);
    this.head5.setRotationPoint(0.0F, -4.0F, -58.0F);
    this.head5.setTextureSize(256, 256);
    this.head5.mirror = true;
    setRotation(this.head5, 0.0F, 0.0F, 0.0F);
    this.head6 = new ModelRenderer(this, 0, 175);
    this.head6.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 14);
    this.head6.setRotationPoint(0.0F, -2.0F, -72.0F);
    this.head6.setTextureSize(256, 256);
    this.head6.mirror = true;
    setRotation(this.head6, 0.122173F, 0.0F, 0.0F);
    this.head8 = new ModelRenderer(this, 6, 193);
    this.head8.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.head8.setRotationPoint(0.0F, -2.0F, -46.0F);
    this.head8.setTextureSize(256, 256);
    this.head8.mirror = true;
    setRotation(this.head8, -0.2094395F, 0.0F, 0.0F);
    this.jaw1 = new ModelRenderer(this, 114, 0);
    this.jaw1.addBox(-3.0F, -3.0F, -4.0F, 6, 7, 5);
    this.jaw1.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw1.setTextureSize(256, 256);
    this.jaw1.mirror = true;
    setRotation(this.jaw1, 0.122173F, 0.0F, 0.0F);
    this.jaw2 = new ModelRenderer(this, 115, 14);
    this.jaw2.addBox(-2.5F, -3.0F, -27.0F, 5, 5, 23);
    this.jaw2.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw2.setTextureSize(256, 256);
    this.jaw2.mirror = true;
    setRotation(this.jaw2, 0.122173F, 0.0F, 0.0F);
    this.jaw3 = new ModelRenderer(this, 115, 43);
    this.jaw3.addBox(-1.5F, 0.0F, -44.0F, 3, 5, 18);
    this.jaw3.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw3.setTextureSize(256, 256);
    this.jaw3.mirror = true;
    setRotation(this.jaw3, 0.0F, 0.0F, 0.0F);
    this.jaw4 = new ModelRenderer(this, 115, 70);
    this.jaw4.addBox(-0.5F, -2.0F, -45.0F, 1, 5, 1);
    this.jaw4.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw4.setTextureSize(256, 256);
    this.jaw4.mirror = true;
    setRotation(this.jaw4, 0.0F, 0.0F, 0.0F);
    this.head7 = new ModelRenderer(this, 0, 193);
    this.head7.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 1);
    this.head7.setRotationPoint(0.0F, -2.0F, -73.0F);
    this.head7.setTextureSize(256, 256);
    this.head7.mirror = true;
    setRotation(this.head7, 0.122173F, 0.0F, 0.0F);
    this.lfleg1 = new ModelRenderer(this, 60, 0);
    this.lfleg1.addBox(0.0F, 0.0F, -0.5F, 10, 3, 3);
    this.lfleg1.setRotationPoint(6.0F, 15.0F, -5.0F);
    this.lfleg1.setTextureSize(256, 256);
    this.lfleg1.mirror = true;
    setRotation(this.lfleg1, 0.0F, 0.3490659F, 0.0872665F);
    this.lfleg2 = new ModelRenderer(this, 60, 8);
    this.lfleg2.addBox(10.0F, -1.0F, 0.0F, 11, 2, 2);
    this.lfleg2.setRotationPoint(6.0F, 15.0F, -5.0F);
    this.lfleg2.setTextureSize(256, 256);
    this.lfleg2.mirror = true;
    setRotation(this.lfleg2, 0.0F, 0.3490659F, 0.2617994F);
    this.lfleg3 = new ModelRenderer(this, 60, 14);
    this.lfleg3.addBox(21.0F, -2.0F, 0.5F, 10, 1, 1);
    this.lfleg3.setRotationPoint(6.0F, 15.0F, -5.0F);
    this.lfleg3.setTextureSize(256, 256);
    this.lfleg3.mirror = true;
    setRotation(this.lfleg3, 0.0F, 0.3490659F, 0.3490659F);
    this.lmleg1 = new ModelRenderer(this, 60, 0);
    this.lmleg1.addBox(0.0F, 0.0F, -0.5F, 10, 3, 3);
    this.lmleg1.setRotationPoint(6.0F, 15.0F, 0.0F);
    this.lmleg1.setTextureSize(256, 256);
    this.lmleg1.mirror = true;
    setRotation(this.lmleg1, 0.0F, 0.0F, 0.0872665F);
    this.lmleg2 = new ModelRenderer(this, 60, 8);
    this.lmleg2.addBox(10.0F, -1.0F, 0.0F, 11, 2, 2);
    this.lmleg2.setRotationPoint(6.0F, 15.0F, 0.0F);
    this.lmleg2.setTextureSize(256, 256);
    this.lmleg2.mirror = true;
    setRotation(this.lmleg2, 0.0F, 0.0F, 0.2617994F);
    this.lmleg3 = new ModelRenderer(this, 60, 14);
    this.lmleg3.addBox(21.0F, -2.0F, 0.5F, 10, 1, 1);
    this.lmleg3.setRotationPoint(6.0F, 15.0F, 0.0F);
    this.lmleg3.setTextureSize(256, 256);
    this.lmleg3.mirror = true;
    setRotation(this.lmleg3, 0.0F, 0.0F, 0.3490659F);
    this.lrleg1 = new ModelRenderer(this, 60, 0);
    this.lrleg1.addBox(0.0F, 0.0F, -0.5F, 10, 3, 3);
    this.lrleg1.setRotationPoint(6.0F, 15.0F, 5.0F);
    this.lrleg1.setTextureSize(256, 256);
    this.lrleg1.mirror = true;
    setRotation(this.lrleg1, 0.0F, -0.3490659F, 0.0872665F);
    this.lrleg2 = new ModelRenderer(this, 60, 8);
    this.lrleg2.addBox(10.0F, -1.0F, 0.0F, 11, 2, 2);
    this.lrleg2.setRotationPoint(6.0F, 15.0F, 5.0F);
    this.lrleg2.setTextureSize(256, 256);
    this.lrleg2.mirror = true;
    setRotation(this.lrleg2, 0.0F, -0.3490659F, 0.2617994F);
    this.lrleg3 = new ModelRenderer(this, 60, 14);
    this.lrleg3.addBox(21.0F, -2.0F, 0.5F, 10, 1, 1);
    this.lrleg3.setRotationPoint(6.0F, 15.0F, 5.0F);
    this.lrleg3.setTextureSize(256, 256);
    this.lrleg3.mirror = true;
    setRotation(this.lrleg3, 0.0F, -0.3490659F, 0.3490659F);
    this.jaw5 = new ModelRenderer(this, 115, 78);
    this.jaw5.addBox(2.0F, -2.0F, -9.0F, 2, 3, 3);
    this.jaw5.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw5.setTextureSize(256, 256);
    this.jaw5.mirror = true;
    setRotation(this.jaw5, 0.122173F, 0.0F, 0.0F);
    this.jaw6 = new ModelRenderer(this, 127, 78);
    this.jaw6.addBox(-4.0F, -2.0F, -9.0F, 2, 3, 3);
    this.jaw6.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw6.setTextureSize(256, 256);
    this.jaw6.mirror = true;
    setRotation(this.jaw6, 0.122173F, 0.0F, 0.0F);
    this.jaw7 = new ModelRenderer(this, 115, 86);
    this.jaw7.addBox(5.0F, 1.0F, -6.0F, 9, 1, 1);
    this.jaw7.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw7.setTextureSize(256, 256);
    this.jaw7.mirror = true;
    setRotation(this.jaw7, 0.0F, 0.5585054F, 0.2268928F);
    this.jaw8 = new ModelRenderer(this, 115, 89);
    this.jaw8.addBox(-14.0F, 1.0F, -6.0F, 9, 1, 1);
    this.jaw8.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw8.setTextureSize(256, 256);
    this.jaw8.mirror = true;
    setRotation(this.jaw8, 0.0F, -0.5585054F, -0.2268928F);
    this.rfleg1 = new ModelRenderer(this, 30, 0);
    this.rfleg1.addBox(-10.0F, 0.0F, -0.5F, 10, 3, 3);
    this.rfleg1.setRotationPoint(-6.0F, 15.0F, -5.0F);
    this.rfleg1.setTextureSize(256, 256);
    this.rfleg1.mirror = true;
    setRotation(this.rfleg1, 0.0F, -0.3490659F, -0.0872665F);
    this.rfleg2 = new ModelRenderer(this, 30, 8);
    this.rfleg2.addBox(-21.0F, -1.0F, 0.0F, 11, 2, 2);
    this.rfleg2.setRotationPoint(-6.0F, 15.0F, -5.0F);
    this.rfleg2.setTextureSize(256, 256);
    this.rfleg2.mirror = true;
    setRotation(this.rfleg2, 0.0F, -0.3490659F, -0.2617994F);
    this.rfleg3 = new ModelRenderer(this, 30, 14);
    this.rfleg3.addBox(-31.0F, -2.0F, 0.5F, 10, 1, 1);
    this.rfleg3.setRotationPoint(-6.0F, 15.0F, -5.0F);
    this.rfleg3.setTextureSize(256, 256);
    this.rfleg3.mirror = true;
    setRotation(this.rfleg3, 0.0F, -0.3490659F, -0.3490659F);
    this.rmleg1 = new ModelRenderer(this, 30, 0);
    this.rmleg1.addBox(-10.0F, 0.0F, -0.5F, 10, 3, 3);
    this.rmleg1.setRotationPoint(-6.0F, 15.0F, 0.0F);
    this.rmleg1.setTextureSize(256, 256);
    this.rmleg1.mirror = true;
    setRotation(this.rmleg1, 0.0F, 0.0F, -0.0872665F);
    this.rmleg2 = new ModelRenderer(this, 30, 8);
    this.rmleg2.addBox(-21.0F, -1.0F, 0.0F, 11, 2, 2);
    this.rmleg2.setRotationPoint(-6.0F, 15.0F, 0.0F);
    this.rmleg2.setTextureSize(256, 256);
    this.rmleg2.mirror = true;
    setRotation(this.rmleg2, 0.0F, 0.0F, -0.2617994F);
    this.rmleg3 = new ModelRenderer(this, 30, 14);
    this.rmleg3.addBox(-31.0F, -2.0F, 0.5F, 10, 1, 1);
    this.rmleg3.setRotationPoint(-6.0F, 15.0F, 0.0F);
    this.rmleg3.setTextureSize(256, 256);
    this.rmleg3.mirror = true;
    setRotation(this.rmleg3, 0.0F, 0.0F, -0.3490659F);
    this.rrleg1 = new ModelRenderer(this, 30, 0);
    this.rrleg1.addBox(-10.0F, 0.0F, -0.5F, 10, 3, 3);
    this.rrleg1.setRotationPoint(-6.0F, 15.0F, 5.0F);
    this.rrleg1.setTextureSize(256, 256);
    this.rrleg1.mirror = true;
    setRotation(this.rrleg1, 0.0F, 0.3490659F, -0.0872665F);
    this.rrleg2 = new ModelRenderer(this, 30, 8);
    this.rrleg2.addBox(-21.0F, -1.0F, 0.0F, 11, 2, 2);
    this.rrleg2.setRotationPoint(-6.0F, 15.0F, 5.0F);
    this.rrleg2.setTextureSize(256, 256);
    this.rrleg2.mirror = true;
    setRotation(this.rrleg2, 0.0F, 0.3490659F, -0.2617994F);
    this.rrleg3 = new ModelRenderer(this, 30, 14);
    this.rrleg3.addBox(-31.0F, -2.0F, 0.5F, 10, 1, 1);
    this.rrleg3.setRotationPoint(-6.0F, 15.0F, 5.0F);
    this.rrleg3.setTextureSize(256, 256);
    this.rrleg3.mirror = true;
    setRotation(this.rrleg3, 0.0F, 0.3490659F, -0.3490659F);
    this.jaw9 = new ModelRenderer(this, 121, 70);
    this.jaw9.addBox(-0.5F, -12.0F, -25.0F, 1, 5, 1);
    this.jaw9.setRotationPoint(0.0F, 12.0F, -12.0F);
    this.jaw9.setTextureSize(256, 256);
    this.jaw9.mirror = true;
    setRotation(this.jaw9, 0.3141593F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle = 0.0F;
    HerculesBeetle b = (HerculesBeetle)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * this.wingspeed * 0.45F) * 3.1415927F * 0.12F * f1;
    this.lfleg1.rotateAngleY = 0.349F + newangle;
    this.lfleg2.rotateAngleY = this.lfleg1.rotateAngleY;
    this.lmleg1.rotateAngleY = -newangle;
    this.lmleg2.rotateAngleY = this.lmleg1.rotateAngleY;
    this.lrleg1.rotateAngleY = -0.349F + newangle;
    this.lrleg2.rotateAngleY = this.lrleg1.rotateAngleY;
    this.rfleg1.rotateAngleY = -0.349F + newangle;
    this.rfleg2.rotateAngleY = this.rfleg1.rotateAngleY;
    this.rmleg1.rotateAngleY = -newangle;
    this.rmleg2.rotateAngleY = this.rmleg1.rotateAngleY;
    this.rrleg1.rotateAngleY = 0.349F + newangle;
    this.rrleg2.rotateAngleY = this.rrleg1.rotateAngleY;
    if (b.getAttacking() == 0) {
      newangle = MathHelper.cos(f2 * 0.051F * this.wingspeed) * 3.1415927F * 0.01F;
    } else {
      newangle = MathHelper.cos(f2 * 0.51F * this.wingspeed) * 3.1415927F * 0.07F;
    } 
    this.jaw1.rotateAngleX = 0.122F + newangle;
    this.jaw2.rotateAngleX = 0.122F + newangle;
    this.jaw3.rotateAngleX = 0.0F + newangle;
    this.jaw4.rotateAngleX = 0.0F + newangle;
    this.jaw5.rotateAngleX = 0.122F + newangle;
    this.jaw6.rotateAngleX = 0.122F + newangle;
    this.jaw7.rotateAngleX = 0.0F + newangle;
    this.jaw8.rotateAngleX = 0.0F + newangle;
    this.jaw9.rotateAngleX = 0.314F + newangle;
    this.body1.render(f5);
    this.body2.render(f5);
    this.head1.render(f5);
    this.head2.render(f5);
    this.head3.render(f5);
    this.head4.render(f5);
    this.head5.render(f5);
    this.head6.render(f5);
    this.head8.render(f5);
    this.jaw1.render(f5);
    this.jaw2.render(f5);
    this.jaw3.render(f5);
    this.jaw4.render(f5);
    this.head7.render(f5);
    this.lfleg1.render(f5);
    this.lfleg2.render(f5);
    this.lfleg3.render(f5);
    this.lmleg1.render(f5);
    this.lmleg2.render(f5);
    this.lmleg3.render(f5);
    this.lrleg1.render(f5);
    this.lrleg2.render(f5);
    this.lrleg3.render(f5);
    this.jaw5.render(f5);
    this.jaw6.render(f5);
    this.jaw7.render(f5);
    this.jaw8.render(f5);
    this.rfleg1.render(f5);
    this.rfleg2.render(f5);
    this.rfleg3.render(f5);
    this.rmleg1.render(f5);
    this.rmleg2.render(f5);
    this.rmleg3.render(f5);
    this.rrleg1.render(f5);
    this.rrleg2.render(f5);
    this.rrleg3.render(f5);
    this.jaw9.render(f5);
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
