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

    /**
     * Constructs a new MobileSubscription according to the parameters
     *
     * @param subscriber            the name of the subscriber; must not be null
     * @param subscriptionName      the type of subscription; must not be null
     * @param phoneNumber           the phone number; must not be null
     * @param standingChargeInPence the standing charge of the subscription; must not be null
     */
    public MobileSubscription(String subscriber, String subscriptionName, String phoneNumber, int standingChargeInPence) {
        super(subscriber, subscriptionName, phoneNumber, standingChargeInPence);
    }

    /**
     * Increments the number of text sent in a billing period
     *
     * @param number of messages.
     */
    public void sendTextMessages(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Illegal negative or 0 argument for number of texts sent.");
        }
        numberOfText += number;
    }

    /**
     * It retrieves the total number of messages sent
     *
     * @return number of messages
     */
    public int getTextMessages() {
        return numberOfText;
    }

    /**
     * It resets the number of text messages at the end of the billing period
     */
    public void resetNumberOfText() {
        this.numberOfText = 0;
    }

    @Override
    public void resetConsumption() {
        resetNumberOfText();
        resetCallMinutes();
    }

    /**
     * It retrieves the charge for a single message
     *
     * @return charge for a single text
     */
    public int getChargePerText() {
        return chargePerText;
    }

    /**
     * It sets the charge for a single text message sent
     *
     * @param chargePerText charge for a single text
     */
    public void setChargePerText(int chargePerText) {
        this.chargePerText = chargePerText;
    }

}
