package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderBrutalfly extends RenderLiving
{
    protected ModelBrutalfly model;
    private final float scale;
    private static final ResourceLocation overlay;
    private static final ResourceLocation texture;
    
    public RenderBrutalfly(final ModelBrutalfly par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelBrutalfly)this.mainModel;
        this.scale = par3;
    }
    
    public void renderBrutalfly(final Brutalfly par1Brutalfly, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1Brutalfly, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderBrutalfly((Brutalfly)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderBrutalfly((Brutalfly)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    public int shouldRenderPass(final EntityLivingBase par1EntityLiving, final int par2, final float par3) {
        GL11.glDepthMask(true);
        if (par2 == 1) {
            final float var4 = par1EntityLiving.ticksExisted + par3;
            this.bindTexture(RenderBrutalfly.overlay);
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            final float var5 = var4 * 0.01f;
            final float var6 = var4 * 0.01f;
            GL11.glTranslatef(var5, var6, 0.0f);
            this.setRenderPassModel(this.model);
            GL11.glMatrixMode(5888);
            GL11.glEnable(3042);
            final float var7 = 0.5f;
            GL11.glColor4f(var7, var7, var7, 1.0f);
            GL11.glDisable(2896);
            GL11.glBlendFunc(1, 1);
            return 1;
        }
        if (par2 == 2) {
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
        }
        return -1;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderBrutalfly.texture;
    }
    
    static {
        overlay = new ResourceLocation("orespawn", "Brutalfly_overlay2.png");
        texture = new ResourceLocation("orespawn", "Brutalflytexture.png");
    }
}
