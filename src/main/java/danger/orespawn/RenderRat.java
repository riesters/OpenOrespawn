package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRat extends RenderLiving
{
    protected ModelRat model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderRat(final ModelRat par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRat)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRat(final Rat par1EntityRat, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRat, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRat((Rat)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRat((Rat)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderRat.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Rattexture.png");
    }
}
