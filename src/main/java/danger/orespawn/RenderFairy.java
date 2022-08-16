package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderFairy extends RenderLiving
{
    protected ModelFairy model;
    private final float scale;
    
    public RenderFairy(final ModelFairy par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelFairy)this.mainModel;
        this.scale = par3;
    }
    
    public void renderFairy(final Fairy par1EntityFairy, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityFairy, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderFairy((Fairy)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderFairy((Fairy)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final Fairy a = (Fairy)entity;
        return a.getTexture();
    }
}
