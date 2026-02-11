package designpatterns.strategy;

public class DefaultPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(
                "No payment method selected. Unable to process payment of $" + amount
        );
    }
}
