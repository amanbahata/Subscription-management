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
     * Constructs a new phone subscription according to parameters
     *
     * @param subscriber            the name of the subscriber; must not be null
     * @param subscriptionName      the name of the subscribed service; must not be null
     * @param phoneNumber           the phone number of the subscription
     * @param standingChargeInPence the standing charge in pence; must not be negative
     */
    public PhoneSubscription(String subscriber, String subscriptionName, String phoneNumber, int standingChargeInPence) {
        super(subscriber, subscriptionName, standingChargeInPence);
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Illegal null argument for phone number.");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieve the phone number
     *
     * @return the phone number of the phone subscription
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * It ads the duration of a call in minutes to the total calls duration
     *
     * @param minutes duration of a single call
     */
    public void makeCall(int minutes) {
        if (minutes <= 0) {
            throw new IllegalArgumentException("Illegal negative or 0 argument for minutes.");
        }
        callMinutes += minutes;
    }

    /**
     * Retrieve the total of the calls duration in minutes
     *
     * @return the total calls duration per billing period
     */
    public int getCallMinutes() {
        return this.callMinutes;
    }

    /**
     * Reset duration of total calls to zero at the end of a billing period
     */
    public void resetCallMinutes() {
        this.callMinutes = 0;
    }

    /**
     * Sets the cost per minute of placing a call
     *
     * @param charge cost per minute of a call
     */
    public void setCharge(int charge) {
        chargePerMinute = charge;
    }


    /**
     * Retrieve the charge per minute of a call
     *
     * @return charge per minute
     */
    public int getCharge() {
        return chargePerMinute;
    }
}


