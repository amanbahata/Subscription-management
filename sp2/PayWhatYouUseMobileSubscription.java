package sp2;

/**
 * Mobile phone subscription with zero standing charge, but high
 * costs for used services.
 *
 * @author Aman Enghida
 */
public class PayWhatYouUseMobileSubscription extends MobileSubscription {


    /**
     * Constructs a new PayWhatYouUseMobileSubscription according to the
     * parameters.
     *
     * @param subscriber  the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     */
    public PayWhatYouUseMobileSubscription(String subscriber, String phoneNumber) {
        super(subscriber, "Pay what you use mobile subscription " + phoneNumber, phoneNumber, 0);
        setChargePerMinute(40);
        setChargePerText(20);
    }

    @Override
    public int computeTotalChargeInPence() {
        int totalMinutesCharge = getChargePerMinute() * getCallMinutes();
        int totalTextCharge = getChargePerText() * getTextMessages();
        return totalMinutesCharge + totalTextCharge;
    }

}
