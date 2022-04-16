package danger.orespawn;

import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.world.World;

final class MyDispenserBehaviorSunspotUrchin extends BehaviorProjectileDispense {
  protected IProjectile getProjectileEntity(World par1World, IPosition par2IPosition) {
    SunspotUrchin entityarrow = new SunspotUrchin(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
    return (IProjectile)entityarrow;
  }
}
