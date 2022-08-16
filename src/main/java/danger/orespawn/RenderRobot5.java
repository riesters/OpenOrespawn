package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRobot5 extends RenderLiving
{
    protected ModelRobot5 model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderRobot5(final ModelRobot5 par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRobot5)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRobot5(final Robot5 par1EntityRobot5, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRobot5, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot5((Robot5)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot5((Robot5)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderRobot5.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Robot5texture.png");
    }
}
