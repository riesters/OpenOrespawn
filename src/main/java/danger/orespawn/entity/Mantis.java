package danger.orespawn.entity;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;

public class Mantis extends EntityMob
{
    public Mantis(final World worldIn) {
        super(worldIn);
    }
    
    public final int getAttacking() {
        return 0;
    }
}
