package danger.orespawn.items;

import danger.orespawn.*;
import danger.orespawn.init.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import danger.orespawn.entity.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.*;
import java.util.*;

public class CritterCage extends Item
{
    private static final ArrayList<CritterCage> critterCages;
    private final float chance;
    Class<? extends Entity> entityClass;
    
    public CritterCage(final Class<? extends Entity> entityClass, final String unlocalizedName) {
        this(entityClass, unlocalizedName, 1.0f);
    }
    
    public CritterCage(final Class<? extends Entity> entityClass, final String unlocalizedName, final float chance) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(OreSpawnMain.OreSpawnTab);
        this.maxStackSize = 16;
        this.entityClass = entityClass;
        this.chance = chance;
        ModItems.ITEMS.add(this);
        CritterCage.critterCages.add(this);
    }
    
    public float getChance() {
        return this.chance;
    }
    
    public ActionResult<ItemStack> onItemRightClick(final World world, final EntityPlayer player, final EnumHand hand) {
        final ItemStack stack = player.getHeldItem(hand);
        final EnumActionResult result = this.handleRightClick(world, player, hand, player.getPosition(), false);
        if (result == EnumActionResult.SUCCESS && !player.isCreative()) {
            stack.shrink(1);
        }
        return (ActionResult<ItemStack>)new ActionResult(result, (Object)stack);
    }
    
    public EnumActionResult onItemUse(final EntityPlayer player, final World world, final BlockPos pos, final EnumHand hand, final EnumFacing blockside, final float p_180614_6_, final float p_180614_7_, final float p_180614_8_) {
        final EnumActionResult result = this.handleRightClick(world, player, hand, pos, true);
        if (result != EnumActionResult.FAIL && !player.isCreative()) {
            player.getHeldItem(hand).shrink(1);
        }
        return result;
    }
    
    private EnumActionResult handleRightClick(final World world, final EntityPlayer entityPlayer, final EnumHand hand, final BlockPos position, final boolean clickingOnBlock) {
        if (this.entityClass == null) {
            if (!world.isRemote) {
                final EntityCage ec = new EntityCage(world, entityPlayer, this.entityClass, null);
                ec.shoot((Entity)entityPlayer, entityPlayer.rotationPitch, entityPlayer.rotationYaw, 0.0f, 1.5f, 1.0f);
                world.spawnEntity((Entity)ec);
            }
            world.playSound(entityPlayer, entityPlayer.getPosition(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 1.0f, 1.5f);
            return EnumActionResult.SUCCESS;
        }
        if (world.isRemote) {
            return EnumActionResult.SUCCESS;
        }
        if (clickingOnBlock) {
            for (int i = 0; i < 6; ++i) {
                world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
                world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
                world.spawnParticle(EnumParticleTypes.REDSTONE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
            }
            world.playSound(entityPlayer, position, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 1.0f, 1.5f);
            final Entity summon = EntityList.newEntity((Class)this.entityClass, world);
            summon.setPosition((double)(position.getX() + 0.5f), (double)(position.getY() + 1), (double)(position.getZ() + 0.5f));
            if (this.entityClass == EntityHorse.class) {
                ((EntityHorse)summon).setHorseVariant(world.rand.nextInt());
            }
            world.spawnEntity(summon);
            final EntityItem empty = new EntityItem(world);
            empty.setItem(new ItemStack(ModItems.EMPTY_CAGE));
            empty.setPosition((double)position.getX(), (double)position.getY(), (double)position.getZ());
            world.spawnEntity((Entity)empty);
            final ItemStack stack = entityPlayer.getHeldItem(hand);
            if (summon instanceof EntityLiving && stack.hasDisplayName()) {
                summon.setCustomNameTag(stack.getDisplayName());
            }
            return EnumActionResult.SUCCESS;
        }
        if (!world.isRemote) {
            String name = null;
            if (entityPlayer.getHeldItem(hand).hasDisplayName()) {
                name = entityPlayer.getHeldItem(hand).getDisplayName();
            }
            final EntityCage ec2 = new EntityCage(world, entityPlayer, this.entityClass, name);
            ec2.shoot((Entity)entityPlayer, entityPlayer.rotationPitch, entityPlayer.rotationYaw, 0.0f, 1.5f, 1.0f);
            world.spawnEntity((Entity)ec2);
        }
        world.playSound(entityPlayer, entityPlayer.getPosition(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 1.0f, 1.5f);
        return EnumActionResult.SUCCESS;
    }
    
    public static CritterCage getCageFromEntity(final Entity e) {
        for (final CritterCage cc : CritterCage.critterCages) {
            if (cc.entityClass == e.getClass()) {
                return cc;
            }
        }
        return null;
    }
    
    static {
        critterCages = new ArrayList<CritterCage>();
    }
}
