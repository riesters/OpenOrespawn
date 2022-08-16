package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCockateil extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Beak;
    ModelRenderer LowerBeak;
    ModelRenderer feather2;
    ModelRenderer feather1;
    ModelRenderer feather3;
    ModelRenderer tailfeather1;
    ModelRenderer rwing1;
    ModelRenderer lwing1;
    ModelRenderer leg;
    ModelRenderer otherleg;
    ModelRenderer lwing2;
    ModelRenderer rwing2;
    ModelRenderer tailfeather2;
    ModelRenderer tailfeather3;
    
    public ModelCockateil(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 5, 3, 6);
        this.Body.setRotationPoint(-1.0F, 18.0F, 0.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        setRotation(Body, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 22, 0);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4);
        this.Head.setRotationPoint(0.0F, 16.0F, -3.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        setRotation(Head, 0.0F, 0.0F);
        this.Beak = new ModelRenderer(this, 0, 21);
        this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.Beak.setRotationPoint(1.0F, 17.0F, -6.0F);
        this.Beak.setTextureSize(64, 32);
        this.Beak.mirror = true;
        setRotation(Beak, 0.0F, 0.0F);
        this.LowerBeak = new ModelRenderer(this, 1, 17);
        this.LowerBeak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.LowerBeak.setRotationPoint(1.0F, 18.0F, -4.0F);
        this.LowerBeak.setTextureSize(64, 32);
        this.LowerBeak.mirror = true;
        setRotation(LowerBeak, 0.0F, 0.0F);
        this.feather2 = new ModelRenderer(this, 15, 9);
        this.feather2.addBox(0.0F, -2.5F, -0.75F, 1, 3, 1);
        this.feather2.setRotationPoint(1.0F, 16.0F, 0.0F);
        this.feather2.setTextureSize(64, 32);
        this.feather2.mirror = true;
        setRotation(feather2, -0.6426736F, 0.0F);
        this.feather1 = new ModelRenderer(this, 11, 9);
        this.feather1.addBox(0.0F, -2.5F, -0.5F, 1, 3, 1);
        this.feather1.setRotationPoint(1.0F, 16.0F, -2.0F);
        this.feather1.setTextureSize(64, 32);
        this.feather1.mirror = true;
        setRotation(feather1, -0.2230717F, 0.0F);
        this.feather3 = new ModelRenderer(this, 19, 9);
        this.feather3.addBox(0.0F, -3.0F, 0.5F, 1, 4, 1);
        this.feather3.setRotationPoint(1.0F, 16.0F, 1.0F);
        this.feather3.setTextureSize(64, 32);
        this.feather3.mirror = true;
        setRotation(feather3, -1.276259F, 0.0F);
        this.tailfeather1 = new ModelRenderer(this, 46, 15);
        this.tailfeather1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
        this.tailfeather1.setRotationPoint(0.0F, 18.0F, 6.0F);
        this.tailfeather1.setTextureSize(64, 32);
        this.tailfeather1.mirror = true;
        setRotation(tailfeather1, 0.0F, 0.0F);
        this.rwing1 = new ModelRenderer(this, 23, 9);
        this.rwing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4);
        this.rwing1.setRotationPoint(-1.0F, 18.0F, 1.0F);
        this.rwing1.setTextureSize(64, 32);
        this.rwing1.mirror = true;
        setRotation(rwing1, 0.0F, 1.595066F);
        this.lwing1 = new ModelRenderer(this, 33, 9);
        this.lwing1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 4);
        this.lwing1.setRotationPoint(4.0F, 18.0F, 1.0F);
        this.lwing1.setTextureSize(64, 32);
        this.lwing1.mirror = true;
        setRotation(lwing1, 0.0F, -1.561488F);
        this.leg = new ModelRenderer(this, 4, 12);
        this.leg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.leg.setRotationPoint(2.0F, 21.0F, 3.0F);
        this.leg.setTextureSize(64, 32);
        this.leg.mirror = true;
        setRotation(leg, 0.8726646F, 0.0F);
        this.otherleg = new ModelRenderer(this, 0, 12);
        this.otherleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.otherleg.setRotationPoint(0.0F, 21.0F, 3.0F);
        this.otherleg.setTextureSize(64, 32);
        this.otherleg.mirror = true;
        setRotation(otherleg, 0.6108652F, 0.0F);
        this.lwing2 = new ModelRenderer(this, 10, 14);
        this.lwing2.addBox(4.0F, 0.0F, 0.0F, 3, 1, 3);
        this.lwing2.setRotationPoint(4.0F, 18.0F, 1.0F);
        this.lwing2.setTextureSize(64, 32);
        this.lwing2.mirror = true;
        setRotation(lwing2, 0.0F, 0.0F);
        this.rwing2 = new ModelRenderer(this, 10, 19);
        this.rwing2.addBox(-7.0F, 0.0F, 0.0F, 3, 1, 3);
        this.rwing2.setRotationPoint(-1.0F, 18.0F, 1.0F);
        this.rwing2.setTextureSize(64, 32);
        this.rwing2.mirror = true;
        setRotation(rwing2, 0.0F, 0.0F);
        this.tailfeather2 = new ModelRenderer(this, 44, 20);
        this.tailfeather2.addBox(-0.5F, 0.0F, 3.0F, 4, 1, 4);
        this.tailfeather2.setRotationPoint(0.0F, 18.0F, 6.0F);
        this.tailfeather2.setTextureSize(64, 32);
        this.tailfeather2.mirror = true;
        setRotation(tailfeather2, 0.0F, 0.0F);
        this.tailfeather3 = new ModelRenderer(this, 36, 26);
        this.tailfeather3.addBox(-1.0F, 0.0F, 7.0F, 5, 1, 4);
        this.tailfeather3.setRotationPoint(0.0F, 18.0F, 6.0F);
        this.tailfeather3.setTextureSize(64, 32);
        this.tailfeather3.mirror = true;
        setRotation(tailfeather3, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        newangle = MathHelper.cos(f2 * 1.5f * this.wingspeed) * 3.1415927f * 0.35f;
        this.lwing1.rotateAngleZ = -1.5f + newangle;
        this.lwing2.rotateAngleZ = newangle;
        this.rwing1.rotateAngleZ = 1.5f - newangle;
        this.rwing2.rotateAngleZ = -newangle;
        newangle = MathHelper.cos(f2 * 0.3f * this.wingspeed) * 3.1415927f * 0.1f;
        this.tailfeather1.rotateAngleX = newangle;
        this.tailfeather2.rotateAngleX = newangle;
        this.tailfeather3.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 1.1f * this.wingspeed) * 3.1415927f * 0.08f;
        this.feather1.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 1.2f * this.wingspeed) * 3.1415927f * 0.08f;
        this.feather2.rotateAngleZ = newangle;
        newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.08f;
        this.feather3.rotateAngleZ = newangle;
        this.Body.render(f5);
        this.Head.render(f5);
        this.Beak.render(f5);
        this.LowerBeak.render(f5);
        this.feather2.render(f5);
        this.feather1.render(f5);
        this.feather3.render(f5);
        this.tailfeather1.render(f5);
        this.rwing1.render(f5);
        this.lwing1.render(f5);
        this.leg.render(f5);
        this.otherleg.render(f5);
        this.lwing2.render(f5);
        this.rwing2.render(f5);
        this.tailfeather2.render(f5);
        this.tailfeather3.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
