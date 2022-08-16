package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCricket extends ModelBase
{
    private final float wingspeed;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer abdomen;
    ModelRenderer lfleg;
    ModelRenderer lrleg;
    ModelRenderer rfleg;
    ModelRenderer rrleg;
    ModelRenderer lleg1;
    ModelRenderer rleg1;
    ModelRenderer lleg2;
    ModelRenderer rleg2;
    
    public ModelCricket(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 0, 25);
        this.body.addBox(-1.0F, -1.0F, -3.0F, 3, 3, 6);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.setTextureSize(64, 64);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 17);
        this.head.addBox(-1.0F, -2.0F, -1.0F, 3, 4, 3);
        this.head.setRotationPoint(0.0F, 21.0F, -5.0F);
        this.head.setTextureSize(64, 64);
        this.head.mirror = true;
        setRotation(head, -0.1745329F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 36);
        this.abdomen.addBox(-0.5F, -1.0F, 3.0F, 2, 2, 3);
        this.abdomen.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.abdomen.setTextureSize(64, 64);
        this.abdomen.mirror = true;
        setRotation(abdomen, 0.0F, 0.0F, 0.0F);
        this.lfleg = new ModelRenderer(this, 25, 0);
        this.lfleg.addBox(2.0F, 0.0F, 0.0F, 5, 1, 1);
        this.lfleg.setRotationPoint(0.0F, 21.0F, -2.0F);
        this.lfleg.setTextureSize(64, 64);
        this.lfleg.mirror = true;
        setRotation(lfleg, 0.0F, 0.4712389F, 0.418879F);
        this.lrleg = new ModelRenderer(this, 23, 4);
        this.lrleg.addBox(1.0F, 0.0F, -2.0F, 6, 1, 1);
        this.lrleg.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.lrleg.setTextureSize(64, 64);
        this.lrleg.mirror = true;
        setRotation(lrleg, 0.0F, -0.296706F, 0.418879F);
        this.rfleg = new ModelRenderer(this, 25, 8);
        this.rfleg.addBox(-7.0F, 0.0F, 0.0F, 5, 1, 1);
        this.rfleg.setRotationPoint(1.0F, 21.0F, -2.0F);
        this.rfleg.setTextureSize(64, 64);
        this.rfleg.mirror = true;
        setRotation(rfleg, 0.0F, -0.5410521F, -0.4363323F);
        this.rrleg = new ModelRenderer(this, 25, 12);
        this.rrleg.addBox(-7.0F, -1.0F, 0.0F, 5, 1, 1);
        this.rrleg.setRotationPoint(1.0F, 22.0F, -2.0F);
        this.rrleg.setTextureSize(64, 64);
        this.rrleg.mirror = true;
        setRotation(rrleg, 0.0F, 0.3839724F, -0.418879F);
        this.lleg1 = new ModelRenderer(this, 40, 0);
        this.lleg1.addBox(-1.0F, -1.0F, 0.0F, 1, 2, 8);
        this.lleg1.setRotationPoint(2.0F, 22.0F, 0.0F);
        this.lleg1.setTextureSize(64, 64);
        this.lleg1.mirror = true;
        setRotation(lleg1, 0.5585054F, 0.4363323F, 0.0F);
        this.rleg1 = new ModelRenderer(this, 40, 11);
        this.rleg1.addBox(0.0F, -1.0F, 0.0F, 1, 2, 8);
        this.rleg1.setRotationPoint(-1.0F, 22.0F, 0.0F);
        this.rleg1.setTextureSize(64, 64);
        this.rleg1.mirror = true;
        setRotation(rleg1, 0.5585054F, -0.4363323F, 0.0F);
        this.lleg2 = new ModelRenderer(this, 21, 23);
        this.lleg2.addBox(-0.5F, -6.5F, 4.5F, 1, 1, 8);
        this.lleg2.setRotationPoint(2.0F, 22.0F, 0.0F);
        this.lleg2.setTextureSize(64, 64);
        this.lleg2.mirror = true;
        setRotation(lleg2, -0.3665191F, 0.3490659F, 0.0F);
        this.rleg2 = new ModelRenderer(this, 21, 34);
        this.rleg2.addBox(-0.5F, -6.5F, 4.0F, 1, 1, 8);
        this.rleg2.setRotationPoint(-1.0F, 22.0F, 0.0F);
        this.rleg2.setTextureSize(64, 64);
        this.rleg2.mirror = true;
        setRotation(rleg2, -0.3665191F, -0.3490659F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Cricket c = (Cricket)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.lfleg.rotateAngleY = 0.47f + newangle;
        this.rfleg.rotateAngleY = -0.54f + newangle;
        this.lrleg.rotateAngleY = -0.296f - newangle;
        this.rrleg.rotateAngleY = 0.384f - newangle;
        if (c.getSinging() != 0) {
            newangle = MathHelper.cos(f2 * 3.0f * this.wingspeed) * 3.1415927f * 0.25f;
            this.lleg1.rotateAngleY = -0.035f;
            this.lleg2.rotateAngleY = -0.105f;
            this.rleg1.rotateAngleY = 0.035f;
            this.rleg2.rotateAngleY = 0.105f;
        }
        else {
            newangle = 0.0f;
            this.lleg1.rotateAngleY = 0.436f;
            this.lleg2.rotateAngleY = 0.349f;
            this.rleg1.rotateAngleY = -0.436f;
            this.rleg2.rotateAngleY = -0.349f;
        }
        this.lleg1.rotateAngleX = newangle + 0.558f;
        this.lleg2.rotateAngleX = newangle - 0.366f;
        this.rleg1.rotateAngleX = -newangle + 0.558f;
        this.rleg2.rotateAngleX = -newangle - 0.366f;
        this.body.render(f5);
        this.head.render(f5);
        this.abdomen.render(f5);
        this.lfleg.render(f5);
        this.lrleg.render(f5);
        this.rfleg.render(f5);
        this.rrleg.render(f5);
        this.lleg1.render(f5);
        this.rleg1.render(f5);
        this.lleg2.render(f5);
        this.rleg2.render(f5);
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
