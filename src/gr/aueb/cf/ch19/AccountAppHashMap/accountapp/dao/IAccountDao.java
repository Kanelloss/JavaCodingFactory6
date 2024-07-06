package gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dao;

import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.model.Account;

import java.util.List;

public interface IAccountDao {
    void createAccount(Account account);
    Account getAccount(Long id);
    void updateAccount(Account account);
    void deleteAccount(Long id);
    List<Account> listAccounts();
}
