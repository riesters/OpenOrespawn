package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderBeaver extends RenderLiving<Beaver>
{
    public RenderBeaver(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelBeaver(1.0f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Beaver entity) {
        return new ResourceLocation("orespawn:textures/entity/beaver.png");
    }
}
