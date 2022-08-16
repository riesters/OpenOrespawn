package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderCrab extends RenderLiving
{
    protected ModelCrab model;
    private static final ResourceLocation texture;
    
    public RenderCrab(final ModelCrab par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelCrab)this.mainModel;
    }
    
    public void renderCrab(final Crab par1EntityCrab, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityCrab, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderCrab((Crab)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderCrab((Crab)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Crab par1Entity) {
        final float pscale = par1Entity.getCrabScale();
        GL11.glScalef(pscale, pscale, pscale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Crab)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderCrab.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "RobotCrabtexture.png");
    }
}
