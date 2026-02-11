package designpatterns.strategy;

public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("------- Source of operation is the strategy Crypto wallet -------");
        System.out.println("Paid $"+amount+" using Crypto wallet: "+walletAddress);
    }
}
