package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRubberDucky extends RenderLiving
{
    protected ModelRubberDucky model;
    private final float scale;
    private static final ResourceLocation texture;
    private static final ResourceLocation texture2;
    
    public RenderRubberDucky(final ModelRubberDucky par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRubberDucky)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRubberDucky(final RubberDucky par1EntityRubberDucky, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRubberDucky, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRubberDucky((RubberDucky)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRubberDucky((RubberDucky)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final RubberDucky par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((RubberDucky)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        if (entity instanceof RubberDucky) {
            final RubberDucky d = (RubberDucky)entity;
            if (d.getKillCount() >= 5) {
                return RenderRubberDucky.texture2;
            }
        }
        return RenderRubberDucky.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "RubberDuckytexture.png");
        texture2 = new ResourceLocation("orespawn", "EvilRubberDuckytexture.png");
    }
}
