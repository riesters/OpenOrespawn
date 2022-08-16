package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderMolenoid extends RenderLiving
{
    protected ModelMolenoid model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderMolenoid(final ModelMolenoid par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelMolenoid)this.mainModel;
        this.scale = par3;
    }
    
    public void renderMolenoid(final Molenoid par1EntityMolenoid, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityMolenoid, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderMolenoid((Molenoid)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderMolenoid((Molenoid)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderMolenoid.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Molenoidtexture.png");
    }
}
