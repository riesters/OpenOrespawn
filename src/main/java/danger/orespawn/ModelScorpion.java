package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelScorpion extends ModelBase
{
    private final float wingspeed;
    ModelRenderer body;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tail5;
    ModelRenderer tail6;
    ModelRenderer lleg1;
    ModelRenderer rleg1;
    ModelRenderer rleg2;
    ModelRenderer lleg3;
    ModelRenderer rleg4;
    ModelRenderer rleg3;
    ModelRenderer lleg4;
    ModelRenderer lleg2;
    ModelRenderer head;
    ModelRenderer larm2;
    ModelRenderer rarm2;
    ModelRenderer larm1;
    ModelRenderer rarm1;
    ModelRenderer lclaw;
    ModelRenderer rclaw;
    
    public ModelScorpion(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 88;
        this.textureHeight = 24;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(0.0F, 0.0F, 0.0F, 6, 4, 8);
        this.body.setRotationPoint(-3.0F, 17.0F, -4.0F);
        this.body.setTextureSize(88, 24);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 28, 0);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5);
        this.tail1.setRotationPoint(-2.0F, 17.0F, 3.0F);
        this.tail1.setTextureSize(88, 24);
        this.tail1.mirror = true;
        setRotation(tail1, 0.2617994F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 46, 0);
        this.tail2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5);
        this.tail2.setRotationPoint(-1.5F, 16.8F, 6.0F);
        this.tail2.setTextureSize(88, 24);
        this.tail2.mirror = true;
        setRotation(tail2, 1.029744F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 62, 0);
        this.tail3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4);
        this.tail3.setRotationPoint(-1.5F, 14.5F, 8.0F);
        this.tail3.setTextureSize(88, 24);
        this.tail3.mirror = true;
        setRotation(tail3, 1.727876F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 0, 17);
        this.tail4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.tail4.setRotationPoint(-1.0F, 12.0F, 9.0F);
        this.tail4.setTextureSize(88, 24);
        this.tail4.mirror = true;
        setRotation(tail4, 2.513274F, 0.0F, 0.0F);
        this.tail5 = new ModelRenderer(this, 70, 7);
        this.tail5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4);
        this.tail5.setRotationPoint(-1.0F, 9.0F, 6.0F);
        this.tail5.setTextureSize(88, 24);
        this.tail5.mirror = true;
        setRotation(tail5, 3.141593F, 0.0F, 0.0F);
        this.tail6 = new ModelRenderer(this, 62, 7);
        this.tail6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.tail6.setRotationPoint(-0.5F, 8.0F, 2.0F);
        this.tail6.setTextureSize(88, 24);
        this.tail6.mirror = true;
        setRotation(tail6, 3.141593F, 0.0F, 0.0F);
        this.lleg1 = new ModelRenderer(this, 0, 12);
        this.lleg1.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.lleg1.setRotationPoint(2.0F, 18.0F, -3.0F);
        this.lleg1.setTextureSize(88, 24);
        this.lleg1.mirror = true;
        setRotation(lleg1, 0.0F, 0.4886922F, 0.3665191F);
        this.rleg1 = new ModelRenderer(this, 0, 12);
        this.rleg1.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.rleg1.setRotationPoint(-2.0F, 18.0F, -1.0F);
        this.rleg1.setTextureSize(88, 24);
        this.rleg1.mirror = true;
        setRotation(rleg1, 0.0F, 2.6529F, -0.3665191F);
        this.rleg2 = new ModelRenderer(this, 0, 12);
        this.rleg2.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.rleg2.setRotationPoint(-2.0F, 18.0F, 1.0F);
        this.rleg2.setTextureSize(88, 24);
        this.rleg2.mirror = true;
        setRotation(rleg2, 0.0F, 2.897247F, -0.3665191F);
        this.lleg3 = new ModelRenderer(this, 0, 12);
        this.lleg3.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.lleg3.setRotationPoint(2.0F, 18.0F, 1.0F);
        this.lleg3.setTextureSize(88, 24);
        this.lleg3.mirror = true;
        setRotation(lleg3, 0.0F, -0.2443461F, 0.3665191F);
        this.rleg4 = new ModelRenderer(this, 0, 12);
        this.rleg4.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.rleg4.setRotationPoint(-2.0F, 18.0F, 5.0F);
        this.rleg4.setTextureSize(88, 24);
        this.rleg4.mirror = true;
        setRotation(rleg4, 0.0F, -2.6529F, -0.3665191F);
        this.rleg3 = new ModelRenderer(this, 0, 12);
        this.rleg3.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.rleg3.setRotationPoint(-2.0F, 18.0F, 3.0F);
        this.rleg3.setTextureSize(88, 24);
        this.rleg3.mirror = true;
        setRotation(rleg3, 0.0F, -2.897247F, -0.3665191F);
        this.lleg4 = new ModelRenderer(this, 0, 12);
        this.lleg4.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.lleg4.setRotationPoint(2.0F, 18.0F, 3.0F);
        this.lleg4.setTextureSize(88, 24);
        this.lleg4.mirror = true;
        setRotation(lleg4, 0.0F, -0.4886922F, 0.3665191F);
        this.lleg2 = new ModelRenderer(this, 0, 12);
        this.lleg2.addBox(0.0F, 0.0F, 0.0F, 11, 2, 2);
        this.lleg2.setRotationPoint(2.0F, 18.0F, -1.0F);
        this.lleg2.setTextureSize(88, 24);
        this.lleg2.mirror = true;
        setRotation(lleg2, 0.0F, 0.2443461F, 0.3665191F);
        this.head = new ModelRenderer(this, 28, 9);
        this.head.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4);
        this.head.setRotationPoint(-2.5F, 17.5F, -8.0F);
        this.head.setTextureSize(88, 24);
        this.head.mirror = true;
        setRotation(head, 0.0F, 0.0F, 0.0F);
        this.larm2 = new ModelRenderer(this, 46, 8);
        this.larm2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.larm2.setRotationPoint(1.0F, 18.0F, -6.0F);
        this.larm2.setTextureSize(88, 24);
        this.larm2.mirror = true;
        setRotation(larm2, 0.0F, 0.5235988F, 0.1745329F);
        this.rarm2 = new ModelRenderer(this, 46, 8);
        this.rarm2.addBox(0.0F, 0.0F, -2.0F, 6, 2, 2);
        this.rarm2.setRotationPoint(-1.0F, 18.0F, -6.0F);
        this.rarm2.setTextureSize(88, 24);
        this.rarm2.mirror = true;
        setRotation(rarm2, 0.0F, 2.617994F, -0.1745329F);
        this.larm1 = new ModelRenderer(this, 70, 13);
        this.larm1.addBox(-2.0F, 0.0F, -3.0F, 2, 2, 3);
        this.larm1.setRotationPoint(7.0F, 19.0F, -7.2F);
        this.larm1.setTextureSize(88, 24);
        this.larm1.mirror = true;
        setRotation(larm1, 0.1745329F, 0.1745329F, 0.0F);
        this.rarm1 = new ModelRenderer(this, 70, 13);
        this.rarm1.addBox(0.0F, 0.0F, -3.0F, 2, 2, 3);
        this.rarm1.setRotationPoint(-7.0F, 19.0F, -7.2F);
        this.rarm1.setTextureSize(88, 24);
        this.rarm1.mirror = true;
        setRotation(rarm1, 0.1745329F, -0.1745329F, 0.0F);
        this.lclaw = new ModelRenderer(this, 46, 12);
        this.lclaw.addBox(-3.0F, 0.0F, -4.0F, 3, 2, 4);
        this.lclaw.setRotationPoint(7.0F, 19.0F, -10.0F);
        this.lclaw.setTextureSize(88, 24);
        this.lclaw.mirror = true;
        setRotation(lclaw, 0.0174533F, 0.3839724F, 0.1396263F);
        this.rclaw = new ModelRenderer(this, 46, 12);
        this.rclaw.addBox(0.0F, 0.0F, -4.0F, 3, 2, 4);
        this.rclaw.setRotationPoint(-7.0F, 19.0F, -10.0F);
        this.rclaw.setTextureSize(88, 24);
        this.rclaw.mirror = true;
        setRotation(rclaw, 0.0174533F, -0.3839724F, 0.1396263F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Scorpion e = (Scorpion)entity;
        RenderInfo r;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle;
        float nextangle;
        final float pi4 = 1.570795f;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed) * 3.1415927f * 0.12f * f1;
        this.lleg1.rotateAngleY = newangle + 0.49f;
        this.rleg1.rotateAngleY = -newangle + 2.65f;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed - pi4) * 3.1415927f * 0.12f * f1;
        this.lleg2.rotateAngleY = newangle + 0.24f;
        this.rleg2.rotateAngleY = -newangle + 2.9f;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed - 2.0f * pi4) * 3.1415927f * 0.12f * f1;
        this.lleg3.rotateAngleY = newangle - 0.24f;
        this.rleg3.rotateAngleY = -newangle - 2.9f;
        newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed - 3.0f * pi4) * 3.1415927f * 0.12f * f1;
        this.lleg4.rotateAngleY = newangle - 0.49f;
        this.rleg4.rotateAngleY = -newangle - 2.65f;
        r = e.getRenderInfo();
        newangle = MathHelper.cos(f2 * 3.0f * this.wingspeed) * 3.1415927f * 0.15f;
        nextangle = MathHelper.cos((f2 + 0.1f) * 3.0f * this.wingspeed) * 3.1415927f * 0.15f;
        if (nextangle > 0.0f && newangle < 0.0f) {
            r.ri1 = 0;
            if (e.getAttacking() == 0) {
                r.ri1 = e.worldObj.rand.nextInt(20);
                r.ri2 = e.worldObj.rand.nextInt(25);
            }
            else {
                r.ri1 = e.worldObj.rand.nextInt(4);
                r.ri2 = e.worldObj.rand.nextInt(3);
            }
        }
        if (r.ri1 == 1 || r.ri1 == 3) {
            this.doLeftClaw(newangle);
        }
        else {
            this.doLeftClaw(0.0f);
        }
        if (r.ri1 == 2 || r.ri1 == 3) {
            this.doRightClaw(newangle);
        }
        else {
            this.doRightClaw(0.0f);
        }
        if (r.ri2 == 1) {
            this.doTail(newangle);
        }
        else {
            this.doTail(0.0f);
        }
        e.setRenderInfo(r);
        this.body.render(f5);
        this.tail1.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.tail5.render(f5);
        this.tail6.render(f5);
        this.lleg1.render(f5);
        this.rleg1.render(f5);
        this.rleg2.render(f5);
        this.lleg3.render(f5);
        this.rleg4.render(f5);
        this.rleg3.render(f5);
        this.lleg4.render(f5);
        this.lleg2.render(f5);
        this.head.render(f5);
        this.larm2.render(f5);
        this.rarm2.render(f5);
        this.larm1.render(f5);
        this.rarm1.render(f5);
        this.lclaw.render(f5);
        this.rclaw.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
    
    private void doLeftClaw(final float angle) {
        this.larm2.rotateAngleY = 0.52f + angle;
        this.larm1.rotationPointZ = (float)(this.larm2.rotationPointZ - Math.sin(this.larm2.rotateAngleY) * 4.5);
        this.lclaw.rotationPointZ = this.larm1.rotationPointZ - 3.0f;
        this.lclaw.rotateAngleY = 0.381f - angle;
    }
    
    private void doRightClaw(final float angle) {
        this.rarm2.rotateAngleY = 2.61f - angle;
        this.rarm1.rotationPointZ = (float)(this.rarm2.rotationPointZ - Math.sin(this.rarm2.rotateAngleY) * 4.5);
        this.rclaw.rotationPointZ = this.rarm1.rotationPointZ - 3.0f;
        this.rclaw.rotateAngleY = -0.381f + angle;
    }
    
    private void doTail(final float angle) {
        this.tail1.rotateAngleX = 0.26f + angle;
        this.tail2.rotateAngleX = this.tail1.rotateAngleX + 0.76900005f + angle;
        this.tail2.rotationPointY = (float)(this.tail1.rotationPointY - Math.sin(this.tail1.rotateAngleX) * 4.0);
        this.tail2.rotationPointZ = (float)(this.tail1.rotationPointZ + Math.cos(this.tail1.rotateAngleX) * 4.0);
        this.tail3.rotateAngleX = this.tail2.rotateAngleX + 0.701f + angle;
        this.tail3.rotationPointY = (float)(this.tail2.rotationPointY - Math.sin(this.tail2.rotateAngleX) * 4.0);
        this.tail3.rotationPointZ = (float)(this.tail2.rotationPointZ + Math.cos(this.tail2.rotateAngleX) * 4.0);
        this.tail4.rotateAngleX = this.tail3.rotateAngleX - 5.501f - angle * 3.0f / 2.0f - 0.4f;
        this.tail4.rotationPointY = (float)(this.tail3.rotationPointY - Math.sin(this.tail3.rotateAngleX) * 3.0);
        this.tail4.rotationPointZ = (float)(this.tail3.rotationPointZ + Math.cos(this.tail3.rotateAngleX) * 3.0);
        this.tail5.rotationPointY = (float)(this.tail4.rotationPointY - Math.sin(this.tail4.rotateAngleX) * 4.0);
        this.tail5.rotationPointZ = (float)(this.tail4.rotationPointZ + Math.cos(this.tail4.rotateAngleX) * 4.0);
        this.tail6.rotationPointY = (float)(this.tail5.rotationPointY - Math.sin(this.tail5.rotateAngleX) * 4.0);
        this.tail6.rotationPointZ = (float)(this.tail5.rotationPointZ + Math.cos(this.tail5.rotateAngleX) * 4.0);
    }
}
