package danger.orespawn;

import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraftforge.client.event.*;
import danger.orespawn.entity.*;
import net.minecraft.block.material.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class GirlfriendOverlayGui extends Gui
{
    private Minecraft mc;
    private static final ResourceLocation texture;
    
    public GirlfriendOverlayGui(final Minecraft mc) {
        this.mc = mc;
    }
    
    @SubscribeEvent
    public void onRenderOverlay(final RenderGameOverlayEvent event) {
        System.out.println("RUNNING");
        if (event.isCancelable() || event.getType() != RenderGameOverlayEvent.ElementType.HOTBAR) {
            return;
        }
        System.out.println("GOING THRU");
        final int u = 0;
        final int v = 0;
        String outstring = null;
        final int color = 16725044;
        final FontRenderer fr = this.mc.fontRenderer;
        final int barWidth = 182;
        final int barHeight = 5;
        float gfHealth = 0.0f;
        Entity entity = null;
        EntityPlayer player = null;
        if (this.mc.gameSettings.hideGUI || this.mc.currentScreen != null) {
            return;
        }
        player = (EntityPlayer)this.mc.player;
        if (player == null) {
            return;
        }
        entity = this.mc.pointedEntity;
        if (entity instanceof Mothra) {
            final Mothra e = (Mothra)entity;
            outstring = "Mothra!";
            gfHealth = e.getMothraHealth() / e.getMaxHealth();
        }
        if (entity instanceof Spyro) {
            final Spyro e2 = (Spyro)entity;
            if (e2.hasCustomName()) {
                outstring = e2.getCustomNameTag();
            }
            if (outstring == null || outstring.equals("")) {
                outstring = "Baby Dragon";
            }
            gfHealth = e2.getSpyroHealth() / e2.getMaxHealth();
        }
        if (entity instanceof WormLarge) {
            final WormLarge e3 = (WormLarge)entity;
            if (!e3.noClip) {
                outstring = "Worm";
                gfHealth = e3.getHealth() / e3.getMaxHealth();
            }
        }
        if (entity instanceof Alien) {
            final Alien e4 = (Alien)entity;
            outstring = "Alien!";
            gfHealth = e4.getAlienHealth() / e4.getMaxHealth();
        }
        if (entity instanceof Alosaurus) {
            final Alosaurus e5 = (Alosaurus)entity;
            outstring = "Alosaurus";
            gfHealth = e5.getHealth() / e5.getMaxHealth();
        }
        if (entity instanceof Nastysaurus) {
            final Nastysaurus e6 = (Nastysaurus)entity;
            outstring = "Nastysaurus";
            gfHealth = e6.getHealth() / e6.getMaxHealth();
        }
        if (entity instanceof TRex) {
            final TRex e7 = (TRex)entity;
            outstring = "T. Rex";
            gfHealth = e7.getHealth() / e7.getMaxHealth();
        }
        if (entity instanceof Kyuubi) {
            final Kyuubi e8 = (Kyuubi)entity;
            outstring = "Kyuubi";
            gfHealth = e8.getHealth() / e8.getMaxHealth();
        }
        if (entity instanceof Mantis) {
            final Mantis e9 = (Mantis)entity;
            outstring = "Mantis";
            gfHealth = e9.getHealth() / e9.getMaxHealth();
        }
        if (outstring == null) {
            return;
        }
        final ScaledResolution res = new ScaledResolution(this.mc);
        final int width = res.getScaledWidth();
        final int barWidthFilled = (int)(gfHealth * (barWidth + 1));
        final int x = width / 2 - barWidth / 2;
        int y = 25;
        if (player.isInsideOfMaterial(Material.WATER) || player.getTotalArmorValue() > 0) {
            y -= 10;
        }
        fr.drawStringWithShadow(outstring, (float)(width / 2 - fr.getStringWidth(outstring) / 2), (float)(y - 10), color);
        this.mc.renderEngine.bindTexture(GirlfriendOverlayGui.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.drawTexturedModalRect(x, y, u, v, barWidth, barHeight);
        if (barWidthFilled > 0) {
            this.drawTexturedModalRect(x, y, u, v + barHeight, barWidthFilled, barHeight);
        }
    }
    
    static {
        texture = new ResourceLocation("orespawn", "girlfriendgui.png");
    }
}
