package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderGammaMetroid extends RenderLiving<GammaMetroid>
{
    protected ModelGammaMetroid model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderGammaMetroid(final RenderManager renderManager) {
        super(renderManager, (ModelBase)new ModelGammaMetroid(1.0f), 0.0f);
        this.scale = 1.0f;
    }
    
    protected void preRenderScale(final GammaMetroid par1Entity, final float par2) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final GammaMetroid entity) {
        return RenderGammaMetroid.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/gammametroid.png");
    }
}
