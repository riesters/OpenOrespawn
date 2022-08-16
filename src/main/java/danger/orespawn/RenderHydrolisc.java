package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderHydrolisc extends RenderLiving
{
    protected ModelHydrolisc model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderHydrolisc(final ModelHydrolisc par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelHydrolisc)this.mainModel;
        this.scale = par3;
    }
    
    public void renderHydrolisc(final Hydrolisc par1EntityHydrolisc, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityHydrolisc, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderHydrolisc((Hydrolisc)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderHydrolisc((Hydrolisc)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Hydrolisc par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Hydrolisc)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderHydrolisc.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "hydrolisc.png");
    }
}
