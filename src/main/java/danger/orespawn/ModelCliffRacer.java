package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCliffRacer extends ModelBase {
  private float wingspeed = 1.0F;
  
  ModelRenderer Body;
  
  ModelRenderer Fins;
  
  ModelRenderer LWing;
  
  ModelRenderer RWing;
  
  ModelRenderer Tail;
  
  ModelRenderer TailEnd;
  
  ModelRenderer Head;
  
  ModelRenderer Beak;
  
  public ModelCliffRacer(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.Body = new ModelRenderer(this, 0, 52);
    this.Body.addBox(0.0F, 0.0F, 0.0F, 3, 1, 10);
    this.Body.setRotationPoint(-1.0F, 15.0F, -4.0F);
    this.Body.setTextureSize(64, 64);
    this.Body.mirror = true;
    setRotation(this.Body, 0.0F, 0.0F, 0.0F);
    this.Fins = new ModelRenderer(this, 0, 40);
    this.Fins.addBox(0.0F, -4.0F, 0.0F, 1, 6, 3);
    this.Fins.setRotationPoint(0.0F, 15.0F, -1.0F);
    this.Fins.setTextureSize(64, 64);
    this.Fins.mirror = true;
    setRotation(this.Fins, 0.0F, 0.0F, 0.0F);
    this.LWing = new ModelRenderer(this, 0, 31);
    this.LWing.addBox(0.0F, 0.0F, 0.0F, 7, 1, 6);
    this.LWing.setRotationPoint(2.0F, 15.0F, -2.0F);
    this.LWing.setTextureSize(64, 64);
    this.LWing.mirror = true;
    setRotation(this.LWing, 0.0F, 0.0F, 0.0F);
    this.RWing = new ModelRenderer(this, 39, 0);
    this.RWing.addBox(-7.0F, 0.0F, 0.0F, 7, 1, 6);
    this.RWing.setRotationPoint(-1.0F, 15.0F, -2.0F);
    this.RWing.setTextureSize(64, 64);
    this.RWing.mirror = true;
    setRotation(this.RWing, 0.0F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, 0, 16);
    this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9);
    this.Tail.setRotationPoint(0.0F, 15.0F, 6.0F);
    this.Tail.setTextureSize(64, 64);
    this.Tail.mirror = true;
    setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
    this.TailEnd = new ModelRenderer(this, 0, 10);
    this.TailEnd.addBox(0.0F, -1.0F, 9.0F, 2, 2, 2);
    this.TailEnd.setRotationPoint(-0.5F, 15.0F, 6.0F);
    this.TailEnd.setTextureSize(64, 64);
    this.TailEnd.mirror = true;
    setRotation(this.TailEnd, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 28, 21);
    this.Head.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.Head.setRotationPoint(-0.5F, 14.0F, -6.0F);
    this.Head.setTextureSize(64, 64);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Beak = new ModelRenderer(this, 0, 0);
    this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.Beak.setRotationPoint(0.0F, 14.5F, -8.0F);
    this.Beak.setTextureSize(64, 64);
    this.Beak.mirror = true;
    setRotation(this.Beak, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    float newangle = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.25F;
    this.LWing.rotateAngleZ = newangle;
    this.RWing.rotateAngleZ = -newangle;
    this.Body.render(f5);
    this.Fins.render(f5);
    this.LWing.render(f5);
    this.RWing.render(f5);
    this.Tail.render(f5);
    this.TailEnd.render(f5);
    this.Head.render(f5);
    this.Beak.render(f5);
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
