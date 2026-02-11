package designpatterns.adapter;

import java.util.Arrays;

public class TV implements Hdmi {
    @Override
    public void plot(byte[] data) {
        System.out.println(":::::::::::::::: It's TV :::::::::::::::");
        System.out.println("Message from the TV : "+new String(Arrays.toString(data)));
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
    }


}
