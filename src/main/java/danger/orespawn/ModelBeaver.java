package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelBeaver extends ModelBase
{
    private final float wingspeed;
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer teeth;
    ModelRenderer body;
    ModelRenderer tail;
    ModelRenderer rff;
    ModelRenderer lff;
    ModelRenderer rrf;
    ModelRenderer lrf;
    
    public ModelBeaver(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 3);
        this.head.addBox(0.0F, 0.0F, 0.0F, 6, 5, 5);
        this.head.setRotationPoint(0.0F, 15.0F, -8.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        setRotation(head);
        this.nose = new ModelRenderer(this, 6, 0);
        this.nose.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
        this.nose.setRotationPoint(2.0F, 18.0F, -8.5F);
        this.nose.setTextureSize(64, 32);
        this.nose.mirror = true;
        setRotation(nose);
        this.teeth = new ModelRenderer(this, 0, 0);
        this.teeth.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
        this.teeth.setRotationPoint(2.0F, 19.0F, -8.2F);
        this.teeth.setTextureSize(64, 32);
        this.teeth.mirror = true;
        setRotation(teeth);
        this.body = new ModelRenderer(this, 0, 13);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 8, 10);
        this.body.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body);
        this.tail = new ModelRenderer(this, 22, 0);
        this.tail.addBox(0.0F, -1.0F, 0.0F, 5, 1, 8);
        this.tail.setRotationPoint(0.5F, 21.0F, 7.0F);
        this.tail.setTextureSize(64, 32);
        this.tail.mirror = true;
        setRotation(tail);
        this.rff = new ModelRenderer(this, 22, 9);
        this.rff.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.rff.setRotationPoint(-0.5F, 22.0F, -2.5F);
        this.rff.setTextureSize(64, 32);
        this.rff.mirror = true;
        setRotation(rff);
        this.lff = new ModelRenderer(this, 22, 9);
        this.lff.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.lff.setRotationPoint(4.5F, 22.0F, -2.5F);
        this.lff.setTextureSize(64, 32);
        this.lff.mirror = true;
        setRotation(lff);
        this.rrf = new ModelRenderer(this, 22, 9);
        this.rrf.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.rrf.setRotationPoint(-0.5F, 22.0F, 4.5F);
        this.rrf.setTextureSize(64, 32);
        this.rrf.mirror = true;
        setRotation(rrf);
        this.lrf = new ModelRenderer(this, 22, 9);
        this.lrf.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.lrf.setRotationPoint(4.5F, 22.0F, 4.5F);
        this.lrf.setTextureSize(64, 32);
        this.lrf.mirror = true;
        setRotation(lrf);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        newangle = MathHelper.cos(f2 * 3.7f * this.wingspeed) * 3.1415927f * 0.45f * f1;
        final ModelRenderer rff = this.rff;
        final ModelRenderer lrf = this.lrf;
        final float n = newangle;
        lrf.rotateAngleX = n;
        rff.rotateAngleX = n;
        final ModelRenderer lff = this.lff;
        final ModelRenderer rrf = this.rrf;
        final float n2 = -newangle;
        rrf.rotateAngleX = n2;
        lff.rotateAngleX = n2;
        newangle = MathHelper.cos(f2 * 2.7f * this.wingspeed) * 3.1415927f * 0.25f;
        this.teeth.rotateAngleX = newangle;
        newangle = MathHelper.cos(f2 * 0.5f * this.wingspeed) * 3.1415927f * 0.05f;
        this.tail.rotateAngleX = newangle;
        this.head.render(f5);
        this.nose.render(f5);
        this.teeth.render(f5);
        this.body.render(f5);
        this.tail.render(f5);
        this.rff.render(f5);
        this.lff.render(f5);
        this.rrf.render(f5);
        this.lrf.render(f5);
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
