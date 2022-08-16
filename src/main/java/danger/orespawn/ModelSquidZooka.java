package danger.orespawn;

import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;

public class ModelSquidZooka extends ModelBase
{
    ModelRenderer Barrel;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tail5;
    ModelRenderer tail6;
    ModelRenderer tail7;
    ModelRenderer sight3;
    ModelRenderer sight2;
    ModelRenderer sight1;
    ModelRenderer handle1;
    
    public ModelSquidZooka() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Barrel = new ModelRenderer(this, 29, 19);
        this.Barrel.addBox(-1.0F, -1.0F, -19.0F, 2, 2, 34);
        this.Barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Barrel.setTextureSize(128, 128);
        this.Barrel.mirror = true;
        setRotation(Barrel);
        this.tail1 = new ModelRenderer(this, 0, 53);
        this.tail1.addBox(-1.5F, -1.5F, 15.0F, 3, 3, 1);
        this.tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.setTextureSize(128, 128);
        this.tail1.mirror = true;
        setRotation(tail1);
        this.tail2 = new ModelRenderer(this, 0, 58);
        this.tail2.addBox(-2.0F, -2.0F, 16.0F, 4, 4, 1);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.setTextureSize(128, 128);
        this.tail2.mirror = true;
        setRotation(tail2);
        this.tail3 = new ModelRenderer(this, 0, 64);
        this.tail3.addBox(-2.5F, -2.5F, 17.0F, 5, 5, 1);
        this.tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.setTextureSize(128, 128);
        this.tail3.mirror = true;
        setRotation(tail3);
        this.tail4 = new ModelRenderer(this, 0, 71);
        this.tail4.addBox(-3.0F, -3.0F, 18.0F, 6, 6, 6);
        this.tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.setTextureSize(128, 128);
        this.tail4.mirror = true;
        setRotation(tail4);
        this.tail5 = new ModelRenderer(this, 0, 84);
        this.tail5.addBox(-2.5F, -2.5F, 24.0F, 5, 5, 1);
        this.tail5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5.setTextureSize(128, 128);
        this.tail5.mirror = true;
        setRotation(tail5);
        this.tail6 = new ModelRenderer(this, 0, 91);
        this.tail6.addBox(-2.0F, -2.0F, 25.0F, 4, 4, 1);
        this.tail6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail6.setTextureSize(128, 128);
        this.tail6.mirror = true;
        setRotation(tail6);
        this.tail7 = new ModelRenderer(this, 0, 97);
        this.tail7.addBox(-1.5F, -1.5F, 26.0F, 3, 3, 1);
        this.tail7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail7.setTextureSize(128, 128);
        this.tail7.mirror = true;
        setRotation(tail7);
        this.sight3 = new ModelRenderer(this, 25, 0);
        this.sight3.addBox(1.0F, -2.0F, -10.0F, 1, 1, 2);
        this.sight3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sight3.setTextureSize(128, 128);
        this.sight3.mirror = true;
        setRotation(sight3);
        this.sight2 = new ModelRenderer(this, 32, 0);
        this.sight2.addBox(0.5F, -4.0F, -12.0F, 2, 2, 6);
        this.sight2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sight2.setTextureSize(128, 128);
        this.sight2.mirror = true;
        setRotation(sight2);
        this.sight1 = new ModelRenderer(this, 18, 0);
        this.sight1.addBox(1.0F, -1.0F, -10.0F, 1, 1, 2);
        this.sight1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sight1.setTextureSize(128, 128);
        this.sight1.mirror = true;
        setRotation(sight1);
        this.handle1 = new ModelRenderer(this, 0, 0);
        this.handle1.addBox(0.0F, 1.0F, 0.0F, 1, 7, 1);
        this.handle1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.handle1.setTextureSize(128, 128);
        this.handle1.mirror = true;
        setRotation(handle1);
    }
    
    public void render() {
        final float f5 = 1.0f;
        GL11.glPushMatrix();
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        this.Barrel.render(f5);
        this.tail1.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.tail5.render(f5);
        this.tail6.render(f5);
        this.tail7.render(f5);
        this.sight3.render(f5);
        this.sight2.render(f5);
        this.sight1.render(f5);
        this.handle1.render(f5);
        GL11.glPopMatrix();
    }
    
    private void setRotation(final ModelRenderer model) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
}
