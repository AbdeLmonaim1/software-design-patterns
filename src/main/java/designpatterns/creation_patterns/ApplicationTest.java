package designpatterns.creation_patterns;

import designpatterns.creation_patterns.model.AccountType;
import designpatterns.creation_patterns.model.BankAccount;
import designpatterns.creation_patterns.repository.BankAccountRepositoryImpl;
import designpatterns.utils.JsonSerializer;

import java.util.function.Predicate;

public class ApplicationTest {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        BankAccountRepositoryImpl accountRepository = new BankAccountRepositoryImpl();
        accountRepository.manipulateData();
        accountRepository.findAll().stream().map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);
        System.out.println("----------- Call search method -----------");
        accountRepository.searchAccount(new Predicate<BankAccount>() {
                    @Override
                    public boolean test(BankAccount account) {
                        return account.getType().equals(AccountType.SAVING_ACCOUNT);
                    }
                })
                .stream().map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

    }
}
