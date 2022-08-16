package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;

public class ModelThePrincess extends ModelBase
{
    private final float wingspeed;
    ModelRenderer body;
    ModelRenderer neck1;
    ModelRenderer neck;
    ModelRenderer neckbase;
    ModelRenderer head;
    ModelRenderer Rleg1;
    ModelRenderer Lleg1;
    ModelRenderer snout;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer Lwing;
    ModelRenderer Rwing;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Lneck1;
    ModelRenderer Lneck;
    ModelRenderer Lhead;
    ModelRenderer Lsnout;
    ModelRenderer Rneck1;
    ModelRenderer Rneck;
    ModelRenderer Rhead;
    ModelRenderer Rsnout;
    ModelRenderer headfin;
    ModelRenderer Lheadfin;
    ModelRenderer Rheadfin;
    ModelRenderer Backfin;
    ModelRenderer Rwing2;
    ModelRenderer Rwing3;
    ModelRenderer Lwing2;
    ModelRenderer Lwing3;
    ModelRenderer Ljaw;
    ModelRenderer jaw;
    ModelRenderer Rjaw;
    ModelRenderer Lpower;
    ModelRenderer Cpower;
    ModelRenderer Rpower;
    
    public ModelThePrincess(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.body = new ModelRenderer(this, 59, 34);
        this.body.addBox(-7.0F, -3.0F, -3.0F, 13, 8, 8);
        this.body.setRotationPoint(0.5F, 15.0F, 1.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F);
        this.neck1 = new ModelRenderer(this, 20, 45);
        this.neck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
        this.neck1.setRotationPoint(0.0F, 15.0F, -5.0F);
        this.neck1.setTextureSize(64, 32);
        this.neck1.mirror = true;
        setRotation(neck1, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 20, 31);
        this.neck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
        this.neck.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.neck.setTextureSize(64, 32);
        this.neck.mirror = true;
        setRotation(neck, 0.0F, 0.0F);
        this.neckbase = new ModelRenderer(this, 0, 76);
        this.neckbase.addBox(-4.5F, -4.0F, 0.0F, 9, 6, 3);
        this.neckbase.setRotationPoint(0.0F, 17.0F, 5.0F);
        this.neckbase.setTextureSize(64, 32);
        this.neckbase.mirror = true;
        setRotation(neckbase, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 20, 20);
        this.head.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
        this.head.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        setRotation(head, 0.0F, 0.0F);
        this.Rleg1 = new ModelRenderer(this, 0, 58);
        this.Rleg1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4);
        this.Rleg1.setRotationPoint(6.0F, 16.0F, 1.0F);
        this.Rleg1.setTextureSize(64, 32);
        this.Rleg1.mirror = true;
        setRotation(Rleg1, 0.0F, 0.0F);
        this.Lleg1 = new ModelRenderer(this, 15, 58);
        this.Lleg1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4);
        this.Lleg1.setRotationPoint(-6.0F, 16.0F, 1.0F);
        this.Lleg1.setTextureSize(64, 32);
        this.Lleg1.mirror = true;
        setRotation(Lleg1, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 20, 11);
        this.snout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
        this.snout.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.snout.setTextureSize(64, 32);
        this.snout.mirror = true;
        setRotation(snout, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 0, 86);
        this.tail2.addBox(-3.0F, -2.5F, 0.0F, 6, 4, 7);
        this.tail2.setRotationPoint(0.0F, 16.0F, 7.0F);
        this.tail2.setTextureSize(64, 32);
        this.tail2.mirror = true;
        setRotation(tail2, -0.3839724F, 0.0F);
        this.tail3 = new ModelRenderer(this, 0, 98);
        this.tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 3, 6);
        this.tail3.setRotationPoint(0.0F, 18.2F, 13.0F);
        this.tail3.setTextureSize(64, 32);
        this.tail3.mirror = true;
        setRotation(tail3, -0.2094395F, 0.0F);
        this.tail4 = new ModelRenderer(this, 0, 108);
        this.tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 2, 5);
        this.tail4.setRotationPoint(0.0F, 19.5F, 18.0F);
        this.tail4.setTextureSize(64, 32);
        this.tail4.mirror = true;
        setRotation(tail4, -0.0698132F, 0.0F);
        this.Lwing = new ModelRenderer(this, 59, 0);
        this.Lwing.addBox(-22.0F, 0.0F, -3.0F, 22, 0, 10);
        this.Lwing.setRotationPoint(-6.0F, 12.6F, 0.0F);
        this.Lwing.setTextureSize(64, 32);
        this.Lwing.mirror = true;
        setRotation(Lwing, 0.0F, 0.4014257F);
        this.Rwing = new ModelRenderer(this, 59, 66);
        this.Rwing.addBox(0.0F, 0.0F, -3.0F, 22, 0, 10);
        this.Rwing.setRotationPoint(6.0F, 12.6F, 0.0F);
        this.Rwing.setTextureSize(64, 32);
        this.Rwing.mirror = true;
        setRotation(Rwing, 0.0F, -0.4014257F);
        this.Tail5 = new ModelRenderer(this, 0, 116);
        this.Tail5.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 4);
        this.Tail5.setRotationPoint(0.0F, 18.0F, 22.0F);
        this.Tail5.setTextureSize(64, 32);
        this.Tail5.mirror = true;
        setRotation(Tail5, 0.0F, 0.0F);
        this.Tail6 = new ModelRenderer(this, 0, 123);
        this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2);
        this.Tail6.setRotationPoint(0.0F, 18.0F, 26.0F);
        this.Tail6.setTextureSize(64, 32);
        this.Tail6.mirror = true;
        setRotation(Tail6, 0.0F, 0.0F);
        this.Lneck1 = new ModelRenderer(this, 0, 45);
        this.Lneck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
        this.Lneck1.setRotationPoint(4.5F, 15.0F, -5.0F);
        this.Lneck1.setTextureSize(64, 32);
        this.Lneck1.mirror = true;
        setRotation(Lneck1, 0.0F, 0.0F);
        this.Lneck = new ModelRenderer(this, 0, 30);
        this.Lneck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
        this.Lneck.setRotationPoint(4.5F, 14.0F, -6.0F);
        this.Lneck.setTextureSize(64, 32);
        this.Lneck.mirror = true;
        setRotation(Lneck, 0.0F, 0.0F);
        this.Lhead = new ModelRenderer(this, 0, 20);
        this.Lhead.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
        this.Lhead.setRotationPoint(4.5F, 7.0F, -6.0F);
        this.Lhead.setTextureSize(64, 32);
        this.Lhead.mirror = true;
        setRotation(Lhead, -0.0174533F, 0.0F);
        this.Lsnout = new ModelRenderer(this, 0, 11);
        this.Lsnout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
        this.Lsnout.setRotationPoint(4.5F, 7.0F, -6.0F);
        this.Lsnout.setTextureSize(64, 32);
        this.Lsnout.mirror = true;
        setRotation(Lsnout, 0.0F, 0.0F);
        this.Rneck1 = new ModelRenderer(this, 40, 45);
        this.Rneck1.addBox(-1.5F, -2.0F, -1.0F, 3, 1, 4);
        this.Rneck1.setRotationPoint(-4.5F, 15.0F, -5.0F);
        this.Rneck1.setTextureSize(64, 32);
        this.Rneck1.mirror = true;
        setRotation(Rneck1, 0.0F, 0.0F);
        this.Rneck = new ModelRenderer(this, 40, 31);
        this.Rneck.addBox(-1.5F, -8.0F, -1.0F, 3, 8, 3);
        this.Rneck.setRotationPoint(-4.5F, 14.0F, -6.0F);
        this.Rneck.setTextureSize(64, 32);
        this.Rneck.mirror = true;
        setRotation(Rneck, 0.0F, 0.0F);
        this.Rhead = new ModelRenderer(this, 40, 20);
        this.Rhead.addBox(-2.0F, -3.0F, -3.5F, 4, 4, 5);
        this.Rhead.setRotationPoint(-4.5F, 7.0F, -6.0F);
        this.Rhead.setTextureSize(64, 32);
        this.Rhead.mirror = true;
        setRotation(Rhead, 0.0F, 0.0F);
        this.Rsnout = new ModelRenderer(this, 40, 11);
        this.Rsnout.addBox(-1.5F, -2.0F, -8.5F, 3, 3, 5);
        this.Rsnout.setRotationPoint(-4.5F, 7.0F, -6.0F);
        this.Rsnout.setTextureSize(64, 32);
        this.Rsnout.mirror = true;
        setRotation(Rsnout, 0.0F, 0.0F);
        this.headfin = new ModelRenderer(this, 20, 0);
        this.headfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
        this.headfin.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.headfin.setTextureSize(64, 32);
        this.headfin.mirror = true;
        setRotation(headfin, -0.122173F, 0.0F);
        this.Lheadfin = new ModelRenderer(this, 0, 0);
        this.Lheadfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
        this.Lheadfin.setRotationPoint(4.5F, 7.0F, -6.0F);
        this.Lheadfin.setTextureSize(64, 32);
        this.Lheadfin.mirror = true;
        setRotation(Lheadfin, -0.122173F, 0.0F);
        this.Rheadfin = new ModelRenderer(this, 40, 0);
        this.Rheadfin.addBox(-0.5F, -3.0F, 1.0F, 1, 4, 3);
        this.Rheadfin.setRotationPoint(-4.5F, 7.0F, -6.0F);
        this.Rheadfin.setTextureSize(64, 32);
        this.Rheadfin.mirror = true;
        setRotation(Rheadfin, -0.122173F, 0.0F);
        this.Backfin = new ModelRenderer(this, 35, 57);
        this.Backfin.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 5);
        this.Backfin.setRotationPoint(0.0F, 12.0F, -1.0F);
        this.Backfin.setTextureSize(64, 32);
        this.Backfin.mirror = true;
        setRotation(Backfin, 0.5061455F, 0.0F);
        this.Rwing2 = new ModelRenderer(this, 59, 77);
        this.Rwing2.addBox(0.0F, 0.0F, -3.0F, 12, 0, 10);
        this.Rwing2.setRotationPoint(6.0F, 12.6F, 0.0F);
        this.Rwing2.setTextureSize(64, 32);
        this.Rwing2.mirror = true;
        setRotation(Rwing2, 0.0F, -0.6981317F);
        this.Rwing3 = new ModelRenderer(this, 59, 88);
        this.Rwing3.addBox(0.0F, 0.0F, -3.0F, 10, 0, 10);
        this.Rwing3.setRotationPoint(6.0F, 12.6F, 0.0F);
        this.Rwing3.setTextureSize(64, 32);
        this.Rwing3.mirror = true;
        setRotation(Rwing3, 0.0F, -0.0698132F);
        this.Lwing2 = new ModelRenderer(this, 59, 11);
        this.Lwing2.addBox(-12.0F, 0.0F, -3.0F, 12, 0, 10);
        this.Lwing2.setRotationPoint(-6.0F, 12.6F, 0.0F);
        this.Lwing2.setTextureSize(64, 32);
        this.Lwing2.mirror = true;
        setRotation(Lwing2, 0.0F, 0.6981317F);
        this.Lwing3 = new ModelRenderer(this, 59, 22);
        this.Lwing3.addBox(-10.0F, 0.0F, -3.0F, 10, 0, 10);
        this.Lwing3.setRotationPoint(-6.0F, 12.6F, 0.0F);
        this.Lwing3.setTextureSize(64, 32);
        this.Lwing3.mirror = true;
        setRotation(Lwing3, 0.0F, 0.0698132F);
        this.Ljaw = new ModelRenderer(this, 30, 70);
        this.Ljaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
        this.Ljaw.setRotationPoint(4.5F, 7.0F, -7.0F);
        this.Ljaw.setTextureSize(64, 32);
        this.Ljaw.mirror = true;
        setRotation(Ljaw, 0.2443461F, 0.0F);
        this.jaw = new ModelRenderer(this, 30, 80);
        this.jaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
        this.jaw.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.jaw.setTextureSize(64, 32);
        this.jaw.mirror = true;
        setRotation(jaw, 0.2443461F, 0.0F);
        this.Rjaw = new ModelRenderer(this, 30, 90);
        this.Rjaw.addBox(-1.5F, 1.0F, -5.0F, 3, 1, 5);
        this.Rjaw.setRotationPoint(-4.5F, 7.0F, -7.0F);
        this.Rjaw.setTextureSize(64, 32);
        this.Rjaw.mirror = true;
        setRotation(Rjaw, 0.2443461F, 0.0F);
        this.Lpower = new ModelRenderer(this, 30, 100);
        this.Lpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
        this.Lpower.setRotationPoint(4.5F, 17.0F, -5.0F);
        this.Lpower.setTextureSize(128, 128);
        this.Lpower.mirror = true;
        setRotation(Lpower, 0.0F, 0.0F);
        this.Cpower = new ModelRenderer(this, 50, 100);
        this.Cpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
        this.Cpower.setRotationPoint(0.0F, 17.0F, -5.0F);
        this.Cpower.setTextureSize(128, 128);
        this.Cpower.mirror = true;
        setRotation(Cpower, 0.0F, 0.0F);
        this.Rpower = new ModelRenderer(this, 70, 100);
        this.Rpower.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
        this.Rpower.setRotationPoint(-4.5F, 17.0F, -5.0F);
        this.Rpower.setTextureSize(128, 128);
        this.Rpower.mirror = true;
        setRotation(Rpower, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final ThePrincess c = (ThePrincess)entity;
        float newangle;
        final int current_activity = c.getActivity();
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (f1 > 0.1 || c.getAttacking() != 0) {
            newangle = MathHelper.cos(f2 * 2.3f * this.wingspeed) * 3.1415927f * 0.4f * f1;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.3f * this.wingspeed) * 3.1415927f * 0.04f;
        }
        this.Rwing.rotateAngleZ = newangle - 0.4f;
        this.Rwing2.rotateAngleZ = newangle - 0.6f;
        this.Rwing3.rotateAngleZ = newangle - 0.2f;
        this.Lwing.rotateAngleZ = -newangle + 0.4f;
        this.Lwing2.rotateAngleZ = -newangle + 0.6f;
        this.Lwing3.rotateAngleZ = -newangle + 0.2f;
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 2.0f * this.wingspeed) * 3.1415927f * 0.25f * f1;
        }
        else {
            newangle = 0.0f;
        }
        if (current_activity != 2 || c.getAttacking() != 0) {
            this.Rleg1.rotateAngleX = newangle;
            this.Lleg1.rotateAngleX = -newangle;
        }
        else {
            newangle = -1.0f;
            this.Rleg1.rotateAngleX = newangle;
            this.Lleg1.rotateAngleX = newangle;
        }
        newangle = MathHelper.cos(f2 * 0.9f * this.wingspeed) * 3.1415927f * 0.06f;
        if (c.isSitting()) {
            newangle = 0.0f;
        }
        if (c.getAttacking() != 0) {
            newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.12f;
        }
        this.tail2.rotateAngleY = newangle;
        this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleY) * 6.0f;
        this.tail3.rotationPointX = this.tail2.rotationPointX + (float)Math.sin(this.tail2.rotateAngleY) * 6.0f;
        this.tail3.rotateAngleY = newangle * 1.6f;
        this.tail4.rotationPointZ = this.tail3.rotationPointZ + (float)Math.cos(this.tail3.rotateAngleY) * 5.0f;
        this.tail4.rotationPointX = this.tail3.rotationPointX + (float)Math.sin(this.tail3.rotateAngleY) * 5.0f;
        this.tail4.rotateAngleY = newangle * 2.6f;
        this.Tail5.rotationPointZ = this.tail4.rotationPointZ + (float)Math.cos(this.tail4.rotateAngleY) * 4.0f;
        this.Tail5.rotationPointX = this.tail4.rotationPointX + (float)Math.sin(this.tail4.rotateAngleY) * 4.0f;
        this.Tail5.rotateAngleY = newangle * 3.6f;
        this.Tail6.rotationPointZ = this.Tail5.rotationPointZ + (float)Math.cos(this.Tail5.rotateAngleY) * 4.0f;
        this.Tail6.rotationPointX = this.Tail5.rotationPointX + (float)Math.sin(this.Tail5.rotateAngleY) * 4.0f;
        this.Tail6.rotateAngleY = newangle * 4.6f;
        float h4;
        float h3;
        float h2 = h3 = (h4 = f3 * 2.0f / 3.0f);
        float d4;
        float d3;
        float d2 = d3 = (d4 = f4 * 2.0f / 3.0f);
        if (h3 < 0.0f) {
            h4 = (h2 = h3 / 2.0f);
            d4 = (d2 = d3 / 2.0f);
        }
        else {
            h3 = (h2 = h4 / 2.0f);
            d3 = (d2 = d4 / 2.0f);
        }
        this.head.rotateAngleY = (float)Math.toRadians(h2);
        this.snout.rotateAngleY = (float)Math.toRadians(h2);
        this.headfin.rotateAngleY = (float)Math.toRadians(h2);
        this.jaw.rotateAngleY = (float)Math.toRadians(h2);
        this.jaw.rotationPointZ = this.snout.rotationPointZ - (float)Math.cos(this.snout.rotateAngleY);
        this.jaw.rotationPointX = this.snout.rotationPointX - (float)Math.sin(this.snout.rotateAngleY);
        this.neck.rotateAngleY = (float)Math.toRadians(h2) / 2.0f;
        this.Lhead.rotateAngleY = (float)Math.toRadians(h3);
        this.Lsnout.rotateAngleY = (float)Math.toRadians(h3);
        this.Lheadfin.rotateAngleY = (float)Math.toRadians(h3);
        this.Ljaw.rotateAngleY = (float)Math.toRadians(h3);
        this.Ljaw.rotationPointZ = this.Lsnout.rotationPointZ - (float)Math.cos(this.Lsnout.rotateAngleY);
        this.Ljaw.rotationPointX = this.Lsnout.rotationPointX - (float)Math.sin(this.Lsnout.rotateAngleY);
        this.Lneck.rotateAngleY = (float)Math.toRadians(h3) / 2.0f;
        this.Rhead.rotateAngleY = (float)Math.toRadians(h4);
        this.Rsnout.rotateAngleY = (float)Math.toRadians(h4);
        this.Rheadfin.rotateAngleY = (float)Math.toRadians(h4);
        this.Rjaw.rotateAngleY = (float)Math.toRadians(h4);
        this.Rjaw.rotationPointZ = this.Rsnout.rotationPointZ - (float)Math.cos(this.Rsnout.rotateAngleY);
        this.Rjaw.rotationPointX = this.Rsnout.rotationPointX - (float)Math.sin(this.Rsnout.rotateAngleY);
        this.Rneck.rotateAngleY = (float)Math.toRadians(h4) / 2.0f;
        float Rjx;
        float Ljx;
        float jx = Ljx = (Rjx = 0.0f);
        if (c.getAttacking() != 0) {
            newangle = MathHelper.cos(f2 * 1.9f * this.wingspeed) * 3.1415927f * 0.2f;
            Ljx = 0.2f + newangle;
            newangle = MathHelper.cos(f2 * 2.1f * this.wingspeed) * 3.1415927f * 0.2f;
            Rjx = 0.2f + newangle;
            newangle = MathHelper.cos(f2 * 2.3f * this.wingspeed) * 3.1415927f * 0.2f;
            jx = 0.2f + newangle;
        }
        this.head.rotateAngleX = (float)Math.toRadians(d2);
        this.snout.rotateAngleX = (float)Math.toRadians(d2);
        this.headfin.rotateAngleX = (float)Math.toRadians(d2);
        this.jaw.rotateAngleX = (float)Math.toRadians(d2) + jx;
        this.Lhead.rotateAngleX = (float)Math.toRadians(d3);
        this.Lsnout.rotateAngleX = (float)Math.toRadians(d3);
        this.Lheadfin.rotateAngleX = (float)Math.toRadians(d3);
        this.Ljaw.rotateAngleX = (float)Math.toRadians(d3) + Ljx;
        this.Rhead.rotateAngleX = (float)Math.toRadians(d4);
        this.Rsnout.rotateAngleX = (float)Math.toRadians(d4);
        this.Rheadfin.rotateAngleX = (float)Math.toRadians(d4);
        this.Rjaw.rotateAngleX = (float)Math.toRadians(d4) + Rjx;
        d3 = (float)c.getHead1Ext();
        d2 = (float)c.getHead2Ext();
        d4 = (float)c.getHead3Ext();
        this.Lneck.rotateAngleX = (float)Math.toRadians(d3);
        this.neck.rotateAngleX = (float)Math.toRadians(d2);
        this.Rneck.rotateAngleX = (float)Math.toRadians(d4);
        this.Lhead.rotationPointY = this.Lneck.rotationPointY - (float)Math.cos(this.Lneck.rotateAngleX) * 7.0f;
        final ModelRenderer lheadfin = this.Lheadfin;
        final ModelRenderer lsnout = this.Lsnout;
        final ModelRenderer ljaw = this.Ljaw;
        final float rotationPointY = this.Lhead.rotationPointY;
        ljaw.rotationPointY = rotationPointY;
        lsnout.rotationPointY = rotationPointY;
        lheadfin.rotationPointY = rotationPointY;
        this.Lhead.rotationPointZ = this.Lneck.rotationPointZ - (float)Math.sin(this.Lneck.rotateAngleX) * 7.0f;
        final ModelRenderer lheadfin2 = this.Lheadfin;
        final ModelRenderer lsnout2 = this.Lsnout;
        final ModelRenderer ljaw2 = this.Ljaw;
        final float rotationPointZ = this.Lhead.rotationPointZ;
        ljaw2.rotationPointZ = rotationPointZ;
        lsnout2.rotationPointZ = rotationPointZ;
        lheadfin2.rotationPointZ = rotationPointZ;
        this.Lhead.rotationPointX = this.Lneck.rotationPointX - (float)Math.sin(this.Lneck.rotateAngleY) * 7.0f * (float)Math.sin(this.Lneck.rotateAngleX);
        final ModelRenderer lheadfin3 = this.Lheadfin;
        final ModelRenderer lsnout3 = this.Lsnout;
        final ModelRenderer ljaw3 = this.Ljaw;
        final float rotationPointX = this.Lhead.rotationPointX;
        ljaw3.rotationPointX = rotationPointX;
        lsnout3.rotationPointX = rotationPointX;
        lheadfin3.rotationPointX = rotationPointX;
        this.Rhead.rotationPointY = this.Rneck.rotationPointY - (float)Math.cos(this.Rneck.rotateAngleX) * 7.0f;
        final ModelRenderer rheadfin = this.Rheadfin;
        final ModelRenderer rsnout = this.Rsnout;
        final ModelRenderer rjaw = this.Rjaw;
        final float rotationPointY2 = this.Rhead.rotationPointY;
        rjaw.rotationPointY = rotationPointY2;
        rsnout.rotationPointY = rotationPointY2;
        rheadfin.rotationPointY = rotationPointY2;
        this.Rhead.rotationPointZ = this.Rneck.rotationPointZ - (float)Math.sin(this.Rneck.rotateAngleX) * 7.0f;
        final ModelRenderer rheadfin2 = this.Rheadfin;
        final ModelRenderer rsnout2 = this.Rsnout;
        final ModelRenderer rjaw2 = this.Rjaw;
        final float rotationPointZ2 = this.Rhead.rotationPointZ;
        rjaw2.rotationPointZ = rotationPointZ2;
        rsnout2.rotationPointZ = rotationPointZ2;
        rheadfin2.rotationPointZ = rotationPointZ2;
        this.Rhead.rotationPointX = this.Rneck.rotationPointX - (float)Math.sin(this.Rneck.rotateAngleY) * 7.0f * (float)Math.sin(this.Rneck.rotateAngleX);
        final ModelRenderer rheadfin3 = this.Rheadfin;
        final ModelRenderer rsnout3 = this.Rsnout;
        final ModelRenderer rjaw3 = this.Rjaw;
        final float rotationPointX2 = this.Rhead.rotationPointX;
        rjaw3.rotationPointX = rotationPointX2;
        rsnout3.rotationPointX = rotationPointX2;
        rheadfin3.rotationPointX = rotationPointX2;
        this.head.rotationPointY = this.neck.rotationPointY - (float)Math.cos(this.neck.rotateAngleX) * 7.0f;
        final ModelRenderer headfin = this.headfin;
        final ModelRenderer snout = this.snout;
        final ModelRenderer jaw = this.jaw;
        final float rotationPointY3 = this.head.rotationPointY;
        jaw.rotationPointY = rotationPointY3;
        snout.rotationPointY = rotationPointY3;
        headfin.rotationPointY = rotationPointY3;
        this.head.rotationPointZ = this.neck.rotationPointZ - (float)Math.sin(this.neck.rotateAngleX) * 7.0f;
        final ModelRenderer headfin2 = this.headfin;
        final ModelRenderer snout2 = this.snout;
        final ModelRenderer jaw2 = this.jaw;
        final float rotationPointZ3 = this.head.rotationPointZ;
        jaw2.rotationPointZ = rotationPointZ3;
        snout2.rotationPointZ = rotationPointZ3;
        headfin2.rotationPointZ = rotationPointZ3;
        this.head.rotationPointX = this.neck.rotationPointX - (float)Math.sin(this.neck.rotateAngleY) * 7.0f * (float)Math.sin(this.neck.rotateAngleX);
        final ModelRenderer headfin3 = this.headfin;
        final ModelRenderer snout3 = this.snout;
        final ModelRenderer jaw3 = this.jaw;
        final float rotationPointX3 = this.head.rotationPointX;
        jaw3.rotationPointX = rotationPointX3;
        snout3.rotationPointX = rotationPointX3;
        headfin3.rotationPointX = rotationPointX3;
        final ModelRenderer lpower = this.Lpower;
        lpower.rotateAngleX += 0.03f;
        if (this.Lpower.rotateAngleX > 3.141592653589793) {
            final ModelRenderer lpower2 = this.Lpower;
            lpower2.rotateAngleX -= (float)6.283185307179586;
        }
        final ModelRenderer cpower = this.Cpower;
        cpower.rotateAngleX += 0.04f;
        if (this.Cpower.rotateAngleX > 3.141592653589793) {
            final ModelRenderer cpower2 = this.Cpower;
            cpower2.rotateAngleX -= (float)6.283185307179586;
        }
        final ModelRenderer rpower = this.Rpower;
        rpower.rotateAngleX += 0.05f;
        if (this.Rpower.rotateAngleX > 3.141592653589793) {
            final ModelRenderer rpower2 = this.Rpower;
            rpower2.rotateAngleX -= (float)6.283185307179586;
        }
        final ModelRenderer lpower3 = this.Lpower;
        lpower3.rotateAngleY += 0.035f;
        if (this.Lpower.rotateAngleY > 3.141592653589793) {
            final ModelRenderer lpower4 = this.Lpower;
            lpower4.rotateAngleY -= (float)6.283185307179586;
        }
        final ModelRenderer cpower3 = this.Cpower;
        cpower3.rotateAngleY += 0.046f;
        if (this.Cpower.rotateAngleY > 3.141592653589793) {
            final ModelRenderer cpower4 = this.Cpower;
            cpower4.rotateAngleY -= (float)6.283185307179586;
        }
        final ModelRenderer rpower3 = this.Rpower;
        rpower3.rotateAngleY += 0.065f;
        if (this.Rpower.rotateAngleY > 3.141592653589793) {
            final ModelRenderer rpower4 = this.Rpower;
            rpower4.rotateAngleY -= (float)6.283185307179586;
        }
        final ModelRenderer lpower5 = this.Lpower;
        lpower5.rotateAngleZ += 0.05f;
        if (this.Lpower.rotateAngleZ > 3.141592653589793) {
            final ModelRenderer lpower6 = this.Lpower;
            lpower6.rotateAngleZ -= (float)6.283185307179586;
        }
        final ModelRenderer cpower5 = this.Cpower;
        cpower5.rotateAngleZ += 0.13f;
        if (this.Cpower.rotateAngleZ > 3.141592653589793) {
            final ModelRenderer cpower6 = this.Cpower;
            cpower6.rotateAngleZ -= (float)6.283185307179586;
        }
        final ModelRenderer rpower5 = this.Rpower;
        rpower5.rotateAngleZ += 0.03f;
        if (this.Rpower.rotateAngleZ > 3.141592653589793) {
            final ModelRenderer rpower6 = this.Rpower;
            rpower6.rotateAngleZ -= (float)6.283185307179586;
        }
        this.body.render(f5);
        this.neck1.render(f5);
        this.neck.render(f5);
        this.neckbase.render(f5);
        this.head.render(f5);
        this.Rleg1.render(f5);
        this.Lleg1.render(f5);
        this.snout.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.Tail5.render(f5);
        this.Tail6.render(f5);
        this.Lneck1.render(f5);
        this.Lneck.render(f5);
        this.Lhead.render(f5);
        this.Lsnout.render(f5);
        this.Rneck1.render(f5);
        this.Rneck.render(f5);
        this.Rhead.render(f5);
        this.Rsnout.render(f5);
        this.headfin.render(f5);
        this.Lheadfin.render(f5);
        this.Rheadfin.render(f5);
        this.Backfin.render(f5);
        this.Ljaw.render(f5);
        this.jaw.render(f5);
        this.Rjaw.render(f5);
        GL11.glPushMatrix();
        GL11.glEnable(2977);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(0.75f, 0.75f, 0.75f, 0.55f);
        this.Rwing2.render(f5);
        this.Rwing3.render(f5);
        this.Lwing2.render(f5);
        this.Lwing3.render(f5);
        this.Lwing.render(f5);
        this.Rwing.render(f5);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
        this.Lpower.render(f5);
        this.Cpower.render(f5);
        this.Rpower.render(f5);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
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
