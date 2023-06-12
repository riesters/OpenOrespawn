package danger.orespawn.util;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.server.*;
import java.util.*;

public class Teleport extends Teleporter
{
    private final WorldServer world;
    private final double x;
    private final double y;
    private final double z;
    
    public Teleport(final WorldServer world, final double x, final double y, final double z) {
        super(world);
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void placeInPortal(final Entity entityIn, final float rotationYaw) {
        this.world.getBlockState(new BlockPos(this.x, this.y, this.z));
        entityIn.setPosition(this.x, this.y, this.z);
        entityIn.motionX = 0.0;
        entityIn.motionY = 0.0;
        entityIn.motionZ = 0.0;
    }
    
    public static void teleportToDimension(final EntityPlayer player, final int dimension, final double x, final double y, final double z) {
        if (!(player instanceof EntityPlayerMP)) {
            return;
        }
        final int oldDimension = player.getEntityWorld().provider.getDimension();
        final MinecraftServer server = player.getEntityWorld().getMinecraftServer();
        assert server != null;
        final WorldServer worldServer = server.getWorld(oldDimension);
        WorldServer newDim;
        int i;
        for (newDim = server.getWorld(dimension), i = 0, i = 255; i > 0 && newDim.getBlockState(new BlockPos(x, (double)i, z)) == Blocks.AIR.getDefaultState(); --i) {}
        ++i;
        Objects.requireNonNull(worldServer.getMinecraftServer()).getPlayerList().transferPlayerToDimension((EntityPlayerMP)player, dimension, (Teleporter)new Teleport(worldServer, x, i, z));
        player.setPositionAndUpdate(x, (double)i, z);
    }
}
