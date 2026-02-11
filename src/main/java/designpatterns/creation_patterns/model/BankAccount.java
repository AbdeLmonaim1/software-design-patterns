package designpatterns.creation_patterns.model;

public class BankAccount {
    private long id;
    private double balence;
    private String currency;
    private AccountType type;
    private AccountStatus status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BankAccount(long id, double balence, String currency, AccountType type, AccountStatus status) {
        this.id = id;
        this.balence = balence;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balence=" + balence +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }

    //Builder pattern for create BankAccount objects
    public static class BankAccountBuilder{
        private BankAccount bankAccount = new BankAccount();

        public BankAccountBuilder accountId(Long id){
            bankAccount.id = id;
            return this;
        }
        public BankAccountBuilder balence(double balence){
            bankAccount.balence = balence;
            return this;
        }
        public BankAccountBuilder currency(String currency){
            bankAccount.currency = currency;
            return this;
        }
        public BankAccountBuilder status(AccountStatus status){
            bankAccount.status = status;
            return this;
        }
        public BankAccountBuilder type(AccountType type){
            bankAccount.type = type;
            return this;
        }
        public BankAccount build(){
            return this.bankAccount;
        }
    }
}
