package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderStinky extends RenderLiving
{
    protected ModelStinky model;
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
    private static final ResourceLocation texture13;
    private static final ResourceLocation texture14;
    private static final ResourceLocation texture15;
    private static final ResourceLocation texture16;
    private static final ResourceLocation texture17;
    private static final ResourceLocation texture18;
    private static final ResourceLocation texture19;
    
    public RenderStinky(final ModelStinky par1ModelBase, final float par2, final float par3) {
        super(par1ModelBase, par2 * par3);
        this.model = (ModelStinky)this.mainModel;
        this.scale = par3;
    }
    
    public void renderStinky(final Stinky par1EntityStinky, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityStinky, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderStinky((Stinky)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderStinky((Stinky)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale() {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final Stinky s = (Stinky)entity;
        final int i = s.getSkin();
        if (i == 1) {
            return RenderStinky.texture2;
        }
        if (i == 2) {
            return RenderStinky.texture3;
        }
        if (i == 3) {
            return RenderStinky.texture4;
        }
        if (i == 4) {
            return RenderStinky.texture5;
        }
        if (i == 5) {
            return RenderStinky.texture6;
        }
        if (i == 6) {
            return RenderStinky.texture7;
        }
        if (i == 7) {
            return RenderStinky.texture8;
        }
        if (i == 8) {
            return RenderStinky.texture9;
        }
        if (i == 9) {
            return RenderStinky.texture10;
        }
        if (i == 10) {
            return RenderStinky.texture11;
        }
        if (i == 11) {
            return RenderStinky.texture12;
        }
        if (i == 12) {
            return RenderStinky.texture13;
        }
        if (i == 13) {
            return RenderStinky.texture14;
        }
        if (i == 14) {
            return RenderStinky.texture15;
        }
        if (i == 15) {
            return RenderStinky.texture16;
        }
        if (i == 16) {
            return RenderStinky.texture17;
        }
        if (i == 17) {
            return RenderStinky.texture18;
        }
        if (i == 18) {
            return RenderStinky.texture19;
        }
        return RenderStinky.texture1;
    }
    
    static {
        texture1 = new ResourceLocation("orespawn", "Stinkytexture1.png");
        texture2 = new ResourceLocation("orespawn", "Stinkytexture2.png");
        texture3 = new ResourceLocation("orespawn", "Stinkytexture3.png");
        texture4 = new ResourceLocation("orespawn", "Stinkytexture4.png");
        texture5 = new ResourceLocation("orespawn", "Stinkytexture5.png");
        texture6 = new ResourceLocation("orespawn", "Stinkytexture6.png");
        texture7 = new ResourceLocation("orespawn", "Stinkytexture7.png");
        texture8 = new ResourceLocation("orespawn", "Stinkytexture8.png");
        texture9 = new ResourceLocation("orespawn", "Stinkytexture9.png");
        texture10 = new ResourceLocation("orespawn", "Stinkytexture10.png");
        texture11 = new ResourceLocation("orespawn", "Stinkytexture11.png");
        texture12 = new ResourceLocation("orespawn", "Stinkytexture12.png");
        texture13 = new ResourceLocation("orespawn", "Stinkytexture13.png");
        texture14 = new ResourceLocation("orespawn", "Stinkytexture14.png");
        texture15 = new ResourceLocation("orespawn", "Stinkytexture15.png");
        texture16 = new ResourceLocation("orespawn", "Stinkytexture16.png");
        texture17 = new ResourceLocation("orespawn", "Stinkytexture17.png");
        texture18 = new ResourceLocation("orespawn", "Stinkytexture18.png");
        texture19 = new ResourceLocation("orespawn", "Stinkytexture19.png");
    }
}
