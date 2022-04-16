package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHydrolisc extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer tail2;
  
  ModelRenderer tail3;
  
  ModelRenderer body2;
  
  ModelRenderer lb2;
  
  ModelRenderer lb1;
  
  ModelRenderer spine3;
  
  ModelRenderer spine4;
  
  ModelRenderer rb1;
  
  ModelRenderer rb2;
  
  ModelRenderer spine1;
  
  ModelRenderer spine2;
  
  ModelRenderer lb3;
  
  ModelRenderer rb3;
  
  ModelRenderer body1;
  
  ModelRenderer body0;
  
  ModelRenderer lf1;
  
  ModelRenderer rf1;
  
  ModelRenderer rb6;
  
  ModelRenderer rb4;
  
  ModelRenderer rb5;
  
  ModelRenderer lb6;
  
  ModelRenderer lb5;
  
  ModelRenderer lb4;
  
  ModelRenderer head3;
  
  ModelRenderer feather3;
  
  ModelRenderer feather1;
  
  ModelRenderer feather2;
  
  ModelRenderer head1;
  
  ModelRenderer rf2;
  
  ModelRenderer rf3;
  
  ModelRenderer rf4;
  
  ModelRenderer rf5;
  
  ModelRenderer rf6;
  
  ModelRenderer lf2;
  
  ModelRenderer lf3;
  
  ModelRenderer lf4;
  
  ModelRenderer lf5;
  
  ModelRenderer lf6;
  
  ModelRenderer head2;
  
  ModelRenderer tail1;
  
  public ModelHydrolisc(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.tail2 = new ModelRenderer(this, 29, 3);
    this.tail2.addBox(-1.0F, 0.0F, -0.8F, 2, 8, 2);
    this.tail2.setRotationPoint(1.0F, 20.0F, 13.53333F);
    this.tail2.setTextureSize(64, 128);
    this.tail2.mirror = true;
    setRotation(this.tail2, 1.392442F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 39, 0);
    this.tail3.addBox(-1.0F, -1.0F, -2.0F, 2, 8, 2);
    this.tail3.setRotationPoint(1.0F, 20.0F, 21.0F);
    this.tail3.setTextureSize(64, 128);
    this.tail3.mirror = true;
    setRotation(this.tail3, 1.72705F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 99);
    this.body2.addBox(-2.0F, 14.0F, 0.0F, 6, 4, 10);
    this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body2.setTextureSize(64, 128);
    this.body2.mirror = true;
    setRotation(this.body2, -0.0523599F, 0.0F, 0.0F);
    this.lb2 = new ModelRenderer(this, 45, 13);
    this.lb2.addBox(0.0F, 0.0F, 3.0F, 3, 2, 5);
    this.lb2.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb2.setTextureSize(64, 128);
    this.lb2.mirror = true;
    setRotation(this.lb2, -0.4886922F, 0.0F, 0.0F);
    this.lb1 = new ModelRenderer(this, 46, 22);
    this.lb1.addBox(-1.0F, 0.0F, 0.0F, 4, 3, 3);
    this.lb1.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb1.setTextureSize(64, 128);
    this.lb1.mirror = true;
    setRotation(this.lb1, 0.0F, 0.0F, 0.0F);
    this.spine3 = new ModelRenderer(this, 11, 31);
    this.spine3.addBox(-1.0F, -5.0F, 0.0F, 2, 6, 2);
    this.spine3.setRotationPoint(1.0F, 14.0F, 6.0F);
    this.spine3.setTextureSize(64, 128);
    this.spine3.mirror = true;
    setRotation(this.spine3, -1.117011F, 0.0F, 0.0F);
    this.spine4 = new ModelRenderer(this, 0, 30);
    this.spine4.addBox(-1.0F, -10.5F, -1.0F, 2, 6, 2);
    this.spine4.setRotationPoint(1.0F, 14.0F, 6.0F);
    this.spine4.setTextureSize(64, 128);
    this.spine4.mirror = true;
    setRotation(this.spine4, -1.343904F, 0.0F, 0.0F);
    this.rb1 = new ModelRenderer(this, 46, 22);
    this.rb1.addBox(-4.0F, 0.0F, 0.0F, 4, 3, 3);
    this.rb1.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb1.setTextureSize(64, 128);
    this.rb1.mirror = true;
    setRotation(this.rb1, 0.0F, 0.0F, 0.0F);
    this.rb2 = new ModelRenderer(this, 45, 13);
    this.rb2.addBox(-4.0F, 0.0F, 2.0F, 3, 2, 5);
    this.rb2.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb2.setTextureSize(64, 128);
    this.rb2.mirror = true;
    setRotation(this.rb2, -0.4886922F, 0.0F, 0.0F);
    this.spine1 = new ModelRenderer(this, 33, 19);
    this.spine1.addBox(-1.0F, -5.0F, 0.0F, 2, 6, 2);
    this.spine1.setRotationPoint(1.0F, 14.0F, 0.0F);
    this.spine1.setTextureSize(64, 128);
    this.spine1.mirror = true;
    setRotation(this.spine1, -0.8552113F, 0.0F, 0.0F);
    this.spine2 = new ModelRenderer(this, 21, 19);
    this.spine2.addBox(-1.0F, -10.5F, -1.5F, 2, 6, 2);
    this.spine2.setRotationPoint(1.0F, 14.0F, 0.0F);
    this.spine2.setTextureSize(64, 128);
    this.spine2.mirror = true;
    setRotation(this.spine2, -1.169371F, 0.0F, 0.0F);
    this.lb3 = new ModelRenderer(this, 0, 58);
    this.lb3.addBox(0.0F, -8.0F, -2.0F, 3, 2, 6);
    this.lb3.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb3.setTextureSize(64, 128);
    this.lb3.mirror = true;
    setRotation(this.lb3, -2.347623F, 0.0F, 0.0F);
    this.rb3 = new ModelRenderer(this, 0, 58);
    this.rb3.addBox(-4.0F, -8.0F, -2.0F, 3, 2, 6);
    this.rb3.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb3.setTextureSize(64, 128);
    this.rb3.mirror = true;
    setRotation(this.rb3, -2.347623F, 0.0F, 0.0F);
    this.body1 = new ModelRenderer(this, 0, 79);
    this.body1.addBox(-2.0F, 16.0F, -7.0F, 4, 2, 5);
    this.body1.setRotationPoint(1.0F, -1.0F, 2.0F);
    this.body1.setTextureSize(64, 128);
    this.body1.mirror = true;
    setRotation(this.body1, 0.0F, 0.0F, 0.0F);
    this.body0 = new ModelRenderer(this, 0, 0);
    this.body0.addBox(-1.0F, 14.0F, -13.0F, 4, 3, 10);
    this.body0.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body0.setTextureSize(64, 128);
    this.body0.mirror = true;
    setRotation(this.body0, 0.0523599F, 0.0F, 0.0F);
    this.lf1 = new ModelRenderer(this, 45, 32);
    this.lf1.addBox(-1.0F, 0.0F, -2.0F, 4, 3, 3);
    this.lf1.setRotationPoint(4.0F, 14.0F, -7.0F);
    this.lf1.setTextureSize(64, 128);
    this.lf1.mirror = true;
    setRotation(this.lf1, 0.0F, 0.0F, 0.0F);
    this.rf1 = new ModelRenderer(this, 45, 32);
    this.rf1.addBox(-3.0F, 0.0F, -2.0F, 4, 3, 3);
    this.rf1.setRotationPoint(-2.0F, 14.0F, -7.0F);
    this.rf1.setTextureSize(64, 128);
    this.rf1.mirror = true;
    setRotation(this.rf1, 0.0F, 0.0F, 0.0F);
    this.rb6 = new ModelRenderer(this, 30, 39);
    this.rb6.addBox(-3.5F, 7.0F, 2.0F, 2, 3, 1);
    this.rb6.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb6.setTextureSize(64, 128);
    this.rb6.mirror = true;
    setRotation(this.rb6, 0.1745329F, 0.0F, 0.0F);
    this.rb4 = new ModelRenderer(this, 20, 39);
    this.rb4.addBox(-2.0F, 3.0F, 6.0F, 1, 4, 1);
    this.rb4.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb4.setTextureSize(64, 128);
    this.rb4.mirror = true;
    setRotation(this.rb4, -0.6283185F, 0.0F, 0.0F);
    this.rb5 = new ModelRenderer(this, 20, 39);
    this.rb5.addBox(-4.0F, 3.0F, 6.0F, 1, 4, 1);
    this.rb5.setRotationPoint(-2.0F, 15.0F, 0.0F);
    this.rb5.setTextureSize(64, 128);
    this.rb5.mirror = true;
    setRotation(this.rb5, -0.6283185F, 0.0F, 0.0F);
    this.lb6 = new ModelRenderer(this, 30, 39);
    this.lb6.addBox(0.5F, 7.0F, 2.0F, 2, 3, 1);
    this.lb6.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb6.setTextureSize(64, 128);
    this.lb6.mirror = true;
    setRotation(this.lb6, 0.1745329F, 0.0F, 0.0F);
    this.lb5 = new ModelRenderer(this, 20, 39);
    this.lb5.addBox(2.0F, 3.0F, 6.0F, 1, 4, 1);
    this.lb5.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb5.setTextureSize(64, 128);
    this.lb5.mirror = true;
    setRotation(this.lb5, -0.6283185F, 0.0F, 0.0F);
    this.lb4 = new ModelRenderer(this, 20, 39);
    this.lb4.addBox(0.0F, 3.0F, 6.0F, 1, 4, 1);
    this.lb4.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.lb4.setTextureSize(64, 128);
    this.lb4.mirror = true;
    setRotation(this.lb4, -0.6283185F, 0.0F, 0.0F);
    this.head3 = new ModelRenderer(this, 38, 50);
    this.head3.addBox(0.0F, 0.0F, 0.0F, 4, 2, 8);
    this.head3.setRotationPoint(-1.0F, 15.0F, -13.0F);
    this.head3.setTextureSize(64, 128);
    this.head3.mirror = true;
    setRotation(this.head3, 0.5235988F, 0.0F, 0.0F);
    this.feather3 = new ModelRenderer(this, 25, 117);
    this.feather3.addBox(0.0F, 0.0F, 1.0F, 1, 2, 9);
    this.feather3.setRotationPoint(1.0F, 12.0F, -8.0F);
    this.feather3.setTextureSize(64, 128);
    this.feather3.mirror = true;
    setRotation(this.feather3, 0.3490659F, 0.2617994F, 0.0F);
    this.feather1 = new ModelRenderer(this, 34, 100);
    this.feather1.addBox(0.0F, 0.0F, 1.0F, 1, 2, 9);
    this.feather1.setRotationPoint(0.0F, 12.0F, -8.0F);
    this.feather1.setTextureSize(64, 128);
    this.feather1.mirror = true;
    setRotation(this.feather1, 0.3490659F, -0.2617994F, 0.0F);
    this.feather2 = new ModelRenderer(this, 0, 116);
    this.feather2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 10);
    this.feather2.setRotationPoint(0.5F, 11.0F, -6.0F);
    this.feather2.setTextureSize(64, 128);
    this.feather2.mirror = true;
    setRotation(this.feather2, 0.3490659F, 0.0F, 0.0F);
    this.head1 = new ModelRenderer(this, 38, 41);
    this.head1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4);
    this.head1.setRotationPoint(-1.0F, 15.0F, -15.0F);
    this.head1.setTextureSize(64, 128);
    this.head1.mirror = true;
    setRotation(this.head1, 0.1396263F, 0.0F, 0.0F);
    this.rf2 = new ModelRenderer(this, 19, 58);
    this.rf2.addBox(-3.0F, 0.0F, 0.0F, 3, 3, 6);
    this.rf2.setRotationPoint(-2.0F, 14.0F, -7.0F);
    this.rf2.setTextureSize(64, 128);
    this.rf2.mirror = true;
    setRotation(this.rf2, -0.4886922F, 0.0F, 0.0F);
    this.rf3 = new ModelRenderer(this, 19, 47);
    this.rf3.addBox(-3.0F, -7.0F, 0.0F, 3, 3, 6);
    this.rf3.setRotationPoint(-2.0F, 14.0F, -7.0F);
    this.rf3.setTextureSize(64, 128);
    this.rf3.mirror = true;
    setRotation(this.rf3, -2.347623F, 0.0F, 0.0F);
    this.rf4 = new ModelRenderer(this, 20, 39);
    this.rf4.addBox(0.0F, 6.0F, 4.0F, 1, 4, 1);
    this.rf4.setRotationPoint(-3.0F, 14.0F, -7.0F);
    this.rf4.setTextureSize(64, 128);
    this.rf4.mirror = true;
    setRotation(this.rf4, -0.6283185F, 0.0F, 0.0F);
    this.rf5 = new ModelRenderer(this, 20, 39);
    this.rf5.addBox(-2.0F, 6.0F, 4.0F, 1, 4, 1);
    this.rf5.setRotationPoint(-3.0F, 14.0F, -7.0F);
    this.rf5.setTextureSize(64, 128);
    this.rf5.mirror = true;
    setRotation(this.rf5, -0.6283185F, 0.0F, 0.0F);
    this.rf6 = new ModelRenderer(this, 30, 39);
    this.rf6.addBox(-2.5F, 6.0F, 0.0F, 2, 5, 1);
    this.rf6.setRotationPoint(-2.0F, 14.0F, -7.0F);
    this.rf6.setTextureSize(64, 128);
    this.rf6.mirror = true;
    setRotation(this.rf6, 0.1745329F, 0.0F, 0.0F);
    this.lf2 = new ModelRenderer(this, 19, 58);
    this.lf2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 6);
    this.lf2.setRotationPoint(4.0F, 14.0F, -7.0F);
    this.lf2.setTextureSize(64, 128);
    this.lf2.mirror = true;
    setRotation(this.lf2, -0.4886922F, 0.0F, 0.0F);
    this.lf3 = new ModelRenderer(this, 19, 47);
    this.lf3.addBox(0.0F, -7.0F, 0.0F, 3, 3, 6);
    this.lf3.setRotationPoint(4.0F, 14.0F, -7.0F);
    this.lf3.setTextureSize(64, 128);
    this.lf3.mirror = true;
    setRotation(this.lf3, -2.347623F, 0.0F, 0.0F);
    this.lf4 = new ModelRenderer(this, 20, 39);
    this.lf4.addBox(0.0F, 6.0F, 4.0F, 1, 4, 1);
    this.lf4.setRotationPoint(4.0F, 14.0F, -7.0F);
    this.lf4.setTextureSize(64, 128);
    this.lf4.mirror = true;
    setRotation(this.lf4, -0.6283185F, 0.0F, 0.0F);
    this.lf5 = new ModelRenderer(this, 20, 39);
    this.lf5.addBox(2.0F, 6.0F, 4.0F, 1, 4, 1);
    this.lf5.setRotationPoint(4.0F, 14.0F, -7.0F);
    this.lf5.setTextureSize(64, 128);
    this.lf5.mirror = true;
    setRotation(this.lf5, -0.6283185F, 0.0F, 0.0F);
    this.lf6 = new ModelRenderer(this, 30, 39);
    this.lf6.addBox(0.5F, 6.0F, -2.0F, 2, 5, 1);
    this.lf6.setRotationPoint(4.0F, 14.0F, -5.0F);
    this.lf6.setTextureSize(64, 128);
    this.lf6.mirror = true;
    setRotation(this.lf6, 0.1745329F, 0.0F, 0.0F);
    this.head2 = new ModelRenderer(this, 19, 80);
    this.head2.addBox(-1.0F, 16.0F, -16.0F, 4, 1, 5);
    this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head2.setTextureSize(64, 128);
    this.head2.mirror = true;
    setRotation(this.head2, 0.1047198F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 9, 18);
    this.tail1.addBox(-1.0F, -1.0F, -3.0F, 2, 8, 2);
    this.tail1.setRotationPoint(1.0F, 15.0F, 9.0F);
    this.tail1.setTextureSize(64, 128);
    this.tail1.mirror = true;
    setRotation(this.tail1, 1.095163F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Hydrolisc c = (Hydrolisc)entity;
    float hf = 0.0F;
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.lf1.rotateAngleX = newangle;
    this.lf2.rotateAngleX = newangle - 0.488F;
    this.lf3.rotateAngleX = newangle - 2.347F;
    this.lf4.rotateAngleX = newangle - 0.628F;
    this.lf5.rotateAngleX = newangle - 0.628F;
    this.lf6.rotateAngleX = newangle + 0.174F;
    this.rf1.rotateAngleX = -newangle;
    this.rf2.rotateAngleX = -newangle - 0.488F;
    this.rf3.rotateAngleX = -newangle - 2.347F;
    this.rf4.rotateAngleX = -newangle - 0.628F;
    this.rf5.rotateAngleX = -newangle - 0.628F;
    this.rf6.rotateAngleX = -newangle + 0.174F;
    this.lb1.rotateAngleX = -newangle;
    this.lb2.rotateAngleX = -newangle - 0.488F;
    this.lb3.rotateAngleX = -newangle - 2.347F;
    this.lb4.rotateAngleX = -newangle - 0.628F;
    this.lb5.rotateAngleX = -newangle - 0.628F;
    this.lb6.rotateAngleX = -newangle + 0.174F;
    this.rb1.rotateAngleX = newangle;
    this.rb2.rotateAngleX = newangle - 0.488F;
    this.rb3.rotateAngleX = newangle - 2.347F;
    this.rb4.rotateAngleX = newangle - 0.628F;
    this.rb5.rotateAngleX = newangle - 0.628F;
    this.rb6.rotateAngleX = newangle + 0.174F;
    newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * 3.1415927F * 0.15F;
    if (c.isSitting() == true)
      newangle = 0.0F; 
    this.tail1.rotateAngleY = newangle * 0.25F;
    this.tail1.rotationPointZ += (float)Math.cos(this.tail1.rotateAngleY) * 5.0F;
    this.tail1.rotationPointX += (float)Math.sin(this.tail1.rotateAngleY) * 5.0F;
    this.tail2.rotateAngleY = newangle * 0.5F;
    this.tail2.rotationPointZ += (float)Math.cos(this.tail2.rotateAngleY) * 8.0F;
    this.tail2.rotationPointX += (float)Math.sin(this.tail2.rotateAngleY) * 8.0F;
    this.tail3.rotateAngleY = newangle * 0.75F;
    hf = c.getHydroHealth() / c.getMaxHealth();
    newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed * hf) * 3.1415927F * 0.2F * hf;
    this.feather2.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed * hf) * 3.1415927F * 0.2F * hf;
    this.feather1.rotateAngleY = newangle - 0.9F;
    this.feather3.rotateAngleY = -newangle + 0.9F;
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.body2.render(f5);
    this.lb2.render(f5);
    this.lb1.render(f5);
    this.spine3.render(f5);
    this.spine4.render(f5);
    this.rb1.render(f5);
    this.rb2.render(f5);
    this.spine1.render(f5);
    this.spine2.render(f5);
    this.lb3.render(f5);
    this.rb3.render(f5);
    this.body1.render(f5);
    this.body0.render(f5);
    this.lf1.render(f5);
    this.rf1.render(f5);
    this.rb6.render(f5);
    this.rb4.render(f5);
    this.rb5.render(f5);
    this.lb6.render(f5);
    this.lb5.render(f5);
    this.lb4.render(f5);
    this.head3.render(f5);
    this.feather3.render(f5);
    this.feather1.render(f5);
    this.feather2.render(f5);
    this.head1.render(f5);
    this.rf2.render(f5);
    this.rf3.render(f5);
    this.rf4.render(f5);
    this.rf5.render(f5);
    this.rf6.render(f5);
    this.lf2.render(f5);
    this.lf3.render(f5);
    this.lf4.render(f5);
    this.lf5.render(f5);
    this.lf6.render(f5);
    this.head2.render(f5);
    this.tail1.render(f5);
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
