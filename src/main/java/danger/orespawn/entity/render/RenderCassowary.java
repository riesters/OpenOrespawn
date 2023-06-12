package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderCassowary extends RenderLiving<Cassowary>
{
    public RenderCassowary(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelCassowary(1.0f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Cassowary entity) {
        return new ResourceLocation("orespawn:textures/entity/cassowary.png");
    }
}
