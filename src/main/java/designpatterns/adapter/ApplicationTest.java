package designpatterns.adapter;

public class ApplicationTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setVga(new VideoProjector());
        computer.view("Hello from computer, the connection with Video Projector is successfully");
        computer.setVga(new Monitor());
        computer.view("An other message from computer, we have successfully connected to a Monitor");
        VgaHdmiAdapter adapter = new VgaHdmiAdapter();
        //for composition
        adapter.setHdmi(new TV());
        computer.setVga(adapter);
        computer.view("We Use An Adapter to connect to TV that using HDMI");
    }
}
