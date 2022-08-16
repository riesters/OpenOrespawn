package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;

public class ModelRotator extends ModelBase
{
    float wingspeed;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    
    public ModelRotator(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 0, 12);
        this.Shape1.addBox(-2.0F, 3.9F, 0.0F, 4, 1, 1);
        this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        setRotation(Shape1);
        this.Shape2 = new ModelRenderer(this, 0, 7);
        this.Shape2.addBox(-4.0F, 7.6F, 0.0F, 8, 2, 2);
        this.Shape2.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        setRotation(Shape2);
        this.Shape3 = new ModelRenderer(this, 0, 0);
        this.Shape3.addBox(-7.0F, 13.7F, 0.0F, 14, 3, 3);
        this.Shape3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        setRotation(Shape3);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Rotator r = (Rotator)entity;
        RenderInfo ri;
        float newangle = 0.0f;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        ri = r.getRenderInfo();
        GL11.glRotatef(ri.rf1, 1.0f, 0.0f, 0.0f);
        for (int i = 0; i < 8; ++i) {
            this.Shape1.rotateAngleZ = newangle;
            this.Shape1.render(f5);
            newangle += 0.7853982f;
        }
        GL11.glRotatef(-ri.rf1, 1.0f, 0.0f, 0.0f);
        newangle = 0.0f;
        GL11.glRotatef(ri.rf1, 0.0f, 1.0f, 0.0f);
        for (int i = 0; i < 8; ++i) {
            this.Shape2.rotateAngleZ = newangle;
            this.Shape2.render(f5);
            newangle += 0.7853982f;
        }
        GL11.glRotatef(-ri.rf1, 0.0f, 1.0f, 0.0f);
        newangle = 0.0f;
        GL11.glRotatef(ri.rf1, 0.0f, 0.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            this.Shape3.rotateAngleZ = newangle;
            this.Shape3.render(f5);
            newangle += 0.7853982f;
        }
        GL11.glRotatef(-ri.rf1, 0.0f, 0.0f, 1.0f);
        final RenderInfo renderInfo = ri;
        renderInfo.rf1 += 2.0f;
        if (ri.rf1 > 359.0) {
            ri.rf1 = 0.0f;
        }
        r.setRenderInfo(ri);
    }
    
    private void setRotation(final ModelRenderer model) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
