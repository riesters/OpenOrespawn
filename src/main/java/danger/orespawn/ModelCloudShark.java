package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCloudShark extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer body;
  
  ModelRenderer head;
  
  ModelRenderer jaw;
  
  ModelRenderer topfin;
  
  ModelRenderer bbody;
  
  ModelRenderer fins;
  
  ModelRenderer leftfin;
  
  ModelRenderer rightfin;
  
  public ModelCloudShark(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 6, 8, 15);
    this.body.setRotationPoint(-4.0F, 11.0F, 0.0F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 51);
    this.head.addBox(-2.5F, 0.0F, -8.0F, 5, 5, 8);
    this.head.setRotationPoint(-1.0F, 11.0F, 0.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 42, 0);
    this.jaw.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 6);
    this.jaw.setRotationPoint(-1.0F, 15.0F, 0.0F);
    this.jaw.setTextureSize(64, 64);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.5056291F, 0.0F, 0.0F);
    this.topfin = new ModelRenderer(this, 0, 0);
    this.topfin.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
    this.topfin.setRotationPoint(-1.5F, 11.0F, 5.0F);
    this.topfin.setTextureSize(64, 64);
    this.topfin.mirror = true;
    setRotation(this.topfin, 0.935765F, 0.0F, 0.0F);
    this.bbody = new ModelRenderer(this, 0, 9);
    this.bbody.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 6);
    this.bbody.setRotationPoint(-1.0F, 11.0F, 15.0F);
    this.bbody.setTextureSize(64, 64);
    this.bbody.mirror = true;
    setRotation(this.bbody, 0.0F, 0.0F, 0.0F);
    this.fins = new ModelRenderer(this, 0, 24);
    this.fins.addBox(0.0F, 0.0F, 0.0F, 0, 10, 10);
    this.fins.setRotationPoint(-1.0F, 16.0F, 16.0F);
    this.fins.setTextureSize(64, 64);
    this.fins.mirror = true;
    setRotation(this.fins, 0.9220296F, 0.0F, 0.0F);
    this.leftfin = new ModelRenderer(this, 0, 0);
    this.leftfin.addBox(0.0F, 0.0F, 0.0F, 0, 3, 7);
    this.leftfin.setRotationPoint(2.0F, 16.0F, 6.0F);
    this.leftfin.setTextureSize(64, 64);
    this.leftfin.mirror = true;
    setRotation(this.leftfin, -0.6108652F, 1.134464F, -0.6108652F);
    this.rightfin = new ModelRenderer(this, 0, 0);
    this.rightfin.addBox(0.0F, 0.0F, 0.0F, 0, 3, 7);
    this.rightfin.setRotationPoint(-4.0F, 16.0F, 6.0F);
    this.rightfin.setTextureSize(64, 64);
    this.rightfin.mirror = true;
    setRotation(this.rightfin, -0.6283185F, -1.134464F, 0.6108652F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * 0.7F * this.wingspeed) * 3.1415927F * 0.15F;
    this.leftfin.rotateAngleY = 1.15F + newangle;
    newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.15F;
    this.rightfin.rotateAngleY = -0.9F + newangle;
    newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.25F;
    this.fins.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.1F;
    this.jaw.rotateAngleX = 0.5F + newangle;
    this.body.render(f5);
    this.head.render(f5);
    this.jaw.render(f5);
    this.topfin.render(f5);
    this.bbody.render(f5);
    this.fins.render(f5);
    this.leftfin.render(f5);
    this.rightfin.render(f5);
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
