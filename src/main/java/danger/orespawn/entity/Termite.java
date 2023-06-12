package danger.orespawn.entity;

import net.minecraft.entity.ai.*;
import danger.orespawn.util.ai.*;
import danger.orespawn.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class Termite extends Ant
{
    int attack_delay;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Termite(final World par1World) {
        super(par1World);
        this.attack_delay = 20;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(0.2f, 0.2f);
        this.moveSpeed = 0.20000000298023224;
        this.experienceValue = 1;
        this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 8, 1.0));
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0);
    }
    
    @Override
    public int mygetMaxHealth() {
        return 5;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        if (OreSpawnMain.OreSpawnRand.nextInt(15) != 0) {
            return false;
        }
        if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return false;
        }
        final boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 1.0f);
        return var4;
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
        final EntityLivingBase e = (EntityLivingBase)this.world.getNearestAttackablePlayer((Entity)this, 1.5, 1.5);
        if (e != null) {
            this.attackEntityAsMob((Entity)e);
        }
    }
    
    private boolean isWood(final Block bid) {
        return bid == Blocks.LOG || (bid == Blocks.OAK_FENCE || bid == Blocks.OAK_FENCE_GATE || bid == Blocks.STANDING_SIGN || bid == Blocks.BIRCH_FENCE || bid == Blocks.BIRCH_FENCE_GATE || bid == Blocks.ACACIA_FENCE || bid == Blocks.ACACIA_FENCE_GATE || bid == Blocks.JUNGLE_FENCE || bid == Blocks.JUNGLE_FENCE_GATE || bid == Blocks.SPRUCE_FENCE || bid == Blocks.SPRUCE_FENCE_GATE || bid == Blocks.DARK_OAK_FENCE || bid == Blocks.DARK_OAK_FENCE_GATE || bid == Blocks.DOUBLE_WOODEN_SLAB || bid == Blocks.BED || bid == Blocks.ACACIA_STAIRS || bid == Blocks.OAK_STAIRS || bid == Blocks.DARK_OAK_STAIRS || bid == Blocks.BIRCH_STAIRS || bid == Blocks.JUNGLE_STAIRS || bid == Blocks.ACACIA_DOOR || bid == Blocks.OAK_DOOR || bid == Blocks.DARK_OAK_DOOR || bid == Blocks.BIRCH_DOOR || bid == Blocks.JUNGLE_DOOR || bid == Blocks.SPRUCE_DOOR || bid == Blocks.SPRUCE_STAIRS || bid == Blocks.WOODEN_PRESSURE_PLATE || bid == Blocks.WOODEN_SLAB || bid == Blocks.BOOKSHELF || bid == Blocks.CRAFTING_TABLE);
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + dx, y + i, z + j)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x - dx, y + i, z + j)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x - dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + dy, z + j)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y - dy, z + j)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y - dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dy; j <= dy; ++j) {
                Block bid = this.world.getBlockState(new BlockPos(x + i, y + j, z + dz)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.world.getBlockState(new BlockPos(x + i, y + j, z - dz)).getBlock();
                if (this.isWood(bid)) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z - dz;
                        ++found;
                    }
                }
            }
        }
        return found != 0;
    }
    
    @Override
    public void updateAITick() {
        if (this.isDead) {
            return;
        }
        if (this.world.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (this.world.rand.nextInt(200) == 1 && OreSpawnMain.PlayNicely == 0) {
            this.closest = 99999;
            final int tx = 0;
            this.tz = tx;
            this.ty = tx;
            this.tx = tx;
            for (int i = 1; i < 8; ++i) {
                int j = i;
                if (j > 4) {
                    j = 4;
                }
                if (this.scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 5) {
                    ++i;
                }
            }
            int i = 0;
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                if (this.closest < 6) {
                    if (this.world.rand.nextInt(3) != 0) {
                        if (this.world.getGameRules().getBoolean("mobGriefing")) {
                            this.world.setBlockState(new BlockPos(this.tx, this.ty, this.tz), Blocks.DIRT.getDefaultState());
                        }
                        if (this.findBuddies() < 10) {
                            spawnCreature(this.world, "Termite", this.posX + 0.10000000149011612, this.posY + 0.10000000149011612, this.posZ + 0.10000000149011612);
                        }
                    }
                    else {
                        if (this.world.getGameRules().getBoolean("mobGriefing")) {
                            this.world.setBlockToAir(new BlockPos(this.tx, this.ty, this.tz));
                        }
                        if (this.findBuddies() < 10) {
                            spawnCreature(this.world, "Termite", this.tx + 0.1f, this.ty + 0.1f, this.tz + 0.1f);
                        }
                    }
                    this.heal(1.0f);
                }
            }
        }
        super.updateAITick();
    }
    
    private int findBuddies() {
        final List var5 = this.world.getEntitiesWithinAABB((Class)Termite.class, this.getEntityBoundingBox().expand(3.0, 3.0, 3.0));
        return var5.size();
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        var8 = EntityList.createEntityByIDFromName(new ResourceLocation(par1), par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntity(var8);
        }
        return var8;
    }
}
