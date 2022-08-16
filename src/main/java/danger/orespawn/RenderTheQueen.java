package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderTheQueen extends RenderLiving
{
    protected ModelTheQueen model;
    private final float scale;
    private static final ResourceLocation texture;
    private static final ResourceLocation texture2;
    
    public RenderTheQueen(final ModelTheQueen par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelTheQueen)this.mainModel;
        this.scale = par3;
    }
    
    public void renderTheQueen(final TheQueen par1EntityTheQueen, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityTheQueen, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderTheQueen((TheQueen)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderTheQueen((TheQueen)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final TheQueen par1Entity) {
        if (par1Entity != null && par1Entity.getPlayNicely() != 0) {
            GL11.glScalef(this.scale / 4.0f, this.scale / 4.0f, this.scale / 4.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((TheQueen)par1EntityLiving);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final TheQueen q = (TheQueen)entity;
        if (q.isHappy()) {
            return RenderTheQueen.texture2;
        }
        return RenderTheQueen.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "TheQueentexture.png");
        texture2 = new ResourceLocation("orespawn", "TheQueentexture2.png");
    }
}
