package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.*;

public class Acid extends LaserBall
{
    private final int my_index;

    public Acid(final World par1World) {
        super(par1World);
        this.my_index = 85;
        super.setAcid();
    }
    
    public Acid(final World par1World, final EntityLivingBase par2EntityLiving) {
        super(par1World, par2EntityLiving);
        this.my_index = 85;
        super.setAcid();
    }
    
    public Acid(final World par1World, final double par2, final double par4, final double par6) {
        super(par1World, par2, par4, par6);
        this.my_index = 85;
        super.setAcid();
    }
    
    public int getAcidIndex() {
        return this.my_index;
    }
}
