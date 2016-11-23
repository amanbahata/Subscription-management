package sp2;

/**
 * Abstract superclass for subscriptions to phone services.
 *
 * @author Aman Enghida
 */
public abstract class PhoneSubscription extends Subscription {

    private String phoneNumber;
    private int callMinutes;

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

    public void resetCallMinutes(){
        this.callMinutes = 0;
    }
}


