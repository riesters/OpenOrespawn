package danger.orespawn.entity.render;

import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderFirefly extends RenderLiving
{
    private static final ResourceLocation texture;
    
    public RenderFirefly(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelFirefly(1.5f), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderFirefly.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/firefly.png");
    }
}
