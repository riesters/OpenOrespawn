package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRobot2 extends RenderLiving
{
    protected ModelRobot2 model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderRobot2(final ModelRobot2 par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRobot2)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRobot2(final Robot2 par1EntityRobot2, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRobot2, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot2((Robot2)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRobot2((Robot2)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderRobot2.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Robot2.png");
    }
}
