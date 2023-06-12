package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderTermite extends RenderLiving<Termite>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderTermite(final RenderManager manager) {
        super(manager, (ModelBase)new ModelAnt(), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final Termite entity) {
        return RenderTermite.TEXTURES;
    }
    
    protected void applyRotations(final Termite entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/termite.png");
    }
}
