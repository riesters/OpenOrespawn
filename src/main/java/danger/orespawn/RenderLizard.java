package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderLizard extends RenderLiving
{
    protected ModelLizard model;
    private final float scale;
    private static final ResourceLocation texture;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture3;
    
    public RenderLizard(final ModelLizard par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelLizard)this.mainModel;
        this.scale = par3;
    }
    
    public void renderLizard(final Lizard par1EntityLizard, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityLizard, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderLizard((Lizard)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderLizard((Lizard)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Lizard par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Lizard)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        if (entity instanceof EntityCannonFodder) {
            final EntityCannonFodder c = (EntityCannonFodder)entity;
            if (c.get_is_activated() != 0) {
                if (c.getHatColor() == 2) {
                    return RenderLizard.texture2;
                }
                if (c.getHatColor() == 3) {
                    return RenderLizard.texture3;
                }
            }
        }
        return RenderLizard.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Lizard.png");
        texture2 = new ResourceLocation("orespawn", "Lizard2.png");
        texture3 = new ResourceLocation("orespawn", "Lizard3.png");
    }
}
