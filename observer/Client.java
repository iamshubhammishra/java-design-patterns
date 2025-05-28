package observer;

public class Client {
    public static void main(String[] args){
        var newsChanel = new NewsChanelImpl();

        var subscriberOne = new SubscriberImpl();
        subscriberOne.setSubscriberName("Rahul");
        var subscriberTwo = new SubscriberImpl();
        subscriberTwo.setSubscriberName("Rishikesh");

        newsChanel.registerObserver(subscriberOne);
        newsChanel.registerObserver(subscriberTwo);

        newsChanel.setNews("Observer Pattern Released in Java!");
        newsChanel.setNews("Iterator.Iterator Pattern will Release in Java!");
    }
}
