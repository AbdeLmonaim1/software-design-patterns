package designpatterns.observer;

import designpatterns.observer.observerinterfaces.Observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature + "°C");
    }
}
