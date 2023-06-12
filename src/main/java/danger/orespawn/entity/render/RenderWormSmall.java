package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderWormSmall extends RenderLiving<WormSmall>
{
    protected ModelWormSmall model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderWormSmall(final RenderManager manager) {
        super(manager, (ModelBase)new ModelWormSmall(), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelWormSmall)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final WormSmall entity) {
        return RenderWormSmall.texture;
    }
    
    protected void preRenderScale(final WormSmall par1Entity, final float par2) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final WormSmall entitylivingbaseIn, final float partialTickTime) {
        this.preRenderScale(entitylivingbaseIn, partialTickTime);
    }
    
    static {
        texture = new ResourceLocation("orespawn:textures/entity/wormsmalltexture.png");
    }
}
