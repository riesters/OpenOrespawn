package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderBrutalfly extends RenderLiving<Brutalfly>
{
    public RenderBrutalfly(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelBrutalfly(0.1f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Brutalfly entity) {
        return new ResourceLocation("orespawn:textures/entity/brutalfly.png");
    }
}
