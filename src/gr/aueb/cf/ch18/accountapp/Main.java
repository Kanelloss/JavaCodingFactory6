package gr.aueb.cf.ch18.accountapp;

import gr.aueb.cf.ch18.accountapp.dao.AccountDaoImpl;
import gr.aueb.cf.ch18.accountapp.dao.IAccountDao;
import gr.aueb.cf.ch18.accountapp.dto.AccountDto;
import gr.aueb.cf.ch18.accountapp.service.AccountServiceImpl;
import gr.aueb.cf.ch18.accountapp.service.IAccountService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAccountDao accountDao = new AccountDaoImpl();
        IAccountService accountService = new AccountServiceImpl(accountDao);

        // Create sample accounts
        AccountDto account1 = new AccountDto(1, "GR1234567890", "John", "Doe", "123-45-6789", 500.0);
        AccountDto account2 = new AccountDto(2, "GR1111111111", "Jane", "Smith", "987-65-4321", 340.0);

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
        AccountDto updatedAccount = accountService.getAccount(1);
        updatedAccount.setBalance(2000.0);
        accountService.updateAccount(updatedAccount);

        // Print updated account
        System.out.println("\nUpdated Account:");
        System.out.println(accountService.getAccount(1));

        // Delete account 2
        accountService.deleteAccount(2);

        // Print remaining accounts
        System.out.println("\nRemaining Accounts:");
        List<AccountDto> remainingAccounts = accountService.listAccounts();
        for (AccountDto account : remainingAccounts) {
            System.out.println(account);
        }

        // Create and add another account

        AccountDto account3 = new AccountDto(3, "GR2222222222", "George", "Michael", "354-56-4561", 30_000.50);
        accountService.createAccount(account3);

        // Print all accounts again
        System.out.println("All Accounts:");
        currentAccounts = accountService.listAccounts();
        for (AccountDto account : currentAccounts) {
            System.out.println(account);
        }
    }
}
