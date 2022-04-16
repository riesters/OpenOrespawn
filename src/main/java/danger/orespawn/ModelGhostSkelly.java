package danger.orespawn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGhostSkelly extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer shirt;
  
  ModelRenderer head;
  
  ModelRenderer stem;
  
  ModelRenderer rarm;
  
  ModelRenderer larm;
  
  ModelRenderer rsleeve;
  
  ModelRenderer lsleeve;
  
  ModelRenderer lchains;
  
  ModelRenderer rchains;
  
  public ModelGhostSkelly() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 1, 21, 1);
    this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
    this.body.setTextureSize(128, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.shirt = new ModelRenderer(this, 42, 43);
    this.shirt.addBox(-2.0F, 0.0F, -2.0F, 5, 12, 5);
    this.shirt.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shirt.setTextureSize(128, 64);
    this.shirt.mirror = true;
    setRotation(this.shirt, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 40, 29);
    this.head.addBox(-3.0F, 0.0F, -3.0F, 7, 5, 7);
    this.head.setRotationPoint(0.0F, -6.0F, 0.0F);
    this.head.setTextureSize(128, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.stem = new ModelRenderer(this, 49, 23);
    this.stem.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
    this.stem.setRotationPoint(0.0F, -8.0F, 0.0F);
    this.stem.setTextureSize(128, 64);
    this.stem.mirror = true;
    setRotation(this.stem, 0.1745329F, 0.0F, 0.1745329F);
    this.rarm = new ModelRenderer(this, 26, 0);
    this.rarm.addBox(-14.0F, 0.0F, 0.0F, 15, 1, 1);
    this.rarm.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.rarm.setTextureSize(128, 64);
    this.rarm.mirror = true;
    setRotation(this.rarm, 0.0F, 0.0F, 0.0F);
    this.larm = new ModelRenderer(this, 63, 0);
    this.larm.addBox(0.0F, 0.0F, 0.0F, 15, 1, 1);
    this.larm.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.larm.setTextureSize(128, 64);
    this.larm.mirror = true;
    setRotation(this.larm, 0.0F, 0.0F, 0.0F);
    this.rsleeve = new ModelRenderer(this, 31, 7);
    this.rsleeve.addBox(-11.0F, 0.0F, -1.0F, 9, 8, 3);
    this.rsleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.rsleeve.setTextureSize(128, 64);
    this.rsleeve.mirror = true;
    setRotation(this.rsleeve, 0.0F, 0.0F, 0.0F);
    this.lsleeve = new ModelRenderer(this, 71, 7);
    this.lsleeve.addBox(3.0F, 0.0F, -1.0F, 9, 8, 3);
    this.lsleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lsleeve.setTextureSize(128, 64);
    this.lsleeve.mirror = true;
    setRotation(this.lsleeve, 0.0F, 0.0F, 0.0F);
    this.lchains = new ModelRenderer(this, 98, 0);
    this.lchains.addBox(11.0F, -1.0F, 0.0F, 3, 16, 1);
    this.lchains.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lchains.setTextureSize(128, 64);
    this.lchains.mirror = true;
    setRotation(this.lchains, 0.0F, 0.0F, 0.0F);
    this.rchains = new ModelRenderer(this, 12, 0);
    this.rchains.addBox(-13.0F, -1.0F, 0.0F, 3, 10, 1);
    this.rchains.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.rchains.setTextureSize(128, 64);
    this.rchains.mirror = true;
    setRotation(this.rchains, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GhostSkelly e = (GhostSkelly)entity;
    RenderInfo r = null;
    float newangle = 0.0F;
    float newrf1 = 0.0F;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    r = e.getRenderInfo();
    this.lchains.rotateAngleZ = MathHelper.cos(f2 * 0.2F) * 3.1415927F * 0.05F;
    this.rchains.rotateAngleZ = MathHelper.cos(f2 * 0.22F) * 3.1415927F * 0.05F;
    this.lchains.rotateAngleY = MathHelper.cos(f2 * 0.24F) * 3.1415927F * 0.05F;
    this.rchains.rotateAngleY = MathHelper.cos(f2 * 0.26F) * 3.1415927F * 0.05F;
    newangle = MathHelper.cos(f2 * 0.05F) * 3.1415927F * 2.0F;
    newrf1 = f2 * 0.05F % 6.2831855F;
    newrf1 = Math.abs(newrf1);
    if (newrf1 < r.rf2) {
      r.ri2 = 0;
      if (e.worldObj.rand.nextInt(3) == 1)
        r.ri2 |= 0x1; 
    } 
    r.rf2 = newrf1;
    if ((r.ri2 & 0x1) == 0)
      newangle = 0.0F; 
    this.head.rotateAngleY = newangle;
    e.setRenderInfo(r);
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(0.75F, 0.75F, 0.75F, 0.25F);
    this.body.render(f5);
    this.shirt.render(f5);
    this.head.render(f5);
    this.stem.render(f5);
    this.rarm.render(f5);
    this.larm.render(f5);
    this.rsleeve.render(f5);
    this.lsleeve.render(f5);
    this.lchains.render(f5);
    this.rchains.render(f5);
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
