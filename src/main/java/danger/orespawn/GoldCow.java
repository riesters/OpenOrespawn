package danger.orespawn;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class GoldCow extends RedCow {
  public GoldCow(World world) {
    super(world);
  }
  
  protected void dropFewItems(boolean par1, int par2) {
    int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
    for (int var4 = 0; var4 < var3; var4++)
      dropItem(Items.apple, 1); 
    dropItem(Items.golden_apple, 1);
    super.dropFewItems(par1, par2);
  }
  
  public EntityCow createChild(EntityAgeable entityageable) {
    return spawnBabyAnimal(entityageable);
  }
  
  public GoldCow spawnBabyAnimal(EntityAgeable par1EntityAgeable) {
    return new GoldCow(this.worldObj);
  }
}
