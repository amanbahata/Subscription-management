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
        this.address = address;
        setCharge(2);
    }

    /**
     * Computes the total charge in pence of the subscription
     * @return
     */
    @Override
    public int computeTotalChargeInPence() {
        return super.getStandingChargeInPence() + getCharge() * getCallMinutes();
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public void resetConsumption() {
        resetCallMinutes();
    }

}
