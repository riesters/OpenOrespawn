package danger.orespawn.entity.render;

import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderMosquito extends RenderLiving
{
    protected ModelMosquito model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderMosquito(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelMosquito(), 0.0f);
        this.scale = 1.0f;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderMosquito.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/mosquito.png");
    }
}
