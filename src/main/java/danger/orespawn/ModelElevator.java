package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class ModelElevator extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    
    public ModelElevator() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Shape2 = new ModelRenderer(this, 0, 18);
        this.Shape2.addBox(-3.0F, 0.0F, -9.0F, 6, 1, 1);
        this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape2.setTextureSize(64, 64);
        this.Shape2.mirror = true;
        setRotation(Shape2);
        this.Shape3 = new ModelRenderer(this, 0, 21);
        this.Shape3.addBox(-1.0F, 0.0F, -10.0F, 2, 1, 1);
        this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape3.setTextureSize(64, 64);
        this.Shape3.mirror = true;
        setRotation(Shape3);
        this.Shape4 = new ModelRenderer(this, 17, 18);
        this.Shape4.addBox(-3.0F, 0.0F, 8.0F, 6, 1, 1);
        this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape4.setTextureSize(64, 64);
        this.Shape4.mirror = true;
        setRotation(Shape4);
        this.Shape5 = new ModelRenderer(this, 17, 21);
        this.Shape5.addBox(-1.0F, 0.0F, 9.0F, 2, 1, 1);
        this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape5.setTextureSize(64, 64);
        this.Shape5.mirror = true;
        setRotation(Shape5);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(-4.0F, 0.0F, -8.0F, 8, 1, 16);
        this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape1.setTextureSize(64, 64);
        this.Shape1.mirror = true;
        setRotation(Shape1);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
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
