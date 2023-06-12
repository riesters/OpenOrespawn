package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderTRex extends RenderLiving<TRex>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderTRex(final RenderManager manager) {
        super(manager, (ModelBase)new ModelTRex(1.5f), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final TRex entity) {
        return RenderTRex.TEXTURES;
    }
    
    protected void applyRotations(final TRex entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/trex.png");
    }
}
