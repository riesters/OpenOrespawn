package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderRockBase extends RenderLiving
{
    protected ModelRockBase model;
    private final float scale;
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture3;
    private static final ResourceLocation texture4;
    private static final ResourceLocation texture5;
    private static final ResourceLocation texture6;
    private static final ResourceLocation texture7;
    private static final ResourceLocation texture8;
    private static final ResourceLocation texture9;
    private static final ResourceLocation texture10;
    private static final ResourceLocation texture11;
    private static final ResourceLocation texture12;
    
    public RenderRockBase(final ModelRockBase par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelRockBase)this.mainModel;
        this.scale = par3;
    }
    
    public void renderRockBase(final RockBase par1EntityRockBase, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityRockBase, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRockBase((RockBase)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderRockBase((RockBase)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final RockBase r = (RockBase)entity;
        final int i = r.getRockType();
        if (i == 1) {
            return RenderRockBase.texture1;
        }
        if (i == 2) {
            return RenderRockBase.texture2;
        }
        if (i == 3) {
            return RenderRockBase.texture3;
        }
        if (i == 4) {
            return RenderRockBase.texture4;
        }
        if (i == 5) {
            return RenderRockBase.texture5;
        }
        if (i == 6) {
            return RenderRockBase.texture6;
        }
        if (i == 7) {
            return RenderRockBase.texture7;
        }
        if (i == 8) {
            return RenderRockBase.texture8;
        }
        if (i == 9) {
            return RenderRockBase.texture9;
        }
        if (i == 10) {
            return RenderRockBase.texture10;
        }
        if (i == 11) {
            return RenderRockBase.texture11;
        }
        if (i == 12) {
            return RenderRockBase.texture12;
        }
        return RenderRockBase.texture1;
    }
    
    static {
        texture1 = new ResourceLocation("orespawn", "Rocktexture.png");
        texture2 = new ResourceLocation("orespawn", "Rocktexture.png");
        texture3 = new ResourceLocation("orespawn", "RockRedtexture.png");
        texture4 = new ResourceLocation("orespawn", "RockGreentexture.png");
        texture5 = new ResourceLocation("orespawn", "RockBluetexture.png");
        texture6 = new ResourceLocation("orespawn", "RockPurpletexture.png");
        texture7 = new ResourceLocation("orespawn", "Rocktexture.png");
        texture8 = new ResourceLocation("orespawn", "RockTNTtexture.png");
        texture9 = new ResourceLocation("orespawn", "rockcrystaltexture.png");
        texture10 = new ResourceLocation("orespawn", "rockcrystalgreentexture.png");
        texture11 = new ResourceLocation("orespawn", "rockcrystalbluetexture.png");
        texture12 = new ResourceLocation("orespawn", "rockcrystaltnttexture.png");
    }
}
