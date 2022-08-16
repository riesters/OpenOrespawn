package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderGammaMetroid extends RenderLiving
{
    protected ModelGammaMetroid model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderGammaMetroid(final ModelGammaMetroid par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelGammaMetroid)this.mainModel;
        this.scale = par3;
    }
    
    public void renderGammaMetroid(final GammaMetroid par1EntityGammaMetroid, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityGammaMetroid, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGammaMetroid((GammaMetroid)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGammaMetroid((GammaMetroid)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final GammaMetroid par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((GammaMetroid)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderGammaMetroid.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "GammaMetroid.png");
    }
}
