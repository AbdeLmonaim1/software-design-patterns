package designpatterns.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy = new DefaultPayment();
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void pay(double amount){
        System.out.println("###### start of the operation pay ######");
        System.out.println("****** Initialisation ******");
        paymentStrategy.pay(amount);
        System.out.println("====== Clean ======");
    }


}
