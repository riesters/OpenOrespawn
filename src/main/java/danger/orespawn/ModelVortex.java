package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class ModelVortex extends ModelBase
{
    float wingspeed;
    ModelRenderer Shape1;
    
    public ModelVortex(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(-64.0F, -64.0F, 0.0F, 128, 64, 0);
        this.Shape1.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.Shape1.setTextureSize(256, 128);
        this.Shape1.mirror = true;
        setRotation(Shape1);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.render(f5);
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
