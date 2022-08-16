package danger.orespawn;

import net.minecraft.entity.ai.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.passive.*;
import java.util.*;

public class MyEntityAIDance extends EntityAIBase
{
    private final Girlfriend thePet;
    World theWorld;
    public int ticker;
    public int dance_move;
    public int is_dancing;
    
    public MyEntityAIDance(final Girlfriend par1EntityTameable) {
        this.ticker = 0;
        this.dance_move = 0;
        this.is_dancing = 0;
        this.thePet = par1EntityTameable;
        this.theWorld = par1EntityTameable.worldObj;
    }
    
    public boolean is_dance_block(final Block bid) {
        return bid == Blocks.gold_block || bid == Blocks.diamond_block || bid == Blocks.emerald_block || bid == OreSpawnMain.MyBlockRubyBlock || bid == OreSpawnMain.MyBlockAmethystBlock || bid == OreSpawnMain.MyBlockTitaniumBlock || bid == OreSpawnMain.MyBlockUraniumBlock;
    }
    
    public boolean shouldExecute() {
        if (this.thePet.isSitting()) {
            return false;
        }
        long t = this.theWorld.getWorldTime();
        t %= 24000L;
        if (t < 14000L || t > 22000L) {
            return false;
        }
        int ic;
        ic = 0;
        for (int i = -3; i < 4; ++i) {
            for (int j = -3; j < 4; ++j) {
                final Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
                if (this.is_dance_block(bid)) {
                    ++ic;
                }
            }
        }
        return ic != 0;
    }
    
    public boolean continueExecuting() {
        if (this.thePet.isSitting()) {
            return false;
        }
        long t = this.theWorld.getWorldTime();
        t %= 24000L;
        if (t < 14000L || t > 22000L) {
            return false;
        }
        int ic;
        int ix;
        int iz = ix = (ic = 0);
        for (int i = -3; i < 4; ++i) {
            for (int j = -3; j < 4; ++j) {
                final Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
                if (this.is_dance_block(bid)) {
                    ++ic;
                    ix += i;
                    iz += j;
                }
            }
        }
        if (ic == 0) {
            return false;
        }
        ix /= ic;
        iz /= ic;
        if (ic < 40) {
            this.thePet.getNavigator().tryMoveToXYZ((int)this.thePet.posX + ix, (int)this.thePet.posY, (int)this.thePet.posZ + iz, 1.0);
        }
        else if (this.theWorld.rand.nextInt(3) == 1) {
            this.thePet.getNavigator().tryMoveToXYZ((int)this.thePet.posX, (int)this.thePet.posY, (int)this.thePet.posZ, 1.0);
        }
        this.is_dancing = 1;
        return true;
    }
    
    public void startExecuting() {
        this.thePet.setSneaking(false);
        this.ticker = 0;
        this.dance_move = 0;
        this.is_dancing = 1;
        int ic;
        int ix;
        int iz = ix = (ic = 0);
        for (int i = -3; i < 4; ++i) {
            for (int j = -3; j < 4; ++j) {
                final Block bid = this.theWorld.getBlock((int)this.thePet.posX + i, (int)this.thePet.posY - 1, (int)this.thePet.posZ + j);
                if (this.is_dance_block(bid)) {
                    ++ic;
                    ix += i;
                    iz += j;
                }
            }
        }
        if (ic > 0) {
            ix /= ic;
            iz /= ic;
            if (ic < 40) {
                this.thePet.getNavigator().tryMoveToXYZ((int)this.thePet.posX + ix, (int)this.thePet.posY, (int)this.thePet.posZ + iz, 1.0);
            }
        }
    }
    
    public void resetTask() {
        this.thePet.setSneaking(false);
        this.ticker = 0;
        this.dance_move = 0;
        this.is_dancing = 0;
    }

    public void updateTask() {
        int cycle = 20;
        int halfc = cycle / 2;
        int mover = cycle * 8;
        int tempid = this.thePet.getEntityId();
        AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(this.thePet.posX - 4.0D, this.thePet.posY - 3.0D, this.thePet.posZ - 4.0D, this.thePet.posX + 4.0D, this.thePet.posY + 3.0D, this.thePet.posZ + 4.0D);
        List var5 = this.theWorld.getEntitiesWithinAABB(Girlfriend.class, bb);
        for (Girlfriend var3 : (Iterable<Girlfriend>) var5) {
            if (var3.getEntityId() < tempid) {
                if (var3.Dance.is_dancing == 1) {
                    this.ticker = var3.Dance.ticker;
                    this.dance_move = var3.Dance.dance_move;
                }
                tempid = var3.getEntityId();
            }
        }
        this.ticker++;
        if (this.dance_move == 0) {
            this.dance_move = 1 + this.theWorld.rand.nextInt(10);
            this.thePet.motionX = 0.0D;
            this.thePet.motionZ = 0.0D;
            this.ticker = 0;
            this.thePet.setSneaking(false);
        }
        switch (this.dance_move) {
            case 1:
                move_it(this.thePet, this.ticker, cycle, 0);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 2:
                move_it(this.thePet, this.ticker, cycle, 1);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 3:
                this.thePet.setSneaking(this.ticker % cycle >= halfc);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 4:
                if (this.ticker % halfc == 1) {
                    this.thePet.swingItem();
                    this.thePet.motionY = 0.25D;
                }
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 5:
                if (this.ticker % halfc == 1)
                    this.thePet.swingItem();
                move_it(this.thePet, this.ticker, cycle, 0);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 6:
                if (this.ticker % halfc == 1)
                    this.thePet.swingItem();
                move_it(this.thePet, this.ticker, cycle, 1);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 7:
                this.thePet.setSneaking(this.ticker % cycle >= halfc);
                move_it(this.thePet, this.ticker, cycle, 0);
                move_it(this.thePet, this.ticker, cycle, 2);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 8:
                this.thePet.setSneaking(this.ticker % cycle >= halfc);
                move_it(this.thePet, this.ticker, cycle, 1);
                move_it(this.thePet, this.ticker, cycle, 2);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 9:
                this.thePet.setSneaking(this.ticker % cycle >= halfc);
                if (this.ticker % halfc == 1)
                    this.thePet.swingItem();
                move_it(this.thePet, this.ticker, cycle, 0);
                move_it(this.thePet, this.ticker, cycle, 3);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
            case 10:
                if (this.ticker % cycle < halfc) {
                    this.thePet.setSneaking(false);
                    this.thePet.motionY = 0.25D;
                } else {
                    this.thePet.setSneaking(true);
                }
                if (this.ticker % halfc == 1)
                    this.thePet.swingItem();
                move_it(this.thePet, this.ticker, cycle, 1);
                move_it(this.thePet, this.ticker, cycle, 3);
                if (this.ticker > mover)
                    this.dance_move = 0;
                return;
        }
        this.dance_move = 0;
    }
    
    private void move_it(final EntityTameable et, int t, final int cycle, final int dir) {
        float dirx = 0.0f;
        float dirz = 0.0f;
        float dirYaw = 0.0f;
        float dirYawH = 0.0f;
        switch (dir) {
            case 0: {
                dirx = 0.02f;
                dirz = 0.0f;
                dirYaw = 0.0f;
                dirYawH = 0.0f;
                break;
            }
            case 1: {
                dirx = 0.0f;
                dirz = 0.02f;
                dirYaw = 0.0f;
                dirYawH = 0.0f;
                break;
            }
            case 2: {
                dirx = 0.0f;
                dirz = 0.0f;
                dirYaw = 10.0f;
                dirYawH = 0.0f;
                break;
            }
            case 3: {
                dirx = 0.0f;
                dirz = 0.0f;
                dirYaw = 0.0f;
                dirYawH = 10.0f;
                break;
            }
        }
        t %= cycle;
        if (t >= cycle / 2) {
            dirx = -dirx;
            dirz = -dirz;
            dirYaw = -dirYaw;
            dirYawH = -dirYawH;
        }
        t %= cycle / 2;
        if (t >= cycle / 4) {
            dirYaw = -dirYaw;
            dirYawH = -dirYawH;
        }
        et.motionX += dirx;
        et.motionZ += dirz;
        et.rotationYaw += dirYaw;
        et.rotationYawHead += dirYawH;
    }
}
