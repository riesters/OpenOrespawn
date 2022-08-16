package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelWormSmall extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer tail;
    
    public ModelWormSmall() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
        this.head.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        setRotation(head);
        this.body = new ModelRenderer(this, 6, 0);
        this.body.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
        this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        setRotation(body);
        this.tail = new ModelRenderer(this, 12, 0);
        this.tail.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1);
        this.tail.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.tail.setTextureSize(64, 32);
        this.tail.mirror = true;
        setRotation(tail);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle = MathHelper.cos(f2 * 0.55f) * 3.1415927f * 0.15f;
        this.tail.rotateAngleX = newangle;
        float d1 = (float)(Math.sin(newangle) * 5.0);
        float d2 = (float)(Math.cos(newangle) * 5.0);
        this.body.rotationPointZ = this.tail.rotationPointZ - d1;
        newangle = MathHelper.cos(f2 * 0.35f) * 3.1415927f * 0.1f;
        this.tail.rotateAngleZ = newangle;
        float d3 = (float)(Math.cos(newangle) * d2);
        float d4 = (float)(Math.sin(newangle) * d2);
        this.body.rotationPointX = this.tail.rotationPointX + d4;
        this.body.rotationPointY = (float)(this.tail.rotationPointY - 5.0 + (5.0 - d3));
        newangle = MathHelper.cos(f2 * 0.45f) * 3.1415927f * 0.15f;
        this.body.rotateAngleX = newangle;
        d1 = (float)(Math.sin(newangle) * 5.0);
        d2 = (float)(Math.cos(newangle) * 5.0);
        this.head.rotationPointZ = this.body.rotationPointZ - d1;
        newangle = MathHelper.cos(f2 * 0.25f) * 3.1415927f * 0.1f;
        this.body.rotateAngleZ = newangle;
        d3 = (float)(Math.cos(newangle) * d2);
        d4 = (float)(Math.sin(newangle) * d2);
        this.head.rotationPointX = this.body.rotationPointX + d4;
        this.head.rotationPointY = (float)(this.body.rotationPointY - 5.0 + (5.0 - d3));
        this.head.rotateAngleX = 0.62f + MathHelper.cos(f2 * 0.65f) * 3.1415927f * 0.15f;
        this.head.rotateAngleZ = MathHelper.cos(f2 * 0.3f) * 3.1415927f * 0.05f;
        this.head.render(f5);
        this.body.render(f5);
        this.tail.render(f5);
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
