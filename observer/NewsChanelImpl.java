package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChanelImpl implements NewsChanel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(subscriber -> subscriber.update(news));
    }
}
