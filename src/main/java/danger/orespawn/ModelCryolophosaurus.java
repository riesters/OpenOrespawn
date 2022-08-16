package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCryolophosaurus extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer jaw;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer rightleg;
    ModelRenderer Shape11;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer rightleg4;
    ModelRenderer leftleg;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer leftleg4;
    
    public ModelCryolophosaurus(final float f1) {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.wingspeed = f1;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 18);
        this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape1.setTextureSize(128, 128);
        this.Shape1.mirror = true;
        setRotation(Shape1, 0.0F);
        this.Shape2 = new ModelRenderer(this, 53, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 4, 11);
        this.Shape2.setRotationPoint(1.0F, -2.0F, -7.0F);
        this.Shape2.setTextureSize(128, 128);
        this.Shape2.mirror = true;
        setRotation(Shape2, -0.2268928F);
        this.Shape3 = new ModelRenderer(this, 0, 41);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10);
        this.Shape3.setRotationPoint(1.0F, -2.0F, -15.0F);
        this.Shape3.setTextureSize(128, 128);
        this.Shape3.mirror = true;
        setRotation(Shape3, 0.0F);
        this.jaw = new ModelRenderer(this, 0, 30);
        this.jaw.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.jaw.setRotationPoint(2.0F, 1.0F, -8.0F);
        this.jaw.setTextureSize(128, 128);
        this.jaw.mirror = true;
        setRotation(jaw, -1.256637F);
        this.Shape5 = new ModelRenderer(this, 91, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 6, 6, 7);
        this.Shape5.setRotationPoint(1.0F, 0.0F, 18.0F);
        this.Shape5.setTextureSize(128, 128);
        this.Shape5.mirror = true;
        setRotation(Shape5, 0.0F);
        this.Shape6 = new ModelRenderer(this, 36, 31);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 4, 14);
        this.Shape6.setRotationPoint(2.0F, 0.0F, 25.0F);
        this.Shape6.setTextureSize(128, 128);
        this.Shape6.mirror = true;
        setRotation(Shape6, 0.0F);
        this.Shape7 = new ModelRenderer(this, 43, 8);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2);
        this.Shape7.setRotationPoint(-1.0F, 8.0F, 0.0F);
        this.Shape7.setTextureSize(128, 128);
        this.Shape7.mirror = true;
        setRotation(Shape7, 0.1919862F);
        this.Shape8 = new ModelRenderer(this, 9, 0);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.Shape8.setRotationPoint(-1.0F, 11.0F, 1.0F);
        this.Shape8.setTextureSize(128, 128);
        this.Shape8.mirror = true;
        setRotation(Shape8, -0.2617994F);
        this.Shape9 = new ModelRenderer(this, 0, 0);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
        this.Shape9.setRotationPoint(3.0F, -4.0F, -9.0F);
        this.Shape9.setTextureSize(128, 128);
        this.Shape9.mirror = true;
        setRotation(Shape9, -0.9424778F);
        this.rightleg = new ModelRenderer(this, 0, 58);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 2, 10, 6);
        this.rightleg.setRotationPoint(-1.0F, 2.0F, 12.0F);
        this.rightleg.setTextureSize(128, 128);
        this.rightleg.mirror = true;
        setRotation(rightleg, -0.2792527F);
        this.Shape11 = new ModelRenderer(this, 39, 0);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3);
        this.Shape11.setRotationPoint(2.0F, -1.0F, -18.0F);
        this.Shape11.setTextureSize(128, 128);
        this.Shape11.mirror = true;
        setRotation(Shape11, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 0, 77);
        this.rightleg2.addBox(0.0F, 7.0F, -5.0F, 2, 10, 3);
        this.rightleg2.setRotationPoint(-1.0F, 2.0F, 12.0F);
        this.rightleg2.setTextureSize(128, 128);
        this.rightleg2.mirror = true;
        setRotation(rightleg2, 0.3839724F);
        this.rightleg3 = new ModelRenderer(this, 35, 31);
        this.rightleg3.addBox(0.0F, 10.0F, 12.0F, 2, 7, 2);
        this.rightleg3.setRotationPoint(-1.0F, 2.0F, 12.0F);
        this.rightleg3.setTextureSize(128, 128);
        this.rightleg3.mirror = true;
        setRotation(rightleg3, -0.6806784F);
        this.rightleg4 = new ModelRenderer(this, 68, 55);
        this.rightleg4.addBox(0.0F, 20.0F, -5.0F, 2, 2, 6);
        this.rightleg4.setRotationPoint(-1.0F, 2.0F, 12.0F);
        this.rightleg4.setTextureSize(128, 128);
        this.rightleg4.mirror = true;
        setRotation(rightleg4, 0.0F);
        this.leftleg = new ModelRenderer(this, 22, 58);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 2, 10, 6);
        this.leftleg.setRotationPoint(7.0F, 2.0F, 12.0F);
        this.leftleg.setTextureSize(128, 128);
        this.leftleg.mirror = true;
        setRotation(leftleg, -0.2792527F);
        this.Shape16 = new ModelRenderer(this, 0, 8);
        this.Shape16.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2);
        this.Shape16.setRotationPoint(8.0F, 8.0F, 0.0F);
        this.Shape16.setTextureSize(128, 128);
        this.Shape16.mirror = true;
        setRotation(Shape16, 0.1919862F);
        this.Shape17 = new ModelRenderer(this, 9, 9);
        this.Shape17.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.Shape17.setRotationPoint(8.0F, 11.0F, 1.0F);
        this.Shape17.setTextureSize(128, 128);
        this.Shape17.mirror = true;
        setRotation(Shape17, -0.2617994F);
        this.leftleg2 = new ModelRenderer(this, 16, 77);
        this.leftleg2.addBox(0.0F, 7.0F, -5.0F, 2, 10, 3);
        this.leftleg2.setRotationPoint(7.0F, 2.0F, 12.0F);
        this.leftleg2.setTextureSize(128, 128);
        this.leftleg2.mirror = true;
        setRotation(leftleg2, 0.3839724F);
        this.leftleg3 = new ModelRenderer(this, 67, 31);
        this.leftleg3.addBox(0.0F, 10.0F, 12.0F, 2, 7, 2);
        this.leftleg3.setRotationPoint(7.0F, 2.0F, 12.0F);
        this.leftleg3.setTextureSize(128, 128);
        this.leftleg3.mirror = true;
        setRotation(leftleg3, -0.6806784F);
        this.leftleg4 = new ModelRenderer(this, 47, 56);
        this.leftleg4.addBox(0.0F, 20.0F, -5.0F, 2, 2, 6);
        this.leftleg4.setRotationPoint(7.0F, 2.0F, 12.0F);
        this.leftleg4.setTextureSize(128, 128);
        this.leftleg4.mirror = true;
        setRotation(leftleg4, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.rightleg.rotateAngleX = -0.2792527f + newangle;
        this.rightleg2.rotateAngleX = 0.384f + newangle;
        this.rightleg3.rotateAngleX = -0.68f + newangle;
        this.rightleg4.rotateAngleX = newangle;
        this.leftleg.rotateAngleX = -0.2792527f - newangle;
        this.leftleg2.rotateAngleX = 0.384f - newangle;
        this.leftleg3.rotateAngleX = -0.68f - newangle;
        this.leftleg4.rotateAngleX = -newangle;
        this.jaw.rotateAngleX = -1.15f + MathHelper.cos(f2 * 0.28f) * 3.1415927f * 0.1f;
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.jaw.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape9.render(f5);
        this.rightleg.render(f5);
        this.Shape11.render(f5);
        this.rightleg2.render(f5);
        this.rightleg3.render(f5);
        this.rightleg4.render(f5);
        this.leftleg.render(f5);
        this.Shape16.render(f5);
        this.Shape17.render(f5);
        this.leftleg2.render(f5);
        this.leftleg3.render(f5);
        this.leftleg4.render(f5);
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
