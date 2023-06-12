package danger.orespawn.entity.render;

import net.minecraft.entity.passive.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import danger.orespawn.entity.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderEnchantedCow extends RenderLiving<EntityCow>
{
    protected ModelCow model;
    private static final ResourceLocation texture1;
    private static final ResourceLocation texture2;
    private static final ResourceLocation texture3;
    
    public RenderEnchantedCow(final RenderManager manager) {
        super(manager, (ModelBase)new ModelCow(), 0.0f);
        this.model = (ModelCow)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final EntityCow entity) {
        if (entity instanceof RedCow) {
            return RenderEnchantedCow.texture1;
        }
        return RenderEnchantedCow.texture1;
    }
    
    static {
        texture1 = new ResourceLocation("orespawn:textures/entity/red_cow.png");
        texture2 = new ResourceLocation("orespawn", "gold_cow.png");
        texture3 = new ResourceLocation("orespawn", "crystal_cow.png");
    }
}
