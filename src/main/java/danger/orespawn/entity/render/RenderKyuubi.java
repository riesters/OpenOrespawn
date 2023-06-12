package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderKyuubi extends RenderLiving<Kyuubi>
{
    public RenderKyuubi(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelKyuubi(1.0f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Kyuubi entity) {
        return new ResourceLocation("orespawn:textures/entity/kyuubi.png");
    }
}
