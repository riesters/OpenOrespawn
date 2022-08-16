package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;

public class ModelFirefly extends ModelBase
{
    private final float wingspeed;
    ModelRenderer body;
    ModelRenderer wing_left;
    ModelRenderer wing_right;
    ModelRenderer head;
    ModelRenderer mouth;
    ModelRenderer eye_left;
    ModelRenderer eye_right;
    ModelRenderer front_leg_left_;
    ModelRenderer front_leg_right;
    ModelRenderer back_leg_left;
    ModelRenderer back_leg_right;
    ModelRenderer TailLight;
    
    public ModelFirefly(final float f1) {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.wingspeed = f1;
        this.body = new ModelRenderer(this, 38, 12);
        this.body.addBox(-3.0F, -3.0F, -3.0F, 5, 5, 5);
        this.body.setRotationPoint(-1.0F, 9.0F, -1.0F);
        this.body.setTextureSize(64, 128);
        this.body.mirror = true;
        setRotation(body, 0.0F, 0.0F, 0.0F);
        this.wing_left = new ModelRenderer(this, 46, 0);
        this.wing_left.addBox(0.0F, -6.0F, 0.0F, 0, 6, 2);
        this.wing_left.setRotationPoint(1.0F, 6.0F, -2.0F);
        this.wing_left.setTextureSize(64, 128);
        this.wing_left.mirror = true;
        setRotation(wing_left, 0.0F, 0.0174533F, 0.6981317F);
        this.wing_right = new ModelRenderer(this, 53, 0);
        this.wing_right.addBox(0.0F, -6.0F, 0.0F, 0, 6, 2);
        this.wing_right.setRotationPoint(-4.0F, 6.0F, -2.0F);
        this.wing_right.setTextureSize(64, 128);
        this.wing_right.mirror = true;
        setRotation(wing_right, 0.0F, 0.0F, -0.6981317F);
        this.head = new ModelRenderer(this, 3, 14);
        this.head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
        this.head.setRotationPoint(-3.0F, 7.0F, -7.0F);
        this.head.setTextureSize(64, 128);
        this.head.mirror = true;
        setRotation(head, 0.2230717F, 0.0F, 0.0F);
        this.mouth = new ModelRenderer(this, 26, 15);
        this.mouth.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
        this.mouth.setRotationPoint(-2.0F, 9.0F, -8.0F);
        this.mouth.setTextureSize(64, 128);
        this.mouth.mirror = true;
        setRotation(mouth, 0.2117115F, 0.0F, 0.0F);
        this.eye_left = new ModelRenderer(this, 18, 12);
        this.eye_left.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2);
        this.eye_left.setRotationPoint(-1.0F, 6.5F, -6.0F);
        this.eye_left.setTextureSize(64, 128);
        this.eye_left.mirror = true;
        setRotation(eye_left, 0.0174533F, 0.2602503F, -0.2230717F);
        this.eye_right = new ModelRenderer(this, 18, 18);
        this.eye_right.addBox(1.0F, -0.6F, -0.6F, 1, 2, 2);
        this.eye_right.setRotationPoint(-4.0F, 6.5F, -6.0F);
        this.eye_right.setTextureSize(64, 128);
        this.eye_right.mirror = true;
        setRotation(eye_right, 0.0F, -0.2602503F, 0.2230717F);
        this.front_leg_left_ = new ModelRenderer(this, 32, 0);
        this.front_leg_left_.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.front_leg_left_.setRotationPoint(-1.0F, 10.0F, -3.0F);
        this.front_leg_left_.setTextureSize(64, 128);
        this.front_leg_left_.mirror = true;
        setRotation(front_leg_left_, -0.2792527F, 0.0F, -0.2792527F);
        this.front_leg_right = new ModelRenderer(this, 22, 0);
        this.front_leg_right.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.front_leg_right.setRotationPoint(-3.0F, 10.0F, -3.0F);
        this.front_leg_right.setTextureSize(64, 128);
        this.front_leg_right.mirror = true;
        setRotation(front_leg_right, -0.2792527F, 0.0F, 0.2792527F);
        this.back_leg_left = new ModelRenderer(this, 11, 0);
        this.back_leg_left.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.back_leg_left.setRotationPoint(-1.0F, 10.0F, -1.0F);
        this.back_leg_left.setTextureSize(64, 128);
        this.back_leg_left.mirror = true;
        setRotation(back_leg_left, 0.2792527F, 0.0F, -0.2792527F);
        this.back_leg_right = new ModelRenderer(this, 2, 0);
        this.back_leg_right.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.back_leg_right.setRotationPoint(-3.0F, 10.0F, -1.0F);
        this.back_leg_right.setTextureSize(64, 128);
        this.back_leg_right.mirror = true;
        setRotation(back_leg_right, 0.2792527F, 0.0F, 0.2792527F);
        this.TailLight = new ModelRenderer(this, 10, 27);
        this.TailLight.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4);
        this.TailLight.setRotationPoint(-3.0F, 6.0F, 1.0F);
        this.TailLight.setTextureSize(64, 128);
        this.TailLight.mirror = true;
        setRotation(TailLight, 0.0F, 0.0F, 0.0F);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Firefly fly = (Firefly)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float onoff;
        this.wing_left.rotateAngleZ = 1.11f + MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.35f;
        this.wing_right.rotateAngleZ = -1.11f - MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.35f;
        this.body.render(f5);
        this.wing_left.render(f5);
        this.wing_right.render(f5);
        this.head.render(f5);
        this.mouth.render(f5);
        this.eye_left.render(f5);
        this.eye_right.render(f5);
        this.front_leg_left_.render(f5);
        this.front_leg_right.render(f5);
        this.back_leg_left.render(f5);
        this.back_leg_right.render(f5);
        onoff = fly.getBlink();
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, onoff, 240.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.TailLight.render(f5);
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
