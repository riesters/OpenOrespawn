package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderKraken extends RenderLiving
{
    protected ModelKraken model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderKraken(final ModelKraken par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelKraken)this.mainModel;
        this.scale = par3;
    }
    
    public void renderKraken(final Kraken par1EntityKraken, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityKraken, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderKraken((Kraken)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderKraken((Kraken)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Kraken par1Entity) {
        if (par1Entity != null && par1Entity.getPlayNicely() != 0) {
            GL11.glScalef(this.scale / 3.0f, this.scale / 3.0f, this.scale / 3.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Kraken)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderKraken.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Kraken.png");
    }
}
