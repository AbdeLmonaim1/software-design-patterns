package designpatterns.observer;

public class TVDisplay implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherStation obs)
            System.out.println("TV Display PULL: Temperature updated to " + obs.getTemperature() + "°C");
    }
//    @Override
//    public void update(float temperature) {
//        System.out.println("TV Display: Temperature updated to " + temperature + "°C");
//    }
}
