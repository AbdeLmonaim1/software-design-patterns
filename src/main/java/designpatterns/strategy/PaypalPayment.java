package designpatterns.strategy;

public class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("------- Source of operation is the strategy Paypal -------");
        System.out.println("Paid $"+amount+" using Paypal: "+email);
    }
}
