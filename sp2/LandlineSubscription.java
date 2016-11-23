package sp2;    

/**
 * Represents a phone subscription for landline telephones at a certain
 * address.
 *
 * @author Aman Enghida
 */
public class LandlineSubscription extends PhoneSubscription implements HasAddress {

    // TO DO

    private String address;
    private final int CHARGE_PER_MINUTE = 2;

    /**
     * Constructs a new LandlineSubscription according to the parameters.
     *
     * @param subscriber the name of the subscriber; must not be null
     * @param phoneNumber the phone number; must not be null
     * @param address the address; must not be null
     */
    public LandlineSubscription(String subscriber, String phoneNumber, String address) {
        super(subscriber,"Landline telephone "+phoneNumber, phoneNumber, 1800);


        this.address = address;
    }

    // TO DO

    @Override
    public int computeTotalChargeInPence(){
        return super.getStandingChargeInPence() + CHARGE_PER_MINUTE * getCallMinutes();
    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public void resetConsumption() {
        resetCallMinutes();
    }

}
