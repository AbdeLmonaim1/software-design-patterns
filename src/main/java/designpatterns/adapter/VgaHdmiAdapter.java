package designpatterns.adapter;

public class VgaHdmiAdapter implements Vga{
    //Using composition - Object
    private Hdmi hdmi;
    //Using heritage - Classes

    @Override
    public void print(String message) {
        System.out.println("|||||||||| It's Adapter |||||||||");
        byte[] data = message.getBytes();
        //for composition
        hdmi.plot(data);
        //for heritage
//        super.plot(data);
        System.out.println("|||||||||||||||||||||||||||||||||");
    }
    //for composition
    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
