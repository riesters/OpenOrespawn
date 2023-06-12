package danger.orespawn.entity;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;

public class RedCow extends EntityCow
{
    public RedCow(final World world) {
        super(world);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2), var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.APPLE, 1);
        }
        super.dropFewItems(par1, par2);
    }
    
    public EntityCow createChild(final EntityAgeable entityageable) {
        return this.spawnBabyAnimal(entityageable);
    }
    
    public RedCow spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new RedCow(this.world);
    }
    
    protected void updateAITasks() {
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITasks();
    }
    
    protected boolean canDespawn() {
        return false;
    }
}
