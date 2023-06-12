package danger.orespawn.entity.render;

import danger.orespawn.entity.*;
import danger.orespawn.entity.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.util.*;
import javax.annotation.*;
import net.minecraft.entity.*;

public class RenderAlien extends RenderLiving<Alien>
{
    protected ModelAlien model;
    private float scale;
    
    public RenderAlien(final RenderManager manager) {
        super(manager, (ModelBase)new ModelAlien(0.1f), 0.0f);
        this.scale = 1.0f;
        this.model = (ModelAlien)this.mainModel;
    }
    
    @Nullable
    protected ResourceLocation getEntityTexture(final Alien entity) {
        return new ResourceLocation("orespawn:textures/entity/alien.png");
    }
}
