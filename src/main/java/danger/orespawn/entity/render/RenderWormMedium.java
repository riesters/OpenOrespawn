package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderWormMedium extends RenderLiving<WormMedium>
{
    protected ModelWormMedium model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderWormMedium(final RenderManager manager) {
        super(manager, (ModelBase)new ModelWormMedium(), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelWormMedium)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final WormMedium entity) {
        return RenderWormMedium.texture;
    }
    
    protected void preRenderScale(final WormMedium par1Entity, final float par2) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final WormMedium entitylivingbaseIn, final float partialTickTime) {
        this.preRenderScale(entitylivingbaseIn, partialTickTime);
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/wormmediumtexture.png");
    }
}
