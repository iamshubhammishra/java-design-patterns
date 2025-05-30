package solidPrinciple.openclosed;

public class MobileNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Mobile: " + message);
    }
}
