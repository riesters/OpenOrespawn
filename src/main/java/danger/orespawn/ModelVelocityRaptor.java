package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelVelocityRaptor extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer hf3;
  
  ModelRenderer hf4;
  
  ModelRenderer hf2;
  
  ModelRenderer hf1;
  
  ModelRenderer lff2;
  
  ModelRenderer lff1;
  
  ModelRenderer lff3;
  
  ModelRenderer rff2;
  
  ModelRenderer rff3;
  
  ModelRenderer rff1;
  
  ModelRenderer tf4;
  
  ModelRenderer tf1;
  
  ModelRenderer Shape1;
  
  ModelRenderer neck;
  
  ModelRenderer head1;
  
  ModelRenderer lf1;
  
  ModelRenderer lf2;
  
  ModelRenderer head2;
  
  ModelRenderer tail1;
  
  ModelRenderer tail2;
  
  ModelRenderer bl1;
  
  ModelRenderer br1;
  
  ModelRenderer bl2;
  
  ModelRenderer br2;
  
  ModelRenderer bl3;
  
  ModelRenderer bl4;
  
  ModelRenderer br3;
  
  ModelRenderer rf1;
  
  ModelRenderer rf2;
  
  ModelRenderer tf2;
  
  ModelRenderer tf3;
  
  ModelRenderer br4;
  
  ModelRenderer Hat1;
  
  ModelRenderer Hat2;
  
  public ModelVelocityRaptor(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.hf3 = new ModelRenderer(this, 0, 0);
    this.hf3.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.hf3.setRotationPoint(0.0F, 7.0F, -2.0F);
    this.hf3.setTextureSize(128, 128);
    this.hf3.mirror = true;
    setRotation(this.hf3, 0.4537856F, 0.0F, 0.0F);
    this.hf4 = new ModelRenderer(this, 0, 0);
    this.hf4.addBox(0.0F, -0.2F, 0.0F, 0, 1, 3);
    this.hf4.setRotationPoint(0.0F, 8.0F, -1.5F);
    this.hf4.setTextureSize(128, 128);
    this.hf4.mirror = true;
    setRotation(this.hf4, 0.2443461F, 0.0F, 0.0F);
    this.hf2 = new ModelRenderer(this, 0, 0);
    this.hf2.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.hf2.setRotationPoint(0.0F, 7.0F, -3.5F);
    this.hf2.setTextureSize(128, 128);
    this.hf2.mirror = true;
    setRotation(this.hf2, 0.6632251F, 0.0F, 0.0F);
    this.hf1 = new ModelRenderer(this, 0, 1);
    this.hf1.addBox(0.0F, 0.0F, 0.0F, 0, 1, 2);
    this.hf1.setRotationPoint(0.0F, 7.0F, -4.5F);
    this.hf1.setTextureSize(128, 128);
    this.hf1.mirror = true;
    setRotation(this.hf1, 0.9424778F, 0.0F, 0.0F);
    this.lff2 = new ModelRenderer(this, 0, 6);
    this.lff2.addBox(0.5F, 2.5F, 3.0F, 0, 1, 3);
    this.lff2.setRotationPoint(2.0F, 14.0F, 1.0F);
    this.lff2.setTextureSize(128, 128);
    this.lff2.mirror = true;
    setRotation(this.lff2, -0.4537856F, 0.0F, 0.0F);
    this.lff1 = new ModelRenderer(this, 0, 6);
    this.lff1.addBox(0.5F, 2.0F, 2.0F, 0, 1, 3);
    this.lff1.setRotationPoint(2.0F, 14.0F, 1.0F);
    this.lff1.setTextureSize(128, 128);
    this.lff1.mirror = true;
    setRotation(this.lff1, -0.2792527F, 0.0F, 0.0F);
    this.lff3 = new ModelRenderer(this, 0, 6);
    this.lff3.addBox(0.5F, 1.0F, 4.0F, 0, 1, 3);
    this.lff3.setRotationPoint(2.0F, 14.0F, 1.0F);
    this.lff3.setTextureSize(128, 128);
    this.lff3.mirror = true;
    setRotation(this.lff3, -1.047198F, 0.0F, 0.0F);
    this.rff2 = new ModelRenderer(this, 0, 6);
    this.rff2.addBox(-0.5F, 2.5F, 3.0F, 0, 1, 3);
    this.rff2.setRotationPoint(-2.0F, 14.0F, 1.0F);
    this.rff2.setTextureSize(128, 128);
    this.rff2.mirror = true;
    setRotation(this.rff2, -0.4537856F, 0.0F, 0.0F);
    this.rff3 = new ModelRenderer(this, 0, 6);
    this.rff3.addBox(-0.5F, 1.0F, 4.0F, 0, 1, 3);
    this.rff3.setRotationPoint(-2.0F, 14.0F, 1.0F);
    this.rff3.setTextureSize(128, 128);
    this.rff3.mirror = true;
    setRotation(this.rff3, -1.047198F, 0.0F, 0.0F);
    this.rff1 = new ModelRenderer(this, 0, 6);
    this.rff1.addBox(-0.5F, 2.0F, 2.0F, 0, 1, 3);
    this.rff1.setRotationPoint(-2.0F, 14.0F, 1.0F);
    this.rff1.setTextureSize(128, 128);
    this.rff1.mirror = true;
    setRotation(this.rff1, -0.2792527F, 0.0F, 0.0F);
    this.tf4 = new ModelRenderer(this, 0, 3);
    this.tf4.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.tf4.setRotationPoint(0.0F, 11.0F, 25.0F);
    this.tf4.setTextureSize(128, 128);
    this.tf4.mirror = true;
    setRotation(this.tf4, -0.5410521F, 0.0F, 0.0F);
    this.tf1 = new ModelRenderer(this, 0, 3);
    this.tf1.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.tf1.setRotationPoint(0.0F, 11.0F, 19.0F);
    this.tf1.setTextureSize(128, 128);
    this.tf1.mirror = true;
    setRotation(this.tf1, -0.5410521F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 11);
    this.Shape1.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.Shape1.setTextureSize(128, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 0, 19);
    this.neck.addBox(-1.0F, -7.0F, -2.0F, 2, 8, 3);
    this.neck.setRotationPoint(0.0F, 12.0F, 2.0F);
    this.neck.setTextureSize(128, 128);
    this.neck.mirror = true;
    setRotation(this.neck, 1.082104F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 0, 49);
    this.head1.addBox(-2.0F, 0.0F, -7.0F, 3, 4, 7);
    this.head1.setRotationPoint(0.5F, 7.0F, -1.0F);
    this.head1.setTextureSize(128, 128);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.lf1 = new ModelRenderer(this, 0, 31);
    this.lf1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2);
    this.lf1.setRotationPoint(2.0F, 14.0F, 1.0F);
    this.lf1.setTextureSize(128, 128);
    this.lf1.mirror = true;
    setRotation(this.lf1, 0.2792527F, 0.0F, 0.0F);
    this.lf2 = new ModelRenderer(this, 16, 19);
    this.lf2.addBox(0.0F, 1.0F, 2.0F, 1, 4, 1);
    this.lf2.setRotationPoint(2.0F, 14.0F, 1.0F);
    this.lf2.setTextureSize(128, 128);
    this.lf2.mirror = true;
    setRotation(this.lf2, -0.4363323F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 20, 0);
    this.head2.addBox(-1.0F, 0.0F, -10.0F, 2, 4, 4);
    this.head2.setRotationPoint(0.0F, 7.0F, -1.0F);
    this.head2.setTextureSize(128, 128);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 0, 38);
    this.tail1.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 4);
    this.tail1.setRotationPoint(0.0F, 10.0F, 11.0F);
    this.tail1.setTextureSize(128, 128);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 26, 11);
    this.tail2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 10);
    this.tail2.setRotationPoint(-0.5F, 10.0F, 15.0F);
    this.tail2.setTextureSize(128, 128);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.bl1 = new ModelRenderer(this, 22, 24);
    this.bl1.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 4);
    this.bl1.setRotationPoint(2.0F, 13.0F, 6.0F);
    this.bl1.setTextureSize(128, 128);
    this.bl1.mirror = true;
    setRotation(this.bl1, 0.0F, 0.0F, 0.0F);
    this.br1 = new ModelRenderer(this, 36, 0);
    this.br1.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 4);
    this.br1.setRotationPoint(-2.0F, 13.0F, 6.0F);
    this.br1.setTextureSize(128, 128);
    this.br1.mirror = true;
    setRotation(this.br1, 0.0F, 0.0F, 0.0F);
    this.bl2 = new ModelRenderer(this, 12, 26);
    this.bl2.addBox(-1.0F, 5.0F, -3.0F, 2, 5, 2);
    this.bl2.setRotationPoint(2.0F, 13.0F, 6.0F);
    this.bl2.setTextureSize(128, 128);
    this.bl2.mirror = true;
    setRotation(this.bl2, 0.4886922F, 0.0F, 0.0F);
    this.br2 = new ModelRenderer(this, 13, 36);
    this.br2.addBox(-1.0F, 5.0F, -3.0F, 2, 5, 2);
    this.br2.setRotationPoint(-2.0F, 13.0F, 6.0F);
    this.br2.setTextureSize(128, 128);
    this.br2.mirror = true;
    setRotation(this.br2, 0.4886922F, 0.0F, 0.0F);
    this.bl3 = new ModelRenderer(this, 28, 39);
    this.bl3.addBox(-1.0F, 9.0F, -1.0F, 2, 2, 4);
    this.bl3.setRotationPoint(2.0F, 13.0F, 6.0F);
    this.bl3.setTextureSize(128, 128);
    this.bl3.mirror = true;
    setRotation(this.bl3, 0.0F, 0.0F, 0.0F);
    this.br3 = new ModelRenderer(this, 18, 45);
    this.br3.addBox(-1.0F, 9.0F, -1.0F, 2, 2, 4);
    this.br3.setRotationPoint(-2.0F, 13.0F, 6.0F);
    this.br3.setTextureSize(128, 128);
    this.br3.mirror = true;
    setRotation(this.br3, 0.0F, 0.0F, 0.0F);
    this.rf1 = new ModelRenderer(this, 35, 31);
    this.rf1.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 2);
    this.rf1.setRotationPoint(-2.0F, 14.0F, 1.0F);
    this.rf1.setTextureSize(128, 128);
    this.rf1.mirror = true;
    setRotation(this.rf1, 0.2792527F, 0.0F, 0.0F);
    this.rf2 = new ModelRenderer(this, 11, 19);
    this.rf2.addBox(-1.0F, 1.0F, 2.0F, 1, 4, 1);
    this.rf2.setRotationPoint(-2.0F, 14.0F, 1.0F);
    this.rf2.setTextureSize(128, 128);
    this.rf2.mirror = true;
    setRotation(this.rf2, -0.4363323F, 0.0F, 0.0F);
    this.tf2 = new ModelRenderer(this, 0, 3);
    this.tf2.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.tf2.setRotationPoint(0.0F, 11.0F, 21.0F);
    this.tf2.setTextureSize(128, 128);
    this.tf2.mirror = true;
    setRotation(this.tf2, -0.5410521F, 0.0F, 0.0F);
    this.tf3 = new ModelRenderer(this, 0, 3);
    this.tf3.addBox(0.0F, 0.0F, 0.0F, 0, 1, 3);
    this.tf3.setRotationPoint(0.0F, 11.0F, 23.0F);
    this.tf3.setTextureSize(128, 128);
    this.tf3.mirror = true;
    setRotation(this.tf3, -0.5410521F, 0.0F, 0.0F);
    this.bl4 = new ModelRenderer(this, 31, 10);
    this.bl4.addBox(-1.0F, 6.0F, -5.0F, 1, 3, 1);
    this.bl4.setRotationPoint(2.0F, 13.0F, 6.0F);
    this.bl4.setTextureSize(128, 128);
    this.bl4.mirror = true;
    setRotation(this.bl4, 0.6283185F, 0.0F, 0.0F);
    this.br4 = new ModelRenderer(this, 31, 15);
    this.br4.addBox(0.0F, 6.0F, -5.0F, 1, 3, 1);
    this.br4.setRotationPoint(-2.0F, 13.0F, 6.0F);
    this.br4.setTextureSize(128, 128);
    this.br4.mirror = true;
    setRotation(this.br4, 0.6283185F, 0.0F, 0.0F);
    this.Hat1 = new ModelRenderer(this, 50, 0);
    this.Hat1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5);
    this.Hat1.setRotationPoint(-2.0F, 6.0F, -6.0F);
    this.Hat1.setTextureSize(128, 128);
    this.Hat1.mirror = true;
    setRotation(this.Hat1, 0.0F, 0.0F, 0.0F);
    this.Hat2 = new ModelRenderer(this, 50, 0);
    this.Hat2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
    this.Hat2.setRotationPoint(-1.5F, 4.0F, -4.0F);
    this.Hat2.setTextureSize(128, 128);
    this.Hat2.mirror = true;
    setRotation(this.Hat2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    VelocityRaptor c = (VelocityRaptor)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.bl1.rotateAngleX = newangle;
    this.bl2.rotateAngleX = newangle + 0.488F;
    this.bl3.rotateAngleX = newangle;
    this.bl4.rotateAngleX = newangle + 0.628F;
    this.br1.rotateAngleX = -newangle;
    this.br2.rotateAngleX = -newangle + 0.488F;
    this.br3.rotateAngleX = -newangle;
    this.br4.rotateAngleX = -newangle + 0.628F;
    hf = c.getVHealth() / c.getMaxHealth();
    newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed * hf) * 3.1415927F * 0.1F * hf;
    this.hf1.rotateAngleY = newangle;
    this.hf2.rotateAngleY = -newangle;
    this.hf3.rotateAngleY = newangle;
    this.hf4.rotateAngleY = -newangle;
    newangle = MathHelper.cos(f2 * 0.3F) * 3.1415927F * 0.05F;
    this.lf1.rotateAngleX = newangle + 0.279F;
    this.lf2.rotateAngleX = newangle - 0.436F;
    this.lff1.rotateAngleX = newangle - 0.279F;
    this.lff2.rotateAngleX = newangle - 0.453F;
    this.lff3.rotateAngleX = newangle - 1.047F;
    this.rf1.rotateAngleX = -newangle + 0.279F;
    this.rf2.rotateAngleX = -newangle - 0.436F;
    this.rff1.rotateAngleX = -newangle - 0.279F;
    this.rff2.rotateAngleX = -newangle - 0.453F;
    this.rff3.rotateAngleX = -newangle - 1.047F;
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F;
    this.lff1.rotateAngleY = newangle;
    this.lff2.rotateAngleY = -newangle;
    this.lff3.rotateAngleY = newangle;
    this.rff1.rotateAngleY = -newangle;
    this.rff2.rotateAngleY = newangle;
    this.rff3.rotateAngleY = -newangle;
    if (c.isSitting()) {
      newangle = 0.0F;
    } else {
      newangle = MathHelper.cos(f2 * 1.4F * this.wingspeed * hf) * 3.1415927F * 0.25F * hf;
    } 
    this.tf1.rotateAngleZ = newangle;
    this.tf2.rotateAngleZ = -newangle;
    this.tf3.rotateAngleZ = newangle;
    this.tf4.rotateAngleZ = -newangle;
    this.hf3.render(f5);
    this.hf4.render(f5);
    this.hf2.render(f5);
    this.hf1.render(f5);
    this.tf1.render(f5);
    this.tf2.render(f5);
    this.tf3.render(f5);
    this.tf4.render(f5);
    this.lf1.render(f5);
    this.lf2.render(f5);
    this.lff2.render(f5);
    this.lff1.render(f5);
    this.lff3.render(f5);
    this.rf1.render(f5);
    this.rf2.render(f5);
    this.rff2.render(f5);
    this.rff3.render(f5);
    this.rff1.render(f5);
    this.bl1.render(f5);
    this.bl2.render(f5);
    this.bl3.render(f5);
    this.bl4.render(f5);
    this.br1.render(f5);
    this.br2.render(f5);
    this.br3.render(f5);
    this.br4.render(f5);
    this.Shape1.render(f5);
    this.neck.render(f5);
    this.head1.render(f5);
    this.head2.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    if (c instanceof EntityCannonFodder && 
      c.get_is_activated() != 0) {
      this.Hat1.render(f5);
      if (c.get_is_activated() > 1)
        this.Hat2.render(f5); 
    } 
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
