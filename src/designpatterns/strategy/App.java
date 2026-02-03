package designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        PaymentContext pctx = new PaymentContext();
//        pctx.setPaymentStrategy(new CreditCardPayment("1224 5832 2452 5905"));
//        pctx.pay(1200.00);
//        pctx.setPaymentStrategy(new PaypalPayment("monaim.tchicko@gmail.com"));
//        pctx.pay(2300.50);
//        pctx.setPaymentStrategy(new CryptoPayment("bc1qf2kdgu2vlctqlnlxk4smkxd68grl5q2we8dzfd"));
//        pctx.pay(1500004.00);
        pctx.pay(12499.00);
        pctx.setPaymentStrategy(new CreditCardPayment("1224 5832 2452 5905"));
        pctx.pay(111290.70);

    }
}
