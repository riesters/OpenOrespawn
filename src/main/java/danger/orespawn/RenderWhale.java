package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderWhale extends RenderLiving
{
    protected ModelWhale model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderWhale(final ModelWhale par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelWhale)this.mainModel;
        this.scale = par3;
    }
    
    public void renderWhale(final Whale par1EntityWhale, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityWhale, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderWhale((Whale)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderWhale((Whale)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Whale par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Whale)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderWhale.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Whaletexture.png");
    }
}
