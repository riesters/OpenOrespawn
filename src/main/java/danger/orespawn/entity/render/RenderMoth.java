package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import net.minecraft.util.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderMoth extends RenderLiving<Moth>
{
    ResourceLocation TEXTURE1;
    ResourceLocation TEXTURE2;
    ResourceLocation TEXTURE3;
    ResourceLocation TEXTURE4;
    protected ModelButterfly model;
    private float scale;
    
    public RenderMoth(final RenderManager manager) {
        super(manager, (ModelBase)new ModelButterfly(0.6f, 1.5f), 0.0f);
        this.TEXTURE1 = new ResourceLocation("orespawn:textures/entity/lunamoth.png");
        this.TEXTURE2 = new ResourceLocation("orespawn:textures/entity/eyemoth.png");
        this.TEXTURE3 = new ResourceLocation("orespawn:textures/entity/firemoth.png");
        this.TEXTURE4 = new ResourceLocation("orespawn:textures/entity/darkmoth.png");
        this.scale = 1.0f;
        this.model = (ModelButterfly)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Moth entity) {
        switch (entity.moth_type) {
            case 0: {
                return this.TEXTURE1;
            }
            case 1: {
                return this.TEXTURE2;
            }
            case 2: {
                return this.TEXTURE3;
            }
            default: {
                return this.TEXTURE4;
            }
        }
    }
}
