package sp2;

/**
 * Created by aman1 on 23/11/2016.
 */
public class LandlineTest {
    public static void main(String[] args){
        LandlineSubscription line1 = new LandlineSubscription("hello",null,null);

        line1.makeCall(60000);

        System.out.println(line1.computeTotalChargeInPence());
        System.out.println(line1.getAddress());
        System.out.println("Name is: "+line1.getSubscriber());
        System.out.println(line1.getAddress());

    }
}
