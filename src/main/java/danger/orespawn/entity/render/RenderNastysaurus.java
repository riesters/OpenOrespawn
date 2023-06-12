package danger.orespawn.entity.render;

import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import javax.annotation.*;

public class RenderNastysaurus extends RenderLiving
{
    public RenderNastysaurus(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelNastysaurus(1.5f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return new ResourceLocation("orespawn:textures/entity/nastysaurus.png");
    }
}
