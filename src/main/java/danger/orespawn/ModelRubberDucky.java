package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelRubberDucky extends ModelBase
{
    private final float wingspeed;
    ModelRenderer bottom;
    ModelRenderer body;
    ModelRenderer back;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer beak;
    ModelRenderer Lwing;
    ModelRenderer Rwing;
    
    public ModelRubberDucky(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.bottom = new ModelRenderer(this, 0, 56);
        this.bottom.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4);
        this.bottom.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.bottom.setTextureSize(64, 64);
        this.bottom.mirror = true;
        setRotation(bottom);
        this.body = new ModelRenderer(this, 0, 45);
        this.body.addBox(-3.0F, 0.0F, -3.0F, 6, 2, 8);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.setTextureSize(64, 64);
        this.body.mirror = true;
        setRotation(body);
        this.back = new ModelRenderer(this, 0, 33);
        this.back.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 10);
        this.back.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.back.setTextureSize(64, 64);
        this.back.mirror = true;
        setRotation(back);
        this.neck = new ModelRenderer(this, 17, 27);
        this.neck.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2);
        this.neck.setRotationPoint(0.0F, 19.0F, -1.0F);
        this.neck.setTextureSize(64, 64);
        this.neck.mirror = true;
        setRotation(neck);
        this.head = new ModelRenderer(this, 13, 18);
        this.head.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4);
        this.head.setRotationPoint(0.0F, 19.0F, -1.0F);
        this.head.setTextureSize(64, 64);
        this.head.mirror = true;
        setRotation(head);
        this.beak = new ModelRenderer(this, 0, 21);
        this.beak.addBox(-1.5F, -1.0F, -5.0F, 3, 1, 3);
        this.beak.setRotationPoint(0.0F, 19.0F, -1.0F);
        this.beak.setTextureSize(64, 64);
        this.beak.mirror = true;
        setRotation(beak);
        this.Lwing = new ModelRenderer(this, 0, 0);
        this.Lwing.addBox(0.0F, -0.5F, 0.0F, 2, 1, 5);
        this.Lwing.setRotationPoint(3.0F, 21.0F, -2.0F);
        this.Lwing.setTextureSize(64, 64);
        this.Lwing.mirror = true;
        setRotation(Lwing);
        this.Rwing = new ModelRenderer(this, 17, 0);
        this.Rwing.addBox(-2.0F, -0.5F, 0.0F, 2, 1, 5);
        this.Rwing.setRotationPoint(-3.0F, 21.0F, -2.0F);
        this.Rwing.setTextureSize(64, 64);
        this.Rwing.mirror = true;
        setRotation(Rwing);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final RubberDucky c = (RubberDucky)entity;
        RenderInfo r;
        float newangle;
        float nextangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.45f;
        this.beak.rotateAngleY = this.head.rotateAngleY;
        this.head.rotateAngleX = (float)Math.toRadians(f4) * 0.65f;
        this.beak.rotateAngleX = this.head.rotateAngleX;
        r = c.getRenderInfo();
        newangle = MathHelper.cos(f2 * 1.0f * this.wingspeed) * 3.1415927f * 0.15f;
        nextangle = MathHelper.cos((f2 + 0.3f) * 1.0f * this.wingspeed) * 3.1415927f * 0.15f;
        if (nextangle > 0.0f && newangle < 0.0f) {
            r.ri1 = 0;
            if (c.worldObj.rand.nextInt(3) == 1) {
                r.ri1 = 1;
            }
            if (c.getKillCount() >= 5) {
                if (c.worldObj.rand.nextInt(2) == 1) {
                    r.ri1 = 1;
                }
                newangle *= 4.0f;
            }
        }
        if (r.ri1 == 0) {
            newangle = 0.0f;
        }
        if (c.isSitting()) {
            newangle = 0.0f;
        }
        newangle = Math.abs(newangle);
        this.Lwing.rotateAngleZ = -newangle;
        this.Lwing.rotateAngleY = newangle / 2.0f;
        this.Rwing.rotateAngleZ = newangle;
        this.Rwing.rotateAngleY = -newangle / 2.0f;
        c.setRenderInfo(r);
        this.bottom.render(f5);
        this.body.render(f5);
        this.back.render(f5);
        this.neck.render(f5);
        this.head.render(f5);
        this.beak.render(f5);
        this.Lwing.render(f5);
        this.Rwing.render(f5);
    }
    
    private void setRotation(final ModelRenderer model) {
        model.rotateAngleX = (float) 0.0;
        model.rotateAngleY = (float) 0.0;
        model.rotateAngleZ = (float) 0.0;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
