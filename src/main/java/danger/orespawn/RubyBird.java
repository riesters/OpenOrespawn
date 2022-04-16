package danger.orespawn;

import net.minecraft.world.World;

public class RubyBird extends Cockateil {
  public RubyBird(World par1World) {
    super(par1World);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.birdtype = 5;
    setBirdType(this.birdtype);
    setFlyUp();
  }
  
  protected String getLivingSound() {
    if (this.worldObj.isDaytime() && !this.worldObj.isRaining())
      return "orespawn:rubybird"; 
    return null;
  }
  
  public boolean getCanSpawnHere() {
    return true;
  }
}
