package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class RenderCamarasaurus extends RenderLiving<Camarasaurus>
{
    public static final ResourceLocation TEXTURES;
    
    public RenderCamarasaurus(final RenderManager manager) {
        super(manager, (ModelBase)new ModelCamarasaurus(1.5f), 0.5f);
    }
    
    protected ResourceLocation getEntityTexture(final Camarasaurus entity) {
        return RenderCamarasaurus.TEXTURES;
    }
    
    protected void applyRotations(final Camarasaurus entityLiving, final float p_77043_2_, final float rotationYaw, final float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
    
    static {
        TEXTURES = new ResourceLocation("orespawn:textures/entity/camarasaurus.png");
    }
}
