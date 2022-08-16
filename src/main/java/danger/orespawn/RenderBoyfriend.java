package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderBoyfriend extends RenderBiped
{
    protected ModelBiped model;
    
    public RenderBoyfriend(final ModelBiped par1ModelBase, final float par2) {
        super(par1ModelBase, par2);
        this.model = (ModelBiped)this.mainModel;
    }
    
    public void renderBoyfriend(final Boyfriend par1EntityBoyfriend, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender(par1EntityBoyfriend, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderBoyfriend((Boyfriend)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderBoyfriend((Boyfriend)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final Boyfriend g = (Boyfriend)entity;
        return g.getTexture();
    }
}
