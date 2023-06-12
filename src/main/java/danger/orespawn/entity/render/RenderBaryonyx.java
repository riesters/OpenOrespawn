package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderBaryonyx extends RenderLiving<Baryonyx>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderBaryonyx(final RenderManager manager) {
        super(manager, (ModelBase)new ModelBaryonyx(1.5f), 0.8f);
    }
    
    protected ResourceLocation getEntityTexture(final Baryonyx entity) {
        return RenderBaryonyx.TEXTURES;
    }
    
    protected void applyRotations(final Baryonyx entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/baryonyx.png");
    }
}
