package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;

public class RenderBird extends RenderLiving<Bird>
{
    protected ModelBird model;
    private static final ResourceLocation TEXTURE1;
    private static final ResourceLocation TEXTURE2;
    private static final ResourceLocation TEXTURE3;
    private static final ResourceLocation TEXTURE4;
    private static final ResourceLocation TEXTURE5;
    private static final ResourceLocation TEXTURE6;
    
    public RenderBird(final RenderManager manager) {
        super(manager, (ModelBase)new ModelBird(0.6f), 0.0f);
        this.model = (ModelBird)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Bird entity) {
        switch (entity.birdType) {
            case 1: {
                return RenderBird.TEXTURE1;
            }
            case 2: {
                return RenderBird.TEXTURE2;
            }
            case 3: {
                return RenderBird.TEXTURE3;
            }
            case 4: {
                return RenderBird.TEXTURE4;
            }
            case 5: {
                return RenderBird.TEXTURE5;
            }
            default: {
                return RenderBird.TEXTURE6;
            }
        }
    }
    
    protected void applyRotations(final Bird entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        GlStateManager.translate(0.0f, MathHelper.cos(p_77043_2_ * 0.3f) * 0.1f, 0.0f);
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURE1 = new ResourceLocation("orespawn:textures/entity/bird1.png");
        TEXTURE2 = new ResourceLocation("orespawn:textures/entity/bird2.png");
        TEXTURE3 = new ResourceLocation("orespawn:textures/entity/bird3.png");
        TEXTURE4 = new ResourceLocation("orespawn:textures/entity/bird4.png");
        TEXTURE5 = new ResourceLocation("orespawn:textures/entity/bird5.png");
        TEXTURE6 = new ResourceLocation("orespawn:textures/entity/bird6.png");
    }
}
