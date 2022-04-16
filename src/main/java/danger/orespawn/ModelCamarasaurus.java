package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCamarasaurus extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Body1;
  
  ModelRenderer Body2;
  
  ModelRenderer Body3;
  
  ModelRenderer Body4;
  
  ModelRenderer Tail0;
  
  ModelRenderer Neck1;
  
  ModelRenderer Neck2;
  
  ModelRenderer Neck3;
  
  ModelRenderer Head1;
  
  ModelRenderer Head2;
  
  ModelRenderer Tail1;
  
  ModelRenderer Tail2;
  
  ModelRenderer Tail3;
  
  ModelRenderer BLegupleft;
  
  ModelRenderer FLegupleft;
  
  ModelRenderer BLegupright;
  
  ModelRenderer FLegupright;
  
  ModelRenderer BLegdownright;
  
  ModelRenderer FLegdownleft;
  
  ModelRenderer FLegdownright;
  
  ModelRenderer BLegdownleft;
  
  public ModelCamarasaurus(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.Body1 = new ModelRenderer(this, 0, 135);
    this.Body1.addBox(-6.0F, 0.0F, 0.0F, 12, 12, 12);
    this.Body1.setRotationPoint(0.0F, -1.0F, 0.0F);
    this.Body1.setTextureSize(256, 256);
    this.Body1.mirror = true;
    setRotation(this.Body1, 0.0F, 0.0F, 0.0F);
    this.Body2 = new ModelRenderer(this, 0, 160);
    this.Body2.addBox(-5.0F, 0.0F, 0.0F, 10, 10, 6);
    this.Body2.setRotationPoint(0.0F, -2.0F, -4.0F);
    this.Body2.setTextureSize(256, 256);
    this.Body2.mirror = true;
    setRotation(this.Body2, -0.1858931F, 0.0F, 0.0F);
    this.Body3 = new ModelRenderer(this, 0, 177);
    this.Body3.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 4);
    this.Body3.setRotationPoint(0.0F, -3.0F, -6.0F);
    this.Body3.setTextureSize(256, 256);
    this.Body3.mirror = true;
    setRotation(this.Body3, -0.3346075F, 0.0F, 0.0F);
    this.Body4 = new ModelRenderer(this, 0, 120);
    this.Body4.addBox(-5.0F, 0.0F, 0.0F, 10, 10, 4);
    this.Body4.setRotationPoint(0.0F, 0.0F, 11.0F);
    this.Body4.setTextureSize(256, 256);
    this.Body4.mirror = true;
    setRotation(this.Body4, 0.0F, 0.0F, 0.0F);
    this.Tail0 = new ModelRenderer(this, 0, 107);
    this.Tail0.addBox(-3.0F, -2.0F, 0.0F, 6, 6, 6);
    this.Tail0.setRotationPoint(0.0F, 3.0F, 14.0F);
    this.Tail0.setTextureSize(256, 256);
    this.Tail0.mirror = true;
    setRotation(this.Tail0, -0.0743572F, 0.0F, 0.0F);
    this.Neck1 = new ModelRenderer(this, 0, 190);
    this.Neck1.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 5);
    this.Neck1.setRotationPoint(0.0F, -4.0F, -9.0F);
    this.Neck1.setTextureSize(256, 256);
    this.Neck1.mirror = true;
    setRotation(this.Neck1, -0.4089647F, 0.0F, 0.0F);
    this.Neck2 = new ModelRenderer(this, 0, 202);
    this.Neck2.addBox(-2.0F, 0.0F, -6.0F, 4, 4, 7);
    this.Neck2.setRotationPoint(0.0F, -3.0F, -9.0F);
    this.Neck2.setTextureSize(256, 256);
    this.Neck2.mirror = true;
    setRotation(this.Neck2, -0.5948578F, 0.0F, 0.0F);
    this.Neck3 = new ModelRenderer(this, 0, 214);
    this.Neck3.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 13);
    this.Neck3.setRotationPoint(0.0F, -5.0F, -15.0F);
    this.Neck3.setTextureSize(256, 256);
    this.Neck3.mirror = true;
    setRotation(this.Neck3, -0.8179294F, 0.0F, 0.0F);
    this.Head1 = new ModelRenderer(this, 0, 232);
    this.Head1.addBox(-4.0F, -3.0F, -6.0F, 8, 6, 6);
    this.Head1.setRotationPoint(0.0F, -13.0F, -22.0F);
    this.Head1.setTextureSize(256, 256);
    this.Head1.mirror = true;
    setRotation(this.Head1, -0.1115358F, 0.0F, 0.0F);
    this.Head2 = new ModelRenderer(this, 0, 245);
    this.Head2.addBox(-3.0F, -2.0F, -4.0F, 6, 4, 4);
    this.Head2.setRotationPoint(0.0F, -13.0F, -27.0F);
    this.Head2.setTextureSize(256, 256);
    this.Head2.mirror = true;
    setRotation(this.Head2, 0.0F, 0.0F, 0.0F);
    this.Tail1 = new ModelRenderer(this, 0, 93);
    this.Tail1.addBox(-2.0F, -3.0F, 0.0F, 4, 4, 9);
    this.Tail1.setRotationPoint(0.0F, 5.0F, 19.0F);
    this.Tail1.setTextureSize(256, 256);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, -0.1115358F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 0, 82);
    this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
    this.Tail2.setRotationPoint(0.0F, 4.0F, 26.0F);
    this.Tail2.setTextureSize(256, 256);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, -0.0743572F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 0, 73);
    this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7);
    this.Tail3.setRotationPoint(0.0F, 4.5F, 34.0F);
    this.Tail3.setTextureSize(256, 256);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, -0.0371786F, 0.0F, 0.0F);
    this.BLegupleft = new ModelRenderer(this, 49, 157);
    this.BLegupleft.addBox(0.0F, 0.0F, 0.0F, 6, 8, 6);
    this.BLegupleft.setRotationPoint(2.0F, 9.0F, 7.0F);
    this.BLegupleft.setTextureSize(256, 256);
    this.BLegupleft.mirror = true;
    setRotation(this.BLegupleft, -0.1487195F, 0.0F, 0.0F);
    this.FLegupleft = new ModelRenderer(this, 49, 141);
    this.FLegupleft.addBox(0.0F, 0.0F, -6.0F, 6, 9, 6);
    this.FLegupleft.setRotationPoint(2.0F, 8.0F, 2.0F);
    this.FLegupleft.setTextureSize(256, 256);
    this.FLegupleft.mirror = true;
    setRotation(this.FLegupleft, 0.0F, 0.0F, 0.0F);
    this.BLegupright = new ModelRenderer(this, 49, 126);
    this.BLegupright.addBox(-6.0F, 0.0F, 0.0F, 6, 8, 6);
    this.BLegupright.setRotationPoint(-2.0F, 9.0F, 7.0F);
    this.BLegupright.setTextureSize(256, 256);
    this.BLegupright.mirror = true;
    setRotation(this.BLegupright, -0.1487144F, 0.0F, 0.0F);
    this.FLegupright = new ModelRenderer(this, 49, 110);
    this.FLegupright.addBox(-6.0F, 0.0F, -6.0F, 6, 9, 6);
    this.FLegupright.setRotationPoint(-2.0F, 8.0F, 2.0F);
    this.FLegupright.setTextureSize(256, 256);
    this.FLegupright.mirror = true;
    setRotation(this.FLegupright, 0.0F, 0.0F, 0.0F);
    this.BLegdownright = new ModelRenderer(this, 115, 157);
    this.BLegdownright.addBox(-5.0F, 7.0F, -1.0F, 5, 8, 5);
    this.BLegdownright.setRotationPoint(-2.0F, 9.0F, 7.0F);
    this.BLegdownright.setTextureSize(256, 256);
    this.BLegdownright.mirror = true;
    setRotation(this.BLegdownright, 0.0F, 0.0F, 0.0F);
    this.FLegdownleft = new ModelRenderer(this, 94, 143);
    this.FLegdownleft.addBox(0.0F, 8.0F, -6.0F, 5, 8, 5);
    this.FLegdownleft.setRotationPoint(2.0F, 8.0F, 2.0F);
    this.FLegdownleft.setTextureSize(256, 256);
    this.FLegdownleft.mirror = true;
    setRotation(this.FLegdownleft, 0.0F, 0.0F, 0.0F);
    this.FLegdownright = new ModelRenderer(this, 94, 157);
    this.FLegdownright.addBox(-5.0F, 8.0F, -6.0F, 5, 8, 5);
    this.FLegdownright.setRotationPoint(-2.0F, 8.0F, 2.0F);
    this.FLegdownright.setTextureSize(256, 256);
    this.FLegdownright.mirror = true;
    setRotation(this.FLegdownright, 0.0F, 0.0F, 0.0F);
    this.BLegdownleft = new ModelRenderer(this, 115, 143);
    this.BLegdownleft.addBox(0.0F, 7.0F, -1.0F, 5, 8, 5);
    this.BLegdownleft.setRotationPoint(2.0F, 9.0F, 7.0F);
    this.BLegdownleft.setTextureSize(256, 256);
    this.BLegdownleft.mirror = true;
    setRotation(this.BLegdownleft, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Camarasaurus c = (Camarasaurus)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.FLegupleft.rotateAngleX = newangle;
    this.FLegdownleft.rotateAngleX = newangle;
    this.FLegupright.rotateAngleX = -newangle;
    this.FLegdownright.rotateAngleX = -newangle;
    this.BLegupleft.rotateAngleX = -0.15F - newangle;
    this.BLegdownleft.rotateAngleX = -newangle;
    this.BLegupright.rotateAngleX = -0.15F + newangle;
    this.BLegdownright.rotateAngleX = newangle;
    hf = c.getCamarasaurusHealth() / c.getMaxHealth();
    newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed * hf) * 3.1415927F * 0.25F * hf;
    if (c.isSitting() == true)
      newangle = 0.0F; 
    this.Tail0.rotateAngleY = newangle * 0.25F;
    this.Tail0.rotationPointZ += (float)Math.cos(this.Tail0.rotateAngleY) * 5.0F;
    this.Tail0.rotationPointX += (float)Math.sin(this.Tail0.rotateAngleY) * 5.0F;
    this.Tail1.rotateAngleY = newangle * 0.5F;
    this.Tail1.rotationPointZ += (float)Math.cos(this.Tail1.rotateAngleY) * 8.0F;
    this.Tail1.rotationPointX += (float)Math.sin(this.Tail1.rotateAngleY) * 8.0F;
    this.Tail2.rotateAngleY = newangle * 0.75F;
    this.Tail2.rotationPointZ += (float)Math.cos(this.Tail2.rotateAngleY) * 7.0F;
    this.Tail2.rotationPointX += (float)Math.sin(this.Tail2.rotateAngleY) * 7.0F;
    this.Tail3.rotateAngleY = newangle * 1.0F;
    this.Neck1.rotateAngleY = (float)Math.toRadians(f3) * 0.125F;
    this.Neck2.rotationPointZ = this.Neck1.rotationPointZ;
    this.Neck2.rotationPointX = this.Neck1.rotationPointX;
    this.Neck2.rotateAngleY = (float)Math.toRadians(f3) * 0.25F;
    this.Neck2.rotationPointZ -= (float)Math.cos(this.Neck2.rotateAngleY) * 6.0F;
    this.Neck2.rotationPointX -= (float)Math.sin(this.Neck2.rotateAngleY) * 6.0F;
    this.Neck3.rotateAngleY = (float)Math.toRadians(f3) * 0.38F;
    this.Neck3.rotationPointZ -= (float)Math.cos(this.Neck3.rotateAngleY) * 7.0F;
    this.Neck3.rotationPointX -= (float)Math.sin(this.Neck3.rotateAngleY) * 7.0F;
    this.Head1.rotateAngleY = (float)Math.toRadians(f3);
    this.Head1.rotationPointZ -= (float)Math.cos(this.Head1.rotateAngleY) * 5.0F;
    this.Head1.rotationPointX -= (float)Math.sin(this.Head1.rotateAngleY) * 5.0F;
    this.Head2.rotateAngleY = (float)Math.toRadians(f3);
    this.Body1.render(f5);
    this.Body2.render(f5);
    this.Body3.render(f5);
    this.Body4.render(f5);
    this.Tail0.render(f5);
    this.Neck1.render(f5);
    this.Neck2.render(f5);
    this.Neck3.render(f5);
    this.Head1.render(f5);
    this.Head2.render(f5);
    this.Tail1.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.FLegupleft.render(f5);
    this.FLegdownleft.render(f5);
    this.FLegupright.render(f5);
    this.FLegdownright.render(f5);
    this.BLegupleft.render(f5);
    this.BLegdownright.render(f5);
    this.BLegupright.render(f5);
    this.BLegdownleft.render(f5);
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
