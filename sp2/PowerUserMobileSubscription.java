package sp2;

/**
 * Mobile phone subscription with high standing charge, but low
 * costs for used services. Additionally has a "cost airbag", an
 * upper bound for the charges that can be incurred in a single
 * billing period: only a bounded number of call minutes and of
 * text messages are charged, everything beyond that is free.
 *
 * @author Aman Enghida
 */
public class PowerUserMobileSubscription extends MobileSubscription implements BoundedCharge {

    /**
     * The upper bound of the call minutes charged in a single billing period
     */
    private int costAirBagMinutes = 1800;

    /**
     * The upper bound of the number of text charged in a single billing period
     */
    private int costAirBagText = 900;

    /**
     * Constructs a new PowerUserMobileSubscription according to the
     * given parameters.
     *
     * @param subscriber  the name of the subscriber; must not be null
     * @param phoneNumber the phone number used for this subscription;
     *                    must not be null
     */
    public PowerUserMobileSubscription(String subscriber, String phoneNumber) {
        super(subscriber, "Mobile power user " + phoneNumber, phoneNumber, 4000);
        setChargePerText(8);
        setCharge(10);
    }

    // TO DO

    public int getMaxChargeInPence() {
        return getStandingChargeInPence() + getChargePerText() * costAirBagText + getCharge() * costAirBagMinutes;
    }


    @Override
    public int computeTotalChargeInPence() {
        return getStandingChargeInPence() + calculateMinutesAirbag() * getCharge() + calculateTextAirbag() * getChargePerText();
    }

    public int calculateMinutesAirbag() {
        int minutes = getCallMinutes();
        if (minutes <= costAirBagMinutes) {
            return minutes;
        }
        return costAirBagMinutes;
    }

    public int calculateTextAirbag() {
        int text = getTextMessages();
        if (text <= costAirBagText) {
            return text;
        }
        return costAirBagText;
    }

}
