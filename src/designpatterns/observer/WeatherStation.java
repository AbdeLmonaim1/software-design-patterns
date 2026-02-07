package designpatterns.observer;

import designpatterns.observer.observerinterfaces.Observable;
import designpatterns.observer.observerinterfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    private List<Observer> observerList = new ArrayList<>();
    private float temperature;
    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }
    void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
}
