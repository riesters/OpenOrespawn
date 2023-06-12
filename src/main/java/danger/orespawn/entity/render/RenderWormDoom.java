package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderWormDoom extends RenderLiving<WormDoom>
{
    protected ModelWormDoom model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderWormDoom(final RenderManager manager) {
        super(manager, (ModelBase)new ModelWormDoom(), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelWormDoom)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final WormDoom entity) {
        return RenderWormDoom.texture;
    }
    
    protected void preRenderCallback(final WormDoom entitylivingbaseIn, final float partialTickTime) {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }
    
    public void doRender(final WormDoom entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/wormdoomtexture.png");
    }
}
