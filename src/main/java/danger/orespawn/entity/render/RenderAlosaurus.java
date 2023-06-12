package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderAlosaurus extends RenderLiving<Alosaurus>
{
    public static final ResourceLocation TEXTURES;

    public RenderAlosaurus(final RenderManager manager) {
        super(manager, (ModelBase)new ModelAlosaurus(1.5f), 0.0f);
    }

    protected ResourceLocation getEntityTexture(final Alosaurus entity) {
        return RenderAlosaurus.TEXTURES;
    }

    protected void applyRotations(final Alosaurus entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/alosaurus.png");
    }
}
