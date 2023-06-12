package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderVelocityRaptor extends RenderLiving<VelocityRaptor>
{
    public RenderVelocityRaptor(final RenderManager rendermanagerIn) {
        super(rendermanagerIn, (ModelBase)new ModelVelocityRaptor(1.0f), 0.0f);
    }
    
    protected void preRenderCallback(final VelocityRaptor entitylivingbaseIn, final float partialTickTime) {
        GL11.glScalef(0.8f, 0.8f, 0.8f);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final VelocityRaptor entity) {
        return new ResourceLocation("orespawn:textures/entity/velocityraptor.png");
    }
}
