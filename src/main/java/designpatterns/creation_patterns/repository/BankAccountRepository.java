package designpatterns.creation_patterns.repository;

import designpatterns.creation_patterns.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface BankAccountRepository {
    BankAccount save(BankAccount account);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(long id);
    List<BankAccount> searchAccount(Predicate<BankAccount> accountPredicate);
    BankAccount update(BankAccount account);
    void deleteById(long id);
}
