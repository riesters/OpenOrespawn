package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderGodzilla extends RenderLiving
{
    protected ModelGodzilla model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderGodzilla(final ModelGodzilla par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelGodzilla)this.mainModel;
        this.scale = par3;
    }
    
    public void renderGodzilla(final Godzilla par1EntityGodzilla, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityGodzilla, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGodzilla((Godzilla)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGodzilla((Godzilla)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Godzilla par1Entity) {
        if (par1Entity != null && par1Entity.getPlayNicely() != 0) {
            GL11.glScalef(this.scale / 4.0f, this.scale / 4.0f, this.scale / 4.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Godzilla)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderGodzilla.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Godzillatexture.png");
    }
}
