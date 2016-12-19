package sp2;

/**
 * Abstract superclass for subscriptions to phone services.
 *
 * @author Aman Enghida
 */
public abstract class PhoneSubscription extends Subscription {
    /**
     * cost of a phone call per minute.
     */
    private int chargePerMinute;

    /**
     * The subscribers hone number.
     */
    private String phoneNumber;

    /**
     * The length of calls in minutes
     */
    private int callMinutes;


    /**
     *  Constructs a new phone subscription according to parameters
     * @param subscriber
     * @param subscriptionName
     * @param phoneNumber
     * @param standingChargeInPence
     */
    public PhoneSubscription(String subscriber, String subscriptionName, String phoneNumber, int standingChargeInPence) {
        super(subscriber, subscriptionName, standingChargeInPence);
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void makeCall(int minutes) {
        callMinutes += minutes;
    }

    public int getCallMinutes() {
        return this.callMinutes;
    }

    public void resetCallMinutes() {
        this.callMinutes = 0;
    }

    public void setCharge(int charge) {
        chargePerMinute = charge;
    }

    public int getCharge() {
        return chargePerMinute;
    }
}


