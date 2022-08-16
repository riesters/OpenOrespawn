package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;

public class CrystalCow extends RedCow
{
    public CrystalCow(final World world) {
        super(world);
    }
    
    @Override
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2), var4 = 0; var4 < var3; ++var4) {
            this.dropItem(OreSpawnMain.MyCrystalApple, 1);
        }
        this.dropItem(Items.apple, 1);
        super.dropFewItems(par1, par2);
    }
    
    @Override
    public EntityCow createChild(final EntityAgeable entityageable) {
        return this.spawnBabyAnimal(entityageable);
    }
    
    @Override
    public CrystalCow spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new CrystalCow(this.worldObj);
    }
}
