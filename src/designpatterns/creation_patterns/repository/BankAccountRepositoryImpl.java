package designpatterns.creation_patterns.repository;

import designpatterns.creation_patterns.model.BankAccount;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BankAccountRepositoryImpl implements BankAccountRepository {
    Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount = 0;
    @Override
    public BankAccount save(BankAccount account) {
        long accountId = ++accountsCount;
        account.setId(accountId);
        bankAccountMap.put(accountId, account);
        return account;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(long id) {
        BankAccount bankAccount = bankAccountMap.get(id);
        return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> accountPredicate) {
        return bankAccountMap.values().stream().filter(accountPredicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        bankAccountMap.put(account.getId(), account);
        return account;
    }

    @Override
    public void deleteById(long id) {
        bankAccountMap.remove(id);
    }

}
