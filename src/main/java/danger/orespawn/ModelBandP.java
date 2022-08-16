package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelBandP extends ModelBase
{
    private final float wingspeed;
    ModelRenderer belly;
    ModelRenderer chest;
    ModelRenderer head;
    ModelRenderer lleg;
    ModelRenderer rleg;
    ModelRenderer larm;
    ModelRenderer rarm;
    
    public ModelBandP(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.belly = new ModelRenderer(this, 0, 61);
        this.belly.addBox(-8.0F, -5.0F, -7.0F, 16, 10, 16);
        this.belly.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.belly.setTextureSize(64, 32);
        this.belly.mirror = true;
        setRotation(belly, 0.0698132F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 42);
        this.chest.addBox(-5.0F, -3.0F, -5.0F, 10, 6, 10);
        this.chest.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.chest.setTextureSize(64, 32);
        this.chest.mirror = true;
        setRotation(chest, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 11);
        this.head.addBox(-3.0F, -5.0F, -3.0F, 6, 6, 6);
        this.head.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        setRotation(head, 0.0F, 0.0F);
        this.lleg = new ModelRenderer(this, 25, 90);
        this.lleg.addBox(-2.0F, 0.0F, -3.0F, 6, 8, 6);
        this.lleg.setRotationPoint(2.0F, 16.0F, 2.0F);
        this.lleg.setTextureSize(64, 32);
        this.lleg.mirror = true;
        setRotation(lleg, 0.0F, 0.0F);
        this.rleg = new ModelRenderer(this, 0, 90);
        this.rleg.addBox(-4.0F, 0.0F, -3.0F, 6, 8, 6);
        this.rleg.setRotationPoint(-2.0F, 16.0F, 2.0F);
        this.rleg.setTextureSize(64, 32);
        this.rleg.mirror = true;
        setRotation(rleg, 0.0F, 0.0F);
        this.larm = new ModelRenderer(this, 0, 25);
        this.larm.addBox(-1.0F, -1.0F, -2.0F, 4, 10, 4);
        this.larm.setRotationPoint(6.0F, 4.0F, 3.0F);
        this.larm.setTextureSize(64, 32);
        this.larm.mirror = true;
        setRotation(larm, 0.0F, -0.4886922F);
        this.rarm = new ModelRenderer(this, 18, 25);
        this.rarm.addBox(-3.0F, -1.0F, -2.0F, 4, 10, 4);
        this.rarm.setRotationPoint(-6.0F, 4.0F, 3.0F);
        this.rarm.setTextureSize(64, 32);
        this.rarm.mirror = true;
        setRotation(rarm, 0.0F, 0.4886922F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        float newangle2;
        float newangle3;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f * f1;
            newangle2 = MathHelper.cos(f2 * 2.6f * this.wingspeed) * 3.1415927f * 0.025f * f1;
            newangle3 = newangle;
        }
        else {
            newangle = 0.0f;
            newangle2 = MathHelper.cos(f2 * 0.6f * this.wingspeed) * 3.1415927f * 0.005f;
            newangle3 = MathHelper.cos(f2 * 0.3f * this.wingspeed) * 3.1415927f * 0.02f;
        }
        this.lleg.rotateAngleX = newangle;
        this.rleg.rotateAngleX = -newangle;
        this.belly.rotateAngleX = 0.07f + newangle2;
        this.larm.rotateAngleX = -newangle3;
        this.rarm.rotateAngleX = newangle3;
        this.belly.rotateAngleY = -newangle / 2.0f;
        this.head.rotateAngleY = (float)Math.toRadians(f3);
        this.head.rotateAngleX = (float)Math.toRadians(f4);
        this.belly.render(f5);
        this.chest.render(f5);
        this.head.render(f5);
        this.lleg.render(f5);
        this.rleg.render(f5);
        this.larm.render(f5);
        this.rarm.render(f5);
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
