package designpatterns.creation_patterns.model;

public class BankDirector {
    public static BankAccount.BankAccountBuilder accountBuilder(){
        return new BankAccount.BankAccountBuilder();
    }
}
