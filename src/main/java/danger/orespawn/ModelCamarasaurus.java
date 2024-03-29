package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCamarasaurus extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer Tail0;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Neck3;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer BLegupleft;
    ModelRenderer FLegupleft;
    ModelRenderer BLegupright;
    ModelRenderer FLegupright;
    ModelRenderer BLegdownright;
    ModelRenderer FLegdownleft;
    ModelRenderer FLegdownright;
    ModelRenderer BLegdownleft;
    
    public ModelCamarasaurus(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Body1 = new ModelRenderer(this, 0, 135);
        this.Body1.addBox(-6.0F, 0.0F, 0.0F, 12, 12, 12);
        this.Body1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Body1.setTextureSize(256, 256);
        this.Body1.mirror = true;
        setRotation(Body1, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 160);
        this.Body2.addBox(-5.0F, 0.0F, 0.0F, 10, 10, 6);
        this.Body2.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Body2.setTextureSize(256, 256);
        this.Body2.mirror = true;
        setRotation(Body2, -0.1858931F);
        this.Body3 = new ModelRenderer(this, 0, 177);
        this.Body3.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 4);
        this.Body3.setRotationPoint(0.0F, -3.0F, -6.0F);
        this.Body3.setTextureSize(256, 256);
        this.Body3.mirror = true;
        setRotation(Body3, -0.3346075F);
        this.Body4 = new ModelRenderer(this, 0, 120);
        this.Body4.addBox(-5.0F, 0.0F, 0.0F, 10, 10, 4);
        this.Body4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body4.setTextureSize(256, 256);
        this.Body4.mirror = true;
        setRotation(Body4, 0.0F);
        this.Tail0 = new ModelRenderer(this, 0, 107);
        this.Tail0.addBox(-3.0F, -2.0F, 0.0F, 6, 6, 6);
        this.Tail0.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.Tail0.setTextureSize(256, 256);
        this.Tail0.mirror = true;
        setRotation(Tail0, -0.0743572F);
        this.Neck1 = new ModelRenderer(this, 0, 190);
        this.Neck1.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 5);
        this.Neck1.setRotationPoint(0.0F, -4.0F, -9.0F);
        this.Neck1.setTextureSize(256, 256);
        this.Neck1.mirror = true;
        setRotation(Neck1, -0.4089647F);
        this.Neck2 = new ModelRenderer(this, 0, 202);
        this.Neck2.addBox(-2.0F, 0.0F, -6.0F, 4, 4, 7);
        this.Neck2.setRotationPoint(0.0F, -3.0F, -9.0F);
        this.Neck2.setTextureSize(256, 256);
        this.Neck2.mirror = true;
        setRotation(Neck2, -0.5948578F);
        this.Neck3 = new ModelRenderer(this, 0, 214);
        this.Neck3.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 13);
        this.Neck3.setRotationPoint(0.0F, -5.0F, -15.0F);
        this.Neck3.setTextureSize(256, 256);
        this.Neck3.mirror = true;
        setRotation(Neck3, -0.8179294F);
        this.Head1 = new ModelRenderer(this, 0, 232);
        this.Head1.addBox(-4.0F, -3.0F, -6.0F, 8, 6, 6);
        this.Head1.setRotationPoint(0.0F, -13.0F, -22.0F);
        this.Head1.setTextureSize(256, 256);
        this.Head1.mirror = true;
        setRotation(Head1, -0.1115358F);
        this.Head2 = new ModelRenderer(this, 0, 245);
        this.Head2.addBox(-3.0F, -2.0F, -4.0F, 6, 4, 4);
        this.Head2.setRotationPoint(0.0F, -13.0F, -27.0F);
        this.Head2.setTextureSize(256, 256);
        this.Head2.mirror = true;
        setRotation(Head2, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 93);
        this.Tail1.addBox(-2.0F, -3.0F, 0.0F, 4, 4, 9);
        this.Tail1.setRotationPoint(0.0F, 5.0F, 19.0F);
        this.Tail1.setTextureSize(256, 256);
        this.Tail1.mirror = true;
        setRotation(Tail1, -0.1115358F);
        this.Tail2 = new ModelRenderer(this, 0, 82);
        this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8);
        this.Tail2.setRotationPoint(0.0F, 4.0F, 26.0F);
        this.Tail2.setTextureSize(256, 256);
        this.Tail2.mirror = true;
        setRotation(Tail2, -0.0743572F);
        this.Tail3 = new ModelRenderer(this, 0, 73);
        this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7);
        this.Tail3.setRotationPoint(0.0F, 4.5F, 34.0F);
        this.Tail3.setTextureSize(256, 256);
        this.Tail3.mirror = true;
        setRotation(Tail3, -0.0371786F);
        this.BLegupleft = new ModelRenderer(this, 49, 157);
        this.BLegupleft.addBox(0.0F, 0.0F, 0.0F, 6, 8, 6);
        this.BLegupleft.setRotationPoint(2.0F, 9.0F, 7.0F);
        this.BLegupleft.setTextureSize(256, 256);
        this.BLegupleft.mirror = true;
        setRotation(BLegupleft, -0.1487195F);
        this.FLegupleft = new ModelRenderer(this, 49, 141);
        this.FLegupleft.addBox(0.0F, 0.0F, -6.0F, 6, 9, 6);
        this.FLegupleft.setRotationPoint(2.0F, 8.0F, 2.0F);
        this.FLegupleft.setTextureSize(256, 256);
        this.FLegupleft.mirror = true;
        setRotation(FLegupleft, 0.0F);
        this.BLegupright = new ModelRenderer(this, 49, 126);
        this.BLegupright.addBox(-6.0F, 0.0F, 0.0F, 6, 8, 6);
        this.BLegupright.setRotationPoint(-2.0F, 9.0F, 7.0F);
        this.BLegupright.setTextureSize(256, 256);
        this.BLegupright.mirror = true;
        setRotation(BLegupright, -0.1487144F);
        this.FLegupright = new ModelRenderer(this, 49, 110);
        this.FLegupright.addBox(-6.0F, 0.0F, -6.0F, 6, 9, 6);
        this.FLegupright.setRotationPoint(-2.0F, 8.0F, 2.0F);
        this.FLegupright.setTextureSize(256, 256);
        this.FLegupright.mirror = true;
        setRotation(FLegupright, 0.0F);
        this.BLegdownright = new ModelRenderer(this, 115, 157);
        this.BLegdownright.addBox(-5.0F, 7.0F, -1.0F, 5, 8, 5);
        this.BLegdownright.setRotationPoint(-2.0F, 9.0F, 7.0F);
        this.BLegdownright.setTextureSize(256, 256);
        this.BLegdownright.mirror = true;
        setRotation(BLegdownright, 0.0F);
        this.FLegdownleft = new ModelRenderer(this, 94, 143);
        this.FLegdownleft.addBox(0.0F, 8.0F, -6.0F, 5, 8, 5);
        this.FLegdownleft.setRotationPoint(2.0F, 8.0F, 2.0F);
        this.FLegdownleft.setTextureSize(256, 256);
        this.FLegdownleft.mirror = true;
        setRotation(FLegdownleft, 0.0F);
        this.FLegdownright = new ModelRenderer(this, 94, 157);
        this.FLegdownright.addBox(-5.0F, 8.0F, -6.0F, 5, 8, 5);
        this.FLegdownright.setRotationPoint(-2.0F, 8.0F, 2.0F);
        this.FLegdownright.setTextureSize(256, 256);
        this.FLegdownright.mirror = true;
        setRotation(FLegdownright, 0.0F);
        this.BLegdownleft = new ModelRenderer(this, 115, 143);
        this.BLegdownleft.addBox(0.0F, 7.0F, -1.0F, 5, 8, 5);
        this.BLegdownleft.setRotationPoint(2.0F, 9.0F, 7.0F);
        this.BLegdownleft.setTextureSize(256, 256);
        this.BLegdownleft.mirror = true;
        setRotation(BLegdownleft, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Camarasaurus c = (Camarasaurus)entity;
        float hf;
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.FLegupleft.rotateAngleX = newangle;
        this.FLegdownleft.rotateAngleX = newangle;
        this.FLegupright.rotateAngleX = -newangle;
        this.FLegdownright.rotateAngleX = -newangle;
        this.BLegupleft.rotateAngleX = -0.15f - newangle;
        this.BLegdownleft.rotateAngleX = -newangle;
        this.BLegupright.rotateAngleX = -0.15f + newangle;
        this.BLegdownright.rotateAngleX = newangle;
        hf = c.getCamarasaurusHealth() / c.getMaxHealth();
        newangle = MathHelper.cos(f2 * 1.5f * this.wingspeed * hf) * 3.1415927f * 0.25f * hf;
        if (c.isSitting()) {
            newangle = 0.0f;
        }
        this.Tail0.rotateAngleY = newangle * 0.25f;
        this.Tail1.rotationPointZ = this.Tail0.rotationPointZ + (float)Math.cos(this.Tail0.rotateAngleY) * 5.0f;
        this.Tail1.rotationPointX = this.Tail0.rotationPointX + (float)Math.sin(this.Tail0.rotateAngleY) * 5.0f;
        this.Tail1.rotateAngleY = newangle * 0.5f;
        this.Tail2.rotationPointZ = this.Tail1.rotationPointZ + (float)Math.cos(this.Tail1.rotateAngleY) * 8.0f;
        this.Tail2.rotationPointX = this.Tail1.rotationPointX + (float)Math.sin(this.Tail1.rotateAngleY) * 8.0f;
        this.Tail2.rotateAngleY = newangle * 0.75f;
        this.Tail3.rotationPointZ = this.Tail2.rotationPointZ + (float)Math.cos(this.Tail2.rotateAngleY) * 7.0f;
        this.Tail3.rotationPointX = this.Tail2.rotationPointX + (float)Math.sin(this.Tail2.rotateAngleY) * 7.0f;
        this.Tail3.rotateAngleY = newangle;
        this.Neck1.rotateAngleY = (float)Math.toRadians(f3) * 0.125f;
        this.Neck2.rotationPointZ = this.Neck1.rotationPointZ;
        this.Neck2.rotationPointX = this.Neck1.rotationPointX;
        this.Neck2.rotateAngleY = (float)Math.toRadians(f3) * 0.25f;
        this.Neck3.rotationPointZ = this.Neck2.rotationPointZ - (float)Math.cos(this.Neck2.rotateAngleY) * 6.0f;
        this.Neck3.rotationPointX = this.Neck2.rotationPointX - (float)Math.sin(this.Neck2.rotateAngleY) * 6.0f;
        this.Neck3.rotateAngleY = (float)Math.toRadians(f3) * 0.38f;
        this.Head1.rotationPointZ = this.Neck3.rotationPointZ - (float)Math.cos(this.Neck3.rotateAngleY) * 7.0f;
        this.Head1.rotationPointX = this.Neck3.rotationPointX - (float)Math.sin(this.Neck3.rotateAngleY) * 7.0f;
        this.Head1.rotateAngleY = (float)Math.toRadians(f3);
        this.Head2.rotationPointZ = this.Head1.rotationPointZ - (float)Math.cos(this.Head1.rotateAngleY) * 5.0f;
        this.Head2.rotationPointX = this.Head1.rotationPointX - (float)Math.sin(this.Head1.rotateAngleY) * 5.0f;
        this.Head2.rotateAngleY = (float)Math.toRadians(f3);
        this.Body1.render(f5);
        this.Body2.render(f5);
        this.Body3.render(f5);
        this.Body4.render(f5);
        this.Tail0.render(f5);
        this.Neck1.render(f5);
        this.Neck2.render(f5);
        this.Neck3.render(f5);
        this.Head1.render(f5);
        this.Head2.render(f5);
        this.Tail1.render(f5);
        this.Tail2.render(f5);
        this.Tail3.render(f5);
        this.FLegupleft.render(f5);
        this.FLegdownleft.render(f5);
        this.FLegupright.render(f5);
        this.FLegdownright.render(f5);
        this.BLegupleft.render(f5);
        this.BLegdownright.render(f5);
        this.BLegupright.render(f5);
        this.BLegdownleft.render(f5);
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
