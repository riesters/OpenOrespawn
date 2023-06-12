package danger.orespawn.entity.render;

import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderDragonfly extends RenderLiving
{
    private static final ResourceLocation texture;
    
    public RenderDragonfly(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelDragonfly(1.5f), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderDragonfly.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/dragonfly.png");
    }
}
