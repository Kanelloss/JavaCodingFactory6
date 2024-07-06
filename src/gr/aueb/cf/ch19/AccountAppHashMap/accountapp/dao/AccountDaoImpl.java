package gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dao;

import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.model.Account;

import java.util.*;
import java.util.stream.Collectors;

public class AccountDaoImpl implements IAccountDao {
    private Map<Long, Account> accounts = new HashMap<>();

    @Override
    public void createAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    @Override
    public Account getAccount(Long id) {
        return accounts.get(id);
    }

    @Override
    public void updateAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    @Override
    public void deleteAccount(Long id) {
        accounts.remove(id);
    }

    @Override
    public List<Account> listAccounts() {
        return accounts.values()
                .stream()
                .toList();
    }
}
