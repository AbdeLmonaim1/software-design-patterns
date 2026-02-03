package designpatterns.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void pay(double amount){
        System.out.println("###### start of the operation pay ######");
        System.out.println("****** Initialisation ******");
        if (paymentStrategy == null){
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
        System.out.println("====== Clean ======");
    }


}
