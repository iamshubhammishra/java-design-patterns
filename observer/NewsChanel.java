package observer;

public interface NewsChanel {
    void registerObserver(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void notifyObservers();
}
