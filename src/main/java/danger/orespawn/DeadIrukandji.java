package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.*;

public class DeadIrukandji extends LaserBall
{
    private final int my_index;
    
    public DeadIrukandji(final World par1World) {
        super(par1World);
        this.my_index = 86;
        super.setIrukandji();
    }

    public DeadIrukandji(final World par1World, final int par2) {
        super(par1World);
        this.my_index = 86;
        super.setIrukandji();
    }
    
    public DeadIrukandji(final World par1World, final EntityLivingBase par2EntityLiving) {
        super(par1World, par2EntityLiving);
        this.my_index = 86;
        super.setIrukandji();
    }

    public DeadIrukandji(final World par1World, final EntityLivingBase par2EntityLiving, final int par3) {
        super(par1World, par2EntityLiving);
        this.my_index = 86;
        super.setIrukandji();
    }
    
    public DeadIrukandji(final World par1World, final double par2, final double par4, final double par6) {
        super(par1World, par2, par4, par6);
        this.my_index = 86;
        super.setIrukandji();
    }
    
    public int getIrukandjiIndex() {
        return this.my_index;
    }
}
