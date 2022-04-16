package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCricket extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer head;
  
  ModelRenderer abdomen;
  
  ModelRenderer lfleg;
  
  ModelRenderer lrleg;
  
  ModelRenderer rfleg;
  
  ModelRenderer rrleg;
  
  ModelRenderer lleg1;
  
  ModelRenderer rleg1;
  
  ModelRenderer lleg2;
  
  ModelRenderer rleg2;
  
  public ModelCricket(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 25);
    this.body.addBox(-1.0F, -1.0F, -3.0F, 3, 3, 6);
    this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 17);
    this.head.addBox(-1.0F, -2.0F, -1.0F, 3, 4, 3);
    this.head.setRotationPoint(0.0F, 21.0F, -5.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, -0.1745329F, 0.0F, 0.0F);
    this.abdomen = new ModelRenderer(this, 0, 36);
    this.abdomen.addBox(-0.5F, -1.0F, 3.0F, 2, 2, 3);
    this.abdomen.setRotationPoint(0.0F, 21.0F, 0.0F);
    this.abdomen.setTextureSize(64, 64);
    this.abdomen.mirror = true;
    setRotation(this.abdomen, 0.0F, 0.0F, 0.0F);
    this.lfleg = new ModelRenderer(this, 25, 0);
    this.lfleg.addBox(2.0F, 0.0F, 0.0F, 5, 1, 1);
    this.lfleg.setRotationPoint(0.0F, 21.0F, -2.0F);
    this.lfleg.setTextureSize(64, 64);
    this.lfleg.mirror = true;
    setRotation(this.lfleg, 0.0F, 0.4712389F, 0.418879F);
    this.lrleg = new ModelRenderer(this, 23, 4);
    this.lrleg.addBox(1.0F, 0.0F, -2.0F, 6, 1, 1);
    this.lrleg.setRotationPoint(0.0F, 21.0F, 0.0F);
    this.lrleg.setTextureSize(64, 64);
    this.lrleg.mirror = true;
    setRotation(this.lrleg, 0.0F, -0.296706F, 0.418879F);
    this.rfleg = new ModelRenderer(this, 25, 8);
    this.rfleg.addBox(-7.0F, 0.0F, 0.0F, 5, 1, 1);
    this.rfleg.setRotationPoint(1.0F, 21.0F, -2.0F);
    this.rfleg.setTextureSize(64, 64);
    this.rfleg.mirror = true;
    setRotation(this.rfleg, 0.0F, -0.5410521F, -0.4363323F);
    this.rrleg = new ModelRenderer(this, 25, 12);
    this.rrleg.addBox(-7.0F, -1.0F, 0.0F, 5, 1, 1);
    this.rrleg.setRotationPoint(1.0F, 22.0F, -2.0F);
    this.rrleg.setTextureSize(64, 64);
    this.rrleg.mirror = true;
    setRotation(this.rrleg, 0.0F, 0.3839724F, -0.418879F);
    this.lleg1 = new ModelRenderer(this, 40, 0);
    this.lleg1.addBox(-1.0F, -1.0F, 0.0F, 1, 2, 8);
    this.lleg1.setRotationPoint(2.0F, 22.0F, 0.0F);
    this.lleg1.setTextureSize(64, 64);
    this.lleg1.mirror = true;
    setRotation(this.lleg1, 0.5585054F, 0.4363323F, 0.0F);
    this.rleg1 = new ModelRenderer(this, 40, 11);
    this.rleg1.addBox(0.0F, -1.0F, 0.0F, 1, 2, 8);
    this.rleg1.setRotationPoint(-1.0F, 22.0F, 0.0F);
    this.rleg1.setTextureSize(64, 64);
    this.rleg1.mirror = true;
    setRotation(this.rleg1, 0.5585054F, -0.4363323F, 0.0F);
    this.lleg2 = new ModelRenderer(this, 21, 23);
    this.lleg2.addBox(-0.5F, -6.5F, 4.5F, 1, 1, 8);
    this.lleg2.setRotationPoint(2.0F, 22.0F, 0.0F);
    this.lleg2.setTextureSize(64, 64);
    this.lleg2.mirror = true;
    setRotation(this.lleg2, -0.3665191F, 0.3490659F, 0.0F);
    this.rleg2 = new ModelRenderer(this, 21, 34);
    this.rleg2.addBox(-0.5F, -6.5F, 4.0F, 1, 1, 8);
    this.rleg2.setRotationPoint(-1.0F, 22.0F, 0.0F);
    this.rleg2.setTextureSize(64, 64);
    this.rleg2.mirror = true;
    setRotation(this.rleg2, -0.3665191F, -0.3490659F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Cricket c = (Cricket)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lfleg.rotateAngleY = 0.47F + newangle;
    this.rfleg.rotateAngleY = -0.54F + newangle;
    this.lrleg.rotateAngleY = -0.296F - newangle;
    this.rrleg.rotateAngleY = 0.384F - newangle;
    if (c.getSinging() != 0) {
      newangle = MathHelper.cos(f2 * 3.0F * this.wingspeed) * 3.1415927F * 0.25F;
      this.lleg1.rotateAngleY = -0.035F;
      this.lleg2.rotateAngleY = -0.105F;
      this.rleg1.rotateAngleY = 0.035F;
      this.rleg2.rotateAngleY = 0.105F;
    } else {
      newangle = 0.0F;
      this.lleg1.rotateAngleY = 0.436F;
      this.lleg2.rotateAngleY = 0.349F;
      this.rleg1.rotateAngleY = -0.436F;
      this.rleg2.rotateAngleY = -0.349F;
    } 
    this.lleg1.rotateAngleX = newangle + 0.558F;
    this.lleg2.rotateAngleX = newangle - 0.366F;
    this.rleg1.rotateAngleX = -newangle + 0.558F;
    this.rleg2.rotateAngleX = -newangle - 0.366F;
    this.body.render(f5);
    this.head.render(f5);
    this.abdomen.render(f5);
    this.lfleg.render(f5);
    this.lrleg.render(f5);
    this.rfleg.render(f5);
    this.rrleg.render(f5);
    this.lleg1.render(f5);
    this.rleg1.render(f5);
    this.lleg2.render(f5);
    this.rleg2.render(f5);
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
