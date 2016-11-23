package sp2;

/**
 * Mobile phone subscription with zero standing charge, but high
 * costs for used services.
 *
 * @author Aman Enghida
 */
public class PayWhatYouUseMobileSubscription extends MobileSubscription {

    private final int MOBILE_CHARGE_PER_MINUTE_IN_PENCE = 40;
    private final int MOBILE_CHARGE_PER_TEXT_IN_PENCE = 20;

    /**
     * Constructs a new PayWhatYouUseMobileSubscription according to the
     * parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     */
    public PayWhatYouUseMobileSubscription(String subscriber, String phoneNumber) {
        super(subscriber,"Pay what you use mobile subscription "+phoneNumber,phoneNumber,0);
    }

    @Override
    public int computeTotalChargeInPence(){
        int totalMinutesCharge = MOBILE_CHARGE_PER_MINUTE_IN_PENCE * getCallMinutes();
        int totalTextCharge = MOBILE_CHARGE_PER_TEXT_IN_PENCE * getTextMessages();
        return totalMinutesCharge + totalTextCharge;
    }

}
