package danger.orespawn.util.premium;

import net.minecraft.entity.player.*;

public class PremiumChecker
{
    static String urlString;
    private static String[] viableUUIDs;
    private static final boolean DEV_USER = false;
    private static final boolean PREMIUM_BUILD = true;
    
    public static boolean CheckUser(final EntityPlayer player) {
        return true;
    }
    
    public static void Init() {
    }
    
    static {
        PremiumChecker.urlString = "https://raw.githubusercontent.com/Sevenblade11/Test/main/something.dat";
    }
}
