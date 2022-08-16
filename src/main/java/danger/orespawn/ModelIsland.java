package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelIsland extends ModelBase
{
    private float wingspeed;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    
    public ModelIsland() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
        this.Shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        setRotation(Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 32, 0);
        this.Shape2.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
        this.Shape2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        setRotation(Shape2, 0.7853982F, 0.7853982F, 0.7853982F);
        this.Shape3 = new ModelRenderer(this, 32, 16);
        this.Shape3.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
        this.Shape3.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        setRotation(Shape3, 0.7853982F, 0.7853982F, 0.7853982F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        newangle = MathHelper.cos(f2 * 0.05f * this.wingspeed) * 3.1415927f;
        this.Shape1.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.051f * this.wingspeed) * 3.1415927f;
        this.Shape1.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 0.052f * this.wingspeed) * 3.1415927f;
        this.Shape1.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.053f * this.wingspeed) * 3.1415927f;
        this.Shape2.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.054f * this.wingspeed) * 3.1415927f;
        this.Shape2.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 0.055f * this.wingspeed) * 3.1415927f;
        this.Shape2.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 0.056f * this.wingspeed) * 3.1415927f;
        this.Shape3.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.057f * this.wingspeed) * 3.1415927f;
        this.Shape3.rotateAngleY = newangle;
        newangle = MathHelper.cos(f2 * 0.058f * this.wingspeed) * 3.1415927f;
        this.Shape3.rotateAngleZ = newangle;
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }

    public void setWingspeed(float wingspeed) {
        this.wingspeed = wingspeed;
    }
}
