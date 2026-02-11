package designpatterns.adapter;

public class Computer {
    private Vga vga;
    public void view(String message){
        System.out.println("****** Computer ******");
        vga.print(message);
        System.out.println("======================");
    }
    //To set an object that implement Vga interface
    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
