package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderWormLarge extends RenderLiving<WormLarge>
{
    protected ModelWormLarge model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderWormLarge(final RenderManager manager) {
        super(manager, (ModelBase)new ModelWormLarge(), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelWormLarge)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final WormLarge entity) {
        return RenderWormLarge.texture;
    }
    
    protected void preRenderScale(final WormLarge par1Entity, final float par2) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final WormLarge entitylivingbaseIn, final float partialTickTime) {
        this.preRenderScale(entitylivingbaseIn, partialTickTime);
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/wormlargetexture.png");
    }
}
