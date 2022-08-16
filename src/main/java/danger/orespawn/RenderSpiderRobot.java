package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderSpiderRobot extends RenderLiving
{
    protected ModelSpiderRobot model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderSpiderRobot(final ModelSpiderRobot par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelSpiderRobot)this.mainModel;
        this.scale = par3;
    }
    
    public void renderSpiderRobot(final SpiderRobot par1EntitySpiderRobot, final double par2, final double par4, final double par6, final float par8) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glRotatef(180.0f - par8, 0.0f, 1.0f, 0.0f);
        this.bindTexture(RenderSpiderRobot.texture);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        this.model.render(par1EntitySpiderRobot, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderSpiderRobot((SpiderRobot)par1EntityLiving, par2, par4, par6, par8);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderSpiderRobot((SpiderRobot)par1Entity, par2, par4, par6, par8);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderSpiderRobot.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "SpiderRobottexture.png");
    }
}
