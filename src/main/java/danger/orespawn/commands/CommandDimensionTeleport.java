package danger.orespawn.commands;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.server.*;
import net.minecraft.util.text.*;
import net.minecraft.entity.player.*;
import danger.orespawn.util.*;
import net.minecraft.util.math.*;
import net.minecraft.command.*;

public class CommandDimensionTeleport extends CommandBase
{
    private final List<String> aliases;

    public CommandDimensionTeleport() {
        this.aliases = new ArrayList<>();
        this.aliases.add("orespawn");
        this.aliases.add("tpdim");
        this.aliases.add("dimtp");
    }
    
    public void execute(final MinecraftServer server, final ICommandSender sender, final String[] args) throws CommandException {
        if (args.length < 1) {
            return;
        }
        int dim;
        try {
            dim = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            sender.sendMessage((ITextComponent)new TextComponentString(TextFormatting.GRAY + "Dimension ID Invalid"));
            return;
        }
        if (sender instanceof EntityPlayer) {
            final BlockPos senderPos = sender.getPosition();
            Teleport.teleportToDimension((EntityPlayer)sender, dim, senderPos.getX(), senderPos.getY(), senderPos.getZ());
            final EntityPlayer player = (EntityPlayer)sender;
            player.dimension = dim;
        }
    }
    
    public List<String> getAliases() {
        return this.aliases;
    }
    
    public String getName() {
        return "dimensiontp";
    }
    
    public String getUsage(final ICommandSender arg0) {
        return "tpdimension <id>";
    }
}
