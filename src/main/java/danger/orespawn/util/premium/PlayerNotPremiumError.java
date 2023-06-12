package danger.orespawn.util.premium;

public class PlayerNotPremiumError extends Error
{
    public PlayerNotPremiumError() {
    }
    
    public PlayerNotPremiumError(final String message) {
        super(message);
    }
    
    public PlayerNotPremiumError(final Throwable cause) {
        super(cause);
    }
    
    public PlayerNotPremiumError(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public PlayerNotPremiumError(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
