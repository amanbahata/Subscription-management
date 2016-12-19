package sp2;

/**
 * A subscription to a newspaper or a magazine.
 *
 * @author Aman Enghida
 */
public class NewspaperSubscription extends Subscription implements HasAddress, BoundedCharge {
    private String address;

    /**
     * Constructs a new NewspaperSubscription based on the parameters.
     *
     * @param subscriber            the name of the subscriber; must not be null
     * @param newspaper             the name of the newspaper (and hence the subscription);
     *                              must not be null
     * @param standingChargeInPence the price of the newspaper per billing
     *                              period; must not be less than 0
     * @param address               the address to which the newspaper is delivered;
     *                              must not be null
     */
    public NewspaperSubscription(String subscriber, String newspaper, int standingChargeInPence, String address) {
        super(subscriber, newspaper, standingChargeInPence);
        this.address = address;
    }

    @Override
    public int computeTotalChargeInPence() {
        return super.getStandingChargeInPence();
    }

    public String getAddress() {
        return this.address;
    }

    public int getMaxChargeInPence() {
        return computeTotalChargeInPence();
    }
}
