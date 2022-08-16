package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;

public class RenderEnchantedCow extends RenderLiving
{
    protected ModelCow model;
    private static final ResourceLocation texture3;
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    
    public RenderEnchantedCow(final ModelCow par1ModelBase, final float par2) {
        super(par1ModelBase, par2);
        this.model = (ModelCow)this.mainModel;
    }
    
    public void renderEnchantedCow(final RedCow par1EntityEnchantedCow, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityEnchantedCow, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderEnchantedCow((RedCow)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderEnchantedCow((RedCow)par1Entity, par2, par4, par6, par8, par9);
    }
    
    public int shouldRenderPass(final EntityLivingBase par1EntityLiving, final int par2, final float par3) {
        if (par1EntityLiving instanceof EnchantedCow && par2 == 3) {
            this.setRenderPassModel(this.model);
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            return 31;
        }
        return -1;
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        if (entity instanceof EnchantedCow) {
            return RenderEnchantedCow.texture2;
        }
        if (entity instanceof GoldCow) {
            return RenderEnchantedCow.texture2;
        }
        if (entity instanceof CrystalCow) {
            return RenderEnchantedCow.texture3;
        }
        return RenderEnchantedCow.texture1;
    }
    
    static {
        texture3 = new ResourceLocation("orespawn", "crystal_cow.png");
        texture1 = new ResourceLocation("orespawn", "red_cow.png");
        texture2 = new ResourceLocation("orespawn", "gold_cow.png");
    }
}
