package sp2;

/**
 * Represents a phone subscription for landline telephones at a certain
 * address.
 *
 * @author Aman Enghida
 */
public class LandlineSubscription extends PhoneSubscription implements HasAddress {

    /**
     * the address the subscription is registered to.
     */
    private String address;

    /**
     * Constructs a new LandlineSubscription according to the parameters.
     *
     * @param subscriber  the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     * @param address     the address; must not be null
     */
    public LandlineSubscription(String subscriber, String phoneNumber, String address) {
        super(subscriber, "Landline telephone " + phoneNumber, phoneNumber, 1800);
        if (address == null) {
            throw new IllegalArgumentException("Illegal null argument for address.");
        }
        this.address = address;
        setChargePerMinute(2);    // Sets the landline subscription to s pence per minute
    }

    @Override
    public int computeTotalChargeInPence() {
        return super.getStandingChargeInPence() + getChargePerMinute() * getCallMinutes();
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public void resetConsumption() {
        resetCallMinutes();
    }

}
