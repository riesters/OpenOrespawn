package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelMosquito extends ModelBase
{
    ModelRenderer body;
    ModelRenderer leftwing1;
    ModelRenderer rightwing1;
    ModelRenderer leftwing2;
    ModelRenderer rightwing2;
    
    public ModelMosquito() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 8, 18);
        this.body.addBox(0.0F, 0.0F, -2.0F, 1, 1, 8);
        this.body.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body);
        this.leftwing1 = new ModelRenderer(this, 16, 13);
        this.leftwing1.addBox(1.0F, 0.0F, -1.0F, 3, 1, 3);
        this.leftwing1.setRotationPoint(1.0F, 17.0F, 0.0F);
        this.leftwing1.setTextureSize(64, 32);
        this.leftwing1.mirror = true;
        setRotation(leftwing1);
        this.rightwing1 = new ModelRenderer(this, 2, 13);
        this.rightwing1.addBox(-4.0F, 0.0F, -1.0F, 3, 1, 3);
        this.rightwing1.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.rightwing1.setTextureSize(64, 32);
        this.rightwing1.mirror = true;
        setRotation(rightwing1);
        this.leftwing2 = new ModelRenderer(this, 15, 8);
        this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1);
        this.leftwing2.setRotationPoint(1.0F, 17.0F, 0.0F);
        this.leftwing2.setTextureSize(64, 32);
        this.leftwing2.mirror = true;
        setRotation(leftwing2);
        this.rightwing2 = new ModelRenderer(this, 2, 8);
        this.rightwing2.addBox(-5.0F, 0.0F, 0.0F, 5, 1, 1);
        this.rightwing2.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.rightwing2.setTextureSize(64, 32);
        this.rightwing2.mirror = true;
        setRotation(rightwing2);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
        this.rightwing1.rotateAngleZ = MathHelper.cos(f2 * 3.0f) * 3.1415927f * 0.25f;
        this.rightwing2.rotateAngleZ = this.rightwing1.rotateAngleZ;
        this.leftwing1.rotateAngleZ = -this.rightwing1.rotateAngleZ;
        this.leftwing2.rotateAngleZ = -this.rightwing1.rotateAngleZ;
        this.leftwing1.render(f5);
        this.rightwing1.render(f5);
        this.leftwing2.render(f5);
        this.rightwing2.render(f5);
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
