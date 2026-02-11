package designpatterns.creation_patterns.repository;

import designpatterns.creation_patterns.model.AccountStatus;
import designpatterns.creation_patterns.model.AccountType;
import designpatterns.creation_patterns.model.BankAccount;
import designpatterns.creation_patterns.model.BankDirector;

import java.util.*;
import java.util.function.Predicate;
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
    public void manipulateData(){
        for (int i = 0; i < 20; i++) {
            //We want to use builder pattern to create bank accounts
            BankAccount account = BankDirector.accountBuilder()
                    .currency(Math.random()>0.5 ? "MAD" : "EUR")
                    .balence(12304+Math.random()*90000)
                    .type(Math.random()>0.5 ? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5 ? AccountStatus.CREATED : AccountStatus.ACTIVATED)
                    .build();
            save(account);
        }
    }

}
