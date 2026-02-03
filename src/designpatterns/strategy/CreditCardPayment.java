package designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("------- Source of operation is the strategy Credit Card -------");
        System.out.println("Paid $"+amount+" using Credit Card : "+ cardNumber);
    }
}
