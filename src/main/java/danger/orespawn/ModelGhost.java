package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGhost extends ModelBase {
  ModelRenderer HeadAndBody;
  
  ModelRenderer LArm;
  
  ModelRenderer RArm;
  
  public ModelGhost() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.HeadAndBody = new ModelRenderer(this, 0, 0);
    this.HeadAndBody.addBox(-3.0F, 0.0F, -3.0F, 6, 21, 6);
    this.HeadAndBody.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadAndBody.setTextureSize(64, 64);
    this.HeadAndBody.mirror = true;
    setRotation(this.HeadAndBody, 0.0F, 0.0F, 0.0F);
    this.LArm = new ModelRenderer(this, 34, 0);
    this.LArm.addBox(-1.0F, -1.0F, -1.0F, 2, 11, 2);
    this.LArm.setRotationPoint(3.0F, 6.0F, 0.0F);
    this.LArm.setTextureSize(64, 64);
    this.LArm.mirror = true;
    setRotation(this.LArm, 0.0F, 0.0F, -0.3316126F);
    this.RArm = new ModelRenderer(this, 25, 0);
    this.RArm.addBox(-1.0F, -1.0F, -1.0F, 2, 11, 2);
    this.RArm.setRotationPoint(-3.0F, 6.0F, 0.0F);
    this.RArm.setTextureSize(64, 64);
    this.RArm.mirror = true;
    setRotation(this.RArm, 0.0F, 0.0F, 0.3316126F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.LArm.rotateAngleZ = -0.33F + MathHelper.cos(f2 * 0.3F) * 3.1415927F * 0.05F;
    this.RArm.rotateAngleZ = 0.33F + MathHelper.cos(f2 * 0.32F) * 3.1415927F * 0.05F;
    this.LArm.rotateAngleX = -0.33F + MathHelper.cos(f2 * 0.34F) * 3.1415927F * 0.05F;
    this.RArm.rotateAngleX = 0.33F + MathHelper.cos(f2 * 0.36F) * 3.1415927F * 0.05F;
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.25F);
    this.HeadAndBody.render(f5);
    this.LArm.render(f5);
    this.RArm.render(f5);
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
