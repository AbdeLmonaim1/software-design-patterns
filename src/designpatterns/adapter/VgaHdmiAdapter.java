package designpatterns.adapter;

public class VgaHdmiAdapter implements Vga{
    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("|||||||||| It's Adapter |||||||||");
        byte[] data = message.getBytes();
        hdmi.plot(data);
        System.out.println("|||||||||||||||||||||||||||||||||");
    }
    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
