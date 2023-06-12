package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderRedAnt extends RenderLiving<RedAnt>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderRedAnt(final RenderManager manager) {
        super(manager, (ModelBase)new ModelAnt(), 0.0f);
    }
    
    protected ResourceLocation getEntityTexture(final RedAnt entity) {
        return RenderRedAnt.TEXTURES;
    }
    
    protected void applyRotations(final RedAnt entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/red_ant.png");
    }
}
