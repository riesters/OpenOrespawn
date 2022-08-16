package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderGirlfriend extends RenderBiped
{
    protected ModelBiped model;
    
    public RenderGirlfriend(final ModelBiped par1ModelBase, final float par2) {
        super(par1ModelBase, par2);
        this.model = (ModelBiped)this.mainModel;
    }
    
    public void renderGirlfriend(final Girlfriend par1EntityGirlfriend, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityGirlfriend, par2, par4, par6, par8, par9);
    }
    
    public void preRenderCallback(final EntityLivingBase p_77041_1_, final float p_77041_2_) {
        if (OreSpawnMain.valentines_day != 0 && p_77041_1_ instanceof Girlfriend) {
            final Girlfriend gf = (Girlfriend)p_77041_1_;
            if (gf.feelingBetter == 0) {
                GL11.glScalef(5.0f, 5.0f, 5.0f);
            }
        }
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGirlfriend((Girlfriend)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderGirlfriend((Girlfriend)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final Girlfriend g = (Girlfriend)entity;
        return g.getTexture();
    }
}
