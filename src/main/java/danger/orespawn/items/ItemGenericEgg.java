package danger.orespawn.items;

import net.minecraft.item.*;
import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class ItemGenericEgg extends Item
{
    Class<? extends Entity> entityClass;
    
    public ItemGenericEgg(final String name, final Class<? extends Entity> entityClass) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.entityClass = entityClass;
        ModItems.ITEMS.add(this);
    }
    
    public EnumActionResult onItemUse(final EntityPlayer player, final World worldIn, final BlockPos pos, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
        if (worldIn.isRemote) {
            return EnumActionResult.SUCCESS;
        }
        final Entity entity = EntityList.newEntity((Class)this.entityClass, worldIn);
        assert entity != null;
        entity.setPosition((double)pos.getX(), (double)(pos.getY() + 1), (double)pos.getZ());
        worldIn.spawnEntity(entity);
        ((EntityLiving)entity).playLivingSound();
        if (!player.isCreative()) {
            player.getHeldItem(hand).shrink(1);
        }
        return EnumActionResult.SUCCESS;
    }
}
