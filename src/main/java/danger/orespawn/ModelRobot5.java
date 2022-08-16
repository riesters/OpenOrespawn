package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class ModelRobot5 extends ModelBase
{
    ModelRenderer lwheel1;
    ModelRenderer lwheel2;
    ModelRenderer rwheel1;
    ModelRenderer rwheel2;
    ModelRenderer axle;
    ModelRenderer drivebox;
    ModelRenderer stand;
    ModelRenderer swivel;
    ModelRenderer barrel1;
    ModelRenderer barrel2;
    ModelRenderer ammobox;
    
    public ModelRobot5() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.lwheel1 = new ModelRenderer(this, 0, 23);
        this.lwheel1.addBox(0.0F, -4.0F, -4.0F, 2, 8, 8);
        this.lwheel1.setRotationPoint(6.0F, 19.0F, 0.0F);
        this.lwheel1.setTextureSize(128, 128);
        this.lwheel1.mirror = true;
        setRotation(lwheel1, 0.0F);
        this.lwheel2 = new ModelRenderer(this, 0, 43);
        this.lwheel2.addBox(0.0F, -4.0F, -4.0F, 2, 8, 8);
        this.lwheel2.setRotationPoint(6.0F, 19.0F, 0.0F);
        this.lwheel2.setTextureSize(128, 128);
        this.lwheel2.mirror = true;
        setRotation(lwheel2, 0.7853982F);
        this.rwheel1 = new ModelRenderer(this, 0, 23);
        this.rwheel1.addBox(0.0F, -4.0F, -4.0F, 2, 8, 8);
        this.rwheel1.setRotationPoint(-8.0F, 19.0F, 0.0F);
        this.rwheel1.setTextureSize(128, 128);
        this.rwheel1.mirror = true;
        setRotation(rwheel1, 0.0F);
        this.rwheel2 = new ModelRenderer(this, 0, 43);
        this.rwheel2.addBox(0.0F, -4.0F, -4.0F, 2, 8, 8);
        this.rwheel2.setRotationPoint(-8.0F, 19.0F, 0.0F);
        this.rwheel2.setTextureSize(128, 128);
        this.rwheel2.mirror = true;
        setRotation(rwheel2, 0.7853982F);
        this.axle = new ModelRenderer(this, 42, 0);
        this.axle.addBox(-6.0F, -0.5F, -0.5F, 12, 1, 1);
        this.axle.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.axle.setTextureSize(128, 128);
        this.axle.mirror = true;
        setRotation(axle, 0.0F);
        this.drivebox = new ModelRenderer(this, 47, 4);
        this.drivebox.addBox(-2.0F, -1.5F, -1.5F, 4, 3, 3);
        this.drivebox.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.drivebox.setTextureSize(128, 128);
        this.drivebox.mirror = true;
        setRotation(drivebox, 0.0F);
        this.stand = new ModelRenderer(this, 35, 0);
        this.stand.addBox(-0.5F, 0.0F, -0.5F, 1, 18, 1);
        this.stand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.stand.setTextureSize(128, 128);
        this.stand.mirror = true;
        setRotation(stand, 0.0F);
        this.swivel = new ModelRenderer(this, 22, 0);
        this.swivel.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2);
        this.swivel.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.swivel.setTextureSize(128, 128);
        this.swivel.mirror = true;
        setRotation(swivel, 0.0F);
        this.barrel1 = new ModelRenderer(this, 24, 25);
        this.barrel1.addBox(-1.0F, -2.0F, -10.0F, 2, 2, 13);
        this.barrel1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.barrel1.setTextureSize(128, 128);
        this.barrel1.mirror = true;
        setRotation(barrel1, 0.0F);
        this.barrel2 = new ModelRenderer(this, 27, 43);
        this.barrel2.addBox(-0.5F, -1.5F, -19.0F, 1, 1, 9);
        this.barrel2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.barrel2.setTextureSize(128, 128);
        this.barrel2.mirror = true;
        setRotation(barrel2, 0.0F);
        this.ammobox = new ModelRenderer(this, 0, 0);
        this.ammobox.addBox(-2.0F, -2.0F, 3.0F, 4, 3, 5);
        this.ammobox.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ammobox.setTextureSize(128, 128);
        this.ammobox.mirror = true;
        setRotation(ammobox, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (f1 > 0.1) {
            newangle = f2 * 0.15f % 6.2831855f;
            newangle = Math.abs(newangle);
        }
        else {
            newangle = 0.0f;
        }
        this.lwheel1.rotateAngleX = newangle;
        this.lwheel2.rotateAngleX = (float)(newangle + 0.7853981633974483);
        this.rwheel1.rotateAngleX = newangle;
        this.rwheel2.rotateAngleX = (float)(newangle + 0.7853981633974483);
        final ModelRenderer barrel1 = this.barrel1;
        final ModelRenderer barrel2 = this.barrel2;
        final ModelRenderer ammobox = this.ammobox;
        final float rotateAngleY = (float)Math.toRadians(f3 / 2.0);
        ammobox.rotateAngleY = rotateAngleY;
        barrel2.rotateAngleY = rotateAngleY;
        barrel1.rotateAngleY = rotateAngleY;
        this.lwheel1.render(f5);
        this.lwheel2.render(f5);
        this.rwheel1.render(f5);
        this.rwheel2.render(f5);
        this.axle.render(f5);
        this.drivebox.render(f5);
        this.stand.render(f5);
        this.swivel.render(f5);
        this.barrel1.render(f5);
        this.barrel2.render(f5);
        this.ammobox.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x) {
        model.rotateAngleX = x;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
