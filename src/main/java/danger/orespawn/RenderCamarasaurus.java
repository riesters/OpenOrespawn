package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderCamarasaurus extends RenderLiving
{
    protected ModelCamarasaurus model;
    private final float scale;
    private static final ResourceLocation texture;
    
    public RenderCamarasaurus(final ModelCamarasaurus par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelCamarasaurus)this.mainModel;
        this.scale = par3;
    }
    
    public void renderCamarasaurus(final Camarasaurus par1EntityCamarasaurus, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityCamarasaurus, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderCamarasaurus((Camarasaurus)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderCamarasaurus((Camarasaurus)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final Camarasaurus par1Entity) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((Camarasaurus)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderCamarasaurus.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "camarasaurus.png");
    }
}
