package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelGoldFish extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Dorsalfin;
    ModelRenderer Mouth;
    ModelRenderer Jaw;
    ModelRenderer Pectoralfin1;
    ModelRenderer Pectoralfin2;
    ModelRenderer Pectoralfin3;
    ModelRenderer Pectoralfin4;
    ModelRenderer Bottomfin;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Caudalfin1;
    ModelRenderer Caudalfin2;
    ModelRenderer Bottomfin1;
    ModelRenderer Bottomfin2;
    
    public ModelGoldFish(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this, 0, 15);
        this.Body.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 10);
        this.Body.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Body.setTextureSize(64, 64);
        this.Body.mirror = true;
        setRotation(Body, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 30);
        this.Head.addBox(-1.5F, -2.0F, -3.0F, 3, 4, 3);
        this.Head.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Head.setTextureSize(64, 64);
        this.Head.mirror = true;
        setRotation(Head, 0.0F, 0.0F, 0.0F);
        this.Dorsalfin = new ModelRenderer(this, 29, 0);
        this.Dorsalfin.addBox(0.0F, -6.0F, 0.0F, 0, 4, 10);
        this.Dorsalfin.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Dorsalfin.setTextureSize(64, 64);
        this.Dorsalfin.mirror = true;
        setRotation(Dorsalfin, 0.0F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 0, 38);
        this.Mouth.addBox(-1.5F, 0.6F, -3.5F, 3, 3, 3);
        this.Mouth.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Mouth.setTextureSize(64, 64);
        this.Mouth.mirror = true;
        setRotation(Mouth, -0.7853982F, 0.0F, 0.0F);
        this.Jaw = new ModelRenderer(this, 13, 30);
        this.Jaw.addBox(-1.0F, 0.0F, -3.0F, 3, 1, 3);
        this.Jaw.setRotationPoint(-0.5F, 15.6F, -7.4F);
        this.Jaw.setTextureSize(64, 64);
        this.Jaw.mirror = true;
        setRotation(Jaw, -0.2284419F, 0.0F, 0.0F);
        this.Pectoralfin1 = new ModelRenderer(this, 0, 0);
        this.Pectoralfin1.addBox(0.0F, -1.5F, 0.0F, 0, 3, 5);
        this.Pectoralfin1.setRotationPoint(-2.0F, 14.0F, -3.0F);
        this.Pectoralfin1.setTextureSize(64, 64);
        this.Pectoralfin1.mirror = true;
        setRotation(Pectoralfin1, -0.2974289F, -0.3346075F, 0.0F);
        this.Pectoralfin2 = new ModelRenderer(this, 0, 0);
        this.Pectoralfin2.addBox(0.0F, -1.5F, 0.0F, 0, 3, 5);
        this.Pectoralfin2.setRotationPoint(2.0F, 14.0F, -3.0F);
        this.Pectoralfin2.setTextureSize(64, 64);
        this.Pectoralfin2.mirror = true;
        setRotation(Pectoralfin2, -0.2974216F, 0.3346145F, 0.0F);
        this.Pectoralfin3 = new ModelRenderer(this, 0, 0);
        this.Pectoralfin3.addBox(0.0F, -1.5F, 0.0F, 0, 3, 5);
        this.Pectoralfin3.setRotationPoint(-2.0F, 14.0F, 1.0F);
        this.Pectoralfin3.setTextureSize(64, 64);
        this.Pectoralfin3.mirror = true;
        setRotation(Pectoralfin3, -0.2974289F, -0.3346075F, 0.0F);
        this.Pectoralfin4 = new ModelRenderer(this, 0, 0);
        this.Pectoralfin4.addBox(0.0F, -1.5F, 0.0F, 0, 3, 5);
        this.Pectoralfin4.setRotationPoint(2.0F, 14.0F, 1.0F);
        this.Pectoralfin4.setTextureSize(64, 64);
        this.Pectoralfin4.mirror = true;
        setRotation(Pectoralfin4, -0.2974289F, 0.3346145F, 0.0F);
        this.Bottomfin = new ModelRenderer(this, 20, 8);
        this.Bottomfin.addBox(0.0F, 2.0F, 6.0F, 0, 3, 4);
        this.Bottomfin.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Bottomfin.setTextureSize(64, 64);
        this.Bottomfin.mirror = true;
        setRotation(Bottomfin, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 29, 15);
        this.Tail1.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 6);
        this.Tail1.setRotationPoint(0.0F, 14.0F, 5.0F);
        this.Tail1.setTextureSize(64, 64);
        this.Tail1.mirror = true;
        setRotation(Tail1, 0.0F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 8);
        this.Tail2.addBox(-1.0F, -1.5F, 6.0F, 2, 3, 4);
        this.Tail2.setRotationPoint(0.0F, 14.0F, 5.0F);
        this.Tail2.setTextureSize(64, 64);
        this.Tail2.mirror = true;
        setRotation(Tail2, 0.0F, 0.0F, 0.0F);
        this.Caudalfin1 = new ModelRenderer(this, 13, 35);
        this.Caudalfin1.addBox(-0.5F, 5.5F, 6.0F, 1, 3, 4);
        this.Caudalfin1.setRotationPoint(0.0F, 14.0F, 5.0F);
        this.Caudalfin1.setTextureSize(64, 64);
        this.Caudalfin1.mirror = true;
        setRotation(Caudalfin1, 0.8179294F, 0.0F, 0.0F);
        this.Caudalfin2 = new ModelRenderer(this, 15, 35);
        this.Caudalfin2.addBox(-0.5F, 5.5F, 6.0F, 1, 4, 3);
        this.Caudalfin2.setRotationPoint(0.0F, 14.0F, 5.0F);
        this.Caudalfin2.setTextureSize(64, 64);
        this.Caudalfin2.mirror = true;
        setRotation(Caudalfin2, 0.8179294F, 0.0F, 0.0F);
        this.Bottomfin1 = new ModelRenderer(this, 20, 0);
        this.Bottomfin1.addBox(-1.0F, 2.0F, 1.0F, 0, 5, 2);
        this.Bottomfin1.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Bottomfin1.setTextureSize(64, 64);
        this.Bottomfin1.mirror = true;
        setRotation(Bottomfin1, 0.2974289F, 0.0F, 0.3346145F);
        this.Bottomfin2 = new ModelRenderer(this, 20, 0);
        this.Bottomfin2.addBox(1.0F, 2.0F, 1.0F, 0, 5, 2);
        this.Bottomfin2.setRotationPoint(0.0F, 14.0F, -5.0F);
        this.Bottomfin2.setTextureSize(64, 64);
        this.Bottomfin2.mirror = true;
        setRotation(Bottomfin2, 0.2974289F, 0.0F, -0.3346075F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.15f;
        this.Pectoralfin1.rotateAngleY = 0.4f + newangle;
        newangle = MathHelper.cos(f2 * 1.2f * this.wingspeed) * 3.1415927f * 0.15f;
        this.Pectoralfin2.rotateAngleY = -0.4f + newangle;
        newangle = MathHelper.cos(f2 * 1.1f * this.wingspeed) * 3.1415927f * 0.15f;
        this.Pectoralfin3.rotateAngleY = 0.4f + newangle;
        newangle = MathHelper.cos(f2 * 1.0f * this.wingspeed) * 3.1415927f * 0.15f;
        this.Pectoralfin4.rotateAngleY = -0.4f + newangle;
        newangle = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.25f;
        this.Bottomfin1.rotateAngleY = newangle;
        this.Bottomfin2.rotateAngleY = -newangle;
        newangle = MathHelper.cos(f2 * 0.7f * this.wingspeed) * 3.1415927f * 0.1f;
        this.Jaw.rotateAngleX = -0.25f + newangle;
        this.Body.render(f5);
        this.Head.render(f5);
        this.Dorsalfin.render(f5);
        this.Mouth.render(f5);
        this.Jaw.render(f5);
        this.Pectoralfin1.render(f5);
        this.Pectoralfin2.render(f5);
        this.Pectoralfin3.render(f5);
        this.Pectoralfin4.render(f5);
        this.Bottomfin.render(f5);
        this.Tail1.render(f5);
        this.Tail2.render(f5);
        this.Caudalfin1.render(f5);
        this.Caudalfin2.render(f5);
        this.Bottomfin1.render(f5);
        this.Bottomfin2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
