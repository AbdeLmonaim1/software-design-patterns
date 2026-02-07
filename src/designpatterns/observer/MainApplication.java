package designpatterns.observer;

import designpatterns.observer.observerinterfaces.Observable;
import designpatterns.observer.observerinterfaces.Observer;

public class MainApplication {
    public static void main(String[] args) {
        WeatherStation observable = new WeatherStation();
        Observer phoneObserver = new PhoneDisplay();
        Observer tvObserver = new TVDisplay();

        observable.subscribe(phoneObserver);
        observable.subscribe(tvObserver);
        //Anonyme Object
        //Push
//        observable.subscribe(new Observer() {
//            @Override
//            public void update(float temperature) {
//                System.out.println("----------------- From Anonyme object -------------");
//                System.out.println("Result => "+temperature * Math.tanh(temperature)+"°C");
//                System.out.println("---------------------------------------------------");
//            }
//        });
//        observable.subscribe((newTemp) -> {
//            System.out.println("============= From Anonyme object lambda version ============");
//            System.out.println("ResultV2 => "+newTemp*Math.tan(newTemp)+"°C");
//            System.out.println("=============================================================");
//        });
        //Pull
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                if (observable instanceof WeatherStation obs){
                    System.out.println("----------------- From Anonyme object - PULL -------------");
                    System.out.println("Result => "+obs.getTemperature() * Math.tanh(obs.getTemperature())+"°C");
                    System.out.println("---------------------------------------------------");
                }

            }
        });
        observable.subscribe(observable1 -> {
            if (observable1 instanceof WeatherStation obs){
                System.out.println("============= From Anonyme object lambda version - PULL ============");
                System.out.println("ResultV2 => "+obs.getTemperature()*Math.tan(obs.getTemperature())+"°C");
                System.out.println("=============================================================");
            }

        });
        observable.setTemperature(45.68F);
        observable.unsubscribe(tvObserver);
        observable.setTemperature(54.31F);
    }
}
