package designpatterns.observer.observerinterfaces;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();

}
