package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderCryolophosaurus extends RenderLiving<Cryolophosaurus>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderCryolophosaurus(final RenderManager manager) {
        super(manager, (ModelBase)new ModelCryolophosaurus(1.5f), 0.3f);
    }
    
    protected ResourceLocation getEntityTexture(final Cryolophosaurus entity) {
        return RenderCryolophosaurus.TEXTURES;
    }
    
    protected void applyRotations(final Cryolophosaurus entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/cryolophosaurus.png");
    }
}
