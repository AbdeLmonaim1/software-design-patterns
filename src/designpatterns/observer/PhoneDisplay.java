package designpatterns.observer;

import designpatterns.observer.observerinterfaces.Observable;
import designpatterns.observer.observerinterfaces.Observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof WeatherStation obs)
            System.out.println("Phone Display - PULL: Temperature updated to " + obs.getTemperature() + "°C");
    }
//    @Override
//    public void update(float temperature) {
//        System.out.println("Phone Display: Temperature updated to " + temperature + "°C");
//    }
}
