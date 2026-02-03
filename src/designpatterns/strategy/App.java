package designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        PaymentContext pctx = new PaymentContext();
        pctx.pay();
    }
}
