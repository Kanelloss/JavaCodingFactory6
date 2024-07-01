package gr.aueb.cf.ch18.accountapp.dao;

import gr.aueb.cf.ch18.accountapp.model.Account;

import java.util.List;

public interface IAccountDao {
    void createAccount(Account account);
    Account getAccount(int id);
    void updateAccount(Account account);
    void deleteAccount(int id);
    List<Account> listAccounts();
}
