package observer;

public class SubscriberImpl implements Subscriber {
    private String subscriberName;

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String message) {
        System.out.println(this.subscriberName+"-->"+message);
    }
}
