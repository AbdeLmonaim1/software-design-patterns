package designpatterns.creation_patterns;

import designpatterns.creation_patterns.model.BankAccount;
import designpatterns.creation_patterns.repository.BankAccountRepositoryImpl;
import designpatterns.utils.JsonSerializer;

public class ApplicationTest {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        BankAccountRepositoryImpl accountRepository = new BankAccountRepositoryImpl();
        accountRepository.manipulateData();
        accountRepository.findAll().stream().map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);
    }
}
