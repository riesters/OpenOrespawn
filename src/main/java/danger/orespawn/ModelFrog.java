package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelFrog extends ModelBase
{
    private final float wingspeed;
    ModelRenderer body;
    ModelRenderer jaw;
    ModelRenderer lfleg;
    ModelRenderer rfleg;
    ModelRenderer lleg1;
    ModelRenderer rleg1;
    ModelRenderer lleg2;
    ModelRenderer rleg2;
    ModelRenderer leye;
    ModelRenderer reye;
    
    public ModelFrog(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 41, 0);
        this.body.addBox(-4.0F, -10.0F, 0.0F, 8, 11, 2);
        this.body.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.body.setTextureSize(64, 64);
        this.body.mirror = true;
        setRotation(body, 0.7330383F, 0.0F);
        this.jaw = new ModelRenderer(this, 42, 15);
        this.jaw.addBox(-4.0F, -8.0F, 0.0F, 8, 8, 1);
        this.jaw.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.jaw.setTextureSize(64, 64);
        this.jaw.mirror = true;
        setRotation(jaw, 1.22173F, 0.0F);
        this.lfleg = new ModelRenderer(this, 14, 0);
        this.lfleg.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.lfleg.setRotationPoint(3.0F, 20.0F, 0.0F);
        this.lfleg.setTextureSize(64, 64);
        this.lfleg.mirror = true;
        setRotation(lfleg, -0.5235988F, -0.4712389F);
        this.rfleg = new ModelRenderer(this, 20, 0);
        this.rfleg.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1);
        this.rfleg.setRotationPoint(-3.0F, 20.0F, 0.0F);
        this.rfleg.setTextureSize(64, 64);
        this.rfleg.mirror = true;
        setRotation(rfleg, -0.5235988F, 0.4712389F);
        this.lleg1 = new ModelRenderer(this, 10, 8);
        this.lleg1.addBox(0.0F, -9.0F, -1.0F, 1, 9, 2);
        this.lleg1.setRotationPoint(3.0F, 24.0F, 3.0F);
        this.lleg1.setTextureSize(64, 64);
        this.lleg1.mirror = true;
        setRotation(lleg1, 0.0F, 0.2268928F);
        this.rleg1 = new ModelRenderer(this, 18, 8);
        this.rleg1.addBox(-1.0F, -9.0F, -1.0F, 1, 9, 2);
        this.rleg1.setRotationPoint(-3.0F, 24.0F, 3.0F);
        this.rleg1.setTextureSize(64, 64);
        this.rleg1.mirror = true;
        setRotation(rleg1, 0.0F, -0.2268928F);
        this.lleg2 = new ModelRenderer(this, 11, 20);
        this.lleg2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
        this.lleg2.setRotationPoint(5.0F, 15.0F, 3.0F);
        this.lleg2.setTextureSize(64, 64);
        this.lleg2.mirror = true;
        setRotation(lleg2, 0.0F, -0.3839724F);
        this.rleg2 = new ModelRenderer(this, 19, 20);
        this.rleg2.addBox(-1.0F, 0.0F, 0.0F, 1, 10, 1);
        this.rleg2.setRotationPoint(-5.0F, 15.0F, 3.0F);
        this.rleg2.setTextureSize(64, 64);
        this.rleg2.mirror = true;
        setRotation(rleg2, 0.0F, 0.3839724F);
        this.leye = new ModelRenderer(this, 0, 8);
        this.leye.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.leye.setRotationPoint(2.0F, 17.0F, -2.0F);
        this.leye.setTextureSize(64, 64);
        this.leye.mirror = true;
        setRotation(leye, 0.7330383F, 0.0F);
        this.reye = new ModelRenderer(this, 0, 4);
        this.reye.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.reye.setRotationPoint(-3.0F, 17.0F, -2.0F);
        this.reye.setTextureSize(64, 64);
        this.reye.mirror = true;
        setRotation(reye, 0.7330383F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Frog c = (Frog)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * this.wingspeed * 1.4f) * 3.1415927f * 0.55f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.lfleg.rotateAngleY = newangle;
        this.rfleg.rotateAngleY = -newangle;
        this.lleg2.rotateAngleY = -newangle / 2.0f;
        this.rleg2.rotateAngleY = newangle / 2.0f;
        if (c.getSinging() != 0) {
            newangle = MathHelper.cos(f2 * 0.85f * this.wingspeed) * 3.1415927f * 0.15f;
        }
        else {
            newangle = 0.0f;
        }
        this.jaw.rotateAngleX = newangle + 1.22f;
        if (c.motionY > 0.10000000149011612 || c.motionY < -0.10000000149011612) {
            this.lleg1.rotateAngleZ = 2.44f;
            this.rleg1.rotateAngleZ = -2.44f;
        }
        else {
            this.lleg1.rotateAngleZ = 0.227f;
            this.rleg1.rotateAngleZ = -0.227f;
        }
        this.lleg2.rotationPointY = this.lleg1.rotationPointY - (float)Math.cos(this.lleg1.rotateAngleZ) * 9.0f;
        this.lleg2.rotationPointX = this.lleg1.rotationPointX + (float)Math.sin(this.lleg1.rotateAngleZ) * 9.0f;
        this.rleg2.rotationPointY = this.rleg1.rotationPointY - (float)Math.cos(this.rleg1.rotateAngleZ) * 9.0f;
        this.rleg2.rotationPointX = this.rleg1.rotationPointX + (float)Math.sin(this.rleg1.rotateAngleZ) * 9.0f;
        this.body.render(f5);
        this.jaw.render(f5);
        this.lfleg.render(f5);
        this.rfleg.render(f5);
        this.lleg1.render(f5);
        this.rleg1.render(f5);
        this.lleg2.render(f5);
        this.rleg2.render(f5);
        this.leye.render(f5);
        this.reye.render(f5);
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
