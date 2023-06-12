package danger.orespawn.entity;

import net.minecraft.entity.projectile.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import danger.orespawn.items.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.item.*;
import danger.orespawn.init.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import javax.annotation.*;

public class EntityCage extends EntityThrowable
{
    public Class<? extends Entity> my_class;
    public String customName;
    private World throwerWorld;
    private EntityPlayer thrower;
    
    public EntityCage(final World world) {
        super(world);
        this.throwerWorld = null;
        this.thrower = null;
        this.throwerWorld = world;
    }
    
    public EntityCage(final World par1World, final EntityPlayer par2EntityLiving, final Class<? extends Entity> my_class, @Nullable final String customName) {
        super(par1World, (EntityLivingBase)par2EntityLiving);
        this.throwerWorld = null;
        this.thrower = null;
        this.throwerWorld = par1World;
        this.thrower = par2EntityLiving;
        this.my_class = my_class;
        this.customName = customName;
        if (this.thrower.world != null) {
            this.throwerWorld = this.thrower.world;
        }
    }
    
    @ParametersAreNonnullByDefault
    protected void onImpact(final RayTraceResult result) {
        if (this.my_class == null) {
            if (result.entityHit != null && this.rand.nextInt(10) >= 2) {
                if (this.throwerWorld != null) {
                    for (int var3 = 0; var3 < 4; ++var3) {
                        this.throwerWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, result.entityHit.posX, result.entityHit.posY + 0.25, result.entityHit.posZ, 0.0, 0.0, 0.0, new int[0]);
                        this.throwerWorld.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, result.entityHit.posX, result.entityHit.posY + 0.25, result.entityHit.posZ, 0.0, 0.0, 0.0, new int[0]);
                        this.throwerWorld.spawnParticle(EnumParticleTypes.REDSTONE, result.entityHit.posX, result.entityHit.posY + 0.25, result.entityHit.posZ, 0.0, 0.0, 0.0, new int[0]);
                    }
                    if (this.thrower != null) {
                        this.thrower.playSound(SoundEvents.ENTITY_GENERIC_EXPLODE, 1.0f, 1.5f);
                    }
                }
                final Entity hit = result.entityHit;
                if (hit instanceof EntityLiving) {
                    final CritterCage cc = CritterCage.getCageFromEntity(hit);
                    if (cc == null) {
                        return;
                    }
                    if (this.rand.nextFloat() < cc.getChance() && !this.world.isRemote) {
                        this.dropItem((Item)cc, 1);
                        ((EntityLiving)hit).setDropItemsWhenDead(false);
                        ((EntityLiving)hit).setDead();
                    }
                }
            }
        }
        else {
            result.getBlockPos();
            result.getBlockPos();
            BlockPos position = result.getBlockPos();
            if (result.entityHit != null) {
                position = result.entityHit.getPosition();
            }
            for (int i = 0; i < 6; ++i) {
                this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
                this.world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
                this.world.spawnParticle(EnumParticleTypes.REDSTONE, (double)(position.getX() + 0.5f), (double)(position.getY() + 1.25f), (double)(position.getZ() + 0.5f), 0.0, 0.0, 0.0, new int[] { 0 });
            }
            this.world.playSound(this.posX, this.posY, this.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 1.0f, 1.5f, true);
            final Entity summon = EntityList.newEntity((Class)this.my_class, this.world);
            System.out.println(summon);
            summon.setPosition((double)position.getX(), (double)(position.getY() + 1), (double)position.getZ());
            if (this.my_class == EntityHorse.class) {
                ((EntityHorse)summon).setHorseVariant(this.world.rand.nextInt());
            }
            this.world.spawnEntity(summon);
            final EntityItem empty = new EntityItem(this.world);
            empty.setItem(new ItemStack(ModItems.EMPTY_CAGE));
            empty.setPosition((double)position.getX(), (double)position.getY(), (double)position.getZ());
            this.world.spawnEntity((Entity)empty);
            if (summon instanceof EntityLiving && this.customName != null) {
                summon.setCustomNameTag(this.customName);
            }
        }
        if (!this.world.isRemote) {
            this.setDead();
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.throwerWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, new int[0]);
    }
}
