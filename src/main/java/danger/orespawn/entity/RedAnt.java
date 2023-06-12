package danger.orespawn.entity;

import danger.orespawn.util.ai.*;
import danger.orespawn.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import javax.annotation.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import danger.orespawn.init.*;
import danger.orespawn.util.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;

public class RedAnt extends Ant
{
    int attack_delay;
    public double moveSpeed;
    
    public RedAnt(final World par1World) {
        super(par1World);
        this.attack_delay = 20;
        this.moveSpeed = 0.20000000298023224;
        this.setSize(0.2f, 0.2f);
        this.experienceValue = 1;
        this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0, false));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        if (OreSpawnMain.PlayNicely == 0) {
            this.targetTasks.addTask(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, (Class)EntityPlayer.class, true));
        }
    }
    
    @Nullable
    @Override
    public EntityAgeable createChild(final EntityAgeable ageable) {
        return null;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0);
    }
    
    @Override
    public int mygetMaxHealth() {
        return 2;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        return OreSpawnMain.OreSpawnRand.nextInt(15) == 0 && this.world.getDifficulty() != EnumDifficulty.PEACEFUL && par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 1.0f);
    }
    
    public boolean processInteract(final EntityPlayer player, final EnumHand hand) {
        final ItemStack itemstack = player.getHeldItem(hand);
        if (itemstack.isEmpty()) {
            if (player.dimension == DimensionType.OVERWORLD.getId()) {
                final BlockPos playerPos = player.getPosition();
                Teleport.teleportToDimension(player, ModDimensions.MINING.getId(), playerPos.getX(), playerPos.getY(), playerPos.getZ());
                player.dimension = ModDimensions.MINING.getId();
            }
            else {
                final BlockPos playerPos = player.getPosition();
                Teleport.teleportToDimension(player, DimensionType.OVERWORLD.getId(), playerPos.getX(), playerPos.getY(), playerPos.getZ());
                player.dimension = DimensionType.OVERWORLD.getId();
            }
        }
        return super.processInteract(player, hand);
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.isDead) {
            return;
        }
        if (this.attack_delay > 0) {
            --this.attack_delay;
        }
        if (this.attack_delay > 0) {
            return;
        }
        this.attack_delay = 20;
        if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return;
        }
        if (OreSpawnMain.PlayNicely != 0) {
            return;
        }
        final EntityLivingBase e = (EntityLivingBase)this.world.getClosestPlayerToEntity((Entity)this, 1.5);
        if (e != null) {
            this.attackEntityAsMob((Entity)e);
        }
    }
}
