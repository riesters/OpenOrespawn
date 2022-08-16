package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;

public class ModelGhostSkelly extends ModelBase
{
    ModelRenderer body;
    ModelRenderer shirt;
    ModelRenderer head;
    ModelRenderer stem;
    ModelRenderer rarm;
    ModelRenderer larm;
    ModelRenderer rsleeve;
    ModelRenderer lsleeve;
    ModelRenderer lchains;
    ModelRenderer rchains;
    
    public ModelGhostSkelly() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(0.0F, 0.0F, 0.0F, 1, 21, 1);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.setTextureSize(128, 64);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F);
        this.shirt = new ModelRenderer(this, 42, 43);
        this.shirt.addBox(-2.0F, 0.0F, -2.0F, 5, 12, 5);
        this.shirt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shirt.setTextureSize(128, 64);
        this.shirt.mirror = true;
        setRotation(shirt, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 40, 29);
        this.head.addBox(-3.0F, 0.0F, -3.0F, 7, 5, 7);
        this.head.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head.setTextureSize(128, 64);
        this.head.mirror = true;
        setRotation(head, 0.0F, 0.0F);
        this.stem = new ModelRenderer(this, 49, 23);
        this.stem.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.stem.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.stem.setTextureSize(128, 64);
        this.stem.mirror = true;
        setRotation(stem, 0.1745329F, 0.1745329F);
        this.rarm = new ModelRenderer(this, 26, 0);
        this.rarm.addBox(-14.0F, 0.0F, 0.0F, 15, 1, 1);
        this.rarm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rarm.setTextureSize(128, 64);
        this.rarm.mirror = true;
        setRotation(rarm, 0.0F, 0.0F);
        this.larm = new ModelRenderer(this, 63, 0);
        this.larm.addBox(0.0F, 0.0F, 0.0F, 15, 1, 1);
        this.larm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.larm.setTextureSize(128, 64);
        this.larm.mirror = true;
        setRotation(larm, 0.0F, 0.0F);
        this.rsleeve = new ModelRenderer(this, 31, 7);
        this.rsleeve.addBox(-11.0F, 0.0F, -1.0F, 9, 8, 3);
        this.rsleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rsleeve.setTextureSize(128, 64);
        this.rsleeve.mirror = true;
        setRotation(rsleeve, 0.0F, 0.0F);
        this.lsleeve = new ModelRenderer(this, 71, 7);
        this.lsleeve.addBox(3.0F, 0.0F, -1.0F, 9, 8, 3);
        this.lsleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lsleeve.setTextureSize(128, 64);
        this.lsleeve.mirror = true;
        setRotation(lsleeve, 0.0F, 0.0F);
        this.lchains = new ModelRenderer(this, 98, 0);
        this.lchains.addBox(11.0F, -1.0F, 0.0F, 3, 16, 1);
        this.lchains.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lchains.setTextureSize(128, 64);
        this.lchains.mirror = true;
        setRotation(lchains, 0.0F, 0.0F);
        this.rchains = new ModelRenderer(this, 12, 0);
        this.rchains.addBox(-13.0F, -1.0F, 0.0F, 3, 10, 1);
        this.rchains.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rchains.setTextureSize(128, 64);
        this.rchains.mirror = true;
        setRotation(rchains, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final GhostSkelly e = (GhostSkelly)entity;
        RenderInfo r;
        float newangle;
        float newrf1;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        r = e.getRenderInfo();
        final ModelRenderer larm = this.larm;
        final ModelRenderer lsleeve = this.lsleeve;
        final ModelRenderer lchains = this.lchains;
        final float rotateAngleZ = MathHelper.cos(f2 * 0.2f) * 3.1415927f * 0.05f;
        lchains.rotateAngleZ = rotateAngleZ;
        lsleeve.rotateAngleZ = rotateAngleZ;
        larm.rotateAngleZ = rotateAngleZ;
        final ModelRenderer rarm = this.rarm;
        final ModelRenderer rsleeve = this.rsleeve;
        final ModelRenderer rchains = this.rchains;
        final float rotateAngleZ2 = MathHelper.cos(f2 * 0.22f) * 3.1415927f * 0.05f;
        rchains.rotateAngleZ = rotateAngleZ2;
        rsleeve.rotateAngleZ = rotateAngleZ2;
        rarm.rotateAngleZ = rotateAngleZ2;
        final ModelRenderer larm2 = this.larm;
        final ModelRenderer lsleeve2 = this.lsleeve;
        final ModelRenderer lchains2 = this.lchains;
        final float rotateAngleY = MathHelper.cos(f2 * 0.24f) * 3.1415927f * 0.05f;
        lchains2.rotateAngleY = rotateAngleY;
        lsleeve2.rotateAngleY = rotateAngleY;
        larm2.rotateAngleY = rotateAngleY;
        final ModelRenderer rarm2 = this.rarm;
        final ModelRenderer rsleeve2 = this.rsleeve;
        final ModelRenderer rchains2 = this.rchains;
        final float rotateAngleY2 = MathHelper.cos(f2 * 0.26f) * 3.1415927f * 0.05f;
        rchains2.rotateAngleY = rotateAngleY2;
        rsleeve2.rotateAngleY = rotateAngleY2;
        rarm2.rotateAngleY = rotateAngleY2;
        newangle = MathHelper.cos(f2 * 0.05f) * 3.1415927f * 2.0f;
        newrf1 = f2 * 0.05f % 6.2831855f;
        newrf1 = Math.abs(newrf1);
        if (newrf1 < r.rf2) {
            r.ri2 = 0;
            if (e.worldObj.rand.nextInt(3) == 1) {
                r.ri2 |= 0x1;
            }
        }
        r.rf2 = newrf1;
        if ((r.ri2 & 0x1) == 0x0) {
            newangle = 0.0f;
        }
        this.head.rotateAngleY = newangle;
        e.setRenderInfo(r);
        GL11.glPushMatrix();
        GL11.glEnable(2977);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(0.75f, 0.75f, 0.75f, 0.25f);
        this.body.render(f5);
        this.shirt.render(f5);
        this.head.render(f5);
        this.stem.render(f5);
        this.rarm.render(f5);
        this.larm.render(f5);
        this.rsleeve.render(f5);
        this.lsleeve.render(f5);
        this.lchains.render(f5);
        this.rchains.render(f5);
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
