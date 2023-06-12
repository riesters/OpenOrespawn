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

public class RenderButterfly extends RenderLiving<Butterfly>
{
    protected ModelButterfly model;
    private float scale;
    private static final ResourceLocation TEXTURE1;
    private static final ResourceLocation TEXTURE2;
    private static final ResourceLocation TEXTURE3;
    private static final ResourceLocation TEXTURE4;
    
    public RenderButterfly(final RenderManager manager) {
        super(manager, (ModelBase)new ModelButterfly(0.6f, 1.0f), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelButterfly)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Butterfly entity) {
        switch (entity.butterflyType) {
            case 1: {
                return RenderButterfly.TEXTURE1;
            }
            case 2: {
                return RenderButterfly.TEXTURE2;
            }
            case 3: {
                return RenderButterfly.TEXTURE3;
            }
            default: {
                return RenderButterfly.TEXTURE4;
            }
        }
    }
    
    protected void applyRotations(final Butterfly entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        GlStateManager.translate(0.0f, MathHelper.cos(p_77043_2_ * 0.3f) * 0.1f, 0.0f);
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURE1 = new ResourceLocation("orespawn:textures/entity/butterfly.png");
        TEXTURE2 = new ResourceLocation("orespawn:textures/entity/butterfly2.png");
        TEXTURE3 = new ResourceLocation("orespawn:textures/entity/butterfly3.png");
        TEXTURE4 = new ResourceLocation("orespawn:textures/entity/butterfly4.png");
    }
}
