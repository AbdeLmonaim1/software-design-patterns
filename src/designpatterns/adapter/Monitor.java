package designpatterns.adapter;

public class Monitor implements Vga {
    @Override
    public void print(String message) {
        System.out.println("------- It's a monitor -------");
        System.out.println("The message from the monitor : "+message);
        System.out.println("------------------------------");
    }
}
