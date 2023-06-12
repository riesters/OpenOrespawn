package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderStinkBug extends RenderLiving<StinkBug>
{
    public RenderStinkBug(final RenderManager manager) {
        super(manager, (ModelBase)new ModelStinkBug(0.1f), 0.0f);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final StinkBug entity) {
        return new ResourceLocation("orespawn:textures/entity/stinkbug.png");
    }
}
