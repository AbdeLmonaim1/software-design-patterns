package designpatterns.adapter;

public class VideoProjector implements Vga {
    @Override
    public void print(String message) {
        System.out.println("######## It's Video Projector ########");
        System.out.println("The message from Video Projector :"+message);
        System.out.println("######################################");
    }
}
