package danger.orespawn.entity.render;

import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderSpyro extends RenderLiving
{
    protected ModelSpyro model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderSpyro(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelSpyro(1.0f), 0.0f);
        this.scale = 1.0f;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderSpyro.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/spyrotexture.png");
    }
}
