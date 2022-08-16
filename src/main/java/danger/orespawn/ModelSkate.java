package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelSkate extends ModelBase
{
    ModelRenderer body;
    ModelRenderer tail1;
    ModelRenderer Shape1;
    
    public ModelSkate() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 0, 13);
        this.body.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6);
        this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.7853982F);
        this.tail1 = new ModelRenderer(this, 0, 0);
        this.tail1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 11);
        this.tail1.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.tail1.setTextureSize(64, 32);
        this.tail1.mirror = true;
        setRotation(tail1, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 0, 21);
        this.Shape1.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4);
        this.Shape1.setRotationPoint(0.0F, 22.0F, 5.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        setRotation(Shape1, 0.7853982F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.2f) * 3.1415927f * 0.15f * f1;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.4f) * 3.1415927f * 0.05f;
        }
        this.Shape1.rotateAngleX = 0.785f + newangle;
        this.body.render(f5);
        this.tail1.render(f5);
        this.Shape1.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
