package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRobot4 extends RenderLiving
{
    protected ModelRobot4 model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderRobot4(final ModelRobot4 par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRobot4)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRobot4(final Robot4 par1EntityRobot4, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRobot4, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot4((Robot4)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot4((Robot4)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderRobot4.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Robot4.png");
    }
}
