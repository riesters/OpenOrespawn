package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelCliffRacer extends ModelBase
{
    private final float wingspeed;
    ModelRenderer Body;
    ModelRenderer Fins;
    ModelRenderer LWing;
    ModelRenderer RWing;
    ModelRenderer Tail;
    ModelRenderer TailEnd;
    ModelRenderer Head;
    ModelRenderer Beak;
    
    public ModelCliffRacer(final float f1) {
        this.wingspeed = f1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this, 0, 52);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 3, 1, 10);
        this.Body.setRotationPoint(-1.0F, 15.0F, -4.0F);
        this.Body.setTextureSize(64, 64);
        this.Body.mirror = true;
        setRotation(Body);
        this.Fins = new ModelRenderer(this, 0, 40);
        this.Fins.addBox(0.0F, -4.0F, 0.0F, 1, 6, 3);
        this.Fins.setRotationPoint(0.0F, 15.0F, -1.0F);
        this.Fins.setTextureSize(64, 64);
        this.Fins.mirror = true;
        setRotation(Fins);
        this.LWing = new ModelRenderer(this, 0, 31);
        this.LWing.addBox(0.0F, 0.0F, 0.0F, 7, 1, 6);
        this.LWing.setRotationPoint(2.0F, 15.0F, -2.0F);
        this.LWing.setTextureSize(64, 64);
        this.LWing.mirror = true;
        setRotation(LWing);
        this.RWing = new ModelRenderer(this, 39, 0);
        this.RWing.addBox(-7.0F, 0.0F, 0.0F, 7, 1, 6);
        this.RWing.setRotationPoint(-1.0F, 15.0F, -2.0F);
        this.RWing.setTextureSize(64, 64);
        this.RWing.mirror = true;
        setRotation(RWing);
        this.Tail = new ModelRenderer(this, 0, 16);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9);
        this.Tail.setRotationPoint(0.0F, 15.0F, 6.0F);
        this.Tail.setTextureSize(64, 64);
        this.Tail.mirror = true;
        setRotation(Tail);
        this.TailEnd = new ModelRenderer(this, 0, 10);
        this.TailEnd.addBox(0.0F, -1.0F, 9.0F, 2, 2, 2);
        this.TailEnd.setRotationPoint(-0.5F, 15.0F, 6.0F);
        this.TailEnd.setTextureSize(64, 64);
        this.TailEnd.mirror = true;
        setRotation(TailEnd);
        this.Head = new ModelRenderer(this, 28, 21);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.Head.setRotationPoint(-0.5F, 14.0F, -6.0F);
        this.Head.setTextureSize(64, 64);
        this.Head.mirror = true;
        setRotation(Head);
        this.Beak = new ModelRenderer(this, 0, 0);
        this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.Beak.setRotationPoint(0.0F, 14.5F, -8.0F);
        this.Beak.setTextureSize(64, 64);
        this.Beak.mirror = true;
        setRotation(Beak);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float newangle;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.25f;
        this.LWing.rotateAngleZ = newangle;
        this.RWing.rotateAngleZ = -newangle;
        this.Body.render(f5);
        this.Fins.render(f5);
        this.LWing.render(f5);
        this.RWing.render(f5);
        this.Tail.render(f5);
        this.TailEnd.render(f5);
        this.Head.render(f5);
        this.Beak.render(f5);
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
