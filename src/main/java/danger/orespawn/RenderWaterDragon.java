package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderWaterDragon extends RenderLiving
{
    protected ModelWaterDragon model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderWaterDragon(final ModelWaterDragon par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelWaterDragon)this.mainModel;
        this.scale = par3;
    }
    
    public void renderWaterDragon(final WaterDragon par1EntityWaterDragon, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityWaterDragon, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderWaterDragon((WaterDragon)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderWaterDragon((WaterDragon)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final WaterDragon par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((WaterDragon)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderWaterDragon.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "WaterDragon.png");
    }
}
