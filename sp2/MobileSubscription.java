package sp2;

/**
 * Abstract superclass to represent subscriptions for mobile phones.
 *
 * @author Aman Enghida
 */
public abstract class MobileSubscription extends PhoneSubscription {

    /**
     * charge per single text
     */
    private int chargePerText;

    /**
     * Number of text sent from the subscription
     */
    private int numberOfText;


    public MobileSubscription(String subscriber, String subscriptionName, String phoneNumber, int standingChargeInPence) {
        super(subscriber, subscriptionName, phoneNumber, standingChargeInPence);
    }


    public void sendTextMessages(int number) {
        numberOfText += number;
    }

    public int getTextMessages() {
        return numberOfText;
    }

    public void resetNumberOfText() {
        this.numberOfText = 0;
    }

    @Override
    public void resetConsumption() {
        resetNumberOfText();
        resetCallMinutes();
    }


    public int getChargePerText() {
        return chargePerText;
    }

    public void setChargePerText(int chargePerText) {
        this.chargePerText = chargePerText;
    }


}
