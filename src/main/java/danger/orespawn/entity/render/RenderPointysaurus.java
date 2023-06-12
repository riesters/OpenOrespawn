package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderPointysaurus extends RenderLiving<Pointysaurus>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderPointysaurus(final RenderManager manager) {
        super(manager, (ModelBase)new ModelPointysaurus(1.5f), 0.7f);
    }
    
    protected ResourceLocation getEntityTexture(final Pointysaurus entity) {
        return RenderPointysaurus.TEXTURES;
    }
    
    protected void applyRotations(final Pointysaurus entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/pointysaurus.png");
    }
}
