package solidPrinciple.openclosed;

public class BadNotificationService {
    public void  sendNotification(String type, String message){
        switch (type){
            case "email"-> System.out.println("Email: " + message);
            case "mobile"-> System.out.println("Mobile: " +message);
        }
    }
}
