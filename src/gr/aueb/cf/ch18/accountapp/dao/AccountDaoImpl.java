package gr.aueb.cf.ch18.accountapp.dao;

import gr.aueb.cf.ch18.accountapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDaoImpl implements IAccountDao {
    private List<Account> accounts = new ArrayList<>();

    @Override
    public void createAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public Account getAccount(int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateAccount(Account account) {
        Optional<Account> optionalAccount = accounts
                .stream()
                .filter(a -> a.getId() == account.getId())
                .findFirst();

        if (optionalAccount.isPresent()) {
            Account existingAccount = optionalAccount.get();
            existingAccount.setIban(account.getIban());
            existingAccount.setFirstname(account.getFirstname());
            existingAccount.setLastname(account.getLastname());
            existingAccount.setSsn(account.getSsn());
            existingAccount.setBalance(account.getBalance());
        }
    }

    @Override
    public void deleteAccount(int id) {
        accounts.removeIf(account -> account.getId() == id);
    }

    @Override
    public List<Account> listAccounts() {
        return new ArrayList<>(accounts);
    }
}
