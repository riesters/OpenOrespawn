package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKyuubi extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer rtHorn5;
  
  ModelRenderer lfHorn5;
  
  ModelRenderer tail9;
  
  ModelRenderer tail8;
  
  ModelRenderer tail7;
  
  ModelRenderer tail6;
  
  ModelRenderer tail5;
  
  ModelRenderer tail2;
  
  ModelRenderer tail1;
  
  ModelRenderer tail0;
  
  ModelRenderer lfLegLower;
  
  ModelRenderer rtLegLower;
  
  ModelRenderer head;
  
  ModelRenderer chest;
  
  ModelRenderer lfArmUpper;
  
  ModelRenderer rtArmLower;
  
  ModelRenderer lfLegUpper;
  
  ModelRenderer rtLegUpper;
  
  ModelRenderer body;
  
  ModelRenderer rtArmUpper;
  
  ModelRenderer lfArmLower;
  
  ModelRenderer tail3;
  
  ModelRenderer tail4;
  
  ModelRenderer lfHorn2;
  
  ModelRenderer rtHorn1;
  
  ModelRenderer rtHorn2;
  
  ModelRenderer lfHorn1;
  
  ModelRenderer lfHorn3;
  
  ModelRenderer rtHorn3;
  
  ModelRenderer lfHorn4;
  
  ModelRenderer rtHorn4;
  
  ModelRenderer headFire;
  
  ModelRenderer lfArmUpperFire;
  
  ModelRenderer chestFire;
  
  ModelRenderer bodyFire;
  
  ModelRenderer lfArmLowerFire;
  
  ModelRenderer rtArmUpperFire;
  
  ModelRenderer rtArmLowerFire;
  
  ModelRenderer lfLegUppperFire;
  
  ModelRenderer lfLegLowerFire;
  
  ModelRenderer rtLegUpperFire;
  
  ModelRenderer rtLegLowerFire;
  
  public ModelKyuubi(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 512;
    this.textureHeight = 256;
    this.rtHorn5 = new ModelRenderer(this, 56, 8);
    this.rtHorn5.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2);
    this.rtHorn5.setRotationPoint(3.0F, -11.5F, -7.0F);
    this.rtHorn5.setTextureSize(512, 256);
    this.rtHorn5.mirror = false;
    setRotation(this.rtHorn5, -0.4461433F, 0.0F, 0.0F);
    this.lfHorn5 = new ModelRenderer(this, 56, 24);
    this.lfHorn5.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2);
    this.lfHorn5.setRotationPoint(-3.0F, -11.5F, -7.0F);
    this.lfHorn5.setTextureSize(512, 256);
    this.lfHorn5.mirror = false;
    setRotation(this.lfHorn5, -0.4461433F, 0.0F, 0.0F);
    this.tail9 = new ModelRenderer(this, 145, 47);
    this.tail9.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1);
    this.tail9.setRotationPoint(0.0F, 9.0F, -26.0F);
    this.tail9.setTextureSize(512, 256);
    this.tail9.mirror = false;
    setRotation(this.tail9, 2.007645F, 0.0F, 0.0F);
    this.tail8 = new ModelRenderer(this, 135, 45);
    this.tail8.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2);
    this.tail8.setRotationPoint(0.0F, 7.0F, -25.75F);
    this.tail8.setTextureSize(512, 256);
    this.tail8.mirror = false;
    setRotation(this.tail8, 1.524323F, 0.0F, 0.0F);
    this.tail7 = new ModelRenderer(this, 122, 44);
    this.tail7.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.tail7.setRotationPoint(0.0F, 5.0F, -24.0F);
    this.tail7.setTextureSize(512, 256);
    this.tail7.mirror = false;
    setRotation(this.tail7, 0.8922867F, 0.0F, 0.0F);
    this.tail6 = new ModelRenderer(this, 105, 43);
    this.tail6.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4);
    this.tail6.setRotationPoint(0.0F, 3.0F, -21.0F);
    this.tail6.setTextureSize(512, 256);
    this.tail6.mirror = false;
    setRotation(this.tail6, 0.6320364F, 0.0F, 0.0F);
    this.tail5 = new ModelRenderer(this, 84, 42);
    this.tail5.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5);
    this.tail5.setRotationPoint(0.0F, 2.0F, -17.0F);
    this.tail5.setTextureSize(512, 256);
    this.tail5.mirror = false;
    setRotation(this.tail5, 0.2230717F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 20, 43);
    this.tail2.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5);
    this.tail2.setRotationPoint(0.0F, 10.0F, -7.0F);
    this.tail2.setTextureSize(512, 256);
    this.tail2.mirror = false;
    setRotation(this.tail2, -0.7807508F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 9, 36);
    this.tail1.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.tail1.setRotationPoint(0.0F, 10.0F, -4.333333F);
    this.tail1.setTextureSize(512, 256);
    this.tail1.mirror = false;
    setRotation(this.tail1, -0.2602503F, 0.0F, 0.0F);
    this.tail0 = new ModelRenderer(this, 0, 46);
    this.tail0.addBox(-1.0F, -1.0F, -3.0F, 4, 4, 3);
    this.tail0.setRotationPoint(-1.0F, 9.0F, -2.0F);
    this.tail0.setTextureSize(512, 256);
    this.tail0.mirror = false;
    setRotation(this.tail0, 0.0F, 0.0F, 0.0F);
    this.lfLegLower = new ModelRenderer(this, 205, 55);
    this.lfLegLower.addBox(-2.0F, 0.0F, -3.0F, 4, 6, 4);
    this.lfLegLower.setRotationPoint(-3.0F, 18.0F, 2.0F);
    this.lfLegLower.setTextureSize(512, 256);
    this.lfLegLower.mirror = false;
    setRotation(this.lfLegLower, -0.4461433F, 0.0F, 0.0F);
    this.rtLegLower = new ModelRenderer(this, 149, 53);
    this.rtLegLower.addBox(-2.0F, -1.0F, -3.0F, 4, 7, 4);
    this.rtLegLower.setRotationPoint(3.0F, 18.0F, 4.0F);
    this.rtLegLower.setTextureSize(512, 256);
    this.rtLegLower.mirror = false;
    setRotation(this.rtLegLower, -0.1487144F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 168, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 6.0F);
    this.head.setTextureSize(512, 256);
    this.head.mirror = false;
    setRotation(this.head, 0.2230705F, 3.141593F, 0.0F);
    this.chest = new ModelRenderer(this, 170, 17);
    this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 6);
    this.chest.setRotationPoint(0.0F, 0.0F, 5.0F);
    this.chest.setTextureSize(512, 256);
    this.chest.mirror = false;
    setRotation(this.chest, -0.8551081F, 0.0F, 0.0F);
    this.lfArmUpper = new ModelRenderer(this, 205, 16);
    this.lfArmUpper.addBox(-3.0F, -2.0F, -2.0F, 4, 7, 4);
    this.lfArmUpper.setRotationPoint(-5.0F, 2.0F, 3.0F);
    this.lfArmUpper.setTextureSize(512, 256);
    this.lfArmUpper.mirror = false;
    setRotation(this.lfArmUpper, 0.0F, 0.0F, 0.3020292F);
    this.rtArmLower = new ModelRenderer(this, 136, 29);
    this.rtArmLower.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.rtArmLower.setRotationPoint(7.0F, 6.0F, 2.0F);
    this.rtArmLower.setTextureSize(512, 256);
    this.rtArmLower.mirror = false;
    setRotation(this.rtArmLower, 0.4833219F, 0.0F, 0.0F);
    this.lfLegUpper = new ModelRenderer(this, 188, 46);
    this.lfLegUpper.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.lfLegUpper.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.lfLegUpper.setTextureSize(512, 256);
    this.lfLegUpper.mirror = false;
    setRotation(this.lfLegUpper, 0.260246F, 0.0F, 0.2602503F);
    this.rtLegUpper = new ModelRenderer(this, 168, 46);
    this.rtLegUpper.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.rtLegUpper.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.rtLegUpper.setTextureSize(512, 256);
    this.rtLegUpper.mirror = false;
    setRotation(this.rtLegUpper, 0.5948578F, 0.0F, -0.260246F);
    this.body = new ModelRenderer(this, 170, 31);
    this.body.addBox(-4.0F, 0.0F, -3.0F, 8, 7, 6);
    this.body.setRotationPoint(0.0F, 5.0F, 1.0F);
    this.body.setTextureSize(512, 256);
    this.body.mirror = false;
    setRotation(this.body, -0.2974289F, 0.0F, 0.0F);
    this.rtArmUpper = new ModelRenderer(this, 142, 16);
    this.rtArmUpper.addBox(-1.0F, -2.0F, -2.0F, 4, 7, 4);
    this.rtArmUpper.setRotationPoint(5.0F, 2.0F, 2.0F);
    this.rtArmUpper.setTextureSize(512, 256);
    this.rtArmUpper.mirror = false;
    setRotation(this.rtArmUpper, 0.0F, 0.0F, -0.302028F);
    this.lfArmLower = new ModelRenderer(this, 208, 31);
    this.lfArmLower.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.lfArmLower.setRotationPoint(-7.0F, 6.0F, 2.0F);
    this.lfArmLower.setTextureSize(512, 256);
    this.lfArmLower.mirror = false;
    setRotation(this.lfArmLower, 0.4833219F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 38, 42);
    this.tail3.addBox(-2.5F, -2.0F, -5.0F, 5, 5, 5);
    this.tail3.setRotationPoint(0.0F, 6.5F, -10.0F);
    this.tail3.setTextureSize(512, 256);
    this.tail3.mirror = false;
    setRotation(this.tail3, -0.96F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 59, 41);
    this.tail4.addBox(-3.0F, -3.0F, -6.0F, 6, 6, 6);
    this.tail4.setRotationPoint(0.0F, 3.0F, -12.0F);
    this.tail4.setTextureSize(512, 256);
    this.tail4.mirror = false;
    setRotation(this.tail4, -0.22F, 0.0F, 0.0F);
    this.lfHorn2 = new ModelRenderer(this, 13, 5);
    this.lfHorn2.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4);
    this.lfHorn2.setRotationPoint(-3.0F, -10.0F, 2.0F);
    this.lfHorn2.setTextureSize(512, 256);
    this.lfHorn2.mirror = false;
    setRotation(this.lfHorn2, -0.2230705F, 0.0F, 0.0F);
    this.rtHorn1 = new ModelRenderer(this, 0, 22);
    this.rtHorn1.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.rtHorn1.setRotationPoint(3.0F, -8.7F, 4.0F);
    this.rtHorn1.setTextureSize(512, 256);
    this.rtHorn1.mirror = false;
    setRotation(this.rtHorn1, -0.5576792F, 0.0F, 0.0F);
    this.rtHorn2 = new ModelRenderer(this, 13, 21);
    this.rtHorn2.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4);
    this.rtHorn2.setRotationPoint(3.0F, -10.0F, 2.0F);
    this.rtHorn2.setTextureSize(512, 256);
    this.rtHorn2.mirror = false;
    setRotation(this.rtHorn2, -0.2230705F, 0.0F, 0.0F);
    this.lfHorn1 = new ModelRenderer(this, 0, 6);
    this.lfHorn1.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.lfHorn1.setRotationPoint(-3.0F, -8.7F, 4.0F);
    this.lfHorn1.setTextureSize(512, 256);
    this.lfHorn1.mirror = false;
    setRotation(this.lfHorn1, -0.5576792F, 0.0F, 0.0F);
    this.lfHorn3 = new ModelRenderer(this, 31, 6);
    this.lfHorn3.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.lfHorn3.setRotationPoint(-3.0F, -11.0F, -2.0F);
    this.lfHorn3.setTextureSize(512, 256);
    this.lfHorn3.mirror = false;
    setRotation(this.lfHorn3, -0.0371786F, 0.0F, 0.0F);
    this.rtHorn3 = new ModelRenderer(this, 31, 22);
    this.rtHorn3.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.rtHorn3.setRotationPoint(3.0F, -11.0F, -2.0F);
    this.rtHorn3.setTextureSize(512, 256);
    this.rtHorn3.mirror = false;
    setRotation(this.rtHorn3, -0.0371786F, 0.0F, 0.0F);
    this.lfHorn4 = new ModelRenderer(this, 45, 23);
    this.lfHorn4.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2);
    this.lfHorn4.setRotationPoint(-3.0F, -11.0F, -5.0F);
    this.lfHorn4.setTextureSize(512, 256);
    this.lfHorn4.mirror = false;
    setRotation(this.lfHorn4, -0.2230717F, 0.0F, 0.0F);
    this.rtHorn4 = new ModelRenderer(this, 45, 7);
    this.rtHorn4.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2);
    this.rtHorn4.setRotationPoint(3.0F, -11.0F, -5.0F);
    this.rtHorn4.setTextureSize(512, 256);
    this.rtHorn4.mirror = false;
    setRotation(this.rtHorn4, -0.2230717F, 0.0F, 0.0F);
    this.headFire = new ModelRenderer(this, 168, 84);
    this.headFire.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10);
    this.headFire.setRotationPoint(0.0F, 1.0F, 6.0F);
    this.headFire.setTextureSize(512, 256);
    this.headFire.mirror = false;
    setRotation(this.headFire, -0.2230717F, 0.0F, 0.0F);
    this.lfArmUpperFire = new ModelRenderer(this, 209, 108);
    this.lfArmUpperFire.addBox(-6.0F, -1.0F, -3.0F, 6, 9, 6);
    this.lfArmUpperFire.setRotationPoint(-3.0F, 1.0F, 3.0F);
    this.lfArmUpperFire.setTextureSize(512, 256);
    this.lfArmUpperFire.mirror = false;
    setRotation(this.lfArmUpperFire, 0.0F, 0.0F, 0.3020292F);
    this.chestFire = new ModelRenderer(this, 170, 105);
    this.chestFire.addBox(-5.0F, 0.0F, -3.0F, 10, 9, 8);
    this.chestFire.setRotationPoint(0.0F, -1.0F, 6.0F);
    this.chestFire.setTextureSize(512, 256);
    this.chestFire.mirror = false;
    setRotation(this.chestFire, -0.8551081F, 0.0F, 0.0F);
    this.bodyFire = new ModelRenderer(this, 170, 125);
    this.bodyFire.addBox(-5.0F, 0.0F, -4.0F, 10, 9, 8);
    this.bodyFire.setRotationPoint(0.0F, 4.0F, 1.0F);
    this.bodyFire.setTextureSize(512, 256);
    this.bodyFire.mirror = false;
    setRotation(this.bodyFire, -0.2974289F, 0.0F, 0.0F);
    this.lfArmLowerFire = new ModelRenderer(this, 208, 126);
    this.lfArmLowerFire.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.lfArmLowerFire.setRotationPoint(-7.333333F, 5.0F, 1.5F);
    this.lfArmLowerFire.setTextureSize(512, 256);
    this.lfArmLowerFire.mirror = false;
    setRotation(this.lfArmLowerFire, 0.4833219F, 0.0F, 0.0F);
    this.rtArmUpperFire = new ModelRenderer(this, 142, 105);
    this.rtArmUpperFire.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.rtArmUpperFire.setRotationPoint(5.0F, -1.0F, 2.0F);
    this.rtArmUpperFire.setTextureSize(512, 256);
    this.rtArmUpperFire.mirror = false;
    setRotation(this.rtArmUpperFire, 0.0F, 0.0F, -0.302028F);
    this.rtArmLowerFire = new ModelRenderer(this, 136, 122);
    this.rtArmLowerFire.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.rtArmLowerFire.setRotationPoint(7.0F, 5.0F, 1.0F);
    this.rtArmLowerFire.setTextureSize(512, 256);
    this.rtArmLowerFire.mirror = false;
    setRotation(this.rtArmLowerFire, 0.4833219F, 0.0F, 0.0F);
    this.lfLegUppperFire = new ModelRenderer(this, 188, 146);
    this.lfLegUppperFire.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.lfLegUppperFire.setRotationPoint(-2.0F, 11.0F, 0.0F);
    this.lfLegUppperFire.setTextureSize(512, 256);
    this.lfLegUppperFire.mirror = false;
    setRotation(this.lfLegUppperFire, 0.260246F, 0.0F, 0.2602503F);
    this.lfLegLowerFire = new ModelRenderer(this, 205, 163);
    this.lfLegLowerFire.addBox(-3.0F, 0.0F, -3.0F, 6, 8, 6);
    this.lfLegLowerFire.setRotationPoint(-3.0F, 16.0F, 2.0F);
    this.lfLegLowerFire.setTextureSize(512, 256);
    this.lfLegLowerFire.mirror = false;
    setRotation(this.lfLegLowerFire, -0.4461433F, 0.0F, 0.0F);
    this.rtLegUpperFire = new ModelRenderer(this, 160, 146);
    this.rtLegUpperFire.addBox(-3.0F, 0.0F, -4.0F, 6, 9, 6);
    this.rtLegUpperFire.setRotationPoint(2.0F, 11.0F, 0.0F);
    this.rtLegUpperFire.setTextureSize(512, 256);
    this.rtLegUpperFire.mirror = false;
    setRotation(this.rtLegUpperFire, 0.5948578F, 0.0F, -0.260246F);
    this.rtLegLowerFire = new ModelRenderer(this, 150, 167);
    this.rtLegLowerFire.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.rtLegLowerFire.setRotationPoint(3.0F, 15.0F, 4.0F);
    this.rtLegLowerFire.setTextureSize(512, 256);
    this.rtLegLowerFire.mirror = false;
    setRotation(this.rtLegLowerFire, -0.1487144F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    Kyuubi e = (Kyuubi)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.2F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.rtLegUpper.rotateAngleX = 0.59F + newangle;
    this.rtLegUpperFire.rotateAngleX = 0.59F + newangle;
    this.rtLegLower.rotateAngleX = -0.15F + newangle;
    this.rtLegLowerFire.rotateAngleX = -0.15F + newangle;
    this.rtLegLower.rotationPointZ = (float)(Math.sin(this.rtLegUpperFire.rotateAngleX) * 8.0D);
    this.rtLegLowerFire.rotationPointZ = (float)(Math.sin(this.rtLegUpperFire.rotateAngleX) * 8.0D);
    this.lfLegUpper.rotateAngleX = 0.26F - newangle;
    this.lfLegUppperFire.rotateAngleX = 0.26F - newangle;
    this.lfLegLower.rotateAngleX = -0.44F - newangle;
    this.lfLegLowerFire.rotateAngleX = -0.44F - newangle;
    this.lfLegLower.rotationPointZ = (float)(Math.sin(this.lfLegUppperFire.rotateAngleX) * 8.0D);
    this.lfLegLowerFire.rotationPointZ = (float)(Math.sin(this.lfLegUppperFire.rotateAngleX) * 8.0D);
    newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.08F * f1;
    newangle += MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.01F;
    this.rtArmUpper.rotateAngleX = newangle;
    this.rtArmUpperFire.rotateAngleX = newangle;
    this.rtArmLower.rotateAngleX = 0.48F + newangle;
    this.rtArmLowerFire.rotateAngleX = 0.48F + newangle;
    this.rtArmLower.rotationPointZ = (float)(Math.sin(this.rtArmUpperFire.rotateAngleX) * 8.0D);
    this.rtArmLowerFire.rotationPointZ = (float)(Math.sin(this.rtArmUpperFire.rotateAngleX) * 8.0D);
    this.lfArmUpper.rotateAngleX = -newangle;
    this.lfArmUpperFire.rotateAngleX = -newangle;
    this.lfArmLower.rotateAngleX = 0.48F - newangle;
    this.lfArmLowerFire.rotateAngleX = 0.48F - newangle;
    this.lfArmLower.rotationPointZ = (float)(Math.sin(this.lfArmUpperFire.rotateAngleX) * 8.0D);
    this.lfArmLowerFire.rotationPointZ = (float)(Math.sin(this.lfArmUpperFire.rotateAngleX) * 8.0D);
    float pi4 = 0.7853975F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) + pi4 * 4.0F;
    this.headFire.rotateAngleY = (float)Math.toRadians(f3);
    float fc = (float)Math.cos((this.headFire.rotateAngleY + pi4));
    float fs = (float)Math.sin((this.headFire.rotateAngleY + pi4));
    this.headFire.rotationPointZ -= fc * 3.6F;
    this.headFire.rotationPointX -= fs * 3.6F;
    this.lfHorn1.rotateAngleY = this.headFire.rotateAngleY + 0.244F + MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F;
    this.lfHorn1.rotationPointZ -= (float)Math.cos(this.lfHorn1.rotateAngleY) * 2.0F;
    this.lfHorn1.rotationPointX -= (float)Math.sin(this.lfHorn1.rotateAngleY) * 2.0F;
    this.lfHorn2.rotateAngleY = this.headFire.rotateAngleY + 0.244F + MathHelper.cos(f2 * 1.3F * this.wingspeed - pi4) * 3.1415927F * 0.1F;
    this.lfHorn2.rotationPointZ -= (float)Math.cos(this.lfHorn2.rotateAngleY) * 4.0F;
    this.lfHorn2.rotationPointX -= (float)Math.sin(this.lfHorn2.rotateAngleY) * 4.0F;
    this.lfHorn3.rotateAngleY = this.headFire.rotateAngleY + 0.244F + MathHelper.cos(f2 * 1.3F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.1F;
    this.lfHorn3.rotationPointZ -= (float)Math.cos(this.lfHorn3.rotateAngleY) * 3.0F;
    this.lfHorn3.rotationPointX -= (float)Math.sin(this.lfHorn3.rotateAngleY) * 3.0F;
    this.lfHorn4.rotateAngleY = this.headFire.rotateAngleY + 0.244F + MathHelper.cos(f2 * 1.3F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.1F;
    this.lfHorn4.rotationPointZ -= (float)Math.cos(this.lfHorn4.rotateAngleY) * 2.0F;
    this.lfHorn4.rotationPointX -= (float)Math.sin(this.lfHorn4.rotateAngleY) * 2.0F;
    this.lfHorn5.rotateAngleY = this.headFire.rotateAngleY + 0.244F + MathHelper.cos(f2 * 1.3F * this.wingspeed - 4.0F * pi4) * 3.1415927F * 0.1F;
    fc = (float)Math.cos((this.headFire.rotateAngleY - pi4));
    fs = (float)Math.sin((this.headFire.rotateAngleY - pi4));
    this.headFire.rotationPointZ -= fc * 3.6F;
    this.headFire.rotationPointX -= fs * 3.6F;
    this.rtHorn1.rotateAngleY = this.headFire.rotateAngleY + -0.244F - MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.1F;
    this.rtHorn1.rotationPointZ -= (float)Math.cos(this.rtHorn1.rotateAngleY) * 2.0F;
    this.rtHorn1.rotationPointX -= (float)Math.sin(this.rtHorn1.rotateAngleY) * 2.0F;
    this.rtHorn2.rotateAngleY = this.headFire.rotateAngleY + -0.244F - MathHelper.cos(f2 * 1.3F * this.wingspeed - pi4) * 3.1415927F * 0.1F;
    this.rtHorn2.rotationPointZ -= (float)Math.cos(this.rtHorn2.rotateAngleY) * 4.0F;
    this.rtHorn2.rotationPointX -= (float)Math.sin(this.rtHorn2.rotateAngleY) * 4.0F;
    this.rtHorn3.rotateAngleY = this.headFire.rotateAngleY + -0.244F - MathHelper.cos(f2 * 1.3F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.1F;
    this.rtHorn3.rotationPointZ -= (float)Math.cos(this.rtHorn3.rotateAngleY) * 3.0F;
    this.rtHorn3.rotationPointX -= (float)Math.sin(this.rtHorn3.rotateAngleY) * 3.0F;
    this.rtHorn4.rotateAngleY = this.headFire.rotateAngleY + -0.244F - MathHelper.cos(f2 * 1.3F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.1F;
    this.rtHorn4.rotationPointZ -= (float)Math.cos(this.rtHorn4.rotateAngleY) * 2.0F;
    this.rtHorn4.rotationPointX -= (float)Math.sin(this.rtHorn4.rotateAngleY) * 2.0F;
    this.rtHorn5.rotateAngleY = this.headFire.rotateAngleY + -0.244F - MathHelper.cos(f2 * 1.3F * this.wingspeed - 4.0F * pi4) * 3.1415927F * 0.1F;
    this.tail1.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed) * 3.1415927F * 0.2F;
    this.tail1.rotationPointX -= (float)Math.sin(this.tail1.rotateAngleY) * 3.0F;
    this.tail2.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - pi4) * 3.1415927F * 0.2F;
    this.tail2.rotationPointX -= (float)Math.sin(this.tail2.rotateAngleY) * 4.0F;
    this.tail3.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.2F;
    this.tail3.rotationPointX -= (float)Math.sin(this.tail3.rotateAngleY) * 3.5F;
    this.tail4.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.2F;
    this.tail4.rotationPointX -= (float)Math.sin(this.tail4.rotateAngleY) * 5.0F;
    this.tail5.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 4.0F * pi4) * 3.1415927F * 0.2F;
    this.tail5.rotationPointX -= (float)Math.sin(this.tail5.rotateAngleY) * 4.0F;
    this.tail6.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 5.0F * pi4) * 3.1415927F * 0.2F;
    this.tail6.rotationPointX -= (float)Math.sin(this.tail6.rotateAngleY) * 3.0F;
    this.tail7.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 6.0F * pi4) * 3.1415927F * 0.2F;
    this.tail7.rotationPointX -= (float)Math.sin(this.tail7.rotateAngleY) * 2.0F;
    this.tail8.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 7.0F * pi4) * 3.1415927F * 0.2F;
    this.tail8.rotationPointX -= (float)Math.sin(this.tail8.rotateAngleY) * 1.0F;
    this.tail9.rotateAngleY = MathHelper.cos(f2 * 0.9F * this.wingspeed - 8.0F * pi4) * 3.1415927F * 0.2F;
    this.tail1.rotateAngleX = -0.26F + MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.1415927F * 0.1F;
    this.tail1.rotationPointY += (float)Math.sin(this.tail1.rotateAngleX) * 3.0F;
    this.tail1.rotationPointZ -= (float)Math.cos(this.tail1.rotateAngleX) * 3.0F;
    this.tail2.rotateAngleX = -0.78F + MathHelper.cos(f2 * 0.5F * this.wingspeed - pi4) * 3.1415927F * 0.1F;
    this.tail2.rotationPointY += (float)Math.sin(this.tail2.rotateAngleX) * 4.0F;
    this.tail2.rotationPointZ -= (float)Math.cos(this.tail2.rotateAngleX) * 4.0F;
    this.tail3.rotateAngleX = -1.11F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 2.0F * pi4) * 3.1415927F * 0.1F;
    this.tail3.rotationPointY += (float)Math.sin(this.tail3.rotateAngleX) * 3.5F;
    this.tail3.rotationPointZ -= (float)Math.cos(this.tail3.rotateAngleX) * 3.5F;
    this.tail4.rotateAngleX = -0.18F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 3.0F * pi4) * 3.1415927F * 0.1F;
    this.tail4.rotationPointY += (float)Math.sin(this.tail4.rotateAngleX) * 5.0F;
    this.tail4.rotationPointZ -= (float)Math.cos(this.tail4.rotateAngleX) * 5.0F;
    this.tail5.rotateAngleX = 0.22F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 4.0F * pi4) * 3.1415927F * 0.1F;
    this.tail5.rotationPointY += (float)Math.sin(this.tail5.rotateAngleX) * 4.0F;
    this.tail5.rotationPointZ -= (float)Math.cos(this.tail5.rotateAngleX) * 4.0F;
    this.tail6.rotateAngleX = 0.63F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 5.0F * pi4) * 3.1415927F * 0.1F;
    this.tail6.rotationPointY += (float)Math.sin(this.tail6.rotateAngleX) * 3.0F;
    this.tail6.rotationPointZ -= (float)Math.cos(this.tail6.rotateAngleX) * 3.0F;
    this.tail7.rotateAngleX = 0.89F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 6.0F * pi4) * 3.1415927F * 0.1F;
    this.tail7.rotationPointY += (float)Math.sin(this.tail7.rotateAngleX) * 2.0F;
    this.tail7.rotationPointZ -= (float)Math.cos(this.tail7.rotateAngleX) * 2.0F;
    this.tail8.rotateAngleX = 1.52F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 7.0F * pi4) * 3.1415927F * 0.1F;
    this.tail8.rotationPointY += (float)Math.sin(this.tail8.rotateAngleX) * 2.0F;
    this.tail8.rotationPointZ -= (float)Math.cos(this.tail8.rotateAngleX) * 2.0F;
    this.tail9.rotateAngleX = 2.0F + MathHelper.cos(f2 * 0.5F * this.wingspeed - 8.0F * pi4) * 3.1415927F * 0.1F;
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    this.lfLegLower.render(f5);
    this.rtLegLower.render(f5);
    this.head.render(f5);
    this.chest.render(f5);
    this.lfArmUpper.render(f5);
    this.rtArmLower.render(f5);
    this.lfLegUpper.render(f5);
    this.rtLegUpper.render(f5);
    this.body.render(f5);
    this.rtArmUpper.render(f5);
    this.lfArmLower.render(f5);
    this.rtHorn5.render(f5);
    this.lfHorn5.render(f5);
    this.tail9.render(f5);
    this.tail8.render(f5);
    this.tail7.render(f5);
    this.tail6.render(f5);
    this.tail5.render(f5);
    this.tail2.render(f5);
    this.tail1.render(f5);
    this.tail0.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
    this.lfHorn2.render(f5);
    this.rtHorn1.render(f5);
    this.rtHorn2.render(f5);
    this.lfHorn1.render(f5);
    this.lfHorn3.render(f5);
    this.rtHorn3.render(f5);
    this.lfHorn4.render(f5);
    this.rtHorn4.render(f5);
    this.headFire.render(f5);
    this.lfArmUpperFire.render(f5);
    this.chestFire.render(f5);
    this.bodyFire.render(f5);
    this.lfArmLowerFire.render(f5);
    this.rtArmUpperFire.render(f5);
    this.rtArmLowerFire.render(f5);
    this.lfLegUppperFire.render(f5);
    this.lfLegLowerFire.render(f5);
    this.rtLegUpperFire.render(f5);
    this.rtLegLowerFire.render(f5);
    GL11.glDisable(3042);
    GL11.glPopMatrix();
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
