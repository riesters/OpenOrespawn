package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderCaveFisher extends RenderLiving<CaveFisher>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderCaveFisher(final RenderManager manager) {
        super(manager, (ModelBase)new ModelCaveFisher(1.0f), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final CaveFisher entity) {
        return RenderCaveFisher.TEXTURES;
    }
    
    protected void applyRotations(final CaveFisher entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/cavefisher.png");
    }
}
