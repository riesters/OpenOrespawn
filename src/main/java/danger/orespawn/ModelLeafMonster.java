package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLeafMonster extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer larm;
  
  ModelRenderer rarm;
  
  ModelRenderer lleg;
  
  ModelRenderer rleg;
  
  public ModelLeafMonster() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.body = new ModelRenderer(this, 32, 32);
    this.body.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.larm = new ModelRenderer(this, 64, 0);
    this.larm.addBox(0.0F, -16.0F, -8.0F, 16, 16, 16);
    this.larm.setRotationPoint(8.0F, -8.0F, 0.0F);
    this.larm.setTextureSize(64, 32);
    this.larm.mirror = true;
    setRotation(this.larm, 0.0F, 0.0F, 0.0F);
    this.rarm = new ModelRenderer(this, 0, 0);
    this.rarm.addBox(-16.0F, -16.0F, -8.0F, 16, 16, 16);
    this.rarm.setRotationPoint(-8.0F, -8.0F, 0.0F);
    this.rarm.setTextureSize(64, 32);
    this.rarm.mirror = true;
    setRotation(this.rarm, 0.0F, 0.0F, 0.0F);
    this.lleg = new ModelRenderer(this, 64, 64);
    this.lleg.addBox(0.0F, 0.0F, -8.0F, 16, 16, 16);
    this.lleg.setRotationPoint(8.0F, 8.0F, 0.0F);
    this.lleg.setTextureSize(64, 32);
    this.lleg.mirror = true;
    setRotation(this.lleg, 0.0F, 0.0F, 0.0F);
    this.rleg = new ModelRenderer(this, 0, 64);
    this.rleg.addBox(-16.0F, 0.0F, -8.0F, 16, 16, 16);
    this.rleg.setRotationPoint(-8.0F, 8.0F, 0.0F);
    this.rleg.setTextureSize(64, 32);
    this.rleg.mirror = true;
    setRotation(this.rleg, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    LeafMonster lm = (LeafMonster)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (lm.getAttacking() == 0) {
      this.body.rotationPointY = 16.0F;
      this.rarm.rotationPointY = 8.0F;
      this.larm.rotationPointY = 8.0F;
      this.rarm.rotateAngleY = 0.0F;
      this.larm.rotateAngleY = 0.0F;
      this.rarm.rotateAngleX = 0.0F;
      this.larm.rotateAngleX = 0.0F;
      this.lleg.rotateAngleX = 0.0F;
      this.rleg.rotateAngleX = 0.0F;
    } else {
      this.body.rotationPointY = 0.0F;
      this.rarm.rotationPointY = -8.0F;
      this.larm.rotationPointY = -8.0F;
      float newangle;
      if (f1 > 0.1D) {
        newangle = MathHelper.cos(f2 * 0.95F) * 3.1415927F * 0.25F * f1;
      } else {
        newangle = 0.0F;
      } 
      this.lleg.rotateAngleX = newangle;
      this.rleg.rotateAngleX = -newangle;
      newangle = MathHelper.cos(f2 * 0.7F) * 3.1415927F * 0.55F;
      this.rarm.rotateAngleY = -Math.abs(newangle);
      this.larm.rotateAngleY = Math.abs(newangle);
      this.rarm.rotateAngleX = -Math.abs(newangle);
      this.larm.rotateAngleX = -Math.abs(newangle);
    } 
    this.body.render(f5);
    this.larm.render(f5);
    this.rarm.render(f5);
    this.lleg.render(f5);
    this.rleg.render(f5);
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
