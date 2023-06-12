package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderMothra extends RenderLiving<Mothra>
{
    public RenderMothra(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelButterfly(0.1f, 8.0f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Mothra entity) {
        return new ResourceLocation("orespawn:textures/entity/eyemoth.png");
    }
}
