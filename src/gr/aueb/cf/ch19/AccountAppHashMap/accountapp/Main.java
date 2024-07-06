package gr.aueb.cf.ch19.AccountAppHashMap.accountapp;

import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dao.AccountDaoImpl;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dao.IAccountDao;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dto.AccountDto;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.service.AccountServiceImpl;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.service.IAccountService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAccountDao accountDao = new AccountDaoImpl();
        IAccountService accountService = new AccountServiceImpl(accountDao);

        // Create sample accounts
        AccountDto account1 = new AccountDto(1L, "GR1234567890", "John", "Doe", "123-45-6789", 500.0);
        AccountDto account2 = new AccountDto(2L, "GR1111111111", "Jane", "Smith", "987-65-4321", 340.0);

        // Add accounts
        accountService.createAccount(account1);
        accountService.createAccount(account2);

        // Print all accounts
        System.out.println("All Accounts:");
        List<AccountDto> currentAccounts = accountService.listAccounts();
        for (AccountDto account : currentAccounts) {
            System.out.println(account);
        }

        // Update account
        AccountDto updatedAccount = accountService.getAccount(1L);
        updatedAccount.setBalance(2000.0);
        accountService.updateAccount(updatedAccount);

        // Print updated account
        System.out.println("\nUpdated Account:");
        System.out.println(accountService.getAccount(1L));

        // Delete account 2
        accountService.deleteAccount(2L);

        // Print remaining accounts
        System.out.println("\nRemaining Accounts:");
        List<AccountDto> remainingAccounts = accountService.listAccounts();
        for (AccountDto account : remainingAccounts) {
            System.out.println(account);
        }

        // Create and add another account

        AccountDto account3 = new AccountDto(3L, "GR2222222222", "George", "Michael", "354-56-4561", 30_000.50);
        accountService.createAccount(account3);

        // Print all accounts again
        System.out.println("All Accounts:");
        currentAccounts = accountService.listAccounts();
        for (AccountDto account : currentAccounts) {
            System.out.println(account);
        }
    }
}
